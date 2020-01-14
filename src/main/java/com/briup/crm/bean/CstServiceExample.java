package com.briup.crm.bean;

import java.util.ArrayList;
import java.util.List;

public class CstServiceExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cst_service
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cst_service
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cst_service
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_service
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
    public CstServiceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_service
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_service
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_service
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_service
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_service
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_service
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_service
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_service
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_service
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_service
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cst_service
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
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

        public Criteria andSvrIdIsNull() {
            addCriterion("svr_id is null");
            return (Criteria) this;
        }

        public Criteria andSvrIdIsNotNull() {
            addCriterion("svr_id is not null");
            return (Criteria) this;
        }

        public Criteria andSvrIdEqualTo(Long value) {
            addCriterion("svr_id =", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdNotEqualTo(Long value) {
            addCriterion("svr_id <>", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdGreaterThan(Long value) {
            addCriterion("svr_id >", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("svr_id >=", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdLessThan(Long value) {
            addCriterion("svr_id <", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdLessThanOrEqualTo(Long value) {
            addCriterion("svr_id <=", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdIn(List<Long> values) {
            addCriterion("svr_id in", values, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdNotIn(List<Long> values) {
            addCriterion("svr_id not in", values, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdBetween(Long value1, Long value2) {
            addCriterion("svr_id between", value1, value2, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdNotBetween(Long value1, Long value2) {
            addCriterion("svr_id not between", value1, value2, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrTypeIsNull() {
            addCriterion("svr_type is null");
            return (Criteria) this;
        }

        public Criteria andSvrTypeIsNotNull() {
            addCriterion("svr_type is not null");
            return (Criteria) this;
        }

        public Criteria andSvrTypeEqualTo(String value) {
            addCriterion("svr_type =", value, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeNotEqualTo(String value) {
            addCriterion("svr_type <>", value, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeGreaterThan(String value) {
            addCriterion("svr_type >", value, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeGreaterThanOrEqualTo(String value) {
            addCriterion("svr_type >=", value, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeLessThan(String value) {
            addCriterion("svr_type <", value, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeLessThanOrEqualTo(String value) {
            addCriterion("svr_type <=", value, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeLike(String value) {
            addCriterion("svr_type like", value, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeNotLike(String value) {
            addCriterion("svr_type not like", value, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeIn(List<String> values) {
            addCriterion("svr_type in", values, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeNotIn(List<String> values) {
            addCriterion("svr_type not in", values, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeBetween(String value1, String value2) {
            addCriterion("svr_type between", value1, value2, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeNotBetween(String value1, String value2) {
            addCriterion("svr_type not between", value1, value2, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTitleIsNull() {
            addCriterion("svr_title is null");
            return (Criteria) this;
        }

        public Criteria andSvrTitleIsNotNull() {
            addCriterion("svr_title is not null");
            return (Criteria) this;
        }

        public Criteria andSvrTitleEqualTo(String value) {
            addCriterion("svr_title =", value, "svrTitle");
            return (Criteria) this;
        }

        public Criteria andSvrTitleNotEqualTo(String value) {
            addCriterion("svr_title <>", value, "svrTitle");
            return (Criteria) this;
        }

        public Criteria andSvrTitleGreaterThan(String value) {
            addCriterion("svr_title >", value, "svrTitle");
            return (Criteria) this;
        }

        public Criteria andSvrTitleGreaterThanOrEqualTo(String value) {
            addCriterion("svr_title >=", value, "svrTitle");
            return (Criteria) this;
        }

        public Criteria andSvrTitleLessThan(String value) {
            addCriterion("svr_title <", value, "svrTitle");
            return (Criteria) this;
        }

        public Criteria andSvrTitleLessThanOrEqualTo(String value) {
            addCriterion("svr_title <=", value, "svrTitle");
            return (Criteria) this;
        }

        public Criteria andSvrTitleLike(String value) {
            addCriterion("svr_title like", value, "svrTitle");
            return (Criteria) this;
        }

        public Criteria andSvrTitleNotLike(String value) {
            addCriterion("svr_title not like", value, "svrTitle");
            return (Criteria) this;
        }

        public Criteria andSvrTitleIn(List<String> values) {
            addCriterion("svr_title in", values, "svrTitle");
            return (Criteria) this;
        }

        public Criteria andSvrTitleNotIn(List<String> values) {
            addCriterion("svr_title not in", values, "svrTitle");
            return (Criteria) this;
        }

        public Criteria andSvrTitleBetween(String value1, String value2) {
            addCriterion("svr_title between", value1, value2, "svrTitle");
            return (Criteria) this;
        }

        public Criteria andSvrTitleNotBetween(String value1, String value2) {
            addCriterion("svr_title not between", value1, value2, "svrTitle");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameIsNull() {
            addCriterion("svr_cust_name is null");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameIsNotNull() {
            addCriterion("svr_cust_name is not null");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameEqualTo(String value) {
            addCriterion("svr_cust_name =", value, "svrCustName");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameNotEqualTo(String value) {
            addCriterion("svr_cust_name <>", value, "svrCustName");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameGreaterThan(String value) {
            addCriterion("svr_cust_name >", value, "svrCustName");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("svr_cust_name >=", value, "svrCustName");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameLessThan(String value) {
            addCriterion("svr_cust_name <", value, "svrCustName");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameLessThanOrEqualTo(String value) {
            addCriterion("svr_cust_name <=", value, "svrCustName");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameLike(String value) {
            addCriterion("svr_cust_name like", value, "svrCustName");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameNotLike(String value) {
            addCriterion("svr_cust_name not like", value, "svrCustName");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameIn(List<String> values) {
            addCriterion("svr_cust_name in", values, "svrCustName");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameNotIn(List<String> values) {
            addCriterion("svr_cust_name not in", values, "svrCustName");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameBetween(String value1, String value2) {
            addCriterion("svr_cust_name between", value1, value2, "svrCustName");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameNotBetween(String value1, String value2) {
            addCriterion("svr_cust_name not between", value1, value2, "svrCustName");
            return (Criteria) this;
        }

        public Criteria andSvrStatusIsNull() {
            addCriterion("svr_status is null");
            return (Criteria) this;
        }

        public Criteria andSvrStatusIsNotNull() {
            addCriterion("svr_status is not null");
            return (Criteria) this;
        }

        public Criteria andSvrStatusEqualTo(String value) {
            addCriterion("svr_status =", value, "svrStatus");
            return (Criteria) this;
        }

        public Criteria andSvrStatusNotEqualTo(String value) {
            addCriterion("svr_status <>", value, "svrStatus");
            return (Criteria) this;
        }

        public Criteria andSvrStatusGreaterThan(String value) {
            addCriterion("svr_status >", value, "svrStatus");
            return (Criteria) this;
        }

        public Criteria andSvrStatusGreaterThanOrEqualTo(String value) {
            addCriterion("svr_status >=", value, "svrStatus");
            return (Criteria) this;
        }

        public Criteria andSvrStatusLessThan(String value) {
            addCriterion("svr_status <", value, "svrStatus");
            return (Criteria) this;
        }

        public Criteria andSvrStatusLessThanOrEqualTo(String value) {
            addCriterion("svr_status <=", value, "svrStatus");
            return (Criteria) this;
        }

        public Criteria andSvrStatusLike(String value) {
            addCriterion("svr_status like", value, "svrStatus");
            return (Criteria) this;
        }

        public Criteria andSvrStatusNotLike(String value) {
            addCriterion("svr_status not like", value, "svrStatus");
            return (Criteria) this;
        }

        public Criteria andSvrStatusIn(List<String> values) {
            addCriterion("svr_status in", values, "svrStatus");
            return (Criteria) this;
        }

        public Criteria andSvrStatusNotIn(List<String> values) {
            addCriterion("svr_status not in", values, "svrStatus");
            return (Criteria) this;
        }

        public Criteria andSvrStatusBetween(String value1, String value2) {
            addCriterion("svr_status between", value1, value2, "svrStatus");
            return (Criteria) this;
        }

        public Criteria andSvrStatusNotBetween(String value1, String value2) {
            addCriterion("svr_status not between", value1, value2, "svrStatus");
            return (Criteria) this;
        }

        public Criteria andSvrRequestIsNull() {
            addCriterion("svr_request is null");
            return (Criteria) this;
        }

        public Criteria andSvrRequestIsNotNull() {
            addCriterion("svr_request is not null");
            return (Criteria) this;
        }

        public Criteria andSvrRequestEqualTo(String value) {
            addCriterion("svr_request =", value, "svrRequest");
            return (Criteria) this;
        }

        public Criteria andSvrRequestNotEqualTo(String value) {
            addCriterion("svr_request <>", value, "svrRequest");
            return (Criteria) this;
        }

        public Criteria andSvrRequestGreaterThan(String value) {
            addCriterion("svr_request >", value, "svrRequest");
            return (Criteria) this;
        }

        public Criteria andSvrRequestGreaterThanOrEqualTo(String value) {
            addCriterion("svr_request >=", value, "svrRequest");
            return (Criteria) this;
        }

        public Criteria andSvrRequestLessThan(String value) {
            addCriterion("svr_request <", value, "svrRequest");
            return (Criteria) this;
        }

        public Criteria andSvrRequestLessThanOrEqualTo(String value) {
            addCriterion("svr_request <=", value, "svrRequest");
            return (Criteria) this;
        }

        public Criteria andSvrRequestLike(String value) {
            addCriterion("svr_request like", value, "svrRequest");
            return (Criteria) this;
        }

        public Criteria andSvrRequestNotLike(String value) {
            addCriterion("svr_request not like", value, "svrRequest");
            return (Criteria) this;
        }

        public Criteria andSvrRequestIn(List<String> values) {
            addCriterion("svr_request in", values, "svrRequest");
            return (Criteria) this;
        }

        public Criteria andSvrRequestNotIn(List<String> values) {
            addCriterion("svr_request not in", values, "svrRequest");
            return (Criteria) this;
        }

        public Criteria andSvrRequestBetween(String value1, String value2) {
            addCriterion("svr_request between", value1, value2, "svrRequest");
            return (Criteria) this;
        }

        public Criteria andSvrRequestNotBetween(String value1, String value2) {
            addCriterion("svr_request not between", value1, value2, "svrRequest");
            return (Criteria) this;
        }

        public Criteria andSvrDisposeIsNull() {
            addCriterion("svr_dispose is null");
            return (Criteria) this;
        }

        public Criteria andSvrDisposeIsNotNull() {
            addCriterion("svr_dispose is not null");
            return (Criteria) this;
        }

        public Criteria andSvrDisposeEqualTo(String value) {
            addCriterion("svr_dispose =", value, "svrDispose");
            return (Criteria) this;
        }

        public Criteria andSvrDisposeNotEqualTo(String value) {
            addCriterion("svr_dispose <>", value, "svrDispose");
            return (Criteria) this;
        }

        public Criteria andSvrDisposeGreaterThan(String value) {
            addCriterion("svr_dispose >", value, "svrDispose");
            return (Criteria) this;
        }

        public Criteria andSvrDisposeGreaterThanOrEqualTo(String value) {
            addCriterion("svr_dispose >=", value, "svrDispose");
            return (Criteria) this;
        }

        public Criteria andSvrDisposeLessThan(String value) {
            addCriterion("svr_dispose <", value, "svrDispose");
            return (Criteria) this;
        }

        public Criteria andSvrDisposeLessThanOrEqualTo(String value) {
            addCriterion("svr_dispose <=", value, "svrDispose");
            return (Criteria) this;
        }

        public Criteria andSvrDisposeLike(String value) {
            addCriterion("svr_dispose like", value, "svrDispose");
            return (Criteria) this;
        }

        public Criteria andSvrDisposeNotLike(String value) {
            addCriterion("svr_dispose not like", value, "svrDispose");
            return (Criteria) this;
        }

        public Criteria andSvrDisposeIn(List<String> values) {
            addCriterion("svr_dispose in", values, "svrDispose");
            return (Criteria) this;
        }

        public Criteria andSvrDisposeNotIn(List<String> values) {
            addCriterion("svr_dispose not in", values, "svrDispose");
            return (Criteria) this;
        }

        public Criteria andSvrDisposeBetween(String value1, String value2) {
            addCriterion("svr_dispose between", value1, value2, "svrDispose");
            return (Criteria) this;
        }

        public Criteria andSvrDisposeNotBetween(String value1, String value2) {
            addCriterion("svr_dispose not between", value1, value2, "svrDispose");
            return (Criteria) this;
        }

        public Criteria andSvrHandleIsNull() {
            addCriterion("svr_handle is null");
            return (Criteria) this;
        }

        public Criteria andSvrHandleIsNotNull() {
            addCriterion("svr_handle is not null");
            return (Criteria) this;
        }

        public Criteria andSvrHandleEqualTo(String value) {
            addCriterion("svr_handle =", value, "svrHandle");
            return (Criteria) this;
        }

        public Criteria andSvrHandleNotEqualTo(String value) {
            addCriterion("svr_handle <>", value, "svrHandle");
            return (Criteria) this;
        }

        public Criteria andSvrHandleGreaterThan(String value) {
            addCriterion("svr_handle >", value, "svrHandle");
            return (Criteria) this;
        }

        public Criteria andSvrHandleGreaterThanOrEqualTo(String value) {
            addCriterion("svr_handle >=", value, "svrHandle");
            return (Criteria) this;
        }

        public Criteria andSvrHandleLessThan(String value) {
            addCriterion("svr_handle <", value, "svrHandle");
            return (Criteria) this;
        }

        public Criteria andSvrHandleLessThanOrEqualTo(String value) {
            addCriterion("svr_handle <=", value, "svrHandle");
            return (Criteria) this;
        }

        public Criteria andSvrHandleLike(String value) {
            addCriterion("svr_handle like", value, "svrHandle");
            return (Criteria) this;
        }

        public Criteria andSvrHandleNotLike(String value) {
            addCriterion("svr_handle not like", value, "svrHandle");
            return (Criteria) this;
        }

        public Criteria andSvrHandleIn(List<String> values) {
            addCriterion("svr_handle in", values, "svrHandle");
            return (Criteria) this;
        }

        public Criteria andSvrHandleNotIn(List<String> values) {
            addCriterion("svr_handle not in", values, "svrHandle");
            return (Criteria) this;
        }

        public Criteria andSvrHandleBetween(String value1, String value2) {
            addCriterion("svr_handle between", value1, value2, "svrHandle");
            return (Criteria) this;
        }

        public Criteria andSvrHandleNotBetween(String value1, String value2) {
            addCriterion("svr_handle not between", value1, value2, "svrHandle");
            return (Criteria) this;
        }

        public Criteria andSvrResultIsNull() {
            addCriterion("svr_result is null");
            return (Criteria) this;
        }

        public Criteria andSvrResultIsNotNull() {
            addCriterion("svr_result is not null");
            return (Criteria) this;
        }

        public Criteria andSvrResultEqualTo(String value) {
            addCriterion("svr_result =", value, "svrResult");
            return (Criteria) this;
        }

        public Criteria andSvrResultNotEqualTo(String value) {
            addCriterion("svr_result <>", value, "svrResult");
            return (Criteria) this;
        }

        public Criteria andSvrResultGreaterThan(String value) {
            addCriterion("svr_result >", value, "svrResult");
            return (Criteria) this;
        }

        public Criteria andSvrResultGreaterThanOrEqualTo(String value) {
            addCriterion("svr_result >=", value, "svrResult");
            return (Criteria) this;
        }

        public Criteria andSvrResultLessThan(String value) {
            addCriterion("svr_result <", value, "svrResult");
            return (Criteria) this;
        }

        public Criteria andSvrResultLessThanOrEqualTo(String value) {
            addCriterion("svr_result <=", value, "svrResult");
            return (Criteria) this;
        }

        public Criteria andSvrResultLike(String value) {
            addCriterion("svr_result like", value, "svrResult");
            return (Criteria) this;
        }

        public Criteria andSvrResultNotLike(String value) {
            addCriterion("svr_result not like", value, "svrResult");
            return (Criteria) this;
        }

        public Criteria andSvrResultIn(List<String> values) {
            addCriterion("svr_result in", values, "svrResult");
            return (Criteria) this;
        }

        public Criteria andSvrResultNotIn(List<String> values) {
            addCriterion("svr_result not in", values, "svrResult");
            return (Criteria) this;
        }

        public Criteria andSvrResultBetween(String value1, String value2) {
            addCriterion("svr_result between", value1, value2, "svrResult");
            return (Criteria) this;
        }

        public Criteria andSvrResultNotBetween(String value1, String value2) {
            addCriterion("svr_result not between", value1, value2, "svrResult");
            return (Criteria) this;
        }

        public Criteria andSvrSatisfyIsNull() {
            addCriterion("svr_satisfy is null");
            return (Criteria) this;
        }

        public Criteria andSvrSatisfyIsNotNull() {
            addCriterion("svr_satisfy is not null");
            return (Criteria) this;
        }

        public Criteria andSvrSatisfyEqualTo(String value) {
            addCriterion("svr_satisfy =", value, "svrSatisfy");
            return (Criteria) this;
        }

        public Criteria andSvrSatisfyNotEqualTo(String value) {
            addCriterion("svr_satisfy <>", value, "svrSatisfy");
            return (Criteria) this;
        }

        public Criteria andSvrSatisfyGreaterThan(String value) {
            addCriterion("svr_satisfy >", value, "svrSatisfy");
            return (Criteria) this;
        }

        public Criteria andSvrSatisfyGreaterThanOrEqualTo(String value) {
            addCriterion("svr_satisfy >=", value, "svrSatisfy");
            return (Criteria) this;
        }

        public Criteria andSvrSatisfyLessThan(String value) {
            addCriterion("svr_satisfy <", value, "svrSatisfy");
            return (Criteria) this;
        }

        public Criteria andSvrSatisfyLessThanOrEqualTo(String value) {
            addCriterion("svr_satisfy <=", value, "svrSatisfy");
            return (Criteria) this;
        }

        public Criteria andSvrSatisfyLike(String value) {
            addCriterion("svr_satisfy like", value, "svrSatisfy");
            return (Criteria) this;
        }

        public Criteria andSvrSatisfyNotLike(String value) {
            addCriterion("svr_satisfy not like", value, "svrSatisfy");
            return (Criteria) this;
        }

        public Criteria andSvrSatisfyIn(List<String> values) {
            addCriterion("svr_satisfy in", values, "svrSatisfy");
            return (Criteria) this;
        }

        public Criteria andSvrSatisfyNotIn(List<String> values) {
            addCriterion("svr_satisfy not in", values, "svrSatisfy");
            return (Criteria) this;
        }

        public Criteria andSvrSatisfyBetween(String value1, String value2) {
            addCriterion("svr_satisfy between", value1, value2, "svrSatisfy");
            return (Criteria) this;
        }

        public Criteria andSvrSatisfyNotBetween(String value1, String value2) {
            addCriterion("svr_satisfy not between", value1, value2, "svrSatisfy");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cst_service
     *
     * @mbg.generated do_not_delete_during_merge Sat Jan 04 10:08:17 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cst_service
     *
     * @mbg.generated Sat Jan 04 10:08:17 CST 2020
     */
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