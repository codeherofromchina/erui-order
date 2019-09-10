package com.erui.order.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DeliverNoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeliverNoticeExample() {
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

        public Criteria andDeliverNoticeNoIsNull() {
            addCriterion("deliver_notice_no is null");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeNoIsNotNull() {
            addCriterion("deliver_notice_no is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeNoEqualTo(String value) {
            addCriterion("deliver_notice_no =", value, "deliverNoticeNo");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeNoNotEqualTo(String value) {
            addCriterion("deliver_notice_no <>", value, "deliverNoticeNo");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeNoGreaterThan(String value) {
            addCriterion("deliver_notice_no >", value, "deliverNoticeNo");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeNoGreaterThanOrEqualTo(String value) {
            addCriterion("deliver_notice_no >=", value, "deliverNoticeNo");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeNoLessThan(String value) {
            addCriterion("deliver_notice_no <", value, "deliverNoticeNo");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeNoLessThanOrEqualTo(String value) {
            addCriterion("deliver_notice_no <=", value, "deliverNoticeNo");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeNoLike(String value) {
            addCriterion("deliver_notice_no like", value, "deliverNoticeNo");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeNoNotLike(String value) {
            addCriterion("deliver_notice_no not like", value, "deliverNoticeNo");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeNoIn(List<String> values) {
            addCriterion("deliver_notice_no in", values, "deliverNoticeNo");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeNoNotIn(List<String> values) {
            addCriterion("deliver_notice_no not in", values, "deliverNoticeNo");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeNoBetween(String value1, String value2) {
            addCriterion("deliver_notice_no between", value1, value2, "deliverNoticeNo");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeNoNotBetween(String value1, String value2) {
            addCriterion("deliver_notice_no not between", value1, value2, "deliverNoticeNo");
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

        public Criteria andSenderIdIsNull() {
            addCriterion("sender_id is null");
            return (Criteria) this;
        }

        public Criteria andSenderIdIsNotNull() {
            addCriterion("sender_id is not null");
            return (Criteria) this;
        }

        public Criteria andSenderIdEqualTo(Long value) {
            addCriterion("sender_id =", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotEqualTo(Long value) {
            addCriterion("sender_id <>", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdGreaterThan(Long value) {
            addCriterion("sender_id >", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sender_id >=", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdLessThan(Long value) {
            addCriterion("sender_id <", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdLessThanOrEqualTo(Long value) {
            addCriterion("sender_id <=", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdIn(List<Long> values) {
            addCriterion("sender_id in", values, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotIn(List<Long> values) {
            addCriterion("sender_id not in", values, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdBetween(Long value1, Long value2) {
            addCriterion("sender_id between", value1, value2, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotBetween(Long value1, Long value2) {
            addCriterion("sender_id not between", value1, value2, "senderId");
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

        public Criteria andOperationSpecialistIsNull() {
            addCriterion("operation_specialist is null");
            return (Criteria) this;
        }

        public Criteria andOperationSpecialistIsNotNull() {
            addCriterion("operation_specialist is not null");
            return (Criteria) this;
        }

        public Criteria andOperationSpecialistEqualTo(String value) {
            addCriterion("operation_specialist =", value, "operationSpecialist");
            return (Criteria) this;
        }

        public Criteria andOperationSpecialistNotEqualTo(String value) {
            addCriterion("operation_specialist <>", value, "operationSpecialist");
            return (Criteria) this;
        }

        public Criteria andOperationSpecialistGreaterThan(String value) {
            addCriterion("operation_specialist >", value, "operationSpecialist");
            return (Criteria) this;
        }

        public Criteria andOperationSpecialistGreaterThanOrEqualTo(String value) {
            addCriterion("operation_specialist >=", value, "operationSpecialist");
            return (Criteria) this;
        }

        public Criteria andOperationSpecialistLessThan(String value) {
            addCriterion("operation_specialist <", value, "operationSpecialist");
            return (Criteria) this;
        }

        public Criteria andOperationSpecialistLessThanOrEqualTo(String value) {
            addCriterion("operation_specialist <=", value, "operationSpecialist");
            return (Criteria) this;
        }

        public Criteria andOperationSpecialistLike(String value) {
            addCriterion("operation_specialist like", value, "operationSpecialist");
            return (Criteria) this;
        }

        public Criteria andOperationSpecialistNotLike(String value) {
            addCriterion("operation_specialist not like", value, "operationSpecialist");
            return (Criteria) this;
        }

        public Criteria andOperationSpecialistIn(List<String> values) {
            addCriterion("operation_specialist in", values, "operationSpecialist");
            return (Criteria) this;
        }

        public Criteria andOperationSpecialistNotIn(List<String> values) {
            addCriterion("operation_specialist not in", values, "operationSpecialist");
            return (Criteria) this;
        }

        public Criteria andOperationSpecialistBetween(String value1, String value2) {
            addCriterion("operation_specialist between", value1, value2, "operationSpecialist");
            return (Criteria) this;
        }

        public Criteria andOperationSpecialistNotBetween(String value1, String value2) {
            addCriterion("operation_specialist not between", value1, value2, "operationSpecialist");
            return (Criteria) this;
        }

        public Criteria andSendDateIsNull() {
            addCriterion("send_date is null");
            return (Criteria) this;
        }

        public Criteria andSendDateIsNotNull() {
            addCriterion("send_date is not null");
            return (Criteria) this;
        }

        public Criteria andSendDateEqualTo(Date value) {
            addCriterionForJDBCDate("send_date =", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("send_date <>", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateGreaterThan(Date value) {
            addCriterionForJDBCDate("send_date >", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("send_date >=", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateLessThan(Date value) {
            addCriterionForJDBCDate("send_date <", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("send_date <=", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateIn(List<Date> values) {
            addCriterionForJDBCDate("send_date in", values, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("send_date not in", values, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("send_date between", value1, value2, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("send_date not between", value1, value2, "sendDate");
            return (Criteria) this;
        }

        public Criteria andNumbersIsNull() {
            addCriterion("numbers is null");
            return (Criteria) this;
        }

        public Criteria andNumbersIsNotNull() {
            addCriterion("numbers is not null");
            return (Criteria) this;
        }

        public Criteria andNumbersEqualTo(Integer value) {
            addCriterion("numbers =", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotEqualTo(Integer value) {
            addCriterion("numbers <>", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersGreaterThan(Integer value) {
            addCriterion("numbers >", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersGreaterThanOrEqualTo(Integer value) {
            addCriterion("numbers >=", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLessThan(Integer value) {
            addCriterion("numbers <", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLessThanOrEqualTo(Integer value) {
            addCriterion("numbers <=", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersIn(List<Integer> values) {
            addCriterion("numbers in", values, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotIn(List<Integer> values) {
            addCriterion("numbers not in", values, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersBetween(Integer value1, Integer value2) {
            addCriterion("numbers between", value1, value2, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotBetween(Integer value1, Integer value2) {
            addCriterion("numbers not between", value1, value2, "numbers");
            return (Criteria) this;
        }

        public Criteria andOtherReqIsNull() {
            addCriterion("other_req is null");
            return (Criteria) this;
        }

        public Criteria andOtherReqIsNotNull() {
            addCriterion("other_req is not null");
            return (Criteria) this;
        }

        public Criteria andOtherReqEqualTo(String value) {
            addCriterion("other_req =", value, "otherReq");
            return (Criteria) this;
        }

        public Criteria andOtherReqNotEqualTo(String value) {
            addCriterion("other_req <>", value, "otherReq");
            return (Criteria) this;
        }

        public Criteria andOtherReqGreaterThan(String value) {
            addCriterion("other_req >", value, "otherReq");
            return (Criteria) this;
        }

        public Criteria andOtherReqGreaterThanOrEqualTo(String value) {
            addCriterion("other_req >=", value, "otherReq");
            return (Criteria) this;
        }

        public Criteria andOtherReqLessThan(String value) {
            addCriterion("other_req <", value, "otherReq");
            return (Criteria) this;
        }

        public Criteria andOtherReqLessThanOrEqualTo(String value) {
            addCriterion("other_req <=", value, "otherReq");
            return (Criteria) this;
        }

        public Criteria andOtherReqLike(String value) {
            addCriterion("other_req like", value, "otherReq");
            return (Criteria) this;
        }

        public Criteria andOtherReqNotLike(String value) {
            addCriterion("other_req not like", value, "otherReq");
            return (Criteria) this;
        }

        public Criteria andOtherReqIn(List<String> values) {
            addCriterion("other_req in", values, "otherReq");
            return (Criteria) this;
        }

        public Criteria andOtherReqNotIn(List<String> values) {
            addCriterion("other_req not in", values, "otherReq");
            return (Criteria) this;
        }

        public Criteria andOtherReqBetween(String value1, String value2) {
            addCriterion("other_req between", value1, value2, "otherReq");
            return (Criteria) this;
        }

        public Criteria andOtherReqNotBetween(String value1, String value2) {
            addCriterion("other_req not between", value1, value2, "otherReq");
            return (Criteria) this;
        }

        public Criteria andPackageReqIsNull() {
            addCriterion("package_req is null");
            return (Criteria) this;
        }

        public Criteria andPackageReqIsNotNull() {
            addCriterion("package_req is not null");
            return (Criteria) this;
        }

        public Criteria andPackageReqEqualTo(String value) {
            addCriterion("package_req =", value, "packageReq");
            return (Criteria) this;
        }

        public Criteria andPackageReqNotEqualTo(String value) {
            addCriterion("package_req <>", value, "packageReq");
            return (Criteria) this;
        }

        public Criteria andPackageReqGreaterThan(String value) {
            addCriterion("package_req >", value, "packageReq");
            return (Criteria) this;
        }

        public Criteria andPackageReqGreaterThanOrEqualTo(String value) {
            addCriterion("package_req >=", value, "packageReq");
            return (Criteria) this;
        }

        public Criteria andPackageReqLessThan(String value) {
            addCriterion("package_req <", value, "packageReq");
            return (Criteria) this;
        }

        public Criteria andPackageReqLessThanOrEqualTo(String value) {
            addCriterion("package_req <=", value, "packageReq");
            return (Criteria) this;
        }

        public Criteria andPackageReqLike(String value) {
            addCriterion("package_req like", value, "packageReq");
            return (Criteria) this;
        }

        public Criteria andPackageReqNotLike(String value) {
            addCriterion("package_req not like", value, "packageReq");
            return (Criteria) this;
        }

        public Criteria andPackageReqIn(List<String> values) {
            addCriterion("package_req in", values, "packageReq");
            return (Criteria) this;
        }

        public Criteria andPackageReqNotIn(List<String> values) {
            addCriterion("package_req not in", values, "packageReq");
            return (Criteria) this;
        }

        public Criteria andPackageReqBetween(String value1, String value2) {
            addCriterion("package_req between", value1, value2, "packageReq");
            return (Criteria) this;
        }

        public Criteria andPackageReqNotBetween(String value1, String value2) {
            addCriterion("package_req not between", value1, value2, "packageReq");
            return (Criteria) this;
        }

        public Criteria andPrepareReqIsNull() {
            addCriterion("prepare_req is null");
            return (Criteria) this;
        }

        public Criteria andPrepareReqIsNotNull() {
            addCriterion("prepare_req is not null");
            return (Criteria) this;
        }

        public Criteria andPrepareReqEqualTo(String value) {
            addCriterion("prepare_req =", value, "prepareReq");
            return (Criteria) this;
        }

        public Criteria andPrepareReqNotEqualTo(String value) {
            addCriterion("prepare_req <>", value, "prepareReq");
            return (Criteria) this;
        }

        public Criteria andPrepareReqGreaterThan(String value) {
            addCriterion("prepare_req >", value, "prepareReq");
            return (Criteria) this;
        }

        public Criteria andPrepareReqGreaterThanOrEqualTo(String value) {
            addCriterion("prepare_req >=", value, "prepareReq");
            return (Criteria) this;
        }

        public Criteria andPrepareReqLessThan(String value) {
            addCriterion("prepare_req <", value, "prepareReq");
            return (Criteria) this;
        }

        public Criteria andPrepareReqLessThanOrEqualTo(String value) {
            addCriterion("prepare_req <=", value, "prepareReq");
            return (Criteria) this;
        }

        public Criteria andPrepareReqLike(String value) {
            addCriterion("prepare_req like", value, "prepareReq");
            return (Criteria) this;
        }

        public Criteria andPrepareReqNotLike(String value) {
            addCriterion("prepare_req not like", value, "prepareReq");
            return (Criteria) this;
        }

        public Criteria andPrepareReqIn(List<String> values) {
            addCriterion("prepare_req in", values, "prepareReq");
            return (Criteria) this;
        }

        public Criteria andPrepareReqNotIn(List<String> values) {
            addCriterion("prepare_req not in", values, "prepareReq");
            return (Criteria) this;
        }

        public Criteria andPrepareReqBetween(String value1, String value2) {
            addCriterion("prepare_req between", value1, value2, "prepareReq");
            return (Criteria) this;
        }

        public Criteria andPrepareReqNotBetween(String value1, String value2) {
            addCriterion("prepare_req not between", value1, value2, "prepareReq");
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

        public Criteria andHandleStatusIsNull() {
            addCriterion("handle_status is null");
            return (Criteria) this;
        }

        public Criteria andHandleStatusIsNotNull() {
            addCriterion("handle_status is not null");
            return (Criteria) this;
        }

        public Criteria andHandleStatusEqualTo(Short value) {
            addCriterion("handle_status =", value, "handleStatus");
            return (Criteria) this;
        }

        public Criteria andHandleStatusNotEqualTo(Short value) {
            addCriterion("handle_status <>", value, "handleStatus");
            return (Criteria) this;
        }

        public Criteria andHandleStatusGreaterThan(Short value) {
            addCriterion("handle_status >", value, "handleStatus");
            return (Criteria) this;
        }

        public Criteria andHandleStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("handle_status >=", value, "handleStatus");
            return (Criteria) this;
        }

        public Criteria andHandleStatusLessThan(Short value) {
            addCriterion("handle_status <", value, "handleStatus");
            return (Criteria) this;
        }

        public Criteria andHandleStatusLessThanOrEqualTo(Short value) {
            addCriterion("handle_status <=", value, "handleStatus");
            return (Criteria) this;
        }

        public Criteria andHandleStatusIn(List<Short> values) {
            addCriterion("handle_status in", values, "handleStatus");
            return (Criteria) this;
        }

        public Criteria andHandleStatusNotIn(List<Short> values) {
            addCriterion("handle_status not in", values, "handleStatus");
            return (Criteria) this;
        }

        public Criteria andHandleStatusBetween(Short value1, Short value2) {
            addCriterion("handle_status between", value1, value2, "handleStatus");
            return (Criteria) this;
        }

        public Criteria andHandleStatusNotBetween(Short value1, Short value2) {
            addCriterion("handle_status not between", value1, value2, "handleStatus");
            return (Criteria) this;
        }

        public Criteria andPackingTimeIsNull() {
            addCriterion("packing_time is null");
            return (Criteria) this;
        }

        public Criteria andPackingTimeIsNotNull() {
            addCriterion("packing_time is not null");
            return (Criteria) this;
        }

        public Criteria andPackingTimeEqualTo(Date value) {
            addCriterionForJDBCDate("packing_time =", value, "packingTime");
            return (Criteria) this;
        }

        public Criteria andPackingTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("packing_time <>", value, "packingTime");
            return (Criteria) this;
        }

        public Criteria andPackingTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("packing_time >", value, "packingTime");
            return (Criteria) this;
        }

        public Criteria andPackingTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("packing_time >=", value, "packingTime");
            return (Criteria) this;
        }

        public Criteria andPackingTimeLessThan(Date value) {
            addCriterionForJDBCDate("packing_time <", value, "packingTime");
            return (Criteria) this;
        }

        public Criteria andPackingTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("packing_time <=", value, "packingTime");
            return (Criteria) this;
        }

        public Criteria andPackingTimeIn(List<Date> values) {
            addCriterionForJDBCDate("packing_time in", values, "packingTime");
            return (Criteria) this;
        }

        public Criteria andPackingTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("packing_time not in", values, "packingTime");
            return (Criteria) this;
        }

        public Criteria andPackingTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("packing_time between", value1, value2, "packingTime");
            return (Criteria) this;
        }

        public Criteria andPackingTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("packing_time not between", value1, value2, "packingTime");
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