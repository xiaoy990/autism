package com.join.autism.entity.HzhFamily;

import java.util.ArrayList;
import java.util.List;

public class HzhFamilyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HzhFamilyExample() {
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

        public Criteria andMotherageIsNull() {
            addCriterion("motherage is null");
            return (Criteria) this;
        }

        public Criteria andMotherageIsNotNull() {
            addCriterion("motherage is not null");
            return (Criteria) this;
        }

        public Criteria andMotherageEqualTo(Integer value) {
            addCriterion("motherage =", value, "motherage");
            return (Criteria) this;
        }

        public Criteria andMotherageNotEqualTo(Integer value) {
            addCriterion("motherage <>", value, "motherage");
            return (Criteria) this;
        }

        public Criteria andMotherageGreaterThan(Integer value) {
            addCriterion("motherage >", value, "motherage");
            return (Criteria) this;
        }

        public Criteria andMotherageGreaterThanOrEqualTo(Integer value) {
            addCriterion("motherage >=", value, "motherage");
            return (Criteria) this;
        }

        public Criteria andMotherageLessThan(Integer value) {
            addCriterion("motherage <", value, "motherage");
            return (Criteria) this;
        }

        public Criteria andMotherageLessThanOrEqualTo(Integer value) {
            addCriterion("motherage <=", value, "motherage");
            return (Criteria) this;
        }

        public Criteria andMotherageIn(List<Integer> values) {
            addCriterion("motherage in", values, "motherage");
            return (Criteria) this;
        }

        public Criteria andMotherageNotIn(List<Integer> values) {
            addCriterion("motherage not in", values, "motherage");
            return (Criteria) this;
        }

        public Criteria andMotherageBetween(Integer value1, Integer value2) {
            addCriterion("motherage between", value1, value2, "motherage");
            return (Criteria) this;
        }

        public Criteria andMotherageNotBetween(Integer value1, Integer value2) {
            addCriterion("motherage not between", value1, value2, "motherage");
            return (Criteria) this;
        }

        public Criteria andFatherageIsNull() {
            addCriterion("fatherage is null");
            return (Criteria) this;
        }

        public Criteria andFatherageIsNotNull() {
            addCriterion("fatherage is not null");
            return (Criteria) this;
        }

        public Criteria andFatherageEqualTo(Integer value) {
            addCriterion("fatherage =", value, "fatherage");
            return (Criteria) this;
        }

        public Criteria andFatherageNotEqualTo(Integer value) {
            addCriterion("fatherage <>", value, "fatherage");
            return (Criteria) this;
        }

        public Criteria andFatherageGreaterThan(Integer value) {
            addCriterion("fatherage >", value, "fatherage");
            return (Criteria) this;
        }

        public Criteria andFatherageGreaterThanOrEqualTo(Integer value) {
            addCriterion("fatherage >=", value, "fatherage");
            return (Criteria) this;
        }

        public Criteria andFatherageLessThan(Integer value) {
            addCriterion("fatherage <", value, "fatherage");
            return (Criteria) this;
        }

        public Criteria andFatherageLessThanOrEqualTo(Integer value) {
            addCriterion("fatherage <=", value, "fatherage");
            return (Criteria) this;
        }

        public Criteria andFatherageIn(List<Integer> values) {
            addCriterion("fatherage in", values, "fatherage");
            return (Criteria) this;
        }

        public Criteria andFatherageNotIn(List<Integer> values) {
            addCriterion("fatherage not in", values, "fatherage");
            return (Criteria) this;
        }

        public Criteria andFatherageBetween(Integer value1, Integer value2) {
            addCriterion("fatherage between", value1, value2, "fatherage");
            return (Criteria) this;
        }

        public Criteria andFatherageNotBetween(Integer value1, Integer value2) {
            addCriterion("fatherage not between", value1, value2, "fatherage");
            return (Criteria) this;
        }

        public Criteria andMomcultureIsNull() {
            addCriterion("momculture is null");
            return (Criteria) this;
        }

        public Criteria andMomcultureIsNotNull() {
            addCriterion("momculture is not null");
            return (Criteria) this;
        }

        public Criteria andMomcultureEqualTo(String value) {
            addCriterion("momculture =", value, "momculture");
            return (Criteria) this;
        }

        public Criteria andMomcultureNotEqualTo(String value) {
            addCriterion("momculture <>", value, "momculture");
            return (Criteria) this;
        }

        public Criteria andMomcultureGreaterThan(String value) {
            addCriterion("momculture >", value, "momculture");
            return (Criteria) this;
        }

        public Criteria andMomcultureGreaterThanOrEqualTo(String value) {
            addCriterion("momculture >=", value, "momculture");
            return (Criteria) this;
        }

        public Criteria andMomcultureLessThan(String value) {
            addCriterion("momculture <", value, "momculture");
            return (Criteria) this;
        }

        public Criteria andMomcultureLessThanOrEqualTo(String value) {
            addCriterion("momculture <=", value, "momculture");
            return (Criteria) this;
        }

        public Criteria andMomcultureLike(String value) {
            addCriterion("momculture like", value, "momculture");
            return (Criteria) this;
        }

        public Criteria andMomcultureNotLike(String value) {
            addCriterion("momculture not like", value, "momculture");
            return (Criteria) this;
        }

        public Criteria andMomcultureIn(List<String> values) {
            addCriterion("momculture in", values, "momculture");
            return (Criteria) this;
        }

        public Criteria andMomcultureNotIn(List<String> values) {
            addCriterion("momculture not in", values, "momculture");
            return (Criteria) this;
        }

        public Criteria andMomcultureBetween(String value1, String value2) {
            addCriterion("momculture between", value1, value2, "momculture");
            return (Criteria) this;
        }

        public Criteria andMomcultureNotBetween(String value1, String value2) {
            addCriterion("momculture not between", value1, value2, "momculture");
            return (Criteria) this;
        }

        public Criteria andDadcultureIsNull() {
            addCriterion("dadculture is null");
            return (Criteria) this;
        }

        public Criteria andDadcultureIsNotNull() {
            addCriterion("dadculture is not null");
            return (Criteria) this;
        }

        public Criteria andDadcultureEqualTo(String value) {
            addCriterion("dadculture =", value, "dadculture");
            return (Criteria) this;
        }

        public Criteria andDadcultureNotEqualTo(String value) {
            addCriterion("dadculture <>", value, "dadculture");
            return (Criteria) this;
        }

        public Criteria andDadcultureGreaterThan(String value) {
            addCriterion("dadculture >", value, "dadculture");
            return (Criteria) this;
        }

        public Criteria andDadcultureGreaterThanOrEqualTo(String value) {
            addCriterion("dadculture >=", value, "dadculture");
            return (Criteria) this;
        }

        public Criteria andDadcultureLessThan(String value) {
            addCriterion("dadculture <", value, "dadculture");
            return (Criteria) this;
        }

        public Criteria andDadcultureLessThanOrEqualTo(String value) {
            addCriterion("dadculture <=", value, "dadculture");
            return (Criteria) this;
        }

        public Criteria andDadcultureLike(String value) {
            addCriterion("dadculture like", value, "dadculture");
            return (Criteria) this;
        }

        public Criteria andDadcultureNotLike(String value) {
            addCriterion("dadculture not like", value, "dadculture");
            return (Criteria) this;
        }

        public Criteria andDadcultureIn(List<String> values) {
            addCriterion("dadculture in", values, "dadculture");
            return (Criteria) this;
        }

        public Criteria andDadcultureNotIn(List<String> values) {
            addCriterion("dadculture not in", values, "dadculture");
            return (Criteria) this;
        }

        public Criteria andDadcultureBetween(String value1, String value2) {
            addCriterion("dadculture between", value1, value2, "dadculture");
            return (Criteria) this;
        }

        public Criteria andDadcultureNotBetween(String value1, String value2) {
            addCriterion("dadculture not between", value1, value2, "dadculture");
            return (Criteria) this;
        }

        public Criteria andMomprossIsNull() {
            addCriterion("mompross is null");
            return (Criteria) this;
        }

        public Criteria andMomprossIsNotNull() {
            addCriterion("mompross is not null");
            return (Criteria) this;
        }

        public Criteria andMomprossEqualTo(String value) {
            addCriterion("mompross =", value, "mompross");
            return (Criteria) this;
        }

        public Criteria andMomprossNotEqualTo(String value) {
            addCriterion("mompross <>", value, "mompross");
            return (Criteria) this;
        }

        public Criteria andMomprossGreaterThan(String value) {
            addCriterion("mompross >", value, "mompross");
            return (Criteria) this;
        }

        public Criteria andMomprossGreaterThanOrEqualTo(String value) {
            addCriterion("mompross >=", value, "mompross");
            return (Criteria) this;
        }

        public Criteria andMomprossLessThan(String value) {
            addCriterion("mompross <", value, "mompross");
            return (Criteria) this;
        }

        public Criteria andMomprossLessThanOrEqualTo(String value) {
            addCriterion("mompross <=", value, "mompross");
            return (Criteria) this;
        }

        public Criteria andMomprossLike(String value) {
            addCriterion("mompross like", value, "mompross");
            return (Criteria) this;
        }

        public Criteria andMomprossNotLike(String value) {
            addCriterion("mompross not like", value, "mompross");
            return (Criteria) this;
        }

        public Criteria andMomprossIn(List<String> values) {
            addCriterion("mompross in", values, "mompross");
            return (Criteria) this;
        }

        public Criteria andMomprossNotIn(List<String> values) {
            addCriterion("mompross not in", values, "mompross");
            return (Criteria) this;
        }

        public Criteria andMomprossBetween(String value1, String value2) {
            addCriterion("mompross between", value1, value2, "mompross");
            return (Criteria) this;
        }

        public Criteria andMomprossNotBetween(String value1, String value2) {
            addCriterion("mompross not between", value1, value2, "mompross");
            return (Criteria) this;
        }

        public Criteria andDadprossIsNull() {
            addCriterion("dadpross is null");
            return (Criteria) this;
        }

        public Criteria andDadprossIsNotNull() {
            addCriterion("dadpross is not null");
            return (Criteria) this;
        }

        public Criteria andDadprossEqualTo(String value) {
            addCriterion("dadpross =", value, "dadpross");
            return (Criteria) this;
        }

        public Criteria andDadprossNotEqualTo(String value) {
            addCriterion("dadpross <>", value, "dadpross");
            return (Criteria) this;
        }

        public Criteria andDadprossGreaterThan(String value) {
            addCriterion("dadpross >", value, "dadpross");
            return (Criteria) this;
        }

        public Criteria andDadprossGreaterThanOrEqualTo(String value) {
            addCriterion("dadpross >=", value, "dadpross");
            return (Criteria) this;
        }

        public Criteria andDadprossLessThan(String value) {
            addCriterion("dadpross <", value, "dadpross");
            return (Criteria) this;
        }

        public Criteria andDadprossLessThanOrEqualTo(String value) {
            addCriterion("dadpross <=", value, "dadpross");
            return (Criteria) this;
        }

        public Criteria andDadprossLike(String value) {
            addCriterion("dadpross like", value, "dadpross");
            return (Criteria) this;
        }

        public Criteria andDadprossNotLike(String value) {
            addCriterion("dadpross not like", value, "dadpross");
            return (Criteria) this;
        }

        public Criteria andDadprossIn(List<String> values) {
            addCriterion("dadpross in", values, "dadpross");
            return (Criteria) this;
        }

        public Criteria andDadprossNotIn(List<String> values) {
            addCriterion("dadpross not in", values, "dadpross");
            return (Criteria) this;
        }

        public Criteria andDadprossBetween(String value1, String value2) {
            addCriterion("dadpross between", value1, value2, "dadpross");
            return (Criteria) this;
        }

        public Criteria andDadprossNotBetween(String value1, String value2) {
            addCriterion("dadpross not between", value1, value2, "dadpross");
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

        public Criteria andMarriageIsNull() {
            addCriterion("marriage is null");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNotNull() {
            addCriterion("marriage is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageEqualTo(Integer value) {
            addCriterion("marriage =", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotEqualTo(Integer value) {
            addCriterion("marriage <>", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThan(Integer value) {
            addCriterion("marriage >", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThanOrEqualTo(Integer value) {
            addCriterion("marriage >=", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThan(Integer value) {
            addCriterion("marriage <", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThanOrEqualTo(Integer value) {
            addCriterion("marriage <=", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageIn(List<Integer> values) {
            addCriterion("marriage in", values, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotIn(List<Integer> values) {
            addCriterion("marriage not in", values, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageBetween(Integer value1, Integer value2) {
            addCriterion("marriage between", value1, value2, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotBetween(Integer value1, Integer value2) {
            addCriterion("marriage not between", value1, value2, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageDescIsNull() {
            addCriterion("marriage_desc is null");
            return (Criteria) this;
        }

        public Criteria andMarriageDescIsNotNull() {
            addCriterion("marriage_desc is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageDescEqualTo(String value) {
            addCriterion("marriage_desc =", value, "marriageDesc");
            return (Criteria) this;
        }

        public Criteria andMarriageDescNotEqualTo(String value) {
            addCriterion("marriage_desc <>", value, "marriageDesc");
            return (Criteria) this;
        }

        public Criteria andMarriageDescGreaterThan(String value) {
            addCriterion("marriage_desc >", value, "marriageDesc");
            return (Criteria) this;
        }

        public Criteria andMarriageDescGreaterThanOrEqualTo(String value) {
            addCriterion("marriage_desc >=", value, "marriageDesc");
            return (Criteria) this;
        }

        public Criteria andMarriageDescLessThan(String value) {
            addCriterion("marriage_desc <", value, "marriageDesc");
            return (Criteria) this;
        }

        public Criteria andMarriageDescLessThanOrEqualTo(String value) {
            addCriterion("marriage_desc <=", value, "marriageDesc");
            return (Criteria) this;
        }

        public Criteria andMarriageDescLike(String value) {
            addCriterion("marriage_desc like", value, "marriageDesc");
            return (Criteria) this;
        }

        public Criteria andMarriageDescNotLike(String value) {
            addCriterion("marriage_desc not like", value, "marriageDesc");
            return (Criteria) this;
        }

        public Criteria andMarriageDescIn(List<String> values) {
            addCriterion("marriage_desc in", values, "marriageDesc");
            return (Criteria) this;
        }

        public Criteria andMarriageDescNotIn(List<String> values) {
            addCriterion("marriage_desc not in", values, "marriageDesc");
            return (Criteria) this;
        }

        public Criteria andMarriageDescBetween(String value1, String value2) {
            addCriterion("marriage_desc between", value1, value2, "marriageDesc");
            return (Criteria) this;
        }

        public Criteria andMarriageDescNotBetween(String value1, String value2) {
            addCriterion("marriage_desc not between", value1, value2, "marriageDesc");
            return (Criteria) this;
        }

        public Criteria andMuchIsNull() {
            addCriterion("much is null");
            return (Criteria) this;
        }

        public Criteria andMuchIsNotNull() {
            addCriterion("much is not null");
            return (Criteria) this;
        }

        public Criteria andMuchEqualTo(String value) {
            addCriterion("much =", value, "much");
            return (Criteria) this;
        }

        public Criteria andMuchNotEqualTo(String value) {
            addCriterion("much <>", value, "much");
            return (Criteria) this;
        }

        public Criteria andMuchGreaterThan(String value) {
            addCriterion("much >", value, "much");
            return (Criteria) this;
        }

        public Criteria andMuchGreaterThanOrEqualTo(String value) {
            addCriterion("much >=", value, "much");
            return (Criteria) this;
        }

        public Criteria andMuchLessThan(String value) {
            addCriterion("much <", value, "much");
            return (Criteria) this;
        }

        public Criteria andMuchLessThanOrEqualTo(String value) {
            addCriterion("much <=", value, "much");
            return (Criteria) this;
        }

        public Criteria andMuchLike(String value) {
            addCriterion("much like", value, "much");
            return (Criteria) this;
        }

        public Criteria andMuchNotLike(String value) {
            addCriterion("much not like", value, "much");
            return (Criteria) this;
        }

        public Criteria andMuchIn(List<String> values) {
            addCriterion("much in", values, "much");
            return (Criteria) this;
        }

        public Criteria andMuchNotIn(List<String> values) {
            addCriterion("much not in", values, "much");
            return (Criteria) this;
        }

        public Criteria andMuchBetween(String value1, String value2) {
            addCriterion("much between", value1, value2, "much");
            return (Criteria) this;
        }

        public Criteria andMuchNotBetween(String value1, String value2) {
            addCriterion("much not between", value1, value2, "much");
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