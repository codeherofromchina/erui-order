package com.erui.order.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PortExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PortExample() {
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

        public Criteria andLangIsNull() {
            addCriterion("lang is null");
            return (Criteria) this;
        }

        public Criteria andLangIsNotNull() {
            addCriterion("lang is not null");
            return (Criteria) this;
        }

        public Criteria andLangEqualTo(String value) {
            addCriterion("lang =", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangNotEqualTo(String value) {
            addCriterion("lang <>", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangGreaterThan(String value) {
            addCriterion("lang >", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangGreaterThanOrEqualTo(String value) {
            addCriterion("lang >=", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangLessThan(String value) {
            addCriterion("lang <", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangLessThanOrEqualTo(String value) {
            addCriterion("lang <=", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangLike(String value) {
            addCriterion("lang like", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangNotLike(String value) {
            addCriterion("lang not like", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangIn(List<String> values) {
            addCriterion("lang in", values, "lang");
            return (Criteria) this;
        }

        public Criteria andLangNotIn(List<String> values) {
            addCriterion("lang not in", values, "lang");
            return (Criteria) this;
        }

        public Criteria andLangBetween(String value1, String value2) {
            addCriterion("lang between", value1, value2, "lang");
            return (Criteria) this;
        }

        public Criteria andLangNotBetween(String value1, String value2) {
            addCriterion("lang not between", value1, value2, "lang");
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

        public Criteria andBnIsNull() {
            addCriterion("bn is null");
            return (Criteria) this;
        }

        public Criteria andBnIsNotNull() {
            addCriterion("bn is not null");
            return (Criteria) this;
        }

        public Criteria andBnEqualTo(String value) {
            addCriterion("bn =", value, "bn");
            return (Criteria) this;
        }

        public Criteria andBnNotEqualTo(String value) {
            addCriterion("bn <>", value, "bn");
            return (Criteria) this;
        }

        public Criteria andBnGreaterThan(String value) {
            addCriterion("bn >", value, "bn");
            return (Criteria) this;
        }

        public Criteria andBnGreaterThanOrEqualTo(String value) {
            addCriterion("bn >=", value, "bn");
            return (Criteria) this;
        }

        public Criteria andBnLessThan(String value) {
            addCriterion("bn <", value, "bn");
            return (Criteria) this;
        }

        public Criteria andBnLessThanOrEqualTo(String value) {
            addCriterion("bn <=", value, "bn");
            return (Criteria) this;
        }

        public Criteria andBnLike(String value) {
            addCriterion("bn like", value, "bn");
            return (Criteria) this;
        }

        public Criteria andBnNotLike(String value) {
            addCriterion("bn not like", value, "bn");
            return (Criteria) this;
        }

        public Criteria andBnIn(List<String> values) {
            addCriterion("bn in", values, "bn");
            return (Criteria) this;
        }

        public Criteria andBnNotIn(List<String> values) {
            addCriterion("bn not in", values, "bn");
            return (Criteria) this;
        }

        public Criteria andBnBetween(String value1, String value2) {
            addCriterion("bn between", value1, value2, "bn");
            return (Criteria) this;
        }

        public Criteria andBnNotBetween(String value1, String value2) {
            addCriterion("bn not between", value1, value2, "bn");
            return (Criteria) this;
        }

        public Criteria andPortNameIsNull() {
            addCriterion("port_name is null");
            return (Criteria) this;
        }

        public Criteria andPortNameIsNotNull() {
            addCriterion("port_name is not null");
            return (Criteria) this;
        }

        public Criteria andPortNameEqualTo(String value) {
            addCriterion("port_name =", value, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameNotEqualTo(String value) {
            addCriterion("port_name <>", value, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameGreaterThan(String value) {
            addCriterion("port_name >", value, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameGreaterThanOrEqualTo(String value) {
            addCriterion("port_name >=", value, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameLessThan(String value) {
            addCriterion("port_name <", value, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameLessThanOrEqualTo(String value) {
            addCriterion("port_name <=", value, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameLike(String value) {
            addCriterion("port_name like", value, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameNotLike(String value) {
            addCriterion("port_name not like", value, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameIn(List<String> values) {
            addCriterion("port_name in", values, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameNotIn(List<String> values) {
            addCriterion("port_name not in", values, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameBetween(String value1, String value2) {
            addCriterion("port_name between", value1, value2, "portName");
            return (Criteria) this;
        }

        public Criteria andPortNameNotBetween(String value1, String value2) {
            addCriterion("port_name not between", value1, value2, "portName");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNull() {
            addCriterion("name_en is null");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNotNull() {
            addCriterion("name_en is not null");
            return (Criteria) this;
        }

        public Criteria andNameEnEqualTo(String value) {
            addCriterion("name_en =", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotEqualTo(String value) {
            addCriterion("name_en <>", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThan(String value) {
            addCriterion("name_en >", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("name_en >=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThan(String value) {
            addCriterion("name_en <", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThanOrEqualTo(String value) {
            addCriterion("name_en <=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLike(String value) {
            addCriterion("name_en like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotLike(String value) {
            addCriterion("name_en not like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnIn(List<String> values) {
            addCriterion("name_en in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotIn(List<String> values) {
            addCriterion("name_en not in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnBetween(String value1, String value2) {
            addCriterion("name_en between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotBetween(String value1, String value2) {
            addCriterion("name_en not between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andPortTypeIsNull() {
            addCriterion("port_type is null");
            return (Criteria) this;
        }

        public Criteria andPortTypeIsNotNull() {
            addCriterion("port_type is not null");
            return (Criteria) this;
        }

        public Criteria andPortTypeEqualTo(String value) {
            addCriterion("port_type =", value, "portType");
            return (Criteria) this;
        }

        public Criteria andPortTypeNotEqualTo(String value) {
            addCriterion("port_type <>", value, "portType");
            return (Criteria) this;
        }

        public Criteria andPortTypeGreaterThan(String value) {
            addCriterion("port_type >", value, "portType");
            return (Criteria) this;
        }

        public Criteria andPortTypeGreaterThanOrEqualTo(String value) {
            addCriterion("port_type >=", value, "portType");
            return (Criteria) this;
        }

        public Criteria andPortTypeLessThan(String value) {
            addCriterion("port_type <", value, "portType");
            return (Criteria) this;
        }

        public Criteria andPortTypeLessThanOrEqualTo(String value) {
            addCriterion("port_type <=", value, "portType");
            return (Criteria) this;
        }

        public Criteria andPortTypeLike(String value) {
            addCriterion("port_type like", value, "portType");
            return (Criteria) this;
        }

        public Criteria andPortTypeNotLike(String value) {
            addCriterion("port_type not like", value, "portType");
            return (Criteria) this;
        }

        public Criteria andPortTypeIn(List<String> values) {
            addCriterion("port_type in", values, "portType");
            return (Criteria) this;
        }

        public Criteria andPortTypeNotIn(List<String> values) {
            addCriterion("port_type not in", values, "portType");
            return (Criteria) this;
        }

        public Criteria andPortTypeBetween(String value1, String value2) {
            addCriterion("port_type between", value1, value2, "portType");
            return (Criteria) this;
        }

        public Criteria andPortTypeNotBetween(String value1, String value2) {
            addCriterion("port_type not between", value1, value2, "portType");
            return (Criteria) this;
        }

        public Criteria andTransModeIsNull() {
            addCriterion("trans_mode is null");
            return (Criteria) this;
        }

        public Criteria andTransModeIsNotNull() {
            addCriterion("trans_mode is not null");
            return (Criteria) this;
        }

        public Criteria andTransModeEqualTo(String value) {
            addCriterion("trans_mode =", value, "transMode");
            return (Criteria) this;
        }

        public Criteria andTransModeNotEqualTo(String value) {
            addCriterion("trans_mode <>", value, "transMode");
            return (Criteria) this;
        }

        public Criteria andTransModeGreaterThan(String value) {
            addCriterion("trans_mode >", value, "transMode");
            return (Criteria) this;
        }

        public Criteria andTransModeGreaterThanOrEqualTo(String value) {
            addCriterion("trans_mode >=", value, "transMode");
            return (Criteria) this;
        }

        public Criteria andTransModeLessThan(String value) {
            addCriterion("trans_mode <", value, "transMode");
            return (Criteria) this;
        }

        public Criteria andTransModeLessThanOrEqualTo(String value) {
            addCriterion("trans_mode <=", value, "transMode");
            return (Criteria) this;
        }

        public Criteria andTransModeLike(String value) {
            addCriterion("trans_mode like", value, "transMode");
            return (Criteria) this;
        }

        public Criteria andTransModeNotLike(String value) {
            addCriterion("trans_mode not like", value, "transMode");
            return (Criteria) this;
        }

        public Criteria andTransModeIn(List<String> values) {
            addCriterion("trans_mode in", values, "transMode");
            return (Criteria) this;
        }

        public Criteria andTransModeNotIn(List<String> values) {
            addCriterion("trans_mode not in", values, "transMode");
            return (Criteria) this;
        }

        public Criteria andTransModeBetween(String value1, String value2) {
            addCriterion("trans_mode between", value1, value2, "transMode");
            return (Criteria) this;
        }

        public Criteria andTransModeNotBetween(String value1, String value2) {
            addCriterion("trans_mode not between", value1, value2, "transMode");
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

        public Criteria andDeletedFlagIsNull() {
            addCriterion("deleted_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagIsNotNull() {
            addCriterion("deleted_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagEqualTo(String value) {
            addCriterion("deleted_flag =", value, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagNotEqualTo(String value) {
            addCriterion("deleted_flag <>", value, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagGreaterThan(String value) {
            addCriterion("deleted_flag >", value, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagGreaterThanOrEqualTo(String value) {
            addCriterion("deleted_flag >=", value, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagLessThan(String value) {
            addCriterion("deleted_flag <", value, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagLessThanOrEqualTo(String value) {
            addCriterion("deleted_flag <=", value, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagLike(String value) {
            addCriterion("deleted_flag like", value, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagNotLike(String value) {
            addCriterion("deleted_flag not like", value, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagIn(List<String> values) {
            addCriterion("deleted_flag in", values, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagNotIn(List<String> values) {
            addCriterion("deleted_flag not in", values, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagBetween(String value1, String value2) {
            addCriterion("deleted_flag between", value1, value2, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagNotBetween(String value1, String value2) {
            addCriterion("deleted_flag not between", value1, value2, "deletedFlag");
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