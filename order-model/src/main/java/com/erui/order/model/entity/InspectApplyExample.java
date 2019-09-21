package com.erui.order.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InspectApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InspectApplyExample() {
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

        public Criteria andInspectApplyNoIsNull() {
            addCriterion("inspect_apply_no is null");
            return (Criteria) this;
        }

        public Criteria andInspectApplyNoIsNotNull() {
            addCriterion("inspect_apply_no is not null");
            return (Criteria) this;
        }

        public Criteria andInspectApplyNoEqualTo(String value) {
            addCriterion("inspect_apply_no =", value, "inspectApplyNo");
            return (Criteria) this;
        }

        public Criteria andInspectApplyNoNotEqualTo(String value) {
            addCriterion("inspect_apply_no <>", value, "inspectApplyNo");
            return (Criteria) this;
        }

        public Criteria andInspectApplyNoGreaterThan(String value) {
            addCriterion("inspect_apply_no >", value, "inspectApplyNo");
            return (Criteria) this;
        }

        public Criteria andInspectApplyNoGreaterThanOrEqualTo(String value) {
            addCriterion("inspect_apply_no >=", value, "inspectApplyNo");
            return (Criteria) this;
        }

        public Criteria andInspectApplyNoLessThan(String value) {
            addCriterion("inspect_apply_no <", value, "inspectApplyNo");
            return (Criteria) this;
        }

        public Criteria andInspectApplyNoLessThanOrEqualTo(String value) {
            addCriterion("inspect_apply_no <=", value, "inspectApplyNo");
            return (Criteria) this;
        }

        public Criteria andInspectApplyNoLike(String value) {
            addCriterion("inspect_apply_no like", value, "inspectApplyNo");
            return (Criteria) this;
        }

        public Criteria andInspectApplyNoNotLike(String value) {
            addCriterion("inspect_apply_no not like", value, "inspectApplyNo");
            return (Criteria) this;
        }

        public Criteria andInspectApplyNoIn(List<String> values) {
            addCriterion("inspect_apply_no in", values, "inspectApplyNo");
            return (Criteria) this;
        }

        public Criteria andInspectApplyNoNotIn(List<String> values) {
            addCriterion("inspect_apply_no not in", values, "inspectApplyNo");
            return (Criteria) this;
        }

        public Criteria andInspectApplyNoBetween(String value1, String value2) {
            addCriterion("inspect_apply_no between", value1, value2, "inspectApplyNo");
            return (Criteria) this;
        }

        public Criteria andInspectApplyNoNotBetween(String value1, String value2) {
            addCriterion("inspect_apply_no not between", value1, value2, "inspectApplyNo");
            return (Criteria) this;
        }

        public Criteria andPurchNoIsNull() {
            addCriterion("purch_no is null");
            return (Criteria) this;
        }

        public Criteria andPurchNoIsNotNull() {
            addCriterion("purch_no is not null");
            return (Criteria) this;
        }

        public Criteria andPurchNoEqualTo(String value) {
            addCriterion("purch_no =", value, "purchNo");
            return (Criteria) this;
        }

        public Criteria andPurchNoNotEqualTo(String value) {
            addCriterion("purch_no <>", value, "purchNo");
            return (Criteria) this;
        }

        public Criteria andPurchNoGreaterThan(String value) {
            addCriterion("purch_no >", value, "purchNo");
            return (Criteria) this;
        }

        public Criteria andPurchNoGreaterThanOrEqualTo(String value) {
            addCriterion("purch_no >=", value, "purchNo");
            return (Criteria) this;
        }

        public Criteria andPurchNoLessThan(String value) {
            addCriterion("purch_no <", value, "purchNo");
            return (Criteria) this;
        }

        public Criteria andPurchNoLessThanOrEqualTo(String value) {
            addCriterion("purch_no <=", value, "purchNo");
            return (Criteria) this;
        }

        public Criteria andPurchNoLike(String value) {
            addCriterion("purch_no like", value, "purchNo");
            return (Criteria) this;
        }

        public Criteria andPurchNoNotLike(String value) {
            addCriterion("purch_no not like", value, "purchNo");
            return (Criteria) this;
        }

        public Criteria andPurchNoIn(List<String> values) {
            addCriterion("purch_no in", values, "purchNo");
            return (Criteria) this;
        }

        public Criteria andPurchNoNotIn(List<String> values) {
            addCriterion("purch_no not in", values, "purchNo");
            return (Criteria) this;
        }

        public Criteria andPurchNoBetween(String value1, String value2) {
            addCriterion("purch_no between", value1, value2, "purchNo");
            return (Criteria) this;
        }

        public Criteria andPurchNoNotBetween(String value1, String value2) {
            addCriterion("purch_no not between", value1, value2, "purchNo");
            return (Criteria) this;
        }

        public Criteria andPurchIdIsNull() {
            addCriterion("purch_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchIdIsNotNull() {
            addCriterion("purch_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchIdEqualTo(Long value) {
            addCriterion("purch_id =", value, "purchId");
            return (Criteria) this;
        }

        public Criteria andPurchIdNotEqualTo(Long value) {
            addCriterion("purch_id <>", value, "purchId");
            return (Criteria) this;
        }

        public Criteria andPurchIdGreaterThan(Long value) {
            addCriterion("purch_id >", value, "purchId");
            return (Criteria) this;
        }

        public Criteria andPurchIdGreaterThanOrEqualTo(Long value) {
            addCriterion("purch_id >=", value, "purchId");
            return (Criteria) this;
        }

        public Criteria andPurchIdLessThan(Long value) {
            addCriterion("purch_id <", value, "purchId");
            return (Criteria) this;
        }

        public Criteria andPurchIdLessThanOrEqualTo(Long value) {
            addCriterion("purch_id <=", value, "purchId");
            return (Criteria) this;
        }

        public Criteria andPurchIdIn(List<Long> values) {
            addCriterion("purch_id in", values, "purchId");
            return (Criteria) this;
        }

        public Criteria andPurchIdNotIn(List<Long> values) {
            addCriterion("purch_id not in", values, "purchId");
            return (Criteria) this;
        }

        public Criteria andPurchIdBetween(Long value1, Long value2) {
            addCriterion("purch_id between", value1, value2, "purchId");
            return (Criteria) this;
        }

        public Criteria andPurchIdNotBetween(Long value1, Long value2) {
            addCriterion("purch_id not between", value1, value2, "purchId");
            return (Criteria) this;
        }

        public Criteria andMasteerIsNull() {
            addCriterion("masteer is null");
            return (Criteria) this;
        }

        public Criteria andMasteerIsNotNull() {
            addCriterion("masteer is not null");
            return (Criteria) this;
        }

        public Criteria andMasteerEqualTo(Boolean value) {
            addCriterion("masteer =", value, "masteer");
            return (Criteria) this;
        }

        public Criteria andMasteerNotEqualTo(Boolean value) {
            addCriterion("masteer <>", value, "masteer");
            return (Criteria) this;
        }

        public Criteria andMasteerGreaterThan(Boolean value) {
            addCriterion("masteer >", value, "masteer");
            return (Criteria) this;
        }

        public Criteria andMasteerGreaterThanOrEqualTo(Boolean value) {
            addCriterion("masteer >=", value, "masteer");
            return (Criteria) this;
        }

        public Criteria andMasteerLessThan(Boolean value) {
            addCriterion("masteer <", value, "masteer");
            return (Criteria) this;
        }

        public Criteria andMasteerLessThanOrEqualTo(Boolean value) {
            addCriterion("masteer <=", value, "masteer");
            return (Criteria) this;
        }

        public Criteria andMasteerIn(List<Boolean> values) {
            addCriterion("masteer in", values, "masteer");
            return (Criteria) this;
        }

        public Criteria andMasteerNotIn(List<Boolean> values) {
            addCriterion("masteer not in", values, "masteer");
            return (Criteria) this;
        }

        public Criteria andMasteerBetween(Boolean value1, Boolean value2) {
            addCriterion("masteer between", value1, value2, "masteer");
            return (Criteria) this;
        }

        public Criteria andMasteerNotBetween(Boolean value1, Boolean value2) {
            addCriterion("masteer not between", value1, value2, "masteer");
            return (Criteria) this;
        }

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Long value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Long value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Long value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Long value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Long value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Long value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Long> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Long> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Long value1, Long value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Long value1, Long value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameIdIsNull() {
            addCriterion("purchase_name_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameIdIsNotNull() {
            addCriterion("purchase_name_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameIdEqualTo(Long value) {
            addCriterion("purchase_name_id =", value, "purchaseNameId");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameIdNotEqualTo(Long value) {
            addCriterion("purchase_name_id <>", value, "purchaseNameId");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameIdGreaterThan(Long value) {
            addCriterion("purchase_name_id >", value, "purchaseNameId");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameIdGreaterThanOrEqualTo(Long value) {
            addCriterion("purchase_name_id >=", value, "purchaseNameId");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameIdLessThan(Long value) {
            addCriterion("purchase_name_id <", value, "purchaseNameId");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameIdLessThanOrEqualTo(Long value) {
            addCriterion("purchase_name_id <=", value, "purchaseNameId");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameIdIn(List<Long> values) {
            addCriterion("purchase_name_id in", values, "purchaseNameId");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameIdNotIn(List<Long> values) {
            addCriterion("purchase_name_id not in", values, "purchaseNameId");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameIdBetween(Long value1, Long value2) {
            addCriterion("purchase_name_id between", value1, value2, "purchaseNameId");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameIdNotBetween(Long value1, Long value2) {
            addCriterion("purchase_name_id not between", value1, value2, "purchaseNameId");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNull() {
            addCriterion("supplier_name is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("supplier_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("supplier_name =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("supplier_name <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("supplier_name >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_name >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("supplier_name <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("supplier_name <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("supplier_name like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("supplier_name not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("supplier_name in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("supplier_name not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("supplier_name between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("supplier_name not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andInspectDateIsNull() {
            addCriterion("inspect_date is null");
            return (Criteria) this;
        }

        public Criteria andInspectDateIsNotNull() {
            addCriterion("inspect_date is not null");
            return (Criteria) this;
        }

        public Criteria andInspectDateEqualTo(Date value) {
            addCriterionForJDBCDate("inspect_date =", value, "inspectDate");
            return (Criteria) this;
        }

        public Criteria andInspectDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("inspect_date <>", value, "inspectDate");
            return (Criteria) this;
        }

        public Criteria andInspectDateGreaterThan(Date value) {
            addCriterionForJDBCDate("inspect_date >", value, "inspectDate");
            return (Criteria) this;
        }

        public Criteria andInspectDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("inspect_date >=", value, "inspectDate");
            return (Criteria) this;
        }

        public Criteria andInspectDateLessThan(Date value) {
            addCriterionForJDBCDate("inspect_date <", value, "inspectDate");
            return (Criteria) this;
        }

        public Criteria andInspectDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("inspect_date <=", value, "inspectDate");
            return (Criteria) this;
        }

        public Criteria andInspectDateIn(List<Date> values) {
            addCriterionForJDBCDate("inspect_date in", values, "inspectDate");
            return (Criteria) this;
        }

        public Criteria andInspectDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("inspect_date not in", values, "inspectDate");
            return (Criteria) this;
        }

        public Criteria andInspectDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("inspect_date between", value1, value2, "inspectDate");
            return (Criteria) this;
        }

        public Criteria andInspectDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("inspect_date not between", value1, value2, "inspectDate");
            return (Criteria) this;
        }

        public Criteria andEnterEruiWarehouseIsNull() {
            addCriterion("enter_erui_warehouse is null");
            return (Criteria) this;
        }

        public Criteria andEnterEruiWarehouseIsNotNull() {
            addCriterion("enter_erui_warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andEnterEruiWarehouseEqualTo(Boolean value) {
            addCriterion("enter_erui_warehouse =", value, "enterEruiWarehouse");
            return (Criteria) this;
        }

        public Criteria andEnterEruiWarehouseNotEqualTo(Boolean value) {
            addCriterion("enter_erui_warehouse <>", value, "enterEruiWarehouse");
            return (Criteria) this;
        }

        public Criteria andEnterEruiWarehouseGreaterThan(Boolean value) {
            addCriterion("enter_erui_warehouse >", value, "enterEruiWarehouse");
            return (Criteria) this;
        }

        public Criteria andEnterEruiWarehouseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enter_erui_warehouse >=", value, "enterEruiWarehouse");
            return (Criteria) this;
        }

        public Criteria andEnterEruiWarehouseLessThan(Boolean value) {
            addCriterion("enter_erui_warehouse <", value, "enterEruiWarehouse");
            return (Criteria) this;
        }

        public Criteria andEnterEruiWarehouseLessThanOrEqualTo(Boolean value) {
            addCriterion("enter_erui_warehouse <=", value, "enterEruiWarehouse");
            return (Criteria) this;
        }

        public Criteria andEnterEruiWarehouseIn(List<Boolean> values) {
            addCriterion("enter_erui_warehouse in", values, "enterEruiWarehouse");
            return (Criteria) this;
        }

        public Criteria andEnterEruiWarehouseNotIn(List<Boolean> values) {
            addCriterion("enter_erui_warehouse not in", values, "enterEruiWarehouse");
            return (Criteria) this;
        }

        public Criteria andEnterEruiWarehouseBetween(Boolean value1, Boolean value2) {
            addCriterion("enter_erui_warehouse between", value1, value2, "enterEruiWarehouse");
            return (Criteria) this;
        }

        public Criteria andEnterEruiWarehouseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enter_erui_warehouse not between", value1, value2, "enterEruiWarehouse");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andHistoryIsNull() {
            addCriterion("history is null");
            return (Criteria) this;
        }

        public Criteria andHistoryIsNotNull() {
            addCriterion("history is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryEqualTo(Boolean value) {
            addCriterion("history =", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotEqualTo(Boolean value) {
            addCriterion("history <>", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryGreaterThan(Boolean value) {
            addCriterion("history >", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("history >=", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryLessThan(Boolean value) {
            addCriterion("history <", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryLessThanOrEqualTo(Boolean value) {
            addCriterion("history <=", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryIn(List<Boolean> values) {
            addCriterion("history in", values, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotIn(List<Boolean> values) {
            addCriterion("history not in", values, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryBetween(Boolean value1, Boolean value2) {
            addCriterion("history between", value1, value2, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("history not between", value1, value2, "history");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Short value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Short value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Short value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Short value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Short value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Short value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Short> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Short> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Short value1, Short value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Short value1, Short value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andMsgIsNull() {
            addCriterion("msg is null");
            return (Criteria) this;
        }

        public Criteria andMsgIsNotNull() {
            addCriterion("msg is not null");
            return (Criteria) this;
        }

        public Criteria andMsgEqualTo(String value) {
            addCriterion("msg =", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotEqualTo(String value) {
            addCriterion("msg <>", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThan(String value) {
            addCriterion("msg >", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThanOrEqualTo(String value) {
            addCriterion("msg >=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThan(String value) {
            addCriterion("msg <", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThanOrEqualTo(String value) {
            addCriterion("msg <=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLike(String value) {
            addCriterion("msg like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotLike(String value) {
            addCriterion("msg not like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgIn(List<String> values) {
            addCriterion("msg in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotIn(List<String> values) {
            addCriterion("msg not in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgBetween(String value1, String value2) {
            addCriterion("msg between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotBetween(String value1, String value2) {
            addCriterion("msg not between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andInspectApplyStatusIsNull() {
            addCriterion("inspect_apply_status is null");
            return (Criteria) this;
        }

        public Criteria andInspectApplyStatusIsNotNull() {
            addCriterion("inspect_apply_status is not null");
            return (Criteria) this;
        }

        public Criteria andInspectApplyStatusEqualTo(Short value) {
            addCriterion("inspect_apply_status =", value, "inspectApplyStatus");
            return (Criteria) this;
        }

        public Criteria andInspectApplyStatusNotEqualTo(Short value) {
            addCriterion("inspect_apply_status <>", value, "inspectApplyStatus");
            return (Criteria) this;
        }

        public Criteria andInspectApplyStatusGreaterThan(Short value) {
            addCriterion("inspect_apply_status >", value, "inspectApplyStatus");
            return (Criteria) this;
        }

        public Criteria andInspectApplyStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("inspect_apply_status >=", value, "inspectApplyStatus");
            return (Criteria) this;
        }

        public Criteria andInspectApplyStatusLessThan(Short value) {
            addCriterion("inspect_apply_status <", value, "inspectApplyStatus");
            return (Criteria) this;
        }

        public Criteria andInspectApplyStatusLessThanOrEqualTo(Short value) {
            addCriterion("inspect_apply_status <=", value, "inspectApplyStatus");
            return (Criteria) this;
        }

        public Criteria andInspectApplyStatusIn(List<Short> values) {
            addCriterion("inspect_apply_status in", values, "inspectApplyStatus");
            return (Criteria) this;
        }

        public Criteria andInspectApplyStatusNotIn(List<Short> values) {
            addCriterion("inspect_apply_status not in", values, "inspectApplyStatus");
            return (Criteria) this;
        }

        public Criteria andInspectApplyStatusBetween(Short value1, Short value2) {
            addCriterion("inspect_apply_status between", value1, value2, "inspectApplyStatus");
            return (Criteria) this;
        }

        public Criteria andInspectApplyStatusNotBetween(Short value1, Short value2) {
            addCriterion("inspect_apply_status not between", value1, value2, "inspectApplyStatus");
            return (Criteria) this;
        }

        public Criteria andTmpMsgIsNull() {
            addCriterion("tmp_msg is null");
            return (Criteria) this;
        }

        public Criteria andTmpMsgIsNotNull() {
            addCriterion("tmp_msg is not null");
            return (Criteria) this;
        }

        public Criteria andTmpMsgEqualTo(String value) {
            addCriterion("tmp_msg =", value, "tmpMsg");
            return (Criteria) this;
        }

        public Criteria andTmpMsgNotEqualTo(String value) {
            addCriterion("tmp_msg <>", value, "tmpMsg");
            return (Criteria) this;
        }

        public Criteria andTmpMsgGreaterThan(String value) {
            addCriterion("tmp_msg >", value, "tmpMsg");
            return (Criteria) this;
        }

        public Criteria andTmpMsgGreaterThanOrEqualTo(String value) {
            addCriterion("tmp_msg >=", value, "tmpMsg");
            return (Criteria) this;
        }

        public Criteria andTmpMsgLessThan(String value) {
            addCriterion("tmp_msg <", value, "tmpMsg");
            return (Criteria) this;
        }

        public Criteria andTmpMsgLessThanOrEqualTo(String value) {
            addCriterion("tmp_msg <=", value, "tmpMsg");
            return (Criteria) this;
        }

        public Criteria andTmpMsgLike(String value) {
            addCriterion("tmp_msg like", value, "tmpMsg");
            return (Criteria) this;
        }

        public Criteria andTmpMsgNotLike(String value) {
            addCriterion("tmp_msg not like", value, "tmpMsg");
            return (Criteria) this;
        }

        public Criteria andTmpMsgIn(List<String> values) {
            addCriterion("tmp_msg in", values, "tmpMsg");
            return (Criteria) this;
        }

        public Criteria andTmpMsgNotIn(List<String> values) {
            addCriterion("tmp_msg not in", values, "tmpMsg");
            return (Criteria) this;
        }

        public Criteria andTmpMsgBetween(String value1, String value2) {
            addCriterion("tmp_msg between", value1, value2, "tmpMsg");
            return (Criteria) this;
        }

        public Criteria andTmpMsgNotBetween(String value1, String value2) {
            addCriterion("tmp_msg not between", value1, value2, "tmpMsg");
            return (Criteria) this;
        }

        public Criteria andPubStatusIsNull() {
            addCriterion("pub_status is null");
            return (Criteria) this;
        }

        public Criteria andPubStatusIsNotNull() {
            addCriterion("pub_status is not null");
            return (Criteria) this;
        }

        public Criteria andPubStatusEqualTo(Short value) {
            addCriterion("pub_status =", value, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusNotEqualTo(Short value) {
            addCriterion("pub_status <>", value, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusGreaterThan(Short value) {
            addCriterion("pub_status >", value, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("pub_status >=", value, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusLessThan(Short value) {
            addCriterion("pub_status <", value, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusLessThanOrEqualTo(Short value) {
            addCriterion("pub_status <=", value, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusIn(List<Short> values) {
            addCriterion("pub_status in", values, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusNotIn(List<Short> values) {
            addCriterion("pub_status not in", values, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusBetween(Short value1, Short value2) {
            addCriterion("pub_status between", value1, value2, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusNotBetween(Short value1, Short value2) {
            addCriterion("pub_status not between", value1, value2, "pubStatus");
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