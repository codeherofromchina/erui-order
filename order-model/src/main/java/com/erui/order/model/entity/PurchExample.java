package com.erui.order.model.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchExample() {
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

        public Criteria andPurchNoIsNull() {
            addCriterion("purch_no is null");
            return (Criteria) this;
        }

        public Criteria andPurchNoIsNotNull() {
            addCriterion("purch_no is not null");
            return (Criteria) this;
        }

        public Criteria andPurchNoEqualTo(String value) {
            addCriterion("purch_no =", value, "purchNo");
            return (Criteria) this;
        }

        public Criteria andPurchNoNotEqualTo(String value) {
            addCriterion("purch_no <>", value, "purchNo");
            return (Criteria) this;
        }

        public Criteria andPurchNoGreaterThan(String value) {
            addCriterion("purch_no >", value, "purchNo");
            return (Criteria) this;
        }

        public Criteria andPurchNoGreaterThanOrEqualTo(String value) {
            addCriterion("purch_no >=", value, "purchNo");
            return (Criteria) this;
        }

        public Criteria andPurchNoLessThan(String value) {
            addCriterion("purch_no <", value, "purchNo");
            return (Criteria) this;
        }

        public Criteria andPurchNoLessThanOrEqualTo(String value) {
            addCriterion("purch_no <=", value, "purchNo");
            return (Criteria) this;
        }

        public Criteria andPurchNoLike(String value) {
            addCriterion("purch_no like", value, "purchNo");
            return (Criteria) this;
        }

        public Criteria andPurchNoNotLike(String value) {
            addCriterion("purch_no not like", value, "purchNo");
            return (Criteria) this;
        }

        public Criteria andPurchNoIn(List<String> values) {
            addCriterion("purch_no in", values, "purchNo");
            return (Criteria) this;
        }

        public Criteria andPurchNoNotIn(List<String> values) {
            addCriterion("purch_no not in", values, "purchNo");
            return (Criteria) this;
        }

        public Criteria andPurchNoBetween(String value1, String value2) {
            addCriterion("purch_no between", value1, value2, "purchNo");
            return (Criteria) this;
        }

        public Criteria andPurchNoNotBetween(String value1, String value2) {
            addCriterion("purch_no not between", value1, value2, "purchNo");
            return (Criteria) this;
        }

        public Criteria andPurchContractIdIsNull() {
            addCriterion("purch_contract_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchContractIdIsNotNull() {
            addCriterion("purch_contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchContractIdEqualTo(Long value) {
            addCriterion("purch_contract_id =", value, "purchContractId");
            return (Criteria) this;
        }

        public Criteria andPurchContractIdNotEqualTo(Long value) {
            addCriterion("purch_contract_id <>", value, "purchContractId");
            return (Criteria) this;
        }

        public Criteria andPurchContractIdGreaterThan(Long value) {
            addCriterion("purch_contract_id >", value, "purchContractId");
            return (Criteria) this;
        }

        public Criteria andPurchContractIdGreaterThanOrEqualTo(Long value) {
            addCriterion("purch_contract_id >=", value, "purchContractId");
            return (Criteria) this;
        }

        public Criteria andPurchContractIdLessThan(Long value) {
            addCriterion("purch_contract_id <", value, "purchContractId");
            return (Criteria) this;
        }

        public Criteria andPurchContractIdLessThanOrEqualTo(Long value) {
            addCriterion("purch_contract_id <=", value, "purchContractId");
            return (Criteria) this;
        }

        public Criteria andPurchContractIdIn(List<Long> values) {
            addCriterion("purch_contract_id in", values, "purchContractId");
            return (Criteria) this;
        }

        public Criteria andPurchContractIdNotIn(List<Long> values) {
            addCriterion("purch_contract_id not in", values, "purchContractId");
            return (Criteria) this;
        }

        public Criteria andPurchContractIdBetween(Long value1, Long value2) {
            addCriterion("purch_contract_id between", value1, value2, "purchContractId");
            return (Criteria) this;
        }

        public Criteria andPurchContractIdNotBetween(Long value1, Long value2) {
            addCriterion("purch_contract_id not between", value1, value2, "purchContractId");
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

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
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

        public Criteria andPurChgDateIsNull() {
            addCriterion("pur_chg_date is null");
            return (Criteria) this;
        }

        public Criteria andPurChgDateIsNotNull() {
            addCriterion("pur_chg_date is not null");
            return (Criteria) this;
        }

        public Criteria andPurChgDateEqualTo(Date value) {
            addCriterionForJDBCDate("pur_chg_date =", value, "purChgDate");
            return (Criteria) this;
        }

        public Criteria andPurChgDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pur_chg_date <>", value, "purChgDate");
            return (Criteria) this;
        }

        public Criteria andPurChgDateGreaterThan(Date value) {
            addCriterionForJDBCDate("pur_chg_date >", value, "purChgDate");
            return (Criteria) this;
        }

        public Criteria andPurChgDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pur_chg_date >=", value, "purChgDate");
            return (Criteria) this;
        }

        public Criteria andPurChgDateLessThan(Date value) {
            addCriterionForJDBCDate("pur_chg_date <", value, "purChgDate");
            return (Criteria) this;
        }

        public Criteria andPurChgDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pur_chg_date <=", value, "purChgDate");
            return (Criteria) this;
        }

        public Criteria andPurChgDateIn(List<Date> values) {
            addCriterionForJDBCDate("pur_chg_date in", values, "purChgDate");
            return (Criteria) this;
        }

        public Criteria andPurChgDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pur_chg_date not in", values, "purChgDate");
            return (Criteria) this;
        }

        public Criteria andPurChgDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pur_chg_date between", value1, value2, "purChgDate");
            return (Criteria) this;
        }

        public Criteria andPurChgDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pur_chg_date not between", value1, value2, "purChgDate");
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

        public Criteria andInspectedIsNull() {
            addCriterion("inspected is null");
            return (Criteria) this;
        }

        public Criteria andInspectedIsNotNull() {
            addCriterion("inspected is not null");
            return (Criteria) this;
        }

        public Criteria andInspectedEqualTo(Boolean value) {
            addCriterion("inspected =", value, "inspected");
            return (Criteria) this;
        }

        public Criteria andInspectedNotEqualTo(Boolean value) {
            addCriterion("inspected <>", value, "inspected");
            return (Criteria) this;
        }

        public Criteria andInspectedGreaterThan(Boolean value) {
            addCriterion("inspected >", value, "inspected");
            return (Criteria) this;
        }

        public Criteria andInspectedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("inspected >=", value, "inspected");
            return (Criteria) this;
        }

        public Criteria andInspectedLessThan(Boolean value) {
            addCriterion("inspected <", value, "inspected");
            return (Criteria) this;
        }

        public Criteria andInspectedLessThanOrEqualTo(Boolean value) {
            addCriterion("inspected <=", value, "inspected");
            return (Criteria) this;
        }

        public Criteria andInspectedIn(List<Boolean> values) {
            addCriterion("inspected in", values, "inspected");
            return (Criteria) this;
        }

        public Criteria andInspectedNotIn(List<Boolean> values) {
            addCriterion("inspected not in", values, "inspected");
            return (Criteria) this;
        }

        public Criteria andInspectedBetween(Boolean value1, Boolean value2) {
            addCriterion("inspected between", value1, value2, "inspected");
            return (Criteria) this;
        }

        public Criteria andInspectedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("inspected not between", value1, value2, "inspected");
            return (Criteria) this;
        }

        public Criteria andSupplyAreaIsNull() {
            addCriterion("supply_area is null");
            return (Criteria) this;
        }

        public Criteria andSupplyAreaIsNotNull() {
            addCriterion("supply_area is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyAreaEqualTo(String value) {
            addCriterion("supply_area =", value, "supplyArea");
            return (Criteria) this;
        }

        public Criteria andSupplyAreaNotEqualTo(String value) {
            addCriterion("supply_area <>", value, "supplyArea");
            return (Criteria) this;
        }

        public Criteria andSupplyAreaGreaterThan(String value) {
            addCriterion("supply_area >", value, "supplyArea");
            return (Criteria) this;
        }

        public Criteria andSupplyAreaGreaterThanOrEqualTo(String value) {
            addCriterion("supply_area >=", value, "supplyArea");
            return (Criteria) this;
        }

        public Criteria andSupplyAreaLessThan(String value) {
            addCriterion("supply_area <", value, "supplyArea");
            return (Criteria) this;
        }

        public Criteria andSupplyAreaLessThanOrEqualTo(String value) {
            addCriterion("supply_area <=", value, "supplyArea");
            return (Criteria) this;
        }

        public Criteria andSupplyAreaLike(String value) {
            addCriterion("supply_area like", value, "supplyArea");
            return (Criteria) this;
        }

        public Criteria andSupplyAreaNotLike(String value) {
            addCriterion("supply_area not like", value, "supplyArea");
            return (Criteria) this;
        }

        public Criteria andSupplyAreaIn(List<String> values) {
            addCriterion("supply_area in", values, "supplyArea");
            return (Criteria) this;
        }

        public Criteria andSupplyAreaNotIn(List<String> values) {
            addCriterion("supply_area not in", values, "supplyArea");
            return (Criteria) this;
        }

        public Criteria andSupplyAreaBetween(String value1, String value2) {
            addCriterion("supply_area between", value1, value2, "supplyArea");
            return (Criteria) this;
        }

        public Criteria andSupplyAreaNotBetween(String value1, String value2) {
            addCriterion("supply_area not between", value1, value2, "supplyArea");
            return (Criteria) this;
        }

        public Criteria andGoalCostIsNull() {
            addCriterion("goal_cost is null");
            return (Criteria) this;
        }

        public Criteria andGoalCostIsNotNull() {
            addCriterion("goal_cost is not null");
            return (Criteria) this;
        }

        public Criteria andGoalCostEqualTo(BigDecimal value) {
            addCriterion("goal_cost =", value, "goalCost");
            return (Criteria) this;
        }

        public Criteria andGoalCostNotEqualTo(BigDecimal value) {
            addCriterion("goal_cost <>", value, "goalCost");
            return (Criteria) this;
        }

        public Criteria andGoalCostGreaterThan(BigDecimal value) {
            addCriterion("goal_cost >", value, "goalCost");
            return (Criteria) this;
        }

        public Criteria andGoalCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goal_cost >=", value, "goalCost");
            return (Criteria) this;
        }

        public Criteria andGoalCostLessThan(BigDecimal value) {
            addCriterion("goal_cost <", value, "goalCost");
            return (Criteria) this;
        }

        public Criteria andGoalCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goal_cost <=", value, "goalCost");
            return (Criteria) this;
        }

        public Criteria andGoalCostIn(List<BigDecimal> values) {
            addCriterion("goal_cost in", values, "goalCost");
            return (Criteria) this;
        }

        public Criteria andGoalCostNotIn(List<BigDecimal> values) {
            addCriterion("goal_cost not in", values, "goalCost");
            return (Criteria) this;
        }

        public Criteria andGoalCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goal_cost between", value1, value2, "goalCost");
            return (Criteria) this;
        }

        public Criteria andGoalCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goal_cost not between", value1, value2, "goalCost");
            return (Criteria) this;
        }

        public Criteria andSaveAmountIsNull() {
            addCriterion("save_amount is null");
            return (Criteria) this;
        }

        public Criteria andSaveAmountIsNotNull() {
            addCriterion("save_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSaveAmountEqualTo(BigDecimal value) {
            addCriterion("save_amount =", value, "saveAmount");
            return (Criteria) this;
        }

        public Criteria andSaveAmountNotEqualTo(BigDecimal value) {
            addCriterion("save_amount <>", value, "saveAmount");
            return (Criteria) this;
        }

        public Criteria andSaveAmountGreaterThan(BigDecimal value) {
            addCriterion("save_amount >", value, "saveAmount");
            return (Criteria) this;
        }

        public Criteria andSaveAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("save_amount >=", value, "saveAmount");
            return (Criteria) this;
        }

        public Criteria andSaveAmountLessThan(BigDecimal value) {
            addCriterion("save_amount <", value, "saveAmount");
            return (Criteria) this;
        }

        public Criteria andSaveAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("save_amount <=", value, "saveAmount");
            return (Criteria) this;
        }

        public Criteria andSaveAmountIn(List<BigDecimal> values) {
            addCriterion("save_amount in", values, "saveAmount");
            return (Criteria) this;
        }

        public Criteria andSaveAmountNotIn(List<BigDecimal> values) {
            addCriterion("save_amount not in", values, "saveAmount");
            return (Criteria) this;
        }

        public Criteria andSaveAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("save_amount between", value1, value2, "saveAmount");
            return (Criteria) this;
        }

        public Criteria andSaveAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("save_amount not between", value1, value2, "saveAmount");
            return (Criteria) this;
        }

        public Criteria andSaveModeIsNull() {
            addCriterion("save_mode is null");
            return (Criteria) this;
        }

        public Criteria andSaveModeIsNotNull() {
            addCriterion("save_mode is not null");
            return (Criteria) this;
        }

        public Criteria andSaveModeEqualTo(Short value) {
            addCriterion("save_mode =", value, "saveMode");
            return (Criteria) this;
        }

        public Criteria andSaveModeNotEqualTo(Short value) {
            addCriterion("save_mode <>", value, "saveMode");
            return (Criteria) this;
        }

        public Criteria andSaveModeGreaterThan(Short value) {
            addCriterion("save_mode >", value, "saveMode");
            return (Criteria) this;
        }

        public Criteria andSaveModeGreaterThanOrEqualTo(Short value) {
            addCriterion("save_mode >=", value, "saveMode");
            return (Criteria) this;
        }

        public Criteria andSaveModeLessThan(Short value) {
            addCriterion("save_mode <", value, "saveMode");
            return (Criteria) this;
        }

        public Criteria andSaveModeLessThanOrEqualTo(Short value) {
            addCriterion("save_mode <=", value, "saveMode");
            return (Criteria) this;
        }

        public Criteria andSaveModeIn(List<Short> values) {
            addCriterion("save_mode in", values, "saveMode");
            return (Criteria) this;
        }

        public Criteria andSaveModeNotIn(List<Short> values) {
            addCriterion("save_mode not in", values, "saveMode");
            return (Criteria) this;
        }

        public Criteria andSaveModeBetween(Short value1, Short value2) {
            addCriterion("save_mode between", value1, value2, "saveMode");
            return (Criteria) this;
        }

        public Criteria andSaveModeNotBetween(Short value1, Short value2) {
            addCriterion("save_mode not between", value1, value2, "saveMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeIsNull() {
            addCriterion("price_mode is null");
            return (Criteria) this;
        }

        public Criteria andPriceModeIsNotNull() {
            addCriterion("price_mode is not null");
            return (Criteria) this;
        }

        public Criteria andPriceModeEqualTo(Short value) {
            addCriterion("price_mode =", value, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeNotEqualTo(Short value) {
            addCriterion("price_mode <>", value, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeGreaterThan(Short value) {
            addCriterion("price_mode >", value, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeGreaterThanOrEqualTo(Short value) {
            addCriterion("price_mode >=", value, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeLessThan(Short value) {
            addCriterion("price_mode <", value, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeLessThanOrEqualTo(Short value) {
            addCriterion("price_mode <=", value, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeIn(List<Short> values) {
            addCriterion("price_mode in", values, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeNotIn(List<Short> values) {
            addCriterion("price_mode not in", values, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeBetween(Short value1, Short value2) {
            addCriterion("price_mode between", value1, value2, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeNotBetween(Short value1, Short value2) {
            addCriterion("price_mode not between", value1, value2, "priceMode");
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

        public Criteria andContractTagIsNull() {
            addCriterion("contract_tag is null");
            return (Criteria) this;
        }

        public Criteria andContractTagIsNotNull() {
            addCriterion("contract_tag is not null");
            return (Criteria) this;
        }

        public Criteria andContractTagEqualTo(String value) {
            addCriterion("contract_tag =", value, "contractTag");
            return (Criteria) this;
        }

        public Criteria andContractTagNotEqualTo(String value) {
            addCriterion("contract_tag <>", value, "contractTag");
            return (Criteria) this;
        }

        public Criteria andContractTagGreaterThan(String value) {
            addCriterion("contract_tag >", value, "contractTag");
            return (Criteria) this;
        }

        public Criteria andContractTagGreaterThanOrEqualTo(String value) {
            addCriterion("contract_tag >=", value, "contractTag");
            return (Criteria) this;
        }

        public Criteria andContractTagLessThan(String value) {
            addCriterion("contract_tag <", value, "contractTag");
            return (Criteria) this;
        }

        public Criteria andContractTagLessThanOrEqualTo(String value) {
            addCriterion("contract_tag <=", value, "contractTag");
            return (Criteria) this;
        }

        public Criteria andContractTagLike(String value) {
            addCriterion("contract_tag like", value, "contractTag");
            return (Criteria) this;
        }

        public Criteria andContractTagNotLike(String value) {
            addCriterion("contract_tag not like", value, "contractTag");
            return (Criteria) this;
        }

        public Criteria andContractTagIn(List<String> values) {
            addCriterion("contract_tag in", values, "contractTag");
            return (Criteria) this;
        }

        public Criteria andContractTagNotIn(List<String> values) {
            addCriterion("contract_tag not in", values, "contractTag");
            return (Criteria) this;
        }

        public Criteria andContractTagBetween(String value1, String value2) {
            addCriterion("contract_tag between", value1, value2, "contractTag");
            return (Criteria) this;
        }

        public Criteria andContractTagNotBetween(String value1, String value2) {
            addCriterion("contract_tag not between", value1, value2, "contractTag");
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

        public Criteria andTaxBearingEqualTo(Boolean value) {
            addCriterion("tax_bearing =", value, "taxBearing");
            return (Criteria) this;
        }

        public Criteria andTaxBearingNotEqualTo(Boolean value) {
            addCriterion("tax_bearing <>", value, "taxBearing");
            return (Criteria) this;
        }

        public Criteria andTaxBearingGreaterThan(Boolean value) {
            addCriterion("tax_bearing >", value, "taxBearing");
            return (Criteria) this;
        }

        public Criteria andTaxBearingGreaterThanOrEqualTo(Boolean value) {
            addCriterion("tax_bearing >=", value, "taxBearing");
            return (Criteria) this;
        }

        public Criteria andTaxBearingLessThan(Boolean value) {
            addCriterion("tax_bearing <", value, "taxBearing");
            return (Criteria) this;
        }

        public Criteria andTaxBearingLessThanOrEqualTo(Boolean value) {
            addCriterion("tax_bearing <=", value, "taxBearing");
            return (Criteria) this;
        }

        public Criteria andTaxBearingIn(List<Boolean> values) {
            addCriterion("tax_bearing in", values, "taxBearing");
            return (Criteria) this;
        }

        public Criteria andTaxBearingNotIn(List<Boolean> values) {
            addCriterion("tax_bearing not in", values, "taxBearing");
            return (Criteria) this;
        }

        public Criteria andTaxBearingBetween(Boolean value1, Boolean value2) {
            addCriterion("tax_bearing between", value1, value2, "taxBearing");
            return (Criteria) this;
        }

        public Criteria andTaxBearingNotBetween(Boolean value1, Boolean value2) {
            addCriterion("tax_bearing not between", value1, value2, "taxBearing");
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