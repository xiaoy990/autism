package com.join.autism.entity.HzhCommon;

import java.util.ArrayList;
import java.util.List;

public class HzhCommonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HzhCommonExample() {
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

        public Criteria andLowIsNull() {
            addCriterion("low is null");
            return (Criteria) this;
        }

        public Criteria andLowIsNotNull() {
            addCriterion("low is not null");
            return (Criteria) this;
        }

        public Criteria andLowEqualTo(Integer value) {
            addCriterion("low =", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotEqualTo(Integer value) {
            addCriterion("low <>", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowGreaterThan(Integer value) {
            addCriterion("low >", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowGreaterThanOrEqualTo(Integer value) {
            addCriterion("low >=", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowLessThan(Integer value) {
            addCriterion("low <", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowLessThanOrEqualTo(Integer value) {
            addCriterion("low <=", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowIn(List<Integer> values) {
            addCriterion("low in", values, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotIn(List<Integer> values) {
            addCriterion("low not in", values, "low");
            return (Criteria) this;
        }

        public Criteria andLowBetween(Integer value1, Integer value2) {
            addCriterion("low between", value1, value2, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotBetween(Integer value1, Integer value2) {
            addCriterion("low not between", value1, value2, "low");
            return (Criteria) this;
        }

        public Criteria andLowreasonIsNull() {
            addCriterion("lowreason is null");
            return (Criteria) this;
        }

        public Criteria andLowreasonIsNotNull() {
            addCriterion("lowreason is not null");
            return (Criteria) this;
        }

        public Criteria andLowreasonEqualTo(String value) {
            addCriterion("lowreason =", value, "lowreason");
            return (Criteria) this;
        }

        public Criteria andLowreasonNotEqualTo(String value) {
            addCriterion("lowreason <>", value, "lowreason");
            return (Criteria) this;
        }

        public Criteria andLowreasonGreaterThan(String value) {
            addCriterion("lowreason >", value, "lowreason");
            return (Criteria) this;
        }

        public Criteria andLowreasonGreaterThanOrEqualTo(String value) {
            addCriterion("lowreason >=", value, "lowreason");
            return (Criteria) this;
        }

        public Criteria andLowreasonLessThan(String value) {
            addCriterion("lowreason <", value, "lowreason");
            return (Criteria) this;
        }

        public Criteria andLowreasonLessThanOrEqualTo(String value) {
            addCriterion("lowreason <=", value, "lowreason");
            return (Criteria) this;
        }

        public Criteria andLowreasonLike(String value) {
            addCriterion("lowreason like", value, "lowreason");
            return (Criteria) this;
        }

        public Criteria andLowreasonNotLike(String value) {
            addCriterion("lowreason not like", value, "lowreason");
            return (Criteria) this;
        }

        public Criteria andLowreasonIn(List<String> values) {
            addCriterion("lowreason in", values, "lowreason");
            return (Criteria) this;
        }

        public Criteria andLowreasonNotIn(List<String> values) {
            addCriterion("lowreason not in", values, "lowreason");
            return (Criteria) this;
        }

        public Criteria andLowreasonBetween(String value1, String value2) {
            addCriterion("lowreason between", value1, value2, "lowreason");
            return (Criteria) this;
        }

        public Criteria andLowreasonNotBetween(String value1, String value2) {
            addCriterion("lowreason not between", value1, value2, "lowreason");
            return (Criteria) this;
        }

        public Criteria andInfectIsNull() {
            addCriterion("infect is null");
            return (Criteria) this;
        }

        public Criteria andInfectIsNotNull() {
            addCriterion("infect is not null");
            return (Criteria) this;
        }

        public Criteria andInfectEqualTo(Integer value) {
            addCriterion("infect =", value, "infect");
            return (Criteria) this;
        }

        public Criteria andInfectNotEqualTo(Integer value) {
            addCriterion("infect <>", value, "infect");
            return (Criteria) this;
        }

        public Criteria andInfectGreaterThan(Integer value) {
            addCriterion("infect >", value, "infect");
            return (Criteria) this;
        }

        public Criteria andInfectGreaterThanOrEqualTo(Integer value) {
            addCriterion("infect >=", value, "infect");
            return (Criteria) this;
        }

        public Criteria andInfectLessThan(Integer value) {
            addCriterion("infect <", value, "infect");
            return (Criteria) this;
        }

        public Criteria andInfectLessThanOrEqualTo(Integer value) {
            addCriterion("infect <=", value, "infect");
            return (Criteria) this;
        }

        public Criteria andInfectIn(List<Integer> values) {
            addCriterion("infect in", values, "infect");
            return (Criteria) this;
        }

        public Criteria andInfectNotIn(List<Integer> values) {
            addCriterion("infect not in", values, "infect");
            return (Criteria) this;
        }

        public Criteria andInfectBetween(Integer value1, Integer value2) {
            addCriterion("infect between", value1, value2, "infect");
            return (Criteria) this;
        }

        public Criteria andInfectNotBetween(Integer value1, Integer value2) {
            addCriterion("infect not between", value1, value2, "infect");
            return (Criteria) this;
        }

        public Criteria andInfectreasonIsNull() {
            addCriterion("infectreason is null");
            return (Criteria) this;
        }

        public Criteria andInfectreasonIsNotNull() {
            addCriterion("infectreason is not null");
            return (Criteria) this;
        }

        public Criteria andInfectreasonEqualTo(String value) {
            addCriterion("infectreason =", value, "infectreason");
            return (Criteria) this;
        }

        public Criteria andInfectreasonNotEqualTo(String value) {
            addCriterion("infectreason <>", value, "infectreason");
            return (Criteria) this;
        }

        public Criteria andInfectreasonGreaterThan(String value) {
            addCriterion("infectreason >", value, "infectreason");
            return (Criteria) this;
        }

        public Criteria andInfectreasonGreaterThanOrEqualTo(String value) {
            addCriterion("infectreason >=", value, "infectreason");
            return (Criteria) this;
        }

        public Criteria andInfectreasonLessThan(String value) {
            addCriterion("infectreason <", value, "infectreason");
            return (Criteria) this;
        }

        public Criteria andInfectreasonLessThanOrEqualTo(String value) {
            addCriterion("infectreason <=", value, "infectreason");
            return (Criteria) this;
        }

        public Criteria andInfectreasonLike(String value) {
            addCriterion("infectreason like", value, "infectreason");
            return (Criteria) this;
        }

        public Criteria andInfectreasonNotLike(String value) {
            addCriterion("infectreason not like", value, "infectreason");
            return (Criteria) this;
        }

        public Criteria andInfectreasonIn(List<String> values) {
            addCriterion("infectreason in", values, "infectreason");
            return (Criteria) this;
        }

        public Criteria andInfectreasonNotIn(List<String> values) {
            addCriterion("infectreason not in", values, "infectreason");
            return (Criteria) this;
        }

        public Criteria andInfectreasonBetween(String value1, String value2) {
            addCriterion("infectreason between", value1, value2, "infectreason");
            return (Criteria) this;
        }

        public Criteria andInfectreasonNotBetween(String value1, String value2) {
            addCriterion("infectreason not between", value1, value2, "infectreason");
            return (Criteria) this;
        }

        public Criteria andStopIsNull() {
            addCriterion("stop is null");
            return (Criteria) this;
        }

        public Criteria andStopIsNotNull() {
            addCriterion("stop is not null");
            return (Criteria) this;
        }

        public Criteria andStopEqualTo(Integer value) {
            addCriterion("stop =", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopNotEqualTo(Integer value) {
            addCriterion("stop <>", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopGreaterThan(Integer value) {
            addCriterion("stop >", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopGreaterThanOrEqualTo(Integer value) {
            addCriterion("stop >=", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopLessThan(Integer value) {
            addCriterion("stop <", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopLessThanOrEqualTo(Integer value) {
            addCriterion("stop <=", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopIn(List<Integer> values) {
            addCriterion("stop in", values, "stop");
            return (Criteria) this;
        }

        public Criteria andStopNotIn(List<Integer> values) {
            addCriterion("stop not in", values, "stop");
            return (Criteria) this;
        }

        public Criteria andStopBetween(Integer value1, Integer value2) {
            addCriterion("stop between", value1, value2, "stop");
            return (Criteria) this;
        }

        public Criteria andStopNotBetween(Integer value1, Integer value2) {
            addCriterion("stop not between", value1, value2, "stop");
            return (Criteria) this;
        }

        public Criteria andStopreasonIsNull() {
            addCriterion("stopreason is null");
            return (Criteria) this;
        }

        public Criteria andStopreasonIsNotNull() {
            addCriterion("stopreason is not null");
            return (Criteria) this;
        }

        public Criteria andStopreasonEqualTo(String value) {
            addCriterion("stopreason =", value, "stopreason");
            return (Criteria) this;
        }

        public Criteria andStopreasonNotEqualTo(String value) {
            addCriterion("stopreason <>", value, "stopreason");
            return (Criteria) this;
        }

        public Criteria andStopreasonGreaterThan(String value) {
            addCriterion("stopreason >", value, "stopreason");
            return (Criteria) this;
        }

        public Criteria andStopreasonGreaterThanOrEqualTo(String value) {
            addCriterion("stopreason >=", value, "stopreason");
            return (Criteria) this;
        }

        public Criteria andStopreasonLessThan(String value) {
            addCriterion("stopreason <", value, "stopreason");
            return (Criteria) this;
        }

        public Criteria andStopreasonLessThanOrEqualTo(String value) {
            addCriterion("stopreason <=", value, "stopreason");
            return (Criteria) this;
        }

        public Criteria andStopreasonLike(String value) {
            addCriterion("stopreason like", value, "stopreason");
            return (Criteria) this;
        }

        public Criteria andStopreasonNotLike(String value) {
            addCriterion("stopreason not like", value, "stopreason");
            return (Criteria) this;
        }

        public Criteria andStopreasonIn(List<String> values) {
            addCriterion("stopreason in", values, "stopreason");
            return (Criteria) this;
        }

        public Criteria andStopreasonNotIn(List<String> values) {
            addCriterion("stopreason not in", values, "stopreason");
            return (Criteria) this;
        }

        public Criteria andStopreasonBetween(String value1, String value2) {
            addCriterion("stopreason between", value1, value2, "stopreason");
            return (Criteria) this;
        }

        public Criteria andStopreasonNotBetween(String value1, String value2) {
            addCriterion("stopreason not between", value1, value2, "stopreason");
            return (Criteria) this;
        }

        public Criteria andHighIsNull() {
            addCriterion("high is null");
            return (Criteria) this;
        }

        public Criteria andHighIsNotNull() {
            addCriterion("high is not null");
            return (Criteria) this;
        }

        public Criteria andHighEqualTo(Integer value) {
            addCriterion("high =", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotEqualTo(Integer value) {
            addCriterion("high <>", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighGreaterThan(Integer value) {
            addCriterion("high >", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighGreaterThanOrEqualTo(Integer value) {
            addCriterion("high >=", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLessThan(Integer value) {
            addCriterion("high <", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLessThanOrEqualTo(Integer value) {
            addCriterion("high <=", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighIn(List<Integer> values) {
            addCriterion("high in", values, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotIn(List<Integer> values) {
            addCriterion("high not in", values, "high");
            return (Criteria) this;
        }

        public Criteria andHighBetween(Integer value1, Integer value2) {
            addCriterion("high between", value1, value2, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotBetween(Integer value1, Integer value2) {
            addCriterion("high not between", value1, value2, "high");
            return (Criteria) this;
        }

        public Criteria andHighreasonIsNull() {
            addCriterion("highreason is null");
            return (Criteria) this;
        }

        public Criteria andHighreasonIsNotNull() {
            addCriterion("highreason is not null");
            return (Criteria) this;
        }

        public Criteria andHighreasonEqualTo(String value) {
            addCriterion("highreason =", value, "highreason");
            return (Criteria) this;
        }

        public Criteria andHighreasonNotEqualTo(String value) {
            addCriterion("highreason <>", value, "highreason");
            return (Criteria) this;
        }

        public Criteria andHighreasonGreaterThan(String value) {
            addCriterion("highreason >", value, "highreason");
            return (Criteria) this;
        }

        public Criteria andHighreasonGreaterThanOrEqualTo(String value) {
            addCriterion("highreason >=", value, "highreason");
            return (Criteria) this;
        }

        public Criteria andHighreasonLessThan(String value) {
            addCriterion("highreason <", value, "highreason");
            return (Criteria) this;
        }

        public Criteria andHighreasonLessThanOrEqualTo(String value) {
            addCriterion("highreason <=", value, "highreason");
            return (Criteria) this;
        }

        public Criteria andHighreasonLike(String value) {
            addCriterion("highreason like", value, "highreason");
            return (Criteria) this;
        }

        public Criteria andHighreasonNotLike(String value) {
            addCriterion("highreason not like", value, "highreason");
            return (Criteria) this;
        }

        public Criteria andHighreasonIn(List<String> values) {
            addCriterion("highreason in", values, "highreason");
            return (Criteria) this;
        }

        public Criteria andHighreasonNotIn(List<String> values) {
            addCriterion("highreason not in", values, "highreason");
            return (Criteria) this;
        }

        public Criteria andHighreasonBetween(String value1, String value2) {
            addCriterion("highreason between", value1, value2, "highreason");
            return (Criteria) this;
        }

        public Criteria andHighreasonNotBetween(String value1, String value2) {
            addCriterion("highreason not between", value1, value2, "highreason");
            return (Criteria) this;
        }

        public Criteria andAroundIsNull() {
            addCriterion("around is null");
            return (Criteria) this;
        }

        public Criteria andAroundIsNotNull() {
            addCriterion("around is not null");
            return (Criteria) this;
        }

        public Criteria andAroundEqualTo(Integer value) {
            addCriterion("around =", value, "around");
            return (Criteria) this;
        }

        public Criteria andAroundNotEqualTo(Integer value) {
            addCriterion("around <>", value, "around");
            return (Criteria) this;
        }

        public Criteria andAroundGreaterThan(Integer value) {
            addCriterion("around >", value, "around");
            return (Criteria) this;
        }

        public Criteria andAroundGreaterThanOrEqualTo(Integer value) {
            addCriterion("around >=", value, "around");
            return (Criteria) this;
        }

        public Criteria andAroundLessThan(Integer value) {
            addCriterion("around <", value, "around");
            return (Criteria) this;
        }

        public Criteria andAroundLessThanOrEqualTo(Integer value) {
            addCriterion("around <=", value, "around");
            return (Criteria) this;
        }

        public Criteria andAroundIn(List<Integer> values) {
            addCriterion("around in", values, "around");
            return (Criteria) this;
        }

        public Criteria andAroundNotIn(List<Integer> values) {
            addCriterion("around not in", values, "around");
            return (Criteria) this;
        }

        public Criteria andAroundBetween(Integer value1, Integer value2) {
            addCriterion("around between", value1, value2, "around");
            return (Criteria) this;
        }

        public Criteria andAroundNotBetween(Integer value1, Integer value2) {
            addCriterion("around not between", value1, value2, "around");
            return (Criteria) this;
        }

        public Criteria andAroundreasonIsNull() {
            addCriterion("aroundreason is null");
            return (Criteria) this;
        }

        public Criteria andAroundreasonIsNotNull() {
            addCriterion("aroundreason is not null");
            return (Criteria) this;
        }

        public Criteria andAroundreasonEqualTo(String value) {
            addCriterion("aroundreason =", value, "aroundreason");
            return (Criteria) this;
        }

        public Criteria andAroundreasonNotEqualTo(String value) {
            addCriterion("aroundreason <>", value, "aroundreason");
            return (Criteria) this;
        }

        public Criteria andAroundreasonGreaterThan(String value) {
            addCriterion("aroundreason >", value, "aroundreason");
            return (Criteria) this;
        }

        public Criteria andAroundreasonGreaterThanOrEqualTo(String value) {
            addCriterion("aroundreason >=", value, "aroundreason");
            return (Criteria) this;
        }

        public Criteria andAroundreasonLessThan(String value) {
            addCriterion("aroundreason <", value, "aroundreason");
            return (Criteria) this;
        }

        public Criteria andAroundreasonLessThanOrEqualTo(String value) {
            addCriterion("aroundreason <=", value, "aroundreason");
            return (Criteria) this;
        }

        public Criteria andAroundreasonLike(String value) {
            addCriterion("aroundreason like", value, "aroundreason");
            return (Criteria) this;
        }

        public Criteria andAroundreasonNotLike(String value) {
            addCriterion("aroundreason not like", value, "aroundreason");
            return (Criteria) this;
        }

        public Criteria andAroundreasonIn(List<String> values) {
            addCriterion("aroundreason in", values, "aroundreason");
            return (Criteria) this;
        }

        public Criteria andAroundreasonNotIn(List<String> values) {
            addCriterion("aroundreason not in", values, "aroundreason");
            return (Criteria) this;
        }

        public Criteria andAroundreasonBetween(String value1, String value2) {
            addCriterion("aroundreason between", value1, value2, "aroundreason");
            return (Criteria) this;
        }

        public Criteria andAroundreasonNotBetween(String value1, String value2) {
            addCriterion("aroundreason not between", value1, value2, "aroundreason");
            return (Criteria) this;
        }

        public Criteria andListenIsNull() {
            addCriterion("`listen` is null");
            return (Criteria) this;
        }

        public Criteria andListenIsNotNull() {
            addCriterion("`listen` is not null");
            return (Criteria) this;
        }

        public Criteria andListenEqualTo(Integer value) {
            addCriterion("`listen` =", value, "listen");
            return (Criteria) this;
        }

        public Criteria andListenNotEqualTo(Integer value) {
            addCriterion("`listen` <>", value, "listen");
            return (Criteria) this;
        }

        public Criteria andListenGreaterThan(Integer value) {
            addCriterion("`listen` >", value, "listen");
            return (Criteria) this;
        }

        public Criteria andListenGreaterThanOrEqualTo(Integer value) {
            addCriterion("`listen` >=", value, "listen");
            return (Criteria) this;
        }

        public Criteria andListenLessThan(Integer value) {
            addCriterion("`listen` <", value, "listen");
            return (Criteria) this;
        }

        public Criteria andListenLessThanOrEqualTo(Integer value) {
            addCriterion("`listen` <=", value, "listen");
            return (Criteria) this;
        }

        public Criteria andListenIn(List<Integer> values) {
            addCriterion("`listen` in", values, "listen");
            return (Criteria) this;
        }

        public Criteria andListenNotIn(List<Integer> values) {
            addCriterion("`listen` not in", values, "listen");
            return (Criteria) this;
        }

        public Criteria andListenBetween(Integer value1, Integer value2) {
            addCriterion("`listen` between", value1, value2, "listen");
            return (Criteria) this;
        }

        public Criteria andListenNotBetween(Integer value1, Integer value2) {
            addCriterion("`listen` not between", value1, value2, "listen");
            return (Criteria) this;
        }

        public Criteria andIsAudiphonesIsNull() {
            addCriterion("is_audiphones is null");
            return (Criteria) this;
        }

        public Criteria andIsAudiphonesIsNotNull() {
            addCriterion("is_audiphones is not null");
            return (Criteria) this;
        }

        public Criteria andIsAudiphonesEqualTo(Integer value) {
            addCriterion("is_audiphones =", value, "isAudiphones");
            return (Criteria) this;
        }

        public Criteria andIsAudiphonesNotEqualTo(Integer value) {
            addCriterion("is_audiphones <>", value, "isAudiphones");
            return (Criteria) this;
        }

        public Criteria andIsAudiphonesGreaterThan(Integer value) {
            addCriterion("is_audiphones >", value, "isAudiphones");
            return (Criteria) this;
        }

        public Criteria andIsAudiphonesGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_audiphones >=", value, "isAudiphones");
            return (Criteria) this;
        }

        public Criteria andIsAudiphonesLessThan(Integer value) {
            addCriterion("is_audiphones <", value, "isAudiphones");
            return (Criteria) this;
        }

        public Criteria andIsAudiphonesLessThanOrEqualTo(Integer value) {
            addCriterion("is_audiphones <=", value, "isAudiphones");
            return (Criteria) this;
        }

        public Criteria andIsAudiphonesIn(List<Integer> values) {
            addCriterion("is_audiphones in", values, "isAudiphones");
            return (Criteria) this;
        }

        public Criteria andIsAudiphonesNotIn(List<Integer> values) {
            addCriterion("is_audiphones not in", values, "isAudiphones");
            return (Criteria) this;
        }

        public Criteria andIsAudiphonesBetween(Integer value1, Integer value2) {
            addCriterion("is_audiphones between", value1, value2, "isAudiphones");
            return (Criteria) this;
        }

        public Criteria andIsAudiphonesNotBetween(Integer value1, Integer value2) {
            addCriterion("is_audiphones not between", value1, value2, "isAudiphones");
            return (Criteria) this;
        }

        public Criteria andListenreasonIsNull() {
            addCriterion("listenreason is null");
            return (Criteria) this;
        }

        public Criteria andListenreasonIsNotNull() {
            addCriterion("listenreason is not null");
            return (Criteria) this;
        }

        public Criteria andListenreasonEqualTo(String value) {
            addCriterion("listenreason =", value, "listenreason");
            return (Criteria) this;
        }

        public Criteria andListenreasonNotEqualTo(String value) {
            addCriterion("listenreason <>", value, "listenreason");
            return (Criteria) this;
        }

        public Criteria andListenreasonGreaterThan(String value) {
            addCriterion("listenreason >", value, "listenreason");
            return (Criteria) this;
        }

        public Criteria andListenreasonGreaterThanOrEqualTo(String value) {
            addCriterion("listenreason >=", value, "listenreason");
            return (Criteria) this;
        }

        public Criteria andListenreasonLessThan(String value) {
            addCriterion("listenreason <", value, "listenreason");
            return (Criteria) this;
        }

        public Criteria andListenreasonLessThanOrEqualTo(String value) {
            addCriterion("listenreason <=", value, "listenreason");
            return (Criteria) this;
        }

        public Criteria andListenreasonLike(String value) {
            addCriterion("listenreason like", value, "listenreason");
            return (Criteria) this;
        }

        public Criteria andListenreasonNotLike(String value) {
            addCriterion("listenreason not like", value, "listenreason");
            return (Criteria) this;
        }

        public Criteria andListenreasonIn(List<String> values) {
            addCriterion("listenreason in", values, "listenreason");
            return (Criteria) this;
        }

        public Criteria andListenreasonNotIn(List<String> values) {
            addCriterion("listenreason not in", values, "listenreason");
            return (Criteria) this;
        }

        public Criteria andListenreasonBetween(String value1, String value2) {
            addCriterion("listenreason between", value1, value2, "listenreason");
            return (Criteria) this;
        }

        public Criteria andListenreasonNotBetween(String value1, String value2) {
            addCriterion("listenreason not between", value1, value2, "listenreason");
            return (Criteria) this;
        }

        public Criteria andEyeIsNull() {
            addCriterion("eye is null");
            return (Criteria) this;
        }

        public Criteria andEyeIsNotNull() {
            addCriterion("eye is not null");
            return (Criteria) this;
        }

        public Criteria andEyeEqualTo(Integer value) {
            addCriterion("eye =", value, "eye");
            return (Criteria) this;
        }

        public Criteria andEyeNotEqualTo(Integer value) {
            addCriterion("eye <>", value, "eye");
            return (Criteria) this;
        }

        public Criteria andEyeGreaterThan(Integer value) {
            addCriterion("eye >", value, "eye");
            return (Criteria) this;
        }

        public Criteria andEyeGreaterThanOrEqualTo(Integer value) {
            addCriterion("eye >=", value, "eye");
            return (Criteria) this;
        }

        public Criteria andEyeLessThan(Integer value) {
            addCriterion("eye <", value, "eye");
            return (Criteria) this;
        }

        public Criteria andEyeLessThanOrEqualTo(Integer value) {
            addCriterion("eye <=", value, "eye");
            return (Criteria) this;
        }

        public Criteria andEyeIn(List<Integer> values) {
            addCriterion("eye in", values, "eye");
            return (Criteria) this;
        }

        public Criteria andEyeNotIn(List<Integer> values) {
            addCriterion("eye not in", values, "eye");
            return (Criteria) this;
        }

        public Criteria andEyeBetween(Integer value1, Integer value2) {
            addCriterion("eye between", value1, value2, "eye");
            return (Criteria) this;
        }

        public Criteria andEyeNotBetween(Integer value1, Integer value2) {
            addCriterion("eye not between", value1, value2, "eye");
            return (Criteria) this;
        }

        public Criteria andIsGlassesIsNull() {
            addCriterion("is_glasses is null");
            return (Criteria) this;
        }

        public Criteria andIsGlassesIsNotNull() {
            addCriterion("is_glasses is not null");
            return (Criteria) this;
        }

        public Criteria andIsGlassesEqualTo(Integer value) {
            addCriterion("is_glasses =", value, "isGlasses");
            return (Criteria) this;
        }

        public Criteria andIsGlassesNotEqualTo(Integer value) {
            addCriterion("is_glasses <>", value, "isGlasses");
            return (Criteria) this;
        }

        public Criteria andIsGlassesGreaterThan(Integer value) {
            addCriterion("is_glasses >", value, "isGlasses");
            return (Criteria) this;
        }

        public Criteria andIsGlassesGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_glasses >=", value, "isGlasses");
            return (Criteria) this;
        }

        public Criteria andIsGlassesLessThan(Integer value) {
            addCriterion("is_glasses <", value, "isGlasses");
            return (Criteria) this;
        }

        public Criteria andIsGlassesLessThanOrEqualTo(Integer value) {
            addCriterion("is_glasses <=", value, "isGlasses");
            return (Criteria) this;
        }

        public Criteria andIsGlassesIn(List<Integer> values) {
            addCriterion("is_glasses in", values, "isGlasses");
            return (Criteria) this;
        }

        public Criteria andIsGlassesNotIn(List<Integer> values) {
            addCriterion("is_glasses not in", values, "isGlasses");
            return (Criteria) this;
        }

        public Criteria andIsGlassesBetween(Integer value1, Integer value2) {
            addCriterion("is_glasses between", value1, value2, "isGlasses");
            return (Criteria) this;
        }

        public Criteria andIsGlassesNotBetween(Integer value1, Integer value2) {
            addCriterion("is_glasses not between", value1, value2, "isGlasses");
            return (Criteria) this;
        }

        public Criteria andEyereasonIsNull() {
            addCriterion("eyereason is null");
            return (Criteria) this;
        }

        public Criteria andEyereasonIsNotNull() {
            addCriterion("eyereason is not null");
            return (Criteria) this;
        }

        public Criteria andEyereasonEqualTo(String value) {
            addCriterion("eyereason =", value, "eyereason");
            return (Criteria) this;
        }

        public Criteria andEyereasonNotEqualTo(String value) {
            addCriterion("eyereason <>", value, "eyereason");
            return (Criteria) this;
        }

        public Criteria andEyereasonGreaterThan(String value) {
            addCriterion("eyereason >", value, "eyereason");
            return (Criteria) this;
        }

        public Criteria andEyereasonGreaterThanOrEqualTo(String value) {
            addCriterion("eyereason >=", value, "eyereason");
            return (Criteria) this;
        }

        public Criteria andEyereasonLessThan(String value) {
            addCriterion("eyereason <", value, "eyereason");
            return (Criteria) this;
        }

        public Criteria andEyereasonLessThanOrEqualTo(String value) {
            addCriterion("eyereason <=", value, "eyereason");
            return (Criteria) this;
        }

        public Criteria andEyereasonLike(String value) {
            addCriterion("eyereason like", value, "eyereason");
            return (Criteria) this;
        }

        public Criteria andEyereasonNotLike(String value) {
            addCriterion("eyereason not like", value, "eyereason");
            return (Criteria) this;
        }

        public Criteria andEyereasonIn(List<String> values) {
            addCriterion("eyereason in", values, "eyereason");
            return (Criteria) this;
        }

        public Criteria andEyereasonNotIn(List<String> values) {
            addCriterion("eyereason not in", values, "eyereason");
            return (Criteria) this;
        }

        public Criteria andEyereasonBetween(String value1, String value2) {
            addCriterion("eyereason between", value1, value2, "eyereason");
            return (Criteria) this;
        }

        public Criteria andEyereasonNotBetween(String value1, String value2) {
            addCriterion("eyereason not between", value1, value2, "eyereason");
            return (Criteria) this;
        }

        public Criteria andDiseaseIsNull() {
            addCriterion("disease is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseIsNotNull() {
            addCriterion("disease is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseEqualTo(Integer value) {
            addCriterion("disease =", value, "disease");
            return (Criteria) this;
        }

        public Criteria andDiseaseNotEqualTo(Integer value) {
            addCriterion("disease <>", value, "disease");
            return (Criteria) this;
        }

        public Criteria andDiseaseGreaterThan(Integer value) {
            addCriterion("disease >", value, "disease");
            return (Criteria) this;
        }

        public Criteria andDiseaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("disease >=", value, "disease");
            return (Criteria) this;
        }

        public Criteria andDiseaseLessThan(Integer value) {
            addCriterion("disease <", value, "disease");
            return (Criteria) this;
        }

        public Criteria andDiseaseLessThanOrEqualTo(Integer value) {
            addCriterion("disease <=", value, "disease");
            return (Criteria) this;
        }

        public Criteria andDiseaseIn(List<Integer> values) {
            addCriterion("disease in", values, "disease");
            return (Criteria) this;
        }

        public Criteria andDiseaseNotIn(List<Integer> values) {
            addCriterion("disease not in", values, "disease");
            return (Criteria) this;
        }

        public Criteria andDiseaseBetween(Integer value1, Integer value2) {
            addCriterion("disease between", value1, value2, "disease");
            return (Criteria) this;
        }

        public Criteria andDiseaseNotBetween(Integer value1, Integer value2) {
            addCriterion("disease not between", value1, value2, "disease");
            return (Criteria) this;
        }

        public Criteria andDiseasereasonIsNull() {
            addCriterion("diseasereason is null");
            return (Criteria) this;
        }

        public Criteria andDiseasereasonIsNotNull() {
            addCriterion("diseasereason is not null");
            return (Criteria) this;
        }

        public Criteria andDiseasereasonEqualTo(String value) {
            addCriterion("diseasereason =", value, "diseasereason");
            return (Criteria) this;
        }

        public Criteria andDiseasereasonNotEqualTo(String value) {
            addCriterion("diseasereason <>", value, "diseasereason");
            return (Criteria) this;
        }

        public Criteria andDiseasereasonGreaterThan(String value) {
            addCriterion("diseasereason >", value, "diseasereason");
            return (Criteria) this;
        }

        public Criteria andDiseasereasonGreaterThanOrEqualTo(String value) {
            addCriterion("diseasereason >=", value, "diseasereason");
            return (Criteria) this;
        }

        public Criteria andDiseasereasonLessThan(String value) {
            addCriterion("diseasereason <", value, "diseasereason");
            return (Criteria) this;
        }

        public Criteria andDiseasereasonLessThanOrEqualTo(String value) {
            addCriterion("diseasereason <=", value, "diseasereason");
            return (Criteria) this;
        }

        public Criteria andDiseasereasonLike(String value) {
            addCriterion("diseasereason like", value, "diseasereason");
            return (Criteria) this;
        }

        public Criteria andDiseasereasonNotLike(String value) {
            addCriterion("diseasereason not like", value, "diseasereason");
            return (Criteria) this;
        }

        public Criteria andDiseasereasonIn(List<String> values) {
            addCriterion("diseasereason in", values, "diseasereason");
            return (Criteria) this;
        }

        public Criteria andDiseasereasonNotIn(List<String> values) {
            addCriterion("diseasereason not in", values, "diseasereason");
            return (Criteria) this;
        }

        public Criteria andDiseasereasonBetween(String value1, String value2) {
            addCriterion("diseasereason between", value1, value2, "diseasereason");
            return (Criteria) this;
        }

        public Criteria andDiseasereasonNotBetween(String value1, String value2) {
            addCriterion("diseasereason not between", value1, value2, "diseasereason");
            return (Criteria) this;
        }

        public Criteria andLaxIsNull() {
            addCriterion("lax is null");
            return (Criteria) this;
        }

        public Criteria andLaxIsNotNull() {
            addCriterion("lax is not null");
            return (Criteria) this;
        }

        public Criteria andLaxEqualTo(Integer value) {
            addCriterion("lax =", value, "lax");
            return (Criteria) this;
        }

        public Criteria andLaxNotEqualTo(Integer value) {
            addCriterion("lax <>", value, "lax");
            return (Criteria) this;
        }

        public Criteria andLaxGreaterThan(Integer value) {
            addCriterion("lax >", value, "lax");
            return (Criteria) this;
        }

        public Criteria andLaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("lax >=", value, "lax");
            return (Criteria) this;
        }

        public Criteria andLaxLessThan(Integer value) {
            addCriterion("lax <", value, "lax");
            return (Criteria) this;
        }

        public Criteria andLaxLessThanOrEqualTo(Integer value) {
            addCriterion("lax <=", value, "lax");
            return (Criteria) this;
        }

        public Criteria andLaxIn(List<Integer> values) {
            addCriterion("lax in", values, "lax");
            return (Criteria) this;
        }

        public Criteria andLaxNotIn(List<Integer> values) {
            addCriterion("lax not in", values, "lax");
            return (Criteria) this;
        }

        public Criteria andLaxBetween(Integer value1, Integer value2) {
            addCriterion("lax between", value1, value2, "lax");
            return (Criteria) this;
        }

        public Criteria andLaxNotBetween(Integer value1, Integer value2) {
            addCriterion("lax not between", value1, value2, "lax");
            return (Criteria) this;
        }

        public Criteria andLaxreasonIsNull() {
            addCriterion("laxreason is null");
            return (Criteria) this;
        }

        public Criteria andLaxreasonIsNotNull() {
            addCriterion("laxreason is not null");
            return (Criteria) this;
        }

        public Criteria andLaxreasonEqualTo(String value) {
            addCriterion("laxreason =", value, "laxreason");
            return (Criteria) this;
        }

        public Criteria andLaxreasonNotEqualTo(String value) {
            addCriterion("laxreason <>", value, "laxreason");
            return (Criteria) this;
        }

        public Criteria andLaxreasonGreaterThan(String value) {
            addCriterion("laxreason >", value, "laxreason");
            return (Criteria) this;
        }

        public Criteria andLaxreasonGreaterThanOrEqualTo(String value) {
            addCriterion("laxreason >=", value, "laxreason");
            return (Criteria) this;
        }

        public Criteria andLaxreasonLessThan(String value) {
            addCriterion("laxreason <", value, "laxreason");
            return (Criteria) this;
        }

        public Criteria andLaxreasonLessThanOrEqualTo(String value) {
            addCriterion("laxreason <=", value, "laxreason");
            return (Criteria) this;
        }

        public Criteria andLaxreasonLike(String value) {
            addCriterion("laxreason like", value, "laxreason");
            return (Criteria) this;
        }

        public Criteria andLaxreasonNotLike(String value) {
            addCriterion("laxreason not like", value, "laxreason");
            return (Criteria) this;
        }

        public Criteria andLaxreasonIn(List<String> values) {
            addCriterion("laxreason in", values, "laxreason");
            return (Criteria) this;
        }

        public Criteria andLaxreasonNotIn(List<String> values) {
            addCriterion("laxreason not in", values, "laxreason");
            return (Criteria) this;
        }

        public Criteria andLaxreasonBetween(String value1, String value2) {
            addCriterion("laxreason between", value1, value2, "laxreason");
            return (Criteria) this;
        }

        public Criteria andLaxreasonNotBetween(String value1, String value2) {
            addCriterion("laxreason not between", value1, value2, "laxreason");
            return (Criteria) this;
        }

        public Criteria andVaccinIsNull() {
            addCriterion("vaccin is null");
            return (Criteria) this;
        }

        public Criteria andVaccinIsNotNull() {
            addCriterion("vaccin is not null");
            return (Criteria) this;
        }

        public Criteria andVaccinEqualTo(Integer value) {
            addCriterion("vaccin =", value, "vaccin");
            return (Criteria) this;
        }

        public Criteria andVaccinNotEqualTo(Integer value) {
            addCriterion("vaccin <>", value, "vaccin");
            return (Criteria) this;
        }

        public Criteria andVaccinGreaterThan(Integer value) {
            addCriterion("vaccin >", value, "vaccin");
            return (Criteria) this;
        }

        public Criteria andVaccinGreaterThanOrEqualTo(Integer value) {
            addCriterion("vaccin >=", value, "vaccin");
            return (Criteria) this;
        }

        public Criteria andVaccinLessThan(Integer value) {
            addCriterion("vaccin <", value, "vaccin");
            return (Criteria) this;
        }

        public Criteria andVaccinLessThanOrEqualTo(Integer value) {
            addCriterion("vaccin <=", value, "vaccin");
            return (Criteria) this;
        }

        public Criteria andVaccinIn(List<Integer> values) {
            addCriterion("vaccin in", values, "vaccin");
            return (Criteria) this;
        }

        public Criteria andVaccinNotIn(List<Integer> values) {
            addCriterion("vaccin not in", values, "vaccin");
            return (Criteria) this;
        }

        public Criteria andVaccinBetween(Integer value1, Integer value2) {
            addCriterion("vaccin between", value1, value2, "vaccin");
            return (Criteria) this;
        }

        public Criteria andVaccinNotBetween(Integer value1, Integer value2) {
            addCriterion("vaccin not between", value1, value2, "vaccin");
            return (Criteria) this;
        }

        public Criteria andVaccinreasonIsNull() {
            addCriterion("vaccinreason is null");
            return (Criteria) this;
        }

        public Criteria andVaccinreasonIsNotNull() {
            addCriterion("vaccinreason is not null");
            return (Criteria) this;
        }

        public Criteria andVaccinreasonEqualTo(String value) {
            addCriterion("vaccinreason =", value, "vaccinreason");
            return (Criteria) this;
        }

        public Criteria andVaccinreasonNotEqualTo(String value) {
            addCriterion("vaccinreason <>", value, "vaccinreason");
            return (Criteria) this;
        }

        public Criteria andVaccinreasonGreaterThan(String value) {
            addCriterion("vaccinreason >", value, "vaccinreason");
            return (Criteria) this;
        }

        public Criteria andVaccinreasonGreaterThanOrEqualTo(String value) {
            addCriterion("vaccinreason >=", value, "vaccinreason");
            return (Criteria) this;
        }

        public Criteria andVaccinreasonLessThan(String value) {
            addCriterion("vaccinreason <", value, "vaccinreason");
            return (Criteria) this;
        }

        public Criteria andVaccinreasonLessThanOrEqualTo(String value) {
            addCriterion("vaccinreason <=", value, "vaccinreason");
            return (Criteria) this;
        }

        public Criteria andVaccinreasonLike(String value) {
            addCriterion("vaccinreason like", value, "vaccinreason");
            return (Criteria) this;
        }

        public Criteria andVaccinreasonNotLike(String value) {
            addCriterion("vaccinreason not like", value, "vaccinreason");
            return (Criteria) this;
        }

        public Criteria andVaccinreasonIn(List<String> values) {
            addCriterion("vaccinreason in", values, "vaccinreason");
            return (Criteria) this;
        }

        public Criteria andVaccinreasonNotIn(List<String> values) {
            addCriterion("vaccinreason not in", values, "vaccinreason");
            return (Criteria) this;
        }

        public Criteria andVaccinreasonBetween(String value1, String value2) {
            addCriterion("vaccinreason between", value1, value2, "vaccinreason");
            return (Criteria) this;
        }

        public Criteria andVaccinreasonNotBetween(String value1, String value2) {
            addCriterion("vaccinreason not between", value1, value2, "vaccinreason");
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