package com.join.autism.entity.HzhEmotion;

import java.util.ArrayList;
import java.util.List;

public class HzhEmotionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HzhEmotionExample() {
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

        public Criteria andRelaIsNull() {
            addCriterion("rela is null");
            return (Criteria) this;
        }

        public Criteria andRelaIsNotNull() {
            addCriterion("rela is not null");
            return (Criteria) this;
        }

        public Criteria andRelaEqualTo(Integer value) {
            addCriterion("rela =", value, "rela");
            return (Criteria) this;
        }

        public Criteria andRelaNotEqualTo(Integer value) {
            addCriterion("rela <>", value, "rela");
            return (Criteria) this;
        }

        public Criteria andRelaGreaterThan(Integer value) {
            addCriterion("rela >", value, "rela");
            return (Criteria) this;
        }

        public Criteria andRelaGreaterThanOrEqualTo(Integer value) {
            addCriterion("rela >=", value, "rela");
            return (Criteria) this;
        }

        public Criteria andRelaLessThan(Integer value) {
            addCriterion("rela <", value, "rela");
            return (Criteria) this;
        }

        public Criteria andRelaLessThanOrEqualTo(Integer value) {
            addCriterion("rela <=", value, "rela");
            return (Criteria) this;
        }

        public Criteria andRelaIn(List<Integer> values) {
            addCriterion("rela in", values, "rela");
            return (Criteria) this;
        }

        public Criteria andRelaNotIn(List<Integer> values) {
            addCriterion("rela not in", values, "rela");
            return (Criteria) this;
        }

        public Criteria andRelaBetween(Integer value1, Integer value2) {
            addCriterion("rela between", value1, value2, "rela");
            return (Criteria) this;
        }

        public Criteria andRelaNotBetween(Integer value1, Integer value2) {
            addCriterion("rela not between", value1, value2, "rela");
            return (Criteria) this;
        }

        public Criteria andImitateIsNull() {
            addCriterion("imitate is null");
            return (Criteria) this;
        }

        public Criteria andImitateIsNotNull() {
            addCriterion("imitate is not null");
            return (Criteria) this;
        }

        public Criteria andImitateEqualTo(Integer value) {
            addCriterion("imitate =", value, "imitate");
            return (Criteria) this;
        }

        public Criteria andImitateNotEqualTo(Integer value) {
            addCriterion("imitate <>", value, "imitate");
            return (Criteria) this;
        }

        public Criteria andImitateGreaterThan(Integer value) {
            addCriterion("imitate >", value, "imitate");
            return (Criteria) this;
        }

        public Criteria andImitateGreaterThanOrEqualTo(Integer value) {
            addCriterion("imitate >=", value, "imitate");
            return (Criteria) this;
        }

        public Criteria andImitateLessThan(Integer value) {
            addCriterion("imitate <", value, "imitate");
            return (Criteria) this;
        }

        public Criteria andImitateLessThanOrEqualTo(Integer value) {
            addCriterion("imitate <=", value, "imitate");
            return (Criteria) this;
        }

        public Criteria andImitateIn(List<Integer> values) {
            addCriterion("imitate in", values, "imitate");
            return (Criteria) this;
        }

        public Criteria andImitateNotIn(List<Integer> values) {
            addCriterion("imitate not in", values, "imitate");
            return (Criteria) this;
        }

        public Criteria andImitateBetween(Integer value1, Integer value2) {
            addCriterion("imitate between", value1, value2, "imitate");
            return (Criteria) this;
        }

        public Criteria andImitateNotBetween(Integer value1, Integer value2) {
            addCriterion("imitate not between", value1, value2, "imitate");
            return (Criteria) this;
        }

        public Criteria andEmotionIsNull() {
            addCriterion("emotion is null");
            return (Criteria) this;
        }

        public Criteria andEmotionIsNotNull() {
            addCriterion("emotion is not null");
            return (Criteria) this;
        }

        public Criteria andEmotionEqualTo(Integer value) {
            addCriterion("emotion =", value, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionNotEqualTo(Integer value) {
            addCriterion("emotion <>", value, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionGreaterThan(Integer value) {
            addCriterion("emotion >", value, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionGreaterThanOrEqualTo(Integer value) {
            addCriterion("emotion >=", value, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionLessThan(Integer value) {
            addCriterion("emotion <", value, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionLessThanOrEqualTo(Integer value) {
            addCriterion("emotion <=", value, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionIn(List<Integer> values) {
            addCriterion("emotion in", values, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionNotIn(List<Integer> values) {
            addCriterion("emotion not in", values, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionBetween(Integer value1, Integer value2) {
            addCriterion("emotion between", value1, value2, "emotion");
            return (Criteria) this;
        }

        public Criteria andEmotionNotBetween(Integer value1, Integer value2) {
            addCriterion("emotion not between", value1, value2, "emotion");
            return (Criteria) this;
        }

        public Criteria andMotionIsNull() {
            addCriterion("motion is null");
            return (Criteria) this;
        }

        public Criteria andMotionIsNotNull() {
            addCriterion("motion is not null");
            return (Criteria) this;
        }

        public Criteria andMotionEqualTo(Integer value) {
            addCriterion("motion =", value, "motion");
            return (Criteria) this;
        }

        public Criteria andMotionNotEqualTo(Integer value) {
            addCriterion("motion <>", value, "motion");
            return (Criteria) this;
        }

        public Criteria andMotionGreaterThan(Integer value) {
            addCriterion("motion >", value, "motion");
            return (Criteria) this;
        }

        public Criteria andMotionGreaterThanOrEqualTo(Integer value) {
            addCriterion("motion >=", value, "motion");
            return (Criteria) this;
        }

        public Criteria andMotionLessThan(Integer value) {
            addCriterion("motion <", value, "motion");
            return (Criteria) this;
        }

        public Criteria andMotionLessThanOrEqualTo(Integer value) {
            addCriterion("motion <=", value, "motion");
            return (Criteria) this;
        }

        public Criteria andMotionIn(List<Integer> values) {
            addCriterion("motion in", values, "motion");
            return (Criteria) this;
        }

        public Criteria andMotionNotIn(List<Integer> values) {
            addCriterion("motion not in", values, "motion");
            return (Criteria) this;
        }

        public Criteria andMotionBetween(Integer value1, Integer value2) {
            addCriterion("motion between", value1, value2, "motion");
            return (Criteria) this;
        }

        public Criteria andMotionNotBetween(Integer value1, Integer value2) {
            addCriterion("motion not between", value1, value2, "motion");
            return (Criteria) this;
        }

        public Criteria andNonlifeIsNull() {
            addCriterion("nonlife is null");
            return (Criteria) this;
        }

        public Criteria andNonlifeIsNotNull() {
            addCriterion("nonlife is not null");
            return (Criteria) this;
        }

        public Criteria andNonlifeEqualTo(Integer value) {
            addCriterion("nonlife =", value, "nonlife");
            return (Criteria) this;
        }

        public Criteria andNonlifeNotEqualTo(Integer value) {
            addCriterion("nonlife <>", value, "nonlife");
            return (Criteria) this;
        }

        public Criteria andNonlifeGreaterThan(Integer value) {
            addCriterion("nonlife >", value, "nonlife");
            return (Criteria) this;
        }

        public Criteria andNonlifeGreaterThanOrEqualTo(Integer value) {
            addCriterion("nonlife >=", value, "nonlife");
            return (Criteria) this;
        }

        public Criteria andNonlifeLessThan(Integer value) {
            addCriterion("nonlife <", value, "nonlife");
            return (Criteria) this;
        }

        public Criteria andNonlifeLessThanOrEqualTo(Integer value) {
            addCriterion("nonlife <=", value, "nonlife");
            return (Criteria) this;
        }

        public Criteria andNonlifeIn(List<Integer> values) {
            addCriterion("nonlife in", values, "nonlife");
            return (Criteria) this;
        }

        public Criteria andNonlifeNotIn(List<Integer> values) {
            addCriterion("nonlife not in", values, "nonlife");
            return (Criteria) this;
        }

        public Criteria andNonlifeBetween(Integer value1, Integer value2) {
            addCriterion("nonlife between", value1, value2, "nonlife");
            return (Criteria) this;
        }

        public Criteria andNonlifeNotBetween(Integer value1, Integer value2) {
            addCriterion("nonlife not between", value1, value2, "nonlife");
            return (Criteria) this;
        }

        public Criteria andChangeIsNull() {
            addCriterion("`change` is null");
            return (Criteria) this;
        }

        public Criteria andChangeIsNotNull() {
            addCriterion("`change` is not null");
            return (Criteria) this;
        }

        public Criteria andChangeEqualTo(Integer value) {
            addCriterion("`change` =", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeNotEqualTo(Integer value) {
            addCriterion("`change` <>", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeGreaterThan(Integer value) {
            addCriterion("`change` >", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`change` >=", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeLessThan(Integer value) {
            addCriterion("`change` <", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeLessThanOrEqualTo(Integer value) {
            addCriterion("`change` <=", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeIn(List<Integer> values) {
            addCriterion("`change` in", values, "change");
            return (Criteria) this;
        }

        public Criteria andChangeNotIn(List<Integer> values) {
            addCriterion("`change` not in", values, "change");
            return (Criteria) this;
        }

        public Criteria andChangeBetween(Integer value1, Integer value2) {
            addCriterion("`change` between", value1, value2, "change");
            return (Criteria) this;
        }

        public Criteria andChangeNotBetween(Integer value1, Integer value2) {
            addCriterion("`change` not between", value1, value2, "change");
            return (Criteria) this;
        }

        public Criteria andVisionIsNull() {
            addCriterion("vision is null");
            return (Criteria) this;
        }

        public Criteria andVisionIsNotNull() {
            addCriterion("vision is not null");
            return (Criteria) this;
        }

        public Criteria andVisionEqualTo(Integer value) {
            addCriterion("vision =", value, "vision");
            return (Criteria) this;
        }

        public Criteria andVisionNotEqualTo(Integer value) {
            addCriterion("vision <>", value, "vision");
            return (Criteria) this;
        }

        public Criteria andVisionGreaterThan(Integer value) {
            addCriterion("vision >", value, "vision");
            return (Criteria) this;
        }

        public Criteria andVisionGreaterThanOrEqualTo(Integer value) {
            addCriterion("vision >=", value, "vision");
            return (Criteria) this;
        }

        public Criteria andVisionLessThan(Integer value) {
            addCriterion("vision <", value, "vision");
            return (Criteria) this;
        }

        public Criteria andVisionLessThanOrEqualTo(Integer value) {
            addCriterion("vision <=", value, "vision");
            return (Criteria) this;
        }

        public Criteria andVisionIn(List<Integer> values) {
            addCriterion("vision in", values, "vision");
            return (Criteria) this;
        }

        public Criteria andVisionNotIn(List<Integer> values) {
            addCriterion("vision not in", values, "vision");
            return (Criteria) this;
        }

        public Criteria andVisionBetween(Integer value1, Integer value2) {
            addCriterion("vision between", value1, value2, "vision");
            return (Criteria) this;
        }

        public Criteria andVisionNotBetween(Integer value1, Integer value2) {
            addCriterion("vision not between", value1, value2, "vision");
            return (Criteria) this;
        }

        public Criteria andHearingIsNull() {
            addCriterion("hearing is null");
            return (Criteria) this;
        }

        public Criteria andHearingIsNotNull() {
            addCriterion("hearing is not null");
            return (Criteria) this;
        }

        public Criteria andHearingEqualTo(Integer value) {
            addCriterion("hearing =", value, "hearing");
            return (Criteria) this;
        }

        public Criteria andHearingNotEqualTo(Integer value) {
            addCriterion("hearing <>", value, "hearing");
            return (Criteria) this;
        }

        public Criteria andHearingGreaterThan(Integer value) {
            addCriterion("hearing >", value, "hearing");
            return (Criteria) this;
        }

        public Criteria andHearingGreaterThanOrEqualTo(Integer value) {
            addCriterion("hearing >=", value, "hearing");
            return (Criteria) this;
        }

        public Criteria andHearingLessThan(Integer value) {
            addCriterion("hearing <", value, "hearing");
            return (Criteria) this;
        }

        public Criteria andHearingLessThanOrEqualTo(Integer value) {
            addCriterion("hearing <=", value, "hearing");
            return (Criteria) this;
        }

        public Criteria andHearingIn(List<Integer> values) {
            addCriterion("hearing in", values, "hearing");
            return (Criteria) this;
        }

        public Criteria andHearingNotIn(List<Integer> values) {
            addCriterion("hearing not in", values, "hearing");
            return (Criteria) this;
        }

        public Criteria andHearingBetween(Integer value1, Integer value2) {
            addCriterion("hearing between", value1, value2, "hearing");
            return (Criteria) this;
        }

        public Criteria andHearingNotBetween(Integer value1, Integer value2) {
            addCriterion("hearing not between", value1, value2, "hearing");
            return (Criteria) this;
        }

        public Criteria andNearbyIsNull() {
            addCriterion("nearby is null");
            return (Criteria) this;
        }

        public Criteria andNearbyIsNotNull() {
            addCriterion("nearby is not null");
            return (Criteria) this;
        }

        public Criteria andNearbyEqualTo(Integer value) {
            addCriterion("nearby =", value, "nearby");
            return (Criteria) this;
        }

        public Criteria andNearbyNotEqualTo(Integer value) {
            addCriterion("nearby <>", value, "nearby");
            return (Criteria) this;
        }

        public Criteria andNearbyGreaterThan(Integer value) {
            addCriterion("nearby >", value, "nearby");
            return (Criteria) this;
        }

        public Criteria andNearbyGreaterThanOrEqualTo(Integer value) {
            addCriterion("nearby >=", value, "nearby");
            return (Criteria) this;
        }

        public Criteria andNearbyLessThan(Integer value) {
            addCriterion("nearby <", value, "nearby");
            return (Criteria) this;
        }

        public Criteria andNearbyLessThanOrEqualTo(Integer value) {
            addCriterion("nearby <=", value, "nearby");
            return (Criteria) this;
        }

        public Criteria andNearbyIn(List<Integer> values) {
            addCriterion("nearby in", values, "nearby");
            return (Criteria) this;
        }

        public Criteria andNearbyNotIn(List<Integer> values) {
            addCriterion("nearby not in", values, "nearby");
            return (Criteria) this;
        }

        public Criteria andNearbyBetween(Integer value1, Integer value2) {
            addCriterion("nearby between", value1, value2, "nearby");
            return (Criteria) this;
        }

        public Criteria andNearbyNotBetween(Integer value1, Integer value2) {
            addCriterion("nearby not between", value1, value2, "nearby");
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

        public Criteria andAnxiousEqualTo(Integer value) {
            addCriterion("anxious =", value, "anxious");
            return (Criteria) this;
        }

        public Criteria andAnxiousNotEqualTo(Integer value) {
            addCriterion("anxious <>", value, "anxious");
            return (Criteria) this;
        }

        public Criteria andAnxiousGreaterThan(Integer value) {
            addCriterion("anxious >", value, "anxious");
            return (Criteria) this;
        }

        public Criteria andAnxiousGreaterThanOrEqualTo(Integer value) {
            addCriterion("anxious >=", value, "anxious");
            return (Criteria) this;
        }

        public Criteria andAnxiousLessThan(Integer value) {
            addCriterion("anxious <", value, "anxious");
            return (Criteria) this;
        }

        public Criteria andAnxiousLessThanOrEqualTo(Integer value) {
            addCriterion("anxious <=", value, "anxious");
            return (Criteria) this;
        }

        public Criteria andAnxiousIn(List<Integer> values) {
            addCriterion("anxious in", values, "anxious");
            return (Criteria) this;
        }

        public Criteria andAnxiousNotIn(List<Integer> values) {
            addCriterion("anxious not in", values, "anxious");
            return (Criteria) this;
        }

        public Criteria andAnxiousBetween(Integer value1, Integer value2) {
            addCriterion("anxious between", value1, value2, "anxious");
            return (Criteria) this;
        }

        public Criteria andAnxiousNotBetween(Integer value1, Integer value2) {
            addCriterion("anxious not between", value1, value2, "anxious");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("`language` is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("`language` is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(Integer value) {
            addCriterion("`language` =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(Integer value) {
            addCriterion("`language` <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(Integer value) {
            addCriterion("`language` >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(Integer value) {
            addCriterion("`language` >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(Integer value) {
            addCriterion("`language` <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(Integer value) {
            addCriterion("`language` <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<Integer> values) {
            addCriterion("`language` in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<Integer> values) {
            addCriterion("`language` not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(Integer value1, Integer value2) {
            addCriterion("`language` between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(Integer value1, Integer value2) {
            addCriterion("`language` not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andNolanIsNull() {
            addCriterion("nolan is null");
            return (Criteria) this;
        }

        public Criteria andNolanIsNotNull() {
            addCriterion("nolan is not null");
            return (Criteria) this;
        }

        public Criteria andNolanEqualTo(Integer value) {
            addCriterion("nolan =", value, "nolan");
            return (Criteria) this;
        }

        public Criteria andNolanNotEqualTo(Integer value) {
            addCriterion("nolan <>", value, "nolan");
            return (Criteria) this;
        }

        public Criteria andNolanGreaterThan(Integer value) {
            addCriterion("nolan >", value, "nolan");
            return (Criteria) this;
        }

        public Criteria andNolanGreaterThanOrEqualTo(Integer value) {
            addCriterion("nolan >=", value, "nolan");
            return (Criteria) this;
        }

        public Criteria andNolanLessThan(Integer value) {
            addCriterion("nolan <", value, "nolan");
            return (Criteria) this;
        }

        public Criteria andNolanLessThanOrEqualTo(Integer value) {
            addCriterion("nolan <=", value, "nolan");
            return (Criteria) this;
        }

        public Criteria andNolanIn(List<Integer> values) {
            addCriterion("nolan in", values, "nolan");
            return (Criteria) this;
        }

        public Criteria andNolanNotIn(List<Integer> values) {
            addCriterion("nolan not in", values, "nolan");
            return (Criteria) this;
        }

        public Criteria andNolanBetween(Integer value1, Integer value2) {
            addCriterion("nolan between", value1, value2, "nolan");
            return (Criteria) this;
        }

        public Criteria andNolanNotBetween(Integer value1, Integer value2) {
            addCriterion("nolan not between", value1, value2, "nolan");
            return (Criteria) this;
        }

        public Criteria andActivityIsNull() {
            addCriterion("activity is null");
            return (Criteria) this;
        }

        public Criteria andActivityIsNotNull() {
            addCriterion("activity is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEqualTo(Integer value) {
            addCriterion("activity =", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotEqualTo(Integer value) {
            addCriterion("activity <>", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThan(Integer value) {
            addCriterion("activity >", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity >=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThan(Integer value) {
            addCriterion("activity <", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThanOrEqualTo(Integer value) {
            addCriterion("activity <=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityIn(List<Integer> values) {
            addCriterion("activity in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotIn(List<Integer> values) {
            addCriterion("activity not in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityBetween(Integer value1, Integer value2) {
            addCriterion("activity between", value1, value2, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotBetween(Integer value1, Integer value2) {
            addCriterion("activity not between", value1, value2, "activity");
            return (Criteria) this;
        }

        public Criteria andIntelligenceIsNull() {
            addCriterion("intelligence is null");
            return (Criteria) this;
        }

        public Criteria andIntelligenceIsNotNull() {
            addCriterion("intelligence is not null");
            return (Criteria) this;
        }

        public Criteria andIntelligenceEqualTo(Integer value) {
            addCriterion("intelligence =", value, "intelligence");
            return (Criteria) this;
        }

        public Criteria andIntelligenceNotEqualTo(Integer value) {
            addCriterion("intelligence <>", value, "intelligence");
            return (Criteria) this;
        }

        public Criteria andIntelligenceGreaterThan(Integer value) {
            addCriterion("intelligence >", value, "intelligence");
            return (Criteria) this;
        }

        public Criteria andIntelligenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("intelligence >=", value, "intelligence");
            return (Criteria) this;
        }

        public Criteria andIntelligenceLessThan(Integer value) {
            addCriterion("intelligence <", value, "intelligence");
            return (Criteria) this;
        }

        public Criteria andIntelligenceLessThanOrEqualTo(Integer value) {
            addCriterion("intelligence <=", value, "intelligence");
            return (Criteria) this;
        }

        public Criteria andIntelligenceIn(List<Integer> values) {
            addCriterion("intelligence in", values, "intelligence");
            return (Criteria) this;
        }

        public Criteria andIntelligenceNotIn(List<Integer> values) {
            addCriterion("intelligence not in", values, "intelligence");
            return (Criteria) this;
        }

        public Criteria andIntelligenceBetween(Integer value1, Integer value2) {
            addCriterion("intelligence between", value1, value2, "intelligence");
            return (Criteria) this;
        }

        public Criteria andIntelligenceNotBetween(Integer value1, Integer value2) {
            addCriterion("intelligence not between", value1, value2, "intelligence");
            return (Criteria) this;
        }

        public Criteria andImpressionIsNull() {
            addCriterion("impression is null");
            return (Criteria) this;
        }

        public Criteria andImpressionIsNotNull() {
            addCriterion("impression is not null");
            return (Criteria) this;
        }

        public Criteria andImpressionEqualTo(Integer value) {
            addCriterion("impression =", value, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionNotEqualTo(Integer value) {
            addCriterion("impression <>", value, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionGreaterThan(Integer value) {
            addCriterion("impression >", value, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionGreaterThanOrEqualTo(Integer value) {
            addCriterion("impression >=", value, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionLessThan(Integer value) {
            addCriterion("impression <", value, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionLessThanOrEqualTo(Integer value) {
            addCriterion("impression <=", value, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionIn(List<Integer> values) {
            addCriterion("impression in", values, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionNotIn(List<Integer> values) {
            addCriterion("impression not in", values, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionBetween(Integer value1, Integer value2) {
            addCriterion("impression between", value1, value2, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionNotBetween(Integer value1, Integer value2) {
            addCriterion("impression not between", value1, value2, "impression");
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