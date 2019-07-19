package com.join.autism.entity.HzhRtm;

import java.util.ArrayList;
import java.util.List;

public class HzhRtmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HzhRtmExample() {
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

        public Criteria andIsLookIsNull() {
            addCriterion("is_look is null");
            return (Criteria) this;
        }

        public Criteria andIsLookIsNotNull() {
            addCriterion("is_look is not null");
            return (Criteria) this;
        }

        public Criteria andIsLookEqualTo(Integer value) {
            addCriterion("is_look =", value, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookNotEqualTo(Integer value) {
            addCriterion("is_look <>", value, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookGreaterThan(Integer value) {
            addCriterion("is_look >", value, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_look >=", value, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookLessThan(Integer value) {
            addCriterion("is_look <", value, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookLessThanOrEqualTo(Integer value) {
            addCriterion("is_look <=", value, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookIn(List<Integer> values) {
            addCriterion("is_look in", values, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookNotIn(List<Integer> values) {
            addCriterion("is_look not in", values, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookBetween(Integer value1, Integer value2) {
            addCriterion("is_look between", value1, value2, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookNotBetween(Integer value1, Integer value2) {
            addCriterion("is_look not between", value1, value2, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsHearingIsNull() {
            addCriterion("is_hearing is null");
            return (Criteria) this;
        }

        public Criteria andIsHearingIsNotNull() {
            addCriterion("is_hearing is not null");
            return (Criteria) this;
        }

        public Criteria andIsHearingEqualTo(Integer value) {
            addCriterion("is_hearing =", value, "isHearing");
            return (Criteria) this;
        }

        public Criteria andIsHearingNotEqualTo(Integer value) {
            addCriterion("is_hearing <>", value, "isHearing");
            return (Criteria) this;
        }

        public Criteria andIsHearingGreaterThan(Integer value) {
            addCriterion("is_hearing >", value, "isHearing");
            return (Criteria) this;
        }

        public Criteria andIsHearingGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_hearing >=", value, "isHearing");
            return (Criteria) this;
        }

        public Criteria andIsHearingLessThan(Integer value) {
            addCriterion("is_hearing <", value, "isHearing");
            return (Criteria) this;
        }

        public Criteria andIsHearingLessThanOrEqualTo(Integer value) {
            addCriterion("is_hearing <=", value, "isHearing");
            return (Criteria) this;
        }

        public Criteria andIsHearingIn(List<Integer> values) {
            addCriterion("is_hearing in", values, "isHearing");
            return (Criteria) this;
        }

        public Criteria andIsHearingNotIn(List<Integer> values) {
            addCriterion("is_hearing not in", values, "isHearing");
            return (Criteria) this;
        }

        public Criteria andIsHearingBetween(Integer value1, Integer value2) {
            addCriterion("is_hearing between", value1, value2, "isHearing");
            return (Criteria) this;
        }

        public Criteria andIsHearingNotBetween(Integer value1, Integer value2) {
            addCriterion("is_hearing not between", value1, value2, "isHearing");
            return (Criteria) this;
        }

        public Criteria andIsGameIsNull() {
            addCriterion("is_game is null");
            return (Criteria) this;
        }

        public Criteria andIsGameIsNotNull() {
            addCriterion("is_game is not null");
            return (Criteria) this;
        }

        public Criteria andIsGameEqualTo(Integer value) {
            addCriterion("is_game =", value, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameNotEqualTo(Integer value) {
            addCriterion("is_game <>", value, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameGreaterThan(Integer value) {
            addCriterion("is_game >", value, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_game >=", value, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameLessThan(Integer value) {
            addCriterion("is_game <", value, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameLessThanOrEqualTo(Integer value) {
            addCriterion("is_game <=", value, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameIn(List<Integer> values) {
            addCriterion("is_game in", values, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameNotIn(List<Integer> values) {
            addCriterion("is_game not in", values, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameBetween(Integer value1, Integer value2) {
            addCriterion("is_game between", value1, value2, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameNotBetween(Integer value1, Integer value2) {
            addCriterion("is_game not between", value1, value2, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsClimbingIsNull() {
            addCriterion("is_climbing is null");
            return (Criteria) this;
        }

        public Criteria andIsClimbingIsNotNull() {
            addCriterion("is_climbing is not null");
            return (Criteria) this;
        }

        public Criteria andIsClimbingEqualTo(Integer value) {
            addCriterion("is_climbing =", value, "isClimbing");
            return (Criteria) this;
        }

        public Criteria andIsClimbingNotEqualTo(Integer value) {
            addCriterion("is_climbing <>", value, "isClimbing");
            return (Criteria) this;
        }

        public Criteria andIsClimbingGreaterThan(Integer value) {
            addCriterion("is_climbing >", value, "isClimbing");
            return (Criteria) this;
        }

        public Criteria andIsClimbingGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_climbing >=", value, "isClimbing");
            return (Criteria) this;
        }

        public Criteria andIsClimbingLessThan(Integer value) {
            addCriterion("is_climbing <", value, "isClimbing");
            return (Criteria) this;
        }

        public Criteria andIsClimbingLessThanOrEqualTo(Integer value) {
            addCriterion("is_climbing <=", value, "isClimbing");
            return (Criteria) this;
        }

        public Criteria andIsClimbingIn(List<Integer> values) {
            addCriterion("is_climbing in", values, "isClimbing");
            return (Criteria) this;
        }

        public Criteria andIsClimbingNotIn(List<Integer> values) {
            addCriterion("is_climbing not in", values, "isClimbing");
            return (Criteria) this;
        }

        public Criteria andIsClimbingBetween(Integer value1, Integer value2) {
            addCriterion("is_climbing between", value1, value2, "isClimbing");
            return (Criteria) this;
        }

        public Criteria andIsClimbingNotBetween(Integer value1, Integer value2) {
            addCriterion("is_climbing not between", value1, value2, "isClimbing");
            return (Criteria) this;
        }

        public Criteria andIsFingerIsNull() {
            addCriterion("is_finger is null");
            return (Criteria) this;
        }

        public Criteria andIsFingerIsNotNull() {
            addCriterion("is_finger is not null");
            return (Criteria) this;
        }

        public Criteria andIsFingerEqualTo(Integer value) {
            addCriterion("is_finger =", value, "isFinger");
            return (Criteria) this;
        }

        public Criteria andIsFingerNotEqualTo(Integer value) {
            addCriterion("is_finger <>", value, "isFinger");
            return (Criteria) this;
        }

        public Criteria andIsFingerGreaterThan(Integer value) {
            addCriterion("is_finger >", value, "isFinger");
            return (Criteria) this;
        }

        public Criteria andIsFingerGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_finger >=", value, "isFinger");
            return (Criteria) this;
        }

        public Criteria andIsFingerLessThan(Integer value) {
            addCriterion("is_finger <", value, "isFinger");
            return (Criteria) this;
        }

        public Criteria andIsFingerLessThanOrEqualTo(Integer value) {
            addCriterion("is_finger <=", value, "isFinger");
            return (Criteria) this;
        }

        public Criteria andIsFingerIn(List<Integer> values) {
            addCriterion("is_finger in", values, "isFinger");
            return (Criteria) this;
        }

        public Criteria andIsFingerNotIn(List<Integer> values) {
            addCriterion("is_finger not in", values, "isFinger");
            return (Criteria) this;
        }

        public Criteria andIsFingerBetween(Integer value1, Integer value2) {
            addCriterion("is_finger between", value1, value2, "isFinger");
            return (Criteria) this;
        }

        public Criteria andIsFingerNotBetween(Integer value1, Integer value2) {
            addCriterion("is_finger not between", value1, value2, "isFinger");
            return (Criteria) this;
        }

        public Criteria andIsHelpIsNull() {
            addCriterion("is_help is null");
            return (Criteria) this;
        }

        public Criteria andIsHelpIsNotNull() {
            addCriterion("is_help is not null");
            return (Criteria) this;
        }

        public Criteria andIsHelpEqualTo(Integer value) {
            addCriterion("is_help =", value, "isHelp");
            return (Criteria) this;
        }

        public Criteria andIsHelpNotEqualTo(Integer value) {
            addCriterion("is_help <>", value, "isHelp");
            return (Criteria) this;
        }

        public Criteria andIsHelpGreaterThan(Integer value) {
            addCriterion("is_help >", value, "isHelp");
            return (Criteria) this;
        }

        public Criteria andIsHelpGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_help >=", value, "isHelp");
            return (Criteria) this;
        }

        public Criteria andIsHelpLessThan(Integer value) {
            addCriterion("is_help <", value, "isHelp");
            return (Criteria) this;
        }

        public Criteria andIsHelpLessThanOrEqualTo(Integer value) {
            addCriterion("is_help <=", value, "isHelp");
            return (Criteria) this;
        }

        public Criteria andIsHelpIn(List<Integer> values) {
            addCriterion("is_help in", values, "isHelp");
            return (Criteria) this;
        }

        public Criteria andIsHelpNotIn(List<Integer> values) {
            addCriterion("is_help not in", values, "isHelp");
            return (Criteria) this;
        }

        public Criteria andIsHelpBetween(Integer value1, Integer value2) {
            addCriterion("is_help between", value1, value2, "isHelp");
            return (Criteria) this;
        }

        public Criteria andIsHelpNotBetween(Integer value1, Integer value2) {
            addCriterion("is_help not between", value1, value2, "isHelp");
            return (Criteria) this;
        }

        public Criteria andIsInterestIsNull() {
            addCriterion("is_interest is null");
            return (Criteria) this;
        }

        public Criteria andIsInterestIsNotNull() {
            addCriterion("is_interest is not null");
            return (Criteria) this;
        }

        public Criteria andIsInterestEqualTo(Integer value) {
            addCriterion("is_interest =", value, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestNotEqualTo(Integer value) {
            addCriterion("is_interest <>", value, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestGreaterThan(Integer value) {
            addCriterion("is_interest >", value, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_interest >=", value, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestLessThan(Integer value) {
            addCriterion("is_interest <", value, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestLessThanOrEqualTo(Integer value) {
            addCriterion("is_interest <=", value, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestIn(List<Integer> values) {
            addCriterion("is_interest in", values, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestNotIn(List<Integer> values) {
            addCriterion("is_interest not in", values, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestBetween(Integer value1, Integer value2) {
            addCriterion("is_interest between", value1, value2, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestNotBetween(Integer value1, Integer value2) {
            addCriterion("is_interest not between", value1, value2, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsChildrenIsNull() {
            addCriterion("is_children is null");
            return (Criteria) this;
        }

        public Criteria andIsChildrenIsNotNull() {
            addCriterion("is_children is not null");
            return (Criteria) this;
        }

        public Criteria andIsChildrenEqualTo(Integer value) {
            addCriterion("is_children =", value, "isChildren");
            return (Criteria) this;
        }

        public Criteria andIsChildrenNotEqualTo(Integer value) {
            addCriterion("is_children <>", value, "isChildren");
            return (Criteria) this;
        }

        public Criteria andIsChildrenGreaterThan(Integer value) {
            addCriterion("is_children >", value, "isChildren");
            return (Criteria) this;
        }

        public Criteria andIsChildrenGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_children >=", value, "isChildren");
            return (Criteria) this;
        }

        public Criteria andIsChildrenLessThan(Integer value) {
            addCriterion("is_children <", value, "isChildren");
            return (Criteria) this;
        }

        public Criteria andIsChildrenLessThanOrEqualTo(Integer value) {
            addCriterion("is_children <=", value, "isChildren");
            return (Criteria) this;
        }

        public Criteria andIsChildrenIn(List<Integer> values) {
            addCriterion("is_children in", values, "isChildren");
            return (Criteria) this;
        }

        public Criteria andIsChildrenNotIn(List<Integer> values) {
            addCriterion("is_children not in", values, "isChildren");
            return (Criteria) this;
        }

        public Criteria andIsChildrenBetween(Integer value1, Integer value2) {
            addCriterion("is_children between", value1, value2, "isChildren");
            return (Criteria) this;
        }

        public Criteria andIsChildrenNotBetween(Integer value1, Integer value2) {
            addCriterion("is_children not between", value1, value2, "isChildren");
            return (Criteria) this;
        }

        public Criteria andIsParentsLookIsNull() {
            addCriterion("is_parents_look is null");
            return (Criteria) this;
        }

        public Criteria andIsParentsLookIsNotNull() {
            addCriterion("is_parents_look is not null");
            return (Criteria) this;
        }

        public Criteria andIsParentsLookEqualTo(Integer value) {
            addCriterion("is_parents_look =", value, "isParentsLook");
            return (Criteria) this;
        }

        public Criteria andIsParentsLookNotEqualTo(Integer value) {
            addCriterion("is_parents_look <>", value, "isParentsLook");
            return (Criteria) this;
        }

        public Criteria andIsParentsLookGreaterThan(Integer value) {
            addCriterion("is_parents_look >", value, "isParentsLook");
            return (Criteria) this;
        }

        public Criteria andIsParentsLookGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_parents_look >=", value, "isParentsLook");
            return (Criteria) this;
        }

        public Criteria andIsParentsLookLessThan(Integer value) {
            addCriterion("is_parents_look <", value, "isParentsLook");
            return (Criteria) this;
        }

        public Criteria andIsParentsLookLessThanOrEqualTo(Integer value) {
            addCriterion("is_parents_look <=", value, "isParentsLook");
            return (Criteria) this;
        }

        public Criteria andIsParentsLookIn(List<Integer> values) {
            addCriterion("is_parents_look in", values, "isParentsLook");
            return (Criteria) this;
        }

        public Criteria andIsParentsLookNotIn(List<Integer> values) {
            addCriterion("is_parents_look not in", values, "isParentsLook");
            return (Criteria) this;
        }

        public Criteria andIsParentsLookBetween(Integer value1, Integer value2) {
            addCriterion("is_parents_look between", value1, value2, "isParentsLook");
            return (Criteria) this;
        }

        public Criteria andIsParentsLookNotBetween(Integer value1, Integer value2) {
            addCriterion("is_parents_look not between", value1, value2, "isParentsLook");
            return (Criteria) this;
        }

        public Criteria andIsResponseIsNull() {
            addCriterion("is_response is null");
            return (Criteria) this;
        }

        public Criteria andIsResponseIsNotNull() {
            addCriterion("is_response is not null");
            return (Criteria) this;
        }

        public Criteria andIsResponseEqualTo(Integer value) {
            addCriterion("is_response =", value, "isResponse");
            return (Criteria) this;
        }

        public Criteria andIsResponseNotEqualTo(Integer value) {
            addCriterion("is_response <>", value, "isResponse");
            return (Criteria) this;
        }

        public Criteria andIsResponseGreaterThan(Integer value) {
            addCriterion("is_response >", value, "isResponse");
            return (Criteria) this;
        }

        public Criteria andIsResponseGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_response >=", value, "isResponse");
            return (Criteria) this;
        }

        public Criteria andIsResponseLessThan(Integer value) {
            addCriterion("is_response <", value, "isResponse");
            return (Criteria) this;
        }

        public Criteria andIsResponseLessThanOrEqualTo(Integer value) {
            addCriterion("is_response <=", value, "isResponse");
            return (Criteria) this;
        }

        public Criteria andIsResponseIn(List<Integer> values) {
            addCriterion("is_response in", values, "isResponse");
            return (Criteria) this;
        }

        public Criteria andIsResponseNotIn(List<Integer> values) {
            addCriterion("is_response not in", values, "isResponse");
            return (Criteria) this;
        }

        public Criteria andIsResponseBetween(Integer value1, Integer value2) {
            addCriterion("is_response between", value1, value2, "isResponse");
            return (Criteria) this;
        }

        public Criteria andIsResponseNotBetween(Integer value1, Integer value2) {
            addCriterion("is_response not between", value1, value2, "isResponse");
            return (Criteria) this;
        }

        public Criteria andIsSmileResponseIsNull() {
            addCriterion("is_smile_response is null");
            return (Criteria) this;
        }

        public Criteria andIsSmileResponseIsNotNull() {
            addCriterion("is_smile_response is not null");
            return (Criteria) this;
        }

        public Criteria andIsSmileResponseEqualTo(Integer value) {
            addCriterion("is_smile_response =", value, "isSmileResponse");
            return (Criteria) this;
        }

        public Criteria andIsSmileResponseNotEqualTo(Integer value) {
            addCriterion("is_smile_response <>", value, "isSmileResponse");
            return (Criteria) this;
        }

        public Criteria andIsSmileResponseGreaterThan(Integer value) {
            addCriterion("is_smile_response >", value, "isSmileResponse");
            return (Criteria) this;
        }

        public Criteria andIsSmileResponseGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_smile_response >=", value, "isSmileResponse");
            return (Criteria) this;
        }

        public Criteria andIsSmileResponseLessThan(Integer value) {
            addCriterion("is_smile_response <", value, "isSmileResponse");
            return (Criteria) this;
        }

        public Criteria andIsSmileResponseLessThanOrEqualTo(Integer value) {
            addCriterion("is_smile_response <=", value, "isSmileResponse");
            return (Criteria) this;
        }

        public Criteria andIsSmileResponseIn(List<Integer> values) {
            addCriterion("is_smile_response in", values, "isSmileResponse");
            return (Criteria) this;
        }

        public Criteria andIsSmileResponseNotIn(List<Integer> values) {
            addCriterion("is_smile_response not in", values, "isSmileResponse");
            return (Criteria) this;
        }

        public Criteria andIsSmileResponseBetween(Integer value1, Integer value2) {
            addCriterion("is_smile_response between", value1, value2, "isSmileResponse");
            return (Criteria) this;
        }

        public Criteria andIsSmileResponseNotBetween(Integer value1, Integer value2) {
            addCriterion("is_smile_response not between", value1, value2, "isSmileResponse");
            return (Criteria) this;
        }

        public Criteria andIsNoiseIsNull() {
            addCriterion("is_noise is null");
            return (Criteria) this;
        }

        public Criteria andIsNoiseIsNotNull() {
            addCriterion("is_noise is not null");
            return (Criteria) this;
        }

        public Criteria andIsNoiseEqualTo(Integer value) {
            addCriterion("is_noise =", value, "isNoise");
            return (Criteria) this;
        }

        public Criteria andIsNoiseNotEqualTo(Integer value) {
            addCriterion("is_noise <>", value, "isNoise");
            return (Criteria) this;
        }

        public Criteria andIsNoiseGreaterThan(Integer value) {
            addCriterion("is_noise >", value, "isNoise");
            return (Criteria) this;
        }

        public Criteria andIsNoiseGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_noise >=", value, "isNoise");
            return (Criteria) this;
        }

        public Criteria andIsNoiseLessThan(Integer value) {
            addCriterion("is_noise <", value, "isNoise");
            return (Criteria) this;
        }

        public Criteria andIsNoiseLessThanOrEqualTo(Integer value) {
            addCriterion("is_noise <=", value, "isNoise");
            return (Criteria) this;
        }

        public Criteria andIsNoiseIn(List<Integer> values) {
            addCriterion("is_noise in", values, "isNoise");
            return (Criteria) this;
        }

        public Criteria andIsNoiseNotIn(List<Integer> values) {
            addCriterion("is_noise not in", values, "isNoise");
            return (Criteria) this;
        }

        public Criteria andIsNoiseBetween(Integer value1, Integer value2) {
            addCriterion("is_noise between", value1, value2, "isNoise");
            return (Criteria) this;
        }

        public Criteria andIsNoiseNotBetween(Integer value1, Integer value2) {
            addCriterion("is_noise not between", value1, value2, "isNoise");
            return (Criteria) this;
        }

        public Criteria andIsGoIsNull() {
            addCriterion("is_go is null");
            return (Criteria) this;
        }

        public Criteria andIsGoIsNotNull() {
            addCriterion("is_go is not null");
            return (Criteria) this;
        }

        public Criteria andIsGoEqualTo(Integer value) {
            addCriterion("is_go =", value, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoNotEqualTo(Integer value) {
            addCriterion("is_go <>", value, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoGreaterThan(Integer value) {
            addCriterion("is_go >", value, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_go >=", value, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoLessThan(Integer value) {
            addCriterion("is_go <", value, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoLessThanOrEqualTo(Integer value) {
            addCriterion("is_go <=", value, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoIn(List<Integer> values) {
            addCriterion("is_go in", values, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoNotIn(List<Integer> values) {
            addCriterion("is_go not in", values, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoBetween(Integer value1, Integer value2) {
            addCriterion("is_go between", value1, value2, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoNotBetween(Integer value1, Integer value2) {
            addCriterion("is_go not between", value1, value2, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsEyeIsNull() {
            addCriterion("is_eye is null");
            return (Criteria) this;
        }

        public Criteria andIsEyeIsNotNull() {
            addCriterion("is_eye is not null");
            return (Criteria) this;
        }

        public Criteria andIsEyeEqualTo(Integer value) {
            addCriterion("is_eye =", value, "isEye");
            return (Criteria) this;
        }

        public Criteria andIsEyeNotEqualTo(Integer value) {
            addCriterion("is_eye <>", value, "isEye");
            return (Criteria) this;
        }

        public Criteria andIsEyeGreaterThan(Integer value) {
            addCriterion("is_eye >", value, "isEye");
            return (Criteria) this;
        }

        public Criteria andIsEyeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_eye >=", value, "isEye");
            return (Criteria) this;
        }

        public Criteria andIsEyeLessThan(Integer value) {
            addCriterion("is_eye <", value, "isEye");
            return (Criteria) this;
        }

        public Criteria andIsEyeLessThanOrEqualTo(Integer value) {
            addCriterion("is_eye <=", value, "isEye");
            return (Criteria) this;
        }

        public Criteria andIsEyeIn(List<Integer> values) {
            addCriterion("is_eye in", values, "isEye");
            return (Criteria) this;
        }

        public Criteria andIsEyeNotIn(List<Integer> values) {
            addCriterion("is_eye not in", values, "isEye");
            return (Criteria) this;
        }

        public Criteria andIsEyeBetween(Integer value1, Integer value2) {
            addCriterion("is_eye between", value1, value2, "isEye");
            return (Criteria) this;
        }

        public Criteria andIsEyeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_eye not between", value1, value2, "isEye");
            return (Criteria) this;
        }

        public Criteria andIsImitateIsNull() {
            addCriterion("is_imitate is null");
            return (Criteria) this;
        }

        public Criteria andIsImitateIsNotNull() {
            addCriterion("is_imitate is not null");
            return (Criteria) this;
        }

        public Criteria andIsImitateEqualTo(Integer value) {
            addCriterion("is_imitate =", value, "isImitate");
            return (Criteria) this;
        }

        public Criteria andIsImitateNotEqualTo(Integer value) {
            addCriterion("is_imitate <>", value, "isImitate");
            return (Criteria) this;
        }

        public Criteria andIsImitateGreaterThan(Integer value) {
            addCriterion("is_imitate >", value, "isImitate");
            return (Criteria) this;
        }

        public Criteria andIsImitateGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_imitate >=", value, "isImitate");
            return (Criteria) this;
        }

        public Criteria andIsImitateLessThan(Integer value) {
            addCriterion("is_imitate <", value, "isImitate");
            return (Criteria) this;
        }

        public Criteria andIsImitateLessThanOrEqualTo(Integer value) {
            addCriterion("is_imitate <=", value, "isImitate");
            return (Criteria) this;
        }

        public Criteria andIsImitateIn(List<Integer> values) {
            addCriterion("is_imitate in", values, "isImitate");
            return (Criteria) this;
        }

        public Criteria andIsImitateNotIn(List<Integer> values) {
            addCriterion("is_imitate not in", values, "isImitate");
            return (Criteria) this;
        }

        public Criteria andIsImitateBetween(Integer value1, Integer value2) {
            addCriterion("is_imitate between", value1, value2, "isImitate");
            return (Criteria) this;
        }

        public Criteria andIsImitateNotBetween(Integer value1, Integer value2) {
            addCriterion("is_imitate not between", value1, value2, "isImitate");
            return (Criteria) this;
        }

        public Criteria andIsSearchIsNull() {
            addCriterion("is_search is null");
            return (Criteria) this;
        }

        public Criteria andIsSearchIsNotNull() {
            addCriterion("is_search is not null");
            return (Criteria) this;
        }

        public Criteria andIsSearchEqualTo(Integer value) {
            addCriterion("is_search =", value, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchNotEqualTo(Integer value) {
            addCriterion("is_search <>", value, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchGreaterThan(Integer value) {
            addCriterion("is_search >", value, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_search >=", value, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchLessThan(Integer value) {
            addCriterion("is_search <", value, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchLessThanOrEqualTo(Integer value) {
            addCriterion("is_search <=", value, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchIn(List<Integer> values) {
            addCriterion("is_search in", values, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchNotIn(List<Integer> values) {
            addCriterion("is_search not in", values, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchBetween(Integer value1, Integer value2) {
            addCriterion("is_search between", value1, value2, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchNotBetween(Integer value1, Integer value2) {
            addCriterion("is_search not between", value1, value2, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsAttractIsNull() {
            addCriterion("is_attract is null");
            return (Criteria) this;
        }

        public Criteria andIsAttractIsNotNull() {
            addCriterion("is_attract is not null");
            return (Criteria) this;
        }

        public Criteria andIsAttractEqualTo(Integer value) {
            addCriterion("is_attract =", value, "isAttract");
            return (Criteria) this;
        }

        public Criteria andIsAttractNotEqualTo(Integer value) {
            addCriterion("is_attract <>", value, "isAttract");
            return (Criteria) this;
        }

        public Criteria andIsAttractGreaterThan(Integer value) {
            addCriterion("is_attract >", value, "isAttract");
            return (Criteria) this;
        }

        public Criteria andIsAttractGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_attract >=", value, "isAttract");
            return (Criteria) this;
        }

        public Criteria andIsAttractLessThan(Integer value) {
            addCriterion("is_attract <", value, "isAttract");
            return (Criteria) this;
        }

        public Criteria andIsAttractLessThanOrEqualTo(Integer value) {
            addCriterion("is_attract <=", value, "isAttract");
            return (Criteria) this;
        }

        public Criteria andIsAttractIn(List<Integer> values) {
            addCriterion("is_attract in", values, "isAttract");
            return (Criteria) this;
        }

        public Criteria andIsAttractNotIn(List<Integer> values) {
            addCriterion("is_attract not in", values, "isAttract");
            return (Criteria) this;
        }

        public Criteria andIsAttractBetween(Integer value1, Integer value2) {
            addCriterion("is_attract between", value1, value2, "isAttract");
            return (Criteria) this;
        }

        public Criteria andIsAttractNotBetween(Integer value1, Integer value2) {
            addCriterion("is_attract not between", value1, value2, "isAttract");
            return (Criteria) this;
        }

        public Criteria andIsUnderstandIsNull() {
            addCriterion("is_understand is null");
            return (Criteria) this;
        }

        public Criteria andIsUnderstandIsNotNull() {
            addCriterion("is_understand is not null");
            return (Criteria) this;
        }

        public Criteria andIsUnderstandEqualTo(Integer value) {
            addCriterion("is_understand =", value, "isUnderstand");
            return (Criteria) this;
        }

        public Criteria andIsUnderstandNotEqualTo(Integer value) {
            addCriterion("is_understand <>", value, "isUnderstand");
            return (Criteria) this;
        }

        public Criteria andIsUnderstandGreaterThan(Integer value) {
            addCriterion("is_understand >", value, "isUnderstand");
            return (Criteria) this;
        }

        public Criteria andIsUnderstandGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_understand >=", value, "isUnderstand");
            return (Criteria) this;
        }

        public Criteria andIsUnderstandLessThan(Integer value) {
            addCriterion("is_understand <", value, "isUnderstand");
            return (Criteria) this;
        }

        public Criteria andIsUnderstandLessThanOrEqualTo(Integer value) {
            addCriterion("is_understand <=", value, "isUnderstand");
            return (Criteria) this;
        }

        public Criteria andIsUnderstandIn(List<Integer> values) {
            addCriterion("is_understand in", values, "isUnderstand");
            return (Criteria) this;
        }

        public Criteria andIsUnderstandNotIn(List<Integer> values) {
            addCriterion("is_understand not in", values, "isUnderstand");
            return (Criteria) this;
        }

        public Criteria andIsUnderstandBetween(Integer value1, Integer value2) {
            addCriterion("is_understand between", value1, value2, "isUnderstand");
            return (Criteria) this;
        }

        public Criteria andIsUnderstandNotBetween(Integer value1, Integer value2) {
            addCriterion("is_understand not between", value1, value2, "isUnderstand");
            return (Criteria) this;
        }

        public Criteria andIsReactionIsNull() {
            addCriterion("is_reaction is null");
            return (Criteria) this;
        }

        public Criteria andIsReactionIsNotNull() {
            addCriterion("is_reaction is not null");
            return (Criteria) this;
        }

        public Criteria andIsReactionEqualTo(Integer value) {
            addCriterion("is_reaction =", value, "isReaction");
            return (Criteria) this;
        }

        public Criteria andIsReactionNotEqualTo(Integer value) {
            addCriterion("is_reaction <>", value, "isReaction");
            return (Criteria) this;
        }

        public Criteria andIsReactionGreaterThan(Integer value) {
            addCriterion("is_reaction >", value, "isReaction");
            return (Criteria) this;
        }

        public Criteria andIsReactionGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_reaction >=", value, "isReaction");
            return (Criteria) this;
        }

        public Criteria andIsReactionLessThan(Integer value) {
            addCriterion("is_reaction <", value, "isReaction");
            return (Criteria) this;
        }

        public Criteria andIsReactionLessThanOrEqualTo(Integer value) {
            addCriterion("is_reaction <=", value, "isReaction");
            return (Criteria) this;
        }

        public Criteria andIsReactionIn(List<Integer> values) {
            addCriterion("is_reaction in", values, "isReaction");
            return (Criteria) this;
        }

        public Criteria andIsReactionNotIn(List<Integer> values) {
            addCriterion("is_reaction not in", values, "isReaction");
            return (Criteria) this;
        }

        public Criteria andIsReactionBetween(Integer value1, Integer value2) {
            addCriterion("is_reaction between", value1, value2, "isReaction");
            return (Criteria) this;
        }

        public Criteria andIsReactionNotBetween(Integer value1, Integer value2) {
            addCriterion("is_reaction not between", value1, value2, "isReaction");
            return (Criteria) this;
        }

        public Criteria andIsMovementIsNull() {
            addCriterion("is_movement is null");
            return (Criteria) this;
        }

        public Criteria andIsMovementIsNotNull() {
            addCriterion("is_movement is not null");
            return (Criteria) this;
        }

        public Criteria andIsMovementEqualTo(Integer value) {
            addCriterion("is_movement =", value, "isMovement");
            return (Criteria) this;
        }

        public Criteria andIsMovementNotEqualTo(Integer value) {
            addCriterion("is_movement <>", value, "isMovement");
            return (Criteria) this;
        }

        public Criteria andIsMovementGreaterThan(Integer value) {
            addCriterion("is_movement >", value, "isMovement");
            return (Criteria) this;
        }

        public Criteria andIsMovementGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_movement >=", value, "isMovement");
            return (Criteria) this;
        }

        public Criteria andIsMovementLessThan(Integer value) {
            addCriterion("is_movement <", value, "isMovement");
            return (Criteria) this;
        }

        public Criteria andIsMovementLessThanOrEqualTo(Integer value) {
            addCriterion("is_movement <=", value, "isMovement");
            return (Criteria) this;
        }

        public Criteria andIsMovementIn(List<Integer> values) {
            addCriterion("is_movement in", values, "isMovement");
            return (Criteria) this;
        }

        public Criteria andIsMovementNotIn(List<Integer> values) {
            addCriterion("is_movement not in", values, "isMovement");
            return (Criteria) this;
        }

        public Criteria andIsMovementBetween(Integer value1, Integer value2) {
            addCriterion("is_movement between", value1, value2, "isMovement");
            return (Criteria) this;
        }

        public Criteria andIsMovementNotBetween(Integer value1, Integer value2) {
            addCriterion("is_movement not between", value1, value2, "isMovement");
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