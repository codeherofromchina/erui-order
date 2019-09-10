package com.erui.order.model.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LogisticsDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogisticsDataExample() {
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

        public Criteria andTheAwbNoIsNull() {
            addCriterion("the_awb_no is null");
            return (Criteria) this;
        }

        public Criteria andTheAwbNoIsNotNull() {
            addCriterion("the_awb_no is not null");
            return (Criteria) this;
        }

        public Criteria andTheAwbNoEqualTo(String value) {
            addCriterion("the_awb_no =", value, "theAwbNo");
            return (Criteria) this;
        }

        public Criteria andTheAwbNoNotEqualTo(String value) {
            addCriterion("the_awb_no <>", value, "theAwbNo");
            return (Criteria) this;
        }

        public Criteria andTheAwbNoGreaterThan(String value) {
            addCriterion("the_awb_no >", value, "theAwbNo");
            return (Criteria) this;
        }

        public Criteria andTheAwbNoGreaterThanOrEqualTo(String value) {
            addCriterion("the_awb_no >=", value, "theAwbNo");
            return (Criteria) this;
        }

        public Criteria andTheAwbNoLessThan(String value) {
            addCriterion("the_awb_no <", value, "theAwbNo");
            return (Criteria) this;
        }

        public Criteria andTheAwbNoLessThanOrEqualTo(String value) {
            addCriterion("the_awb_no <=", value, "theAwbNo");
            return (Criteria) this;
        }

        public Criteria andTheAwbNoLike(String value) {
            addCriterion("the_awb_no like", value, "theAwbNo");
            return (Criteria) this;
        }

        public Criteria andTheAwbNoNotLike(String value) {
            addCriterion("the_awb_no not like", value, "theAwbNo");
            return (Criteria) this;
        }

        public Criteria andTheAwbNoIn(List<String> values) {
            addCriterion("the_awb_no in", values, "theAwbNo");
            return (Criteria) this;
        }

        public Criteria andTheAwbNoNotIn(List<String> values) {
            addCriterion("the_awb_no not in", values, "theAwbNo");
            return (Criteria) this;
        }

        public Criteria andTheAwbNoBetween(String value1, String value2) {
            addCriterion("the_awb_no between", value1, value2, "theAwbNo");
            return (Criteria) this;
        }

        public Criteria andTheAwbNoNotBetween(String value1, String value2) {
            addCriterion("the_awb_no not between", value1, value2, "theAwbNo");
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

        public Criteria andLogisticsUserIdIsNull() {
            addCriterion("logistics_user_id is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsUserIdIsNotNull() {
            addCriterion("logistics_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsUserIdEqualTo(Long value) {
            addCriterion("logistics_user_id =", value, "logisticsUserId");
            return (Criteria) this;
        }

        public Criteria andLogisticsUserIdNotEqualTo(Long value) {
            addCriterion("logistics_user_id <>", value, "logisticsUserId");
            return (Criteria) this;
        }

        public Criteria andLogisticsUserIdGreaterThan(Long value) {
            addCriterion("logistics_user_id >", value, "logisticsUserId");
            return (Criteria) this;
        }

        public Criteria andLogisticsUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("logistics_user_id >=", value, "logisticsUserId");
            return (Criteria) this;
        }

        public Criteria andLogisticsUserIdLessThan(Long value) {
            addCriterion("logistics_user_id <", value, "logisticsUserId");
            return (Criteria) this;
        }

        public Criteria andLogisticsUserIdLessThanOrEqualTo(Long value) {
            addCriterion("logistics_user_id <=", value, "logisticsUserId");
            return (Criteria) this;
        }

        public Criteria andLogisticsUserIdIn(List<Long> values) {
            addCriterion("logistics_user_id in", values, "logisticsUserId");
            return (Criteria) this;
        }

        public Criteria andLogisticsUserIdNotIn(List<Long> values) {
            addCriterion("logistics_user_id not in", values, "logisticsUserId");
            return (Criteria) this;
        }

        public Criteria andLogisticsUserIdBetween(Long value1, Long value2) {
            addCriterion("logistics_user_id between", value1, value2, "logisticsUserId");
            return (Criteria) this;
        }

        public Criteria andLogisticsUserIdNotBetween(Long value1, Long value2) {
            addCriterion("logistics_user_id not between", value1, value2, "logisticsUserId");
            return (Criteria) this;
        }

        public Criteria andLogisticsDateIsNull() {
            addCriterion("logistics_date is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsDateIsNotNull() {
            addCriterion("logistics_date is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsDateEqualTo(Date value) {
            addCriterionForJDBCDate("logistics_date =", value, "logisticsDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("logistics_date <>", value, "logisticsDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsDateGreaterThan(Date value) {
            addCriterionForJDBCDate("logistics_date >", value, "logisticsDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("logistics_date >=", value, "logisticsDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsDateLessThan(Date value) {
            addCriterionForJDBCDate("logistics_date <", value, "logisticsDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("logistics_date <=", value, "logisticsDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsDateIn(List<Date> values) {
            addCriterionForJDBCDate("logistics_date in", values, "logisticsDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("logistics_date not in", values, "logisticsDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("logistics_date between", value1, value2, "logisticsDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("logistics_date not between", value1, value2, "logisticsDate");
            return (Criteria) this;
        }

        public Criteria andBookingTimeIsNull() {
            addCriterion("booking_time is null");
            return (Criteria) this;
        }

        public Criteria andBookingTimeIsNotNull() {
            addCriterion("booking_time is not null");
            return (Criteria) this;
        }

        public Criteria andBookingTimeEqualTo(Date value) {
            addCriterionForJDBCDate("booking_time =", value, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("booking_time <>", value, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("booking_time >", value, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("booking_time >=", value, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeLessThan(Date value) {
            addCriterionForJDBCDate("booking_time <", value, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("booking_time <=", value, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeIn(List<Date> values) {
            addCriterionForJDBCDate("booking_time in", values, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("booking_time not in", values, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("booking_time between", value1, value2, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andBookingTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("booking_time not between", value1, value2, "bookingTime");
            return (Criteria) this;
        }

        public Criteria andLogiInvoiceNoIsNull() {
            addCriterion("logi_invoice_no is null");
            return (Criteria) this;
        }

        public Criteria andLogiInvoiceNoIsNotNull() {
            addCriterion("logi_invoice_no is not null");
            return (Criteria) this;
        }

        public Criteria andLogiInvoiceNoEqualTo(String value) {
            addCriterion("logi_invoice_no =", value, "logiInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andLogiInvoiceNoNotEqualTo(String value) {
            addCriterion("logi_invoice_no <>", value, "logiInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andLogiInvoiceNoGreaterThan(String value) {
            addCriterion("logi_invoice_no >", value, "logiInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andLogiInvoiceNoGreaterThanOrEqualTo(String value) {
            addCriterion("logi_invoice_no >=", value, "logiInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andLogiInvoiceNoLessThan(String value) {
            addCriterion("logi_invoice_no <", value, "logiInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andLogiInvoiceNoLessThanOrEqualTo(String value) {
            addCriterion("logi_invoice_no <=", value, "logiInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andLogiInvoiceNoLike(String value) {
            addCriterion("logi_invoice_no like", value, "logiInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andLogiInvoiceNoNotLike(String value) {
            addCriterion("logi_invoice_no not like", value, "logiInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andLogiInvoiceNoIn(List<String> values) {
            addCriterion("logi_invoice_no in", values, "logiInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andLogiInvoiceNoNotIn(List<String> values) {
            addCriterion("logi_invoice_no not in", values, "logiInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andLogiInvoiceNoBetween(String value1, String value2) {
            addCriterion("logi_invoice_no between", value1, value2, "logiInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andLogiInvoiceNoNotBetween(String value1, String value2) {
            addCriterion("logi_invoice_no not between", value1, value2, "logiInvoiceNo");
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

        public Criteria andLeaveFactoryIsNull() {
            addCriterion("leave_factory is null");
            return (Criteria) this;
        }

        public Criteria andLeaveFactoryIsNotNull() {
            addCriterion("leave_factory is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveFactoryEqualTo(Date value) {
            addCriterionForJDBCDate("leave_factory =", value, "leaveFactory");
            return (Criteria) this;
        }

        public Criteria andLeaveFactoryNotEqualTo(Date value) {
            addCriterionForJDBCDate("leave_factory <>", value, "leaveFactory");
            return (Criteria) this;
        }

        public Criteria andLeaveFactoryGreaterThan(Date value) {
            addCriterionForJDBCDate("leave_factory >", value, "leaveFactory");
            return (Criteria) this;
        }

        public Criteria andLeaveFactoryGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("leave_factory >=", value, "leaveFactory");
            return (Criteria) this;
        }

        public Criteria andLeaveFactoryLessThan(Date value) {
            addCriterionForJDBCDate("leave_factory <", value, "leaveFactory");
            return (Criteria) this;
        }

        public Criteria andLeaveFactoryLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("leave_factory <=", value, "leaveFactory");
            return (Criteria) this;
        }

        public Criteria andLeaveFactoryIn(List<Date> values) {
            addCriterionForJDBCDate("leave_factory in", values, "leaveFactory");
            return (Criteria) this;
        }

        public Criteria andLeaveFactoryNotIn(List<Date> values) {
            addCriterionForJDBCDate("leave_factory not in", values, "leaveFactory");
            return (Criteria) this;
        }

        public Criteria andLeaveFactoryBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("leave_factory between", value1, value2, "leaveFactory");
            return (Criteria) this;
        }

        public Criteria andLeaveFactoryNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("leave_factory not between", value1, value2, "leaveFactory");
            return (Criteria) this;
        }

        public Criteria andSailingDateIsNull() {
            addCriterion("sailing_date is null");
            return (Criteria) this;
        }

        public Criteria andSailingDateIsNotNull() {
            addCriterion("sailing_date is not null");
            return (Criteria) this;
        }

        public Criteria andSailingDateEqualTo(Date value) {
            addCriterionForJDBCDate("sailing_date =", value, "sailingDate");
            return (Criteria) this;
        }

        public Criteria andSailingDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sailing_date <>", value, "sailingDate");
            return (Criteria) this;
        }

        public Criteria andSailingDateGreaterThan(Date value) {
            addCriterionForJDBCDate("sailing_date >", value, "sailingDate");
            return (Criteria) this;
        }

        public Criteria andSailingDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sailing_date >=", value, "sailingDate");
            return (Criteria) this;
        }

        public Criteria andSailingDateLessThan(Date value) {
            addCriterionForJDBCDate("sailing_date <", value, "sailingDate");
            return (Criteria) this;
        }

        public Criteria andSailingDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sailing_date <=", value, "sailingDate");
            return (Criteria) this;
        }

        public Criteria andSailingDateIn(List<Date> values) {
            addCriterionForJDBCDate("sailing_date in", values, "sailingDate");
            return (Criteria) this;
        }

        public Criteria andSailingDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sailing_date not in", values, "sailingDate");
            return (Criteria) this;
        }

        public Criteria andSailingDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sailing_date between", value1, value2, "sailingDate");
            return (Criteria) this;
        }

        public Criteria andSailingDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sailing_date not between", value1, value2, "sailingDate");
            return (Criteria) this;
        }

        public Criteria andCustomsClearanceIsNull() {
            addCriterion("customs_clearance is null");
            return (Criteria) this;
        }

        public Criteria andCustomsClearanceIsNotNull() {
            addCriterion("customs_clearance is not null");
            return (Criteria) this;
        }

        public Criteria andCustomsClearanceEqualTo(Date value) {
            addCriterionForJDBCDate("customs_clearance =", value, "customsClearance");
            return (Criteria) this;
        }

        public Criteria andCustomsClearanceNotEqualTo(Date value) {
            addCriterionForJDBCDate("customs_clearance <>", value, "customsClearance");
            return (Criteria) this;
        }

        public Criteria andCustomsClearanceGreaterThan(Date value) {
            addCriterionForJDBCDate("customs_clearance >", value, "customsClearance");
            return (Criteria) this;
        }

        public Criteria andCustomsClearanceGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customs_clearance >=", value, "customsClearance");
            return (Criteria) this;
        }

        public Criteria andCustomsClearanceLessThan(Date value) {
            addCriterionForJDBCDate("customs_clearance <", value, "customsClearance");
            return (Criteria) this;
        }

        public Criteria andCustomsClearanceLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customs_clearance <=", value, "customsClearance");
            return (Criteria) this;
        }

        public Criteria andCustomsClearanceIn(List<Date> values) {
            addCriterionForJDBCDate("customs_clearance in", values, "customsClearance");
            return (Criteria) this;
        }

        public Criteria andCustomsClearanceNotIn(List<Date> values) {
            addCriterionForJDBCDate("customs_clearance not in", values, "customsClearance");
            return (Criteria) this;
        }

        public Criteria andCustomsClearanceBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customs_clearance between", value1, value2, "customsClearance");
            return (Criteria) this;
        }

        public Criteria andCustomsClearanceNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customs_clearance not between", value1, value2, "customsClearance");
            return (Criteria) this;
        }

        public Criteria andLeavePortTimeIsNull() {
            addCriterion("leave_port_time is null");
            return (Criteria) this;
        }

        public Criteria andLeavePortTimeIsNotNull() {
            addCriterion("leave_port_time is not null");
            return (Criteria) this;
        }

        public Criteria andLeavePortTimeEqualTo(Date value) {
            addCriterionForJDBCDate("leave_port_time =", value, "leavePortTime");
            return (Criteria) this;
        }

        public Criteria andLeavePortTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("leave_port_time <>", value, "leavePortTime");
            return (Criteria) this;
        }

        public Criteria andLeavePortTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("leave_port_time >", value, "leavePortTime");
            return (Criteria) this;
        }

        public Criteria andLeavePortTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("leave_port_time >=", value, "leavePortTime");
            return (Criteria) this;
        }

        public Criteria andLeavePortTimeLessThan(Date value) {
            addCriterionForJDBCDate("leave_port_time <", value, "leavePortTime");
            return (Criteria) this;
        }

        public Criteria andLeavePortTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("leave_port_time <=", value, "leavePortTime");
            return (Criteria) this;
        }

        public Criteria andLeavePortTimeIn(List<Date> values) {
            addCriterionForJDBCDate("leave_port_time in", values, "leavePortTime");
            return (Criteria) this;
        }

        public Criteria andLeavePortTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("leave_port_time not in", values, "leavePortTime");
            return (Criteria) this;
        }

        public Criteria andLeavePortTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("leave_port_time between", value1, value2, "leavePortTime");
            return (Criteria) this;
        }

        public Criteria andLeavePortTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("leave_port_time not between", value1, value2, "leavePortTime");
            return (Criteria) this;
        }

        public Criteria andArrivalPortTimeIsNull() {
            addCriterion("arrival_port_time is null");
            return (Criteria) this;
        }

        public Criteria andArrivalPortTimeIsNotNull() {
            addCriterion("arrival_port_time is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalPortTimeEqualTo(Date value) {
            addCriterionForJDBCDate("arrival_port_time =", value, "arrivalPortTime");
            return (Criteria) this;
        }

        public Criteria andArrivalPortTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("arrival_port_time <>", value, "arrivalPortTime");
            return (Criteria) this;
        }

        public Criteria andArrivalPortTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("arrival_port_time >", value, "arrivalPortTime");
            return (Criteria) this;
        }

        public Criteria andArrivalPortTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("arrival_port_time >=", value, "arrivalPortTime");
            return (Criteria) this;
        }

        public Criteria andArrivalPortTimeLessThan(Date value) {
            addCriterionForJDBCDate("arrival_port_time <", value, "arrivalPortTime");
            return (Criteria) this;
        }

        public Criteria andArrivalPortTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("arrival_port_time <=", value, "arrivalPortTime");
            return (Criteria) this;
        }

        public Criteria andArrivalPortTimeIn(List<Date> values) {
            addCriterionForJDBCDate("arrival_port_time in", values, "arrivalPortTime");
            return (Criteria) this;
        }

        public Criteria andArrivalPortTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("arrival_port_time not in", values, "arrivalPortTime");
            return (Criteria) this;
        }

        public Criteria andArrivalPortTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("arrival_port_time between", value1, value2, "arrivalPortTime");
            return (Criteria) this;
        }

        public Criteria andArrivalPortTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("arrival_port_time not between", value1, value2, "arrivalPortTime");
            return (Criteria) this;
        }

        public Criteria andAccomplishDateIsNull() {
            addCriterion("accomplish_date is null");
            return (Criteria) this;
        }

        public Criteria andAccomplishDateIsNotNull() {
            addCriterion("accomplish_date is not null");
            return (Criteria) this;
        }

        public Criteria andAccomplishDateEqualTo(Date value) {
            addCriterionForJDBCDate("accomplish_date =", value, "accomplishDate");
            return (Criteria) this;
        }

        public Criteria andAccomplishDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("accomplish_date <>", value, "accomplishDate");
            return (Criteria) this;
        }

        public Criteria andAccomplishDateGreaterThan(Date value) {
            addCriterionForJDBCDate("accomplish_date >", value, "accomplishDate");
            return (Criteria) this;
        }

        public Criteria andAccomplishDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("accomplish_date >=", value, "accomplishDate");
            return (Criteria) this;
        }

        public Criteria andAccomplishDateLessThan(Date value) {
            addCriterionForJDBCDate("accomplish_date <", value, "accomplishDate");
            return (Criteria) this;
        }

        public Criteria andAccomplishDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("accomplish_date <=", value, "accomplishDate");
            return (Criteria) this;
        }

        public Criteria andAccomplishDateIn(List<Date> values) {
            addCriterionForJDBCDate("accomplish_date in", values, "accomplishDate");
            return (Criteria) this;
        }

        public Criteria andAccomplishDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("accomplish_date not in", values, "accomplishDate");
            return (Criteria) this;
        }

        public Criteria andAccomplishDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("accomplish_date between", value1, value2, "accomplishDate");
            return (Criteria) this;
        }

        public Criteria andAccomplishDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("accomplish_date not between", value1, value2, "accomplishDate");
            return (Criteria) this;
        }

        public Criteria andLogisticsLogsIsNull() {
            addCriterion("logistics_logs is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsLogsIsNotNull() {
            addCriterion("logistics_logs is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsLogsEqualTo(String value) {
            addCriterion("logistics_logs =", value, "logisticsLogs");
            return (Criteria) this;
        }

        public Criteria andLogisticsLogsNotEqualTo(String value) {
            addCriterion("logistics_logs <>", value, "logisticsLogs");
            return (Criteria) this;
        }

        public Criteria andLogisticsLogsGreaterThan(String value) {
            addCriterion("logistics_logs >", value, "logisticsLogs");
            return (Criteria) this;
        }

        public Criteria andLogisticsLogsGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_logs >=", value, "logisticsLogs");
            return (Criteria) this;
        }

        public Criteria andLogisticsLogsLessThan(String value) {
            addCriterion("logistics_logs <", value, "logisticsLogs");
            return (Criteria) this;
        }

        public Criteria andLogisticsLogsLessThanOrEqualTo(String value) {
            addCriterion("logistics_logs <=", value, "logisticsLogs");
            return (Criteria) this;
        }

        public Criteria andLogisticsLogsLike(String value) {
            addCriterion("logistics_logs like", value, "logisticsLogs");
            return (Criteria) this;
        }

        public Criteria andLogisticsLogsNotLike(String value) {
            addCriterion("logistics_logs not like", value, "logisticsLogs");
            return (Criteria) this;
        }

        public Criteria andLogisticsLogsIn(List<String> values) {
            addCriterion("logistics_logs in", values, "logisticsLogs");
            return (Criteria) this;
        }

        public Criteria andLogisticsLogsNotIn(List<String> values) {
            addCriterion("logistics_logs not in", values, "logisticsLogs");
            return (Criteria) this;
        }

        public Criteria andLogisticsLogsBetween(String value1, String value2) {
            addCriterion("logistics_logs between", value1, value2, "logisticsLogs");
            return (Criteria) this;
        }

        public Criteria andLogisticsLogsNotBetween(String value1, String value2) {
            addCriterion("logistics_logs not between", value1, value2, "logisticsLogs");
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

        public Criteria andLogisticsDataStatusIsNull() {
            addCriterion("logistics_data_status is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsDataStatusIsNotNull() {
            addCriterion("logistics_data_status is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsDataStatusEqualTo(Short value) {
            addCriterion("logistics_data_status =", value, "logisticsDataStatus");
            return (Criteria) this;
        }

        public Criteria andLogisticsDataStatusNotEqualTo(Short value) {
            addCriterion("logistics_data_status <>", value, "logisticsDataStatus");
            return (Criteria) this;
        }

        public Criteria andLogisticsDataStatusGreaterThan(Short value) {
            addCriterion("logistics_data_status >", value, "logisticsDataStatus");
            return (Criteria) this;
        }

        public Criteria andLogisticsDataStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("logistics_data_status >=", value, "logisticsDataStatus");
            return (Criteria) this;
        }

        public Criteria andLogisticsDataStatusLessThan(Short value) {
            addCriterion("logistics_data_status <", value, "logisticsDataStatus");
            return (Criteria) this;
        }

        public Criteria andLogisticsDataStatusLessThanOrEqualTo(Short value) {
            addCriterion("logistics_data_status <=", value, "logisticsDataStatus");
            return (Criteria) this;
        }

        public Criteria andLogisticsDataStatusIn(List<Short> values) {
            addCriterion("logistics_data_status in", values, "logisticsDataStatus");
            return (Criteria) this;
        }

        public Criteria andLogisticsDataStatusNotIn(List<Short> values) {
            addCriterion("logistics_data_status not in", values, "logisticsDataStatus");
            return (Criteria) this;
        }

        public Criteria andLogisticsDataStatusBetween(Short value1, Short value2) {
            addCriterion("logistics_data_status between", value1, value2, "logisticsDataStatus");
            return (Criteria) this;
        }

        public Criteria andLogisticsDataStatusNotBetween(Short value1, Short value2) {
            addCriterion("logistics_data_status not between", value1, value2, "logisticsDataStatus");
            return (Criteria) this;
        }

        public Criteria andSubmenuIdIsNull() {
            addCriterion("submenu_id is null");
            return (Criteria) this;
        }

        public Criteria andSubmenuIdIsNotNull() {
            addCriterion("submenu_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubmenuIdEqualTo(Short value) {
            addCriterion("submenu_id =", value, "submenuId");
            return (Criteria) this;
        }

        public Criteria andSubmenuIdNotEqualTo(Short value) {
            addCriterion("submenu_id <>", value, "submenuId");
            return (Criteria) this;
        }

        public Criteria andSubmenuIdGreaterThan(Short value) {
            addCriterion("submenu_id >", value, "submenuId");
            return (Criteria) this;
        }

        public Criteria andSubmenuIdGreaterThanOrEqualTo(Short value) {
            addCriterion("submenu_id >=", value, "submenuId");
            return (Criteria) this;
        }

        public Criteria andSubmenuIdLessThan(Short value) {
            addCriterion("submenu_id <", value, "submenuId");
            return (Criteria) this;
        }

        public Criteria andSubmenuIdLessThanOrEqualTo(Short value) {
            addCriterion("submenu_id <=", value, "submenuId");
            return (Criteria) this;
        }

        public Criteria andSubmenuIdIn(List<Short> values) {
            addCriterion("submenu_id in", values, "submenuId");
            return (Criteria) this;
        }

        public Criteria andSubmenuIdNotIn(List<Short> values) {
            addCriterion("submenu_id not in", values, "submenuId");
            return (Criteria) this;
        }

        public Criteria andSubmenuIdBetween(Short value1, Short value2) {
            addCriterion("submenu_id between", value1, value2, "submenuId");
            return (Criteria) this;
        }

        public Criteria andSubmenuIdNotBetween(Short value1, Short value2) {
            addCriterion("submenu_id not between", value1, value2, "submenuId");
            return (Criteria) this;
        }

        public Criteria andLogisticsPriceUsdIsNull() {
            addCriterion("logistics_price_usd is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsPriceUsdIsNotNull() {
            addCriterion("logistics_price_usd is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsPriceUsdEqualTo(BigDecimal value) {
            addCriterion("logistics_price_usd =", value, "logisticsPriceUsd");
            return (Criteria) this;
        }

        public Criteria andLogisticsPriceUsdNotEqualTo(BigDecimal value) {
            addCriterion("logistics_price_usd <>", value, "logisticsPriceUsd");
            return (Criteria) this;
        }

        public Criteria andLogisticsPriceUsdGreaterThan(BigDecimal value) {
            addCriterion("logistics_price_usd >", value, "logisticsPriceUsd");
            return (Criteria) this;
        }

        public Criteria andLogisticsPriceUsdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("logistics_price_usd >=", value, "logisticsPriceUsd");
            return (Criteria) this;
        }

        public Criteria andLogisticsPriceUsdLessThan(BigDecimal value) {
            addCriterion("logistics_price_usd <", value, "logisticsPriceUsd");
            return (Criteria) this;
        }

        public Criteria andLogisticsPriceUsdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("logistics_price_usd <=", value, "logisticsPriceUsd");
            return (Criteria) this;
        }

        public Criteria andLogisticsPriceUsdIn(List<BigDecimal> values) {
            addCriterion("logistics_price_usd in", values, "logisticsPriceUsd");
            return (Criteria) this;
        }

        public Criteria andLogisticsPriceUsdNotIn(List<BigDecimal> values) {
            addCriterion("logistics_price_usd not in", values, "logisticsPriceUsd");
            return (Criteria) this;
        }

        public Criteria andLogisticsPriceUsdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("logistics_price_usd between", value1, value2, "logisticsPriceUsd");
            return (Criteria) this;
        }

        public Criteria andLogisticsPriceUsdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("logistics_price_usd not between", value1, value2, "logisticsPriceUsd");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostIsNull() {
            addCriterion("logistics_cost is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostIsNotNull() {
            addCriterion("logistics_cost is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostEqualTo(BigDecimal value) {
            addCriterion("logistics_cost =", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostNotEqualTo(BigDecimal value) {
            addCriterion("logistics_cost <>", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostGreaterThan(BigDecimal value) {
            addCriterion("logistics_cost >", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("logistics_cost >=", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostLessThan(BigDecimal value) {
            addCriterion("logistics_cost <", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("logistics_cost <=", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostIn(List<BigDecimal> values) {
            addCriterion("logistics_cost in", values, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostNotIn(List<BigDecimal> values) {
            addCriterion("logistics_cost not in", values, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("logistics_cost between", value1, value2, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("logistics_cost not between", value1, value2, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostTypeIsNull() {
            addCriterion("logistics_cost_type is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostTypeIsNotNull() {
            addCriterion("logistics_cost_type is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostTypeEqualTo(String value) {
            addCriterion("logistics_cost_type =", value, "logisticsCostType");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostTypeNotEqualTo(String value) {
            addCriterion("logistics_cost_type <>", value, "logisticsCostType");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostTypeGreaterThan(String value) {
            addCriterion("logistics_cost_type >", value, "logisticsCostType");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostTypeGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_cost_type >=", value, "logisticsCostType");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostTypeLessThan(String value) {
            addCriterion("logistics_cost_type <", value, "logisticsCostType");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostTypeLessThanOrEqualTo(String value) {
            addCriterion("logistics_cost_type <=", value, "logisticsCostType");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostTypeLike(String value) {
            addCriterion("logistics_cost_type like", value, "logisticsCostType");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostTypeNotLike(String value) {
            addCriterion("logistics_cost_type not like", value, "logisticsCostType");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostTypeIn(List<String> values) {
            addCriterion("logistics_cost_type in", values, "logisticsCostType");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostTypeNotIn(List<String> values) {
            addCriterion("logistics_cost_type not in", values, "logisticsCostType");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostTypeBetween(String value1, String value2) {
            addCriterion("logistics_cost_type between", value1, value2, "logisticsCostType");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostTypeNotBetween(String value1, String value2) {
            addCriterion("logistics_cost_type not between", value1, value2, "logisticsCostType");
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