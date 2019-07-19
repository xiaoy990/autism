package com.join.autism.entity.HzhInborn;

import java.util.ArrayList;
import java.util.List;

public class HzhInbornExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HzhInbornExample() {
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

        public Criteria andSkullIsNull() {
            addCriterion("skull is null");
            return (Criteria) this;
        }

        public Criteria andSkullIsNotNull() {
            addCriterion("skull is not null");
            return (Criteria) this;
        }

        public Criteria andSkullEqualTo(String value) {
            addCriterion("skull =", value, "skull");
            return (Criteria) this;
        }

        public Criteria andSkullNotEqualTo(String value) {
            addCriterion("skull <>", value, "skull");
            return (Criteria) this;
        }

        public Criteria andSkullGreaterThan(String value) {
            addCriterion("skull >", value, "skull");
            return (Criteria) this;
        }

        public Criteria andSkullGreaterThanOrEqualTo(String value) {
            addCriterion("skull >=", value, "skull");
            return (Criteria) this;
        }

        public Criteria andSkullLessThan(String value) {
            addCriterion("skull <", value, "skull");
            return (Criteria) this;
        }

        public Criteria andSkullLessThanOrEqualTo(String value) {
            addCriterion("skull <=", value, "skull");
            return (Criteria) this;
        }

        public Criteria andSkullLike(String value) {
            addCriterion("skull like", value, "skull");
            return (Criteria) this;
        }

        public Criteria andSkullNotLike(String value) {
            addCriterion("skull not like", value, "skull");
            return (Criteria) this;
        }

        public Criteria andSkullIn(List<String> values) {
            addCriterion("skull in", values, "skull");
            return (Criteria) this;
        }

        public Criteria andSkullNotIn(List<String> values) {
            addCriterion("skull not in", values, "skull");
            return (Criteria) this;
        }

        public Criteria andSkullBetween(String value1, String value2) {
            addCriterion("skull between", value1, value2, "skull");
            return (Criteria) this;
        }

        public Criteria andSkullNotBetween(String value1, String value2) {
            addCriterion("skull not between", value1, value2, "skull");
            return (Criteria) this;
        }

        public Criteria andSkullreasonIsNull() {
            addCriterion("skullreason is null");
            return (Criteria) this;
        }

        public Criteria andSkullreasonIsNotNull() {
            addCriterion("skullreason is not null");
            return (Criteria) this;
        }

        public Criteria andSkullreasonEqualTo(String value) {
            addCriterion("skullreason =", value, "skullreason");
            return (Criteria) this;
        }

        public Criteria andSkullreasonNotEqualTo(String value) {
            addCriterion("skullreason <>", value, "skullreason");
            return (Criteria) this;
        }

        public Criteria andSkullreasonGreaterThan(String value) {
            addCriterion("skullreason >", value, "skullreason");
            return (Criteria) this;
        }

        public Criteria andSkullreasonGreaterThanOrEqualTo(String value) {
            addCriterion("skullreason >=", value, "skullreason");
            return (Criteria) this;
        }

        public Criteria andSkullreasonLessThan(String value) {
            addCriterion("skullreason <", value, "skullreason");
            return (Criteria) this;
        }

        public Criteria andSkullreasonLessThanOrEqualTo(String value) {
            addCriterion("skullreason <=", value, "skullreason");
            return (Criteria) this;
        }

        public Criteria andSkullreasonLike(String value) {
            addCriterion("skullreason like", value, "skullreason");
            return (Criteria) this;
        }

        public Criteria andSkullreasonNotLike(String value) {
            addCriterion("skullreason not like", value, "skullreason");
            return (Criteria) this;
        }

        public Criteria andSkullreasonIn(List<String> values) {
            addCriterion("skullreason in", values, "skullreason");
            return (Criteria) this;
        }

        public Criteria andSkullreasonNotIn(List<String> values) {
            addCriterion("skullreason not in", values, "skullreason");
            return (Criteria) this;
        }

        public Criteria andSkullreasonBetween(String value1, String value2) {
            addCriterion("skullreason between", value1, value2, "skullreason");
            return (Criteria) this;
        }

        public Criteria andSkullreasonNotBetween(String value1, String value2) {
            addCriterion("skullreason not between", value1, value2, "skullreason");
            return (Criteria) this;
        }

        public Criteria andEarIsNull() {
            addCriterion("ear is null");
            return (Criteria) this;
        }

        public Criteria andEarIsNotNull() {
            addCriterion("ear is not null");
            return (Criteria) this;
        }

        public Criteria andEarEqualTo(String value) {
            addCriterion("ear =", value, "ear");
            return (Criteria) this;
        }

        public Criteria andEarNotEqualTo(String value) {
            addCriterion("ear <>", value, "ear");
            return (Criteria) this;
        }

        public Criteria andEarGreaterThan(String value) {
            addCriterion("ear >", value, "ear");
            return (Criteria) this;
        }

        public Criteria andEarGreaterThanOrEqualTo(String value) {
            addCriterion("ear >=", value, "ear");
            return (Criteria) this;
        }

        public Criteria andEarLessThan(String value) {
            addCriterion("ear <", value, "ear");
            return (Criteria) this;
        }

        public Criteria andEarLessThanOrEqualTo(String value) {
            addCriterion("ear <=", value, "ear");
            return (Criteria) this;
        }

        public Criteria andEarLike(String value) {
            addCriterion("ear like", value, "ear");
            return (Criteria) this;
        }

        public Criteria andEarNotLike(String value) {
            addCriterion("ear not like", value, "ear");
            return (Criteria) this;
        }

        public Criteria andEarIn(List<String> values) {
            addCriterion("ear in", values, "ear");
            return (Criteria) this;
        }

        public Criteria andEarNotIn(List<String> values) {
            addCriterion("ear not in", values, "ear");
            return (Criteria) this;
        }

        public Criteria andEarBetween(String value1, String value2) {
            addCriterion("ear between", value1, value2, "ear");
            return (Criteria) this;
        }

        public Criteria andEarNotBetween(String value1, String value2) {
            addCriterion("ear not between", value1, value2, "ear");
            return (Criteria) this;
        }

        public Criteria andEarreasonIsNull() {
            addCriterion("earreason is null");
            return (Criteria) this;
        }

        public Criteria andEarreasonIsNotNull() {
            addCriterion("earreason is not null");
            return (Criteria) this;
        }

        public Criteria andEarreasonEqualTo(String value) {
            addCriterion("earreason =", value, "earreason");
            return (Criteria) this;
        }

        public Criteria andEarreasonNotEqualTo(String value) {
            addCriterion("earreason <>", value, "earreason");
            return (Criteria) this;
        }

        public Criteria andEarreasonGreaterThan(String value) {
            addCriterion("earreason >", value, "earreason");
            return (Criteria) this;
        }

        public Criteria andEarreasonGreaterThanOrEqualTo(String value) {
            addCriterion("earreason >=", value, "earreason");
            return (Criteria) this;
        }

        public Criteria andEarreasonLessThan(String value) {
            addCriterion("earreason <", value, "earreason");
            return (Criteria) this;
        }

        public Criteria andEarreasonLessThanOrEqualTo(String value) {
            addCriterion("earreason <=", value, "earreason");
            return (Criteria) this;
        }

        public Criteria andEarreasonLike(String value) {
            addCriterion("earreason like", value, "earreason");
            return (Criteria) this;
        }

        public Criteria andEarreasonNotLike(String value) {
            addCriterion("earreason not like", value, "earreason");
            return (Criteria) this;
        }

        public Criteria andEarreasonIn(List<String> values) {
            addCriterion("earreason in", values, "earreason");
            return (Criteria) this;
        }

        public Criteria andEarreasonNotIn(List<String> values) {
            addCriterion("earreason not in", values, "earreason");
            return (Criteria) this;
        }

        public Criteria andEarreasonBetween(String value1, String value2) {
            addCriterion("earreason between", value1, value2, "earreason");
            return (Criteria) this;
        }

        public Criteria andEarreasonNotBetween(String value1, String value2) {
            addCriterion("earreason not between", value1, value2, "earreason");
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

        public Criteria andEyeEqualTo(String value) {
            addCriterion("eye =", value, "eye");
            return (Criteria) this;
        }

        public Criteria andEyeNotEqualTo(String value) {
            addCriterion("eye <>", value, "eye");
            return (Criteria) this;
        }

        public Criteria andEyeGreaterThan(String value) {
            addCriterion("eye >", value, "eye");
            return (Criteria) this;
        }

        public Criteria andEyeGreaterThanOrEqualTo(String value) {
            addCriterion("eye >=", value, "eye");
            return (Criteria) this;
        }

        public Criteria andEyeLessThan(String value) {
            addCriterion("eye <", value, "eye");
            return (Criteria) this;
        }

        public Criteria andEyeLessThanOrEqualTo(String value) {
            addCriterion("eye <=", value, "eye");
            return (Criteria) this;
        }

        public Criteria andEyeLike(String value) {
            addCriterion("eye like", value, "eye");
            return (Criteria) this;
        }

        public Criteria andEyeNotLike(String value) {
            addCriterion("eye not like", value, "eye");
            return (Criteria) this;
        }

        public Criteria andEyeIn(List<String> values) {
            addCriterion("eye in", values, "eye");
            return (Criteria) this;
        }

        public Criteria andEyeNotIn(List<String> values) {
            addCriterion("eye not in", values, "eye");
            return (Criteria) this;
        }

        public Criteria andEyeBetween(String value1, String value2) {
            addCriterion("eye between", value1, value2, "eye");
            return (Criteria) this;
        }

        public Criteria andEyeNotBetween(String value1, String value2) {
            addCriterion("eye not between", value1, value2, "eye");
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

        public Criteria andNoseIsNull() {
            addCriterion("nose is null");
            return (Criteria) this;
        }

        public Criteria andNoseIsNotNull() {
            addCriterion("nose is not null");
            return (Criteria) this;
        }

        public Criteria andNoseEqualTo(String value) {
            addCriterion("nose =", value, "nose");
            return (Criteria) this;
        }

        public Criteria andNoseNotEqualTo(String value) {
            addCriterion("nose <>", value, "nose");
            return (Criteria) this;
        }

        public Criteria andNoseGreaterThan(String value) {
            addCriterion("nose >", value, "nose");
            return (Criteria) this;
        }

        public Criteria andNoseGreaterThanOrEqualTo(String value) {
            addCriterion("nose >=", value, "nose");
            return (Criteria) this;
        }

        public Criteria andNoseLessThan(String value) {
            addCriterion("nose <", value, "nose");
            return (Criteria) this;
        }

        public Criteria andNoseLessThanOrEqualTo(String value) {
            addCriterion("nose <=", value, "nose");
            return (Criteria) this;
        }

        public Criteria andNoseLike(String value) {
            addCriterion("nose like", value, "nose");
            return (Criteria) this;
        }

        public Criteria andNoseNotLike(String value) {
            addCriterion("nose not like", value, "nose");
            return (Criteria) this;
        }

        public Criteria andNoseIn(List<String> values) {
            addCriterion("nose in", values, "nose");
            return (Criteria) this;
        }

        public Criteria andNoseNotIn(List<String> values) {
            addCriterion("nose not in", values, "nose");
            return (Criteria) this;
        }

        public Criteria andNoseBetween(String value1, String value2) {
            addCriterion("nose between", value1, value2, "nose");
            return (Criteria) this;
        }

        public Criteria andNoseNotBetween(String value1, String value2) {
            addCriterion("nose not between", value1, value2, "nose");
            return (Criteria) this;
        }

        public Criteria andNosereasonIsNull() {
            addCriterion("nosereason is null");
            return (Criteria) this;
        }

        public Criteria andNosereasonIsNotNull() {
            addCriterion("nosereason is not null");
            return (Criteria) this;
        }

        public Criteria andNosereasonEqualTo(String value) {
            addCriterion("nosereason =", value, "nosereason");
            return (Criteria) this;
        }

        public Criteria andNosereasonNotEqualTo(String value) {
            addCriterion("nosereason <>", value, "nosereason");
            return (Criteria) this;
        }

        public Criteria andNosereasonGreaterThan(String value) {
            addCriterion("nosereason >", value, "nosereason");
            return (Criteria) this;
        }

        public Criteria andNosereasonGreaterThanOrEqualTo(String value) {
            addCriterion("nosereason >=", value, "nosereason");
            return (Criteria) this;
        }

        public Criteria andNosereasonLessThan(String value) {
            addCriterion("nosereason <", value, "nosereason");
            return (Criteria) this;
        }

        public Criteria andNosereasonLessThanOrEqualTo(String value) {
            addCriterion("nosereason <=", value, "nosereason");
            return (Criteria) this;
        }

        public Criteria andNosereasonLike(String value) {
            addCriterion("nosereason like", value, "nosereason");
            return (Criteria) this;
        }

        public Criteria andNosereasonNotLike(String value) {
            addCriterion("nosereason not like", value, "nosereason");
            return (Criteria) this;
        }

        public Criteria andNosereasonIn(List<String> values) {
            addCriterion("nosereason in", values, "nosereason");
            return (Criteria) this;
        }

        public Criteria andNosereasonNotIn(List<String> values) {
            addCriterion("nosereason not in", values, "nosereason");
            return (Criteria) this;
        }

        public Criteria andNosereasonBetween(String value1, String value2) {
            addCriterion("nosereason between", value1, value2, "nosereason");
            return (Criteria) this;
        }

        public Criteria andNosereasonNotBetween(String value1, String value2) {
            addCriterion("nosereason not between", value1, value2, "nosereason");
            return (Criteria) this;
        }

        public Criteria andCenterIsNull() {
            addCriterion("center is null");
            return (Criteria) this;
        }

        public Criteria andCenterIsNotNull() {
            addCriterion("center is not null");
            return (Criteria) this;
        }

        public Criteria andCenterEqualTo(String value) {
            addCriterion("center =", value, "center");
            return (Criteria) this;
        }

        public Criteria andCenterNotEqualTo(String value) {
            addCriterion("center <>", value, "center");
            return (Criteria) this;
        }

        public Criteria andCenterGreaterThan(String value) {
            addCriterion("center >", value, "center");
            return (Criteria) this;
        }

        public Criteria andCenterGreaterThanOrEqualTo(String value) {
            addCriterion("center >=", value, "center");
            return (Criteria) this;
        }

        public Criteria andCenterLessThan(String value) {
            addCriterion("center <", value, "center");
            return (Criteria) this;
        }

        public Criteria andCenterLessThanOrEqualTo(String value) {
            addCriterion("center <=", value, "center");
            return (Criteria) this;
        }

        public Criteria andCenterLike(String value) {
            addCriterion("center like", value, "center");
            return (Criteria) this;
        }

        public Criteria andCenterNotLike(String value) {
            addCriterion("center not like", value, "center");
            return (Criteria) this;
        }

        public Criteria andCenterIn(List<String> values) {
            addCriterion("center in", values, "center");
            return (Criteria) this;
        }

        public Criteria andCenterNotIn(List<String> values) {
            addCriterion("center not in", values, "center");
            return (Criteria) this;
        }

        public Criteria andCenterBetween(String value1, String value2) {
            addCriterion("center between", value1, value2, "center");
            return (Criteria) this;
        }

        public Criteria andCenterNotBetween(String value1, String value2) {
            addCriterion("center not between", value1, value2, "center");
            return (Criteria) this;
        }

        public Criteria andCenterreasonIsNull() {
            addCriterion("centerreason is null");
            return (Criteria) this;
        }

        public Criteria andCenterreasonIsNotNull() {
            addCriterion("centerreason is not null");
            return (Criteria) this;
        }

        public Criteria andCenterreasonEqualTo(String value) {
            addCriterion("centerreason =", value, "centerreason");
            return (Criteria) this;
        }

        public Criteria andCenterreasonNotEqualTo(String value) {
            addCriterion("centerreason <>", value, "centerreason");
            return (Criteria) this;
        }

        public Criteria andCenterreasonGreaterThan(String value) {
            addCriterion("centerreason >", value, "centerreason");
            return (Criteria) this;
        }

        public Criteria andCenterreasonGreaterThanOrEqualTo(String value) {
            addCriterion("centerreason >=", value, "centerreason");
            return (Criteria) this;
        }

        public Criteria andCenterreasonLessThan(String value) {
            addCriterion("centerreason <", value, "centerreason");
            return (Criteria) this;
        }

        public Criteria andCenterreasonLessThanOrEqualTo(String value) {
            addCriterion("centerreason <=", value, "centerreason");
            return (Criteria) this;
        }

        public Criteria andCenterreasonLike(String value) {
            addCriterion("centerreason like", value, "centerreason");
            return (Criteria) this;
        }

        public Criteria andCenterreasonNotLike(String value) {
            addCriterion("centerreason not like", value, "centerreason");
            return (Criteria) this;
        }

        public Criteria andCenterreasonIn(List<String> values) {
            addCriterion("centerreason in", values, "centerreason");
            return (Criteria) this;
        }

        public Criteria andCenterreasonNotIn(List<String> values) {
            addCriterion("centerreason not in", values, "centerreason");
            return (Criteria) this;
        }

        public Criteria andCenterreasonBetween(String value1, String value2) {
            addCriterion("centerreason between", value1, value2, "centerreason");
            return (Criteria) this;
        }

        public Criteria andCenterreasonNotBetween(String value1, String value2) {
            addCriterion("centerreason not between", value1, value2, "centerreason");
            return (Criteria) this;
        }

        public Criteria andMouthIsNull() {
            addCriterion("mouth is null");
            return (Criteria) this;
        }

        public Criteria andMouthIsNotNull() {
            addCriterion("mouth is not null");
            return (Criteria) this;
        }

        public Criteria andMouthEqualTo(String value) {
            addCriterion("mouth =", value, "mouth");
            return (Criteria) this;
        }

        public Criteria andMouthNotEqualTo(String value) {
            addCriterion("mouth <>", value, "mouth");
            return (Criteria) this;
        }

        public Criteria andMouthGreaterThan(String value) {
            addCriterion("mouth >", value, "mouth");
            return (Criteria) this;
        }

        public Criteria andMouthGreaterThanOrEqualTo(String value) {
            addCriterion("mouth >=", value, "mouth");
            return (Criteria) this;
        }

        public Criteria andMouthLessThan(String value) {
            addCriterion("mouth <", value, "mouth");
            return (Criteria) this;
        }

        public Criteria andMouthLessThanOrEqualTo(String value) {
            addCriterion("mouth <=", value, "mouth");
            return (Criteria) this;
        }

        public Criteria andMouthLike(String value) {
            addCriterion("mouth like", value, "mouth");
            return (Criteria) this;
        }

        public Criteria andMouthNotLike(String value) {
            addCriterion("mouth not like", value, "mouth");
            return (Criteria) this;
        }

        public Criteria andMouthIn(List<String> values) {
            addCriterion("mouth in", values, "mouth");
            return (Criteria) this;
        }

        public Criteria andMouthNotIn(List<String> values) {
            addCriterion("mouth not in", values, "mouth");
            return (Criteria) this;
        }

        public Criteria andMouthBetween(String value1, String value2) {
            addCriterion("mouth between", value1, value2, "mouth");
            return (Criteria) this;
        }

        public Criteria andMouthNotBetween(String value1, String value2) {
            addCriterion("mouth not between", value1, value2, "mouth");
            return (Criteria) this;
        }

        public Criteria andMouthreasonIsNull() {
            addCriterion("mouthreason is null");
            return (Criteria) this;
        }

        public Criteria andMouthreasonIsNotNull() {
            addCriterion("mouthreason is not null");
            return (Criteria) this;
        }

        public Criteria andMouthreasonEqualTo(String value) {
            addCriterion("mouthreason =", value, "mouthreason");
            return (Criteria) this;
        }

        public Criteria andMouthreasonNotEqualTo(String value) {
            addCriterion("mouthreason <>", value, "mouthreason");
            return (Criteria) this;
        }

        public Criteria andMouthreasonGreaterThan(String value) {
            addCriterion("mouthreason >", value, "mouthreason");
            return (Criteria) this;
        }

        public Criteria andMouthreasonGreaterThanOrEqualTo(String value) {
            addCriterion("mouthreason >=", value, "mouthreason");
            return (Criteria) this;
        }

        public Criteria andMouthreasonLessThan(String value) {
            addCriterion("mouthreason <", value, "mouthreason");
            return (Criteria) this;
        }

        public Criteria andMouthreasonLessThanOrEqualTo(String value) {
            addCriterion("mouthreason <=", value, "mouthreason");
            return (Criteria) this;
        }

        public Criteria andMouthreasonLike(String value) {
            addCriterion("mouthreason like", value, "mouthreason");
            return (Criteria) this;
        }

        public Criteria andMouthreasonNotLike(String value) {
            addCriterion("mouthreason not like", value, "mouthreason");
            return (Criteria) this;
        }

        public Criteria andMouthreasonIn(List<String> values) {
            addCriterion("mouthreason in", values, "mouthreason");
            return (Criteria) this;
        }

        public Criteria andMouthreasonNotIn(List<String> values) {
            addCriterion("mouthreason not in", values, "mouthreason");
            return (Criteria) this;
        }

        public Criteria andMouthreasonBetween(String value1, String value2) {
            addCriterion("mouthreason between", value1, value2, "mouthreason");
            return (Criteria) this;
        }

        public Criteria andMouthreasonNotBetween(String value1, String value2) {
            addCriterion("mouthreason not between", value1, value2, "mouthreason");
            return (Criteria) this;
        }

        public Criteria andJawIsNull() {
            addCriterion("jaw is null");
            return (Criteria) this;
        }

        public Criteria andJawIsNotNull() {
            addCriterion("jaw is not null");
            return (Criteria) this;
        }

        public Criteria andJawEqualTo(String value) {
            addCriterion("jaw =", value, "jaw");
            return (Criteria) this;
        }

        public Criteria andJawNotEqualTo(String value) {
            addCriterion("jaw <>", value, "jaw");
            return (Criteria) this;
        }

        public Criteria andJawGreaterThan(String value) {
            addCriterion("jaw >", value, "jaw");
            return (Criteria) this;
        }

        public Criteria andJawGreaterThanOrEqualTo(String value) {
            addCriterion("jaw >=", value, "jaw");
            return (Criteria) this;
        }

        public Criteria andJawLessThan(String value) {
            addCriterion("jaw <", value, "jaw");
            return (Criteria) this;
        }

        public Criteria andJawLessThanOrEqualTo(String value) {
            addCriterion("jaw <=", value, "jaw");
            return (Criteria) this;
        }

        public Criteria andJawLike(String value) {
            addCriterion("jaw like", value, "jaw");
            return (Criteria) this;
        }

        public Criteria andJawNotLike(String value) {
            addCriterion("jaw not like", value, "jaw");
            return (Criteria) this;
        }

        public Criteria andJawIn(List<String> values) {
            addCriterion("jaw in", values, "jaw");
            return (Criteria) this;
        }

        public Criteria andJawNotIn(List<String> values) {
            addCriterion("jaw not in", values, "jaw");
            return (Criteria) this;
        }

        public Criteria andJawBetween(String value1, String value2) {
            addCriterion("jaw between", value1, value2, "jaw");
            return (Criteria) this;
        }

        public Criteria andJawNotBetween(String value1, String value2) {
            addCriterion("jaw not between", value1, value2, "jaw");
            return (Criteria) this;
        }

        public Criteria andJawreasonIsNull() {
            addCriterion("jawreason is null");
            return (Criteria) this;
        }

        public Criteria andJawreasonIsNotNull() {
            addCriterion("jawreason is not null");
            return (Criteria) this;
        }

        public Criteria andJawreasonEqualTo(String value) {
            addCriterion("jawreason =", value, "jawreason");
            return (Criteria) this;
        }

        public Criteria andJawreasonNotEqualTo(String value) {
            addCriterion("jawreason <>", value, "jawreason");
            return (Criteria) this;
        }

        public Criteria andJawreasonGreaterThan(String value) {
            addCriterion("jawreason >", value, "jawreason");
            return (Criteria) this;
        }

        public Criteria andJawreasonGreaterThanOrEqualTo(String value) {
            addCriterion("jawreason >=", value, "jawreason");
            return (Criteria) this;
        }

        public Criteria andJawreasonLessThan(String value) {
            addCriterion("jawreason <", value, "jawreason");
            return (Criteria) this;
        }

        public Criteria andJawreasonLessThanOrEqualTo(String value) {
            addCriterion("jawreason <=", value, "jawreason");
            return (Criteria) this;
        }

        public Criteria andJawreasonLike(String value) {
            addCriterion("jawreason like", value, "jawreason");
            return (Criteria) this;
        }

        public Criteria andJawreasonNotLike(String value) {
            addCriterion("jawreason not like", value, "jawreason");
            return (Criteria) this;
        }

        public Criteria andJawreasonIn(List<String> values) {
            addCriterion("jawreason in", values, "jawreason");
            return (Criteria) this;
        }

        public Criteria andJawreasonNotIn(List<String> values) {
            addCriterion("jawreason not in", values, "jawreason");
            return (Criteria) this;
        }

        public Criteria andJawreasonBetween(String value1, String value2) {
            addCriterion("jawreason between", value1, value2, "jawreason");
            return (Criteria) this;
        }

        public Criteria andJawreasonNotBetween(String value1, String value2) {
            addCriterion("jawreason not between", value1, value2, "jawreason");
            return (Criteria) this;
        }

        public Criteria andBreastIsNull() {
            addCriterion("breast is null");
            return (Criteria) this;
        }

        public Criteria andBreastIsNotNull() {
            addCriterion("breast is not null");
            return (Criteria) this;
        }

        public Criteria andBreastEqualTo(String value) {
            addCriterion("breast =", value, "breast");
            return (Criteria) this;
        }

        public Criteria andBreastNotEqualTo(String value) {
            addCriterion("breast <>", value, "breast");
            return (Criteria) this;
        }

        public Criteria andBreastGreaterThan(String value) {
            addCriterion("breast >", value, "breast");
            return (Criteria) this;
        }

        public Criteria andBreastGreaterThanOrEqualTo(String value) {
            addCriterion("breast >=", value, "breast");
            return (Criteria) this;
        }

        public Criteria andBreastLessThan(String value) {
            addCriterion("breast <", value, "breast");
            return (Criteria) this;
        }

        public Criteria andBreastLessThanOrEqualTo(String value) {
            addCriterion("breast <=", value, "breast");
            return (Criteria) this;
        }

        public Criteria andBreastLike(String value) {
            addCriterion("breast like", value, "breast");
            return (Criteria) this;
        }

        public Criteria andBreastNotLike(String value) {
            addCriterion("breast not like", value, "breast");
            return (Criteria) this;
        }

        public Criteria andBreastIn(List<String> values) {
            addCriterion("breast in", values, "breast");
            return (Criteria) this;
        }

        public Criteria andBreastNotIn(List<String> values) {
            addCriterion("breast not in", values, "breast");
            return (Criteria) this;
        }

        public Criteria andBreastBetween(String value1, String value2) {
            addCriterion("breast between", value1, value2, "breast");
            return (Criteria) this;
        }

        public Criteria andBreastNotBetween(String value1, String value2) {
            addCriterion("breast not between", value1, value2, "breast");
            return (Criteria) this;
        }

        public Criteria andBreastreasonIsNull() {
            addCriterion("breastreason is null");
            return (Criteria) this;
        }

        public Criteria andBreastreasonIsNotNull() {
            addCriterion("breastreason is not null");
            return (Criteria) this;
        }

        public Criteria andBreastreasonEqualTo(String value) {
            addCriterion("breastreason =", value, "breastreason");
            return (Criteria) this;
        }

        public Criteria andBreastreasonNotEqualTo(String value) {
            addCriterion("breastreason <>", value, "breastreason");
            return (Criteria) this;
        }

        public Criteria andBreastreasonGreaterThan(String value) {
            addCriterion("breastreason >", value, "breastreason");
            return (Criteria) this;
        }

        public Criteria andBreastreasonGreaterThanOrEqualTo(String value) {
            addCriterion("breastreason >=", value, "breastreason");
            return (Criteria) this;
        }

        public Criteria andBreastreasonLessThan(String value) {
            addCriterion("breastreason <", value, "breastreason");
            return (Criteria) this;
        }

        public Criteria andBreastreasonLessThanOrEqualTo(String value) {
            addCriterion("breastreason <=", value, "breastreason");
            return (Criteria) this;
        }

        public Criteria andBreastreasonLike(String value) {
            addCriterion("breastreason like", value, "breastreason");
            return (Criteria) this;
        }

        public Criteria andBreastreasonNotLike(String value) {
            addCriterion("breastreason not like", value, "breastreason");
            return (Criteria) this;
        }

        public Criteria andBreastreasonIn(List<String> values) {
            addCriterion("breastreason in", values, "breastreason");
            return (Criteria) this;
        }

        public Criteria andBreastreasonNotIn(List<String> values) {
            addCriterion("breastreason not in", values, "breastreason");
            return (Criteria) this;
        }

        public Criteria andBreastreasonBetween(String value1, String value2) {
            addCriterion("breastreason between", value1, value2, "breastreason");
            return (Criteria) this;
        }

        public Criteria andBreastreasonNotBetween(String value1, String value2) {
            addCriterion("breastreason not between", value1, value2, "breastreason");
            return (Criteria) this;
        }

        public Criteria andFootlegIsNull() {
            addCriterion("footleg is null");
            return (Criteria) this;
        }

        public Criteria andFootlegIsNotNull() {
            addCriterion("footleg is not null");
            return (Criteria) this;
        }

        public Criteria andFootlegEqualTo(String value) {
            addCriterion("footleg =", value, "footleg");
            return (Criteria) this;
        }

        public Criteria andFootlegNotEqualTo(String value) {
            addCriterion("footleg <>", value, "footleg");
            return (Criteria) this;
        }

        public Criteria andFootlegGreaterThan(String value) {
            addCriterion("footleg >", value, "footleg");
            return (Criteria) this;
        }

        public Criteria andFootlegGreaterThanOrEqualTo(String value) {
            addCriterion("footleg >=", value, "footleg");
            return (Criteria) this;
        }

        public Criteria andFootlegLessThan(String value) {
            addCriterion("footleg <", value, "footleg");
            return (Criteria) this;
        }

        public Criteria andFootlegLessThanOrEqualTo(String value) {
            addCriterion("footleg <=", value, "footleg");
            return (Criteria) this;
        }

        public Criteria andFootlegLike(String value) {
            addCriterion("footleg like", value, "footleg");
            return (Criteria) this;
        }

        public Criteria andFootlegNotLike(String value) {
            addCriterion("footleg not like", value, "footleg");
            return (Criteria) this;
        }

        public Criteria andFootlegIn(List<String> values) {
            addCriterion("footleg in", values, "footleg");
            return (Criteria) this;
        }

        public Criteria andFootlegNotIn(List<String> values) {
            addCriterion("footleg not in", values, "footleg");
            return (Criteria) this;
        }

        public Criteria andFootlegBetween(String value1, String value2) {
            addCriterion("footleg between", value1, value2, "footleg");
            return (Criteria) this;
        }

        public Criteria andFootlegNotBetween(String value1, String value2) {
            addCriterion("footleg not between", value1, value2, "footleg");
            return (Criteria) this;
        }

        public Criteria andFootlegreasonIsNull() {
            addCriterion("footlegreason is null");
            return (Criteria) this;
        }

        public Criteria andFootlegreasonIsNotNull() {
            addCriterion("footlegreason is not null");
            return (Criteria) this;
        }

        public Criteria andFootlegreasonEqualTo(String value) {
            addCriterion("footlegreason =", value, "footlegreason");
            return (Criteria) this;
        }

        public Criteria andFootlegreasonNotEqualTo(String value) {
            addCriterion("footlegreason <>", value, "footlegreason");
            return (Criteria) this;
        }

        public Criteria andFootlegreasonGreaterThan(String value) {
            addCriterion("footlegreason >", value, "footlegreason");
            return (Criteria) this;
        }

        public Criteria andFootlegreasonGreaterThanOrEqualTo(String value) {
            addCriterion("footlegreason >=", value, "footlegreason");
            return (Criteria) this;
        }

        public Criteria andFootlegreasonLessThan(String value) {
            addCriterion("footlegreason <", value, "footlegreason");
            return (Criteria) this;
        }

        public Criteria andFootlegreasonLessThanOrEqualTo(String value) {
            addCriterion("footlegreason <=", value, "footlegreason");
            return (Criteria) this;
        }

        public Criteria andFootlegreasonLike(String value) {
            addCriterion("footlegreason like", value, "footlegreason");
            return (Criteria) this;
        }

        public Criteria andFootlegreasonNotLike(String value) {
            addCriterion("footlegreason not like", value, "footlegreason");
            return (Criteria) this;
        }

        public Criteria andFootlegreasonIn(List<String> values) {
            addCriterion("footlegreason in", values, "footlegreason");
            return (Criteria) this;
        }

        public Criteria andFootlegreasonNotIn(List<String> values) {
            addCriterion("footlegreason not in", values, "footlegreason");
            return (Criteria) this;
        }

        public Criteria andFootlegreasonBetween(String value1, String value2) {
            addCriterion("footlegreason between", value1, value2, "footlegreason");
            return (Criteria) this;
        }

        public Criteria andFootlegreasonNotBetween(String value1, String value2) {
            addCriterion("footlegreason not between", value1, value2, "footlegreason");
            return (Criteria) this;
        }

        public Criteria andHeartIsNull() {
            addCriterion("heart is null");
            return (Criteria) this;
        }

        public Criteria andHeartIsNotNull() {
            addCriterion("heart is not null");
            return (Criteria) this;
        }

        public Criteria andHeartEqualTo(String value) {
            addCriterion("heart =", value, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartNotEqualTo(String value) {
            addCriterion("heart <>", value, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartGreaterThan(String value) {
            addCriterion("heart >", value, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartGreaterThanOrEqualTo(String value) {
            addCriterion("heart >=", value, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartLessThan(String value) {
            addCriterion("heart <", value, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartLessThanOrEqualTo(String value) {
            addCriterion("heart <=", value, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartLike(String value) {
            addCriterion("heart like", value, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartNotLike(String value) {
            addCriterion("heart not like", value, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartIn(List<String> values) {
            addCriterion("heart in", values, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartNotIn(List<String> values) {
            addCriterion("heart not in", values, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartBetween(String value1, String value2) {
            addCriterion("heart between", value1, value2, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartNotBetween(String value1, String value2) {
            addCriterion("heart not between", value1, value2, "heart");
            return (Criteria) this;
        }

        public Criteria andBellyIsNull() {
            addCriterion("belly is null");
            return (Criteria) this;
        }

        public Criteria andBellyIsNotNull() {
            addCriterion("belly is not null");
            return (Criteria) this;
        }

        public Criteria andBellyEqualTo(String value) {
            addCriterion("belly =", value, "belly");
            return (Criteria) this;
        }

        public Criteria andBellyNotEqualTo(String value) {
            addCriterion("belly <>", value, "belly");
            return (Criteria) this;
        }

        public Criteria andBellyGreaterThan(String value) {
            addCriterion("belly >", value, "belly");
            return (Criteria) this;
        }

        public Criteria andBellyGreaterThanOrEqualTo(String value) {
            addCriterion("belly >=", value, "belly");
            return (Criteria) this;
        }

        public Criteria andBellyLessThan(String value) {
            addCriterion("belly <", value, "belly");
            return (Criteria) this;
        }

        public Criteria andBellyLessThanOrEqualTo(String value) {
            addCriterion("belly <=", value, "belly");
            return (Criteria) this;
        }

        public Criteria andBellyLike(String value) {
            addCriterion("belly like", value, "belly");
            return (Criteria) this;
        }

        public Criteria andBellyNotLike(String value) {
            addCriterion("belly not like", value, "belly");
            return (Criteria) this;
        }

        public Criteria andBellyIn(List<String> values) {
            addCriterion("belly in", values, "belly");
            return (Criteria) this;
        }

        public Criteria andBellyNotIn(List<String> values) {
            addCriterion("belly not in", values, "belly");
            return (Criteria) this;
        }

        public Criteria andBellyBetween(String value1, String value2) {
            addCriterion("belly between", value1, value2, "belly");
            return (Criteria) this;
        }

        public Criteria andBellyNotBetween(String value1, String value2) {
            addCriterion("belly not between", value1, value2, "belly");
            return (Criteria) this;
        }

        public Criteria andSkinIsNull() {
            addCriterion("skin is null");
            return (Criteria) this;
        }

        public Criteria andSkinIsNotNull() {
            addCriterion("skin is not null");
            return (Criteria) this;
        }

        public Criteria andSkinEqualTo(String value) {
            addCriterion("skin =", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotEqualTo(String value) {
            addCriterion("skin <>", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinGreaterThan(String value) {
            addCriterion("skin >", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinGreaterThanOrEqualTo(String value) {
            addCriterion("skin >=", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinLessThan(String value) {
            addCriterion("skin <", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinLessThanOrEqualTo(String value) {
            addCriterion("skin <=", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinLike(String value) {
            addCriterion("skin like", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotLike(String value) {
            addCriterion("skin not like", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinIn(List<String> values) {
            addCriterion("skin in", values, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotIn(List<String> values) {
            addCriterion("skin not in", values, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinBetween(String value1, String value2) {
            addCriterion("skin between", value1, value2, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotBetween(String value1, String value2) {
            addCriterion("skin not between", value1, value2, "skin");
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