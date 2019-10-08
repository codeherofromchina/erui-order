-- 清空数据库 
truncate table attachment;
truncate table order_payment;
truncate table order_goods;
truncate table `order`;
truncate table project;
truncate table project_profit;
truncate table purch_requisition;
truncate table purch_requisition_goods;
truncate table purch_contract;
truncate table purch_contract_signatories;
truncate table purch_contract_goods;
truncate table purch_contract_standard;
truncate table purch_contract_simple;
truncate table purch;
truncate table purch_payment;
truncate table purch_goods;
truncate table inspect_apply;
truncate table inspect_apply_goods;
truncate table inspect_report;
truncate table instock;
truncate table instock_goods;
truncate table deliver_consign;
truncate table deliver_consign_payment;
truncate table deliver_consign_goods;
truncate table deliver_consign_booking_space;
truncate table deliver_notice;
truncate table deliver_detail;
truncate table deliver_detail_goods;
truncate table logistics_data;
truncate table logistics_data_info;
truncate table order_account;
truncate table purch_pay_application;

drop table if exists order_test.`attachment`;
CREATE TABLE order_test.attachment (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    attach_group VARCHAR(255) COMMENT '附件分组',
    title VARCHAR(255) NOT NULL COMMENT '附件名称',
    url VARCHAR(255) NOT NULL COMMENT '附件地址',
    attach_type SMALLINT COMMENT '附件类型',
    target_obj_id BIGINT NOT NULL COMMENT '关联业务id',
    target_obj_table CHAR(20) COMMENT '附件所属业务',
    create_user_id bigint null comment '创建人',
    create_time datetime not null default now() comment '创建时间',
    update_user_id bigint null comment '更新人',
    update_time datetime null default null comment '记录更新时间',
    delete_flag bit not null default 0 comment '记录删除标志 0：未删除 1：已删除',
    delete_time datetime null comment '记录删除时间',
    index(target_obj_table,target_obj_id)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT '附件表';


CREATE TABLE order_test.`user` (
    `id` BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `user_no` CHAR(6) DEFAULT NULL COMMENT '员工编号',
    `user_name` VARCHAR(60) NOT NULL COMMENT '姓名',
    `nick_name` VARCHAR(60) DEFAULT NULL COMMENT '英文名称',
    `email` VARCHAR(60) DEFAULT NULL COMMENT '邮箱账号',
    `mobile` VARCHAR(30) DEFAULT NULL COMMENT '手机号码',
    `password_hash` VARCHAR(40) NOT NULL COMMENT '加密密码',
    `citizenship` CHAR(7) DEFAULT 'china' COMMENT '籍贯：china-中籍；foreign-外籍',
    `avatar` VARCHAR(255) NOT NULL DEFAULT 'http://erui.oss-cn-beijing.aliyuncs.com/headicon.png' COMMENT '头像',
    `gender` CHAR(1) DEFAULT 'M' COMMENT '性别',
    `mobile2` VARCHAR(30) DEFAULT NULL COMMENT '备用手机号码',
    `remarks` VARCHAR(255) DEFAULT NULL COMMENT '备注',
    `status` CHAR(20) NOT NULL DEFAULT 'NORMAL' COMMENT '状态,NORMAL-正常;DISABLED-停用',
    `create_time` DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
    `delete_flag` CHAR(1) DEFAULT 'N' COMMENT 'N:未删除  Y:删除'
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='员工用户表';



CREATE TABLE `buyer` (
    `id` BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    `buyer_no` VARCHAR(40) DEFAULT NULL COMMENT '客户编号',
    `buyer_code` VARCHAR(40) DEFAULT NULL COMMENT '客户编码',
    `buyer_name` VARCHAR(100) DEFAULT NULL COMMENT '名称',
    `area_bn` VARCHAR(32) DEFAULT NULL COMMENT '区域简称',
    `country_bn` VARCHAR(32) NOT NULL COMMENT '所在国简称'
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='采购商客户信息';


CREATE TABLE `market_area` (
    `id` BIGINT PRIMARY KEY AUTO_INCREMENT,
    `lang` CHAR(2) NOT NULL DEFAULT 'zh' COMMENT '语言',
    `bn` VARCHAR(32) NOT NULL COMMENT '简称',
    `area_name` VARCHAR(100) NOT NULL COMMENT '名称',
    `status` VARCHAR(20) DEFAULT 'VALID' COMMENT '状态 VALID:可用 INVALID:不可用',
    `created_at` DATETIME NOT NULL default now() COMMENT '创建时间'
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='营销区域';


CREATE TABLE `market_area_country` (
    `market_area_bn` VARCHAR(32) NOT NULL COMMENT '营销区域简称',
    `country_bn` VARCHAR(32) NOT NULL COMMENT '国家简称',
    `status` VARCHAR(20) DEFAULT 'VALID' COMMENT '状态 VALID:可用 INVALID:不可用',
    `created_at` DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
    PRIMARY KEY (`market_area_bn` , `country_bn`)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='营销区域国家';

CREATE TABLE `country` (
    `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
    `lang` CHAR(2) NOT NULL DEFAULT 'zh' COMMENT '语言',
    `region_bn` VARCHAR(32) DEFAULT 'other' COMMENT '地区简称',
    `code` VARCHAR(50) DEFAULT NULL COMMENT '国家代码',
    `bn` VARCHAR(32) NOT NULL COMMENT '简称',
    `country_name` VARCHAR(100) DEFAULT NULL COMMENT '国家名称',
    `int_tel_code` VARCHAR(20) DEFAULT NULL COMMENT '国际电话区号',
    `time_zone` BIGINT(20) DEFAULT NULL COMMENT '时区',
    `status` VARCHAR(20) DEFAULT 'VALID' COMMENT '状态 VALID / INVALID',
    `deleted_flag` CHAR(1) DEFAULT 'N',
    `edi_code` CHAR(3) DEFAULT NULL COMMENT 'edi编码'
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='国家';



CREATE TABLE `port` (
    `id` BIGINT PRIMARY KEY AUTO_INCREMENT,
    `lang` VARCHAR(6) NOT NULL DEFAULT 'en' COMMENT '语言',
    `country_bn` VARCHAR(32) NOT NULL COMMENT '国家简称',
    `bn` VARCHAR(32) NOT NULL COMMENT '口岸简称',
    `port_name` VARCHAR(100) NOT NULL COMMENT '口岸名称',
    `name_en` VARCHAR(100) DEFAULT '' COMMENT '口岸英文名称',
    `port_type` VARCHAR(50) DEFAULT NULL COMMENT '口岸类型 HARBOUR：海港  AIRPORT：空港  LANDPORT：陆港',
    `trans_mode` VARCHAR(100) DEFAULT NULL COMMENT '运输方式 Ocean：海运   Air：空运   Multimodal：多式联运  Road：公路  Railway Containers：铁路 International Express：国际快递',
    `created_at` DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
    `deleted_flag` CHAR(1) DEFAULT 'N'
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='口岸/港口';

CREATE TABLE `standard_unit` (
  `unit_code` CHAR(10) primary key comment '单位编码',
  `name_zh` varchar(255) not null comment '单位中文名称'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品标准单位';

create table org (
    id bigint primary key ,
    membership varchar(255),
    parent_id bigint not null default 0 comment '父事业部ID',
    org_name_en varchar(255) comment '事业部英文名称',
    org_name varchar(255) comment '事业部名称',
    `org_status` varchar(255) comment '事业部状态 NORMAL：正常',
    deleted_flag CHAR(1) default 'N' comment '是否删除',
    org_node varchar(255) comment '事业部节点',
    used_for_goods CHAR(1) default 'N' comment '是否在商品中使用'
) ENGINE=INNODB DEFAULT CHARSET=UTF8 comment '事业部';

CREATE TABLE org_user (
    org_id BIGINT NOT NULL,
    user_id BIGINT NOT NULL,
    PRIMARY KEY (user_id , org_id)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT '事业部用户中间表';


CREATE TABLE fastdfs_file (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    dfs_group CHAR(10) NOT NULL COMMENT 'fastdfs的文件分组',
    fileid VARCHAR(255) NOT NULL COMMENT 'fastdfs的文件标识',
    original_filename VARCHAR(255) NOT NULL COMMENT '文件原始名称',
    file_size bigint comment '文件大小',
    create_user_id BIGINT COMMENT '上传用户',
    create_time DATETIME COMMENT '创建时间'
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='fastdfs中文件记录表';


drop table if exists order_test.`order_payment`;
CREATE TABLE order_test.order_payment (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    order_id BIGINT NOT NULL COMMENT '订单编号',
    payment_type SMALLINT NOT NULL COMMENT '收款类型',
    money DECIMAL(10 , 2 ) NOT NULL COMMENT '收款金额',
    receipt_date DATE COMMENT '收款日期',
    receipt_days SMALLINT COMMENT '收款天',
    create_user_id bigint null comment '创建人',
    create_time datetime not null default now() comment '创建时间',
    update_user_id bigint null comment '更新人',
    update_time datetime null default null comment '记录更新时间',
    delete_flag bit not null default 0 comment '记录删除标志 0：未删除 1：已删除',
    delete_time datetime null comment '记录删除时间',
    index(order_id)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT '订单预收款条件表';


drop table if exists `order_goods`;
CREATE TABLE order_goods (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    order_id BIGINT COMMENT '订单表ID',
    contract_no varchar(255) comment '销售合同号',
    sku VARCHAR(32) COMMENT '商品SKU',
    mete_type VARCHAR(255) COMMENT '物料分类编号',
    mete_type_name VARCHAR(255) COMMENT '物料分类名称',
    tpl_no VARCHAR(255) COMMENT '模板编号',
    tpl_name VARCHAR(255) COMMENT '模板名称',
    `department_id` BIGINT DEFAULT NULL COMMENT '商品所属事业部',
    name_en VARCHAR(255) COMMENT '外文品名',
    name_zh VARCHAR(255) COMMENT '中文品名',
    contract_goods_num SMALLINT COMMENT '合同商品数量',
    unit VARCHAR(255) COMMENT '单位',
    price DECIMAL(20 , 4 ) COMMENT '商品单价',
    `erui_price` DECIMAL(20 , 2 ) DEFAULT NULL COMMENT '易瑞销售单价',
     `total_price` DECIMAL(20 , 2 ) DEFAULT NULL COMMENT '商品总金额',
    brand VARCHAR(255) COMMENT '品牌',
    attrs text COMMENT '模板属性',
    pre_purch_contract_num SMALLINT COMMENT '预采购合同商品数量（保存+提交）',
    purch_contract_num SMALLINT COMMENT '采购合同商品数量（已提交）',
    pre_outstocked_num SMALLINT COMMENT '预发货数量（保存+提交）',
    outstocked_num SMALLINT COMMENT '已发货数量（已提交）',
    instocked_num SMALLINT COMMENT '已入库数量',
    exe_chg_date DATE COMMENT '执行单变更后日期',
    create_user_id BIGINT NULL COMMENT '创建人',
    create_time DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
    update_user_id BIGINT NULL COMMENT '更新人',
    update_time DATETIME NULL DEFAULT NULL COMMENT '记录更新时间',
    delete_flag BIT NOT NULL DEFAULT 0 COMMENT '记录删除标志 0：未删除 1：已删除',
    delete_time DATETIME NULL COMMENT '记录删除时间',
    INDEX (order_id)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT '订单商品表';



drop table if exists `order`;
CREATE TABLE `order` (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    contract_no VARCHAR(255) NOT NULL COMMENT '销售合同号',
    framework_no VARCHAR(255) COMMENT '框架协议号',
    contract_no_os VARCHAR(255) COMMENT '海外销售合同号',
    po_no VARCHAR(255) NOT NULL COMMENT 'po号',
    inquiry_id BIGINT COMMENT '询单ID',
    inquiry_no VARCHAR(255) COMMENT '询单号',
    order_source SMALLINT COMMENT '订单来源',
    `project_no` varchar(50) DEFAULT NULL COMMENT '项目号',
    signing_date DATE  COMMENT '订单签约日期',
    delivery_date VARCHAR(255) NOT NULL COMMENT '合同交货日期',
    signing_co VARCHAR(255) COMMENT '客户签约主体公司',
    agent_id BIGINT NOT NULL COMMENT '市场经办人ID',
    exec_co_code VARCHAR(255) NOT NULL COMMENT '执行分公司名称',
    region VARCHAR(32) NOT NULL COMMENT '所属地区编码',
    country VARCHAR(32) NOT NULL COMMENT '所属国家编码',
    buyer_id BIGINT NOT NULL COMMENT '客户ID',
    crm_code VARCHAR(40) COMMENT '客户代码',
    customer_type SMALLINT NOT NULL COMMENT '客户类型',
    per_liable_repay_id BIGINT NOT NULL COMMENT '回款责任人ID',
    business_unit_id BIGINT NOT NULL COMMENT '执行事业部ID',
    technical_id BIGINT NOT NULL COMMENT '商务技术经办人ID/事业部负责人ID',
    grant_type SMALLINT COMMENT '授信情况',
    financing SMALLINT COMMENT '是否融资',
    trade_terms CHAR(10) NOT NULL COMMENT '贸易术语',
    transport_type VARCHAR(20) COMMENT '运输方式',
    from_country VARCHAR(32) COMMENT '起运国',
    from_port VARCHAR(32) COMMENT '起运港',
    from_place VARCHAR(255) COMMENT '起运始发地',
    to_country VARCHAR(32) COMMENT '目的国',
    to_port VARCHAR(32) COMMENT '目的港',
    to_place VARCHAR(255) COMMENT '目的地',
    total_price DECIMAL(20 , 4 ) NOT NULL COMMENT '合同总价',
    erui_total_price DECIMAL(20 , 4 ) NOT NULL COMMENT '易瑞合同总价',
    total_price_usd DECIMAL(20 , 4 ) COMMENT '合同总价（美元）',
    exchange_rate DECIMAL(8 , 5 ) NOT NULL COMMENT '汇率',
    currency_bn CHAR(3) COMMENT '货币类型国际编码',
    tax_bearing SMALLINT NOT NULL COMMENT '是否含税',
    payment_mode_bn SMALLINT NOT NULL COMMENT '收款方式',
    quality_funds DECIMAL(20 , 4 ) COMMENT '质保金',
    delivery_requires VARCHAR(255) COMMENT '交货要求描述',
    customer_context VARCHAR(255) COMMENT '客户及项目背景描述',
    pay_status SMALLINT NOT NULL COMMENT '收款状态',
    order_status SMALLINT NOT NULL COMMENT '订单状态',
    receivable_account_remaining DECIMAL(20 , 4 ) COMMENT '应收账款余额',
    acquire_id BIGINT NOT NULL COMMENT '获取人',
    process_progress varchar(255) NOT NULL COMMENT '流程进度',
    deliver_consign_has BIT COMMENT '是否已生成出口通知单',
    order_belongs SMALLINT NULL COMMENT '订单所属',
    order_category SMALLINT NOT NULL COMMENT '订单类别',
    overseas_sales SMALLINT COMMENT '海外销类型',
    shipments_money DECIMAL(20 , 4 ) COMMENT '已发货总金额',
    already_gathering_money DECIMAL(20 , 4 ) COMMENT '已收款总金额',
    purch_req_create SMALLINT NULL COMMENT '是否已经创建采购申请单',
    advance_money DECIMAL(20 , 4 ) NULL COMMENT '预收金额',
    create_user_id BIGINT NULL COMMENT '创建人',
    create_time DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
    update_user_id BIGINT NULL COMMENT '更新人',
    update_time DATETIME NULL COMMENT '记录更新时间',
    delete_flag BIT NOT NULL DEFAULT 0 COMMENT '记录删除标志 0：未删除 1：已删除',
    delete_time DATETIME NULL COMMENT '记录删除时间'
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT '订单表';

drop table if exists order_test.`project`;
CREATE TABLE order_test.project (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    order_id BIGINT NOT NULL COMMENT '订单ID',
    project_no VARCHAR(255) COMMENT '项目号',
    project_name VARCHAR(255) COMMENT '项目名称、合同标的',
    start_date DATE COMMENT '项目开始日期',
    delivery_date VARCHAR(255) COMMENT '执行单约定交付日期',
    profit DECIMAL(20 , 4 ) COMMENT '利润额',
    profit_percent DECIMAL(5 , 2 ) COMMENT '初步利润率',
    project_status VARCHAR(20) COMMENT '项目状态',
    purch_req_create SMALLINT default 1 COMMENT '是否已经创建采购申请单 1：未创建  2：已创建保存状态 3:已创建并提交',
    purch_done BIT COMMENT '是否采购合同完成',
    exe_chg_date DATE COMMENT '执行单变更后日期',
    require_purchase_date DATE COMMENT '要求采购到货日期',
    quality_uid BIGINT COMMENT '品控经办人',
    business_uid BIGINT COMMENT '商务技术部经办人',
    send_dept_id BIGINT COMMENT '下发部门',
    remarks VARCHAR(255) COMMENT '项目备注',
    total_price_usd DECIMAL(20 , 4 ) COMMENT '合同总价（USD）合同金额（美元）',
    process_progress VARCHAR(255) COMMENT '流程进度',
    deliver_consign_has BIT COMMENT '是否已生成出口通知单',
    quality_inspect_type CHAR(4) COMMENT '质量检验类型',
    create_user_id BIGINT NULL COMMENT '创建人',
    create_time DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
    update_user_id BIGINT NULL COMMENT '更新人',
    update_time DATETIME NULL DEFAULT NULL COMMENT '记录更新时间',
    delete_flag BIT NOT NULL DEFAULT 0 COMMENT '记录删除标志 0：未删除 1：已删除',
    delete_time DATETIME NULL COMMENT '记录删除时间'
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT '项目表';


drop table if exists `project_profit`;
CREATE TABLE project_profit (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    project_id BIGINT NOT NULL UNIQUE COMMENT '项目ID',
    country_bn VARCHAR(32) NOT NULL COMMENT '国家',
    trade_term CHAR(3) COMMENT '贸易术语',
    project_type SMALLINT DEFAULT 1 COMMENT '项目类型',
    contract_amount_usd DECIMAL(20 , 4 ) COMMENT '合同金额（美元）',
    contract_amount DECIMAL(20 , 4 ) COMMENT '合同金额（人民币）',
    exchange_rate DECIMAL(10 , 4 ) COMMENT '汇率',
    tax_refund DECIMAL(20 , 4 ) COMMENT '退税',
    land_freight DECIMAL(20 , 4 ) COMMENT '陆运费',
    land_insurance DECIMAL(20 , 4 ) COMMENT '陆运险',
    port_charges DECIMAL(20 , 4 ) COMMENT '港杂费',
    inspection_fee DECIMAL(20 , 4 ) COMMENT '商检险',
    international_transport DECIMAL(20 , 4 ) COMMENT '国际运输',
    tariff DECIMAL(10 , 4 ) COMMENT '关税',
    vat DECIMAL(10 , 4 ) COMMENT '增值税',
    customs_clear_fee DECIMAL(10 , 4 ) COMMENT '清关杂税',
    customs_agent_fee DECIMAL(20 , 4 ) COMMENT '清关代理费',
    transportion_insurance DECIMAL(20 , 4 ) COMMENT '货物运输保险',
    export_credit_insurance DECIMAL(20 , 4 ) COMMENT '出口信用险',
    other_credit DECIMAL(20 , 4 ) COMMENT '其他信用',
    travel_expenses DECIMAL(20 , 4 ) COMMENT '差旅费、业务费等',
    project_cost DECIMAL(20 , 4 ) COMMENT '项目成本小计',
    gross_profit DECIMAL(20 , 4 ) COMMENT '毛利润',
    gross_profit_margin DECIMAL(10 , 4 ) COMMENT '毛利率',
    agent_fee DECIMAL(20 , 4 ) COMMENT '【项目代理费用】改为【项目佣金】',
    raise_fee DECIMAL(20 , 4 ) COMMENT '提点费用',
    guarance_fee DECIMAL(20 , 4 ) COMMENT '信用证，保函费',
    financing_interest DECIMAL(10 , 4 ) COMMENT '融资利息',
    bank_fees DECIMAL(20 , 4 ) COMMENT '银行手续费',
    domestic_taxs DECIMAL(20 , 4 ) COMMENT '国内税费',
    foreign_taxes DECIMAL(20 , 4 ) COMMENT '国外税费',
    manage_fee DECIMAL(20 , 4 ) COMMENT '管理费用',
    after_profit DECIMAL(20 , 4 ) COMMENT '市场提点后报价利润',
    before_profit DECIMAL(20 , 4 ) COMMENT '市场提点前报价利润',
    quotation_profit DECIMAL(10 , 4 ) COMMENT '报价利润率',
    purchasing_costs_d DECIMAL(20 , 4 ) COMMENT '采购成本-国内',
    purchasing_costs_f DECIMAL(20 , 4 ) COMMENT '采购成本-国外',
    raise_rate DECIMAL(10 , 4 ) COMMENT '项目核算利润提点比例',
    total_project_cost DECIMAL(20 , 4 ) COMMENT '项目成本总计',
    rear_fee DECIMAL(20 , 4 ) COMMENT '后方提点费用',
    platform_agent_cost DECIMAL(20 , 4 ) COMMENT '平台代理费用',
    create_user_id BIGINT NULL COMMENT '创建人',
    create_time DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
    update_user_id BIGINT NULL COMMENT '更新人',
    update_time DATETIME NULL DEFAULT NULL COMMENT '记录更新时间',
    delete_flag BIT NOT NULL DEFAULT 0 COMMENT '记录删除标志 0：未删除 1：已删除',
    delete_time DATETIME NULL COMMENT '记录删除时间'
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT '项目利润表';




drop table if exists `purch_requisition`;
CREATE TABLE purch_requisition (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    project_id BIGINT NOT NULL UNIQUE COMMENT '项目ID',
    contract_no VARCHAR(255) COMMENT '销售合同号',
    project_no VARCHAR(255) COMMENT '项目号',
    project_name VARCHAR(255) COMMENT '项目名称、合同标的',
    project_start_date DATE COMMENT '项目开始日期',
    business_uid BIGINT NOT NULL COMMENT '项目经办人',
    require_purchase_date DATE COMMENT '要求采购到货日期',
    department BIGINT COMMENT '下发部门',
    submit_date DATE COMMENT '下发时间',
    trade_method SMALLINT COMMENT '贸易方式',
    trans_mode_bn CHAR(10) NOT NULL COMMENT '贸易术语',
    factory_send SMALLINT COMMENT '厂家直接发货 1:直接发货 0：不是厂家直接发货',
    delivery_place VARCHAR(255) COMMENT '交货地点',
    requirements VARCHAR(255) COMMENT '客户文件要求',
    remarks VARCHAR(255) COMMENT '备注信息',
    purch_requisition_status SMALLINT NOT NULL DEFAULT 1 COMMENT '状态',
    purch_status SMALLINT NOT NULL DEFAULT 1 COMMENT '采购状态',
    purchase_uid BIGINT COMMENT '采购经办人',
    single_person_id BIGINT COMMENT '分单人ID',
    create_user_id BIGINT NULL COMMENT '创建人',
    create_time DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
    update_user_id BIGINT NULL COMMENT '更新人',
    update_time DATETIME NULL DEFAULT NULL COMMENT '记录更新时间',
    delete_flag BIT NOT NULL DEFAULT 0 COMMENT '记录删除标志 0：未删除 1：已删除',
    delete_time DATETIME NULL COMMENT '记录删除时间'
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT '采购申请单';


drop table if exists `purch_requisition_goods`;
CREATE TABLE purch_requisition_goods (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    purch_requisition_id BIGINT NOT NULL UNIQUE COMMENT '采购申请单ID',
    order_goods_id BIGINT NOT NULL UNIQUE COMMENT '订单商品ID',
    project_no varchar(255) comment '项目号',
    require_purchase_date DATE COMMENT '采购需用日期',
    tech_require VARCHAR(255) COMMENT '技术要求和使用条件',
    check_type CHAR(7) COMMENT '质检类型',
    check_method CHAR(9) COMMENT '质检方法',
    certificate VARCHAR(255) COMMENT '合格证',
    tech_audit VARCHAR(255) COMMENT '技术审核',
    create_user_id bigint null comment '创建人',
    create_time datetime not null default now() comment '创建时间',
    update_user_id bigint null comment '更新人',
    update_time datetime null default null comment '记录更新时间',
    delete_flag bit not null default 0 comment '记录删除标志 0：未删除 1：已删除',
    delete_time datetime null comment '记录删除时间',
    index(purch_requisition_id)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT '采购申请单商品';




drop table if exists `purch_contract`;
CREATE TABLE purch_contract (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    purch_contract_no varchar(255) NOT NULL COMMENT '采购合同号',
    project_no varchar(255) comment '项目号',
    contract_type SMALLINT COMMENT '合同类型 1:简易合同 2:标准合同 3:非标合同',
    purch_contract_status SMALLINT NOT NULL DEFAULT 1 COMMENT '状态 1:待确认 2:未执行 3:已执行 4:已完成 5:已删除',
    signing_date DATE NOT NULL COMMENT '合同签订日期',
    supplier_id BIGINT NOT NULL COMMENT '供货商ID',
    supplier_name VARCHAR(255) COMMENT '供货商名称',
    signing_place VARCHAR(255) COMMENT '合同签订地点',
    agent_id BIGINT NOT NULL COMMENT '采购经办人',
    tax_point DECIMAL(2 , 0 ) COMMENT '税点%,0到100数字',
    capitalized_price VARCHAR(255) COMMENT '采购总金额（大写）',
    lowercase_price DECIMAL(20 , 4 ) COMMENT '采购总金额（小写）',
    goods_remarks VARCHAR(255) COMMENT '商品备注',
    currency_bn CHAR(3) COMMENT '货币类型（币种）',
    country_bn VARCHAR(32) COMMENT '国家',
    region_bn VARCHAR(32) COMMENT '所属地区',
    create_user_id bigint null comment '创建人',
    create_time datetime not null default now() comment '创建时间',
    update_user_id bigint null comment '更新人',
    update_time datetime null default null comment '记录更新时间',
    delete_flag bit not null default 0 comment '记录删除标志 0：未删除 1：已删除',
    delete_time datetime null comment '记录删除时间'
) ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT '采购合同表';


drop table if exists `purch_contract_signatories`;
CREATE TABLE purch_contract_signatories (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    purch_contract_id BIGINT NOT NULL COMMENT '采购合同管理ID',
    signatories_type SMALLINT NOT NULL COMMENT '类型 1:出卖人 2:买受人',
    seller_buyer VARCHAR(255) NOT NULL COMMENT '出卖人/买受人（单位名称）',
    postal_code CHAR(6) COMMENT '邮政编码',
    legal_representative VARCHAR(255) COMMENT '法定代表人或授权代表',
    agent VARCHAR(255) COMMENT '委托代理人',
    address VARCHAR(255) COMMENT '单位地址',
    opening_bank VARCHAR(255) COMMENT '开户银行',
    account_number VARCHAR(255) COMMENT '账号',
    credit_code VARCHAR(255) COMMENT '统一社会信用代码证',
    telephone_fax VARCHAR(255) COMMENT '电话/传真',
    duty_paragraph VARCHAR(255) COMMENT '税号',
    create_user_id bigint null comment '创建人',
    create_time datetime not null default now() comment '创建时间',
    update_user_id bigint null comment '更新人',
    update_time datetime null default null comment '记录更新时间',
    delete_flag bit not null default 0 comment '记录删除标志 0：未删除 1：已删除',
    delete_time datetime null comment '记录删除时间',
    UNIQUE(purch_contract_id,signatories_type)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT '采购合同买卖双方信息表';

drop table if exists `purch_contract_goods`;
CREATE TABLE purch_contract_goods (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    purch_contract_id BIGINT NOT NULL COMMENT '采购合同ID',
    purch_requisition_goods_id BIGINT NOT NULL COMMENT '采购申请单商品ID',
    purch_contract_brand VARCHAR(255) COMMENT '采购合同商品品牌',
    purchase_num INT NOT NULL COMMENT '本次采购数量',
    non_tax_price DECIMAL(20 , 4 ) COMMENT '不含税单价，按照采购单价和采购合同的税点计算得出',
    purchase_price DECIMAL(20 , 4 ) COMMENT '采购单价',
    purchase_total_price DECIMAL(20 , 4 ) COMMENT '采购金额',
    pre_purchased_num int comment '预采购数量',
    purchased_num int comment '已采购数量',
    create_user_id bigint null comment '创建人',
    create_time datetime not null default now() comment '创建时间',
    update_user_id bigint null comment '更新人',
    update_time datetime null default null comment '记录更新时间',
    delete_flag bit not null default 0 comment '记录删除标志 0：未删除 1：已删除',
    delete_time datetime null comment '记录删除时间'
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT '采购合同商品';

drop table if exists `purch_contract_standard`;
CREATE TABLE purch_contract_standard (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    purch_contract_id BIGINT NOT NULL COMMENT '采购合同管理ID',
    used_for_buyer VARCHAR(255) COMMENT '基础信息、用于买受人__，且出卖人',
    standard_and_require VARCHAR(255) COMMENT '第二条、质量标准及要求__',
    meet_require VARCHAR(255) COMMENT '第四条、产品包装标准、包装费用与包装物回收__',
    warranty_period VARCHAR(255) COMMENT '第五条、质保与售后__',
    delivery_date DATE COMMENT '第六条、出卖人负责于__（前）',
    delivery_place VARCHAR(255) COMMENT '第六条、交货地点:__。',
    inspection_period VARCHAR(255) COMMENT '第七条、检验期为__天(月)',
    data_version VARCHAR(255) COMMENT '第七条、技术资料包括__版本',
    method_and_time VARCHAR(255) COMMENT '第八条、结算方式及时间__',
    inside_address_s VARCHAR(255) COMMENT '第十二条、收信地址为__',
    addressee_s VARCHAR(255) COMMENT '第十二条、收信人为__',
    telephone_s VARCHAR(255) COMMENT '第十二条、电话为__',
    inbox_address_s VARCHAR(255) COMMENT '第十二条、电子邮件收件邮箱地址为__',
    inside_address_b VARCHAR(255) COMMENT '第十二条、收信地址为__',
    addressee_b VARCHAR(255) COMMENT '第十二条、收信人为__',
    telephone_b VARCHAR(255) COMMENT '第十二条、电话为__',
    inbox_address_b VARCHAR(255) COMMENT '第十二条、电子邮件收件邮箱地址为__',
    solution VARCHAR(255) COMMENT '第十五条、按下列第__种方式解决',
    board_arbitration VARCHAR(255) COMMENT '第十五条、提交__仲裁委员会仲裁',
    few_copies VARCHAR(255) COMMENT '第十六条、本合同一式__份',
    seller_few_copies VARCHAR(255) COMMENT '第十六条、出卖人执__份',
    buyer_few_copies VARCHAR(255) COMMENT '第十六条、买受人执__份',
    appendices_name1 VARCHAR(255) COMMENT '第十六条、合同附件：1.__',
    appendices_name2 VARCHAR(255) COMMENT '第十六条、合同附件：2.__',
    create_user_id bigint null comment '创建人',
    create_time datetime not null default now() comment '创建时间',
    update_user_id bigint null comment '更新人',
    update_time datetime null default null comment '记录更新时间',
    delete_flag bit not null default 0 comment '记录删除标志 0：未删除 1：已删除',
    delete_time datetime null comment '记录删除时间'
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT '采购标准合同表';

drop table if exists `purch_contract_simple`;
CREATE TABLE purch_contract_simple (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    purch_contract_id BIGINT NOT NULL COMMENT '采购合同管理ID',
    product_requirement VARCHAR(255) COMMENT '1、货物皆为符合__的合格产品',
    warranty_period VARCHAR(255) COMMENT '1、质保期自__ 。',
    shipping_date DATE COMMENT '3、将货物于__前运送至',
    designated_location VARCHAR(255) COMMENT '3、指定的地点：__。',
    cost_burden VARCHAR(255) COMMENT '4、费用负担：__运',
    inspection_at VARCHAR(255) COMMENT '5、合同第1条在__处检验',
    within_days VARCHAR(255) COMMENT '5、并在__日内提出异议',
    method_and_time VARCHAR(255) COMMENT '6、结算方式及时间：__。',
    agreement_name VARCHAR(255) COMMENT '9、附《__技术协议》',
    create_user_id bigint null comment '创建人',
    create_time datetime not null default now() comment '创建时间',
    update_user_id bigint null comment '更新人',
    update_time datetime null default null comment '记录更新时间',
    delete_flag bit not null default 0 comment '记录删除标志 0：未删除 1：已删除',
    delete_time datetime null comment '记录删除时间'
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT '采购简易合同表';




drop table if exists `purch`;
CREATE TABLE purch (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    purch_no varchar(255) NOT NULL COMMENT '采购合同号',
    contract_no VARCHAR(255) NOT NULL COMMENT '销售合同号',
    project_no VARCHAR(255) NOT NULL COMMENT '项目号',
    purch_contract_id BIGINT NOT NULL COMMENT '采购合同管理ID',
    agent_id BIGINT NOT NULL COMMENT '采购经办人',
    department VARCHAR(255) COMMENT '下发部门',
    signing_date DATE COMMENT '采购合同签订日期',
    arrival_date DATE COMMENT '合同约定到货日期',
    pur_chg_date DATE COMMENT '合同变更后到货日期',
    supplier_id BIGINT COMMENT '供货商ID',
    total_price DECIMAL(20 , 4 ) COMMENT '采购总金额',
    currency_bn CHAR(3) COMMENT '货币类型',
    remarks VARCHAR(255) COMMENT '备注',
    purch_status SMALLINT DEFAULT 2 COMMENT '采购单状态',
    inspected BIT DEFAULT 0 COMMENT '是否报检完成',
    supply_area VARCHAR(32) COMMENT '供应商地区',
    goal_cost DECIMAL(20 , 4 ) COMMENT '目标成本',
    save_amount DECIMAL(20 , 4 ) COMMENT '节约资金',
    save_mode SMALLINT NOT NULL COMMENT '节约方式',
    price_mode SMALLINT NOT NULL COMMENT '定价方式',
    profit_percent DECIMAL(10 , 4 ) NOT NULL COMMENT '利润率',
    contract_tag VARCHAR(255) NOT NULL COMMENT '合同标的物',
    tax_bearing BIT COMMENT '是否含税',
    exchange_rate DECIMAL(10 , 4 ) COMMENT '汇率',
    `pay_status` SMALLINT DEFAULT '1' COMMENT '状态 1:未付款 2:已付款 3:已完成',
    create_user_id bigint null comment '创建人',
    create_time datetime not null default now() comment '创建时间',
    update_user_id bigint null comment '更新人',
    update_time datetime null default null comment '记录更新时间',
    delete_flag bit not null default 0 comment '记录删除标志 0：未删除 1：已删除',
    delete_time datetime null comment '记录删除时间'
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT '采购表';

drop table if exists `purch_payment`;
CREATE TABLE purch_payment (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    purch_id BIGINT NOT NULL COMMENT '采购单ID',
    payment_type SMALLINT NOT NULL COMMENT '收款类型 1:预付2:进度3:提货前4:提货后5:质保金',
    title VARCHAR(255) COMMENT '收款描述',
    money DECIMAL(20 , 4 ) NOT NULL COMMENT '付款金额',
    receipt_date DATE COMMENT '付款日期',
    days SMALLINT NOT NULL COMMENT '收款时间',
    create_user_id bigint null comment '创建人',
    create_time datetime not null default now() comment '创建时间',
    update_user_id bigint null comment '更新人',
    update_time datetime null default null comment '记录更新时间',
    delete_flag bit not null default 0 comment '记录删除标志 0：未删除 1：已删除',
    delete_time datetime null comment '记录删除时间'
) ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT '采购收款信息表';

drop table if exists `purch_goods`;
CREATE TABLE purch_goods (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    purch_id BIGINT NOT NULL COMMENT '采购ID',
    purch_contract_goods_id BIGINT NOT NULL COMMENT '采购合同商品ID',
    purchase_num INT COMMENT '采购数量',
    inspected_num INT DEFAULT 0 COMMENT '已报检数量（提交）',
    pre_inspected_num INT DEFAULT 0 COMMENT '预报检数量(保存+提交)',
    qualified_good_num INT DEFAULT 0 COMMENT '检验合格商品数量',
    non_tax_price DECIMAL(20 , 4 ) COMMENT '不含税单价',
    purchase_price DECIMAL(20 , 4 ) COMMENT '采购单价',
    purchase_total_price DECIMAL(20 , 4 ) COMMENT '采购金额',
    purchase_remark VARCHAR(255) COMMENT '采购备注',
    create_user_id bigint null comment '创建人',
    create_time datetime not null default now() comment '创建时间',
    update_user_id bigint null comment '更新人',
    update_time datetime null default null comment '记录更新时间',
    delete_flag bit not null default 0 comment '记录删除标志 0：未删除 1：已删除',
    delete_time datetime null comment '记录删除时间'
) ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT '采购商品表';




drop table if exists `inspect_apply`;
CREATE TABLE inspect_apply (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    inspect_apply_no varchar(255) COMMENT '报检单号',
    purch_no varchar(255) COMMENT '采购合同号',
    purch_id BIGINT NOT NULL COMMENT '采购id',
    masteer BIT DEFAULT 1 COMMENT '是否是主报检单',
    p_id BIGINT COMMENT '属于的上级报检单',
    department VARCHAR(255) COMMENT '下发部门',
    purchase_name_id BIGINT COMMENT '采购经办人',
    supplier_id VARCHAR(255) COMMENT '采购供应商ID',
    supplier_name VARCHAR(255) COMMENT '采购供应商',
    inspect_date DATE COMMENT '报检日期',
    `enter_erui_warehouse` bit DEFAULT 1 COMMENT '是否入易瑞仓（0：否  1：是）',
    remark VARCHAR(255) COMMENT '备注',
    history BIT DEFAULT 0 COMMENT '是否存在历史记录',
    num SMALLINT COMMENT '报检次数',
    msg VARCHAR(255) COMMENT '整改意见',
    inspect_apply_status SMALLINT NOT NULL COMMENT '质检申请单状态',
    tmp_msg VARCHAR(255) COMMENT '下一条的整改意见，临时存储',
    pub_status SMALLINT NOT NULL COMMENT '质检申请全局状态（父级显示状态）',
    create_user_id bigint null comment '创建人',
    create_time datetime not null default now() comment '创建时间',
    update_user_id bigint null comment '更新人',
    update_time datetime null default null comment '记录更新时间',
    delete_flag bit not null default 0 comment '记录删除标志 0：未删除 1：已删除',
    delete_time datetime null comment '记录删除时间'
) ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT '入库报检表';


drop table if exists `inspect_apply_goods`;
CREATE TABLE inspect_apply_goods (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    inspect_apply_id BIGINT NOT NULL COMMENT '报检单ID',
    inspect_report_id BIGINT COMMENT '质检单ID',
    purch_goods_id BIGINT NOT NULL COMMENT '采购商品ID',
    inspect_num INT COMMENT '报检数量',
    height VARCHAR(255) COMMENT '重量',
    lwh VARCHAR(255) COMMENT '长宽高',
    remarks VARCHAR(255) COMMENT '报检的备注',
    samples INT DEFAULT 0 COMMENT '抽样数',
    unqualified INT DEFAULT 0 COMMENT '不合格数',
    unqualified_desc VARCHAR(255) COMMENT '不合格描述',
    unqualified_type SMALLINT COMMENT '不合格类型 1: 性能失效 2: 材料问题 3: 零配件缺失 4: 工序遗漏 5: 特殊工艺 6: 尺寸问题 7: 表面缺陷 8: 标识问题 9: 资料问题',
    quality_inspect_type CHAR(4) COMMENT '质量检验类型 QRL1 QRL2 QRL3 QRL4',
    create_user_id bigint null comment '创建人',
    create_time datetime not null default now() comment '创建时间',
    update_user_id bigint null comment '更新人',
    update_time datetime null default null comment '记录更新时间',
    delete_flag bit not null default 0 comment '记录删除标志 0：未删除 1：已删除',
    delete_time datetime null comment '记录删除时间'
) ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT '入库报检商品表';

drop table if exists `inspect_report`;
CREATE TABLE `inspect_report` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `inspect_apply_id` bigint(20) NOT NULL COMMENT '报检申请单id',
  `inspect_apply_no` varchar(255) DEFAULT NULL COMMENT '报检单号',
  `purch_no` varchar(255) DEFAULT NULL COMMENT '采购合同号',
  `contract_no` varchar(255) DEFAULT NULL COMMENT '销售合同号',
  `project_no` varchar(255) DEFAULT NULL COMMENT '项目号',
  `ncr_no` varchar(255) DEFAULT NULL COMMENT 'NCR编码，只有在质检失败时会生成',
  `check_times` smallint(6) DEFAULT NULL COMMENT '检验次数',
  `check_date` date COMMENT '检验日期',
  `report_first` bit(1) DEFAULT b'1' COMMENT '是否是报检单的第一次质检 1:第一次  0：非第一次',
  `check_dept_id` bigint(20) DEFAULT NULL COMMENT '质检部门ID',
  `check_dept_name` varchar(255) DEFAULT NULL COMMENT '质检部门名称',
  `check_user_id` bigint(20) DEFAULT NULL COMMENT '质检员ID',
  `done_date` date DEFAULT NULL COMMENT '检验完成日期',
  `msg` varchar(255) DEFAULT NULL,
  `report_process` bit(1) DEFAULT b'1' COMMENT '是否还在质检中 1:进行中  0:已结束',
  `report_remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `supplier_name` varchar(255) DEFAULT NULL COMMENT '供应商名称',
  `inspect_report_status` smallint(6) DEFAULT '1' COMMENT '质检报告状态 1:未编辑 2:进行中可办理 3:质检完成 4:进行中不可办理',
  `last_done_date` date DEFAULT NULL COMMENT '当次质检单最后检验完成日期',
  `is_show` bit(1) DEFAULT b'1' COMMENT '是否显示 1显示 0不显示',
  `create_user_id` bigint(20) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_user_id` bigint(20) DEFAULT NULL COMMENT '更新人',
  `update_time` datetime DEFAULT NULL COMMENT '记录更新时间',
  `delete_flag` bit(1) NOT NULL DEFAULT b'0' COMMENT '记录删除标志 0：未删除 1：已删除',
  `delete_time` datetime DEFAULT NULL COMMENT '记录删除时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8 COMMENT='入库质检单表';

drop table if exists `instock`;
CREATE TABLE instock (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    inspect_report_id BIGINT NOT NULL COMMENT '质检报告ID',
    uid BIGINT NOT NULL COMMENT '仓库管理员ID',
    instock_date DATE COMMENT '入库时间',
    remarks VARCHAR(255) COMMENT '入库说明',
    instock_status SMALLINT DEFAULT 1 COMMENT '状态',
    inspect_apply_no VARCHAR(255) COMMENT '报检单号',
    contract_no VARCHAR(255) COMMENT '销售合同号',
    project_no VARCHAR(255) COMMENT '项目号',
    purch_no VARCHAR(255) COMMENT '采购合同号',
    supplier_name VARCHAR(255) COMMENT '供应商名称',
    `enter_erui_warehouse` bit DEFAULT 1 COMMENT '是否入易瑞仓（0：否  1：是）',
    submenu_id BIGINT COMMENT '入库分单人id',
    create_user_id bigint null comment '创建人',
    create_time datetime not null default now() comment '创建时间',
    update_user_id bigint null comment '更新人',
    update_time datetime null default null comment '记录更新时间',
    delete_flag bit not null default 0 comment '记录删除标志 0：未删除 1：已删除',
    delete_time datetime null comment '记录删除时间'
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT '入库信息表';


drop table if exists `instock_goods`;
CREATE TABLE instock_goods (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    instock_id BIGINT NOT NULL COMMENT '入库ID',
    inspect_apply_goods_id BIGINT NOT NULL COMMENT '质检单商品ID',
    instock_num INT COMMENT '入库数量',
    `instock_stock` varchar(255) DEFAULT NULL COMMENT '入库地/货物存放地',
    create_user_id bigint null comment '创建人',
    create_time datetime not null default now() comment '创建时间',
    update_user_id bigint null comment '更新人',
    update_time datetime null default null comment '记录更新时间',
    delete_flag bit not null default 0 comment '记录删除标志 0：未删除 1：已删除',
    delete_time datetime null comment '记录删除时间'
) ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT '入库-商品信息表';




drop table if exists `deliver_consign`;
CREATE TABLE deliver_consign (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    deliver_consign_no CHAR(14) NOT NULL COMMENT '出口通知单号',
    order_id BIGINT NOT NULL COMMENT '订单',
    co_id VARCHAR(255) COMMENT '报关主体',
    exec_co_name VARCHAR(255) COMMENT '发货申请部门',
    write_date DATE NOT NULL COMMENT '填表日期',
    booking_date DATE NOT NULL COMMENT '市场订舱要求时间',
    remarks VARCHAR(255) COMMENT '备注',
    deliver_consign_status SMALLINT COMMENT '状态',
    deliver_yn SMALLINT DEFAULT 1 COMMENT '是否已发货   ',
    advance_money DECIMAL(20 , 4 ) COMMENT '预收金额',
    this_shipments_money DECIMAL(20 , 4 ) COMMENT '本批次发货金额',
    currency_bn varchar(255) COMMENT '币种',
    invoice_rise VARCHAR(20) COMMENT '费用承担主体及发票抬头',
    business_nature SMALLINT COMMENT '业务项目性质',
    business_sketch VARCHAR(255) COMMENT '业务项目简述及中英货物名称',
    declare_customs_money DECIMAL(20 , 4 ) COMMENT '报关金额',
    trade_money DECIMAL(20 , 4 ) COMMENT '加工贸易金额',
    direct_transfer_money DECIMAL(20 , 4 ) COMMENT '直接转口金额',
    indirect_transfer_money DECIMAL(20 , 4 ) COMMENT '间接转口金额',
    clear_customs_money DECIMAL(20 , 4 ) COMMENT '清关金额',
    pay_method SMALLINT COMMENT '付款方式',
    shipping_batch VARCHAR(255) COMMENT '发运批次',
    more_batch_explain VARCHAR(255) COMMENT '多次发运需注明每批次金额及币种',
    is_dangerous SMALLINT COMMENT '是否为危险品',
    goods_deposit_place VARCHAR(255) COMMENT '货物存放地',
    has_insurance SMALLINT COMMENT '是否投出口信用保险',
    business_leader_id BIGINT COMMENT '事业部项目负责人Id',
    business_leader VARCHAR(255) COMMENT '事业部项目负责人',
    crm_code VARCHAR(255) COMMENT '客户代码',
    dept_name VARCHAR(255) COMMENT '发货申请部门名称',
    contract_no CHAR(15) COMMENT '销售合同号',
    booking_officer_id BIGINT COMMENT '订舱专员Id',
    operation_specialist_id BIGINT COMMENT '操作专员Id',
    deliver_notice_status SMALLINT DEFAULT 0 COMMENT '看货通知单状态,0:未创建 1：已保存看货通知单 2：已提交看货通知单',
    submit_time DATETIME COMMENT '订舱提交时间',
    create_user_id bigint null comment '创建人',
    create_time datetime not null default now() comment '创建时间',
    update_user_id bigint null comment '更新人',
    update_time datetime null default null comment '记录更新时间',
    delete_flag bit not null default 0 comment '记录删除标志 0：未删除 1：已删除',
    delete_time datetime null comment '记录删除时间'
) ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT '出口发货通知单表';


drop table if exists `deliver_consign_payment`;
CREATE TABLE deliver_consign_payment (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    deliver_consign_id BIGINT NOT NULL COMMENT '出口通知单id',
    payment_type SMALLINT COMMENT '收款类型',
    money DECIMAL(20 , 4 ) COMMENT '收款金额',
    receipt_time SMALLINT COMMENT '收款天数',
    create_user_id bigint null comment '创建人',
    create_time datetime not null default now() comment '创建时间',
    update_user_id bigint null comment '更新人',
    update_time datetime null default null comment '记录更新时间',
    delete_flag bit not null default 0 comment '记录删除标志 0：未删除 1：已删除',
    delete_time datetime null comment '记录删除时间'
) ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT '订舱预收款信息表';


drop table if exists `deliver_consign_goods`;
CREATE TABLE deliver_consign_goods (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    deliver_consign_id BIGINT NOT NULL COMMENT '出口通知单ID',
    order_goods_id BIGINT NOT NULL COMMENT '商品ID',
    send_num SMALLINT NOT NULL COMMENT '本次发货数量',
    create_user_id bigint null comment '创建人',
    create_time datetime not null default now() comment '创建时间',
    update_user_id bigint null comment '更新人',
    update_time datetime null default null comment '记录更新时间',
    delete_flag bit not null default 0 comment '记录删除标志 0：未删除 1：已删除',
    delete_time datetime null comment '记录删除时间'
) ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT '出口发货通知单商品表';



drop table if exists `deliver_consign_booking_space`;
CREATE TABLE `deliver_consign_booking_space` (
    `id` BIGINT PRIMARY KEY AUTO_INCREMENT,
    `deliver_consign_id` BIGINT DEFAULT NULL COMMENT '出口发货通知单ID',
    `ready_date` DATE DEFAULT NULL COMMENT '货物备好日期',
    `arrival_date` DATE DEFAULT NULL COMMENT '要求抵运日期',
    `order_emergency` INT(1) DEFAULT NULL COMMENT '订单紧急程度 1:一般（成本优先） 2:紧急 3:异常紧急（交期优先）',
    `penalty_provision` VARCHAR(255) DEFAULT NULL COMMENT '船舶要求以及合同是否有规定延期到货的罚金规定',
    `required_doc` VARCHAR(25) DEFAULT NULL COMMENT '所需单据，逗号分隔多个 1:提单 2:箱单 3:发票 4:原产地证',
    `bill_of_positive` INT(5) DEFAULT NULL COMMENT '提单-正',
    `bill_of_vice` INT(5) DEFAULT NULL COMMENT '提单-副',
    `box_list_positive` INT(5) DEFAULT NULL COMMENT '箱单-正',
    `box_list_vice` INT(5) DEFAULT NULL COMMENT '箱单-副',
    `invoice_positive` INT(5) DEFAULT NULL COMMENT '发票-正',
    `invoice_vice` INT(5) DEFAULT NULL COMMENT '发票-副',
    `primary_origin` INT(1) DEFAULT NULL COMMENT '原产地证 1:完全中国原产 2:含进口成分',
    `other_doc` VARCHAR(255) DEFAULT NULL COMMENT '其他单证',
    `specific_require` VARCHAR(255) DEFAULT NULL COMMENT '单证具体要求',
    `bill_of_lading` VARCHAR(5000) DEFAULT NULL COMMENT '提单货描（英文）',
    `shipping_marks` VARCHAR(255) DEFAULT NULL COMMENT '唛头',
    `package_require` VARCHAR(500) DEFAULT NULL COMMENT '包装、箱贴要求',
    `corporate_name` VARCHAR(255) DEFAULT NULL COMMENT '公司名称',
    `address` VARCHAR(255) DEFAULT NULL COMMENT '地址',
    `contacts` VARCHAR(255) DEFAULT NULL COMMENT '联系人',
    `contact_information` VARCHAR(255) DEFAULT NULL COMMENT '联系方式',
    `duty_paragraph` VARCHAR(30) DEFAULT NULL COMMENT '税号',
    `zip_code` VARCHAR(15) DEFAULT NULL COMMENT '邮编',
    create_user_id bigint null comment '创建人',
    create_time datetime not null default now() comment '创建时间',
    update_user_id bigint null comment '更新人',
    update_time datetime null default null comment '记录更新时间',
    delete_flag bit not null default 0 comment '记录删除标志 0：未删除 1：已删除',
    delete_time datetime null comment '记录删除时间'
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='出口发货通知单订舱信息';



drop table if exists `deliver_notice`;
CREATE TABLE `deliver_notice` (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    deliver_notice_no varchar(255) NOT NULL COMMENT '看货通知单号 自动生成',
    contract_no varchar(255) NOT NULL COMMENT '销售合同号',
    crm_code varchar(255) NOT NULL COMMENT '客户编码',
    deliver_consign_id BIGINT NOT NULL COMMENT '出口发货通知单ID',
    sender_id BIGINT NOT NULL COMMENT '下单人ID(创建人)',
    operation_specialist_id BIGINT NOT NULL COMMENT '单证操作(操作专员ID)',
    ware_houseman BIGINT COMMENT '仓库经办人ID',
    delivery_date VARCHAR(255) NOT NULL COMMENT '合同交货日期',
    exec_co_name VARCHAR(255) COMMENT '发货申请部门',
    send_date DATE COMMENT '下单日期',
    numbers INT COMMENT '产品件数',
    other_req VARCHAR(255) COMMENT '其他要求',
    package_req VARCHAR(255) COMMENT '包装要求',
    prepare_req VARCHAR(255) COMMENT '备货要求',
    deliver_notice_status SMALLINT DEFAULT 1 COMMENT '看货通知单状态',
    handle_status SMALLINT DEFAULT 1 COMMENT '看货状态',
    packing_time DATE COMMENT '仓库出具发运箱单日期',
    create_user_id bigint null comment '创建人',
    create_time datetime not null default now() comment '创建时间',
    update_user_id bigint null comment '更新人',
    update_time datetime null default null comment '记录更新时间',
    delete_flag bit not null default 0 comment '记录删除标志 0：未删除 1：已删除',
    delete_time datetime null comment '记录删除时间'
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='看货通知单表';




drop table if exists `deliver_detail`;
CREATE TABLE `deliver_detail` (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    deliver_detail_no VARCHAR(255) NOT NULL COMMENT '产品放行单号,自动生成',
    deliver_notice_id BIGINT NOT NULL COMMENT '看货通知单ID',
    contract_no VARCHAR(255) NOT NULL COMMENT '销售合同号',
    deliver_consign_no VARCHAR(255) NOT NULL COMMENT '出库通知单号',
    project_no VARCHAR(255) NOT NULL COMMENT '项目号',
    billing_date DATE COMMENT '开单日期',
    carrier_co VARCHAR(255) COMMENT '承运单位名称',
    driver VARCHAR(255) COMMENT '司机姓名',
    plate_no VARCHAR(255) COMMENT '车牌号码',
    pickup_date VARCHAR(255) COMMENT '提货日期',
    contact_tel VARCHAR(255) COMMENT '联系电话',
    handle_department VARCHAR(255) COMMENT '经办部门',
    ware_houseman BIGINT COMMENT '仓库经办人ID',
    ware_houseman_name VARCHAR(255) COMMENT '仓库经办人姓名',
    send_date DATE COMMENT '发运日期',
    sender_user_id BIGINT COMMENT '发运人员ID',
    reviewer_user_id BIGINT COMMENT '协办/复核人ID',
    goods_chk_status VARCHAR(255) COMMENT '实物检验结论',
    bills_chk_status VARCHAR(255) COMMENT '资料检验结论',
    check_user_id BIGINT COMMENT '检验工程师ID',
    check_dept VARCHAR(255) COMMENT '质检部门',
    check_date DATE COMMENT '检验日期',
    release_date DATE COMMENT '放行日期',
    release_user_id BIGINT COMMENT '最终放行人ID',
    quality_leader_user_id BIGINT COMMENT '质量分管领导',
    applicant_user_id BIGINT COMMENT '特殊放行申请人',
    applicant_date DATE COMMENT '特殊放行申请日期',
    approver_user_id BIGINT COMMENT '批准人ID',
    approval_date DATE COMMENT '批准日期',
    reason VARCHAR(255) COMMENT '特殊情况产品放行原因',
    opinion VARCHAR(255) COMMENT '审批意见',
    leave_date DATE COMMENT '出库时间',
    deliver_detail_status SMALLINT DEFAULT 1 COMMENT '出库到物流的状态',
    pack_total SMALLINT COMMENT '包装件数',
    out_check BIT DEFAULT 1 COMMENT '是否厂家直接发货 1：直发  0：否',
    create_user_id bigint null comment '创建人',
    create_time datetime not null default now() comment '创建时间',
    update_user_id bigint null comment '更新人',
    update_time datetime null default null comment '记录更新时间',
    delete_flag bit not null default 0 comment '记录删除标志 0：未删除 1：已删除',
    delete_time datetime null comment '记录删除时间'
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='物流-出库单详情表';


drop table if exists `deliver_detail_goods`;
CREATE TABLE deliver_detail_goods (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    deliver_detail_id BIGINT NOT NULL comment '出库单ID',
    deliver_consign_goods_id BIGINT NOT NULL COMMENT '订舱商品ID',
    outbound_num SMALLINT NOT NULL COMMENT '出库数量',
    straight_num SMALLINT NOT NULL COMMENT '厂家直发数量',
    detail_goods_remarks VARCHAR(255) NOT NULL COMMENT '备注',
    create_user_id bigint null comment '创建人',
    create_time datetime not null default now() comment '创建时间',
    update_user_id bigint null comment '更新人',
    update_time datetime null default null comment '记录更新时间',
    delete_flag bit not null default 0 comment '记录删除标志 0：未删除 1：已删除',
    delete_time datetime null comment '记录删除时间'
) ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT '出库商品详情';


drop table if exists `logistics_data`;
CREATE TABLE `logistics_data` (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    the_awb_no CHAR(8) COMMENT '运单号',
    contract_no CHAR(15) COMMENT '销售合同号',
    deliver_detail_no CHAR(8) COMMENT '产品放行单号',
    release_date DATE COMMENT '放行日期',
    logistics_user_id BIGINT COMMENT '物流经办人id',
    logistics_date DATE COMMENT '物流经办时间',
    booking_time DATE COMMENT '订舱时间',
    logi_invoice_no VARCHAR(255) COMMENT '物流发票号',
    packing_time DATE COMMENT '通知市场箱单时间',
    leave_factory DATE COMMENT '离厂时间',
    sailing_date DATE COMMENT '船期或航班',
    customs_clearance DATE COMMENT '报关放行时间',
    leave_port_time DATE COMMENT '实际离港时间',
    arrival_port_time DATE COMMENT '预计抵达时间',
    accomplish_date DATE COMMENT '实际完成时间',
    logistics_logs VARCHAR(255) COMMENT '动态描述',
    remarks VARCHAR(255) COMMENT '备注',
    logistics_data_status SMALLINT DEFAULT 5 COMMENT '物流的状态',
    submenu_id SMALLINT COMMENT '出库信息分单人id',
    logistics_price_usd DECIMAL(20 , 4 ) COMMENT '物流发运金额(美元)',
    logistics_cost DECIMAL(20 , 4 ) COMMENT '物流费用',
    logistics_cost_type CHAR(3) COMMENT '物流费用币种',
    create_user_id bigint null comment '创建人',
    create_time datetime not null default now() comment '创建时间',
    update_user_id bigint null comment '更新人',
    update_time datetime null default null comment '记录更新时间',
    delete_flag bit not null default 0 comment '记录删除标志 0：未删除 1：已删除',
    delete_time datetime null comment '记录删除时间'
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='物流信息表';

drop table if exists `logistics_data_info`;
CREATE TABLE `logistics_data_info` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `logistics_data_id` bigint DEFAULT NULL COMMENT '物流动态ID',
    `dynamic_description` SMALLINT DEFAULT NULL COMMENT '动态描述 1:离开起运港 2:到达中转港 3:到达目的港 4:到达目的地 5:其他',
    `port_name` VARCHAR(50) DEFAULT NULL COMMENT '港口名称（英文）',
    `port_name_zh` VARCHAR(50) DEFAULT NULL COMMENT '港口名称(中文)',
    `leave_port_date` DATETIME DEFAULT NULL COMMENT '离港/到港日期',
    `logistics_data_info_status` SMALLINT DEFAULT 0 COMMENT '状态 1：保存/草稿 2:已提交',
    create_user_id BIGINT NULL COMMENT '创建人',
    create_time DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
    update_user_id BIGINT NULL COMMENT '更新人',
    update_time DATETIME NULL DEFAULT NULL COMMENT '记录更新时间',
    delete_flag BIT NOT NULL DEFAULT 0 COMMENT '记录删除标志 0：未删除 1：已删除',
    delete_time DATETIME NULL COMMENT '记录删除时间',
    PRIMARY KEY (`id`)
)  ENGINE=INNODB AUTO_INCREMENT=61 DEFAULT CHARSET=UTF8 COMMENT='物流动态信息列表';

drop table if exists `order_account`;
CREATE TABLE order_account (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    order_id BIGINT NOT NULL COMMENT '订单ID',
    account_type SMALLINT NOT NULL DEFAULT 1  COMMENT '1:收款 2：付款',
    acc_desc VARCHAR(255) COMMENT '描述',
    money DECIMAL(20 , 4 ) NULL COMMENT '收款金额',
    discount DECIMAL(20 , 4 ) COMMENT '其他扣款金额',
    payment_date DATE NULL COMMENT '回款时间',
    `goods_price` DECIMAL(15 , 2 ) DEFAULT NULL COMMENT '发货金额',
    `deliver_date` DATE DEFAULT NULL COMMENT '发货时间',
    create_user_id BIGINT NULL COMMENT '创建人',
    create_time DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
    update_user_id BIGINT NULL COMMENT '更新人',
    update_time DATETIME NULL DEFAULT NULL COMMENT '记录更新时间',
    delete_flag BIT NOT NULL DEFAULT 0 COMMENT '记录删除标志 0：未删除 1：已删除',
    delete_time DATETIME NULL COMMENT '记录删除时间'
)  ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT '订单收付款表';


drop table if exists `purch_pay_application`;
CREATE TABLE `purch_pay_application` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `pay_no` VARCHAR(32) DEFAULT NULL COMMENT '付款单号',
    `purch_id` BIGINT NOT NULL COMMENT '采购订单id',
    `purch_contract_no` VARCHAR(32) DEFAULT NULL COMMENT '采购合同号',
    `pay_status` SMALLINT DEFAULT '1' COMMENT '状态 1:待确认 2:已执行 3:已完成 ',
    `applicant_id` BIGINT DEFAULT NULL COMMENT '申请人',
    `applicant_dept_id` VARCHAR(32) DEFAULT NULL COMMENT '申请人部门id',
    `applicant_dept_name` VARCHAR(32) DEFAULT NULL COMMENT '申请人部门id',
    `applicant_date` DATE DEFAULT NULL COMMENT '申请日期',
    `supplier_id` BIGINT DEFAULT NULL COMMENT '供应商ID',
    `supplier_name` VARCHAR(100) DEFAULT NULL COMMENT '供应商名称',
    `opening_bank` VARCHAR(100) DEFAULT NULL COMMENT '开户行',
    `account_num` VARCHAR(100) DEFAULT NULL COMMENT '开户账号',
    `project_comment` VARCHAR(100) DEFAULT NULL COMMENT '项目内容',
    `currency_bn` VARCHAR(32) DEFAULT '人民币' COMMENT '货币类型（币种）',
    `exchange_rate` DECIMAL(20 , 4 ) DEFAULT NULL COMMENT '汇率',
    `contract_amount` DECIMAL(20 , 2 ) DEFAULT NULL COMMENT '采购合同金额',
    `applicant_amount` DECIMAL(20 , 2 ) DEFAULT NULL COMMENT '申请金额',
    `handling_fee` DECIMAL(20 , 2 ) DEFAULT NULL COMMENT '手续费',
    `payer_id` BIGINT DEFAULT NULL COMMENT '付款人id',
    `payer_name` VARCHAR(32) DEFAULT NULL COMMENT '付款人姓名',
    `pay_date` DATE DEFAULT NULL COMMENT '付款日期',
    `pay_mode` VARCHAR(200) DEFAULT NULL COMMENT '付款方式',
    `remark` TEXT COMMENT '备注',
    create_user_id BIGINT NULL COMMENT '创建人',
    create_time DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
    update_user_id BIGINT NULL COMMENT '更新人',
    update_time DATETIME NULL DEFAULT NULL COMMENT '记录更新时间',
    delete_flag BIT NOT NULL DEFAULT 0 COMMENT '记录删除标志 0：未删除 1：已删除',
    delete_time DATETIME NULL COMMENT '记录删除时间',
    PRIMARY KEY (`id`) USING BTREE
)  ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8 ROW_FORMAT=COMPACT COMMENT='采购付款申请管理';


CREATE TABLE `supplier` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `lang` varchar(6) NOT NULL DEFAULT 'en' COMMENT '注册语言',
  `serial_no` varchar(20) DEFAULT NULL COMMENT '流水号',
  `supplier_no` varchar(20) DEFAULT NULL COMMENT '供应商编号',
  `supplier_type` varchar(20) DEFAULT 'MANUFACTURER' COMMENT '类型',
  `name` varchar(100) DEFAULT NULL COMMENT '名称',
  `name_en` varchar(100) DEFAULT NULL COMMENT '公司名称(英文) ',
  `bn` varchar(100) DEFAULT NULL COMMENT '简称',
  `name_en_bn` varchar(100) DEFAULT NULL COMMENT '英文简称',
  `profile` varchar(500) DEFAULT NULL COMMENT '简介',
  `country_code` varchar(4) DEFAULT NULL COMMENT '国家代码',
  `country_bn` varchar(32) DEFAULT NULL COMMENT '所在国简称',
  `province` varchar(30) DEFAULT NULL COMMENT '州/省/市',
  `city` varchar(30) DEFAULT NULL COMMENT '市',
  `address` varchar(255) DEFAULT NULL COMMENT '公司地址 ',
  `official_email` varchar(50) DEFAULT NULL COMMENT '企业邮箱',
  `official_phone` varchar(40) DEFAULT NULL COMMENT '企业电话',
  `official_fax` varchar(40) DEFAULT NULL COMMENT '企业传真',
  `first_name` varchar(30) DEFAULT NULL COMMENT '申请人姓',
  `last_name` varchar(30) DEFAULT NULL COMMENT '申请人名',
  `reg_capital` varchar(20) DEFAULT NULL COMMENT '注册资本',
  `reg_capital_cur_bn` varchar(10) DEFAULT NULL,
  `employee_count` bigint(20) DEFAULT NULL COMMENT '员工人数',
  `social_credit_code` varchar(32) DEFAULT NULL COMMENT '社会信用代码',
  `social_credit_expire_time` datetime DEFAULT NULL COMMENT '统一社会信用代码有效期',
  `social_credit_no_expire` varchar(1) DEFAULT 'N' COMMENT '统一社会信用代码是否长期有效 N否 Y是',
  `legal_representative` varchar(100) DEFAULT NULL COMMENT '法定代表人',
  `legal_representative_code` varchar(100) DEFAULT NULL COMMENT '法定代表人证件号',
  `legal_representative_type` varchar(100) DEFAULT NULL COMMENT '法定代表人证件类型 IDENTITY_CARD身份证 PASSPORT护照 PERMIT 台湾（港澳）居民来往大陆通行证 OTHER其他',
  `legal_representative_expire_time` datetime DEFAULT NULL COMMENT '法定代表人证件有效期',
  `legal_representative_no_expire` varchar(1) DEFAULT 'N' COMMENT '法定代表人证件是否长期有效 N否 Y是',
  `industry_classification` varchar(100) DEFAULT NULL COMMENT '行业分类',
  `scope_of_operation` varchar(255) DEFAULT NULL COMMENT '经营范围',
  `brand` longtext COMMENT '品牌',
  `official_website` varchar(255) DEFAULT NULL COMMENT '官网',
  `logo` varchar(255) DEFAULT NULL COMMENT 'LOGO',
  `sec_ex_listed_on` varchar(30) DEFAULT NULL COMMENT '上市地',
  `line_of_credit` decimal(20,4) DEFAULT NULL COMMENT '授信额度',
  `credit_available` decimal(20,4) DEFAULT NULL COMMENT '可用额度',
  `credit_cur_bn` varchar(6) DEFAULT NULL COMMENT '额度单位',
  `supplier_level` varchar(10) DEFAULT NULL COMMENT '供应商等级',
  `credit_level` varchar(10) DEFAULT NULL COMMENT '信用等级',
  `finance_level` varchar(10) DEFAULT NULL COMMENT '金融服务等级',
  `logi_level` varchar(10) DEFAULT NULL COMMENT '物流服务等级',
  `qa_level` varchar(10) DEFAULT NULL COMMENT '品质保障等级',
  `steward_level` varchar(10) DEFAULT NULL COMMENT '管家服务等级',
  `process_id` varchar(100) DEFAULT NULL COMMENT '工作流ID',
  `task_id` int(11) DEFAULT NULL COMMENT '工作流（暂空）',
  `recommend_flag` char(1) DEFAULT 'N' COMMENT '推荐',
  `status` varchar(20) DEFAULT NULL COMMENT '状态DRAFT: 临时供应商  REVIEW 待审核 APPROVING 审核中  APPROVED 通过  INVALID 驳回',
  `qs_flag` char(1) DEFAULT 'N' COMMENT '是否潜在转合格\r\nN:否\r\nY:是\r\n注:审核通过后需把该字段置为N',
  `inquiry_id` bigint(20) DEFAULT NULL COMMENT '询单ID',
  `erui_status` varchar(20) DEFAULT NULL COMMENT '易瑞审核状态 CHECKING 待审核 VALID 审核通过',
  `expire_status` varchar(1) DEFAULT 'N' COMMENT '过期状态  Y-已过期；N-未过期',
  `is_erui` char(1) NOT NULL DEFAULT 'N' COMMENT 'N 不符合易瑞 Y 符合易瑞 ',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `apply_at` datetime DEFAULT NULL COMMENT '申请时间',
  `created_by` bigint(20) DEFAULT NULL COMMENT '创建人',
  `created_at` datetime NOT NULL COMMENT '创建时间',
  `checked_by` bigint(20) DEFAULT NULL COMMENT '审核人',
  `checked_at` datetime DEFAULT NULL COMMENT '审核时间',
  `erui_checked_at` datetime DEFAULT NULL COMMENT '易瑞审核时间 ',
  `erui_checked_by` bigint(20) DEFAULT NULL COMMENT '易瑞审核人 ',
  `deleted_flag` char(1) DEFAULT 'N',
  `org_id` bigint(20) DEFAULT NULL COMMENT '所属事业部ID',
  `source` varchar(10) DEFAULT 'BOSS' COMMENT '来源：BOSS-后台录入；APP-手机端录入；Portal-门户录入',
  `updated_by` bigint(20) DEFAULT NULL COMMENT '更新人',
  `updated_at` datetime DEFAULT NULL COMMENT '更新时间',
  `is_relation` varchar(1) DEFAULT 'N' COMMENT '是否关联供应商 N否 Y是',
  `source_key` varchar(10) DEFAULT '0' COMMENT '门户: 1 - 机电协会',
  `customer_type` tinyint(5) DEFAULT NULL COMMENT '企业类型  1合格 2潜在',
  `tenant` varchar(255) NOT NULL DEFAULT 'erui' COMMENT '租户，默认“erui”',
  `process_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT 'ETL处理时间',
  PRIMARY KEY (`id`),
  KEY `supplier_serial_no` (`serial_no`),
  KEY `supplier_status` (`status`),
  KEY `supplier_checked_by` (`checked_by`),
  KEY `supplier_created_at` (`created_at`),
  KEY `supplier_org_id` (`org_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5467 DEFAULT CHARSET=utf8 COMMENT='供应商信息';

-----------------------------------------------------------------------------------------------
-----------------------------------------------------------------------------------------------
-----------------------------------------------------------------------------------------------





