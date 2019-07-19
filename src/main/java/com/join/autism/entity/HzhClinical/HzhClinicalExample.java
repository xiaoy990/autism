package com.join.autism.entity.HzhClinical;

import java.util.ArrayList;
import java.util.List;

public class HzhClinicalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HzhClinicalExample() {
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

        public Criteria andOption1IsNull() {
            addCriterion("option1 is null");
            return (Criteria) this;
        }

        public Criteria andOption1IsNotNull() {
            addCriterion("option1 is not null");
            return (Criteria) this;
        }

        public Criteria andOption1EqualTo(Integer value) {
            addCriterion("option1 =", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1NotEqualTo(Integer value) {
            addCriterion("option1 <>", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1GreaterThan(Integer value) {
            addCriterion("option1 >", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1GreaterThanOrEqualTo(Integer value) {
            addCriterion("option1 >=", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1LessThan(Integer value) {
            addCriterion("option1 <", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1LessThanOrEqualTo(Integer value) {
            addCriterion("option1 <=", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1In(List<Integer> values) {
            addCriterion("option1 in", values, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1NotIn(List<Integer> values) {
            addCriterion("option1 not in", values, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1Between(Integer value1, Integer value2) {
            addCriterion("option1 between", value1, value2, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1NotBetween(Integer value1, Integer value2) {
            addCriterion("option1 not between", value1, value2, "option1");
            return (Criteria) this;
        }

        public Criteria andOption2IsNull() {
            addCriterion("option2 is null");
            return (Criteria) this;
        }

        public Criteria andOption2IsNotNull() {
            addCriterion("option2 is not null");
            return (Criteria) this;
        }

        public Criteria andOption2EqualTo(Integer value) {
            addCriterion("option2 =", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2NotEqualTo(Integer value) {
            addCriterion("option2 <>", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2GreaterThan(Integer value) {
            addCriterion("option2 >", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2GreaterThanOrEqualTo(Integer value) {
            addCriterion("option2 >=", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2LessThan(Integer value) {
            addCriterion("option2 <", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2LessThanOrEqualTo(Integer value) {
            addCriterion("option2 <=", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2In(List<Integer> values) {
            addCriterion("option2 in", values, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2NotIn(List<Integer> values) {
            addCriterion("option2 not in", values, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2Between(Integer value1, Integer value2) {
            addCriterion("option2 between", value1, value2, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2NotBetween(Integer value1, Integer value2) {
            addCriterion("option2 not between", value1, value2, "option2");
            return (Criteria) this;
        }

        public Criteria andOption3IsNull() {
            addCriterion("option3 is null");
            return (Criteria) this;
        }

        public Criteria andOption3IsNotNull() {
            addCriterion("option3 is not null");
            return (Criteria) this;
        }

        public Criteria andOption3EqualTo(Integer value) {
            addCriterion("option3 =", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3NotEqualTo(Integer value) {
            addCriterion("option3 <>", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3GreaterThan(Integer value) {
            addCriterion("option3 >", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3GreaterThanOrEqualTo(Integer value) {
            addCriterion("option3 >=", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3LessThan(Integer value) {
            addCriterion("option3 <", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3LessThanOrEqualTo(Integer value) {
            addCriterion("option3 <=", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3In(List<Integer> values) {
            addCriterion("option3 in", values, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3NotIn(List<Integer> values) {
            addCriterion("option3 not in", values, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3Between(Integer value1, Integer value2) {
            addCriterion("option3 between", value1, value2, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3NotBetween(Integer value1, Integer value2) {
            addCriterion("option3 not between", value1, value2, "option3");
            return (Criteria) this;
        }

        public Criteria andOption4IsNull() {
            addCriterion("option4 is null");
            return (Criteria) this;
        }

        public Criteria andOption4IsNotNull() {
            addCriterion("option4 is not null");
            return (Criteria) this;
        }

        public Criteria andOption4EqualTo(Integer value) {
            addCriterion("option4 =", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4NotEqualTo(Integer value) {
            addCriterion("option4 <>", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4GreaterThan(Integer value) {
            addCriterion("option4 >", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4GreaterThanOrEqualTo(Integer value) {
            addCriterion("option4 >=", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4LessThan(Integer value) {
            addCriterion("option4 <", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4LessThanOrEqualTo(Integer value) {
            addCriterion("option4 <=", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4In(List<Integer> values) {
            addCriterion("option4 in", values, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4NotIn(List<Integer> values) {
            addCriterion("option4 not in", values, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4Between(Integer value1, Integer value2) {
            addCriterion("option4 between", value1, value2, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4NotBetween(Integer value1, Integer value2) {
            addCriterion("option4 not between", value1, value2, "option4");
            return (Criteria) this;
        }

        public Criteria andOption5IsNull() {
            addCriterion("option5 is null");
            return (Criteria) this;
        }

        public Criteria andOption5IsNotNull() {
            addCriterion("option5 is not null");
            return (Criteria) this;
        }

        public Criteria andOption5EqualTo(Integer value) {
            addCriterion("option5 =", value, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5NotEqualTo(Integer value) {
            addCriterion("option5 <>", value, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5GreaterThan(Integer value) {
            addCriterion("option5 >", value, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5GreaterThanOrEqualTo(Integer value) {
            addCriterion("option5 >=", value, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5LessThan(Integer value) {
            addCriterion("option5 <", value, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5LessThanOrEqualTo(Integer value) {
            addCriterion("option5 <=", value, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5In(List<Integer> values) {
            addCriterion("option5 in", values, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5NotIn(List<Integer> values) {
            addCriterion("option5 not in", values, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5Between(Integer value1, Integer value2) {
            addCriterion("option5 between", value1, value2, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5NotBetween(Integer value1, Integer value2) {
            addCriterion("option5 not between", value1, value2, "option5");
            return (Criteria) this;
        }

        public Criteria andOption6IsNull() {
            addCriterion("option6 is null");
            return (Criteria) this;
        }

        public Criteria andOption6IsNotNull() {
            addCriterion("option6 is not null");
            return (Criteria) this;
        }

        public Criteria andOption6EqualTo(Integer value) {
            addCriterion("option6 =", value, "option6");
            return (Criteria) this;
        }

        public Criteria andOption6NotEqualTo(Integer value) {
            addCriterion("option6 <>", value, "option6");
            return (Criteria) this;
        }

        public Criteria andOption6GreaterThan(Integer value) {
            addCriterion("option6 >", value, "option6");
            return (Criteria) this;
        }

        public Criteria andOption6GreaterThanOrEqualTo(Integer value) {
            addCriterion("option6 >=", value, "option6");
            return (Criteria) this;
        }

        public Criteria andOption6LessThan(Integer value) {
            addCriterion("option6 <", value, "option6");
            return (Criteria) this;
        }

        public Criteria andOption6LessThanOrEqualTo(Integer value) {
            addCriterion("option6 <=", value, "option6");
            return (Criteria) this;
        }

        public Criteria andOption6In(List<Integer> values) {
            addCriterion("option6 in", values, "option6");
            return (Criteria) this;
        }

        public Criteria andOption6NotIn(List<Integer> values) {
            addCriterion("option6 not in", values, "option6");
            return (Criteria) this;
        }

        public Criteria andOption6Between(Integer value1, Integer value2) {
            addCriterion("option6 between", value1, value2, "option6");
            return (Criteria) this;
        }

        public Criteria andOption6NotBetween(Integer value1, Integer value2) {
            addCriterion("option6 not between", value1, value2, "option6");
            return (Criteria) this;
        }

        public Criteria andOption7IsNull() {
            addCriterion("option7 is null");
            return (Criteria) this;
        }

        public Criteria andOption7IsNotNull() {
            addCriterion("option7 is not null");
            return (Criteria) this;
        }

        public Criteria andOption7EqualTo(Integer value) {
            addCriterion("option7 =", value, "option7");
            return (Criteria) this;
        }

        public Criteria andOption7NotEqualTo(Integer value) {
            addCriterion("option7 <>", value, "option7");
            return (Criteria) this;
        }

        public Criteria andOption7GreaterThan(Integer value) {
            addCriterion("option7 >", value, "option7");
            return (Criteria) this;
        }

        public Criteria andOption7GreaterThanOrEqualTo(Integer value) {
            addCriterion("option7 >=", value, "option7");
            return (Criteria) this;
        }

        public Criteria andOption7LessThan(Integer value) {
            addCriterion("option7 <", value, "option7");
            return (Criteria) this;
        }

        public Criteria andOption7LessThanOrEqualTo(Integer value) {
            addCriterion("option7 <=", value, "option7");
            return (Criteria) this;
        }

        public Criteria andOption7In(List<Integer> values) {
            addCriterion("option7 in", values, "option7");
            return (Criteria) this;
        }

        public Criteria andOption7NotIn(List<Integer> values) {
            addCriterion("option7 not in", values, "option7");
            return (Criteria) this;
        }

        public Criteria andOption7Between(Integer value1, Integer value2) {
            addCriterion("option7 between", value1, value2, "option7");
            return (Criteria) this;
        }

        public Criteria andOption7NotBetween(Integer value1, Integer value2) {
            addCriterion("option7 not between", value1, value2, "option7");
            return (Criteria) this;
        }

        public Criteria andOption8IsNull() {
            addCriterion("option8 is null");
            return (Criteria) this;
        }

        public Criteria andOption8IsNotNull() {
            addCriterion("option8 is not null");
            return (Criteria) this;
        }

        public Criteria andOption8EqualTo(Integer value) {
            addCriterion("option8 =", value, "option8");
            return (Criteria) this;
        }

        public Criteria andOption8NotEqualTo(Integer value) {
            addCriterion("option8 <>", value, "option8");
            return (Criteria) this;
        }

        public Criteria andOption8GreaterThan(Integer value) {
            addCriterion("option8 >", value, "option8");
            return (Criteria) this;
        }

        public Criteria andOption8GreaterThanOrEqualTo(Integer value) {
            addCriterion("option8 >=", value, "option8");
            return (Criteria) this;
        }

        public Criteria andOption8LessThan(Integer value) {
            addCriterion("option8 <", value, "option8");
            return (Criteria) this;
        }

        public Criteria andOption8LessThanOrEqualTo(Integer value) {
            addCriterion("option8 <=", value, "option8");
            return (Criteria) this;
        }

        public Criteria andOption8In(List<Integer> values) {
            addCriterion("option8 in", values, "option8");
            return (Criteria) this;
        }

        public Criteria andOption8NotIn(List<Integer> values) {
            addCriterion("option8 not in", values, "option8");
            return (Criteria) this;
        }

        public Criteria andOption8Between(Integer value1, Integer value2) {
            addCriterion("option8 between", value1, value2, "option8");
            return (Criteria) this;
        }

        public Criteria andOption8NotBetween(Integer value1, Integer value2) {
            addCriterion("option8 not between", value1, value2, "option8");
            return (Criteria) this;
        }

        public Criteria andOption9IsNull() {
            addCriterion("option9 is null");
            return (Criteria) this;
        }

        public Criteria andOption9IsNotNull() {
            addCriterion("option9 is not null");
            return (Criteria) this;
        }

        public Criteria andOption9EqualTo(Integer value) {
            addCriterion("option9 =", value, "option9");
            return (Criteria) this;
        }

        public Criteria andOption9NotEqualTo(Integer value) {
            addCriterion("option9 <>", value, "option9");
            return (Criteria) this;
        }

        public Criteria andOption9GreaterThan(Integer value) {
            addCriterion("option9 >", value, "option9");
            return (Criteria) this;
        }

        public Criteria andOption9GreaterThanOrEqualTo(Integer value) {
            addCriterion("option9 >=", value, "option9");
            return (Criteria) this;
        }

        public Criteria andOption9LessThan(Integer value) {
            addCriterion("option9 <", value, "option9");
            return (Criteria) this;
        }

        public Criteria andOption9LessThanOrEqualTo(Integer value) {
            addCriterion("option9 <=", value, "option9");
            return (Criteria) this;
        }

        public Criteria andOption9In(List<Integer> values) {
            addCriterion("option9 in", values, "option9");
            return (Criteria) this;
        }

        public Criteria andOption9NotIn(List<Integer> values) {
            addCriterion("option9 not in", values, "option9");
            return (Criteria) this;
        }

        public Criteria andOption9Between(Integer value1, Integer value2) {
            addCriterion("option9 between", value1, value2, "option9");
            return (Criteria) this;
        }

        public Criteria andOption9NotBetween(Integer value1, Integer value2) {
            addCriterion("option9 not between", value1, value2, "option9");
            return (Criteria) this;
        }

        public Criteria andOption10IsNull() {
            addCriterion("option10 is null");
            return (Criteria) this;
        }

        public Criteria andOption10IsNotNull() {
            addCriterion("option10 is not null");
            return (Criteria) this;
        }

        public Criteria andOption10EqualTo(Integer value) {
            addCriterion("option10 =", value, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10NotEqualTo(Integer value) {
            addCriterion("option10 <>", value, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10GreaterThan(Integer value) {
            addCriterion("option10 >", value, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10GreaterThanOrEqualTo(Integer value) {
            addCriterion("option10 >=", value, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10LessThan(Integer value) {
            addCriterion("option10 <", value, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10LessThanOrEqualTo(Integer value) {
            addCriterion("option10 <=", value, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10In(List<Integer> values) {
            addCriterion("option10 in", values, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10NotIn(List<Integer> values) {
            addCriterion("option10 not in", values, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10Between(Integer value1, Integer value2) {
            addCriterion("option10 between", value1, value2, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10NotBetween(Integer value1, Integer value2) {
            addCriterion("option10 not between", value1, value2, "option10");
            return (Criteria) this;
        }

        public Criteria andOption11IsNull() {
            addCriterion("option11 is null");
            return (Criteria) this;
        }

        public Criteria andOption11IsNotNull() {
            addCriterion("option11 is not null");
            return (Criteria) this;
        }

        public Criteria andOption11EqualTo(Integer value) {
            addCriterion("option11 =", value, "option11");
            return (Criteria) this;
        }

        public Criteria andOption11NotEqualTo(Integer value) {
            addCriterion("option11 <>", value, "option11");
            return (Criteria) this;
        }

        public Criteria andOption11GreaterThan(Integer value) {
            addCriterion("option11 >", value, "option11");
            return (Criteria) this;
        }

        public Criteria andOption11GreaterThanOrEqualTo(Integer value) {
            addCriterion("option11 >=", value, "option11");
            return (Criteria) this;
        }

        public Criteria andOption11LessThan(Integer value) {
            addCriterion("option11 <", value, "option11");
            return (Criteria) this;
        }

        public Criteria andOption11LessThanOrEqualTo(Integer value) {
            addCriterion("option11 <=", value, "option11");
            return (Criteria) this;
        }

        public Criteria andOption11In(List<Integer> values) {
            addCriterion("option11 in", values, "option11");
            return (Criteria) this;
        }

        public Criteria andOption11NotIn(List<Integer> values) {
            addCriterion("option11 not in", values, "option11");
            return (Criteria) this;
        }

        public Criteria andOption11Between(Integer value1, Integer value2) {
            addCriterion("option11 between", value1, value2, "option11");
            return (Criteria) this;
        }

        public Criteria andOption11NotBetween(Integer value1, Integer value2) {
            addCriterion("option11 not between", value1, value2, "option11");
            return (Criteria) this;
        }

        public Criteria andOption12IsNull() {
            addCriterion("option12 is null");
            return (Criteria) this;
        }

        public Criteria andOption12IsNotNull() {
            addCriterion("option12 is not null");
            return (Criteria) this;
        }

        public Criteria andOption12EqualTo(Integer value) {
            addCriterion("option12 =", value, "option12");
            return (Criteria) this;
        }

        public Criteria andOption12NotEqualTo(Integer value) {
            addCriterion("option12 <>", value, "option12");
            return (Criteria) this;
        }

        public Criteria andOption12GreaterThan(Integer value) {
            addCriterion("option12 >", value, "option12");
            return (Criteria) this;
        }

        public Criteria andOption12GreaterThanOrEqualTo(Integer value) {
            addCriterion("option12 >=", value, "option12");
            return (Criteria) this;
        }

        public Criteria andOption12LessThan(Integer value) {
            addCriterion("option12 <", value, "option12");
            return (Criteria) this;
        }

        public Criteria andOption12LessThanOrEqualTo(Integer value) {
            addCriterion("option12 <=", value, "option12");
            return (Criteria) this;
        }

        public Criteria andOption12In(List<Integer> values) {
            addCriterion("option12 in", values, "option12");
            return (Criteria) this;
        }

        public Criteria andOption12NotIn(List<Integer> values) {
            addCriterion("option12 not in", values, "option12");
            return (Criteria) this;
        }

        public Criteria andOption12Between(Integer value1, Integer value2) {
            addCriterion("option12 between", value1, value2, "option12");
            return (Criteria) this;
        }

        public Criteria andOption12NotBetween(Integer value1, Integer value2) {
            addCriterion("option12 not between", value1, value2, "option12");
            return (Criteria) this;
        }

        public Criteria andOption13IsNull() {
            addCriterion("option13 is null");
            return (Criteria) this;
        }

        public Criteria andOption13IsNotNull() {
            addCriterion("option13 is not null");
            return (Criteria) this;
        }

        public Criteria andOption13EqualTo(Integer value) {
            addCriterion("option13 =", value, "option13");
            return (Criteria) this;
        }

        public Criteria andOption13NotEqualTo(Integer value) {
            addCriterion("option13 <>", value, "option13");
            return (Criteria) this;
        }

        public Criteria andOption13GreaterThan(Integer value) {
            addCriterion("option13 >", value, "option13");
            return (Criteria) this;
        }

        public Criteria andOption13GreaterThanOrEqualTo(Integer value) {
            addCriterion("option13 >=", value, "option13");
            return (Criteria) this;
        }

        public Criteria andOption13LessThan(Integer value) {
            addCriterion("option13 <", value, "option13");
            return (Criteria) this;
        }

        public Criteria andOption13LessThanOrEqualTo(Integer value) {
            addCriterion("option13 <=", value, "option13");
            return (Criteria) this;
        }

        public Criteria andOption13In(List<Integer> values) {
            addCriterion("option13 in", values, "option13");
            return (Criteria) this;
        }

        public Criteria andOption13NotIn(List<Integer> values) {
            addCriterion("option13 not in", values, "option13");
            return (Criteria) this;
        }

        public Criteria andOption13Between(Integer value1, Integer value2) {
            addCriterion("option13 between", value1, value2, "option13");
            return (Criteria) this;
        }

        public Criteria andOption13NotBetween(Integer value1, Integer value2) {
            addCriterion("option13 not between", value1, value2, "option13");
            return (Criteria) this;
        }

        public Criteria andOption14IsNull() {
            addCriterion("option14 is null");
            return (Criteria) this;
        }

        public Criteria andOption14IsNotNull() {
            addCriterion("option14 is not null");
            return (Criteria) this;
        }

        public Criteria andOption14EqualTo(Integer value) {
            addCriterion("option14 =", value, "option14");
            return (Criteria) this;
        }

        public Criteria andOption14NotEqualTo(Integer value) {
            addCriterion("option14 <>", value, "option14");
            return (Criteria) this;
        }

        public Criteria andOption14GreaterThan(Integer value) {
            addCriterion("option14 >", value, "option14");
            return (Criteria) this;
        }

        public Criteria andOption14GreaterThanOrEqualTo(Integer value) {
            addCriterion("option14 >=", value, "option14");
            return (Criteria) this;
        }

        public Criteria andOption14LessThan(Integer value) {
            addCriterion("option14 <", value, "option14");
            return (Criteria) this;
        }

        public Criteria andOption14LessThanOrEqualTo(Integer value) {
            addCriterion("option14 <=", value, "option14");
            return (Criteria) this;
        }

        public Criteria andOption14In(List<Integer> values) {
            addCriterion("option14 in", values, "option14");
            return (Criteria) this;
        }

        public Criteria andOption14NotIn(List<Integer> values) {
            addCriterion("option14 not in", values, "option14");
            return (Criteria) this;
        }

        public Criteria andOption14Between(Integer value1, Integer value2) {
            addCriterion("option14 between", value1, value2, "option14");
            return (Criteria) this;
        }

        public Criteria andOption14NotBetween(Integer value1, Integer value2) {
            addCriterion("option14 not between", value1, value2, "option14");
            return (Criteria) this;
        }

        public Criteria andOption15IsNull() {
            addCriterion("option15 is null");
            return (Criteria) this;
        }

        public Criteria andOption15IsNotNull() {
            addCriterion("option15 is not null");
            return (Criteria) this;
        }

        public Criteria andOption15EqualTo(Integer value) {
            addCriterion("option15 =", value, "option15");
            return (Criteria) this;
        }

        public Criteria andOption15NotEqualTo(Integer value) {
            addCriterion("option15 <>", value, "option15");
            return (Criteria) this;
        }

        public Criteria andOption15GreaterThan(Integer value) {
            addCriterion("option15 >", value, "option15");
            return (Criteria) this;
        }

        public Criteria andOption15GreaterThanOrEqualTo(Integer value) {
            addCriterion("option15 >=", value, "option15");
            return (Criteria) this;
        }

        public Criteria andOption15LessThan(Integer value) {
            addCriterion("option15 <", value, "option15");
            return (Criteria) this;
        }

        public Criteria andOption15LessThanOrEqualTo(Integer value) {
            addCriterion("option15 <=", value, "option15");
            return (Criteria) this;
        }

        public Criteria andOption15In(List<Integer> values) {
            addCriterion("option15 in", values, "option15");
            return (Criteria) this;
        }

        public Criteria andOption15NotIn(List<Integer> values) {
            addCriterion("option15 not in", values, "option15");
            return (Criteria) this;
        }

        public Criteria andOption15Between(Integer value1, Integer value2) {
            addCriterion("option15 between", value1, value2, "option15");
            return (Criteria) this;
        }

        public Criteria andOption15NotBetween(Integer value1, Integer value2) {
            addCriterion("option15 not between", value1, value2, "option15");
            return (Criteria) this;
        }

        public Criteria andOption16IsNull() {
            addCriterion("option16 is null");
            return (Criteria) this;
        }

        public Criteria andOption16IsNotNull() {
            addCriterion("option16 is not null");
            return (Criteria) this;
        }

        public Criteria andOption16EqualTo(Integer value) {
            addCriterion("option16 =", value, "option16");
            return (Criteria) this;
        }

        public Criteria andOption16NotEqualTo(Integer value) {
            addCriterion("option16 <>", value, "option16");
            return (Criteria) this;
        }

        public Criteria andOption16GreaterThan(Integer value) {
            addCriterion("option16 >", value, "option16");
            return (Criteria) this;
        }

        public Criteria andOption16GreaterThanOrEqualTo(Integer value) {
            addCriterion("option16 >=", value, "option16");
            return (Criteria) this;
        }

        public Criteria andOption16LessThan(Integer value) {
            addCriterion("option16 <", value, "option16");
            return (Criteria) this;
        }

        public Criteria andOption16LessThanOrEqualTo(Integer value) {
            addCriterion("option16 <=", value, "option16");
            return (Criteria) this;
        }

        public Criteria andOption16In(List<Integer> values) {
            addCriterion("option16 in", values, "option16");
            return (Criteria) this;
        }

        public Criteria andOption16NotIn(List<Integer> values) {
            addCriterion("option16 not in", values, "option16");
            return (Criteria) this;
        }

        public Criteria andOption16Between(Integer value1, Integer value2) {
            addCriterion("option16 between", value1, value2, "option16");
            return (Criteria) this;
        }

        public Criteria andOption16NotBetween(Integer value1, Integer value2) {
            addCriterion("option16 not between", value1, value2, "option16");
            return (Criteria) this;
        }

        public Criteria andOption17IsNull() {
            addCriterion("option17 is null");
            return (Criteria) this;
        }

        public Criteria andOption17IsNotNull() {
            addCriterion("option17 is not null");
            return (Criteria) this;
        }

        public Criteria andOption17EqualTo(Integer value) {
            addCriterion("option17 =", value, "option17");
            return (Criteria) this;
        }

        public Criteria andOption17NotEqualTo(Integer value) {
            addCriterion("option17 <>", value, "option17");
            return (Criteria) this;
        }

        public Criteria andOption17GreaterThan(Integer value) {
            addCriterion("option17 >", value, "option17");
            return (Criteria) this;
        }

        public Criteria andOption17GreaterThanOrEqualTo(Integer value) {
            addCriterion("option17 >=", value, "option17");
            return (Criteria) this;
        }

        public Criteria andOption17LessThan(Integer value) {
            addCriterion("option17 <", value, "option17");
            return (Criteria) this;
        }

        public Criteria andOption17LessThanOrEqualTo(Integer value) {
            addCriterion("option17 <=", value, "option17");
            return (Criteria) this;
        }

        public Criteria andOption17In(List<Integer> values) {
            addCriterion("option17 in", values, "option17");
            return (Criteria) this;
        }

        public Criteria andOption17NotIn(List<Integer> values) {
            addCriterion("option17 not in", values, "option17");
            return (Criteria) this;
        }

        public Criteria andOption17Between(Integer value1, Integer value2) {
            addCriterion("option17 between", value1, value2, "option17");
            return (Criteria) this;
        }

        public Criteria andOption17NotBetween(Integer value1, Integer value2) {
            addCriterion("option17 not between", value1, value2, "option17");
            return (Criteria) this;
        }

        public Criteria andOption18IsNull() {
            addCriterion("option18 is null");
            return (Criteria) this;
        }

        public Criteria andOption18IsNotNull() {
            addCriterion("option18 is not null");
            return (Criteria) this;
        }

        public Criteria andOption18EqualTo(Integer value) {
            addCriterion("option18 =", value, "option18");
            return (Criteria) this;
        }

        public Criteria andOption18NotEqualTo(Integer value) {
            addCriterion("option18 <>", value, "option18");
            return (Criteria) this;
        }

        public Criteria andOption18GreaterThan(Integer value) {
            addCriterion("option18 >", value, "option18");
            return (Criteria) this;
        }

        public Criteria andOption18GreaterThanOrEqualTo(Integer value) {
            addCriterion("option18 >=", value, "option18");
            return (Criteria) this;
        }

        public Criteria andOption18LessThan(Integer value) {
            addCriterion("option18 <", value, "option18");
            return (Criteria) this;
        }

        public Criteria andOption18LessThanOrEqualTo(Integer value) {
            addCriterion("option18 <=", value, "option18");
            return (Criteria) this;
        }

        public Criteria andOption18In(List<Integer> values) {
            addCriterion("option18 in", values, "option18");
            return (Criteria) this;
        }

        public Criteria andOption18NotIn(List<Integer> values) {
            addCriterion("option18 not in", values, "option18");
            return (Criteria) this;
        }

        public Criteria andOption18Between(Integer value1, Integer value2) {
            addCriterion("option18 between", value1, value2, "option18");
            return (Criteria) this;
        }

        public Criteria andOption18NotBetween(Integer value1, Integer value2) {
            addCriterion("option18 not between", value1, value2, "option18");
            return (Criteria) this;
        }

        public Criteria andOption19IsNull() {
            addCriterion("option19 is null");
            return (Criteria) this;
        }

        public Criteria andOption19IsNotNull() {
            addCriterion("option19 is not null");
            return (Criteria) this;
        }

        public Criteria andOption19EqualTo(Integer value) {
            addCriterion("option19 =", value, "option19");
            return (Criteria) this;
        }

        public Criteria andOption19NotEqualTo(Integer value) {
            addCriterion("option19 <>", value, "option19");
            return (Criteria) this;
        }

        public Criteria andOption19GreaterThan(Integer value) {
            addCriterion("option19 >", value, "option19");
            return (Criteria) this;
        }

        public Criteria andOption19GreaterThanOrEqualTo(Integer value) {
            addCriterion("option19 >=", value, "option19");
            return (Criteria) this;
        }

        public Criteria andOption19LessThan(Integer value) {
            addCriterion("option19 <", value, "option19");
            return (Criteria) this;
        }

        public Criteria andOption19LessThanOrEqualTo(Integer value) {
            addCriterion("option19 <=", value, "option19");
            return (Criteria) this;
        }

        public Criteria andOption19In(List<Integer> values) {
            addCriterion("option19 in", values, "option19");
            return (Criteria) this;
        }

        public Criteria andOption19NotIn(List<Integer> values) {
            addCriterion("option19 not in", values, "option19");
            return (Criteria) this;
        }

        public Criteria andOption19Between(Integer value1, Integer value2) {
            addCriterion("option19 between", value1, value2, "option19");
            return (Criteria) this;
        }

        public Criteria andOption19NotBetween(Integer value1, Integer value2) {
            addCriterion("option19 not between", value1, value2, "option19");
            return (Criteria) this;
        }

        public Criteria andOption20IsNull() {
            addCriterion("option20 is null");
            return (Criteria) this;
        }

        public Criteria andOption20IsNotNull() {
            addCriterion("option20 is not null");
            return (Criteria) this;
        }

        public Criteria andOption20EqualTo(Integer value) {
            addCriterion("option20 =", value, "option20");
            return (Criteria) this;
        }

        public Criteria andOption20NotEqualTo(Integer value) {
            addCriterion("option20 <>", value, "option20");
            return (Criteria) this;
        }

        public Criteria andOption20GreaterThan(Integer value) {
            addCriterion("option20 >", value, "option20");
            return (Criteria) this;
        }

        public Criteria andOption20GreaterThanOrEqualTo(Integer value) {
            addCriterion("option20 >=", value, "option20");
            return (Criteria) this;
        }

        public Criteria andOption20LessThan(Integer value) {
            addCriterion("option20 <", value, "option20");
            return (Criteria) this;
        }

        public Criteria andOption20LessThanOrEqualTo(Integer value) {
            addCriterion("option20 <=", value, "option20");
            return (Criteria) this;
        }

        public Criteria andOption20In(List<Integer> values) {
            addCriterion("option20 in", values, "option20");
            return (Criteria) this;
        }

        public Criteria andOption20NotIn(List<Integer> values) {
            addCriterion("option20 not in", values, "option20");
            return (Criteria) this;
        }

        public Criteria andOption20Between(Integer value1, Integer value2) {
            addCriterion("option20 between", value1, value2, "option20");
            return (Criteria) this;
        }

        public Criteria andOption20NotBetween(Integer value1, Integer value2) {
            addCriterion("option20 not between", value1, value2, "option20");
            return (Criteria) this;
        }

        public Criteria andOption21IsNull() {
            addCriterion("option21 is null");
            return (Criteria) this;
        }

        public Criteria andOption21IsNotNull() {
            addCriterion("option21 is not null");
            return (Criteria) this;
        }

        public Criteria andOption21EqualTo(Integer value) {
            addCriterion("option21 =", value, "option21");
            return (Criteria) this;
        }

        public Criteria andOption21NotEqualTo(Integer value) {
            addCriterion("option21 <>", value, "option21");
            return (Criteria) this;
        }

        public Criteria andOption21GreaterThan(Integer value) {
            addCriterion("option21 >", value, "option21");
            return (Criteria) this;
        }

        public Criteria andOption21GreaterThanOrEqualTo(Integer value) {
            addCriterion("option21 >=", value, "option21");
            return (Criteria) this;
        }

        public Criteria andOption21LessThan(Integer value) {
            addCriterion("option21 <", value, "option21");
            return (Criteria) this;
        }

        public Criteria andOption21LessThanOrEqualTo(Integer value) {
            addCriterion("option21 <=", value, "option21");
            return (Criteria) this;
        }

        public Criteria andOption21In(List<Integer> values) {
            addCriterion("option21 in", values, "option21");
            return (Criteria) this;
        }

        public Criteria andOption21NotIn(List<Integer> values) {
            addCriterion("option21 not in", values, "option21");
            return (Criteria) this;
        }

        public Criteria andOption21Between(Integer value1, Integer value2) {
            addCriterion("option21 between", value1, value2, "option21");
            return (Criteria) this;
        }

        public Criteria andOption21NotBetween(Integer value1, Integer value2) {
            addCriterion("option21 not between", value1, value2, "option21");
            return (Criteria) this;
        }

        public Criteria andOption22IsNull() {
            addCriterion("option22 is null");
            return (Criteria) this;
        }

        public Criteria andOption22IsNotNull() {
            addCriterion("option22 is not null");
            return (Criteria) this;
        }

        public Criteria andOption22EqualTo(Integer value) {
            addCriterion("option22 =", value, "option22");
            return (Criteria) this;
        }

        public Criteria andOption22NotEqualTo(Integer value) {
            addCriterion("option22 <>", value, "option22");
            return (Criteria) this;
        }

        public Criteria andOption22GreaterThan(Integer value) {
            addCriterion("option22 >", value, "option22");
            return (Criteria) this;
        }

        public Criteria andOption22GreaterThanOrEqualTo(Integer value) {
            addCriterion("option22 >=", value, "option22");
            return (Criteria) this;
        }

        public Criteria andOption22LessThan(Integer value) {
            addCriterion("option22 <", value, "option22");
            return (Criteria) this;
        }

        public Criteria andOption22LessThanOrEqualTo(Integer value) {
            addCriterion("option22 <=", value, "option22");
            return (Criteria) this;
        }

        public Criteria andOption22In(List<Integer> values) {
            addCriterion("option22 in", values, "option22");
            return (Criteria) this;
        }

        public Criteria andOption22NotIn(List<Integer> values) {
            addCriterion("option22 not in", values, "option22");
            return (Criteria) this;
        }

        public Criteria andOption22Between(Integer value1, Integer value2) {
            addCriterion("option22 between", value1, value2, "option22");
            return (Criteria) this;
        }

        public Criteria andOption22NotBetween(Integer value1, Integer value2) {
            addCriterion("option22 not between", value1, value2, "option22");
            return (Criteria) this;
        }

        public Criteria andOption23IsNull() {
            addCriterion("option23 is null");
            return (Criteria) this;
        }

        public Criteria andOption23IsNotNull() {
            addCriterion("option23 is not null");
            return (Criteria) this;
        }

        public Criteria andOption23EqualTo(Integer value) {
            addCriterion("option23 =", value, "option23");
            return (Criteria) this;
        }

        public Criteria andOption23NotEqualTo(Integer value) {
            addCriterion("option23 <>", value, "option23");
            return (Criteria) this;
        }

        public Criteria andOption23GreaterThan(Integer value) {
            addCriterion("option23 >", value, "option23");
            return (Criteria) this;
        }

        public Criteria andOption23GreaterThanOrEqualTo(Integer value) {
            addCriterion("option23 >=", value, "option23");
            return (Criteria) this;
        }

        public Criteria andOption23LessThan(Integer value) {
            addCriterion("option23 <", value, "option23");
            return (Criteria) this;
        }

        public Criteria andOption23LessThanOrEqualTo(Integer value) {
            addCriterion("option23 <=", value, "option23");
            return (Criteria) this;
        }

        public Criteria andOption23In(List<Integer> values) {
            addCriterion("option23 in", values, "option23");
            return (Criteria) this;
        }

        public Criteria andOption23NotIn(List<Integer> values) {
            addCriterion("option23 not in", values, "option23");
            return (Criteria) this;
        }

        public Criteria andOption23Between(Integer value1, Integer value2) {
            addCriterion("option23 between", value1, value2, "option23");
            return (Criteria) this;
        }

        public Criteria andOption23NotBetween(Integer value1, Integer value2) {
            addCriterion("option23 not between", value1, value2, "option23");
            return (Criteria) this;
        }

        public Criteria andOption24IsNull() {
            addCriterion("option24 is null");
            return (Criteria) this;
        }

        public Criteria andOption24IsNotNull() {
            addCriterion("option24 is not null");
            return (Criteria) this;
        }

        public Criteria andOption24EqualTo(Integer value) {
            addCriterion("option24 =", value, "option24");
            return (Criteria) this;
        }

        public Criteria andOption24NotEqualTo(Integer value) {
            addCriterion("option24 <>", value, "option24");
            return (Criteria) this;
        }

        public Criteria andOption24GreaterThan(Integer value) {
            addCriterion("option24 >", value, "option24");
            return (Criteria) this;
        }

        public Criteria andOption24GreaterThanOrEqualTo(Integer value) {
            addCriterion("option24 >=", value, "option24");
            return (Criteria) this;
        }

        public Criteria andOption24LessThan(Integer value) {
            addCriterion("option24 <", value, "option24");
            return (Criteria) this;
        }

        public Criteria andOption24LessThanOrEqualTo(Integer value) {
            addCriterion("option24 <=", value, "option24");
            return (Criteria) this;
        }

        public Criteria andOption24In(List<Integer> values) {
            addCriterion("option24 in", values, "option24");
            return (Criteria) this;
        }

        public Criteria andOption24NotIn(List<Integer> values) {
            addCriterion("option24 not in", values, "option24");
            return (Criteria) this;
        }

        public Criteria andOption24Between(Integer value1, Integer value2) {
            addCriterion("option24 between", value1, value2, "option24");
            return (Criteria) this;
        }

        public Criteria andOption24NotBetween(Integer value1, Integer value2) {
            addCriterion("option24 not between", value1, value2, "option24");
            return (Criteria) this;
        }

        public Criteria andOption25IsNull() {
            addCriterion("option25 is null");
            return (Criteria) this;
        }

        public Criteria andOption25IsNotNull() {
            addCriterion("option25 is not null");
            return (Criteria) this;
        }

        public Criteria andOption25EqualTo(Integer value) {
            addCriterion("option25 =", value, "option25");
            return (Criteria) this;
        }

        public Criteria andOption25NotEqualTo(Integer value) {
            addCriterion("option25 <>", value, "option25");
            return (Criteria) this;
        }

        public Criteria andOption25GreaterThan(Integer value) {
            addCriterion("option25 >", value, "option25");
            return (Criteria) this;
        }

        public Criteria andOption25GreaterThanOrEqualTo(Integer value) {
            addCriterion("option25 >=", value, "option25");
            return (Criteria) this;
        }

        public Criteria andOption25LessThan(Integer value) {
            addCriterion("option25 <", value, "option25");
            return (Criteria) this;
        }

        public Criteria andOption25LessThanOrEqualTo(Integer value) {
            addCriterion("option25 <=", value, "option25");
            return (Criteria) this;
        }

        public Criteria andOption25In(List<Integer> values) {
            addCriterion("option25 in", values, "option25");
            return (Criteria) this;
        }

        public Criteria andOption25NotIn(List<Integer> values) {
            addCriterion("option25 not in", values, "option25");
            return (Criteria) this;
        }

        public Criteria andOption25Between(Integer value1, Integer value2) {
            addCriterion("option25 between", value1, value2, "option25");
            return (Criteria) this;
        }

        public Criteria andOption25NotBetween(Integer value1, Integer value2) {
            addCriterion("option25 not between", value1, value2, "option25");
            return (Criteria) this;
        }

        public Criteria andOption26IsNull() {
            addCriterion("option26 is null");
            return (Criteria) this;
        }

        public Criteria andOption26IsNotNull() {
            addCriterion("option26 is not null");
            return (Criteria) this;
        }

        public Criteria andOption26EqualTo(Integer value) {
            addCriterion("option26 =", value, "option26");
            return (Criteria) this;
        }

        public Criteria andOption26NotEqualTo(Integer value) {
            addCriterion("option26 <>", value, "option26");
            return (Criteria) this;
        }

        public Criteria andOption26GreaterThan(Integer value) {
            addCriterion("option26 >", value, "option26");
            return (Criteria) this;
        }

        public Criteria andOption26GreaterThanOrEqualTo(Integer value) {
            addCriterion("option26 >=", value, "option26");
            return (Criteria) this;
        }

        public Criteria andOption26LessThan(Integer value) {
            addCriterion("option26 <", value, "option26");
            return (Criteria) this;
        }

        public Criteria andOption26LessThanOrEqualTo(Integer value) {
            addCriterion("option26 <=", value, "option26");
            return (Criteria) this;
        }

        public Criteria andOption26In(List<Integer> values) {
            addCriterion("option26 in", values, "option26");
            return (Criteria) this;
        }

        public Criteria andOption26NotIn(List<Integer> values) {
            addCriterion("option26 not in", values, "option26");
            return (Criteria) this;
        }

        public Criteria andOption26Between(Integer value1, Integer value2) {
            addCriterion("option26 between", value1, value2, "option26");
            return (Criteria) this;
        }

        public Criteria andOption26NotBetween(Integer value1, Integer value2) {
            addCriterion("option26 not between", value1, value2, "option26");
            return (Criteria) this;
        }

        public Criteria andOption27IsNull() {
            addCriterion("option27 is null");
            return (Criteria) this;
        }

        public Criteria andOption27IsNotNull() {
            addCriterion("option27 is not null");
            return (Criteria) this;
        }

        public Criteria andOption27EqualTo(Integer value) {
            addCriterion("option27 =", value, "option27");
            return (Criteria) this;
        }

        public Criteria andOption27NotEqualTo(Integer value) {
            addCriterion("option27 <>", value, "option27");
            return (Criteria) this;
        }

        public Criteria andOption27GreaterThan(Integer value) {
            addCriterion("option27 >", value, "option27");
            return (Criteria) this;
        }

        public Criteria andOption27GreaterThanOrEqualTo(Integer value) {
            addCriterion("option27 >=", value, "option27");
            return (Criteria) this;
        }

        public Criteria andOption27LessThan(Integer value) {
            addCriterion("option27 <", value, "option27");
            return (Criteria) this;
        }

        public Criteria andOption27LessThanOrEqualTo(Integer value) {
            addCriterion("option27 <=", value, "option27");
            return (Criteria) this;
        }

        public Criteria andOption27In(List<Integer> values) {
            addCriterion("option27 in", values, "option27");
            return (Criteria) this;
        }

        public Criteria andOption27NotIn(List<Integer> values) {
            addCriterion("option27 not in", values, "option27");
            return (Criteria) this;
        }

        public Criteria andOption27Between(Integer value1, Integer value2) {
            addCriterion("option27 between", value1, value2, "option27");
            return (Criteria) this;
        }

        public Criteria andOption27NotBetween(Integer value1, Integer value2) {
            addCriterion("option27 not between", value1, value2, "option27");
            return (Criteria) this;
        }

        public Criteria andOption28IsNull() {
            addCriterion("option28 is null");
            return (Criteria) this;
        }

        public Criteria andOption28IsNotNull() {
            addCriterion("option28 is not null");
            return (Criteria) this;
        }

        public Criteria andOption28EqualTo(Integer value) {
            addCriterion("option28 =", value, "option28");
            return (Criteria) this;
        }

        public Criteria andOption28NotEqualTo(Integer value) {
            addCriterion("option28 <>", value, "option28");
            return (Criteria) this;
        }

        public Criteria andOption28GreaterThan(Integer value) {
            addCriterion("option28 >", value, "option28");
            return (Criteria) this;
        }

        public Criteria andOption28GreaterThanOrEqualTo(Integer value) {
            addCriterion("option28 >=", value, "option28");
            return (Criteria) this;
        }

        public Criteria andOption28LessThan(Integer value) {
            addCriterion("option28 <", value, "option28");
            return (Criteria) this;
        }

        public Criteria andOption28LessThanOrEqualTo(Integer value) {
            addCriterion("option28 <=", value, "option28");
            return (Criteria) this;
        }

        public Criteria andOption28In(List<Integer> values) {
            addCriterion("option28 in", values, "option28");
            return (Criteria) this;
        }

        public Criteria andOption28NotIn(List<Integer> values) {
            addCriterion("option28 not in", values, "option28");
            return (Criteria) this;
        }

        public Criteria andOption28Between(Integer value1, Integer value2) {
            addCriterion("option28 between", value1, value2, "option28");
            return (Criteria) this;
        }

        public Criteria andOption28NotBetween(Integer value1, Integer value2) {
            addCriterion("option28 not between", value1, value2, "option28");
            return (Criteria) this;
        }

        public Criteria andOption29IsNull() {
            addCriterion("option29 is null");
            return (Criteria) this;
        }

        public Criteria andOption29IsNotNull() {
            addCriterion("option29 is not null");
            return (Criteria) this;
        }

        public Criteria andOption29EqualTo(Integer value) {
            addCriterion("option29 =", value, "option29");
            return (Criteria) this;
        }

        public Criteria andOption29NotEqualTo(Integer value) {
            addCriterion("option29 <>", value, "option29");
            return (Criteria) this;
        }

        public Criteria andOption29GreaterThan(Integer value) {
            addCriterion("option29 >", value, "option29");
            return (Criteria) this;
        }

        public Criteria andOption29GreaterThanOrEqualTo(Integer value) {
            addCriterion("option29 >=", value, "option29");
            return (Criteria) this;
        }

        public Criteria andOption29LessThan(Integer value) {
            addCriterion("option29 <", value, "option29");
            return (Criteria) this;
        }

        public Criteria andOption29LessThanOrEqualTo(Integer value) {
            addCriterion("option29 <=", value, "option29");
            return (Criteria) this;
        }

        public Criteria andOption29In(List<Integer> values) {
            addCriterion("option29 in", values, "option29");
            return (Criteria) this;
        }

        public Criteria andOption29NotIn(List<Integer> values) {
            addCriterion("option29 not in", values, "option29");
            return (Criteria) this;
        }

        public Criteria andOption29Between(Integer value1, Integer value2) {
            addCriterion("option29 between", value1, value2, "option29");
            return (Criteria) this;
        }

        public Criteria andOption29NotBetween(Integer value1, Integer value2) {
            addCriterion("option29 not between", value1, value2, "option29");
            return (Criteria) this;
        }

        public Criteria andOption30IsNull() {
            addCriterion("option30 is null");
            return (Criteria) this;
        }

        public Criteria andOption30IsNotNull() {
            addCriterion("option30 is not null");
            return (Criteria) this;
        }

        public Criteria andOption30EqualTo(Integer value) {
            addCriterion("option30 =", value, "option30");
            return (Criteria) this;
        }

        public Criteria andOption30NotEqualTo(Integer value) {
            addCriterion("option30 <>", value, "option30");
            return (Criteria) this;
        }

        public Criteria andOption30GreaterThan(Integer value) {
            addCriterion("option30 >", value, "option30");
            return (Criteria) this;
        }

        public Criteria andOption30GreaterThanOrEqualTo(Integer value) {
            addCriterion("option30 >=", value, "option30");
            return (Criteria) this;
        }

        public Criteria andOption30LessThan(Integer value) {
            addCriterion("option30 <", value, "option30");
            return (Criteria) this;
        }

        public Criteria andOption30LessThanOrEqualTo(Integer value) {
            addCriterion("option30 <=", value, "option30");
            return (Criteria) this;
        }

        public Criteria andOption30In(List<Integer> values) {
            addCriterion("option30 in", values, "option30");
            return (Criteria) this;
        }

        public Criteria andOption30NotIn(List<Integer> values) {
            addCriterion("option30 not in", values, "option30");
            return (Criteria) this;
        }

        public Criteria andOption30Between(Integer value1, Integer value2) {
            addCriterion("option30 between", value1, value2, "option30");
            return (Criteria) this;
        }

        public Criteria andOption30NotBetween(Integer value1, Integer value2) {
            addCriterion("option30 not between", value1, value2, "option30");
            return (Criteria) this;
        }

        public Criteria andOption31IsNull() {
            addCriterion("option31 is null");
            return (Criteria) this;
        }

        public Criteria andOption31IsNotNull() {
            addCriterion("option31 is not null");
            return (Criteria) this;
        }

        public Criteria andOption31EqualTo(Integer value) {
            addCriterion("option31 =", value, "option31");
            return (Criteria) this;
        }

        public Criteria andOption31NotEqualTo(Integer value) {
            addCriterion("option31 <>", value, "option31");
            return (Criteria) this;
        }

        public Criteria andOption31GreaterThan(Integer value) {
            addCriterion("option31 >", value, "option31");
            return (Criteria) this;
        }

        public Criteria andOption31GreaterThanOrEqualTo(Integer value) {
            addCriterion("option31 >=", value, "option31");
            return (Criteria) this;
        }

        public Criteria andOption31LessThan(Integer value) {
            addCriterion("option31 <", value, "option31");
            return (Criteria) this;
        }

        public Criteria andOption31LessThanOrEqualTo(Integer value) {
            addCriterion("option31 <=", value, "option31");
            return (Criteria) this;
        }

        public Criteria andOption31In(List<Integer> values) {
            addCriterion("option31 in", values, "option31");
            return (Criteria) this;
        }

        public Criteria andOption31NotIn(List<Integer> values) {
            addCriterion("option31 not in", values, "option31");
            return (Criteria) this;
        }

        public Criteria andOption31Between(Integer value1, Integer value2) {
            addCriterion("option31 between", value1, value2, "option31");
            return (Criteria) this;
        }

        public Criteria andOption31NotBetween(Integer value1, Integer value2) {
            addCriterion("option31 not between", value1, value2, "option31");
            return (Criteria) this;
        }

        public Criteria andOption32IsNull() {
            addCriterion("option32 is null");
            return (Criteria) this;
        }

        public Criteria andOption32IsNotNull() {
            addCriterion("option32 is not null");
            return (Criteria) this;
        }

        public Criteria andOption32EqualTo(Integer value) {
            addCriterion("option32 =", value, "option32");
            return (Criteria) this;
        }

        public Criteria andOption32NotEqualTo(Integer value) {
            addCriterion("option32 <>", value, "option32");
            return (Criteria) this;
        }

        public Criteria andOption32GreaterThan(Integer value) {
            addCriterion("option32 >", value, "option32");
            return (Criteria) this;
        }

        public Criteria andOption32GreaterThanOrEqualTo(Integer value) {
            addCriterion("option32 >=", value, "option32");
            return (Criteria) this;
        }

        public Criteria andOption32LessThan(Integer value) {
            addCriterion("option32 <", value, "option32");
            return (Criteria) this;
        }

        public Criteria andOption32LessThanOrEqualTo(Integer value) {
            addCriterion("option32 <=", value, "option32");
            return (Criteria) this;
        }

        public Criteria andOption32In(List<Integer> values) {
            addCriterion("option32 in", values, "option32");
            return (Criteria) this;
        }

        public Criteria andOption32NotIn(List<Integer> values) {
            addCriterion("option32 not in", values, "option32");
            return (Criteria) this;
        }

        public Criteria andOption32Between(Integer value1, Integer value2) {
            addCriterion("option32 between", value1, value2, "option32");
            return (Criteria) this;
        }

        public Criteria andOption32NotBetween(Integer value1, Integer value2) {
            addCriterion("option32 not between", value1, value2, "option32");
            return (Criteria) this;
        }

        public Criteria andOption33IsNull() {
            addCriterion("option33 is null");
            return (Criteria) this;
        }

        public Criteria andOption33IsNotNull() {
            addCriterion("option33 is not null");
            return (Criteria) this;
        }

        public Criteria andOption33EqualTo(Integer value) {
            addCriterion("option33 =", value, "option33");
            return (Criteria) this;
        }

        public Criteria andOption33NotEqualTo(Integer value) {
            addCriterion("option33 <>", value, "option33");
            return (Criteria) this;
        }

        public Criteria andOption33GreaterThan(Integer value) {
            addCriterion("option33 >", value, "option33");
            return (Criteria) this;
        }

        public Criteria andOption33GreaterThanOrEqualTo(Integer value) {
            addCriterion("option33 >=", value, "option33");
            return (Criteria) this;
        }

        public Criteria andOption33LessThan(Integer value) {
            addCriterion("option33 <", value, "option33");
            return (Criteria) this;
        }

        public Criteria andOption33LessThanOrEqualTo(Integer value) {
            addCriterion("option33 <=", value, "option33");
            return (Criteria) this;
        }

        public Criteria andOption33In(List<Integer> values) {
            addCriterion("option33 in", values, "option33");
            return (Criteria) this;
        }

        public Criteria andOption33NotIn(List<Integer> values) {
            addCriterion("option33 not in", values, "option33");
            return (Criteria) this;
        }

        public Criteria andOption33Between(Integer value1, Integer value2) {
            addCriterion("option33 between", value1, value2, "option33");
            return (Criteria) this;
        }

        public Criteria andOption33NotBetween(Integer value1, Integer value2) {
            addCriterion("option33 not between", value1, value2, "option33");
            return (Criteria) this;
        }

        public Criteria andOption34IsNull() {
            addCriterion("option34 is null");
            return (Criteria) this;
        }

        public Criteria andOption34IsNotNull() {
            addCriterion("option34 is not null");
            return (Criteria) this;
        }

        public Criteria andOption34EqualTo(Integer value) {
            addCriterion("option34 =", value, "option34");
            return (Criteria) this;
        }

        public Criteria andOption34NotEqualTo(Integer value) {
            addCriterion("option34 <>", value, "option34");
            return (Criteria) this;
        }

        public Criteria andOption34GreaterThan(Integer value) {
            addCriterion("option34 >", value, "option34");
            return (Criteria) this;
        }

        public Criteria andOption34GreaterThanOrEqualTo(Integer value) {
            addCriterion("option34 >=", value, "option34");
            return (Criteria) this;
        }

        public Criteria andOption34LessThan(Integer value) {
            addCriterion("option34 <", value, "option34");
            return (Criteria) this;
        }

        public Criteria andOption34LessThanOrEqualTo(Integer value) {
            addCriterion("option34 <=", value, "option34");
            return (Criteria) this;
        }

        public Criteria andOption34In(List<Integer> values) {
            addCriterion("option34 in", values, "option34");
            return (Criteria) this;
        }

        public Criteria andOption34NotIn(List<Integer> values) {
            addCriterion("option34 not in", values, "option34");
            return (Criteria) this;
        }

        public Criteria andOption34Between(Integer value1, Integer value2) {
            addCriterion("option34 between", value1, value2, "option34");
            return (Criteria) this;
        }

        public Criteria andOption34NotBetween(Integer value1, Integer value2) {
            addCriterion("option34 not between", value1, value2, "option34");
            return (Criteria) this;
        }

        public Criteria andOption35IsNull() {
            addCriterion("option35 is null");
            return (Criteria) this;
        }

        public Criteria andOption35IsNotNull() {
            addCriterion("option35 is not null");
            return (Criteria) this;
        }

        public Criteria andOption35EqualTo(Integer value) {
            addCriterion("option35 =", value, "option35");
            return (Criteria) this;
        }

        public Criteria andOption35NotEqualTo(Integer value) {
            addCriterion("option35 <>", value, "option35");
            return (Criteria) this;
        }

        public Criteria andOption35GreaterThan(Integer value) {
            addCriterion("option35 >", value, "option35");
            return (Criteria) this;
        }

        public Criteria andOption35GreaterThanOrEqualTo(Integer value) {
            addCriterion("option35 >=", value, "option35");
            return (Criteria) this;
        }

        public Criteria andOption35LessThan(Integer value) {
            addCriterion("option35 <", value, "option35");
            return (Criteria) this;
        }

        public Criteria andOption35LessThanOrEqualTo(Integer value) {
            addCriterion("option35 <=", value, "option35");
            return (Criteria) this;
        }

        public Criteria andOption35In(List<Integer> values) {
            addCriterion("option35 in", values, "option35");
            return (Criteria) this;
        }

        public Criteria andOption35NotIn(List<Integer> values) {
            addCriterion("option35 not in", values, "option35");
            return (Criteria) this;
        }

        public Criteria andOption35Between(Integer value1, Integer value2) {
            addCriterion("option35 between", value1, value2, "option35");
            return (Criteria) this;
        }

        public Criteria andOption35NotBetween(Integer value1, Integer value2) {
            addCriterion("option35 not between", value1, value2, "option35");
            return (Criteria) this;
        }

        public Criteria andOption36IsNull() {
            addCriterion("option36 is null");
            return (Criteria) this;
        }

        public Criteria andOption36IsNotNull() {
            addCriterion("option36 is not null");
            return (Criteria) this;
        }

        public Criteria andOption36EqualTo(Integer value) {
            addCriterion("option36 =", value, "option36");
            return (Criteria) this;
        }

        public Criteria andOption36NotEqualTo(Integer value) {
            addCriterion("option36 <>", value, "option36");
            return (Criteria) this;
        }

        public Criteria andOption36GreaterThan(Integer value) {
            addCriterion("option36 >", value, "option36");
            return (Criteria) this;
        }

        public Criteria andOption36GreaterThanOrEqualTo(Integer value) {
            addCriterion("option36 >=", value, "option36");
            return (Criteria) this;
        }

        public Criteria andOption36LessThan(Integer value) {
            addCriterion("option36 <", value, "option36");
            return (Criteria) this;
        }

        public Criteria andOption36LessThanOrEqualTo(Integer value) {
            addCriterion("option36 <=", value, "option36");
            return (Criteria) this;
        }

        public Criteria andOption36In(List<Integer> values) {
            addCriterion("option36 in", values, "option36");
            return (Criteria) this;
        }

        public Criteria andOption36NotIn(List<Integer> values) {
            addCriterion("option36 not in", values, "option36");
            return (Criteria) this;
        }

        public Criteria andOption36Between(Integer value1, Integer value2) {
            addCriterion("option36 between", value1, value2, "option36");
            return (Criteria) this;
        }

        public Criteria andOption36NotBetween(Integer value1, Integer value2) {
            addCriterion("option36 not between", value1, value2, "option36");
            return (Criteria) this;
        }

        public Criteria andOption37IsNull() {
            addCriterion("option37 is null");
            return (Criteria) this;
        }

        public Criteria andOption37IsNotNull() {
            addCriterion("option37 is not null");
            return (Criteria) this;
        }

        public Criteria andOption37EqualTo(Integer value) {
            addCriterion("option37 =", value, "option37");
            return (Criteria) this;
        }

        public Criteria andOption37NotEqualTo(Integer value) {
            addCriterion("option37 <>", value, "option37");
            return (Criteria) this;
        }

        public Criteria andOption37GreaterThan(Integer value) {
            addCriterion("option37 >", value, "option37");
            return (Criteria) this;
        }

        public Criteria andOption37GreaterThanOrEqualTo(Integer value) {
            addCriterion("option37 >=", value, "option37");
            return (Criteria) this;
        }

        public Criteria andOption37LessThan(Integer value) {
            addCriterion("option37 <", value, "option37");
            return (Criteria) this;
        }

        public Criteria andOption37LessThanOrEqualTo(Integer value) {
            addCriterion("option37 <=", value, "option37");
            return (Criteria) this;
        }

        public Criteria andOption37In(List<Integer> values) {
            addCriterion("option37 in", values, "option37");
            return (Criteria) this;
        }

        public Criteria andOption37NotIn(List<Integer> values) {
            addCriterion("option37 not in", values, "option37");
            return (Criteria) this;
        }

        public Criteria andOption37Between(Integer value1, Integer value2) {
            addCriterion("option37 between", value1, value2, "option37");
            return (Criteria) this;
        }

        public Criteria andOption37NotBetween(Integer value1, Integer value2) {
            addCriterion("option37 not between", value1, value2, "option37");
            return (Criteria) this;
        }

        public Criteria andOption38IsNull() {
            addCriterion("option38 is null");
            return (Criteria) this;
        }

        public Criteria andOption38IsNotNull() {
            addCriterion("option38 is not null");
            return (Criteria) this;
        }

        public Criteria andOption38EqualTo(Integer value) {
            addCriterion("option38 =", value, "option38");
            return (Criteria) this;
        }

        public Criteria andOption38NotEqualTo(Integer value) {
            addCriterion("option38 <>", value, "option38");
            return (Criteria) this;
        }

        public Criteria andOption38GreaterThan(Integer value) {
            addCriterion("option38 >", value, "option38");
            return (Criteria) this;
        }

        public Criteria andOption38GreaterThanOrEqualTo(Integer value) {
            addCriterion("option38 >=", value, "option38");
            return (Criteria) this;
        }

        public Criteria andOption38LessThan(Integer value) {
            addCriterion("option38 <", value, "option38");
            return (Criteria) this;
        }

        public Criteria andOption38LessThanOrEqualTo(Integer value) {
            addCriterion("option38 <=", value, "option38");
            return (Criteria) this;
        }

        public Criteria andOption38In(List<Integer> values) {
            addCriterion("option38 in", values, "option38");
            return (Criteria) this;
        }

        public Criteria andOption38NotIn(List<Integer> values) {
            addCriterion("option38 not in", values, "option38");
            return (Criteria) this;
        }

        public Criteria andOption38Between(Integer value1, Integer value2) {
            addCriterion("option38 between", value1, value2, "option38");
            return (Criteria) this;
        }

        public Criteria andOption38NotBetween(Integer value1, Integer value2) {
            addCriterion("option38 not between", value1, value2, "option38");
            return (Criteria) this;
        }

        public Criteria andOption39IsNull() {
            addCriterion("option39 is null");
            return (Criteria) this;
        }

        public Criteria andOption39IsNotNull() {
            addCriterion("option39 is not null");
            return (Criteria) this;
        }

        public Criteria andOption39EqualTo(Integer value) {
            addCriterion("option39 =", value, "option39");
            return (Criteria) this;
        }

        public Criteria andOption39NotEqualTo(Integer value) {
            addCriterion("option39 <>", value, "option39");
            return (Criteria) this;
        }

        public Criteria andOption39GreaterThan(Integer value) {
            addCriterion("option39 >", value, "option39");
            return (Criteria) this;
        }

        public Criteria andOption39GreaterThanOrEqualTo(Integer value) {
            addCriterion("option39 >=", value, "option39");
            return (Criteria) this;
        }

        public Criteria andOption39LessThan(Integer value) {
            addCriterion("option39 <", value, "option39");
            return (Criteria) this;
        }

        public Criteria andOption39LessThanOrEqualTo(Integer value) {
            addCriterion("option39 <=", value, "option39");
            return (Criteria) this;
        }

        public Criteria andOption39In(List<Integer> values) {
            addCriterion("option39 in", values, "option39");
            return (Criteria) this;
        }

        public Criteria andOption39NotIn(List<Integer> values) {
            addCriterion("option39 not in", values, "option39");
            return (Criteria) this;
        }

        public Criteria andOption39Between(Integer value1, Integer value2) {
            addCriterion("option39 between", value1, value2, "option39");
            return (Criteria) this;
        }

        public Criteria andOption39NotBetween(Integer value1, Integer value2) {
            addCriterion("option39 not between", value1, value2, "option39");
            return (Criteria) this;
        }

        public Criteria andOption40IsNull() {
            addCriterion("option40 is null");
            return (Criteria) this;
        }

        public Criteria andOption40IsNotNull() {
            addCriterion("option40 is not null");
            return (Criteria) this;
        }

        public Criteria andOption40EqualTo(Integer value) {
            addCriterion("option40 =", value, "option40");
            return (Criteria) this;
        }

        public Criteria andOption40NotEqualTo(Integer value) {
            addCriterion("option40 <>", value, "option40");
            return (Criteria) this;
        }

        public Criteria andOption40GreaterThan(Integer value) {
            addCriterion("option40 >", value, "option40");
            return (Criteria) this;
        }

        public Criteria andOption40GreaterThanOrEqualTo(Integer value) {
            addCriterion("option40 >=", value, "option40");
            return (Criteria) this;
        }

        public Criteria andOption40LessThan(Integer value) {
            addCriterion("option40 <", value, "option40");
            return (Criteria) this;
        }

        public Criteria andOption40LessThanOrEqualTo(Integer value) {
            addCriterion("option40 <=", value, "option40");
            return (Criteria) this;
        }

        public Criteria andOption40In(List<Integer> values) {
            addCriterion("option40 in", values, "option40");
            return (Criteria) this;
        }

        public Criteria andOption40NotIn(List<Integer> values) {
            addCriterion("option40 not in", values, "option40");
            return (Criteria) this;
        }

        public Criteria andOption40Between(Integer value1, Integer value2) {
            addCriterion("option40 between", value1, value2, "option40");
            return (Criteria) this;
        }

        public Criteria andOption40NotBetween(Integer value1, Integer value2) {
            addCriterion("option40 not between", value1, value2, "option40");
            return (Criteria) this;
        }

        public Criteria andOption41IsNull() {
            addCriterion("option41 is null");
            return (Criteria) this;
        }

        public Criteria andOption41IsNotNull() {
            addCriterion("option41 is not null");
            return (Criteria) this;
        }

        public Criteria andOption41EqualTo(Integer value) {
            addCriterion("option41 =", value, "option41");
            return (Criteria) this;
        }

        public Criteria andOption41NotEqualTo(Integer value) {
            addCriterion("option41 <>", value, "option41");
            return (Criteria) this;
        }

        public Criteria andOption41GreaterThan(Integer value) {
            addCriterion("option41 >", value, "option41");
            return (Criteria) this;
        }

        public Criteria andOption41GreaterThanOrEqualTo(Integer value) {
            addCriterion("option41 >=", value, "option41");
            return (Criteria) this;
        }

        public Criteria andOption41LessThan(Integer value) {
            addCriterion("option41 <", value, "option41");
            return (Criteria) this;
        }

        public Criteria andOption41LessThanOrEqualTo(Integer value) {
            addCriterion("option41 <=", value, "option41");
            return (Criteria) this;
        }

        public Criteria andOption41In(List<Integer> values) {
            addCriterion("option41 in", values, "option41");
            return (Criteria) this;
        }

        public Criteria andOption41NotIn(List<Integer> values) {
            addCriterion("option41 not in", values, "option41");
            return (Criteria) this;
        }

        public Criteria andOption41Between(Integer value1, Integer value2) {
            addCriterion("option41 between", value1, value2, "option41");
            return (Criteria) this;
        }

        public Criteria andOption41NotBetween(Integer value1, Integer value2) {
            addCriterion("option41 not between", value1, value2, "option41");
            return (Criteria) this;
        }

        public Criteria andOption42IsNull() {
            addCriterion("option42 is null");
            return (Criteria) this;
        }

        public Criteria andOption42IsNotNull() {
            addCriterion("option42 is not null");
            return (Criteria) this;
        }

        public Criteria andOption42EqualTo(Integer value) {
            addCriterion("option42 =", value, "option42");
            return (Criteria) this;
        }

        public Criteria andOption42NotEqualTo(Integer value) {
            addCriterion("option42 <>", value, "option42");
            return (Criteria) this;
        }

        public Criteria andOption42GreaterThan(Integer value) {
            addCriterion("option42 >", value, "option42");
            return (Criteria) this;
        }

        public Criteria andOption42GreaterThanOrEqualTo(Integer value) {
            addCriterion("option42 >=", value, "option42");
            return (Criteria) this;
        }

        public Criteria andOption42LessThan(Integer value) {
            addCriterion("option42 <", value, "option42");
            return (Criteria) this;
        }

        public Criteria andOption42LessThanOrEqualTo(Integer value) {
            addCriterion("option42 <=", value, "option42");
            return (Criteria) this;
        }

        public Criteria andOption42In(List<Integer> values) {
            addCriterion("option42 in", values, "option42");
            return (Criteria) this;
        }

        public Criteria andOption42NotIn(List<Integer> values) {
            addCriterion("option42 not in", values, "option42");
            return (Criteria) this;
        }

        public Criteria andOption42Between(Integer value1, Integer value2) {
            addCriterion("option42 between", value1, value2, "option42");
            return (Criteria) this;
        }

        public Criteria andOption42NotBetween(Integer value1, Integer value2) {
            addCriterion("option42 not between", value1, value2, "option42");
            return (Criteria) this;
        }

        public Criteria andOption43IsNull() {
            addCriterion("option43 is null");
            return (Criteria) this;
        }

        public Criteria andOption43IsNotNull() {
            addCriterion("option43 is not null");
            return (Criteria) this;
        }

        public Criteria andOption43EqualTo(Integer value) {
            addCriterion("option43 =", value, "option43");
            return (Criteria) this;
        }

        public Criteria andOption43NotEqualTo(Integer value) {
            addCriterion("option43 <>", value, "option43");
            return (Criteria) this;
        }

        public Criteria andOption43GreaterThan(Integer value) {
            addCriterion("option43 >", value, "option43");
            return (Criteria) this;
        }

        public Criteria andOption43GreaterThanOrEqualTo(Integer value) {
            addCriterion("option43 >=", value, "option43");
            return (Criteria) this;
        }

        public Criteria andOption43LessThan(Integer value) {
            addCriterion("option43 <", value, "option43");
            return (Criteria) this;
        }

        public Criteria andOption43LessThanOrEqualTo(Integer value) {
            addCriterion("option43 <=", value, "option43");
            return (Criteria) this;
        }

        public Criteria andOption43In(List<Integer> values) {
            addCriterion("option43 in", values, "option43");
            return (Criteria) this;
        }

        public Criteria andOption43NotIn(List<Integer> values) {
            addCriterion("option43 not in", values, "option43");
            return (Criteria) this;
        }

        public Criteria andOption43Between(Integer value1, Integer value2) {
            addCriterion("option43 between", value1, value2, "option43");
            return (Criteria) this;
        }

        public Criteria andOption43NotBetween(Integer value1, Integer value2) {
            addCriterion("option43 not between", value1, value2, "option43");
            return (Criteria) this;
        }

        public Criteria andOption44IsNull() {
            addCriterion("option44 is null");
            return (Criteria) this;
        }

        public Criteria andOption44IsNotNull() {
            addCriterion("option44 is not null");
            return (Criteria) this;
        }

        public Criteria andOption44EqualTo(Integer value) {
            addCriterion("option44 =", value, "option44");
            return (Criteria) this;
        }

        public Criteria andOption44NotEqualTo(Integer value) {
            addCriterion("option44 <>", value, "option44");
            return (Criteria) this;
        }

        public Criteria andOption44GreaterThan(Integer value) {
            addCriterion("option44 >", value, "option44");
            return (Criteria) this;
        }

        public Criteria andOption44GreaterThanOrEqualTo(Integer value) {
            addCriterion("option44 >=", value, "option44");
            return (Criteria) this;
        }

        public Criteria andOption44LessThan(Integer value) {
            addCriterion("option44 <", value, "option44");
            return (Criteria) this;
        }

        public Criteria andOption44LessThanOrEqualTo(Integer value) {
            addCriterion("option44 <=", value, "option44");
            return (Criteria) this;
        }

        public Criteria andOption44In(List<Integer> values) {
            addCriterion("option44 in", values, "option44");
            return (Criteria) this;
        }

        public Criteria andOption44NotIn(List<Integer> values) {
            addCriterion("option44 not in", values, "option44");
            return (Criteria) this;
        }

        public Criteria andOption44Between(Integer value1, Integer value2) {
            addCriterion("option44 between", value1, value2, "option44");
            return (Criteria) this;
        }

        public Criteria andOption44NotBetween(Integer value1, Integer value2) {
            addCriterion("option44 not between", value1, value2, "option44");
            return (Criteria) this;
        }

        public Criteria andOption45IsNull() {
            addCriterion("option45 is null");
            return (Criteria) this;
        }

        public Criteria andOption45IsNotNull() {
            addCriterion("option45 is not null");
            return (Criteria) this;
        }

        public Criteria andOption45EqualTo(Integer value) {
            addCriterion("option45 =", value, "option45");
            return (Criteria) this;
        }

        public Criteria andOption45NotEqualTo(Integer value) {
            addCriterion("option45 <>", value, "option45");
            return (Criteria) this;
        }

        public Criteria andOption45GreaterThan(Integer value) {
            addCriterion("option45 >", value, "option45");
            return (Criteria) this;
        }

        public Criteria andOption45GreaterThanOrEqualTo(Integer value) {
            addCriterion("option45 >=", value, "option45");
            return (Criteria) this;
        }

        public Criteria andOption45LessThan(Integer value) {
            addCriterion("option45 <", value, "option45");
            return (Criteria) this;
        }

        public Criteria andOption45LessThanOrEqualTo(Integer value) {
            addCriterion("option45 <=", value, "option45");
            return (Criteria) this;
        }

        public Criteria andOption45In(List<Integer> values) {
            addCriterion("option45 in", values, "option45");
            return (Criteria) this;
        }

        public Criteria andOption45NotIn(List<Integer> values) {
            addCriterion("option45 not in", values, "option45");
            return (Criteria) this;
        }

        public Criteria andOption45Between(Integer value1, Integer value2) {
            addCriterion("option45 between", value1, value2, "option45");
            return (Criteria) this;
        }

        public Criteria andOption45NotBetween(Integer value1, Integer value2) {
            addCriterion("option45 not between", value1, value2, "option45");
            return (Criteria) this;
        }

        public Criteria andOption46IsNull() {
            addCriterion("option46 is null");
            return (Criteria) this;
        }

        public Criteria andOption46IsNotNull() {
            addCriterion("option46 is not null");
            return (Criteria) this;
        }

        public Criteria andOption46EqualTo(Integer value) {
            addCriterion("option46 =", value, "option46");
            return (Criteria) this;
        }

        public Criteria andOption46NotEqualTo(Integer value) {
            addCriterion("option46 <>", value, "option46");
            return (Criteria) this;
        }

        public Criteria andOption46GreaterThan(Integer value) {
            addCriterion("option46 >", value, "option46");
            return (Criteria) this;
        }

        public Criteria andOption46GreaterThanOrEqualTo(Integer value) {
            addCriterion("option46 >=", value, "option46");
            return (Criteria) this;
        }

        public Criteria andOption46LessThan(Integer value) {
            addCriterion("option46 <", value, "option46");
            return (Criteria) this;
        }

        public Criteria andOption46LessThanOrEqualTo(Integer value) {
            addCriterion("option46 <=", value, "option46");
            return (Criteria) this;
        }

        public Criteria andOption46In(List<Integer> values) {
            addCriterion("option46 in", values, "option46");
            return (Criteria) this;
        }

        public Criteria andOption46NotIn(List<Integer> values) {
            addCriterion("option46 not in", values, "option46");
            return (Criteria) this;
        }

        public Criteria andOption46Between(Integer value1, Integer value2) {
            addCriterion("option46 between", value1, value2, "option46");
            return (Criteria) this;
        }

        public Criteria andOption46NotBetween(Integer value1, Integer value2) {
            addCriterion("option46 not between", value1, value2, "option46");
            return (Criteria) this;
        }

        public Criteria andOption47IsNull() {
            addCriterion("option47 is null");
            return (Criteria) this;
        }

        public Criteria andOption47IsNotNull() {
            addCriterion("option47 is not null");
            return (Criteria) this;
        }

        public Criteria andOption47EqualTo(Integer value) {
            addCriterion("option47 =", value, "option47");
            return (Criteria) this;
        }

        public Criteria andOption47NotEqualTo(Integer value) {
            addCriterion("option47 <>", value, "option47");
            return (Criteria) this;
        }

        public Criteria andOption47GreaterThan(Integer value) {
            addCriterion("option47 >", value, "option47");
            return (Criteria) this;
        }

        public Criteria andOption47GreaterThanOrEqualTo(Integer value) {
            addCriterion("option47 >=", value, "option47");
            return (Criteria) this;
        }

        public Criteria andOption47LessThan(Integer value) {
            addCriterion("option47 <", value, "option47");
            return (Criteria) this;
        }

        public Criteria andOption47LessThanOrEqualTo(Integer value) {
            addCriterion("option47 <=", value, "option47");
            return (Criteria) this;
        }

        public Criteria andOption47In(List<Integer> values) {
            addCriterion("option47 in", values, "option47");
            return (Criteria) this;
        }

        public Criteria andOption47NotIn(List<Integer> values) {
            addCriterion("option47 not in", values, "option47");
            return (Criteria) this;
        }

        public Criteria andOption47Between(Integer value1, Integer value2) {
            addCriterion("option47 between", value1, value2, "option47");
            return (Criteria) this;
        }

        public Criteria andOption47NotBetween(Integer value1, Integer value2) {
            addCriterion("option47 not between", value1, value2, "option47");
            return (Criteria) this;
        }

        public Criteria andOption48IsNull() {
            addCriterion("option48 is null");
            return (Criteria) this;
        }

        public Criteria andOption48IsNotNull() {
            addCriterion("option48 is not null");
            return (Criteria) this;
        }

        public Criteria andOption48EqualTo(Integer value) {
            addCriterion("option48 =", value, "option48");
            return (Criteria) this;
        }

        public Criteria andOption48NotEqualTo(Integer value) {
            addCriterion("option48 <>", value, "option48");
            return (Criteria) this;
        }

        public Criteria andOption48GreaterThan(Integer value) {
            addCriterion("option48 >", value, "option48");
            return (Criteria) this;
        }

        public Criteria andOption48GreaterThanOrEqualTo(Integer value) {
            addCriterion("option48 >=", value, "option48");
            return (Criteria) this;
        }

        public Criteria andOption48LessThan(Integer value) {
            addCriterion("option48 <", value, "option48");
            return (Criteria) this;
        }

        public Criteria andOption48LessThanOrEqualTo(Integer value) {
            addCriterion("option48 <=", value, "option48");
            return (Criteria) this;
        }

        public Criteria andOption48In(List<Integer> values) {
            addCriterion("option48 in", values, "option48");
            return (Criteria) this;
        }

        public Criteria andOption48NotIn(List<Integer> values) {
            addCriterion("option48 not in", values, "option48");
            return (Criteria) this;
        }

        public Criteria andOption48Between(Integer value1, Integer value2) {
            addCriterion("option48 between", value1, value2, "option48");
            return (Criteria) this;
        }

        public Criteria andOption48NotBetween(Integer value1, Integer value2) {
            addCriterion("option48 not between", value1, value2, "option48");
            return (Criteria) this;
        }

        public Criteria andOption49IsNull() {
            addCriterion("option49 is null");
            return (Criteria) this;
        }

        public Criteria andOption49IsNotNull() {
            addCriterion("option49 is not null");
            return (Criteria) this;
        }

        public Criteria andOption49EqualTo(Integer value) {
            addCriterion("option49 =", value, "option49");
            return (Criteria) this;
        }

        public Criteria andOption49NotEqualTo(Integer value) {
            addCriterion("option49 <>", value, "option49");
            return (Criteria) this;
        }

        public Criteria andOption49GreaterThan(Integer value) {
            addCriterion("option49 >", value, "option49");
            return (Criteria) this;
        }

        public Criteria andOption49GreaterThanOrEqualTo(Integer value) {
            addCriterion("option49 >=", value, "option49");
            return (Criteria) this;
        }

        public Criteria andOption49LessThan(Integer value) {
            addCriterion("option49 <", value, "option49");
            return (Criteria) this;
        }

        public Criteria andOption49LessThanOrEqualTo(Integer value) {
            addCriterion("option49 <=", value, "option49");
            return (Criteria) this;
        }

        public Criteria andOption49In(List<Integer> values) {
            addCriterion("option49 in", values, "option49");
            return (Criteria) this;
        }

        public Criteria andOption49NotIn(List<Integer> values) {
            addCriterion("option49 not in", values, "option49");
            return (Criteria) this;
        }

        public Criteria andOption49Between(Integer value1, Integer value2) {
            addCriterion("option49 between", value1, value2, "option49");
            return (Criteria) this;
        }

        public Criteria andOption49NotBetween(Integer value1, Integer value2) {
            addCriterion("option49 not between", value1, value2, "option49");
            return (Criteria) this;
        }

        public Criteria andOption50IsNull() {
            addCriterion("option50 is null");
            return (Criteria) this;
        }

        public Criteria andOption50IsNotNull() {
            addCriterion("option50 is not null");
            return (Criteria) this;
        }

        public Criteria andOption50EqualTo(Integer value) {
            addCriterion("option50 =", value, "option50");
            return (Criteria) this;
        }

        public Criteria andOption50NotEqualTo(Integer value) {
            addCriterion("option50 <>", value, "option50");
            return (Criteria) this;
        }

        public Criteria andOption50GreaterThan(Integer value) {
            addCriterion("option50 >", value, "option50");
            return (Criteria) this;
        }

        public Criteria andOption50GreaterThanOrEqualTo(Integer value) {
            addCriterion("option50 >=", value, "option50");
            return (Criteria) this;
        }

        public Criteria andOption50LessThan(Integer value) {
            addCriterion("option50 <", value, "option50");
            return (Criteria) this;
        }

        public Criteria andOption50LessThanOrEqualTo(Integer value) {
            addCriterion("option50 <=", value, "option50");
            return (Criteria) this;
        }

        public Criteria andOption50In(List<Integer> values) {
            addCriterion("option50 in", values, "option50");
            return (Criteria) this;
        }

        public Criteria andOption50NotIn(List<Integer> values) {
            addCriterion("option50 not in", values, "option50");
            return (Criteria) this;
        }

        public Criteria andOption50Between(Integer value1, Integer value2) {
            addCriterion("option50 between", value1, value2, "option50");
            return (Criteria) this;
        }

        public Criteria andOption50NotBetween(Integer value1, Integer value2) {
            addCriterion("option50 not between", value1, value2, "option50");
            return (Criteria) this;
        }

        public Criteria andOption51IsNull() {
            addCriterion("option51 is null");
            return (Criteria) this;
        }

        public Criteria andOption51IsNotNull() {
            addCriterion("option51 is not null");
            return (Criteria) this;
        }

        public Criteria andOption51EqualTo(Integer value) {
            addCriterion("option51 =", value, "option51");
            return (Criteria) this;
        }

        public Criteria andOption51NotEqualTo(Integer value) {
            addCriterion("option51 <>", value, "option51");
            return (Criteria) this;
        }

        public Criteria andOption51GreaterThan(Integer value) {
            addCriterion("option51 >", value, "option51");
            return (Criteria) this;
        }

        public Criteria andOption51GreaterThanOrEqualTo(Integer value) {
            addCriterion("option51 >=", value, "option51");
            return (Criteria) this;
        }

        public Criteria andOption51LessThan(Integer value) {
            addCriterion("option51 <", value, "option51");
            return (Criteria) this;
        }

        public Criteria andOption51LessThanOrEqualTo(Integer value) {
            addCriterion("option51 <=", value, "option51");
            return (Criteria) this;
        }

        public Criteria andOption51In(List<Integer> values) {
            addCriterion("option51 in", values, "option51");
            return (Criteria) this;
        }

        public Criteria andOption51NotIn(List<Integer> values) {
            addCriterion("option51 not in", values, "option51");
            return (Criteria) this;
        }

        public Criteria andOption51Between(Integer value1, Integer value2) {
            addCriterion("option51 between", value1, value2, "option51");
            return (Criteria) this;
        }

        public Criteria andOption51NotBetween(Integer value1, Integer value2) {
            addCriterion("option51 not between", value1, value2, "option51");
            return (Criteria) this;
        }

        public Criteria andOption52IsNull() {
            addCriterion("option52 is null");
            return (Criteria) this;
        }

        public Criteria andOption52IsNotNull() {
            addCriterion("option52 is not null");
            return (Criteria) this;
        }

        public Criteria andOption52EqualTo(Integer value) {
            addCriterion("option52 =", value, "option52");
            return (Criteria) this;
        }

        public Criteria andOption52NotEqualTo(Integer value) {
            addCriterion("option52 <>", value, "option52");
            return (Criteria) this;
        }

        public Criteria andOption52GreaterThan(Integer value) {
            addCriterion("option52 >", value, "option52");
            return (Criteria) this;
        }

        public Criteria andOption52GreaterThanOrEqualTo(Integer value) {
            addCriterion("option52 >=", value, "option52");
            return (Criteria) this;
        }

        public Criteria andOption52LessThan(Integer value) {
            addCriterion("option52 <", value, "option52");
            return (Criteria) this;
        }

        public Criteria andOption52LessThanOrEqualTo(Integer value) {
            addCriterion("option52 <=", value, "option52");
            return (Criteria) this;
        }

        public Criteria andOption52In(List<Integer> values) {
            addCriterion("option52 in", values, "option52");
            return (Criteria) this;
        }

        public Criteria andOption52NotIn(List<Integer> values) {
            addCriterion("option52 not in", values, "option52");
            return (Criteria) this;
        }

        public Criteria andOption52Between(Integer value1, Integer value2) {
            addCriterion("option52 between", value1, value2, "option52");
            return (Criteria) this;
        }

        public Criteria andOption52NotBetween(Integer value1, Integer value2) {
            addCriterion("option52 not between", value1, value2, "option52");
            return (Criteria) this;
        }

        public Criteria andOption53IsNull() {
            addCriterion("option53 is null");
            return (Criteria) this;
        }

        public Criteria andOption53IsNotNull() {
            addCriterion("option53 is not null");
            return (Criteria) this;
        }

        public Criteria andOption53EqualTo(Integer value) {
            addCriterion("option53 =", value, "option53");
            return (Criteria) this;
        }

        public Criteria andOption53NotEqualTo(Integer value) {
            addCriterion("option53 <>", value, "option53");
            return (Criteria) this;
        }

        public Criteria andOption53GreaterThan(Integer value) {
            addCriterion("option53 >", value, "option53");
            return (Criteria) this;
        }

        public Criteria andOption53GreaterThanOrEqualTo(Integer value) {
            addCriterion("option53 >=", value, "option53");
            return (Criteria) this;
        }

        public Criteria andOption53LessThan(Integer value) {
            addCriterion("option53 <", value, "option53");
            return (Criteria) this;
        }

        public Criteria andOption53LessThanOrEqualTo(Integer value) {
            addCriterion("option53 <=", value, "option53");
            return (Criteria) this;
        }

        public Criteria andOption53In(List<Integer> values) {
            addCriterion("option53 in", values, "option53");
            return (Criteria) this;
        }

        public Criteria andOption53NotIn(List<Integer> values) {
            addCriterion("option53 not in", values, "option53");
            return (Criteria) this;
        }

        public Criteria andOption53Between(Integer value1, Integer value2) {
            addCriterion("option53 between", value1, value2, "option53");
            return (Criteria) this;
        }

        public Criteria andOption53NotBetween(Integer value1, Integer value2) {
            addCriterion("option53 not between", value1, value2, "option53");
            return (Criteria) this;
        }

        public Criteria andOption54IsNull() {
            addCriterion("option54 is null");
            return (Criteria) this;
        }

        public Criteria andOption54IsNotNull() {
            addCriterion("option54 is not null");
            return (Criteria) this;
        }

        public Criteria andOption54EqualTo(Integer value) {
            addCriterion("option54 =", value, "option54");
            return (Criteria) this;
        }

        public Criteria andOption54NotEqualTo(Integer value) {
            addCriterion("option54 <>", value, "option54");
            return (Criteria) this;
        }

        public Criteria andOption54GreaterThan(Integer value) {
            addCriterion("option54 >", value, "option54");
            return (Criteria) this;
        }

        public Criteria andOption54GreaterThanOrEqualTo(Integer value) {
            addCriterion("option54 >=", value, "option54");
            return (Criteria) this;
        }

        public Criteria andOption54LessThan(Integer value) {
            addCriterion("option54 <", value, "option54");
            return (Criteria) this;
        }

        public Criteria andOption54LessThanOrEqualTo(Integer value) {
            addCriterion("option54 <=", value, "option54");
            return (Criteria) this;
        }

        public Criteria andOption54In(List<Integer> values) {
            addCriterion("option54 in", values, "option54");
            return (Criteria) this;
        }

        public Criteria andOption54NotIn(List<Integer> values) {
            addCriterion("option54 not in", values, "option54");
            return (Criteria) this;
        }

        public Criteria andOption54Between(Integer value1, Integer value2) {
            addCriterion("option54 between", value1, value2, "option54");
            return (Criteria) this;
        }

        public Criteria andOption54NotBetween(Integer value1, Integer value2) {
            addCriterion("option54 not between", value1, value2, "option54");
            return (Criteria) this;
        }

        public Criteria andOption55IsNull() {
            addCriterion("option55 is null");
            return (Criteria) this;
        }

        public Criteria andOption55IsNotNull() {
            addCriterion("option55 is not null");
            return (Criteria) this;
        }

        public Criteria andOption55EqualTo(Integer value) {
            addCriterion("option55 =", value, "option55");
            return (Criteria) this;
        }

        public Criteria andOption55NotEqualTo(Integer value) {
            addCriterion("option55 <>", value, "option55");
            return (Criteria) this;
        }

        public Criteria andOption55GreaterThan(Integer value) {
            addCriterion("option55 >", value, "option55");
            return (Criteria) this;
        }

        public Criteria andOption55GreaterThanOrEqualTo(Integer value) {
            addCriterion("option55 >=", value, "option55");
            return (Criteria) this;
        }

        public Criteria andOption55LessThan(Integer value) {
            addCriterion("option55 <", value, "option55");
            return (Criteria) this;
        }

        public Criteria andOption55LessThanOrEqualTo(Integer value) {
            addCriterion("option55 <=", value, "option55");
            return (Criteria) this;
        }

        public Criteria andOption55In(List<Integer> values) {
            addCriterion("option55 in", values, "option55");
            return (Criteria) this;
        }

        public Criteria andOption55NotIn(List<Integer> values) {
            addCriterion("option55 not in", values, "option55");
            return (Criteria) this;
        }

        public Criteria andOption55Between(Integer value1, Integer value2) {
            addCriterion("option55 between", value1, value2, "option55");
            return (Criteria) this;
        }

        public Criteria andOption55NotBetween(Integer value1, Integer value2) {
            addCriterion("option55 not between", value1, value2, "option55");
            return (Criteria) this;
        }

        public Criteria andOption56IsNull() {
            addCriterion("option56 is null");
            return (Criteria) this;
        }

        public Criteria andOption56IsNotNull() {
            addCriterion("option56 is not null");
            return (Criteria) this;
        }

        public Criteria andOption56EqualTo(Integer value) {
            addCriterion("option56 =", value, "option56");
            return (Criteria) this;
        }

        public Criteria andOption56NotEqualTo(Integer value) {
            addCriterion("option56 <>", value, "option56");
            return (Criteria) this;
        }

        public Criteria andOption56GreaterThan(Integer value) {
            addCriterion("option56 >", value, "option56");
            return (Criteria) this;
        }

        public Criteria andOption56GreaterThanOrEqualTo(Integer value) {
            addCriterion("option56 >=", value, "option56");
            return (Criteria) this;
        }

        public Criteria andOption56LessThan(Integer value) {
            addCriterion("option56 <", value, "option56");
            return (Criteria) this;
        }

        public Criteria andOption56LessThanOrEqualTo(Integer value) {
            addCriterion("option56 <=", value, "option56");
            return (Criteria) this;
        }

        public Criteria andOption56In(List<Integer> values) {
            addCriterion("option56 in", values, "option56");
            return (Criteria) this;
        }

        public Criteria andOption56NotIn(List<Integer> values) {
            addCriterion("option56 not in", values, "option56");
            return (Criteria) this;
        }

        public Criteria andOption56Between(Integer value1, Integer value2) {
            addCriterion("option56 between", value1, value2, "option56");
            return (Criteria) this;
        }

        public Criteria andOption56NotBetween(Integer value1, Integer value2) {
            addCriterion("option56 not between", value1, value2, "option56");
            return (Criteria) this;
        }

        public Criteria andOption57IsNull() {
            addCriterion("option57 is null");
            return (Criteria) this;
        }

        public Criteria andOption57IsNotNull() {
            addCriterion("option57 is not null");
            return (Criteria) this;
        }

        public Criteria andOption57EqualTo(Integer value) {
            addCriterion("option57 =", value, "option57");
            return (Criteria) this;
        }

        public Criteria andOption57NotEqualTo(Integer value) {
            addCriterion("option57 <>", value, "option57");
            return (Criteria) this;
        }

        public Criteria andOption57GreaterThan(Integer value) {
            addCriterion("option57 >", value, "option57");
            return (Criteria) this;
        }

        public Criteria andOption57GreaterThanOrEqualTo(Integer value) {
            addCriterion("option57 >=", value, "option57");
            return (Criteria) this;
        }

        public Criteria andOption57LessThan(Integer value) {
            addCriterion("option57 <", value, "option57");
            return (Criteria) this;
        }

        public Criteria andOption57LessThanOrEqualTo(Integer value) {
            addCriterion("option57 <=", value, "option57");
            return (Criteria) this;
        }

        public Criteria andOption57In(List<Integer> values) {
            addCriterion("option57 in", values, "option57");
            return (Criteria) this;
        }

        public Criteria andOption57NotIn(List<Integer> values) {
            addCriterion("option57 not in", values, "option57");
            return (Criteria) this;
        }

        public Criteria andOption57Between(Integer value1, Integer value2) {
            addCriterion("option57 between", value1, value2, "option57");
            return (Criteria) this;
        }

        public Criteria andOption57NotBetween(Integer value1, Integer value2) {
            addCriterion("option57 not between", value1, value2, "option57");
            return (Criteria) this;
        }

        public Criteria andFrasumIsNull() {
            addCriterion("frasum is null");
            return (Criteria) this;
        }

        public Criteria andFrasumIsNotNull() {
            addCriterion("frasum is not null");
            return (Criteria) this;
        }

        public Criteria andFrasumEqualTo(Integer value) {
            addCriterion("frasum =", value, "frasum");
            return (Criteria) this;
        }

        public Criteria andFrasumNotEqualTo(Integer value) {
            addCriterion("frasum <>", value, "frasum");
            return (Criteria) this;
        }

        public Criteria andFrasumGreaterThan(Integer value) {
            addCriterion("frasum >", value, "frasum");
            return (Criteria) this;
        }

        public Criteria andFrasumGreaterThanOrEqualTo(Integer value) {
            addCriterion("frasum >=", value, "frasum");
            return (Criteria) this;
        }

        public Criteria andFrasumLessThan(Integer value) {
            addCriterion("frasum <", value, "frasum");
            return (Criteria) this;
        }

        public Criteria andFrasumLessThanOrEqualTo(Integer value) {
            addCriterion("frasum <=", value, "frasum");
            return (Criteria) this;
        }

        public Criteria andFrasumIn(List<Integer> values) {
            addCriterion("frasum in", values, "frasum");
            return (Criteria) this;
        }

        public Criteria andFrasumNotIn(List<Integer> values) {
            addCriterion("frasum not in", values, "frasum");
            return (Criteria) this;
        }

        public Criteria andFrasumBetween(Integer value1, Integer value2) {
            addCriterion("frasum between", value1, value2, "frasum");
            return (Criteria) this;
        }

        public Criteria andFrasumNotBetween(Integer value1, Integer value2) {
            addCriterion("frasum not between", value1, value2, "frasum");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Integer value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Integer value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Integer value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Integer value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Integer value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Integer> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Integer> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Integer value1, Integer value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
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