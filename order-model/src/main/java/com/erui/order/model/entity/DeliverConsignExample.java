package com.erui.order.model.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DeliverConsignExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeliverConsignExample() {
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

        public Criteria andDeliverConsignNoIsNull() {
            addCriterion("deliver_consign_no is null");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignNoIsNotNull() {
            addCriterion("deliver_consign_no is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignNoEqualTo(String value) {
            addCriterion("deliver_consign_no =", value, "deliverConsignNo");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignNoNotEqualTo(String value) {
            addCriterion("deliver_consign_no <>", value, "deliverConsignNo");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignNoGreaterThan(String value) {
            addCriterion("deliver_consign_no >", value, "deliverConsignNo");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignNoGreaterThanOrEqualTo(String value) {
            addCriterion("deliver_consign_no >=", value, "deliverConsignNo");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignNoLessThan(String value) {
            addCriterion("deliver_consign_no <", value, "deliverConsignNo");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignNoLessThanOrEqualTo(String value) {
            addCriterion("deliver_consign_no <=", value, "deliverConsignNo");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignNoLike(String value) {
            addCriterion("deliver_consign_no like", value, "deliverConsignNo");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignNoNotLike(String value) {
            addCriterion("deliver_consign_no not like", value, "deliverConsignNo");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignNoIn(List<String> values) {
            addCriterion("deliver_consign_no in", values, "deliverConsignNo");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignNoNotIn(List<String> values) {
            addCriterion("deliver_consign_no not in", values, "deliverConsignNo");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignNoBetween(String value1, String value2) {
            addCriterion("deliver_consign_no between", value1, value2, "deliverConsignNo");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignNoNotBetween(String value1, String value2) {
            addCriterion("deliver_consign_no not between", value1, value2, "deliverConsignNo");
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

        public Criteria andCoIdIsNull() {
            addCriterion("co_id is null");
            return (Criteria) this;
        }

        public Criteria andCoIdIsNotNull() {
            addCriterion("co_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoIdEqualTo(String value) {
            addCriterion("co_id =", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotEqualTo(String value) {
            addCriterion("co_id <>", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdGreaterThan(String value) {
            addCriterion("co_id >", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdGreaterThanOrEqualTo(String value) {
            addCriterion("co_id >=", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdLessThan(String value) {
            addCriterion("co_id <", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdLessThanOrEqualTo(String value) {
            addCriterion("co_id <=", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdLike(String value) {
            addCriterion("co_id like", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotLike(String value) {
            addCriterion("co_id not like", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdIn(List<String> values) {
            addCriterion("co_id in", values, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotIn(List<String> values) {
            addCriterion("co_id not in", values, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdBetween(String value1, String value2) {
            addCriterion("co_id between", value1, value2, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotBetween(String value1, String value2) {
            addCriterion("co_id not between", value1, value2, "coId");
            return (Criteria) this;
        }

        public Criteria andExecCoNameIsNull() {
            addCriterion("exec_co_name is null");
            return (Criteria) this;
        }

        public Criteria andExecCoNameIsNotNull() {
            addCriterion("exec_co_name is not null");
            return (Criteria) this;
        }

        public Criteria andExecCoNameEqualTo(String value) {
            addCriterion("exec_co_name =", value, "execCoName");
            return (Criteria) this;
        }

        public Criteria andExecCoNameNotEqualTo(String value) {
            addCriterion("exec_co_name <>", value, "execCoName");
            return (Criteria) this;
        }

        public Criteria andExecCoNameGreaterThan(String value) {
            addCriterion("exec_co_name >", value, "execCoName");
            return (Criteria) this;
        }

        public Criteria andExecCoNameGreaterThanOrEqualTo(String value) {
            addCriterion("exec_co_name >=", value, "execCoName");
            return (Criteria) this;
        }

        public Criteria andExecCoNameLessThan(String value) {
            addCriterion("exec_co_name <", value, "execCoName");
            return (Criteria) this;
        }

        public Criteria andExecCoNameLessThanOrEqualTo(String value) {
            addCriterion("exec_co_name <=", value, "execCoName");
            return (Criteria) this;
        }

        public Criteria andExecCoNameLike(String value) {
            addCriterion("exec_co_name like", value, "execCoName");
            return (Criteria) this;
        }

        public Criteria andExecCoNameNotLike(String value) {
            addCriterion("exec_co_name not like", value, "execCoName");
            return (Criteria) this;
        }

        public Criteria andExecCoNameIn(List<String> values) {
            addCriterion("exec_co_name in", values, "execCoName");
            return (Criteria) this;
        }

        public Criteria andExecCoNameNotIn(List<String> values) {
            addCriterion("exec_co_name not in", values, "execCoName");
            return (Criteria) this;
        }

        public Criteria andExecCoNameBetween(String value1, String value2) {
            addCriterion("exec_co_name between", value1, value2, "execCoName");
            return (Criteria) this;
        }

        public Criteria andExecCoNameNotBetween(String value1, String value2) {
            addCriterion("exec_co_name not between", value1, value2, "execCoName");
            return (Criteria) this;
        }

        public Criteria andWriteDateIsNull() {
            addCriterion("write_date is null");
            return (Criteria) this;
        }

        public Criteria andWriteDateIsNotNull() {
            addCriterion("write_date is not null");
            return (Criteria) this;
        }

        public Criteria andWriteDateEqualTo(Date value) {
            addCriterionForJDBCDate("write_date =", value, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("write_date <>", value, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateGreaterThan(Date value) {
            addCriterionForJDBCDate("write_date >", value, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("write_date >=", value, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateLessThan(Date value) {
            addCriterionForJDBCDate("write_date <", value, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("write_date <=", value, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateIn(List<Date> values) {
            addCriterionForJDBCDate("write_date in", values, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("write_date not in", values, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("write_date between", value1, value2, "writeDate");
            return (Criteria) this;
        }

        public Criteria andWriteDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("write_date not between", value1, value2, "writeDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateIsNull() {
            addCriterion("booking_date is null");
            return (Criteria) this;
        }

        public Criteria andBookingDateIsNotNull() {
            addCriterion("booking_date is not null");
            return (Criteria) this;
        }

        public Criteria andBookingDateEqualTo(Date value) {
            addCriterionForJDBCDate("booking_date =", value, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("booking_date <>", value, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateGreaterThan(Date value) {
            addCriterionForJDBCDate("booking_date >", value, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("booking_date >=", value, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateLessThan(Date value) {
            addCriterionForJDBCDate("booking_date <", value, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("booking_date <=", value, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateIn(List<Date> values) {
            addCriterionForJDBCDate("booking_date in", values, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("booking_date not in", values, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("booking_date between", value1, value2, "bookingDate");
            return (Criteria) this;
        }

        public Criteria andBookingDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("booking_date not between", value1, value2, "bookingDate");
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

        public Criteria andDeliverConsignStatusIsNull() {
            addCriterion("deliver_consign_status is null");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignStatusIsNotNull() {
            addCriterion("deliver_consign_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignStatusEqualTo(Short value) {
            addCriterion("deliver_consign_status =", value, "deliverConsignStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignStatusNotEqualTo(Short value) {
            addCriterion("deliver_consign_status <>", value, "deliverConsignStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignStatusGreaterThan(Short value) {
            addCriterion("deliver_consign_status >", value, "deliverConsignStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("deliver_consign_status >=", value, "deliverConsignStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignStatusLessThan(Short value) {
            addCriterion("deliver_consign_status <", value, "deliverConsignStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignStatusLessThanOrEqualTo(Short value) {
            addCriterion("deliver_consign_status <=", value, "deliverConsignStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignStatusIn(List<Short> values) {
            addCriterion("deliver_consign_status in", values, "deliverConsignStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignStatusNotIn(List<Short> values) {
            addCriterion("deliver_consign_status not in", values, "deliverConsignStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignStatusBetween(Short value1, Short value2) {
            addCriterion("deliver_consign_status between", value1, value2, "deliverConsignStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignStatusNotBetween(Short value1, Short value2) {
            addCriterion("deliver_consign_status not between", value1, value2, "deliverConsignStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverYnIsNull() {
            addCriterion("deliver_yn is null");
            return (Criteria) this;
        }

        public Criteria andDeliverYnIsNotNull() {
            addCriterion("deliver_yn is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverYnEqualTo(Short value) {
            addCriterion("deliver_yn =", value, "deliverYn");
            return (Criteria) this;
        }

        public Criteria andDeliverYnNotEqualTo(Short value) {
            addCriterion("deliver_yn <>", value, "deliverYn");
            return (Criteria) this;
        }

        public Criteria andDeliverYnGreaterThan(Short value) {
            addCriterion("deliver_yn >", value, "deliverYn");
            return (Criteria) this;
        }

        public Criteria andDeliverYnGreaterThanOrEqualTo(Short value) {
            addCriterion("deliver_yn >=", value, "deliverYn");
            return (Criteria) this;
        }

        public Criteria andDeliverYnLessThan(Short value) {
            addCriterion("deliver_yn <", value, "deliverYn");
            return (Criteria) this;
        }

        public Criteria andDeliverYnLessThanOrEqualTo(Short value) {
            addCriterion("deliver_yn <=", value, "deliverYn");
            return (Criteria) this;
        }

        public Criteria andDeliverYnIn(List<Short> values) {
            addCriterion("deliver_yn in", values, "deliverYn");
            return (Criteria) this;
        }

        public Criteria andDeliverYnNotIn(List<Short> values) {
            addCriterion("deliver_yn not in", values, "deliverYn");
            return (Criteria) this;
        }

        public Criteria andDeliverYnBetween(Short value1, Short value2) {
            addCriterion("deliver_yn between", value1, value2, "deliverYn");
            return (Criteria) this;
        }

        public Criteria andDeliverYnNotBetween(Short value1, Short value2) {
            addCriterion("deliver_yn not between", value1, value2, "deliverYn");
            return (Criteria) this;
        }

        public Criteria andAdvanceMoneyIsNull() {
            addCriterion("advance_money is null");
            return (Criteria) this;
        }

        public Criteria andAdvanceMoneyIsNotNull() {
            addCriterion("advance_money is not null");
            return (Criteria) this;
        }

        public Criteria andAdvanceMoneyEqualTo(BigDecimal value) {
            addCriterion("advance_money =", value, "advanceMoney");
            return (Criteria) this;
        }

        public Criteria andAdvanceMoneyNotEqualTo(BigDecimal value) {
            addCriterion("advance_money <>", value, "advanceMoney");
            return (Criteria) this;
        }

        public Criteria andAdvanceMoneyGreaterThan(BigDecimal value) {
            addCriterion("advance_money >", value, "advanceMoney");
            return (Criteria) this;
        }

        public Criteria andAdvanceMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("advance_money >=", value, "advanceMoney");
            return (Criteria) this;
        }

        public Criteria andAdvanceMoneyLessThan(BigDecimal value) {
            addCriterion("advance_money <", value, "advanceMoney");
            return (Criteria) this;
        }

        public Criteria andAdvanceMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("advance_money <=", value, "advanceMoney");
            return (Criteria) this;
        }

        public Criteria andAdvanceMoneyIn(List<BigDecimal> values) {
            addCriterion("advance_money in", values, "advanceMoney");
            return (Criteria) this;
        }

        public Criteria andAdvanceMoneyNotIn(List<BigDecimal> values) {
            addCriterion("advance_money not in", values, "advanceMoney");
            return (Criteria) this;
        }

        public Criteria andAdvanceMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("advance_money between", value1, value2, "advanceMoney");
            return (Criteria) this;
        }

        public Criteria andAdvanceMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("advance_money not between", value1, value2, "advanceMoney");
            return (Criteria) this;
        }

        public Criteria andThisShipmentsMoneyIsNull() {
            addCriterion("this_shipments_money is null");
            return (Criteria) this;
        }

        public Criteria andThisShipmentsMoneyIsNotNull() {
            addCriterion("this_shipments_money is not null");
            return (Criteria) this;
        }

        public Criteria andThisShipmentsMoneyEqualTo(BigDecimal value) {
            addCriterion("this_shipments_money =", value, "thisShipmentsMoney");
            return (Criteria) this;
        }

        public Criteria andThisShipmentsMoneyNotEqualTo(BigDecimal value) {
            addCriterion("this_shipments_money <>", value, "thisShipmentsMoney");
            return (Criteria) this;
        }

        public Criteria andThisShipmentsMoneyGreaterThan(BigDecimal value) {
            addCriterion("this_shipments_money >", value, "thisShipmentsMoney");
            return (Criteria) this;
        }

        public Criteria andThisShipmentsMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("this_shipments_money >=", value, "thisShipmentsMoney");
            return (Criteria) this;
        }

        public Criteria andThisShipmentsMoneyLessThan(BigDecimal value) {
            addCriterion("this_shipments_money <", value, "thisShipmentsMoney");
            return (Criteria) this;
        }

        public Criteria andThisShipmentsMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("this_shipments_money <=", value, "thisShipmentsMoney");
            return (Criteria) this;
        }

        public Criteria andThisShipmentsMoneyIn(List<BigDecimal> values) {
            addCriterion("this_shipments_money in", values, "thisShipmentsMoney");
            return (Criteria) this;
        }

        public Criteria andThisShipmentsMoneyNotIn(List<BigDecimal> values) {
            addCriterion("this_shipments_money not in", values, "thisShipmentsMoney");
            return (Criteria) this;
        }

        public Criteria andThisShipmentsMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("this_shipments_money between", value1, value2, "thisShipmentsMoney");
            return (Criteria) this;
        }

        public Criteria andThisShipmentsMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("this_shipments_money not between", value1, value2, "thisShipmentsMoney");
            return (Criteria) this;
        }

        public Criteria andCurrencyBnIsNull() {
            addCriterion("currency_bn is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyBnIsNotNull() {
            addCriterion("currency_bn is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyBnEqualTo(String value) {
            addCriterion("currency_bn =", value, "currencyBn");
            return (Criteria) this;
        }

        public Criteria andCurrencyBnNotEqualTo(String value) {
            addCriterion("currency_bn <>", value, "currencyBn");
            return (Criteria) this;
        }

        public Criteria andCurrencyBnGreaterThan(String value) {
            addCriterion("currency_bn >", value, "currencyBn");
            return (Criteria) this;
        }

        public Criteria andCurrencyBnGreaterThanOrEqualTo(String value) {
            addCriterion("currency_bn >=", value, "currencyBn");
            return (Criteria) this;
        }

        public Criteria andCurrencyBnLessThan(String value) {
            addCriterion("currency_bn <", value, "currencyBn");
            return (Criteria) this;
        }

        public Criteria andCurrencyBnLessThanOrEqualTo(String value) {
            addCriterion("currency_bn <=", value, "currencyBn");
            return (Criteria) this;
        }

        public Criteria andCurrencyBnLike(String value) {
            addCriterion("currency_bn like", value, "currencyBn");
            return (Criteria) this;
        }

        public Criteria andCurrencyBnNotLike(String value) {
            addCriterion("currency_bn not like", value, "currencyBn");
            return (Criteria) this;
        }

        public Criteria andCurrencyBnIn(List<String> values) {
            addCriterion("currency_bn in", values, "currencyBn");
            return (Criteria) this;
        }

        public Criteria andCurrencyBnNotIn(List<String> values) {
            addCriterion("currency_bn not in", values, "currencyBn");
            return (Criteria) this;
        }

        public Criteria andCurrencyBnBetween(String value1, String value2) {
            addCriterion("currency_bn between", value1, value2, "currencyBn");
            return (Criteria) this;
        }

        public Criteria andCurrencyBnNotBetween(String value1, String value2) {
            addCriterion("currency_bn not between", value1, value2, "currencyBn");
            return (Criteria) this;
        }

        public Criteria andInvoiceRiseIsNull() {
            addCriterion("invoice_rise is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceRiseIsNotNull() {
            addCriterion("invoice_rise is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceRiseEqualTo(String value) {
            addCriterion("invoice_rise =", value, "invoiceRise");
            return (Criteria) this;
        }

        public Criteria andInvoiceRiseNotEqualTo(String value) {
            addCriterion("invoice_rise <>", value, "invoiceRise");
            return (Criteria) this;
        }

        public Criteria andInvoiceRiseGreaterThan(String value) {
            addCriterion("invoice_rise >", value, "invoiceRise");
            return (Criteria) this;
        }

        public Criteria andInvoiceRiseGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_rise >=", value, "invoiceRise");
            return (Criteria) this;
        }

        public Criteria andInvoiceRiseLessThan(String value) {
            addCriterion("invoice_rise <", value, "invoiceRise");
            return (Criteria) this;
        }

        public Criteria andInvoiceRiseLessThanOrEqualTo(String value) {
            addCriterion("invoice_rise <=", value, "invoiceRise");
            return (Criteria) this;
        }

        public Criteria andInvoiceRiseLike(String value) {
            addCriterion("invoice_rise like", value, "invoiceRise");
            return (Criteria) this;
        }

        public Criteria andInvoiceRiseNotLike(String value) {
            addCriterion("invoice_rise not like", value, "invoiceRise");
            return (Criteria) this;
        }

        public Criteria andInvoiceRiseIn(List<String> values) {
            addCriterion("invoice_rise in", values, "invoiceRise");
            return (Criteria) this;
        }

        public Criteria andInvoiceRiseNotIn(List<String> values) {
            addCriterion("invoice_rise not in", values, "invoiceRise");
            return (Criteria) this;
        }

        public Criteria andInvoiceRiseBetween(String value1, String value2) {
            addCriterion("invoice_rise between", value1, value2, "invoiceRise");
            return (Criteria) this;
        }

        public Criteria andInvoiceRiseNotBetween(String value1, String value2) {
            addCriterion("invoice_rise not between", value1, value2, "invoiceRise");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureIsNull() {
            addCriterion("business_nature is null");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureIsNotNull() {
            addCriterion("business_nature is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureEqualTo(Short value) {
            addCriterion("business_nature =", value, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureNotEqualTo(Short value) {
            addCriterion("business_nature <>", value, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureGreaterThan(Short value) {
            addCriterion("business_nature >", value, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureGreaterThanOrEqualTo(Short value) {
            addCriterion("business_nature >=", value, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureLessThan(Short value) {
            addCriterion("business_nature <", value, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureLessThanOrEqualTo(Short value) {
            addCriterion("business_nature <=", value, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureIn(List<Short> values) {
            addCriterion("business_nature in", values, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureNotIn(List<Short> values) {
            addCriterion("business_nature not in", values, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureBetween(Short value1, Short value2) {
            addCriterion("business_nature between", value1, value2, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessNatureNotBetween(Short value1, Short value2) {
            addCriterion("business_nature not between", value1, value2, "businessNature");
            return (Criteria) this;
        }

        public Criteria andBusinessSketchIsNull() {
            addCriterion("business_sketch is null");
            return (Criteria) this;
        }

        public Criteria andBusinessSketchIsNotNull() {
            addCriterion("business_sketch is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessSketchEqualTo(String value) {
            addCriterion("business_sketch =", value, "businessSketch");
            return (Criteria) this;
        }

        public Criteria andBusinessSketchNotEqualTo(String value) {
            addCriterion("business_sketch <>", value, "businessSketch");
            return (Criteria) this;
        }

        public Criteria andBusinessSketchGreaterThan(String value) {
            addCriterion("business_sketch >", value, "businessSketch");
            return (Criteria) this;
        }

        public Criteria andBusinessSketchGreaterThanOrEqualTo(String value) {
            addCriterion("business_sketch >=", value, "businessSketch");
            return (Criteria) this;
        }

        public Criteria andBusinessSketchLessThan(String value) {
            addCriterion("business_sketch <", value, "businessSketch");
            return (Criteria) this;
        }

        public Criteria andBusinessSketchLessThanOrEqualTo(String value) {
            addCriterion("business_sketch <=", value, "businessSketch");
            return (Criteria) this;
        }

        public Criteria andBusinessSketchLike(String value) {
            addCriterion("business_sketch like", value, "businessSketch");
            return (Criteria) this;
        }

        public Criteria andBusinessSketchNotLike(String value) {
            addCriterion("business_sketch not like", value, "businessSketch");
            return (Criteria) this;
        }

        public Criteria andBusinessSketchIn(List<String> values) {
            addCriterion("business_sketch in", values, "businessSketch");
            return (Criteria) this;
        }

        public Criteria andBusinessSketchNotIn(List<String> values) {
            addCriterion("business_sketch not in", values, "businessSketch");
            return (Criteria) this;
        }

        public Criteria andBusinessSketchBetween(String value1, String value2) {
            addCriterion("business_sketch between", value1, value2, "businessSketch");
            return (Criteria) this;
        }

        public Criteria andBusinessSketchNotBetween(String value1, String value2) {
            addCriterion("business_sketch not between", value1, value2, "businessSketch");
            return (Criteria) this;
        }

        public Criteria andDeclareCustomsMoneyIsNull() {
            addCriterion("declare_customs_money is null");
            return (Criteria) this;
        }

        public Criteria andDeclareCustomsMoneyIsNotNull() {
            addCriterion("declare_customs_money is not null");
            return (Criteria) this;
        }

        public Criteria andDeclareCustomsMoneyEqualTo(BigDecimal value) {
            addCriterion("declare_customs_money =", value, "declareCustomsMoney");
            return (Criteria) this;
        }

        public Criteria andDeclareCustomsMoneyNotEqualTo(BigDecimal value) {
            addCriterion("declare_customs_money <>", value, "declareCustomsMoney");
            return (Criteria) this;
        }

        public Criteria andDeclareCustomsMoneyGreaterThan(BigDecimal value) {
            addCriterion("declare_customs_money >", value, "declareCustomsMoney");
            return (Criteria) this;
        }

        public Criteria andDeclareCustomsMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("declare_customs_money >=", value, "declareCustomsMoney");
            return (Criteria) this;
        }

        public Criteria andDeclareCustomsMoneyLessThan(BigDecimal value) {
            addCriterion("declare_customs_money <", value, "declareCustomsMoney");
            return (Criteria) this;
        }

        public Criteria andDeclareCustomsMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("declare_customs_money <=", value, "declareCustomsMoney");
            return (Criteria) this;
        }

        public Criteria andDeclareCustomsMoneyIn(List<BigDecimal> values) {
            addCriterion("declare_customs_money in", values, "declareCustomsMoney");
            return (Criteria) this;
        }

        public Criteria andDeclareCustomsMoneyNotIn(List<BigDecimal> values) {
            addCriterion("declare_customs_money not in", values, "declareCustomsMoney");
            return (Criteria) this;
        }

        public Criteria andDeclareCustomsMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("declare_customs_money between", value1, value2, "declareCustomsMoney");
            return (Criteria) this;
        }

        public Criteria andDeclareCustomsMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("declare_customs_money not between", value1, value2, "declareCustomsMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyIsNull() {
            addCriterion("trade_money is null");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyIsNotNull() {
            addCriterion("trade_money is not null");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyEqualTo(BigDecimal value) {
            addCriterion("trade_money =", value, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyNotEqualTo(BigDecimal value) {
            addCriterion("trade_money <>", value, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyGreaterThan(BigDecimal value) {
            addCriterion("trade_money >", value, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("trade_money >=", value, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyLessThan(BigDecimal value) {
            addCriterion("trade_money <", value, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("trade_money <=", value, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyIn(List<BigDecimal> values) {
            addCriterion("trade_money in", values, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyNotIn(List<BigDecimal> values) {
            addCriterion("trade_money not in", values, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trade_money between", value1, value2, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trade_money not between", value1, value2, "tradeMoney");
            return (Criteria) this;
        }

        public Criteria andDirectTransferMoneyIsNull() {
            addCriterion("direct_transfer_money is null");
            return (Criteria) this;
        }

        public Criteria andDirectTransferMoneyIsNotNull() {
            addCriterion("direct_transfer_money is not null");
            return (Criteria) this;
        }

        public Criteria andDirectTransferMoneyEqualTo(BigDecimal value) {
            addCriterion("direct_transfer_money =", value, "directTransferMoney");
            return (Criteria) this;
        }

        public Criteria andDirectTransferMoneyNotEqualTo(BigDecimal value) {
            addCriterion("direct_transfer_money <>", value, "directTransferMoney");
            return (Criteria) this;
        }

        public Criteria andDirectTransferMoneyGreaterThan(BigDecimal value) {
            addCriterion("direct_transfer_money >", value, "directTransferMoney");
            return (Criteria) this;
        }

        public Criteria andDirectTransferMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("direct_transfer_money >=", value, "directTransferMoney");
            return (Criteria) this;
        }

        public Criteria andDirectTransferMoneyLessThan(BigDecimal value) {
            addCriterion("direct_transfer_money <", value, "directTransferMoney");
            return (Criteria) this;
        }

        public Criteria andDirectTransferMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("direct_transfer_money <=", value, "directTransferMoney");
            return (Criteria) this;
        }

        public Criteria andDirectTransferMoneyIn(List<BigDecimal> values) {
            addCriterion("direct_transfer_money in", values, "directTransferMoney");
            return (Criteria) this;
        }

        public Criteria andDirectTransferMoneyNotIn(List<BigDecimal> values) {
            addCriterion("direct_transfer_money not in", values, "directTransferMoney");
            return (Criteria) this;
        }

        public Criteria andDirectTransferMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("direct_transfer_money between", value1, value2, "directTransferMoney");
            return (Criteria) this;
        }

        public Criteria andDirectTransferMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("direct_transfer_money not between", value1, value2, "directTransferMoney");
            return (Criteria) this;
        }

        public Criteria andIndirectTransferMoneyIsNull() {
            addCriterion("indirect_transfer_money is null");
            return (Criteria) this;
        }

        public Criteria andIndirectTransferMoneyIsNotNull() {
            addCriterion("indirect_transfer_money is not null");
            return (Criteria) this;
        }

        public Criteria andIndirectTransferMoneyEqualTo(BigDecimal value) {
            addCriterion("indirect_transfer_money =", value, "indirectTransferMoney");
            return (Criteria) this;
        }

        public Criteria andIndirectTransferMoneyNotEqualTo(BigDecimal value) {
            addCriterion("indirect_transfer_money <>", value, "indirectTransferMoney");
            return (Criteria) this;
        }

        public Criteria andIndirectTransferMoneyGreaterThan(BigDecimal value) {
            addCriterion("indirect_transfer_money >", value, "indirectTransferMoney");
            return (Criteria) this;
        }

        public Criteria andIndirectTransferMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("indirect_transfer_money >=", value, "indirectTransferMoney");
            return (Criteria) this;
        }

        public Criteria andIndirectTransferMoneyLessThan(BigDecimal value) {
            addCriterion("indirect_transfer_money <", value, "indirectTransferMoney");
            return (Criteria) this;
        }

        public Criteria andIndirectTransferMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("indirect_transfer_money <=", value, "indirectTransferMoney");
            return (Criteria) this;
        }

        public Criteria andIndirectTransferMoneyIn(List<BigDecimal> values) {
            addCriterion("indirect_transfer_money in", values, "indirectTransferMoney");
            return (Criteria) this;
        }

        public Criteria andIndirectTransferMoneyNotIn(List<BigDecimal> values) {
            addCriterion("indirect_transfer_money not in", values, "indirectTransferMoney");
            return (Criteria) this;
        }

        public Criteria andIndirectTransferMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("indirect_transfer_money between", value1, value2, "indirectTransferMoney");
            return (Criteria) this;
        }

        public Criteria andIndirectTransferMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("indirect_transfer_money not between", value1, value2, "indirectTransferMoney");
            return (Criteria) this;
        }

        public Criteria andClearCustomsMoneyIsNull() {
            addCriterion("clear_customs_money is null");
            return (Criteria) this;
        }

        public Criteria andClearCustomsMoneyIsNotNull() {
            addCriterion("clear_customs_money is not null");
            return (Criteria) this;
        }

        public Criteria andClearCustomsMoneyEqualTo(BigDecimal value) {
            addCriterion("clear_customs_money =", value, "clearCustomsMoney");
            return (Criteria) this;
        }

        public Criteria andClearCustomsMoneyNotEqualTo(BigDecimal value) {
            addCriterion("clear_customs_money <>", value, "clearCustomsMoney");
            return (Criteria) this;
        }

        public Criteria andClearCustomsMoneyGreaterThan(BigDecimal value) {
            addCriterion("clear_customs_money >", value, "clearCustomsMoney");
            return (Criteria) this;
        }

        public Criteria andClearCustomsMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("clear_customs_money >=", value, "clearCustomsMoney");
            return (Criteria) this;
        }

        public Criteria andClearCustomsMoneyLessThan(BigDecimal value) {
            addCriterion("clear_customs_money <", value, "clearCustomsMoney");
            return (Criteria) this;
        }

        public Criteria andClearCustomsMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("clear_customs_money <=", value, "clearCustomsMoney");
            return (Criteria) this;
        }

        public Criteria andClearCustomsMoneyIn(List<BigDecimal> values) {
            addCriterion("clear_customs_money in", values, "clearCustomsMoney");
            return (Criteria) this;
        }

        public Criteria andClearCustomsMoneyNotIn(List<BigDecimal> values) {
            addCriterion("clear_customs_money not in", values, "clearCustomsMoney");
            return (Criteria) this;
        }

        public Criteria andClearCustomsMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("clear_customs_money between", value1, value2, "clearCustomsMoney");
            return (Criteria) this;
        }

        public Criteria andClearCustomsMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("clear_customs_money not between", value1, value2, "clearCustomsMoney");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNull() {
            addCriterion("pay_method is null");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNotNull() {
            addCriterion("pay_method is not null");
            return (Criteria) this;
        }

        public Criteria andPayMethodEqualTo(Short value) {
            addCriterion("pay_method =", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotEqualTo(Short value) {
            addCriterion("pay_method <>", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThan(Short value) {
            addCriterion("pay_method >", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThanOrEqualTo(Short value) {
            addCriterion("pay_method >=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThan(Short value) {
            addCriterion("pay_method <", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThanOrEqualTo(Short value) {
            addCriterion("pay_method <=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodIn(List<Short> values) {
            addCriterion("pay_method in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotIn(List<Short> values) {
            addCriterion("pay_method not in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodBetween(Short value1, Short value2) {
            addCriterion("pay_method between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotBetween(Short value1, Short value2) {
            addCriterion("pay_method not between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andShippingBatchIsNull() {
            addCriterion("shipping_batch is null");
            return (Criteria) this;
        }

        public Criteria andShippingBatchIsNotNull() {
            addCriterion("shipping_batch is not null");
            return (Criteria) this;
        }

        public Criteria andShippingBatchEqualTo(String value) {
            addCriterion("shipping_batch =", value, "shippingBatch");
            return (Criteria) this;
        }

        public Criteria andShippingBatchNotEqualTo(String value) {
            addCriterion("shipping_batch <>", value, "shippingBatch");
            return (Criteria) this;
        }

        public Criteria andShippingBatchGreaterThan(String value) {
            addCriterion("shipping_batch >", value, "shippingBatch");
            return (Criteria) this;
        }

        public Criteria andShippingBatchGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_batch >=", value, "shippingBatch");
            return (Criteria) this;
        }

        public Criteria andShippingBatchLessThan(String value) {
            addCriterion("shipping_batch <", value, "shippingBatch");
            return (Criteria) this;
        }

        public Criteria andShippingBatchLessThanOrEqualTo(String value) {
            addCriterion("shipping_batch <=", value, "shippingBatch");
            return (Criteria) this;
        }

        public Criteria andShippingBatchLike(String value) {
            addCriterion("shipping_batch like", value, "shippingBatch");
            return (Criteria) this;
        }

        public Criteria andShippingBatchNotLike(String value) {
            addCriterion("shipping_batch not like", value, "shippingBatch");
            return (Criteria) this;
        }

        public Criteria andShippingBatchIn(List<String> values) {
            addCriterion("shipping_batch in", values, "shippingBatch");
            return (Criteria) this;
        }

        public Criteria andShippingBatchNotIn(List<String> values) {
            addCriterion("shipping_batch not in", values, "shippingBatch");
            return (Criteria) this;
        }

        public Criteria andShippingBatchBetween(String value1, String value2) {
            addCriterion("shipping_batch between", value1, value2, "shippingBatch");
            return (Criteria) this;
        }

        public Criteria andShippingBatchNotBetween(String value1, String value2) {
            addCriterion("shipping_batch not between", value1, value2, "shippingBatch");
            return (Criteria) this;
        }

        public Criteria andMoreBatchExplainIsNull() {
            addCriterion("more_batch_explain is null");
            return (Criteria) this;
        }

        public Criteria andMoreBatchExplainIsNotNull() {
            addCriterion("more_batch_explain is not null");
            return (Criteria) this;
        }

        public Criteria andMoreBatchExplainEqualTo(String value) {
            addCriterion("more_batch_explain =", value, "moreBatchExplain");
            return (Criteria) this;
        }

        public Criteria andMoreBatchExplainNotEqualTo(String value) {
            addCriterion("more_batch_explain <>", value, "moreBatchExplain");
            return (Criteria) this;
        }

        public Criteria andMoreBatchExplainGreaterThan(String value) {
            addCriterion("more_batch_explain >", value, "moreBatchExplain");
            return (Criteria) this;
        }

        public Criteria andMoreBatchExplainGreaterThanOrEqualTo(String value) {
            addCriterion("more_batch_explain >=", value, "moreBatchExplain");
            return (Criteria) this;
        }

        public Criteria andMoreBatchExplainLessThan(String value) {
            addCriterion("more_batch_explain <", value, "moreBatchExplain");
            return (Criteria) this;
        }

        public Criteria andMoreBatchExplainLessThanOrEqualTo(String value) {
            addCriterion("more_batch_explain <=", value, "moreBatchExplain");
            return (Criteria) this;
        }

        public Criteria andMoreBatchExplainLike(String value) {
            addCriterion("more_batch_explain like", value, "moreBatchExplain");
            return (Criteria) this;
        }

        public Criteria andMoreBatchExplainNotLike(String value) {
            addCriterion("more_batch_explain not like", value, "moreBatchExplain");
            return (Criteria) this;
        }

        public Criteria andMoreBatchExplainIn(List<String> values) {
            addCriterion("more_batch_explain in", values, "moreBatchExplain");
            return (Criteria) this;
        }

        public Criteria andMoreBatchExplainNotIn(List<String> values) {
            addCriterion("more_batch_explain not in", values, "moreBatchExplain");
            return (Criteria) this;
        }

        public Criteria andMoreBatchExplainBetween(String value1, String value2) {
            addCriterion("more_batch_explain between", value1, value2, "moreBatchExplain");
            return (Criteria) this;
        }

        public Criteria andMoreBatchExplainNotBetween(String value1, String value2) {
            addCriterion("more_batch_explain not between", value1, value2, "moreBatchExplain");
            return (Criteria) this;
        }

        public Criteria andIsDangerousIsNull() {
            addCriterion("is_dangerous is null");
            return (Criteria) this;
        }

        public Criteria andIsDangerousIsNotNull() {
            addCriterion("is_dangerous is not null");
            return (Criteria) this;
        }

        public Criteria andIsDangerousEqualTo(Short value) {
            addCriterion("is_dangerous =", value, "isDangerous");
            return (Criteria) this;
        }

        public Criteria andIsDangerousNotEqualTo(Short value) {
            addCriterion("is_dangerous <>", value, "isDangerous");
            return (Criteria) this;
        }

        public Criteria andIsDangerousGreaterThan(Short value) {
            addCriterion("is_dangerous >", value, "isDangerous");
            return (Criteria) this;
        }

        public Criteria andIsDangerousGreaterThanOrEqualTo(Short value) {
            addCriterion("is_dangerous >=", value, "isDangerous");
            return (Criteria) this;
        }

        public Criteria andIsDangerousLessThan(Short value) {
            addCriterion("is_dangerous <", value, "isDangerous");
            return (Criteria) this;
        }

        public Criteria andIsDangerousLessThanOrEqualTo(Short value) {
            addCriterion("is_dangerous <=", value, "isDangerous");
            return (Criteria) this;
        }

        public Criteria andIsDangerousIn(List<Short> values) {
            addCriterion("is_dangerous in", values, "isDangerous");
            return (Criteria) this;
        }

        public Criteria andIsDangerousNotIn(List<Short> values) {
            addCriterion("is_dangerous not in", values, "isDangerous");
            return (Criteria) this;
        }

        public Criteria andIsDangerousBetween(Short value1, Short value2) {
            addCriterion("is_dangerous between", value1, value2, "isDangerous");
            return (Criteria) this;
        }

        public Criteria andIsDangerousNotBetween(Short value1, Short value2) {
            addCriterion("is_dangerous not between", value1, value2, "isDangerous");
            return (Criteria) this;
        }

        public Criteria andGoodsDepositPlaceIsNull() {
            addCriterion("goods_deposit_place is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDepositPlaceIsNotNull() {
            addCriterion("goods_deposit_place is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDepositPlaceEqualTo(String value) {
            addCriterion("goods_deposit_place =", value, "goodsDepositPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsDepositPlaceNotEqualTo(String value) {
            addCriterion("goods_deposit_place <>", value, "goodsDepositPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsDepositPlaceGreaterThan(String value) {
            addCriterion("goods_deposit_place >", value, "goodsDepositPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsDepositPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("goods_deposit_place >=", value, "goodsDepositPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsDepositPlaceLessThan(String value) {
            addCriterion("goods_deposit_place <", value, "goodsDepositPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsDepositPlaceLessThanOrEqualTo(String value) {
            addCriterion("goods_deposit_place <=", value, "goodsDepositPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsDepositPlaceLike(String value) {
            addCriterion("goods_deposit_place like", value, "goodsDepositPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsDepositPlaceNotLike(String value) {
            addCriterion("goods_deposit_place not like", value, "goodsDepositPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsDepositPlaceIn(List<String> values) {
            addCriterion("goods_deposit_place in", values, "goodsDepositPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsDepositPlaceNotIn(List<String> values) {
            addCriterion("goods_deposit_place not in", values, "goodsDepositPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsDepositPlaceBetween(String value1, String value2) {
            addCriterion("goods_deposit_place between", value1, value2, "goodsDepositPlace");
            return (Criteria) this;
        }

        public Criteria andGoodsDepositPlaceNotBetween(String value1, String value2) {
            addCriterion("goods_deposit_place not between", value1, value2, "goodsDepositPlace");
            return (Criteria) this;
        }

        public Criteria andHasInsuranceIsNull() {
            addCriterion("has_insurance is null");
            return (Criteria) this;
        }

        public Criteria andHasInsuranceIsNotNull() {
            addCriterion("has_insurance is not null");
            return (Criteria) this;
        }

        public Criteria andHasInsuranceEqualTo(Short value) {
            addCriterion("has_insurance =", value, "hasInsurance");
            return (Criteria) this;
        }

        public Criteria andHasInsuranceNotEqualTo(Short value) {
            addCriterion("has_insurance <>", value, "hasInsurance");
            return (Criteria) this;
        }

        public Criteria andHasInsuranceGreaterThan(Short value) {
            addCriterion("has_insurance >", value, "hasInsurance");
            return (Criteria) this;
        }

        public Criteria andHasInsuranceGreaterThanOrEqualTo(Short value) {
            addCriterion("has_insurance >=", value, "hasInsurance");
            return (Criteria) this;
        }

        public Criteria andHasInsuranceLessThan(Short value) {
            addCriterion("has_insurance <", value, "hasInsurance");
            return (Criteria) this;
        }

        public Criteria andHasInsuranceLessThanOrEqualTo(Short value) {
            addCriterion("has_insurance <=", value, "hasInsurance");
            return (Criteria) this;
        }

        public Criteria andHasInsuranceIn(List<Short> values) {
            addCriterion("has_insurance in", values, "hasInsurance");
            return (Criteria) this;
        }

        public Criteria andHasInsuranceNotIn(List<Short> values) {
            addCriterion("has_insurance not in", values, "hasInsurance");
            return (Criteria) this;
        }

        public Criteria andHasInsuranceBetween(Short value1, Short value2) {
            addCriterion("has_insurance between", value1, value2, "hasInsurance");
            return (Criteria) this;
        }

        public Criteria andHasInsuranceNotBetween(Short value1, Short value2) {
            addCriterion("has_insurance not between", value1, value2, "hasInsurance");
            return (Criteria) this;
        }

        public Criteria andBusinessLeaderIdIsNull() {
            addCriterion("business_leader_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLeaderIdIsNotNull() {
            addCriterion("business_leader_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLeaderIdEqualTo(Long value) {
            addCriterion("business_leader_id =", value, "businessLeaderId");
            return (Criteria) this;
        }

        public Criteria andBusinessLeaderIdNotEqualTo(Long value) {
            addCriterion("business_leader_id <>", value, "businessLeaderId");
            return (Criteria) this;
        }

        public Criteria andBusinessLeaderIdGreaterThan(Long value) {
            addCriterion("business_leader_id >", value, "businessLeaderId");
            return (Criteria) this;
        }

        public Criteria andBusinessLeaderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("business_leader_id >=", value, "businessLeaderId");
            return (Criteria) this;
        }

        public Criteria andBusinessLeaderIdLessThan(Long value) {
            addCriterion("business_leader_id <", value, "businessLeaderId");
            return (Criteria) this;
        }

        public Criteria andBusinessLeaderIdLessThanOrEqualTo(Long value) {
            addCriterion("business_leader_id <=", value, "businessLeaderId");
            return (Criteria) this;
        }

        public Criteria andBusinessLeaderIdIn(List<Long> values) {
            addCriterion("business_leader_id in", values, "businessLeaderId");
            return (Criteria) this;
        }

        public Criteria andBusinessLeaderIdNotIn(List<Long> values) {
            addCriterion("business_leader_id not in", values, "businessLeaderId");
            return (Criteria) this;
        }

        public Criteria andBusinessLeaderIdBetween(Long value1, Long value2) {
            addCriterion("business_leader_id between", value1, value2, "businessLeaderId");
            return (Criteria) this;
        }

        public Criteria andBusinessLeaderIdNotBetween(Long value1, Long value2) {
            addCriterion("business_leader_id not between", value1, value2, "businessLeaderId");
            return (Criteria) this;
        }

        public Criteria andBusinessLeaderIsNull() {
            addCriterion("business_leader is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLeaderIsNotNull() {
            addCriterion("business_leader is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLeaderEqualTo(String value) {
            addCriterion("business_leader =", value, "businessLeader");
            return (Criteria) this;
        }

        public Criteria andBusinessLeaderNotEqualTo(String value) {
            addCriterion("business_leader <>", value, "businessLeader");
            return (Criteria) this;
        }

        public Criteria andBusinessLeaderGreaterThan(String value) {
            addCriterion("business_leader >", value, "businessLeader");
            return (Criteria) this;
        }

        public Criteria andBusinessLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("business_leader >=", value, "businessLeader");
            return (Criteria) this;
        }

        public Criteria andBusinessLeaderLessThan(String value) {
            addCriterion("business_leader <", value, "businessLeader");
            return (Criteria) this;
        }

        public Criteria andBusinessLeaderLessThanOrEqualTo(String value) {
            addCriterion("business_leader <=", value, "businessLeader");
            return (Criteria) this;
        }

        public Criteria andBusinessLeaderLike(String value) {
            addCriterion("business_leader like", value, "businessLeader");
            return (Criteria) this;
        }

        public Criteria andBusinessLeaderNotLike(String value) {
            addCriterion("business_leader not like", value, "businessLeader");
            return (Criteria) this;
        }

        public Criteria andBusinessLeaderIn(List<String> values) {
            addCriterion("business_leader in", values, "businessLeader");
            return (Criteria) this;
        }

        public Criteria andBusinessLeaderNotIn(List<String> values) {
            addCriterion("business_leader not in", values, "businessLeader");
            return (Criteria) this;
        }

        public Criteria andBusinessLeaderBetween(String value1, String value2) {
            addCriterion("business_leader between", value1, value2, "businessLeader");
            return (Criteria) this;
        }

        public Criteria andBusinessLeaderNotBetween(String value1, String value2) {
            addCriterion("business_leader not between", value1, value2, "businessLeader");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusIsNull() {
            addCriterion("auditing_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusIsNotNull() {
            addCriterion("auditing_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusEqualTo(Short value) {
            addCriterion("auditing_status =", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusNotEqualTo(Short value) {
            addCriterion("auditing_status <>", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusGreaterThan(Short value) {
            addCriterion("auditing_status >", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("auditing_status >=", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusLessThan(Short value) {
            addCriterion("auditing_status <", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusLessThanOrEqualTo(Short value) {
            addCriterion("auditing_status <=", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusIn(List<Short> values) {
            addCriterion("auditing_status in", values, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusNotIn(List<Short> values) {
            addCriterion("auditing_status not in", values, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusBetween(Short value1, Short value2) {
            addCriterion("auditing_status between", value1, value2, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusNotBetween(Short value1, Short value2) {
            addCriterion("auditing_status not between", value1, value2, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andCrmCodeIsNull() {
            addCriterion("crm_code is null");
            return (Criteria) this;
        }

        public Criteria andCrmCodeIsNotNull() {
            addCriterion("crm_code is not null");
            return (Criteria) this;
        }

        public Criteria andCrmCodeEqualTo(String value) {
            addCriterion("crm_code =", value, "crmCode");
            return (Criteria) this;
        }

        public Criteria andCrmCodeNotEqualTo(String value) {
            addCriterion("crm_code <>", value, "crmCode");
            return (Criteria) this;
        }

        public Criteria andCrmCodeGreaterThan(String value) {
            addCriterion("crm_code >", value, "crmCode");
            return (Criteria) this;
        }

        public Criteria andCrmCodeGreaterThanOrEqualTo(String value) {
            addCriterion("crm_code >=", value, "crmCode");
            return (Criteria) this;
        }

        public Criteria andCrmCodeLessThan(String value) {
            addCriterion("crm_code <", value, "crmCode");
            return (Criteria) this;
        }

        public Criteria andCrmCodeLessThanOrEqualTo(String value) {
            addCriterion("crm_code <=", value, "crmCode");
            return (Criteria) this;
        }

        public Criteria andCrmCodeLike(String value) {
            addCriterion("crm_code like", value, "crmCode");
            return (Criteria) this;
        }

        public Criteria andCrmCodeNotLike(String value) {
            addCriterion("crm_code not like", value, "crmCode");
            return (Criteria) this;
        }

        public Criteria andCrmCodeIn(List<String> values) {
            addCriterion("crm_code in", values, "crmCode");
            return (Criteria) this;
        }

        public Criteria andCrmCodeNotIn(List<String> values) {
            addCriterion("crm_code not in", values, "crmCode");
            return (Criteria) this;
        }

        public Criteria andCrmCodeBetween(String value1, String value2) {
            addCriterion("crm_code between", value1, value2, "crmCode");
            return (Criteria) this;
        }

        public Criteria andCrmCodeNotBetween(String value1, String value2) {
            addCriterion("crm_code not between", value1, value2, "crmCode");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("dept_name is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("dept_name =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("dept_name <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("dept_name >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("dept_name >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("dept_name <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("dept_name <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("dept_name like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("dept_name not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("dept_name in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("dept_name not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("dept_name between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("dept_name not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNull() {
            addCriterion("contract_no is null");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNotNull() {
            addCriterion("contract_no is not null");
            return (Criteria) this;
        }

        public Criteria andContractNoEqualTo(String value) {
            addCriterion("contract_no =", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotEqualTo(String value) {
            addCriterion("contract_no <>", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThan(String value) {
            addCriterion("contract_no >", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThanOrEqualTo(String value) {
            addCriterion("contract_no >=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThan(String value) {
            addCriterion("contract_no <", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThanOrEqualTo(String value) {
            addCriterion("contract_no <=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLike(String value) {
            addCriterion("contract_no like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotLike(String value) {
            addCriterion("contract_no not like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoIn(List<String> values) {
            addCriterion("contract_no in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotIn(List<String> values) {
            addCriterion("contract_no not in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoBetween(String value1, String value2) {
            addCriterion("contract_no between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotBetween(String value1, String value2) {
            addCriterion("contract_no not between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andBookingOfficerIdIsNull() {
            addCriterion("booking_officer_id is null");
            return (Criteria) this;
        }

        public Criteria andBookingOfficerIdIsNotNull() {
            addCriterion("booking_officer_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookingOfficerIdEqualTo(Long value) {
            addCriterion("booking_officer_id =", value, "bookingOfficerId");
            return (Criteria) this;
        }

        public Criteria andBookingOfficerIdNotEqualTo(Long value) {
            addCriterion("booking_officer_id <>", value, "bookingOfficerId");
            return (Criteria) this;
        }

        public Criteria andBookingOfficerIdGreaterThan(Long value) {
            addCriterion("booking_officer_id >", value, "bookingOfficerId");
            return (Criteria) this;
        }

        public Criteria andBookingOfficerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("booking_officer_id >=", value, "bookingOfficerId");
            return (Criteria) this;
        }

        public Criteria andBookingOfficerIdLessThan(Long value) {
            addCriterion("booking_officer_id <", value, "bookingOfficerId");
            return (Criteria) this;
        }

        public Criteria andBookingOfficerIdLessThanOrEqualTo(Long value) {
            addCriterion("booking_officer_id <=", value, "bookingOfficerId");
            return (Criteria) this;
        }

        public Criteria andBookingOfficerIdIn(List<Long> values) {
            addCriterion("booking_officer_id in", values, "bookingOfficerId");
            return (Criteria) this;
        }

        public Criteria andBookingOfficerIdNotIn(List<Long> values) {
            addCriterion("booking_officer_id not in", values, "bookingOfficerId");
            return (Criteria) this;
        }

        public Criteria andBookingOfficerIdBetween(Long value1, Long value2) {
            addCriterion("booking_officer_id between", value1, value2, "bookingOfficerId");
            return (Criteria) this;
        }

        public Criteria andBookingOfficerIdNotBetween(Long value1, Long value2) {
            addCriterion("booking_officer_id not between", value1, value2, "bookingOfficerId");
            return (Criteria) this;
        }

        public Criteria andOperationSpecialistIdIsNull() {
            addCriterion("operation_specialist_id is null");
            return (Criteria) this;
        }

        public Criteria andOperationSpecialistIdIsNotNull() {
            addCriterion("operation_specialist_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperationSpecialistIdEqualTo(Long value) {
            addCriterion("operation_specialist_id =", value, "operationSpecialistId");
            return (Criteria) this;
        }

        public Criteria andOperationSpecialistIdNotEqualTo(Long value) {
            addCriterion("operation_specialist_id <>", value, "operationSpecialistId");
            return (Criteria) this;
        }

        public Criteria andOperationSpecialistIdGreaterThan(Long value) {
            addCriterion("operation_specialist_id >", value, "operationSpecialistId");
            return (Criteria) this;
        }

        public Criteria andOperationSpecialistIdGreaterThanOrEqualTo(Long value) {
            addCriterion("operation_specialist_id >=", value, "operationSpecialistId");
            return (Criteria) this;
        }

        public Criteria andOperationSpecialistIdLessThan(Long value) {
            addCriterion("operation_specialist_id <", value, "operationSpecialistId");
            return (Criteria) this;
        }

        public Criteria andOperationSpecialistIdLessThanOrEqualTo(Long value) {
            addCriterion("operation_specialist_id <=", value, "operationSpecialistId");
            return (Criteria) this;
        }

        public Criteria andOperationSpecialistIdIn(List<Long> values) {
            addCriterion("operation_specialist_id in", values, "operationSpecialistId");
            return (Criteria) this;
        }

        public Criteria andOperationSpecialistIdNotIn(List<Long> values) {
            addCriterion("operation_specialist_id not in", values, "operationSpecialistId");
            return (Criteria) this;
        }

        public Criteria andOperationSpecialistIdBetween(Long value1, Long value2) {
            addCriterion("operation_specialist_id between", value1, value2, "operationSpecialistId");
            return (Criteria) this;
        }

        public Criteria andOperationSpecialistIdNotBetween(Long value1, Long value2) {
            addCriterion("operation_specialist_id not between", value1, value2, "operationSpecialistId");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeStatusIsNull() {
            addCriterion("deliver_notice_status is null");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeStatusIsNotNull() {
            addCriterion("deliver_notice_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeStatusEqualTo(Short value) {
            addCriterion("deliver_notice_status =", value, "deliverNoticeStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeStatusNotEqualTo(Short value) {
            addCriterion("deliver_notice_status <>", value, "deliverNoticeStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeStatusGreaterThan(Short value) {
            addCriterion("deliver_notice_status >", value, "deliverNoticeStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("deliver_notice_status >=", value, "deliverNoticeStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeStatusLessThan(Short value) {
            addCriterion("deliver_notice_status <", value, "deliverNoticeStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeStatusLessThanOrEqualTo(Short value) {
            addCriterion("deliver_notice_status <=", value, "deliverNoticeStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeStatusIn(List<Short> values) {
            addCriterion("deliver_notice_status in", values, "deliverNoticeStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeStatusNotIn(List<Short> values) {
            addCriterion("deliver_notice_status not in", values, "deliverNoticeStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeStatusBetween(Short value1, Short value2) {
            addCriterion("deliver_notice_status between", value1, value2, "deliverNoticeStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeStatusNotBetween(Short value1, Short value2) {
            addCriterion("deliver_notice_status not between", value1, value2, "deliverNoticeStatus");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNull() {
            addCriterion("submit_time is null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNotNull() {
            addCriterion("submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeEqualTo(Date value) {
            addCriterion("submit_time =", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotEqualTo(Date value) {
            addCriterion("submit_time <>", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThan(Date value) {
            addCriterion("submit_time >", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("submit_time >=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThan(Date value) {
            addCriterion("submit_time <", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("submit_time <=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIn(List<Date> values) {
            addCriterion("submit_time in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotIn(List<Date> values) {
            addCriterion("submit_time not in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("submit_time between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("submit_time not between", value1, value2, "submitTime");
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