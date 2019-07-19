package com.join.autism.entity.HzhConvertion;

import java.util.ArrayList;
import java.util.List;

public class HzhConvertionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HzhConvertionExample() {
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

        public Criteria andSleepIsNull() {
            addCriterion("sleep is null");
            return (Criteria) this;
        }

        public Criteria andSleepIsNotNull() {
            addCriterion("sleep is not null");
            return (Criteria) this;
        }

        public Criteria andSleepEqualTo(Integer value) {
            addCriterion("sleep =", value, "sleep");
            return (Criteria) this;
        }

        public Criteria andSleepNotEqualTo(Integer value) {
            addCriterion("sleep <>", value, "sleep");
            return (Criteria) this;
        }

        public Criteria andSleepGreaterThan(Integer value) {
            addCriterion("sleep >", value, "sleep");
            return (Criteria) this;
        }

        public Criteria andSleepGreaterThanOrEqualTo(Integer value) {
            addCriterion("sleep >=", value, "sleep");
            return (Criteria) this;
        }

        public Criteria andSleepLessThan(Integer value) {
            addCriterion("sleep <", value, "sleep");
            return (Criteria) this;
        }

        public Criteria andSleepLessThanOrEqualTo(Integer value) {
            addCriterion("sleep <=", value, "sleep");
            return (Criteria) this;
        }

        public Criteria andSleepIn(List<Integer> values) {
            addCriterion("sleep in", values, "sleep");
            return (Criteria) this;
        }

        public Criteria andSleepNotIn(List<Integer> values) {
            addCriterion("sleep not in", values, "sleep");
            return (Criteria) this;
        }

        public Criteria andSleepBetween(Integer value1, Integer value2) {
            addCriterion("sleep between", value1, value2, "sleep");
            return (Criteria) this;
        }

        public Criteria andSleepNotBetween(Integer value1, Integer value2) {
            addCriterion("sleep not between", value1, value2, "sleep");
            return (Criteria) this;
        }

        public Criteria andSleepreasonIsNull() {
            addCriterion("sleepreason is null");
            return (Criteria) this;
        }

        public Criteria andSleepreasonIsNotNull() {
            addCriterion("sleepreason is not null");
            return (Criteria) this;
        }

        public Criteria andSleepreasonEqualTo(String value) {
            addCriterion("sleepreason =", value, "sleepreason");
            return (Criteria) this;
        }

        public Criteria andSleepreasonNotEqualTo(String value) {
            addCriterion("sleepreason <>", value, "sleepreason");
            return (Criteria) this;
        }

        public Criteria andSleepreasonGreaterThan(String value) {
            addCriterion("sleepreason >", value, "sleepreason");
            return (Criteria) this;
        }

        public Criteria andSleepreasonGreaterThanOrEqualTo(String value) {
            addCriterion("sleepreason >=", value, "sleepreason");
            return (Criteria) this;
        }

        public Criteria andSleepreasonLessThan(String value) {
            addCriterion("sleepreason <", value, "sleepreason");
            return (Criteria) this;
        }

        public Criteria andSleepreasonLessThanOrEqualTo(String value) {
            addCriterion("sleepreason <=", value, "sleepreason");
            return (Criteria) this;
        }

        public Criteria andSleepreasonLike(String value) {
            addCriterion("sleepreason like", value, "sleepreason");
            return (Criteria) this;
        }

        public Criteria andSleepreasonNotLike(String value) {
            addCriterion("sleepreason not like", value, "sleepreason");
            return (Criteria) this;
        }

        public Criteria andSleepreasonIn(List<String> values) {
            addCriterion("sleepreason in", values, "sleepreason");
            return (Criteria) this;
        }

        public Criteria andSleepreasonNotIn(List<String> values) {
            addCriterion("sleepreason not in", values, "sleepreason");
            return (Criteria) this;
        }

        public Criteria andSleepreasonBetween(String value1, String value2) {
            addCriterion("sleepreason between", value1, value2, "sleepreason");
            return (Criteria) this;
        }

        public Criteria andSleepreasonNotBetween(String value1, String value2) {
            addCriterion("sleepreason not between", value1, value2, "sleepreason");
            return (Criteria) this;
        }

        public Criteria andEatIsNull() {
            addCriterion("eat is null");
            return (Criteria) this;
        }

        public Criteria andEatIsNotNull() {
            addCriterion("eat is not null");
            return (Criteria) this;
        }

        public Criteria andEatEqualTo(Integer value) {
            addCriterion("eat =", value, "eat");
            return (Criteria) this;
        }

        public Criteria andEatNotEqualTo(Integer value) {
            addCriterion("eat <>", value, "eat");
            return (Criteria) this;
        }

        public Criteria andEatGreaterThan(Integer value) {
            addCriterion("eat >", value, "eat");
            return (Criteria) this;
        }

        public Criteria andEatGreaterThanOrEqualTo(Integer value) {
            addCriterion("eat >=", value, "eat");
            return (Criteria) this;
        }

        public Criteria andEatLessThan(Integer value) {
            addCriterion("eat <", value, "eat");
            return (Criteria) this;
        }

        public Criteria andEatLessThanOrEqualTo(Integer value) {
            addCriterion("eat <=", value, "eat");
            return (Criteria) this;
        }

        public Criteria andEatIn(List<Integer> values) {
            addCriterion("eat in", values, "eat");
            return (Criteria) this;
        }

        public Criteria andEatNotIn(List<Integer> values) {
            addCriterion("eat not in", values, "eat");
            return (Criteria) this;
        }

        public Criteria andEatBetween(Integer value1, Integer value2) {
            addCriterion("eat between", value1, value2, "eat");
            return (Criteria) this;
        }

        public Criteria andEatNotBetween(Integer value1, Integer value2) {
            addCriterion("eat not between", value1, value2, "eat");
            return (Criteria) this;
        }

        public Criteria andEatreasonIsNull() {
            addCriterion("eatreason is null");
            return (Criteria) this;
        }

        public Criteria andEatreasonIsNotNull() {
            addCriterion("eatreason is not null");
            return (Criteria) this;
        }

        public Criteria andEatreasonEqualTo(String value) {
            addCriterion("eatreason =", value, "eatreason");
            return (Criteria) this;
        }

        public Criteria andEatreasonNotEqualTo(String value) {
            addCriterion("eatreason <>", value, "eatreason");
            return (Criteria) this;
        }

        public Criteria andEatreasonGreaterThan(String value) {
            addCriterion("eatreason >", value, "eatreason");
            return (Criteria) this;
        }

        public Criteria andEatreasonGreaterThanOrEqualTo(String value) {
            addCriterion("eatreason >=", value, "eatreason");
            return (Criteria) this;
        }

        public Criteria andEatreasonLessThan(String value) {
            addCriterion("eatreason <", value, "eatreason");
            return (Criteria) this;
        }

        public Criteria andEatreasonLessThanOrEqualTo(String value) {
            addCriterion("eatreason <=", value, "eatreason");
            return (Criteria) this;
        }

        public Criteria andEatreasonLike(String value) {
            addCriterion("eatreason like", value, "eatreason");
            return (Criteria) this;
        }

        public Criteria andEatreasonNotLike(String value) {
            addCriterion("eatreason not like", value, "eatreason");
            return (Criteria) this;
        }

        public Criteria andEatreasonIn(List<String> values) {
            addCriterion("eatreason in", values, "eatreason");
            return (Criteria) this;
        }

        public Criteria andEatreasonNotIn(List<String> values) {
            addCriterion("eatreason not in", values, "eatreason");
            return (Criteria) this;
        }

        public Criteria andEatreasonBetween(String value1, String value2) {
            addCriterion("eatreason between", value1, value2, "eatreason");
            return (Criteria) this;
        }

        public Criteria andEatreasonNotBetween(String value1, String value2) {
            addCriterion("eatreason not between", value1, value2, "eatreason");
            return (Criteria) this;
        }

        public Criteria andFatIsNull() {
            addCriterion("fat is null");
            return (Criteria) this;
        }

        public Criteria andFatIsNotNull() {
            addCriterion("fat is not null");
            return (Criteria) this;
        }

        public Criteria andFatEqualTo(Integer value) {
            addCriterion("fat =", value, "fat");
            return (Criteria) this;
        }

        public Criteria andFatNotEqualTo(Integer value) {
            addCriterion("fat <>", value, "fat");
            return (Criteria) this;
        }

        public Criteria andFatGreaterThan(Integer value) {
            addCriterion("fat >", value, "fat");
            return (Criteria) this;
        }

        public Criteria andFatGreaterThanOrEqualTo(Integer value) {
            addCriterion("fat >=", value, "fat");
            return (Criteria) this;
        }

        public Criteria andFatLessThan(Integer value) {
            addCriterion("fat <", value, "fat");
            return (Criteria) this;
        }

        public Criteria andFatLessThanOrEqualTo(Integer value) {
            addCriterion("fat <=", value, "fat");
            return (Criteria) this;
        }

        public Criteria andFatIn(List<Integer> values) {
            addCriterion("fat in", values, "fat");
            return (Criteria) this;
        }

        public Criteria andFatNotIn(List<Integer> values) {
            addCriterion("fat not in", values, "fat");
            return (Criteria) this;
        }

        public Criteria andFatBetween(Integer value1, Integer value2) {
            addCriterion("fat between", value1, value2, "fat");
            return (Criteria) this;
        }

        public Criteria andFatNotBetween(Integer value1, Integer value2) {
            addCriterion("fat not between", value1, value2, "fat");
            return (Criteria) this;
        }

        public Criteria andFatreasonIsNull() {
            addCriterion("fatreason is null");
            return (Criteria) this;
        }

        public Criteria andFatreasonIsNotNull() {
            addCriterion("fatreason is not null");
            return (Criteria) this;
        }

        public Criteria andFatreasonEqualTo(String value) {
            addCriterion("fatreason =", value, "fatreason");
            return (Criteria) this;
        }

        public Criteria andFatreasonNotEqualTo(String value) {
            addCriterion("fatreason <>", value, "fatreason");
            return (Criteria) this;
        }

        public Criteria andFatreasonGreaterThan(String value) {
            addCriterion("fatreason >", value, "fatreason");
            return (Criteria) this;
        }

        public Criteria andFatreasonGreaterThanOrEqualTo(String value) {
            addCriterion("fatreason >=", value, "fatreason");
            return (Criteria) this;
        }

        public Criteria andFatreasonLessThan(String value) {
            addCriterion("fatreason <", value, "fatreason");
            return (Criteria) this;
        }

        public Criteria andFatreasonLessThanOrEqualTo(String value) {
            addCriterion("fatreason <=", value, "fatreason");
            return (Criteria) this;
        }

        public Criteria andFatreasonLike(String value) {
            addCriterion("fatreason like", value, "fatreason");
            return (Criteria) this;
        }

        public Criteria andFatreasonNotLike(String value) {
            addCriterion("fatreason not like", value, "fatreason");
            return (Criteria) this;
        }

        public Criteria andFatreasonIn(List<String> values) {
            addCriterion("fatreason in", values, "fatreason");
            return (Criteria) this;
        }

        public Criteria andFatreasonNotIn(List<String> values) {
            addCriterion("fatreason not in", values, "fatreason");
            return (Criteria) this;
        }

        public Criteria andFatreasonBetween(String value1, String value2) {
            addCriterion("fatreason between", value1, value2, "fatreason");
            return (Criteria) this;
        }

        public Criteria andFatreasonNotBetween(String value1, String value2) {
            addCriterion("fatreason not between", value1, value2, "fatreason");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("active is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Integer value) {
            addCriterion("active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Integer value) {
            addCriterion("active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Integer value) {
            addCriterion("active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Integer value) {
            addCriterion("active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Integer value) {
            addCriterion("active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Integer> values) {
            addCriterion("active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Integer> values) {
            addCriterion("active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Integer value1, Integer value2) {
            addCriterion("active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Integer value1, Integer value2) {
            addCriterion("active not between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActivereasonIsNull() {
            addCriterion("activereason is null");
            return (Criteria) this;
        }

        public Criteria andActivereasonIsNotNull() {
            addCriterion("activereason is not null");
            return (Criteria) this;
        }

        public Criteria andActivereasonEqualTo(String value) {
            addCriterion("activereason =", value, "activereason");
            return (Criteria) this;
        }

        public Criteria andActivereasonNotEqualTo(String value) {
            addCriterion("activereason <>", value, "activereason");
            return (Criteria) this;
        }

        public Criteria andActivereasonGreaterThan(String value) {
            addCriterion("activereason >", value, "activereason");
            return (Criteria) this;
        }

        public Criteria andActivereasonGreaterThanOrEqualTo(String value) {
            addCriterion("activereason >=", value, "activereason");
            return (Criteria) this;
        }

        public Criteria andActivereasonLessThan(String value) {
            addCriterion("activereason <", value, "activereason");
            return (Criteria) this;
        }

        public Criteria andActivereasonLessThanOrEqualTo(String value) {
            addCriterion("activereason <=", value, "activereason");
            return (Criteria) this;
        }

        public Criteria andActivereasonLike(String value) {
            addCriterion("activereason like", value, "activereason");
            return (Criteria) this;
        }

        public Criteria andActivereasonNotLike(String value) {
            addCriterion("activereason not like", value, "activereason");
            return (Criteria) this;
        }

        public Criteria andActivereasonIn(List<String> values) {
            addCriterion("activereason in", values, "activereason");
            return (Criteria) this;
        }

        public Criteria andActivereasonNotIn(List<String> values) {
            addCriterion("activereason not in", values, "activereason");
            return (Criteria) this;
        }

        public Criteria andActivereasonBetween(String value1, String value2) {
            addCriterion("activereason between", value1, value2, "activereason");
            return (Criteria) this;
        }

        public Criteria andActivereasonNotBetween(String value1, String value2) {
            addCriterion("activereason not between", value1, value2, "activereason");
            return (Criteria) this;
        }

        public Criteria andThinIsNull() {
            addCriterion("thin is null");
            return (Criteria) this;
        }

        public Criteria andThinIsNotNull() {
            addCriterion("thin is not null");
            return (Criteria) this;
        }

        public Criteria andThinEqualTo(Integer value) {
            addCriterion("thin =", value, "thin");
            return (Criteria) this;
        }

        public Criteria andThinNotEqualTo(Integer value) {
            addCriterion("thin <>", value, "thin");
            return (Criteria) this;
        }

        public Criteria andThinGreaterThan(Integer value) {
            addCriterion("thin >", value, "thin");
            return (Criteria) this;
        }

        public Criteria andThinGreaterThanOrEqualTo(Integer value) {
            addCriterion("thin >=", value, "thin");
            return (Criteria) this;
        }

        public Criteria andThinLessThan(Integer value) {
            addCriterion("thin <", value, "thin");
            return (Criteria) this;
        }

        public Criteria andThinLessThanOrEqualTo(Integer value) {
            addCriterion("thin <=", value, "thin");
            return (Criteria) this;
        }

        public Criteria andThinIn(List<Integer> values) {
            addCriterion("thin in", values, "thin");
            return (Criteria) this;
        }

        public Criteria andThinNotIn(List<Integer> values) {
            addCriterion("thin not in", values, "thin");
            return (Criteria) this;
        }

        public Criteria andThinBetween(Integer value1, Integer value2) {
            addCriterion("thin between", value1, value2, "thin");
            return (Criteria) this;
        }

        public Criteria andThinNotBetween(Integer value1, Integer value2) {
            addCriterion("thin not between", value1, value2, "thin");
            return (Criteria) this;
        }

        public Criteria andThinreasonIsNull() {
            addCriterion("thinreason is null");
            return (Criteria) this;
        }

        public Criteria andThinreasonIsNotNull() {
            addCriterion("thinreason is not null");
            return (Criteria) this;
        }

        public Criteria andThinreasonEqualTo(String value) {
            addCriterion("thinreason =", value, "thinreason");
            return (Criteria) this;
        }

        public Criteria andThinreasonNotEqualTo(String value) {
            addCriterion("thinreason <>", value, "thinreason");
            return (Criteria) this;
        }

        public Criteria andThinreasonGreaterThan(String value) {
            addCriterion("thinreason >", value, "thinreason");
            return (Criteria) this;
        }

        public Criteria andThinreasonGreaterThanOrEqualTo(String value) {
            addCriterion("thinreason >=", value, "thinreason");
            return (Criteria) this;
        }

        public Criteria andThinreasonLessThan(String value) {
            addCriterion("thinreason <", value, "thinreason");
            return (Criteria) this;
        }

        public Criteria andThinreasonLessThanOrEqualTo(String value) {
            addCriterion("thinreason <=", value, "thinreason");
            return (Criteria) this;
        }

        public Criteria andThinreasonLike(String value) {
            addCriterion("thinreason like", value, "thinreason");
            return (Criteria) this;
        }

        public Criteria andThinreasonNotLike(String value) {
            addCriterion("thinreason not like", value, "thinreason");
            return (Criteria) this;
        }

        public Criteria andThinreasonIn(List<String> values) {
            addCriterion("thinreason in", values, "thinreason");
            return (Criteria) this;
        }

        public Criteria andThinreasonNotIn(List<String> values) {
            addCriterion("thinreason not in", values, "thinreason");
            return (Criteria) this;
        }

        public Criteria andThinreasonBetween(String value1, String value2) {
            addCriterion("thinreason between", value1, value2, "thinreason");
            return (Criteria) this;
        }

        public Criteria andThinreasonNotBetween(String value1, String value2) {
            addCriterion("thinreason not between", value1, value2, "thinreason");
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