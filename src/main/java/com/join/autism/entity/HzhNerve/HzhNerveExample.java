package com.join.autism.entity.HzhNerve;

import java.util.ArrayList;
import java.util.List;

public class HzhNerveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HzhNerveExample() {
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

        public Criteria andYesNoIsNull() {
            addCriterion("yes_no is null");
            return (Criteria) this;
        }

        public Criteria andYesNoIsNotNull() {
            addCriterion("yes_no is not null");
            return (Criteria) this;
        }

        public Criteria andYesNoEqualTo(Integer value) {
            addCriterion("yes_no =", value, "yesNo");
            return (Criteria) this;
        }

        public Criteria andYesNoNotEqualTo(Integer value) {
            addCriterion("yes_no <>", value, "yesNo");
            return (Criteria) this;
        }

        public Criteria andYesNoGreaterThan(Integer value) {
            addCriterion("yes_no >", value, "yesNo");
            return (Criteria) this;
        }

        public Criteria andYesNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("yes_no >=", value, "yesNo");
            return (Criteria) this;
        }

        public Criteria andYesNoLessThan(Integer value) {
            addCriterion("yes_no <", value, "yesNo");
            return (Criteria) this;
        }

        public Criteria andYesNoLessThanOrEqualTo(Integer value) {
            addCriterion("yes_no <=", value, "yesNo");
            return (Criteria) this;
        }

        public Criteria andYesNoIn(List<Integer> values) {
            addCriterion("yes_no in", values, "yesNo");
            return (Criteria) this;
        }

        public Criteria andYesNoNotIn(List<Integer> values) {
            addCriterion("yes_no not in", values, "yesNo");
            return (Criteria) this;
        }

        public Criteria andYesNoBetween(Integer value1, Integer value2) {
            addCriterion("yes_no between", value1, value2, "yesNo");
            return (Criteria) this;
        }

        public Criteria andYesNoNotBetween(Integer value1, Integer value2) {
            addCriterion("yes_no not between", value1, value2, "yesNo");
            return (Criteria) this;
        }

        public Criteria andEpilepsyIsNull() {
            addCriterion("epilepsy is null");
            return (Criteria) this;
        }

        public Criteria andEpilepsyIsNotNull() {
            addCriterion("epilepsy is not null");
            return (Criteria) this;
        }

        public Criteria andEpilepsyEqualTo(Integer value) {
            addCriterion("epilepsy =", value, "epilepsy");
            return (Criteria) this;
        }

        public Criteria andEpilepsyNotEqualTo(Integer value) {
            addCriterion("epilepsy <>", value, "epilepsy");
            return (Criteria) this;
        }

        public Criteria andEpilepsyGreaterThan(Integer value) {
            addCriterion("epilepsy >", value, "epilepsy");
            return (Criteria) this;
        }

        public Criteria andEpilepsyGreaterThanOrEqualTo(Integer value) {
            addCriterion("epilepsy >=", value, "epilepsy");
            return (Criteria) this;
        }

        public Criteria andEpilepsyLessThan(Integer value) {
            addCriterion("epilepsy <", value, "epilepsy");
            return (Criteria) this;
        }

        public Criteria andEpilepsyLessThanOrEqualTo(Integer value) {
            addCriterion("epilepsy <=", value, "epilepsy");
            return (Criteria) this;
        }

        public Criteria andEpilepsyIn(List<Integer> values) {
            addCriterion("epilepsy in", values, "epilepsy");
            return (Criteria) this;
        }

        public Criteria andEpilepsyNotIn(List<Integer> values) {
            addCriterion("epilepsy not in", values, "epilepsy");
            return (Criteria) this;
        }

        public Criteria andEpilepsyBetween(Integer value1, Integer value2) {
            addCriterion("epilepsy between", value1, value2, "epilepsy");
            return (Criteria) this;
        }

        public Criteria andEpilepsyNotBetween(Integer value1, Integer value2) {
            addCriterion("epilepsy not between", value1, value2, "epilepsy");
            return (Criteria) this;
        }

        public Criteria andEpilepsyreasonIsNull() {
            addCriterion("epilepsyreason is null");
            return (Criteria) this;
        }

        public Criteria andEpilepsyreasonIsNotNull() {
            addCriterion("epilepsyreason is not null");
            return (Criteria) this;
        }

        public Criteria andEpilepsyreasonEqualTo(String value) {
            addCriterion("epilepsyreason =", value, "epilepsyreason");
            return (Criteria) this;
        }

        public Criteria andEpilepsyreasonNotEqualTo(String value) {
            addCriterion("epilepsyreason <>", value, "epilepsyreason");
            return (Criteria) this;
        }

        public Criteria andEpilepsyreasonGreaterThan(String value) {
            addCriterion("epilepsyreason >", value, "epilepsyreason");
            return (Criteria) this;
        }

        public Criteria andEpilepsyreasonGreaterThanOrEqualTo(String value) {
            addCriterion("epilepsyreason >=", value, "epilepsyreason");
            return (Criteria) this;
        }

        public Criteria andEpilepsyreasonLessThan(String value) {
            addCriterion("epilepsyreason <", value, "epilepsyreason");
            return (Criteria) this;
        }

        public Criteria andEpilepsyreasonLessThanOrEqualTo(String value) {
            addCriterion("epilepsyreason <=", value, "epilepsyreason");
            return (Criteria) this;
        }

        public Criteria andEpilepsyreasonLike(String value) {
            addCriterion("epilepsyreason like", value, "epilepsyreason");
            return (Criteria) this;
        }

        public Criteria andEpilepsyreasonNotLike(String value) {
            addCriterion("epilepsyreason not like", value, "epilepsyreason");
            return (Criteria) this;
        }

        public Criteria andEpilepsyreasonIn(List<String> values) {
            addCriterion("epilepsyreason in", values, "epilepsyreason");
            return (Criteria) this;
        }

        public Criteria andEpilepsyreasonNotIn(List<String> values) {
            addCriterion("epilepsyreason not in", values, "epilepsyreason");
            return (Criteria) this;
        }

        public Criteria andEpilepsyreasonBetween(String value1, String value2) {
            addCriterion("epilepsyreason between", value1, value2, "epilepsyreason");
            return (Criteria) this;
        }

        public Criteria andEpilepsyreasonNotBetween(String value1, String value2) {
            addCriterion("epilepsyreason not between", value1, value2, "epilepsyreason");
            return (Criteria) this;
        }

        public Criteria andTensionIsNull() {
            addCriterion("tension is null");
            return (Criteria) this;
        }

        public Criteria andTensionIsNotNull() {
            addCriterion("tension is not null");
            return (Criteria) this;
        }

        public Criteria andTensionEqualTo(Integer value) {
            addCriterion("tension =", value, "tension");
            return (Criteria) this;
        }

        public Criteria andTensionNotEqualTo(Integer value) {
            addCriterion("tension <>", value, "tension");
            return (Criteria) this;
        }

        public Criteria andTensionGreaterThan(Integer value) {
            addCriterion("tension >", value, "tension");
            return (Criteria) this;
        }

        public Criteria andTensionGreaterThanOrEqualTo(Integer value) {
            addCriterion("tension >=", value, "tension");
            return (Criteria) this;
        }

        public Criteria andTensionLessThan(Integer value) {
            addCriterion("tension <", value, "tension");
            return (Criteria) this;
        }

        public Criteria andTensionLessThanOrEqualTo(Integer value) {
            addCriterion("tension <=", value, "tension");
            return (Criteria) this;
        }

        public Criteria andTensionIn(List<Integer> values) {
            addCriterion("tension in", values, "tension");
            return (Criteria) this;
        }

        public Criteria andTensionNotIn(List<Integer> values) {
            addCriterion("tension not in", values, "tension");
            return (Criteria) this;
        }

        public Criteria andTensionBetween(Integer value1, Integer value2) {
            addCriterion("tension between", value1, value2, "tension");
            return (Criteria) this;
        }

        public Criteria andTensionNotBetween(Integer value1, Integer value2) {
            addCriterion("tension not between", value1, value2, "tension");
            return (Criteria) this;
        }

        public Criteria andTensionreasonIsNull() {
            addCriterion("tensionreason is null");
            return (Criteria) this;
        }

        public Criteria andTensionreasonIsNotNull() {
            addCriterion("tensionreason is not null");
            return (Criteria) this;
        }

        public Criteria andTensionreasonEqualTo(String value) {
            addCriterion("tensionreason =", value, "tensionreason");
            return (Criteria) this;
        }

        public Criteria andTensionreasonNotEqualTo(String value) {
            addCriterion("tensionreason <>", value, "tensionreason");
            return (Criteria) this;
        }

        public Criteria andTensionreasonGreaterThan(String value) {
            addCriterion("tensionreason >", value, "tensionreason");
            return (Criteria) this;
        }

        public Criteria andTensionreasonGreaterThanOrEqualTo(String value) {
            addCriterion("tensionreason >=", value, "tensionreason");
            return (Criteria) this;
        }

        public Criteria andTensionreasonLessThan(String value) {
            addCriterion("tensionreason <", value, "tensionreason");
            return (Criteria) this;
        }

        public Criteria andTensionreasonLessThanOrEqualTo(String value) {
            addCriterion("tensionreason <=", value, "tensionreason");
            return (Criteria) this;
        }

        public Criteria andTensionreasonLike(String value) {
            addCriterion("tensionreason like", value, "tensionreason");
            return (Criteria) this;
        }

        public Criteria andTensionreasonNotLike(String value) {
            addCriterion("tensionreason not like", value, "tensionreason");
            return (Criteria) this;
        }

        public Criteria andTensionreasonIn(List<String> values) {
            addCriterion("tensionreason in", values, "tensionreason");
            return (Criteria) this;
        }

        public Criteria andTensionreasonNotIn(List<String> values) {
            addCriterion("tensionreason not in", values, "tensionreason");
            return (Criteria) this;
        }

        public Criteria andTensionreasonBetween(String value1, String value2) {
            addCriterion("tensionreason between", value1, value2, "tensionreason");
            return (Criteria) this;
        }

        public Criteria andTensionreasonNotBetween(String value1, String value2) {
            addCriterion("tensionreason not between", value1, value2, "tensionreason");
            return (Criteria) this;
        }

        public Criteria andImbalanceIsNull() {
            addCriterion("imbalance is null");
            return (Criteria) this;
        }

        public Criteria andImbalanceIsNotNull() {
            addCriterion("imbalance is not null");
            return (Criteria) this;
        }

        public Criteria andImbalanceEqualTo(Integer value) {
            addCriterion("imbalance =", value, "imbalance");
            return (Criteria) this;
        }

        public Criteria andImbalanceNotEqualTo(Integer value) {
            addCriterion("imbalance <>", value, "imbalance");
            return (Criteria) this;
        }

        public Criteria andImbalanceGreaterThan(Integer value) {
            addCriterion("imbalance >", value, "imbalance");
            return (Criteria) this;
        }

        public Criteria andImbalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("imbalance >=", value, "imbalance");
            return (Criteria) this;
        }

        public Criteria andImbalanceLessThan(Integer value) {
            addCriterion("imbalance <", value, "imbalance");
            return (Criteria) this;
        }

        public Criteria andImbalanceLessThanOrEqualTo(Integer value) {
            addCriterion("imbalance <=", value, "imbalance");
            return (Criteria) this;
        }

        public Criteria andImbalanceIn(List<Integer> values) {
            addCriterion("imbalance in", values, "imbalance");
            return (Criteria) this;
        }

        public Criteria andImbalanceNotIn(List<Integer> values) {
            addCriterion("imbalance not in", values, "imbalance");
            return (Criteria) this;
        }

        public Criteria andImbalanceBetween(Integer value1, Integer value2) {
            addCriterion("imbalance between", value1, value2, "imbalance");
            return (Criteria) this;
        }

        public Criteria andImbalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("imbalance not between", value1, value2, "imbalance");
            return (Criteria) this;
        }

        public Criteria andImbalancereasonIsNull() {
            addCriterion("imbalancereason is null");
            return (Criteria) this;
        }

        public Criteria andImbalancereasonIsNotNull() {
            addCriterion("imbalancereason is not null");
            return (Criteria) this;
        }

        public Criteria andImbalancereasonEqualTo(String value) {
            addCriterion("imbalancereason =", value, "imbalancereason");
            return (Criteria) this;
        }

        public Criteria andImbalancereasonNotEqualTo(String value) {
            addCriterion("imbalancereason <>", value, "imbalancereason");
            return (Criteria) this;
        }

        public Criteria andImbalancereasonGreaterThan(String value) {
            addCriterion("imbalancereason >", value, "imbalancereason");
            return (Criteria) this;
        }

        public Criteria andImbalancereasonGreaterThanOrEqualTo(String value) {
            addCriterion("imbalancereason >=", value, "imbalancereason");
            return (Criteria) this;
        }

        public Criteria andImbalancereasonLessThan(String value) {
            addCriterion("imbalancereason <", value, "imbalancereason");
            return (Criteria) this;
        }

        public Criteria andImbalancereasonLessThanOrEqualTo(String value) {
            addCriterion("imbalancereason <=", value, "imbalancereason");
            return (Criteria) this;
        }

        public Criteria andImbalancereasonLike(String value) {
            addCriterion("imbalancereason like", value, "imbalancereason");
            return (Criteria) this;
        }

        public Criteria andImbalancereasonNotLike(String value) {
            addCriterion("imbalancereason not like", value, "imbalancereason");
            return (Criteria) this;
        }

        public Criteria andImbalancereasonIn(List<String> values) {
            addCriterion("imbalancereason in", values, "imbalancereason");
            return (Criteria) this;
        }

        public Criteria andImbalancereasonNotIn(List<String> values) {
            addCriterion("imbalancereason not in", values, "imbalancereason");
            return (Criteria) this;
        }

        public Criteria andImbalancereasonBetween(String value1, String value2) {
            addCriterion("imbalancereason between", value1, value2, "imbalancereason");
            return (Criteria) this;
        }

        public Criteria andImbalancereasonNotBetween(String value1, String value2) {
            addCriterion("imbalancereason not between", value1, value2, "imbalancereason");
            return (Criteria) this;
        }

        public Criteria andGaitIsNull() {
            addCriterion("gait is null");
            return (Criteria) this;
        }

        public Criteria andGaitIsNotNull() {
            addCriterion("gait is not null");
            return (Criteria) this;
        }

        public Criteria andGaitEqualTo(Integer value) {
            addCriterion("gait =", value, "gait");
            return (Criteria) this;
        }

        public Criteria andGaitNotEqualTo(Integer value) {
            addCriterion("gait <>", value, "gait");
            return (Criteria) this;
        }

        public Criteria andGaitGreaterThan(Integer value) {
            addCriterion("gait >", value, "gait");
            return (Criteria) this;
        }

        public Criteria andGaitGreaterThanOrEqualTo(Integer value) {
            addCriterion("gait >=", value, "gait");
            return (Criteria) this;
        }

        public Criteria andGaitLessThan(Integer value) {
            addCriterion("gait <", value, "gait");
            return (Criteria) this;
        }

        public Criteria andGaitLessThanOrEqualTo(Integer value) {
            addCriterion("gait <=", value, "gait");
            return (Criteria) this;
        }

        public Criteria andGaitIn(List<Integer> values) {
            addCriterion("gait in", values, "gait");
            return (Criteria) this;
        }

        public Criteria andGaitNotIn(List<Integer> values) {
            addCriterion("gait not in", values, "gait");
            return (Criteria) this;
        }

        public Criteria andGaitBetween(Integer value1, Integer value2) {
            addCriterion("gait between", value1, value2, "gait");
            return (Criteria) this;
        }

        public Criteria andGaitNotBetween(Integer value1, Integer value2) {
            addCriterion("gait not between", value1, value2, "gait");
            return (Criteria) this;
        }

        public Criteria andGaitreasonIsNull() {
            addCriterion("gaitreason is null");
            return (Criteria) this;
        }

        public Criteria andGaitreasonIsNotNull() {
            addCriterion("gaitreason is not null");
            return (Criteria) this;
        }

        public Criteria andGaitreasonEqualTo(String value) {
            addCriterion("gaitreason =", value, "gaitreason");
            return (Criteria) this;
        }

        public Criteria andGaitreasonNotEqualTo(String value) {
            addCriterion("gaitreason <>", value, "gaitreason");
            return (Criteria) this;
        }

        public Criteria andGaitreasonGreaterThan(String value) {
            addCriterion("gaitreason >", value, "gaitreason");
            return (Criteria) this;
        }

        public Criteria andGaitreasonGreaterThanOrEqualTo(String value) {
            addCriterion("gaitreason >=", value, "gaitreason");
            return (Criteria) this;
        }

        public Criteria andGaitreasonLessThan(String value) {
            addCriterion("gaitreason <", value, "gaitreason");
            return (Criteria) this;
        }

        public Criteria andGaitreasonLessThanOrEqualTo(String value) {
            addCriterion("gaitreason <=", value, "gaitreason");
            return (Criteria) this;
        }

        public Criteria andGaitreasonLike(String value) {
            addCriterion("gaitreason like", value, "gaitreason");
            return (Criteria) this;
        }

        public Criteria andGaitreasonNotLike(String value) {
            addCriterion("gaitreason not like", value, "gaitreason");
            return (Criteria) this;
        }

        public Criteria andGaitreasonIn(List<String> values) {
            addCriterion("gaitreason in", values, "gaitreason");
            return (Criteria) this;
        }

        public Criteria andGaitreasonNotIn(List<String> values) {
            addCriterion("gaitreason not in", values, "gaitreason");
            return (Criteria) this;
        }

        public Criteria andGaitreasonBetween(String value1, String value2) {
            addCriterion("gaitreason between", value1, value2, "gaitreason");
            return (Criteria) this;
        }

        public Criteria andGaitreasonNotBetween(String value1, String value2) {
            addCriterion("gaitreason not between", value1, value2, "gaitreason");
            return (Criteria) this;
        }

        public Criteria andLncreaseIsNull() {
            addCriterion("lncrease is null");
            return (Criteria) this;
        }

        public Criteria andLncreaseIsNotNull() {
            addCriterion("lncrease is not null");
            return (Criteria) this;
        }

        public Criteria andLncreaseEqualTo(Integer value) {
            addCriterion("lncrease =", value, "lncrease");
            return (Criteria) this;
        }

        public Criteria andLncreaseNotEqualTo(Integer value) {
            addCriterion("lncrease <>", value, "lncrease");
            return (Criteria) this;
        }

        public Criteria andLncreaseGreaterThan(Integer value) {
            addCriterion("lncrease >", value, "lncrease");
            return (Criteria) this;
        }

        public Criteria andLncreaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("lncrease >=", value, "lncrease");
            return (Criteria) this;
        }

        public Criteria andLncreaseLessThan(Integer value) {
            addCriterion("lncrease <", value, "lncrease");
            return (Criteria) this;
        }

        public Criteria andLncreaseLessThanOrEqualTo(Integer value) {
            addCriterion("lncrease <=", value, "lncrease");
            return (Criteria) this;
        }

        public Criteria andLncreaseIn(List<Integer> values) {
            addCriterion("lncrease in", values, "lncrease");
            return (Criteria) this;
        }

        public Criteria andLncreaseNotIn(List<Integer> values) {
            addCriterion("lncrease not in", values, "lncrease");
            return (Criteria) this;
        }

        public Criteria andLncreaseBetween(Integer value1, Integer value2) {
            addCriterion("lncrease between", value1, value2, "lncrease");
            return (Criteria) this;
        }

        public Criteria andLncreaseNotBetween(Integer value1, Integer value2) {
            addCriterion("lncrease not between", value1, value2, "lncrease");
            return (Criteria) this;
        }

        public Criteria andLncreasereasonIsNull() {
            addCriterion("lncreasereason is null");
            return (Criteria) this;
        }

        public Criteria andLncreasereasonIsNotNull() {
            addCriterion("lncreasereason is not null");
            return (Criteria) this;
        }

        public Criteria andLncreasereasonEqualTo(String value) {
            addCriterion("lncreasereason =", value, "lncreasereason");
            return (Criteria) this;
        }

        public Criteria andLncreasereasonNotEqualTo(String value) {
            addCriterion("lncreasereason <>", value, "lncreasereason");
            return (Criteria) this;
        }

        public Criteria andLncreasereasonGreaterThan(String value) {
            addCriterion("lncreasereason >", value, "lncreasereason");
            return (Criteria) this;
        }

        public Criteria andLncreasereasonGreaterThanOrEqualTo(String value) {
            addCriterion("lncreasereason >=", value, "lncreasereason");
            return (Criteria) this;
        }

        public Criteria andLncreasereasonLessThan(String value) {
            addCriterion("lncreasereason <", value, "lncreasereason");
            return (Criteria) this;
        }

        public Criteria andLncreasereasonLessThanOrEqualTo(String value) {
            addCriterion("lncreasereason <=", value, "lncreasereason");
            return (Criteria) this;
        }

        public Criteria andLncreasereasonLike(String value) {
            addCriterion("lncreasereason like", value, "lncreasereason");
            return (Criteria) this;
        }

        public Criteria andLncreasereasonNotLike(String value) {
            addCriterion("lncreasereason not like", value, "lncreasereason");
            return (Criteria) this;
        }

        public Criteria andLncreasereasonIn(List<String> values) {
            addCriterion("lncreasereason in", values, "lncreasereason");
            return (Criteria) this;
        }

        public Criteria andLncreasereasonNotIn(List<String> values) {
            addCriterion("lncreasereason not in", values, "lncreasereason");
            return (Criteria) this;
        }

        public Criteria andLncreasereasonBetween(String value1, String value2) {
            addCriterion("lncreasereason between", value1, value2, "lncreasereason");
            return (Criteria) this;
        }

        public Criteria andLncreasereasonNotBetween(String value1, String value2) {
            addCriterion("lncreasereason not between", value1, value2, "lncreasereason");
            return (Criteria) this;
        }

        public Criteria andWeakenIsNull() {
            addCriterion("weaken is null");
            return (Criteria) this;
        }

        public Criteria andWeakenIsNotNull() {
            addCriterion("weaken is not null");
            return (Criteria) this;
        }

        public Criteria andWeakenEqualTo(Integer value) {
            addCriterion("weaken =", value, "weaken");
            return (Criteria) this;
        }

        public Criteria andWeakenNotEqualTo(Integer value) {
            addCriterion("weaken <>", value, "weaken");
            return (Criteria) this;
        }

        public Criteria andWeakenGreaterThan(Integer value) {
            addCriterion("weaken >", value, "weaken");
            return (Criteria) this;
        }

        public Criteria andWeakenGreaterThanOrEqualTo(Integer value) {
            addCriterion("weaken >=", value, "weaken");
            return (Criteria) this;
        }

        public Criteria andWeakenLessThan(Integer value) {
            addCriterion("weaken <", value, "weaken");
            return (Criteria) this;
        }

        public Criteria andWeakenLessThanOrEqualTo(Integer value) {
            addCriterion("weaken <=", value, "weaken");
            return (Criteria) this;
        }

        public Criteria andWeakenIn(List<Integer> values) {
            addCriterion("weaken in", values, "weaken");
            return (Criteria) this;
        }

        public Criteria andWeakenNotIn(List<Integer> values) {
            addCriterion("weaken not in", values, "weaken");
            return (Criteria) this;
        }

        public Criteria andWeakenBetween(Integer value1, Integer value2) {
            addCriterion("weaken between", value1, value2, "weaken");
            return (Criteria) this;
        }

        public Criteria andWeakenNotBetween(Integer value1, Integer value2) {
            addCriterion("weaken not between", value1, value2, "weaken");
            return (Criteria) this;
        }

        public Criteria andWeakenreasonIsNull() {
            addCriterion("weakenreason is null");
            return (Criteria) this;
        }

        public Criteria andWeakenreasonIsNotNull() {
            addCriterion("weakenreason is not null");
            return (Criteria) this;
        }

        public Criteria andWeakenreasonEqualTo(String value) {
            addCriterion("weakenreason =", value, "weakenreason");
            return (Criteria) this;
        }

        public Criteria andWeakenreasonNotEqualTo(String value) {
            addCriterion("weakenreason <>", value, "weakenreason");
            return (Criteria) this;
        }

        public Criteria andWeakenreasonGreaterThan(String value) {
            addCriterion("weakenreason >", value, "weakenreason");
            return (Criteria) this;
        }

        public Criteria andWeakenreasonGreaterThanOrEqualTo(String value) {
            addCriterion("weakenreason >=", value, "weakenreason");
            return (Criteria) this;
        }

        public Criteria andWeakenreasonLessThan(String value) {
            addCriterion("weakenreason <", value, "weakenreason");
            return (Criteria) this;
        }

        public Criteria andWeakenreasonLessThanOrEqualTo(String value) {
            addCriterion("weakenreason <=", value, "weakenreason");
            return (Criteria) this;
        }

        public Criteria andWeakenreasonLike(String value) {
            addCriterion("weakenreason like", value, "weakenreason");
            return (Criteria) this;
        }

        public Criteria andWeakenreasonNotLike(String value) {
            addCriterion("weakenreason not like", value, "weakenreason");
            return (Criteria) this;
        }

        public Criteria andWeakenreasonIn(List<String> values) {
            addCriterion("weakenreason in", values, "weakenreason");
            return (Criteria) this;
        }

        public Criteria andWeakenreasonNotIn(List<String> values) {
            addCriterion("weakenreason not in", values, "weakenreason");
            return (Criteria) this;
        }

        public Criteria andWeakenreasonBetween(String value1, String value2) {
            addCriterion("weakenreason between", value1, value2, "weakenreason");
            return (Criteria) this;
        }

        public Criteria andWeakenreasonNotBetween(String value1, String value2) {
            addCriterion("weakenreason not between", value1, value2, "weakenreason");
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