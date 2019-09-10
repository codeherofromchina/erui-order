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

        public Criteria andSenderIsNull() {
            addCriterion("sender is null");
            return (Criteria) this;
        }

        public Criteria andSenderIsNotNull() {
            addCriterion("sender is not null");
            return (Criteria) this;
        }

        public Criteria andSenderEqualTo(Long value) {
            addCriterion("sender =", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotEqualTo(Long value) {
            addCriterion("sender <>", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThan(Long value) {
            addCriterion("sender >", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThanOrEqualTo(Long value) {
            addCriterion("sender >=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThan(Long value) {
            addCriterion("sender <", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThanOrEqualTo(Long value) {
            addCriterion("sender <=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderIn(List<Long> values) {
            addCriterion("sender in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotIn(List<Long> values) {
            addCriterion("sender not in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderBetween(Long value1, Long value2) {
            addCriterion("sender between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotBetween(Long value1, Long value2) {
            addCriterion("sender not between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNameIsNull() {
            addCriterion("sender_name is null");
            return (Criteria) this;
        }

        public Criteria andSenderNameIsNotNull() {
            addCriterion("sender_name is not null");
            return (Criteria) this;
        }

        public Criteria andSenderNameEqualTo(String value) {
            addCriterion("sender_name =", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotEqualTo(String value) {
            addCriterion("sender_name <>", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameGreaterThan(String value) {
            addCriterion("sender_name >", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameGreaterThanOrEqualTo(String value) {
            addCriterion("sender_name >=", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameLessThan(String value) {
            addCriterion("sender_name <", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameLessThanOrEqualTo(String value) {
            addCriterion("sender_name <=", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameLike(String value) {
            addCriterion("sender_name like", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotLike(String value) {
            addCriterion("sender_name not like", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameIn(List<String> values) {
            addCriterion("sender_name in", values, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotIn(List<String> values) {
            addCriterion("sender_name not in", values, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameBetween(String value1, String value2) {
            addCriterion("sender_name between", value1, value2, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotBetween(String value1, String value2) {
            addCriterion("sender_name not between", value1, value2, "senderName");
            return (Criteria) this;
        }

        public Criteria andReviewerIsNull() {
            addCriterion("reviewer is null");
            return (Criteria) this;
        }

        public Criteria andReviewerIsNotNull() {
            addCriterion("reviewer is not null");
            return (Criteria) this;
        }

        public Criteria andReviewerEqualTo(Long value) {
            addCriterion("reviewer =", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotEqualTo(Long value) {
            addCriterion("reviewer <>", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerGreaterThan(Long value) {
            addCriterion("reviewer >", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerGreaterThanOrEqualTo(Long value) {
            addCriterion("reviewer >=", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLessThan(Long value) {
            addCriterion("reviewer <", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLessThanOrEqualTo(Long value) {
            addCriterion("reviewer <=", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerIn(List<Long> values) {
            addCriterion("reviewer in", values, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotIn(List<Long> values) {
            addCriterion("reviewer not in", values, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerBetween(Long value1, Long value2) {
            addCriterion("reviewer between", value1, value2, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotBetween(Long value1, Long value2) {
            addCriterion("reviewer not between", value1, value2, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNameIsNull() {
            addCriterion("reviewer_name is null");
            return (Criteria) this;
        }

        public Criteria andReviewerNameIsNotNull() {
            addCriterion("reviewer_name is not null");
            return (Criteria) this;
        }

        public Criteria andReviewerNameEqualTo(String value) {
            addCriterion("reviewer_name =", value, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameNotEqualTo(String value) {
            addCriterion("reviewer_name <>", value, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameGreaterThan(String value) {
            addCriterion("reviewer_name >", value, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameGreaterThanOrEqualTo(String value) {
            addCriterion("reviewer_name >=", value, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameLessThan(String value) {
            addCriterion("reviewer_name <", value, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameLessThanOrEqualTo(String value) {
            addCriterion("reviewer_name <=", value, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameLike(String value) {
            addCriterion("reviewer_name like", value, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameNotLike(String value) {
            addCriterion("reviewer_name not like", value, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameIn(List<String> values) {
            addCriterion("reviewer_name in", values, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameNotIn(List<String> values) {
            addCriterion("reviewer_name not in", values, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameBetween(String value1, String value2) {
            addCriterion("reviewer_name between", value1, value2, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameNotBetween(String value1, String value2) {
            addCriterion("reviewer_name not between", value1, value2, "reviewerName");
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

        public Criteria andCheckerUidIsNull() {
            addCriterion("checker_uid is null");
            return (Criteria) this;
        }

        public Criteria andCheckerUidIsNotNull() {
            addCriterion("checker_uid is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerUidEqualTo(Long value) {
            addCriterion("checker_uid =", value, "checkerUid");
            return (Criteria) this;
        }

        public Criteria andCheckerUidNotEqualTo(Long value) {
            addCriterion("checker_uid <>", value, "checkerUid");
            return (Criteria) this;
        }

        public Criteria andCheckerUidGreaterThan(Long value) {
            addCriterion("checker_uid >", value, "checkerUid");
            return (Criteria) this;
        }

        public Criteria andCheckerUidGreaterThanOrEqualTo(Long value) {
            addCriterion("checker_uid >=", value, "checkerUid");
            return (Criteria) this;
        }

        public Criteria andCheckerUidLessThan(Long value) {
            addCriterion("checker_uid <", value, "checkerUid");
            return (Criteria) this;
        }

        public Criteria andCheckerUidLessThanOrEqualTo(Long value) {
            addCriterion("checker_uid <=", value, "checkerUid");
            return (Criteria) this;
        }

        public Criteria andCheckerUidIn(List<Long> values) {
            addCriterion("checker_uid in", values, "checkerUid");
            return (Criteria) this;
        }

        public Criteria andCheckerUidNotIn(List<Long> values) {
            addCriterion("checker_uid not in", values, "checkerUid");
            return (Criteria) this;
        }

        public Criteria andCheckerUidBetween(Long value1, Long value2) {
            addCriterion("checker_uid between", value1, value2, "checkerUid");
            return (Criteria) this;
        }

        public Criteria andCheckerUidNotBetween(Long value1, Long value2) {
            addCriterion("checker_uid not between", value1, value2, "checkerUid");
            return (Criteria) this;
        }

        public Criteria andCheckerNameIsNull() {
            addCriterion("checker_name is null");
            return (Criteria) this;
        }

        public Criteria andCheckerNameIsNotNull() {
            addCriterion("checker_name is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerNameEqualTo(String value) {
            addCriterion("checker_name =", value, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameNotEqualTo(String value) {
            addCriterion("checker_name <>", value, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameGreaterThan(String value) {
            addCriterion("checker_name >", value, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameGreaterThanOrEqualTo(String value) {
            addCriterion("checker_name >=", value, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameLessThan(String value) {
            addCriterion("checker_name <", value, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameLessThanOrEqualTo(String value) {
            addCriterion("checker_name <=", value, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameLike(String value) {
            addCriterion("checker_name like", value, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameNotLike(String value) {
            addCriterion("checker_name not like", value, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameIn(List<String> values) {
            addCriterion("checker_name in", values, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameNotIn(List<String> values) {
            addCriterion("checker_name not in", values, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameBetween(String value1, String value2) {
            addCriterion("checker_name between", value1, value2, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameNotBetween(String value1, String value2) {
            addCriterion("checker_name not between", value1, value2, "checkerName");
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

        public Criteria andReleaseNameIsNull() {
            addCriterion("release_name is null");
            return (Criteria) this;
        }

        public Criteria andReleaseNameIsNotNull() {
            addCriterion("release_name is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseNameEqualTo(String value) {
            addCriterion("release_name =", value, "releaseName");
            return (Criteria) this;
        }

        public Criteria andReleaseNameNotEqualTo(String value) {
            addCriterion("release_name <>", value, "releaseName");
            return (Criteria) this;
        }

        public Criteria andReleaseNameGreaterThan(String value) {
            addCriterion("release_name >", value, "releaseName");
            return (Criteria) this;
        }

        public Criteria andReleaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("release_name >=", value, "releaseName");
            return (Criteria) this;
        }

        public Criteria andReleaseNameLessThan(String value) {
            addCriterion("release_name <", value, "releaseName");
            return (Criteria) this;
        }

        public Criteria andReleaseNameLessThanOrEqualTo(String value) {
            addCriterion("release_name <=", value, "releaseName");
            return (Criteria) this;
        }

        public Criteria andReleaseNameLike(String value) {
            addCriterion("release_name like", value, "releaseName");
            return (Criteria) this;
        }

        public Criteria andReleaseNameNotLike(String value) {
            addCriterion("release_name not like", value, "releaseName");
            return (Criteria) this;
        }

        public Criteria andReleaseNameIn(List<String> values) {
            addCriterion("release_name in", values, "releaseName");
            return (Criteria) this;
        }

        public Criteria andReleaseNameNotIn(List<String> values) {
            addCriterion("release_name not in", values, "releaseName");
            return (Criteria) this;
        }

        public Criteria andReleaseNameBetween(String value1, String value2) {
            addCriterion("release_name between", value1, value2, "releaseName");
            return (Criteria) this;
        }

        public Criteria andReleaseNameNotBetween(String value1, String value2) {
            addCriterion("release_name not between", value1, value2, "releaseName");
            return (Criteria) this;
        }

        public Criteria andReleaseUidIsNull() {
            addCriterion("release_uid is null");
            return (Criteria) this;
        }

        public Criteria andReleaseUidIsNotNull() {
            addCriterion("release_uid is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseUidEqualTo(Long value) {
            addCriterion("release_uid =", value, "releaseUid");
            return (Criteria) this;
        }

        public Criteria andReleaseUidNotEqualTo(Long value) {
            addCriterion("release_uid <>", value, "releaseUid");
            return (Criteria) this;
        }

        public Criteria andReleaseUidGreaterThan(Long value) {
            addCriterion("release_uid >", value, "releaseUid");
            return (Criteria) this;
        }

        public Criteria andReleaseUidGreaterThanOrEqualTo(Long value) {
            addCriterion("release_uid >=", value, "releaseUid");
            return (Criteria) this;
        }

        public Criteria andReleaseUidLessThan(Long value) {
            addCriterion("release_uid <", value, "releaseUid");
            return (Criteria) this;
        }

        public Criteria andReleaseUidLessThanOrEqualTo(Long value) {
            addCriterion("release_uid <=", value, "releaseUid");
            return (Criteria) this;
        }

        public Criteria andReleaseUidIn(List<Long> values) {
            addCriterion("release_uid in", values, "releaseUid");
            return (Criteria) this;
        }

        public Criteria andReleaseUidNotIn(List<Long> values) {
            addCriterion("release_uid not in", values, "releaseUid");
            return (Criteria) this;
        }

        public Criteria andReleaseUidBetween(Long value1, Long value2) {
            addCriterion("release_uid between", value1, value2, "releaseUid");
            return (Criteria) this;
        }

        public Criteria andReleaseUidNotBetween(Long value1, Long value2) {
            addCriterion("release_uid not between", value1, value2, "releaseUid");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderIdIsNull() {
            addCriterion("quality_leader_id is null");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderIdIsNotNull() {
            addCriterion("quality_leader_id is not null");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderIdEqualTo(Long value) {
            addCriterion("quality_leader_id =", value, "qualityLeaderId");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderIdNotEqualTo(Long value) {
            addCriterion("quality_leader_id <>", value, "qualityLeaderId");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderIdGreaterThan(Long value) {
            addCriterion("quality_leader_id >", value, "qualityLeaderId");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("quality_leader_id >=", value, "qualityLeaderId");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderIdLessThan(Long value) {
            addCriterion("quality_leader_id <", value, "qualityLeaderId");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderIdLessThanOrEqualTo(Long value) {
            addCriterion("quality_leader_id <=", value, "qualityLeaderId");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderIdIn(List<Long> values) {
            addCriterion("quality_leader_id in", values, "qualityLeaderId");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderIdNotIn(List<Long> values) {
            addCriterion("quality_leader_id not in", values, "qualityLeaderId");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderIdBetween(Long value1, Long value2) {
            addCriterion("quality_leader_id between", value1, value2, "qualityLeaderId");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderIdNotBetween(Long value1, Long value2) {
            addCriterion("quality_leader_id not between", value1, value2, "qualityLeaderId");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderNameIsNull() {
            addCriterion("quality_leader_name is null");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderNameIsNotNull() {
            addCriterion("quality_leader_name is not null");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderNameEqualTo(String value) {
            addCriterion("quality_leader_name =", value, "qualityLeaderName");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderNameNotEqualTo(String value) {
            addCriterion("quality_leader_name <>", value, "qualityLeaderName");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderNameGreaterThan(String value) {
            addCriterion("quality_leader_name >", value, "qualityLeaderName");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderNameGreaterThanOrEqualTo(String value) {
            addCriterion("quality_leader_name >=", value, "qualityLeaderName");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderNameLessThan(String value) {
            addCriterion("quality_leader_name <", value, "qualityLeaderName");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderNameLessThanOrEqualTo(String value) {
            addCriterion("quality_leader_name <=", value, "qualityLeaderName");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderNameLike(String value) {
            addCriterion("quality_leader_name like", value, "qualityLeaderName");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderNameNotLike(String value) {
            addCriterion("quality_leader_name not like", value, "qualityLeaderName");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderNameIn(List<String> values) {
            addCriterion("quality_leader_name in", values, "qualityLeaderName");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderNameNotIn(List<String> values) {
            addCriterion("quality_leader_name not in", values, "qualityLeaderName");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderNameBetween(String value1, String value2) {
            addCriterion("quality_leader_name between", value1, value2, "qualityLeaderName");
            return (Criteria) this;
        }

        public Criteria andQualityLeaderNameNotBetween(String value1, String value2) {
            addCriterion("quality_leader_name not between", value1, value2, "qualityLeaderName");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNull() {
            addCriterion("applicant is null");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNotNull() {
            addCriterion("applicant is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantEqualTo(Long value) {
            addCriterion("applicant =", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotEqualTo(Long value) {
            addCriterion("applicant <>", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThan(Long value) {
            addCriterion("applicant >", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThanOrEqualTo(Long value) {
            addCriterion("applicant >=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThan(Long value) {
            addCriterion("applicant <", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThanOrEqualTo(Long value) {
            addCriterion("applicant <=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantIn(List<Long> values) {
            addCriterion("applicant in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotIn(List<Long> values) {
            addCriterion("applicant not in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantBetween(Long value1, Long value2) {
            addCriterion("applicant between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotBetween(Long value1, Long value2) {
            addCriterion("applicant not between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNameIsNull() {
            addCriterion("applicant_name is null");
            return (Criteria) this;
        }

        public Criteria andApplicantNameIsNotNull() {
            addCriterion("applicant_name is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantNameEqualTo(String value) {
            addCriterion("applicant_name =", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameNotEqualTo(String value) {
            addCriterion("applicant_name <>", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameGreaterThan(String value) {
            addCriterion("applicant_name >", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameGreaterThanOrEqualTo(String value) {
            addCriterion("applicant_name >=", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameLessThan(String value) {
            addCriterion("applicant_name <", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameLessThanOrEqualTo(String value) {
            addCriterion("applicant_name <=", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameLike(String value) {
            addCriterion("applicant_name like", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameNotLike(String value) {
            addCriterion("applicant_name not like", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameIn(List<String> values) {
            addCriterion("applicant_name in", values, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameNotIn(List<String> values) {
            addCriterion("applicant_name not in", values, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameBetween(String value1, String value2) {
            addCriterion("applicant_name between", value1, value2, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameNotBetween(String value1, String value2) {
            addCriterion("applicant_name not between", value1, value2, "applicantName");
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

        public Criteria andApproverIsNull() {
            addCriterion("approver is null");
            return (Criteria) this;
        }

        public Criteria andApproverIsNotNull() {
            addCriterion("approver is not null");
            return (Criteria) this;
        }

        public Criteria andApproverEqualTo(Long value) {
            addCriterion("approver =", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotEqualTo(Long value) {
            addCriterion("approver <>", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThan(Long value) {
            addCriterion("approver >", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThanOrEqualTo(Long value) {
            addCriterion("approver >=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThan(Long value) {
            addCriterion("approver <", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThanOrEqualTo(Long value) {
            addCriterion("approver <=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverIn(List<Long> values) {
            addCriterion("approver in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotIn(List<Long> values) {
            addCriterion("approver not in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverBetween(Long value1, Long value2) {
            addCriterion("approver between", value1, value2, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotBetween(Long value1, Long value2) {
            addCriterion("approver not between", value1, value2, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNameIsNull() {
            addCriterion("approver_name is null");
            return (Criteria) this;
        }

        public Criteria andApproverNameIsNotNull() {
            addCriterion("approver_name is not null");
            return (Criteria) this;
        }

        public Criteria andApproverNameEqualTo(String value) {
            addCriterion("approver_name =", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameNotEqualTo(String value) {
            addCriterion("approver_name <>", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameGreaterThan(String value) {
            addCriterion("approver_name >", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameGreaterThanOrEqualTo(String value) {
            addCriterion("approver_name >=", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameLessThan(String value) {
            addCriterion("approver_name <", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameLessThanOrEqualTo(String value) {
            addCriterion("approver_name <=", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameLike(String value) {
            addCriterion("approver_name like", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameNotLike(String value) {
            addCriterion("approver_name not like", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameIn(List<String> values) {
            addCriterion("approver_name in", values, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameNotIn(List<String> values) {
            addCriterion("approver_name not in", values, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameBetween(String value1, String value2) {
            addCriterion("approver_name between", value1, value2, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameNotBetween(String value1, String value2) {
            addCriterion("approver_name not between", value1, value2, "approverName");
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