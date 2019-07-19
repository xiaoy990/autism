package com.join.autism.entity.HzhOther;

import java.util.ArrayList;
import java.util.List;

public class HzhOtherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HzhOtherExample() {
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

        public Criteria andStatureIsNull() {
            addCriterion("stature is null");
            return (Criteria) this;
        }

        public Criteria andStatureIsNotNull() {
            addCriterion("stature is not null");
            return (Criteria) this;
        }

        public Criteria andStatureEqualTo(String value) {
            addCriterion("stature =", value, "stature");
            return (Criteria) this;
        }

        public Criteria andStatureNotEqualTo(String value) {
            addCriterion("stature <>", value, "stature");
            return (Criteria) this;
        }

        public Criteria andStatureGreaterThan(String value) {
            addCriterion("stature >", value, "stature");
            return (Criteria) this;
        }

        public Criteria andStatureGreaterThanOrEqualTo(String value) {
            addCriterion("stature >=", value, "stature");
            return (Criteria) this;
        }

        public Criteria andStatureLessThan(String value) {
            addCriterion("stature <", value, "stature");
            return (Criteria) this;
        }

        public Criteria andStatureLessThanOrEqualTo(String value) {
            addCriterion("stature <=", value, "stature");
            return (Criteria) this;
        }

        public Criteria andStatureLike(String value) {
            addCriterion("stature like", value, "stature");
            return (Criteria) this;
        }

        public Criteria andStatureNotLike(String value) {
            addCriterion("stature not like", value, "stature");
            return (Criteria) this;
        }

        public Criteria andStatureIn(List<String> values) {
            addCriterion("stature in", values, "stature");
            return (Criteria) this;
        }

        public Criteria andStatureNotIn(List<String> values) {
            addCriterion("stature not in", values, "stature");
            return (Criteria) this;
        }

        public Criteria andStatureBetween(String value1, String value2) {
            addCriterion("stature between", value1, value2, "stature");
            return (Criteria) this;
        }

        public Criteria andStatureNotBetween(String value1, String value2) {
            addCriterion("stature not between", value1, value2, "stature");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(String value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(String value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(String value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(String value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(String value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(String value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLike(String value) {
            addCriterion("weight like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotLike(String value) {
            addCriterion("weight not like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<String> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<String> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(String value1, String value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(String value1, String value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andHeadIsNull() {
            addCriterion("head is null");
            return (Criteria) this;
        }

        public Criteria andHeadIsNotNull() {
            addCriterion("head is not null");
            return (Criteria) this;
        }

        public Criteria andHeadEqualTo(String value) {
            addCriterion("head =", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotEqualTo(String value) {
            addCriterion("head <>", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadGreaterThan(String value) {
            addCriterion("head >", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadGreaterThanOrEqualTo(String value) {
            addCriterion("head >=", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLessThan(String value) {
            addCriterion("head <", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLessThanOrEqualTo(String value) {
            addCriterion("head <=", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLike(String value) {
            addCriterion("head like", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotLike(String value) {
            addCriterion("head not like", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadIn(List<String> values) {
            addCriterion("head in", values, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotIn(List<String> values) {
            addCriterion("head not in", values, "head");
            return (Criteria) this;
        }

        public Criteria andHeadBetween(String value1, String value2) {
            addCriterion("head between", value1, value2, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotBetween(String value1, String value2) {
            addCriterion("head not between", value1, value2, "head");
            return (Criteria) this;
        }

        public Criteria andIntelIsNull() {
            addCriterion("intel is null");
            return (Criteria) this;
        }

        public Criteria andIntelIsNotNull() {
            addCriterion("intel is not null");
            return (Criteria) this;
        }

        public Criteria andIntelEqualTo(String value) {
            addCriterion("intel =", value, "intel");
            return (Criteria) this;
        }

        public Criteria andIntelNotEqualTo(String value) {
            addCriterion("intel <>", value, "intel");
            return (Criteria) this;
        }

        public Criteria andIntelGreaterThan(String value) {
            addCriterion("intel >", value, "intel");
            return (Criteria) this;
        }

        public Criteria andIntelGreaterThanOrEqualTo(String value) {
            addCriterion("intel >=", value, "intel");
            return (Criteria) this;
        }

        public Criteria andIntelLessThan(String value) {
            addCriterion("intel <", value, "intel");
            return (Criteria) this;
        }

        public Criteria andIntelLessThanOrEqualTo(String value) {
            addCriterion("intel <=", value, "intel");
            return (Criteria) this;
        }

        public Criteria andIntelLike(String value) {
            addCriterion("intel like", value, "intel");
            return (Criteria) this;
        }

        public Criteria andIntelNotLike(String value) {
            addCriterion("intel not like", value, "intel");
            return (Criteria) this;
        }

        public Criteria andIntelIn(List<String> values) {
            addCriterion("intel in", values, "intel");
            return (Criteria) this;
        }

        public Criteria andIntelNotIn(List<String> values) {
            addCriterion("intel not in", values, "intel");
            return (Criteria) this;
        }

        public Criteria andIntelBetween(String value1, String value2) {
            addCriterion("intel between", value1, value2, "intel");
            return (Criteria) this;
        }

        public Criteria andIntelNotBetween(String value1, String value2) {
            addCriterion("intel not between", value1, value2, "intel");
            return (Criteria) this;
        }

        public Criteria andDrugIsNull() {
            addCriterion("drug is null");
            return (Criteria) this;
        }

        public Criteria andDrugIsNotNull() {
            addCriterion("drug is not null");
            return (Criteria) this;
        }

        public Criteria andDrugEqualTo(String value) {
            addCriterion("drug =", value, "drug");
            return (Criteria) this;
        }

        public Criteria andDrugNotEqualTo(String value) {
            addCriterion("drug <>", value, "drug");
            return (Criteria) this;
        }

        public Criteria andDrugGreaterThan(String value) {
            addCriterion("drug >", value, "drug");
            return (Criteria) this;
        }

        public Criteria andDrugGreaterThanOrEqualTo(String value) {
            addCriterion("drug >=", value, "drug");
            return (Criteria) this;
        }

        public Criteria andDrugLessThan(String value) {
            addCriterion("drug <", value, "drug");
            return (Criteria) this;
        }

        public Criteria andDrugLessThanOrEqualTo(String value) {
            addCriterion("drug <=", value, "drug");
            return (Criteria) this;
        }

        public Criteria andDrugLike(String value) {
            addCriterion("drug like", value, "drug");
            return (Criteria) this;
        }

        public Criteria andDrugNotLike(String value) {
            addCriterion("drug not like", value, "drug");
            return (Criteria) this;
        }

        public Criteria andDrugIn(List<String> values) {
            addCriterion("drug in", values, "drug");
            return (Criteria) this;
        }

        public Criteria andDrugNotIn(List<String> values) {
            addCriterion("drug not in", values, "drug");
            return (Criteria) this;
        }

        public Criteria andDrugBetween(String value1, String value2) {
            addCriterion("drug between", value1, value2, "drug");
            return (Criteria) this;
        }

        public Criteria andDrugNotBetween(String value1, String value2) {
            addCriterion("drug not between", value1, value2, "drug");
            return (Criteria) this;
        }

        public Criteria andActIsNull() {
            addCriterion("act is null");
            return (Criteria) this;
        }

        public Criteria andActIsNotNull() {
            addCriterion("act is not null");
            return (Criteria) this;
        }

        public Criteria andActEqualTo(String value) {
            addCriterion("act =", value, "act");
            return (Criteria) this;
        }

        public Criteria andActNotEqualTo(String value) {
            addCriterion("act <>", value, "act");
            return (Criteria) this;
        }

        public Criteria andActGreaterThan(String value) {
            addCriterion("act >", value, "act");
            return (Criteria) this;
        }

        public Criteria andActGreaterThanOrEqualTo(String value) {
            addCriterion("act >=", value, "act");
            return (Criteria) this;
        }

        public Criteria andActLessThan(String value) {
            addCriterion("act <", value, "act");
            return (Criteria) this;
        }

        public Criteria andActLessThanOrEqualTo(String value) {
            addCriterion("act <=", value, "act");
            return (Criteria) this;
        }

        public Criteria andActLike(String value) {
            addCriterion("act like", value, "act");
            return (Criteria) this;
        }

        public Criteria andActNotLike(String value) {
            addCriterion("act not like", value, "act");
            return (Criteria) this;
        }

        public Criteria andActIn(List<String> values) {
            addCriterion("act in", values, "act");
            return (Criteria) this;
        }

        public Criteria andActNotIn(List<String> values) {
            addCriterion("act not in", values, "act");
            return (Criteria) this;
        }

        public Criteria andActBetween(String value1, String value2) {
            addCriterion("act between", value1, value2, "act");
            return (Criteria) this;
        }

        public Criteria andActNotBetween(String value1, String value2) {
            addCriterion("act not between", value1, value2, "act");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andIntelContentIsNull() {
            addCriterion("intel_content is null");
            return (Criteria) this;
        }

        public Criteria andIntelContentIsNotNull() {
            addCriterion("intel_content is not null");
            return (Criteria) this;
        }

        public Criteria andIntelContentEqualTo(String value) {
            addCriterion("intel_content =", value, "intelContent");
            return (Criteria) this;
        }

        public Criteria andIntelContentNotEqualTo(String value) {
            addCriterion("intel_content <>", value, "intelContent");
            return (Criteria) this;
        }

        public Criteria andIntelContentGreaterThan(String value) {
            addCriterion("intel_content >", value, "intelContent");
            return (Criteria) this;
        }

        public Criteria andIntelContentGreaterThanOrEqualTo(String value) {
            addCriterion("intel_content >=", value, "intelContent");
            return (Criteria) this;
        }

        public Criteria andIntelContentLessThan(String value) {
            addCriterion("intel_content <", value, "intelContent");
            return (Criteria) this;
        }

        public Criteria andIntelContentLessThanOrEqualTo(String value) {
            addCriterion("intel_content <=", value, "intelContent");
            return (Criteria) this;
        }

        public Criteria andIntelContentLike(String value) {
            addCriterion("intel_content like", value, "intelContent");
            return (Criteria) this;
        }

        public Criteria andIntelContentNotLike(String value) {
            addCriterion("intel_content not like", value, "intelContent");
            return (Criteria) this;
        }

        public Criteria andIntelContentIn(List<String> values) {
            addCriterion("intel_content in", values, "intelContent");
            return (Criteria) this;
        }

        public Criteria andIntelContentNotIn(List<String> values) {
            addCriterion("intel_content not in", values, "intelContent");
            return (Criteria) this;
        }

        public Criteria andIntelContentBetween(String value1, String value2) {
            addCriterion("intel_content between", value1, value2, "intelContent");
            return (Criteria) this;
        }

        public Criteria andIntelContentNotBetween(String value1, String value2) {
            addCriterion("intel_content not between", value1, value2, "intelContent");
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