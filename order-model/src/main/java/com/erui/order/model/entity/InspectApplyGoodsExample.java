package com.erui.order.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InspectApplyGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InspectApplyGoodsExample() {
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

        public Criteria andInspectApplyIdIsNull() {
            addCriterion("inspect_apply_id is null");
            return (Criteria) this;
        }

        public Criteria andInspectApplyIdIsNotNull() {
            addCriterion("inspect_apply_id is not null");
            return (Criteria) this;
        }

        public Criteria andInspectApplyIdEqualTo(Long value) {
            addCriterion("inspect_apply_id =", value, "inspectApplyId");
            return (Criteria) this;
        }

        public Criteria andInspectApplyIdNotEqualTo(Long value) {
            addCriterion("inspect_apply_id <>", value, "inspectApplyId");
            return (Criteria) this;
        }

        public Criteria andInspectApplyIdGreaterThan(Long value) {
            addCriterion("inspect_apply_id >", value, "inspectApplyId");
            return (Criteria) this;
        }

        public Criteria andInspectApplyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("inspect_apply_id >=", value, "inspectApplyId");
            return (Criteria) this;
        }

        public Criteria andInspectApplyIdLessThan(Long value) {
            addCriterion("inspect_apply_id <", value, "inspectApplyId");
            return (Criteria) this;
        }

        public Criteria andInspectApplyIdLessThanOrEqualTo(Long value) {
            addCriterion("inspect_apply_id <=", value, "inspectApplyId");
            return (Criteria) this;
        }

        public Criteria andInspectApplyIdIn(List<Long> values) {
            addCriterion("inspect_apply_id in", values, "inspectApplyId");
            return (Criteria) this;
        }

        public Criteria andInspectApplyIdNotIn(List<Long> values) {
            addCriterion("inspect_apply_id not in", values, "inspectApplyId");
            return (Criteria) this;
        }

        public Criteria andInspectApplyIdBetween(Long value1, Long value2) {
            addCriterion("inspect_apply_id between", value1, value2, "inspectApplyId");
            return (Criteria) this;
        }

        public Criteria andInspectApplyIdNotBetween(Long value1, Long value2) {
            addCriterion("inspect_apply_id not between", value1, value2, "inspectApplyId");
            return (Criteria) this;
        }

        public Criteria andInspectReportIdIsNull() {
            addCriterion("inspect_report_id is null");
            return (Criteria) this;
        }

        public Criteria andInspectReportIdIsNotNull() {
            addCriterion("inspect_report_id is not null");
            return (Criteria) this;
        }

        public Criteria andInspectReportIdEqualTo(Long value) {
            addCriterion("inspect_report_id =", value, "inspectReportId");
            return (Criteria) this;
        }

        public Criteria andInspectReportIdNotEqualTo(Long value) {
            addCriterion("inspect_report_id <>", value, "inspectReportId");
            return (Criteria) this;
        }

        public Criteria andInspectReportIdGreaterThan(Long value) {
            addCriterion("inspect_report_id >", value, "inspectReportId");
            return (Criteria) this;
        }

        public Criteria andInspectReportIdGreaterThanOrEqualTo(Long value) {
            addCriterion("inspect_report_id >=", value, "inspectReportId");
            return (Criteria) this;
        }

        public Criteria andInspectReportIdLessThan(Long value) {
            addCriterion("inspect_report_id <", value, "inspectReportId");
            return (Criteria) this;
        }

        public Criteria andInspectReportIdLessThanOrEqualTo(Long value) {
            addCriterion("inspect_report_id <=", value, "inspectReportId");
            return (Criteria) this;
        }

        public Criteria andInspectReportIdIn(List<Long> values) {
            addCriterion("inspect_report_id in", values, "inspectReportId");
            return (Criteria) this;
        }

        public Criteria andInspectReportIdNotIn(List<Long> values) {
            addCriterion("inspect_report_id not in", values, "inspectReportId");
            return (Criteria) this;
        }

        public Criteria andInspectReportIdBetween(Long value1, Long value2) {
            addCriterion("inspect_report_id between", value1, value2, "inspectReportId");
            return (Criteria) this;
        }

        public Criteria andInspectReportIdNotBetween(Long value1, Long value2) {
            addCriterion("inspect_report_id not between", value1, value2, "inspectReportId");
            return (Criteria) this;
        }

        public Criteria andPurchGoodsIdIsNull() {
            addCriterion("purch_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchGoodsIdIsNotNull() {
            addCriterion("purch_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchGoodsIdEqualTo(Long value) {
            addCriterion("purch_goods_id =", value, "purchGoodsId");
            return (Criteria) this;
        }

        public Criteria andPurchGoodsIdNotEqualTo(Long value) {
            addCriterion("purch_goods_id <>", value, "purchGoodsId");
            return (Criteria) this;
        }

        public Criteria andPurchGoodsIdGreaterThan(Long value) {
            addCriterion("purch_goods_id >", value, "purchGoodsId");
            return (Criteria) this;
        }

        public Criteria andPurchGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("purch_goods_id >=", value, "purchGoodsId");
            return (Criteria) this;
        }

        public Criteria andPurchGoodsIdLessThan(Long value) {
            addCriterion("purch_goods_id <", value, "purchGoodsId");
            return (Criteria) this;
        }

        public Criteria andPurchGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("purch_goods_id <=", value, "purchGoodsId");
            return (Criteria) this;
        }

        public Criteria andPurchGoodsIdIn(List<Long> values) {
            addCriterion("purch_goods_id in", values, "purchGoodsId");
            return (Criteria) this;
        }

        public Criteria andPurchGoodsIdNotIn(List<Long> values) {
            addCriterion("purch_goods_id not in", values, "purchGoodsId");
            return (Criteria) this;
        }

        public Criteria andPurchGoodsIdBetween(Long value1, Long value2) {
            addCriterion("purch_goods_id between", value1, value2, "purchGoodsId");
            return (Criteria) this;
        }

        public Criteria andPurchGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("purch_goods_id not between", value1, value2, "purchGoodsId");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumIsNull() {
            addCriterion("purchase_num is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumIsNotNull() {
            addCriterion("purchase_num is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumEqualTo(Integer value) {
            addCriterion("purchase_num =", value, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumNotEqualTo(Integer value) {
            addCriterion("purchase_num <>", value, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumGreaterThan(Integer value) {
            addCriterion("purchase_num >", value, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_num >=", value, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumLessThan(Integer value) {
            addCriterion("purchase_num <", value, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_num <=", value, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumIn(List<Integer> values) {
            addCriterion("purchase_num in", values, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumNotIn(List<Integer> values) {
            addCriterion("purchase_num not in", values, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumBetween(Integer value1, Integer value2) {
            addCriterion("purchase_num between", value1, value2, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_num not between", value1, value2, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andInspectNumIsNull() {
            addCriterion("inspect_num is null");
            return (Criteria) this;
        }

        public Criteria andInspectNumIsNotNull() {
            addCriterion("inspect_num is not null");
            return (Criteria) this;
        }

        public Criteria andInspectNumEqualTo(Integer value) {
            addCriterion("inspect_num =", value, "inspectNum");
            return (Criteria) this;
        }

        public Criteria andInspectNumNotEqualTo(Integer value) {
            addCriterion("inspect_num <>", value, "inspectNum");
            return (Criteria) this;
        }

        public Criteria andInspectNumGreaterThan(Integer value) {
            addCriterion("inspect_num >", value, "inspectNum");
            return (Criteria) this;
        }

        public Criteria andInspectNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("inspect_num >=", value, "inspectNum");
            return (Criteria) this;
        }

        public Criteria andInspectNumLessThan(Integer value) {
            addCriterion("inspect_num <", value, "inspectNum");
            return (Criteria) this;
        }

        public Criteria andInspectNumLessThanOrEqualTo(Integer value) {
            addCriterion("inspect_num <=", value, "inspectNum");
            return (Criteria) this;
        }

        public Criteria andInspectNumIn(List<Integer> values) {
            addCriterion("inspect_num in", values, "inspectNum");
            return (Criteria) this;
        }

        public Criteria andInspectNumNotIn(List<Integer> values) {
            addCriterion("inspect_num not in", values, "inspectNum");
            return (Criteria) this;
        }

        public Criteria andInspectNumBetween(Integer value1, Integer value2) {
            addCriterion("inspect_num between", value1, value2, "inspectNum");
            return (Criteria) this;
        }

        public Criteria andInspectNumNotBetween(Integer value1, Integer value2) {
            addCriterion("inspect_num not between", value1, value2, "inspectNum");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(String value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(String value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(String value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(String value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(String value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(String value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLike(String value) {
            addCriterion("height like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotLike(String value) {
            addCriterion("height not like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<String> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<String> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(String value1, String value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(String value1, String value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andLwhIsNull() {
            addCriterion("lwh is null");
            return (Criteria) this;
        }

        public Criteria andLwhIsNotNull() {
            addCriterion("lwh is not null");
            return (Criteria) this;
        }

        public Criteria andLwhEqualTo(String value) {
            addCriterion("lwh =", value, "lwh");
            return (Criteria) this;
        }

        public Criteria andLwhNotEqualTo(String value) {
            addCriterion("lwh <>", value, "lwh");
            return (Criteria) this;
        }

        public Criteria andLwhGreaterThan(String value) {
            addCriterion("lwh >", value, "lwh");
            return (Criteria) this;
        }

        public Criteria andLwhGreaterThanOrEqualTo(String value) {
            addCriterion("lwh >=", value, "lwh");
            return (Criteria) this;
        }

        public Criteria andLwhLessThan(String value) {
            addCriterion("lwh <", value, "lwh");
            return (Criteria) this;
        }

        public Criteria andLwhLessThanOrEqualTo(String value) {
            addCriterion("lwh <=", value, "lwh");
            return (Criteria) this;
        }

        public Criteria andLwhLike(String value) {
            addCriterion("lwh like", value, "lwh");
            return (Criteria) this;
        }

        public Criteria andLwhNotLike(String value) {
            addCriterion("lwh not like", value, "lwh");
            return (Criteria) this;
        }

        public Criteria andLwhIn(List<String> values) {
            addCriterion("lwh in", values, "lwh");
            return (Criteria) this;
        }

        public Criteria andLwhNotIn(List<String> values) {
            addCriterion("lwh not in", values, "lwh");
            return (Criteria) this;
        }

        public Criteria andLwhBetween(String value1, String value2) {
            addCriterion("lwh between", value1, value2, "lwh");
            return (Criteria) this;
        }

        public Criteria andLwhNotBetween(String value1, String value2) {
            addCriterion("lwh not between", value1, value2, "lwh");
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

        public Criteria andSamplesIsNull() {
            addCriterion("samples is null");
            return (Criteria) this;
        }

        public Criteria andSamplesIsNotNull() {
            addCriterion("samples is not null");
            return (Criteria) this;
        }

        public Criteria andSamplesEqualTo(Integer value) {
            addCriterion("samples =", value, "samples");
            return (Criteria) this;
        }

        public Criteria andSamplesNotEqualTo(Integer value) {
            addCriterion("samples <>", value, "samples");
            return (Criteria) this;
        }

        public Criteria andSamplesGreaterThan(Integer value) {
            addCriterion("samples >", value, "samples");
            return (Criteria) this;
        }

        public Criteria andSamplesGreaterThanOrEqualTo(Integer value) {
            addCriterion("samples >=", value, "samples");
            return (Criteria) this;
        }

        public Criteria andSamplesLessThan(Integer value) {
            addCriterion("samples <", value, "samples");
            return (Criteria) this;
        }

        public Criteria andSamplesLessThanOrEqualTo(Integer value) {
            addCriterion("samples <=", value, "samples");
            return (Criteria) this;
        }

        public Criteria andSamplesIn(List<Integer> values) {
            addCriterion("samples in", values, "samples");
            return (Criteria) this;
        }

        public Criteria andSamplesNotIn(List<Integer> values) {
            addCriterion("samples not in", values, "samples");
            return (Criteria) this;
        }

        public Criteria andSamplesBetween(Integer value1, Integer value2) {
            addCriterion("samples between", value1, value2, "samples");
            return (Criteria) this;
        }

        public Criteria andSamplesNotBetween(Integer value1, Integer value2) {
            addCriterion("samples not between", value1, value2, "samples");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedIsNull() {
            addCriterion("unqualified is null");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedIsNotNull() {
            addCriterion("unqualified is not null");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedEqualTo(Integer value) {
            addCriterion("unqualified =", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedNotEqualTo(Integer value) {
            addCriterion("unqualified <>", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedGreaterThan(Integer value) {
            addCriterion("unqualified >", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedGreaterThanOrEqualTo(Integer value) {
            addCriterion("unqualified >=", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedLessThan(Integer value) {
            addCriterion("unqualified <", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedLessThanOrEqualTo(Integer value) {
            addCriterion("unqualified <=", value, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedIn(List<Integer> values) {
            addCriterion("unqualified in", values, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedNotIn(List<Integer> values) {
            addCriterion("unqualified not in", values, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedBetween(Integer value1, Integer value2) {
            addCriterion("unqualified between", value1, value2, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedNotBetween(Integer value1, Integer value2) {
            addCriterion("unqualified not between", value1, value2, "unqualified");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedDescIsNull() {
            addCriterion("unqualified_desc is null");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedDescIsNotNull() {
            addCriterion("unqualified_desc is not null");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedDescEqualTo(String value) {
            addCriterion("unqualified_desc =", value, "unqualifiedDesc");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedDescNotEqualTo(String value) {
            addCriterion("unqualified_desc <>", value, "unqualifiedDesc");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedDescGreaterThan(String value) {
            addCriterion("unqualified_desc >", value, "unqualifiedDesc");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedDescGreaterThanOrEqualTo(String value) {
            addCriterion("unqualified_desc >=", value, "unqualifiedDesc");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedDescLessThan(String value) {
            addCriterion("unqualified_desc <", value, "unqualifiedDesc");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedDescLessThanOrEqualTo(String value) {
            addCriterion("unqualified_desc <=", value, "unqualifiedDesc");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedDescLike(String value) {
            addCriterion("unqualified_desc like", value, "unqualifiedDesc");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedDescNotLike(String value) {
            addCriterion("unqualified_desc not like", value, "unqualifiedDesc");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedDescIn(List<String> values) {
            addCriterion("unqualified_desc in", values, "unqualifiedDesc");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedDescNotIn(List<String> values) {
            addCriterion("unqualified_desc not in", values, "unqualifiedDesc");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedDescBetween(String value1, String value2) {
            addCriterion("unqualified_desc between", value1, value2, "unqualifiedDesc");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedDescNotBetween(String value1, String value2) {
            addCriterion("unqualified_desc not between", value1, value2, "unqualifiedDesc");
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

        public Criteria andUnqualifiedTypeIsNull() {
            addCriterion("unqualified_type is null");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedTypeIsNotNull() {
            addCriterion("unqualified_type is not null");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedTypeEqualTo(Short value) {
            addCriterion("unqualified_type =", value, "unqualifiedType");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedTypeNotEqualTo(Short value) {
            addCriterion("unqualified_type <>", value, "unqualifiedType");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedTypeGreaterThan(Short value) {
            addCriterion("unqualified_type >", value, "unqualifiedType");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("unqualified_type >=", value, "unqualifiedType");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedTypeLessThan(Short value) {
            addCriterion("unqualified_type <", value, "unqualifiedType");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedTypeLessThanOrEqualTo(Short value) {
            addCriterion("unqualified_type <=", value, "unqualifiedType");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedTypeIn(List<Short> values) {
            addCriterion("unqualified_type in", values, "unqualifiedType");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedTypeNotIn(List<Short> values) {
            addCriterion("unqualified_type not in", values, "unqualifiedType");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedTypeBetween(Short value1, Short value2) {
            addCriterion("unqualified_type between", value1, value2, "unqualifiedType");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedTypeNotBetween(Short value1, Short value2) {
            addCriterion("unqualified_type not between", value1, value2, "unqualifiedType");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeIsNull() {
            addCriterion("quality_inspect_type is null");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeIsNotNull() {
            addCriterion("quality_inspect_type is not null");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeEqualTo(String value) {
            addCriterion("quality_inspect_type =", value, "qualityInspectType");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeNotEqualTo(String value) {
            addCriterion("quality_inspect_type <>", value, "qualityInspectType");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeGreaterThan(String value) {
            addCriterion("quality_inspect_type >", value, "qualityInspectType");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("quality_inspect_type >=", value, "qualityInspectType");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeLessThan(String value) {
            addCriterion("quality_inspect_type <", value, "qualityInspectType");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeLessThanOrEqualTo(String value) {
            addCriterion("quality_inspect_type <=", value, "qualityInspectType");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeLike(String value) {
            addCriterion("quality_inspect_type like", value, "qualityInspectType");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeNotLike(String value) {
            addCriterion("quality_inspect_type not like", value, "qualityInspectType");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeIn(List<String> values) {
            addCriterion("quality_inspect_type in", values, "qualityInspectType");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeNotIn(List<String> values) {
            addCriterion("quality_inspect_type not in", values, "qualityInspectType");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeBetween(String value1, String value2) {
            addCriterion("quality_inspect_type between", value1, value2, "qualityInspectType");
            return (Criteria) this;
        }

        public Criteria andQualityInspectTypeNotBetween(String value1, String value2) {
            addCriterion("quality_inspect_type not between", value1, value2, "qualityInspectType");
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