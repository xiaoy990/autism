package com.join.autism.entity.HzhThreemon;

import java.util.ArrayList;
import java.util.List;

public class HzhThreemonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HzhThreemonExample() {
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

        public Criteria andQuestion16IsNull() {
            addCriterion("question16 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion16IsNotNull() {
            addCriterion("question16 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion16EqualTo(Integer value) {
            addCriterion("question16 =", value, "question16");
            return (Criteria) this;
        }

        public Criteria andQuestion16NotEqualTo(Integer value) {
            addCriterion("question16 <>", value, "question16");
            return (Criteria) this;
        }

        public Criteria andQuestion16GreaterThan(Integer value) {
            addCriterion("question16 >", value, "question16");
            return (Criteria) this;
        }

        public Criteria andQuestion16GreaterThanOrEqualTo(Integer value) {
            addCriterion("question16 >=", value, "question16");
            return (Criteria) this;
        }

        public Criteria andQuestion16LessThan(Integer value) {
            addCriterion("question16 <", value, "question16");
            return (Criteria) this;
        }

        public Criteria andQuestion16LessThanOrEqualTo(Integer value) {
            addCriterion("question16 <=", value, "question16");
            return (Criteria) this;
        }

        public Criteria andQuestion16In(List<Integer> values) {
            addCriterion("question16 in", values, "question16");
            return (Criteria) this;
        }

        public Criteria andQuestion16NotIn(List<Integer> values) {
            addCriterion("question16 not in", values, "question16");
            return (Criteria) this;
        }

        public Criteria andQuestion16Between(Integer value1, Integer value2) {
            addCriterion("question16 between", value1, value2, "question16");
            return (Criteria) this;
        }

        public Criteria andQuestion16NotBetween(Integer value1, Integer value2) {
            addCriterion("question16 not between", value1, value2, "question16");
            return (Criteria) this;
        }

        public Criteria andQuestion17IsNull() {
            addCriterion("question17 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion17IsNotNull() {
            addCriterion("question17 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion17EqualTo(Integer value) {
            addCriterion("question17 =", value, "question17");
            return (Criteria) this;
        }

        public Criteria andQuestion17NotEqualTo(Integer value) {
            addCriterion("question17 <>", value, "question17");
            return (Criteria) this;
        }

        public Criteria andQuestion17GreaterThan(Integer value) {
            addCriterion("question17 >", value, "question17");
            return (Criteria) this;
        }

        public Criteria andQuestion17GreaterThanOrEqualTo(Integer value) {
            addCriterion("question17 >=", value, "question17");
            return (Criteria) this;
        }

        public Criteria andQuestion17LessThan(Integer value) {
            addCriterion("question17 <", value, "question17");
            return (Criteria) this;
        }

        public Criteria andQuestion17LessThanOrEqualTo(Integer value) {
            addCriterion("question17 <=", value, "question17");
            return (Criteria) this;
        }

        public Criteria andQuestion17In(List<Integer> values) {
            addCriterion("question17 in", values, "question17");
            return (Criteria) this;
        }

        public Criteria andQuestion17NotIn(List<Integer> values) {
            addCriterion("question17 not in", values, "question17");
            return (Criteria) this;
        }

        public Criteria andQuestion17Between(Integer value1, Integer value2) {
            addCriterion("question17 between", value1, value2, "question17");
            return (Criteria) this;
        }

        public Criteria andQuestion17NotBetween(Integer value1, Integer value2) {
            addCriterion("question17 not between", value1, value2, "question17");
            return (Criteria) this;
        }

        public Criteria andQuestion18IsNull() {
            addCriterion("question18 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion18IsNotNull() {
            addCriterion("question18 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion18EqualTo(Integer value) {
            addCriterion("question18 =", value, "question18");
            return (Criteria) this;
        }

        public Criteria andQuestion18NotEqualTo(Integer value) {
            addCriterion("question18 <>", value, "question18");
            return (Criteria) this;
        }

        public Criteria andQuestion18GreaterThan(Integer value) {
            addCriterion("question18 >", value, "question18");
            return (Criteria) this;
        }

        public Criteria andQuestion18GreaterThanOrEqualTo(Integer value) {
            addCriterion("question18 >=", value, "question18");
            return (Criteria) this;
        }

        public Criteria andQuestion18LessThan(Integer value) {
            addCriterion("question18 <", value, "question18");
            return (Criteria) this;
        }

        public Criteria andQuestion18LessThanOrEqualTo(Integer value) {
            addCriterion("question18 <=", value, "question18");
            return (Criteria) this;
        }

        public Criteria andQuestion18In(List<Integer> values) {
            addCriterion("question18 in", values, "question18");
            return (Criteria) this;
        }

        public Criteria andQuestion18NotIn(List<Integer> values) {
            addCriterion("question18 not in", values, "question18");
            return (Criteria) this;
        }

        public Criteria andQuestion18Between(Integer value1, Integer value2) {
            addCriterion("question18 between", value1, value2, "question18");
            return (Criteria) this;
        }

        public Criteria andQuestion18NotBetween(Integer value1, Integer value2) {
            addCriterion("question18 not between", value1, value2, "question18");
            return (Criteria) this;
        }

        public Criteria andQuestion19IsNull() {
            addCriterion("question19 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion19IsNotNull() {
            addCriterion("question19 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion19EqualTo(Integer value) {
            addCriterion("question19 =", value, "question19");
            return (Criteria) this;
        }

        public Criteria andQuestion19NotEqualTo(Integer value) {
            addCriterion("question19 <>", value, "question19");
            return (Criteria) this;
        }

        public Criteria andQuestion19GreaterThan(Integer value) {
            addCriterion("question19 >", value, "question19");
            return (Criteria) this;
        }

        public Criteria andQuestion19GreaterThanOrEqualTo(Integer value) {
            addCriterion("question19 >=", value, "question19");
            return (Criteria) this;
        }

        public Criteria andQuestion19LessThan(Integer value) {
            addCriterion("question19 <", value, "question19");
            return (Criteria) this;
        }

        public Criteria andQuestion19LessThanOrEqualTo(Integer value) {
            addCriterion("question19 <=", value, "question19");
            return (Criteria) this;
        }

        public Criteria andQuestion19In(List<Integer> values) {
            addCriterion("question19 in", values, "question19");
            return (Criteria) this;
        }

        public Criteria andQuestion19NotIn(List<Integer> values) {
            addCriterion("question19 not in", values, "question19");
            return (Criteria) this;
        }

        public Criteria andQuestion19Between(Integer value1, Integer value2) {
            addCriterion("question19 between", value1, value2, "question19");
            return (Criteria) this;
        }

        public Criteria andQuestion19NotBetween(Integer value1, Integer value2) {
            addCriterion("question19 not between", value1, value2, "question19");
            return (Criteria) this;
        }

        public Criteria andQuestion20IsNull() {
            addCriterion("question20 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion20IsNotNull() {
            addCriterion("question20 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion20EqualTo(Integer value) {
            addCriterion("question20 =", value, "question20");
            return (Criteria) this;
        }

        public Criteria andQuestion20NotEqualTo(Integer value) {
            addCriterion("question20 <>", value, "question20");
            return (Criteria) this;
        }

        public Criteria andQuestion20GreaterThan(Integer value) {
            addCriterion("question20 >", value, "question20");
            return (Criteria) this;
        }

        public Criteria andQuestion20GreaterThanOrEqualTo(Integer value) {
            addCriterion("question20 >=", value, "question20");
            return (Criteria) this;
        }

        public Criteria andQuestion20LessThan(Integer value) {
            addCriterion("question20 <", value, "question20");
            return (Criteria) this;
        }

        public Criteria andQuestion20LessThanOrEqualTo(Integer value) {
            addCriterion("question20 <=", value, "question20");
            return (Criteria) this;
        }

        public Criteria andQuestion20In(List<Integer> values) {
            addCriterion("question20 in", values, "question20");
            return (Criteria) this;
        }

        public Criteria andQuestion20NotIn(List<Integer> values) {
            addCriterion("question20 not in", values, "question20");
            return (Criteria) this;
        }

        public Criteria andQuestion20Between(Integer value1, Integer value2) {
            addCriterion("question20 between", value1, value2, "question20");
            return (Criteria) this;
        }

        public Criteria andQuestion20NotBetween(Integer value1, Integer value2) {
            addCriterion("question20 not between", value1, value2, "question20");
            return (Criteria) this;
        }

        public Criteria andQuestion21IsNull() {
            addCriterion("question21 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion21IsNotNull() {
            addCriterion("question21 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion21EqualTo(Integer value) {
            addCriterion("question21 =", value, "question21");
            return (Criteria) this;
        }

        public Criteria andQuestion21NotEqualTo(Integer value) {
            addCriterion("question21 <>", value, "question21");
            return (Criteria) this;
        }

        public Criteria andQuestion21GreaterThan(Integer value) {
            addCriterion("question21 >", value, "question21");
            return (Criteria) this;
        }

        public Criteria andQuestion21GreaterThanOrEqualTo(Integer value) {
            addCriterion("question21 >=", value, "question21");
            return (Criteria) this;
        }

        public Criteria andQuestion21LessThan(Integer value) {
            addCriterion("question21 <", value, "question21");
            return (Criteria) this;
        }

        public Criteria andQuestion21LessThanOrEqualTo(Integer value) {
            addCriterion("question21 <=", value, "question21");
            return (Criteria) this;
        }

        public Criteria andQuestion21In(List<Integer> values) {
            addCriterion("question21 in", values, "question21");
            return (Criteria) this;
        }

        public Criteria andQuestion21NotIn(List<Integer> values) {
            addCriterion("question21 not in", values, "question21");
            return (Criteria) this;
        }

        public Criteria andQuestion21Between(Integer value1, Integer value2) {
            addCriterion("question21 between", value1, value2, "question21");
            return (Criteria) this;
        }

        public Criteria andQuestion21NotBetween(Integer value1, Integer value2) {
            addCriterion("question21 not between", value1, value2, "question21");
            return (Criteria) this;
        }

        public Criteria andQuestion22IsNull() {
            addCriterion("question22 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion22IsNotNull() {
            addCriterion("question22 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion22EqualTo(Integer value) {
            addCriterion("question22 =", value, "question22");
            return (Criteria) this;
        }

        public Criteria andQuestion22NotEqualTo(Integer value) {
            addCriterion("question22 <>", value, "question22");
            return (Criteria) this;
        }

        public Criteria andQuestion22GreaterThan(Integer value) {
            addCriterion("question22 >", value, "question22");
            return (Criteria) this;
        }

        public Criteria andQuestion22GreaterThanOrEqualTo(Integer value) {
            addCriterion("question22 >=", value, "question22");
            return (Criteria) this;
        }

        public Criteria andQuestion22LessThan(Integer value) {
            addCriterion("question22 <", value, "question22");
            return (Criteria) this;
        }

        public Criteria andQuestion22LessThanOrEqualTo(Integer value) {
            addCriterion("question22 <=", value, "question22");
            return (Criteria) this;
        }

        public Criteria andQuestion22In(List<Integer> values) {
            addCriterion("question22 in", values, "question22");
            return (Criteria) this;
        }

        public Criteria andQuestion22NotIn(List<Integer> values) {
            addCriterion("question22 not in", values, "question22");
            return (Criteria) this;
        }

        public Criteria andQuestion22Between(Integer value1, Integer value2) {
            addCriterion("question22 between", value1, value2, "question22");
            return (Criteria) this;
        }

        public Criteria andQuestion22NotBetween(Integer value1, Integer value2) {
            addCriterion("question22 not between", value1, value2, "question22");
            return (Criteria) this;
        }

        public Criteria andQuestion23IsNull() {
            addCriterion("question23 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion23IsNotNull() {
            addCriterion("question23 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion23EqualTo(Integer value) {
            addCriterion("question23 =", value, "question23");
            return (Criteria) this;
        }

        public Criteria andQuestion23NotEqualTo(Integer value) {
            addCriterion("question23 <>", value, "question23");
            return (Criteria) this;
        }

        public Criteria andQuestion23GreaterThan(Integer value) {
            addCriterion("question23 >", value, "question23");
            return (Criteria) this;
        }

        public Criteria andQuestion23GreaterThanOrEqualTo(Integer value) {
            addCriterion("question23 >=", value, "question23");
            return (Criteria) this;
        }

        public Criteria andQuestion23LessThan(Integer value) {
            addCriterion("question23 <", value, "question23");
            return (Criteria) this;
        }

        public Criteria andQuestion23LessThanOrEqualTo(Integer value) {
            addCriterion("question23 <=", value, "question23");
            return (Criteria) this;
        }

        public Criteria andQuestion23In(List<Integer> values) {
            addCriterion("question23 in", values, "question23");
            return (Criteria) this;
        }

        public Criteria andQuestion23NotIn(List<Integer> values) {
            addCriterion("question23 not in", values, "question23");
            return (Criteria) this;
        }

        public Criteria andQuestion23Between(Integer value1, Integer value2) {
            addCriterion("question23 between", value1, value2, "question23");
            return (Criteria) this;
        }

        public Criteria andQuestion23NotBetween(Integer value1, Integer value2) {
            addCriterion("question23 not between", value1, value2, "question23");
            return (Criteria) this;
        }

        public Criteria andQuestion24IsNull() {
            addCriterion("question24 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion24IsNotNull() {
            addCriterion("question24 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion24EqualTo(Integer value) {
            addCriterion("question24 =", value, "question24");
            return (Criteria) this;
        }

        public Criteria andQuestion24NotEqualTo(Integer value) {
            addCriterion("question24 <>", value, "question24");
            return (Criteria) this;
        }

        public Criteria andQuestion24GreaterThan(Integer value) {
            addCriterion("question24 >", value, "question24");
            return (Criteria) this;
        }

        public Criteria andQuestion24GreaterThanOrEqualTo(Integer value) {
            addCriterion("question24 >=", value, "question24");
            return (Criteria) this;
        }

        public Criteria andQuestion24LessThan(Integer value) {
            addCriterion("question24 <", value, "question24");
            return (Criteria) this;
        }

        public Criteria andQuestion24LessThanOrEqualTo(Integer value) {
            addCriterion("question24 <=", value, "question24");
            return (Criteria) this;
        }

        public Criteria andQuestion24In(List<Integer> values) {
            addCriterion("question24 in", values, "question24");
            return (Criteria) this;
        }

        public Criteria andQuestion24NotIn(List<Integer> values) {
            addCriterion("question24 not in", values, "question24");
            return (Criteria) this;
        }

        public Criteria andQuestion24Between(Integer value1, Integer value2) {
            addCriterion("question24 between", value1, value2, "question24");
            return (Criteria) this;
        }

        public Criteria andQuestion24NotBetween(Integer value1, Integer value2) {
            addCriterion("question24 not between", value1, value2, "question24");
            return (Criteria) this;
        }

        public Criteria andQuestion25IsNull() {
            addCriterion("question25 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion25IsNotNull() {
            addCriterion("question25 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion25EqualTo(Integer value) {
            addCriterion("question25 =", value, "question25");
            return (Criteria) this;
        }

        public Criteria andQuestion25NotEqualTo(Integer value) {
            addCriterion("question25 <>", value, "question25");
            return (Criteria) this;
        }

        public Criteria andQuestion25GreaterThan(Integer value) {
            addCriterion("question25 >", value, "question25");
            return (Criteria) this;
        }

        public Criteria andQuestion25GreaterThanOrEqualTo(Integer value) {
            addCriterion("question25 >=", value, "question25");
            return (Criteria) this;
        }

        public Criteria andQuestion25LessThan(Integer value) {
            addCriterion("question25 <", value, "question25");
            return (Criteria) this;
        }

        public Criteria andQuestion25LessThanOrEqualTo(Integer value) {
            addCriterion("question25 <=", value, "question25");
            return (Criteria) this;
        }

        public Criteria andQuestion25In(List<Integer> values) {
            addCriterion("question25 in", values, "question25");
            return (Criteria) this;
        }

        public Criteria andQuestion25NotIn(List<Integer> values) {
            addCriterion("question25 not in", values, "question25");
            return (Criteria) this;
        }

        public Criteria andQuestion25Between(Integer value1, Integer value2) {
            addCriterion("question25 between", value1, value2, "question25");
            return (Criteria) this;
        }

        public Criteria andQuestion25NotBetween(Integer value1, Integer value2) {
            addCriterion("question25 not between", value1, value2, "question25");
            return (Criteria) this;
        }

        public Criteria andQuestion26IsNull() {
            addCriterion("question26 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion26IsNotNull() {
            addCriterion("question26 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion26EqualTo(Integer value) {
            addCriterion("question26 =", value, "question26");
            return (Criteria) this;
        }

        public Criteria andQuestion26NotEqualTo(Integer value) {
            addCriterion("question26 <>", value, "question26");
            return (Criteria) this;
        }

        public Criteria andQuestion26GreaterThan(Integer value) {
            addCriterion("question26 >", value, "question26");
            return (Criteria) this;
        }

        public Criteria andQuestion26GreaterThanOrEqualTo(Integer value) {
            addCriterion("question26 >=", value, "question26");
            return (Criteria) this;
        }

        public Criteria andQuestion26LessThan(Integer value) {
            addCriterion("question26 <", value, "question26");
            return (Criteria) this;
        }

        public Criteria andQuestion26LessThanOrEqualTo(Integer value) {
            addCriterion("question26 <=", value, "question26");
            return (Criteria) this;
        }

        public Criteria andQuestion26In(List<Integer> values) {
            addCriterion("question26 in", values, "question26");
            return (Criteria) this;
        }

        public Criteria andQuestion26NotIn(List<Integer> values) {
            addCriterion("question26 not in", values, "question26");
            return (Criteria) this;
        }

        public Criteria andQuestion26Between(Integer value1, Integer value2) {
            addCriterion("question26 between", value1, value2, "question26");
            return (Criteria) this;
        }

        public Criteria andQuestion26NotBetween(Integer value1, Integer value2) {
            addCriterion("question26 not between", value1, value2, "question26");
            return (Criteria) this;
        }

        public Criteria andQuestion27IsNull() {
            addCriterion("question27 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion27IsNotNull() {
            addCriterion("question27 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion27EqualTo(Integer value) {
            addCriterion("question27 =", value, "question27");
            return (Criteria) this;
        }

        public Criteria andQuestion27NotEqualTo(Integer value) {
            addCriterion("question27 <>", value, "question27");
            return (Criteria) this;
        }

        public Criteria andQuestion27GreaterThan(Integer value) {
            addCriterion("question27 >", value, "question27");
            return (Criteria) this;
        }

        public Criteria andQuestion27GreaterThanOrEqualTo(Integer value) {
            addCriterion("question27 >=", value, "question27");
            return (Criteria) this;
        }

        public Criteria andQuestion27LessThan(Integer value) {
            addCriterion("question27 <", value, "question27");
            return (Criteria) this;
        }

        public Criteria andQuestion27LessThanOrEqualTo(Integer value) {
            addCriterion("question27 <=", value, "question27");
            return (Criteria) this;
        }

        public Criteria andQuestion27In(List<Integer> values) {
            addCriterion("question27 in", values, "question27");
            return (Criteria) this;
        }

        public Criteria andQuestion27NotIn(List<Integer> values) {
            addCriterion("question27 not in", values, "question27");
            return (Criteria) this;
        }

        public Criteria andQuestion27Between(Integer value1, Integer value2) {
            addCriterion("question27 between", value1, value2, "question27");
            return (Criteria) this;
        }

        public Criteria andQuestion27NotBetween(Integer value1, Integer value2) {
            addCriterion("question27 not between", value1, value2, "question27");
            return (Criteria) this;
        }

        public Criteria andQuestion28IsNull() {
            addCriterion("question28 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion28IsNotNull() {
            addCriterion("question28 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion28EqualTo(Integer value) {
            addCriterion("question28 =", value, "question28");
            return (Criteria) this;
        }

        public Criteria andQuestion28NotEqualTo(Integer value) {
            addCriterion("question28 <>", value, "question28");
            return (Criteria) this;
        }

        public Criteria andQuestion28GreaterThan(Integer value) {
            addCriterion("question28 >", value, "question28");
            return (Criteria) this;
        }

        public Criteria andQuestion28GreaterThanOrEqualTo(Integer value) {
            addCriterion("question28 >=", value, "question28");
            return (Criteria) this;
        }

        public Criteria andQuestion28LessThan(Integer value) {
            addCriterion("question28 <", value, "question28");
            return (Criteria) this;
        }

        public Criteria andQuestion28LessThanOrEqualTo(Integer value) {
            addCriterion("question28 <=", value, "question28");
            return (Criteria) this;
        }

        public Criteria andQuestion28In(List<Integer> values) {
            addCriterion("question28 in", values, "question28");
            return (Criteria) this;
        }

        public Criteria andQuestion28NotIn(List<Integer> values) {
            addCriterion("question28 not in", values, "question28");
            return (Criteria) this;
        }

        public Criteria andQuestion28Between(Integer value1, Integer value2) {
            addCriterion("question28 between", value1, value2, "question28");
            return (Criteria) this;
        }

        public Criteria andQuestion28NotBetween(Integer value1, Integer value2) {
            addCriterion("question28 not between", value1, value2, "question28");
            return (Criteria) this;
        }

        public Criteria andQuestion29IsNull() {
            addCriterion("question29 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion29IsNotNull() {
            addCriterion("question29 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion29EqualTo(Integer value) {
            addCriterion("question29 =", value, "question29");
            return (Criteria) this;
        }

        public Criteria andQuestion29NotEqualTo(Integer value) {
            addCriterion("question29 <>", value, "question29");
            return (Criteria) this;
        }

        public Criteria andQuestion29GreaterThan(Integer value) {
            addCriterion("question29 >", value, "question29");
            return (Criteria) this;
        }

        public Criteria andQuestion29GreaterThanOrEqualTo(Integer value) {
            addCriterion("question29 >=", value, "question29");
            return (Criteria) this;
        }

        public Criteria andQuestion29LessThan(Integer value) {
            addCriterion("question29 <", value, "question29");
            return (Criteria) this;
        }

        public Criteria andQuestion29LessThanOrEqualTo(Integer value) {
            addCriterion("question29 <=", value, "question29");
            return (Criteria) this;
        }

        public Criteria andQuestion29In(List<Integer> values) {
            addCriterion("question29 in", values, "question29");
            return (Criteria) this;
        }

        public Criteria andQuestion29NotIn(List<Integer> values) {
            addCriterion("question29 not in", values, "question29");
            return (Criteria) this;
        }

        public Criteria andQuestion29Between(Integer value1, Integer value2) {
            addCriterion("question29 between", value1, value2, "question29");
            return (Criteria) this;
        }

        public Criteria andQuestion29NotBetween(Integer value1, Integer value2) {
            addCriterion("question29 not between", value1, value2, "question29");
            return (Criteria) this;
        }

        public Criteria andQuestion30IsNull() {
            addCriterion("question30 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion30IsNotNull() {
            addCriterion("question30 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion30EqualTo(Integer value) {
            addCriterion("question30 =", value, "question30");
            return (Criteria) this;
        }

        public Criteria andQuestion30NotEqualTo(Integer value) {
            addCriterion("question30 <>", value, "question30");
            return (Criteria) this;
        }

        public Criteria andQuestion30GreaterThan(Integer value) {
            addCriterion("question30 >", value, "question30");
            return (Criteria) this;
        }

        public Criteria andQuestion30GreaterThanOrEqualTo(Integer value) {
            addCriterion("question30 >=", value, "question30");
            return (Criteria) this;
        }

        public Criteria andQuestion30LessThan(Integer value) {
            addCriterion("question30 <", value, "question30");
            return (Criteria) this;
        }

        public Criteria andQuestion30LessThanOrEqualTo(Integer value) {
            addCriterion("question30 <=", value, "question30");
            return (Criteria) this;
        }

        public Criteria andQuestion30In(List<Integer> values) {
            addCriterion("question30 in", values, "question30");
            return (Criteria) this;
        }

        public Criteria andQuestion30NotIn(List<Integer> values) {
            addCriterion("question30 not in", values, "question30");
            return (Criteria) this;
        }

        public Criteria andQuestion30Between(Integer value1, Integer value2) {
            addCriterion("question30 between", value1, value2, "question30");
            return (Criteria) this;
        }

        public Criteria andQuestion30NotBetween(Integer value1, Integer value2) {
            addCriterion("question30 not between", value1, value2, "question30");
            return (Criteria) this;
        }

        public Criteria andQuestion31IsNull() {
            addCriterion("question31 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion31IsNotNull() {
            addCriterion("question31 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion31EqualTo(Integer value) {
            addCriterion("question31 =", value, "question31");
            return (Criteria) this;
        }

        public Criteria andQuestion31NotEqualTo(Integer value) {
            addCriterion("question31 <>", value, "question31");
            return (Criteria) this;
        }

        public Criteria andQuestion31GreaterThan(Integer value) {
            addCriterion("question31 >", value, "question31");
            return (Criteria) this;
        }

        public Criteria andQuestion31GreaterThanOrEqualTo(Integer value) {
            addCriterion("question31 >=", value, "question31");
            return (Criteria) this;
        }

        public Criteria andQuestion31LessThan(Integer value) {
            addCriterion("question31 <", value, "question31");
            return (Criteria) this;
        }

        public Criteria andQuestion31LessThanOrEqualTo(Integer value) {
            addCriterion("question31 <=", value, "question31");
            return (Criteria) this;
        }

        public Criteria andQuestion31In(List<Integer> values) {
            addCriterion("question31 in", values, "question31");
            return (Criteria) this;
        }

        public Criteria andQuestion31NotIn(List<Integer> values) {
            addCriterion("question31 not in", values, "question31");
            return (Criteria) this;
        }

        public Criteria andQuestion31Between(Integer value1, Integer value2) {
            addCriterion("question31 between", value1, value2, "question31");
            return (Criteria) this;
        }

        public Criteria andQuestion31NotBetween(Integer value1, Integer value2) {
            addCriterion("question31 not between", value1, value2, "question31");
            return (Criteria) this;
        }

        public Criteria andQuestion32IsNull() {
            addCriterion("question32 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion32IsNotNull() {
            addCriterion("question32 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion32EqualTo(Integer value) {
            addCriterion("question32 =", value, "question32");
            return (Criteria) this;
        }

        public Criteria andQuestion32NotEqualTo(Integer value) {
            addCriterion("question32 <>", value, "question32");
            return (Criteria) this;
        }

        public Criteria andQuestion32GreaterThan(Integer value) {
            addCriterion("question32 >", value, "question32");
            return (Criteria) this;
        }

        public Criteria andQuestion32GreaterThanOrEqualTo(Integer value) {
            addCriterion("question32 >=", value, "question32");
            return (Criteria) this;
        }

        public Criteria andQuestion32LessThan(Integer value) {
            addCriterion("question32 <", value, "question32");
            return (Criteria) this;
        }

        public Criteria andQuestion32LessThanOrEqualTo(Integer value) {
            addCriterion("question32 <=", value, "question32");
            return (Criteria) this;
        }

        public Criteria andQuestion32In(List<Integer> values) {
            addCriterion("question32 in", values, "question32");
            return (Criteria) this;
        }

        public Criteria andQuestion32NotIn(List<Integer> values) {
            addCriterion("question32 not in", values, "question32");
            return (Criteria) this;
        }

        public Criteria andQuestion32Between(Integer value1, Integer value2) {
            addCriterion("question32 between", value1, value2, "question32");
            return (Criteria) this;
        }

        public Criteria andQuestion32NotBetween(Integer value1, Integer value2) {
            addCriterion("question32 not between", value1, value2, "question32");
            return (Criteria) this;
        }

        public Criteria andQuestion33IsNull() {
            addCriterion("question33 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion33IsNotNull() {
            addCriterion("question33 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion33EqualTo(Integer value) {
            addCriterion("question33 =", value, "question33");
            return (Criteria) this;
        }

        public Criteria andQuestion33NotEqualTo(Integer value) {
            addCriterion("question33 <>", value, "question33");
            return (Criteria) this;
        }

        public Criteria andQuestion33GreaterThan(Integer value) {
            addCriterion("question33 >", value, "question33");
            return (Criteria) this;
        }

        public Criteria andQuestion33GreaterThanOrEqualTo(Integer value) {
            addCriterion("question33 >=", value, "question33");
            return (Criteria) this;
        }

        public Criteria andQuestion33LessThan(Integer value) {
            addCriterion("question33 <", value, "question33");
            return (Criteria) this;
        }

        public Criteria andQuestion33LessThanOrEqualTo(Integer value) {
            addCriterion("question33 <=", value, "question33");
            return (Criteria) this;
        }

        public Criteria andQuestion33In(List<Integer> values) {
            addCriterion("question33 in", values, "question33");
            return (Criteria) this;
        }

        public Criteria andQuestion33NotIn(List<Integer> values) {
            addCriterion("question33 not in", values, "question33");
            return (Criteria) this;
        }

        public Criteria andQuestion33Between(Integer value1, Integer value2) {
            addCriterion("question33 between", value1, value2, "question33");
            return (Criteria) this;
        }

        public Criteria andQuestion33NotBetween(Integer value1, Integer value2) {
            addCriterion("question33 not between", value1, value2, "question33");
            return (Criteria) this;
        }

        public Criteria andQuestion34IsNull() {
            addCriterion("question34 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion34IsNotNull() {
            addCriterion("question34 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion34EqualTo(Integer value) {
            addCriterion("question34 =", value, "question34");
            return (Criteria) this;
        }

        public Criteria andQuestion34NotEqualTo(Integer value) {
            addCriterion("question34 <>", value, "question34");
            return (Criteria) this;
        }

        public Criteria andQuestion34GreaterThan(Integer value) {
            addCriterion("question34 >", value, "question34");
            return (Criteria) this;
        }

        public Criteria andQuestion34GreaterThanOrEqualTo(Integer value) {
            addCriterion("question34 >=", value, "question34");
            return (Criteria) this;
        }

        public Criteria andQuestion34LessThan(Integer value) {
            addCriterion("question34 <", value, "question34");
            return (Criteria) this;
        }

        public Criteria andQuestion34LessThanOrEqualTo(Integer value) {
            addCriterion("question34 <=", value, "question34");
            return (Criteria) this;
        }

        public Criteria andQuestion34In(List<Integer> values) {
            addCriterion("question34 in", values, "question34");
            return (Criteria) this;
        }

        public Criteria andQuestion34NotIn(List<Integer> values) {
            addCriterion("question34 not in", values, "question34");
            return (Criteria) this;
        }

        public Criteria andQuestion34Between(Integer value1, Integer value2) {
            addCriterion("question34 between", value1, value2, "question34");
            return (Criteria) this;
        }

        public Criteria andQuestion34NotBetween(Integer value1, Integer value2) {
            addCriterion("question34 not between", value1, value2, "question34");
            return (Criteria) this;
        }

        public Criteria andQuestion35IsNull() {
            addCriterion("question35 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion35IsNotNull() {
            addCriterion("question35 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion35EqualTo(Integer value) {
            addCriterion("question35 =", value, "question35");
            return (Criteria) this;
        }

        public Criteria andQuestion35NotEqualTo(Integer value) {
            addCriterion("question35 <>", value, "question35");
            return (Criteria) this;
        }

        public Criteria andQuestion35GreaterThan(Integer value) {
            addCriterion("question35 >", value, "question35");
            return (Criteria) this;
        }

        public Criteria andQuestion35GreaterThanOrEqualTo(Integer value) {
            addCriterion("question35 >=", value, "question35");
            return (Criteria) this;
        }

        public Criteria andQuestion35LessThan(Integer value) {
            addCriterion("question35 <", value, "question35");
            return (Criteria) this;
        }

        public Criteria andQuestion35LessThanOrEqualTo(Integer value) {
            addCriterion("question35 <=", value, "question35");
            return (Criteria) this;
        }

        public Criteria andQuestion35In(List<Integer> values) {
            addCriterion("question35 in", values, "question35");
            return (Criteria) this;
        }

        public Criteria andQuestion35NotIn(List<Integer> values) {
            addCriterion("question35 not in", values, "question35");
            return (Criteria) this;
        }

        public Criteria andQuestion35Between(Integer value1, Integer value2) {
            addCriterion("question35 between", value1, value2, "question35");
            return (Criteria) this;
        }

        public Criteria andQuestion35NotBetween(Integer value1, Integer value2) {
            addCriterion("question35 not between", value1, value2, "question35");
            return (Criteria) this;
        }

        public Criteria andQuestion36IsNull() {
            addCriterion("question36 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion36IsNotNull() {
            addCriterion("question36 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion36EqualTo(Integer value) {
            addCriterion("question36 =", value, "question36");
            return (Criteria) this;
        }

        public Criteria andQuestion36NotEqualTo(Integer value) {
            addCriterion("question36 <>", value, "question36");
            return (Criteria) this;
        }

        public Criteria andQuestion36GreaterThan(Integer value) {
            addCriterion("question36 >", value, "question36");
            return (Criteria) this;
        }

        public Criteria andQuestion36GreaterThanOrEqualTo(Integer value) {
            addCriterion("question36 >=", value, "question36");
            return (Criteria) this;
        }

        public Criteria andQuestion36LessThan(Integer value) {
            addCriterion("question36 <", value, "question36");
            return (Criteria) this;
        }

        public Criteria andQuestion36LessThanOrEqualTo(Integer value) {
            addCriterion("question36 <=", value, "question36");
            return (Criteria) this;
        }

        public Criteria andQuestion36In(List<Integer> values) {
            addCriterion("question36 in", values, "question36");
            return (Criteria) this;
        }

        public Criteria andQuestion36NotIn(List<Integer> values) {
            addCriterion("question36 not in", values, "question36");
            return (Criteria) this;
        }

        public Criteria andQuestion36Between(Integer value1, Integer value2) {
            addCriterion("question36 between", value1, value2, "question36");
            return (Criteria) this;
        }

        public Criteria andQuestion36NotBetween(Integer value1, Integer value2) {
            addCriterion("question36 not between", value1, value2, "question36");
            return (Criteria) this;
        }

        public Criteria andQuestion37IsNull() {
            addCriterion("question37 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion37IsNotNull() {
            addCriterion("question37 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion37EqualTo(Integer value) {
            addCriterion("question37 =", value, "question37");
            return (Criteria) this;
        }

        public Criteria andQuestion37NotEqualTo(Integer value) {
            addCriterion("question37 <>", value, "question37");
            return (Criteria) this;
        }

        public Criteria andQuestion37GreaterThan(Integer value) {
            addCriterion("question37 >", value, "question37");
            return (Criteria) this;
        }

        public Criteria andQuestion37GreaterThanOrEqualTo(Integer value) {
            addCriterion("question37 >=", value, "question37");
            return (Criteria) this;
        }

        public Criteria andQuestion37LessThan(Integer value) {
            addCriterion("question37 <", value, "question37");
            return (Criteria) this;
        }

        public Criteria andQuestion37LessThanOrEqualTo(Integer value) {
            addCriterion("question37 <=", value, "question37");
            return (Criteria) this;
        }

        public Criteria andQuestion37In(List<Integer> values) {
            addCriterion("question37 in", values, "question37");
            return (Criteria) this;
        }

        public Criteria andQuestion37NotIn(List<Integer> values) {
            addCriterion("question37 not in", values, "question37");
            return (Criteria) this;
        }

        public Criteria andQuestion37Between(Integer value1, Integer value2) {
            addCriterion("question37 between", value1, value2, "question37");
            return (Criteria) this;
        }

        public Criteria andQuestion37NotBetween(Integer value1, Integer value2) {
            addCriterion("question37 not between", value1, value2, "question37");
            return (Criteria) this;
        }

        public Criteria andQuestion38IsNull() {
            addCriterion("question38 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion38IsNotNull() {
            addCriterion("question38 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion38EqualTo(Integer value) {
            addCriterion("question38 =", value, "question38");
            return (Criteria) this;
        }

        public Criteria andQuestion38NotEqualTo(Integer value) {
            addCriterion("question38 <>", value, "question38");
            return (Criteria) this;
        }

        public Criteria andQuestion38GreaterThan(Integer value) {
            addCriterion("question38 >", value, "question38");
            return (Criteria) this;
        }

        public Criteria andQuestion38GreaterThanOrEqualTo(Integer value) {
            addCriterion("question38 >=", value, "question38");
            return (Criteria) this;
        }

        public Criteria andQuestion38LessThan(Integer value) {
            addCriterion("question38 <", value, "question38");
            return (Criteria) this;
        }

        public Criteria andQuestion38LessThanOrEqualTo(Integer value) {
            addCriterion("question38 <=", value, "question38");
            return (Criteria) this;
        }

        public Criteria andQuestion38In(List<Integer> values) {
            addCriterion("question38 in", values, "question38");
            return (Criteria) this;
        }

        public Criteria andQuestion38NotIn(List<Integer> values) {
            addCriterion("question38 not in", values, "question38");
            return (Criteria) this;
        }

        public Criteria andQuestion38Between(Integer value1, Integer value2) {
            addCriterion("question38 between", value1, value2, "question38");
            return (Criteria) this;
        }

        public Criteria andQuestion38NotBetween(Integer value1, Integer value2) {
            addCriterion("question38 not between", value1, value2, "question38");
            return (Criteria) this;
        }

        public Criteria andQuestion39IsNull() {
            addCriterion("question39 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion39IsNotNull() {
            addCriterion("question39 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion39EqualTo(Integer value) {
            addCriterion("question39 =", value, "question39");
            return (Criteria) this;
        }

        public Criteria andQuestion39NotEqualTo(Integer value) {
            addCriterion("question39 <>", value, "question39");
            return (Criteria) this;
        }

        public Criteria andQuestion39GreaterThan(Integer value) {
            addCriterion("question39 >", value, "question39");
            return (Criteria) this;
        }

        public Criteria andQuestion39GreaterThanOrEqualTo(Integer value) {
            addCriterion("question39 >=", value, "question39");
            return (Criteria) this;
        }

        public Criteria andQuestion39LessThan(Integer value) {
            addCriterion("question39 <", value, "question39");
            return (Criteria) this;
        }

        public Criteria andQuestion39LessThanOrEqualTo(Integer value) {
            addCriterion("question39 <=", value, "question39");
            return (Criteria) this;
        }

        public Criteria andQuestion39In(List<Integer> values) {
            addCriterion("question39 in", values, "question39");
            return (Criteria) this;
        }

        public Criteria andQuestion39NotIn(List<Integer> values) {
            addCriterion("question39 not in", values, "question39");
            return (Criteria) this;
        }

        public Criteria andQuestion39Between(Integer value1, Integer value2) {
            addCriterion("question39 between", value1, value2, "question39");
            return (Criteria) this;
        }

        public Criteria andQuestion39NotBetween(Integer value1, Integer value2) {
            addCriterion("question39 not between", value1, value2, "question39");
            return (Criteria) this;
        }

        public Criteria andQuestion40IsNull() {
            addCriterion("question40 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion40IsNotNull() {
            addCriterion("question40 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion40EqualTo(Integer value) {
            addCriterion("question40 =", value, "question40");
            return (Criteria) this;
        }

        public Criteria andQuestion40NotEqualTo(Integer value) {
            addCriterion("question40 <>", value, "question40");
            return (Criteria) this;
        }

        public Criteria andQuestion40GreaterThan(Integer value) {
            addCriterion("question40 >", value, "question40");
            return (Criteria) this;
        }

        public Criteria andQuestion40GreaterThanOrEqualTo(Integer value) {
            addCriterion("question40 >=", value, "question40");
            return (Criteria) this;
        }

        public Criteria andQuestion40LessThan(Integer value) {
            addCriterion("question40 <", value, "question40");
            return (Criteria) this;
        }

        public Criteria andQuestion40LessThanOrEqualTo(Integer value) {
            addCriterion("question40 <=", value, "question40");
            return (Criteria) this;
        }

        public Criteria andQuestion40In(List<Integer> values) {
            addCriterion("question40 in", values, "question40");
            return (Criteria) this;
        }

        public Criteria andQuestion40NotIn(List<Integer> values) {
            addCriterion("question40 not in", values, "question40");
            return (Criteria) this;
        }

        public Criteria andQuestion40Between(Integer value1, Integer value2) {
            addCriterion("question40 between", value1, value2, "question40");
            return (Criteria) this;
        }

        public Criteria andQuestion40NotBetween(Integer value1, Integer value2) {
            addCriterion("question40 not between", value1, value2, "question40");
            return (Criteria) this;
        }

        public Criteria andQuestion41IsNull() {
            addCriterion("question41 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion41IsNotNull() {
            addCriterion("question41 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion41EqualTo(Integer value) {
            addCriterion("question41 =", value, "question41");
            return (Criteria) this;
        }

        public Criteria andQuestion41NotEqualTo(Integer value) {
            addCriterion("question41 <>", value, "question41");
            return (Criteria) this;
        }

        public Criteria andQuestion41GreaterThan(Integer value) {
            addCriterion("question41 >", value, "question41");
            return (Criteria) this;
        }

        public Criteria andQuestion41GreaterThanOrEqualTo(Integer value) {
            addCriterion("question41 >=", value, "question41");
            return (Criteria) this;
        }

        public Criteria andQuestion41LessThan(Integer value) {
            addCriterion("question41 <", value, "question41");
            return (Criteria) this;
        }

        public Criteria andQuestion41LessThanOrEqualTo(Integer value) {
            addCriterion("question41 <=", value, "question41");
            return (Criteria) this;
        }

        public Criteria andQuestion41In(List<Integer> values) {
            addCriterion("question41 in", values, "question41");
            return (Criteria) this;
        }

        public Criteria andQuestion41NotIn(List<Integer> values) {
            addCriterion("question41 not in", values, "question41");
            return (Criteria) this;
        }

        public Criteria andQuestion41Between(Integer value1, Integer value2) {
            addCriterion("question41 between", value1, value2, "question41");
            return (Criteria) this;
        }

        public Criteria andQuestion41NotBetween(Integer value1, Integer value2) {
            addCriterion("question41 not between", value1, value2, "question41");
            return (Criteria) this;
        }

        public Criteria andQuestion42IsNull() {
            addCriterion("question42 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion42IsNotNull() {
            addCriterion("question42 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion42EqualTo(Integer value) {
            addCriterion("question42 =", value, "question42");
            return (Criteria) this;
        }

        public Criteria andQuestion42NotEqualTo(Integer value) {
            addCriterion("question42 <>", value, "question42");
            return (Criteria) this;
        }

        public Criteria andQuestion42GreaterThan(Integer value) {
            addCriterion("question42 >", value, "question42");
            return (Criteria) this;
        }

        public Criteria andQuestion42GreaterThanOrEqualTo(Integer value) {
            addCriterion("question42 >=", value, "question42");
            return (Criteria) this;
        }

        public Criteria andQuestion42LessThan(Integer value) {
            addCriterion("question42 <", value, "question42");
            return (Criteria) this;
        }

        public Criteria andQuestion42LessThanOrEqualTo(Integer value) {
            addCriterion("question42 <=", value, "question42");
            return (Criteria) this;
        }

        public Criteria andQuestion42In(List<Integer> values) {
            addCriterion("question42 in", values, "question42");
            return (Criteria) this;
        }

        public Criteria andQuestion42NotIn(List<Integer> values) {
            addCriterion("question42 not in", values, "question42");
            return (Criteria) this;
        }

        public Criteria andQuestion42Between(Integer value1, Integer value2) {
            addCriterion("question42 between", value1, value2, "question42");
            return (Criteria) this;
        }

        public Criteria andQuestion42NotBetween(Integer value1, Integer value2) {
            addCriterion("question42 not between", value1, value2, "question42");
            return (Criteria) this;
        }

        public Criteria andQuestion43IsNull() {
            addCriterion("question43 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion43IsNotNull() {
            addCriterion("question43 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion43EqualTo(Integer value) {
            addCriterion("question43 =", value, "question43");
            return (Criteria) this;
        }

        public Criteria andQuestion43NotEqualTo(Integer value) {
            addCriterion("question43 <>", value, "question43");
            return (Criteria) this;
        }

        public Criteria andQuestion43GreaterThan(Integer value) {
            addCriterion("question43 >", value, "question43");
            return (Criteria) this;
        }

        public Criteria andQuestion43GreaterThanOrEqualTo(Integer value) {
            addCriterion("question43 >=", value, "question43");
            return (Criteria) this;
        }

        public Criteria andQuestion43LessThan(Integer value) {
            addCriterion("question43 <", value, "question43");
            return (Criteria) this;
        }

        public Criteria andQuestion43LessThanOrEqualTo(Integer value) {
            addCriterion("question43 <=", value, "question43");
            return (Criteria) this;
        }

        public Criteria andQuestion43In(List<Integer> values) {
            addCriterion("question43 in", values, "question43");
            return (Criteria) this;
        }

        public Criteria andQuestion43NotIn(List<Integer> values) {
            addCriterion("question43 not in", values, "question43");
            return (Criteria) this;
        }

        public Criteria andQuestion43Between(Integer value1, Integer value2) {
            addCriterion("question43 between", value1, value2, "question43");
            return (Criteria) this;
        }

        public Criteria andQuestion43NotBetween(Integer value1, Integer value2) {
            addCriterion("question43 not between", value1, value2, "question43");
            return (Criteria) this;
        }

        public Criteria andQuestion44IsNull() {
            addCriterion("question44 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion44IsNotNull() {
            addCriterion("question44 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion44EqualTo(Integer value) {
            addCriterion("question44 =", value, "question44");
            return (Criteria) this;
        }

        public Criteria andQuestion44NotEqualTo(Integer value) {
            addCriterion("question44 <>", value, "question44");
            return (Criteria) this;
        }

        public Criteria andQuestion44GreaterThan(Integer value) {
            addCriterion("question44 >", value, "question44");
            return (Criteria) this;
        }

        public Criteria andQuestion44GreaterThanOrEqualTo(Integer value) {
            addCriterion("question44 >=", value, "question44");
            return (Criteria) this;
        }

        public Criteria andQuestion44LessThan(Integer value) {
            addCriterion("question44 <", value, "question44");
            return (Criteria) this;
        }

        public Criteria andQuestion44LessThanOrEqualTo(Integer value) {
            addCriterion("question44 <=", value, "question44");
            return (Criteria) this;
        }

        public Criteria andQuestion44In(List<Integer> values) {
            addCriterion("question44 in", values, "question44");
            return (Criteria) this;
        }

        public Criteria andQuestion44NotIn(List<Integer> values) {
            addCriterion("question44 not in", values, "question44");
            return (Criteria) this;
        }

        public Criteria andQuestion44Between(Integer value1, Integer value2) {
            addCriterion("question44 between", value1, value2, "question44");
            return (Criteria) this;
        }

        public Criteria andQuestion44NotBetween(Integer value1, Integer value2) {
            addCriterion("question44 not between", value1, value2, "question44");
            return (Criteria) this;
        }

        public Criteria andQuestion45IsNull() {
            addCriterion("question45 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion45IsNotNull() {
            addCriterion("question45 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion45EqualTo(Integer value) {
            addCriterion("question45 =", value, "question45");
            return (Criteria) this;
        }

        public Criteria andQuestion45NotEqualTo(Integer value) {
            addCriterion("question45 <>", value, "question45");
            return (Criteria) this;
        }

        public Criteria andQuestion45GreaterThan(Integer value) {
            addCriterion("question45 >", value, "question45");
            return (Criteria) this;
        }

        public Criteria andQuestion45GreaterThanOrEqualTo(Integer value) {
            addCriterion("question45 >=", value, "question45");
            return (Criteria) this;
        }

        public Criteria andQuestion45LessThan(Integer value) {
            addCriterion("question45 <", value, "question45");
            return (Criteria) this;
        }

        public Criteria andQuestion45LessThanOrEqualTo(Integer value) {
            addCriterion("question45 <=", value, "question45");
            return (Criteria) this;
        }

        public Criteria andQuestion45In(List<Integer> values) {
            addCriterion("question45 in", values, "question45");
            return (Criteria) this;
        }

        public Criteria andQuestion45NotIn(List<Integer> values) {
            addCriterion("question45 not in", values, "question45");
            return (Criteria) this;
        }

        public Criteria andQuestion45Between(Integer value1, Integer value2) {
            addCriterion("question45 between", value1, value2, "question45");
            return (Criteria) this;
        }

        public Criteria andQuestion45NotBetween(Integer value1, Integer value2) {
            addCriterion("question45 not between", value1, value2, "question45");
            return (Criteria) this;
        }

        public Criteria andQuestion46IsNull() {
            addCriterion("question46 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion46IsNotNull() {
            addCriterion("question46 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion46EqualTo(Integer value) {
            addCriterion("question46 =", value, "question46");
            return (Criteria) this;
        }

        public Criteria andQuestion46NotEqualTo(Integer value) {
            addCriterion("question46 <>", value, "question46");
            return (Criteria) this;
        }

        public Criteria andQuestion46GreaterThan(Integer value) {
            addCriterion("question46 >", value, "question46");
            return (Criteria) this;
        }

        public Criteria andQuestion46GreaterThanOrEqualTo(Integer value) {
            addCriterion("question46 >=", value, "question46");
            return (Criteria) this;
        }

        public Criteria andQuestion46LessThan(Integer value) {
            addCriterion("question46 <", value, "question46");
            return (Criteria) this;
        }

        public Criteria andQuestion46LessThanOrEqualTo(Integer value) {
            addCriterion("question46 <=", value, "question46");
            return (Criteria) this;
        }

        public Criteria andQuestion46In(List<Integer> values) {
            addCriterion("question46 in", values, "question46");
            return (Criteria) this;
        }

        public Criteria andQuestion46NotIn(List<Integer> values) {
            addCriterion("question46 not in", values, "question46");
            return (Criteria) this;
        }

        public Criteria andQuestion46Between(Integer value1, Integer value2) {
            addCriterion("question46 between", value1, value2, "question46");
            return (Criteria) this;
        }

        public Criteria andQuestion46NotBetween(Integer value1, Integer value2) {
            addCriterion("question46 not between", value1, value2, "question46");
            return (Criteria) this;
        }

        public Criteria andQuestion47IsNull() {
            addCriterion("question47 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion47IsNotNull() {
            addCriterion("question47 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion47EqualTo(Integer value) {
            addCriterion("question47 =", value, "question47");
            return (Criteria) this;
        }

        public Criteria andQuestion47NotEqualTo(Integer value) {
            addCriterion("question47 <>", value, "question47");
            return (Criteria) this;
        }

        public Criteria andQuestion47GreaterThan(Integer value) {
            addCriterion("question47 >", value, "question47");
            return (Criteria) this;
        }

        public Criteria andQuestion47GreaterThanOrEqualTo(Integer value) {
            addCriterion("question47 >=", value, "question47");
            return (Criteria) this;
        }

        public Criteria andQuestion47LessThan(Integer value) {
            addCriterion("question47 <", value, "question47");
            return (Criteria) this;
        }

        public Criteria andQuestion47LessThanOrEqualTo(Integer value) {
            addCriterion("question47 <=", value, "question47");
            return (Criteria) this;
        }

        public Criteria andQuestion47In(List<Integer> values) {
            addCriterion("question47 in", values, "question47");
            return (Criteria) this;
        }

        public Criteria andQuestion47NotIn(List<Integer> values) {
            addCriterion("question47 not in", values, "question47");
            return (Criteria) this;
        }

        public Criteria andQuestion47Between(Integer value1, Integer value2) {
            addCriterion("question47 between", value1, value2, "question47");
            return (Criteria) this;
        }

        public Criteria andQuestion47NotBetween(Integer value1, Integer value2) {
            addCriterion("question47 not between", value1, value2, "question47");
            return (Criteria) this;
        }

        public Criteria andQuestion48IsNull() {
            addCriterion("question48 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion48IsNotNull() {
            addCriterion("question48 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion48EqualTo(Integer value) {
            addCriterion("question48 =", value, "question48");
            return (Criteria) this;
        }

        public Criteria andQuestion48NotEqualTo(Integer value) {
            addCriterion("question48 <>", value, "question48");
            return (Criteria) this;
        }

        public Criteria andQuestion48GreaterThan(Integer value) {
            addCriterion("question48 >", value, "question48");
            return (Criteria) this;
        }

        public Criteria andQuestion48GreaterThanOrEqualTo(Integer value) {
            addCriterion("question48 >=", value, "question48");
            return (Criteria) this;
        }

        public Criteria andQuestion48LessThan(Integer value) {
            addCriterion("question48 <", value, "question48");
            return (Criteria) this;
        }

        public Criteria andQuestion48LessThanOrEqualTo(Integer value) {
            addCriterion("question48 <=", value, "question48");
            return (Criteria) this;
        }

        public Criteria andQuestion48In(List<Integer> values) {
            addCriterion("question48 in", values, "question48");
            return (Criteria) this;
        }

        public Criteria andQuestion48NotIn(List<Integer> values) {
            addCriterion("question48 not in", values, "question48");
            return (Criteria) this;
        }

        public Criteria andQuestion48Between(Integer value1, Integer value2) {
            addCriterion("question48 between", value1, value2, "question48");
            return (Criteria) this;
        }

        public Criteria andQuestion48NotBetween(Integer value1, Integer value2) {
            addCriterion("question48 not between", value1, value2, "question48");
            return (Criteria) this;
        }

        public Criteria andQuestion49IsNull() {
            addCriterion("question49 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion49IsNotNull() {
            addCriterion("question49 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion49EqualTo(Integer value) {
            addCriterion("question49 =", value, "question49");
            return (Criteria) this;
        }

        public Criteria andQuestion49NotEqualTo(Integer value) {
            addCriterion("question49 <>", value, "question49");
            return (Criteria) this;
        }

        public Criteria andQuestion49GreaterThan(Integer value) {
            addCriterion("question49 >", value, "question49");
            return (Criteria) this;
        }

        public Criteria andQuestion49GreaterThanOrEqualTo(Integer value) {
            addCriterion("question49 >=", value, "question49");
            return (Criteria) this;
        }

        public Criteria andQuestion49LessThan(Integer value) {
            addCriterion("question49 <", value, "question49");
            return (Criteria) this;
        }

        public Criteria andQuestion49LessThanOrEqualTo(Integer value) {
            addCriterion("question49 <=", value, "question49");
            return (Criteria) this;
        }

        public Criteria andQuestion49In(List<Integer> values) {
            addCriterion("question49 in", values, "question49");
            return (Criteria) this;
        }

        public Criteria andQuestion49NotIn(List<Integer> values) {
            addCriterion("question49 not in", values, "question49");
            return (Criteria) this;
        }

        public Criteria andQuestion49Between(Integer value1, Integer value2) {
            addCriterion("question49 between", value1, value2, "question49");
            return (Criteria) this;
        }

        public Criteria andQuestion49NotBetween(Integer value1, Integer value2) {
            addCriterion("question49 not between", value1, value2, "question49");
            return (Criteria) this;
        }

        public Criteria andQuestion50IsNull() {
            addCriterion("question50 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion50IsNotNull() {
            addCriterion("question50 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion50EqualTo(Integer value) {
            addCriterion("question50 =", value, "question50");
            return (Criteria) this;
        }

        public Criteria andQuestion50NotEqualTo(Integer value) {
            addCriterion("question50 <>", value, "question50");
            return (Criteria) this;
        }

        public Criteria andQuestion50GreaterThan(Integer value) {
            addCriterion("question50 >", value, "question50");
            return (Criteria) this;
        }

        public Criteria andQuestion50GreaterThanOrEqualTo(Integer value) {
            addCriterion("question50 >=", value, "question50");
            return (Criteria) this;
        }

        public Criteria andQuestion50LessThan(Integer value) {
            addCriterion("question50 <", value, "question50");
            return (Criteria) this;
        }

        public Criteria andQuestion50LessThanOrEqualTo(Integer value) {
            addCriterion("question50 <=", value, "question50");
            return (Criteria) this;
        }

        public Criteria andQuestion50In(List<Integer> values) {
            addCriterion("question50 in", values, "question50");
            return (Criteria) this;
        }

        public Criteria andQuestion50NotIn(List<Integer> values) {
            addCriterion("question50 not in", values, "question50");
            return (Criteria) this;
        }

        public Criteria andQuestion50Between(Integer value1, Integer value2) {
            addCriterion("question50 between", value1, value2, "question50");
            return (Criteria) this;
        }

        public Criteria andQuestion50NotBetween(Integer value1, Integer value2) {
            addCriterion("question50 not between", value1, value2, "question50");
            return (Criteria) this;
        }

        public Criteria andQuestion51IsNull() {
            addCriterion("question51 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion51IsNotNull() {
            addCriterion("question51 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion51EqualTo(Integer value) {
            addCriterion("question51 =", value, "question51");
            return (Criteria) this;
        }

        public Criteria andQuestion51NotEqualTo(Integer value) {
            addCriterion("question51 <>", value, "question51");
            return (Criteria) this;
        }

        public Criteria andQuestion51GreaterThan(Integer value) {
            addCriterion("question51 >", value, "question51");
            return (Criteria) this;
        }

        public Criteria andQuestion51GreaterThanOrEqualTo(Integer value) {
            addCriterion("question51 >=", value, "question51");
            return (Criteria) this;
        }

        public Criteria andQuestion51LessThan(Integer value) {
            addCriterion("question51 <", value, "question51");
            return (Criteria) this;
        }

        public Criteria andQuestion51LessThanOrEqualTo(Integer value) {
            addCriterion("question51 <=", value, "question51");
            return (Criteria) this;
        }

        public Criteria andQuestion51In(List<Integer> values) {
            addCriterion("question51 in", values, "question51");
            return (Criteria) this;
        }

        public Criteria andQuestion51NotIn(List<Integer> values) {
            addCriterion("question51 not in", values, "question51");
            return (Criteria) this;
        }

        public Criteria andQuestion51Between(Integer value1, Integer value2) {
            addCriterion("question51 between", value1, value2, "question51");
            return (Criteria) this;
        }

        public Criteria andQuestion51NotBetween(Integer value1, Integer value2) {
            addCriterion("question51 not between", value1, value2, "question51");
            return (Criteria) this;
        }

        public Criteria andQuestion52IsNull() {
            addCriterion("question52 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion52IsNotNull() {
            addCriterion("question52 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion52EqualTo(Integer value) {
            addCriterion("question52 =", value, "question52");
            return (Criteria) this;
        }

        public Criteria andQuestion52NotEqualTo(Integer value) {
            addCriterion("question52 <>", value, "question52");
            return (Criteria) this;
        }

        public Criteria andQuestion52GreaterThan(Integer value) {
            addCriterion("question52 >", value, "question52");
            return (Criteria) this;
        }

        public Criteria andQuestion52GreaterThanOrEqualTo(Integer value) {
            addCriterion("question52 >=", value, "question52");
            return (Criteria) this;
        }

        public Criteria andQuestion52LessThan(Integer value) {
            addCriterion("question52 <", value, "question52");
            return (Criteria) this;
        }

        public Criteria andQuestion52LessThanOrEqualTo(Integer value) {
            addCriterion("question52 <=", value, "question52");
            return (Criteria) this;
        }

        public Criteria andQuestion52In(List<Integer> values) {
            addCriterion("question52 in", values, "question52");
            return (Criteria) this;
        }

        public Criteria andQuestion52NotIn(List<Integer> values) {
            addCriterion("question52 not in", values, "question52");
            return (Criteria) this;
        }

        public Criteria andQuestion52Between(Integer value1, Integer value2) {
            addCriterion("question52 between", value1, value2, "question52");
            return (Criteria) this;
        }

        public Criteria andQuestion52NotBetween(Integer value1, Integer value2) {
            addCriterion("question52 not between", value1, value2, "question52");
            return (Criteria) this;
        }

        public Criteria andQuestion53IsNull() {
            addCriterion("question53 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion53IsNotNull() {
            addCriterion("question53 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion53EqualTo(Integer value) {
            addCriterion("question53 =", value, "question53");
            return (Criteria) this;
        }

        public Criteria andQuestion53NotEqualTo(Integer value) {
            addCriterion("question53 <>", value, "question53");
            return (Criteria) this;
        }

        public Criteria andQuestion53GreaterThan(Integer value) {
            addCriterion("question53 >", value, "question53");
            return (Criteria) this;
        }

        public Criteria andQuestion53GreaterThanOrEqualTo(Integer value) {
            addCriterion("question53 >=", value, "question53");
            return (Criteria) this;
        }

        public Criteria andQuestion53LessThan(Integer value) {
            addCriterion("question53 <", value, "question53");
            return (Criteria) this;
        }

        public Criteria andQuestion53LessThanOrEqualTo(Integer value) {
            addCriterion("question53 <=", value, "question53");
            return (Criteria) this;
        }

        public Criteria andQuestion53In(List<Integer> values) {
            addCriterion("question53 in", values, "question53");
            return (Criteria) this;
        }

        public Criteria andQuestion53NotIn(List<Integer> values) {
            addCriterion("question53 not in", values, "question53");
            return (Criteria) this;
        }

        public Criteria andQuestion53Between(Integer value1, Integer value2) {
            addCriterion("question53 between", value1, value2, "question53");
            return (Criteria) this;
        }

        public Criteria andQuestion53NotBetween(Integer value1, Integer value2) {
            addCriterion("question53 not between", value1, value2, "question53");
            return (Criteria) this;
        }

        public Criteria andQuestion54IsNull() {
            addCriterion("question54 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion54IsNotNull() {
            addCriterion("question54 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion54EqualTo(Integer value) {
            addCriterion("question54 =", value, "question54");
            return (Criteria) this;
        }

        public Criteria andQuestion54NotEqualTo(Integer value) {
            addCriterion("question54 <>", value, "question54");
            return (Criteria) this;
        }

        public Criteria andQuestion54GreaterThan(Integer value) {
            addCriterion("question54 >", value, "question54");
            return (Criteria) this;
        }

        public Criteria andQuestion54GreaterThanOrEqualTo(Integer value) {
            addCriterion("question54 >=", value, "question54");
            return (Criteria) this;
        }

        public Criteria andQuestion54LessThan(Integer value) {
            addCriterion("question54 <", value, "question54");
            return (Criteria) this;
        }

        public Criteria andQuestion54LessThanOrEqualTo(Integer value) {
            addCriterion("question54 <=", value, "question54");
            return (Criteria) this;
        }

        public Criteria andQuestion54In(List<Integer> values) {
            addCriterion("question54 in", values, "question54");
            return (Criteria) this;
        }

        public Criteria andQuestion54NotIn(List<Integer> values) {
            addCriterion("question54 not in", values, "question54");
            return (Criteria) this;
        }

        public Criteria andQuestion54Between(Integer value1, Integer value2) {
            addCriterion("question54 between", value1, value2, "question54");
            return (Criteria) this;
        }

        public Criteria andQuestion54NotBetween(Integer value1, Integer value2) {
            addCriterion("question54 not between", value1, value2, "question54");
            return (Criteria) this;
        }

        public Criteria andQuestion55IsNull() {
            addCriterion("question55 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion55IsNotNull() {
            addCriterion("question55 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion55EqualTo(Integer value) {
            addCriterion("question55 =", value, "question55");
            return (Criteria) this;
        }

        public Criteria andQuestion55NotEqualTo(Integer value) {
            addCriterion("question55 <>", value, "question55");
            return (Criteria) this;
        }

        public Criteria andQuestion55GreaterThan(Integer value) {
            addCriterion("question55 >", value, "question55");
            return (Criteria) this;
        }

        public Criteria andQuestion55GreaterThanOrEqualTo(Integer value) {
            addCriterion("question55 >=", value, "question55");
            return (Criteria) this;
        }

        public Criteria andQuestion55LessThan(Integer value) {
            addCriterion("question55 <", value, "question55");
            return (Criteria) this;
        }

        public Criteria andQuestion55LessThanOrEqualTo(Integer value) {
            addCriterion("question55 <=", value, "question55");
            return (Criteria) this;
        }

        public Criteria andQuestion55In(List<Integer> values) {
            addCriterion("question55 in", values, "question55");
            return (Criteria) this;
        }

        public Criteria andQuestion55NotIn(List<Integer> values) {
            addCriterion("question55 not in", values, "question55");
            return (Criteria) this;
        }

        public Criteria andQuestion55Between(Integer value1, Integer value2) {
            addCriterion("question55 between", value1, value2, "question55");
            return (Criteria) this;
        }

        public Criteria andQuestion55NotBetween(Integer value1, Integer value2) {
            addCriterion("question55 not between", value1, value2, "question55");
            return (Criteria) this;
        }

        public Criteria andQuestion56IsNull() {
            addCriterion("question56 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion56IsNotNull() {
            addCriterion("question56 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion56EqualTo(Integer value) {
            addCriterion("question56 =", value, "question56");
            return (Criteria) this;
        }

        public Criteria andQuestion56NotEqualTo(Integer value) {
            addCriterion("question56 <>", value, "question56");
            return (Criteria) this;
        }

        public Criteria andQuestion56GreaterThan(Integer value) {
            addCriterion("question56 >", value, "question56");
            return (Criteria) this;
        }

        public Criteria andQuestion56GreaterThanOrEqualTo(Integer value) {
            addCriterion("question56 >=", value, "question56");
            return (Criteria) this;
        }

        public Criteria andQuestion56LessThan(Integer value) {
            addCriterion("question56 <", value, "question56");
            return (Criteria) this;
        }

        public Criteria andQuestion56LessThanOrEqualTo(Integer value) {
            addCriterion("question56 <=", value, "question56");
            return (Criteria) this;
        }

        public Criteria andQuestion56In(List<Integer> values) {
            addCriterion("question56 in", values, "question56");
            return (Criteria) this;
        }

        public Criteria andQuestion56NotIn(List<Integer> values) {
            addCriterion("question56 not in", values, "question56");
            return (Criteria) this;
        }

        public Criteria andQuestion56Between(Integer value1, Integer value2) {
            addCriterion("question56 between", value1, value2, "question56");
            return (Criteria) this;
        }

        public Criteria andQuestion56NotBetween(Integer value1, Integer value2) {
            addCriterion("question56 not between", value1, value2, "question56");
            return (Criteria) this;
        }

        public Criteria andQuestion57IsNull() {
            addCriterion("question57 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion57IsNotNull() {
            addCriterion("question57 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion57EqualTo(Integer value) {
            addCriterion("question57 =", value, "question57");
            return (Criteria) this;
        }

        public Criteria andQuestion57NotEqualTo(Integer value) {
            addCriterion("question57 <>", value, "question57");
            return (Criteria) this;
        }

        public Criteria andQuestion57GreaterThan(Integer value) {
            addCriterion("question57 >", value, "question57");
            return (Criteria) this;
        }

        public Criteria andQuestion57GreaterThanOrEqualTo(Integer value) {
            addCriterion("question57 >=", value, "question57");
            return (Criteria) this;
        }

        public Criteria andQuestion57LessThan(Integer value) {
            addCriterion("question57 <", value, "question57");
            return (Criteria) this;
        }

        public Criteria andQuestion57LessThanOrEqualTo(Integer value) {
            addCriterion("question57 <=", value, "question57");
            return (Criteria) this;
        }

        public Criteria andQuestion57In(List<Integer> values) {
            addCriterion("question57 in", values, "question57");
            return (Criteria) this;
        }

        public Criteria andQuestion57NotIn(List<Integer> values) {
            addCriterion("question57 not in", values, "question57");
            return (Criteria) this;
        }

        public Criteria andQuestion57Between(Integer value1, Integer value2) {
            addCriterion("question57 between", value1, value2, "question57");
            return (Criteria) this;
        }

        public Criteria andQuestion57NotBetween(Integer value1, Integer value2) {
            addCriterion("question57 not between", value1, value2, "question57");
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