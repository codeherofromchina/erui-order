package com.erui.order.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DeliverDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeliverDetailExample() {
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

        public Criteria andDeliverDetailNoIsNull() {
            addCriterion("deliver_detail_no is null");
            return (Criteria) this;
        }

        public Criteria andDeliverDetailNoIsNotNull() {
            addCriterion("deliver_detail_no is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverDetailNoEqualTo(String value) {
            addCriterion("deliver_detail_no =", value, "deliverDetailNo");
            return (Criteria) this;
        }

        public Criteria andDeliverDetailNoNotEqualTo(String value) {
            addCriterion("deliver_detail_no <>", value, "deliverDetailNo");
            return (Criteria) this;
        }

        public Criteria andDeliverDetailNoGreaterThan(String value) {
            addCriterion("deliver_detail_no >", value, "deliverDetailNo");
            return (Criteria) this;
        }

        public Criteria andDeliverDetailNoGreaterThanOrEqualTo(String value) {
            addCriterion("deliver_detail_no >=", value, "deliverDetailNo");
            return (Criteria) this;
        }

        public Criteria andDeliverDetailNoLessThan(String value) {
            addCriterion("deliver_detail_no <", value, "deliverDetailNo");
            return (Criteria) this;
        }

        public Criteria andDeliverDetailNoLessThanOrEqualTo(String value) {
            addCriterion("deliver_detail_no <=", value, "deliverDetailNo");
            return (Criteria) this;
        }

        public Criteria andDeliverDetailNoLike(String value) {
            addCriterion("deliver_detail_no like", value, "deliverDetailNo");
            return (Criteria) this;
        }

        public Criteria andDeliverDetailNoNotLike(String value) {
            addCriterion("deliver_detail_no not like", value, "deliverDetailNo");
            return (Criteria) this;
        }

        public Criteria andDeliverDetailNoIn(List<String> values) {
            addCriterion("deliver_detail_no in", values, "deliverDetailNo");
            return (Criteria) this;
        }

        public Criteria andDeliverDetailNoNotIn(List<String> values) {
            addCriterion("deliver_detail_no not in", values, "deliverDetailNo");
            return (Criteria) this;
        }

        public Criteria andDeliverDetailNoBetween(String value1, String value2) {
            addCriterion("deliver_detail_no between", value1, value2, "deliverDetailNo");
            return (Criteria) this;
        }

        public Criteria andDeliverDetailNoNotBetween(String value1, String value2) {
            addCriterion("deliver_detail_no not between", value1, value2, "deliverDetailNo");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeIdIsNull() {
            addCriterion("deliver_notice_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeIdIsNotNull() {
            addCriterion("deliver_notice_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeIdEqualTo(Long value) {
            addCriterion("deliver_notice_id =", value, "deliverNoticeId");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeIdNotEqualTo(Long value) {
            addCriterion("deliver_notice_id <>", value, "deliverNoticeId");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeIdGreaterThan(Long value) {
            addCriterion("deliver_notice_id >", value, "deliverNoticeId");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("deliver_notice_id >=", value, "deliverNoticeId");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeIdLessThan(Long value) {
            addCriterion("deliver_notice_id <", value, "deliverNoticeId");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeIdLessThanOrEqualTo(Long value) {
            addCriterion("deliver_notice_id <=", value, "deliverNoticeId");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeIdIn(List<Long> values) {
            addCriterion("deliver_notice_id in", values, "deliverNoticeId");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeIdNotIn(List<Long> values) {
            addCriterion("deliver_notice_id not in", values, "deliverNoticeId");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeIdBetween(Long value1, Long value2) {
            addCriterion("deliver_notice_id between", value1, value2, "deliverNoticeId");
            return (Criteria) this;
        }

        public Criteria andDeliverNoticeIdNotBetween(Long value1, Long value2) {
            addCriterion("deliver_notice_id not between", value1, value2, "deliverNoticeId");
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

        public Criteria andBillingDateIsNull() {
            addCriterion("billing_date is null");
            return (Criteria) this;
        }

        public Criteria andBillingDateIsNotNull() {
            addCriterion("billing_date is not null");
            return (Criteria) this;
        }

        public Criteria andBillingDateEqualTo(Date value) {
            addCriterionForJDBCDate("billing_date =", value, "billingDate");
            return (Criteria) this;
        }

        public Criteria andBillingDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("billing_date <>", value, "billingDate");
            return (Criteria) this;
        }

        public Criteria andBillingDateGreaterThan(Date value) {
            addCriterionForJDBCDate("billing_date >", value, "billingDate");
            return (Criteria) this;
        }

        public Criteria andBillingDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("billing_date >=", value, "billingDate");
            return (Criteria) this;
        }

        public Criteria andBillingDateLessThan(Date value) {
            addCriterionForJDBCDate("billing_date <", value, "billingDate");
            return (Criteria) this;
        }

        public Criteria andBillingDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("billing_date <=", value, "billingDate");
            return (Criteria) this;
        }

        public Criteria andBillingDateIn(List<Date> values) {
            addCriterionForJDBCDate("billing_date in", values, "billingDate");
            return (Criteria) this;
        }

        public Criteria andBillingDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("billing_date not in", values, "billingDate");
            return (Criteria) this;
        }

        public Criteria andBillingDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("billing_date between", value1, value2, "billingDate");
            return (Criteria) this;
        }

        public Criteria andBillingDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("billing_date not between", value1, value2, "billingDate");
            return (Criteria) this;
        }

        public Criteria andCarrierCoIsNull() {
            addCriterion("carrier_co is null");
            return (Criteria) this;
        }

        public Criteria andCarrierCoIsNotNull() {
            addCriterion("carrier_co is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierCoEqualTo(String value) {
            addCriterion("carrier_co =", value, "carrierCo");
            return (Criteria) this;
        }

        public Criteria andCarrierCoNotEqualTo(String value) {
            addCriterion("carrier_co <>", value, "carrierCo");
            return (Criteria) this;
        }

        public Criteria andCarrierCoGreaterThan(String value) {
            addCriterion("carrier_co >", value, "carrierCo");
            return (Criteria) this;
        }

        public Criteria andCarrierCoGreaterThanOrEqualTo(String value) {
            addCriterion("carrier_co >=", value, "carrierCo");
            return (Criteria) this;
        }

        public Criteria andCarrierCoLessThan(String value) {
            addCriterion("carrier_co <", value, "carrierCo");
            return (Criteria) this;
        }

        public Criteria andCarrierCoLessThanOrEqualTo(String value) {
            addCriterion("carrier_co <=", value, "carrierCo");
            return (Criteria) this;
        }

        public Criteria andCarrierCoLike(String value) {
            addCriterion("carrier_co like", value, "carrierCo");
            return (Criteria) this;
        }

        public Criteria andCarrierCoNotLike(String value) {
            addCriterion("carrier_co not like", value, "carrierCo");
            return (Criteria) this;
        }

        public Criteria andCarrierCoIn(List<String> values) {
            addCriterion("carrier_co in", values, "carrierCo");
            return (Criteria) this;
        }

        public Criteria andCarrierCoNotIn(List<String> values) {
            addCriterion("carrier_co not in", values, "carrierCo");
            return (Criteria) this;
        }

        public Criteria andCarrierCoBetween(String value1, String value2) {
            addCriterion("carrier_co between", value1, value2, "carrierCo");
            return (Criteria) this;
        }

        public Criteria andCarrierCoNotBetween(String value1, String value2) {
            addCriterion("carrier_co not between", value1, value2, "carrierCo");
            return (Criteria) this;
        }

        public Criteria andDriverIsNull() {
            addCriterion("driver is null");
            return (Criteria) this;
        }

        public Criteria andDriverIsNotNull() {
            addCriterion("driver is not null");
            return (Criteria) this;
        }

        public Criteria andDriverEqualTo(String value) {
            addCriterion("driver =", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotEqualTo(String value) {
            addCriterion("driver <>", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverGreaterThan(String value) {
            addCriterion("driver >", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverGreaterThanOrEqualTo(String value) {
            addCriterion("driver >=", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLessThan(String value) {
            addCriterion("driver <", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLessThanOrEqualTo(String value) {
            addCriterion("driver <=", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLike(String value) {
            addCriterion("driver like", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotLike(String value) {
            addCriterion("driver not like", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverIn(List<String> values) {
            addCriterion("driver in", values, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotIn(List<String> values) {
            addCriterion("driver not in", values, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverBetween(String value1, String value2) {
            addCriterion("driver between", value1, value2, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotBetween(String value1, String value2) {
            addCriterion("driver not between", value1, value2, "driver");
            return (Criteria) this;
        }

        public Criteria andPlateNoIsNull() {
            addCriterion("plate_no is null");
            return (Criteria) this;
        }

        public Criteria andPlateNoIsNotNull() {
            addCriterion("plate_no is not null");
            return (Criteria) this;
        }

        public Criteria andPlateNoEqualTo(String value) {
            addCriterion("plate_no =", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoNotEqualTo(String value) {
            addCriterion("plate_no <>", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoGreaterThan(String value) {
            addCriterion("plate_no >", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoGreaterThanOrEqualTo(String value) {
            addCriterion("plate_no >=", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoLessThan(String value) {
            addCriterion("plate_no <", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoLessThanOrEqualTo(String value) {
            addCriterion("plate_no <=", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoLike(String value) {
            addCriterion("plate_no like", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoNotLike(String value) {
            addCriterion("plate_no not like", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoIn(List<String> values) {
            addCriterion("plate_no in", values, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoNotIn(List<String> values) {
            addCriterion("plate_no not in", values, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoBetween(String value1, String value2) {
            addCriterion("plate_no between", value1, value2, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoNotBetween(String value1, String value2) {
            addCriterion("plate_no not between", value1, value2, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPickupDateIsNull() {
            addCriterion("pickup_date is null");
            return (Criteria) this;
        }

        public Criteria andPickupDateIsNotNull() {
            addCriterion("pickup_date is not null");
            return (Criteria) this;
        }

        public Criteria andPickupDateEqualTo(String value) {
            addCriterion("pickup_date =", value, "pickupDate");
            return (Criteria) this;
        }

        public Criteria andPickupDateNotEqualTo(String value) {
            addCriterion("pickup_date <>", value, "pickupDate");
            return (Criteria) this;
        }

        public Criteria andPickupDateGreaterThan(String value) {
            addCriterion("pickup_date >", value, "pickupDate");
            return (Criteria) this;
        }

        public Criteria andPickupDateGreaterThanOrEqualTo(String value) {
            addCriterion("pickup_date >=", value, "pickupDate");
            return (Criteria) this;
        }

        public Criteria andPickupDateLessThan(String value) {
            addCriterion("pickup_date <", value, "pickupDate");
            return (Criteria) this;
        }

        public Criteria andPickupDateLessThanOrEqualTo(String value) {
            addCriterion("pickup_date <=", value, "pickupDate");
            return (Criteria) this;
        }

        public Criteria andPickupDateLike(String value) {
            addCriterion("pickup_date like", value, "pickupDate");
            return (Criteria) this;
        }

        public Criteria andPickupDateNotLike(String value) {
            addCriterion("pickup_date not like", value, "pickupDate");
            return (Criteria) this;
        }

        public Criteria andPickupDateIn(List<String> values) {
            addCriterion("pickup_date in", values, "pickupDate");
            return (Criteria) this;
        }

        public Criteria andPickupDateNotIn(List<String> values) {
            addCriterion("pickup_date not in", values, "pickupDate");
            return (Criteria) this;
        }

        public Criteria andPickupDateBetween(String value1, String value2) {
            addCriterion("pickup_date between", value1, value2, "pickupDate");
            return (Criteria) this;
        }

        public Criteria andPickupDateNotBetween(String value1, String value2) {
            addCriterion("pickup_date not between", value1, value2, "pickupDate");
            return (Criteria) this;
        }

        public Criteria andContactTelIsNull() {
            addCriterion("contact_tel is null");
            return (Criteria) this;
        }

        public Criteria andContactTelIsNotNull() {
            addCriterion("contact_tel is not null");
            return (Criteria) this;
        }

        public Criteria andContactTelEqualTo(String value) {
            addCriterion("contact_tel =", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotEqualTo(String value) {
            addCriterion("contact_tel <>", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelGreaterThan(String value) {
            addCriterion("contact_tel >", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelGreaterThanOrEqualTo(String value) {
            addCriterion("contact_tel >=", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLessThan(String value) {
            addCriterion("contact_tel <", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLessThanOrEqualTo(String value) {
            addCriterion("contact_tel <=", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLike(String value) {
            addCriterion("contact_tel like", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotLike(String value) {
            addCriterion("contact_tel not like", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelIn(List<String> values) {
            addCriterion("contact_tel in", values, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotIn(List<String> values) {
            addCriterion("contact_tel not in", values, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelBetween(String value1, String value2) {
            addCriterion("contact_tel between", value1, value2, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotBetween(String value1, String value2) {
            addCriterion("contact_tel not between", value1, value2, "contactTel");
            return (Criteria) this;
        }

        public Criteria andHandleDepartmentIsNull() {
            addCriterion("handle_department is null");
            return (Criteria) this;
        }

        public Criteria andHandleDepartmentIsNotNull() {
            addCriterion("handle_department is not null");
            return (Criteria) this;
        }

        public Criteria andHandleDepartmentEqualTo(String value) {
            addCriterion("handle_department =", value, "handleDepartment");
            return (Criteria) this;
        }

        public Criteria andHandleDepartmentNotEqualTo(String value) {
            addCriterion("handle_department <>", value, "handleDepartment");
            return (Criteria) this;
        }

        public Criteria andHandleDepartmentGreaterThan(String value) {
            addCriterion("handle_department >", value, "handleDepartment");
            return (Criteria) this;
        }

        public Criteria andHandleDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("handle_department >=", value, "handleDepartment");
            return (Criteria) this;
        }

        public Criteria andHandleDepartmentLessThan(String value) {
            addCriterion("handle_department <", value, "handleDepartment");
            return (Criteria) this;
        }

        public Criteria andHandleDepartmentLessThanOrEqualTo(String value) {
            addCriterion("handle_department <=", value, "handleDepartment");
            return (Criteria) this;
        }

        public Criteria andHandleDepartmentLike(String value) {
            addCriterion("handle_department like", value, "handleDepartment");
            return (Criteria) this;
        }

        public Criteria andHandleDepartmentNotLike(String value) {
            addCriterion("handle_department not like", value, "handleDepartment");
            return (Criteria) this;
        }

        public Criteria andHandleDepartmentIn(List<String> values) {
            addCriterion("handle_department in", values, "handleDepartment");
            return (Criteria) this;
        }

        public Criteria andHandleDepartmentNotIn(List<String> values) {
            addCriterion("handle_department not in", values, "handleDepartment");
            return (Criteria) this;
        }

        public Criteria andHandleDepartmentBetween(String value1, String value2) {
            addCriterion("handle_department between", value1, value2, "handleDepartment");
            return (Criteria) this;
        }

        public Criteria andHandleDepartmentNotBetween(String value1, String value2) {
            addCriterion("handle_department not between", value1, value2, "handleDepartment");
            return (Criteria) this;
        }

        public Criteria andWareHousemanIsNull() {
            addCriterion("ware_houseman is null");
            return (Criteria) this;
        }

        public Criteria andWareHousemanIsNotNull() {
            addCriterion("ware_houseman is not null");
            return (Criteria) this;
        }

        public Criteria andWareHousemanEqualTo(Long value) {
            addCriterion("ware_houseman =", value, "wareHouseman");
            return (Criteria) this;
        }

        public Criteria andWareHousemanNotEqualTo(Long value) {
            addCriterion("ware_houseman <>", value, "wareHouseman");
            return (Criteria) this;
        }

        public Criteria andWareHousemanGreaterThan(Long value) {
            addCriterion("ware_houseman >", value, "wareHouseman");
            return (Criteria) this;
        }

        public Criteria andWareHousemanGreaterThanOrEqualTo(Long value) {
            addCriterion("ware_houseman >=", value, "wareHouseman");
            return (Criteria) this;
        }

        public Criteria andWareHousemanLessThan(Long value) {
            addCriterion("ware_houseman <", value, "wareHouseman");
            return (Criteria) this;
        }

        public Criteria andWareHousemanLessThanOrEqualTo(Long value) {
            addCriterion("ware_houseman <=", value, "wareHouseman");
            return (Criteria) this;
        }

        public Criteria andWareHousemanIn(List<Long> values) {
            addCriterion("ware_houseman in", values, "wareHouseman");
            return (Criteria) this;
        }

        public Criteria andWareHousemanNotIn(List<Long> values) {
            addCriterion("ware_houseman not in", values, "wareHouseman");
            return (Criteria) this;
        }

        public Criteria andWareHousemanBetween(Long value1, Long value2) {
            addCriterion("ware_houseman between", value1, value2, "wareHouseman");
            return (Criteria) this;
        }

        public Criteria andWareHousemanNotBetween(Long value1, Long value2) {
            addCriterion("ware_houseman not between", value1, value2, "wareHouseman");
            return (Criteria) this;
        }

        public Criteria andWareHousemanNameIsNull() {
            addCriterion("ware_houseman_name is null");
            return (Criteria) this;
        }

        public Criteria andWareHousemanNameIsNotNull() {
            addCriterion("ware_houseman_name is not null");
            return (Criteria) this;
        }

        public Criteria andWareHousemanNameEqualTo(String value) {
            addCriterion("ware_houseman_name =", value, "wareHousemanName");
            return (Criteria) this;
        }

        public Criteria andWareHousemanNameNotEqualTo(String value) {
            addCriterion("ware_houseman_name <>", value, "wareHousemanName");
            return (Criteria) this;
        }

        public Criteria andWareHousemanNameGreaterThan(String value) {
            addCriterion("ware_houseman_name >", value, "wareHousemanName");
            return (Criteria) this;
        }

        public Criteria andWareHousemanNameGreaterThanOrEqualTo(String value) {
            addCriterion("ware_houseman_name >=", value, "wareHousemanName");
            return (Criteria) this;
        }

        public Criteria andWareHousemanNameLessThan(String value) {
            addCriterion("ware_houseman_name <", value, "wareHousemanName");
            return (Criteria) this;
        }

        public Criteria andWareHousemanNameLessThanOrEqualTo(String value) {
            addCriterion("ware_houseman_name <=", value, "wareHousemanName");
            return (Criteria) this;
        }

        public Criteria andWareHousemanNameLike(String value) {
            addCriterion("ware_houseman_name like", value, "wareHousemanName");
            return (Criteria) this;
        }

        public Criteria andWareHousemanNameNotLike(String value) {
            addCriterion("ware_houseman_name not like", value, "wareHousemanName");
            return (Criteria) this;
        }

        public Criteria andWareHousemanNameIn(List<String> values) {
            addCriterion("ware_houseman_name in", values, "wareHousemanName");
            return (Criteria) this;
        }

        public Criteria andWareHousemanNameNotIn(List<String> values) {
            addCriterion("ware_houseman_name not in", values, "wareHousemanName");
            return (Criteria) this;
        }

        public Criteria andWareHousemanNameBetween(String value1, String value2) {
            addCriterion("ware_houseman_name between", value1, value2, "wareHousemanName");
            return (Criteria) this;
        }

        public Criteria andWareHousemanNameNotBetween(String value1, String value2) {
            addCriterion("ware_houseman_name not between", value1, value2, "wareHousemanName");
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

        public Criteria andSenderUserIdIsNull() {
            addCriterion("sender_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSenderUserIdIsNotNull() {
            addCriterion("sender_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSenderUserIdEqualTo(Long value) {
            addCriterion("sender_user_id =", value, "senderUserId");
            return (Criteria) this;
        }

        public Criteria andSenderUserIdNotEqualTo(Long value) {
            addCriterion("sender_user_id <>", value, "senderUserId");
            return (Criteria) this;
        }

        public Criteria andSenderUserIdGreaterThan(Long value) {
            addCriterion("sender_user_id >", value, "senderUserId");
            return (Criteria) this;
        }

        public Criteria andSenderUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sender_user_id >=", value, "senderUserId");
            return (Criteria) this;
        }

        public Criteria andSenderUserIdLessThan(Long value) {
            addCriterion("sender_user_id <", value, "senderUserId");
            return (Criteria) this;
        }

        public Criteria andSenderUserIdLessThanOrEqualTo(Long value) {
            addCriterion("sender_user_id <=", value, "senderUserId");
            return (Criteria) this;
        }

        public Criteria andSenderUserIdIn(List<Long> values) {
            addCriterion("sender_user_id in", values, "senderUserId");
            return (Criteria) this;
        }

        public Criteria andSenderUserIdNotIn(List<Long> values) {
            addCriterion("sender_user_id not in", values, "senderUserId");
            return (Criteria) this;
        }

        public Criteria andSenderUserIdBetween(Long value1, Long value2) {
            addCriterion("sender_user_id between", value1, value2, "senderUserId");
            return (Criteria) this;
        }

        public Criteria andSenderUserIdNotBetween(Long value1, Long value2) {
            addCriterion("sender_user_id not between", value1, value2, "senderUserId");
            return (Criteria) this;
        }

        public Criteria andReviewerUserIdIsNull() {
            addCriterion("reviewer_user_id is null");
            return (Criteria) this;
        }

        public Criteria andReviewerUserIdIsNotNull() {
            addCriterion("reviewer_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andReviewerUserIdEqualTo(Long value) {
            addCriterion("reviewer_user_id =", value, "reviewerUserId");
            return (Criteria) this;
        }

        public Criteria andReviewerUserIdNotEqualTo(Long value) {
            addCriterion("reviewer_user_id <>", value, "reviewerUserId");
            return (Criteria) this;
        }

        public Criteria andReviewerUserIdGreaterThan(Long value) {
            addCriterion("reviewer_user_id >", value, "reviewerUserId");
            return (Criteria) this;
        }

        public Criteria andReviewerUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("reviewer_user_id >=", value, "reviewerUserId");
            return (Criteria) this;
        }

        public Criteria andReviewerUserIdLessThan(Long value) {
            addCriterion("reviewer_user_id <", value, "reviewerUserId");
            return (Criteria) this;
        }

        public Criteria andReviewerUserIdLessThanOrEqualTo(Long value) {
            addCriterion("reviewer_user_id <=", value, "reviewerUserId");
            return (Criteria) this;
        }

        public Criteria andReviewerUserIdIn(List<Long> values) {
            addCriterion("reviewer_user_id in", values, "reviewerUserId");
            return (Criteria) this;
        }

        public Criteria andReviewerUserIdNotIn(List<Long> values) {
            addCriterion("reviewer_user_id not in", values, "reviewerUserId");
            return (Criteria) this;
        }

        public Criteria andReviewerUserIdBetween(Long value1, Long value2) {
            addCriterion("reviewer_user_id between", value1, value2, "reviewerUserId");
            return (Criteria) this;
        }

        public Criteria andReviewerUserIdNotBetween(Long value1, Long value2) {
            addCriterion("reviewer_user_id not between", value1, value2, "reviewerUserId");
            return (Criteria) this;
        }

        public Criteria andGoodsChkStatusIsNull() {
            addCriterion("goods_chk_status is null");
            return (Criteria) this;
        }

        public Criteria andGoodsChkStatusIsNotNull() {
            addCriterion("goods_chk_status is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsChkStatusEqualTo(String value) {
            addCriterion("goods_chk_status =", value, "goodsChkStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsChkStatusNotEqualTo(String value) {
            addCriterion("goods_chk_status <>", value, "goodsChkStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsChkStatusGreaterThan(String value) {
            addCriterion("goods_chk_status >", value, "goodsChkStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsChkStatusGreaterThanOrEqualTo(String value) {
            addCriterion("goods_chk_status >=", value, "goodsChkStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsChkStatusLessThan(String value) {
            addCriterion("goods_chk_status <", value, "goodsChkStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsChkStatusLessThanOrEqualTo(String value) {
            addCriterion("goods_chk_status <=", value, "goodsChkStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsChkStatusLike(String value) {
            addCriterion("goods_chk_status like", value, "goodsChkStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsChkStatusNotLike(String value) {
            addCriterion("goods_chk_status not like", value, "goodsChkStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsChkStatusIn(List<String> values) {
            addCriterion("goods_chk_status in", values, "goodsChkStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsChkStatusNotIn(List<String> values) {
            addCriterion("goods_chk_status not in", values, "goodsChkStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsChkStatusBetween(String value1, String value2) {
            addCriterion("goods_chk_status between", value1, value2, "goodsChkStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsChkStatusNotBetween(String value1, String value2) {
            addCriterion("goods_chk_status not between", value1, value2, "goodsChkStatus");
            return (Criteria) this;
        }

        public Criteria andBillsChkStatusIsNull() {
            addCriterion("bills_chk_status is null");
            return (Criteria) this;
        }

        public Criteria andBillsChkStatusIsNotNull() {
            addCriterion("bills_chk_status is not null");
            return (Criteria) this;
        }

        public Criteria andBillsChkStatusEqualTo(String value) {
            addCriterion("bills_chk_status =", value, "billsChkStatus");
            return (Criteria) this;
        }

        public Criteria andBillsChkStatusNotEqualTo(String value) {
            addCriterion("bills_chk_status <>", value, "billsChkStatus");
            return (Criteria) this;
        }

        public Criteria andBillsChkStatusGreaterThan(String value) {
            addCriterion("bills_chk_status >", value, "billsChkStatus");
            return (Criteria) this;
        }

        public Criteria andBillsChkStatusGreaterThanOrEqualTo(String value) {
            addCriterion("bills_chk_status >=", value, "billsChkStatus");
            return (Criteria) this;
        }

        public Criteria andBillsChkStatusLessThan(String value) {
            addCriterion("bills_chk_status <", value, "billsChkStatus");
            return (Criteria) this;
        }

        public Criteria andBillsChkStatusLessThanOrEqualTo(String value) {
            addCriterion("bills_chk_status <=", value, "billsChkStatus");
            return (Criteria) this;
        }

        public Criteria andBillsChkStatusLike(String value) {
            addCriterion("bills_chk_status like", value, "billsChkStatus");
            return (Criteria) this;
        }

        public Criteria andBillsChkStatusNotLike(String value) {
            addCriterion("bills_chk_status not like", value, "billsChkStatus");
            return (Criteria) this;
        }

        public Criteria andBillsChkStatusIn(List<String> values) {
            addCriterion("bills_chk_status in", values, "billsChkStatus");
            return (Criteria) this;
        }

        public Criteria andBillsChkStatusNotIn(List<String> values) {
            addCriterion("bills_chk_status not in", values, "billsChkStatus");
            return (Criteria) this;
        }

        public Criteria andBillsChkStatusBetween(String value1, String value2) {
            addCriterion("bills_chk_status between", value1, value2, "billsChkStatus");
            return (Criteria) this;
        }

        public Criteria andBillsChkStatusNotBetween(String value1, String value2) {
            addCriterion("bills_chk_status not between", value1, value2, "billsChkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdIsNull() {
            addCriterion("check_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdIsNotNull() {
            addCriterion("check_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdEqualTo(Long value) {
            addCriterion("check_user_id =", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdNotEqualTo(Long value) {
            addCriterion("check_user_id <>", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdGreaterThan(Long value) {
            addCriterion("check_user_id >", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("check_user_id >=", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdLessThan(Long value) {
            addCriterion("check_user_id <", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdLessThanOrEqualTo(Long value) {
            addCriterion("check_user_id <=", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdIn(List<Long> values) {
            addCriterion("check_user_id in", values, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdNotIn(List<Long> values) {
            addCriterion("check_user_id not in", values, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdBetween(Long value1, Long value2) {
            addCriterion("check_user_id between", value1, value2, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdNotBetween(Long value1, Long value2) {
            addCriterion("check_user_id not between", value1, value2, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckDeptIsNull() {
            addCriterion("check_dept is null");
            return (Criteria) this;
        }

        public Criteria andCheckDeptIsNotNull() {
            addCriterion("check_dept is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDeptEqualTo(String value) {
            addCriterion("check_dept =", value, "checkDept");
            return (Criteria) this;
        }

        public Criteria andCheckDeptNotEqualTo(String value) {
            addCriterion("check_dept <>", value, "checkDept");
            return (Criteria) this;
        }

        public Criteria andCheckDeptGreaterThan(String value) {
            addCriterion("check_dept >", value, "checkDept");
            return (Criteria) this;
        }

        public Criteria andCheckDeptGreaterThanOrEqualTo(String value) {
            addCriterion("check_dept >=", value, "checkDept");
            return (Criteria) this;
        }

        public Criteria andCheckDeptLessThan(String value) {
            addCriterion("check_dept <", value, "checkDept");
            return (Criteria) this;
        }

        public Criteria andCheckDeptLessThanOrEqualTo(String value) {
            addCriterion("check_dept <=", value, "checkDept");
            return (Criteria) this;
        }

        public Criteria andCheckDeptLike(String value) {
            addCriterion("check_dept like", value, "checkDept");
            return (Criteria) this;
        }

        public Criteria andCheckDeptNotLike(String value) {
            addCriterion("check_dept not like", value, "checkDept");
            return (Criteria) this;
        }

        public Criteria andCheckDeptIn(List<String> values) {
            addCriterion("check_dept in", values, "checkDept");
            return (Criteria) this;
        }

        public Criteria andCheckDeptNotIn(List<String> values) {
            addCriterion("check_dept not in", values, "checkDept");
            return (Criteria) this;
        }

        public Criteria andCheckDeptBetween(String value1, String value2) {
            addCriterion("check_dept between", value1, value2, "checkDept");
            return (Criteria) this;
        }

        public Criteria andCheckDeptNotBetween(String value1, String value2) {
            addCriterion("check_dept not between", value1, value2, "checkDept");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNull() {
            addCriterion("check_date is null");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNotNull() {
            addCriterion("check_date is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDateEqualTo(Date value) {
            addCriterionForJDBCDate("check_date =", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("check_date <>", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThan(Date value) {
            addCriterionForJDBCDate("check_date >", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("check_date >=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThan(Date value) {
            addCriterionForJDBCDate("check_date <", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("check_date <=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateIn(List<Date> values) {
            addCriterionForJDBCDate("check_date in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("check_date not in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("check_date between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("check_date not between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIsNull() {
            addCriterion("release_date is null");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIsNotNull() {
            addCriterion("release_date is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseDateEqualTo(Date value) {
            addCriterionForJDBCDate("release_date =", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("release_date <>", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("release_date >", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("release_date >=", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateLessThan(Date value) {
            addCriterionForJDBCDate("release_date <", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("release_date <=", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIn(List<Date> values) {
            addCriterionForJDBCDate("release_date in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("release_date not in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("release_date between", value1, value2, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("release_date not between", value1, value2, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseUserIdIsNull() {
            addCriterion("release_user_id is null");
            return (Criteria) this;
        }

        public Criteria andReleaseUserIdIsNotNull() {
            addCriterion("release_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseUserIdEqualTo(Long value) {
            addCriterion("release_user_id =", value, "releaseUserId");
            return (Criteria) this;
        }

        public Criteria andReleaseUserIdNotEqualTo(Long value) {
            addCriterion("release_user_id <>", value, "releaseUserId");
            return (Criteria) this;
        }

        public Criteria andReleaseUserIdGreaterThan(Long value) {
            addCriterion("release_user_id >", value, "releaseUserId");
            return (Criteria) this;
        }

        public Criteria andReleaseUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("release_user_id >=", value, "releaseUserId");
            return (Criteria) this;
        }

        public Criteria andReleaseUserIdLessThan(Long value) {
            addCriterion("release_user_id <", value, "releaseUserId");
            return (Criteria) this;
        }

        public Criteria andReleaseUserIdLessThanOrEqualTo(Long value) {
            addCriterion("release_user_id <=", value, "releaseUserId");
            return (Criteria) this;
        }

        public Criteria andReleaseUserIdIn(List<Long> values) {
            addCriterion("release_user_id in", values, "releaseUserId");
            return (Criteria) this;
        }

        public Criteria andReleaseUserIdNotIn(List<Long> values) {
            addCriterion("release_user_id not in", values, "releaseUserId");
            return (Criteria) this;
        }

        public Criteria andReleaseUserIdBetween(Long value1, Long value2) {
            addCriterion("release_user_id between", value1, value2, "releaseUserId");
            return (Criteria) this;
        }

        public Criteria andReleaseUserIdNotBetween(Long value1, Long value2) {
            addCriterion("release_user_id not between", value1, value2, "releaseUserId");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderUserIdIsNull() {
            addCriterion("quality_leader_user_id is null");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderUserIdIsNotNull() {
            addCriterion("quality_leader_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderUserIdEqualTo(Long value) {
            addCriterion("quality_leader_user_id =", value, "qualityLeaderUserId");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderUserIdNotEqualTo(Long value) {
            addCriterion("quality_leader_user_id <>", value, "qualityLeaderUserId");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderUserIdGreaterThan(Long value) {
            addCriterion("quality_leader_user_id >", value, "qualityLeaderUserId");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("quality_leader_user_id >=", value, "qualityLeaderUserId");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderUserIdLessThan(Long value) {
            addCriterion("quality_leader_user_id <", value, "qualityLeaderUserId");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderUserIdLessThanOrEqualTo(Long value) {
            addCriterion("quality_leader_user_id <=", value, "qualityLeaderUserId");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderUserIdIn(List<Long> values) {
            addCriterion("quality_leader_user_id in", values, "qualityLeaderUserId");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderUserIdNotIn(List<Long> values) {
            addCriterion("quality_leader_user_id not in", values, "qualityLeaderUserId");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderUserIdBetween(Long value1, Long value2) {
            addCriterion("quality_leader_user_id between", value1, value2, "qualityLeaderUserId");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderUserIdNotBetween(Long value1, Long value2) {
            addCriterion("quality_leader_user_id not between", value1, value2, "qualityLeaderUserId");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIdIsNull() {
            addCriterion("applicant_user_id is null");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIdIsNotNull() {
            addCriterion("applicant_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIdEqualTo(Long value) {
            addCriterion("applicant_user_id =", value, "applicantUserId");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIdNotEqualTo(Long value) {
            addCriterion("applicant_user_id <>", value, "applicantUserId");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIdGreaterThan(Long value) {
            addCriterion("applicant_user_id >", value, "applicantUserId");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("applicant_user_id >=", value, "applicantUserId");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIdLessThan(Long value) {
            addCriterion("applicant_user_id <", value, "applicantUserId");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIdLessThanOrEqualTo(Long value) {
            addCriterion("applicant_user_id <=", value, "applicantUserId");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIdIn(List<Long> values) {
            addCriterion("applicant_user_id in", values, "applicantUserId");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIdNotIn(List<Long> values) {
            addCriterion("applicant_user_id not in", values, "applicantUserId");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIdBetween(Long value1, Long value2) {
            addCriterion("applicant_user_id between", value1, value2, "applicantUserId");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIdNotBetween(Long value1, Long value2) {
            addCriterion("applicant_user_id not between", value1, value2, "applicantUserId");
            return (Criteria) this;
        }

        public Criteria andApplicantDateIsNull() {
            addCriterion("applicant_date is null");
            return (Criteria) this;
        }

        public Criteria andApplicantDateIsNotNull() {
            addCriterion("applicant_date is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantDateEqualTo(Date value) {
            addCriterionForJDBCDate("applicant_date =", value, "applicantDate");
            return (Criteria) this;
        }

        public Criteria andApplicantDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("applicant_date <>", value, "applicantDate");
            return (Criteria) this;
        }

        public Criteria andApplicantDateGreaterThan(Date value) {
            addCriterionForJDBCDate("applicant_date >", value, "applicantDate");
            return (Criteria) this;
        }

        public Criteria andApplicantDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("applicant_date >=", value, "applicantDate");
            return (Criteria) this;
        }

        public Criteria andApplicantDateLessThan(Date value) {
            addCriterionForJDBCDate("applicant_date <", value, "applicantDate");
            return (Criteria) this;
        }

        public Criteria andApplicantDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("applicant_date <=", value, "applicantDate");
            return (Criteria) this;
        }

        public Criteria andApplicantDateIn(List<Date> values) {
            addCriterionForJDBCDate("applicant_date in", values, "applicantDate");
            return (Criteria) this;
        }

        public Criteria andApplicantDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("applicant_date not in", values, "applicantDate");
            return (Criteria) this;
        }

        public Criteria andApplicantDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("applicant_date between", value1, value2, "applicantDate");
            return (Criteria) this;
        }

        public Criteria andApplicantDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("applicant_date not between", value1, value2, "applicantDate");
            return (Criteria) this;
        }

        public Criteria andApproverUserIdIsNull() {
            addCriterion("approver_user_id is null");
            return (Criteria) this;
        }

        public Criteria andApproverUserIdIsNotNull() {
            addCriterion("approver_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andApproverUserIdEqualTo(Long value) {
            addCriterion("approver_user_id =", value, "approverUserId");
            return (Criteria) this;
        }

        public Criteria andApproverUserIdNotEqualTo(Long value) {
            addCriterion("approver_user_id <>", value, "approverUserId");
            return (Criteria) this;
        }

        public Criteria andApproverUserIdGreaterThan(Long value) {
            addCriterion("approver_user_id >", value, "approverUserId");
            return (Criteria) this;
        }

        public Criteria andApproverUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("approver_user_id >=", value, "approverUserId");
            return (Criteria) this;
        }

        public Criteria andApproverUserIdLessThan(Long value) {
            addCriterion("approver_user_id <", value, "approverUserId");
            return (Criteria) this;
        }

        public Criteria andApproverUserIdLessThanOrEqualTo(Long value) {
            addCriterion("approver_user_id <=", value, "approverUserId");
            return (Criteria) this;
        }

        public Criteria andApproverUserIdIn(List<Long> values) {
            addCriterion("approver_user_id in", values, "approverUserId");
            return (Criteria) this;
        }

        public Criteria andApproverUserIdNotIn(List<Long> values) {
            addCriterion("approver_user_id not in", values, "approverUserId");
            return (Criteria) this;
        }

        public Criteria andApproverUserIdBetween(Long value1, Long value2) {
            addCriterion("approver_user_id between", value1, value2, "approverUserId");
            return (Criteria) this;
        }

        public Criteria andApproverUserIdNotBetween(Long value1, Long value2) {
            addCriterion("approver_user_id not between", value1, value2, "approverUserId");
            return (Criteria) this;
        }

        public Criteria andApprovalDateIsNull() {
            addCriterion("approval_date is null");
            return (Criteria) this;
        }

        public Criteria andApprovalDateIsNotNull() {
            addCriterion("approval_date is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalDateEqualTo(Date value) {
            addCriterionForJDBCDate("approval_date =", value, "approvalDate");
            return (Criteria) this;
        }

        public Criteria andApprovalDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("approval_date <>", value, "approvalDate");
            return (Criteria) this;
        }

        public Criteria andApprovalDateGreaterThan(Date value) {
            addCriterionForJDBCDate("approval_date >", value, "approvalDate");
            return (Criteria) this;
        }

        public Criteria andApprovalDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("approval_date >=", value, "approvalDate");
            return (Criteria) this;
        }

        public Criteria andApprovalDateLessThan(Date value) {
            addCriterionForJDBCDate("approval_date <", value, "approvalDate");
            return (Criteria) this;
        }

        public Criteria andApprovalDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("approval_date <=", value, "approvalDate");
            return (Criteria) this;
        }

        public Criteria andApprovalDateIn(List<Date> values) {
            addCriterionForJDBCDate("approval_date in", values, "approvalDate");
            return (Criteria) this;
        }

        public Criteria andApprovalDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("approval_date not in", values, "approvalDate");
            return (Criteria) this;
        }

        public Criteria andApprovalDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("approval_date between", value1, value2, "approvalDate");
            return (Criteria) this;
        }

        public Criteria andApprovalDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("approval_date not between", value1, value2, "approvalDate");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andOpinionIsNull() {
            addCriterion("opinion is null");
            return (Criteria) this;
        }

        public Criteria andOpinionIsNotNull() {
            addCriterion("opinion is not null");
            return (Criteria) this;
        }

        public Criteria andOpinionEqualTo(String value) {
            addCriterion("opinion =", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotEqualTo(String value) {
            addCriterion("opinion <>", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionGreaterThan(String value) {
            addCriterion("opinion >", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("opinion >=", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionLessThan(String value) {
            addCriterion("opinion <", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionLessThanOrEqualTo(String value) {
            addCriterion("opinion <=", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionLike(String value) {
            addCriterion("opinion like", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotLike(String value) {
            addCriterion("opinion not like", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionIn(List<String> values) {
            addCriterion("opinion in", values, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotIn(List<String> values) {
            addCriterion("opinion not in", values, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionBetween(String value1, String value2) {
            addCriterion("opinion between", value1, value2, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotBetween(String value1, String value2) {
            addCriterion("opinion not between", value1, value2, "opinion");
            return (Criteria) this;
        }

        public Criteria andLeaveDateIsNull() {
            addCriterion("leave_date is null");
            return (Criteria) this;
        }

        public Criteria andLeaveDateIsNotNull() {
            addCriterion("leave_date is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveDateEqualTo(Date value) {
            addCriterionForJDBCDate("leave_date =", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("leave_date <>", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateGreaterThan(Date value) {
            addCriterionForJDBCDate("leave_date >", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("leave_date >=", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateLessThan(Date value) {
            addCriterionForJDBCDate("leave_date <", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("leave_date <=", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateIn(List<Date> values) {
            addCriterionForJDBCDate("leave_date in", values, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("leave_date not in", values, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("leave_date between", value1, value2, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("leave_date not between", value1, value2, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andDeliverDetailStatusIsNull() {
            addCriterion("deliver_detail_status is null");
            return (Criteria) this;
        }

        public Criteria andDeliverDetailStatusIsNotNull() {
            addCriterion("deliver_detail_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverDetailStatusEqualTo(Short value) {
            addCriterion("deliver_detail_status =", value, "deliverDetailStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverDetailStatusNotEqualTo(Short value) {
            addCriterion("deliver_detail_status <>", value, "deliverDetailStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverDetailStatusGreaterThan(Short value) {
            addCriterion("deliver_detail_status >", value, "deliverDetailStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverDetailStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("deliver_detail_status >=", value, "deliverDetailStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverDetailStatusLessThan(Short value) {
            addCriterion("deliver_detail_status <", value, "deliverDetailStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverDetailStatusLessThanOrEqualTo(Short value) {
            addCriterion("deliver_detail_status <=", value, "deliverDetailStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverDetailStatusIn(List<Short> values) {
            addCriterion("deliver_detail_status in", values, "deliverDetailStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverDetailStatusNotIn(List<Short> values) {
            addCriterion("deliver_detail_status not in", values, "deliverDetailStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverDetailStatusBetween(Short value1, Short value2) {
            addCriterion("deliver_detail_status between", value1, value2, "deliverDetailStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverDetailStatusNotBetween(Short value1, Short value2) {
            addCriterion("deliver_detail_status not between", value1, value2, "deliverDetailStatus");
            return (Criteria) this;
        }

        public Criteria andPackTotalIsNull() {
            addCriterion("pack_total is null");
            return (Criteria) this;
        }

        public Criteria andPackTotalIsNotNull() {
            addCriterion("pack_total is not null");
            return (Criteria) this;
        }

        public Criteria andPackTotalEqualTo(Short value) {
            addCriterion("pack_total =", value, "packTotal");
            return (Criteria) this;
        }

        public Criteria andPackTotalNotEqualTo(Short value) {
            addCriterion("pack_total <>", value, "packTotal");
            return (Criteria) this;
        }

        public Criteria andPackTotalGreaterThan(Short value) {
            addCriterion("pack_total >", value, "packTotal");
            return (Criteria) this;
        }

        public Criteria andPackTotalGreaterThanOrEqualTo(Short value) {
            addCriterion("pack_total >=", value, "packTotal");
            return (Criteria) this;
        }

        public Criteria andPackTotalLessThan(Short value) {
            addCriterion("pack_total <", value, "packTotal");
            return (Criteria) this;
        }

        public Criteria andPackTotalLessThanOrEqualTo(Short value) {
            addCriterion("pack_total <=", value, "packTotal");
            return (Criteria) this;
        }

        public Criteria andPackTotalIn(List<Short> values) {
            addCriterion("pack_total in", values, "packTotal");
            return (Criteria) this;
        }

        public Criteria andPackTotalNotIn(List<Short> values) {
            addCriterion("pack_total not in", values, "packTotal");
            return (Criteria) this;
        }

        public Criteria andPackTotalBetween(Short value1, Short value2) {
            addCriterion("pack_total between", value1, value2, "packTotal");
            return (Criteria) this;
        }

        public Criteria andPackTotalNotBetween(Short value1, Short value2) {
            addCriterion("pack_total not between", value1, value2, "packTotal");
            return (Criteria) this;
        }

        public Criteria andOutCheckIsNull() {
            addCriterion("out_check is null");
            return (Criteria) this;
        }

        public Criteria andOutCheckIsNotNull() {
            addCriterion("out_check is not null");
            return (Criteria) this;
        }

        public Criteria andOutCheckEqualTo(Boolean value) {
            addCriterion("out_check =", value, "outCheck");
            return (Criteria) this;
        }

        public Criteria andOutCheckNotEqualTo(Boolean value) {
            addCriterion("out_check <>", value, "outCheck");
            return (Criteria) this;
        }

        public Criteria andOutCheckGreaterThan(Boolean value) {
            addCriterion("out_check >", value, "outCheck");
            return (Criteria) this;
        }

        public Criteria andOutCheckGreaterThanOrEqualTo(Boolean value) {
            addCriterion("out_check >=", value, "outCheck");
            return (Criteria) this;
        }

        public Criteria andOutCheckLessThan(Boolean value) {
            addCriterion("out_check <", value, "outCheck");
            return (Criteria) this;
        }

        public Criteria andOutCheckLessThanOrEqualTo(Boolean value) {
            addCriterion("out_check <=", value, "outCheck");
            return (Criteria) this;
        }

        public Criteria andOutCheckIn(List<Boolean> values) {
            addCriterion("out_check in", values, "outCheck");
            return (Criteria) this;
        }

        public Criteria andOutCheckNotIn(List<Boolean> values) {
            addCriterion("out_check not in", values, "outCheck");
            return (Criteria) this;
        }

        public Criteria andOutCheckBetween(Boolean value1, Boolean value2) {
            addCriterion("out_check between", value1, value2, "outCheck");
            return (Criteria) this;
        }

        public Criteria andOutCheckNotBetween(Boolean value1, Boolean value2) {
            addCriterion("out_check not between", value1, value2, "outCheck");
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

        public Criteria andTradeTermsIsNull() {
            addCriterion("trade_terms is null");
            return (Criteria) this;
        }

        public Criteria andTradeTermsIsNotNull() {
            addCriterion("trade_terms is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTermsEqualTo(String value) {
            addCriterion("trade_terms =", value, "tradeTerms");
            return (Criteria) this;
        }

        public Criteria andTradeTermsNotEqualTo(String value) {
            addCriterion("trade_terms <>", value, "tradeTerms");
            return (Criteria) this;
        }

        public Criteria andTradeTermsGreaterThan(String value) {
            addCriterion("trade_terms >", value, "tradeTerms");
            return (Criteria) this;
        }

        public Criteria andTradeTermsGreaterThanOrEqualTo(String value) {
            addCriterion("trade_terms >=", value, "tradeTerms");
            return (Criteria) this;
        }

        public Criteria andTradeTermsLessThan(String value) {
            addCriterion("trade_terms <", value, "tradeTerms");
            return (Criteria) this;
        }

        public Criteria andTradeTermsLessThanOrEqualTo(String value) {
            addCriterion("trade_terms <=", value, "tradeTerms");
            return (Criteria) this;
        }

        public Criteria andTradeTermsLike(String value) {
            addCriterion("trade_terms like", value, "tradeTerms");
            return (Criteria) this;
        }

        public Criteria andTradeTermsNotLike(String value) {
            addCriterion("trade_terms not like", value, "tradeTerms");
            return (Criteria) this;
        }

        public Criteria andTradeTermsIn(List<String> values) {
            addCriterion("trade_terms in", values, "tradeTerms");
            return (Criteria) this;
        }

        public Criteria andTradeTermsNotIn(List<String> values) {
            addCriterion("trade_terms not in", values, "tradeTerms");
            return (Criteria) this;
        }

        public Criteria andTradeTermsBetween(String value1, String value2) {
            addCriterion("trade_terms between", value1, value2, "tradeTerms");
            return (Criteria) this;
        }

        public Criteria andTradeTermsNotBetween(String value1, String value2) {
            addCriterion("trade_terms not between", value1, value2, "tradeTerms");
            return (Criteria) this;
        }

        public Criteria andToPortIsNull() {
            addCriterion("to_port is null");
            return (Criteria) this;
        }

        public Criteria andToPortIsNotNull() {
            addCriterion("to_port is not null");
            return (Criteria) this;
        }

        public Criteria andToPortEqualTo(String value) {
            addCriterion("to_port =", value, "toPort");
            return (Criteria) this;
        }

        public Criteria andToPortNotEqualTo(String value) {
            addCriterion("to_port <>", value, "toPort");
            return (Criteria) this;
        }

        public Criteria andToPortGreaterThan(String value) {
            addCriterion("to_port >", value, "toPort");
            return (Criteria) this;
        }

        public Criteria andToPortGreaterThanOrEqualTo(String value) {
            addCriterion("to_port >=", value, "toPort");
            return (Criteria) this;
        }

        public Criteria andToPortLessThan(String value) {
            addCriterion("to_port <", value, "toPort");
            return (Criteria) this;
        }

        public Criteria andToPortLessThanOrEqualTo(String value) {
            addCriterion("to_port <=", value, "toPort");
            return (Criteria) this;
        }

        public Criteria andToPortLike(String value) {
            addCriterion("to_port like", value, "toPort");
            return (Criteria) this;
        }

        public Criteria andToPortNotLike(String value) {
            addCriterion("to_port not like", value, "toPort");
            return (Criteria) this;
        }

        public Criteria andToPortIn(List<String> values) {
            addCriterion("to_port in", values, "toPort");
            return (Criteria) this;
        }

        public Criteria andToPortNotIn(List<String> values) {
            addCriterion("to_port not in", values, "toPort");
            return (Criteria) this;
        }

        public Criteria andToPortBetween(String value1, String value2) {
            addCriterion("to_port between", value1, value2, "toPort");
            return (Criteria) this;
        }

        public Criteria andToPortNotBetween(String value1, String value2) {
            addCriterion("to_port not between", value1, value2, "toPort");
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