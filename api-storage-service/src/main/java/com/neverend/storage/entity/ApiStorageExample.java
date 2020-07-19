package com.neverend.storage.entity;

import java.util.ArrayList;
import java.util.List;

public class ApiStorageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApiStorageExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Long value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Long value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Long value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Long value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Long value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Long> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Long> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProTotalIsNull() {
            addCriterion("pro_total is null");
            return (Criteria) this;
        }

        public Criteria andProTotalIsNotNull() {
            addCriterion("pro_total is not null");
            return (Criteria) this;
        }

        public Criteria andProTotalEqualTo(Integer value) {
            addCriterion("pro_total =", value, "proTotal");
            return (Criteria) this;
        }

        public Criteria andProTotalNotEqualTo(Integer value) {
            addCriterion("pro_total <>", value, "proTotal");
            return (Criteria) this;
        }

        public Criteria andProTotalGreaterThan(Integer value) {
            addCriterion("pro_total >", value, "proTotal");
            return (Criteria) this;
        }

        public Criteria andProTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_total >=", value, "proTotal");
            return (Criteria) this;
        }

        public Criteria andProTotalLessThan(Integer value) {
            addCriterion("pro_total <", value, "proTotal");
            return (Criteria) this;
        }

        public Criteria andProTotalLessThanOrEqualTo(Integer value) {
            addCriterion("pro_total <=", value, "proTotal");
            return (Criteria) this;
        }

        public Criteria andProTotalIn(List<Integer> values) {
            addCriterion("pro_total in", values, "proTotal");
            return (Criteria) this;
        }

        public Criteria andProTotalNotIn(List<Integer> values) {
            addCriterion("pro_total not in", values, "proTotal");
            return (Criteria) this;
        }

        public Criteria andProTotalBetween(Integer value1, Integer value2) {
            addCriterion("pro_total between", value1, value2, "proTotal");
            return (Criteria) this;
        }

        public Criteria andProTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_total not between", value1, value2, "proTotal");
            return (Criteria) this;
        }

        public Criteria andProUsedIsNull() {
            addCriterion("pro_used is null");
            return (Criteria) this;
        }

        public Criteria andProUsedIsNotNull() {
            addCriterion("pro_used is not null");
            return (Criteria) this;
        }

        public Criteria andProUsedEqualTo(Integer value) {
            addCriterion("pro_used =", value, "proUsed");
            return (Criteria) this;
        }

        public Criteria andProUsedNotEqualTo(Integer value) {
            addCriterion("pro_used <>", value, "proUsed");
            return (Criteria) this;
        }

        public Criteria andProUsedGreaterThan(Integer value) {
            addCriterion("pro_used >", value, "proUsed");
            return (Criteria) this;
        }

        public Criteria andProUsedGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_used >=", value, "proUsed");
            return (Criteria) this;
        }

        public Criteria andProUsedLessThan(Integer value) {
            addCriterion("pro_used <", value, "proUsed");
            return (Criteria) this;
        }

        public Criteria andProUsedLessThanOrEqualTo(Integer value) {
            addCriterion("pro_used <=", value, "proUsed");
            return (Criteria) this;
        }

        public Criteria andProUsedIn(List<Integer> values) {
            addCriterion("pro_used in", values, "proUsed");
            return (Criteria) this;
        }

        public Criteria andProUsedNotIn(List<Integer> values) {
            addCriterion("pro_used not in", values, "proUsed");
            return (Criteria) this;
        }

        public Criteria andProUsedBetween(Integer value1, Integer value2) {
            addCriterion("pro_used between", value1, value2, "proUsed");
            return (Criteria) this;
        }

        public Criteria andProUsedNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_used not between", value1, value2, "proUsed");
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

        public Criteria andResidueEqualTo(Integer value) {
            addCriterion("residue =", value, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueNotEqualTo(Integer value) {
            addCriterion("residue <>", value, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueGreaterThan(Integer value) {
            addCriterion("residue >", value, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueGreaterThanOrEqualTo(Integer value) {
            addCriterion("residue >=", value, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueLessThan(Integer value) {
            addCriterion("residue <", value, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueLessThanOrEqualTo(Integer value) {
            addCriterion("residue <=", value, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueIn(List<Integer> values) {
            addCriterion("residue in", values, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueNotIn(List<Integer> values) {
            addCriterion("residue not in", values, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueBetween(Integer value1, Integer value2) {
            addCriterion("residue between", value1, value2, "residue");
            return (Criteria) this;
        }

        public Criteria andResidueNotBetween(Integer value1, Integer value2) {
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