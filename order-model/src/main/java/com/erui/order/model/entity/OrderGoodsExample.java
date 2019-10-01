package com.erui.order.model.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderGoodsExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andSkuIsNull() {
            addCriterion("sku is null");
            return (Criteria) this;
        }

        public Criteria andSkuIsNotNull() {
            addCriterion("sku is not null");
            return (Criteria) this;
        }

        public Criteria andSkuEqualTo(String value) {
            addCriterion("sku =", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotEqualTo(String value) {
            addCriterion("sku <>", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThan(String value) {
            addCriterion("sku >", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThanOrEqualTo(String value) {
            addCriterion("sku >=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThan(String value) {
            addCriterion("sku <", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThanOrEqualTo(String value) {
            addCriterion("sku <=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLike(String value) {
            addCriterion("sku like", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotLike(String value) {
            addCriterion("sku not like", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuIn(List<String> values) {
            addCriterion("sku in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotIn(List<String> values) {
            addCriterion("sku not in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuBetween(String value1, String value2) {
            addCriterion("sku between", value1, value2, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotBetween(String value1, String value2) {
            addCriterion("sku not between", value1, value2, "sku");
            return (Criteria) this;
        }

        public Criteria andMeteTypeIsNull() {
            addCriterion("mete_type is null");
            return (Criteria) this;
        }

        public Criteria andMeteTypeIsNotNull() {
            addCriterion("mete_type is not null");
            return (Criteria) this;
        }

        public Criteria andMeteTypeEqualTo(String value) {
            addCriterion("mete_type =", value, "meteType");
            return (Criteria) this;
        }

        public Criteria andMeteTypeNotEqualTo(String value) {
            addCriterion("mete_type <>", value, "meteType");
            return (Criteria) this;
        }

        public Criteria andMeteTypeGreaterThan(String value) {
            addCriterion("mete_type >", value, "meteType");
            return (Criteria) this;
        }

        public Criteria andMeteTypeGreaterThanOrEqualTo(String value) {
            addCriterion("mete_type >=", value, "meteType");
            return (Criteria) this;
        }

        public Criteria andMeteTypeLessThan(String value) {
            addCriterion("mete_type <", value, "meteType");
            return (Criteria) this;
        }

        public Criteria andMeteTypeLessThanOrEqualTo(String value) {
            addCriterion("mete_type <=", value, "meteType");
            return (Criteria) this;
        }

        public Criteria andMeteTypeLike(String value) {
            addCriterion("mete_type like", value, "meteType");
            return (Criteria) this;
        }

        public Criteria andMeteTypeNotLike(String value) {
            addCriterion("mete_type not like", value, "meteType");
            return (Criteria) this;
        }

        public Criteria andMeteTypeIn(List<String> values) {
            addCriterion("mete_type in", values, "meteType");
            return (Criteria) this;
        }

        public Criteria andMeteTypeNotIn(List<String> values) {
            addCriterion("mete_type not in", values, "meteType");
            return (Criteria) this;
        }

        public Criteria andMeteTypeBetween(String value1, String value2) {
            addCriterion("mete_type between", value1, value2, "meteType");
            return (Criteria) this;
        }

        public Criteria andMeteTypeNotBetween(String value1, String value2) {
            addCriterion("mete_type not between", value1, value2, "meteType");
            return (Criteria) this;
        }

        public Criteria andMeteTypeNameIsNull() {
            addCriterion("mete_type_name is null");
            return (Criteria) this;
        }

        public Criteria andMeteTypeNameIsNotNull() {
            addCriterion("mete_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andMeteTypeNameEqualTo(String value) {
            addCriterion("mete_type_name =", value, "meteTypeName");
            return (Criteria) this;
        }

        public Criteria andMeteTypeNameNotEqualTo(String value) {
            addCriterion("mete_type_name <>", value, "meteTypeName");
            return (Criteria) this;
        }

        public Criteria andMeteTypeNameGreaterThan(String value) {
            addCriterion("mete_type_name >", value, "meteTypeName");
            return (Criteria) this;
        }

        public Criteria andMeteTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("mete_type_name >=", value, "meteTypeName");
            return (Criteria) this;
        }

        public Criteria andMeteTypeNameLessThan(String value) {
            addCriterion("mete_type_name <", value, "meteTypeName");
            return (Criteria) this;
        }

        public Criteria andMeteTypeNameLessThanOrEqualTo(String value) {
            addCriterion("mete_type_name <=", value, "meteTypeName");
            return (Criteria) this;
        }

        public Criteria andMeteTypeNameLike(String value) {
            addCriterion("mete_type_name like", value, "meteTypeName");
            return (Criteria) this;
        }

        public Criteria andMeteTypeNameNotLike(String value) {
            addCriterion("mete_type_name not like", value, "meteTypeName");
            return (Criteria) this;
        }

        public Criteria andMeteTypeNameIn(List<String> values) {
            addCriterion("mete_type_name in", values, "meteTypeName");
            return (Criteria) this;
        }

        public Criteria andMeteTypeNameNotIn(List<String> values) {
            addCriterion("mete_type_name not in", values, "meteTypeName");
            return (Criteria) this;
        }

        public Criteria andMeteTypeNameBetween(String value1, String value2) {
            addCriterion("mete_type_name between", value1, value2, "meteTypeName");
            return (Criteria) this;
        }

        public Criteria andMeteTypeNameNotBetween(String value1, String value2) {
            addCriterion("mete_type_name not between", value1, value2, "meteTypeName");
            return (Criteria) this;
        }

        public Criteria andTplNoIsNull() {
            addCriterion("tpl_no is null");
            return (Criteria) this;
        }

        public Criteria andTplNoIsNotNull() {
            addCriterion("tpl_no is not null");
            return (Criteria) this;
        }

        public Criteria andTplNoEqualTo(String value) {
            addCriterion("tpl_no =", value, "tplNo");
            return (Criteria) this;
        }

        public Criteria andTplNoNotEqualTo(String value) {
            addCriterion("tpl_no <>", value, "tplNo");
            return (Criteria) this;
        }

        public Criteria andTplNoGreaterThan(String value) {
            addCriterion("tpl_no >", value, "tplNo");
            return (Criteria) this;
        }

        public Criteria andTplNoGreaterThanOrEqualTo(String value) {
            addCriterion("tpl_no >=", value, "tplNo");
            return (Criteria) this;
        }

        public Criteria andTplNoLessThan(String value) {
            addCriterion("tpl_no <", value, "tplNo");
            return (Criteria) this;
        }

        public Criteria andTplNoLessThanOrEqualTo(String value) {
            addCriterion("tpl_no <=", value, "tplNo");
            return (Criteria) this;
        }

        public Criteria andTplNoLike(String value) {
            addCriterion("tpl_no like", value, "tplNo");
            return (Criteria) this;
        }

        public Criteria andTplNoNotLike(String value) {
            addCriterion("tpl_no not like", value, "tplNo");
            return (Criteria) this;
        }

        public Criteria andTplNoIn(List<String> values) {
            addCriterion("tpl_no in", values, "tplNo");
            return (Criteria) this;
        }

        public Criteria andTplNoNotIn(List<String> values) {
            addCriterion("tpl_no not in", values, "tplNo");
            return (Criteria) this;
        }

        public Criteria andTplNoBetween(String value1, String value2) {
            addCriterion("tpl_no between", value1, value2, "tplNo");
            return (Criteria) this;
        }

        public Criteria andTplNoNotBetween(String value1, String value2) {
            addCriterion("tpl_no not between", value1, value2, "tplNo");
            return (Criteria) this;
        }

        public Criteria andTplNameIsNull() {
            addCriterion("tpl_name is null");
            return (Criteria) this;
        }

        public Criteria andTplNameIsNotNull() {
            addCriterion("tpl_name is not null");
            return (Criteria) this;
        }

        public Criteria andTplNameEqualTo(String value) {
            addCriterion("tpl_name =", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameNotEqualTo(String value) {
            addCriterion("tpl_name <>", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameGreaterThan(String value) {
            addCriterion("tpl_name >", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameGreaterThanOrEqualTo(String value) {
            addCriterion("tpl_name >=", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameLessThan(String value) {
            addCriterion("tpl_name <", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameLessThanOrEqualTo(String value) {
            addCriterion("tpl_name <=", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameLike(String value) {
            addCriterion("tpl_name like", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameNotLike(String value) {
            addCriterion("tpl_name not like", value, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameIn(List<String> values) {
            addCriterion("tpl_name in", values, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameNotIn(List<String> values) {
            addCriterion("tpl_name not in", values, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameBetween(String value1, String value2) {
            addCriterion("tpl_name between", value1, value2, "tplName");
            return (Criteria) this;
        }

        public Criteria andTplNameNotBetween(String value1, String value2) {
            addCriterion("tpl_name not between", value1, value2, "tplName");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Long value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Long value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Long value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Long value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Long value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Long> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Long> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Long value1, Long value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Long value1, Long value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
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

        public Criteria andNameZhIsNull() {
            addCriterion("name_zh is null");
            return (Criteria) this;
        }

        public Criteria andNameZhIsNotNull() {
            addCriterion("name_zh is not null");
            return (Criteria) this;
        }

        public Criteria andNameZhEqualTo(String value) {
            addCriterion("name_zh =", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotEqualTo(String value) {
            addCriterion("name_zh <>", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhGreaterThan(String value) {
            addCriterion("name_zh >", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhGreaterThanOrEqualTo(String value) {
            addCriterion("name_zh >=", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhLessThan(String value) {
            addCriterion("name_zh <", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhLessThanOrEqualTo(String value) {
            addCriterion("name_zh <=", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhLike(String value) {
            addCriterion("name_zh like", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotLike(String value) {
            addCriterion("name_zh not like", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhIn(List<String> values) {
            addCriterion("name_zh in", values, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotIn(List<String> values) {
            addCriterion("name_zh not in", values, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhBetween(String value1, String value2) {
            addCriterion("name_zh between", value1, value2, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotBetween(String value1, String value2) {
            addCriterion("name_zh not between", value1, value2, "nameZh");
            return (Criteria) this;
        }

        public Criteria andContractGoodsNumIsNull() {
            addCriterion("contract_goods_num is null");
            return (Criteria) this;
        }

        public Criteria andContractGoodsNumIsNotNull() {
            addCriterion("contract_goods_num is not null");
            return (Criteria) this;
        }

        public Criteria andContractGoodsNumEqualTo(Short value) {
            addCriterion("contract_goods_num =", value, "contractGoodsNum");
            return (Criteria) this;
        }

        public Criteria andContractGoodsNumNotEqualTo(Short value) {
            addCriterion("contract_goods_num <>", value, "contractGoodsNum");
            return (Criteria) this;
        }

        public Criteria andContractGoodsNumGreaterThan(Short value) {
            addCriterion("contract_goods_num >", value, "contractGoodsNum");
            return (Criteria) this;
        }

        public Criteria andContractGoodsNumGreaterThanOrEqualTo(Short value) {
            addCriterion("contract_goods_num >=", value, "contractGoodsNum");
            return (Criteria) this;
        }

        public Criteria andContractGoodsNumLessThan(Short value) {
            addCriterion("contract_goods_num <", value, "contractGoodsNum");
            return (Criteria) this;
        }

        public Criteria andContractGoodsNumLessThanOrEqualTo(Short value) {
            addCriterion("contract_goods_num <=", value, "contractGoodsNum");
            return (Criteria) this;
        }

        public Criteria andContractGoodsNumIn(List<Short> values) {
            addCriterion("contract_goods_num in", values, "contractGoodsNum");
            return (Criteria) this;
        }

        public Criteria andContractGoodsNumNotIn(List<Short> values) {
            addCriterion("contract_goods_num not in", values, "contractGoodsNum");
            return (Criteria) this;
        }

        public Criteria andContractGoodsNumBetween(Short value1, Short value2) {
            addCriterion("contract_goods_num between", value1, value2, "contractGoodsNum");
            return (Criteria) this;
        }

        public Criteria andContractGoodsNumNotBetween(Short value1, Short value2) {
            addCriterion("contract_goods_num not between", value1, value2, "contractGoodsNum");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andEruiPriceIsNull() {
            addCriterion("erui_price is null");
            return (Criteria) this;
        }

        public Criteria andEruiPriceIsNotNull() {
            addCriterion("erui_price is not null");
            return (Criteria) this;
        }

        public Criteria andEruiPriceEqualTo(BigDecimal value) {
            addCriterion("erui_price =", value, "eruiPrice");
            return (Criteria) this;
        }

        public Criteria andEruiPriceNotEqualTo(BigDecimal value) {
            addCriterion("erui_price <>", value, "eruiPrice");
            return (Criteria) this;
        }

        public Criteria andEruiPriceGreaterThan(BigDecimal value) {
            addCriterion("erui_price >", value, "eruiPrice");
            return (Criteria) this;
        }

        public Criteria andEruiPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("erui_price >=", value, "eruiPrice");
            return (Criteria) this;
        }

        public Criteria andEruiPriceLessThan(BigDecimal value) {
            addCriterion("erui_price <", value, "eruiPrice");
            return (Criteria) this;
        }

        public Criteria andEruiPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("erui_price <=", value, "eruiPrice");
            return (Criteria) this;
        }

        public Criteria andEruiPriceIn(List<BigDecimal> values) {
            addCriterion("erui_price in", values, "eruiPrice");
            return (Criteria) this;
        }

        public Criteria andEruiPriceNotIn(List<BigDecimal> values) {
            addCriterion("erui_price not in", values, "eruiPrice");
            return (Criteria) this;
        }

        public Criteria andEruiPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("erui_price between", value1, value2, "eruiPrice");
            return (Criteria) this;
        }

        public Criteria andEruiPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("erui_price not between", value1, value2, "eruiPrice");
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

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andPrePurchContractNumIsNull() {
            addCriterion("pre_purch_contract_num is null");
            return (Criteria) this;
        }

        public Criteria andPrePurchContractNumIsNotNull() {
            addCriterion("pre_purch_contract_num is not null");
            return (Criteria) this;
        }

        public Criteria andPrePurchContractNumEqualTo(Short value) {
            addCriterion("pre_purch_contract_num =", value, "prePurchContractNum");
            return (Criteria) this;
        }

        public Criteria andPrePurchContractNumNotEqualTo(Short value) {
            addCriterion("pre_purch_contract_num <>", value, "prePurchContractNum");
            return (Criteria) this;
        }

        public Criteria andPrePurchContractNumGreaterThan(Short value) {
            addCriterion("pre_purch_contract_num >", value, "prePurchContractNum");
            return (Criteria) this;
        }

        public Criteria andPrePurchContractNumGreaterThanOrEqualTo(Short value) {
            addCriterion("pre_purch_contract_num >=", value, "prePurchContractNum");
            return (Criteria) this;
        }

        public Criteria andPrePurchContractNumLessThan(Short value) {
            addCriterion("pre_purch_contract_num <", value, "prePurchContractNum");
            return (Criteria) this;
        }

        public Criteria andPrePurchContractNumLessThanOrEqualTo(Short value) {
            addCriterion("pre_purch_contract_num <=", value, "prePurchContractNum");
            return (Criteria) this;
        }

        public Criteria andPrePurchContractNumIn(List<Short> values) {
            addCriterion("pre_purch_contract_num in", values, "prePurchContractNum");
            return (Criteria) this;
        }

        public Criteria andPrePurchContractNumNotIn(List<Short> values) {
            addCriterion("pre_purch_contract_num not in", values, "prePurchContractNum");
            return (Criteria) this;
        }

        public Criteria andPrePurchContractNumBetween(Short value1, Short value2) {
            addCriterion("pre_purch_contract_num between", value1, value2, "prePurchContractNum");
            return (Criteria) this;
        }

        public Criteria andPrePurchContractNumNotBetween(Short value1, Short value2) {
            addCriterion("pre_purch_contract_num not between", value1, value2, "prePurchContractNum");
            return (Criteria) this;
        }

        public Criteria andPurchContractNumIsNull() {
            addCriterion("purch_contract_num is null");
            return (Criteria) this;
        }

        public Criteria andPurchContractNumIsNotNull() {
            addCriterion("purch_contract_num is not null");
            return (Criteria) this;
        }

        public Criteria andPurchContractNumEqualTo(Short value) {
            addCriterion("purch_contract_num =", value, "purchContractNum");
            return (Criteria) this;
        }

        public Criteria andPurchContractNumNotEqualTo(Short value) {
            addCriterion("purch_contract_num <>", value, "purchContractNum");
            return (Criteria) this;
        }

        public Criteria andPurchContractNumGreaterThan(Short value) {
            addCriterion("purch_contract_num >", value, "purchContractNum");
            return (Criteria) this;
        }

        public Criteria andPurchContractNumGreaterThanOrEqualTo(Short value) {
            addCriterion("purch_contract_num >=", value, "purchContractNum");
            return (Criteria) this;
        }

        public Criteria andPurchContractNumLessThan(Short value) {
            addCriterion("purch_contract_num <", value, "purchContractNum");
            return (Criteria) this;
        }

        public Criteria andPurchContractNumLessThanOrEqualTo(Short value) {
            addCriterion("purch_contract_num <=", value, "purchContractNum");
            return (Criteria) this;
        }

        public Criteria andPurchContractNumIn(List<Short> values) {
            addCriterion("purch_contract_num in", values, "purchContractNum");
            return (Criteria) this;
        }

        public Criteria andPurchContractNumNotIn(List<Short> values) {
            addCriterion("purch_contract_num not in", values, "purchContractNum");
            return (Criteria) this;
        }

        public Criteria andPurchContractNumBetween(Short value1, Short value2) {
            addCriterion("purch_contract_num between", value1, value2, "purchContractNum");
            return (Criteria) this;
        }

        public Criteria andPurchContractNumNotBetween(Short value1, Short value2) {
            addCriterion("purch_contract_num not between", value1, value2, "purchContractNum");
            return (Criteria) this;
        }

        public Criteria andPreOutstockedNumIsNull() {
            addCriterion("pre_outstocked_num is null");
            return (Criteria) this;
        }

        public Criteria andPreOutstockedNumIsNotNull() {
            addCriterion("pre_outstocked_num is not null");
            return (Criteria) this;
        }

        public Criteria andPreOutstockedNumEqualTo(Short value) {
            addCriterion("pre_outstocked_num =", value, "preOutstockedNum");
            return (Criteria) this;
        }

        public Criteria andPreOutstockedNumNotEqualTo(Short value) {
            addCriterion("pre_outstocked_num <>", value, "preOutstockedNum");
            return (Criteria) this;
        }

        public Criteria andPreOutstockedNumGreaterThan(Short value) {
            addCriterion("pre_outstocked_num >", value, "preOutstockedNum");
            return (Criteria) this;
        }

        public Criteria andPreOutstockedNumGreaterThanOrEqualTo(Short value) {
            addCriterion("pre_outstocked_num >=", value, "preOutstockedNum");
            return (Criteria) this;
        }

        public Criteria andPreOutstockedNumLessThan(Short value) {
            addCriterion("pre_outstocked_num <", value, "preOutstockedNum");
            return (Criteria) this;
        }

        public Criteria andPreOutstockedNumLessThanOrEqualTo(Short value) {
            addCriterion("pre_outstocked_num <=", value, "preOutstockedNum");
            return (Criteria) this;
        }

        public Criteria andPreOutstockedNumIn(List<Short> values) {
            addCriterion("pre_outstocked_num in", values, "preOutstockedNum");
            return (Criteria) this;
        }

        public Criteria andPreOutstockedNumNotIn(List<Short> values) {
            addCriterion("pre_outstocked_num not in", values, "preOutstockedNum");
            return (Criteria) this;
        }

        public Criteria andPreOutstockedNumBetween(Short value1, Short value2) {
            addCriterion("pre_outstocked_num between", value1, value2, "preOutstockedNum");
            return (Criteria) this;
        }

        public Criteria andPreOutstockedNumNotBetween(Short value1, Short value2) {
            addCriterion("pre_outstocked_num not between", value1, value2, "preOutstockedNum");
            return (Criteria) this;
        }

        public Criteria andOutstockedNumIsNull() {
            addCriterion("outstocked_num is null");
            return (Criteria) this;
        }

        public Criteria andOutstockedNumIsNotNull() {
            addCriterion("outstocked_num is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockedNumEqualTo(Short value) {
            addCriterion("outstocked_num =", value, "outstockedNum");
            return (Criteria) this;
        }

        public Criteria andOutstockedNumNotEqualTo(Short value) {
            addCriterion("outstocked_num <>", value, "outstockedNum");
            return (Criteria) this;
        }

        public Criteria andOutstockedNumGreaterThan(Short value) {
            addCriterion("outstocked_num >", value, "outstockedNum");
            return (Criteria) this;
        }

        public Criteria andOutstockedNumGreaterThanOrEqualTo(Short value) {
            addCriterion("outstocked_num >=", value, "outstockedNum");
            return (Criteria) this;
        }

        public Criteria andOutstockedNumLessThan(Short value) {
            addCriterion("outstocked_num <", value, "outstockedNum");
            return (Criteria) this;
        }

        public Criteria andOutstockedNumLessThanOrEqualTo(Short value) {
            addCriterion("outstocked_num <=", value, "outstockedNum");
            return (Criteria) this;
        }

        public Criteria andOutstockedNumIn(List<Short> values) {
            addCriterion("outstocked_num in", values, "outstockedNum");
            return (Criteria) this;
        }

        public Criteria andOutstockedNumNotIn(List<Short> values) {
            addCriterion("outstocked_num not in", values, "outstockedNum");
            return (Criteria) this;
        }

        public Criteria andOutstockedNumBetween(Short value1, Short value2) {
            addCriterion("outstocked_num between", value1, value2, "outstockedNum");
            return (Criteria) this;
        }

        public Criteria andOutstockedNumNotBetween(Short value1, Short value2) {
            addCriterion("outstocked_num not between", value1, value2, "outstockedNum");
            return (Criteria) this;
        }

        public Criteria andInstockedNumIsNull() {
            addCriterion("instocked_num is null");
            return (Criteria) this;
        }

        public Criteria andInstockedNumIsNotNull() {
            addCriterion("instocked_num is not null");
            return (Criteria) this;
        }

        public Criteria andInstockedNumEqualTo(Short value) {
            addCriterion("instocked_num =", value, "instockedNum");
            return (Criteria) this;
        }

        public Criteria andInstockedNumNotEqualTo(Short value) {
            addCriterion("instocked_num <>", value, "instockedNum");
            return (Criteria) this;
        }

        public Criteria andInstockedNumGreaterThan(Short value) {
            addCriterion("instocked_num >", value, "instockedNum");
            return (Criteria) this;
        }

        public Criteria andInstockedNumGreaterThanOrEqualTo(Short value) {
            addCriterion("instocked_num >=", value, "instockedNum");
            return (Criteria) this;
        }

        public Criteria andInstockedNumLessThan(Short value) {
            addCriterion("instocked_num <", value, "instockedNum");
            return (Criteria) this;
        }

        public Criteria andInstockedNumLessThanOrEqualTo(Short value) {
            addCriterion("instocked_num <=", value, "instockedNum");
            return (Criteria) this;
        }

        public Criteria andInstockedNumIn(List<Short> values) {
            addCriterion("instocked_num in", values, "instockedNum");
            return (Criteria) this;
        }

        public Criteria andInstockedNumNotIn(List<Short> values) {
            addCriterion("instocked_num not in", values, "instockedNum");
            return (Criteria) this;
        }

        public Criteria andInstockedNumBetween(Short value1, Short value2) {
            addCriterion("instocked_num between", value1, value2, "instockedNum");
            return (Criteria) this;
        }

        public Criteria andInstockedNumNotBetween(Short value1, Short value2) {
            addCriterion("instocked_num not between", value1, value2, "instockedNum");
            return (Criteria) this;
        }

        public Criteria andExeChgDateIsNull() {
            addCriterion("exe_chg_date is null");
            return (Criteria) this;
        }

        public Criteria andExeChgDateIsNotNull() {
            addCriterion("exe_chg_date is not null");
            return (Criteria) this;
        }

        public Criteria andExeChgDateEqualTo(Date value) {
            addCriterionForJDBCDate("exe_chg_date =", value, "exeChgDate");
            return (Criteria) this;
        }

        public Criteria andExeChgDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("exe_chg_date <>", value, "exeChgDate");
            return (Criteria) this;
        }

        public Criteria andExeChgDateGreaterThan(Date value) {
            addCriterionForJDBCDate("exe_chg_date >", value, "exeChgDate");
            return (Criteria) this;
        }

        public Criteria andExeChgDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("exe_chg_date >=", value, "exeChgDate");
            return (Criteria) this;
        }

        public Criteria andExeChgDateLessThan(Date value) {
            addCriterionForJDBCDate("exe_chg_date <", value, "exeChgDate");
            return (Criteria) this;
        }

        public Criteria andExeChgDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("exe_chg_date <=", value, "exeChgDate");
            return (Criteria) this;
        }

        public Criteria andExeChgDateIn(List<Date> values) {
            addCriterionForJDBCDate("exe_chg_date in", values, "exeChgDate");
            return (Criteria) this;
        }

        public Criteria andExeChgDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("exe_chg_date not in", values, "exeChgDate");
            return (Criteria) this;
        }

        public Criteria andExeChgDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("exe_chg_date between", value1, value2, "exeChgDate");
            return (Criteria) this;
        }

        public Criteria andExeChgDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("exe_chg_date not between", value1, value2, "exeChgDate");
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