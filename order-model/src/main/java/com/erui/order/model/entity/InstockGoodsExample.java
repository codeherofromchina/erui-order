package com.erui.order.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InstockGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstockGoodsExample() {
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

        public Criteria andInstockIdIsNull() {
            addCriterion("instock_id is null");
            return (Criteria) this;
        }

        public Criteria andInstockIdIsNotNull() {
            addCriterion("instock_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstockIdEqualTo(Long value) {
            addCriterion("instock_id =", value, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdNotEqualTo(Long value) {
            addCriterion("instock_id <>", value, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdGreaterThan(Long value) {
            addCriterion("instock_id >", value, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdGreaterThanOrEqualTo(Long value) {
            addCriterion("instock_id >=", value, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdLessThan(Long value) {
            addCriterion("instock_id <", value, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdLessThanOrEqualTo(Long value) {
            addCriterion("instock_id <=", value, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdIn(List<Long> values) {
            addCriterion("instock_id in", values, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdNotIn(List<Long> values) {
            addCriterion("instock_id not in", values, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdBetween(Long value1, Long value2) {
            addCriterion("instock_id between", value1, value2, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdNotBetween(Long value1, Long value2) {
            addCriterion("instock_id not between", value1, value2, "instockId");
            return (Criteria) this;
        }

        public Criteria andInspectApplyGoodsIdIsNull() {
            addCriterion("inspect_apply_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andInspectApplyGoodsIdIsNotNull() {
            addCriterion("inspect_apply_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andInspectApplyGoodsIdEqualTo(Long value) {
            addCriterion("inspect_apply_goods_id =", value, "inspectApplyGoodsId");
            return (Criteria) this;
        }

        public Criteria andInspectApplyGoodsIdNotEqualTo(Long value) {
            addCriterion("inspect_apply_goods_id <>", value, "inspectApplyGoodsId");
            return (Criteria) this;
        }

        public Criteria andInspectApplyGoodsIdGreaterThan(Long value) {
            addCriterion("inspect_apply_goods_id >", value, "inspectApplyGoodsId");
            return (Criteria) this;
        }

        public Criteria andInspectApplyGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("inspect_apply_goods_id >=", value, "inspectApplyGoodsId");
            return (Criteria) this;
        }

        public Criteria andInspectApplyGoodsIdLessThan(Long value) {
            addCriterion("inspect_apply_goods_id <", value, "inspectApplyGoodsId");
            return (Criteria) this;
        }

        public Criteria andInspectApplyGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("inspect_apply_goods_id <=", value, "inspectApplyGoodsId");
            return (Criteria) this;
        }

        public Criteria andInspectApplyGoodsIdIn(List<Long> values) {
            addCriterion("inspect_apply_goods_id in", values, "inspectApplyGoodsId");
            return (Criteria) this;
        }

        public Criteria andInspectApplyGoodsIdNotIn(List<Long> values) {
            addCriterion("inspect_apply_goods_id not in", values, "inspectApplyGoodsId");
            return (Criteria) this;
        }

        public Criteria andInspectApplyGoodsIdBetween(Long value1, Long value2) {
            addCriterion("inspect_apply_goods_id between", value1, value2, "inspectApplyGoodsId");
            return (Criteria) this;
        }

        public Criteria andInspectApplyGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("inspect_apply_goods_id not between", value1, value2, "inspectApplyGoodsId");
            return (Criteria) this;
        }

        public Criteria andInstockNumIsNull() {
            addCriterion("instock_num is null");
            return (Criteria) this;
        }

        public Criteria andInstockNumIsNotNull() {
            addCriterion("instock_num is not null");
            return (Criteria) this;
        }

        public Criteria andInstockNumEqualTo(Integer value) {
            addCriterion("instock_num =", value, "instockNum");
            return (Criteria) this;
        }

        public Criteria andInstockNumNotEqualTo(Integer value) {
            addCriterion("instock_num <>", value, "instockNum");
            return (Criteria) this;
        }

        public Criteria andInstockNumGreaterThan(Integer value) {
            addCriterion("instock_num >", value, "instockNum");
            return (Criteria) this;
        }

        public Criteria andInstockNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("instock_num >=", value, "instockNum");
            return (Criteria) this;
        }

        public Criteria andInstockNumLessThan(Integer value) {
            addCriterion("instock_num <", value, "instockNum");
            return (Criteria) this;
        }

        public Criteria andInstockNumLessThanOrEqualTo(Integer value) {
            addCriterion("instock_num <=", value, "instockNum");
            return (Criteria) this;
        }

        public Criteria andInstockNumIn(List<Integer> values) {
            addCriterion("instock_num in", values, "instockNum");
            return (Criteria) this;
        }

        public Criteria andInstockNumNotIn(List<Integer> values) {
            addCriterion("instock_num not in", values, "instockNum");
            return (Criteria) this;
        }

        public Criteria andInstockNumBetween(Integer value1, Integer value2) {
            addCriterion("instock_num between", value1, value2, "instockNum");
            return (Criteria) this;
        }

        public Criteria andInstockNumNotBetween(Integer value1, Integer value2) {
            addCriterion("instock_num not between", value1, value2, "instockNum");
            return (Criteria) this;
        }

        public Criteria andInstockStockIsNull() {
            addCriterion("instock_stock is null");
            return (Criteria) this;
        }

        public Criteria andInstockStockIsNotNull() {
            addCriterion("instock_stock is not null");
            return (Criteria) this;
        }

        public Criteria andInstockStockEqualTo(String value) {
            addCriterion("instock_stock =", value, "instockStock");
            return (Criteria) this;
        }

        public Criteria andInstockStockNotEqualTo(String value) {
            addCriterion("instock_stock <>", value, "instockStock");
            return (Criteria) this;
        }

        public Criteria andInstockStockGreaterThan(String value) {
            addCriterion("instock_stock >", value, "instockStock");
            return (Criteria) this;
        }

        public Criteria andInstockStockGreaterThanOrEqualTo(String value) {
            addCriterion("instock_stock >=", value, "instockStock");
            return (Criteria) this;
        }

        public Criteria andInstockStockLessThan(String value) {
            addCriterion("instock_stock <", value, "instockStock");
            return (Criteria) this;
        }

        public Criteria andInstockStockLessThanOrEqualTo(String value) {
            addCriterion("instock_stock <=", value, "instockStock");
            return (Criteria) this;
        }

        public Criteria andInstockStockLike(String value) {
            addCriterion("instock_stock like", value, "instockStock");
            return (Criteria) this;
        }

        public Criteria andInstockStockNotLike(String value) {
            addCriterion("instock_stock not like", value, "instockStock");
            return (Criteria) this;
        }

        public Criteria andInstockStockIn(List<String> values) {
            addCriterion("instock_stock in", values, "instockStock");
            return (Criteria) this;
        }

        public Criteria andInstockStockNotIn(List<String> values) {
            addCriterion("instock_stock not in", values, "instockStock");
            return (Criteria) this;
        }

        public Criteria andInstockStockBetween(String value1, String value2) {
            addCriterion("instock_stock between", value1, value2, "instockStock");
            return (Criteria) this;
        }

        public Criteria andInstockStockNotBetween(String value1, String value2) {
            addCriterion("instock_stock not between", value1, value2, "instockStock");
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