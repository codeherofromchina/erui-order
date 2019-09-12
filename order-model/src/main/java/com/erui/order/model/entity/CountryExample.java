package com.erui.order.model.entity;

import java.util.ArrayList;
import java.util.List;

public class CountryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CountryExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
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

        public Criteria andCountryNameIsNull() {
            addCriterion("country_name is null");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNotNull() {
            addCriterion("country_name is not null");
            return (Criteria) this;
        }

        public Criteria andCountryNameEqualTo(String value) {
            addCriterion("country_name =", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotEqualTo(String value) {
            addCriterion("country_name <>", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThan(String value) {
            addCriterion("country_name >", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThanOrEqualTo(String value) {
            addCriterion("country_name >=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThan(String value) {
            addCriterion("country_name <", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThanOrEqualTo(String value) {
            addCriterion("country_name <=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLike(String value) {
            addCriterion("country_name like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotLike(String value) {
            addCriterion("country_name not like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameIn(List<String> values) {
            addCriterion("country_name in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotIn(List<String> values) {
            addCriterion("country_name not in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameBetween(String value1, String value2) {
            addCriterion("country_name between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotBetween(String value1, String value2) {
            addCriterion("country_name not between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andIntTelCodeIsNull() {
            addCriterion("int_tel_code is null");
            return (Criteria) this;
        }

        public Criteria andIntTelCodeIsNotNull() {
            addCriterion("int_tel_code is not null");
            return (Criteria) this;
        }

        public Criteria andIntTelCodeEqualTo(String value) {
            addCriterion("int_tel_code =", value, "intTelCode");
            return (Criteria) this;
        }

        public Criteria andIntTelCodeNotEqualTo(String value) {
            addCriterion("int_tel_code <>", value, "intTelCode");
            return (Criteria) this;
        }

        public Criteria andIntTelCodeGreaterThan(String value) {
            addCriterion("int_tel_code >", value, "intTelCode");
            return (Criteria) this;
        }

        public Criteria andIntTelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("int_tel_code >=", value, "intTelCode");
            return (Criteria) this;
        }

        public Criteria andIntTelCodeLessThan(String value) {
            addCriterion("int_tel_code <", value, "intTelCode");
            return (Criteria) this;
        }

        public Criteria andIntTelCodeLessThanOrEqualTo(String value) {
            addCriterion("int_tel_code <=", value, "intTelCode");
            return (Criteria) this;
        }

        public Criteria andIntTelCodeLike(String value) {
            addCriterion("int_tel_code like", value, "intTelCode");
            return (Criteria) this;
        }

        public Criteria andIntTelCodeNotLike(String value) {
            addCriterion("int_tel_code not like", value, "intTelCode");
            return (Criteria) this;
        }

        public Criteria andIntTelCodeIn(List<String> values) {
            addCriterion("int_tel_code in", values, "intTelCode");
            return (Criteria) this;
        }

        public Criteria andIntTelCodeNotIn(List<String> values) {
            addCriterion("int_tel_code not in", values, "intTelCode");
            return (Criteria) this;
        }

        public Criteria andIntTelCodeBetween(String value1, String value2) {
            addCriterion("int_tel_code between", value1, value2, "intTelCode");
            return (Criteria) this;
        }

        public Criteria andIntTelCodeNotBetween(String value1, String value2) {
            addCriterion("int_tel_code not between", value1, value2, "intTelCode");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIsNull() {
            addCriterion("time_zone is null");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIsNotNull() {
            addCriterion("time_zone is not null");
            return (Criteria) this;
        }

        public Criteria andTimeZoneEqualTo(Long value) {
            addCriterion("time_zone =", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneNotEqualTo(Long value) {
            addCriterion("time_zone <>", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneGreaterThan(Long value) {
            addCriterion("time_zone >", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneGreaterThanOrEqualTo(Long value) {
            addCriterion("time_zone >=", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneLessThan(Long value) {
            addCriterion("time_zone <", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneLessThanOrEqualTo(Long value) {
            addCriterion("time_zone <=", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIn(List<Long> values) {
            addCriterion("time_zone in", values, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneNotIn(List<Long> values) {
            addCriterion("time_zone not in", values, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneBetween(Long value1, Long value2) {
            addCriterion("time_zone between", value1, value2, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneNotBetween(Long value1, Long value2) {
            addCriterion("time_zone not between", value1, value2, "timeZone");
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

        public Criteria andEdiCodeIsNull() {
            addCriterion("edi_code is null");
            return (Criteria) this;
        }

        public Criteria andEdiCodeIsNotNull() {
            addCriterion("edi_code is not null");
            return (Criteria) this;
        }

        public Criteria andEdiCodeEqualTo(String value) {
            addCriterion("edi_code =", value, "ediCode");
            return (Criteria) this;
        }

        public Criteria andEdiCodeNotEqualTo(String value) {
            addCriterion("edi_code <>", value, "ediCode");
            return (Criteria) this;
        }

        public Criteria andEdiCodeGreaterThan(String value) {
            addCriterion("edi_code >", value, "ediCode");
            return (Criteria) this;
        }

        public Criteria andEdiCodeGreaterThanOrEqualTo(String value) {
            addCriterion("edi_code >=", value, "ediCode");
            return (Criteria) this;
        }

        public Criteria andEdiCodeLessThan(String value) {
            addCriterion("edi_code <", value, "ediCode");
            return (Criteria) this;
        }

        public Criteria andEdiCodeLessThanOrEqualTo(String value) {
            addCriterion("edi_code <=", value, "ediCode");
            return (Criteria) this;
        }

        public Criteria andEdiCodeLike(String value) {
            addCriterion("edi_code like", value, "ediCode");
            return (Criteria) this;
        }

        public Criteria andEdiCodeNotLike(String value) {
            addCriterion("edi_code not like", value, "ediCode");
            return (Criteria) this;
        }

        public Criteria andEdiCodeIn(List<String> values) {
            addCriterion("edi_code in", values, "ediCode");
            return (Criteria) this;
        }

        public Criteria andEdiCodeNotIn(List<String> values) {
            addCriterion("edi_code not in", values, "ediCode");
            return (Criteria) this;
        }

        public Criteria andEdiCodeBetween(String value1, String value2) {
            addCriterion("edi_code between", value1, value2, "ediCode");
            return (Criteria) this;
        }

        public Criteria andEdiCodeNotBetween(String value1, String value2) {
            addCriterion("edi_code not between", value1, value2, "ediCode");
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