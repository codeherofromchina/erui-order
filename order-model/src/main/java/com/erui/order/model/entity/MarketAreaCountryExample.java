package com.erui.order.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MarketAreaCountryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MarketAreaCountryExample() {
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

        public Criteria andMarketAreaBnIsNull() {
            addCriterion("market_area_bn is null");
            return (Criteria) this;
        }

        public Criteria andMarketAreaBnIsNotNull() {
            addCriterion("market_area_bn is not null");
            return (Criteria) this;
        }

        public Criteria andMarketAreaBnEqualTo(String value) {
            addCriterion("market_area_bn =", value, "marketAreaBn");
            return (Criteria) this;
        }

        public Criteria andMarketAreaBnNotEqualTo(String value) {
            addCriterion("market_area_bn <>", value, "marketAreaBn");
            return (Criteria) this;
        }

        public Criteria andMarketAreaBnGreaterThan(String value) {
            addCriterion("market_area_bn >", value, "marketAreaBn");
            return (Criteria) this;
        }

        public Criteria andMarketAreaBnGreaterThanOrEqualTo(String value) {
            addCriterion("market_area_bn >=", value, "marketAreaBn");
            return (Criteria) this;
        }

        public Criteria andMarketAreaBnLessThan(String value) {
            addCriterion("market_area_bn <", value, "marketAreaBn");
            return (Criteria) this;
        }

        public Criteria andMarketAreaBnLessThanOrEqualTo(String value) {
            addCriterion("market_area_bn <=", value, "marketAreaBn");
            return (Criteria) this;
        }

        public Criteria andMarketAreaBnLike(String value) {
            addCriterion("market_area_bn like", value, "marketAreaBn");
            return (Criteria) this;
        }

        public Criteria andMarketAreaBnNotLike(String value) {
            addCriterion("market_area_bn not like", value, "marketAreaBn");
            return (Criteria) this;
        }

        public Criteria andMarketAreaBnIn(List<String> values) {
            addCriterion("market_area_bn in", values, "marketAreaBn");
            return (Criteria) this;
        }

        public Criteria andMarketAreaBnNotIn(List<String> values) {
            addCriterion("market_area_bn not in", values, "marketAreaBn");
            return (Criteria) this;
        }

        public Criteria andMarketAreaBnBetween(String value1, String value2) {
            addCriterion("market_area_bn between", value1, value2, "marketAreaBn");
            return (Criteria) this;
        }

        public Criteria andMarketAreaBnNotBetween(String value1, String value2) {
            addCriterion("market_area_bn not between", value1, value2, "marketAreaBn");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
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