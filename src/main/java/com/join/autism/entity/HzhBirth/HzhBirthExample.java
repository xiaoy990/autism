package com.join.autism.entity.HzhBirth;

import java.util.ArrayList;
import java.util.List;

public class HzhBirthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HzhBirthExample() {
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

        public Criteria andBirthIsNull() {
            addCriterion("birth is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("birth is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(Integer value) {
            addCriterion("birth =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(Integer value) {
            addCriterion("birth <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(Integer value) {
            addCriterion("birth >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(Integer value) {
            addCriterion("birth >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(Integer value) {
            addCriterion("birth <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(Integer value) {
            addCriterion("birth <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<Integer> values) {
            addCriterion("birth in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<Integer> values) {
            addCriterion("birth not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(Integer value1, Integer value2) {
            addCriterion("birth between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(Integer value1, Integer value2) {
            addCriterion("birth not between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthreasonIsNull() {
            addCriterion("birthreason is null");
            return (Criteria) this;
        }

        public Criteria andBirthreasonIsNotNull() {
            addCriterion("birthreason is not null");
            return (Criteria) this;
        }

        public Criteria andBirthreasonEqualTo(String value) {
            addCriterion("birthreason =", value, "birthreason");
            return (Criteria) this;
        }

        public Criteria andBirthreasonNotEqualTo(String value) {
            addCriterion("birthreason <>", value, "birthreason");
            return (Criteria) this;
        }

        public Criteria andBirthreasonGreaterThan(String value) {
            addCriterion("birthreason >", value, "birthreason");
            return (Criteria) this;
        }

        public Criteria andBirthreasonGreaterThanOrEqualTo(String value) {
            addCriterion("birthreason >=", value, "birthreason");
            return (Criteria) this;
        }

        public Criteria andBirthreasonLessThan(String value) {
            addCriterion("birthreason <", value, "birthreason");
            return (Criteria) this;
        }

        public Criteria andBirthreasonLessThanOrEqualTo(String value) {
            addCriterion("birthreason <=", value, "birthreason");
            return (Criteria) this;
        }

        public Criteria andBirthreasonLike(String value) {
            addCriterion("birthreason like", value, "birthreason");
            return (Criteria) this;
        }

        public Criteria andBirthreasonNotLike(String value) {
            addCriterion("birthreason not like", value, "birthreason");
            return (Criteria) this;
        }

        public Criteria andBirthreasonIn(List<String> values) {
            addCriterion("birthreason in", values, "birthreason");
            return (Criteria) this;
        }

        public Criteria andBirthreasonNotIn(List<String> values) {
            addCriterion("birthreason not in", values, "birthreason");
            return (Criteria) this;
        }

        public Criteria andBirthreasonBetween(String value1, String value2) {
            addCriterion("birthreason between", value1, value2, "birthreason");
            return (Criteria) this;
        }

        public Criteria andBirthreasonNotBetween(String value1, String value2) {
            addCriterion("birthreason not between", value1, value2, "birthreason");
            return (Criteria) this;
        }

        public Criteria andKgIsNull() {
            addCriterion("kg is null");
            return (Criteria) this;
        }

        public Criteria andKgIsNotNull() {
            addCriterion("kg is not null");
            return (Criteria) this;
        }

        public Criteria andKgEqualTo(String value) {
            addCriterion("kg =", value, "kg");
            return (Criteria) this;
        }

        public Criteria andKgNotEqualTo(String value) {
            addCriterion("kg <>", value, "kg");
            return (Criteria) this;
        }

        public Criteria andKgGreaterThan(String value) {
            addCriterion("kg >", value, "kg");
            return (Criteria) this;
        }

        public Criteria andKgGreaterThanOrEqualTo(String value) {
            addCriterion("kg >=", value, "kg");
            return (Criteria) this;
        }

        public Criteria andKgLessThan(String value) {
            addCriterion("kg <", value, "kg");
            return (Criteria) this;
        }

        public Criteria andKgLessThanOrEqualTo(String value) {
            addCriterion("kg <=", value, "kg");
            return (Criteria) this;
        }

        public Criteria andKgLike(String value) {
            addCriterion("kg like", value, "kg");
            return (Criteria) this;
        }

        public Criteria andKgNotLike(String value) {
            addCriterion("kg not like", value, "kg");
            return (Criteria) this;
        }

        public Criteria andKgIn(List<String> values) {
            addCriterion("kg in", values, "kg");
            return (Criteria) this;
        }

        public Criteria andKgNotIn(List<String> values) {
            addCriterion("kg not in", values, "kg");
            return (Criteria) this;
        }

        public Criteria andKgBetween(String value1, String value2) {
            addCriterion("kg between", value1, value2, "kg");
            return (Criteria) this;
        }

        public Criteria andKgNotBetween(String value1, String value2) {
            addCriterion("kg not between", value1, value2, "kg");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScorereasonIsNull() {
            addCriterion("scorereason is null");
            return (Criteria) this;
        }

        public Criteria andScorereasonIsNotNull() {
            addCriterion("scorereason is not null");
            return (Criteria) this;
        }

        public Criteria andScorereasonEqualTo(String value) {
            addCriterion("scorereason =", value, "scorereason");
            return (Criteria) this;
        }

        public Criteria andScorereasonNotEqualTo(String value) {
            addCriterion("scorereason <>", value, "scorereason");
            return (Criteria) this;
        }

        public Criteria andScorereasonGreaterThan(String value) {
            addCriterion("scorereason >", value, "scorereason");
            return (Criteria) this;
        }

        public Criteria andScorereasonGreaterThanOrEqualTo(String value) {
            addCriterion("scorereason >=", value, "scorereason");
            return (Criteria) this;
        }

        public Criteria andScorereasonLessThan(String value) {
            addCriterion("scorereason <", value, "scorereason");
            return (Criteria) this;
        }

        public Criteria andScorereasonLessThanOrEqualTo(String value) {
            addCriterion("scorereason <=", value, "scorereason");
            return (Criteria) this;
        }

        public Criteria andScorereasonLike(String value) {
            addCriterion("scorereason like", value, "scorereason");
            return (Criteria) this;
        }

        public Criteria andScorereasonNotLike(String value) {
            addCriterion("scorereason not like", value, "scorereason");
            return (Criteria) this;
        }

        public Criteria andScorereasonIn(List<String> values) {
            addCriterion("scorereason in", values, "scorereason");
            return (Criteria) this;
        }

        public Criteria andScorereasonNotIn(List<String> values) {
            addCriterion("scorereason not in", values, "scorereason");
            return (Criteria) this;
        }

        public Criteria andScorereasonBetween(String value1, String value2) {
            addCriterion("scorereason between", value1, value2, "scorereason");
            return (Criteria) this;
        }

        public Criteria andScorereasonNotBetween(String value1, String value2) {
            addCriterion("scorereason not between", value1, value2, "scorereason");
            return (Criteria) this;
        }

        public Criteria andGogoIsNull() {
            addCriterion("gogo is null");
            return (Criteria) this;
        }

        public Criteria andGogoIsNotNull() {
            addCriterion("gogo is not null");
            return (Criteria) this;
        }

        public Criteria andGogoEqualTo(Integer value) {
            addCriterion("gogo =", value, "gogo");
            return (Criteria) this;
        }

        public Criteria andGogoNotEqualTo(Integer value) {
            addCriterion("gogo <>", value, "gogo");
            return (Criteria) this;
        }

        public Criteria andGogoGreaterThan(Integer value) {
            addCriterion("gogo >", value, "gogo");
            return (Criteria) this;
        }

        public Criteria andGogoGreaterThanOrEqualTo(Integer value) {
            addCriterion("gogo >=", value, "gogo");
            return (Criteria) this;
        }

        public Criteria andGogoLessThan(Integer value) {
            addCriterion("gogo <", value, "gogo");
            return (Criteria) this;
        }

        public Criteria andGogoLessThanOrEqualTo(Integer value) {
            addCriterion("gogo <=", value, "gogo");
            return (Criteria) this;
        }

        public Criteria andGogoIn(List<Integer> values) {
            addCriterion("gogo in", values, "gogo");
            return (Criteria) this;
        }

        public Criteria andGogoNotIn(List<Integer> values) {
            addCriterion("gogo not in", values, "gogo");
            return (Criteria) this;
        }

        public Criteria andGogoBetween(Integer value1, Integer value2) {
            addCriterion("gogo between", value1, value2, "gogo");
            return (Criteria) this;
        }

        public Criteria andGogoNotBetween(Integer value1, Integer value2) {
            addCriterion("gogo not between", value1, value2, "gogo");
            return (Criteria) this;
        }

        public Criteria andGogoreasonIsNull() {
            addCriterion("gogoreason is null");
            return (Criteria) this;
        }

        public Criteria andGogoreasonIsNotNull() {
            addCriterion("gogoreason is not null");
            return (Criteria) this;
        }

        public Criteria andGogoreasonEqualTo(String value) {
            addCriterion("gogoreason =", value, "gogoreason");
            return (Criteria) this;
        }

        public Criteria andGogoreasonNotEqualTo(String value) {
            addCriterion("gogoreason <>", value, "gogoreason");
            return (Criteria) this;
        }

        public Criteria andGogoreasonGreaterThan(String value) {
            addCriterion("gogoreason >", value, "gogoreason");
            return (Criteria) this;
        }

        public Criteria andGogoreasonGreaterThanOrEqualTo(String value) {
            addCriterion("gogoreason >=", value, "gogoreason");
            return (Criteria) this;
        }

        public Criteria andGogoreasonLessThan(String value) {
            addCriterion("gogoreason <", value, "gogoreason");
            return (Criteria) this;
        }

        public Criteria andGogoreasonLessThanOrEqualTo(String value) {
            addCriterion("gogoreason <=", value, "gogoreason");
            return (Criteria) this;
        }

        public Criteria andGogoreasonLike(String value) {
            addCriterion("gogoreason like", value, "gogoreason");
            return (Criteria) this;
        }

        public Criteria andGogoreasonNotLike(String value) {
            addCriterion("gogoreason not like", value, "gogoreason");
            return (Criteria) this;
        }

        public Criteria andGogoreasonIn(List<String> values) {
            addCriterion("gogoreason in", values, "gogoreason");
            return (Criteria) this;
        }

        public Criteria andGogoreasonNotIn(List<String> values) {
            addCriterion("gogoreason not in", values, "gogoreason");
            return (Criteria) this;
        }

        public Criteria andGogoreasonBetween(String value1, String value2) {
            addCriterion("gogoreason between", value1, value2, "gogoreason");
            return (Criteria) this;
        }

        public Criteria andGogoreasonNotBetween(String value1, String value2) {
            addCriterion("gogoreason not between", value1, value2, "gogoreason");
            return (Criteria) this;
        }

        public Criteria andAssistIsNull() {
            addCriterion("assist is null");
            return (Criteria) this;
        }

        public Criteria andAssistIsNotNull() {
            addCriterion("assist is not null");
            return (Criteria) this;
        }

        public Criteria andAssistEqualTo(Integer value) {
            addCriterion("assist =", value, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistNotEqualTo(Integer value) {
            addCriterion("assist <>", value, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistGreaterThan(Integer value) {
            addCriterion("assist >", value, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistGreaterThanOrEqualTo(Integer value) {
            addCriterion("assist >=", value, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistLessThan(Integer value) {
            addCriterion("assist <", value, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistLessThanOrEqualTo(Integer value) {
            addCriterion("assist <=", value, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistIn(List<Integer> values) {
            addCriterion("assist in", values, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistNotIn(List<Integer> values) {
            addCriterion("assist not in", values, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistBetween(Integer value1, Integer value2) {
            addCriterion("assist between", value1, value2, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistNotBetween(Integer value1, Integer value2) {
            addCriterion("assist not between", value1, value2, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistreasonIsNull() {
            addCriterion("assistreason is null");
            return (Criteria) this;
        }

        public Criteria andAssistreasonIsNotNull() {
            addCriterion("assistreason is not null");
            return (Criteria) this;
        }

        public Criteria andAssistreasonEqualTo(String value) {
            addCriterion("assistreason =", value, "assistreason");
            return (Criteria) this;
        }

        public Criteria andAssistreasonNotEqualTo(String value) {
            addCriterion("assistreason <>", value, "assistreason");
            return (Criteria) this;
        }

        public Criteria andAssistreasonGreaterThan(String value) {
            addCriterion("assistreason >", value, "assistreason");
            return (Criteria) this;
        }

        public Criteria andAssistreasonGreaterThanOrEqualTo(String value) {
            addCriterion("assistreason >=", value, "assistreason");
            return (Criteria) this;
        }

        public Criteria andAssistreasonLessThan(String value) {
            addCriterion("assistreason <", value, "assistreason");
            return (Criteria) this;
        }

        public Criteria andAssistreasonLessThanOrEqualTo(String value) {
            addCriterion("assistreason <=", value, "assistreason");
            return (Criteria) this;
        }

        public Criteria andAssistreasonLike(String value) {
            addCriterion("assistreason like", value, "assistreason");
            return (Criteria) this;
        }

        public Criteria andAssistreasonNotLike(String value) {
            addCriterion("assistreason not like", value, "assistreason");
            return (Criteria) this;
        }

        public Criteria andAssistreasonIn(List<String> values) {
            addCriterion("assistreason in", values, "assistreason");
            return (Criteria) this;
        }

        public Criteria andAssistreasonNotIn(List<String> values) {
            addCriterion("assistreason not in", values, "assistreason");
            return (Criteria) this;
        }

        public Criteria andAssistreasonBetween(String value1, String value2) {
            addCriterion("assistreason between", value1, value2, "assistreason");
            return (Criteria) this;
        }

        public Criteria andAssistreasonNotBetween(String value1, String value2) {
            addCriterion("assistreason not between", value1, value2, "assistreason");
            return (Criteria) this;
        }

        public Criteria andComplIsNull() {
            addCriterion("compl is null");
            return (Criteria) this;
        }

        public Criteria andComplIsNotNull() {
            addCriterion("compl is not null");
            return (Criteria) this;
        }

        public Criteria andComplEqualTo(String value) {
            addCriterion("compl =", value, "compl");
            return (Criteria) this;
        }

        public Criteria andComplNotEqualTo(String value) {
            addCriterion("compl <>", value, "compl");
            return (Criteria) this;
        }

        public Criteria andComplGreaterThan(String value) {
            addCriterion("compl >", value, "compl");
            return (Criteria) this;
        }

        public Criteria andComplGreaterThanOrEqualTo(String value) {
            addCriterion("compl >=", value, "compl");
            return (Criteria) this;
        }

        public Criteria andComplLessThan(String value) {
            addCriterion("compl <", value, "compl");
            return (Criteria) this;
        }

        public Criteria andComplLessThanOrEqualTo(String value) {
            addCriterion("compl <=", value, "compl");
            return (Criteria) this;
        }

        public Criteria andComplLike(String value) {
            addCriterion("compl like", value, "compl");
            return (Criteria) this;
        }

        public Criteria andComplNotLike(String value) {
            addCriterion("compl not like", value, "compl");
            return (Criteria) this;
        }

        public Criteria andComplIn(List<String> values) {
            addCriterion("compl in", values, "compl");
            return (Criteria) this;
        }

        public Criteria andComplNotIn(List<String> values) {
            addCriterion("compl not in", values, "compl");
            return (Criteria) this;
        }

        public Criteria andComplBetween(String value1, String value2) {
            addCriterion("compl between", value1, value2, "compl");
            return (Criteria) this;
        }

        public Criteria andComplNotBetween(String value1, String value2) {
            addCriterion("compl not between", value1, value2, "compl");
            return (Criteria) this;
        }

        public Criteria andComplreasonIsNull() {
            addCriterion("complreason is null");
            return (Criteria) this;
        }

        public Criteria andComplreasonIsNotNull() {
            addCriterion("complreason is not null");
            return (Criteria) this;
        }

        public Criteria andComplreasonEqualTo(String value) {
            addCriterion("complreason =", value, "complreason");
            return (Criteria) this;
        }

        public Criteria andComplreasonNotEqualTo(String value) {
            addCriterion("complreason <>", value, "complreason");
            return (Criteria) this;
        }

        public Criteria andComplreasonGreaterThan(String value) {
            addCriterion("complreason >", value, "complreason");
            return (Criteria) this;
        }

        public Criteria andComplreasonGreaterThanOrEqualTo(String value) {
            addCriterion("complreason >=", value, "complreason");
            return (Criteria) this;
        }

        public Criteria andComplreasonLessThan(String value) {
            addCriterion("complreason <", value, "complreason");
            return (Criteria) this;
        }

        public Criteria andComplreasonLessThanOrEqualTo(String value) {
            addCriterion("complreason <=", value, "complreason");
            return (Criteria) this;
        }

        public Criteria andComplreasonLike(String value) {
            addCriterion("complreason like", value, "complreason");
            return (Criteria) this;
        }

        public Criteria andComplreasonNotLike(String value) {
            addCriterion("complreason not like", value, "complreason");
            return (Criteria) this;
        }

        public Criteria andComplreasonIn(List<String> values) {
            addCriterion("complreason in", values, "complreason");
            return (Criteria) this;
        }

        public Criteria andComplreasonNotIn(List<String> values) {
            addCriterion("complreason not in", values, "complreason");
            return (Criteria) this;
        }

        public Criteria andComplreasonBetween(String value1, String value2) {
            addCriterion("complreason between", value1, value2, "complreason");
            return (Criteria) this;
        }

        public Criteria andComplreasonNotBetween(String value1, String value2) {
            addCriterion("complreason not between", value1, value2, "complreason");
            return (Criteria) this;
        }

        public Criteria andMombraIsNull() {
            addCriterion("mombra is null");
            return (Criteria) this;
        }

        public Criteria andMombraIsNotNull() {
            addCriterion("mombra is not null");
            return (Criteria) this;
        }

        public Criteria andMombraEqualTo(Integer value) {
            addCriterion("mombra =", value, "mombra");
            return (Criteria) this;
        }

        public Criteria andMombraNotEqualTo(Integer value) {
            addCriterion("mombra <>", value, "mombra");
            return (Criteria) this;
        }

        public Criteria andMombraGreaterThan(Integer value) {
            addCriterion("mombra >", value, "mombra");
            return (Criteria) this;
        }

        public Criteria andMombraGreaterThanOrEqualTo(Integer value) {
            addCriterion("mombra >=", value, "mombra");
            return (Criteria) this;
        }

        public Criteria andMombraLessThan(Integer value) {
            addCriterion("mombra <", value, "mombra");
            return (Criteria) this;
        }

        public Criteria andMombraLessThanOrEqualTo(Integer value) {
            addCriterion("mombra <=", value, "mombra");
            return (Criteria) this;
        }

        public Criteria andMombraIn(List<Integer> values) {
            addCriterion("mombra in", values, "mombra");
            return (Criteria) this;
        }

        public Criteria andMombraNotIn(List<Integer> values) {
            addCriterion("mombra not in", values, "mombra");
            return (Criteria) this;
        }

        public Criteria andMombraBetween(Integer value1, Integer value2) {
            addCriterion("mombra between", value1, value2, "mombra");
            return (Criteria) this;
        }

        public Criteria andMombraNotBetween(Integer value1, Integer value2) {
            addCriterion("mombra not between", value1, value2, "mombra");
            return (Criteria) this;
        }

        public Criteria andMombrareasonIsNull() {
            addCriterion("mombrareason is null");
            return (Criteria) this;
        }

        public Criteria andMombrareasonIsNotNull() {
            addCriterion("mombrareason is not null");
            return (Criteria) this;
        }

        public Criteria andMombrareasonEqualTo(String value) {
            addCriterion("mombrareason =", value, "mombrareason");
            return (Criteria) this;
        }

        public Criteria andMombrareasonNotEqualTo(String value) {
            addCriterion("mombrareason <>", value, "mombrareason");
            return (Criteria) this;
        }

        public Criteria andMombrareasonGreaterThan(String value) {
            addCriterion("mombrareason >", value, "mombrareason");
            return (Criteria) this;
        }

        public Criteria andMombrareasonGreaterThanOrEqualTo(String value) {
            addCriterion("mombrareason >=", value, "mombrareason");
            return (Criteria) this;
        }

        public Criteria andMombrareasonLessThan(String value) {
            addCriterion("mombrareason <", value, "mombrareason");
            return (Criteria) this;
        }

        public Criteria andMombrareasonLessThanOrEqualTo(String value) {
            addCriterion("mombrareason <=", value, "mombrareason");
            return (Criteria) this;
        }

        public Criteria andMombrareasonLike(String value) {
            addCriterion("mombrareason like", value, "mombrareason");
            return (Criteria) this;
        }

        public Criteria andMombrareasonNotLike(String value) {
            addCriterion("mombrareason not like", value, "mombrareason");
            return (Criteria) this;
        }

        public Criteria andMombrareasonIn(List<String> values) {
            addCriterion("mombrareason in", values, "mombrareason");
            return (Criteria) this;
        }

        public Criteria andMombrareasonNotIn(List<String> values) {
            addCriterion("mombrareason not in", values, "mombrareason");
            return (Criteria) this;
        }

        public Criteria andMombrareasonBetween(String value1, String value2) {
            addCriterion("mombrareason between", value1, value2, "mombrareason");
            return (Criteria) this;
        }

        public Criteria andMombrareasonNotBetween(String value1, String value2) {
            addCriterion("mombrareason not between", value1, value2, "mombrareason");
            return (Criteria) this;
        }

        public Criteria andBradiffIsNull() {
            addCriterion("bradiff is null");
            return (Criteria) this;
        }

        public Criteria andBradiffIsNotNull() {
            addCriterion("bradiff is not null");
            return (Criteria) this;
        }

        public Criteria andBradiffEqualTo(String value) {
            addCriterion("bradiff =", value, "bradiff");
            return (Criteria) this;
        }

        public Criteria andBradiffNotEqualTo(String value) {
            addCriterion("bradiff <>", value, "bradiff");
            return (Criteria) this;
        }

        public Criteria andBradiffGreaterThan(String value) {
            addCriterion("bradiff >", value, "bradiff");
            return (Criteria) this;
        }

        public Criteria andBradiffGreaterThanOrEqualTo(String value) {
            addCriterion("bradiff >=", value, "bradiff");
            return (Criteria) this;
        }

        public Criteria andBradiffLessThan(String value) {
            addCriterion("bradiff <", value, "bradiff");
            return (Criteria) this;
        }

        public Criteria andBradiffLessThanOrEqualTo(String value) {
            addCriterion("bradiff <=", value, "bradiff");
            return (Criteria) this;
        }

        public Criteria andBradiffLike(String value) {
            addCriterion("bradiff like", value, "bradiff");
            return (Criteria) this;
        }

        public Criteria andBradiffNotLike(String value) {
            addCriterion("bradiff not like", value, "bradiff");
            return (Criteria) this;
        }

        public Criteria andBradiffIn(List<String> values) {
            addCriterion("bradiff in", values, "bradiff");
            return (Criteria) this;
        }

        public Criteria andBradiffNotIn(List<String> values) {
            addCriterion("bradiff not in", values, "bradiff");
            return (Criteria) this;
        }

        public Criteria andBradiffBetween(String value1, String value2) {
            addCriterion("bradiff between", value1, value2, "bradiff");
            return (Criteria) this;
        }

        public Criteria andBradiffNotBetween(String value1, String value2) {
            addCriterion("bradiff not between", value1, value2, "bradiff");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonIsNull() {
            addCriterion("bradiffreason is null");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonIsNotNull() {
            addCriterion("bradiffreason is not null");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonEqualTo(String value) {
            addCriterion("bradiffreason =", value, "bradiffreason");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonNotEqualTo(String value) {
            addCriterion("bradiffreason <>", value, "bradiffreason");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonGreaterThan(String value) {
            addCriterion("bradiffreason >", value, "bradiffreason");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonGreaterThanOrEqualTo(String value) {
            addCriterion("bradiffreason >=", value, "bradiffreason");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonLessThan(String value) {
            addCriterion("bradiffreason <", value, "bradiffreason");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonLessThanOrEqualTo(String value) {
            addCriterion("bradiffreason <=", value, "bradiffreason");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonLike(String value) {
            addCriterion("bradiffreason like", value, "bradiffreason");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonNotLike(String value) {
            addCriterion("bradiffreason not like", value, "bradiffreason");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonIn(List<String> values) {
            addCriterion("bradiffreason in", values, "bradiffreason");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonNotIn(List<String> values) {
            addCriterion("bradiffreason not in", values, "bradiffreason");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonBetween(String value1, String value2) {
            addCriterion("bradiffreason between", value1, value2, "bradiffreason");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonNotBetween(String value1, String value2) {
            addCriterion("bradiffreason not between", value1, value2, "bradiffreason");
            return (Criteria) this;
        }

        public Criteria andGrowIsNull() {
            addCriterion("grow is null");
            return (Criteria) this;
        }

        public Criteria andGrowIsNotNull() {
            addCriterion("grow is not null");
            return (Criteria) this;
        }

        public Criteria andGrowEqualTo(Integer value) {
            addCriterion("grow =", value, "grow");
            return (Criteria) this;
        }

        public Criteria andGrowNotEqualTo(Integer value) {
            addCriterion("grow <>", value, "grow");
            return (Criteria) this;
        }

        public Criteria andGrowGreaterThan(Integer value) {
            addCriterion("grow >", value, "grow");
            return (Criteria) this;
        }

        public Criteria andGrowGreaterThanOrEqualTo(Integer value) {
            addCriterion("grow >=", value, "grow");
            return (Criteria) this;
        }

        public Criteria andGrowLessThan(Integer value) {
            addCriterion("grow <", value, "grow");
            return (Criteria) this;
        }

        public Criteria andGrowLessThanOrEqualTo(Integer value) {
            addCriterion("grow <=", value, "grow");
            return (Criteria) this;
        }

        public Criteria andGrowIn(List<Integer> values) {
            addCriterion("grow in", values, "grow");
            return (Criteria) this;
        }

        public Criteria andGrowNotIn(List<Integer> values) {
            addCriterion("grow not in", values, "grow");
            return (Criteria) this;
        }

        public Criteria andGrowBetween(Integer value1, Integer value2) {
            addCriterion("grow between", value1, value2, "grow");
            return (Criteria) this;
        }

        public Criteria andGrowNotBetween(Integer value1, Integer value2) {
            addCriterion("grow not between", value1, value2, "grow");
            return (Criteria) this;
        }

        public Criteria andGrowreasonIsNull() {
            addCriterion("growreason is null");
            return (Criteria) this;
        }

        public Criteria andGrowreasonIsNotNull() {
            addCriterion("growreason is not null");
            return (Criteria) this;
        }

        public Criteria andGrowreasonEqualTo(String value) {
            addCriterion("growreason =", value, "growreason");
            return (Criteria) this;
        }

        public Criteria andGrowreasonNotEqualTo(String value) {
            addCriterion("growreason <>", value, "growreason");
            return (Criteria) this;
        }

        public Criteria andGrowreasonGreaterThan(String value) {
            addCriterion("growreason >", value, "growreason");
            return (Criteria) this;
        }

        public Criteria andGrowreasonGreaterThanOrEqualTo(String value) {
            addCriterion("growreason >=", value, "growreason");
            return (Criteria) this;
        }

        public Criteria andGrowreasonLessThan(String value) {
            addCriterion("growreason <", value, "growreason");
            return (Criteria) this;
        }

        public Criteria andGrowreasonLessThanOrEqualTo(String value) {
            addCriterion("growreason <=", value, "growreason");
            return (Criteria) this;
        }

        public Criteria andGrowreasonLike(String value) {
            addCriterion("growreason like", value, "growreason");
            return (Criteria) this;
        }

        public Criteria andGrowreasonNotLike(String value) {
            addCriterion("growreason not like", value, "growreason");
            return (Criteria) this;
        }

        public Criteria andGrowreasonIn(List<String> values) {
            addCriterion("growreason in", values, "growreason");
            return (Criteria) this;
        }

        public Criteria andGrowreasonNotIn(List<String> values) {
            addCriterion("growreason not in", values, "growreason");
            return (Criteria) this;
        }

        public Criteria andGrowreasonBetween(String value1, String value2) {
            addCriterion("growreason between", value1, value2, "growreason");
            return (Criteria) this;
        }

        public Criteria andGrowreasonNotBetween(String value1, String value2) {
            addCriterion("growreason not between", value1, value2, "growreason");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonIsNull() {
            addCriterion("growslowreason is null");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonIsNotNull() {
            addCriterion("growslowreason is not null");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonEqualTo(String value) {
            addCriterion("growslowreason =", value, "growslowreason");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonNotEqualTo(String value) {
            addCriterion("growslowreason <>", value, "growslowreason");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonGreaterThan(String value) {
            addCriterion("growslowreason >", value, "growslowreason");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonGreaterThanOrEqualTo(String value) {
            addCriterion("growslowreason >=", value, "growslowreason");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonLessThan(String value) {
            addCriterion("growslowreason <", value, "growslowreason");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonLessThanOrEqualTo(String value) {
            addCriterion("growslowreason <=", value, "growslowreason");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonLike(String value) {
            addCriterion("growslowreason like", value, "growslowreason");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonNotLike(String value) {
            addCriterion("growslowreason not like", value, "growslowreason");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonIn(List<String> values) {
            addCriterion("growslowreason in", values, "growslowreason");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonNotIn(List<String> values) {
            addCriterion("growslowreason not in", values, "growslowreason");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonBetween(String value1, String value2) {
            addCriterion("growslowreason between", value1, value2, "growslowreason");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonNotBetween(String value1, String value2) {
            addCriterion("growslowreason not between", value1, value2, "growslowreason");
            return (Criteria) this;
        }

        public Criteria andMonthupIsNull() {
            addCriterion("monthup is null");
            return (Criteria) this;
        }

        public Criteria andMonthupIsNotNull() {
            addCriterion("monthup is not null");
            return (Criteria) this;
        }

        public Criteria andMonthupEqualTo(Integer value) {
            addCriterion("monthup =", value, "monthup");
            return (Criteria) this;
        }

        public Criteria andMonthupNotEqualTo(Integer value) {
            addCriterion("monthup <>", value, "monthup");
            return (Criteria) this;
        }

        public Criteria andMonthupGreaterThan(Integer value) {
            addCriterion("monthup >", value, "monthup");
            return (Criteria) this;
        }

        public Criteria andMonthupGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthup >=", value, "monthup");
            return (Criteria) this;
        }

        public Criteria andMonthupLessThan(Integer value) {
            addCriterion("monthup <", value, "monthup");
            return (Criteria) this;
        }

        public Criteria andMonthupLessThanOrEqualTo(Integer value) {
            addCriterion("monthup <=", value, "monthup");
            return (Criteria) this;
        }

        public Criteria andMonthupIn(List<Integer> values) {
            addCriterion("monthup in", values, "monthup");
            return (Criteria) this;
        }

        public Criteria andMonthupNotIn(List<Integer> values) {
            addCriterion("monthup not in", values, "monthup");
            return (Criteria) this;
        }

        public Criteria andMonthupBetween(Integer value1, Integer value2) {
            addCriterion("monthup between", value1, value2, "monthup");
            return (Criteria) this;
        }

        public Criteria andMonthupNotBetween(Integer value1, Integer value2) {
            addCriterion("monthup not between", value1, value2, "monthup");
            return (Criteria) this;
        }

        public Criteria andMonthrollIsNull() {
            addCriterion("monthroll is null");
            return (Criteria) this;
        }

        public Criteria andMonthrollIsNotNull() {
            addCriterion("monthroll is not null");
            return (Criteria) this;
        }

        public Criteria andMonthrollEqualTo(Integer value) {
            addCriterion("monthroll =", value, "monthroll");
            return (Criteria) this;
        }

        public Criteria andMonthrollNotEqualTo(Integer value) {
            addCriterion("monthroll <>", value, "monthroll");
            return (Criteria) this;
        }

        public Criteria andMonthrollGreaterThan(Integer value) {
            addCriterion("monthroll >", value, "monthroll");
            return (Criteria) this;
        }

        public Criteria andMonthrollGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthroll >=", value, "monthroll");
            return (Criteria) this;
        }

        public Criteria andMonthrollLessThan(Integer value) {
            addCriterion("monthroll <", value, "monthroll");
            return (Criteria) this;
        }

        public Criteria andMonthrollLessThanOrEqualTo(Integer value) {
            addCriterion("monthroll <=", value, "monthroll");
            return (Criteria) this;
        }

        public Criteria andMonthrollIn(List<Integer> values) {
            addCriterion("monthroll in", values, "monthroll");
            return (Criteria) this;
        }

        public Criteria andMonthrollNotIn(List<Integer> values) {
            addCriterion("monthroll not in", values, "monthroll");
            return (Criteria) this;
        }

        public Criteria andMonthrollBetween(Integer value1, Integer value2) {
            addCriterion("monthroll between", value1, value2, "monthroll");
            return (Criteria) this;
        }

        public Criteria andMonthrollNotBetween(Integer value1, Integer value2) {
            addCriterion("monthroll not between", value1, value2, "monthroll");
            return (Criteria) this;
        }

        public Criteria andMonthsitIsNull() {
            addCriterion("monthsit is null");
            return (Criteria) this;
        }

        public Criteria andMonthsitIsNotNull() {
            addCriterion("monthsit is not null");
            return (Criteria) this;
        }

        public Criteria andMonthsitEqualTo(Integer value) {
            addCriterion("monthsit =", value, "monthsit");
            return (Criteria) this;
        }

        public Criteria andMonthsitNotEqualTo(Integer value) {
            addCriterion("monthsit <>", value, "monthsit");
            return (Criteria) this;
        }

        public Criteria andMonthsitGreaterThan(Integer value) {
            addCriterion("monthsit >", value, "monthsit");
            return (Criteria) this;
        }

        public Criteria andMonthsitGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthsit >=", value, "monthsit");
            return (Criteria) this;
        }

        public Criteria andMonthsitLessThan(Integer value) {
            addCriterion("monthsit <", value, "monthsit");
            return (Criteria) this;
        }

        public Criteria andMonthsitLessThanOrEqualTo(Integer value) {
            addCriterion("monthsit <=", value, "monthsit");
            return (Criteria) this;
        }

        public Criteria andMonthsitIn(List<Integer> values) {
            addCriterion("monthsit in", values, "monthsit");
            return (Criteria) this;
        }

        public Criteria andMonthsitNotIn(List<Integer> values) {
            addCriterion("monthsit not in", values, "monthsit");
            return (Criteria) this;
        }

        public Criteria andMonthsitBetween(Integer value1, Integer value2) {
            addCriterion("monthsit between", value1, value2, "monthsit");
            return (Criteria) this;
        }

        public Criteria andMonthsitNotBetween(Integer value1, Integer value2) {
            addCriterion("monthsit not between", value1, value2, "monthsit");
            return (Criteria) this;
        }

        public Criteria andMonthclimbIsNull() {
            addCriterion("monthclimb is null");
            return (Criteria) this;
        }

        public Criteria andMonthclimbIsNotNull() {
            addCriterion("monthclimb is not null");
            return (Criteria) this;
        }

        public Criteria andMonthclimbEqualTo(Integer value) {
            addCriterion("monthclimb =", value, "monthclimb");
            return (Criteria) this;
        }

        public Criteria andMonthclimbNotEqualTo(Integer value) {
            addCriterion("monthclimb <>", value, "monthclimb");
            return (Criteria) this;
        }

        public Criteria andMonthclimbGreaterThan(Integer value) {
            addCriterion("monthclimb >", value, "monthclimb");
            return (Criteria) this;
        }

        public Criteria andMonthclimbGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthclimb >=", value, "monthclimb");
            return (Criteria) this;
        }

        public Criteria andMonthclimbLessThan(Integer value) {
            addCriterion("monthclimb <", value, "monthclimb");
            return (Criteria) this;
        }

        public Criteria andMonthclimbLessThanOrEqualTo(Integer value) {
            addCriterion("monthclimb <=", value, "monthclimb");
            return (Criteria) this;
        }

        public Criteria andMonthclimbIn(List<Integer> values) {
            addCriterion("monthclimb in", values, "monthclimb");
            return (Criteria) this;
        }

        public Criteria andMonthclimbNotIn(List<Integer> values) {
            addCriterion("monthclimb not in", values, "monthclimb");
            return (Criteria) this;
        }

        public Criteria andMonthclimbBetween(Integer value1, Integer value2) {
            addCriterion("monthclimb between", value1, value2, "monthclimb");
            return (Criteria) this;
        }

        public Criteria andMonthclimbNotBetween(Integer value1, Integer value2) {
            addCriterion("monthclimb not between", value1, value2, "monthclimb");
            return (Criteria) this;
        }

        public Criteria andMonthgoIsNull() {
            addCriterion("monthgo is null");
            return (Criteria) this;
        }

        public Criteria andMonthgoIsNotNull() {
            addCriterion("monthgo is not null");
            return (Criteria) this;
        }

        public Criteria andMonthgoEqualTo(Integer value) {
            addCriterion("monthgo =", value, "monthgo");
            return (Criteria) this;
        }

        public Criteria andMonthgoNotEqualTo(Integer value) {
            addCriterion("monthgo <>", value, "monthgo");
            return (Criteria) this;
        }

        public Criteria andMonthgoGreaterThan(Integer value) {
            addCriterion("monthgo >", value, "monthgo");
            return (Criteria) this;
        }

        public Criteria andMonthgoGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthgo >=", value, "monthgo");
            return (Criteria) this;
        }

        public Criteria andMonthgoLessThan(Integer value) {
            addCriterion("monthgo <", value, "monthgo");
            return (Criteria) this;
        }

        public Criteria andMonthgoLessThanOrEqualTo(Integer value) {
            addCriterion("monthgo <=", value, "monthgo");
            return (Criteria) this;
        }

        public Criteria andMonthgoIn(List<Integer> values) {
            addCriterion("monthgo in", values, "monthgo");
            return (Criteria) this;
        }

        public Criteria andMonthgoNotIn(List<Integer> values) {
            addCriterion("monthgo not in", values, "monthgo");
            return (Criteria) this;
        }

        public Criteria andMonthgoBetween(Integer value1, Integer value2) {
            addCriterion("monthgo between", value1, value2, "monthgo");
            return (Criteria) this;
        }

        public Criteria andMonthgoNotBetween(Integer value1, Integer value2) {
            addCriterion("monthgo not between", value1, value2, "monthgo");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonIsNull() {
            addCriterion("speakreason is null");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonIsNotNull() {
            addCriterion("speakreason is not null");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonEqualTo(String value) {
            addCriterion("speakreason =", value, "speakreason");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonNotEqualTo(String value) {
            addCriterion("speakreason <>", value, "speakreason");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonGreaterThan(String value) {
            addCriterion("speakreason >", value, "speakreason");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonGreaterThanOrEqualTo(String value) {
            addCriterion("speakreason >=", value, "speakreason");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonLessThan(String value) {
            addCriterion("speakreason <", value, "speakreason");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonLessThanOrEqualTo(String value) {
            addCriterion("speakreason <=", value, "speakreason");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonLike(String value) {
            addCriterion("speakreason like", value, "speakreason");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonNotLike(String value) {
            addCriterion("speakreason not like", value, "speakreason");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonIn(List<String> values) {
            addCriterion("speakreason in", values, "speakreason");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonNotIn(List<String> values) {
            addCriterion("speakreason not in", values, "speakreason");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonBetween(String value1, String value2) {
            addCriterion("speakreason between", value1, value2, "speakreason");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonNotBetween(String value1, String value2) {
            addCriterion("speakreason not between", value1, value2, "speakreason");
            return (Criteria) this;
        }

        public Criteria andVitamdIsNull() {
            addCriterion("vitamd is null");
            return (Criteria) this;
        }

        public Criteria andVitamdIsNotNull() {
            addCriterion("vitamd is not null");
            return (Criteria) this;
        }

        public Criteria andVitamdEqualTo(Integer value) {
            addCriterion("vitamd =", value, "vitamd");
            return (Criteria) this;
        }

        public Criteria andVitamdNotEqualTo(Integer value) {
            addCriterion("vitamd <>", value, "vitamd");
            return (Criteria) this;
        }

        public Criteria andVitamdGreaterThan(Integer value) {
            addCriterion("vitamd >", value, "vitamd");
            return (Criteria) this;
        }

        public Criteria andVitamdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vitamd >=", value, "vitamd");
            return (Criteria) this;
        }

        public Criteria andVitamdLessThan(Integer value) {
            addCriterion("vitamd <", value, "vitamd");
            return (Criteria) this;
        }

        public Criteria andVitamdLessThanOrEqualTo(Integer value) {
            addCriterion("vitamd <=", value, "vitamd");
            return (Criteria) this;
        }

        public Criteria andVitamdIn(List<Integer> values) {
            addCriterion("vitamd in", values, "vitamd");
            return (Criteria) this;
        }

        public Criteria andVitamdNotIn(List<Integer> values) {
            addCriterion("vitamd not in", values, "vitamd");
            return (Criteria) this;
        }

        public Criteria andVitamdBetween(Integer value1, Integer value2) {
            addCriterion("vitamd between", value1, value2, "vitamd");
            return (Criteria) this;
        }

        public Criteria andVitamdNotBetween(Integer value1, Integer value2) {
            addCriterion("vitamd not between", value1, value2, "vitamd");
            return (Criteria) this;
        }

        public Criteria andVitamdreasonIsNull() {
            addCriterion("vitamdreason is null");
            return (Criteria) this;
        }

        public Criteria andVitamdreasonIsNotNull() {
            addCriterion("vitamdreason is not null");
            return (Criteria) this;
        }

        public Criteria andVitamdreasonEqualTo(String value) {
            addCriterion("vitamdreason =", value, "vitamdreason");
            return (Criteria) this;
        }

        public Criteria andVitamdreasonNotEqualTo(String value) {
            addCriterion("vitamdreason <>", value, "vitamdreason");
            return (Criteria) this;
        }

        public Criteria andVitamdreasonGreaterThan(String value) {
            addCriterion("vitamdreason >", value, "vitamdreason");
            return (Criteria) this;
        }

        public Criteria andVitamdreasonGreaterThanOrEqualTo(String value) {
            addCriterion("vitamdreason >=", value, "vitamdreason");
            return (Criteria) this;
        }

        public Criteria andVitamdreasonLessThan(String value) {
            addCriterion("vitamdreason <", value, "vitamdreason");
            return (Criteria) this;
        }

        public Criteria andVitamdreasonLessThanOrEqualTo(String value) {
            addCriterion("vitamdreason <=", value, "vitamdreason");
            return (Criteria) this;
        }

        public Criteria andVitamdreasonLike(String value) {
            addCriterion("vitamdreason like", value, "vitamdreason");
            return (Criteria) this;
        }

        public Criteria andVitamdreasonNotLike(String value) {
            addCriterion("vitamdreason not like", value, "vitamdreason");
            return (Criteria) this;
        }

        public Criteria andVitamdreasonIn(List<String> values) {
            addCriterion("vitamdreason in", values, "vitamdreason");
            return (Criteria) this;
        }

        public Criteria andVitamdreasonNotIn(List<String> values) {
            addCriterion("vitamdreason not in", values, "vitamdreason");
            return (Criteria) this;
        }

        public Criteria andVitamdreasonBetween(String value1, String value2) {
            addCriterion("vitamdreason between", value1, value2, "vitamdreason");
            return (Criteria) this;
        }

        public Criteria andVitamdreasonNotBetween(String value1, String value2) {
            addCriterion("vitamdreason not between", value1, value2, "vitamdreason");
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