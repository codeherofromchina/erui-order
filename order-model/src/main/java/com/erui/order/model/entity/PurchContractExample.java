package com.erui.order.model.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurchContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchContractExample() {
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

        public Criteria andPurchContractNoIsNull() {
            addCriterion("purch_contract_no is null");
            return (Criteria) this;
        }

        public Criteria andPurchContractNoIsNotNull() {
            addCriterion("purch_contract_no is not null");
            return (Criteria) this;
        }

        public Criteria andPurchContractNoEqualTo(String value) {
            addCriterion("purch_contract_no =", value, "purchContractNo");
            return (Criteria) this;
        }

        public Criteria andPurchContractNoNotEqualTo(String value) {
            addCriterion("purch_contract_no <>", value, "purchContractNo");
            return (Criteria) this;
        }

        public Criteria andPurchContractNoGreaterThan(String value) {
            addCriterion("purch_contract_no >", value, "purchContractNo");
            return (Criteria) this;
        }

        public Criteria andPurchContractNoGreaterThanOrEqualTo(String value) {
            addCriterion("purch_contract_no >=", value, "purchContractNo");
            return (Criteria) this;
        }

        public Criteria andPurchContractNoLessThan(String value) {
            addCriterion("purch_contract_no <", value, "purchContractNo");
            return (Criteria) this;
        }

        public Criteria andPurchContractNoLessThanOrEqualTo(String value) {
            addCriterion("purch_contract_no <=", value, "purchContractNo");
            return (Criteria) this;
        }

        public Criteria andPurchContractNoLike(String value) {
            addCriterion("purch_contract_no like", value, "purchContractNo");
            return (Criteria) this;
        }

        public Criteria andPurchContractNoNotLike(String value) {
            addCriterion("purch_contract_no not like", value, "purchContractNo");
            return (Criteria) this;
        }

        public Criteria andPurchContractNoIn(List<String> values) {
            addCriterion("purch_contract_no in", values, "purchContractNo");
            return (Criteria) this;
        }

        public Criteria andPurchContractNoNotIn(List<String> values) {
            addCriterion("purch_contract_no not in", values, "purchContractNo");
            return (Criteria) this;
        }

        public Criteria andPurchContractNoBetween(String value1, String value2) {
            addCriterion("purch_contract_no between", value1, value2, "purchContractNo");
            return (Criteria) this;
        }

        public Criteria andPurchContractNoNotBetween(String value1, String value2) {
            addCriterion("purch_contract_no not between", value1, value2, "purchContractNo");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNull() {
            addCriterion("contract_type is null");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNotNull() {
            addCriterion("contract_type is not null");
            return (Criteria) this;
        }

        public Criteria andContractTypeEqualTo(Short value) {
            addCriterion("contract_type =", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotEqualTo(Short value) {
            addCriterion("contract_type <>", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThan(Short value) {
            addCriterion("contract_type >", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("contract_type >=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThan(Short value) {
            addCriterion("contract_type <", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThanOrEqualTo(Short value) {
            addCriterion("contract_type <=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeIn(List<Short> values) {
            addCriterion("contract_type in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotIn(List<Short> values) {
            addCriterion("contract_type not in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeBetween(Short value1, Short value2) {
            addCriterion("contract_type between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotBetween(Short value1, Short value2) {
            addCriterion("contract_type not between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractStatusIsNull() {
            addCriterion("contract_status is null");
            return (Criteria) this;
        }

        public Criteria andContractStatusIsNotNull() {
            addCriterion("contract_status is not null");
            return (Criteria) this;
        }

        public Criteria andContractStatusEqualTo(Short value) {
            addCriterion("contract_status =", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotEqualTo(Short value) {
            addCriterion("contract_status <>", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusGreaterThan(Short value) {
            addCriterion("contract_status >", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("contract_status >=", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusLessThan(Short value) {
            addCriterion("contract_status <", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusLessThanOrEqualTo(Short value) {
            addCriterion("contract_status <=", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusIn(List<Short> values) {
            addCriterion("contract_status in", values, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotIn(List<Short> values) {
            addCriterion("contract_status not in", values, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusBetween(Short value1, Short value2) {
            addCriterion("contract_status between", value1, value2, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotBetween(Short value1, Short value2) {
            addCriterion("contract_status not between", value1, value2, "contractStatus");
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

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Long value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Long value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Long value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Long value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Long value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Long> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Long> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Long value1, Long value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Long value1, Long value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNull() {
            addCriterion("supplier_name is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("supplier_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("supplier_name =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("supplier_name <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("supplier_name >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_name >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("supplier_name <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("supplier_name <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("supplier_name like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("supplier_name not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("supplier_name in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("supplier_name not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("supplier_name between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("supplier_name not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSigningPlaceIsNull() {
            addCriterion("signing_place is null");
            return (Criteria) this;
        }

        public Criteria andSigningPlaceIsNotNull() {
            addCriterion("signing_place is not null");
            return (Criteria) this;
        }

        public Criteria andSigningPlaceEqualTo(String value) {
            addCriterion("signing_place =", value, "signingPlace");
            return (Criteria) this;
        }

        public Criteria andSigningPlaceNotEqualTo(String value) {
            addCriterion("signing_place <>", value, "signingPlace");
            return (Criteria) this;
        }

        public Criteria andSigningPlaceGreaterThan(String value) {
            addCriterion("signing_place >", value, "signingPlace");
            return (Criteria) this;
        }

        public Criteria andSigningPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("signing_place >=", value, "signingPlace");
            return (Criteria) this;
        }

        public Criteria andSigningPlaceLessThan(String value) {
            addCriterion("signing_place <", value, "signingPlace");
            return (Criteria) this;
        }

        public Criteria andSigningPlaceLessThanOrEqualTo(String value) {
            addCriterion("signing_place <=", value, "signingPlace");
            return (Criteria) this;
        }

        public Criteria andSigningPlaceLike(String value) {
            addCriterion("signing_place like", value, "signingPlace");
            return (Criteria) this;
        }

        public Criteria andSigningPlaceNotLike(String value) {
            addCriterion("signing_place not like", value, "signingPlace");
            return (Criteria) this;
        }

        public Criteria andSigningPlaceIn(List<String> values) {
            addCriterion("signing_place in", values, "signingPlace");
            return (Criteria) this;
        }

        public Criteria andSigningPlaceNotIn(List<String> values) {
            addCriterion("signing_place not in", values, "signingPlace");
            return (Criteria) this;
        }

        public Criteria andSigningPlaceBetween(String value1, String value2) {
            addCriterion("signing_place between", value1, value2, "signingPlace");
            return (Criteria) this;
        }

        public Criteria andSigningPlaceNotBetween(String value1, String value2) {
            addCriterion("signing_place not between", value1, value2, "signingPlace");
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

        public Criteria andTaxPointIsNull() {
            addCriterion("tax_point is null");
            return (Criteria) this;
        }

        public Criteria andTaxPointIsNotNull() {
            addCriterion("tax_point is not null");
            return (Criteria) this;
        }

        public Criteria andTaxPointEqualTo(Short value) {
            addCriterion("tax_point =", value, "taxPoint");
            return (Criteria) this;
        }

        public Criteria andTaxPointNotEqualTo(Short value) {
            addCriterion("tax_point <>", value, "taxPoint");
            return (Criteria) this;
        }

        public Criteria andTaxPointGreaterThan(Short value) {
            addCriterion("tax_point >", value, "taxPoint");
            return (Criteria) this;
        }

        public Criteria andTaxPointGreaterThanOrEqualTo(Short value) {
            addCriterion("tax_point >=", value, "taxPoint");
            return (Criteria) this;
        }

        public Criteria andTaxPointLessThan(Short value) {
            addCriterion("tax_point <", value, "taxPoint");
            return (Criteria) this;
        }

        public Criteria andTaxPointLessThanOrEqualTo(Short value) {
            addCriterion("tax_point <=", value, "taxPoint");
            return (Criteria) this;
        }

        public Criteria andTaxPointIn(List<Short> values) {
            addCriterion("tax_point in", values, "taxPoint");
            return (Criteria) this;
        }

        public Criteria andTaxPointNotIn(List<Short> values) {
            addCriterion("tax_point not in", values, "taxPoint");
            return (Criteria) this;
        }

        public Criteria andTaxPointBetween(Short value1, Short value2) {
            addCriterion("tax_point between", value1, value2, "taxPoint");
            return (Criteria) this;
        }

        public Criteria andTaxPointNotBetween(Short value1, Short value2) {
            addCriterion("tax_point not between", value1, value2, "taxPoint");
            return (Criteria) this;
        }

        public Criteria andCapitalizedPriceIsNull() {
            addCriterion("capitalized_price is null");
            return (Criteria) this;
        }

        public Criteria andCapitalizedPriceIsNotNull() {
            addCriterion("capitalized_price is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalizedPriceEqualTo(String value) {
            addCriterion("capitalized_price =", value, "capitalizedPrice");
            return (Criteria) this;
        }

        public Criteria andCapitalizedPriceNotEqualTo(String value) {
            addCriterion("capitalized_price <>", value, "capitalizedPrice");
            return (Criteria) this;
        }

        public Criteria andCapitalizedPriceGreaterThan(String value) {
            addCriterion("capitalized_price >", value, "capitalizedPrice");
            return (Criteria) this;
        }

        public Criteria andCapitalizedPriceGreaterThanOrEqualTo(String value) {
            addCriterion("capitalized_price >=", value, "capitalizedPrice");
            return (Criteria) this;
        }

        public Criteria andCapitalizedPriceLessThan(String value) {
            addCriterion("capitalized_price <", value, "capitalizedPrice");
            return (Criteria) this;
        }

        public Criteria andCapitalizedPriceLessThanOrEqualTo(String value) {
            addCriterion("capitalized_price <=", value, "capitalizedPrice");
            return (Criteria) this;
        }

        public Criteria andCapitalizedPriceLike(String value) {
            addCriterion("capitalized_price like", value, "capitalizedPrice");
            return (Criteria) this;
        }

        public Criteria andCapitalizedPriceNotLike(String value) {
            addCriterion("capitalized_price not like", value, "capitalizedPrice");
            return (Criteria) this;
        }

        public Criteria andCapitalizedPriceIn(List<String> values) {
            addCriterion("capitalized_price in", values, "capitalizedPrice");
            return (Criteria) this;
        }

        public Criteria andCapitalizedPriceNotIn(List<String> values) {
            addCriterion("capitalized_price not in", values, "capitalizedPrice");
            return (Criteria) this;
        }

        public Criteria andCapitalizedPriceBetween(String value1, String value2) {
            addCriterion("capitalized_price between", value1, value2, "capitalizedPrice");
            return (Criteria) this;
        }

        public Criteria andCapitalizedPriceNotBetween(String value1, String value2) {
            addCriterion("capitalized_price not between", value1, value2, "capitalizedPrice");
            return (Criteria) this;
        }

        public Criteria andLowercasePriceIsNull() {
            addCriterion("lowercase_price is null");
            return (Criteria) this;
        }

        public Criteria andLowercasePriceIsNotNull() {
            addCriterion("lowercase_price is not null");
            return (Criteria) this;
        }

        public Criteria andLowercasePriceEqualTo(BigDecimal value) {
            addCriterion("lowercase_price =", value, "lowercasePrice");
            return (Criteria) this;
        }

        public Criteria andLowercasePriceNotEqualTo(BigDecimal value) {
            addCriterion("lowercase_price <>", value, "lowercasePrice");
            return (Criteria) this;
        }

        public Criteria andLowercasePriceGreaterThan(BigDecimal value) {
            addCriterion("lowercase_price >", value, "lowercasePrice");
            return (Criteria) this;
        }

        public Criteria andLowercasePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lowercase_price >=", value, "lowercasePrice");
            return (Criteria) this;
        }

        public Criteria andLowercasePriceLessThan(BigDecimal value) {
            addCriterion("lowercase_price <", value, "lowercasePrice");
            return (Criteria) this;
        }

        public Criteria andLowercasePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lowercase_price <=", value, "lowercasePrice");
            return (Criteria) this;
        }

        public Criteria andLowercasePriceIn(List<BigDecimal> values) {
            addCriterion("lowercase_price in", values, "lowercasePrice");
            return (Criteria) this;
        }

        public Criteria andLowercasePriceNotIn(List<BigDecimal> values) {
            addCriterion("lowercase_price not in", values, "lowercasePrice");
            return (Criteria) this;
        }

        public Criteria andLowercasePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lowercase_price between", value1, value2, "lowercasePrice");
            return (Criteria) this;
        }

        public Criteria andLowercasePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lowercase_price not between", value1, value2, "lowercasePrice");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarksIsNull() {
            addCriterion("goods_remarks is null");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarksIsNotNull() {
            addCriterion("goods_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarksEqualTo(String value) {
            addCriterion("goods_remarks =", value, "goodsRemarks");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarksNotEqualTo(String value) {
            addCriterion("goods_remarks <>", value, "goodsRemarks");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarksGreaterThan(String value) {
            addCriterion("goods_remarks >", value, "goodsRemarks");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("goods_remarks >=", value, "goodsRemarks");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarksLessThan(String value) {
            addCriterion("goods_remarks <", value, "goodsRemarks");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarksLessThanOrEqualTo(String value) {
            addCriterion("goods_remarks <=", value, "goodsRemarks");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarksLike(String value) {
            addCriterion("goods_remarks like", value, "goodsRemarks");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarksNotLike(String value) {
            addCriterion("goods_remarks not like", value, "goodsRemarks");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarksIn(List<String> values) {
            addCriterion("goods_remarks in", values, "goodsRemarks");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarksNotIn(List<String> values) {
            addCriterion("goods_remarks not in", values, "goodsRemarks");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarksBetween(String value1, String value2) {
            addCriterion("goods_remarks between", value1, value2, "goodsRemarks");
            return (Criteria) this;
        }

        public Criteria andGoodsRemarksNotBetween(String value1, String value2) {
            addCriterion("goods_remarks not between", value1, value2, "goodsRemarks");
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

        public Criteria andCountryBnIsNull() {
            addCriterion("country_bn is null");
            return (Criteria) this;
        }

        public Criteria andCountryBnIsNotNull() {
            addCriterion("country_bn is not null");
            return (Criteria) this;
        }

        public Criteria andCountryBnEqualTo(String value) {
            addCriterion("country_bn =", value, "countryBn");
            return (Criteria) this;
        }

        public Criteria andCountryBnNotEqualTo(String value) {
            addCriterion("country_bn <>", value, "countryBn");
            return (Criteria) this;
        }

        public Criteria andCountryBnGreaterThan(String value) {
            addCriterion("country_bn >", value, "countryBn");
            return (Criteria) this;
        }

        public Criteria andCountryBnGreaterThanOrEqualTo(String value) {
            addCriterion("country_bn >=", value, "countryBn");
            return (Criteria) this;
        }

        public Criteria andCountryBnLessThan(String value) {
            addCriterion("country_bn <", value, "countryBn");
            return (Criteria) this;
        }

        public Criteria andCountryBnLessThanOrEqualTo(String value) {
            addCriterion("country_bn <=", value, "countryBn");
            return (Criteria) this;
        }

        public Criteria andCountryBnLike(String value) {
            addCriterion("country_bn like", value, "countryBn");
            return (Criteria) this;
        }

        public Criteria andCountryBnNotLike(String value) {
            addCriterion("country_bn not like", value, "countryBn");
            return (Criteria) this;
        }

        public Criteria andCountryBnIn(List<String> values) {
            addCriterion("country_bn in", values, "countryBn");
            return (Criteria) this;
        }

        public Criteria andCountryBnNotIn(List<String> values) {
            addCriterion("country_bn not in", values, "countryBn");
            return (Criteria) this;
        }

        public Criteria andCountryBnBetween(String value1, String value2) {
            addCriterion("country_bn between", value1, value2, "countryBn");
            return (Criteria) this;
        }

        public Criteria andCountryBnNotBetween(String value1, String value2) {
            addCriterion("country_bn not between", value1, value2, "countryBn");
            return (Criteria) this;
        }

        public Criteria andRegionBnIsNull() {
            addCriterion("region_bn is null");
            return (Criteria) this;
        }

        public Criteria andRegionBnIsNotNull() {
            addCriterion("region_bn is not null");
            return (Criteria) this;
        }

        public Criteria andRegionBnEqualTo(String value) {
            addCriterion("region_bn =", value, "regionBn");
            return (Criteria) this;
        }

        public Criteria andRegionBnNotEqualTo(String value) {
            addCriterion("region_bn <>", value, "regionBn");
            return (Criteria) this;
        }

        public Criteria andRegionBnGreaterThan(String value) {
            addCriterion("region_bn >", value, "regionBn");
            return (Criteria) this;
        }

        public Criteria andRegionBnGreaterThanOrEqualTo(String value) {
            addCriterion("region_bn >=", value, "regionBn");
            return (Criteria) this;
        }

        public Criteria andRegionBnLessThan(String value) {
            addCriterion("region_bn <", value, "regionBn");
            return (Criteria) this;
        }

        public Criteria andRegionBnLessThanOrEqualTo(String value) {
            addCriterion("region_bn <=", value, "regionBn");
            return (Criteria) this;
        }

        public Criteria andRegionBnLike(String value) {
            addCriterion("region_bn like", value, "regionBn");
            return (Criteria) this;
        }

        public Criteria andRegionBnNotLike(String value) {
            addCriterion("region_bn not like", value, "regionBn");
            return (Criteria) this;
        }

        public Criteria andRegionBnIn(List<String> values) {
            addCriterion("region_bn in", values, "regionBn");
            return (Criteria) this;
        }

        public Criteria andRegionBnNotIn(List<String> values) {
            addCriterion("region_bn not in", values, "regionBn");
            return (Criteria) this;
        }

        public Criteria andRegionBnBetween(String value1, String value2) {
            addCriterion("region_bn between", value1, value2, "regionBn");
            return (Criteria) this;
        }

        public Criteria andRegionBnNotBetween(String value1, String value2) {
            addCriterion("region_bn not between", value1, value2, "regionBn");
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