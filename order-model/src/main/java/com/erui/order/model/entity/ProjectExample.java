package com.erui.order.model.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andProjectNoIsNull() {
            addCriterion("project_no is null");
            return (Criteria) this;
        }

        public Criteria andProjectNoIsNotNull() {
            addCriterion("project_no is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNoEqualTo(String value) {
            addCriterion("project_no =", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotEqualTo(String value) {
            addCriterion("project_no <>", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoGreaterThan(String value) {
            addCriterion("project_no >", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoGreaterThanOrEqualTo(String value) {
            addCriterion("project_no >=", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoLessThan(String value) {
            addCriterion("project_no <", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoLessThanOrEqualTo(String value) {
            addCriterion("project_no <=", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoLike(String value) {
            addCriterion("project_no like", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotLike(String value) {
            addCriterion("project_no not like", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoIn(List<String> values) {
            addCriterion("project_no in", values, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotIn(List<String> values) {
            addCriterion("project_no not in", values, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoBetween(String value1, String value2) {
            addCriterion("project_no between", value1, value2, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotBetween(String value1, String value2) {
            addCriterion("project_no not between", value1, value2, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIsNull() {
            addCriterion("delivery_date is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIsNotNull() {
            addCriterion("delivery_date is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateEqualTo(String value) {
            addCriterion("delivery_date =", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotEqualTo(String value) {
            addCriterion("delivery_date <>", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateGreaterThan(String value) {
            addCriterion("delivery_date >", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_date >=", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLessThan(String value) {
            addCriterion("delivery_date <", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLessThanOrEqualTo(String value) {
            addCriterion("delivery_date <=", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLike(String value) {
            addCriterion("delivery_date like", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotLike(String value) {
            addCriterion("delivery_date not like", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIn(List<String> values) {
            addCriterion("delivery_date in", values, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotIn(List<String> values) {
            addCriterion("delivery_date not in", values, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateBetween(String value1, String value2) {
            addCriterion("delivery_date between", value1, value2, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotBetween(String value1, String value2) {
            addCriterion("delivery_date not between", value1, value2, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andProfitIsNull() {
            addCriterion("profit is null");
            return (Criteria) this;
        }

        public Criteria andProfitIsNotNull() {
            addCriterion("profit is not null");
            return (Criteria) this;
        }

        public Criteria andProfitEqualTo(BigDecimal value) {
            addCriterion("profit =", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotEqualTo(BigDecimal value) {
            addCriterion("profit <>", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThan(BigDecimal value) {
            addCriterion("profit >", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("profit >=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThan(BigDecimal value) {
            addCriterion("profit <", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("profit <=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitIn(List<BigDecimal> values) {
            addCriterion("profit in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotIn(List<BigDecimal> values) {
            addCriterion("profit not in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit not between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitPercentIsNull() {
            addCriterion("profit_percent is null");
            return (Criteria) this;
        }

        public Criteria andProfitPercentIsNotNull() {
            addCriterion("profit_percent is not null");
            return (Criteria) this;
        }

        public Criteria andProfitPercentEqualTo(BigDecimal value) {
            addCriterion("profit_percent =", value, "profitPercent");
            return (Criteria) this;
        }

        public Criteria andProfitPercentNotEqualTo(BigDecimal value) {
            addCriterion("profit_percent <>", value, "profitPercent");
            return (Criteria) this;
        }

        public Criteria andProfitPercentGreaterThan(BigDecimal value) {
            addCriterion("profit_percent >", value, "profitPercent");
            return (Criteria) this;
        }

        public Criteria andProfitPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("profit_percent >=", value, "profitPercent");
            return (Criteria) this;
        }

        public Criteria andProfitPercentLessThan(BigDecimal value) {
            addCriterion("profit_percent <", value, "profitPercent");
            return (Criteria) this;
        }

        public Criteria andProfitPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("profit_percent <=", value, "profitPercent");
            return (Criteria) this;
        }

        public Criteria andProfitPercentIn(List<BigDecimal> values) {
            addCriterion("profit_percent in", values, "profitPercent");
            return (Criteria) this;
        }

        public Criteria andProfitPercentNotIn(List<BigDecimal> values) {
            addCriterion("profit_percent not in", values, "profitPercent");
            return (Criteria) this;
        }

        public Criteria andProfitPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit_percent between", value1, value2, "profitPercent");
            return (Criteria) this;
        }

        public Criteria andProfitPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit_percent not between", value1, value2, "profitPercent");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIsNull() {
            addCriterion("project_status is null");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIsNotNull() {
            addCriterion("project_status is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStatusEqualTo(String value) {
            addCriterion("project_status =", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotEqualTo(String value) {
            addCriterion("project_status <>", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThan(String value) {
            addCriterion("project_status >", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThanOrEqualTo(String value) {
            addCriterion("project_status >=", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThan(String value) {
            addCriterion("project_status <", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThanOrEqualTo(String value) {
            addCriterion("project_status <=", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLike(String value) {
            addCriterion("project_status like", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotLike(String value) {
            addCriterion("project_status not like", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIn(List<String> values) {
            addCriterion("project_status in", values, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotIn(List<String> values) {
            addCriterion("project_status not in", values, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusBetween(String value1, String value2) {
            addCriterion("project_status between", value1, value2, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotBetween(String value1, String value2) {
            addCriterion("project_status not between", value1, value2, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andPurchReqCreateIsNull() {
            addCriterion("purch_req_create is null");
            return (Criteria) this;
        }

        public Criteria andPurchReqCreateIsNotNull() {
            addCriterion("purch_req_create is not null");
            return (Criteria) this;
        }

        public Criteria andPurchReqCreateEqualTo(Short value) {
            addCriterion("purch_req_create =", value, "purchReqCreate");
            return (Criteria) this;
        }

        public Criteria andPurchReqCreateNotEqualTo(Short value) {
            addCriterion("purch_req_create <>", value, "purchReqCreate");
            return (Criteria) this;
        }

        public Criteria andPurchReqCreateGreaterThan(Short value) {
            addCriterion("purch_req_create >", value, "purchReqCreate");
            return (Criteria) this;
        }

        public Criteria andPurchReqCreateGreaterThanOrEqualTo(Short value) {
            addCriterion("purch_req_create >=", value, "purchReqCreate");
            return (Criteria) this;
        }

        public Criteria andPurchReqCreateLessThan(Short value) {
            addCriterion("purch_req_create <", value, "purchReqCreate");
            return (Criteria) this;
        }

        public Criteria andPurchReqCreateLessThanOrEqualTo(Short value) {
            addCriterion("purch_req_create <=", value, "purchReqCreate");
            return (Criteria) this;
        }

        public Criteria andPurchReqCreateIn(List<Short> values) {
            addCriterion("purch_req_create in", values, "purchReqCreate");
            return (Criteria) this;
        }

        public Criteria andPurchReqCreateNotIn(List<Short> values) {
            addCriterion("purch_req_create not in", values, "purchReqCreate");
            return (Criteria) this;
        }

        public Criteria andPurchReqCreateBetween(Short value1, Short value2) {
            addCriterion("purch_req_create between", value1, value2, "purchReqCreate");
            return (Criteria) this;
        }

        public Criteria andPurchReqCreateNotBetween(Short value1, Short value2) {
            addCriterion("purch_req_create not between", value1, value2, "purchReqCreate");
            return (Criteria) this;
        }

        public Criteria andPurchDoneIsNull() {
            addCriterion("purch_done is null");
            return (Criteria) this;
        }

        public Criteria andPurchDoneIsNotNull() {
            addCriterion("purch_done is not null");
            return (Criteria) this;
        }

        public Criteria andPurchDoneEqualTo(Boolean value) {
            addCriterion("purch_done =", value, "purchDone");
            return (Criteria) this;
        }

        public Criteria andPurchDoneNotEqualTo(Boolean value) {
            addCriterion("purch_done <>", value, "purchDone");
            return (Criteria) this;
        }

        public Criteria andPurchDoneGreaterThan(Boolean value) {
            addCriterion("purch_done >", value, "purchDone");
            return (Criteria) this;
        }

        public Criteria andPurchDoneGreaterThanOrEqualTo(Boolean value) {
            addCriterion("purch_done >=", value, "purchDone");
            return (Criteria) this;
        }

        public Criteria andPurchDoneLessThan(Boolean value) {
            addCriterion("purch_done <", value, "purchDone");
            return (Criteria) this;
        }

        public Criteria andPurchDoneLessThanOrEqualTo(Boolean value) {
            addCriterion("purch_done <=", value, "purchDone");
            return (Criteria) this;
        }

        public Criteria andPurchDoneIn(List<Boolean> values) {
            addCriterion("purch_done in", values, "purchDone");
            return (Criteria) this;
        }

        public Criteria andPurchDoneNotIn(List<Boolean> values) {
            addCriterion("purch_done not in", values, "purchDone");
            return (Criteria) this;
        }

        public Criteria andPurchDoneBetween(Boolean value1, Boolean value2) {
            addCriterion("purch_done between", value1, value2, "purchDone");
            return (Criteria) this;
        }

        public Criteria andPurchDoneNotBetween(Boolean value1, Boolean value2) {
            addCriterion("purch_done not between", value1, value2, "purchDone");
            return (Criteria) this;
        }

        public Criteria andExeChgDateIsNull() {
            addCriterion("exe_chg_date is null");
            return (Criteria) this;
        }

        public Criteria andExeChgDateIsNotNull() {
            addCriterion("exe_chg_date is not null");
            return (Criteria) this;
        }

        public Criteria andExeChgDateEqualTo(Date value) {
            addCriterionForJDBCDate("exe_chg_date =", value, "exeChgDate");
            return (Criteria) this;
        }

        public Criteria andExeChgDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("exe_chg_date <>", value, "exeChgDate");
            return (Criteria) this;
        }

        public Criteria andExeChgDateGreaterThan(Date value) {
            addCriterionForJDBCDate("exe_chg_date >", value, "exeChgDate");
            return (Criteria) this;
        }

        public Criteria andExeChgDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("exe_chg_date >=", value, "exeChgDate");
            return (Criteria) this;
        }

        public Criteria andExeChgDateLessThan(Date value) {
            addCriterionForJDBCDate("exe_chg_date <", value, "exeChgDate");
            return (Criteria) this;
        }

        public Criteria andExeChgDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("exe_chg_date <=", value, "exeChgDate");
            return (Criteria) this;
        }

        public Criteria andExeChgDateIn(List<Date> values) {
            addCriterionForJDBCDate("exe_chg_date in", values, "exeChgDate");
            return (Criteria) this;
        }

        public Criteria andExeChgDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("exe_chg_date not in", values, "exeChgDate");
            return (Criteria) this;
        }

        public Criteria andExeChgDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("exe_chg_date between", value1, value2, "exeChgDate");
            return (Criteria) this;
        }

        public Criteria andExeChgDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("exe_chg_date not between", value1, value2, "exeChgDate");
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

        public Criteria andQualityUidIsNull() {
            addCriterion("quality_uid is null");
            return (Criteria) this;
        }

        public Criteria andQualityUidIsNotNull() {
            addCriterion("quality_uid is not null");
            return (Criteria) this;
        }

        public Criteria andQualityUidEqualTo(Long value) {
            addCriterion("quality_uid =", value, "qualityUid");
            return (Criteria) this;
        }

        public Criteria andQualityUidNotEqualTo(Long value) {
            addCriterion("quality_uid <>", value, "qualityUid");
            return (Criteria) this;
        }

        public Criteria andQualityUidGreaterThan(Long value) {
            addCriterion("quality_uid >", value, "qualityUid");
            return (Criteria) this;
        }

        public Criteria andQualityUidGreaterThanOrEqualTo(Long value) {
            addCriterion("quality_uid >=", value, "qualityUid");
            return (Criteria) this;
        }

        public Criteria andQualityUidLessThan(Long value) {
            addCriterion("quality_uid <", value, "qualityUid");
            return (Criteria) this;
        }

        public Criteria andQualityUidLessThanOrEqualTo(Long value) {
            addCriterion("quality_uid <=", value, "qualityUid");
            return (Criteria) this;
        }

        public Criteria andQualityUidIn(List<Long> values) {
            addCriterion("quality_uid in", values, "qualityUid");
            return (Criteria) this;
        }

        public Criteria andQualityUidNotIn(List<Long> values) {
            addCriterion("quality_uid not in", values, "qualityUid");
            return (Criteria) this;
        }

        public Criteria andQualityUidBetween(Long value1, Long value2) {
            addCriterion("quality_uid between", value1, value2, "qualityUid");
            return (Criteria) this;
        }

        public Criteria andQualityUidNotBetween(Long value1, Long value2) {
            addCriterion("quality_uid not between", value1, value2, "qualityUid");
            return (Criteria) this;
        }

        public Criteria andBusinessUidIsNull() {
            addCriterion("business_uid is null");
            return (Criteria) this;
        }

        public Criteria andBusinessUidIsNotNull() {
            addCriterion("business_uid is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessUidEqualTo(Long value) {
            addCriterion("business_uid =", value, "businessUid");
            return (Criteria) this;
        }

        public Criteria andBusinessUidNotEqualTo(Long value) {
            addCriterion("business_uid <>", value, "businessUid");
            return (Criteria) this;
        }

        public Criteria andBusinessUidGreaterThan(Long value) {
            addCriterion("business_uid >", value, "businessUid");
            return (Criteria) this;
        }

        public Criteria andBusinessUidGreaterThanOrEqualTo(Long value) {
            addCriterion("business_uid >=", value, "businessUid");
            return (Criteria) this;
        }

        public Criteria andBusinessUidLessThan(Long value) {
            addCriterion("business_uid <", value, "businessUid");
            return (Criteria) this;
        }

        public Criteria andBusinessUidLessThanOrEqualTo(Long value) {
            addCriterion("business_uid <=", value, "businessUid");
            return (Criteria) this;
        }

        public Criteria andBusinessUidIn(List<Long> values) {
            addCriterion("business_uid in", values, "businessUid");
            return (Criteria) this;
        }

        public Criteria andBusinessUidNotIn(List<Long> values) {
            addCriterion("business_uid not in", values, "businessUid");
            return (Criteria) this;
        }

        public Criteria andBusinessUidBetween(Long value1, Long value2) {
            addCriterion("business_uid between", value1, value2, "businessUid");
            return (Criteria) this;
        }

        public Criteria andBusinessUidNotBetween(Long value1, Long value2) {
            addCriterion("business_uid not between", value1, value2, "businessUid");
            return (Criteria) this;
        }

        public Criteria andSendDeptIdIsNull() {
            addCriterion("send_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andSendDeptIdIsNotNull() {
            addCriterion("send_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andSendDeptIdEqualTo(Long value) {
            addCriterion("send_dept_id =", value, "sendDeptId");
            return (Criteria) this;
        }

        public Criteria andSendDeptIdNotEqualTo(Long value) {
            addCriterion("send_dept_id <>", value, "sendDeptId");
            return (Criteria) this;
        }

        public Criteria andSendDeptIdGreaterThan(Long value) {
            addCriterion("send_dept_id >", value, "sendDeptId");
            return (Criteria) this;
        }

        public Criteria andSendDeptIdGreaterThanOrEqualTo(Long value) {
            addCriterion("send_dept_id >=", value, "sendDeptId");
            return (Criteria) this;
        }

        public Criteria andSendDeptIdLessThan(Long value) {
            addCriterion("send_dept_id <", value, "sendDeptId");
            return (Criteria) this;
        }

        public Criteria andSendDeptIdLessThanOrEqualTo(Long value) {
            addCriterion("send_dept_id <=", value, "sendDeptId");
            return (Criteria) this;
        }

        public Criteria andSendDeptIdIn(List<Long> values) {
            addCriterion("send_dept_id in", values, "sendDeptId");
            return (Criteria) this;
        }

        public Criteria andSendDeptIdNotIn(List<Long> values) {
            addCriterion("send_dept_id not in", values, "sendDeptId");
            return (Criteria) this;
        }

        public Criteria andSendDeptIdBetween(Long value1, Long value2) {
            addCriterion("send_dept_id between", value1, value2, "sendDeptId");
            return (Criteria) this;
        }

        public Criteria andSendDeptIdNotBetween(Long value1, Long value2) {
            addCriterion("send_dept_id not between", value1, value2, "sendDeptId");
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

        public Criteria andTotalPriceUsdIsNull() {
            addCriterion("total_price_usd is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceUsdIsNotNull() {
            addCriterion("total_price_usd is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceUsdEqualTo(BigDecimal value) {
            addCriterion("total_price_usd =", value, "totalPriceUsd");
            return (Criteria) this;
        }

        public Criteria andTotalPriceUsdNotEqualTo(BigDecimal value) {
            addCriterion("total_price_usd <>", value, "totalPriceUsd");
            return (Criteria) this;
        }

        public Criteria andTotalPriceUsdGreaterThan(BigDecimal value) {
            addCriterion("total_price_usd >", value, "totalPriceUsd");
            return (Criteria) this;
        }

        public Criteria andTotalPriceUsdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_price_usd >=", value, "totalPriceUsd");
            return (Criteria) this;
        }

        public Criteria andTotalPriceUsdLessThan(BigDecimal value) {
            addCriterion("total_price_usd <", value, "totalPriceUsd");
            return (Criteria) this;
        }

        public Criteria andTotalPriceUsdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_price_usd <=", value, "totalPriceUsd");
            return (Criteria) this;
        }

        public Criteria andTotalPriceUsdIn(List<BigDecimal> values) {
            addCriterion("total_price_usd in", values, "totalPriceUsd");
            return (Criteria) this;
        }

        public Criteria andTotalPriceUsdNotIn(List<BigDecimal> values) {
            addCriterion("total_price_usd not in", values, "totalPriceUsd");
            return (Criteria) this;
        }

        public Criteria andTotalPriceUsdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_price_usd between", value1, value2, "totalPriceUsd");
            return (Criteria) this;
        }

        public Criteria andTotalPriceUsdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_price_usd not between", value1, value2, "totalPriceUsd");
            return (Criteria) this;
        }

        public Criteria andProcessProgressIsNull() {
            addCriterion("process_progress is null");
            return (Criteria) this;
        }

        public Criteria andProcessProgressIsNotNull() {
            addCriterion("process_progress is not null");
            return (Criteria) this;
        }

        public Criteria andProcessProgressEqualTo(String value) {
            addCriterion("process_progress =", value, "processProgress");
            return (Criteria) this;
        }

        public Criteria andProcessProgressNotEqualTo(String value) {
            addCriterion("process_progress <>", value, "processProgress");
            return (Criteria) this;
        }

        public Criteria andProcessProgressGreaterThan(String value) {
            addCriterion("process_progress >", value, "processProgress");
            return (Criteria) this;
        }

        public Criteria andProcessProgressGreaterThanOrEqualTo(String value) {
            addCriterion("process_progress >=", value, "processProgress");
            return (Criteria) this;
        }

        public Criteria andProcessProgressLessThan(String value) {
            addCriterion("process_progress <", value, "processProgress");
            return (Criteria) this;
        }

        public Criteria andProcessProgressLessThanOrEqualTo(String value) {
            addCriterion("process_progress <=", value, "processProgress");
            return (Criteria) this;
        }

        public Criteria andProcessProgressLike(String value) {
            addCriterion("process_progress like", value, "processProgress");
            return (Criteria) this;
        }

        public Criteria andProcessProgressNotLike(String value) {
            addCriterion("process_progress not like", value, "processProgress");
            return (Criteria) this;
        }

        public Criteria andProcessProgressIn(List<String> values) {
            addCriterion("process_progress in", values, "processProgress");
            return (Criteria) this;
        }

        public Criteria andProcessProgressNotIn(List<String> values) {
            addCriterion("process_progress not in", values, "processProgress");
            return (Criteria) this;
        }

        public Criteria andProcessProgressBetween(String value1, String value2) {
            addCriterion("process_progress between", value1, value2, "processProgress");
            return (Criteria) this;
        }

        public Criteria andProcessProgressNotBetween(String value1, String value2) {
            addCriterion("process_progress not between", value1, value2, "processProgress");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignHasIsNull() {
            addCriterion("deliver_consign_has is null");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignHasIsNotNull() {
            addCriterion("deliver_consign_has is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignHasEqualTo(Boolean value) {
            addCriterion("deliver_consign_has =", value, "deliverConsignHas");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignHasNotEqualTo(Boolean value) {
            addCriterion("deliver_consign_has <>", value, "deliverConsignHas");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignHasGreaterThan(Boolean value) {
            addCriterion("deliver_consign_has >", value, "deliverConsignHas");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignHasGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deliver_consign_has >=", value, "deliverConsignHas");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignHasLessThan(Boolean value) {
            addCriterion("deliver_consign_has <", value, "deliverConsignHas");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignHasLessThanOrEqualTo(Boolean value) {
            addCriterion("deliver_consign_has <=", value, "deliverConsignHas");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignHasIn(List<Boolean> values) {
            addCriterion("deliver_consign_has in", values, "deliverConsignHas");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignHasNotIn(List<Boolean> values) {
            addCriterion("deliver_consign_has not in", values, "deliverConsignHas");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignHasBetween(Boolean value1, Boolean value2) {
            addCriterion("deliver_consign_has between", value1, value2, "deliverConsignHas");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignHasNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deliver_consign_has not between", value1, value2, "deliverConsignHas");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeIsNull() {
            addCriterion("quality_inspect_type is null");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeIsNotNull() {
            addCriterion("quality_inspect_type is not null");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeEqualTo(String value) {
            addCriterion("quality_inspect_type =", value, "qualityInspectType");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeNotEqualTo(String value) {
            addCriterion("quality_inspect_type <>", value, "qualityInspectType");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeGreaterThan(String value) {
            addCriterion("quality_inspect_type >", value, "qualityInspectType");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("quality_inspect_type >=", value, "qualityInspectType");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeLessThan(String value) {
            addCriterion("quality_inspect_type <", value, "qualityInspectType");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeLessThanOrEqualTo(String value) {
            addCriterion("quality_inspect_type <=", value, "qualityInspectType");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeLike(String value) {
            addCriterion("quality_inspect_type like", value, "qualityInspectType");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeNotLike(String value) {
            addCriterion("quality_inspect_type not like", value, "qualityInspectType");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeIn(List<String> values) {
            addCriterion("quality_inspect_type in", values, "qualityInspectType");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeNotIn(List<String> values) {
            addCriterion("quality_inspect_type not in", values, "qualityInspectType");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeBetween(String value1, String value2) {
            addCriterion("quality_inspect_type between", value1, value2, "qualityInspectType");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeNotBetween(String value1, String value2) {
            addCriterion("quality_inspect_type not between", value1, value2, "qualityInspectType");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNull() {
            addCriterion("process_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNotNull() {
            addCriterion("process_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessIdEqualTo(String value) {
            addCriterion("process_id =", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotEqualTo(String value) {
            addCriterion("process_id <>", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThan(String value) {
            addCriterion("process_id >", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThanOrEqualTo(String value) {
            addCriterion("process_id >=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThan(String value) {
            addCriterion("process_id <", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThanOrEqualTo(String value) {
            addCriterion("process_id <=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLike(String value) {
            addCriterion("process_id like", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotLike(String value) {
            addCriterion("process_id not like", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdIn(List<String> values) {
            addCriterion("process_id in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotIn(List<String> values) {
            addCriterion("process_id not in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdBetween(String value1, String value2) {
            addCriterion("process_id between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotBetween(String value1, String value2) {
            addCriterion("process_id not between", value1, value2, "processId");
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