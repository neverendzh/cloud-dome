package com.neverend.account.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ApiAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApiAccountExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserTotalIsNull() {
            addCriterion("user_total is null");
            return (Criteria) this;
        }

        public Criteria andUserTotalIsNotNull() {
            addCriterion("user_total is not null");
            return (Criteria) this;
        }

        public Criteria andUserTotalEqualTo(BigDecimal value) {
            addCriterion("user_total =", value, "userTotal");
            return (Criteria) this;
        }

        public Criteria andUserTotalNotEqualTo(BigDecimal value) {
            addCriterion("user_total <>", value, "userTotal");
            return (Criteria) this;
        }

        public Criteria andUserTotalGreaterThan(BigDecimal value) {
            addCriterion("user_total >", value, "userTotal");
            return (Criteria) this;
        }

        public Criteria andUserTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("user_total >=", value, "userTotal");
            return (Criteria) this;
        }

        public Criteria andUserTotalLessThan(BigDecimal value) {
            addCriterion("user_total <", value, "userTotal");
            return (Criteria) this;
        }

        public Criteria andUserTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("user_total <=", value, "userTotal");
            return (Criteria) this;
        }

        public Criteria andUserTotalIn(List<BigDecimal> values) {
            addCriterion("user_total in", values, "userTotal");
            return (Criteria) this;
        }

        public Criteria andUserTotalNotIn(List<BigDecimal> values) {
            addCriterion("user_total not in", values, "userTotal");
            return (Criteria) this;
        }

        public Criteria andUserTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_total between", value1, value2, "userTotal");
            return (Criteria) this;
        }

        public Criteria andUserTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_total not between", value1, value2, "userTotal");
            return (Criteria) this;
        }

        public Criteria andUsedIsNull() {
            addCriterion("used is null");
            return (Criteria) this;
        }

        public Criteria andUsedIsNotNull() {
            addCriterion("used is not null");
            return (Criteria) this;
        }

        public Criteria andUsedEqualTo(BigDecimal value) {
            addCriterion("used =", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotEqualTo(BigDecimal value) {
            addCriterion("used <>", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedGreaterThan(BigDecimal value) {
            addCriterion("used >", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("used >=", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedLessThan(BigDecimal value) {
            addCriterion("used <", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("used <=", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedIn(List<BigDecimal> values) {
            addCriterion("used in", values, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotIn(List<BigDecimal> values) {
            addCriterion("used not in", values, "used");
            return (Criteria) this;
        }

        public Criteria andUsedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("used between", value1, value2, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("used not between", value1, value2, "used");
            return (Criteria) this;
        }

        public Criteria andResidueIsNull() {
            addCriterion("residue is null");
            return (Criteria) this;
        }

        public Criteria andResidueIsNotNull() {
            addCriterion("residue is not null");
            return (Criteria) this;
        }

        public Criteria andResidueEqualTo(BigDecimal value) {
            addCriterion("residue =", value, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueNotEqualTo(BigDecimal value) {
            addCriterion("residue <>", value, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueGreaterThan(BigDecimal value) {
            addCriterion("residue >", value, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("residue >=", value, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueLessThan(BigDecimal value) {
            addCriterion("residue <", value, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("residue <=", value, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueIn(List<BigDecimal> values) {
            addCriterion("residue in", values, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueNotIn(List<BigDecimal> values) {
            addCriterion("residue not in", values, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("residue between", value1, value2, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("residue not between", value1, value2, "residue");
            return (Criteria) this;
        }
    }

    /**
     */
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