package com.zklx.domain;

import java.util.ArrayList;
import java.util.List;

public class ProductDetailExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PRODUCT_DETAIL
     *
     * @mbg.generated Mon Jul 30 09:20:13 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PRODUCT_DETAIL
     *
     * @mbg.generated Mon Jul 30 09:20:13 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PRODUCT_DETAIL
     *
     * @mbg.generated Mon Jul 30 09:20:13 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_DETAIL
     *
     * @mbg.generated Mon Jul 30 09:20:13 CST 2018
     */
    public ProductDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_DETAIL
     *
     * @mbg.generated Mon Jul 30 09:20:13 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_DETAIL
     *
     * @mbg.generated Mon Jul 30 09:20:13 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_DETAIL
     *
     * @mbg.generated Mon Jul 30 09:20:13 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_DETAIL
     *
     * @mbg.generated Mon Jul 30 09:20:13 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_DETAIL
     *
     * @mbg.generated Mon Jul 30 09:20:13 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_DETAIL
     *
     * @mbg.generated Mon Jul 30 09:20:13 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_DETAIL
     *
     * @mbg.generated Mon Jul 30 09:20:13 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_DETAIL
     *
     * @mbg.generated Mon Jul 30 09:20:13 CST 2018
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
     * This method corresponds to the database table PRODUCT_DETAIL
     *
     * @mbg.generated Mon Jul 30 09:20:13 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_DETAIL
     *
     * @mbg.generated Mon Jul 30 09:20:13 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PRODUCT_DETAIL
     *
     * @mbg.generated Mon Jul 30 09:20:13 CST 2018
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

        public Criteria andDidIsNull() {
            addCriterion("DID is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("DID is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(String value) {
            addCriterion("DID =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(String value) {
            addCriterion("DID <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(String value) {
            addCriterion("DID >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(String value) {
            addCriterion("DID >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(String value) {
            addCriterion("DID <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(String value) {
            addCriterion("DID <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLike(String value) {
            addCriterion("DID like", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotLike(String value) {
            addCriterion("DID not like", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<String> values) {
            addCriterion("DID in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<String> values) {
            addCriterion("DID not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(String value1, String value2) {
            addCriterion("DID between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(String value1, String value2) {
            addCriterion("DID not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andShcontextIsNull() {
            addCriterion("SHCONTEXT is null");
            return (Criteria) this;
        }

        public Criteria andShcontextIsNotNull() {
            addCriterion("SHCONTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andShcontextEqualTo(String value) {
            addCriterion("SHCONTEXT =", value, "shcontext");
            return (Criteria) this;
        }

        public Criteria andShcontextNotEqualTo(String value) {
            addCriterion("SHCONTEXT <>", value, "shcontext");
            return (Criteria) this;
        }

        public Criteria andShcontextGreaterThan(String value) {
            addCriterion("SHCONTEXT >", value, "shcontext");
            return (Criteria) this;
        }

        public Criteria andShcontextGreaterThanOrEqualTo(String value) {
            addCriterion("SHCONTEXT >=", value, "shcontext");
            return (Criteria) this;
        }

        public Criteria andShcontextLessThan(String value) {
            addCriterion("SHCONTEXT <", value, "shcontext");
            return (Criteria) this;
        }

        public Criteria andShcontextLessThanOrEqualTo(String value) {
            addCriterion("SHCONTEXT <=", value, "shcontext");
            return (Criteria) this;
        }

        public Criteria andShcontextLike(String value) {
            addCriterion("SHCONTEXT like", value, "shcontext");
            return (Criteria) this;
        }

        public Criteria andShcontextNotLike(String value) {
            addCriterion("SHCONTEXT not like", value, "shcontext");
            return (Criteria) this;
        }

        public Criteria andShcontextIn(List<String> values) {
            addCriterion("SHCONTEXT in", values, "shcontext");
            return (Criteria) this;
        }

        public Criteria andShcontextNotIn(List<String> values) {
            addCriterion("SHCONTEXT not in", values, "shcontext");
            return (Criteria) this;
        }

        public Criteria andShcontextBetween(String value1, String value2) {
            addCriterion("SHCONTEXT between", value1, value2, "shcontext");
            return (Criteria) this;
        }

        public Criteria andShcontextNotBetween(String value1, String value2) {
            addCriterion("SHCONTEXT not between", value1, value2, "shcontext");
            return (Criteria) this;
        }

        public Criteria andShnameIsNull() {
            addCriterion("SHNAME is null");
            return (Criteria) this;
        }

        public Criteria andShnameIsNotNull() {
            addCriterion("SHNAME is not null");
            return (Criteria) this;
        }

        public Criteria andShnameEqualTo(String value) {
            addCriterion("SHNAME =", value, "shname");
            return (Criteria) this;
        }

        public Criteria andShnameNotEqualTo(String value) {
            addCriterion("SHNAME <>", value, "shname");
            return (Criteria) this;
        }

        public Criteria andShnameGreaterThan(String value) {
            addCriterion("SHNAME >", value, "shname");
            return (Criteria) this;
        }

        public Criteria andShnameGreaterThanOrEqualTo(String value) {
            addCriterion("SHNAME >=", value, "shname");
            return (Criteria) this;
        }

        public Criteria andShnameLessThan(String value) {
            addCriterion("SHNAME <", value, "shname");
            return (Criteria) this;
        }

        public Criteria andShnameLessThanOrEqualTo(String value) {
            addCriterion("SHNAME <=", value, "shname");
            return (Criteria) this;
        }

        public Criteria andShnameLike(String value) {
            addCriterion("SHNAME like", value, "shname");
            return (Criteria) this;
        }

        public Criteria andShnameNotLike(String value) {
            addCriterion("SHNAME not like", value, "shname");
            return (Criteria) this;
        }

        public Criteria andShnameIn(List<String> values) {
            addCriterion("SHNAME in", values, "shname");
            return (Criteria) this;
        }

        public Criteria andShnameNotIn(List<String> values) {
            addCriterion("SHNAME not in", values, "shname");
            return (Criteria) this;
        }

        public Criteria andShnameBetween(String value1, String value2) {
            addCriterion("SHNAME between", value1, value2, "shname");
            return (Criteria) this;
        }

        public Criteria andShnameNotBetween(String value1, String value2) {
            addCriterion("SHNAME not between", value1, value2, "shname");
            return (Criteria) this;
        }

        public Criteria andChcontextIsNull() {
            addCriterion("CHCONTEXT is null");
            return (Criteria) this;
        }

        public Criteria andChcontextIsNotNull() {
            addCriterion("CHCONTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andChcontextEqualTo(String value) {
            addCriterion("CHCONTEXT =", value, "chcontext");
            return (Criteria) this;
        }

        public Criteria andChcontextNotEqualTo(String value) {
            addCriterion("CHCONTEXT <>", value, "chcontext");
            return (Criteria) this;
        }

        public Criteria andChcontextGreaterThan(String value) {
            addCriterion("CHCONTEXT >", value, "chcontext");
            return (Criteria) this;
        }

        public Criteria andChcontextGreaterThanOrEqualTo(String value) {
            addCriterion("CHCONTEXT >=", value, "chcontext");
            return (Criteria) this;
        }

        public Criteria andChcontextLessThan(String value) {
            addCriterion("CHCONTEXT <", value, "chcontext");
            return (Criteria) this;
        }

        public Criteria andChcontextLessThanOrEqualTo(String value) {
            addCriterion("CHCONTEXT <=", value, "chcontext");
            return (Criteria) this;
        }

        public Criteria andChcontextLike(String value) {
            addCriterion("CHCONTEXT like", value, "chcontext");
            return (Criteria) this;
        }

        public Criteria andChcontextNotLike(String value) {
            addCriterion("CHCONTEXT not like", value, "chcontext");
            return (Criteria) this;
        }

        public Criteria andChcontextIn(List<String> values) {
            addCriterion("CHCONTEXT in", values, "chcontext");
            return (Criteria) this;
        }

        public Criteria andChcontextNotIn(List<String> values) {
            addCriterion("CHCONTEXT not in", values, "chcontext");
            return (Criteria) this;
        }

        public Criteria andChcontextBetween(String value1, String value2) {
            addCriterion("CHCONTEXT between", value1, value2, "chcontext");
            return (Criteria) this;
        }

        public Criteria andChcontextNotBetween(String value1, String value2) {
            addCriterion("CHCONTEXT not between", value1, value2, "chcontext");
            return (Criteria) this;
        }

        public Criteria andChnameIsNull() {
            addCriterion("CHNAME is null");
            return (Criteria) this;
        }

        public Criteria andChnameIsNotNull() {
            addCriterion("CHNAME is not null");
            return (Criteria) this;
        }

        public Criteria andChnameEqualTo(String value) {
            addCriterion("CHNAME =", value, "chname");
            return (Criteria) this;
        }

        public Criteria andChnameNotEqualTo(String value) {
            addCriterion("CHNAME <>", value, "chname");
            return (Criteria) this;
        }

        public Criteria andChnameGreaterThan(String value) {
            addCriterion("CHNAME >", value, "chname");
            return (Criteria) this;
        }

        public Criteria andChnameGreaterThanOrEqualTo(String value) {
            addCriterion("CHNAME >=", value, "chname");
            return (Criteria) this;
        }

        public Criteria andChnameLessThan(String value) {
            addCriterion("CHNAME <", value, "chname");
            return (Criteria) this;
        }

        public Criteria andChnameLessThanOrEqualTo(String value) {
            addCriterion("CHNAME <=", value, "chname");
            return (Criteria) this;
        }

        public Criteria andChnameLike(String value) {
            addCriterion("CHNAME like", value, "chname");
            return (Criteria) this;
        }

        public Criteria andChnameNotLike(String value) {
            addCriterion("CHNAME not like", value, "chname");
            return (Criteria) this;
        }

        public Criteria andChnameIn(List<String> values) {
            addCriterion("CHNAME in", values, "chname");
            return (Criteria) this;
        }

        public Criteria andChnameNotIn(List<String> values) {
            addCriterion("CHNAME not in", values, "chname");
            return (Criteria) this;
        }

        public Criteria andChnameBetween(String value1, String value2) {
            addCriterion("CHNAME between", value1, value2, "chname");
            return (Criteria) this;
        }

        public Criteria andChnameNotBetween(String value1, String value2) {
            addCriterion("CHNAME not between", value1, value2, "chname");
            return (Criteria) this;
        }

        public Criteria andFucontextIsNull() {
            addCriterion("FUCONTEXT is null");
            return (Criteria) this;
        }

        public Criteria andFucontextIsNotNull() {
            addCriterion("FUCONTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andFucontextEqualTo(String value) {
            addCriterion("FUCONTEXT =", value, "fucontext");
            return (Criteria) this;
        }

        public Criteria andFucontextNotEqualTo(String value) {
            addCriterion("FUCONTEXT <>", value, "fucontext");
            return (Criteria) this;
        }

        public Criteria andFucontextGreaterThan(String value) {
            addCriterion("FUCONTEXT >", value, "fucontext");
            return (Criteria) this;
        }

        public Criteria andFucontextGreaterThanOrEqualTo(String value) {
            addCriterion("FUCONTEXT >=", value, "fucontext");
            return (Criteria) this;
        }

        public Criteria andFucontextLessThan(String value) {
            addCriterion("FUCONTEXT <", value, "fucontext");
            return (Criteria) this;
        }

        public Criteria andFucontextLessThanOrEqualTo(String value) {
            addCriterion("FUCONTEXT <=", value, "fucontext");
            return (Criteria) this;
        }

        public Criteria andFucontextLike(String value) {
            addCriterion("FUCONTEXT like", value, "fucontext");
            return (Criteria) this;
        }

        public Criteria andFucontextNotLike(String value) {
            addCriterion("FUCONTEXT not like", value, "fucontext");
            return (Criteria) this;
        }

        public Criteria andFucontextIn(List<String> values) {
            addCriterion("FUCONTEXT in", values, "fucontext");
            return (Criteria) this;
        }

        public Criteria andFucontextNotIn(List<String> values) {
            addCriterion("FUCONTEXT not in", values, "fucontext");
            return (Criteria) this;
        }

        public Criteria andFucontextBetween(String value1, String value2) {
            addCriterion("FUCONTEXT between", value1, value2, "fucontext");
            return (Criteria) this;
        }

        public Criteria andFucontextNotBetween(String value1, String value2) {
            addCriterion("FUCONTEXT not between", value1, value2, "fucontext");
            return (Criteria) this;
        }

        public Criteria andFunameIsNull() {
            addCriterion("FUNAME is null");
            return (Criteria) this;
        }

        public Criteria andFunameIsNotNull() {
            addCriterion("FUNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFunameEqualTo(String value) {
            addCriterion("FUNAME =", value, "funame");
            return (Criteria) this;
        }

        public Criteria andFunameNotEqualTo(String value) {
            addCriterion("FUNAME <>", value, "funame");
            return (Criteria) this;
        }

        public Criteria andFunameGreaterThan(String value) {
            addCriterion("FUNAME >", value, "funame");
            return (Criteria) this;
        }

        public Criteria andFunameGreaterThanOrEqualTo(String value) {
            addCriterion("FUNAME >=", value, "funame");
            return (Criteria) this;
        }

        public Criteria andFunameLessThan(String value) {
            addCriterion("FUNAME <", value, "funame");
            return (Criteria) this;
        }

        public Criteria andFunameLessThanOrEqualTo(String value) {
            addCriterion("FUNAME <=", value, "funame");
            return (Criteria) this;
        }

        public Criteria andFunameLike(String value) {
            addCriterion("FUNAME like", value, "funame");
            return (Criteria) this;
        }

        public Criteria andFunameNotLike(String value) {
            addCriterion("FUNAME not like", value, "funame");
            return (Criteria) this;
        }

        public Criteria andFunameIn(List<String> values) {
            addCriterion("FUNAME in", values, "funame");
            return (Criteria) this;
        }

        public Criteria andFunameNotIn(List<String> values) {
            addCriterion("FUNAME not in", values, "funame");
            return (Criteria) this;
        }

        public Criteria andFunameBetween(String value1, String value2) {
            addCriterion("FUNAME between", value1, value2, "funame");
            return (Criteria) this;
        }

        public Criteria andFunameNotBetween(String value1, String value2) {
            addCriterion("FUNAME not between", value1, value2, "funame");
            return (Criteria) this;
        }

        public Criteria andFuengnameIsNull() {
            addCriterion("FUENGNAME is null");
            return (Criteria) this;
        }

        public Criteria andFuengnameIsNotNull() {
            addCriterion("FUENGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFuengnameEqualTo(String value) {
            addCriterion("FUENGNAME =", value, "fuengname");
            return (Criteria) this;
        }

        public Criteria andFuengnameNotEqualTo(String value) {
            addCriterion("FUENGNAME <>", value, "fuengname");
            return (Criteria) this;
        }

        public Criteria andFuengnameGreaterThan(String value) {
            addCriterion("FUENGNAME >", value, "fuengname");
            return (Criteria) this;
        }

        public Criteria andFuengnameGreaterThanOrEqualTo(String value) {
            addCriterion("FUENGNAME >=", value, "fuengname");
            return (Criteria) this;
        }

        public Criteria andFuengnameLessThan(String value) {
            addCriterion("FUENGNAME <", value, "fuengname");
            return (Criteria) this;
        }

        public Criteria andFuengnameLessThanOrEqualTo(String value) {
            addCriterion("FUENGNAME <=", value, "fuengname");
            return (Criteria) this;
        }

        public Criteria andFuengnameLike(String value) {
            addCriterion("FUENGNAME like", value, "fuengname");
            return (Criteria) this;
        }

        public Criteria andFuengnameNotLike(String value) {
            addCriterion("FUENGNAME not like", value, "fuengname");
            return (Criteria) this;
        }

        public Criteria andFuengnameIn(List<String> values) {
            addCriterion("FUENGNAME in", values, "fuengname");
            return (Criteria) this;
        }

        public Criteria andFuengnameNotIn(List<String> values) {
            addCriterion("FUENGNAME not in", values, "fuengname");
            return (Criteria) this;
        }

        public Criteria andFuengnameBetween(String value1, String value2) {
            addCriterion("FUENGNAME between", value1, value2, "fuengname");
            return (Criteria) this;
        }

        public Criteria andFuengnameNotBetween(String value1, String value2) {
            addCriterion("FUENGNAME not between", value1, value2, "fuengname");
            return (Criteria) this;
        }

        public Criteria andPacontextIsNull() {
            addCriterion("PACONTEXT is null");
            return (Criteria) this;
        }

        public Criteria andPacontextIsNotNull() {
            addCriterion("PACONTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andPacontextEqualTo(String value) {
            addCriterion("PACONTEXT =", value, "pacontext");
            return (Criteria) this;
        }

        public Criteria andPacontextNotEqualTo(String value) {
            addCriterion("PACONTEXT <>", value, "pacontext");
            return (Criteria) this;
        }

        public Criteria andPacontextGreaterThan(String value) {
            addCriterion("PACONTEXT >", value, "pacontext");
            return (Criteria) this;
        }

        public Criteria andPacontextGreaterThanOrEqualTo(String value) {
            addCriterion("PACONTEXT >=", value, "pacontext");
            return (Criteria) this;
        }

        public Criteria andPacontextLessThan(String value) {
            addCriterion("PACONTEXT <", value, "pacontext");
            return (Criteria) this;
        }

        public Criteria andPacontextLessThanOrEqualTo(String value) {
            addCriterion("PACONTEXT <=", value, "pacontext");
            return (Criteria) this;
        }

        public Criteria andPacontextLike(String value) {
            addCriterion("PACONTEXT like", value, "pacontext");
            return (Criteria) this;
        }

        public Criteria andPacontextNotLike(String value) {
            addCriterion("PACONTEXT not like", value, "pacontext");
            return (Criteria) this;
        }

        public Criteria andPacontextIn(List<String> values) {
            addCriterion("PACONTEXT in", values, "pacontext");
            return (Criteria) this;
        }

        public Criteria andPacontextNotIn(List<String> values) {
            addCriterion("PACONTEXT not in", values, "pacontext");
            return (Criteria) this;
        }

        public Criteria andPacontextBetween(String value1, String value2) {
            addCriterion("PACONTEXT between", value1, value2, "pacontext");
            return (Criteria) this;
        }

        public Criteria andPacontextNotBetween(String value1, String value2) {
            addCriterion("PACONTEXT not between", value1, value2, "pacontext");
            return (Criteria) this;
        }

        public Criteria andPanameIsNull() {
            addCriterion("PANAME is null");
            return (Criteria) this;
        }

        public Criteria andPanameIsNotNull() {
            addCriterion("PANAME is not null");
            return (Criteria) this;
        }

        public Criteria andPanameEqualTo(String value) {
            addCriterion("PANAME =", value, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameNotEqualTo(String value) {
            addCriterion("PANAME <>", value, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameGreaterThan(String value) {
            addCriterion("PANAME >", value, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameGreaterThanOrEqualTo(String value) {
            addCriterion("PANAME >=", value, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameLessThan(String value) {
            addCriterion("PANAME <", value, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameLessThanOrEqualTo(String value) {
            addCriterion("PANAME <=", value, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameLike(String value) {
            addCriterion("PANAME like", value, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameNotLike(String value) {
            addCriterion("PANAME not like", value, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameIn(List<String> values) {
            addCriterion("PANAME in", values, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameNotIn(List<String> values) {
            addCriterion("PANAME not in", values, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameBetween(String value1, String value2) {
            addCriterion("PANAME between", value1, value2, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameNotBetween(String value1, String value2) {
            addCriterion("PANAME not between", value1, value2, "paname");
            return (Criteria) this;
        }

        public Criteria andBelongidIsNull() {
            addCriterion("BELONGID is null");
            return (Criteria) this;
        }

        public Criteria andBelongidIsNotNull() {
            addCriterion("BELONGID is not null");
            return (Criteria) this;
        }

        public Criteria andBelongidEqualTo(String value) {
            addCriterion("BELONGID =", value, "belongid");
            return (Criteria) this;
        }

        public Criteria andBelongidNotEqualTo(String value) {
            addCriterion("BELONGID <>", value, "belongid");
            return (Criteria) this;
        }

        public Criteria andBelongidGreaterThan(String value) {
            addCriterion("BELONGID >", value, "belongid");
            return (Criteria) this;
        }

        public Criteria andBelongidGreaterThanOrEqualTo(String value) {
            addCriterion("BELONGID >=", value, "belongid");
            return (Criteria) this;
        }

        public Criteria andBelongidLessThan(String value) {
            addCriterion("BELONGID <", value, "belongid");
            return (Criteria) this;
        }

        public Criteria andBelongidLessThanOrEqualTo(String value) {
            addCriterion("BELONGID <=", value, "belongid");
            return (Criteria) this;
        }

        public Criteria andBelongidLike(String value) {
            addCriterion("BELONGID like", value, "belongid");
            return (Criteria) this;
        }

        public Criteria andBelongidNotLike(String value) {
            addCriterion("BELONGID not like", value, "belongid");
            return (Criteria) this;
        }

        public Criteria andBelongidIn(List<String> values) {
            addCriterion("BELONGID in", values, "belongid");
            return (Criteria) this;
        }

        public Criteria andBelongidNotIn(List<String> values) {
            addCriterion("BELONGID not in", values, "belongid");
            return (Criteria) this;
        }

        public Criteria andBelongidBetween(String value1, String value2) {
            addCriterion("BELONGID between", value1, value2, "belongid");
            return (Criteria) this;
        }

        public Criteria andBelongidNotBetween(String value1, String value2) {
            addCriterion("BELONGID not between", value1, value2, "belongid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PRODUCT_DETAIL
     *
     * @mbg.generated do_not_delete_during_merge Mon Jul 30 09:20:13 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PRODUCT_DETAIL
     *
     * @mbg.generated Mon Jul 30 09:20:13 CST 2018
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