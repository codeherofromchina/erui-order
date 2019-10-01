package com.erui.order.model.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchContractGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchContractGoodsExample() {
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

        public Criteria andPurchRequisitionGoodsIdIsNull() {
            addCriterion("purch_requisition_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionGoodsIdIsNotNull() {
            addCriterion("purch_requisition_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionGoodsIdEqualTo(Long value) {
            addCriterion("purch_requisition_goods_id =", value, "purchRequisitionGoodsId");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionGoodsIdNotEqualTo(Long value) {
            addCriterion("purch_requisition_goods_id <>", value, "purchRequisitionGoodsId");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionGoodsIdGreaterThan(Long value) {
            addCriterion("purch_requisition_goods_id >", value, "purchRequisitionGoodsId");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("purch_requisition_goods_id >=", value, "purchRequisitionGoodsId");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionGoodsIdLessThan(Long value) {
            addCriterion("purch_requisition_goods_id <", value, "purchRequisitionGoodsId");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("purch_requisition_goods_id <=", value, "purchRequisitionGoodsId");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionGoodsIdIn(List<Long> values) {
            addCriterion("purch_requisition_goods_id in", values, "purchRequisitionGoodsId");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionGoodsIdNotIn(List<Long> values) {
            addCriterion("purch_requisition_goods_id not in", values, "purchRequisitionGoodsId");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionGoodsIdBetween(Long value1, Long value2) {
            addCriterion("purch_requisition_goods_id between", value1, value2, "purchRequisitionGoodsId");
            return (Criteria) this;
        }

        public Criteria andPurchRequisitionGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("purch_requisition_goods_id not between", value1, value2, "purchRequisitionGoodsId");
            return (Criteria) this;
        }

        public Criteria andPurchContractBrandIsNull() {
            addCriterion("purch_contract_brand is null");
            return (Criteria) this;
        }

        public Criteria andPurchContractBrandIsNotNull() {
            addCriterion("purch_contract_brand is not null");
            return (Criteria) this;
        }

        public Criteria andPurchContractBrandEqualTo(String value) {
            addCriterion("purch_contract_brand =", value, "purchContractBrand");
            return (Criteria) this;
        }

        public Criteria andPurchContractBrandNotEqualTo(String value) {
            addCriterion("purch_contract_brand <>", value, "purchContractBrand");
            return (Criteria) this;
        }

        public Criteria andPurchContractBrandGreaterThan(String value) {
            addCriterion("purch_contract_brand >", value, "purchContractBrand");
            return (Criteria) this;
        }

        public Criteria andPurchContractBrandGreaterThanOrEqualTo(String value) {
            addCriterion("purch_contract_brand >=", value, "purchContractBrand");
            return (Criteria) this;
        }

        public Criteria andPurchContractBrandLessThan(String value) {
            addCriterion("purch_contract_brand <", value, "purchContractBrand");
            return (Criteria) this;
        }

        public Criteria andPurchContractBrandLessThanOrEqualTo(String value) {
            addCriterion("purch_contract_brand <=", value, "purchContractBrand");
            return (Criteria) this;
        }

        public Criteria andPurchContractBrandLike(String value) {
            addCriterion("purch_contract_brand like", value, "purchContractBrand");
            return (Criteria) this;
        }

        public Criteria andPurchContractBrandNotLike(String value) {
            addCriterion("purch_contract_brand not like", value, "purchContractBrand");
            return (Criteria) this;
        }

        public Criteria andPurchContractBrandIn(List<String> values) {
            addCriterion("purch_contract_brand in", values, "purchContractBrand");
            return (Criteria) this;
        }

        public Criteria andPurchContractBrandNotIn(List<String> values) {
            addCriterion("purch_contract_brand not in", values, "purchContractBrand");
            return (Criteria) this;
        }

        public Criteria andPurchContractBrandBetween(String value1, String value2) {
            addCriterion("purch_contract_brand between", value1, value2, "purchContractBrand");
            return (Criteria) this;
        }

        public Criteria andPurchContractBrandNotBetween(String value1, String value2) {
            addCriterion("purch_contract_brand not between", value1, value2, "purchContractBrand");
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

        public Criteria andNonTaxPriceIsNull() {
            addCriterion("non_tax_price is null");
            return (Criteria) this;
        }

        public Criteria andNonTaxPriceIsNotNull() {
            addCriterion("non_tax_price is not null");
            return (Criteria) this;
        }

        public Criteria andNonTaxPriceEqualTo(BigDecimal value) {
            addCriterion("non_tax_price =", value, "nonTaxPrice");
            return (Criteria) this;
        }

        public Criteria andNonTaxPriceNotEqualTo(BigDecimal value) {
            addCriterion("non_tax_price <>", value, "nonTaxPrice");
            return (Criteria) this;
        }

        public Criteria andNonTaxPriceGreaterThan(BigDecimal value) {
            addCriterion("non_tax_price >", value, "nonTaxPrice");
            return (Criteria) this;
        }

        public Criteria andNonTaxPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("non_tax_price >=", value, "nonTaxPrice");
            return (Criteria) this;
        }

        public Criteria andNonTaxPriceLessThan(BigDecimal value) {
            addCriterion("non_tax_price <", value, "nonTaxPrice");
            return (Criteria) this;
        }

        public Criteria andNonTaxPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("non_tax_price <=", value, "nonTaxPrice");
            return (Criteria) this;
        }

        public Criteria andNonTaxPriceIn(List<BigDecimal> values) {
            addCriterion("non_tax_price in", values, "nonTaxPrice");
            return (Criteria) this;
        }

        public Criteria andNonTaxPriceNotIn(List<BigDecimal> values) {
            addCriterion("non_tax_price not in", values, "nonTaxPrice");
            return (Criteria) this;
        }

        public Criteria andNonTaxPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("non_tax_price between", value1, value2, "nonTaxPrice");
            return (Criteria) this;
        }

        public Criteria andNonTaxPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("non_tax_price not between", value1, value2, "nonTaxPrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIsNull() {
            addCriterion("purchase_price is null");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIsNotNull() {
            addCriterion("purchase_price is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceEqualTo(BigDecimal value) {
            addCriterion("purchase_price =", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotEqualTo(BigDecimal value) {
            addCriterion("purchase_price <>", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceGreaterThan(BigDecimal value) {
            addCriterion("purchase_price >", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_price >=", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceLessThan(BigDecimal value) {
            addCriterion("purchase_price <", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_price <=", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIn(List<BigDecimal> values) {
            addCriterion("purchase_price in", values, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotIn(List<BigDecimal> values) {
            addCriterion("purchase_price not in", values, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_price between", value1, value2, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_price not between", value1, value2, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalPriceIsNull() {
            addCriterion("purchase_total_price is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalPriceIsNotNull() {
            addCriterion("purchase_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalPriceEqualTo(BigDecimal value) {
            addCriterion("purchase_total_price =", value, "purchaseTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("purchase_total_price <>", value, "purchaseTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("purchase_total_price >", value, "purchaseTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_total_price >=", value, "purchaseTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalPriceLessThan(BigDecimal value) {
            addCriterion("purchase_total_price <", value, "purchaseTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_total_price <=", value, "purchaseTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalPriceIn(List<BigDecimal> values) {
            addCriterion("purchase_total_price in", values, "purchaseTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("purchase_total_price not in", values, "purchaseTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_total_price between", value1, value2, "purchaseTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_total_price not between", value1, value2, "purchaseTotalPrice");
            return (Criteria) this;
        }

        public Criteria andPrePurchasedNumIsNull() {
            addCriterion("pre_purchased_num is null");
            return (Criteria) this;
        }

        public Criteria andPrePurchasedNumIsNotNull() {
            addCriterion("pre_purchased_num is not null");
            return (Criteria) this;
        }

        public Criteria andPrePurchasedNumEqualTo(Integer value) {
            addCriterion("pre_purchased_num =", value, "prePurchasedNum");
            return (Criteria) this;
        }

        public Criteria andPrePurchasedNumNotEqualTo(Integer value) {
            addCriterion("pre_purchased_num <>", value, "prePurchasedNum");
            return (Criteria) this;
        }

        public Criteria andPrePurchasedNumGreaterThan(Integer value) {
            addCriterion("pre_purchased_num >", value, "prePurchasedNum");
            return (Criteria) this;
        }

        public Criteria andPrePurchasedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pre_purchased_num >=", value, "prePurchasedNum");
            return (Criteria) this;
        }

        public Criteria andPrePurchasedNumLessThan(Integer value) {
            addCriterion("pre_purchased_num <", value, "prePurchasedNum");
            return (Criteria) this;
        }

        public Criteria andPrePurchasedNumLessThanOrEqualTo(Integer value) {
            addCriterion("pre_purchased_num <=", value, "prePurchasedNum");
            return (Criteria) this;
        }

        public Criteria andPrePurchasedNumIn(List<Integer> values) {
            addCriterion("pre_purchased_num in", values, "prePurchasedNum");
            return (Criteria) this;
        }

        public Criteria andPrePurchasedNumNotIn(List<Integer> values) {
            addCriterion("pre_purchased_num not in", values, "prePurchasedNum");
            return (Criteria) this;
        }

        public Criteria andPrePurchasedNumBetween(Integer value1, Integer value2) {
            addCriterion("pre_purchased_num between", value1, value2, "prePurchasedNum");
            return (Criteria) this;
        }

        public Criteria andPrePurchasedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("pre_purchased_num not between", value1, value2, "prePurchasedNum");
            return (Criteria) this;
        }

        public Criteria andPurchasedNumIsNull() {
            addCriterion("purchased_num is null");
            return (Criteria) this;
        }

        public Criteria andPurchasedNumIsNotNull() {
            addCriterion("purchased_num is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasedNumEqualTo(Integer value) {
            addCriterion("purchased_num =", value, "purchasedNum");
            return (Criteria) this;
        }

        public Criteria andPurchasedNumNotEqualTo(Integer value) {
            addCriterion("purchased_num <>", value, "purchasedNum");
            return (Criteria) this;
        }

        public Criteria andPurchasedNumGreaterThan(Integer value) {
            addCriterion("purchased_num >", value, "purchasedNum");
            return (Criteria) this;
        }

        public Criteria andPurchasedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchased_num >=", value, "purchasedNum");
            return (Criteria) this;
        }

        public Criteria andPurchasedNumLessThan(Integer value) {
            addCriterion("purchased_num <", value, "purchasedNum");
            return (Criteria) this;
        }

        public Criteria andPurchasedNumLessThanOrEqualTo(Integer value) {
            addCriterion("purchased_num <=", value, "purchasedNum");
            return (Criteria) this;
        }

        public Criteria andPurchasedNumIn(List<Integer> values) {
            addCriterion("purchased_num in", values, "purchasedNum");
            return (Criteria) this;
        }

        public Criteria andPurchasedNumNotIn(List<Integer> values) {
            addCriterion("purchased_num not in", values, "purchasedNum");
            return (Criteria) this;
        }

        public Criteria andPurchasedNumBetween(Integer value1, Integer value2) {
            addCriterion("purchased_num between", value1, value2, "purchasedNum");
            return (Criteria) this;
        }

        public Criteria andPurchasedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("purchased_num not between", value1, value2, "purchasedNum");
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