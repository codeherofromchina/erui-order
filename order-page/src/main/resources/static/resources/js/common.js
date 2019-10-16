var ORDER_URL = "http://java.eruidev.com:85";
var LOCAL_URL = "http://wxd.eruidev.com:8090";
var BPM_URL = "http://bpm.eruidev.com";
var ERUITOKEN = "83efa424c3695c0fe23204d847fc4303_018410";
var GLOBAL_PARAMS = null;
var ATTACHMENT_FILE_TYPE = 1; // 附件的类型
var ATTACHMENT_FILE_TABLE_ID = null; // 附件的表格ID

function beforeAjaxSend(request) {
    request.setRequestHeader("eruitoken", ERUITOKEN);
    request.setRequestHeader("token", ERUITOKEN);
}

function tokenAjaxLoader(opts, param, success, error) {
    if (!opts.url) {
        return false;
    }
    $.ajax({
        type: opts.method,
        url: opts.url,
        xhrFields: {
            withCredentials: true
        },
        data: JSON.stringify(param),
        dataType: "json",
        beforeSend: beforeAjaxSend,
        contentType: 'application/json;charset=utf-8',
        success: function (data) {
            success(data);
        },
        error: function () {
            error.apply(this, arguments);
        }
    });
}

function tableLoadFilter(data) {
    var finalData = {"total": 0, "rows": []};
    if (data.code == 0) {
        if (data.data.total) {
            finalData.total = data.data.total;
            finalData.rows = data.data.rows;
        } else {
            finalData.total = data.data.length;
            finalData.rows = data.data;
        }
    }
    return finalData;
}

// 关闭选项卡中当前选中的标签项
function closeCurrentTab() {
    // 关闭新建订单面板
    var tab = $('#tt').tabs('getSelected');
    if (tab) {
        var index = $('#tt').tabs('getTabIndex', tab);
        $('#tt').tabs('close', index);
    }
}


function syncAjaxJson(opts, param) {
    if (!opts.method) {
        opts.method = "post";
    }
    if (!param) {
        param = {};
    }
    var finalData;
    $.ajax({
        type: opts.method,
        url: opts.url,
        xhrFields: {
            withCredentials: true
        },
        data: JSON.stringify(param),
        async: false,
        dataType: "json",
        beforeSend: beforeAjaxSend,
        contentType: 'application/json;charset=utf-8',
        success: function (data) {
            finalData = data;
        },
        error: function () {
            console.error("error->" + JSON.stringify(opts) + "," + JSON.stringify(param))
        }
    });
    return finalData;
}


//自定义删除函数:
Array.prototype.remove = function (dx) {
    if (isNaN(dx) || dx > this.length) {
        return false;
    }
    for (var i = 0, n = 0; i < this.length; i++) {
        if (this[i] != this[dx]) {
            this[n++] = this[i]
        }
    }
    this.length -= 1
}

$.fn.serializeJson = function () {
    var serializeObj = {};
    $(this.serializeArray()).each(function () {
        serializeObj[this.name] = this.value;
    });
    return serializeObj;
};

// 设置datagrid分页数据到第一页
function setDatagridToFirstPage(ids) {
    var opts = $(ids).datagrid('options');
    var pager = $(ids).datagrid('getPager');
    opts.pageNumber = 1;
    opts.pageSize = opts.pageSize;
    pager.pagination('refresh', {
        pageNumber: 1,
        pageSize: opts.pageSize
    });
}

function openFileDialog(type, tableId) {
    ATTACHMENT_FILE_TYPE = type;
    ATTACHMENT_FILE_TABLE_ID = tableId;
    document.getElementById('attachment_file_input').click();
}

function uploadFile(file, callback) {
    if (!file) {
        // 如果没有文件，就直接返回
        return;
    }
    var formData = new FormData();
    formData.append('file', file);
    $.ajax({
        url: LOCAL_URL + "/order/fastdfs/upload",
        type: "post",
        data: formData,
        contentType: false,
        processData: false,
        mimeType: "multipart/form-data",
        success: function (resp) {
            var data = JSON.parse(resp);
            if (callback && data.code == 0) {
                callback(data.data);
            }
        },
        error: function (data) {
            console.log(data);
            var errData = JSON.parse(data.responseText);
            var messageArr = errData.message.split(";");
            if (messageArr && messageArr.length > 1) {
                if (messageArr[0] == 'Maximum upload size exceeded') {
                    $.messager.alert("提示", "超过最大上载大小");
                }
                return;
            }
            $.messager.alert("提示", "服务器错误");
        }
    });

}


function addAttachmentTableRowData(data) {
    if (ATTACHMENT_FILE_TABLE_ID) {
        if (!ATTACHMENT_FILE_TYPE) {
            ATTACHMENT_FILE_TYPE = -9;
        }

        $("#" + ATTACHMENT_FILE_TABLE_ID).datagrid('appendRow', {
            title: data.title,
            attachGroup: data.attachGroup,
            url: data.url,
            attachType: ATTACHMENT_FILE_TYPE,
            createTime: data.createTime,
            createUserName: data.createUserName
        });
        ATTACHMENT_FILE_TABLE_ID = null;
    }
}

function getQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) {
        return unescape(r[2]);
    }
    return null;
}

function getQueryStringFromGlobalParams() {
    var params = {};
    if (GLOBAL_PARAMS) {
        var arr = GLOBAL_PARAMS.split("&"); //各个参数放到数组里
        for (var i = 0; i < arr.length; i++) {
            var num = arr[i].indexOf("=");
            if (num > 0) {
                var name = arr[i].substring(0, num);
                var value = arr[i].substr(num + 1);
                params[name] = value;
            }
        }
    }
    console.info("getQueryStringFromGlobalParams()")
    for (var attr in params) {
        console.info(attr + " -> " + params[attr]);
    }
    console.info("/getQueryStringFromGlobalParams()")
    return params;
}

var COMPANY = {
    "Erui International Electronic Commerce Co., Ltd.": "易瑞国际电子商务有限公司",
    "Erui International USA, LLC": "易瑞国际（美国）有限公司",
    "Erui International (Canada) Co., Ltd.": "易瑞国际（加拿大）有限公司",
    "Erui Intemational Electronic Commerce (HK) Co., Lirnited": "易瑞國際電子商務（香港）有限公司",
    "PT ERUI INTERNATIONAL INDONESIA": "易瑞国际印尼有限公司",
    "Erui Intemational Electronic Commerce (Peru) S.A.C": "易瑞国际电子商务（秘鲁）有限公司",
    "ERUI INTERNATIONAL SAS": "易瑞国际（哥伦比亚）子公司",
    "Erui International Middle East Co., Ltd.": "易瑞国际中东有限责任公司"
};


String.prototype.startWith = function (str) {
    var reg = new RegExp("^" + str);
    return reg.test(this);
}

String.prototype.endWith = function (str) {
    var reg = new RegExp(str + "$");
    return reg.test(this);
}

// 定义一个 Vue 全局的保留两位小数过滤器
Vue.filter('numFilter', function (value) {
    // 截取当前数据到小数点后两位
    var realVal = parseFloat(value).toFixed(2);
    return realVal
})
var d_buttons = $.extend([], $.fn.datebox.defaults.buttons);
d_buttons.splice(1, 0, {
    text: '清空',
    handler: function (target) {
        $(target).datebox('setValue', '');
    }
});