package com.erui.order.model.entity;

import java.util.ArrayList;
import java.util.List;

public class OrgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrgExample() {
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

        public Criteria andMembershipIsNull() {
            addCriterion("membership is null");
            return (Criteria) this;
        }

        public Criteria andMembershipIsNotNull() {
            addCriterion("membership is not null");
            return (Criteria) this;
        }

        public Criteria andMembershipEqualTo(String value) {
            addCriterion("membership =", value, "membership");
            return (Criteria) this;
        }

        public Criteria andMembershipNotEqualTo(String value) {
            addCriterion("membership <>", value, "membership");
            return (Criteria) this;
        }

        public Criteria andMembershipGreaterThan(String value) {
            addCriterion("membership >", value, "membership");
            return (Criteria) this;
        }

        public Criteria andMembershipGreaterThanOrEqualTo(String value) {
            addCriterion("membership >=", value, "membership");
            return (Criteria) this;
        }

        public Criteria andMembershipLessThan(String value) {
            addCriterion("membership <", value, "membership");
            return (Criteria) this;
        }

        public Criteria andMembershipLessThanOrEqualTo(String value) {
            addCriterion("membership <=", value, "membership");
            return (Criteria) this;
        }

        public Criteria andMembershipLike(String value) {
            addCriterion("membership like", value, "membership");
            return (Criteria) this;
        }

        public Criteria andMembershipNotLike(String value) {
            addCriterion("membership not like", value, "membership");
            return (Criteria) this;
        }

        public Criteria andMembershipIn(List<String> values) {
            addCriterion("membership in", values, "membership");
            return (Criteria) this;
        }

        public Criteria andMembershipNotIn(List<String> values) {
            addCriterion("membership not in", values, "membership");
            return (Criteria) this;
        }

        public Criteria andMembershipBetween(String value1, String value2) {
            addCriterion("membership between", value1, value2, "membership");
            return (Criteria) this;
        }

        public Criteria andMembershipNotBetween(String value1, String value2) {
            addCriterion("membership not between", value1, value2, "membership");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnIsNull() {
            addCriterion("org_name_en is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnIsNotNull() {
            addCriterion("org_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnEqualTo(String value) {
            addCriterion("org_name_en =", value, "orgNameEn");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnNotEqualTo(String value) {
            addCriterion("org_name_en <>", value, "orgNameEn");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnGreaterThan(String value) {
            addCriterion("org_name_en >", value, "orgNameEn");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("org_name_en >=", value, "orgNameEn");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnLessThan(String value) {
            addCriterion("org_name_en <", value, "orgNameEn");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnLessThanOrEqualTo(String value) {
            addCriterion("org_name_en <=", value, "orgNameEn");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnLike(String value) {
            addCriterion("org_name_en like", value, "orgNameEn");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnNotLike(String value) {
            addCriterion("org_name_en not like", value, "orgNameEn");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnIn(List<String> values) {
            addCriterion("org_name_en in", values, "orgNameEn");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnNotIn(List<String> values) {
            addCriterion("org_name_en not in", values, "orgNameEn");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnBetween(String value1, String value2) {
            addCriterion("org_name_en between", value1, value2, "orgNameEn");
            return (Criteria) this;
        }

        public Criteria andOrgNameEnNotBetween(String value1, String value2) {
            addCriterion("org_name_en not between", value1, value2, "orgNameEn");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("org_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("org_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("org_name =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("org_name <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("org_name >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_name >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("org_name <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("org_name <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("org_name like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("org_name not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("org_name in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("org_name not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("org_name between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("org_name not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgStatusIsNull() {
            addCriterion("org_status is null");
            return (Criteria) this;
        }

        public Criteria andOrgStatusIsNotNull() {
            addCriterion("org_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrgStatusEqualTo(String value) {
            addCriterion("org_status =", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusNotEqualTo(String value) {
            addCriterion("org_status <>", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusGreaterThan(String value) {
            addCriterion("org_status >", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusGreaterThanOrEqualTo(String value) {
            addCriterion("org_status >=", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusLessThan(String value) {
            addCriterion("org_status <", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusLessThanOrEqualTo(String value) {
            addCriterion("org_status <=", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusLike(String value) {
            addCriterion("org_status like", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusNotLike(String value) {
            addCriterion("org_status not like", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusIn(List<String> values) {
            addCriterion("org_status in", values, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusNotIn(List<String> values) {
            addCriterion("org_status not in", values, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusBetween(String value1, String value2) {
            addCriterion("org_status between", value1, value2, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusNotBetween(String value1, String value2) {
            addCriterion("org_status not between", value1, value2, "orgStatus");
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

        public Criteria andOrgNodeIsNull() {
            addCriterion("org_node is null");
            return (Criteria) this;
        }

        public Criteria andOrgNodeIsNotNull() {
            addCriterion("org_node is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNodeEqualTo(String value) {
            addCriterion("org_node =", value, "orgNode");
            return (Criteria) this;
        }

        public Criteria andOrgNodeNotEqualTo(String value) {
            addCriterion("org_node <>", value, "orgNode");
            return (Criteria) this;
        }

        public Criteria andOrgNodeGreaterThan(String value) {
            addCriterion("org_node >", value, "orgNode");
            return (Criteria) this;
        }

        public Criteria andOrgNodeGreaterThanOrEqualTo(String value) {
            addCriterion("org_node >=", value, "orgNode");
            return (Criteria) this;
        }

        public Criteria andOrgNodeLessThan(String value) {
            addCriterion("org_node <", value, "orgNode");
            return (Criteria) this;
        }

        public Criteria andOrgNodeLessThanOrEqualTo(String value) {
            addCriterion("org_node <=", value, "orgNode");
            return (Criteria) this;
        }

        public Criteria andOrgNodeLike(String value) {
            addCriterion("org_node like", value, "orgNode");
            return (Criteria) this;
        }

        public Criteria andOrgNodeNotLike(String value) {
            addCriterion("org_node not like", value, "orgNode");
            return (Criteria) this;
        }

        public Criteria andOrgNodeIn(List<String> values) {
            addCriterion("org_node in", values, "orgNode");
            return (Criteria) this;
        }

        public Criteria andOrgNodeNotIn(List<String> values) {
            addCriterion("org_node not in", values, "orgNode");
            return (Criteria) this;
        }

        public Criteria andOrgNodeBetween(String value1, String value2) {
            addCriterion("org_node between", value1, value2, "orgNode");
            return (Criteria) this;
        }

        public Criteria andOrgNodeNotBetween(String value1, String value2) {
            addCriterion("org_node not between", value1, value2, "orgNode");
            return (Criteria) this;
        }

        public Criteria andUsedForGoodsIsNull() {
            addCriterion("used_for_goods is null");
            return (Criteria) this;
        }

        public Criteria andUsedForGoodsIsNotNull() {
            addCriterion("used_for_goods is not null");
            return (Criteria) this;
        }

        public Criteria andUsedForGoodsEqualTo(String value) {
            addCriterion("used_for_goods =", value, "usedForGoods");
            return (Criteria) this;
        }

        public Criteria andUsedForGoodsNotEqualTo(String value) {
            addCriterion("used_for_goods <>", value, "usedForGoods");
            return (Criteria) this;
        }

        public Criteria andUsedForGoodsGreaterThan(String value) {
            addCriterion("used_for_goods >", value, "usedForGoods");
            return (Criteria) this;
        }

        public Criteria andUsedForGoodsGreaterThanOrEqualTo(String value) {
            addCriterion("used_for_goods >=", value, "usedForGoods");
            return (Criteria) this;
        }

        public Criteria andUsedForGoodsLessThan(String value) {
            addCriterion("used_for_goods <", value, "usedForGoods");
            return (Criteria) this;
        }

        public Criteria andUsedForGoodsLessThanOrEqualTo(String value) {
            addCriterion("used_for_goods <=", value, "usedForGoods");
            return (Criteria) this;
        }

        public Criteria andUsedForGoodsLike(String value) {
            addCriterion("used_for_goods like", value, "usedForGoods");
            return (Criteria) this;
        }

        public Criteria andUsedForGoodsNotLike(String value) {
            addCriterion("used_for_goods not like", value, "usedForGoods");
            return (Criteria) this;
        }

        public Criteria andUsedForGoodsIn(List<String> values) {
            addCriterion("used_for_goods in", values, "usedForGoods");
            return (Criteria) this;
        }

        public Criteria andUsedForGoodsNotIn(List<String> values) {
            addCriterion("used_for_goods not in", values, "usedForGoods");
            return (Criteria) this;
        }

        public Criteria andUsedForGoodsBetween(String value1, String value2) {
            addCriterion("used_for_goods between", value1, value2, "usedForGoods");
            return (Criteria) this;
        }

        public Criteria andUsedForGoodsNotBetween(String value1, String value2) {
            addCriterion("used_for_goods not between", value1, value2, "usedForGoods");
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