package com.erui.order.model.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierExample() {
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

        public Criteria andSerialNoIsNull() {
            addCriterion("serial_no is null");
            return (Criteria) this;
        }

        public Criteria andSerialNoIsNotNull() {
            addCriterion("serial_no is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNoEqualTo(String value) {
            addCriterion("serial_no =", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotEqualTo(String value) {
            addCriterion("serial_no <>", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoGreaterThan(String value) {
            addCriterion("serial_no >", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("serial_no >=", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLessThan(String value) {
            addCriterion("serial_no <", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLessThanOrEqualTo(String value) {
            addCriterion("serial_no <=", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLike(String value) {
            addCriterion("serial_no like", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotLike(String value) {
            addCriterion("serial_no not like", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoIn(List<String> values) {
            addCriterion("serial_no in", values, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotIn(List<String> values) {
            addCriterion("serial_no not in", values, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoBetween(String value1, String value2) {
            addCriterion("serial_no between", value1, value2, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotBetween(String value1, String value2) {
            addCriterion("serial_no not between", value1, value2, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoIsNull() {
            addCriterion("supplier_no is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNoIsNotNull() {
            addCriterion("supplier_no is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNoEqualTo(String value) {
            addCriterion("supplier_no =", value, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoNotEqualTo(String value) {
            addCriterion("supplier_no <>", value, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoGreaterThan(String value) {
            addCriterion("supplier_no >", value, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_no >=", value, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoLessThan(String value) {
            addCriterion("supplier_no <", value, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoLessThanOrEqualTo(String value) {
            addCriterion("supplier_no <=", value, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoLike(String value) {
            addCriterion("supplier_no like", value, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoNotLike(String value) {
            addCriterion("supplier_no not like", value, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoIn(List<String> values) {
            addCriterion("supplier_no in", values, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoNotIn(List<String> values) {
            addCriterion("supplier_no not in", values, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoBetween(String value1, String value2) {
            addCriterion("supplier_no between", value1, value2, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierNoNotBetween(String value1, String value2) {
            addCriterion("supplier_no not between", value1, value2, "supplierNo");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeIsNull() {
            addCriterion("supplier_type is null");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeIsNotNull() {
            addCriterion("supplier_type is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeEqualTo(String value) {
            addCriterion("supplier_type =", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotEqualTo(String value) {
            addCriterion("supplier_type <>", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeGreaterThan(String value) {
            addCriterion("supplier_type >", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_type >=", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeLessThan(String value) {
            addCriterion("supplier_type <", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeLessThanOrEqualTo(String value) {
            addCriterion("supplier_type <=", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeLike(String value) {
            addCriterion("supplier_type like", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotLike(String value) {
            addCriterion("supplier_type not like", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeIn(List<String> values) {
            addCriterion("supplier_type in", values, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotIn(List<String> values) {
            addCriterion("supplier_type not in", values, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeBetween(String value1, String value2) {
            addCriterion("supplier_type between", value1, value2, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotBetween(String value1, String value2) {
            addCriterion("supplier_type not between", value1, value2, "supplierType");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andNameEnBnIsNull() {
            addCriterion("name_en_bn is null");
            return (Criteria) this;
        }

        public Criteria andNameEnBnIsNotNull() {
            addCriterion("name_en_bn is not null");
            return (Criteria) this;
        }

        public Criteria andNameEnBnEqualTo(String value) {
            addCriterion("name_en_bn =", value, "nameEnBn");
            return (Criteria) this;
        }

        public Criteria andNameEnBnNotEqualTo(String value) {
            addCriterion("name_en_bn <>", value, "nameEnBn");
            return (Criteria) this;
        }

        public Criteria andNameEnBnGreaterThan(String value) {
            addCriterion("name_en_bn >", value, "nameEnBn");
            return (Criteria) this;
        }

        public Criteria andNameEnBnGreaterThanOrEqualTo(String value) {
            addCriterion("name_en_bn >=", value, "nameEnBn");
            return (Criteria) this;
        }

        public Criteria andNameEnBnLessThan(String value) {
            addCriterion("name_en_bn <", value, "nameEnBn");
            return (Criteria) this;
        }

        public Criteria andNameEnBnLessThanOrEqualTo(String value) {
            addCriterion("name_en_bn <=", value, "nameEnBn");
            return (Criteria) this;
        }

        public Criteria andNameEnBnLike(String value) {
            addCriterion("name_en_bn like", value, "nameEnBn");
            return (Criteria) this;
        }

        public Criteria andNameEnBnNotLike(String value) {
            addCriterion("name_en_bn not like", value, "nameEnBn");
            return (Criteria) this;
        }

        public Criteria andNameEnBnIn(List<String> values) {
            addCriterion("name_en_bn in", values, "nameEnBn");
            return (Criteria) this;
        }

        public Criteria andNameEnBnNotIn(List<String> values) {
            addCriterion("name_en_bn not in", values, "nameEnBn");
            return (Criteria) this;
        }

        public Criteria andNameEnBnBetween(String value1, String value2) {
            addCriterion("name_en_bn between", value1, value2, "nameEnBn");
            return (Criteria) this;
        }

        public Criteria andNameEnBnNotBetween(String value1, String value2) {
            addCriterion("name_en_bn not between", value1, value2, "nameEnBn");
            return (Criteria) this;
        }

        public Criteria andProfileIsNull() {
            addCriterion("profile is null");
            return (Criteria) this;
        }

        public Criteria andProfileIsNotNull() {
            addCriterion("profile is not null");
            return (Criteria) this;
        }

        public Criteria andProfileEqualTo(String value) {
            addCriterion("profile =", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileNotEqualTo(String value) {
            addCriterion("profile <>", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileGreaterThan(String value) {
            addCriterion("profile >", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileGreaterThanOrEqualTo(String value) {
            addCriterion("profile >=", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileLessThan(String value) {
            addCriterion("profile <", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileLessThanOrEqualTo(String value) {
            addCriterion("profile <=", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileLike(String value) {
            addCriterion("profile like", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileNotLike(String value) {
            addCriterion("profile not like", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileIn(List<String> values) {
            addCriterion("profile in", values, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileNotIn(List<String> values) {
            addCriterion("profile not in", values, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileBetween(String value1, String value2) {
            addCriterion("profile between", value1, value2, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileNotBetween(String value1, String value2) {
            addCriterion("profile not between", value1, value2, "profile");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("country_code is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("country_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("country_code =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("country_code <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("country_code >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("country_code >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("country_code <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("country_code <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("country_code like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("country_code not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("country_code in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("country_code not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("country_code between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("country_code not between", value1, value2, "countryCode");
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

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andOfficialEmailIsNull() {
            addCriterion("official_email is null");
            return (Criteria) this;
        }

        public Criteria andOfficialEmailIsNotNull() {
            addCriterion("official_email is not null");
            return (Criteria) this;
        }

        public Criteria andOfficialEmailEqualTo(String value) {
            addCriterion("official_email =", value, "officialEmail");
            return (Criteria) this;
        }

        public Criteria andOfficialEmailNotEqualTo(String value) {
            addCriterion("official_email <>", value, "officialEmail");
            return (Criteria) this;
        }

        public Criteria andOfficialEmailGreaterThan(String value) {
            addCriterion("official_email >", value, "officialEmail");
            return (Criteria) this;
        }

        public Criteria andOfficialEmailGreaterThanOrEqualTo(String value) {
            addCriterion("official_email >=", value, "officialEmail");
            return (Criteria) this;
        }

        public Criteria andOfficialEmailLessThan(String value) {
            addCriterion("official_email <", value, "officialEmail");
            return (Criteria) this;
        }

        public Criteria andOfficialEmailLessThanOrEqualTo(String value) {
            addCriterion("official_email <=", value, "officialEmail");
            return (Criteria) this;
        }

        public Criteria andOfficialEmailLike(String value) {
            addCriterion("official_email like", value, "officialEmail");
            return (Criteria) this;
        }

        public Criteria andOfficialEmailNotLike(String value) {
            addCriterion("official_email not like", value, "officialEmail");
            return (Criteria) this;
        }

        public Criteria andOfficialEmailIn(List<String> values) {
            addCriterion("official_email in", values, "officialEmail");
            return (Criteria) this;
        }

        public Criteria andOfficialEmailNotIn(List<String> values) {
            addCriterion("official_email not in", values, "officialEmail");
            return (Criteria) this;
        }

        public Criteria andOfficialEmailBetween(String value1, String value2) {
            addCriterion("official_email between", value1, value2, "officialEmail");
            return (Criteria) this;
        }

        public Criteria andOfficialEmailNotBetween(String value1, String value2) {
            addCriterion("official_email not between", value1, value2, "officialEmail");
            return (Criteria) this;
        }

        public Criteria andOfficialPhoneIsNull() {
            addCriterion("official_phone is null");
            return (Criteria) this;
        }

        public Criteria andOfficialPhoneIsNotNull() {
            addCriterion("official_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOfficialPhoneEqualTo(String value) {
            addCriterion("official_phone =", value, "officialPhone");
            return (Criteria) this;
        }

        public Criteria andOfficialPhoneNotEqualTo(String value) {
            addCriterion("official_phone <>", value, "officialPhone");
            return (Criteria) this;
        }

        public Criteria andOfficialPhoneGreaterThan(String value) {
            addCriterion("official_phone >", value, "officialPhone");
            return (Criteria) this;
        }

        public Criteria andOfficialPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("official_phone >=", value, "officialPhone");
            return (Criteria) this;
        }

        public Criteria andOfficialPhoneLessThan(String value) {
            addCriterion("official_phone <", value, "officialPhone");
            return (Criteria) this;
        }

        public Criteria andOfficialPhoneLessThanOrEqualTo(String value) {
            addCriterion("official_phone <=", value, "officialPhone");
            return (Criteria) this;
        }

        public Criteria andOfficialPhoneLike(String value) {
            addCriterion("official_phone like", value, "officialPhone");
            return (Criteria) this;
        }

        public Criteria andOfficialPhoneNotLike(String value) {
            addCriterion("official_phone not like", value, "officialPhone");
            return (Criteria) this;
        }

        public Criteria andOfficialPhoneIn(List<String> values) {
            addCriterion("official_phone in", values, "officialPhone");
            return (Criteria) this;
        }

        public Criteria andOfficialPhoneNotIn(List<String> values) {
            addCriterion("official_phone not in", values, "officialPhone");
            return (Criteria) this;
        }

        public Criteria andOfficialPhoneBetween(String value1, String value2) {
            addCriterion("official_phone between", value1, value2, "officialPhone");
            return (Criteria) this;
        }

        public Criteria andOfficialPhoneNotBetween(String value1, String value2) {
            addCriterion("official_phone not between", value1, value2, "officialPhone");
            return (Criteria) this;
        }

        public Criteria andOfficialFaxIsNull() {
            addCriterion("official_fax is null");
            return (Criteria) this;
        }

        public Criteria andOfficialFaxIsNotNull() {
            addCriterion("official_fax is not null");
            return (Criteria) this;
        }

        public Criteria andOfficialFaxEqualTo(String value) {
            addCriterion("official_fax =", value, "officialFax");
            return (Criteria) this;
        }

        public Criteria andOfficialFaxNotEqualTo(String value) {
            addCriterion("official_fax <>", value, "officialFax");
            return (Criteria) this;
        }

        public Criteria andOfficialFaxGreaterThan(String value) {
            addCriterion("official_fax >", value, "officialFax");
            return (Criteria) this;
        }

        public Criteria andOfficialFaxGreaterThanOrEqualTo(String value) {
            addCriterion("official_fax >=", value, "officialFax");
            return (Criteria) this;
        }

        public Criteria andOfficialFaxLessThan(String value) {
            addCriterion("official_fax <", value, "officialFax");
            return (Criteria) this;
        }

        public Criteria andOfficialFaxLessThanOrEqualTo(String value) {
            addCriterion("official_fax <=", value, "officialFax");
            return (Criteria) this;
        }

        public Criteria andOfficialFaxLike(String value) {
            addCriterion("official_fax like", value, "officialFax");
            return (Criteria) this;
        }

        public Criteria andOfficialFaxNotLike(String value) {
            addCriterion("official_fax not like", value, "officialFax");
            return (Criteria) this;
        }

        public Criteria andOfficialFaxIn(List<String> values) {
            addCriterion("official_fax in", values, "officialFax");
            return (Criteria) this;
        }

        public Criteria andOfficialFaxNotIn(List<String> values) {
            addCriterion("official_fax not in", values, "officialFax");
            return (Criteria) this;
        }

        public Criteria andOfficialFaxBetween(String value1, String value2) {
            addCriterion("official_fax between", value1, value2, "officialFax");
            return (Criteria) this;
        }

        public Criteria andOfficialFaxNotBetween(String value1, String value2) {
            addCriterion("official_fax not between", value1, value2, "officialFax");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNull() {
            addCriterion("first_name is null");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNotNull() {
            addCriterion("first_name is not null");
            return (Criteria) this;
        }

        public Criteria andFirstNameEqualTo(String value) {
            addCriterion("first_name =", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotEqualTo(String value) {
            addCriterion("first_name <>", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThan(String value) {
            addCriterion("first_name >", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThanOrEqualTo(String value) {
            addCriterion("first_name >=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThan(String value) {
            addCriterion("first_name <", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThanOrEqualTo(String value) {
            addCriterion("first_name <=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLike(String value) {
            addCriterion("first_name like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotLike(String value) {
            addCriterion("first_name not like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameIn(List<String> values) {
            addCriterion("first_name in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotIn(List<String> values) {
            addCriterion("first_name not in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameBetween(String value1, String value2) {
            addCriterion("first_name between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotBetween(String value1, String value2) {
            addCriterion("first_name not between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andLastNameIsNull() {
            addCriterion("last_name is null");
            return (Criteria) this;
        }

        public Criteria andLastNameIsNotNull() {
            addCriterion("last_name is not null");
            return (Criteria) this;
        }

        public Criteria andLastNameEqualTo(String value) {
            addCriterion("last_name =", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotEqualTo(String value) {
            addCriterion("last_name <>", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameGreaterThan(String value) {
            addCriterion("last_name >", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameGreaterThanOrEqualTo(String value) {
            addCriterion("last_name >=", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLessThan(String value) {
            addCriterion("last_name <", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLessThanOrEqualTo(String value) {
            addCriterion("last_name <=", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLike(String value) {
            addCriterion("last_name like", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotLike(String value) {
            addCriterion("last_name not like", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameIn(List<String> values) {
            addCriterion("last_name in", values, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotIn(List<String> values) {
            addCriterion("last_name not in", values, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameBetween(String value1, String value2) {
            addCriterion("last_name between", value1, value2, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotBetween(String value1, String value2) {
            addCriterion("last_name not between", value1, value2, "lastName");
            return (Criteria) this;
        }

        public Criteria andRegCapitalIsNull() {
            addCriterion("reg_capital is null");
            return (Criteria) this;
        }

        public Criteria andRegCapitalIsNotNull() {
            addCriterion("reg_capital is not null");
            return (Criteria) this;
        }

        public Criteria andRegCapitalEqualTo(String value) {
            addCriterion("reg_capital =", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalNotEqualTo(String value) {
            addCriterion("reg_capital <>", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalGreaterThan(String value) {
            addCriterion("reg_capital >", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("reg_capital >=", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalLessThan(String value) {
            addCriterion("reg_capital <", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalLessThanOrEqualTo(String value) {
            addCriterion("reg_capital <=", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalLike(String value) {
            addCriterion("reg_capital like", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalNotLike(String value) {
            addCriterion("reg_capital not like", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalIn(List<String> values) {
            addCriterion("reg_capital in", values, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalNotIn(List<String> values) {
            addCriterion("reg_capital not in", values, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalBetween(String value1, String value2) {
            addCriterion("reg_capital between", value1, value2, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalNotBetween(String value1, String value2) {
            addCriterion("reg_capital not between", value1, value2, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurBnIsNull() {
            addCriterion("reg_capital_cur_bn is null");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurBnIsNotNull() {
            addCriterion("reg_capital_cur_bn is not null");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurBnEqualTo(String value) {
            addCriterion("reg_capital_cur_bn =", value, "regCapitalCurBn");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurBnNotEqualTo(String value) {
            addCriterion("reg_capital_cur_bn <>", value, "regCapitalCurBn");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurBnGreaterThan(String value) {
            addCriterion("reg_capital_cur_bn >", value, "regCapitalCurBn");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurBnGreaterThanOrEqualTo(String value) {
            addCriterion("reg_capital_cur_bn >=", value, "regCapitalCurBn");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurBnLessThan(String value) {
            addCriterion("reg_capital_cur_bn <", value, "regCapitalCurBn");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurBnLessThanOrEqualTo(String value) {
            addCriterion("reg_capital_cur_bn <=", value, "regCapitalCurBn");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurBnLike(String value) {
            addCriterion("reg_capital_cur_bn like", value, "regCapitalCurBn");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurBnNotLike(String value) {
            addCriterion("reg_capital_cur_bn not like", value, "regCapitalCurBn");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurBnIn(List<String> values) {
            addCriterion("reg_capital_cur_bn in", values, "regCapitalCurBn");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurBnNotIn(List<String> values) {
            addCriterion("reg_capital_cur_bn not in", values, "regCapitalCurBn");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurBnBetween(String value1, String value2) {
            addCriterion("reg_capital_cur_bn between", value1, value2, "regCapitalCurBn");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurBnNotBetween(String value1, String value2) {
            addCriterion("reg_capital_cur_bn not between", value1, value2, "regCapitalCurBn");
            return (Criteria) this;
        }

        public Criteria andEmployeeCountIsNull() {
            addCriterion("employee_count is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeCountIsNotNull() {
            addCriterion("employee_count is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeCountEqualTo(Long value) {
            addCriterion("employee_count =", value, "employeeCount");
            return (Criteria) this;
        }

        public Criteria andEmployeeCountNotEqualTo(Long value) {
            addCriterion("employee_count <>", value, "employeeCount");
            return (Criteria) this;
        }

        public Criteria andEmployeeCountGreaterThan(Long value) {
            addCriterion("employee_count >", value, "employeeCount");
            return (Criteria) this;
        }

        public Criteria andEmployeeCountGreaterThanOrEqualTo(Long value) {
            addCriterion("employee_count >=", value, "employeeCount");
            return (Criteria) this;
        }

        public Criteria andEmployeeCountLessThan(Long value) {
            addCriterion("employee_count <", value, "employeeCount");
            return (Criteria) this;
        }

        public Criteria andEmployeeCountLessThanOrEqualTo(Long value) {
            addCriterion("employee_count <=", value, "employeeCount");
            return (Criteria) this;
        }

        public Criteria andEmployeeCountIn(List<Long> values) {
            addCriterion("employee_count in", values, "employeeCount");
            return (Criteria) this;
        }

        public Criteria andEmployeeCountNotIn(List<Long> values) {
            addCriterion("employee_count not in", values, "employeeCount");
            return (Criteria) this;
        }

        public Criteria andEmployeeCountBetween(Long value1, Long value2) {
            addCriterion("employee_count between", value1, value2, "employeeCount");
            return (Criteria) this;
        }

        public Criteria andEmployeeCountNotBetween(Long value1, Long value2) {
            addCriterion("employee_count not between", value1, value2, "employeeCount");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeIsNull() {
            addCriterion("social_credit_code is null");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeIsNotNull() {
            addCriterion("social_credit_code is not null");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeEqualTo(String value) {
            addCriterion("social_credit_code =", value, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeNotEqualTo(String value) {
            addCriterion("social_credit_code <>", value, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeGreaterThan(String value) {
            addCriterion("social_credit_code >", value, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeGreaterThanOrEqualTo(String value) {
            addCriterion("social_credit_code >=", value, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeLessThan(String value) {
            addCriterion("social_credit_code <", value, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeLessThanOrEqualTo(String value) {
            addCriterion("social_credit_code <=", value, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeLike(String value) {
            addCriterion("social_credit_code like", value, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeNotLike(String value) {
            addCriterion("social_credit_code not like", value, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeIn(List<String> values) {
            addCriterion("social_credit_code in", values, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeNotIn(List<String> values) {
            addCriterion("social_credit_code not in", values, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeBetween(String value1, String value2) {
            addCriterion("social_credit_code between", value1, value2, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeNotBetween(String value1, String value2) {
            addCriterion("social_credit_code not between", value1, value2, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditExpireTimeIsNull() {
            addCriterion("social_credit_expire_time is null");
            return (Criteria) this;
        }

        public Criteria andSocialCreditExpireTimeIsNotNull() {
            addCriterion("social_credit_expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andSocialCreditExpireTimeEqualTo(Date value) {
            addCriterion("social_credit_expire_time =", value, "socialCreditExpireTime");
            return (Criteria) this;
        }

        public Criteria andSocialCreditExpireTimeNotEqualTo(Date value) {
            addCriterion("social_credit_expire_time <>", value, "socialCreditExpireTime");
            return (Criteria) this;
        }

        public Criteria andSocialCreditExpireTimeGreaterThan(Date value) {
            addCriterion("social_credit_expire_time >", value, "socialCreditExpireTime");
            return (Criteria) this;
        }

        public Criteria andSocialCreditExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("social_credit_expire_time >=", value, "socialCreditExpireTime");
            return (Criteria) this;
        }

        public Criteria andSocialCreditExpireTimeLessThan(Date value) {
            addCriterion("social_credit_expire_time <", value, "socialCreditExpireTime");
            return (Criteria) this;
        }

        public Criteria andSocialCreditExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("social_credit_expire_time <=", value, "socialCreditExpireTime");
            return (Criteria) this;
        }

        public Criteria andSocialCreditExpireTimeIn(List<Date> values) {
            addCriterion("social_credit_expire_time in", values, "socialCreditExpireTime");
            return (Criteria) this;
        }

        public Criteria andSocialCreditExpireTimeNotIn(List<Date> values) {
            addCriterion("social_credit_expire_time not in", values, "socialCreditExpireTime");
            return (Criteria) this;
        }

        public Criteria andSocialCreditExpireTimeBetween(Date value1, Date value2) {
            addCriterion("social_credit_expire_time between", value1, value2, "socialCreditExpireTime");
            return (Criteria) this;
        }

        public Criteria andSocialCreditExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("social_credit_expire_time not between", value1, value2, "socialCreditExpireTime");
            return (Criteria) this;
        }

        public Criteria andSocialCreditNoExpireIsNull() {
            addCriterion("social_credit_no_expire is null");
            return (Criteria) this;
        }

        public Criteria andSocialCreditNoExpireIsNotNull() {
            addCriterion("social_credit_no_expire is not null");
            return (Criteria) this;
        }

        public Criteria andSocialCreditNoExpireEqualTo(String value) {
            addCriterion("social_credit_no_expire =", value, "socialCreditNoExpire");
            return (Criteria) this;
        }

        public Criteria andSocialCreditNoExpireNotEqualTo(String value) {
            addCriterion("social_credit_no_expire <>", value, "socialCreditNoExpire");
            return (Criteria) this;
        }

        public Criteria andSocialCreditNoExpireGreaterThan(String value) {
            addCriterion("social_credit_no_expire >", value, "socialCreditNoExpire");
            return (Criteria) this;
        }

        public Criteria andSocialCreditNoExpireGreaterThanOrEqualTo(String value) {
            addCriterion("social_credit_no_expire >=", value, "socialCreditNoExpire");
            return (Criteria) this;
        }

        public Criteria andSocialCreditNoExpireLessThan(String value) {
            addCriterion("social_credit_no_expire <", value, "socialCreditNoExpire");
            return (Criteria) this;
        }

        public Criteria andSocialCreditNoExpireLessThanOrEqualTo(String value) {
            addCriterion("social_credit_no_expire <=", value, "socialCreditNoExpire");
            return (Criteria) this;
        }

        public Criteria andSocialCreditNoExpireLike(String value) {
            addCriterion("social_credit_no_expire like", value, "socialCreditNoExpire");
            return (Criteria) this;
        }

        public Criteria andSocialCreditNoExpireNotLike(String value) {
            addCriterion("social_credit_no_expire not like", value, "socialCreditNoExpire");
            return (Criteria) this;
        }

        public Criteria andSocialCreditNoExpireIn(List<String> values) {
            addCriterion("social_credit_no_expire in", values, "socialCreditNoExpire");
            return (Criteria) this;
        }

        public Criteria andSocialCreditNoExpireNotIn(List<String> values) {
            addCriterion("social_credit_no_expire not in", values, "socialCreditNoExpire");
            return (Criteria) this;
        }

        public Criteria andSocialCreditNoExpireBetween(String value1, String value2) {
            addCriterion("social_credit_no_expire between", value1, value2, "socialCreditNoExpire");
            return (Criteria) this;
        }

        public Criteria andSocialCreditNoExpireNotBetween(String value1, String value2) {
            addCriterion("social_credit_no_expire not between", value1, value2, "socialCreditNoExpire");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIsNull() {
            addCriterion("legal_representative is null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIsNotNull() {
            addCriterion("legal_representative is not null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeEqualTo(String value) {
            addCriterion("legal_representative =", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotEqualTo(String value) {
            addCriterion("legal_representative <>", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeGreaterThan(String value) {
            addCriterion("legal_representative >", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeGreaterThanOrEqualTo(String value) {
            addCriterion("legal_representative >=", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeLessThan(String value) {
            addCriterion("legal_representative <", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeLessThanOrEqualTo(String value) {
            addCriterion("legal_representative <=", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeLike(String value) {
            addCriterion("legal_representative like", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotLike(String value) {
            addCriterion("legal_representative not like", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIn(List<String> values) {
            addCriterion("legal_representative in", values, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotIn(List<String> values) {
            addCriterion("legal_representative not in", values, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeBetween(String value1, String value2) {
            addCriterion("legal_representative between", value1, value2, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotBetween(String value1, String value2) {
            addCriterion("legal_representative not between", value1, value2, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCodeIsNull() {
            addCriterion("legal_representative_code is null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCodeIsNotNull() {
            addCriterion("legal_representative_code is not null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCodeEqualTo(String value) {
            addCriterion("legal_representative_code =", value, "legalRepresentativeCode");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCodeNotEqualTo(String value) {
            addCriterion("legal_representative_code <>", value, "legalRepresentativeCode");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCodeGreaterThan(String value) {
            addCriterion("legal_representative_code >", value, "legalRepresentativeCode");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("legal_representative_code >=", value, "legalRepresentativeCode");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCodeLessThan(String value) {
            addCriterion("legal_representative_code <", value, "legalRepresentativeCode");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCodeLessThanOrEqualTo(String value) {
            addCriterion("legal_representative_code <=", value, "legalRepresentativeCode");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCodeLike(String value) {
            addCriterion("legal_representative_code like", value, "legalRepresentativeCode");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCodeNotLike(String value) {
            addCriterion("legal_representative_code not like", value, "legalRepresentativeCode");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCodeIn(List<String> values) {
            addCriterion("legal_representative_code in", values, "legalRepresentativeCode");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCodeNotIn(List<String> values) {
            addCriterion("legal_representative_code not in", values, "legalRepresentativeCode");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCodeBetween(String value1, String value2) {
            addCriterion("legal_representative_code between", value1, value2, "legalRepresentativeCode");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCodeNotBetween(String value1, String value2) {
            addCriterion("legal_representative_code not between", value1, value2, "legalRepresentativeCode");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeTypeIsNull() {
            addCriterion("legal_representative_type is null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeTypeIsNotNull() {
            addCriterion("legal_representative_type is not null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeTypeEqualTo(String value) {
            addCriterion("legal_representative_type =", value, "legalRepresentativeType");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeTypeNotEqualTo(String value) {
            addCriterion("legal_representative_type <>", value, "legalRepresentativeType");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeTypeGreaterThan(String value) {
            addCriterion("legal_representative_type >", value, "legalRepresentativeType");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("legal_representative_type >=", value, "legalRepresentativeType");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeTypeLessThan(String value) {
            addCriterion("legal_representative_type <", value, "legalRepresentativeType");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeTypeLessThanOrEqualTo(String value) {
            addCriterion("legal_representative_type <=", value, "legalRepresentativeType");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeTypeLike(String value) {
            addCriterion("legal_representative_type like", value, "legalRepresentativeType");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeTypeNotLike(String value) {
            addCriterion("legal_representative_type not like", value, "legalRepresentativeType");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeTypeIn(List<String> values) {
            addCriterion("legal_representative_type in", values, "legalRepresentativeType");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeTypeNotIn(List<String> values) {
            addCriterion("legal_representative_type not in", values, "legalRepresentativeType");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeTypeBetween(String value1, String value2) {
            addCriterion("legal_representative_type between", value1, value2, "legalRepresentativeType");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeTypeNotBetween(String value1, String value2) {
            addCriterion("legal_representative_type not between", value1, value2, "legalRepresentativeType");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeExpireTimeIsNull() {
            addCriterion("legal_representative_expire_time is null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeExpireTimeIsNotNull() {
            addCriterion("legal_representative_expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeExpireTimeEqualTo(Date value) {
            addCriterion("legal_representative_expire_time =", value, "legalRepresentativeExpireTime");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeExpireTimeNotEqualTo(Date value) {
            addCriterion("legal_representative_expire_time <>", value, "legalRepresentativeExpireTime");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeExpireTimeGreaterThan(Date value) {
            addCriterion("legal_representative_expire_time >", value, "legalRepresentativeExpireTime");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("legal_representative_expire_time >=", value, "legalRepresentativeExpireTime");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeExpireTimeLessThan(Date value) {
            addCriterion("legal_representative_expire_time <", value, "legalRepresentativeExpireTime");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("legal_representative_expire_time <=", value, "legalRepresentativeExpireTime");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeExpireTimeIn(List<Date> values) {
            addCriterion("legal_representative_expire_time in", values, "legalRepresentativeExpireTime");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeExpireTimeNotIn(List<Date> values) {
            addCriterion("legal_representative_expire_time not in", values, "legalRepresentativeExpireTime");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeExpireTimeBetween(Date value1, Date value2) {
            addCriterion("legal_representative_expire_time between", value1, value2, "legalRepresentativeExpireTime");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("legal_representative_expire_time not between", value1, value2, "legalRepresentativeExpireTime");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNoExpireIsNull() {
            addCriterion("legal_representative_no_expire is null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNoExpireIsNotNull() {
            addCriterion("legal_representative_no_expire is not null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNoExpireEqualTo(String value) {
            addCriterion("legal_representative_no_expire =", value, "legalRepresentativeNoExpire");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNoExpireNotEqualTo(String value) {
            addCriterion("legal_representative_no_expire <>", value, "legalRepresentativeNoExpire");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNoExpireGreaterThan(String value) {
            addCriterion("legal_representative_no_expire >", value, "legalRepresentativeNoExpire");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNoExpireGreaterThanOrEqualTo(String value) {
            addCriterion("legal_representative_no_expire >=", value, "legalRepresentativeNoExpire");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNoExpireLessThan(String value) {
            addCriterion("legal_representative_no_expire <", value, "legalRepresentativeNoExpire");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNoExpireLessThanOrEqualTo(String value) {
            addCriterion("legal_representative_no_expire <=", value, "legalRepresentativeNoExpire");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNoExpireLike(String value) {
            addCriterion("legal_representative_no_expire like", value, "legalRepresentativeNoExpire");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNoExpireNotLike(String value) {
            addCriterion("legal_representative_no_expire not like", value, "legalRepresentativeNoExpire");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNoExpireIn(List<String> values) {
            addCriterion("legal_representative_no_expire in", values, "legalRepresentativeNoExpire");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNoExpireNotIn(List<String> values) {
            addCriterion("legal_representative_no_expire not in", values, "legalRepresentativeNoExpire");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNoExpireBetween(String value1, String value2) {
            addCriterion("legal_representative_no_expire between", value1, value2, "legalRepresentativeNoExpire");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNoExpireNotBetween(String value1, String value2) {
            addCriterion("legal_representative_no_expire not between", value1, value2, "legalRepresentativeNoExpire");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationIsNull() {
            addCriterion("industry_classification is null");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationIsNotNull() {
            addCriterion("industry_classification is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationEqualTo(String value) {
            addCriterion("industry_classification =", value, "industryClassification");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationNotEqualTo(String value) {
            addCriterion("industry_classification <>", value, "industryClassification");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationGreaterThan(String value) {
            addCriterion("industry_classification >", value, "industryClassification");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationGreaterThanOrEqualTo(String value) {
            addCriterion("industry_classification >=", value, "industryClassification");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationLessThan(String value) {
            addCriterion("industry_classification <", value, "industryClassification");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationLessThanOrEqualTo(String value) {
            addCriterion("industry_classification <=", value, "industryClassification");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationLike(String value) {
            addCriterion("industry_classification like", value, "industryClassification");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationNotLike(String value) {
            addCriterion("industry_classification not like", value, "industryClassification");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationIn(List<String> values) {
            addCriterion("industry_classification in", values, "industryClassification");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationNotIn(List<String> values) {
            addCriterion("industry_classification not in", values, "industryClassification");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationBetween(String value1, String value2) {
            addCriterion("industry_classification between", value1, value2, "industryClassification");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationNotBetween(String value1, String value2) {
            addCriterion("industry_classification not between", value1, value2, "industryClassification");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationIsNull() {
            addCriterion("scope_of_operation is null");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationIsNotNull() {
            addCriterion("scope_of_operation is not null");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationEqualTo(String value) {
            addCriterion("scope_of_operation =", value, "scopeOfOperation");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationNotEqualTo(String value) {
            addCriterion("scope_of_operation <>", value, "scopeOfOperation");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationGreaterThan(String value) {
            addCriterion("scope_of_operation >", value, "scopeOfOperation");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationGreaterThanOrEqualTo(String value) {
            addCriterion("scope_of_operation >=", value, "scopeOfOperation");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationLessThan(String value) {
            addCriterion("scope_of_operation <", value, "scopeOfOperation");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationLessThanOrEqualTo(String value) {
            addCriterion("scope_of_operation <=", value, "scopeOfOperation");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationLike(String value) {
            addCriterion("scope_of_operation like", value, "scopeOfOperation");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationNotLike(String value) {
            addCriterion("scope_of_operation not like", value, "scopeOfOperation");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationIn(List<String> values) {
            addCriterion("scope_of_operation in", values, "scopeOfOperation");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationNotIn(List<String> values) {
            addCriterion("scope_of_operation not in", values, "scopeOfOperation");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationBetween(String value1, String value2) {
            addCriterion("scope_of_operation between", value1, value2, "scopeOfOperation");
            return (Criteria) this;
        }

        public Criteria andScopeOfOperationNotBetween(String value1, String value2) {
            addCriterion("scope_of_operation not between", value1, value2, "scopeOfOperation");
            return (Criteria) this;
        }

        public Criteria andOfficialWebsiteIsNull() {
            addCriterion("official_website is null");
            return (Criteria) this;
        }

        public Criteria andOfficialWebsiteIsNotNull() {
            addCriterion("official_website is not null");
            return (Criteria) this;
        }

        public Criteria andOfficialWebsiteEqualTo(String value) {
            addCriterion("official_website =", value, "officialWebsite");
            return (Criteria) this;
        }

        public Criteria andOfficialWebsiteNotEqualTo(String value) {
            addCriterion("official_website <>", value, "officialWebsite");
            return (Criteria) this;
        }

        public Criteria andOfficialWebsiteGreaterThan(String value) {
            addCriterion("official_website >", value, "officialWebsite");
            return (Criteria) this;
        }

        public Criteria andOfficialWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("official_website >=", value, "officialWebsite");
            return (Criteria) this;
        }

        public Criteria andOfficialWebsiteLessThan(String value) {
            addCriterion("official_website <", value, "officialWebsite");
            return (Criteria) this;
        }

        public Criteria andOfficialWebsiteLessThanOrEqualTo(String value) {
            addCriterion("official_website <=", value, "officialWebsite");
            return (Criteria) this;
        }

        public Criteria andOfficialWebsiteLike(String value) {
            addCriterion("official_website like", value, "officialWebsite");
            return (Criteria) this;
        }

        public Criteria andOfficialWebsiteNotLike(String value) {
            addCriterion("official_website not like", value, "officialWebsite");
            return (Criteria) this;
        }

        public Criteria andOfficialWebsiteIn(List<String> values) {
            addCriterion("official_website in", values, "officialWebsite");
            return (Criteria) this;
        }

        public Criteria andOfficialWebsiteNotIn(List<String> values) {
            addCriterion("official_website not in", values, "officialWebsite");
            return (Criteria) this;
        }

        public Criteria andOfficialWebsiteBetween(String value1, String value2) {
            addCriterion("official_website between", value1, value2, "officialWebsite");
            return (Criteria) this;
        }

        public Criteria andOfficialWebsiteNotBetween(String value1, String value2) {
            addCriterion("official_website not between", value1, value2, "officialWebsite");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andSecExListedOnIsNull() {
            addCriterion("sec_ex_listed_on is null");
            return (Criteria) this;
        }

        public Criteria andSecExListedOnIsNotNull() {
            addCriterion("sec_ex_listed_on is not null");
            return (Criteria) this;
        }

        public Criteria andSecExListedOnEqualTo(String value) {
            addCriterion("sec_ex_listed_on =", value, "secExListedOn");
            return (Criteria) this;
        }

        public Criteria andSecExListedOnNotEqualTo(String value) {
            addCriterion("sec_ex_listed_on <>", value, "secExListedOn");
            return (Criteria) this;
        }

        public Criteria andSecExListedOnGreaterThan(String value) {
            addCriterion("sec_ex_listed_on >", value, "secExListedOn");
            return (Criteria) this;
        }

        public Criteria andSecExListedOnGreaterThanOrEqualTo(String value) {
            addCriterion("sec_ex_listed_on >=", value, "secExListedOn");
            return (Criteria) this;
        }

        public Criteria andSecExListedOnLessThan(String value) {
            addCriterion("sec_ex_listed_on <", value, "secExListedOn");
            return (Criteria) this;
        }

        public Criteria andSecExListedOnLessThanOrEqualTo(String value) {
            addCriterion("sec_ex_listed_on <=", value, "secExListedOn");
            return (Criteria) this;
        }

        public Criteria andSecExListedOnLike(String value) {
            addCriterion("sec_ex_listed_on like", value, "secExListedOn");
            return (Criteria) this;
        }

        public Criteria andSecExListedOnNotLike(String value) {
            addCriterion("sec_ex_listed_on not like", value, "secExListedOn");
            return (Criteria) this;
        }

        public Criteria andSecExListedOnIn(List<String> values) {
            addCriterion("sec_ex_listed_on in", values, "secExListedOn");
            return (Criteria) this;
        }

        public Criteria andSecExListedOnNotIn(List<String> values) {
            addCriterion("sec_ex_listed_on not in", values, "secExListedOn");
            return (Criteria) this;
        }

        public Criteria andSecExListedOnBetween(String value1, String value2) {
            addCriterion("sec_ex_listed_on between", value1, value2, "secExListedOn");
            return (Criteria) this;
        }

        public Criteria andSecExListedOnNotBetween(String value1, String value2) {
            addCriterion("sec_ex_listed_on not between", value1, value2, "secExListedOn");
            return (Criteria) this;
        }

        public Criteria andLineOfCreditIsNull() {
            addCriterion("line_of_credit is null");
            return (Criteria) this;
        }

        public Criteria andLineOfCreditIsNotNull() {
            addCriterion("line_of_credit is not null");
            return (Criteria) this;
        }

        public Criteria andLineOfCreditEqualTo(BigDecimal value) {
            addCriterion("line_of_credit =", value, "lineOfCredit");
            return (Criteria) this;
        }

        public Criteria andLineOfCreditNotEqualTo(BigDecimal value) {
            addCriterion("line_of_credit <>", value, "lineOfCredit");
            return (Criteria) this;
        }

        public Criteria andLineOfCreditGreaterThan(BigDecimal value) {
            addCriterion("line_of_credit >", value, "lineOfCredit");
            return (Criteria) this;
        }

        public Criteria andLineOfCreditGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("line_of_credit >=", value, "lineOfCredit");
            return (Criteria) this;
        }

        public Criteria andLineOfCreditLessThan(BigDecimal value) {
            addCriterion("line_of_credit <", value, "lineOfCredit");
            return (Criteria) this;
        }

        public Criteria andLineOfCreditLessThanOrEqualTo(BigDecimal value) {
            addCriterion("line_of_credit <=", value, "lineOfCredit");
            return (Criteria) this;
        }

        public Criteria andLineOfCreditIn(List<BigDecimal> values) {
            addCriterion("line_of_credit in", values, "lineOfCredit");
            return (Criteria) this;
        }

        public Criteria andLineOfCreditNotIn(List<BigDecimal> values) {
            addCriterion("line_of_credit not in", values, "lineOfCredit");
            return (Criteria) this;
        }

        public Criteria andLineOfCreditBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("line_of_credit between", value1, value2, "lineOfCredit");
            return (Criteria) this;
        }

        public Criteria andLineOfCreditNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("line_of_credit not between", value1, value2, "lineOfCredit");
            return (Criteria) this;
        }

        public Criteria andCreditAvailableIsNull() {
            addCriterion("credit_available is null");
            return (Criteria) this;
        }

        public Criteria andCreditAvailableIsNotNull() {
            addCriterion("credit_available is not null");
            return (Criteria) this;
        }

        public Criteria andCreditAvailableEqualTo(BigDecimal value) {
            addCriterion("credit_available =", value, "creditAvailable");
            return (Criteria) this;
        }

        public Criteria andCreditAvailableNotEqualTo(BigDecimal value) {
            addCriterion("credit_available <>", value, "creditAvailable");
            return (Criteria) this;
        }

        public Criteria andCreditAvailableGreaterThan(BigDecimal value) {
            addCriterion("credit_available >", value, "creditAvailable");
            return (Criteria) this;
        }

        public Criteria andCreditAvailableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_available >=", value, "creditAvailable");
            return (Criteria) this;
        }

        public Criteria andCreditAvailableLessThan(BigDecimal value) {
            addCriterion("credit_available <", value, "creditAvailable");
            return (Criteria) this;
        }

        public Criteria andCreditAvailableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_available <=", value, "creditAvailable");
            return (Criteria) this;
        }

        public Criteria andCreditAvailableIn(List<BigDecimal> values) {
            addCriterion("credit_available in", values, "creditAvailable");
            return (Criteria) this;
        }

        public Criteria andCreditAvailableNotIn(List<BigDecimal> values) {
            addCriterion("credit_available not in", values, "creditAvailable");
            return (Criteria) this;
        }

        public Criteria andCreditAvailableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_available between", value1, value2, "creditAvailable");
            return (Criteria) this;
        }

        public Criteria andCreditAvailableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_available not between", value1, value2, "creditAvailable");
            return (Criteria) this;
        }

        public Criteria andCreditCurBnIsNull() {
            addCriterion("credit_cur_bn is null");
            return (Criteria) this;
        }

        public Criteria andCreditCurBnIsNotNull() {
            addCriterion("credit_cur_bn is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCurBnEqualTo(String value) {
            addCriterion("credit_cur_bn =", value, "creditCurBn");
            return (Criteria) this;
        }

        public Criteria andCreditCurBnNotEqualTo(String value) {
            addCriterion("credit_cur_bn <>", value, "creditCurBn");
            return (Criteria) this;
        }

        public Criteria andCreditCurBnGreaterThan(String value) {
            addCriterion("credit_cur_bn >", value, "creditCurBn");
            return (Criteria) this;
        }

        public Criteria andCreditCurBnGreaterThanOrEqualTo(String value) {
            addCriterion("credit_cur_bn >=", value, "creditCurBn");
            return (Criteria) this;
        }

        public Criteria andCreditCurBnLessThan(String value) {
            addCriterion("credit_cur_bn <", value, "creditCurBn");
            return (Criteria) this;
        }

        public Criteria andCreditCurBnLessThanOrEqualTo(String value) {
            addCriterion("credit_cur_bn <=", value, "creditCurBn");
            return (Criteria) this;
        }

        public Criteria andCreditCurBnLike(String value) {
            addCriterion("credit_cur_bn like", value, "creditCurBn");
            return (Criteria) this;
        }

        public Criteria andCreditCurBnNotLike(String value) {
            addCriterion("credit_cur_bn not like", value, "creditCurBn");
            return (Criteria) this;
        }

        public Criteria andCreditCurBnIn(List<String> values) {
            addCriterion("credit_cur_bn in", values, "creditCurBn");
            return (Criteria) this;
        }

        public Criteria andCreditCurBnNotIn(List<String> values) {
            addCriterion("credit_cur_bn not in", values, "creditCurBn");
            return (Criteria) this;
        }

        public Criteria andCreditCurBnBetween(String value1, String value2) {
            addCriterion("credit_cur_bn between", value1, value2, "creditCurBn");
            return (Criteria) this;
        }

        public Criteria andCreditCurBnNotBetween(String value1, String value2) {
            addCriterion("credit_cur_bn not between", value1, value2, "creditCurBn");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelIsNull() {
            addCriterion("supplier_level is null");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelIsNotNull() {
            addCriterion("supplier_level is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelEqualTo(String value) {
            addCriterion("supplier_level =", value, "supplierLevel");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelNotEqualTo(String value) {
            addCriterion("supplier_level <>", value, "supplierLevel");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelGreaterThan(String value) {
            addCriterion("supplier_level >", value, "supplierLevel");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_level >=", value, "supplierLevel");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelLessThan(String value) {
            addCriterion("supplier_level <", value, "supplierLevel");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelLessThanOrEqualTo(String value) {
            addCriterion("supplier_level <=", value, "supplierLevel");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelLike(String value) {
            addCriterion("supplier_level like", value, "supplierLevel");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelNotLike(String value) {
            addCriterion("supplier_level not like", value, "supplierLevel");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelIn(List<String> values) {
            addCriterion("supplier_level in", values, "supplierLevel");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelNotIn(List<String> values) {
            addCriterion("supplier_level not in", values, "supplierLevel");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelBetween(String value1, String value2) {
            addCriterion("supplier_level between", value1, value2, "supplierLevel");
            return (Criteria) this;
        }

        public Criteria andSupplierLevelNotBetween(String value1, String value2) {
            addCriterion("supplier_level not between", value1, value2, "supplierLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIsNull() {
            addCriterion("credit_level is null");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIsNotNull() {
            addCriterion("credit_level is not null");
            return (Criteria) this;
        }

        public Criteria andCreditLevelEqualTo(String value) {
            addCriterion("credit_level =", value, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelNotEqualTo(String value) {
            addCriterion("credit_level <>", value, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelGreaterThan(String value) {
            addCriterion("credit_level >", value, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelGreaterThanOrEqualTo(String value) {
            addCriterion("credit_level >=", value, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelLessThan(String value) {
            addCriterion("credit_level <", value, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelLessThanOrEqualTo(String value) {
            addCriterion("credit_level <=", value, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelLike(String value) {
            addCriterion("credit_level like", value, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelNotLike(String value) {
            addCriterion("credit_level not like", value, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIn(List<String> values) {
            addCriterion("credit_level in", values, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelNotIn(List<String> values) {
            addCriterion("credit_level not in", values, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelBetween(String value1, String value2) {
            addCriterion("credit_level between", value1, value2, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelNotBetween(String value1, String value2) {
            addCriterion("credit_level not between", value1, value2, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andFinanceLevelIsNull() {
            addCriterion("finance_level is null");
            return (Criteria) this;
        }

        public Criteria andFinanceLevelIsNotNull() {
            addCriterion("finance_level is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceLevelEqualTo(String value) {
            addCriterion("finance_level =", value, "financeLevel");
            return (Criteria) this;
        }

        public Criteria andFinanceLevelNotEqualTo(String value) {
            addCriterion("finance_level <>", value, "financeLevel");
            return (Criteria) this;
        }

        public Criteria andFinanceLevelGreaterThan(String value) {
            addCriterion("finance_level >", value, "financeLevel");
            return (Criteria) this;
        }

        public Criteria andFinanceLevelGreaterThanOrEqualTo(String value) {
            addCriterion("finance_level >=", value, "financeLevel");
            return (Criteria) this;
        }

        public Criteria andFinanceLevelLessThan(String value) {
            addCriterion("finance_level <", value, "financeLevel");
            return (Criteria) this;
        }

        public Criteria andFinanceLevelLessThanOrEqualTo(String value) {
            addCriterion("finance_level <=", value, "financeLevel");
            return (Criteria) this;
        }

        public Criteria andFinanceLevelLike(String value) {
            addCriterion("finance_level like", value, "financeLevel");
            return (Criteria) this;
        }

        public Criteria andFinanceLevelNotLike(String value) {
            addCriterion("finance_level not like", value, "financeLevel");
            return (Criteria) this;
        }

        public Criteria andFinanceLevelIn(List<String> values) {
            addCriterion("finance_level in", values, "financeLevel");
            return (Criteria) this;
        }

        public Criteria andFinanceLevelNotIn(List<String> values) {
            addCriterion("finance_level not in", values, "financeLevel");
            return (Criteria) this;
        }

        public Criteria andFinanceLevelBetween(String value1, String value2) {
            addCriterion("finance_level between", value1, value2, "financeLevel");
            return (Criteria) this;
        }

        public Criteria andFinanceLevelNotBetween(String value1, String value2) {
            addCriterion("finance_level not between", value1, value2, "financeLevel");
            return (Criteria) this;
        }

        public Criteria andLogiLevelIsNull() {
            addCriterion("logi_level is null");
            return (Criteria) this;
        }

        public Criteria andLogiLevelIsNotNull() {
            addCriterion("logi_level is not null");
            return (Criteria) this;
        }

        public Criteria andLogiLevelEqualTo(String value) {
            addCriterion("logi_level =", value, "logiLevel");
            return (Criteria) this;
        }

        public Criteria andLogiLevelNotEqualTo(String value) {
            addCriterion("logi_level <>", value, "logiLevel");
            return (Criteria) this;
        }

        public Criteria andLogiLevelGreaterThan(String value) {
            addCriterion("logi_level >", value, "logiLevel");
            return (Criteria) this;
        }

        public Criteria andLogiLevelGreaterThanOrEqualTo(String value) {
            addCriterion("logi_level >=", value, "logiLevel");
            return (Criteria) this;
        }

        public Criteria andLogiLevelLessThan(String value) {
            addCriterion("logi_level <", value, "logiLevel");
            return (Criteria) this;
        }

        public Criteria andLogiLevelLessThanOrEqualTo(String value) {
            addCriterion("logi_level <=", value, "logiLevel");
            return (Criteria) this;
        }

        public Criteria andLogiLevelLike(String value) {
            addCriterion("logi_level like", value, "logiLevel");
            return (Criteria) this;
        }

        public Criteria andLogiLevelNotLike(String value) {
            addCriterion("logi_level not like", value, "logiLevel");
            return (Criteria) this;
        }

        public Criteria andLogiLevelIn(List<String> values) {
            addCriterion("logi_level in", values, "logiLevel");
            return (Criteria) this;
        }

        public Criteria andLogiLevelNotIn(List<String> values) {
            addCriterion("logi_level not in", values, "logiLevel");
            return (Criteria) this;
        }

        public Criteria andLogiLevelBetween(String value1, String value2) {
            addCriterion("logi_level between", value1, value2, "logiLevel");
            return (Criteria) this;
        }

        public Criteria andLogiLevelNotBetween(String value1, String value2) {
            addCriterion("logi_level not between", value1, value2, "logiLevel");
            return (Criteria) this;
        }

        public Criteria andQaLevelIsNull() {
            addCriterion("qa_level is null");
            return (Criteria) this;
        }

        public Criteria andQaLevelIsNotNull() {
            addCriterion("qa_level is not null");
            return (Criteria) this;
        }

        public Criteria andQaLevelEqualTo(String value) {
            addCriterion("qa_level =", value, "qaLevel");
            return (Criteria) this;
        }

        public Criteria andQaLevelNotEqualTo(String value) {
            addCriterion("qa_level <>", value, "qaLevel");
            return (Criteria) this;
        }

        public Criteria andQaLevelGreaterThan(String value) {
            addCriterion("qa_level >", value, "qaLevel");
            return (Criteria) this;
        }

        public Criteria andQaLevelGreaterThanOrEqualTo(String value) {
            addCriterion("qa_level >=", value, "qaLevel");
            return (Criteria) this;
        }

        public Criteria andQaLevelLessThan(String value) {
            addCriterion("qa_level <", value, "qaLevel");
            return (Criteria) this;
        }

        public Criteria andQaLevelLessThanOrEqualTo(String value) {
            addCriterion("qa_level <=", value, "qaLevel");
            return (Criteria) this;
        }

        public Criteria andQaLevelLike(String value) {
            addCriterion("qa_level like", value, "qaLevel");
            return (Criteria) this;
        }

        public Criteria andQaLevelNotLike(String value) {
            addCriterion("qa_level not like", value, "qaLevel");
            return (Criteria) this;
        }

        public Criteria andQaLevelIn(List<String> values) {
            addCriterion("qa_level in", values, "qaLevel");
            return (Criteria) this;
        }

        public Criteria andQaLevelNotIn(List<String> values) {
            addCriterion("qa_level not in", values, "qaLevel");
            return (Criteria) this;
        }

        public Criteria andQaLevelBetween(String value1, String value2) {
            addCriterion("qa_level between", value1, value2, "qaLevel");
            return (Criteria) this;
        }

        public Criteria andQaLevelNotBetween(String value1, String value2) {
            addCriterion("qa_level not between", value1, value2, "qaLevel");
            return (Criteria) this;
        }

        public Criteria andStewardLevelIsNull() {
            addCriterion("steward_level is null");
            return (Criteria) this;
        }

        public Criteria andStewardLevelIsNotNull() {
            addCriterion("steward_level is not null");
            return (Criteria) this;
        }

        public Criteria andStewardLevelEqualTo(String value) {
            addCriterion("steward_level =", value, "stewardLevel");
            return (Criteria) this;
        }

        public Criteria andStewardLevelNotEqualTo(String value) {
            addCriterion("steward_level <>", value, "stewardLevel");
            return (Criteria) this;
        }

        public Criteria andStewardLevelGreaterThan(String value) {
            addCriterion("steward_level >", value, "stewardLevel");
            return (Criteria) this;
        }

        public Criteria andStewardLevelGreaterThanOrEqualTo(String value) {
            addCriterion("steward_level >=", value, "stewardLevel");
            return (Criteria) this;
        }

        public Criteria andStewardLevelLessThan(String value) {
            addCriterion("steward_level <", value, "stewardLevel");
            return (Criteria) this;
        }

        public Criteria andStewardLevelLessThanOrEqualTo(String value) {
            addCriterion("steward_level <=", value, "stewardLevel");
            return (Criteria) this;
        }

        public Criteria andStewardLevelLike(String value) {
            addCriterion("steward_level like", value, "stewardLevel");
            return (Criteria) this;
        }

        public Criteria andStewardLevelNotLike(String value) {
            addCriterion("steward_level not like", value, "stewardLevel");
            return (Criteria) this;
        }

        public Criteria andStewardLevelIn(List<String> values) {
            addCriterion("steward_level in", values, "stewardLevel");
            return (Criteria) this;
        }

        public Criteria andStewardLevelNotIn(List<String> values) {
            addCriterion("steward_level not in", values, "stewardLevel");
            return (Criteria) this;
        }

        public Criteria andStewardLevelBetween(String value1, String value2) {
            addCriterion("steward_level between", value1, value2, "stewardLevel");
            return (Criteria) this;
        }

        public Criteria andStewardLevelNotBetween(String value1, String value2) {
            addCriterion("steward_level not between", value1, value2, "stewardLevel");
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

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andRecommendFlagIsNull() {
            addCriterion("recommend_flag is null");
            return (Criteria) this;
        }

        public Criteria andRecommendFlagIsNotNull() {
            addCriterion("recommend_flag is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendFlagEqualTo(String value) {
            addCriterion("recommend_flag =", value, "recommendFlag");
            return (Criteria) this;
        }

        public Criteria andRecommendFlagNotEqualTo(String value) {
            addCriterion("recommend_flag <>", value, "recommendFlag");
            return (Criteria) this;
        }

        public Criteria andRecommendFlagGreaterThan(String value) {
            addCriterion("recommend_flag >", value, "recommendFlag");
            return (Criteria) this;
        }

        public Criteria andRecommendFlagGreaterThanOrEqualTo(String value) {
            addCriterion("recommend_flag >=", value, "recommendFlag");
            return (Criteria) this;
        }

        public Criteria andRecommendFlagLessThan(String value) {
            addCriterion("recommend_flag <", value, "recommendFlag");
            return (Criteria) this;
        }

        public Criteria andRecommendFlagLessThanOrEqualTo(String value) {
            addCriterion("recommend_flag <=", value, "recommendFlag");
            return (Criteria) this;
        }

        public Criteria andRecommendFlagLike(String value) {
            addCriterion("recommend_flag like", value, "recommendFlag");
            return (Criteria) this;
        }

        public Criteria andRecommendFlagNotLike(String value) {
            addCriterion("recommend_flag not like", value, "recommendFlag");
            return (Criteria) this;
        }

        public Criteria andRecommendFlagIn(List<String> values) {
            addCriterion("recommend_flag in", values, "recommendFlag");
            return (Criteria) this;
        }

        public Criteria andRecommendFlagNotIn(List<String> values) {
            addCriterion("recommend_flag not in", values, "recommendFlag");
            return (Criteria) this;
        }

        public Criteria andRecommendFlagBetween(String value1, String value2) {
            addCriterion("recommend_flag between", value1, value2, "recommendFlag");
            return (Criteria) this;
        }

        public Criteria andRecommendFlagNotBetween(String value1, String value2) {
            addCriterion("recommend_flag not between", value1, value2, "recommendFlag");
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

        public Criteria andQsFlagIsNull() {
            addCriterion("qs_flag is null");
            return (Criteria) this;
        }

        public Criteria andQsFlagIsNotNull() {
            addCriterion("qs_flag is not null");
            return (Criteria) this;
        }

        public Criteria andQsFlagEqualTo(String value) {
            addCriterion("qs_flag =", value, "qsFlag");
            return (Criteria) this;
        }

        public Criteria andQsFlagNotEqualTo(String value) {
            addCriterion("qs_flag <>", value, "qsFlag");
            return (Criteria) this;
        }

        public Criteria andQsFlagGreaterThan(String value) {
            addCriterion("qs_flag >", value, "qsFlag");
            return (Criteria) this;
        }

        public Criteria andQsFlagGreaterThanOrEqualTo(String value) {
            addCriterion("qs_flag >=", value, "qsFlag");
            return (Criteria) this;
        }

        public Criteria andQsFlagLessThan(String value) {
            addCriterion("qs_flag <", value, "qsFlag");
            return (Criteria) this;
        }

        public Criteria andQsFlagLessThanOrEqualTo(String value) {
            addCriterion("qs_flag <=", value, "qsFlag");
            return (Criteria) this;
        }

        public Criteria andQsFlagLike(String value) {
            addCriterion("qs_flag like", value, "qsFlag");
            return (Criteria) this;
        }

        public Criteria andQsFlagNotLike(String value) {
            addCriterion("qs_flag not like", value, "qsFlag");
            return (Criteria) this;
        }

        public Criteria andQsFlagIn(List<String> values) {
            addCriterion("qs_flag in", values, "qsFlag");
            return (Criteria) this;
        }

        public Criteria andQsFlagNotIn(List<String> values) {
            addCriterion("qs_flag not in", values, "qsFlag");
            return (Criteria) this;
        }

        public Criteria andQsFlagBetween(String value1, String value2) {
            addCriterion("qs_flag between", value1, value2, "qsFlag");
            return (Criteria) this;
        }

        public Criteria andQsFlagNotBetween(String value1, String value2) {
            addCriterion("qs_flag not between", value1, value2, "qsFlag");
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

        public Criteria andEruiStatusIsNull() {
            addCriterion("erui_status is null");
            return (Criteria) this;
        }

        public Criteria andEruiStatusIsNotNull() {
            addCriterion("erui_status is not null");
            return (Criteria) this;
        }

        public Criteria andEruiStatusEqualTo(String value) {
            addCriterion("erui_status =", value, "eruiStatus");
            return (Criteria) this;
        }

        public Criteria andEruiStatusNotEqualTo(String value) {
            addCriterion("erui_status <>", value, "eruiStatus");
            return (Criteria) this;
        }

        public Criteria andEruiStatusGreaterThan(String value) {
            addCriterion("erui_status >", value, "eruiStatus");
            return (Criteria) this;
        }

        public Criteria andEruiStatusGreaterThanOrEqualTo(String value) {
            addCriterion("erui_status >=", value, "eruiStatus");
            return (Criteria) this;
        }

        public Criteria andEruiStatusLessThan(String value) {
            addCriterion("erui_status <", value, "eruiStatus");
            return (Criteria) this;
        }

        public Criteria andEruiStatusLessThanOrEqualTo(String value) {
            addCriterion("erui_status <=", value, "eruiStatus");
            return (Criteria) this;
        }

        public Criteria andEruiStatusLike(String value) {
            addCriterion("erui_status like", value, "eruiStatus");
            return (Criteria) this;
        }

        public Criteria andEruiStatusNotLike(String value) {
            addCriterion("erui_status not like", value, "eruiStatus");
            return (Criteria) this;
        }

        public Criteria andEruiStatusIn(List<String> values) {
            addCriterion("erui_status in", values, "eruiStatus");
            return (Criteria) this;
        }

        public Criteria andEruiStatusNotIn(List<String> values) {
            addCriterion("erui_status not in", values, "eruiStatus");
            return (Criteria) this;
        }

        public Criteria andEruiStatusBetween(String value1, String value2) {
            addCriterion("erui_status between", value1, value2, "eruiStatus");
            return (Criteria) this;
        }

        public Criteria andEruiStatusNotBetween(String value1, String value2) {
            addCriterion("erui_status not between", value1, value2, "eruiStatus");
            return (Criteria) this;
        }

        public Criteria andExpireStatusIsNull() {
            addCriterion("expire_status is null");
            return (Criteria) this;
        }

        public Criteria andExpireStatusIsNotNull() {
            addCriterion("expire_status is not null");
            return (Criteria) this;
        }

        public Criteria andExpireStatusEqualTo(String value) {
            addCriterion("expire_status =", value, "expireStatus");
            return (Criteria) this;
        }

        public Criteria andExpireStatusNotEqualTo(String value) {
            addCriterion("expire_status <>", value, "expireStatus");
            return (Criteria) this;
        }

        public Criteria andExpireStatusGreaterThan(String value) {
            addCriterion("expire_status >", value, "expireStatus");
            return (Criteria) this;
        }

        public Criteria andExpireStatusGreaterThanOrEqualTo(String value) {
            addCriterion("expire_status >=", value, "expireStatus");
            return (Criteria) this;
        }

        public Criteria andExpireStatusLessThan(String value) {
            addCriterion("expire_status <", value, "expireStatus");
            return (Criteria) this;
        }

        public Criteria andExpireStatusLessThanOrEqualTo(String value) {
            addCriterion("expire_status <=", value, "expireStatus");
            return (Criteria) this;
        }

        public Criteria andExpireStatusLike(String value) {
            addCriterion("expire_status like", value, "expireStatus");
            return (Criteria) this;
        }

        public Criteria andExpireStatusNotLike(String value) {
            addCriterion("expire_status not like", value, "expireStatus");
            return (Criteria) this;
        }

        public Criteria andExpireStatusIn(List<String> values) {
            addCriterion("expire_status in", values, "expireStatus");
            return (Criteria) this;
        }

        public Criteria andExpireStatusNotIn(List<String> values) {
            addCriterion("expire_status not in", values, "expireStatus");
            return (Criteria) this;
        }

        public Criteria andExpireStatusBetween(String value1, String value2) {
            addCriterion("expire_status between", value1, value2, "expireStatus");
            return (Criteria) this;
        }

        public Criteria andExpireStatusNotBetween(String value1, String value2) {
            addCriterion("expire_status not between", value1, value2, "expireStatus");
            return (Criteria) this;
        }

        public Criteria andIsEruiIsNull() {
            addCriterion("is_erui is null");
            return (Criteria) this;
        }

        public Criteria andIsEruiIsNotNull() {
            addCriterion("is_erui is not null");
            return (Criteria) this;
        }

        public Criteria andIsEruiEqualTo(String value) {
            addCriterion("is_erui =", value, "isErui");
            return (Criteria) this;
        }

        public Criteria andIsEruiNotEqualTo(String value) {
            addCriterion("is_erui <>", value, "isErui");
            return (Criteria) this;
        }

        public Criteria andIsEruiGreaterThan(String value) {
            addCriterion("is_erui >", value, "isErui");
            return (Criteria) this;
        }

        public Criteria andIsEruiGreaterThanOrEqualTo(String value) {
            addCriterion("is_erui >=", value, "isErui");
            return (Criteria) this;
        }

        public Criteria andIsEruiLessThan(String value) {
            addCriterion("is_erui <", value, "isErui");
            return (Criteria) this;
        }

        public Criteria andIsEruiLessThanOrEqualTo(String value) {
            addCriterion("is_erui <=", value, "isErui");
            return (Criteria) this;
        }

        public Criteria andIsEruiLike(String value) {
            addCriterion("is_erui like", value, "isErui");
            return (Criteria) this;
        }

        public Criteria andIsEruiNotLike(String value) {
            addCriterion("is_erui not like", value, "isErui");
            return (Criteria) this;
        }

        public Criteria andIsEruiIn(List<String> values) {
            addCriterion("is_erui in", values, "isErui");
            return (Criteria) this;
        }

        public Criteria andIsEruiNotIn(List<String> values) {
            addCriterion("is_erui not in", values, "isErui");
            return (Criteria) this;
        }

        public Criteria andIsEruiBetween(String value1, String value2) {
            addCriterion("is_erui between", value1, value2, "isErui");
            return (Criteria) this;
        }

        public Criteria andIsEruiNotBetween(String value1, String value2) {
            addCriterion("is_erui not between", value1, value2, "isErui");
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

        public Criteria andApplyAtIsNull() {
            addCriterion("apply_at is null");
            return (Criteria) this;
        }

        public Criteria andApplyAtIsNotNull() {
            addCriterion("apply_at is not null");
            return (Criteria) this;
        }

        public Criteria andApplyAtEqualTo(Date value) {
            addCriterion("apply_at =", value, "applyAt");
            return (Criteria) this;
        }

        public Criteria andApplyAtNotEqualTo(Date value) {
            addCriterion("apply_at <>", value, "applyAt");
            return (Criteria) this;
        }

        public Criteria andApplyAtGreaterThan(Date value) {
            addCriterion("apply_at >", value, "applyAt");
            return (Criteria) this;
        }

        public Criteria andApplyAtGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_at >=", value, "applyAt");
            return (Criteria) this;
        }

        public Criteria andApplyAtLessThan(Date value) {
            addCriterion("apply_at <", value, "applyAt");
            return (Criteria) this;
        }

        public Criteria andApplyAtLessThanOrEqualTo(Date value) {
            addCriterion("apply_at <=", value, "applyAt");
            return (Criteria) this;
        }

        public Criteria andApplyAtIn(List<Date> values) {
            addCriterion("apply_at in", values, "applyAt");
            return (Criteria) this;
        }

        public Criteria andApplyAtNotIn(List<Date> values) {
            addCriterion("apply_at not in", values, "applyAt");
            return (Criteria) this;
        }

        public Criteria andApplyAtBetween(Date value1, Date value2) {
            addCriterion("apply_at between", value1, value2, "applyAt");
            return (Criteria) this;
        }

        public Criteria andApplyAtNotBetween(Date value1, Date value2) {
            addCriterion("apply_at not between", value1, value2, "applyAt");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(Long value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(Long value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(Long value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Long value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(Long value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Long value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<Long> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<Long> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(Long value1, Long value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(Long value1, Long value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
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

        public Criteria andCheckedByIsNull() {
            addCriterion("checked_by is null");
            return (Criteria) this;
        }

        public Criteria andCheckedByIsNotNull() {
            addCriterion("checked_by is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedByEqualTo(Long value) {
            addCriterion("checked_by =", value, "checkedBy");
            return (Criteria) this;
        }

        public Criteria andCheckedByNotEqualTo(Long value) {
            addCriterion("checked_by <>", value, "checkedBy");
            return (Criteria) this;
        }

        public Criteria andCheckedByGreaterThan(Long value) {
            addCriterion("checked_by >", value, "checkedBy");
            return (Criteria) this;
        }

        public Criteria andCheckedByGreaterThanOrEqualTo(Long value) {
            addCriterion("checked_by >=", value, "checkedBy");
            return (Criteria) this;
        }

        public Criteria andCheckedByLessThan(Long value) {
            addCriterion("checked_by <", value, "checkedBy");
            return (Criteria) this;
        }

        public Criteria andCheckedByLessThanOrEqualTo(Long value) {
            addCriterion("checked_by <=", value, "checkedBy");
            return (Criteria) this;
        }

        public Criteria andCheckedByIn(List<Long> values) {
            addCriterion("checked_by in", values, "checkedBy");
            return (Criteria) this;
        }

        public Criteria andCheckedByNotIn(List<Long> values) {
            addCriterion("checked_by not in", values, "checkedBy");
            return (Criteria) this;
        }

        public Criteria andCheckedByBetween(Long value1, Long value2) {
            addCriterion("checked_by between", value1, value2, "checkedBy");
            return (Criteria) this;
        }

        public Criteria andCheckedByNotBetween(Long value1, Long value2) {
            addCriterion("checked_by not between", value1, value2, "checkedBy");
            return (Criteria) this;
        }

        public Criteria andCheckedAtIsNull() {
            addCriterion("checked_at is null");
            return (Criteria) this;
        }

        public Criteria andCheckedAtIsNotNull() {
            addCriterion("checked_at is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedAtEqualTo(Date value) {
            addCriterion("checked_at =", value, "checkedAt");
            return (Criteria) this;
        }

        public Criteria andCheckedAtNotEqualTo(Date value) {
            addCriterion("checked_at <>", value, "checkedAt");
            return (Criteria) this;
        }

        public Criteria andCheckedAtGreaterThan(Date value) {
            addCriterion("checked_at >", value, "checkedAt");
            return (Criteria) this;
        }

        public Criteria andCheckedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("checked_at >=", value, "checkedAt");
            return (Criteria) this;
        }

        public Criteria andCheckedAtLessThan(Date value) {
            addCriterion("checked_at <", value, "checkedAt");
            return (Criteria) this;
        }

        public Criteria andCheckedAtLessThanOrEqualTo(Date value) {
            addCriterion("checked_at <=", value, "checkedAt");
            return (Criteria) this;
        }

        public Criteria andCheckedAtIn(List<Date> values) {
            addCriterion("checked_at in", values, "checkedAt");
            return (Criteria) this;
        }

        public Criteria andCheckedAtNotIn(List<Date> values) {
            addCriterion("checked_at not in", values, "checkedAt");
            return (Criteria) this;
        }

        public Criteria andCheckedAtBetween(Date value1, Date value2) {
            addCriterion("checked_at between", value1, value2, "checkedAt");
            return (Criteria) this;
        }

        public Criteria andCheckedAtNotBetween(Date value1, Date value2) {
            addCriterion("checked_at not between", value1, value2, "checkedAt");
            return (Criteria) this;
        }

        public Criteria andEruiCheckedAtIsNull() {
            addCriterion("erui_checked_at is null");
            return (Criteria) this;
        }

        public Criteria andEruiCheckedAtIsNotNull() {
            addCriterion("erui_checked_at is not null");
            return (Criteria) this;
        }

        public Criteria andEruiCheckedAtEqualTo(Date value) {
            addCriterion("erui_checked_at =", value, "eruiCheckedAt");
            return (Criteria) this;
        }

        public Criteria andEruiCheckedAtNotEqualTo(Date value) {
            addCriterion("erui_checked_at <>", value, "eruiCheckedAt");
            return (Criteria) this;
        }

        public Criteria andEruiCheckedAtGreaterThan(Date value) {
            addCriterion("erui_checked_at >", value, "eruiCheckedAt");
            return (Criteria) this;
        }

        public Criteria andEruiCheckedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("erui_checked_at >=", value, "eruiCheckedAt");
            return (Criteria) this;
        }

        public Criteria andEruiCheckedAtLessThan(Date value) {
            addCriterion("erui_checked_at <", value, "eruiCheckedAt");
            return (Criteria) this;
        }

        public Criteria andEruiCheckedAtLessThanOrEqualTo(Date value) {
            addCriterion("erui_checked_at <=", value, "eruiCheckedAt");
            return (Criteria) this;
        }

        public Criteria andEruiCheckedAtIn(List<Date> values) {
            addCriterion("erui_checked_at in", values, "eruiCheckedAt");
            return (Criteria) this;
        }

        public Criteria andEruiCheckedAtNotIn(List<Date> values) {
            addCriterion("erui_checked_at not in", values, "eruiCheckedAt");
            return (Criteria) this;
        }

        public Criteria andEruiCheckedAtBetween(Date value1, Date value2) {
            addCriterion("erui_checked_at between", value1, value2, "eruiCheckedAt");
            return (Criteria) this;
        }

        public Criteria andEruiCheckedAtNotBetween(Date value1, Date value2) {
            addCriterion("erui_checked_at not between", value1, value2, "eruiCheckedAt");
            return (Criteria) this;
        }

        public Criteria andEruiCheckedByIsNull() {
            addCriterion("erui_checked_by is null");
            return (Criteria) this;
        }

        public Criteria andEruiCheckedByIsNotNull() {
            addCriterion("erui_checked_by is not null");
            return (Criteria) this;
        }

        public Criteria andEruiCheckedByEqualTo(Long value) {
            addCriterion("erui_checked_by =", value, "eruiCheckedBy");
            return (Criteria) this;
        }

        public Criteria andEruiCheckedByNotEqualTo(Long value) {
            addCriterion("erui_checked_by <>", value, "eruiCheckedBy");
            return (Criteria) this;
        }

        public Criteria andEruiCheckedByGreaterThan(Long value) {
            addCriterion("erui_checked_by >", value, "eruiCheckedBy");
            return (Criteria) this;
        }

        public Criteria andEruiCheckedByGreaterThanOrEqualTo(Long value) {
            addCriterion("erui_checked_by >=", value, "eruiCheckedBy");
            return (Criteria) this;
        }

        public Criteria andEruiCheckedByLessThan(Long value) {
            addCriterion("erui_checked_by <", value, "eruiCheckedBy");
            return (Criteria) this;
        }

        public Criteria andEruiCheckedByLessThanOrEqualTo(Long value) {
            addCriterion("erui_checked_by <=", value, "eruiCheckedBy");
            return (Criteria) this;
        }

        public Criteria andEruiCheckedByIn(List<Long> values) {
            addCriterion("erui_checked_by in", values, "eruiCheckedBy");
            return (Criteria) this;
        }

        public Criteria andEruiCheckedByNotIn(List<Long> values) {
            addCriterion("erui_checked_by not in", values, "eruiCheckedBy");
            return (Criteria) this;
        }

        public Criteria andEruiCheckedByBetween(Long value1, Long value2) {
            addCriterion("erui_checked_by between", value1, value2, "eruiCheckedBy");
            return (Criteria) this;
        }

        public Criteria andEruiCheckedByNotBetween(Long value1, Long value2) {
            addCriterion("erui_checked_by not between", value1, value2, "eruiCheckedBy");
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

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Long value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Long value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Long value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Long value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Long> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Long> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Long value1, Long value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("updated_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(Long value) {
            addCriterion("updated_by =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(Long value) {
            addCriterion("updated_by <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(Long value) {
            addCriterion("updated_by >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(Long value) {
            addCriterion("updated_by >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(Long value) {
            addCriterion("updated_by <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(Long value) {
            addCriterion("updated_by <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<Long> values) {
            addCriterion("updated_by in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<Long> values) {
            addCriterion("updated_by not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(Long value1, Long value2) {
            addCriterion("updated_by between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(Long value1, Long value2) {
            addCriterion("updated_by not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andIsRelationIsNull() {
            addCriterion("is_relation is null");
            return (Criteria) this;
        }

        public Criteria andIsRelationIsNotNull() {
            addCriterion("is_relation is not null");
            return (Criteria) this;
        }

        public Criteria andIsRelationEqualTo(String value) {
            addCriterion("is_relation =", value, "isRelation");
            return (Criteria) this;
        }

        public Criteria andIsRelationNotEqualTo(String value) {
            addCriterion("is_relation <>", value, "isRelation");
            return (Criteria) this;
        }

        public Criteria andIsRelationGreaterThan(String value) {
            addCriterion("is_relation >", value, "isRelation");
            return (Criteria) this;
        }

        public Criteria andIsRelationGreaterThanOrEqualTo(String value) {
            addCriterion("is_relation >=", value, "isRelation");
            return (Criteria) this;
        }

        public Criteria andIsRelationLessThan(String value) {
            addCriterion("is_relation <", value, "isRelation");
            return (Criteria) this;
        }

        public Criteria andIsRelationLessThanOrEqualTo(String value) {
            addCriterion("is_relation <=", value, "isRelation");
            return (Criteria) this;
        }

        public Criteria andIsRelationLike(String value) {
            addCriterion("is_relation like", value, "isRelation");
            return (Criteria) this;
        }

        public Criteria andIsRelationNotLike(String value) {
            addCriterion("is_relation not like", value, "isRelation");
            return (Criteria) this;
        }

        public Criteria andIsRelationIn(List<String> values) {
            addCriterion("is_relation in", values, "isRelation");
            return (Criteria) this;
        }

        public Criteria andIsRelationNotIn(List<String> values) {
            addCriterion("is_relation not in", values, "isRelation");
            return (Criteria) this;
        }

        public Criteria andIsRelationBetween(String value1, String value2) {
            addCriterion("is_relation between", value1, value2, "isRelation");
            return (Criteria) this;
        }

        public Criteria andIsRelationNotBetween(String value1, String value2) {
            addCriterion("is_relation not between", value1, value2, "isRelation");
            return (Criteria) this;
        }

        public Criteria andSourceKeyIsNull() {
            addCriterion("source_key is null");
            return (Criteria) this;
        }

        public Criteria andSourceKeyIsNotNull() {
            addCriterion("source_key is not null");
            return (Criteria) this;
        }

        public Criteria andSourceKeyEqualTo(String value) {
            addCriterion("source_key =", value, "sourceKey");
            return (Criteria) this;
        }

        public Criteria andSourceKeyNotEqualTo(String value) {
            addCriterion("source_key <>", value, "sourceKey");
            return (Criteria) this;
        }

        public Criteria andSourceKeyGreaterThan(String value) {
            addCriterion("source_key >", value, "sourceKey");
            return (Criteria) this;
        }

        public Criteria andSourceKeyGreaterThanOrEqualTo(String value) {
            addCriterion("source_key >=", value, "sourceKey");
            return (Criteria) this;
        }

        public Criteria andSourceKeyLessThan(String value) {
            addCriterion("source_key <", value, "sourceKey");
            return (Criteria) this;
        }

        public Criteria andSourceKeyLessThanOrEqualTo(String value) {
            addCriterion("source_key <=", value, "sourceKey");
            return (Criteria) this;
        }

        public Criteria andSourceKeyLike(String value) {
            addCriterion("source_key like", value, "sourceKey");
            return (Criteria) this;
        }

        public Criteria andSourceKeyNotLike(String value) {
            addCriterion("source_key not like", value, "sourceKey");
            return (Criteria) this;
        }

        public Criteria andSourceKeyIn(List<String> values) {
            addCriterion("source_key in", values, "sourceKey");
            return (Criteria) this;
        }

        public Criteria andSourceKeyNotIn(List<String> values) {
            addCriterion("source_key not in", values, "sourceKey");
            return (Criteria) this;
        }

        public Criteria andSourceKeyBetween(String value1, String value2) {
            addCriterion("source_key between", value1, value2, "sourceKey");
            return (Criteria) this;
        }

        public Criteria andSourceKeyNotBetween(String value1, String value2) {
            addCriterion("source_key not between", value1, value2, "sourceKey");
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

        public Criteria andCustomerTypeEqualTo(Byte value) {
            addCriterion("customer_type =", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotEqualTo(Byte value) {
            addCriterion("customer_type <>", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThan(Byte value) {
            addCriterion("customer_type >", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("customer_type >=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThan(Byte value) {
            addCriterion("customer_type <", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThanOrEqualTo(Byte value) {
            addCriterion("customer_type <=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIn(List<Byte> values) {
            addCriterion("customer_type in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotIn(List<Byte> values) {
            addCriterion("customer_type not in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeBetween(Byte value1, Byte value2) {
            addCriterion("customer_type between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("customer_type not between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andTenantIsNull() {
            addCriterion("tenant is null");
            return (Criteria) this;
        }

        public Criteria andTenantIsNotNull() {
            addCriterion("tenant is not null");
            return (Criteria) this;
        }

        public Criteria andTenantEqualTo(String value) {
            addCriterion("tenant =", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantNotEqualTo(String value) {
            addCriterion("tenant <>", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantGreaterThan(String value) {
            addCriterion("tenant >", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantGreaterThanOrEqualTo(String value) {
            addCriterion("tenant >=", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantLessThan(String value) {
            addCriterion("tenant <", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantLessThanOrEqualTo(String value) {
            addCriterion("tenant <=", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantLike(String value) {
            addCriterion("tenant like", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantNotLike(String value) {
            addCriterion("tenant not like", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantIn(List<String> values) {
            addCriterion("tenant in", values, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantNotIn(List<String> values) {
            addCriterion("tenant not in", values, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantBetween(String value1, String value2) {
            addCriterion("tenant between", value1, value2, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantNotBetween(String value1, String value2) {
            addCriterion("tenant not between", value1, value2, "tenant");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIsNull() {
            addCriterion("process_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIsNotNull() {
            addCriterion("process_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeEqualTo(Date value) {
            addCriterion("process_time =", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotEqualTo(Date value) {
            addCriterion("process_time <>", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeGreaterThan(Date value) {
            addCriterion("process_time >", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("process_time >=", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeLessThan(Date value) {
            addCriterion("process_time <", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeLessThanOrEqualTo(Date value) {
            addCriterion("process_time <=", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIn(List<Date> values) {
            addCriterion("process_time in", values, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotIn(List<Date> values) {
            addCriterion("process_time not in", values, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeBetween(Date value1, Date value2) {
            addCriterion("process_time between", value1, value2, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotBetween(Date value1, Date value2) {
            addCriterion("process_time not between", value1, value2, "processTime");
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