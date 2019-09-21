package com.erui.order.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InspectReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InspectReportExample() {
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

        public Criteria andProjectNoIsNull() {
            addCriterion("project_no is null");
            return (Criteria) this;
        }

        public Criteria andProjectNoIsNotNull() {
            addCriterion("project_no is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNoEqualTo(String value) {
            addCriterion("project_no =", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotEqualTo(String value) {
            addCriterion("project_no <>", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoGreaterThan(String value) {
            addCriterion("project_no >", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoGreaterThanOrEqualTo(String value) {
            addCriterion("project_no >=", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoLessThan(String value) {
            addCriterion("project_no <", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoLessThanOrEqualTo(String value) {
            addCriterion("project_no <=", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoLike(String value) {
            addCriterion("project_no like", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotLike(String value) {
            addCriterion("project_no not like", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoIn(List<String> values) {
            addCriterion("project_no in", values, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotIn(List<String> values) {
            addCriterion("project_no not in", values, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoBetween(String value1, String value2) {
            addCriterion("project_no between", value1, value2, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotBetween(String value1, String value2) {
            addCriterion("project_no not between", value1, value2, "projectNo");
            return (Criteria) this;
        }

        public Criteria andNcrNoIsNull() {
            addCriterion("ncr_no is null");
            return (Criteria) this;
        }

        public Criteria andNcrNoIsNotNull() {
            addCriterion("ncr_no is not null");
            return (Criteria) this;
        }

        public Criteria andNcrNoEqualTo(String value) {
            addCriterion("ncr_no =", value, "ncrNo");
            return (Criteria) this;
        }

        public Criteria andNcrNoNotEqualTo(String value) {
            addCriterion("ncr_no <>", value, "ncrNo");
            return (Criteria) this;
        }

        public Criteria andNcrNoGreaterThan(String value) {
            addCriterion("ncr_no >", value, "ncrNo");
            return (Criteria) this;
        }

        public Criteria andNcrNoGreaterThanOrEqualTo(String value) {
            addCriterion("ncr_no >=", value, "ncrNo");
            return (Criteria) this;
        }

        public Criteria andNcrNoLessThan(String value) {
            addCriterion("ncr_no <", value, "ncrNo");
            return (Criteria) this;
        }

        public Criteria andNcrNoLessThanOrEqualTo(String value) {
            addCriterion("ncr_no <=", value, "ncrNo");
            return (Criteria) this;
        }

        public Criteria andNcrNoLike(String value) {
            addCriterion("ncr_no like", value, "ncrNo");
            return (Criteria) this;
        }

        public Criteria andNcrNoNotLike(String value) {
            addCriterion("ncr_no not like", value, "ncrNo");
            return (Criteria) this;
        }

        public Criteria andNcrNoIn(List<String> values) {
            addCriterion("ncr_no in", values, "ncrNo");
            return (Criteria) this;
        }

        public Criteria andNcrNoNotIn(List<String> values) {
            addCriterion("ncr_no not in", values, "ncrNo");
            return (Criteria) this;
        }

        public Criteria andNcrNoBetween(String value1, String value2) {
            addCriterion("ncr_no between", value1, value2, "ncrNo");
            return (Criteria) this;
        }

        public Criteria andNcrNoNotBetween(String value1, String value2) {
            addCriterion("ncr_no not between", value1, value2, "ncrNo");
            return (Criteria) this;
        }

        public Criteria andCheckTimesIsNull() {
            addCriterion("check_times is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimesIsNotNull() {
            addCriterion("check_times is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimesEqualTo(Short value) {
            addCriterion("check_times =", value, "checkTimes");
            return (Criteria) this;
        }

        public Criteria andCheckTimesNotEqualTo(Short value) {
            addCriterion("check_times <>", value, "checkTimes");
            return (Criteria) this;
        }

        public Criteria andCheckTimesGreaterThan(Short value) {
            addCriterion("check_times >", value, "checkTimes");
            return (Criteria) this;
        }

        public Criteria andCheckTimesGreaterThanOrEqualTo(Short value) {
            addCriterion("check_times >=", value, "checkTimes");
            return (Criteria) this;
        }

        public Criteria andCheckTimesLessThan(Short value) {
            addCriterion("check_times <", value, "checkTimes");
            return (Criteria) this;
        }

        public Criteria andCheckTimesLessThanOrEqualTo(Short value) {
            addCriterion("check_times <=", value, "checkTimes");
            return (Criteria) this;
        }

        public Criteria andCheckTimesIn(List<Short> values) {
            addCriterion("check_times in", values, "checkTimes");
            return (Criteria) this;
        }

        public Criteria andCheckTimesNotIn(List<Short> values) {
            addCriterion("check_times not in", values, "checkTimes");
            return (Criteria) this;
        }

        public Criteria andCheckTimesBetween(Short value1, Short value2) {
            addCriterion("check_times between", value1, value2, "checkTimes");
            return (Criteria) this;
        }

        public Criteria andCheckTimesNotBetween(Short value1, Short value2) {
            addCriterion("check_times not between", value1, value2, "checkTimes");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNull() {
            addCriterion("check_date is null");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNotNull() {
            addCriterion("check_date is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDateEqualTo(Date value) {
            addCriterionForJDBCDate("check_date =", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("check_date <>", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThan(Date value) {
            addCriterionForJDBCDate("check_date >", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("check_date >=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThan(Date value) {
            addCriterionForJDBCDate("check_date <", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("check_date <=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateIn(List<Date> values) {
            addCriterionForJDBCDate("check_date in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("check_date not in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("check_date between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("check_date not between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andReportFirstIsNull() {
            addCriterion("report_first is null");
            return (Criteria) this;
        }

        public Criteria andReportFirstIsNotNull() {
            addCriterion("report_first is not null");
            return (Criteria) this;
        }

        public Criteria andReportFirstEqualTo(Boolean value) {
            addCriterion("report_first =", value, "reportFirst");
            return (Criteria) this;
        }

        public Criteria andReportFirstNotEqualTo(Boolean value) {
            addCriterion("report_first <>", value, "reportFirst");
            return (Criteria) this;
        }

        public Criteria andReportFirstGreaterThan(Boolean value) {
            addCriterion("report_first >", value, "reportFirst");
            return (Criteria) this;
        }

        public Criteria andReportFirstGreaterThanOrEqualTo(Boolean value) {
            addCriterion("report_first >=", value, "reportFirst");
            return (Criteria) this;
        }

        public Criteria andReportFirstLessThan(Boolean value) {
            addCriterion("report_first <", value, "reportFirst");
            return (Criteria) this;
        }

        public Criteria andReportFirstLessThanOrEqualTo(Boolean value) {
            addCriterion("report_first <=", value, "reportFirst");
            return (Criteria) this;
        }

        public Criteria andReportFirstIn(List<Boolean> values) {
            addCriterion("report_first in", values, "reportFirst");
            return (Criteria) this;
        }

        public Criteria andReportFirstNotIn(List<Boolean> values) {
            addCriterion("report_first not in", values, "reportFirst");
            return (Criteria) this;
        }

        public Criteria andReportFirstBetween(Boolean value1, Boolean value2) {
            addCriterion("report_first between", value1, value2, "reportFirst");
            return (Criteria) this;
        }

        public Criteria andReportFirstNotBetween(Boolean value1, Boolean value2) {
            addCriterion("report_first not between", value1, value2, "reportFirst");
            return (Criteria) this;
        }

        public Criteria andCheckDeptIdIsNull() {
            addCriterion("check_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andCheckDeptIdIsNotNull() {
            addCriterion("check_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDeptIdEqualTo(Long value) {
            addCriterion("check_dept_id =", value, "checkDeptId");
            return (Criteria) this;
        }

        public Criteria andCheckDeptIdNotEqualTo(Long value) {
            addCriterion("check_dept_id <>", value, "checkDeptId");
            return (Criteria) this;
        }

        public Criteria andCheckDeptIdGreaterThan(Long value) {
            addCriterion("check_dept_id >", value, "checkDeptId");
            return (Criteria) this;
        }

        public Criteria andCheckDeptIdGreaterThanOrEqualTo(Long value) {
            addCriterion("check_dept_id >=", value, "checkDeptId");
            return (Criteria) this;
        }

        public Criteria andCheckDeptIdLessThan(Long value) {
            addCriterion("check_dept_id <", value, "checkDeptId");
            return (Criteria) this;
        }

        public Criteria andCheckDeptIdLessThanOrEqualTo(Long value) {
            addCriterion("check_dept_id <=", value, "checkDeptId");
            return (Criteria) this;
        }

        public Criteria andCheckDeptIdIn(List<Long> values) {
            addCriterion("check_dept_id in", values, "checkDeptId");
            return (Criteria) this;
        }

        public Criteria andCheckDeptIdNotIn(List<Long> values) {
            addCriterion("check_dept_id not in", values, "checkDeptId");
            return (Criteria) this;
        }

        public Criteria andCheckDeptIdBetween(Long value1, Long value2) {
            addCriterion("check_dept_id between", value1, value2, "checkDeptId");
            return (Criteria) this;
        }

        public Criteria andCheckDeptIdNotBetween(Long value1, Long value2) {
            addCriterion("check_dept_id not between", value1, value2, "checkDeptId");
            return (Criteria) this;
        }

        public Criteria andCheckDeptNameIsNull() {
            addCriterion("check_dept_name is null");
            return (Criteria) this;
        }

        public Criteria andCheckDeptNameIsNotNull() {
            addCriterion("check_dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDeptNameEqualTo(String value) {
            addCriterion("check_dept_name =", value, "checkDeptName");
            return (Criteria) this;
        }

        public Criteria andCheckDeptNameNotEqualTo(String value) {
            addCriterion("check_dept_name <>", value, "checkDeptName");
            return (Criteria) this;
        }

        public Criteria andCheckDeptNameGreaterThan(String value) {
            addCriterion("check_dept_name >", value, "checkDeptName");
            return (Criteria) this;
        }

        public Criteria andCheckDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("check_dept_name >=", value, "checkDeptName");
            return (Criteria) this;
        }

        public Criteria andCheckDeptNameLessThan(String value) {
            addCriterion("check_dept_name <", value, "checkDeptName");
            return (Criteria) this;
        }

        public Criteria andCheckDeptNameLessThanOrEqualTo(String value) {
            addCriterion("check_dept_name <=", value, "checkDeptName");
            return (Criteria) this;
        }

        public Criteria andCheckDeptNameLike(String value) {
            addCriterion("check_dept_name like", value, "checkDeptName");
            return (Criteria) this;
        }

        public Criteria andCheckDeptNameNotLike(String value) {
            addCriterion("check_dept_name not like", value, "checkDeptName");
            return (Criteria) this;
        }

        public Criteria andCheckDeptNameIn(List<String> values) {
            addCriterion("check_dept_name in", values, "checkDeptName");
            return (Criteria) this;
        }

        public Criteria andCheckDeptNameNotIn(List<String> values) {
            addCriterion("check_dept_name not in", values, "checkDeptName");
            return (Criteria) this;
        }

        public Criteria andCheckDeptNameBetween(String value1, String value2) {
            addCriterion("check_dept_name between", value1, value2, "checkDeptName");
            return (Criteria) this;
        }

        public Criteria andCheckDeptNameNotBetween(String value1, String value2) {
            addCriterion("check_dept_name not between", value1, value2, "checkDeptName");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdIsNull() {
            addCriterion("check_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdIsNotNull() {
            addCriterion("check_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdEqualTo(Long value) {
            addCriterion("check_user_id =", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdNotEqualTo(Long value) {
            addCriterion("check_user_id <>", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdGreaterThan(Long value) {
            addCriterion("check_user_id >", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("check_user_id >=", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdLessThan(Long value) {
            addCriterion("check_user_id <", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdLessThanOrEqualTo(Long value) {
            addCriterion("check_user_id <=", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdIn(List<Long> values) {
            addCriterion("check_user_id in", values, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdNotIn(List<Long> values) {
            addCriterion("check_user_id not in", values, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdBetween(Long value1, Long value2) {
            addCriterion("check_user_id between", value1, value2, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdNotBetween(Long value1, Long value2) {
            addCriterion("check_user_id not between", value1, value2, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andDoneDateIsNull() {
            addCriterion("done_date is null");
            return (Criteria) this;
        }

        public Criteria andDoneDateIsNotNull() {
            addCriterion("done_date is not null");
            return (Criteria) this;
        }

        public Criteria andDoneDateEqualTo(Date value) {
            addCriterionForJDBCDate("done_date =", value, "doneDate");
            return (Criteria) this;
        }

        public Criteria andDoneDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("done_date <>", value, "doneDate");
            return (Criteria) this;
        }

        public Criteria andDoneDateGreaterThan(Date value) {
            addCriterionForJDBCDate("done_date >", value, "doneDate");
            return (Criteria) this;
        }

        public Criteria andDoneDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("done_date >=", value, "doneDate");
            return (Criteria) this;
        }

        public Criteria andDoneDateLessThan(Date value) {
            addCriterionForJDBCDate("done_date <", value, "doneDate");
            return (Criteria) this;
        }

        public Criteria andDoneDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("done_date <=", value, "doneDate");
            return (Criteria) this;
        }

        public Criteria andDoneDateIn(List<Date> values) {
            addCriterionForJDBCDate("done_date in", values, "doneDate");
            return (Criteria) this;
        }

        public Criteria andDoneDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("done_date not in", values, "doneDate");
            return (Criteria) this;
        }

        public Criteria andDoneDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("done_date between", value1, value2, "doneDate");
            return (Criteria) this;
        }

        public Criteria andDoneDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("done_date not between", value1, value2, "doneDate");
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

        public Criteria andReportProcessIsNull() {
            addCriterion("report_process is null");
            return (Criteria) this;
        }

        public Criteria andReportProcessIsNotNull() {
            addCriterion("report_process is not null");
            return (Criteria) this;
        }

        public Criteria andReportProcessEqualTo(Boolean value) {
            addCriterion("report_process =", value, "reportProcess");
            return (Criteria) this;
        }

        public Criteria andReportProcessNotEqualTo(Boolean value) {
            addCriterion("report_process <>", value, "reportProcess");
            return (Criteria) this;
        }

        public Criteria andReportProcessGreaterThan(Boolean value) {
            addCriterion("report_process >", value, "reportProcess");
            return (Criteria) this;
        }

        public Criteria andReportProcessGreaterThanOrEqualTo(Boolean value) {
            addCriterion("report_process >=", value, "reportProcess");
            return (Criteria) this;
        }

        public Criteria andReportProcessLessThan(Boolean value) {
            addCriterion("report_process <", value, "reportProcess");
            return (Criteria) this;
        }

        public Criteria andReportProcessLessThanOrEqualTo(Boolean value) {
            addCriterion("report_process <=", value, "reportProcess");
            return (Criteria) this;
        }

        public Criteria andReportProcessIn(List<Boolean> values) {
            addCriterion("report_process in", values, "reportProcess");
            return (Criteria) this;
        }

        public Criteria andReportProcessNotIn(List<Boolean> values) {
            addCriterion("report_process not in", values, "reportProcess");
            return (Criteria) this;
        }

        public Criteria andReportProcessBetween(Boolean value1, Boolean value2) {
            addCriterion("report_process between", value1, value2, "reportProcess");
            return (Criteria) this;
        }

        public Criteria andReportProcessNotBetween(Boolean value1, Boolean value2) {
            addCriterion("report_process not between", value1, value2, "reportProcess");
            return (Criteria) this;
        }

        public Criteria andReportRemarksIsNull() {
            addCriterion("report_remarks is null");
            return (Criteria) this;
        }

        public Criteria andReportRemarksIsNotNull() {
            addCriterion("report_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andReportRemarksEqualTo(String value) {
            addCriterion("report_remarks =", value, "reportRemarks");
            return (Criteria) this;
        }

        public Criteria andReportRemarksNotEqualTo(String value) {
            addCriterion("report_remarks <>", value, "reportRemarks");
            return (Criteria) this;
        }

        public Criteria andReportRemarksGreaterThan(String value) {
            addCriterion("report_remarks >", value, "reportRemarks");
            return (Criteria) this;
        }

        public Criteria andReportRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("report_remarks >=", value, "reportRemarks");
            return (Criteria) this;
        }

        public Criteria andReportRemarksLessThan(String value) {
            addCriterion("report_remarks <", value, "reportRemarks");
            return (Criteria) this;
        }

        public Criteria andReportRemarksLessThanOrEqualTo(String value) {
            addCriterion("report_remarks <=", value, "reportRemarks");
            return (Criteria) this;
        }

        public Criteria andReportRemarksLike(String value) {
            addCriterion("report_remarks like", value, "reportRemarks");
            return (Criteria) this;
        }

        public Criteria andReportRemarksNotLike(String value) {
            addCriterion("report_remarks not like", value, "reportRemarks");
            return (Criteria) this;
        }

        public Criteria andReportRemarksIn(List<String> values) {
            addCriterion("report_remarks in", values, "reportRemarks");
            return (Criteria) this;
        }

        public Criteria andReportRemarksNotIn(List<String> values) {
            addCriterion("report_remarks not in", values, "reportRemarks");
            return (Criteria) this;
        }

        public Criteria andReportRemarksBetween(String value1, String value2) {
            addCriterion("report_remarks between", value1, value2, "reportRemarks");
            return (Criteria) this;
        }

        public Criteria andReportRemarksNotBetween(String value1, String value2) {
            addCriterion("report_remarks not between", value1, value2, "reportRemarks");
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

        public Criteria andInspectReportStatusIsNull() {
            addCriterion("inspect_report_status is null");
            return (Criteria) this;
        }

        public Criteria andInspectReportStatusIsNotNull() {
            addCriterion("inspect_report_status is not null");
            return (Criteria) this;
        }

        public Criteria andInspectReportStatusEqualTo(Short value) {
            addCriterion("inspect_report_status =", value, "inspectReportStatus");
            return (Criteria) this;
        }

        public Criteria andInspectReportStatusNotEqualTo(Short value) {
            addCriterion("inspect_report_status <>", value, "inspectReportStatus");
            return (Criteria) this;
        }

        public Criteria andInspectReportStatusGreaterThan(Short value) {
            addCriterion("inspect_report_status >", value, "inspectReportStatus");
            return (Criteria) this;
        }

        public Criteria andInspectReportStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("inspect_report_status >=", value, "inspectReportStatus");
            return (Criteria) this;
        }

        public Criteria andInspectReportStatusLessThan(Short value) {
            addCriterion("inspect_report_status <", value, "inspectReportStatus");
            return (Criteria) this;
        }

        public Criteria andInspectReportStatusLessThanOrEqualTo(Short value) {
            addCriterion("inspect_report_status <=", value, "inspectReportStatus");
            return (Criteria) this;
        }

        public Criteria andInspectReportStatusIn(List<Short> values) {
            addCriterion("inspect_report_status in", values, "inspectReportStatus");
            return (Criteria) this;
        }

        public Criteria andInspectReportStatusNotIn(List<Short> values) {
            addCriterion("inspect_report_status not in", values, "inspectReportStatus");
            return (Criteria) this;
        }

        public Criteria andInspectReportStatusBetween(Short value1, Short value2) {
            addCriterion("inspect_report_status between", value1, value2, "inspectReportStatus");
            return (Criteria) this;
        }

        public Criteria andInspectReportStatusNotBetween(Short value1, Short value2) {
            addCriterion("inspect_report_status not between", value1, value2, "inspectReportStatus");
            return (Criteria) this;
        }

        public Criteria andLastDoneDateIsNull() {
            addCriterion("last_done_date is null");
            return (Criteria) this;
        }

        public Criteria andLastDoneDateIsNotNull() {
            addCriterion("last_done_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastDoneDateEqualTo(Date value) {
            addCriterionForJDBCDate("last_done_date =", value, "lastDoneDate");
            return (Criteria) this;
        }

        public Criteria andLastDoneDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("last_done_date <>", value, "lastDoneDate");
            return (Criteria) this;
        }

        public Criteria andLastDoneDateGreaterThan(Date value) {
            addCriterionForJDBCDate("last_done_date >", value, "lastDoneDate");
            return (Criteria) this;
        }

        public Criteria andLastDoneDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_done_date >=", value, "lastDoneDate");
            return (Criteria) this;
        }

        public Criteria andLastDoneDateLessThan(Date value) {
            addCriterionForJDBCDate("last_done_date <", value, "lastDoneDate");
            return (Criteria) this;
        }

        public Criteria andLastDoneDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_done_date <=", value, "lastDoneDate");
            return (Criteria) this;
        }

        public Criteria andLastDoneDateIn(List<Date> values) {
            addCriterionForJDBCDate("last_done_date in", values, "lastDoneDate");
            return (Criteria) this;
        }

        public Criteria andLastDoneDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("last_done_date not in", values, "lastDoneDate");
            return (Criteria) this;
        }

        public Criteria andLastDoneDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_done_date between", value1, value2, "lastDoneDate");
            return (Criteria) this;
        }

        public Criteria andLastDoneDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_done_date not between", value1, value2, "lastDoneDate");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Boolean value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Boolean value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Boolean value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Boolean value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Boolean value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Boolean> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Boolean> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Boolean value1, Boolean value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
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