package com.erui.order.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurchRequisitionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchRequisitionExample() {
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

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Long value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Long value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Long value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Long value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Long value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Long> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Long> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Long value1, Long value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Long value1, Long value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andPmUidIsNull() {
            addCriterion("pm_uid is null");
            return (Criteria) this;
        }

        public Criteria andPmUidIsNotNull() {
            addCriterion("pm_uid is not null");
            return (Criteria) this;
        }

        public Criteria andPmUidEqualTo(Long value) {
            addCriterion("pm_uid =", value, "pmUid");
            return (Criteria) this;
        }

        public Criteria andPmUidNotEqualTo(Long value) {
            addCriterion("pm_uid <>", value, "pmUid");
            return (Criteria) this;
        }

        public Criteria andPmUidGreaterThan(Long value) {
            addCriterion("pm_uid >", value, "pmUid");
            return (Criteria) this;
        }

        public Criteria andPmUidGreaterThanOrEqualTo(Long value) {
            addCriterion("pm_uid >=", value, "pmUid");
            return (Criteria) this;
        }

        public Criteria andPmUidLessThan(Long value) {
            addCriterion("pm_uid <", value, "pmUid");
            return (Criteria) this;
        }

        public Criteria andPmUidLessThanOrEqualTo(Long value) {
            addCriterion("pm_uid <=", value, "pmUid");
            return (Criteria) this;
        }

        public Criteria andPmUidIn(List<Long> values) {
            addCriterion("pm_uid in", values, "pmUid");
            return (Criteria) this;
        }

        public Criteria andPmUidNotIn(List<Long> values) {
            addCriterion("pm_uid not in", values, "pmUid");
            return (Criteria) this;
        }

        public Criteria andPmUidBetween(Long value1, Long value2) {
            addCriterion("pm_uid between", value1, value2, "pmUid");
            return (Criteria) this;
        }

        public Criteria andPmUidNotBetween(Long value1, Long value2) {
            addCriterion("pm_uid not between", value1, value2, "pmUid");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(Long value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(Long value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(Long value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(Long value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(Long value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(Long value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<Long> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<Long> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(Long value1, Long value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(Long value1, Long value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIsNull() {
            addCriterion("submit_date is null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIsNotNull() {
            addCriterion("submit_date is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateEqualTo(Date value) {
            addCriterionForJDBCDate("submit_date =", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("submit_date <>", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThan(Date value) {
            addCriterionForJDBCDate("submit_date >", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("submit_date >=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThan(Date value) {
            addCriterionForJDBCDate("submit_date <", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("submit_date <=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIn(List<Date> values) {
            addCriterionForJDBCDate("submit_date in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("submit_date not in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("submit_date between", value1, value2, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("submit_date not between", value1, value2, "submitDate");
            return (Criteria) this;
        }

        public Criteria andTradeMethodIsNull() {
            addCriterion("trade_method is null");
            return (Criteria) this;
        }

        public Criteria andTradeMethodIsNotNull() {
            addCriterion("trade_method is not null");
            return (Criteria) this;
        }

        public Criteria andTradeMethodEqualTo(Short value) {
            addCriterion("trade_method =", value, "tradeMethod");
            return (Criteria) this;
        }

        public Criteria andTradeMethodNotEqualTo(Short value) {
            addCriterion("trade_method <>", value, "tradeMethod");
            return (Criteria) this;
        }

        public Criteria andTradeMethodGreaterThan(Short value) {
            addCriterion("trade_method >", value, "tradeMethod");
            return (Criteria) this;
        }

        public Criteria andTradeMethodGreaterThanOrEqualTo(Short value) {
            addCriterion("trade_method >=", value, "tradeMethod");
            return (Criteria) this;
        }

        public Criteria andTradeMethodLessThan(Short value) {
            addCriterion("trade_method <", value, "tradeMethod");
            return (Criteria) this;
        }

        public Criteria andTradeMethodLessThanOrEqualTo(Short value) {
            addCriterion("trade_method <=", value, "tradeMethod");
            return (Criteria) this;
        }

        public Criteria andTradeMethodIn(List<Short> values) {
            addCriterion("trade_method in", values, "tradeMethod");
            return (Criteria) this;
        }

        public Criteria andTradeMethodNotIn(List<Short> values) {
            addCriterion("trade_method not in", values, "tradeMethod");
            return (Criteria) this;
        }

        public Criteria andTradeMethodBetween(Short value1, Short value2) {
            addCriterion("trade_method between", value1, value2, "tradeMethod");
            return (Criteria) this;
        }

        public Criteria andTradeMethodNotBetween(Short value1, Short value2) {
            addCriterion("trade_method not between", value1, value2, "tradeMethod");
            return (Criteria) this;
        }

        public Criteria andTransModeBnIsNull() {
            addCriterion("trans_mode_bn is null");
            return (Criteria) this;
        }

        public Criteria andTransModeBnIsNotNull() {
            addCriterion("trans_mode_bn is not null");
            return (Criteria) this;
        }

        public Criteria andTransModeBnEqualTo(String value) {
            addCriterion("trans_mode_bn =", value, "transModeBn");
            return (Criteria) this;
        }

        public Criteria andTransModeBnNotEqualTo(String value) {
            addCriterion("trans_mode_bn <>", value, "transModeBn");
            return (Criteria) this;
        }

        public Criteria andTransModeBnGreaterThan(String value) {
            addCriterion("trans_mode_bn >", value, "transModeBn");
            return (Criteria) this;
        }

        public Criteria andTransModeBnGreaterThanOrEqualTo(String value) {
            addCriterion("trans_mode_bn >=", value, "transModeBn");
            return (Criteria) this;
        }

        public Criteria andTransModeBnLessThan(String value) {
            addCriterion("trans_mode_bn <", value, "transModeBn");
            return (Criteria) this;
        }

        public Criteria andTransModeBnLessThanOrEqualTo(String value) {
            addCriterion("trans_mode_bn <=", value, "transModeBn");
            return (Criteria) this;
        }

        public Criteria andTransModeBnLike(String value) {
            addCriterion("trans_mode_bn like", value, "transModeBn");
            return (Criteria) this;
        }

        public Criteria andTransModeBnNotLike(String value) {
            addCriterion("trans_mode_bn not like", value, "transModeBn");
            return (Criteria) this;
        }

        public Criteria andTransModeBnIn(List<String> values) {
            addCriterion("trans_mode_bn in", values, "transModeBn");
            return (Criteria) this;
        }

        public Criteria andTransModeBnNotIn(List<String> values) {
            addCriterion("trans_mode_bn not in", values, "transModeBn");
            return (Criteria) this;
        }

        public Criteria andTransModeBnBetween(String value1, String value2) {
            addCriterion("trans_mode_bn between", value1, value2, "transModeBn");
            return (Criteria) this;
        }

        public Criteria andTransModeBnNotBetween(String value1, String value2) {
            addCriterion("trans_mode_bn not between", value1, value2, "transModeBn");
            return (Criteria) this;
        }

        public Criteria andFactorySendIsNull() {
            addCriterion("factory_send is null");
            return (Criteria) this;
        }

        public Criteria andFactorySendIsNotNull() {
            addCriterion("factory_send is not null");
            return (Criteria) this;
        }

        public Criteria andFactorySendEqualTo(Short value) {
            addCriterion("factory_send =", value, "factorySend");
            return (Criteria) this;
        }

        public Criteria andFactorySendNotEqualTo(Short value) {
            addCriterion("factory_send <>", value, "factorySend");
            return (Criteria) this;
        }

        public Criteria andFactorySendGreaterThan(Short value) {
            addCriterion("factory_send >", value, "factorySend");
            return (Criteria) this;
        }

        public Criteria andFactorySendGreaterThanOrEqualTo(Short value) {
            addCriterion("factory_send >=", value, "factorySend");
            return (Criteria) this;
        }

        public Criteria andFactorySendLessThan(Short value) {
            addCriterion("factory_send <", value, "factorySend");
            return (Criteria) this;
        }

        public Criteria andFactorySendLessThanOrEqualTo(Short value) {
            addCriterion("factory_send <=", value, "factorySend");
            return (Criteria) this;
        }

        public Criteria andFactorySendIn(List<Short> values) {
            addCriterion("factory_send in", values, "factorySend");
            return (Criteria) this;
        }

        public Criteria andFactorySendNotIn(List<Short> values) {
            addCriterion("factory_send not in", values, "factorySend");
            return (Criteria) this;
        }

        public Criteria andFactorySendBetween(Short value1, Short value2) {
            addCriterion("factory_send between", value1, value2, "factorySend");
            return (Criteria) this;
        }

        public Criteria andFactorySendNotBetween(Short value1, Short value2) {
            addCriterion("factory_send not between", value1, value2, "factorySend");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceIsNull() {
            addCriterion("delivery_place is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceIsNotNull() {
            addCriterion("delivery_place is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceEqualTo(String value) {
            addCriterion("delivery_place =", value, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceNotEqualTo(String value) {
            addCriterion("delivery_place <>", value, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceGreaterThan(String value) {
            addCriterion("delivery_place >", value, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_place >=", value, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceLessThan(String value) {
            addCriterion("delivery_place <", value, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceLessThanOrEqualTo(String value) {
            addCriterion("delivery_place <=", value, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceLike(String value) {
            addCriterion("delivery_place like", value, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceNotLike(String value) {
            addCriterion("delivery_place not like", value, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceIn(List<String> values) {
            addCriterion("delivery_place in", values, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceNotIn(List<String> values) {
            addCriterion("delivery_place not in", values, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceBetween(String value1, String value2) {
            addCriterion("delivery_place between", value1, value2, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andDeliveryPlaceNotBetween(String value1, String value2) {
            addCriterion("delivery_place not between", value1, value2, "deliveryPlace");
            return (Criteria) this;
        }

        public Criteria andRequirementsIsNull() {
            addCriterion("requirements is null");
            return (Criteria) this;
        }

        public Criteria andRequirementsIsNotNull() {
            addCriterion("requirements is not null");
            return (Criteria) this;
        }

        public Criteria andRequirementsEqualTo(String value) {
            addCriterion("requirements =", value, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsNotEqualTo(String value) {
            addCriterion("requirements <>", value, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsGreaterThan(String value) {
            addCriterion("requirements >", value, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsGreaterThanOrEqualTo(String value) {
            addCriterion("requirements >=", value, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsLessThan(String value) {
            addCriterion("requirements <", value, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsLessThanOrEqualTo(String value) {
            addCriterion("requirements <=", value, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsLike(String value) {
            addCriterion("requirements like", value, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsNotLike(String value) {
            addCriterion("requirements not like", value, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsIn(List<String> values) {
            addCriterion("requirements in", values, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsNotIn(List<String> values) {
            addCriterion("requirements not in", values, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsBetween(String value1, String value2) {
            addCriterion("requirements between", value1, value2, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsNotBetween(String value1, String value2) {
            addCriterion("requirements not between", value1, value2, "requirements");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionStatusIsNull() {
            addCriterion("purch_requisition_status is null");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionStatusIsNotNull() {
            addCriterion("purch_requisition_status is not null");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionStatusEqualTo(Short value) {
            addCriterion("purch_requisition_status =", value, "purchRequisitionStatus");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionStatusNotEqualTo(Short value) {
            addCriterion("purch_requisition_status <>", value, "purchRequisitionStatus");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionStatusGreaterThan(Short value) {
            addCriterion("purch_requisition_status >", value, "purchRequisitionStatus");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("purch_requisition_status >=", value, "purchRequisitionStatus");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionStatusLessThan(Short value) {
            addCriterion("purch_requisition_status <", value, "purchRequisitionStatus");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionStatusLessThanOrEqualTo(Short value) {
            addCriterion("purch_requisition_status <=", value, "purchRequisitionStatus");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionStatusIn(List<Short> values) {
            addCriterion("purch_requisition_status in", values, "purchRequisitionStatus");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionStatusNotIn(List<Short> values) {
            addCriterion("purch_requisition_status not in", values, "purchRequisitionStatus");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionStatusBetween(Short value1, Short value2) {
            addCriterion("purch_requisition_status between", value1, value2, "purchRequisitionStatus");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionStatusNotBetween(Short value1, Short value2) {
            addCriterion("purch_requisition_status not between", value1, value2, "purchRequisitionStatus");
            return (Criteria) this;
        }

        public Criteria andPurchStatusIsNull() {
            addCriterion("purch_status is null");
            return (Criteria) this;
        }

        public Criteria andPurchStatusIsNotNull() {
            addCriterion("purch_status is not null");
            return (Criteria) this;
        }

        public Criteria andPurchStatusEqualTo(Short value) {
            addCriterion("purch_status =", value, "purchStatus");
            return (Criteria) this;
        }

        public Criteria andPurchStatusNotEqualTo(Short value) {
            addCriterion("purch_status <>", value, "purchStatus");
            return (Criteria) this;
        }

        public Criteria andPurchStatusGreaterThan(Short value) {
            addCriterion("purch_status >", value, "purchStatus");
            return (Criteria) this;
        }

        public Criteria andPurchStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("purch_status >=", value, "purchStatus");
            return (Criteria) this;
        }

        public Criteria andPurchStatusLessThan(Short value) {
            addCriterion("purch_status <", value, "purchStatus");
            return (Criteria) this;
        }

        public Criteria andPurchStatusLessThanOrEqualTo(Short value) {
            addCriterion("purch_status <=", value, "purchStatus");
            return (Criteria) this;
        }

        public Criteria andPurchStatusIn(List<Short> values) {
            addCriterion("purch_status in", values, "purchStatus");
            return (Criteria) this;
        }

        public Criteria andPurchStatusNotIn(List<Short> values) {
            addCriterion("purch_status not in", values, "purchStatus");
            return (Criteria) this;
        }

        public Criteria andPurchStatusBetween(Short value1, Short value2) {
            addCriterion("purch_status between", value1, value2, "purchStatus");
            return (Criteria) this;
        }

        public Criteria andPurchStatusNotBetween(Short value1, Short value2) {
            addCriterion("purch_status not between", value1, value2, "purchStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseUidIsNull() {
            addCriterion("purchase_uid is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseUidIsNotNull() {
            addCriterion("purchase_uid is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseUidEqualTo(Long value) {
            addCriterion("purchase_uid =", value, "purchaseUid");
            return (Criteria) this;
        }

        public Criteria andPurchaseUidNotEqualTo(Long value) {
            addCriterion("purchase_uid <>", value, "purchaseUid");
            return (Criteria) this;
        }

        public Criteria andPurchaseUidGreaterThan(Long value) {
            addCriterion("purchase_uid >", value, "purchaseUid");
            return (Criteria) this;
        }

        public Criteria andPurchaseUidGreaterThanOrEqualTo(Long value) {
            addCriterion("purchase_uid >=", value, "purchaseUid");
            return (Criteria) this;
        }

        public Criteria andPurchaseUidLessThan(Long value) {
            addCriterion("purchase_uid <", value, "purchaseUid");
            return (Criteria) this;
        }

        public Criteria andPurchaseUidLessThanOrEqualTo(Long value) {
            addCriterion("purchase_uid <=", value, "purchaseUid");
            return (Criteria) this;
        }

        public Criteria andPurchaseUidIn(List<Long> values) {
            addCriterion("purchase_uid in", values, "purchaseUid");
            return (Criteria) this;
        }

        public Criteria andPurchaseUidNotIn(List<Long> values) {
            addCriterion("purchase_uid not in", values, "purchaseUid");
            return (Criteria) this;
        }

        public Criteria andPurchaseUidBetween(Long value1, Long value2) {
            addCriterion("purchase_uid between", value1, value2, "purchaseUid");
            return (Criteria) this;
        }

        public Criteria andPurchaseUidNotBetween(Long value1, Long value2) {
            addCriterion("purchase_uid not between", value1, value2, "purchaseUid");
            return (Criteria) this;
        }

        public Criteria andSinglePersonIdIsNull() {
            addCriterion("single_person_id is null");
            return (Criteria) this;
        }

        public Criteria andSinglePersonIdIsNotNull() {
            addCriterion("single_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andSinglePersonIdEqualTo(Long value) {
            addCriterion("single_person_id =", value, "singlePersonId");
            return (Criteria) this;
        }

        public Criteria andSinglePersonIdNotEqualTo(Long value) {
            addCriterion("single_person_id <>", value, "singlePersonId");
            return (Criteria) this;
        }

        public Criteria andSinglePersonIdGreaterThan(Long value) {
            addCriterion("single_person_id >", value, "singlePersonId");
            return (Criteria) this;
        }

        public Criteria andSinglePersonIdGreaterThanOrEqualTo(Long value) {
            addCriterion("single_person_id >=", value, "singlePersonId");
            return (Criteria) this;
        }

        public Criteria andSinglePersonIdLessThan(Long value) {
            addCriterion("single_person_id <", value, "singlePersonId");
            return (Criteria) this;
        }

        public Criteria andSinglePersonIdLessThanOrEqualTo(Long value) {
            addCriterion("single_person_id <=", value, "singlePersonId");
            return (Criteria) this;
        }

        public Criteria andSinglePersonIdIn(List<Long> values) {
            addCriterion("single_person_id in", values, "singlePersonId");
            return (Criteria) this;
        }

        public Criteria andSinglePersonIdNotIn(List<Long> values) {
            addCriterion("single_person_id not in", values, "singlePersonId");
            return (Criteria) this;
        }

        public Criteria andSinglePersonIdBetween(Long value1, Long value2) {
            addCriterion("single_person_id between", value1, value2, "singlePersonId");
            return (Criteria) this;
        }

        public Criteria andSinglePersonIdNotBetween(Long value1, Long value2) {
            addCriterion("single_person_id not between", value1, value2, "singlePersonId");
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