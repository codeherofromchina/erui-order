package com.erui.order.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurchRequisitionGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchRequisitionGoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionIdIsNull() {
            addCriterion("purch_requisition_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionIdIsNotNull() {
            addCriterion("purch_requisition_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionIdEqualTo(Long value) {
            addCriterion("purch_requisition_id =", value, "purchRequisitionId");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionIdNotEqualTo(Long value) {
            addCriterion("purch_requisition_id <>", value, "purchRequisitionId");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionIdGreaterThan(Long value) {
            addCriterion("purch_requisition_id >", value, "purchRequisitionId");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("purch_requisition_id >=", value, "purchRequisitionId");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionIdLessThan(Long value) {
            addCriterion("purch_requisition_id <", value, "purchRequisitionId");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionIdLessThanOrEqualTo(Long value) {
            addCriterion("purch_requisition_id <=", value, "purchRequisitionId");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionIdIn(List<Long> values) {
            addCriterion("purch_requisition_id in", values, "purchRequisitionId");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionIdNotIn(List<Long> values) {
            addCriterion("purch_requisition_id not in", values, "purchRequisitionId");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionIdBetween(Long value1, Long value2) {
            addCriterion("purch_requisition_id between", value1, value2, "purchRequisitionId");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionIdNotBetween(Long value1, Long value2) {
            addCriterion("purch_requisition_id not between", value1, value2, "purchRequisitionId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdIsNull() {
            addCriterion("order_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdIsNotNull() {
            addCriterion("order_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdEqualTo(Long value) {
            addCriterion("order_goods_id =", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdNotEqualTo(Long value) {
            addCriterion("order_goods_id <>", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdGreaterThan(Long value) {
            addCriterion("order_goods_id >", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_goods_id >=", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdLessThan(Long value) {
            addCriterion("order_goods_id <", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("order_goods_id <=", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdIn(List<Long> values) {
            addCriterion("order_goods_id in", values, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdNotIn(List<Long> values) {
            addCriterion("order_goods_id not in", values, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdBetween(Long value1, Long value2) {
            addCriterion("order_goods_id between", value1, value2, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("order_goods_id not between", value1, value2, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andRequirePurchaseDateIsNull() {
            addCriterion("require_purchase_date is null");
            return (Criteria) this;
        }

        public Criteria andRequirePurchaseDateIsNotNull() {
            addCriterion("require_purchase_date is not null");
            return (Criteria) this;
        }

        public Criteria andRequirePurchaseDateEqualTo(Date value) {
            addCriterionForJDBCDate("require_purchase_date =", value, "requirePurchaseDate");
            return (Criteria) this;
        }

        public Criteria andRequirePurchaseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("require_purchase_date <>", value, "requirePurchaseDate");
            return (Criteria) this;
        }

        public Criteria andRequirePurchaseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("require_purchase_date >", value, "requirePurchaseDate");
            return (Criteria) this;
        }

        public Criteria andRequirePurchaseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("require_purchase_date >=", value, "requirePurchaseDate");
            return (Criteria) this;
        }

        public Criteria andRequirePurchaseDateLessThan(Date value) {
            addCriterionForJDBCDate("require_purchase_date <", value, "requirePurchaseDate");
            return (Criteria) this;
        }

        public Criteria andRequirePurchaseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("require_purchase_date <=", value, "requirePurchaseDate");
            return (Criteria) this;
        }

        public Criteria andRequirePurchaseDateIn(List<Date> values) {
            addCriterionForJDBCDate("require_purchase_date in", values, "requirePurchaseDate");
            return (Criteria) this;
        }

        public Criteria andRequirePurchaseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("require_purchase_date not in", values, "requirePurchaseDate");
            return (Criteria) this;
        }

        public Criteria andRequirePurchaseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("require_purchase_date between", value1, value2, "requirePurchaseDate");
            return (Criteria) this;
        }

        public Criteria andRequirePurchaseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("require_purchase_date not between", value1, value2, "requirePurchaseDate");
            return (Criteria) this;
        }

        public Criteria andTechRequireIsNull() {
            addCriterion("tech_require is null");
            return (Criteria) this;
        }

        public Criteria andTechRequireIsNotNull() {
            addCriterion("tech_require is not null");
            return (Criteria) this;
        }

        public Criteria andTechRequireEqualTo(String value) {
            addCriterion("tech_require =", value, "techRequire");
            return (Criteria) this;
        }

        public Criteria andTechRequireNotEqualTo(String value) {
            addCriterion("tech_require <>", value, "techRequire");
            return (Criteria) this;
        }

        public Criteria andTechRequireGreaterThan(String value) {
            addCriterion("tech_require >", value, "techRequire");
            return (Criteria) this;
        }

        public Criteria andTechRequireGreaterThanOrEqualTo(String value) {
            addCriterion("tech_require >=", value, "techRequire");
            return (Criteria) this;
        }

        public Criteria andTechRequireLessThan(String value) {
            addCriterion("tech_require <", value, "techRequire");
            return (Criteria) this;
        }

        public Criteria andTechRequireLessThanOrEqualTo(String value) {
            addCriterion("tech_require <=", value, "techRequire");
            return (Criteria) this;
        }

        public Criteria andTechRequireLike(String value) {
            addCriterion("tech_require like", value, "techRequire");
            return (Criteria) this;
        }

        public Criteria andTechRequireNotLike(String value) {
            addCriterion("tech_require not like", value, "techRequire");
            return (Criteria) this;
        }

        public Criteria andTechRequireIn(List<String> values) {
            addCriterion("tech_require in", values, "techRequire");
            return (Criteria) this;
        }

        public Criteria andTechRequireNotIn(List<String> values) {
            addCriterion("tech_require not in", values, "techRequire");
            return (Criteria) this;
        }

        public Criteria andTechRequireBetween(String value1, String value2) {
            addCriterion("tech_require between", value1, value2, "techRequire");
            return (Criteria) this;
        }

        public Criteria andTechRequireNotBetween(String value1, String value2) {
            addCriterion("tech_require not between", value1, value2, "techRequire");
            return (Criteria) this;
        }

        public Criteria andCheckTypeIsNull() {
            addCriterion("check_type is null");
            return (Criteria) this;
        }

        public Criteria andCheckTypeIsNotNull() {
            addCriterion("check_type is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTypeEqualTo(String value) {
            addCriterion("check_type =", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotEqualTo(String value) {
            addCriterion("check_type <>", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeGreaterThan(String value) {
            addCriterion("check_type >", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeGreaterThanOrEqualTo(String value) {
            addCriterion("check_type >=", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeLessThan(String value) {
            addCriterion("check_type <", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeLessThanOrEqualTo(String value) {
            addCriterion("check_type <=", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeLike(String value) {
            addCriterion("check_type like", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotLike(String value) {
            addCriterion("check_type not like", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeIn(List<String> values) {
            addCriterion("check_type in", values, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotIn(List<String> values) {
            addCriterion("check_type not in", values, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeBetween(String value1, String value2) {
            addCriterion("check_type between", value1, value2, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotBetween(String value1, String value2) {
            addCriterion("check_type not between", value1, value2, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckMethodIsNull() {
            addCriterion("check_method is null");
            return (Criteria) this;
        }

        public Criteria andCheckMethodIsNotNull() {
            addCriterion("check_method is not null");
            return (Criteria) this;
        }

        public Criteria andCheckMethodEqualTo(String value) {
            addCriterion("check_method =", value, "checkMethod");
            return (Criteria) this;
        }

        public Criteria andCheckMethodNotEqualTo(String value) {
            addCriterion("check_method <>", value, "checkMethod");
            return (Criteria) this;
        }

        public Criteria andCheckMethodGreaterThan(String value) {
            addCriterion("check_method >", value, "checkMethod");
            return (Criteria) this;
        }

        public Criteria andCheckMethodGreaterThanOrEqualTo(String value) {
            addCriterion("check_method >=", value, "checkMethod");
            return (Criteria) this;
        }

        public Criteria andCheckMethodLessThan(String value) {
            addCriterion("check_method <", value, "checkMethod");
            return (Criteria) this;
        }

        public Criteria andCheckMethodLessThanOrEqualTo(String value) {
            addCriterion("check_method <=", value, "checkMethod");
            return (Criteria) this;
        }

        public Criteria andCheckMethodLike(String value) {
            addCriterion("check_method like", value, "checkMethod");
            return (Criteria) this;
        }

        public Criteria andCheckMethodNotLike(String value) {
            addCriterion("check_method not like", value, "checkMethod");
            return (Criteria) this;
        }

        public Criteria andCheckMethodIn(List<String> values) {
            addCriterion("check_method in", values, "checkMethod");
            return (Criteria) this;
        }

        public Criteria andCheckMethodNotIn(List<String> values) {
            addCriterion("check_method not in", values, "checkMethod");
            return (Criteria) this;
        }

        public Criteria andCheckMethodBetween(String value1, String value2) {
            addCriterion("check_method between", value1, value2, "checkMethod");
            return (Criteria) this;
        }

        public Criteria andCheckMethodNotBetween(String value1, String value2) {
            addCriterion("check_method not between", value1, value2, "checkMethod");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNull() {
            addCriterion("certificate is null");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNotNull() {
            addCriterion("certificate is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateEqualTo(String value) {
            addCriterion("certificate =", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotEqualTo(String value) {
            addCriterion("certificate <>", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThan(String value) {
            addCriterion("certificate >", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("certificate >=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThan(String value) {
            addCriterion("certificate <", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThanOrEqualTo(String value) {
            addCriterion("certificate <=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLike(String value) {
            addCriterion("certificate like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotLike(String value) {
            addCriterion("certificate not like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateIn(List<String> values) {
            addCriterion("certificate in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotIn(List<String> values) {
            addCriterion("certificate not in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateBetween(String value1, String value2) {
            addCriterion("certificate between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotBetween(String value1, String value2) {
            addCriterion("certificate not between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andTechAuditIsNull() {
            addCriterion("tech_audit is null");
            return (Criteria) this;
        }

        public Criteria andTechAuditIsNotNull() {
            addCriterion("tech_audit is not null");
            return (Criteria) this;
        }

        public Criteria andTechAuditEqualTo(String value) {
            addCriterion("tech_audit =", value, "techAudit");
            return (Criteria) this;
        }

        public Criteria andTechAuditNotEqualTo(String value) {
            addCriterion("tech_audit <>", value, "techAudit");
            return (Criteria) this;
        }

        public Criteria andTechAuditGreaterThan(String value) {
            addCriterion("tech_audit >", value, "techAudit");
            return (Criteria) this;
        }

        public Criteria andTechAuditGreaterThanOrEqualTo(String value) {
            addCriterion("tech_audit >=", value, "techAudit");
            return (Criteria) this;
        }

        public Criteria andTechAuditLessThan(String value) {
            addCriterion("tech_audit <", value, "techAudit");
            return (Criteria) this;
        }

        public Criteria andTechAuditLessThanOrEqualTo(String value) {
            addCriterion("tech_audit <=", value, "techAudit");
            return (Criteria) this;
        }

        public Criteria andTechAuditLike(String value) {
            addCriterion("tech_audit like", value, "techAudit");
            return (Criteria) this;
        }

        public Criteria andTechAuditNotLike(String value) {
            addCriterion("tech_audit not like", value, "techAudit");
            return (Criteria) this;
        }

        public Criteria andTechAuditIn(List<String> values) {
            addCriterion("tech_audit in", values, "techAudit");
            return (Criteria) this;
        }

        public Criteria andTechAuditNotIn(List<String> values) {
            addCriterion("tech_audit not in", values, "techAudit");
            return (Criteria) this;
        }

        public Criteria andTechAuditBetween(String value1, String value2) {
            addCriterion("tech_audit between", value1, value2, "techAudit");
            return (Criteria) this;
        }

        public Criteria andTechAuditNotBetween(String value1, String value2) {
            addCriterion("tech_audit not between", value1, value2, "techAudit");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Long value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Long value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Long value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Long value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Long> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Long> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Long value1, Long value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNull() {
            addCriterion("update_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNotNull() {
            addCriterion("update_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdEqualTo(Long value) {
            addCriterion("update_user_id =", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotEqualTo(Long value) {
            addCriterion("update_user_id <>", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThan(Long value) {
            addCriterion("update_user_id >", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("update_user_id >=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThan(Long value) {
            addCriterion("update_user_id <", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("update_user_id <=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIn(List<Long> values) {
            addCriterion("update_user_id in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotIn(List<Long> values) {
            addCriterion("update_user_id not in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdBetween(Long value1, Long value2) {
            addCriterion("update_user_id between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("update_user_id not between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Boolean value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Boolean value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Boolean value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Boolean value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Boolean> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Boolean> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("delete_time is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(Date value) {
            addCriterion("delete_time =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(Date value) {
            addCriterion("delete_time <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(Date value) {
            addCriterion("delete_time >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delete_time >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(Date value) {
            addCriterion("delete_time <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("delete_time <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<Date> values) {
            addCriterion("delete_time in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<Date> values) {
            addCriterion("delete_time not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(Date value1, Date value2) {
            addCriterion("delete_time between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("delete_time not between", value1, value2, "deleteTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}