package com.join.autism.entity.HzhIllnerssed;

import java.util.ArrayList;
import java.util.List;

public class HzhIllnerssedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HzhIllnerssedExample() {
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

        public Criteria andTellIsNull() {
            addCriterion("tell is null");
            return (Criteria) this;
        }

        public Criteria andTellIsNotNull() {
            addCriterion("tell is not null");
            return (Criteria) this;
        }

        public Criteria andTellEqualTo(String value) {
            addCriterion("tell =", value, "tell");
            return (Criteria) this;
        }

        public Criteria andTellNotEqualTo(String value) {
            addCriterion("tell <>", value, "tell");
            return (Criteria) this;
        }

        public Criteria andTellGreaterThan(String value) {
            addCriterion("tell >", value, "tell");
            return (Criteria) this;
        }

        public Criteria andTellGreaterThanOrEqualTo(String value) {
            addCriterion("tell >=", value, "tell");
            return (Criteria) this;
        }

        public Criteria andTellLessThan(String value) {
            addCriterion("tell <", value, "tell");
            return (Criteria) this;
        }

        public Criteria andTellLessThanOrEqualTo(String value) {
            addCriterion("tell <=", value, "tell");
            return (Criteria) this;
        }

        public Criteria andTellLike(String value) {
            addCriterion("tell like", value, "tell");
            return (Criteria) this;
        }

        public Criteria andTellNotLike(String value) {
            addCriterion("tell not like", value, "tell");
            return (Criteria) this;
        }

        public Criteria andTellIn(List<String> values) {
            addCriterion("tell in", values, "tell");
            return (Criteria) this;
        }

        public Criteria andTellNotIn(List<String> values) {
            addCriterion("tell not in", values, "tell");
            return (Criteria) this;
        }

        public Criteria andTellBetween(String value1, String value2) {
            addCriterion("tell between", value1, value2, "tell");
            return (Criteria) this;
        }

        public Criteria andTellNotBetween(String value1, String value2) {
            addCriterion("tell not between", value1, value2, "tell");
            return (Criteria) this;
        }

        public Criteria andFirstIsNull() {
            addCriterion("`first` is null");
            return (Criteria) this;
        }

        public Criteria andFirstIsNotNull() {
            addCriterion("`first` is not null");
            return (Criteria) this;
        }

        public Criteria andFirstEqualTo(String value) {
            addCriterion("`first` =", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstNotEqualTo(String value) {
            addCriterion("`first` <>", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstGreaterThan(String value) {
            addCriterion("`first` >", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstGreaterThanOrEqualTo(String value) {
            addCriterion("`first` >=", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstLessThan(String value) {
            addCriterion("`first` <", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstLessThanOrEqualTo(String value) {
            addCriterion("`first` <=", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstLike(String value) {
            addCriterion("`first` like", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstNotLike(String value) {
            addCriterion("`first` not like", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstIn(List<String> values) {
            addCriterion("`first` in", values, "first");
            return (Criteria) this;
        }

        public Criteria andFirstNotIn(List<String> values) {
            addCriterion("`first` not in", values, "first");
            return (Criteria) this;
        }

        public Criteria andFirstBetween(String value1, String value2) {
            addCriterion("`first` between", value1, value2, "first");
            return (Criteria) this;
        }

        public Criteria andFirstNotBetween(String value1, String value2) {
            addCriterion("`first` not between", value1, value2, "first");
            return (Criteria) this;
        }

        public Criteria andSymptomIsNull() {
            addCriterion("symptom is null");
            return (Criteria) this;
        }

        public Criteria andSymptomIsNotNull() {
            addCriterion("symptom is not null");
            return (Criteria) this;
        }

        public Criteria andSymptomEqualTo(String value) {
            addCriterion("symptom =", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomNotEqualTo(String value) {
            addCriterion("symptom <>", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomGreaterThan(String value) {
            addCriterion("symptom >", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomGreaterThanOrEqualTo(String value) {
            addCriterion("symptom >=", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomLessThan(String value) {
            addCriterion("symptom <", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomLessThanOrEqualTo(String value) {
            addCriterion("symptom <=", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomLike(String value) {
            addCriterion("symptom like", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomNotLike(String value) {
            addCriterion("symptom not like", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomIn(List<String> values) {
            addCriterion("symptom in", values, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomNotIn(List<String> values) {
            addCriterion("symptom not in", values, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomBetween(String value1, String value2) {
            addCriterion("symptom between", value1, value2, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomNotBetween(String value1, String value2) {
            addCriterion("symptom not between", value1, value2, "symptom");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOtherstatusIsNull() {
            addCriterion("otherstatus is null");
            return (Criteria) this;
        }

        public Criteria andOtherstatusIsNotNull() {
            addCriterion("otherstatus is not null");
            return (Criteria) this;
        }

        public Criteria andOtherstatusEqualTo(String value) {
            addCriterion("otherstatus =", value, "otherstatus");
            return (Criteria) this;
        }

        public Criteria andOtherstatusNotEqualTo(String value) {
            addCriterion("otherstatus <>", value, "otherstatus");
            return (Criteria) this;
        }

        public Criteria andOtherstatusGreaterThan(String value) {
            addCriterion("otherstatus >", value, "otherstatus");
            return (Criteria) this;
        }

        public Criteria andOtherstatusGreaterThanOrEqualTo(String value) {
            addCriterion("otherstatus >=", value, "otherstatus");
            return (Criteria) this;
        }

        public Criteria andOtherstatusLessThan(String value) {
            addCriterion("otherstatus <", value, "otherstatus");
            return (Criteria) this;
        }

        public Criteria andOtherstatusLessThanOrEqualTo(String value) {
            addCriterion("otherstatus <=", value, "otherstatus");
            return (Criteria) this;
        }

        public Criteria andOtherstatusLike(String value) {
            addCriterion("otherstatus like", value, "otherstatus");
            return (Criteria) this;
        }

        public Criteria andOtherstatusNotLike(String value) {
            addCriterion("otherstatus not like", value, "otherstatus");
            return (Criteria) this;
        }

        public Criteria andOtherstatusIn(List<String> values) {
            addCriterion("otherstatus in", values, "otherstatus");
            return (Criteria) this;
        }

        public Criteria andOtherstatusNotIn(List<String> values) {
            addCriterion("otherstatus not in", values, "otherstatus");
            return (Criteria) this;
        }

        public Criteria andOtherstatusBetween(String value1, String value2) {
            addCriterion("otherstatus between", value1, value2, "otherstatus");
            return (Criteria) this;
        }

        public Criteria andOtherstatusNotBetween(String value1, String value2) {
            addCriterion("otherstatus not between", value1, value2, "otherstatus");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andOtherreasonIsNull() {
            addCriterion("otherreason is null");
            return (Criteria) this;
        }

        public Criteria andOtherreasonIsNotNull() {
            addCriterion("otherreason is not null");
            return (Criteria) this;
        }

        public Criteria andOtherreasonEqualTo(String value) {
            addCriterion("otherreason =", value, "otherreason");
            return (Criteria) this;
        }

        public Criteria andOtherreasonNotEqualTo(String value) {
            addCriterion("otherreason <>", value, "otherreason");
            return (Criteria) this;
        }

        public Criteria andOtherreasonGreaterThan(String value) {
            addCriterion("otherreason >", value, "otherreason");
            return (Criteria) this;
        }

        public Criteria andOtherreasonGreaterThanOrEqualTo(String value) {
            addCriterion("otherreason >=", value, "otherreason");
            return (Criteria) this;
        }

        public Criteria andOtherreasonLessThan(String value) {
            addCriterion("otherreason <", value, "otherreason");
            return (Criteria) this;
        }

        public Criteria andOtherreasonLessThanOrEqualTo(String value) {
            addCriterion("otherreason <=", value, "otherreason");
            return (Criteria) this;
        }

        public Criteria andOtherreasonLike(String value) {
            addCriterion("otherreason like", value, "otherreason");
            return (Criteria) this;
        }

        public Criteria andOtherreasonNotLike(String value) {
            addCriterion("otherreason not like", value, "otherreason");
            return (Criteria) this;
        }

        public Criteria andOtherreasonIn(List<String> values) {
            addCriterion("otherreason in", values, "otherreason");
            return (Criteria) this;
        }

        public Criteria andOtherreasonNotIn(List<String> values) {
            addCriterion("otherreason not in", values, "otherreason");
            return (Criteria) this;
        }

        public Criteria andOtherreasonBetween(String value1, String value2) {
            addCriterion("otherreason between", value1, value2, "otherreason");
            return (Criteria) this;
        }

        public Criteria andOtherreasonNotBetween(String value1, String value2) {
            addCriterion("otherreason not between", value1, value2, "otherreason");
            return (Criteria) this;
        }

        public Criteria andSickIsNull() {
            addCriterion("sick is null");
            return (Criteria) this;
        }

        public Criteria andSickIsNotNull() {
            addCriterion("sick is not null");
            return (Criteria) this;
        }

        public Criteria andSickEqualTo(String value) {
            addCriterion("sick =", value, "sick");
            return (Criteria) this;
        }

        public Criteria andSickNotEqualTo(String value) {
            addCriterion("sick <>", value, "sick");
            return (Criteria) this;
        }

        public Criteria andSickGreaterThan(String value) {
            addCriterion("sick >", value, "sick");
            return (Criteria) this;
        }

        public Criteria andSickGreaterThanOrEqualTo(String value) {
            addCriterion("sick >=", value, "sick");
            return (Criteria) this;
        }

        public Criteria andSickLessThan(String value) {
            addCriterion("sick <", value, "sick");
            return (Criteria) this;
        }

        public Criteria andSickLessThanOrEqualTo(String value) {
            addCriterion("sick <=", value, "sick");
            return (Criteria) this;
        }

        public Criteria andSickLike(String value) {
            addCriterion("sick like", value, "sick");
            return (Criteria) this;
        }

        public Criteria andSickNotLike(String value) {
            addCriterion("sick not like", value, "sick");
            return (Criteria) this;
        }

        public Criteria andSickIn(List<String> values) {
            addCriterion("sick in", values, "sick");
            return (Criteria) this;
        }

        public Criteria andSickNotIn(List<String> values) {
            addCriterion("sick not in", values, "sick");
            return (Criteria) this;
        }

        public Criteria andSickBetween(String value1, String value2) {
            addCriterion("sick between", value1, value2, "sick");
            return (Criteria) this;
        }

        public Criteria andSickNotBetween(String value1, String value2) {
            addCriterion("sick not between", value1, value2, "sick");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(String value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(String value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(String value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(String value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(String value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(String value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLike(String value) {
            addCriterion("rate like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotLike(String value) {
            addCriterion("rate not like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<String> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<String> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(String value1, String value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(String value1, String value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("`time` is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("`time` is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("`time` =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("`time` <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("`time` >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("`time` >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("`time` <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("`time` <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("`time` like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("`time` not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("`time` in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("`time` not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("`time` between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("`time` not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andFirstgoIsNull() {
            addCriterion("firstgo is null");
            return (Criteria) this;
        }

        public Criteria andFirstgoIsNotNull() {
            addCriterion("firstgo is not null");
            return (Criteria) this;
        }

        public Criteria andFirstgoEqualTo(String value) {
            addCriterion("firstgo =", value, "firstgo");
            return (Criteria) this;
        }

        public Criteria andFirstgoNotEqualTo(String value) {
            addCriterion("firstgo <>", value, "firstgo");
            return (Criteria) this;
        }

        public Criteria andFirstgoGreaterThan(String value) {
            addCriterion("firstgo >", value, "firstgo");
            return (Criteria) this;
        }

        public Criteria andFirstgoGreaterThanOrEqualTo(String value) {
            addCriterion("firstgo >=", value, "firstgo");
            return (Criteria) this;
        }

        public Criteria andFirstgoLessThan(String value) {
            addCriterion("firstgo <", value, "firstgo");
            return (Criteria) this;
        }

        public Criteria andFirstgoLessThanOrEqualTo(String value) {
            addCriterion("firstgo <=", value, "firstgo");
            return (Criteria) this;
        }

        public Criteria andFirstgoLike(String value) {
            addCriterion("firstgo like", value, "firstgo");
            return (Criteria) this;
        }

        public Criteria andFirstgoNotLike(String value) {
            addCriterion("firstgo not like", value, "firstgo");
            return (Criteria) this;
        }

        public Criteria andFirstgoIn(List<String> values) {
            addCriterion("firstgo in", values, "firstgo");
            return (Criteria) this;
        }

        public Criteria andFirstgoNotIn(List<String> values) {
            addCriterion("firstgo not in", values, "firstgo");
            return (Criteria) this;
        }

        public Criteria andFirstgoBetween(String value1, String value2) {
            addCriterion("firstgo between", value1, value2, "firstgo");
            return (Criteria) this;
        }

        public Criteria andFirstgoNotBetween(String value1, String value2) {
            addCriterion("firstgo not between", value1, value2, "firstgo");
            return (Criteria) this;
        }

        public Criteria andOtherfirstgoIsNull() {
            addCriterion("otherfirstgo is null");
            return (Criteria) this;
        }

        public Criteria andOtherfirstgoIsNotNull() {
            addCriterion("otherfirstgo is not null");
            return (Criteria) this;
        }

        public Criteria andOtherfirstgoEqualTo(String value) {
            addCriterion("otherfirstgo =", value, "otherfirstgo");
            return (Criteria) this;
        }

        public Criteria andOtherfirstgoNotEqualTo(String value) {
            addCriterion("otherfirstgo <>", value, "otherfirstgo");
            return (Criteria) this;
        }

        public Criteria andOtherfirstgoGreaterThan(String value) {
            addCriterion("otherfirstgo >", value, "otherfirstgo");
            return (Criteria) this;
        }

        public Criteria andOtherfirstgoGreaterThanOrEqualTo(String value) {
            addCriterion("otherfirstgo >=", value, "otherfirstgo");
            return (Criteria) this;
        }

        public Criteria andOtherfirstgoLessThan(String value) {
            addCriterion("otherfirstgo <", value, "otherfirstgo");
            return (Criteria) this;
        }

        public Criteria andOtherfirstgoLessThanOrEqualTo(String value) {
            addCriterion("otherfirstgo <=", value, "otherfirstgo");
            return (Criteria) this;
        }

        public Criteria andOtherfirstgoLike(String value) {
            addCriterion("otherfirstgo like", value, "otherfirstgo");
            return (Criteria) this;
        }

        public Criteria andOtherfirstgoNotLike(String value) {
            addCriterion("otherfirstgo not like", value, "otherfirstgo");
            return (Criteria) this;
        }

        public Criteria andOtherfirstgoIn(List<String> values) {
            addCriterion("otherfirstgo in", values, "otherfirstgo");
            return (Criteria) this;
        }

        public Criteria andOtherfirstgoNotIn(List<String> values) {
            addCriterion("otherfirstgo not in", values, "otherfirstgo");
            return (Criteria) this;
        }

        public Criteria andOtherfirstgoBetween(String value1, String value2) {
            addCriterion("otherfirstgo between", value1, value2, "otherfirstgo");
            return (Criteria) this;
        }

        public Criteria andOtherfirstgoNotBetween(String value1, String value2) {
            addCriterion("otherfirstgo not between", value1, value2, "otherfirstgo");
            return (Criteria) this;
        }

        public Criteria andOldIsNull() {
            addCriterion("`old` is null");
            return (Criteria) this;
        }

        public Criteria andOldIsNotNull() {
            addCriterion("`old` is not null");
            return (Criteria) this;
        }

        public Criteria andOldEqualTo(String value) {
            addCriterion("`old` =", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldNotEqualTo(String value) {
            addCriterion("`old` <>", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldGreaterThan(String value) {
            addCriterion("`old` >", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldGreaterThanOrEqualTo(String value) {
            addCriterion("`old` >=", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldLessThan(String value) {
            addCriterion("`old` <", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldLessThanOrEqualTo(String value) {
            addCriterion("`old` <=", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldLike(String value) {
            addCriterion("`old` like", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldNotLike(String value) {
            addCriterion("`old` not like", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldIn(List<String> values) {
            addCriterion("`old` in", values, "old");
            return (Criteria) this;
        }

        public Criteria andOldNotIn(List<String> values) {
            addCriterion("`old` not in", values, "old");
            return (Criteria) this;
        }

        public Criteria andOldBetween(String value1, String value2) {
            addCriterion("`old` between", value1, value2, "old");
            return (Criteria) this;
        }

        public Criteria andOldNotBetween(String value1, String value2) {
            addCriterion("`old` not between", value1, value2, "old");
            return (Criteria) this;
        }

        public Criteria andOldreasonIsNull() {
            addCriterion("oldreason is null");
            return (Criteria) this;
        }

        public Criteria andOldreasonIsNotNull() {
            addCriterion("oldreason is not null");
            return (Criteria) this;
        }

        public Criteria andOldreasonEqualTo(String value) {
            addCriterion("oldreason =", value, "oldreason");
            return (Criteria) this;
        }

        public Criteria andOldreasonNotEqualTo(String value) {
            addCriterion("oldreason <>", value, "oldreason");
            return (Criteria) this;
        }

        public Criteria andOldreasonGreaterThan(String value) {
            addCriterion("oldreason >", value, "oldreason");
            return (Criteria) this;
        }

        public Criteria andOldreasonGreaterThanOrEqualTo(String value) {
            addCriterion("oldreason >=", value, "oldreason");
            return (Criteria) this;
        }

        public Criteria andOldreasonLessThan(String value) {
            addCriterion("oldreason <", value, "oldreason");
            return (Criteria) this;
        }

        public Criteria andOldreasonLessThanOrEqualTo(String value) {
            addCriterion("oldreason <=", value, "oldreason");
            return (Criteria) this;
        }

        public Criteria andOldreasonLike(String value) {
            addCriterion("oldreason like", value, "oldreason");
            return (Criteria) this;
        }

        public Criteria andOldreasonNotLike(String value) {
            addCriterion("oldreason not like", value, "oldreason");
            return (Criteria) this;
        }

        public Criteria andOldreasonIn(List<String> values) {
            addCriterion("oldreason in", values, "oldreason");
            return (Criteria) this;
        }

        public Criteria andOldreasonNotIn(List<String> values) {
            addCriterion("oldreason not in", values, "oldreason");
            return (Criteria) this;
        }

        public Criteria andOldreasonBetween(String value1, String value2) {
            addCriterion("oldreason between", value1, value2, "oldreason");
            return (Criteria) this;
        }

        public Criteria andOldreasonNotBetween(String value1, String value2) {
            addCriterion("oldreason not between", value1, value2, "oldreason");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(String value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(String value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(String value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(String value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(String value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(String value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLike(String value) {
            addCriterion("total like", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotLike(String value) {
            addCriterion("total not like", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<String> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<String> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(String value1, String value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(String value1, String value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalreasonIsNull() {
            addCriterion("totalreason is null");
            return (Criteria) this;
        }

        public Criteria andTotalreasonIsNotNull() {
            addCriterion("totalreason is not null");
            return (Criteria) this;
        }

        public Criteria andTotalreasonEqualTo(String value) {
            addCriterion("totalreason =", value, "totalreason");
            return (Criteria) this;
        }

        public Criteria andTotalreasonNotEqualTo(String value) {
            addCriterion("totalreason <>", value, "totalreason");
            return (Criteria) this;
        }

        public Criteria andTotalreasonGreaterThan(String value) {
            addCriterion("totalreason >", value, "totalreason");
            return (Criteria) this;
        }

        public Criteria andTotalreasonGreaterThanOrEqualTo(String value) {
            addCriterion("totalreason >=", value, "totalreason");
            return (Criteria) this;
        }

        public Criteria andTotalreasonLessThan(String value) {
            addCriterion("totalreason <", value, "totalreason");
            return (Criteria) this;
        }

        public Criteria andTotalreasonLessThanOrEqualTo(String value) {
            addCriterion("totalreason <=", value, "totalreason");
            return (Criteria) this;
        }

        public Criteria andTotalreasonLike(String value) {
            addCriterion("totalreason like", value, "totalreason");
            return (Criteria) this;
        }

        public Criteria andTotalreasonNotLike(String value) {
            addCriterion("totalreason not like", value, "totalreason");
            return (Criteria) this;
        }

        public Criteria andTotalreasonIn(List<String> values) {
            addCriterion("totalreason in", values, "totalreason");
            return (Criteria) this;
        }

        public Criteria andTotalreasonNotIn(List<String> values) {
            addCriterion("totalreason not in", values, "totalreason");
            return (Criteria) this;
        }

        public Criteria andTotalreasonBetween(String value1, String value2) {
            addCriterion("totalreason between", value1, value2, "totalreason");
            return (Criteria) this;
        }

        public Criteria andTotalreasonNotBetween(String value1, String value2) {
            addCriterion("totalreason not between", value1, value2, "totalreason");
            return (Criteria) this;
        }

        public Criteria andFollowIsNull() {
            addCriterion("follow is null");
            return (Criteria) this;
        }

        public Criteria andFollowIsNotNull() {
            addCriterion("follow is not null");
            return (Criteria) this;
        }

        public Criteria andFollowEqualTo(String value) {
            addCriterion("follow =", value, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowNotEqualTo(String value) {
            addCriterion("follow <>", value, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowGreaterThan(String value) {
            addCriterion("follow >", value, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowGreaterThanOrEqualTo(String value) {
            addCriterion("follow >=", value, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowLessThan(String value) {
            addCriterion("follow <", value, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowLessThanOrEqualTo(String value) {
            addCriterion("follow <=", value, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowLike(String value) {
            addCriterion("follow like", value, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowNotLike(String value) {
            addCriterion("follow not like", value, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowIn(List<String> values) {
            addCriterion("follow in", values, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowNotIn(List<String> values) {
            addCriterion("follow not in", values, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowBetween(String value1, String value2) {
            addCriterion("follow between", value1, value2, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowNotBetween(String value1, String value2) {
            addCriterion("follow not between", value1, value2, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowreasonIsNull() {
            addCriterion("followreason is null");
            return (Criteria) this;
        }

        public Criteria andFollowreasonIsNotNull() {
            addCriterion("followreason is not null");
            return (Criteria) this;
        }

        public Criteria andFollowreasonEqualTo(String value) {
            addCriterion("followreason =", value, "followreason");
            return (Criteria) this;
        }

        public Criteria andFollowreasonNotEqualTo(String value) {
            addCriterion("followreason <>", value, "followreason");
            return (Criteria) this;
        }

        public Criteria andFollowreasonGreaterThan(String value) {
            addCriterion("followreason >", value, "followreason");
            return (Criteria) this;
        }

        public Criteria andFollowreasonGreaterThanOrEqualTo(String value) {
            addCriterion("followreason >=", value, "followreason");
            return (Criteria) this;
        }

        public Criteria andFollowreasonLessThan(String value) {
            addCriterion("followreason <", value, "followreason");
            return (Criteria) this;
        }

        public Criteria andFollowreasonLessThanOrEqualTo(String value) {
            addCriterion("followreason <=", value, "followreason");
            return (Criteria) this;
        }

        public Criteria andFollowreasonLike(String value) {
            addCriterion("followreason like", value, "followreason");
            return (Criteria) this;
        }

        public Criteria andFollowreasonNotLike(String value) {
            addCriterion("followreason not like", value, "followreason");
            return (Criteria) this;
        }

        public Criteria andFollowreasonIn(List<String> values) {
            addCriterion("followreason in", values, "followreason");
            return (Criteria) this;
        }

        public Criteria andFollowreasonNotIn(List<String> values) {
            addCriterion("followreason not in", values, "followreason");
            return (Criteria) this;
        }

        public Criteria andFollowreasonBetween(String value1, String value2) {
            addCriterion("followreason between", value1, value2, "followreason");
            return (Criteria) this;
        }

        public Criteria andFollowreasonNotBetween(String value1, String value2) {
            addCriterion("followreason not between", value1, value2, "followreason");
            return (Criteria) this;
        }

        public Criteria andHappenIsNull() {
            addCriterion("happen is null");
            return (Criteria) this;
        }

        public Criteria andHappenIsNotNull() {
            addCriterion("happen is not null");
            return (Criteria) this;
        }

        public Criteria andHappenEqualTo(String value) {
            addCriterion("happen =", value, "happen");
            return (Criteria) this;
        }

        public Criteria andHappenNotEqualTo(String value) {
            addCriterion("happen <>", value, "happen");
            return (Criteria) this;
        }

        public Criteria andHappenGreaterThan(String value) {
            addCriterion("happen >", value, "happen");
            return (Criteria) this;
        }

        public Criteria andHappenGreaterThanOrEqualTo(String value) {
            addCriterion("happen >=", value, "happen");
            return (Criteria) this;
        }

        public Criteria andHappenLessThan(String value) {
            addCriterion("happen <", value, "happen");
            return (Criteria) this;
        }

        public Criteria andHappenLessThanOrEqualTo(String value) {
            addCriterion("happen <=", value, "happen");
            return (Criteria) this;
        }

        public Criteria andHappenLike(String value) {
            addCriterion("happen like", value, "happen");
            return (Criteria) this;
        }

        public Criteria andHappenNotLike(String value) {
            addCriterion("happen not like", value, "happen");
            return (Criteria) this;
        }

        public Criteria andHappenIn(List<String> values) {
            addCriterion("happen in", values, "happen");
            return (Criteria) this;
        }

        public Criteria andHappenNotIn(List<String> values) {
            addCriterion("happen not in", values, "happen");
            return (Criteria) this;
        }

        public Criteria andHappenBetween(String value1, String value2) {
            addCriterion("happen between", value1, value2, "happen");
            return (Criteria) this;
        }

        public Criteria andHappenNotBetween(String value1, String value2) {
            addCriterion("happen not between", value1, value2, "happen");
            return (Criteria) this;
        }

        public Criteria andHappenreasonIsNull() {
            addCriterion("happenreason is null");
            return (Criteria) this;
        }

        public Criteria andHappenreasonIsNotNull() {
            addCriterion("happenreason is not null");
            return (Criteria) this;
        }

        public Criteria andHappenreasonEqualTo(String value) {
            addCriterion("happenreason =", value, "happenreason");
            return (Criteria) this;
        }

        public Criteria andHappenreasonNotEqualTo(String value) {
            addCriterion("happenreason <>", value, "happenreason");
            return (Criteria) this;
        }

        public Criteria andHappenreasonGreaterThan(String value) {
            addCriterion("happenreason >", value, "happenreason");
            return (Criteria) this;
        }

        public Criteria andHappenreasonGreaterThanOrEqualTo(String value) {
            addCriterion("happenreason >=", value, "happenreason");
            return (Criteria) this;
        }

        public Criteria andHappenreasonLessThan(String value) {
            addCriterion("happenreason <", value, "happenreason");
            return (Criteria) this;
        }

        public Criteria andHappenreasonLessThanOrEqualTo(String value) {
            addCriterion("happenreason <=", value, "happenreason");
            return (Criteria) this;
        }

        public Criteria andHappenreasonLike(String value) {
            addCriterion("happenreason like", value, "happenreason");
            return (Criteria) this;
        }

        public Criteria andHappenreasonNotLike(String value) {
            addCriterion("happenreason not like", value, "happenreason");
            return (Criteria) this;
        }

        public Criteria andHappenreasonIn(List<String> values) {
            addCriterion("happenreason in", values, "happenreason");
            return (Criteria) this;
        }

        public Criteria andHappenreasonNotIn(List<String> values) {
            addCriterion("happenreason not in", values, "happenreason");
            return (Criteria) this;
        }

        public Criteria andHappenreasonBetween(String value1, String value2) {
            addCriterion("happenreason between", value1, value2, "happenreason");
            return (Criteria) this;
        }

        public Criteria andHappenreasonNotBetween(String value1, String value2) {
            addCriterion("happenreason not between", value1, value2, "happenreason");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("`count` is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("`count` is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("`count` =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("`count` <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("`count` >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("`count` >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("`count` <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("`count` <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("`count` in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("`count` not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("`count` between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("`count` not between", value1, value2, "count");
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

        public Criteria andFirstMonthIsNull() {
            addCriterion("first_month is null");
            return (Criteria) this;
        }

        public Criteria andFirstMonthIsNotNull() {
            addCriterion("first_month is not null");
            return (Criteria) this;
        }

        public Criteria andFirstMonthEqualTo(Integer value) {
            addCriterion("first_month =", value, "firstMonth");
            return (Criteria) this;
        }

        public Criteria andFirstMonthNotEqualTo(Integer value) {
            addCriterion("first_month <>", value, "firstMonth");
            return (Criteria) this;
        }

        public Criteria andFirstMonthGreaterThan(Integer value) {
            addCriterion("first_month >", value, "firstMonth");
            return (Criteria) this;
        }

        public Criteria andFirstMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_month >=", value, "firstMonth");
            return (Criteria) this;
        }

        public Criteria andFirstMonthLessThan(Integer value) {
            addCriterion("first_month <", value, "firstMonth");
            return (Criteria) this;
        }

        public Criteria andFirstMonthLessThanOrEqualTo(Integer value) {
            addCriterion("first_month <=", value, "firstMonth");
            return (Criteria) this;
        }

        public Criteria andFirstMonthIn(List<Integer> values) {
            addCriterion("first_month in", values, "firstMonth");
            return (Criteria) this;
        }

        public Criteria andFirstMonthNotIn(List<Integer> values) {
            addCriterion("first_month not in", values, "firstMonth");
            return (Criteria) this;
        }

        public Criteria andFirstMonthBetween(Integer value1, Integer value2) {
            addCriterion("first_month between", value1, value2, "firstMonth");
            return (Criteria) this;
        }

        public Criteria andFirstMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("first_month not between", value1, value2, "firstMonth");
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