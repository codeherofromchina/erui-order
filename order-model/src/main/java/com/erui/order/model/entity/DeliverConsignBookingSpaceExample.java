package com.erui.order.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DeliverConsignBookingSpaceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeliverConsignBookingSpaceExample() {
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

        public Criteria andDeliverConsignIdIsNull() {
            addCriterion("deliver_consign_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignIdIsNotNull() {
            addCriterion("deliver_consign_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignIdEqualTo(Long value) {
            addCriterion("deliver_consign_id =", value, "deliverConsignId");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignIdNotEqualTo(Long value) {
            addCriterion("deliver_consign_id <>", value, "deliverConsignId");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignIdGreaterThan(Long value) {
            addCriterion("deliver_consign_id >", value, "deliverConsignId");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignIdGreaterThanOrEqualTo(Long value) {
            addCriterion("deliver_consign_id >=", value, "deliverConsignId");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignIdLessThan(Long value) {
            addCriterion("deliver_consign_id <", value, "deliverConsignId");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignIdLessThanOrEqualTo(Long value) {
            addCriterion("deliver_consign_id <=", value, "deliverConsignId");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignIdIn(List<Long> values) {
            addCriterion("deliver_consign_id in", values, "deliverConsignId");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignIdNotIn(List<Long> values) {
            addCriterion("deliver_consign_id not in", values, "deliverConsignId");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignIdBetween(Long value1, Long value2) {
            addCriterion("deliver_consign_id between", value1, value2, "deliverConsignId");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignIdNotBetween(Long value1, Long value2) {
            addCriterion("deliver_consign_id not between", value1, value2, "deliverConsignId");
            return (Criteria) this;
        }

        public Criteria andReadyDateIsNull() {
            addCriterion("ready_date is null");
            return (Criteria) this;
        }

        public Criteria andReadyDateIsNotNull() {
            addCriterion("ready_date is not null");
            return (Criteria) this;
        }

        public Criteria andReadyDateEqualTo(Date value) {
            addCriterionForJDBCDate("ready_date =", value, "readyDate");
            return (Criteria) this;
        }

        public Criteria andReadyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ready_date <>", value, "readyDate");
            return (Criteria) this;
        }

        public Criteria andReadyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ready_date >", value, "readyDate");
            return (Criteria) this;
        }

        public Criteria andReadyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ready_date >=", value, "readyDate");
            return (Criteria) this;
        }

        public Criteria andReadyDateLessThan(Date value) {
            addCriterionForJDBCDate("ready_date <", value, "readyDate");
            return (Criteria) this;
        }

        public Criteria andReadyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ready_date <=", value, "readyDate");
            return (Criteria) this;
        }

        public Criteria andReadyDateIn(List<Date> values) {
            addCriterionForJDBCDate("ready_date in", values, "readyDate");
            return (Criteria) this;
        }

        public Criteria andReadyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ready_date not in", values, "readyDate");
            return (Criteria) this;
        }

        public Criteria andReadyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ready_date between", value1, value2, "readyDate");
            return (Criteria) this;
        }

        public Criteria andReadyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ready_date not between", value1, value2, "readyDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateIsNull() {
            addCriterion("arrival_date is null");
            return (Criteria) this;
        }

        public Criteria andArrivalDateIsNotNull() {
            addCriterion("arrival_date is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalDateEqualTo(Date value) {
            addCriterionForJDBCDate("arrival_date =", value, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("arrival_date <>", value, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateGreaterThan(Date value) {
            addCriterionForJDBCDate("arrival_date >", value, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("arrival_date >=", value, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateLessThan(Date value) {
            addCriterionForJDBCDate("arrival_date <", value, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("arrival_date <=", value, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateIn(List<Date> values) {
            addCriterionForJDBCDate("arrival_date in", values, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("arrival_date not in", values, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("arrival_date between", value1, value2, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("arrival_date not between", value1, value2, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andOrderEmergencyIsNull() {
            addCriterion("order_emergency is null");
            return (Criteria) this;
        }

        public Criteria andOrderEmergencyIsNotNull() {
            addCriterion("order_emergency is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEmergencyEqualTo(Integer value) {
            addCriterion("order_emergency =", value, "orderEmergency");
            return (Criteria) this;
        }

        public Criteria andOrderEmergencyNotEqualTo(Integer value) {
            addCriterion("order_emergency <>", value, "orderEmergency");
            return (Criteria) this;
        }

        public Criteria andOrderEmergencyGreaterThan(Integer value) {
            addCriterion("order_emergency >", value, "orderEmergency");
            return (Criteria) this;
        }

        public Criteria andOrderEmergencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_emergency >=", value, "orderEmergency");
            return (Criteria) this;
        }

        public Criteria andOrderEmergencyLessThan(Integer value) {
            addCriterion("order_emergency <", value, "orderEmergency");
            return (Criteria) this;
        }

        public Criteria andOrderEmergencyLessThanOrEqualTo(Integer value) {
            addCriterion("order_emergency <=", value, "orderEmergency");
            return (Criteria) this;
        }

        public Criteria andOrderEmergencyIn(List<Integer> values) {
            addCriterion("order_emergency in", values, "orderEmergency");
            return (Criteria) this;
        }

        public Criteria andOrderEmergencyNotIn(List<Integer> values) {
            addCriterion("order_emergency not in", values, "orderEmergency");
            return (Criteria) this;
        }

        public Criteria andOrderEmergencyBetween(Integer value1, Integer value2) {
            addCriterion("order_emergency between", value1, value2, "orderEmergency");
            return (Criteria) this;
        }

        public Criteria andOrderEmergencyNotBetween(Integer value1, Integer value2) {
            addCriterion("order_emergency not between", value1, value2, "orderEmergency");
            return (Criteria) this;
        }

        public Criteria andPenaltyProvisionIsNull() {
            addCriterion("penalty_provision is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyProvisionIsNotNull() {
            addCriterion("penalty_provision is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyProvisionEqualTo(String value) {
            addCriterion("penalty_provision =", value, "penaltyProvision");
            return (Criteria) this;
        }

        public Criteria andPenaltyProvisionNotEqualTo(String value) {
            addCriterion("penalty_provision <>", value, "penaltyProvision");
            return (Criteria) this;
        }

        public Criteria andPenaltyProvisionGreaterThan(String value) {
            addCriterion("penalty_provision >", value, "penaltyProvision");
            return (Criteria) this;
        }

        public Criteria andPenaltyProvisionGreaterThanOrEqualTo(String value) {
            addCriterion("penalty_provision >=", value, "penaltyProvision");
            return (Criteria) this;
        }

        public Criteria andPenaltyProvisionLessThan(String value) {
            addCriterion("penalty_provision <", value, "penaltyProvision");
            return (Criteria) this;
        }

        public Criteria andPenaltyProvisionLessThanOrEqualTo(String value) {
            addCriterion("penalty_provision <=", value, "penaltyProvision");
            return (Criteria) this;
        }

        public Criteria andPenaltyProvisionLike(String value) {
            addCriterion("penalty_provision like", value, "penaltyProvision");
            return (Criteria) this;
        }

        public Criteria andPenaltyProvisionNotLike(String value) {
            addCriterion("penalty_provision not like", value, "penaltyProvision");
            return (Criteria) this;
        }

        public Criteria andPenaltyProvisionIn(List<String> values) {
            addCriterion("penalty_provision in", values, "penaltyProvision");
            return (Criteria) this;
        }

        public Criteria andPenaltyProvisionNotIn(List<String> values) {
            addCriterion("penalty_provision not in", values, "penaltyProvision");
            return (Criteria) this;
        }

        public Criteria andPenaltyProvisionBetween(String value1, String value2) {
            addCriterion("penalty_provision between", value1, value2, "penaltyProvision");
            return (Criteria) this;
        }

        public Criteria andPenaltyProvisionNotBetween(String value1, String value2) {
            addCriterion("penalty_provision not between", value1, value2, "penaltyProvision");
            return (Criteria) this;
        }

        public Criteria andRequiredDocIsNull() {
            addCriterion("required_doc is null");
            return (Criteria) this;
        }

        public Criteria andRequiredDocIsNotNull() {
            addCriterion("required_doc is not null");
            return (Criteria) this;
        }

        public Criteria andRequiredDocEqualTo(String value) {
            addCriterion("required_doc =", value, "requiredDoc");
            return (Criteria) this;
        }

        public Criteria andRequiredDocNotEqualTo(String value) {
            addCriterion("required_doc <>", value, "requiredDoc");
            return (Criteria) this;
        }

        public Criteria andRequiredDocGreaterThan(String value) {
            addCriterion("required_doc >", value, "requiredDoc");
            return (Criteria) this;
        }

        public Criteria andRequiredDocGreaterThanOrEqualTo(String value) {
            addCriterion("required_doc >=", value, "requiredDoc");
            return (Criteria) this;
        }

        public Criteria andRequiredDocLessThan(String value) {
            addCriterion("required_doc <", value, "requiredDoc");
            return (Criteria) this;
        }

        public Criteria andRequiredDocLessThanOrEqualTo(String value) {
            addCriterion("required_doc <=", value, "requiredDoc");
            return (Criteria) this;
        }

        public Criteria andRequiredDocLike(String value) {
            addCriterion("required_doc like", value, "requiredDoc");
            return (Criteria) this;
        }

        public Criteria andRequiredDocNotLike(String value) {
            addCriterion("required_doc not like", value, "requiredDoc");
            return (Criteria) this;
        }

        public Criteria andRequiredDocIn(List<String> values) {
            addCriterion("required_doc in", values, "requiredDoc");
            return (Criteria) this;
        }

        public Criteria andRequiredDocNotIn(List<String> values) {
            addCriterion("required_doc not in", values, "requiredDoc");
            return (Criteria) this;
        }

        public Criteria andRequiredDocBetween(String value1, String value2) {
            addCriterion("required_doc between", value1, value2, "requiredDoc");
            return (Criteria) this;
        }

        public Criteria andRequiredDocNotBetween(String value1, String value2) {
            addCriterion("required_doc not between", value1, value2, "requiredDoc");
            return (Criteria) this;
        }

        public Criteria andBillOfPositiveIsNull() {
            addCriterion("bill_of_positive is null");
            return (Criteria) this;
        }

        public Criteria andBillOfPositiveIsNotNull() {
            addCriterion("bill_of_positive is not null");
            return (Criteria) this;
        }

        public Criteria andBillOfPositiveEqualTo(Integer value) {
            addCriterion("bill_of_positive =", value, "billOfPositive");
            return (Criteria) this;
        }

        public Criteria andBillOfPositiveNotEqualTo(Integer value) {
            addCriterion("bill_of_positive <>", value, "billOfPositive");
            return (Criteria) this;
        }

        public Criteria andBillOfPositiveGreaterThan(Integer value) {
            addCriterion("bill_of_positive >", value, "billOfPositive");
            return (Criteria) this;
        }

        public Criteria andBillOfPositiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_of_positive >=", value, "billOfPositive");
            return (Criteria) this;
        }

        public Criteria andBillOfPositiveLessThan(Integer value) {
            addCriterion("bill_of_positive <", value, "billOfPositive");
            return (Criteria) this;
        }

        public Criteria andBillOfPositiveLessThanOrEqualTo(Integer value) {
            addCriterion("bill_of_positive <=", value, "billOfPositive");
            return (Criteria) this;
        }

        public Criteria andBillOfPositiveIn(List<Integer> values) {
            addCriterion("bill_of_positive in", values, "billOfPositive");
            return (Criteria) this;
        }

        public Criteria andBillOfPositiveNotIn(List<Integer> values) {
            addCriterion("bill_of_positive not in", values, "billOfPositive");
            return (Criteria) this;
        }

        public Criteria andBillOfPositiveBetween(Integer value1, Integer value2) {
            addCriterion("bill_of_positive between", value1, value2, "billOfPositive");
            return (Criteria) this;
        }

        public Criteria andBillOfPositiveNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_of_positive not between", value1, value2, "billOfPositive");
            return (Criteria) this;
        }

        public Criteria andBillOfViceIsNull() {
            addCriterion("bill_of_vice is null");
            return (Criteria) this;
        }

        public Criteria andBillOfViceIsNotNull() {
            addCriterion("bill_of_vice is not null");
            return (Criteria) this;
        }

        public Criteria andBillOfViceEqualTo(Integer value) {
            addCriterion("bill_of_vice =", value, "billOfVice");
            return (Criteria) this;
        }

        public Criteria andBillOfViceNotEqualTo(Integer value) {
            addCriterion("bill_of_vice <>", value, "billOfVice");
            return (Criteria) this;
        }

        public Criteria andBillOfViceGreaterThan(Integer value) {
            addCriterion("bill_of_vice >", value, "billOfVice");
            return (Criteria) this;
        }

        public Criteria andBillOfViceGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_of_vice >=", value, "billOfVice");
            return (Criteria) this;
        }

        public Criteria andBillOfViceLessThan(Integer value) {
            addCriterion("bill_of_vice <", value, "billOfVice");
            return (Criteria) this;
        }

        public Criteria andBillOfViceLessThanOrEqualTo(Integer value) {
            addCriterion("bill_of_vice <=", value, "billOfVice");
            return (Criteria) this;
        }

        public Criteria andBillOfViceIn(List<Integer> values) {
            addCriterion("bill_of_vice in", values, "billOfVice");
            return (Criteria) this;
        }

        public Criteria andBillOfViceNotIn(List<Integer> values) {
            addCriterion("bill_of_vice not in", values, "billOfVice");
            return (Criteria) this;
        }

        public Criteria andBillOfViceBetween(Integer value1, Integer value2) {
            addCriterion("bill_of_vice between", value1, value2, "billOfVice");
            return (Criteria) this;
        }

        public Criteria andBillOfViceNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_of_vice not between", value1, value2, "billOfVice");
            return (Criteria) this;
        }

        public Criteria andBoxListPositiveIsNull() {
            addCriterion("box_list_positive is null");
            return (Criteria) this;
        }

        public Criteria andBoxListPositiveIsNotNull() {
            addCriterion("box_list_positive is not null");
            return (Criteria) this;
        }

        public Criteria andBoxListPositiveEqualTo(Integer value) {
            addCriterion("box_list_positive =", value, "boxListPositive");
            return (Criteria) this;
        }

        public Criteria andBoxListPositiveNotEqualTo(Integer value) {
            addCriterion("box_list_positive <>", value, "boxListPositive");
            return (Criteria) this;
        }

        public Criteria andBoxListPositiveGreaterThan(Integer value) {
            addCriterion("box_list_positive >", value, "boxListPositive");
            return (Criteria) this;
        }

        public Criteria andBoxListPositiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("box_list_positive >=", value, "boxListPositive");
            return (Criteria) this;
        }

        public Criteria andBoxListPositiveLessThan(Integer value) {
            addCriterion("box_list_positive <", value, "boxListPositive");
            return (Criteria) this;
        }

        public Criteria andBoxListPositiveLessThanOrEqualTo(Integer value) {
            addCriterion("box_list_positive <=", value, "boxListPositive");
            return (Criteria) this;
        }

        public Criteria andBoxListPositiveIn(List<Integer> values) {
            addCriterion("box_list_positive in", values, "boxListPositive");
            return (Criteria) this;
        }

        public Criteria andBoxListPositiveNotIn(List<Integer> values) {
            addCriterion("box_list_positive not in", values, "boxListPositive");
            return (Criteria) this;
        }

        public Criteria andBoxListPositiveBetween(Integer value1, Integer value2) {
            addCriterion("box_list_positive between", value1, value2, "boxListPositive");
            return (Criteria) this;
        }

        public Criteria andBoxListPositiveNotBetween(Integer value1, Integer value2) {
            addCriterion("box_list_positive not between", value1, value2, "boxListPositive");
            return (Criteria) this;
        }

        public Criteria andBoxListViceIsNull() {
            addCriterion("box_list_vice is null");
            return (Criteria) this;
        }

        public Criteria andBoxListViceIsNotNull() {
            addCriterion("box_list_vice is not null");
            return (Criteria) this;
        }

        public Criteria andBoxListViceEqualTo(Integer value) {
            addCriterion("box_list_vice =", value, "boxListVice");
            return (Criteria) this;
        }

        public Criteria andBoxListViceNotEqualTo(Integer value) {
            addCriterion("box_list_vice <>", value, "boxListVice");
            return (Criteria) this;
        }

        public Criteria andBoxListViceGreaterThan(Integer value) {
            addCriterion("box_list_vice >", value, "boxListVice");
            return (Criteria) this;
        }

        public Criteria andBoxListViceGreaterThanOrEqualTo(Integer value) {
            addCriterion("box_list_vice >=", value, "boxListVice");
            return (Criteria) this;
        }

        public Criteria andBoxListViceLessThan(Integer value) {
            addCriterion("box_list_vice <", value, "boxListVice");
            return (Criteria) this;
        }

        public Criteria andBoxListViceLessThanOrEqualTo(Integer value) {
            addCriterion("box_list_vice <=", value, "boxListVice");
            return (Criteria) this;
        }

        public Criteria andBoxListViceIn(List<Integer> values) {
            addCriterion("box_list_vice in", values, "boxListVice");
            return (Criteria) this;
        }

        public Criteria andBoxListViceNotIn(List<Integer> values) {
            addCriterion("box_list_vice not in", values, "boxListVice");
            return (Criteria) this;
        }

        public Criteria andBoxListViceBetween(Integer value1, Integer value2) {
            addCriterion("box_list_vice between", value1, value2, "boxListVice");
            return (Criteria) this;
        }

        public Criteria andBoxListViceNotBetween(Integer value1, Integer value2) {
            addCriterion("box_list_vice not between", value1, value2, "boxListVice");
            return (Criteria) this;
        }

        public Criteria andInvoicePositiveIsNull() {
            addCriterion("invoice_positive is null");
            return (Criteria) this;
        }

        public Criteria andInvoicePositiveIsNotNull() {
            addCriterion("invoice_positive is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicePositiveEqualTo(Integer value) {
            addCriterion("invoice_positive =", value, "invoicePositive");
            return (Criteria) this;
        }

        public Criteria andInvoicePositiveNotEqualTo(Integer value) {
            addCriterion("invoice_positive <>", value, "invoicePositive");
            return (Criteria) this;
        }

        public Criteria andInvoicePositiveGreaterThan(Integer value) {
            addCriterion("invoice_positive >", value, "invoicePositive");
            return (Criteria) this;
        }

        public Criteria andInvoicePositiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("invoice_positive >=", value, "invoicePositive");
            return (Criteria) this;
        }

        public Criteria andInvoicePositiveLessThan(Integer value) {
            addCriterion("invoice_positive <", value, "invoicePositive");
            return (Criteria) this;
        }

        public Criteria andInvoicePositiveLessThanOrEqualTo(Integer value) {
            addCriterion("invoice_positive <=", value, "invoicePositive");
            return (Criteria) this;
        }

        public Criteria andInvoicePositiveIn(List<Integer> values) {
            addCriterion("invoice_positive in", values, "invoicePositive");
            return (Criteria) this;
        }

        public Criteria andInvoicePositiveNotIn(List<Integer> values) {
            addCriterion("invoice_positive not in", values, "invoicePositive");
            return (Criteria) this;
        }

        public Criteria andInvoicePositiveBetween(Integer value1, Integer value2) {
            addCriterion("invoice_positive between", value1, value2, "invoicePositive");
            return (Criteria) this;
        }

        public Criteria andInvoicePositiveNotBetween(Integer value1, Integer value2) {
            addCriterion("invoice_positive not between", value1, value2, "invoicePositive");
            return (Criteria) this;
        }

        public Criteria andInvoiceViceIsNull() {
            addCriterion("invoice_vice is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceViceIsNotNull() {
            addCriterion("invoice_vice is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceViceEqualTo(Integer value) {
            addCriterion("invoice_vice =", value, "invoiceVice");
            return (Criteria) this;
        }

        public Criteria andInvoiceViceNotEqualTo(Integer value) {
            addCriterion("invoice_vice <>", value, "invoiceVice");
            return (Criteria) this;
        }

        public Criteria andInvoiceViceGreaterThan(Integer value) {
            addCriterion("invoice_vice >", value, "invoiceVice");
            return (Criteria) this;
        }

        public Criteria andInvoiceViceGreaterThanOrEqualTo(Integer value) {
            addCriterion("invoice_vice >=", value, "invoiceVice");
            return (Criteria) this;
        }

        public Criteria andInvoiceViceLessThan(Integer value) {
            addCriterion("invoice_vice <", value, "invoiceVice");
            return (Criteria) this;
        }

        public Criteria andInvoiceViceLessThanOrEqualTo(Integer value) {
            addCriterion("invoice_vice <=", value, "invoiceVice");
            return (Criteria) this;
        }

        public Criteria andInvoiceViceIn(List<Integer> values) {
            addCriterion("invoice_vice in", values, "invoiceVice");
            return (Criteria) this;
        }

        public Criteria andInvoiceViceNotIn(List<Integer> values) {
            addCriterion("invoice_vice not in", values, "invoiceVice");
            return (Criteria) this;
        }

        public Criteria andInvoiceViceBetween(Integer value1, Integer value2) {
            addCriterion("invoice_vice between", value1, value2, "invoiceVice");
            return (Criteria) this;
        }

        public Criteria andInvoiceViceNotBetween(Integer value1, Integer value2) {
            addCriterion("invoice_vice not between", value1, value2, "invoiceVice");
            return (Criteria) this;
        }

        public Criteria andPrimaryOriginIsNull() {
            addCriterion("primary_origin is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryOriginIsNotNull() {
            addCriterion("primary_origin is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryOriginEqualTo(Integer value) {
            addCriterion("primary_origin =", value, "primaryOrigin");
            return (Criteria) this;
        }

        public Criteria andPrimaryOriginNotEqualTo(Integer value) {
            addCriterion("primary_origin <>", value, "primaryOrigin");
            return (Criteria) this;
        }

        public Criteria andPrimaryOriginGreaterThan(Integer value) {
            addCriterion("primary_origin >", value, "primaryOrigin");
            return (Criteria) this;
        }

        public Criteria andPrimaryOriginGreaterThanOrEqualTo(Integer value) {
            addCriterion("primary_origin >=", value, "primaryOrigin");
            return (Criteria) this;
        }

        public Criteria andPrimaryOriginLessThan(Integer value) {
            addCriterion("primary_origin <", value, "primaryOrigin");
            return (Criteria) this;
        }

        public Criteria andPrimaryOriginLessThanOrEqualTo(Integer value) {
            addCriterion("primary_origin <=", value, "primaryOrigin");
            return (Criteria) this;
        }

        public Criteria andPrimaryOriginIn(List<Integer> values) {
            addCriterion("primary_origin in", values, "primaryOrigin");
            return (Criteria) this;
        }

        public Criteria andPrimaryOriginNotIn(List<Integer> values) {
            addCriterion("primary_origin not in", values, "primaryOrigin");
            return (Criteria) this;
        }

        public Criteria andPrimaryOriginBetween(Integer value1, Integer value2) {
            addCriterion("primary_origin between", value1, value2, "primaryOrigin");
            return (Criteria) this;
        }

        public Criteria andPrimaryOriginNotBetween(Integer value1, Integer value2) {
            addCriterion("primary_origin not between", value1, value2, "primaryOrigin");
            return (Criteria) this;
        }

        public Criteria andOtherDocIsNull() {
            addCriterion("other_doc is null");
            return (Criteria) this;
        }

        public Criteria andOtherDocIsNotNull() {
            addCriterion("other_doc is not null");
            return (Criteria) this;
        }

        public Criteria andOtherDocEqualTo(String value) {
            addCriterion("other_doc =", value, "otherDoc");
            return (Criteria) this;
        }

        public Criteria andOtherDocNotEqualTo(String value) {
            addCriterion("other_doc <>", value, "otherDoc");
            return (Criteria) this;
        }

        public Criteria andOtherDocGreaterThan(String value) {
            addCriterion("other_doc >", value, "otherDoc");
            return (Criteria) this;
        }

        public Criteria andOtherDocGreaterThanOrEqualTo(String value) {
            addCriterion("other_doc >=", value, "otherDoc");
            return (Criteria) this;
        }

        public Criteria andOtherDocLessThan(String value) {
            addCriterion("other_doc <", value, "otherDoc");
            return (Criteria) this;
        }

        public Criteria andOtherDocLessThanOrEqualTo(String value) {
            addCriterion("other_doc <=", value, "otherDoc");
            return (Criteria) this;
        }

        public Criteria andOtherDocLike(String value) {
            addCriterion("other_doc like", value, "otherDoc");
            return (Criteria) this;
        }

        public Criteria andOtherDocNotLike(String value) {
            addCriterion("other_doc not like", value, "otherDoc");
            return (Criteria) this;
        }

        public Criteria andOtherDocIn(List<String> values) {
            addCriterion("other_doc in", values, "otherDoc");
            return (Criteria) this;
        }

        public Criteria andOtherDocNotIn(List<String> values) {
            addCriterion("other_doc not in", values, "otherDoc");
            return (Criteria) this;
        }

        public Criteria andOtherDocBetween(String value1, String value2) {
            addCriterion("other_doc between", value1, value2, "otherDoc");
            return (Criteria) this;
        }

        public Criteria andOtherDocNotBetween(String value1, String value2) {
            addCriterion("other_doc not between", value1, value2, "otherDoc");
            return (Criteria) this;
        }

        public Criteria andSpecificRequireIsNull() {
            addCriterion("specific_require is null");
            return (Criteria) this;
        }

        public Criteria andSpecificRequireIsNotNull() {
            addCriterion("specific_require is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificRequireEqualTo(String value) {
            addCriterion("specific_require =", value, "specificRequire");
            return (Criteria) this;
        }

        public Criteria andSpecificRequireNotEqualTo(String value) {
            addCriterion("specific_require <>", value, "specificRequire");
            return (Criteria) this;
        }

        public Criteria andSpecificRequireGreaterThan(String value) {
            addCriterion("specific_require >", value, "specificRequire");
            return (Criteria) this;
        }

        public Criteria andSpecificRequireGreaterThanOrEqualTo(String value) {
            addCriterion("specific_require >=", value, "specificRequire");
            return (Criteria) this;
        }

        public Criteria andSpecificRequireLessThan(String value) {
            addCriterion("specific_require <", value, "specificRequire");
            return (Criteria) this;
        }

        public Criteria andSpecificRequireLessThanOrEqualTo(String value) {
            addCriterion("specific_require <=", value, "specificRequire");
            return (Criteria) this;
        }

        public Criteria andSpecificRequireLike(String value) {
            addCriterion("specific_require like", value, "specificRequire");
            return (Criteria) this;
        }

        public Criteria andSpecificRequireNotLike(String value) {
            addCriterion("specific_require not like", value, "specificRequire");
            return (Criteria) this;
        }

        public Criteria andSpecificRequireIn(List<String> values) {
            addCriterion("specific_require in", values, "specificRequire");
            return (Criteria) this;
        }

        public Criteria andSpecificRequireNotIn(List<String> values) {
            addCriterion("specific_require not in", values, "specificRequire");
            return (Criteria) this;
        }

        public Criteria andSpecificRequireBetween(String value1, String value2) {
            addCriterion("specific_require between", value1, value2, "specificRequire");
            return (Criteria) this;
        }

        public Criteria andSpecificRequireNotBetween(String value1, String value2) {
            addCriterion("specific_require not between", value1, value2, "specificRequire");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingIsNull() {
            addCriterion("bill_of_lading is null");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingIsNotNull() {
            addCriterion("bill_of_lading is not null");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingEqualTo(String value) {
            addCriterion("bill_of_lading =", value, "billOfLading");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNotEqualTo(String value) {
            addCriterion("bill_of_lading <>", value, "billOfLading");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingGreaterThan(String value) {
            addCriterion("bill_of_lading >", value, "billOfLading");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingGreaterThanOrEqualTo(String value) {
            addCriterion("bill_of_lading >=", value, "billOfLading");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingLessThan(String value) {
            addCriterion("bill_of_lading <", value, "billOfLading");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingLessThanOrEqualTo(String value) {
            addCriterion("bill_of_lading <=", value, "billOfLading");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingLike(String value) {
            addCriterion("bill_of_lading like", value, "billOfLading");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNotLike(String value) {
            addCriterion("bill_of_lading not like", value, "billOfLading");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingIn(List<String> values) {
            addCriterion("bill_of_lading in", values, "billOfLading");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNotIn(List<String> values) {
            addCriterion("bill_of_lading not in", values, "billOfLading");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingBetween(String value1, String value2) {
            addCriterion("bill_of_lading between", value1, value2, "billOfLading");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNotBetween(String value1, String value2) {
            addCriterion("bill_of_lading not between", value1, value2, "billOfLading");
            return (Criteria) this;
        }

        public Criteria andShippingMarksIsNull() {
            addCriterion("shipping_marks is null");
            return (Criteria) this;
        }

        public Criteria andShippingMarksIsNotNull() {
            addCriterion("shipping_marks is not null");
            return (Criteria) this;
        }

        public Criteria andShippingMarksEqualTo(String value) {
            addCriterion("shipping_marks =", value, "shippingMarks");
            return (Criteria) this;
        }

        public Criteria andShippingMarksNotEqualTo(String value) {
            addCriterion("shipping_marks <>", value, "shippingMarks");
            return (Criteria) this;
        }

        public Criteria andShippingMarksGreaterThan(String value) {
            addCriterion("shipping_marks >", value, "shippingMarks");
            return (Criteria) this;
        }

        public Criteria andShippingMarksGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_marks >=", value, "shippingMarks");
            return (Criteria) this;
        }

        public Criteria andShippingMarksLessThan(String value) {
            addCriterion("shipping_marks <", value, "shippingMarks");
            return (Criteria) this;
        }

        public Criteria andShippingMarksLessThanOrEqualTo(String value) {
            addCriterion("shipping_marks <=", value, "shippingMarks");
            return (Criteria) this;
        }

        public Criteria andShippingMarksLike(String value) {
            addCriterion("shipping_marks like", value, "shippingMarks");
            return (Criteria) this;
        }

        public Criteria andShippingMarksNotLike(String value) {
            addCriterion("shipping_marks not like", value, "shippingMarks");
            return (Criteria) this;
        }

        public Criteria andShippingMarksIn(List<String> values) {
            addCriterion("shipping_marks in", values, "shippingMarks");
            return (Criteria) this;
        }

        public Criteria andShippingMarksNotIn(List<String> values) {
            addCriterion("shipping_marks not in", values, "shippingMarks");
            return (Criteria) this;
        }

        public Criteria andShippingMarksBetween(String value1, String value2) {
            addCriterion("shipping_marks between", value1, value2, "shippingMarks");
            return (Criteria) this;
        }

        public Criteria andShippingMarksNotBetween(String value1, String value2) {
            addCriterion("shipping_marks not between", value1, value2, "shippingMarks");
            return (Criteria) this;
        }

        public Criteria andPackageRequireIsNull() {
            addCriterion("package_require is null");
            return (Criteria) this;
        }

        public Criteria andPackageRequireIsNotNull() {
            addCriterion("package_require is not null");
            return (Criteria) this;
        }

        public Criteria andPackageRequireEqualTo(String value) {
            addCriterion("package_require =", value, "packageRequire");
            return (Criteria) this;
        }

        public Criteria andPackageRequireNotEqualTo(String value) {
            addCriterion("package_require <>", value, "packageRequire");
            return (Criteria) this;
        }

        public Criteria andPackageRequireGreaterThan(String value) {
            addCriterion("package_require >", value, "packageRequire");
            return (Criteria) this;
        }

        public Criteria andPackageRequireGreaterThanOrEqualTo(String value) {
            addCriterion("package_require >=", value, "packageRequire");
            return (Criteria) this;
        }

        public Criteria andPackageRequireLessThan(String value) {
            addCriterion("package_require <", value, "packageRequire");
            return (Criteria) this;
        }

        public Criteria andPackageRequireLessThanOrEqualTo(String value) {
            addCriterion("package_require <=", value, "packageRequire");
            return (Criteria) this;
        }

        public Criteria andPackageRequireLike(String value) {
            addCriterion("package_require like", value, "packageRequire");
            return (Criteria) this;
        }

        public Criteria andPackageRequireNotLike(String value) {
            addCriterion("package_require not like", value, "packageRequire");
            return (Criteria) this;
        }

        public Criteria andPackageRequireIn(List<String> values) {
            addCriterion("package_require in", values, "packageRequire");
            return (Criteria) this;
        }

        public Criteria andPackageRequireNotIn(List<String> values) {
            addCriterion("package_require not in", values, "packageRequire");
            return (Criteria) this;
        }

        public Criteria andPackageRequireBetween(String value1, String value2) {
            addCriterion("package_require between", value1, value2, "packageRequire");
            return (Criteria) this;
        }

        public Criteria andPackageRequireNotBetween(String value1, String value2) {
            addCriterion("package_require not between", value1, value2, "packageRequire");
            return (Criteria) this;
        }

        public Criteria andCorporateNameIsNull() {
            addCriterion("corporate_name is null");
            return (Criteria) this;
        }

        public Criteria andCorporateNameIsNotNull() {
            addCriterion("corporate_name is not null");
            return (Criteria) this;
        }

        public Criteria andCorporateNameEqualTo(String value) {
            addCriterion("corporate_name =", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameNotEqualTo(String value) {
            addCriterion("corporate_name <>", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameGreaterThan(String value) {
            addCriterion("corporate_name >", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameGreaterThanOrEqualTo(String value) {
            addCriterion("corporate_name >=", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameLessThan(String value) {
            addCriterion("corporate_name <", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameLessThanOrEqualTo(String value) {
            addCriterion("corporate_name <=", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameLike(String value) {
            addCriterion("corporate_name like", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameNotLike(String value) {
            addCriterion("corporate_name not like", value, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameIn(List<String> values) {
            addCriterion("corporate_name in", values, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameNotIn(List<String> values) {
            addCriterion("corporate_name not in", values, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameBetween(String value1, String value2) {
            addCriterion("corporate_name between", value1, value2, "corporateName");
            return (Criteria) this;
        }

        public Criteria andCorporateNameNotBetween(String value1, String value2) {
            addCriterion("corporate_name not between", value1, value2, "corporateName");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andContactsIsNull() {
            addCriterion("contacts is null");
            return (Criteria) this;
        }

        public Criteria andContactsIsNotNull() {
            addCriterion("contacts is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEqualTo(String value) {
            addCriterion("contacts =", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotEqualTo(String value) {
            addCriterion("contacts <>", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThan(String value) {
            addCriterion("contacts >", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThanOrEqualTo(String value) {
            addCriterion("contacts >=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThan(String value) {
            addCriterion("contacts <", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThanOrEqualTo(String value) {
            addCriterion("contacts <=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLike(String value) {
            addCriterion("contacts like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotLike(String value) {
            addCriterion("contacts not like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsIn(List<String> values) {
            addCriterion("contacts in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotIn(List<String> values) {
            addCriterion("contacts not in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsBetween(String value1, String value2) {
            addCriterion("contacts between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotBetween(String value1, String value2) {
            addCriterion("contacts not between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactInformationIsNull() {
            addCriterion("contact_information is null");
            return (Criteria) this;
        }

        public Criteria andContactInformationIsNotNull() {
            addCriterion("contact_information is not null");
            return (Criteria) this;
        }

        public Criteria andContactInformationEqualTo(String value) {
            addCriterion("contact_information =", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationNotEqualTo(String value) {
            addCriterion("contact_information <>", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationGreaterThan(String value) {
            addCriterion("contact_information >", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationGreaterThanOrEqualTo(String value) {
            addCriterion("contact_information >=", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationLessThan(String value) {
            addCriterion("contact_information <", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationLessThanOrEqualTo(String value) {
            addCriterion("contact_information <=", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationLike(String value) {
            addCriterion("contact_information like", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationNotLike(String value) {
            addCriterion("contact_information not like", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationIn(List<String> values) {
            addCriterion("contact_information in", values, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationNotIn(List<String> values) {
            addCriterion("contact_information not in", values, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationBetween(String value1, String value2) {
            addCriterion("contact_information between", value1, value2, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationNotBetween(String value1, String value2) {
            addCriterion("contact_information not between", value1, value2, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andTenantIsNull() {
            addCriterion("tenant is null");
            return (Criteria) this;
        }

        public Criteria andTenantIsNotNull() {
            addCriterion("tenant is not null");
            return (Criteria) this;
        }

        public Criteria andTenantEqualTo(String value) {
            addCriterion("tenant =", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantNotEqualTo(String value) {
            addCriterion("tenant <>", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantGreaterThan(String value) {
            addCriterion("tenant >", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantGreaterThanOrEqualTo(String value) {
            addCriterion("tenant >=", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantLessThan(String value) {
            addCriterion("tenant <", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantLessThanOrEqualTo(String value) {
            addCriterion("tenant <=", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantLike(String value) {
            addCriterion("tenant like", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantNotLike(String value) {
            addCriterion("tenant not like", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantIn(List<String> values) {
            addCriterion("tenant in", values, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantNotIn(List<String> values) {
            addCriterion("tenant not in", values, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantBetween(String value1, String value2) {
            addCriterion("tenant between", value1, value2, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantNotBetween(String value1, String value2) {
            addCriterion("tenant not between", value1, value2, "tenant");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphIsNull() {
            addCriterion("duty_paragraph is null");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphIsNotNull() {
            addCriterion("duty_paragraph is not null");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphEqualTo(String value) {
            addCriterion("duty_paragraph =", value, "dutyParagraph");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphNotEqualTo(String value) {
            addCriterion("duty_paragraph <>", value, "dutyParagraph");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphGreaterThan(String value) {
            addCriterion("duty_paragraph >", value, "dutyParagraph");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphGreaterThanOrEqualTo(String value) {
            addCriterion("duty_paragraph >=", value, "dutyParagraph");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphLessThan(String value) {
            addCriterion("duty_paragraph <", value, "dutyParagraph");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphLessThanOrEqualTo(String value) {
            addCriterion("duty_paragraph <=", value, "dutyParagraph");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphLike(String value) {
            addCriterion("duty_paragraph like", value, "dutyParagraph");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphNotLike(String value) {
            addCriterion("duty_paragraph not like", value, "dutyParagraph");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphIn(List<String> values) {
            addCriterion("duty_paragraph in", values, "dutyParagraph");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphNotIn(List<String> values) {
            addCriterion("duty_paragraph not in", values, "dutyParagraph");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphBetween(String value1, String value2) {
            addCriterion("duty_paragraph between", value1, value2, "dutyParagraph");
            return (Criteria) this;
        }

        public Criteria andDutyParagraphNotBetween(String value1, String value2) {
            addCriterion("duty_paragraph not between", value1, value2, "dutyParagraph");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNull() {
            addCriterion("zip_code is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(String value) {
            addCriterion("zip_code =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(String value) {
            addCriterion("zip_code <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(String value) {
            addCriterion("zip_code >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("zip_code >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(String value) {
            addCriterion("zip_code <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(String value) {
            addCriterion("zip_code <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLike(String value) {
            addCriterion("zip_code like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotLike(String value) {
            addCriterion("zip_code not like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<String> values) {
            addCriterion("zip_code in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<String> values) {
            addCriterion("zip_code not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(String value1, String value2) {
            addCriterion("zip_code between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(String value1, String value2) {
            addCriterion("zip_code not between", value1, value2, "zipCode");
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