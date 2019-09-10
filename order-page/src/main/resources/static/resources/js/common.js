var ORDER_URL = "http://java.eruidev.com:85";
var BPM_URL = "http://bpm.eruidev.com";
var ERUITOKEN = "341ee50845d316ba0c737362739adbed_018410";
var GLOBAL_PARAMS = null;
function beforeAjaxSend(request) {
    request.setRequestHeader("eruitoken", ERUITOKEN);
}

function tokenAjaxLoader(opts,param,success,error){
    if(!opts.url) {
        return false;
    }
    $.ajax({
        type: opts.method,
        url: opts.url,
        data: JSON.stringify(param),
        dataType: "json",
        beforeSend: beforeAjaxSend,
        contentType: 'application/json;charset=utf-8',
        success: function(data) {
            success(data);
        },
        error: function() {
            error.apply(this, arguments);
        }
    });
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



function syncAjaxJson(opts,param){
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
        data: JSON.stringify(param),
        async: false,
        dataType: "json",
        beforeSend: beforeAjaxSend,
        contentType: 'application/json;charset=utf-8',
        success: function(data) {
            finalData = data;
        },
        error: function() {
            console.error("error->" + JSON.stringify(opts) +  "," + JSON.stringify(param))
        }
    });
    return finalData;
}


//自定义删除函数:
Array.prototype.remove=function(dx)
{
    if(isNaN(dx)||dx>this.length){return false;}
    for(var i=0,n=0;i<this.length;i++)
    {
        if(this[i]!=this[dx])
        {
            this[n++]=this[i]
        }
    }
    this.length-=1
}

$.fn.serializeJson = function () {
    var serializeObj = {};
    $(this.serializeArray()).each(function () {
        serializeObj[this.name] = this.value;
    });
    return serializeObj;
};

// 设置datagrid分页数据到第一页
function setDatagridToFirstPage(ids){
    var opts = $(ids).datagrid('options');
    var pager = $(ids).datagrid('getPager');
    opts.pageNumber = 1;
    opts.pageSize = opts.pageSize;
    pager.pagination('refresh',{
        pageNumber:1,
        pageSize:opts.pageSize
    });
}

function getQueryString(name){
    var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if(r!=null) {
        return  unescape(r[2]);
    }
    return null;
}
function getQueryStringFromGlobalParams(){
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
    for(var attr in params){
        console.info(attr + " -> " + params[attr]);
    }
    console.info("/getQueryStringFromGlobalParams()")
    return params;
}

var COMPANY = {
            "Erui International Electronic Commerce Co., Ltd.":"易瑞国际电子商务有限公司",
            "Erui International USA, LLC":  "易瑞国际（美国）有限公司",
            "Erui International (Canada) Co., Ltd.":"易瑞国际（加拿大）有限公司",
            "Erui Intemational Electronic Commerce (HK) Co., Lirnited":"易瑞國際電子商務（香港）有限公司",
            "PT ERUI INTERNATIONAL INDONESIA":"易瑞国际印尼有限公司",
            "Erui Intemational Electronic Commerce (Peru) S.A.C":"易瑞国际电子商务（秘鲁）有限公司",
            "ERUI INTERNATIONAL SAS":"易瑞国际（哥伦比亚）子公司",
            "Erui International Middle East Co., Ltd.":"易瑞国际中东有限责任公司"
        };
