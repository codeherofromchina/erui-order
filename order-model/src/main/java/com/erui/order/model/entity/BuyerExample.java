package com.erui.order.model.entity;

import java.util.ArrayList;
import java.util.List;

public class BuyerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuyerExample() {
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

        public Criteria andBuyerNoIsNull() {
            addCriterion("buyer_no is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNoIsNotNull() {
            addCriterion("buyer_no is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNoEqualTo(String value) {
            addCriterion("buyer_no =", value, "buyerNo");
            return (Criteria) this;
        }

        public Criteria andBuyerNoNotEqualTo(String value) {
            addCriterion("buyer_no <>", value, "buyerNo");
            return (Criteria) this;
        }

        public Criteria andBuyerNoGreaterThan(String value) {
            addCriterion("buyer_no >", value, "buyerNo");
            return (Criteria) this;
        }

        public Criteria andBuyerNoGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_no >=", value, "buyerNo");
            return (Criteria) this;
        }

        public Criteria andBuyerNoLessThan(String value) {
            addCriterion("buyer_no <", value, "buyerNo");
            return (Criteria) this;
        }

        public Criteria andBuyerNoLessThanOrEqualTo(String value) {
            addCriterion("buyer_no <=", value, "buyerNo");
            return (Criteria) this;
        }

        public Criteria andBuyerNoLike(String value) {
            addCriterion("buyer_no like", value, "buyerNo");
            return (Criteria) this;
        }

        public Criteria andBuyerNoNotLike(String value) {
            addCriterion("buyer_no not like", value, "buyerNo");
            return (Criteria) this;
        }

        public Criteria andBuyerNoIn(List<String> values) {
            addCriterion("buyer_no in", values, "buyerNo");
            return (Criteria) this;
        }

        public Criteria andBuyerNoNotIn(List<String> values) {
            addCriterion("buyer_no not in", values, "buyerNo");
            return (Criteria) this;
        }

        public Criteria andBuyerNoBetween(String value1, String value2) {
            addCriterion("buyer_no between", value1, value2, "buyerNo");
            return (Criteria) this;
        }

        public Criteria andBuyerNoNotBetween(String value1, String value2) {
            addCriterion("buyer_no not between", value1, value2, "buyerNo");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeIsNull() {
            addCriterion("buyer_code is null");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeIsNotNull() {
            addCriterion("buyer_code is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeEqualTo(String value) {
            addCriterion("buyer_code =", value, "buyerCode");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeNotEqualTo(String value) {
            addCriterion("buyer_code <>", value, "buyerCode");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeGreaterThan(String value) {
            addCriterion("buyer_code >", value, "buyerCode");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_code >=", value, "buyerCode");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeLessThan(String value) {
            addCriterion("buyer_code <", value, "buyerCode");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeLessThanOrEqualTo(String value) {
            addCriterion("buyer_code <=", value, "buyerCode");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeLike(String value) {
            addCriterion("buyer_code like", value, "buyerCode");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeNotLike(String value) {
            addCriterion("buyer_code not like", value, "buyerCode");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeIn(List<String> values) {
            addCriterion("buyer_code in", values, "buyerCode");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeNotIn(List<String> values) {
            addCriterion("buyer_code not in", values, "buyerCode");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeBetween(String value1, String value2) {
            addCriterion("buyer_code between", value1, value2, "buyerCode");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeNotBetween(String value1, String value2) {
            addCriterion("buyer_code not between", value1, value2, "buyerCode");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNull() {
            addCriterion("buyer_name is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNotNull() {
            addCriterion("buyer_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameEqualTo(String value) {
            addCriterion("buyer_name =", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotEqualTo(String value) {
            addCriterion("buyer_name <>", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThan(String value) {
            addCriterion("buyer_name >", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_name >=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThan(String value) {
            addCriterion("buyer_name <", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThanOrEqualTo(String value) {
            addCriterion("buyer_name <=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLike(String value) {
            addCriterion("buyer_name like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotLike(String value) {
            addCriterion("buyer_name not like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIn(List<String> values) {
            addCriterion("buyer_name in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotIn(List<String> values) {
            addCriterion("buyer_name not in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameBetween(String value1, String value2) {
            addCriterion("buyer_name between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotBetween(String value1, String value2) {
            addCriterion("buyer_name not between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andAreaBnIsNull() {
            addCriterion("area_bn is null");
            return (Criteria) this;
        }

        public Criteria andAreaBnIsNotNull() {
            addCriterion("area_bn is not null");
            return (Criteria) this;
        }

        public Criteria andAreaBnEqualTo(String value) {
            addCriterion("area_bn =", value, "areaBn");
            return (Criteria) this;
        }

        public Criteria andAreaBnNotEqualTo(String value) {
            addCriterion("area_bn <>", value, "areaBn");
            return (Criteria) this;
        }

        public Criteria andAreaBnGreaterThan(String value) {
            addCriterion("area_bn >", value, "areaBn");
            return (Criteria) this;
        }

        public Criteria andAreaBnGreaterThanOrEqualTo(String value) {
            addCriterion("area_bn >=", value, "areaBn");
            return (Criteria) this;
        }

        public Criteria andAreaBnLessThan(String value) {
            addCriterion("area_bn <", value, "areaBn");
            return (Criteria) this;
        }

        public Criteria andAreaBnLessThanOrEqualTo(String value) {
            addCriterion("area_bn <=", value, "areaBn");
            return (Criteria) this;
        }

        public Criteria andAreaBnLike(String value) {
            addCriterion("area_bn like", value, "areaBn");
            return (Criteria) this;
        }

        public Criteria andAreaBnNotLike(String value) {
            addCriterion("area_bn not like", value, "areaBn");
            return (Criteria) this;
        }

        public Criteria andAreaBnIn(List<String> values) {
            addCriterion("area_bn in", values, "areaBn");
            return (Criteria) this;
        }

        public Criteria andAreaBnNotIn(List<String> values) {
            addCriterion("area_bn not in", values, "areaBn");
            return (Criteria) this;
        }

        public Criteria andAreaBnBetween(String value1, String value2) {
            addCriterion("area_bn between", value1, value2, "areaBn");
            return (Criteria) this;
        }

        public Criteria andAreaBnNotBetween(String value1, String value2) {
            addCriterion("area_bn not between", value1, value2, "areaBn");
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