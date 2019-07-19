package com.join.autism.entity.HzhChildren;

import java.util.ArrayList;
import java.util.List;

public class HzhChildrenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HzhChildrenExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andQuestion1IsNull() {
            addCriterion("question1 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion1IsNotNull() {
            addCriterion("question1 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion1EqualTo(Integer value) {
            addCriterion("question1 =", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1NotEqualTo(Integer value) {
            addCriterion("question1 <>", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1GreaterThan(Integer value) {
            addCriterion("question1 >", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1GreaterThanOrEqualTo(Integer value) {
            addCriterion("question1 >=", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1LessThan(Integer value) {
            addCriterion("question1 <", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1LessThanOrEqualTo(Integer value) {
            addCriterion("question1 <=", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1In(List<Integer> values) {
            addCriterion("question1 in", values, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1NotIn(List<Integer> values) {
            addCriterion("question1 not in", values, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1Between(Integer value1, Integer value2) {
            addCriterion("question1 between", value1, value2, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1NotBetween(Integer value1, Integer value2) {
            addCriterion("question1 not between", value1, value2, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion2IsNull() {
            addCriterion("question2 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion2IsNotNull() {
            addCriterion("question2 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion2EqualTo(Integer value) {
            addCriterion("question2 =", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2NotEqualTo(Integer value) {
            addCriterion("question2 <>", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2GreaterThan(Integer value) {
            addCriterion("question2 >", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2GreaterThanOrEqualTo(Integer value) {
            addCriterion("question2 >=", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2LessThan(Integer value) {
            addCriterion("question2 <", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2LessThanOrEqualTo(Integer value) {
            addCriterion("question2 <=", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2In(List<Integer> values) {
            addCriterion("question2 in", values, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2NotIn(List<Integer> values) {
            addCriterion("question2 not in", values, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2Between(Integer value1, Integer value2) {
            addCriterion("question2 between", value1, value2, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2NotBetween(Integer value1, Integer value2) {
            addCriterion("question2 not between", value1, value2, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion3IsNull() {
            addCriterion("question3 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion3IsNotNull() {
            addCriterion("question3 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion3EqualTo(Integer value) {
            addCriterion("question3 =", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3NotEqualTo(Integer value) {
            addCriterion("question3 <>", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3GreaterThan(Integer value) {
            addCriterion("question3 >", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3GreaterThanOrEqualTo(Integer value) {
            addCriterion("question3 >=", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3LessThan(Integer value) {
            addCriterion("question3 <", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3LessThanOrEqualTo(Integer value) {
            addCriterion("question3 <=", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3In(List<Integer> values) {
            addCriterion("question3 in", values, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3NotIn(List<Integer> values) {
            addCriterion("question3 not in", values, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3Between(Integer value1, Integer value2) {
            addCriterion("question3 between", value1, value2, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3NotBetween(Integer value1, Integer value2) {
            addCriterion("question3 not between", value1, value2, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion4IsNull() {
            addCriterion("question4 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion4IsNotNull() {
            addCriterion("question4 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion4EqualTo(Integer value) {
            addCriterion("question4 =", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4NotEqualTo(Integer value) {
            addCriterion("question4 <>", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4GreaterThan(Integer value) {
            addCriterion("question4 >", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4GreaterThanOrEqualTo(Integer value) {
            addCriterion("question4 >=", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4LessThan(Integer value) {
            addCriterion("question4 <", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4LessThanOrEqualTo(Integer value) {
            addCriterion("question4 <=", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4In(List<Integer> values) {
            addCriterion("question4 in", values, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4NotIn(List<Integer> values) {
            addCriterion("question4 not in", values, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4Between(Integer value1, Integer value2) {
            addCriterion("question4 between", value1, value2, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4NotBetween(Integer value1, Integer value2) {
            addCriterion("question4 not between", value1, value2, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion5IsNull() {
            addCriterion("question5 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion5IsNotNull() {
            addCriterion("question5 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion5EqualTo(Integer value) {
            addCriterion("question5 =", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5NotEqualTo(Integer value) {
            addCriterion("question5 <>", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5GreaterThan(Integer value) {
            addCriterion("question5 >", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5GreaterThanOrEqualTo(Integer value) {
            addCriterion("question5 >=", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5LessThan(Integer value) {
            addCriterion("question5 <", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5LessThanOrEqualTo(Integer value) {
            addCriterion("question5 <=", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5In(List<Integer> values) {
            addCriterion("question5 in", values, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5NotIn(List<Integer> values) {
            addCriterion("question5 not in", values, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5Between(Integer value1, Integer value2) {
            addCriterion("question5 between", value1, value2, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5NotBetween(Integer value1, Integer value2) {
            addCriterion("question5 not between", value1, value2, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion6IsNull() {
            addCriterion("question6 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion6IsNotNull() {
            addCriterion("question6 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion6EqualTo(Integer value) {
            addCriterion("question6 =", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6NotEqualTo(Integer value) {
            addCriterion("question6 <>", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6GreaterThan(Integer value) {
            addCriterion("question6 >", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6GreaterThanOrEqualTo(Integer value) {
            addCriterion("question6 >=", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6LessThan(Integer value) {
            addCriterion("question6 <", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6LessThanOrEqualTo(Integer value) {
            addCriterion("question6 <=", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6In(List<Integer> values) {
            addCriterion("question6 in", values, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6NotIn(List<Integer> values) {
            addCriterion("question6 not in", values, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6Between(Integer value1, Integer value2) {
            addCriterion("question6 between", value1, value2, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6NotBetween(Integer value1, Integer value2) {
            addCriterion("question6 not between", value1, value2, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion7IsNull() {
            addCriterion("question7 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion7IsNotNull() {
            addCriterion("question7 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion7EqualTo(Integer value) {
            addCriterion("question7 =", value, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7NotEqualTo(Integer value) {
            addCriterion("question7 <>", value, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7GreaterThan(Integer value) {
            addCriterion("question7 >", value, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7GreaterThanOrEqualTo(Integer value) {
            addCriterion("question7 >=", value, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7LessThan(Integer value) {
            addCriterion("question7 <", value, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7LessThanOrEqualTo(Integer value) {
            addCriterion("question7 <=", value, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7In(List<Integer> values) {
            addCriterion("question7 in", values, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7NotIn(List<Integer> values) {
            addCriterion("question7 not in", values, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7Between(Integer value1, Integer value2) {
            addCriterion("question7 between", value1, value2, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7NotBetween(Integer value1, Integer value2) {
            addCriterion("question7 not between", value1, value2, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion8IsNull() {
            addCriterion("question8 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion8IsNotNull() {
            addCriterion("question8 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion8EqualTo(Integer value) {
            addCriterion("question8 =", value, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8NotEqualTo(Integer value) {
            addCriterion("question8 <>", value, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8GreaterThan(Integer value) {
            addCriterion("question8 >", value, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8GreaterThanOrEqualTo(Integer value) {
            addCriterion("question8 >=", value, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8LessThan(Integer value) {
            addCriterion("question8 <", value, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8LessThanOrEqualTo(Integer value) {
            addCriterion("question8 <=", value, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8In(List<Integer> values) {
            addCriterion("question8 in", values, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8NotIn(List<Integer> values) {
            addCriterion("question8 not in", values, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8Between(Integer value1, Integer value2) {
            addCriterion("question8 between", value1, value2, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8NotBetween(Integer value1, Integer value2) {
            addCriterion("question8 not between", value1, value2, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion9IsNull() {
            addCriterion("question9 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion9IsNotNull() {
            addCriterion("question9 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion9EqualTo(Integer value) {
            addCriterion("question9 =", value, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9NotEqualTo(Integer value) {
            addCriterion("question9 <>", value, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9GreaterThan(Integer value) {
            addCriterion("question9 >", value, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9GreaterThanOrEqualTo(Integer value) {
            addCriterion("question9 >=", value, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9LessThan(Integer value) {
            addCriterion("question9 <", value, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9LessThanOrEqualTo(Integer value) {
            addCriterion("question9 <=", value, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9In(List<Integer> values) {
            addCriterion("question9 in", values, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9NotIn(List<Integer> values) {
            addCriterion("question9 not in", values, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9Between(Integer value1, Integer value2) {
            addCriterion("question9 between", value1, value2, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9NotBetween(Integer value1, Integer value2) {
            addCriterion("question9 not between", value1, value2, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion10IsNull() {
            addCriterion("question10 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion10IsNotNull() {
            addCriterion("question10 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion10EqualTo(Integer value) {
            addCriterion("question10 =", value, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10NotEqualTo(Integer value) {
            addCriterion("question10 <>", value, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10GreaterThan(Integer value) {
            addCriterion("question10 >", value, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10GreaterThanOrEqualTo(Integer value) {
            addCriterion("question10 >=", value, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10LessThan(Integer value) {
            addCriterion("question10 <", value, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10LessThanOrEqualTo(Integer value) {
            addCriterion("question10 <=", value, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10In(List<Integer> values) {
            addCriterion("question10 in", values, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10NotIn(List<Integer> values) {
            addCriterion("question10 not in", values, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10Between(Integer value1, Integer value2) {
            addCriterion("question10 between", value1, value2, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10NotBetween(Integer value1, Integer value2) {
            addCriterion("question10 not between", value1, value2, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion11IsNull() {
            addCriterion("question11 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion11IsNotNull() {
            addCriterion("question11 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion11EqualTo(Integer value) {
            addCriterion("question11 =", value, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11NotEqualTo(Integer value) {
            addCriterion("question11 <>", value, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11GreaterThan(Integer value) {
            addCriterion("question11 >", value, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11GreaterThanOrEqualTo(Integer value) {
            addCriterion("question11 >=", value, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11LessThan(Integer value) {
            addCriterion("question11 <", value, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11LessThanOrEqualTo(Integer value) {
            addCriterion("question11 <=", value, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11In(List<Integer> values) {
            addCriterion("question11 in", values, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11NotIn(List<Integer> values) {
            addCriterion("question11 not in", values, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11Between(Integer value1, Integer value2) {
            addCriterion("question11 between", value1, value2, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11NotBetween(Integer value1, Integer value2) {
            addCriterion("question11 not between", value1, value2, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion12IsNull() {
            addCriterion("question12 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion12IsNotNull() {
            addCriterion("question12 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion12EqualTo(Integer value) {
            addCriterion("question12 =", value, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12NotEqualTo(Integer value) {
            addCriterion("question12 <>", value, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12GreaterThan(Integer value) {
            addCriterion("question12 >", value, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12GreaterThanOrEqualTo(Integer value) {
            addCriterion("question12 >=", value, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12LessThan(Integer value) {
            addCriterion("question12 <", value, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12LessThanOrEqualTo(Integer value) {
            addCriterion("question12 <=", value, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12In(List<Integer> values) {
            addCriterion("question12 in", values, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12NotIn(List<Integer> values) {
            addCriterion("question12 not in", values, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12Between(Integer value1, Integer value2) {
            addCriterion("question12 between", value1, value2, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12NotBetween(Integer value1, Integer value2) {
            addCriterion("question12 not between", value1, value2, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion13IsNull() {
            addCriterion("question13 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion13IsNotNull() {
            addCriterion("question13 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion13EqualTo(Integer value) {
            addCriterion("question13 =", value, "question13");
            return (Criteria) this;
        }

        public Criteria andQuestion13NotEqualTo(Integer value) {
            addCriterion("question13 <>", value, "question13");
            return (Criteria) this;
        }

        public Criteria andQuestion13GreaterThan(Integer value) {
            addCriterion("question13 >", value, "question13");
            return (Criteria) this;
        }

        public Criteria andQuestion13GreaterThanOrEqualTo(Integer value) {
            addCriterion("question13 >=", value, "question13");
            return (Criteria) this;
        }

        public Criteria andQuestion13LessThan(Integer value) {
            addCriterion("question13 <", value, "question13");
            return (Criteria) this;
        }

        public Criteria andQuestion13LessThanOrEqualTo(Integer value) {
            addCriterion("question13 <=", value, "question13");
            return (Criteria) this;
        }

        public Criteria andQuestion13In(List<Integer> values) {
            addCriterion("question13 in", values, "question13");
            return (Criteria) this;
        }

        public Criteria andQuestion13NotIn(List<Integer> values) {
            addCriterion("question13 not in", values, "question13");
            return (Criteria) this;
        }

        public Criteria andQuestion13Between(Integer value1, Integer value2) {
            addCriterion("question13 between", value1, value2, "question13");
            return (Criteria) this;
        }

        public Criteria andQuestion13NotBetween(Integer value1, Integer value2) {
            addCriterion("question13 not between", value1, value2, "question13");
            return (Criteria) this;
        }

        public Criteria andQuestion14IsNull() {
            addCriterion("question14 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion14IsNotNull() {
            addCriterion("question14 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion14EqualTo(Integer value) {
            addCriterion("question14 =", value, "question14");
            return (Criteria) this;
        }

        public Criteria andQuestion14NotEqualTo(Integer value) {
            addCriterion("question14 <>", value, "question14");
            return (Criteria) this;
        }

        public Criteria andQuestion14GreaterThan(Integer value) {
            addCriterion("question14 >", value, "question14");
            return (Criteria) this;
        }

        public Criteria andQuestion14GreaterThanOrEqualTo(Integer value) {
            addCriterion("question14 >=", value, "question14");
            return (Criteria) this;
        }

        public Criteria andQuestion14LessThan(Integer value) {
            addCriterion("question14 <", value, "question14");
            return (Criteria) this;
        }

        public Criteria andQuestion14LessThanOrEqualTo(Integer value) {
            addCriterion("question14 <=", value, "question14");
            return (Criteria) this;
        }

        public Criteria andQuestion14In(List<Integer> values) {
            addCriterion("question14 in", values, "question14");
            return (Criteria) this;
        }

        public Criteria andQuestion14NotIn(List<Integer> values) {
            addCriterion("question14 not in", values, "question14");
            return (Criteria) this;
        }

        public Criteria andQuestion14Between(Integer value1, Integer value2) {
            addCriterion("question14 between", value1, value2, "question14");
            return (Criteria) this;
        }

        public Criteria andQuestion14NotBetween(Integer value1, Integer value2) {
            addCriterion("question14 not between", value1, value2, "question14");
            return (Criteria) this;
        }

        public Criteria andQuestion15IsNull() {
            addCriterion("question15 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion15IsNotNull() {
            addCriterion("question15 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion15EqualTo(Integer value) {
            addCriterion("question15 =", value, "question15");
            return (Criteria) this;
        }

        public Criteria andQuestion15NotEqualTo(Integer value) {
            addCriterion("question15 <>", value, "question15");
            return (Criteria) this;
        }

        public Criteria andQuestion15GreaterThan(Integer value) {
            addCriterion("question15 >", value, "question15");
            return (Criteria) this;
        }

        public Criteria andQuestion15GreaterThanOrEqualTo(Integer value) {
            addCriterion("question15 >=", value, "question15");
            return (Criteria) this;
        }

        public Criteria andQuestion15LessThan(Integer value) {
            addCriterion("question15 <", value, "question15");
            return (Criteria) this;
        }

        public Criteria andQuestion15LessThanOrEqualTo(Integer value) {
            addCriterion("question15 <=", value, "question15");
            return (Criteria) this;
        }

        public Criteria andQuestion15In(List<Integer> values) {
            addCriterion("question15 in", values, "question15");
            return (Criteria) this;
        }

        public Criteria andQuestion15NotIn(List<Integer> values) {
            addCriterion("question15 not in", values, "question15");
            return (Criteria) this;
        }

        public Criteria andQuestion15Between(Integer value1, Integer value2) {
            addCriterion("question15 between", value1, value2, "question15");
            return (Criteria) this;
        }

        public Criteria andQuestion15NotBetween(Integer value1, Integer value2) {
            addCriterion("question15 not between", value1, value2, "question15");
            return (Criteria) this;
        }

        public Criteria andQuestionSumIsNull() {
            addCriterion("question_sum is null");
            return (Criteria) this;
        }

        public Criteria andQuestionSumIsNotNull() {
            addCriterion("question_sum is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionSumEqualTo(Integer value) {
            addCriterion("question_sum =", value, "questionSum");
            return (Criteria) this;
        }

        public Criteria andQuestionSumNotEqualTo(Integer value) {
            addCriterion("question_sum <>", value, "questionSum");
            return (Criteria) this;
        }

        public Criteria andQuestionSumGreaterThan(Integer value) {
            addCriterion("question_sum >", value, "questionSum");
            return (Criteria) this;
        }

        public Criteria andQuestionSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_sum >=", value, "questionSum");
            return (Criteria) this;
        }

        public Criteria andQuestionSumLessThan(Integer value) {
            addCriterion("question_sum <", value, "questionSum");
            return (Criteria) this;
        }

        public Criteria andQuestionSumLessThanOrEqualTo(Integer value) {
            addCriterion("question_sum <=", value, "questionSum");
            return (Criteria) this;
        }

        public Criteria andQuestionSumIn(List<Integer> values) {
            addCriterion("question_sum in", values, "questionSum");
            return (Criteria) this;
        }

        public Criteria andQuestionSumNotIn(List<Integer> values) {
            addCriterion("question_sum not in", values, "questionSum");
            return (Criteria) this;
        }

        public Criteria andQuestionSumBetween(Integer value1, Integer value2) {
            addCriterion("question_sum between", value1, value2, "questionSum");
            return (Criteria) this;
        }

        public Criteria andQuestionSumNotBetween(Integer value1, Integer value2) {
            addCriterion("question_sum not between", value1, value2, "questionSum");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIsNull() {
            addCriterion("diagnosis is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIsNotNull() {
            addCriterion("diagnosis is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisEqualTo(String value) {
            addCriterion("diagnosis =", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNotEqualTo(String value) {
            addCriterion("diagnosis <>", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisGreaterThan(String value) {
            addCriterion("diagnosis >", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisGreaterThanOrEqualTo(String value) {
            addCriterion("diagnosis >=", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisLessThan(String value) {
            addCriterion("diagnosis <", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisLessThanOrEqualTo(String value) {
            addCriterion("diagnosis <=", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisLike(String value) {
            addCriterion("diagnosis like", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNotLike(String value) {
            addCriterion("diagnosis not like", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIn(List<String> values) {
            addCriterion("diagnosis in", values, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNotIn(List<String> values) {
            addCriterion("diagnosis not in", values, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisBetween(String value1, String value2) {
            addCriterion("diagnosis between", value1, value2, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNotBetween(String value1, String value2) {
            addCriterion("diagnosis not between", value1, value2, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andChildIdIsNull() {
            addCriterion("child_id is null");
            return (Criteria) this;
        }

        public Criteria andChildIdIsNotNull() {
            addCriterion("child_id is not null");
            return (Criteria) this;
        }

        public Criteria andChildIdEqualTo(Integer value) {
            addCriterion("child_id =", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdNotEqualTo(Integer value) {
            addCriterion("child_id <>", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdGreaterThan(Integer value) {
            addCriterion("child_id >", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("child_id >=", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdLessThan(Integer value) {
            addCriterion("child_id <", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdLessThanOrEqualTo(Integer value) {
            addCriterion("child_id <=", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdIn(List<Integer> values) {
            addCriterion("child_id in", values, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdNotIn(List<Integer> values) {
            addCriterion("child_id not in", values, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdBetween(Integer value1, Integer value2) {
            addCriterion("child_id between", value1, value2, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdNotBetween(Integer value1, Integer value2) {
            addCriterion("child_id not between", value1, value2, "childId");
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