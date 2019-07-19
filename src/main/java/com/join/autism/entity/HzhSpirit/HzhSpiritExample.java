package com.join.autism.entity.HzhSpirit;

import java.util.ArrayList;
import java.util.List;

public class HzhSpiritExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HzhSpiritExample() {
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

        public Criteria andSicknumIsNull() {
            addCriterion("sicknum is null");
            return (Criteria) this;
        }

        public Criteria andSicknumIsNotNull() {
            addCriterion("sicknum is not null");
            return (Criteria) this;
        }

        public Criteria andSicknumEqualTo(String value) {
            addCriterion("sicknum =", value, "sicknum");
            return (Criteria) this;
        }

        public Criteria andSicknumNotEqualTo(String value) {
            addCriterion("sicknum <>", value, "sicknum");
            return (Criteria) this;
        }

        public Criteria andSicknumGreaterThan(String value) {
            addCriterion("sicknum >", value, "sicknum");
            return (Criteria) this;
        }

        public Criteria andSicknumGreaterThanOrEqualTo(String value) {
            addCriterion("sicknum >=", value, "sicknum");
            return (Criteria) this;
        }

        public Criteria andSicknumLessThan(String value) {
            addCriterion("sicknum <", value, "sicknum");
            return (Criteria) this;
        }

        public Criteria andSicknumLessThanOrEqualTo(String value) {
            addCriterion("sicknum <=", value, "sicknum");
            return (Criteria) this;
        }

        public Criteria andSicknumLike(String value) {
            addCriterion("sicknum like", value, "sicknum");
            return (Criteria) this;
        }

        public Criteria andSicknumNotLike(String value) {
            addCriterion("sicknum not like", value, "sicknum");
            return (Criteria) this;
        }

        public Criteria andSicknumIn(List<String> values) {
            addCriterion("sicknum in", values, "sicknum");
            return (Criteria) this;
        }

        public Criteria andSicknumNotIn(List<String> values) {
            addCriterion("sicknum not in", values, "sicknum");
            return (Criteria) this;
        }

        public Criteria andSicknumBetween(String value1, String value2) {
            addCriterion("sicknum between", value1, value2, "sicknum");
            return (Criteria) this;
        }

        public Criteria andSicknumNotBetween(String value1, String value2) {
            addCriterion("sicknum not between", value1, value2, "sicknum");
            return (Criteria) this;
        }

        public Criteria andDoctorIsNull() {
            addCriterion("doctor is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIsNotNull() {
            addCriterion("doctor is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorEqualTo(String value) {
            addCriterion("doctor =", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotEqualTo(String value) {
            addCriterion("doctor <>", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorGreaterThan(String value) {
            addCriterion("doctor >", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorGreaterThanOrEqualTo(String value) {
            addCriterion("doctor >=", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorLessThan(String value) {
            addCriterion("doctor <", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorLessThanOrEqualTo(String value) {
            addCriterion("doctor <=", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorLike(String value) {
            addCriterion("doctor like", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotLike(String value) {
            addCriterion("doctor not like", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorIn(List<String> values) {
            addCriterion("doctor in", values, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotIn(List<String> values) {
            addCriterion("doctor not in", values, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorBetween(String value1, String value2) {
            addCriterion("doctor between", value1, value2, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotBetween(String value1, String value2) {
            addCriterion("doctor not between", value1, value2, "doctor");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNull() {
            addCriterion("`datetime` is null");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNotNull() {
            addCriterion("`datetime` is not null");
            return (Criteria) this;
        }

        public Criteria andDatetimeEqualTo(String value) {
            addCriterion("`datetime` =", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotEqualTo(String value) {
            addCriterion("`datetime` <>", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThan(String value) {
            addCriterion("`datetime` >", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("`datetime` >=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThan(String value) {
            addCriterion("`datetime` <", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThanOrEqualTo(String value) {
            addCriterion("`datetime` <=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLike(String value) {
            addCriterion("`datetime` like", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotLike(String value) {
            addCriterion("`datetime` not like", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeIn(List<String> values) {
            addCriterion("`datetime` in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotIn(List<String> values) {
            addCriterion("`datetime` not in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeBetween(String value1, String value2) {
            addCriterion("`datetime` between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotBetween(String value1, String value2) {
            addCriterion("`datetime` not between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andLivenumIsNull() {
            addCriterion("livenum is null");
            return (Criteria) this;
        }

        public Criteria andLivenumIsNotNull() {
            addCriterion("livenum is not null");
            return (Criteria) this;
        }

        public Criteria andLivenumEqualTo(String value) {
            addCriterion("livenum =", value, "livenum");
            return (Criteria) this;
        }

        public Criteria andLivenumNotEqualTo(String value) {
            addCriterion("livenum <>", value, "livenum");
            return (Criteria) this;
        }

        public Criteria andLivenumGreaterThan(String value) {
            addCriterion("livenum >", value, "livenum");
            return (Criteria) this;
        }

        public Criteria andLivenumGreaterThanOrEqualTo(String value) {
            addCriterion("livenum >=", value, "livenum");
            return (Criteria) this;
        }

        public Criteria andLivenumLessThan(String value) {
            addCriterion("livenum <", value, "livenum");
            return (Criteria) this;
        }

        public Criteria andLivenumLessThanOrEqualTo(String value) {
            addCriterion("livenum <=", value, "livenum");
            return (Criteria) this;
        }

        public Criteria andLivenumLike(String value) {
            addCriterion("livenum like", value, "livenum");
            return (Criteria) this;
        }

        public Criteria andLivenumNotLike(String value) {
            addCriterion("livenum not like", value, "livenum");
            return (Criteria) this;
        }

        public Criteria andLivenumIn(List<String> values) {
            addCriterion("livenum in", values, "livenum");
            return (Criteria) this;
        }

        public Criteria andLivenumNotIn(List<String> values) {
            addCriterion("livenum not in", values, "livenum");
            return (Criteria) this;
        }

        public Criteria andLivenumBetween(String value1, String value2) {
            addCriterion("livenum between", value1, value2, "livenum");
            return (Criteria) this;
        }

        public Criteria andLivenumNotBetween(String value1, String value2) {
            addCriterion("livenum not between", value1, value2, "livenum");
            return (Criteria) this;
        }

        public Criteria andNospeakIsNull() {
            addCriterion("nospeak is null");
            return (Criteria) this;
        }

        public Criteria andNospeakIsNotNull() {
            addCriterion("nospeak is not null");
            return (Criteria) this;
        }

        public Criteria andNospeakEqualTo(String value) {
            addCriterion("nospeak =", value, "nospeak");
            return (Criteria) this;
        }

        public Criteria andNospeakNotEqualTo(String value) {
            addCriterion("nospeak <>", value, "nospeak");
            return (Criteria) this;
        }

        public Criteria andNospeakGreaterThan(String value) {
            addCriterion("nospeak >", value, "nospeak");
            return (Criteria) this;
        }

        public Criteria andNospeakGreaterThanOrEqualTo(String value) {
            addCriterion("nospeak >=", value, "nospeak");
            return (Criteria) this;
        }

        public Criteria andNospeakLessThan(String value) {
            addCriterion("nospeak <", value, "nospeak");
            return (Criteria) this;
        }

        public Criteria andNospeakLessThanOrEqualTo(String value) {
            addCriterion("nospeak <=", value, "nospeak");
            return (Criteria) this;
        }

        public Criteria andNospeakLike(String value) {
            addCriterion("nospeak like", value, "nospeak");
            return (Criteria) this;
        }

        public Criteria andNospeakNotLike(String value) {
            addCriterion("nospeak not like", value, "nospeak");
            return (Criteria) this;
        }

        public Criteria andNospeakIn(List<String> values) {
            addCriterion("nospeak in", values, "nospeak");
            return (Criteria) this;
        }

        public Criteria andNospeakNotIn(List<String> values) {
            addCriterion("nospeak not in", values, "nospeak");
            return (Criteria) this;
        }

        public Criteria andNospeakBetween(String value1, String value2) {
            addCriterion("nospeak between", value1, value2, "nospeak");
            return (Criteria) this;
        }

        public Criteria andNospeakNotBetween(String value1, String value2) {
            addCriterion("nospeak not between", value1, value2, "nospeak");
            return (Criteria) this;
        }

        public Criteria andBrainsIsNull() {
            addCriterion("brains is null");
            return (Criteria) this;
        }

        public Criteria andBrainsIsNotNull() {
            addCriterion("brains is not null");
            return (Criteria) this;
        }

        public Criteria andBrainsEqualTo(String value) {
            addCriterion("brains =", value, "brains");
            return (Criteria) this;
        }

        public Criteria andBrainsNotEqualTo(String value) {
            addCriterion("brains <>", value, "brains");
            return (Criteria) this;
        }

        public Criteria andBrainsGreaterThan(String value) {
            addCriterion("brains >", value, "brains");
            return (Criteria) this;
        }

        public Criteria andBrainsGreaterThanOrEqualTo(String value) {
            addCriterion("brains >=", value, "brains");
            return (Criteria) this;
        }

        public Criteria andBrainsLessThan(String value) {
            addCriterion("brains <", value, "brains");
            return (Criteria) this;
        }

        public Criteria andBrainsLessThanOrEqualTo(String value) {
            addCriterion("brains <=", value, "brains");
            return (Criteria) this;
        }

        public Criteria andBrainsLike(String value) {
            addCriterion("brains like", value, "brains");
            return (Criteria) this;
        }

        public Criteria andBrainsNotLike(String value) {
            addCriterion("brains not like", value, "brains");
            return (Criteria) this;
        }

        public Criteria andBrainsIn(List<String> values) {
            addCriterion("brains in", values, "brains");
            return (Criteria) this;
        }

        public Criteria andBrainsNotIn(List<String> values) {
            addCriterion("brains not in", values, "brains");
            return (Criteria) this;
        }

        public Criteria andBrainsBetween(String value1, String value2) {
            addCriterion("brains between", value1, value2, "brains");
            return (Criteria) this;
        }

        public Criteria andBrainsNotBetween(String value1, String value2) {
            addCriterion("brains not between", value1, value2, "brains");
            return (Criteria) this;
        }

        public Criteria andSpeakslowIsNull() {
            addCriterion("speakslow is null");
            return (Criteria) this;
        }

        public Criteria andSpeakslowIsNotNull() {
            addCriterion("speakslow is not null");
            return (Criteria) this;
        }

        public Criteria andSpeakslowEqualTo(String value) {
            addCriterion("speakslow =", value, "speakslow");
            return (Criteria) this;
        }

        public Criteria andSpeakslowNotEqualTo(String value) {
            addCriterion("speakslow <>", value, "speakslow");
            return (Criteria) this;
        }

        public Criteria andSpeakslowGreaterThan(String value) {
            addCriterion("speakslow >", value, "speakslow");
            return (Criteria) this;
        }

        public Criteria andSpeakslowGreaterThanOrEqualTo(String value) {
            addCriterion("speakslow >=", value, "speakslow");
            return (Criteria) this;
        }

        public Criteria andSpeakslowLessThan(String value) {
            addCriterion("speakslow <", value, "speakslow");
            return (Criteria) this;
        }

        public Criteria andSpeakslowLessThanOrEqualTo(String value) {
            addCriterion("speakslow <=", value, "speakslow");
            return (Criteria) this;
        }

        public Criteria andSpeakslowLike(String value) {
            addCriterion("speakslow like", value, "speakslow");
            return (Criteria) this;
        }

        public Criteria andSpeakslowNotLike(String value) {
            addCriterion("speakslow not like", value, "speakslow");
            return (Criteria) this;
        }

        public Criteria andSpeakslowIn(List<String> values) {
            addCriterion("speakslow in", values, "speakslow");
            return (Criteria) this;
        }

        public Criteria andSpeakslowNotIn(List<String> values) {
            addCriterion("speakslow not in", values, "speakslow");
            return (Criteria) this;
        }

        public Criteria andSpeakslowBetween(String value1, String value2) {
            addCriterion("speakslow between", value1, value2, "speakslow");
            return (Criteria) this;
        }

        public Criteria andSpeakslowNotBetween(String value1, String value2) {
            addCriterion("speakslow not between", value1, value2, "speakslow");
            return (Criteria) this;
        }

        public Criteria andBluesIsNull() {
            addCriterion("blues is null");
            return (Criteria) this;
        }

        public Criteria andBluesIsNotNull() {
            addCriterion("blues is not null");
            return (Criteria) this;
        }

        public Criteria andBluesEqualTo(String value) {
            addCriterion("blues =", value, "blues");
            return (Criteria) this;
        }

        public Criteria andBluesNotEqualTo(String value) {
            addCriterion("blues <>", value, "blues");
            return (Criteria) this;
        }

        public Criteria andBluesGreaterThan(String value) {
            addCriterion("blues >", value, "blues");
            return (Criteria) this;
        }

        public Criteria andBluesGreaterThanOrEqualTo(String value) {
            addCriterion("blues >=", value, "blues");
            return (Criteria) this;
        }

        public Criteria andBluesLessThan(String value) {
            addCriterion("blues <", value, "blues");
            return (Criteria) this;
        }

        public Criteria andBluesLessThanOrEqualTo(String value) {
            addCriterion("blues <=", value, "blues");
            return (Criteria) this;
        }

        public Criteria andBluesLike(String value) {
            addCriterion("blues like", value, "blues");
            return (Criteria) this;
        }

        public Criteria andBluesNotLike(String value) {
            addCriterion("blues not like", value, "blues");
            return (Criteria) this;
        }

        public Criteria andBluesIn(List<String> values) {
            addCriterion("blues in", values, "blues");
            return (Criteria) this;
        }

        public Criteria andBluesNotIn(List<String> values) {
            addCriterion("blues not in", values, "blues");
            return (Criteria) this;
        }

        public Criteria andBluesBetween(String value1, String value2) {
            addCriterion("blues between", value1, value2, "blues");
            return (Criteria) this;
        }

        public Criteria andBluesNotBetween(String value1, String value2) {
            addCriterion("blues not between", value1, value2, "blues");
            return (Criteria) this;
        }

        public Criteria andAnxiousIsNull() {
            addCriterion("anxious is null");
            return (Criteria) this;
        }

        public Criteria andAnxiousIsNotNull() {
            addCriterion("anxious is not null");
            return (Criteria) this;
        }

        public Criteria andAnxiousEqualTo(String value) {
            addCriterion("anxious =", value, "anxious");
            return (Criteria) this;
        }

        public Criteria andAnxiousNotEqualTo(String value) {
            addCriterion("anxious <>", value, "anxious");
            return (Criteria) this;
        }

        public Criteria andAnxiousGreaterThan(String value) {
            addCriterion("anxious >", value, "anxious");
            return (Criteria) this;
        }

        public Criteria andAnxiousGreaterThanOrEqualTo(String value) {
            addCriterion("anxious >=", value, "anxious");
            return (Criteria) this;
        }

        public Criteria andAnxiousLessThan(String value) {
            addCriterion("anxious <", value, "anxious");
            return (Criteria) this;
        }

        public Criteria andAnxiousLessThanOrEqualTo(String value) {
            addCriterion("anxious <=", value, "anxious");
            return (Criteria) this;
        }

        public Criteria andAnxiousLike(String value) {
            addCriterion("anxious like", value, "anxious");
            return (Criteria) this;
        }

        public Criteria andAnxiousNotLike(String value) {
            addCriterion("anxious not like", value, "anxious");
            return (Criteria) this;
        }

        public Criteria andAnxiousIn(List<String> values) {
            addCriterion("anxious in", values, "anxious");
            return (Criteria) this;
        }

        public Criteria andAnxiousNotIn(List<String> values) {
            addCriterion("anxious not in", values, "anxious");
            return (Criteria) this;
        }

        public Criteria andAnxiousBetween(String value1, String value2) {
            addCriterion("anxious between", value1, value2, "anxious");
            return (Criteria) this;
        }

        public Criteria andAnxiousNotBetween(String value1, String value2) {
            addCriterion("anxious not between", value1, value2, "anxious");
            return (Criteria) this;
        }

        public Criteria andManicIsNull() {
            addCriterion("manic is null");
            return (Criteria) this;
        }

        public Criteria andManicIsNotNull() {
            addCriterion("manic is not null");
            return (Criteria) this;
        }

        public Criteria andManicEqualTo(String value) {
            addCriterion("manic =", value, "manic");
            return (Criteria) this;
        }

        public Criteria andManicNotEqualTo(String value) {
            addCriterion("manic <>", value, "manic");
            return (Criteria) this;
        }

        public Criteria andManicGreaterThan(String value) {
            addCriterion("manic >", value, "manic");
            return (Criteria) this;
        }

        public Criteria andManicGreaterThanOrEqualTo(String value) {
            addCriterion("manic >=", value, "manic");
            return (Criteria) this;
        }

        public Criteria andManicLessThan(String value) {
            addCriterion("manic <", value, "manic");
            return (Criteria) this;
        }

        public Criteria andManicLessThanOrEqualTo(String value) {
            addCriterion("manic <=", value, "manic");
            return (Criteria) this;
        }

        public Criteria andManicLike(String value) {
            addCriterion("manic like", value, "manic");
            return (Criteria) this;
        }

        public Criteria andManicNotLike(String value) {
            addCriterion("manic not like", value, "manic");
            return (Criteria) this;
        }

        public Criteria andManicIn(List<String> values) {
            addCriterion("manic in", values, "manic");
            return (Criteria) this;
        }

        public Criteria andManicNotIn(List<String> values) {
            addCriterion("manic not in", values, "manic");
            return (Criteria) this;
        }

        public Criteria andManicBetween(String value1, String value2) {
            addCriterion("manic between", value1, value2, "manic");
            return (Criteria) this;
        }

        public Criteria andManicNotBetween(String value1, String value2) {
            addCriterion("manic not between", value1, value2, "manic");
            return (Criteria) this;
        }

        public Criteria andSplitIsNull() {
            addCriterion("split is null");
            return (Criteria) this;
        }

        public Criteria andSplitIsNotNull() {
            addCriterion("split is not null");
            return (Criteria) this;
        }

        public Criteria andSplitEqualTo(String value) {
            addCriterion("split =", value, "split");
            return (Criteria) this;
        }

        public Criteria andSplitNotEqualTo(String value) {
            addCriterion("split <>", value, "split");
            return (Criteria) this;
        }

        public Criteria andSplitGreaterThan(String value) {
            addCriterion("split >", value, "split");
            return (Criteria) this;
        }

        public Criteria andSplitGreaterThanOrEqualTo(String value) {
            addCriterion("split >=", value, "split");
            return (Criteria) this;
        }

        public Criteria andSplitLessThan(String value) {
            addCriterion("split <", value, "split");
            return (Criteria) this;
        }

        public Criteria andSplitLessThanOrEqualTo(String value) {
            addCriterion("split <=", value, "split");
            return (Criteria) this;
        }

        public Criteria andSplitLike(String value) {
            addCriterion("split like", value, "split");
            return (Criteria) this;
        }

        public Criteria andSplitNotLike(String value) {
            addCriterion("split not like", value, "split");
            return (Criteria) this;
        }

        public Criteria andSplitIn(List<String> values) {
            addCriterion("split in", values, "split");
            return (Criteria) this;
        }

        public Criteria andSplitNotIn(List<String> values) {
            addCriterion("split not in", values, "split");
            return (Criteria) this;
        }

        public Criteria andSplitBetween(String value1, String value2) {
            addCriterion("split between", value1, value2, "split");
            return (Criteria) this;
        }

        public Criteria andSplitNotBetween(String value1, String value2) {
            addCriterion("split not between", value1, value2, "split");
            return (Criteria) this;
        }

        public Criteria andMuchgoIsNull() {
            addCriterion("muchgo is null");
            return (Criteria) this;
        }

        public Criteria andMuchgoIsNotNull() {
            addCriterion("muchgo is not null");
            return (Criteria) this;
        }

        public Criteria andMuchgoEqualTo(String value) {
            addCriterion("muchgo =", value, "muchgo");
            return (Criteria) this;
        }

        public Criteria andMuchgoNotEqualTo(String value) {
            addCriterion("muchgo <>", value, "muchgo");
            return (Criteria) this;
        }

        public Criteria andMuchgoGreaterThan(String value) {
            addCriterion("muchgo >", value, "muchgo");
            return (Criteria) this;
        }

        public Criteria andMuchgoGreaterThanOrEqualTo(String value) {
            addCriterion("muchgo >=", value, "muchgo");
            return (Criteria) this;
        }

        public Criteria andMuchgoLessThan(String value) {
            addCriterion("muchgo <", value, "muchgo");
            return (Criteria) this;
        }

        public Criteria andMuchgoLessThanOrEqualTo(String value) {
            addCriterion("muchgo <=", value, "muchgo");
            return (Criteria) this;
        }

        public Criteria andMuchgoLike(String value) {
            addCriterion("muchgo like", value, "muchgo");
            return (Criteria) this;
        }

        public Criteria andMuchgoNotLike(String value) {
            addCriterion("muchgo not like", value, "muchgo");
            return (Criteria) this;
        }

        public Criteria andMuchgoIn(List<String> values) {
            addCriterion("muchgo in", values, "muchgo");
            return (Criteria) this;
        }

        public Criteria andMuchgoNotIn(List<String> values) {
            addCriterion("muchgo not in", values, "muchgo");
            return (Criteria) this;
        }

        public Criteria andMuchgoBetween(String value1, String value2) {
            addCriterion("muchgo between", value1, value2, "muchgo");
            return (Criteria) this;
        }

        public Criteria andMuchgoNotBetween(String value1, String value2) {
            addCriterion("muchgo not between", value1, value2, "muchgo");
            return (Criteria) this;
        }

        public Criteria andSocialIsNull() {
            addCriterion("social is null");
            return (Criteria) this;
        }

        public Criteria andSocialIsNotNull() {
            addCriterion("social is not null");
            return (Criteria) this;
        }

        public Criteria andSocialEqualTo(String value) {
            addCriterion("social =", value, "social");
            return (Criteria) this;
        }

        public Criteria andSocialNotEqualTo(String value) {
            addCriterion("social <>", value, "social");
            return (Criteria) this;
        }

        public Criteria andSocialGreaterThan(String value) {
            addCriterion("social >", value, "social");
            return (Criteria) this;
        }

        public Criteria andSocialGreaterThanOrEqualTo(String value) {
            addCriterion("social >=", value, "social");
            return (Criteria) this;
        }

        public Criteria andSocialLessThan(String value) {
            addCriterion("social <", value, "social");
            return (Criteria) this;
        }

        public Criteria andSocialLessThanOrEqualTo(String value) {
            addCriterion("social <=", value, "social");
            return (Criteria) this;
        }

        public Criteria andSocialLike(String value) {
            addCriterion("social like", value, "social");
            return (Criteria) this;
        }

        public Criteria andSocialNotLike(String value) {
            addCriterion("social not like", value, "social");
            return (Criteria) this;
        }

        public Criteria andSocialIn(List<String> values) {
            addCriterion("social in", values, "social");
            return (Criteria) this;
        }

        public Criteria andSocialNotIn(List<String> values) {
            addCriterion("social not in", values, "social");
            return (Criteria) this;
        }

        public Criteria andSocialBetween(String value1, String value2) {
            addCriterion("social between", value1, value2, "social");
            return (Criteria) this;
        }

        public Criteria andSocialNotBetween(String value1, String value2) {
            addCriterion("social not between", value1, value2, "social");
            return (Criteria) this;
        }

        public Criteria andForceIsNull() {
            addCriterion("`force` is null");
            return (Criteria) this;
        }

        public Criteria andForceIsNotNull() {
            addCriterion("`force` is not null");
            return (Criteria) this;
        }

        public Criteria andForceEqualTo(String value) {
            addCriterion("`force` =", value, "force");
            return (Criteria) this;
        }

        public Criteria andForceNotEqualTo(String value) {
            addCriterion("`force` <>", value, "force");
            return (Criteria) this;
        }

        public Criteria andForceGreaterThan(String value) {
            addCriterion("`force` >", value, "force");
            return (Criteria) this;
        }

        public Criteria andForceGreaterThanOrEqualTo(String value) {
            addCriterion("`force` >=", value, "force");
            return (Criteria) this;
        }

        public Criteria andForceLessThan(String value) {
            addCriterion("`force` <", value, "force");
            return (Criteria) this;
        }

        public Criteria andForceLessThanOrEqualTo(String value) {
            addCriterion("`force` <=", value, "force");
            return (Criteria) this;
        }

        public Criteria andForceLike(String value) {
            addCriterion("`force` like", value, "force");
            return (Criteria) this;
        }

        public Criteria andForceNotLike(String value) {
            addCriterion("`force` not like", value, "force");
            return (Criteria) this;
        }

        public Criteria andForceIn(List<String> values) {
            addCriterion("`force` in", values, "force");
            return (Criteria) this;
        }

        public Criteria andForceNotIn(List<String> values) {
            addCriterion("`force` not in", values, "force");
            return (Criteria) this;
        }

        public Criteria andForceBetween(String value1, String value2) {
            addCriterion("`force` between", value1, value2, "force");
            return (Criteria) this;
        }

        public Criteria andForceNotBetween(String value1, String value2) {
            addCriterion("`force` not between", value1, value2, "force");
            return (Criteria) this;
        }

        public Criteria andChoiceIsNull() {
            addCriterion("choice is null");
            return (Criteria) this;
        }

        public Criteria andChoiceIsNotNull() {
            addCriterion("choice is not null");
            return (Criteria) this;
        }

        public Criteria andChoiceEqualTo(String value) {
            addCriterion("choice =", value, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceNotEqualTo(String value) {
            addCriterion("choice <>", value, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceGreaterThan(String value) {
            addCriterion("choice >", value, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceGreaterThanOrEqualTo(String value) {
            addCriterion("choice >=", value, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceLessThan(String value) {
            addCriterion("choice <", value, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceLessThanOrEqualTo(String value) {
            addCriterion("choice <=", value, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceLike(String value) {
            addCriterion("choice like", value, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceNotLike(String value) {
            addCriterion("choice not like", value, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceIn(List<String> values) {
            addCriterion("choice in", values, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceNotIn(List<String> values) {
            addCriterion("choice not in", values, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceBetween(String value1, String value2) {
            addCriterion("choice between", value1, value2, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceNotBetween(String value1, String value2) {
            addCriterion("choice not between", value1, value2, "choice");
            return (Criteria) this;
        }

        public Criteria andSpiritIsNull() {
            addCriterion("spirit is null");
            return (Criteria) this;
        }

        public Criteria andSpiritIsNotNull() {
            addCriterion("spirit is not null");
            return (Criteria) this;
        }

        public Criteria andSpiritEqualTo(String value) {
            addCriterion("spirit =", value, "spirit");
            return (Criteria) this;
        }

        public Criteria andSpiritNotEqualTo(String value) {
            addCriterion("spirit <>", value, "spirit");
            return (Criteria) this;
        }

        public Criteria andSpiritGreaterThan(String value) {
            addCriterion("spirit >", value, "spirit");
            return (Criteria) this;
        }

        public Criteria andSpiritGreaterThanOrEqualTo(String value) {
            addCriterion("spirit >=", value, "spirit");
            return (Criteria) this;
        }

        public Criteria andSpiritLessThan(String value) {
            addCriterion("spirit <", value, "spirit");
            return (Criteria) this;
        }

        public Criteria andSpiritLessThanOrEqualTo(String value) {
            addCriterion("spirit <=", value, "spirit");
            return (Criteria) this;
        }

        public Criteria andSpiritLike(String value) {
            addCriterion("spirit like", value, "spirit");
            return (Criteria) this;
        }

        public Criteria andSpiritNotLike(String value) {
            addCriterion("spirit not like", value, "spirit");
            return (Criteria) this;
        }

        public Criteria andSpiritIn(List<String> values) {
            addCriterion("spirit in", values, "spirit");
            return (Criteria) this;
        }

        public Criteria andSpiritNotIn(List<String> values) {
            addCriterion("spirit not in", values, "spirit");
            return (Criteria) this;
        }

        public Criteria andSpiritBetween(String value1, String value2) {
            addCriterion("spirit between", value1, value2, "spirit");
            return (Criteria) this;
        }

        public Criteria andSpiritNotBetween(String value1, String value2) {
            addCriterion("spirit not between", value1, value2, "spirit");
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