package com.erui.order.model.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andFrameworkNoIsNull() {
            addCriterion("framework_no is null");
            return (Criteria) this;
        }

        public Criteria andFrameworkNoIsNotNull() {
            addCriterion("framework_no is not null");
            return (Criteria) this;
        }

        public Criteria andFrameworkNoEqualTo(String value) {
            addCriterion("framework_no =", value, "frameworkNo");
            return (Criteria) this;
        }

        public Criteria andFrameworkNoNotEqualTo(String value) {
            addCriterion("framework_no <>", value, "frameworkNo");
            return (Criteria) this;
        }

        public Criteria andFrameworkNoGreaterThan(String value) {
            addCriterion("framework_no >", value, "frameworkNo");
            return (Criteria) this;
        }

        public Criteria andFrameworkNoGreaterThanOrEqualTo(String value) {
            addCriterion("framework_no >=", value, "frameworkNo");
            return (Criteria) this;
        }

        public Criteria andFrameworkNoLessThan(String value) {
            addCriterion("framework_no <", value, "frameworkNo");
            return (Criteria) this;
        }

        public Criteria andFrameworkNoLessThanOrEqualTo(String value) {
            addCriterion("framework_no <=", value, "frameworkNo");
            return (Criteria) this;
        }

        public Criteria andFrameworkNoLike(String value) {
            addCriterion("framework_no like", value, "frameworkNo");
            return (Criteria) this;
        }

        public Criteria andFrameworkNoNotLike(String value) {
            addCriterion("framework_no not like", value, "frameworkNo");
            return (Criteria) this;
        }

        public Criteria andFrameworkNoIn(List<String> values) {
            addCriterion("framework_no in", values, "frameworkNo");
            return (Criteria) this;
        }

        public Criteria andFrameworkNoNotIn(List<String> values) {
            addCriterion("framework_no not in", values, "frameworkNo");
            return (Criteria) this;
        }

        public Criteria andFrameworkNoBetween(String value1, String value2) {
            addCriterion("framework_no between", value1, value2, "frameworkNo");
            return (Criteria) this;
        }

        public Criteria andFrameworkNoNotBetween(String value1, String value2) {
            addCriterion("framework_no not between", value1, value2, "frameworkNo");
            return (Criteria) this;
        }

        public Criteria andContractNoOsIsNull() {
            addCriterion("contract_no_os is null");
            return (Criteria) this;
        }

        public Criteria andContractNoOsIsNotNull() {
            addCriterion("contract_no_os is not null");
            return (Criteria) this;
        }

        public Criteria andContractNoOsEqualTo(String value) {
            addCriterion("contract_no_os =", value, "contractNoOs");
            return (Criteria) this;
        }

        public Criteria andContractNoOsNotEqualTo(String value) {
            addCriterion("contract_no_os <>", value, "contractNoOs");
            return (Criteria) this;
        }

        public Criteria andContractNoOsGreaterThan(String value) {
            addCriterion("contract_no_os >", value, "contractNoOs");
            return (Criteria) this;
        }

        public Criteria andContractNoOsGreaterThanOrEqualTo(String value) {
            addCriterion("contract_no_os >=", value, "contractNoOs");
            return (Criteria) this;
        }

        public Criteria andContractNoOsLessThan(String value) {
            addCriterion("contract_no_os <", value, "contractNoOs");
            return (Criteria) this;
        }

        public Criteria andContractNoOsLessThanOrEqualTo(String value) {
            addCriterion("contract_no_os <=", value, "contractNoOs");
            return (Criteria) this;
        }

        public Criteria andContractNoOsLike(String value) {
            addCriterion("contract_no_os like", value, "contractNoOs");
            return (Criteria) this;
        }

        public Criteria andContractNoOsNotLike(String value) {
            addCriterion("contract_no_os not like", value, "contractNoOs");
            return (Criteria) this;
        }

        public Criteria andContractNoOsIn(List<String> values) {
            addCriterion("contract_no_os in", values, "contractNoOs");
            return (Criteria) this;
        }

        public Criteria andContractNoOsNotIn(List<String> values) {
            addCriterion("contract_no_os not in", values, "contractNoOs");
            return (Criteria) this;
        }

        public Criteria andContractNoOsBetween(String value1, String value2) {
            addCriterion("contract_no_os between", value1, value2, "contractNoOs");
            return (Criteria) this;
        }

        public Criteria andContractNoOsNotBetween(String value1, String value2) {
            addCriterion("contract_no_os not between", value1, value2, "contractNoOs");
            return (Criteria) this;
        }

        public Criteria andPoNoIsNull() {
            addCriterion("po_no is null");
            return (Criteria) this;
        }

        public Criteria andPoNoIsNotNull() {
            addCriterion("po_no is not null");
            return (Criteria) this;
        }

        public Criteria andPoNoEqualTo(String value) {
            addCriterion("po_no =", value, "poNo");
            return (Criteria) this;
        }

        public Criteria andPoNoNotEqualTo(String value) {
            addCriterion("po_no <>", value, "poNo");
            return (Criteria) this;
        }

        public Criteria andPoNoGreaterThan(String value) {
            addCriterion("po_no >", value, "poNo");
            return (Criteria) this;
        }

        public Criteria andPoNoGreaterThanOrEqualTo(String value) {
            addCriterion("po_no >=", value, "poNo");
            return (Criteria) this;
        }

        public Criteria andPoNoLessThan(String value) {
            addCriterion("po_no <", value, "poNo");
            return (Criteria) this;
        }

        public Criteria andPoNoLessThanOrEqualTo(String value) {
            addCriterion("po_no <=", value, "poNo");
            return (Criteria) this;
        }

        public Criteria andPoNoLike(String value) {
            addCriterion("po_no like", value, "poNo");
            return (Criteria) this;
        }

        public Criteria andPoNoNotLike(String value) {
            addCriterion("po_no not like", value, "poNo");
            return (Criteria) this;
        }

        public Criteria andPoNoIn(List<String> values) {
            addCriterion("po_no in", values, "poNo");
            return (Criteria) this;
        }

        public Criteria andPoNoNotIn(List<String> values) {
            addCriterion("po_no not in", values, "poNo");
            return (Criteria) this;
        }

        public Criteria andPoNoBetween(String value1, String value2) {
            addCriterion("po_no between", value1, value2, "poNo");
            return (Criteria) this;
        }

        public Criteria andPoNoNotBetween(String value1, String value2) {
            addCriterion("po_no not between", value1, value2, "poNo");
            return (Criteria) this;
        }

        public Criteria andInquiryIdIsNull() {
            addCriterion("inquiry_id is null");
            return (Criteria) this;
        }

        public Criteria andInquiryIdIsNotNull() {
            addCriterion("inquiry_id is not null");
            return (Criteria) this;
        }

        public Criteria andInquiryIdEqualTo(Long value) {
            addCriterion("inquiry_id =", value, "inquiryId");
            return (Criteria) this;
        }

        public Criteria andInquiryIdNotEqualTo(Long value) {
            addCriterion("inquiry_id <>", value, "inquiryId");
            return (Criteria) this;
        }

        public Criteria andInquiryIdGreaterThan(Long value) {
            addCriterion("inquiry_id >", value, "inquiryId");
            return (Criteria) this;
        }

        public Criteria andInquiryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("inquiry_id >=", value, "inquiryId");
            return (Criteria) this;
        }

        public Criteria andInquiryIdLessThan(Long value) {
            addCriterion("inquiry_id <", value, "inquiryId");
            return (Criteria) this;
        }

        public Criteria andInquiryIdLessThanOrEqualTo(Long value) {
            addCriterion("inquiry_id <=", value, "inquiryId");
            return (Criteria) this;
        }

        public Criteria andInquiryIdIn(List<Long> values) {
            addCriterion("inquiry_id in", values, "inquiryId");
            return (Criteria) this;
        }

        public Criteria andInquiryIdNotIn(List<Long> values) {
            addCriterion("inquiry_id not in", values, "inquiryId");
            return (Criteria) this;
        }

        public Criteria andInquiryIdBetween(Long value1, Long value2) {
            addCriterion("inquiry_id between", value1, value2, "inquiryId");
            return (Criteria) this;
        }

        public Criteria andInquiryIdNotBetween(Long value1, Long value2) {
            addCriterion("inquiry_id not between", value1, value2, "inquiryId");
            return (Criteria) this;
        }

        public Criteria andInquiryNoIsNull() {
            addCriterion("inquiry_no is null");
            return (Criteria) this;
        }

        public Criteria andInquiryNoIsNotNull() {
            addCriterion("inquiry_no is not null");
            return (Criteria) this;
        }

        public Criteria andInquiryNoEqualTo(String value) {
            addCriterion("inquiry_no =", value, "inquiryNo");
            return (Criteria) this;
        }

        public Criteria andInquiryNoNotEqualTo(String value) {
            addCriterion("inquiry_no <>", value, "inquiryNo");
            return (Criteria) this;
        }

        public Criteria andInquiryNoGreaterThan(String value) {
            addCriterion("inquiry_no >", value, "inquiryNo");
            return (Criteria) this;
        }

        public Criteria andInquiryNoGreaterThanOrEqualTo(String value) {
            addCriterion("inquiry_no >=", value, "inquiryNo");
            return (Criteria) this;
        }

        public Criteria andInquiryNoLessThan(String value) {
            addCriterion("inquiry_no <", value, "inquiryNo");
            return (Criteria) this;
        }

        public Criteria andInquiryNoLessThanOrEqualTo(String value) {
            addCriterion("inquiry_no <=", value, "inquiryNo");
            return (Criteria) this;
        }

        public Criteria andInquiryNoLike(String value) {
            addCriterion("inquiry_no like", value, "inquiryNo");
            return (Criteria) this;
        }

        public Criteria andInquiryNoNotLike(String value) {
            addCriterion("inquiry_no not like", value, "inquiryNo");
            return (Criteria) this;
        }

        public Criteria andInquiryNoIn(List<String> values) {
            addCriterion("inquiry_no in", values, "inquiryNo");
            return (Criteria) this;
        }

        public Criteria andInquiryNoNotIn(List<String> values) {
            addCriterion("inquiry_no not in", values, "inquiryNo");
            return (Criteria) this;
        }

        public Criteria andInquiryNoBetween(String value1, String value2) {
            addCriterion("inquiry_no between", value1, value2, "inquiryNo");
            return (Criteria) this;
        }

        public Criteria andInquiryNoNotBetween(String value1, String value2) {
            addCriterion("inquiry_no not between", value1, value2, "inquiryNo");
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

        public Criteria andOrderSourceIsNull() {
            addCriterion("order_source is null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNotNull() {
            addCriterion("order_source is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceEqualTo(Short value) {
            addCriterion("order_source =", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotEqualTo(Short value) {
            addCriterion("order_source <>", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThan(Short value) {
            addCriterion("order_source >", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThanOrEqualTo(Short value) {
            addCriterion("order_source >=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThan(Short value) {
            addCriterion("order_source <", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThanOrEqualTo(Short value) {
            addCriterion("order_source <=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIn(List<Short> values) {
            addCriterion("order_source in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotIn(List<Short> values) {
            addCriterion("order_source not in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceBetween(Short value1, Short value2) {
            addCriterion("order_source between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotBetween(Short value1, Short value2) {
            addCriterion("order_source not between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andSigningDateIsNull() {
            addCriterion("signing_date is null");
            return (Criteria) this;
        }

        public Criteria andSigningDateIsNotNull() {
            addCriterion("signing_date is not null");
            return (Criteria) this;
        }

        public Criteria andSigningDateEqualTo(Date value) {
            addCriterionForJDBCDate("signing_date =", value, "signingDate");
            return (Criteria) this;
        }

        public Criteria andSigningDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("signing_date <>", value, "signingDate");
            return (Criteria) this;
        }

        public Criteria andSigningDateGreaterThan(Date value) {
            addCriterionForJDBCDate("signing_date >", value, "signingDate");
            return (Criteria) this;
        }

        public Criteria andSigningDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("signing_date >=", value, "signingDate");
            return (Criteria) this;
        }

        public Criteria andSigningDateLessThan(Date value) {
            addCriterionForJDBCDate("signing_date <", value, "signingDate");
            return (Criteria) this;
        }

        public Criteria andSigningDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("signing_date <=", value, "signingDate");
            return (Criteria) this;
        }

        public Criteria andSigningDateIn(List<Date> values) {
            addCriterionForJDBCDate("signing_date in", values, "signingDate");
            return (Criteria) this;
        }

        public Criteria andSigningDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("signing_date not in", values, "signingDate");
            return (Criteria) this;
        }

        public Criteria andSigningDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("signing_date between", value1, value2, "signingDate");
            return (Criteria) this;
        }

        public Criteria andSigningDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("signing_date not between", value1, value2, "signingDate");
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

        public Criteria andSigningCoIsNull() {
            addCriterion("signing_co is null");
            return (Criteria) this;
        }

        public Criteria andSigningCoIsNotNull() {
            addCriterion("signing_co is not null");
            return (Criteria) this;
        }

        public Criteria andSigningCoEqualTo(String value) {
            addCriterion("signing_co =", value, "signingCo");
            return (Criteria) this;
        }

        public Criteria andSigningCoNotEqualTo(String value) {
            addCriterion("signing_co <>", value, "signingCo");
            return (Criteria) this;
        }

        public Criteria andSigningCoGreaterThan(String value) {
            addCriterion("signing_co >", value, "signingCo");
            return (Criteria) this;
        }

        public Criteria andSigningCoGreaterThanOrEqualTo(String value) {
            addCriterion("signing_co >=", value, "signingCo");
            return (Criteria) this;
        }

        public Criteria andSigningCoLessThan(String value) {
            addCriterion("signing_co <", value, "signingCo");
            return (Criteria) this;
        }

        public Criteria andSigningCoLessThanOrEqualTo(String value) {
            addCriterion("signing_co <=", value, "signingCo");
            return (Criteria) this;
        }

        public Criteria andSigningCoLike(String value) {
            addCriterion("signing_co like", value, "signingCo");
            return (Criteria) this;
        }

        public Criteria andSigningCoNotLike(String value) {
            addCriterion("signing_co not like", value, "signingCo");
            return (Criteria) this;
        }

        public Criteria andSigningCoIn(List<String> values) {
            addCriterion("signing_co in", values, "signingCo");
            return (Criteria) this;
        }

        public Criteria andSigningCoNotIn(List<String> values) {
            addCriterion("signing_co not in", values, "signingCo");
            return (Criteria) this;
        }

        public Criteria andSigningCoBetween(String value1, String value2) {
            addCriterion("signing_co between", value1, value2, "signingCo");
            return (Criteria) this;
        }

        public Criteria andSigningCoNotBetween(String value1, String value2) {
            addCriterion("signing_co not between", value1, value2, "signingCo");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("agent_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(Long value) {
            addCriterion("agent_id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(Long value) {
            addCriterion("agent_id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(Long value) {
            addCriterion("agent_id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("agent_id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(Long value) {
            addCriterion("agent_id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(Long value) {
            addCriterion("agent_id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<Long> values) {
            addCriterion("agent_id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<Long> values) {
            addCriterion("agent_id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(Long value1, Long value2) {
            addCriterion("agent_id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(Long value1, Long value2) {
            addCriterion("agent_id not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andExecCoCodeIsNull() {
            addCriterion("exec_co_code is null");
            return (Criteria) this;
        }

        public Criteria andExecCoCodeIsNotNull() {
            addCriterion("exec_co_code is not null");
            return (Criteria) this;
        }

        public Criteria andExecCoCodeEqualTo(String value) {
            addCriterion("exec_co_code =", value, "execCoCode");
            return (Criteria) this;
        }

        public Criteria andExecCoCodeNotEqualTo(String value) {
            addCriterion("exec_co_code <>", value, "execCoCode");
            return (Criteria) this;
        }

        public Criteria andExecCoCodeGreaterThan(String value) {
            addCriterion("exec_co_code >", value, "execCoCode");
            return (Criteria) this;
        }

        public Criteria andExecCoCodeGreaterThanOrEqualTo(String value) {
            addCriterion("exec_co_code >=", value, "execCoCode");
            return (Criteria) this;
        }

        public Criteria andExecCoCodeLessThan(String value) {
            addCriterion("exec_co_code <", value, "execCoCode");
            return (Criteria) this;
        }

        public Criteria andExecCoCodeLessThanOrEqualTo(String value) {
            addCriterion("exec_co_code <=", value, "execCoCode");
            return (Criteria) this;
        }

        public Criteria andExecCoCodeLike(String value) {
            addCriterion("exec_co_code like", value, "execCoCode");
            return (Criteria) this;
        }

        public Criteria andExecCoCodeNotLike(String value) {
            addCriterion("exec_co_code not like", value, "execCoCode");
            return (Criteria) this;
        }

        public Criteria andExecCoCodeIn(List<String> values) {
            addCriterion("exec_co_code in", values, "execCoCode");
            return (Criteria) this;
        }

        public Criteria andExecCoCodeNotIn(List<String> values) {
            addCriterion("exec_co_code not in", values, "execCoCode");
            return (Criteria) this;
        }

        public Criteria andExecCoCodeBetween(String value1, String value2) {
            addCriterion("exec_co_code between", value1, value2, "execCoCode");
            return (Criteria) this;
        }

        public Criteria andExecCoCodeNotBetween(String value1, String value2) {
            addCriterion("exec_co_code not between", value1, value2, "execCoCode");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNull() {
            addCriterion("buyer_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNotNull() {
            addCriterion("buyer_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdEqualTo(Long value) {
            addCriterion("buyer_id =", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(Long value) {
            addCriterion("buyer_id <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(Long value) {
            addCriterion("buyer_id >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("buyer_id >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(Long value) {
            addCriterion("buyer_id <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(Long value) {
            addCriterion("buyer_id <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIn(List<Long> values) {
            addCriterion("buyer_id in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotIn(List<Long> values) {
            addCriterion("buyer_id not in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdBetween(Long value1, Long value2) {
            addCriterion("buyer_id between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotBetween(Long value1, Long value2) {
            addCriterion("buyer_id not between", value1, value2, "buyerId");
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

        public Criteria andCustomerTypeIsNull() {
            addCriterion("customer_type is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNotNull() {
            addCriterion("customer_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeEqualTo(Short value) {
            addCriterion("customer_type =", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotEqualTo(Short value) {
            addCriterion("customer_type <>", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThan(Short value) {
            addCriterion("customer_type >", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("customer_type >=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThan(Short value) {
            addCriterion("customer_type <", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThanOrEqualTo(Short value) {
            addCriterion("customer_type <=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIn(List<Short> values) {
            addCriterion("customer_type in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotIn(List<Short> values) {
            addCriterion("customer_type not in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeBetween(Short value1, Short value2) {
            addCriterion("customer_type between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotBetween(Short value1, Short value2) {
            addCriterion("customer_type not between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andPerLiableRepayIdIsNull() {
            addCriterion("per_liable_repay_id is null");
            return (Criteria) this;
        }

        public Criteria andPerLiableRepayIdIsNotNull() {
            addCriterion("per_liable_repay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPerLiableRepayIdEqualTo(Long value) {
            addCriterion("per_liable_repay_id =", value, "perLiableRepayId");
            return (Criteria) this;
        }

        public Criteria andPerLiableRepayIdNotEqualTo(Long value) {
            addCriterion("per_liable_repay_id <>", value, "perLiableRepayId");
            return (Criteria) this;
        }

        public Criteria andPerLiableRepayIdGreaterThan(Long value) {
            addCriterion("per_liable_repay_id >", value, "perLiableRepayId");
            return (Criteria) this;
        }

        public Criteria andPerLiableRepayIdGreaterThanOrEqualTo(Long value) {
            addCriterion("per_liable_repay_id >=", value, "perLiableRepayId");
            return (Criteria) this;
        }

        public Criteria andPerLiableRepayIdLessThan(Long value) {
            addCriterion("per_liable_repay_id <", value, "perLiableRepayId");
            return (Criteria) this;
        }

        public Criteria andPerLiableRepayIdLessThanOrEqualTo(Long value) {
            addCriterion("per_liable_repay_id <=", value, "perLiableRepayId");
            return (Criteria) this;
        }

        public Criteria andPerLiableRepayIdIn(List<Long> values) {
            addCriterion("per_liable_repay_id in", values, "perLiableRepayId");
            return (Criteria) this;
        }

        public Criteria andPerLiableRepayIdNotIn(List<Long> values) {
            addCriterion("per_liable_repay_id not in", values, "perLiableRepayId");
            return (Criteria) this;
        }

        public Criteria andPerLiableRepayIdBetween(Long value1, Long value2) {
            addCriterion("per_liable_repay_id between", value1, value2, "perLiableRepayId");
            return (Criteria) this;
        }

        public Criteria andPerLiableRepayIdNotBetween(Long value1, Long value2) {
            addCriterion("per_liable_repay_id not between", value1, value2, "perLiableRepayId");
            return (Criteria) this;
        }

        public Criteria andBusinessUnitIdIsNull() {
            addCriterion("business_unit_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessUnitIdIsNotNull() {
            addCriterion("business_unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessUnitIdEqualTo(Long value) {
            addCriterion("business_unit_id =", value, "businessUnitId");
            return (Criteria) this;
        }

        public Criteria andBusinessUnitIdNotEqualTo(Long value) {
            addCriterion("business_unit_id <>", value, "businessUnitId");
            return (Criteria) this;
        }

        public Criteria andBusinessUnitIdGreaterThan(Long value) {
            addCriterion("business_unit_id >", value, "businessUnitId");
            return (Criteria) this;
        }

        public Criteria andBusinessUnitIdGreaterThanOrEqualTo(Long value) {
            addCriterion("business_unit_id >=", value, "businessUnitId");
            return (Criteria) this;
        }

        public Criteria andBusinessUnitIdLessThan(Long value) {
            addCriterion("business_unit_id <", value, "businessUnitId");
            return (Criteria) this;
        }

        public Criteria andBusinessUnitIdLessThanOrEqualTo(Long value) {
            addCriterion("business_unit_id <=", value, "businessUnitId");
            return (Criteria) this;
        }

        public Criteria andBusinessUnitIdIn(List<Long> values) {
            addCriterion("business_unit_id in", values, "businessUnitId");
            return (Criteria) this;
        }

        public Criteria andBusinessUnitIdNotIn(List<Long> values) {
            addCriterion("business_unit_id not in", values, "businessUnitId");
            return (Criteria) this;
        }

        public Criteria andBusinessUnitIdBetween(Long value1, Long value2) {
            addCriterion("business_unit_id between", value1, value2, "businessUnitId");
            return (Criteria) this;
        }

        public Criteria andBusinessUnitIdNotBetween(Long value1, Long value2) {
            addCriterion("business_unit_id not between", value1, value2, "businessUnitId");
            return (Criteria) this;
        }

        public Criteria andTechnicalIdIsNull() {
            addCriterion("technical_id is null");
            return (Criteria) this;
        }

        public Criteria andTechnicalIdIsNotNull() {
            addCriterion("technical_id is not null");
            return (Criteria) this;
        }

        public Criteria andTechnicalIdEqualTo(Long value) {
            addCriterion("technical_id =", value, "technicalId");
            return (Criteria) this;
        }

        public Criteria andTechnicalIdNotEqualTo(Long value) {
            addCriterion("technical_id <>", value, "technicalId");
            return (Criteria) this;
        }

        public Criteria andTechnicalIdGreaterThan(Long value) {
            addCriterion("technical_id >", value, "technicalId");
            return (Criteria) this;
        }

        public Criteria andTechnicalIdGreaterThanOrEqualTo(Long value) {
            addCriterion("technical_id >=", value, "technicalId");
            return (Criteria) this;
        }

        public Criteria andTechnicalIdLessThan(Long value) {
            addCriterion("technical_id <", value, "technicalId");
            return (Criteria) this;
        }

        public Criteria andTechnicalIdLessThanOrEqualTo(Long value) {
            addCriterion("technical_id <=", value, "technicalId");
            return (Criteria) this;
        }

        public Criteria andTechnicalIdIn(List<Long> values) {
            addCriterion("technical_id in", values, "technicalId");
            return (Criteria) this;
        }

        public Criteria andTechnicalIdNotIn(List<Long> values) {
            addCriterion("technical_id not in", values, "technicalId");
            return (Criteria) this;
        }

        public Criteria andTechnicalIdBetween(Long value1, Long value2) {
            addCriterion("technical_id between", value1, value2, "technicalId");
            return (Criteria) this;
        }

        public Criteria andTechnicalIdNotBetween(Long value1, Long value2) {
            addCriterion("technical_id not between", value1, value2, "technicalId");
            return (Criteria) this;
        }

        public Criteria andGrantTypeIsNull() {
            addCriterion("grant_type is null");
            return (Criteria) this;
        }

        public Criteria andGrantTypeIsNotNull() {
            addCriterion("grant_type is not null");
            return (Criteria) this;
        }

        public Criteria andGrantTypeEqualTo(Short value) {
            addCriterion("grant_type =", value, "grantType");
            return (Criteria) this;
        }

        public Criteria andGrantTypeNotEqualTo(Short value) {
            addCriterion("grant_type <>", value, "grantType");
            return (Criteria) this;
        }

        public Criteria andGrantTypeGreaterThan(Short value) {
            addCriterion("grant_type >", value, "grantType");
            return (Criteria) this;
        }

        public Criteria andGrantTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("grant_type >=", value, "grantType");
            return (Criteria) this;
        }

        public Criteria andGrantTypeLessThan(Short value) {
            addCriterion("grant_type <", value, "grantType");
            return (Criteria) this;
        }

        public Criteria andGrantTypeLessThanOrEqualTo(Short value) {
            addCriterion("grant_type <=", value, "grantType");
            return (Criteria) this;
        }

        public Criteria andGrantTypeIn(List<Short> values) {
            addCriterion("grant_type in", values, "grantType");
            return (Criteria) this;
        }

        public Criteria andGrantTypeNotIn(List<Short> values) {
            addCriterion("grant_type not in", values, "grantType");
            return (Criteria) this;
        }

        public Criteria andGrantTypeBetween(Short value1, Short value2) {
            addCriterion("grant_type between", value1, value2, "grantType");
            return (Criteria) this;
        }

        public Criteria andGrantTypeNotBetween(Short value1, Short value2) {
            addCriterion("grant_type not between", value1, value2, "grantType");
            return (Criteria) this;
        }

        public Criteria andFinancingIsNull() {
            addCriterion("financing is null");
            return (Criteria) this;
        }

        public Criteria andFinancingIsNotNull() {
            addCriterion("financing is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingEqualTo(Short value) {
            addCriterion("financing =", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingNotEqualTo(Short value) {
            addCriterion("financing <>", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingGreaterThan(Short value) {
            addCriterion("financing >", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingGreaterThanOrEqualTo(Short value) {
            addCriterion("financing >=", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingLessThan(Short value) {
            addCriterion("financing <", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingLessThanOrEqualTo(Short value) {
            addCriterion("financing <=", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingIn(List<Short> values) {
            addCriterion("financing in", values, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingNotIn(List<Short> values) {
            addCriterion("financing not in", values, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingBetween(Short value1, Short value2) {
            addCriterion("financing between", value1, value2, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingNotBetween(Short value1, Short value2) {
            addCriterion("financing not between", value1, value2, "financing");
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

        public Criteria andTransportTypeIsNull() {
            addCriterion("transport_type is null");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIsNotNull() {
            addCriterion("transport_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransportTypeEqualTo(String value) {
            addCriterion("transport_type =", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotEqualTo(String value) {
            addCriterion("transport_type <>", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeGreaterThan(String value) {
            addCriterion("transport_type >", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeGreaterThanOrEqualTo(String value) {
            addCriterion("transport_type >=", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLessThan(String value) {
            addCriterion("transport_type <", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLessThanOrEqualTo(String value) {
            addCriterion("transport_type <=", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLike(String value) {
            addCriterion("transport_type like", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotLike(String value) {
            addCriterion("transport_type not like", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIn(List<String> values) {
            addCriterion("transport_type in", values, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotIn(List<String> values) {
            addCriterion("transport_type not in", values, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeBetween(String value1, String value2) {
            addCriterion("transport_type between", value1, value2, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotBetween(String value1, String value2) {
            addCriterion("transport_type not between", value1, value2, "transportType");
            return (Criteria) this;
        }

        public Criteria andFromCountryIsNull() {
            addCriterion("from_country is null");
            return (Criteria) this;
        }

        public Criteria andFromCountryIsNotNull() {
            addCriterion("from_country is not null");
            return (Criteria) this;
        }

        public Criteria andFromCountryEqualTo(String value) {
            addCriterion("from_country =", value, "fromCountry");
            return (Criteria) this;
        }

        public Criteria andFromCountryNotEqualTo(String value) {
            addCriterion("from_country <>", value, "fromCountry");
            return (Criteria) this;
        }

        public Criteria andFromCountryGreaterThan(String value) {
            addCriterion("from_country >", value, "fromCountry");
            return (Criteria) this;
        }

        public Criteria andFromCountryGreaterThanOrEqualTo(String value) {
            addCriterion("from_country >=", value, "fromCountry");
            return (Criteria) this;
        }

        public Criteria andFromCountryLessThan(String value) {
            addCriterion("from_country <", value, "fromCountry");
            return (Criteria) this;
        }

        public Criteria andFromCountryLessThanOrEqualTo(String value) {
            addCriterion("from_country <=", value, "fromCountry");
            return (Criteria) this;
        }

        public Criteria andFromCountryLike(String value) {
            addCriterion("from_country like", value, "fromCountry");
            return (Criteria) this;
        }

        public Criteria andFromCountryNotLike(String value) {
            addCriterion("from_country not like", value, "fromCountry");
            return (Criteria) this;
        }

        public Criteria andFromCountryIn(List<String> values) {
            addCriterion("from_country in", values, "fromCountry");
            return (Criteria) this;
        }

        public Criteria andFromCountryNotIn(List<String> values) {
            addCriterion("from_country not in", values, "fromCountry");
            return (Criteria) this;
        }

        public Criteria andFromCountryBetween(String value1, String value2) {
            addCriterion("from_country between", value1, value2, "fromCountry");
            return (Criteria) this;
        }

        public Criteria andFromCountryNotBetween(String value1, String value2) {
            addCriterion("from_country not between", value1, value2, "fromCountry");
            return (Criteria) this;
        }

        public Criteria andFromPortIsNull() {
            addCriterion("from_port is null");
            return (Criteria) this;
        }

        public Criteria andFromPortIsNotNull() {
            addCriterion("from_port is not null");
            return (Criteria) this;
        }

        public Criteria andFromPortEqualTo(String value) {
            addCriterion("from_port =", value, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortNotEqualTo(String value) {
            addCriterion("from_port <>", value, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortGreaterThan(String value) {
            addCriterion("from_port >", value, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortGreaterThanOrEqualTo(String value) {
            addCriterion("from_port >=", value, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortLessThan(String value) {
            addCriterion("from_port <", value, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortLessThanOrEqualTo(String value) {
            addCriterion("from_port <=", value, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortLike(String value) {
            addCriterion("from_port like", value, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortNotLike(String value) {
            addCriterion("from_port not like", value, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortIn(List<String> values) {
            addCriterion("from_port in", values, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortNotIn(List<String> values) {
            addCriterion("from_port not in", values, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortBetween(String value1, String value2) {
            addCriterion("from_port between", value1, value2, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPortNotBetween(String value1, String value2) {
            addCriterion("from_port not between", value1, value2, "fromPort");
            return (Criteria) this;
        }

        public Criteria andFromPlaceIsNull() {
            addCriterion("from_place is null");
            return (Criteria) this;
        }

        public Criteria andFromPlaceIsNotNull() {
            addCriterion("from_place is not null");
            return (Criteria) this;
        }

        public Criteria andFromPlaceEqualTo(String value) {
            addCriterion("from_place =", value, "fromPlace");
            return (Criteria) this;
        }

        public Criteria andFromPlaceNotEqualTo(String value) {
            addCriterion("from_place <>", value, "fromPlace");
            return (Criteria) this;
        }

        public Criteria andFromPlaceGreaterThan(String value) {
            addCriterion("from_place >", value, "fromPlace");
            return (Criteria) this;
        }

        public Criteria andFromPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("from_place >=", value, "fromPlace");
            return (Criteria) this;
        }

        public Criteria andFromPlaceLessThan(String value) {
            addCriterion("from_place <", value, "fromPlace");
            return (Criteria) this;
        }

        public Criteria andFromPlaceLessThanOrEqualTo(String value) {
            addCriterion("from_place <=", value, "fromPlace");
            return (Criteria) this;
        }

        public Criteria andFromPlaceLike(String value) {
            addCriterion("from_place like", value, "fromPlace");
            return (Criteria) this;
        }

        public Criteria andFromPlaceNotLike(String value) {
            addCriterion("from_place not like", value, "fromPlace");
            return (Criteria) this;
        }

        public Criteria andFromPlaceIn(List<String> values) {
            addCriterion("from_place in", values, "fromPlace");
            return (Criteria) this;
        }

        public Criteria andFromPlaceNotIn(List<String> values) {
            addCriterion("from_place not in", values, "fromPlace");
            return (Criteria) this;
        }

        public Criteria andFromPlaceBetween(String value1, String value2) {
            addCriterion("from_place between", value1, value2, "fromPlace");
            return (Criteria) this;
        }

        public Criteria andFromPlaceNotBetween(String value1, String value2) {
            addCriterion("from_place not between", value1, value2, "fromPlace");
            return (Criteria) this;
        }

        public Criteria andToCountryIsNull() {
            addCriterion("to_country is null");
            return (Criteria) this;
        }

        public Criteria andToCountryIsNotNull() {
            addCriterion("to_country is not null");
            return (Criteria) this;
        }

        public Criteria andToCountryEqualTo(String value) {
            addCriterion("to_country =", value, "toCountry");
            return (Criteria) this;
        }

        public Criteria andToCountryNotEqualTo(String value) {
            addCriterion("to_country <>", value, "toCountry");
            return (Criteria) this;
        }

        public Criteria andToCountryGreaterThan(String value) {
            addCriterion("to_country >", value, "toCountry");
            return (Criteria) this;
        }

        public Criteria andToCountryGreaterThanOrEqualTo(String value) {
            addCriterion("to_country >=", value, "toCountry");
            return (Criteria) this;
        }

        public Criteria andToCountryLessThan(String value) {
            addCriterion("to_country <", value, "toCountry");
            return (Criteria) this;
        }

        public Criteria andToCountryLessThanOrEqualTo(String value) {
            addCriterion("to_country <=", value, "toCountry");
            return (Criteria) this;
        }

        public Criteria andToCountryLike(String value) {
            addCriterion("to_country like", value, "toCountry");
            return (Criteria) this;
        }

        public Criteria andToCountryNotLike(String value) {
            addCriterion("to_country not like", value, "toCountry");
            return (Criteria) this;
        }

        public Criteria andToCountryIn(List<String> values) {
            addCriterion("to_country in", values, "toCountry");
            return (Criteria) this;
        }

        public Criteria andToCountryNotIn(List<String> values) {
            addCriterion("to_country not in", values, "toCountry");
            return (Criteria) this;
        }

        public Criteria andToCountryBetween(String value1, String value2) {
            addCriterion("to_country between", value1, value2, "toCountry");
            return (Criteria) this;
        }

        public Criteria andToCountryNotBetween(String value1, String value2) {
            addCriterion("to_country not between", value1, value2, "toCountry");
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

        public Criteria andToPlaceIsNull() {
            addCriterion("to_place is null");
            return (Criteria) this;
        }

        public Criteria andToPlaceIsNotNull() {
            addCriterion("to_place is not null");
            return (Criteria) this;
        }

        public Criteria andToPlaceEqualTo(String value) {
            addCriterion("to_place =", value, "toPlace");
            return (Criteria) this;
        }

        public Criteria andToPlaceNotEqualTo(String value) {
            addCriterion("to_place <>", value, "toPlace");
            return (Criteria) this;
        }

        public Criteria andToPlaceGreaterThan(String value) {
            addCriterion("to_place >", value, "toPlace");
            return (Criteria) this;
        }

        public Criteria andToPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("to_place >=", value, "toPlace");
            return (Criteria) this;
        }

        public Criteria andToPlaceLessThan(String value) {
            addCriterion("to_place <", value, "toPlace");
            return (Criteria) this;
        }

        public Criteria andToPlaceLessThanOrEqualTo(String value) {
            addCriterion("to_place <=", value, "toPlace");
            return (Criteria) this;
        }

        public Criteria andToPlaceLike(String value) {
            addCriterion("to_place like", value, "toPlace");
            return (Criteria) this;
        }

        public Criteria andToPlaceNotLike(String value) {
            addCriterion("to_place not like", value, "toPlace");
            return (Criteria) this;
        }

        public Criteria andToPlaceIn(List<String> values) {
            addCriterion("to_place in", values, "toPlace");
            return (Criteria) this;
        }

        public Criteria andToPlaceNotIn(List<String> values) {
            addCriterion("to_place not in", values, "toPlace");
            return (Criteria) this;
        }

        public Criteria andToPlaceBetween(String value1, String value2) {
            addCriterion("to_place between", value1, value2, "toPlace");
            return (Criteria) this;
        }

        public Criteria andToPlaceNotBetween(String value1, String value2) {
            addCriterion("to_place not between", value1, value2, "toPlace");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(BigDecimal value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(BigDecimal value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<BigDecimal> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
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

        public Criteria andExchangeRateIsNull() {
            addCriterion("exchange_rate is null");
            return (Criteria) this;
        }

        public Criteria andExchangeRateIsNotNull() {
            addCriterion("exchange_rate is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeRateEqualTo(BigDecimal value) {
            addCriterion("exchange_rate =", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotEqualTo(BigDecimal value) {
            addCriterion("exchange_rate <>", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateGreaterThan(BigDecimal value) {
            addCriterion("exchange_rate >", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_rate >=", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateLessThan(BigDecimal value) {
            addCriterion("exchange_rate <", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_rate <=", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateIn(List<BigDecimal> values) {
            addCriterion("exchange_rate in", values, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotIn(List<BigDecimal> values) {
            addCriterion("exchange_rate not in", values, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_rate between", value1, value2, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_rate not between", value1, value2, "exchangeRate");
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

        public Criteria andTaxBearingIsNull() {
            addCriterion("tax_bearing is null");
            return (Criteria) this;
        }

        public Criteria andTaxBearingIsNotNull() {
            addCriterion("tax_bearing is not null");
            return (Criteria) this;
        }

        public Criteria andTaxBearingEqualTo(Short value) {
            addCriterion("tax_bearing =", value, "taxBearing");
            return (Criteria) this;
        }

        public Criteria andTaxBearingNotEqualTo(Short value) {
            addCriterion("tax_bearing <>", value, "taxBearing");
            return (Criteria) this;
        }

        public Criteria andTaxBearingGreaterThan(Short value) {
            addCriterion("tax_bearing >", value, "taxBearing");
            return (Criteria) this;
        }

        public Criteria andTaxBearingGreaterThanOrEqualTo(Short value) {
            addCriterion("tax_bearing >=", value, "taxBearing");
            return (Criteria) this;
        }

        public Criteria andTaxBearingLessThan(Short value) {
            addCriterion("tax_bearing <", value, "taxBearing");
            return (Criteria) this;
        }

        public Criteria andTaxBearingLessThanOrEqualTo(Short value) {
            addCriterion("tax_bearing <=", value, "taxBearing");
            return (Criteria) this;
        }

        public Criteria andTaxBearingIn(List<Short> values) {
            addCriterion("tax_bearing in", values, "taxBearing");
            return (Criteria) this;
        }

        public Criteria andTaxBearingNotIn(List<Short> values) {
            addCriterion("tax_bearing not in", values, "taxBearing");
            return (Criteria) this;
        }

        public Criteria andTaxBearingBetween(Short value1, Short value2) {
            addCriterion("tax_bearing between", value1, value2, "taxBearing");
            return (Criteria) this;
        }

        public Criteria andTaxBearingNotBetween(Short value1, Short value2) {
            addCriterion("tax_bearing not between", value1, value2, "taxBearing");
            return (Criteria) this;
        }

        public Criteria andPaymentModeBnIsNull() {
            addCriterion("payment_mode_bn is null");
            return (Criteria) this;
        }

        public Criteria andPaymentModeBnIsNotNull() {
            addCriterion("payment_mode_bn is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentModeBnEqualTo(Short value) {
            addCriterion("payment_mode_bn =", value, "paymentModeBn");
            return (Criteria) this;
        }

        public Criteria andPaymentModeBnNotEqualTo(Short value) {
            addCriterion("payment_mode_bn <>", value, "paymentModeBn");
            return (Criteria) this;
        }

        public Criteria andPaymentModeBnGreaterThan(Short value) {
            addCriterion("payment_mode_bn >", value, "paymentModeBn");
            return (Criteria) this;
        }

        public Criteria andPaymentModeBnGreaterThanOrEqualTo(Short value) {
            addCriterion("payment_mode_bn >=", value, "paymentModeBn");
            return (Criteria) this;
        }

        public Criteria andPaymentModeBnLessThan(Short value) {
            addCriterion("payment_mode_bn <", value, "paymentModeBn");
            return (Criteria) this;
        }

        public Criteria andPaymentModeBnLessThanOrEqualTo(Short value) {
            addCriterion("payment_mode_bn <=", value, "paymentModeBn");
            return (Criteria) this;
        }

        public Criteria andPaymentModeBnIn(List<Short> values) {
            addCriterion("payment_mode_bn in", values, "paymentModeBn");
            return (Criteria) this;
        }

        public Criteria andPaymentModeBnNotIn(List<Short> values) {
            addCriterion("payment_mode_bn not in", values, "paymentModeBn");
            return (Criteria) this;
        }

        public Criteria andPaymentModeBnBetween(Short value1, Short value2) {
            addCriterion("payment_mode_bn between", value1, value2, "paymentModeBn");
            return (Criteria) this;
        }

        public Criteria andPaymentModeBnNotBetween(Short value1, Short value2) {
            addCriterion("payment_mode_bn not between", value1, value2, "paymentModeBn");
            return (Criteria) this;
        }

        public Criteria andQualityFundsIsNull() {
            addCriterion("quality_funds is null");
            return (Criteria) this;
        }

        public Criteria andQualityFundsIsNotNull() {
            addCriterion("quality_funds is not null");
            return (Criteria) this;
        }

        public Criteria andQualityFundsEqualTo(BigDecimal value) {
            addCriterion("quality_funds =", value, "qualityFunds");
            return (Criteria) this;
        }

        public Criteria andQualityFundsNotEqualTo(BigDecimal value) {
            addCriterion("quality_funds <>", value, "qualityFunds");
            return (Criteria) this;
        }

        public Criteria andQualityFundsGreaterThan(BigDecimal value) {
            addCriterion("quality_funds >", value, "qualityFunds");
            return (Criteria) this;
        }

        public Criteria andQualityFundsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("quality_funds >=", value, "qualityFunds");
            return (Criteria) this;
        }

        public Criteria andQualityFundsLessThan(BigDecimal value) {
            addCriterion("quality_funds <", value, "qualityFunds");
            return (Criteria) this;
        }

        public Criteria andQualityFundsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("quality_funds <=", value, "qualityFunds");
            return (Criteria) this;
        }

        public Criteria andQualityFundsIn(List<BigDecimal> values) {
            addCriterion("quality_funds in", values, "qualityFunds");
            return (Criteria) this;
        }

        public Criteria andQualityFundsNotIn(List<BigDecimal> values) {
            addCriterion("quality_funds not in", values, "qualityFunds");
            return (Criteria) this;
        }

        public Criteria andQualityFundsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quality_funds between", value1, value2, "qualityFunds");
            return (Criteria) this;
        }

        public Criteria andQualityFundsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quality_funds not between", value1, value2, "qualityFunds");
            return (Criteria) this;
        }

        public Criteria andDeliveryRequiresIsNull() {
            addCriterion("delivery_requires is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryRequiresIsNotNull() {
            addCriterion("delivery_requires is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryRequiresEqualTo(String value) {
            addCriterion("delivery_requires =", value, "deliveryRequires");
            return (Criteria) this;
        }

        public Criteria andDeliveryRequiresNotEqualTo(String value) {
            addCriterion("delivery_requires <>", value, "deliveryRequires");
            return (Criteria) this;
        }

        public Criteria andDeliveryRequiresGreaterThan(String value) {
            addCriterion("delivery_requires >", value, "deliveryRequires");
            return (Criteria) this;
        }

        public Criteria andDeliveryRequiresGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_requires >=", value, "deliveryRequires");
            return (Criteria) this;
        }

        public Criteria andDeliveryRequiresLessThan(String value) {
            addCriterion("delivery_requires <", value, "deliveryRequires");
            return (Criteria) this;
        }

        public Criteria andDeliveryRequiresLessThanOrEqualTo(String value) {
            addCriterion("delivery_requires <=", value, "deliveryRequires");
            return (Criteria) this;
        }

        public Criteria andDeliveryRequiresLike(String value) {
            addCriterion("delivery_requires like", value, "deliveryRequires");
            return (Criteria) this;
        }

        public Criteria andDeliveryRequiresNotLike(String value) {
            addCriterion("delivery_requires not like", value, "deliveryRequires");
            return (Criteria) this;
        }

        public Criteria andDeliveryRequiresIn(List<String> values) {
            addCriterion("delivery_requires in", values, "deliveryRequires");
            return (Criteria) this;
        }

        public Criteria andDeliveryRequiresNotIn(List<String> values) {
            addCriterion("delivery_requires not in", values, "deliveryRequires");
            return (Criteria) this;
        }

        public Criteria andDeliveryRequiresBetween(String value1, String value2) {
            addCriterion("delivery_requires between", value1, value2, "deliveryRequires");
            return (Criteria) this;
        }

        public Criteria andDeliveryRequiresNotBetween(String value1, String value2) {
            addCriterion("delivery_requires not between", value1, value2, "deliveryRequires");
            return (Criteria) this;
        }

        public Criteria andCustomerContextIsNull() {
            addCriterion("customer_context is null");
            return (Criteria) this;
        }

        public Criteria andCustomerContextIsNotNull() {
            addCriterion("customer_context is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerContextEqualTo(String value) {
            addCriterion("customer_context =", value, "customerContext");
            return (Criteria) this;
        }

        public Criteria andCustomerContextNotEqualTo(String value) {
            addCriterion("customer_context <>", value, "customerContext");
            return (Criteria) this;
        }

        public Criteria andCustomerContextGreaterThan(String value) {
            addCriterion("customer_context >", value, "customerContext");
            return (Criteria) this;
        }

        public Criteria andCustomerContextGreaterThanOrEqualTo(String value) {
            addCriterion("customer_context >=", value, "customerContext");
            return (Criteria) this;
        }

        public Criteria andCustomerContextLessThan(String value) {
            addCriterion("customer_context <", value, "customerContext");
            return (Criteria) this;
        }

        public Criteria andCustomerContextLessThanOrEqualTo(String value) {
            addCriterion("customer_context <=", value, "customerContext");
            return (Criteria) this;
        }

        public Criteria andCustomerContextLike(String value) {
            addCriterion("customer_context like", value, "customerContext");
            return (Criteria) this;
        }

        public Criteria andCustomerContextNotLike(String value) {
            addCriterion("customer_context not like", value, "customerContext");
            return (Criteria) this;
        }

        public Criteria andCustomerContextIn(List<String> values) {
            addCriterion("customer_context in", values, "customerContext");
            return (Criteria) this;
        }

        public Criteria andCustomerContextNotIn(List<String> values) {
            addCriterion("customer_context not in", values, "customerContext");
            return (Criteria) this;
        }

        public Criteria andCustomerContextBetween(String value1, String value2) {
            addCriterion("customer_context between", value1, value2, "customerContext");
            return (Criteria) this;
        }

        public Criteria andCustomerContextNotBetween(String value1, String value2) {
            addCriterion("customer_context not between", value1, value2, "customerContext");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Short value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Short value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Short value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Short value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Short value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Short> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Short> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Short value1, Short value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Short value1, Short value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Short value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Short value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Short value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Short value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Short value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Short> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Short> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Short value1, Short value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Short value1, Short value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andReceivableAccountRemainingIsNull() {
            addCriterion("receivable_account_remaining is null");
            return (Criteria) this;
        }

        public Criteria andReceivableAccountRemainingIsNotNull() {
            addCriterion("receivable_account_remaining is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableAccountRemainingEqualTo(BigDecimal value) {
            addCriterion("receivable_account_remaining =", value, "receivableAccountRemaining");
            return (Criteria) this;
        }

        public Criteria andReceivableAccountRemainingNotEqualTo(BigDecimal value) {
            addCriterion("receivable_account_remaining <>", value, "receivableAccountRemaining");
            return (Criteria) this;
        }

        public Criteria andReceivableAccountRemainingGreaterThan(BigDecimal value) {
            addCriterion("receivable_account_remaining >", value, "receivableAccountRemaining");
            return (Criteria) this;
        }

        public Criteria andReceivableAccountRemainingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("receivable_account_remaining >=", value, "receivableAccountRemaining");
            return (Criteria) this;
        }

        public Criteria andReceivableAccountRemainingLessThan(BigDecimal value) {
            addCriterion("receivable_account_remaining <", value, "receivableAccountRemaining");
            return (Criteria) this;
        }

        public Criteria andReceivableAccountRemainingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("receivable_account_remaining <=", value, "receivableAccountRemaining");
            return (Criteria) this;
        }

        public Criteria andReceivableAccountRemainingIn(List<BigDecimal> values) {
            addCriterion("receivable_account_remaining in", values, "receivableAccountRemaining");
            return (Criteria) this;
        }

        public Criteria andReceivableAccountRemainingNotIn(List<BigDecimal> values) {
            addCriterion("receivable_account_remaining not in", values, "receivableAccountRemaining");
            return (Criteria) this;
        }

        public Criteria andReceivableAccountRemainingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receivable_account_remaining between", value1, value2, "receivableAccountRemaining");
            return (Criteria) this;
        }

        public Criteria andReceivableAccountRemainingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receivable_account_remaining not between", value1, value2, "receivableAccountRemaining");
            return (Criteria) this;
        }

        public Criteria andAcquireIdIsNull() {
            addCriterion("acquire_id is null");
            return (Criteria) this;
        }

        public Criteria andAcquireIdIsNotNull() {
            addCriterion("acquire_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcquireIdEqualTo(Long value) {
            addCriterion("acquire_id =", value, "acquireId");
            return (Criteria) this;
        }

        public Criteria andAcquireIdNotEqualTo(Long value) {
            addCriterion("acquire_id <>", value, "acquireId");
            return (Criteria) this;
        }

        public Criteria andAcquireIdGreaterThan(Long value) {
            addCriterion("acquire_id >", value, "acquireId");
            return (Criteria) this;
        }

        public Criteria andAcquireIdGreaterThanOrEqualTo(Long value) {
            addCriterion("acquire_id >=", value, "acquireId");
            return (Criteria) this;
        }

        public Criteria andAcquireIdLessThan(Long value) {
            addCriterion("acquire_id <", value, "acquireId");
            return (Criteria) this;
        }

        public Criteria andAcquireIdLessThanOrEqualTo(Long value) {
            addCriterion("acquire_id <=", value, "acquireId");
            return (Criteria) this;
        }

        public Criteria andAcquireIdIn(List<Long> values) {
            addCriterion("acquire_id in", values, "acquireId");
            return (Criteria) this;
        }

        public Criteria andAcquireIdNotIn(List<Long> values) {
            addCriterion("acquire_id not in", values, "acquireId");
            return (Criteria) this;
        }

        public Criteria andAcquireIdBetween(Long value1, Long value2) {
            addCriterion("acquire_id between", value1, value2, "acquireId");
            return (Criteria) this;
        }

        public Criteria andAcquireIdNotBetween(Long value1, Long value2) {
            addCriterion("acquire_id not between", value1, value2, "acquireId");
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

        public Criteria andDeliverConsignHasEqualTo(Short value) {
            addCriterion("deliver_consign_has =", value, "deliverConsignHas");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignHasNotEqualTo(Short value) {
            addCriterion("deliver_consign_has <>", value, "deliverConsignHas");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignHasGreaterThan(Short value) {
            addCriterion("deliver_consign_has >", value, "deliverConsignHas");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignHasGreaterThanOrEqualTo(Short value) {
            addCriterion("deliver_consign_has >=", value, "deliverConsignHas");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignHasLessThan(Short value) {
            addCriterion("deliver_consign_has <", value, "deliverConsignHas");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignHasLessThanOrEqualTo(Short value) {
            addCriterion("deliver_consign_has <=", value, "deliverConsignHas");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignHasIn(List<Short> values) {
            addCriterion("deliver_consign_has in", values, "deliverConsignHas");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignHasNotIn(List<Short> values) {
            addCriterion("deliver_consign_has not in", values, "deliverConsignHas");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignHasBetween(Short value1, Short value2) {
            addCriterion("deliver_consign_has between", value1, value2, "deliverConsignHas");
            return (Criteria) this;
        }

        public Criteria andDeliverConsignHasNotBetween(Short value1, Short value2) {
            addCriterion("deliver_consign_has not between", value1, value2, "deliverConsignHas");
            return (Criteria) this;
        }

        public Criteria andOrderBelongsIsNull() {
            addCriterion("order_belongs is null");
            return (Criteria) this;
        }

        public Criteria andOrderBelongsIsNotNull() {
            addCriterion("order_belongs is not null");
            return (Criteria) this;
        }

        public Criteria andOrderBelongsEqualTo(Short value) {
            addCriterion("order_belongs =", value, "orderBelongs");
            return (Criteria) this;
        }

        public Criteria andOrderBelongsNotEqualTo(Short value) {
            addCriterion("order_belongs <>", value, "orderBelongs");
            return (Criteria) this;
        }

        public Criteria andOrderBelongsGreaterThan(Short value) {
            addCriterion("order_belongs >", value, "orderBelongs");
            return (Criteria) this;
        }

        public Criteria andOrderBelongsGreaterThanOrEqualTo(Short value) {
            addCriterion("order_belongs >=", value, "orderBelongs");
            return (Criteria) this;
        }

        public Criteria andOrderBelongsLessThan(Short value) {
            addCriterion("order_belongs <", value, "orderBelongs");
            return (Criteria) this;
        }

        public Criteria andOrderBelongsLessThanOrEqualTo(Short value) {
            addCriterion("order_belongs <=", value, "orderBelongs");
            return (Criteria) this;
        }

        public Criteria andOrderBelongsIn(List<Short> values) {
            addCriterion("order_belongs in", values, "orderBelongs");
            return (Criteria) this;
        }

        public Criteria andOrderBelongsNotIn(List<Short> values) {
            addCriterion("order_belongs not in", values, "orderBelongs");
            return (Criteria) this;
        }

        public Criteria andOrderBelongsBetween(Short value1, Short value2) {
            addCriterion("order_belongs between", value1, value2, "orderBelongs");
            return (Criteria) this;
        }

        public Criteria andOrderBelongsNotBetween(Short value1, Short value2) {
            addCriterion("order_belongs not between", value1, value2, "orderBelongs");
            return (Criteria) this;
        }

        public Criteria andOrderCategoryIsNull() {
            addCriterion("order_category is null");
            return (Criteria) this;
        }

        public Criteria andOrderCategoryIsNotNull() {
            addCriterion("order_category is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCategoryEqualTo(Short value) {
            addCriterion("order_category =", value, "orderCategory");
            return (Criteria) this;
        }

        public Criteria andOrderCategoryNotEqualTo(Short value) {
            addCriterion("order_category <>", value, "orderCategory");
            return (Criteria) this;
        }

        public Criteria andOrderCategoryGreaterThan(Short value) {
            addCriterion("order_category >", value, "orderCategory");
            return (Criteria) this;
        }

        public Criteria andOrderCategoryGreaterThanOrEqualTo(Short value) {
            addCriterion("order_category >=", value, "orderCategory");
            return (Criteria) this;
        }

        public Criteria andOrderCategoryLessThan(Short value) {
            addCriterion("order_category <", value, "orderCategory");
            return (Criteria) this;
        }

        public Criteria andOrderCategoryLessThanOrEqualTo(Short value) {
            addCriterion("order_category <=", value, "orderCategory");
            return (Criteria) this;
        }

        public Criteria andOrderCategoryIn(List<Short> values) {
            addCriterion("order_category in", values, "orderCategory");
            return (Criteria) this;
        }

        public Criteria andOrderCategoryNotIn(List<Short> values) {
            addCriterion("order_category not in", values, "orderCategory");
            return (Criteria) this;
        }

        public Criteria andOrderCategoryBetween(Short value1, Short value2) {
            addCriterion("order_category between", value1, value2, "orderCategory");
            return (Criteria) this;
        }

        public Criteria andOrderCategoryNotBetween(Short value1, Short value2) {
            addCriterion("order_category not between", value1, value2, "orderCategory");
            return (Criteria) this;
        }

        public Criteria andOverseasSalesIsNull() {
            addCriterion("overseas_sales is null");
            return (Criteria) this;
        }

        public Criteria andOverseasSalesIsNotNull() {
            addCriterion("overseas_sales is not null");
            return (Criteria) this;
        }

        public Criteria andOverseasSalesEqualTo(Short value) {
            addCriterion("overseas_sales =", value, "overseasSales");
            return (Criteria) this;
        }

        public Criteria andOverseasSalesNotEqualTo(Short value) {
            addCriterion("overseas_sales <>", value, "overseasSales");
            return (Criteria) this;
        }

        public Criteria andOverseasSalesGreaterThan(Short value) {
            addCriterion("overseas_sales >", value, "overseasSales");
            return (Criteria) this;
        }

        public Criteria andOverseasSalesGreaterThanOrEqualTo(Short value) {
            addCriterion("overseas_sales >=", value, "overseasSales");
            return (Criteria) this;
        }

        public Criteria andOverseasSalesLessThan(Short value) {
            addCriterion("overseas_sales <", value, "overseasSales");
            return (Criteria) this;
        }

        public Criteria andOverseasSalesLessThanOrEqualTo(Short value) {
            addCriterion("overseas_sales <=", value, "overseasSales");
            return (Criteria) this;
        }

        public Criteria andOverseasSalesIn(List<Short> values) {
            addCriterion("overseas_sales in", values, "overseasSales");
            return (Criteria) this;
        }

        public Criteria andOverseasSalesNotIn(List<Short> values) {
            addCriterion("overseas_sales not in", values, "overseasSales");
            return (Criteria) this;
        }

        public Criteria andOverseasSalesBetween(Short value1, Short value2) {
            addCriterion("overseas_sales between", value1, value2, "overseasSales");
            return (Criteria) this;
        }

        public Criteria andOverseasSalesNotBetween(Short value1, Short value2) {
            addCriterion("overseas_sales not between", value1, value2, "overseasSales");
            return (Criteria) this;
        }

        public Criteria andShipmentsMoneyIsNull() {
            addCriterion("shipments_money is null");
            return (Criteria) this;
        }

        public Criteria andShipmentsMoneyIsNotNull() {
            addCriterion("shipments_money is not null");
            return (Criteria) this;
        }

        public Criteria andShipmentsMoneyEqualTo(BigDecimal value) {
            addCriterion("shipments_money =", value, "shipmentsMoney");
            return (Criteria) this;
        }

        public Criteria andShipmentsMoneyNotEqualTo(BigDecimal value) {
            addCriterion("shipments_money <>", value, "shipmentsMoney");
            return (Criteria) this;
        }

        public Criteria andShipmentsMoneyGreaterThan(BigDecimal value) {
            addCriterion("shipments_money >", value, "shipmentsMoney");
            return (Criteria) this;
        }

        public Criteria andShipmentsMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shipments_money >=", value, "shipmentsMoney");
            return (Criteria) this;
        }

        public Criteria andShipmentsMoneyLessThan(BigDecimal value) {
            addCriterion("shipments_money <", value, "shipmentsMoney");
            return (Criteria) this;
        }

        public Criteria andShipmentsMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shipments_money <=", value, "shipmentsMoney");
            return (Criteria) this;
        }

        public Criteria andShipmentsMoneyIn(List<BigDecimal> values) {
            addCriterion("shipments_money in", values, "shipmentsMoney");
            return (Criteria) this;
        }

        public Criteria andShipmentsMoneyNotIn(List<BigDecimal> values) {
            addCriterion("shipments_money not in", values, "shipmentsMoney");
            return (Criteria) this;
        }

        public Criteria andShipmentsMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shipments_money between", value1, value2, "shipmentsMoney");
            return (Criteria) this;
        }

        public Criteria andShipmentsMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shipments_money not between", value1, value2, "shipmentsMoney");
            return (Criteria) this;
        }

        public Criteria andAlreadyGatheringMoneyIsNull() {
            addCriterion("already_gathering_money is null");
            return (Criteria) this;
        }

        public Criteria andAlreadyGatheringMoneyIsNotNull() {
            addCriterion("already_gathering_money is not null");
            return (Criteria) this;
        }

        public Criteria andAlreadyGatheringMoneyEqualTo(BigDecimal value) {
            addCriterion("already_gathering_money =", value, "alreadyGatheringMoney");
            return (Criteria) this;
        }

        public Criteria andAlreadyGatheringMoneyNotEqualTo(BigDecimal value) {
            addCriterion("already_gathering_money <>", value, "alreadyGatheringMoney");
            return (Criteria) this;
        }

        public Criteria andAlreadyGatheringMoneyGreaterThan(BigDecimal value) {
            addCriterion("already_gathering_money >", value, "alreadyGatheringMoney");
            return (Criteria) this;
        }

        public Criteria andAlreadyGatheringMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("already_gathering_money >=", value, "alreadyGatheringMoney");
            return (Criteria) this;
        }

        public Criteria andAlreadyGatheringMoneyLessThan(BigDecimal value) {
            addCriterion("already_gathering_money <", value, "alreadyGatheringMoney");
            return (Criteria) this;
        }

        public Criteria andAlreadyGatheringMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("already_gathering_money <=", value, "alreadyGatheringMoney");
            return (Criteria) this;
        }

        public Criteria andAlreadyGatheringMoneyIn(List<BigDecimal> values) {
            addCriterion("already_gathering_money in", values, "alreadyGatheringMoney");
            return (Criteria) this;
        }

        public Criteria andAlreadyGatheringMoneyNotIn(List<BigDecimal> values) {
            addCriterion("already_gathering_money not in", values, "alreadyGatheringMoney");
            return (Criteria) this;
        }

        public Criteria andAlreadyGatheringMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("already_gathering_money between", value1, value2, "alreadyGatheringMoney");
            return (Criteria) this;
        }

        public Criteria andAlreadyGatheringMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("already_gathering_money not between", value1, value2, "alreadyGatheringMoney");
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

        public Criteria andAuditingProcessIsNull() {
            addCriterion("auditing_process is null");
            return (Criteria) this;
        }

        public Criteria andAuditingProcessIsNotNull() {
            addCriterion("auditing_process is not null");
            return (Criteria) this;
        }

        public Criteria andAuditingProcessEqualTo(String value) {
            addCriterion("auditing_process =", value, "auditingProcess");
            return (Criteria) this;
        }

        public Criteria andAuditingProcessNotEqualTo(String value) {
            addCriterion("auditing_process <>", value, "auditingProcess");
            return (Criteria) this;
        }

        public Criteria andAuditingProcessGreaterThan(String value) {
            addCriterion("auditing_process >", value, "auditingProcess");
            return (Criteria) this;
        }

        public Criteria andAuditingProcessGreaterThanOrEqualTo(String value) {
            addCriterion("auditing_process >=", value, "auditingProcess");
            return (Criteria) this;
        }

        public Criteria andAuditingProcessLessThan(String value) {
            addCriterion("auditing_process <", value, "auditingProcess");
            return (Criteria) this;
        }

        public Criteria andAuditingProcessLessThanOrEqualTo(String value) {
            addCriterion("auditing_process <=", value, "auditingProcess");
            return (Criteria) this;
        }

        public Criteria andAuditingProcessLike(String value) {
            addCriterion("auditing_process like", value, "auditingProcess");
            return (Criteria) this;
        }

        public Criteria andAuditingProcessNotLike(String value) {
            addCriterion("auditing_process not like", value, "auditingProcess");
            return (Criteria) this;
        }

        public Criteria andAuditingProcessIn(List<String> values) {
            addCriterion("auditing_process in", values, "auditingProcess");
            return (Criteria) this;
        }

        public Criteria andAuditingProcessNotIn(List<String> values) {
            addCriterion("auditing_process not in", values, "auditingProcess");
            return (Criteria) this;
        }

        public Criteria andAuditingProcessBetween(String value1, String value2) {
            addCriterion("auditing_process between", value1, value2, "auditingProcess");
            return (Criteria) this;
        }

        public Criteria andAuditingProcessNotBetween(String value1, String value2) {
            addCriterion("auditing_process not between", value1, value2, "auditingProcess");
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