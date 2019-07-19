package com.join.autism.entity.HzhTreat;

import java.util.ArrayList;
import java.util.List;

public class HzhTreatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HzhTreatExample() {
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

        public Criteria andFirstdrugIsNull() {
            addCriterion("firstdrug is null");
            return (Criteria) this;
        }

        public Criteria andFirstdrugIsNotNull() {
            addCriterion("firstdrug is not null");
            return (Criteria) this;
        }

        public Criteria andFirstdrugEqualTo(String value) {
            addCriterion("firstdrug =", value, "firstdrug");
            return (Criteria) this;
        }

        public Criteria andFirstdrugNotEqualTo(String value) {
            addCriterion("firstdrug <>", value, "firstdrug");
            return (Criteria) this;
        }

        public Criteria andFirstdrugGreaterThan(String value) {
            addCriterion("firstdrug >", value, "firstdrug");
            return (Criteria) this;
        }

        public Criteria andFirstdrugGreaterThanOrEqualTo(String value) {
            addCriterion("firstdrug >=", value, "firstdrug");
            return (Criteria) this;
        }

        public Criteria andFirstdrugLessThan(String value) {
            addCriterion("firstdrug <", value, "firstdrug");
            return (Criteria) this;
        }

        public Criteria andFirstdrugLessThanOrEqualTo(String value) {
            addCriterion("firstdrug <=", value, "firstdrug");
            return (Criteria) this;
        }

        public Criteria andFirstdrugLike(String value) {
            addCriterion("firstdrug like", value, "firstdrug");
            return (Criteria) this;
        }

        public Criteria andFirstdrugNotLike(String value) {
            addCriterion("firstdrug not like", value, "firstdrug");
            return (Criteria) this;
        }

        public Criteria andFirstdrugIn(List<String> values) {
            addCriterion("firstdrug in", values, "firstdrug");
            return (Criteria) this;
        }

        public Criteria andFirstdrugNotIn(List<String> values) {
            addCriterion("firstdrug not in", values, "firstdrug");
            return (Criteria) this;
        }

        public Criteria andFirstdrugBetween(String value1, String value2) {
            addCriterion("firstdrug between", value1, value2, "firstdrug");
            return (Criteria) this;
        }

        public Criteria andFirstdrugNotBetween(String value1, String value2) {
            addCriterion("firstdrug not between", value1, value2, "firstdrug");
            return (Criteria) this;
        }

        public Criteria andFirstdrugreasonIsNull() {
            addCriterion("firstdrugreason is null");
            return (Criteria) this;
        }

        public Criteria andFirstdrugreasonIsNotNull() {
            addCriterion("firstdrugreason is not null");
            return (Criteria) this;
        }

        public Criteria andFirstdrugreasonEqualTo(String value) {
            addCriterion("firstdrugreason =", value, "firstdrugreason");
            return (Criteria) this;
        }

        public Criteria andFirstdrugreasonNotEqualTo(String value) {
            addCriterion("firstdrugreason <>", value, "firstdrugreason");
            return (Criteria) this;
        }

        public Criteria andFirstdrugreasonGreaterThan(String value) {
            addCriterion("firstdrugreason >", value, "firstdrugreason");
            return (Criteria) this;
        }

        public Criteria andFirstdrugreasonGreaterThanOrEqualTo(String value) {
            addCriterion("firstdrugreason >=", value, "firstdrugreason");
            return (Criteria) this;
        }

        public Criteria andFirstdrugreasonLessThan(String value) {
            addCriterion("firstdrugreason <", value, "firstdrugreason");
            return (Criteria) this;
        }

        public Criteria andFirstdrugreasonLessThanOrEqualTo(String value) {
            addCriterion("firstdrugreason <=", value, "firstdrugreason");
            return (Criteria) this;
        }

        public Criteria andFirstdrugreasonLike(String value) {
            addCriterion("firstdrugreason like", value, "firstdrugreason");
            return (Criteria) this;
        }

        public Criteria andFirstdrugreasonNotLike(String value) {
            addCriterion("firstdrugreason not like", value, "firstdrugreason");
            return (Criteria) this;
        }

        public Criteria andFirstdrugreasonIn(List<String> values) {
            addCriterion("firstdrugreason in", values, "firstdrugreason");
            return (Criteria) this;
        }

        public Criteria andFirstdrugreasonNotIn(List<String> values) {
            addCriterion("firstdrugreason not in", values, "firstdrugreason");
            return (Criteria) this;
        }

        public Criteria andFirstdrugreasonBetween(String value1, String value2) {
            addCriterion("firstdrugreason between", value1, value2, "firstdrugreason");
            return (Criteria) this;
        }

        public Criteria andFirstdrugreasonNotBetween(String value1, String value2) {
            addCriterion("firstdrugreason not between", value1, value2, "firstdrugreason");
            return (Criteria) this;
        }

        public Criteria andAnddrugIsNull() {
            addCriterion("anddrug is null");
            return (Criteria) this;
        }

        public Criteria andAnddrugIsNotNull() {
            addCriterion("anddrug is not null");
            return (Criteria) this;
        }

        public Criteria andAnddrugEqualTo(String value) {
            addCriterion("anddrug =", value, "anddrug");
            return (Criteria) this;
        }

        public Criteria andAnddrugNotEqualTo(String value) {
            addCriterion("anddrug <>", value, "anddrug");
            return (Criteria) this;
        }

        public Criteria andAnddrugGreaterThan(String value) {
            addCriterion("anddrug >", value, "anddrug");
            return (Criteria) this;
        }

        public Criteria andAnddrugGreaterThanOrEqualTo(String value) {
            addCriterion("anddrug >=", value, "anddrug");
            return (Criteria) this;
        }

        public Criteria andAnddrugLessThan(String value) {
            addCriterion("anddrug <", value, "anddrug");
            return (Criteria) this;
        }

        public Criteria andAnddrugLessThanOrEqualTo(String value) {
            addCriterion("anddrug <=", value, "anddrug");
            return (Criteria) this;
        }

        public Criteria andAnddrugLike(String value) {
            addCriterion("anddrug like", value, "anddrug");
            return (Criteria) this;
        }

        public Criteria andAnddrugNotLike(String value) {
            addCriterion("anddrug not like", value, "anddrug");
            return (Criteria) this;
        }

        public Criteria andAnddrugIn(List<String> values) {
            addCriterion("anddrug in", values, "anddrug");
            return (Criteria) this;
        }

        public Criteria andAnddrugNotIn(List<String> values) {
            addCriterion("anddrug not in", values, "anddrug");
            return (Criteria) this;
        }

        public Criteria andAnddrugBetween(String value1, String value2) {
            addCriterion("anddrug between", value1, value2, "anddrug");
            return (Criteria) this;
        }

        public Criteria andAnddrugNotBetween(String value1, String value2) {
            addCriterion("anddrug not between", value1, value2, "anddrug");
            return (Criteria) this;
        }

        public Criteria andAnddrugreasonIsNull() {
            addCriterion("anddrugreason is null");
            return (Criteria) this;
        }

        public Criteria andAnddrugreasonIsNotNull() {
            addCriterion("anddrugreason is not null");
            return (Criteria) this;
        }

        public Criteria andAnddrugreasonEqualTo(String value) {
            addCriterion("anddrugreason =", value, "anddrugreason");
            return (Criteria) this;
        }

        public Criteria andAnddrugreasonNotEqualTo(String value) {
            addCriterion("anddrugreason <>", value, "anddrugreason");
            return (Criteria) this;
        }

        public Criteria andAnddrugreasonGreaterThan(String value) {
            addCriterion("anddrugreason >", value, "anddrugreason");
            return (Criteria) this;
        }

        public Criteria andAnddrugreasonGreaterThanOrEqualTo(String value) {
            addCriterion("anddrugreason >=", value, "anddrugreason");
            return (Criteria) this;
        }

        public Criteria andAnddrugreasonLessThan(String value) {
            addCriterion("anddrugreason <", value, "anddrugreason");
            return (Criteria) this;
        }

        public Criteria andAnddrugreasonLessThanOrEqualTo(String value) {
            addCriterion("anddrugreason <=", value, "anddrugreason");
            return (Criteria) this;
        }

        public Criteria andAnddrugreasonLike(String value) {
            addCriterion("anddrugreason like", value, "anddrugreason");
            return (Criteria) this;
        }

        public Criteria andAnddrugreasonNotLike(String value) {
            addCriterion("anddrugreason not like", value, "anddrugreason");
            return (Criteria) this;
        }

        public Criteria andAnddrugreasonIn(List<String> values) {
            addCriterion("anddrugreason in", values, "anddrugreason");
            return (Criteria) this;
        }

        public Criteria andAnddrugreasonNotIn(List<String> values) {
            addCriterion("anddrugreason not in", values, "anddrugreason");
            return (Criteria) this;
        }

        public Criteria andAnddrugreasonBetween(String value1, String value2) {
            addCriterion("anddrugreason between", value1, value2, "anddrugreason");
            return (Criteria) this;
        }

        public Criteria andAnddrugreasonNotBetween(String value1, String value2) {
            addCriterion("anddrugreason not between", value1, value2, "anddrugreason");
            return (Criteria) this;
        }

        public Criteria andOthertreatIsNull() {
            addCriterion("othertreat is null");
            return (Criteria) this;
        }

        public Criteria andOthertreatIsNotNull() {
            addCriterion("othertreat is not null");
            return (Criteria) this;
        }

        public Criteria andOthertreatEqualTo(String value) {
            addCriterion("othertreat =", value, "othertreat");
            return (Criteria) this;
        }

        public Criteria andOthertreatNotEqualTo(String value) {
            addCriterion("othertreat <>", value, "othertreat");
            return (Criteria) this;
        }

        public Criteria andOthertreatGreaterThan(String value) {
            addCriterion("othertreat >", value, "othertreat");
            return (Criteria) this;
        }

        public Criteria andOthertreatGreaterThanOrEqualTo(String value) {
            addCriterion("othertreat >=", value, "othertreat");
            return (Criteria) this;
        }

        public Criteria andOthertreatLessThan(String value) {
            addCriterion("othertreat <", value, "othertreat");
            return (Criteria) this;
        }

        public Criteria andOthertreatLessThanOrEqualTo(String value) {
            addCriterion("othertreat <=", value, "othertreat");
            return (Criteria) this;
        }

        public Criteria andOthertreatLike(String value) {
            addCriterion("othertreat like", value, "othertreat");
            return (Criteria) this;
        }

        public Criteria andOthertreatNotLike(String value) {
            addCriterion("othertreat not like", value, "othertreat");
            return (Criteria) this;
        }

        public Criteria andOthertreatIn(List<String> values) {
            addCriterion("othertreat in", values, "othertreat");
            return (Criteria) this;
        }

        public Criteria andOthertreatNotIn(List<String> values) {
            addCriterion("othertreat not in", values, "othertreat");
            return (Criteria) this;
        }

        public Criteria andOthertreatBetween(String value1, String value2) {
            addCriterion("othertreat between", value1, value2, "othertreat");
            return (Criteria) this;
        }

        public Criteria andOthertreatNotBetween(String value1, String value2) {
            addCriterion("othertreat not between", value1, value2, "othertreat");
            return (Criteria) this;
        }

        public Criteria andTreatreasonIsNull() {
            addCriterion("treatreason is null");
            return (Criteria) this;
        }

        public Criteria andTreatreasonIsNotNull() {
            addCriterion("treatreason is not null");
            return (Criteria) this;
        }

        public Criteria andTreatreasonEqualTo(String value) {
            addCriterion("treatreason =", value, "treatreason");
            return (Criteria) this;
        }

        public Criteria andTreatreasonNotEqualTo(String value) {
            addCriterion("treatreason <>", value, "treatreason");
            return (Criteria) this;
        }

        public Criteria andTreatreasonGreaterThan(String value) {
            addCriterion("treatreason >", value, "treatreason");
            return (Criteria) this;
        }

        public Criteria andTreatreasonGreaterThanOrEqualTo(String value) {
            addCriterion("treatreason >=", value, "treatreason");
            return (Criteria) this;
        }

        public Criteria andTreatreasonLessThan(String value) {
            addCriterion("treatreason <", value, "treatreason");
            return (Criteria) this;
        }

        public Criteria andTreatreasonLessThanOrEqualTo(String value) {
            addCriterion("treatreason <=", value, "treatreason");
            return (Criteria) this;
        }

        public Criteria andTreatreasonLike(String value) {
            addCriterion("treatreason like", value, "treatreason");
            return (Criteria) this;
        }

        public Criteria andTreatreasonNotLike(String value) {
            addCriterion("treatreason not like", value, "treatreason");
            return (Criteria) this;
        }

        public Criteria andTreatreasonIn(List<String> values) {
            addCriterion("treatreason in", values, "treatreason");
            return (Criteria) this;
        }

        public Criteria andTreatreasonNotIn(List<String> values) {
            addCriterion("treatreason not in", values, "treatreason");
            return (Criteria) this;
        }

        public Criteria andTreatreasonBetween(String value1, String value2) {
            addCriterion("treatreason between", value1, value2, "treatreason");
            return (Criteria) this;
        }

        public Criteria andTreatreasonNotBetween(String value1, String value2) {
            addCriterion("treatreason not between", value1, value2, "treatreason");
            return (Criteria) this;
        }

        public Criteria andFirsttimeIsNull() {
            addCriterion("firsttime is null");
            return (Criteria) this;
        }

        public Criteria andFirsttimeIsNotNull() {
            addCriterion("firsttime is not null");
            return (Criteria) this;
        }

        public Criteria andFirsttimeEqualTo(String value) {
            addCriterion("firsttime =", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeNotEqualTo(String value) {
            addCriterion("firsttime <>", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeGreaterThan(String value) {
            addCriterion("firsttime >", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeGreaterThanOrEqualTo(String value) {
            addCriterion("firsttime >=", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeLessThan(String value) {
            addCriterion("firsttime <", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeLessThanOrEqualTo(String value) {
            addCriterion("firsttime <=", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeLike(String value) {
            addCriterion("firsttime like", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeNotLike(String value) {
            addCriterion("firsttime not like", value, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeIn(List<String> values) {
            addCriterion("firsttime in", values, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeNotIn(List<String> values) {
            addCriterion("firsttime not in", values, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeBetween(String value1, String value2) {
            addCriterion("firsttime between", value1, value2, "firsttime");
            return (Criteria) this;
        }

        public Criteria andFirsttimeNotBetween(String value1, String value2) {
            addCriterion("firsttime not between", value1, value2, "firsttime");
            return (Criteria) this;
        }

        public Criteria andTreatreturnIsNull() {
            addCriterion("treatreturn is null");
            return (Criteria) this;
        }

        public Criteria andTreatreturnIsNotNull() {
            addCriterion("treatreturn is not null");
            return (Criteria) this;
        }

        public Criteria andTreatreturnEqualTo(String value) {
            addCriterion("treatreturn =", value, "treatreturn");
            return (Criteria) this;
        }

        public Criteria andTreatreturnNotEqualTo(String value) {
            addCriterion("treatreturn <>", value, "treatreturn");
            return (Criteria) this;
        }

        public Criteria andTreatreturnGreaterThan(String value) {
            addCriterion("treatreturn >", value, "treatreturn");
            return (Criteria) this;
        }

        public Criteria andTreatreturnGreaterThanOrEqualTo(String value) {
            addCriterion("treatreturn >=", value, "treatreturn");
            return (Criteria) this;
        }

        public Criteria andTreatreturnLessThan(String value) {
            addCriterion("treatreturn <", value, "treatreturn");
            return (Criteria) this;
        }

        public Criteria andTreatreturnLessThanOrEqualTo(String value) {
            addCriterion("treatreturn <=", value, "treatreturn");
            return (Criteria) this;
        }

        public Criteria andTreatreturnLike(String value) {
            addCriterion("treatreturn like", value, "treatreturn");
            return (Criteria) this;
        }

        public Criteria andTreatreturnNotLike(String value) {
            addCriterion("treatreturn not like", value, "treatreturn");
            return (Criteria) this;
        }

        public Criteria andTreatreturnIn(List<String> values) {
            addCriterion("treatreturn in", values, "treatreturn");
            return (Criteria) this;
        }

        public Criteria andTreatreturnNotIn(List<String> values) {
            addCriterion("treatreturn not in", values, "treatreturn");
            return (Criteria) this;
        }

        public Criteria andTreatreturnBetween(String value1, String value2) {
            addCriterion("treatreturn between", value1, value2, "treatreturn");
            return (Criteria) this;
        }

        public Criteria andTreatreturnNotBetween(String value1, String value2) {
            addCriterion("treatreturn not between", value1, value2, "treatreturn");
            return (Criteria) this;
        }

        public Criteria andFirstdateIsNull() {
            addCriterion("firstdate is null");
            return (Criteria) this;
        }

        public Criteria andFirstdateIsNotNull() {
            addCriterion("firstdate is not null");
            return (Criteria) this;
        }

        public Criteria andFirstdateEqualTo(String value) {
            addCriterion("firstdate =", value, "firstdate");
            return (Criteria) this;
        }

        public Criteria andFirstdateNotEqualTo(String value) {
            addCriterion("firstdate <>", value, "firstdate");
            return (Criteria) this;
        }

        public Criteria andFirstdateGreaterThan(String value) {
            addCriterion("firstdate >", value, "firstdate");
            return (Criteria) this;
        }

        public Criteria andFirstdateGreaterThanOrEqualTo(String value) {
            addCriterion("firstdate >=", value, "firstdate");
            return (Criteria) this;
        }

        public Criteria andFirstdateLessThan(String value) {
            addCriterion("firstdate <", value, "firstdate");
            return (Criteria) this;
        }

        public Criteria andFirstdateLessThanOrEqualTo(String value) {
            addCriterion("firstdate <=", value, "firstdate");
            return (Criteria) this;
        }

        public Criteria andFirstdateLike(String value) {
            addCriterion("firstdate like", value, "firstdate");
            return (Criteria) this;
        }

        public Criteria andFirstdateNotLike(String value) {
            addCriterion("firstdate not like", value, "firstdate");
            return (Criteria) this;
        }

        public Criteria andFirstdateIn(List<String> values) {
            addCriterion("firstdate in", values, "firstdate");
            return (Criteria) this;
        }

        public Criteria andFirstdateNotIn(List<String> values) {
            addCriterion("firstdate not in", values, "firstdate");
            return (Criteria) this;
        }

        public Criteria andFirstdateBetween(String value1, String value2) {
            addCriterion("firstdate between", value1, value2, "firstdate");
            return (Criteria) this;
        }

        public Criteria andFirstdateNotBetween(String value1, String value2) {
            addCriterion("firstdate not between", value1, value2, "firstdate");
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