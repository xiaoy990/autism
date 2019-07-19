package com.join.autism.entity.HzhGestation;

import java.util.ArrayList;
import java.util.List;

public class HzhGestationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HzhGestationExample() {
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

        public Criteria andCloseIsNull() {
            addCriterion("`close` is null");
            return (Criteria) this;
        }

        public Criteria andCloseIsNotNull() {
            addCriterion("`close` is not null");
            return (Criteria) this;
        }

        public Criteria andCloseEqualTo(Integer value) {
            addCriterion("`close` =", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotEqualTo(Integer value) {
            addCriterion("`close` <>", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseGreaterThan(Integer value) {
            addCriterion("`close` >", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseGreaterThanOrEqualTo(Integer value) {
            addCriterion("`close` >=", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseLessThan(Integer value) {
            addCriterion("`close` <", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseLessThanOrEqualTo(Integer value) {
            addCriterion("`close` <=", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseIn(List<Integer> values) {
            addCriterion("`close` in", values, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotIn(List<Integer> values) {
            addCriterion("`close` not in", values, "close");
            return (Criteria) this;
        }

        public Criteria andCloseBetween(Integer value1, Integer value2) {
            addCriterion("`close` between", value1, value2, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotBetween(Integer value1, Integer value2) {
            addCriterion("`close` not between", value1, value2, "close");
            return (Criteria) this;
        }

        public Criteria andClosereasonIsNull() {
            addCriterion("closereason is null");
            return (Criteria) this;
        }

        public Criteria andClosereasonIsNotNull() {
            addCriterion("closereason is not null");
            return (Criteria) this;
        }

        public Criteria andClosereasonEqualTo(String value) {
            addCriterion("closereason =", value, "closereason");
            return (Criteria) this;
        }

        public Criteria andClosereasonNotEqualTo(String value) {
            addCriterion("closereason <>", value, "closereason");
            return (Criteria) this;
        }

        public Criteria andClosereasonGreaterThan(String value) {
            addCriterion("closereason >", value, "closereason");
            return (Criteria) this;
        }

        public Criteria andClosereasonGreaterThanOrEqualTo(String value) {
            addCriterion("closereason >=", value, "closereason");
            return (Criteria) this;
        }

        public Criteria andClosereasonLessThan(String value) {
            addCriterion("closereason <", value, "closereason");
            return (Criteria) this;
        }

        public Criteria andClosereasonLessThanOrEqualTo(String value) {
            addCriterion("closereason <=", value, "closereason");
            return (Criteria) this;
        }

        public Criteria andClosereasonLike(String value) {
            addCriterion("closereason like", value, "closereason");
            return (Criteria) this;
        }

        public Criteria andClosereasonNotLike(String value) {
            addCriterion("closereason not like", value, "closereason");
            return (Criteria) this;
        }

        public Criteria andClosereasonIn(List<String> values) {
            addCriterion("closereason in", values, "closereason");
            return (Criteria) this;
        }

        public Criteria andClosereasonNotIn(List<String> values) {
            addCriterion("closereason not in", values, "closereason");
            return (Criteria) this;
        }

        public Criteria andClosereasonBetween(String value1, String value2) {
            addCriterion("closereason between", value1, value2, "closereason");
            return (Criteria) this;
        }

        public Criteria andClosereasonNotBetween(String value1, String value2) {
            addCriterion("closereason not between", value1, value2, "closereason");
            return (Criteria) this;
        }

        public Criteria andAbortioncountIsNull() {
            addCriterion("abortioncount is null");
            return (Criteria) this;
        }

        public Criteria andAbortioncountIsNotNull() {
            addCriterion("abortioncount is not null");
            return (Criteria) this;
        }

        public Criteria andAbortioncountEqualTo(Integer value) {
            addCriterion("abortioncount =", value, "abortioncount");
            return (Criteria) this;
        }

        public Criteria andAbortioncountNotEqualTo(Integer value) {
            addCriterion("abortioncount <>", value, "abortioncount");
            return (Criteria) this;
        }

        public Criteria andAbortioncountGreaterThan(Integer value) {
            addCriterion("abortioncount >", value, "abortioncount");
            return (Criteria) this;
        }

        public Criteria andAbortioncountGreaterThanOrEqualTo(Integer value) {
            addCriterion("abortioncount >=", value, "abortioncount");
            return (Criteria) this;
        }

        public Criteria andAbortioncountLessThan(Integer value) {
            addCriterion("abortioncount <", value, "abortioncount");
            return (Criteria) this;
        }

        public Criteria andAbortioncountLessThanOrEqualTo(Integer value) {
            addCriterion("abortioncount <=", value, "abortioncount");
            return (Criteria) this;
        }

        public Criteria andAbortioncountIn(List<Integer> values) {
            addCriterion("abortioncount in", values, "abortioncount");
            return (Criteria) this;
        }

        public Criteria andAbortioncountNotIn(List<Integer> values) {
            addCriterion("abortioncount not in", values, "abortioncount");
            return (Criteria) this;
        }

        public Criteria andAbortioncountBetween(Integer value1, Integer value2) {
            addCriterion("abortioncount between", value1, value2, "abortioncount");
            return (Criteria) this;
        }

        public Criteria andAbortioncountNotBetween(Integer value1, Integer value2) {
            addCriterion("abortioncount not between", value1, value2, "abortioncount");
            return (Criteria) this;
        }

        public Criteria andAbortionreasonIsNull() {
            addCriterion("abortionreason is null");
            return (Criteria) this;
        }

        public Criteria andAbortionreasonIsNotNull() {
            addCriterion("abortionreason is not null");
            return (Criteria) this;
        }

        public Criteria andAbortionreasonEqualTo(String value) {
            addCriterion("abortionreason =", value, "abortionreason");
            return (Criteria) this;
        }

        public Criteria andAbortionreasonNotEqualTo(String value) {
            addCriterion("abortionreason <>", value, "abortionreason");
            return (Criteria) this;
        }

        public Criteria andAbortionreasonGreaterThan(String value) {
            addCriterion("abortionreason >", value, "abortionreason");
            return (Criteria) this;
        }

        public Criteria andAbortionreasonGreaterThanOrEqualTo(String value) {
            addCriterion("abortionreason >=", value, "abortionreason");
            return (Criteria) this;
        }

        public Criteria andAbortionreasonLessThan(String value) {
            addCriterion("abortionreason <", value, "abortionreason");
            return (Criteria) this;
        }

        public Criteria andAbortionreasonLessThanOrEqualTo(String value) {
            addCriterion("abortionreason <=", value, "abortionreason");
            return (Criteria) this;
        }

        public Criteria andAbortionreasonLike(String value) {
            addCriterion("abortionreason like", value, "abortionreason");
            return (Criteria) this;
        }

        public Criteria andAbortionreasonNotLike(String value) {
            addCriterion("abortionreason not like", value, "abortionreason");
            return (Criteria) this;
        }

        public Criteria andAbortionreasonIn(List<String> values) {
            addCriterion("abortionreason in", values, "abortionreason");
            return (Criteria) this;
        }

        public Criteria andAbortionreasonNotIn(List<String> values) {
            addCriterion("abortionreason not in", values, "abortionreason");
            return (Criteria) this;
        }

        public Criteria andAbortionreasonBetween(String value1, String value2) {
            addCriterion("abortionreason between", value1, value2, "abortionreason");
            return (Criteria) this;
        }

        public Criteria andAbortionreasonNotBetween(String value1, String value2) {
            addCriterion("abortionreason not between", value1, value2, "abortionreason");
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

        public Criteria andAmnioticIsNull() {
            addCriterion("amniotic is null");
            return (Criteria) this;
        }

        public Criteria andAmnioticIsNotNull() {
            addCriterion("amniotic is not null");
            return (Criteria) this;
        }

        public Criteria andAmnioticEqualTo(String value) {
            addCriterion("amniotic =", value, "amniotic");
            return (Criteria) this;
        }

        public Criteria andAmnioticNotEqualTo(String value) {
            addCriterion("amniotic <>", value, "amniotic");
            return (Criteria) this;
        }

        public Criteria andAmnioticGreaterThan(String value) {
            addCriterion("amniotic >", value, "amniotic");
            return (Criteria) this;
        }

        public Criteria andAmnioticGreaterThanOrEqualTo(String value) {
            addCriterion("amniotic >=", value, "amniotic");
            return (Criteria) this;
        }

        public Criteria andAmnioticLessThan(String value) {
            addCriterion("amniotic <", value, "amniotic");
            return (Criteria) this;
        }

        public Criteria andAmnioticLessThanOrEqualTo(String value) {
            addCriterion("amniotic <=", value, "amniotic");
            return (Criteria) this;
        }

        public Criteria andAmnioticLike(String value) {
            addCriterion("amniotic like", value, "amniotic");
            return (Criteria) this;
        }

        public Criteria andAmnioticNotLike(String value) {
            addCriterion("amniotic not like", value, "amniotic");
            return (Criteria) this;
        }

        public Criteria andAmnioticIn(List<String> values) {
            addCriterion("amniotic in", values, "amniotic");
            return (Criteria) this;
        }

        public Criteria andAmnioticNotIn(List<String> values) {
            addCriterion("amniotic not in", values, "amniotic");
            return (Criteria) this;
        }

        public Criteria andAmnioticBetween(String value1, String value2) {
            addCriterion("amniotic between", value1, value2, "amniotic");
            return (Criteria) this;
        }

        public Criteria andAmnioticNotBetween(String value1, String value2) {
            addCriterion("amniotic not between", value1, value2, "amniotic");
            return (Criteria) this;
        }

        public Criteria andAmnioticreasonIsNull() {
            addCriterion("amnioticreason is null");
            return (Criteria) this;
        }

        public Criteria andAmnioticreasonIsNotNull() {
            addCriterion("amnioticreason is not null");
            return (Criteria) this;
        }

        public Criteria andAmnioticreasonEqualTo(String value) {
            addCriterion("amnioticreason =", value, "amnioticreason");
            return (Criteria) this;
        }

        public Criteria andAmnioticreasonNotEqualTo(String value) {
            addCriterion("amnioticreason <>", value, "amnioticreason");
            return (Criteria) this;
        }

        public Criteria andAmnioticreasonGreaterThan(String value) {
            addCriterion("amnioticreason >", value, "amnioticreason");
            return (Criteria) this;
        }

        public Criteria andAmnioticreasonGreaterThanOrEqualTo(String value) {
            addCriterion("amnioticreason >=", value, "amnioticreason");
            return (Criteria) this;
        }

        public Criteria andAmnioticreasonLessThan(String value) {
            addCriterion("amnioticreason <", value, "amnioticreason");
            return (Criteria) this;
        }

        public Criteria andAmnioticreasonLessThanOrEqualTo(String value) {
            addCriterion("amnioticreason <=", value, "amnioticreason");
            return (Criteria) this;
        }

        public Criteria andAmnioticreasonLike(String value) {
            addCriterion("amnioticreason like", value, "amnioticreason");
            return (Criteria) this;
        }

        public Criteria andAmnioticreasonNotLike(String value) {
            addCriterion("amnioticreason not like", value, "amnioticreason");
            return (Criteria) this;
        }

        public Criteria andAmnioticreasonIn(List<String> values) {
            addCriterion("amnioticreason in", values, "amnioticreason");
            return (Criteria) this;
        }

        public Criteria andAmnioticreasonNotIn(List<String> values) {
            addCriterion("amnioticreason not in", values, "amnioticreason");
            return (Criteria) this;
        }

        public Criteria andAmnioticreasonBetween(String value1, String value2) {
            addCriterion("amnioticreason between", value1, value2, "amnioticreason");
            return (Criteria) this;
        }

        public Criteria andAmnioticreasonNotBetween(String value1, String value2) {
            addCriterion("amnioticreason not between", value1, value2, "amnioticreason");
            return (Criteria) this;
        }

        public Criteria andHighbloodIsNull() {
            addCriterion("highblood is null");
            return (Criteria) this;
        }

        public Criteria andHighbloodIsNotNull() {
            addCriterion("highblood is not null");
            return (Criteria) this;
        }

        public Criteria andHighbloodEqualTo(Integer value) {
            addCriterion("highblood =", value, "highblood");
            return (Criteria) this;
        }

        public Criteria andHighbloodNotEqualTo(Integer value) {
            addCriterion("highblood <>", value, "highblood");
            return (Criteria) this;
        }

        public Criteria andHighbloodGreaterThan(Integer value) {
            addCriterion("highblood >", value, "highblood");
            return (Criteria) this;
        }

        public Criteria andHighbloodGreaterThanOrEqualTo(Integer value) {
            addCriterion("highblood >=", value, "highblood");
            return (Criteria) this;
        }

        public Criteria andHighbloodLessThan(Integer value) {
            addCriterion("highblood <", value, "highblood");
            return (Criteria) this;
        }

        public Criteria andHighbloodLessThanOrEqualTo(Integer value) {
            addCriterion("highblood <=", value, "highblood");
            return (Criteria) this;
        }

        public Criteria andHighbloodIn(List<Integer> values) {
            addCriterion("highblood in", values, "highblood");
            return (Criteria) this;
        }

        public Criteria andHighbloodNotIn(List<Integer> values) {
            addCriterion("highblood not in", values, "highblood");
            return (Criteria) this;
        }

        public Criteria andHighbloodBetween(Integer value1, Integer value2) {
            addCriterion("highblood between", value1, value2, "highblood");
            return (Criteria) this;
        }

        public Criteria andHighbloodNotBetween(Integer value1, Integer value2) {
            addCriterion("highblood not between", value1, value2, "highblood");
            return (Criteria) this;
        }

        public Criteria andHighbloodreasonIsNull() {
            addCriterion("highbloodreason is null");
            return (Criteria) this;
        }

        public Criteria andHighbloodreasonIsNotNull() {
            addCriterion("highbloodreason is not null");
            return (Criteria) this;
        }

        public Criteria andHighbloodreasonEqualTo(String value) {
            addCriterion("highbloodreason =", value, "highbloodreason");
            return (Criteria) this;
        }

        public Criteria andHighbloodreasonNotEqualTo(String value) {
            addCriterion("highbloodreason <>", value, "highbloodreason");
            return (Criteria) this;
        }

        public Criteria andHighbloodreasonGreaterThan(String value) {
            addCriterion("highbloodreason >", value, "highbloodreason");
            return (Criteria) this;
        }

        public Criteria andHighbloodreasonGreaterThanOrEqualTo(String value) {
            addCriterion("highbloodreason >=", value, "highbloodreason");
            return (Criteria) this;
        }

        public Criteria andHighbloodreasonLessThan(String value) {
            addCriterion("highbloodreason <", value, "highbloodreason");
            return (Criteria) this;
        }

        public Criteria andHighbloodreasonLessThanOrEqualTo(String value) {
            addCriterion("highbloodreason <=", value, "highbloodreason");
            return (Criteria) this;
        }

        public Criteria andHighbloodreasonLike(String value) {
            addCriterion("highbloodreason like", value, "highbloodreason");
            return (Criteria) this;
        }

        public Criteria andHighbloodreasonNotLike(String value) {
            addCriterion("highbloodreason not like", value, "highbloodreason");
            return (Criteria) this;
        }

        public Criteria andHighbloodreasonIn(List<String> values) {
            addCriterion("highbloodreason in", values, "highbloodreason");
            return (Criteria) this;
        }

        public Criteria andHighbloodreasonNotIn(List<String> values) {
            addCriterion("highbloodreason not in", values, "highbloodreason");
            return (Criteria) this;
        }

        public Criteria andHighbloodreasonBetween(String value1, String value2) {
            addCriterion("highbloodreason between", value1, value2, "highbloodreason");
            return (Criteria) this;
        }

        public Criteria andHighbloodreasonNotBetween(String value1, String value2) {
            addCriterion("highbloodreason not between", value1, value2, "highbloodreason");
            return (Criteria) this;
        }

        public Criteria andBabygoIsNull() {
            addCriterion("babygo is null");
            return (Criteria) this;
        }

        public Criteria andBabygoIsNotNull() {
            addCriterion("babygo is not null");
            return (Criteria) this;
        }

        public Criteria andBabygoEqualTo(Integer value) {
            addCriterion("babygo =", value, "babygo");
            return (Criteria) this;
        }

        public Criteria andBabygoNotEqualTo(Integer value) {
            addCriterion("babygo <>", value, "babygo");
            return (Criteria) this;
        }

        public Criteria andBabygoGreaterThan(Integer value) {
            addCriterion("babygo >", value, "babygo");
            return (Criteria) this;
        }

        public Criteria andBabygoGreaterThanOrEqualTo(Integer value) {
            addCriterion("babygo >=", value, "babygo");
            return (Criteria) this;
        }

        public Criteria andBabygoLessThan(Integer value) {
            addCriterion("babygo <", value, "babygo");
            return (Criteria) this;
        }

        public Criteria andBabygoLessThanOrEqualTo(Integer value) {
            addCriterion("babygo <=", value, "babygo");
            return (Criteria) this;
        }

        public Criteria andBabygoIn(List<Integer> values) {
            addCriterion("babygo in", values, "babygo");
            return (Criteria) this;
        }

        public Criteria andBabygoNotIn(List<Integer> values) {
            addCriterion("babygo not in", values, "babygo");
            return (Criteria) this;
        }

        public Criteria andBabygoBetween(Integer value1, Integer value2) {
            addCriterion("babygo between", value1, value2, "babygo");
            return (Criteria) this;
        }

        public Criteria andBabygoNotBetween(Integer value1, Integer value2) {
            addCriterion("babygo not between", value1, value2, "babygo");
            return (Criteria) this;
        }

        public Criteria andBabygoreasonIsNull() {
            addCriterion("babygoreason is null");
            return (Criteria) this;
        }

        public Criteria andBabygoreasonIsNotNull() {
            addCriterion("babygoreason is not null");
            return (Criteria) this;
        }

        public Criteria andBabygoreasonEqualTo(String value) {
            addCriterion("babygoreason =", value, "babygoreason");
            return (Criteria) this;
        }

        public Criteria andBabygoreasonNotEqualTo(String value) {
            addCriterion("babygoreason <>", value, "babygoreason");
            return (Criteria) this;
        }

        public Criteria andBabygoreasonGreaterThan(String value) {
            addCriterion("babygoreason >", value, "babygoreason");
            return (Criteria) this;
        }

        public Criteria andBabygoreasonGreaterThanOrEqualTo(String value) {
            addCriterion("babygoreason >=", value, "babygoreason");
            return (Criteria) this;
        }

        public Criteria andBabygoreasonLessThan(String value) {
            addCriterion("babygoreason <", value, "babygoreason");
            return (Criteria) this;
        }

        public Criteria andBabygoreasonLessThanOrEqualTo(String value) {
            addCriterion("babygoreason <=", value, "babygoreason");
            return (Criteria) this;
        }

        public Criteria andBabygoreasonLike(String value) {
            addCriterion("babygoreason like", value, "babygoreason");
            return (Criteria) this;
        }

        public Criteria andBabygoreasonNotLike(String value) {
            addCriterion("babygoreason not like", value, "babygoreason");
            return (Criteria) this;
        }

        public Criteria andBabygoreasonIn(List<String> values) {
            addCriterion("babygoreason in", values, "babygoreason");
            return (Criteria) this;
        }

        public Criteria andBabygoreasonNotIn(List<String> values) {
            addCriterion("babygoreason not in", values, "babygoreason");
            return (Criteria) this;
        }

        public Criteria andBabygoreasonBetween(String value1, String value2) {
            addCriterion("babygoreason between", value1, value2, "babygoreason");
            return (Criteria) this;
        }

        public Criteria andBabygoreasonNotBetween(String value1, String value2) {
            addCriterion("babygoreason not between", value1, value2, "babygoreason");
            return (Criteria) this;
        }

        public Criteria andBloodIsNull() {
            addCriterion("blood is null");
            return (Criteria) this;
        }

        public Criteria andBloodIsNotNull() {
            addCriterion("blood is not null");
            return (Criteria) this;
        }

        public Criteria andBloodEqualTo(Integer value) {
            addCriterion("blood =", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodNotEqualTo(Integer value) {
            addCriterion("blood <>", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodGreaterThan(Integer value) {
            addCriterion("blood >", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodGreaterThanOrEqualTo(Integer value) {
            addCriterion("blood >=", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodLessThan(Integer value) {
            addCriterion("blood <", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodLessThanOrEqualTo(Integer value) {
            addCriterion("blood <=", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodIn(List<Integer> values) {
            addCriterion("blood in", values, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodNotIn(List<Integer> values) {
            addCriterion("blood not in", values, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodBetween(Integer value1, Integer value2) {
            addCriterion("blood between", value1, value2, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodNotBetween(Integer value1, Integer value2) {
            addCriterion("blood not between", value1, value2, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodreasonIsNull() {
            addCriterion("bloodreason is null");
            return (Criteria) this;
        }

        public Criteria andBloodreasonIsNotNull() {
            addCriterion("bloodreason is not null");
            return (Criteria) this;
        }

        public Criteria andBloodreasonEqualTo(String value) {
            addCriterion("bloodreason =", value, "bloodreason");
            return (Criteria) this;
        }

        public Criteria andBloodreasonNotEqualTo(String value) {
            addCriterion("bloodreason <>", value, "bloodreason");
            return (Criteria) this;
        }

        public Criteria andBloodreasonGreaterThan(String value) {
            addCriterion("bloodreason >", value, "bloodreason");
            return (Criteria) this;
        }

        public Criteria andBloodreasonGreaterThanOrEqualTo(String value) {
            addCriterion("bloodreason >=", value, "bloodreason");
            return (Criteria) this;
        }

        public Criteria andBloodreasonLessThan(String value) {
            addCriterion("bloodreason <", value, "bloodreason");
            return (Criteria) this;
        }

        public Criteria andBloodreasonLessThanOrEqualTo(String value) {
            addCriterion("bloodreason <=", value, "bloodreason");
            return (Criteria) this;
        }

        public Criteria andBloodreasonLike(String value) {
            addCriterion("bloodreason like", value, "bloodreason");
            return (Criteria) this;
        }

        public Criteria andBloodreasonNotLike(String value) {
            addCriterion("bloodreason not like", value, "bloodreason");
            return (Criteria) this;
        }

        public Criteria andBloodreasonIn(List<String> values) {
            addCriterion("bloodreason in", values, "bloodreason");
            return (Criteria) this;
        }

        public Criteria andBloodreasonNotIn(List<String> values) {
            addCriterion("bloodreason not in", values, "bloodreason");
            return (Criteria) this;
        }

        public Criteria andBloodreasonBetween(String value1, String value2) {
            addCriterion("bloodreason between", value1, value2, "bloodreason");
            return (Criteria) this;
        }

        public Criteria andBloodreasonNotBetween(String value1, String value2) {
            addCriterion("bloodreason not between", value1, value2, "bloodreason");
            return (Criteria) this;
        }

        public Criteria andSugarwaterIsNull() {
            addCriterion("sugarwater is null");
            return (Criteria) this;
        }

        public Criteria andSugarwaterIsNotNull() {
            addCriterion("sugarwater is not null");
            return (Criteria) this;
        }

        public Criteria andSugarwaterEqualTo(Integer value) {
            addCriterion("sugarwater =", value, "sugarwater");
            return (Criteria) this;
        }

        public Criteria andSugarwaterNotEqualTo(Integer value) {
            addCriterion("sugarwater <>", value, "sugarwater");
            return (Criteria) this;
        }

        public Criteria andSugarwaterGreaterThan(Integer value) {
            addCriterion("sugarwater >", value, "sugarwater");
            return (Criteria) this;
        }

        public Criteria andSugarwaterGreaterThanOrEqualTo(Integer value) {
            addCriterion("sugarwater >=", value, "sugarwater");
            return (Criteria) this;
        }

        public Criteria andSugarwaterLessThan(Integer value) {
            addCriterion("sugarwater <", value, "sugarwater");
            return (Criteria) this;
        }

        public Criteria andSugarwaterLessThanOrEqualTo(Integer value) {
            addCriterion("sugarwater <=", value, "sugarwater");
            return (Criteria) this;
        }

        public Criteria andSugarwaterIn(List<Integer> values) {
            addCriterion("sugarwater in", values, "sugarwater");
            return (Criteria) this;
        }

        public Criteria andSugarwaterNotIn(List<Integer> values) {
            addCriterion("sugarwater not in", values, "sugarwater");
            return (Criteria) this;
        }

        public Criteria andSugarwaterBetween(Integer value1, Integer value2) {
            addCriterion("sugarwater between", value1, value2, "sugarwater");
            return (Criteria) this;
        }

        public Criteria andSugarwaterNotBetween(Integer value1, Integer value2) {
            addCriterion("sugarwater not between", value1, value2, "sugarwater");
            return (Criteria) this;
        }

        public Criteria andSugarwaterreasonIsNull() {
            addCriterion("sugarwaterreason is null");
            return (Criteria) this;
        }

        public Criteria andSugarwaterreasonIsNotNull() {
            addCriterion("sugarwaterreason is not null");
            return (Criteria) this;
        }

        public Criteria andSugarwaterreasonEqualTo(String value) {
            addCriterion("sugarwaterreason =", value, "sugarwaterreason");
            return (Criteria) this;
        }

        public Criteria andSugarwaterreasonNotEqualTo(String value) {
            addCriterion("sugarwaterreason <>", value, "sugarwaterreason");
            return (Criteria) this;
        }

        public Criteria andSugarwaterreasonGreaterThan(String value) {
            addCriterion("sugarwaterreason >", value, "sugarwaterreason");
            return (Criteria) this;
        }

        public Criteria andSugarwaterreasonGreaterThanOrEqualTo(String value) {
            addCriterion("sugarwaterreason >=", value, "sugarwaterreason");
            return (Criteria) this;
        }

        public Criteria andSugarwaterreasonLessThan(String value) {
            addCriterion("sugarwaterreason <", value, "sugarwaterreason");
            return (Criteria) this;
        }

        public Criteria andSugarwaterreasonLessThanOrEqualTo(String value) {
            addCriterion("sugarwaterreason <=", value, "sugarwaterreason");
            return (Criteria) this;
        }

        public Criteria andSugarwaterreasonLike(String value) {
            addCriterion("sugarwaterreason like", value, "sugarwaterreason");
            return (Criteria) this;
        }

        public Criteria andSugarwaterreasonNotLike(String value) {
            addCriterion("sugarwaterreason not like", value, "sugarwaterreason");
            return (Criteria) this;
        }

        public Criteria andSugarwaterreasonIn(List<String> values) {
            addCriterion("sugarwaterreason in", values, "sugarwaterreason");
            return (Criteria) this;
        }

        public Criteria andSugarwaterreasonNotIn(List<String> values) {
            addCriterion("sugarwaterreason not in", values, "sugarwaterreason");
            return (Criteria) this;
        }

        public Criteria andSugarwaterreasonBetween(String value1, String value2) {
            addCriterion("sugarwaterreason between", value1, value2, "sugarwaterreason");
            return (Criteria) this;
        }

        public Criteria andSugarwaterreasonNotBetween(String value1, String value2) {
            addCriterion("sugarwaterreason not between", value1, value2, "sugarwaterreason");
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

        public Criteria andBluesEqualTo(Integer value) {
            addCriterion("blues =", value, "blues");
            return (Criteria) this;
        }

        public Criteria andBluesNotEqualTo(Integer value) {
            addCriterion("blues <>", value, "blues");
            return (Criteria) this;
        }

        public Criteria andBluesGreaterThan(Integer value) {
            addCriterion("blues >", value, "blues");
            return (Criteria) this;
        }

        public Criteria andBluesGreaterThanOrEqualTo(Integer value) {
            addCriterion("blues >=", value, "blues");
            return (Criteria) this;
        }

        public Criteria andBluesLessThan(Integer value) {
            addCriterion("blues <", value, "blues");
            return (Criteria) this;
        }

        public Criteria andBluesLessThanOrEqualTo(Integer value) {
            addCriterion("blues <=", value, "blues");
            return (Criteria) this;
        }

        public Criteria andBluesIn(List<Integer> values) {
            addCriterion("blues in", values, "blues");
            return (Criteria) this;
        }

        public Criteria andBluesNotIn(List<Integer> values) {
            addCriterion("blues not in", values, "blues");
            return (Criteria) this;
        }

        public Criteria andBluesBetween(Integer value1, Integer value2) {
            addCriterion("blues between", value1, value2, "blues");
            return (Criteria) this;
        }

        public Criteria andBluesNotBetween(Integer value1, Integer value2) {
            addCriterion("blues not between", value1, value2, "blues");
            return (Criteria) this;
        }

        public Criteria andBluesreasonIsNull() {
            addCriterion("bluesreason is null");
            return (Criteria) this;
        }

        public Criteria andBluesreasonIsNotNull() {
            addCriterion("bluesreason is not null");
            return (Criteria) this;
        }

        public Criteria andBluesreasonEqualTo(String value) {
            addCriterion("bluesreason =", value, "bluesreason");
            return (Criteria) this;
        }

        public Criteria andBluesreasonNotEqualTo(String value) {
            addCriterion("bluesreason <>", value, "bluesreason");
            return (Criteria) this;
        }

        public Criteria andBluesreasonGreaterThan(String value) {
            addCriterion("bluesreason >", value, "bluesreason");
            return (Criteria) this;
        }

        public Criteria andBluesreasonGreaterThanOrEqualTo(String value) {
            addCriterion("bluesreason >=", value, "bluesreason");
            return (Criteria) this;
        }

        public Criteria andBluesreasonLessThan(String value) {
            addCriterion("bluesreason <", value, "bluesreason");
            return (Criteria) this;
        }

        public Criteria andBluesreasonLessThanOrEqualTo(String value) {
            addCriterion("bluesreason <=", value, "bluesreason");
            return (Criteria) this;
        }

        public Criteria andBluesreasonLike(String value) {
            addCriterion("bluesreason like", value, "bluesreason");
            return (Criteria) this;
        }

        public Criteria andBluesreasonNotLike(String value) {
            addCriterion("bluesreason not like", value, "bluesreason");
            return (Criteria) this;
        }

        public Criteria andBluesreasonIn(List<String> values) {
            addCriterion("bluesreason in", values, "bluesreason");
            return (Criteria) this;
        }

        public Criteria andBluesreasonNotIn(List<String> values) {
            addCriterion("bluesreason not in", values, "bluesreason");
            return (Criteria) this;
        }

        public Criteria andBluesreasonBetween(String value1, String value2) {
            addCriterion("bluesreason between", value1, value2, "bluesreason");
            return (Criteria) this;
        }

        public Criteria andBluesreasonNotBetween(String value1, String value2) {
            addCriterion("bluesreason not between", value1, value2, "bluesreason");
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

        public Criteria andOtherEqualTo(Integer value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(Integer value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(Integer value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(Integer value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(Integer value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(Integer value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<Integer> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<Integer> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(Integer value1, Integer value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(Integer value1, Integer value2) {
            addCriterion("other not between", value1, value2, "other");
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

        public Criteria andDrugIsNull() {
            addCriterion("drug is null");
            return (Criteria) this;
        }

        public Criteria andDrugIsNotNull() {
            addCriterion("drug is not null");
            return (Criteria) this;
        }

        public Criteria andDrugEqualTo(Integer value) {
            addCriterion("drug =", value, "drug");
            return (Criteria) this;
        }

        public Criteria andDrugNotEqualTo(Integer value) {
            addCriterion("drug <>", value, "drug");
            return (Criteria) this;
        }

        public Criteria andDrugGreaterThan(Integer value) {
            addCriterion("drug >", value, "drug");
            return (Criteria) this;
        }

        public Criteria andDrugGreaterThanOrEqualTo(Integer value) {
            addCriterion("drug >=", value, "drug");
            return (Criteria) this;
        }

        public Criteria andDrugLessThan(Integer value) {
            addCriterion("drug <", value, "drug");
            return (Criteria) this;
        }

        public Criteria andDrugLessThanOrEqualTo(Integer value) {
            addCriterion("drug <=", value, "drug");
            return (Criteria) this;
        }

        public Criteria andDrugIn(List<Integer> values) {
            addCriterion("drug in", values, "drug");
            return (Criteria) this;
        }

        public Criteria andDrugNotIn(List<Integer> values) {
            addCriterion("drug not in", values, "drug");
            return (Criteria) this;
        }

        public Criteria andDrugBetween(Integer value1, Integer value2) {
            addCriterion("drug between", value1, value2, "drug");
            return (Criteria) this;
        }

        public Criteria andDrugNotBetween(Integer value1, Integer value2) {
            addCriterion("drug not between", value1, value2, "drug");
            return (Criteria) this;
        }

        public Criteria andDrugreasonIsNull() {
            addCriterion("drugreason is null");
            return (Criteria) this;
        }

        public Criteria andDrugreasonIsNotNull() {
            addCriterion("drugreason is not null");
            return (Criteria) this;
        }

        public Criteria andDrugreasonEqualTo(String value) {
            addCriterion("drugreason =", value, "drugreason");
            return (Criteria) this;
        }

        public Criteria andDrugreasonNotEqualTo(String value) {
            addCriterion("drugreason <>", value, "drugreason");
            return (Criteria) this;
        }

        public Criteria andDrugreasonGreaterThan(String value) {
            addCriterion("drugreason >", value, "drugreason");
            return (Criteria) this;
        }

        public Criteria andDrugreasonGreaterThanOrEqualTo(String value) {
            addCriterion("drugreason >=", value, "drugreason");
            return (Criteria) this;
        }

        public Criteria andDrugreasonLessThan(String value) {
            addCriterion("drugreason <", value, "drugreason");
            return (Criteria) this;
        }

        public Criteria andDrugreasonLessThanOrEqualTo(String value) {
            addCriterion("drugreason <=", value, "drugreason");
            return (Criteria) this;
        }

        public Criteria andDrugreasonLike(String value) {
            addCriterion("drugreason like", value, "drugreason");
            return (Criteria) this;
        }

        public Criteria andDrugreasonNotLike(String value) {
            addCriterion("drugreason not like", value, "drugreason");
            return (Criteria) this;
        }

        public Criteria andDrugreasonIn(List<String> values) {
            addCriterion("drugreason in", values, "drugreason");
            return (Criteria) this;
        }

        public Criteria andDrugreasonNotIn(List<String> values) {
            addCriterion("drugreason not in", values, "drugreason");
            return (Criteria) this;
        }

        public Criteria andDrugreasonBetween(String value1, String value2) {
            addCriterion("drugreason between", value1, value2, "drugreason");
            return (Criteria) this;
        }

        public Criteria andDrugreasonNotBetween(String value1, String value2) {
            addCriterion("drugreason not between", value1, value2, "drugreason");
            return (Criteria) this;
        }

        public Criteria andBearIsNull() {
            addCriterion("bear is null");
            return (Criteria) this;
        }

        public Criteria andBearIsNotNull() {
            addCriterion("bear is not null");
            return (Criteria) this;
        }

        public Criteria andBearEqualTo(Integer value) {
            addCriterion("bear =", value, "bear");
            return (Criteria) this;
        }

        public Criteria andBearNotEqualTo(Integer value) {
            addCriterion("bear <>", value, "bear");
            return (Criteria) this;
        }

        public Criteria andBearGreaterThan(Integer value) {
            addCriterion("bear >", value, "bear");
            return (Criteria) this;
        }

        public Criteria andBearGreaterThanOrEqualTo(Integer value) {
            addCriterion("bear >=", value, "bear");
            return (Criteria) this;
        }

        public Criteria andBearLessThan(Integer value) {
            addCriterion("bear <", value, "bear");
            return (Criteria) this;
        }

        public Criteria andBearLessThanOrEqualTo(Integer value) {
            addCriterion("bear <=", value, "bear");
            return (Criteria) this;
        }

        public Criteria andBearIn(List<Integer> values) {
            addCriterion("bear in", values, "bear");
            return (Criteria) this;
        }

        public Criteria andBearNotIn(List<Integer> values) {
            addCriterion("bear not in", values, "bear");
            return (Criteria) this;
        }

        public Criteria andBearBetween(Integer value1, Integer value2) {
            addCriterion("bear between", value1, value2, "bear");
            return (Criteria) this;
        }

        public Criteria andBearNotBetween(Integer value1, Integer value2) {
            addCriterion("bear not between", value1, value2, "bear");
            return (Criteria) this;
        }

        public Criteria andBearreasonIsNull() {
            addCriterion("bearreason is null");
            return (Criteria) this;
        }

        public Criteria andBearreasonIsNotNull() {
            addCriterion("bearreason is not null");
            return (Criteria) this;
        }

        public Criteria andBearreasonEqualTo(String value) {
            addCriterion("bearreason =", value, "bearreason");
            return (Criteria) this;
        }

        public Criteria andBearreasonNotEqualTo(String value) {
            addCriterion("bearreason <>", value, "bearreason");
            return (Criteria) this;
        }

        public Criteria andBearreasonGreaterThan(String value) {
            addCriterion("bearreason >", value, "bearreason");
            return (Criteria) this;
        }

        public Criteria andBearreasonGreaterThanOrEqualTo(String value) {
            addCriterion("bearreason >=", value, "bearreason");
            return (Criteria) this;
        }

        public Criteria andBearreasonLessThan(String value) {
            addCriterion("bearreason <", value, "bearreason");
            return (Criteria) this;
        }

        public Criteria andBearreasonLessThanOrEqualTo(String value) {
            addCriterion("bearreason <=", value, "bearreason");
            return (Criteria) this;
        }

        public Criteria andBearreasonLike(String value) {
            addCriterion("bearreason like", value, "bearreason");
            return (Criteria) this;
        }

        public Criteria andBearreasonNotLike(String value) {
            addCriterion("bearreason not like", value, "bearreason");
            return (Criteria) this;
        }

        public Criteria andBearreasonIn(List<String> values) {
            addCriterion("bearreason in", values, "bearreason");
            return (Criteria) this;
        }

        public Criteria andBearreasonNotIn(List<String> values) {
            addCriterion("bearreason not in", values, "bearreason");
            return (Criteria) this;
        }

        public Criteria andBearreasonBetween(String value1, String value2) {
            addCriterion("bearreason between", value1, value2, "bearreason");
            return (Criteria) this;
        }

        public Criteria andBearreasonNotBetween(String value1, String value2) {
            addCriterion("bearreason not between", value1, value2, "bearreason");
            return (Criteria) this;
        }

        public Criteria andXrayIsNull() {
            addCriterion("xray is null");
            return (Criteria) this;
        }

        public Criteria andXrayIsNotNull() {
            addCriterion("xray is not null");
            return (Criteria) this;
        }

        public Criteria andXrayEqualTo(Integer value) {
            addCriterion("xray =", value, "xray");
            return (Criteria) this;
        }

        public Criteria andXrayNotEqualTo(Integer value) {
            addCriterion("xray <>", value, "xray");
            return (Criteria) this;
        }

        public Criteria andXrayGreaterThan(Integer value) {
            addCriterion("xray >", value, "xray");
            return (Criteria) this;
        }

        public Criteria andXrayGreaterThanOrEqualTo(Integer value) {
            addCriterion("xray >=", value, "xray");
            return (Criteria) this;
        }

        public Criteria andXrayLessThan(Integer value) {
            addCriterion("xray <", value, "xray");
            return (Criteria) this;
        }

        public Criteria andXrayLessThanOrEqualTo(Integer value) {
            addCriterion("xray <=", value, "xray");
            return (Criteria) this;
        }

        public Criteria andXrayIn(List<Integer> values) {
            addCriterion("xray in", values, "xray");
            return (Criteria) this;
        }

        public Criteria andXrayNotIn(List<Integer> values) {
            addCriterion("xray not in", values, "xray");
            return (Criteria) this;
        }

        public Criteria andXrayBetween(Integer value1, Integer value2) {
            addCriterion("xray between", value1, value2, "xray");
            return (Criteria) this;
        }

        public Criteria andXrayNotBetween(Integer value1, Integer value2) {
            addCriterion("xray not between", value1, value2, "xray");
            return (Criteria) this;
        }

        public Criteria andXrayreasonIsNull() {
            addCriterion("xrayreason is null");
            return (Criteria) this;
        }

        public Criteria andXrayreasonIsNotNull() {
            addCriterion("xrayreason is not null");
            return (Criteria) this;
        }

        public Criteria andXrayreasonEqualTo(String value) {
            addCriterion("xrayreason =", value, "xrayreason");
            return (Criteria) this;
        }

        public Criteria andXrayreasonNotEqualTo(String value) {
            addCriterion("xrayreason <>", value, "xrayreason");
            return (Criteria) this;
        }

        public Criteria andXrayreasonGreaterThan(String value) {
            addCriterion("xrayreason >", value, "xrayreason");
            return (Criteria) this;
        }

        public Criteria andXrayreasonGreaterThanOrEqualTo(String value) {
            addCriterion("xrayreason >=", value, "xrayreason");
            return (Criteria) this;
        }

        public Criteria andXrayreasonLessThan(String value) {
            addCriterion("xrayreason <", value, "xrayreason");
            return (Criteria) this;
        }

        public Criteria andXrayreasonLessThanOrEqualTo(String value) {
            addCriterion("xrayreason <=", value, "xrayreason");
            return (Criteria) this;
        }

        public Criteria andXrayreasonLike(String value) {
            addCriterion("xrayreason like", value, "xrayreason");
            return (Criteria) this;
        }

        public Criteria andXrayreasonNotLike(String value) {
            addCriterion("xrayreason not like", value, "xrayreason");
            return (Criteria) this;
        }

        public Criteria andXrayreasonIn(List<String> values) {
            addCriterion("xrayreason in", values, "xrayreason");
            return (Criteria) this;
        }

        public Criteria andXrayreasonNotIn(List<String> values) {
            addCriterion("xrayreason not in", values, "xrayreason");
            return (Criteria) this;
        }

        public Criteria andXrayreasonBetween(String value1, String value2) {
            addCriterion("xrayreason between", value1, value2, "xrayreason");
            return (Criteria) this;
        }

        public Criteria andXrayreasonNotBetween(String value1, String value2) {
            addCriterion("xrayreason not between", value1, value2, "xrayreason");
            return (Criteria) this;
        }

        public Criteria andBadsIsNull() {
            addCriterion("bads is null");
            return (Criteria) this;
        }

        public Criteria andBadsIsNotNull() {
            addCriterion("bads is not null");
            return (Criteria) this;
        }

        public Criteria andBadsEqualTo(Integer value) {
            addCriterion("bads =", value, "bads");
            return (Criteria) this;
        }

        public Criteria andBadsNotEqualTo(Integer value) {
            addCriterion("bads <>", value, "bads");
            return (Criteria) this;
        }

        public Criteria andBadsGreaterThan(Integer value) {
            addCriterion("bads >", value, "bads");
            return (Criteria) this;
        }

        public Criteria andBadsGreaterThanOrEqualTo(Integer value) {
            addCriterion("bads >=", value, "bads");
            return (Criteria) this;
        }

        public Criteria andBadsLessThan(Integer value) {
            addCriterion("bads <", value, "bads");
            return (Criteria) this;
        }

        public Criteria andBadsLessThanOrEqualTo(Integer value) {
            addCriterion("bads <=", value, "bads");
            return (Criteria) this;
        }

        public Criteria andBadsIn(List<Integer> values) {
            addCriterion("bads in", values, "bads");
            return (Criteria) this;
        }

        public Criteria andBadsNotIn(List<Integer> values) {
            addCriterion("bads not in", values, "bads");
            return (Criteria) this;
        }

        public Criteria andBadsBetween(Integer value1, Integer value2) {
            addCriterion("bads between", value1, value2, "bads");
            return (Criteria) this;
        }

        public Criteria andBadsNotBetween(Integer value1, Integer value2) {
            addCriterion("bads not between", value1, value2, "bads");
            return (Criteria) this;
        }

        public Criteria andBadsreasonIsNull() {
            addCriterion("badsreason is null");
            return (Criteria) this;
        }

        public Criteria andBadsreasonIsNotNull() {
            addCriterion("badsreason is not null");
            return (Criteria) this;
        }

        public Criteria andBadsreasonEqualTo(String value) {
            addCriterion("badsreason =", value, "badsreason");
            return (Criteria) this;
        }

        public Criteria andBadsreasonNotEqualTo(String value) {
            addCriterion("badsreason <>", value, "badsreason");
            return (Criteria) this;
        }

        public Criteria andBadsreasonGreaterThan(String value) {
            addCriterion("badsreason >", value, "badsreason");
            return (Criteria) this;
        }

        public Criteria andBadsreasonGreaterThanOrEqualTo(String value) {
            addCriterion("badsreason >=", value, "badsreason");
            return (Criteria) this;
        }

        public Criteria andBadsreasonLessThan(String value) {
            addCriterion("badsreason <", value, "badsreason");
            return (Criteria) this;
        }

        public Criteria andBadsreasonLessThanOrEqualTo(String value) {
            addCriterion("badsreason <=", value, "badsreason");
            return (Criteria) this;
        }

        public Criteria andBadsreasonLike(String value) {
            addCriterion("badsreason like", value, "badsreason");
            return (Criteria) this;
        }

        public Criteria andBadsreasonNotLike(String value) {
            addCriterion("badsreason not like", value, "badsreason");
            return (Criteria) this;
        }

        public Criteria andBadsreasonIn(List<String> values) {
            addCriterion("badsreason in", values, "badsreason");
            return (Criteria) this;
        }

        public Criteria andBadsreasonNotIn(List<String> values) {
            addCriterion("badsreason not in", values, "badsreason");
            return (Criteria) this;
        }

        public Criteria andBadsreasonBetween(String value1, String value2) {
            addCriterion("badsreason between", value1, value2, "badsreason");
            return (Criteria) this;
        }

        public Criteria andBadsreasonNotBetween(String value1, String value2) {
            addCriterion("badsreason not between", value1, value2, "badsreason");
            return (Criteria) this;
        }

        public Criteria andFidgeIsNull() {
            addCriterion("fidge is null");
            return (Criteria) this;
        }

        public Criteria andFidgeIsNotNull() {
            addCriterion("fidge is not null");
            return (Criteria) this;
        }

        public Criteria andFidgeEqualTo(Integer value) {
            addCriterion("fidge =", value, "fidge");
            return (Criteria) this;
        }

        public Criteria andFidgeNotEqualTo(Integer value) {
            addCriterion("fidge <>", value, "fidge");
            return (Criteria) this;
        }

        public Criteria andFidgeGreaterThan(Integer value) {
            addCriterion("fidge >", value, "fidge");
            return (Criteria) this;
        }

        public Criteria andFidgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fidge >=", value, "fidge");
            return (Criteria) this;
        }

        public Criteria andFidgeLessThan(Integer value) {
            addCriterion("fidge <", value, "fidge");
            return (Criteria) this;
        }

        public Criteria andFidgeLessThanOrEqualTo(Integer value) {
            addCriterion("fidge <=", value, "fidge");
            return (Criteria) this;
        }

        public Criteria andFidgeIn(List<Integer> values) {
            addCriterion("fidge in", values, "fidge");
            return (Criteria) this;
        }

        public Criteria andFidgeNotIn(List<Integer> values) {
            addCriterion("fidge not in", values, "fidge");
            return (Criteria) this;
        }

        public Criteria andFidgeBetween(Integer value1, Integer value2) {
            addCriterion("fidge between", value1, value2, "fidge");
            return (Criteria) this;
        }

        public Criteria andFidgeNotBetween(Integer value1, Integer value2) {
            addCriterion("fidge not between", value1, value2, "fidge");
            return (Criteria) this;
        }

        public Criteria andFidgereasonIsNull() {
            addCriterion("fidgereason is null");
            return (Criteria) this;
        }

        public Criteria andFidgereasonIsNotNull() {
            addCriterion("fidgereason is not null");
            return (Criteria) this;
        }

        public Criteria andFidgereasonEqualTo(String value) {
            addCriterion("fidgereason =", value, "fidgereason");
            return (Criteria) this;
        }

        public Criteria andFidgereasonNotEqualTo(String value) {
            addCriterion("fidgereason <>", value, "fidgereason");
            return (Criteria) this;
        }

        public Criteria andFidgereasonGreaterThan(String value) {
            addCriterion("fidgereason >", value, "fidgereason");
            return (Criteria) this;
        }

        public Criteria andFidgereasonGreaterThanOrEqualTo(String value) {
            addCriterion("fidgereason >=", value, "fidgereason");
            return (Criteria) this;
        }

        public Criteria andFidgereasonLessThan(String value) {
            addCriterion("fidgereason <", value, "fidgereason");
            return (Criteria) this;
        }

        public Criteria andFidgereasonLessThanOrEqualTo(String value) {
            addCriterion("fidgereason <=", value, "fidgereason");
            return (Criteria) this;
        }

        public Criteria andFidgereasonLike(String value) {
            addCriterion("fidgereason like", value, "fidgereason");
            return (Criteria) this;
        }

        public Criteria andFidgereasonNotLike(String value) {
            addCriterion("fidgereason not like", value, "fidgereason");
            return (Criteria) this;
        }

        public Criteria andFidgereasonIn(List<String> values) {
            addCriterion("fidgereason in", values, "fidgereason");
            return (Criteria) this;
        }

        public Criteria andFidgereasonNotIn(List<String> values) {
            addCriterion("fidgereason not in", values, "fidgereason");
            return (Criteria) this;
        }

        public Criteria andFidgereasonBetween(String value1, String value2) {
            addCriterion("fidgereason between", value1, value2, "fidgereason");
            return (Criteria) this;
        }

        public Criteria andFidgereasonNotBetween(String value1, String value2) {
            addCriterion("fidgereason not between", value1, value2, "fidgereason");
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

        public Criteria andStressIsNull() {
            addCriterion("stress is null");
            return (Criteria) this;
        }

        public Criteria andStressIsNotNull() {
            addCriterion("stress is not null");
            return (Criteria) this;
        }

        public Criteria andStressEqualTo(Integer value) {
            addCriterion("stress =", value, "stress");
            return (Criteria) this;
        }

        public Criteria andStressNotEqualTo(Integer value) {
            addCriterion("stress <>", value, "stress");
            return (Criteria) this;
        }

        public Criteria andStressGreaterThan(Integer value) {
            addCriterion("stress >", value, "stress");
            return (Criteria) this;
        }

        public Criteria andStressGreaterThanOrEqualTo(Integer value) {
            addCriterion("stress >=", value, "stress");
            return (Criteria) this;
        }

        public Criteria andStressLessThan(Integer value) {
            addCriterion("stress <", value, "stress");
            return (Criteria) this;
        }

        public Criteria andStressLessThanOrEqualTo(Integer value) {
            addCriterion("stress <=", value, "stress");
            return (Criteria) this;
        }

        public Criteria andStressIn(List<Integer> values) {
            addCriterion("stress in", values, "stress");
            return (Criteria) this;
        }

        public Criteria andStressNotIn(List<Integer> values) {
            addCriterion("stress not in", values, "stress");
            return (Criteria) this;
        }

        public Criteria andStressBetween(Integer value1, Integer value2) {
            addCriterion("stress between", value1, value2, "stress");
            return (Criteria) this;
        }

        public Criteria andStressNotBetween(Integer value1, Integer value2) {
            addCriterion("stress not between", value1, value2, "stress");
            return (Criteria) this;
        }

        public Criteria andStressreasonIsNull() {
            addCriterion("stressreason is null");
            return (Criteria) this;
        }

        public Criteria andStressreasonIsNotNull() {
            addCriterion("stressreason is not null");
            return (Criteria) this;
        }

        public Criteria andStressreasonEqualTo(String value) {
            addCriterion("stressreason =", value, "stressreason");
            return (Criteria) this;
        }

        public Criteria andStressreasonNotEqualTo(String value) {
            addCriterion("stressreason <>", value, "stressreason");
            return (Criteria) this;
        }

        public Criteria andStressreasonGreaterThan(String value) {
            addCriterion("stressreason >", value, "stressreason");
            return (Criteria) this;
        }

        public Criteria andStressreasonGreaterThanOrEqualTo(String value) {
            addCriterion("stressreason >=", value, "stressreason");
            return (Criteria) this;
        }

        public Criteria andStressreasonLessThan(String value) {
            addCriterion("stressreason <", value, "stressreason");
            return (Criteria) this;
        }

        public Criteria andStressreasonLessThanOrEqualTo(String value) {
            addCriterion("stressreason <=", value, "stressreason");
            return (Criteria) this;
        }

        public Criteria andStressreasonLike(String value) {
            addCriterion("stressreason like", value, "stressreason");
            return (Criteria) this;
        }

        public Criteria andStressreasonNotLike(String value) {
            addCriterion("stressreason not like", value, "stressreason");
            return (Criteria) this;
        }

        public Criteria andStressreasonIn(List<String> values) {
            addCriterion("stressreason in", values, "stressreason");
            return (Criteria) this;
        }

        public Criteria andStressreasonNotIn(List<String> values) {
            addCriterion("stressreason not in", values, "stressreason");
            return (Criteria) this;
        }

        public Criteria andStressreasonBetween(String value1, String value2) {
            addCriterion("stressreason between", value1, value2, "stressreason");
            return (Criteria) this;
        }

        public Criteria andStressreasonNotBetween(String value1, String value2) {
            addCriterion("stressreason not between", value1, value2, "stressreason");
            return (Criteria) this;
        }

        public Criteria andXiyanIsNull() {
            addCriterion("xiyan is null");
            return (Criteria) this;
        }

        public Criteria andXiyanIsNotNull() {
            addCriterion("xiyan is not null");
            return (Criteria) this;
        }

        public Criteria andXiyanEqualTo(Integer value) {
            addCriterion("xiyan =", value, "xiyan");
            return (Criteria) this;
        }

        public Criteria andXiyanNotEqualTo(Integer value) {
            addCriterion("xiyan <>", value, "xiyan");
            return (Criteria) this;
        }

        public Criteria andXiyanGreaterThan(Integer value) {
            addCriterion("xiyan >", value, "xiyan");
            return (Criteria) this;
        }

        public Criteria andXiyanGreaterThanOrEqualTo(Integer value) {
            addCriterion("xiyan >=", value, "xiyan");
            return (Criteria) this;
        }

        public Criteria andXiyanLessThan(Integer value) {
            addCriterion("xiyan <", value, "xiyan");
            return (Criteria) this;
        }

        public Criteria andXiyanLessThanOrEqualTo(Integer value) {
            addCriterion("xiyan <=", value, "xiyan");
            return (Criteria) this;
        }

        public Criteria andXiyanIn(List<Integer> values) {
            addCriterion("xiyan in", values, "xiyan");
            return (Criteria) this;
        }

        public Criteria andXiyanNotIn(List<Integer> values) {
            addCriterion("xiyan not in", values, "xiyan");
            return (Criteria) this;
        }

        public Criteria andXiyanBetween(Integer value1, Integer value2) {
            addCriterion("xiyan between", value1, value2, "xiyan");
            return (Criteria) this;
        }

        public Criteria andXiyanNotBetween(Integer value1, Integer value2) {
            addCriterion("xiyan not between", value1, value2, "xiyan");
            return (Criteria) this;
        }

        public Criteria andYesuanIsNull() {
            addCriterion("yesuan is null");
            return (Criteria) this;
        }

        public Criteria andYesuanIsNotNull() {
            addCriterion("yesuan is not null");
            return (Criteria) this;
        }

        public Criteria andYesuanEqualTo(Integer value) {
            addCriterion("yesuan =", value, "yesuan");
            return (Criteria) this;
        }

        public Criteria andYesuanNotEqualTo(Integer value) {
            addCriterion("yesuan <>", value, "yesuan");
            return (Criteria) this;
        }

        public Criteria andYesuanGreaterThan(Integer value) {
            addCriterion("yesuan >", value, "yesuan");
            return (Criteria) this;
        }

        public Criteria andYesuanGreaterThanOrEqualTo(Integer value) {
            addCriterion("yesuan >=", value, "yesuan");
            return (Criteria) this;
        }

        public Criteria andYesuanLessThan(Integer value) {
            addCriterion("yesuan <", value, "yesuan");
            return (Criteria) this;
        }

        public Criteria andYesuanLessThanOrEqualTo(Integer value) {
            addCriterion("yesuan <=", value, "yesuan");
            return (Criteria) this;
        }

        public Criteria andYesuanIn(List<Integer> values) {
            addCriterion("yesuan in", values, "yesuan");
            return (Criteria) this;
        }

        public Criteria andYesuanNotIn(List<Integer> values) {
            addCriterion("yesuan not in", values, "yesuan");
            return (Criteria) this;
        }

        public Criteria andYesuanBetween(Integer value1, Integer value2) {
            addCriterion("yesuan between", value1, value2, "yesuan");
            return (Criteria) this;
        }

        public Criteria andYesuanNotBetween(Integer value1, Integer value2) {
            addCriterion("yesuan not between", value1, value2, "yesuan");
            return (Criteria) this;
        }

        public Criteria andBingduIsNull() {
            addCriterion("bingdu is null");
            return (Criteria) this;
        }

        public Criteria andBingduIsNotNull() {
            addCriterion("bingdu is not null");
            return (Criteria) this;
        }

        public Criteria andBingduEqualTo(Integer value) {
            addCriterion("bingdu =", value, "bingdu");
            return (Criteria) this;
        }

        public Criteria andBingduNotEqualTo(Integer value) {
            addCriterion("bingdu <>", value, "bingdu");
            return (Criteria) this;
        }

        public Criteria andBingduGreaterThan(Integer value) {
            addCriterion("bingdu >", value, "bingdu");
            return (Criteria) this;
        }

        public Criteria andBingduGreaterThanOrEqualTo(Integer value) {
            addCriterion("bingdu >=", value, "bingdu");
            return (Criteria) this;
        }

        public Criteria andBingduLessThan(Integer value) {
            addCriterion("bingdu <", value, "bingdu");
            return (Criteria) this;
        }

        public Criteria andBingduLessThanOrEqualTo(Integer value) {
            addCriterion("bingdu <=", value, "bingdu");
            return (Criteria) this;
        }

        public Criteria andBingduIn(List<Integer> values) {
            addCriterion("bingdu in", values, "bingdu");
            return (Criteria) this;
        }

        public Criteria andBingduNotIn(List<Integer> values) {
            addCriterion("bingdu not in", values, "bingdu");
            return (Criteria) this;
        }

        public Criteria andBingduBetween(Integer value1, Integer value2) {
            addCriterion("bingdu between", value1, value2, "bingdu");
            return (Criteria) this;
        }

        public Criteria andBingduNotBetween(Integer value1, Integer value2) {
            addCriterion("bingdu not between", value1, value2, "bingdu");
            return (Criteria) this;
        }

        public Criteria andXiyansIsNull() {
            addCriterion("xiyans is null");
            return (Criteria) this;
        }

        public Criteria andXiyansIsNotNull() {
            addCriterion("xiyans is not null");
            return (Criteria) this;
        }

        public Criteria andXiyansEqualTo(String value) {
            addCriterion("xiyans =", value, "xiyans");
            return (Criteria) this;
        }

        public Criteria andXiyansNotEqualTo(String value) {
            addCriterion("xiyans <>", value, "xiyans");
            return (Criteria) this;
        }

        public Criteria andXiyansGreaterThan(String value) {
            addCriterion("xiyans >", value, "xiyans");
            return (Criteria) this;
        }

        public Criteria andXiyansGreaterThanOrEqualTo(String value) {
            addCriterion("xiyans >=", value, "xiyans");
            return (Criteria) this;
        }

        public Criteria andXiyansLessThan(String value) {
            addCriterion("xiyans <", value, "xiyans");
            return (Criteria) this;
        }

        public Criteria andXiyansLessThanOrEqualTo(String value) {
            addCriterion("xiyans <=", value, "xiyans");
            return (Criteria) this;
        }

        public Criteria andXiyansLike(String value) {
            addCriterion("xiyans like", value, "xiyans");
            return (Criteria) this;
        }

        public Criteria andXiyansNotLike(String value) {
            addCriterion("xiyans not like", value, "xiyans");
            return (Criteria) this;
        }

        public Criteria andXiyansIn(List<String> values) {
            addCriterion("xiyans in", values, "xiyans");
            return (Criteria) this;
        }

        public Criteria andXiyansNotIn(List<String> values) {
            addCriterion("xiyans not in", values, "xiyans");
            return (Criteria) this;
        }

        public Criteria andXiyansBetween(String value1, String value2) {
            addCriterion("xiyans between", value1, value2, "xiyans");
            return (Criteria) this;
        }

        public Criteria andXiyansNotBetween(String value1, String value2) {
            addCriterion("xiyans not between", value1, value2, "xiyans");
            return (Criteria) this;
        }

        public Criteria andYesuansIsNull() {
            addCriterion("yesuans is null");
            return (Criteria) this;
        }

        public Criteria andYesuansIsNotNull() {
            addCriterion("yesuans is not null");
            return (Criteria) this;
        }

        public Criteria andYesuansEqualTo(String value) {
            addCriterion("yesuans =", value, "yesuans");
            return (Criteria) this;
        }

        public Criteria andYesuansNotEqualTo(String value) {
            addCriterion("yesuans <>", value, "yesuans");
            return (Criteria) this;
        }

        public Criteria andYesuansGreaterThan(String value) {
            addCriterion("yesuans >", value, "yesuans");
            return (Criteria) this;
        }

        public Criteria andYesuansGreaterThanOrEqualTo(String value) {
            addCriterion("yesuans >=", value, "yesuans");
            return (Criteria) this;
        }

        public Criteria andYesuansLessThan(String value) {
            addCriterion("yesuans <", value, "yesuans");
            return (Criteria) this;
        }

        public Criteria andYesuansLessThanOrEqualTo(String value) {
            addCriterion("yesuans <=", value, "yesuans");
            return (Criteria) this;
        }

        public Criteria andYesuansLike(String value) {
            addCriterion("yesuans like", value, "yesuans");
            return (Criteria) this;
        }

        public Criteria andYesuansNotLike(String value) {
            addCriterion("yesuans not like", value, "yesuans");
            return (Criteria) this;
        }

        public Criteria andYesuansIn(List<String> values) {
            addCriterion("yesuans in", values, "yesuans");
            return (Criteria) this;
        }

        public Criteria andYesuansNotIn(List<String> values) {
            addCriterion("yesuans not in", values, "yesuans");
            return (Criteria) this;
        }

        public Criteria andYesuansBetween(String value1, String value2) {
            addCriterion("yesuans between", value1, value2, "yesuans");
            return (Criteria) this;
        }

        public Criteria andYesuansNotBetween(String value1, String value2) {
            addCriterion("yesuans not between", value1, value2, "yesuans");
            return (Criteria) this;
        }

        public Criteria andBingdusIsNull() {
            addCriterion("bingdus is null");
            return (Criteria) this;
        }

        public Criteria andBingdusIsNotNull() {
            addCriterion("bingdus is not null");
            return (Criteria) this;
        }

        public Criteria andBingdusEqualTo(String value) {
            addCriterion("bingdus =", value, "bingdus");
            return (Criteria) this;
        }

        public Criteria andBingdusNotEqualTo(String value) {
            addCriterion("bingdus <>", value, "bingdus");
            return (Criteria) this;
        }

        public Criteria andBingdusGreaterThan(String value) {
            addCriterion("bingdus >", value, "bingdus");
            return (Criteria) this;
        }

        public Criteria andBingdusGreaterThanOrEqualTo(String value) {
            addCriterion("bingdus >=", value, "bingdus");
            return (Criteria) this;
        }

        public Criteria andBingdusLessThan(String value) {
            addCriterion("bingdus <", value, "bingdus");
            return (Criteria) this;
        }

        public Criteria andBingdusLessThanOrEqualTo(String value) {
            addCriterion("bingdus <=", value, "bingdus");
            return (Criteria) this;
        }

        public Criteria andBingdusLike(String value) {
            addCriterion("bingdus like", value, "bingdus");
            return (Criteria) this;
        }

        public Criteria andBingdusNotLike(String value) {
            addCriterion("bingdus not like", value, "bingdus");
            return (Criteria) this;
        }

        public Criteria andBingdusIn(List<String> values) {
            addCriterion("bingdus in", values, "bingdus");
            return (Criteria) this;
        }

        public Criteria andBingdusNotIn(List<String> values) {
            addCriterion("bingdus not in", values, "bingdus");
            return (Criteria) this;
        }

        public Criteria andBingdusBetween(String value1, String value2) {
            addCriterion("bingdus between", value1, value2, "bingdus");
            return (Criteria) this;
        }

        public Criteria andBingdusNotBetween(String value1, String value2) {
            addCriterion("bingdus not between", value1, value2, "bingdus");
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