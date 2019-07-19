package com.join.autism.entity.HzhAssist;

import java.util.ArrayList;
import java.util.List;

public class HzhAssistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HzhAssistExample() {
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

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andHeadpicIsNull() {
            addCriterion("headpic is null");
            return (Criteria) this;
        }

        public Criteria andHeadpicIsNotNull() {
            addCriterion("headpic is not null");
            return (Criteria) this;
        }

        public Criteria andHeadpicEqualTo(String value) {
            addCriterion("headpic =", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicNotEqualTo(String value) {
            addCriterion("headpic <>", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicGreaterThan(String value) {
            addCriterion("headpic >", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicGreaterThanOrEqualTo(String value) {
            addCriterion("headpic >=", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicLessThan(String value) {
            addCriterion("headpic <", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicLessThanOrEqualTo(String value) {
            addCriterion("headpic <=", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicLike(String value) {
            addCriterion("headpic like", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicNotLike(String value) {
            addCriterion("headpic not like", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicIn(List<String> values) {
            addCriterion("headpic in", values, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicNotIn(List<String> values) {
            addCriterion("headpic not in", values, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicBetween(String value1, String value2) {
            addCriterion("headpic between", value1, value2, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicNotBetween(String value1, String value2) {
            addCriterion("headpic not between", value1, value2, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadmriIsNull() {
            addCriterion("headmri is null");
            return (Criteria) this;
        }

        public Criteria andHeadmriIsNotNull() {
            addCriterion("headmri is not null");
            return (Criteria) this;
        }

        public Criteria andHeadmriEqualTo(String value) {
            addCriterion("headmri =", value, "headmri");
            return (Criteria) this;
        }

        public Criteria andHeadmriNotEqualTo(String value) {
            addCriterion("headmri <>", value, "headmri");
            return (Criteria) this;
        }

        public Criteria andHeadmriGreaterThan(String value) {
            addCriterion("headmri >", value, "headmri");
            return (Criteria) this;
        }

        public Criteria andHeadmriGreaterThanOrEqualTo(String value) {
            addCriterion("headmri >=", value, "headmri");
            return (Criteria) this;
        }

        public Criteria andHeadmriLessThan(String value) {
            addCriterion("headmri <", value, "headmri");
            return (Criteria) this;
        }

        public Criteria andHeadmriLessThanOrEqualTo(String value) {
            addCriterion("headmri <=", value, "headmri");
            return (Criteria) this;
        }

        public Criteria andHeadmriLike(String value) {
            addCriterion("headmri like", value, "headmri");
            return (Criteria) this;
        }

        public Criteria andHeadmriNotLike(String value) {
            addCriterion("headmri not like", value, "headmri");
            return (Criteria) this;
        }

        public Criteria andHeadmriIn(List<String> values) {
            addCriterion("headmri in", values, "headmri");
            return (Criteria) this;
        }

        public Criteria andHeadmriNotIn(List<String> values) {
            addCriterion("headmri not in", values, "headmri");
            return (Criteria) this;
        }

        public Criteria andHeadmriBetween(String value1, String value2) {
            addCriterion("headmri between", value1, value2, "headmri");
            return (Criteria) this;
        }

        public Criteria andHeadmriNotBetween(String value1, String value2) {
            addCriterion("headmri not between", value1, value2, "headmri");
            return (Criteria) this;
        }

        public Criteria andHeadmrireasonIsNull() {
            addCriterion("headmrireason is null");
            return (Criteria) this;
        }

        public Criteria andHeadmrireasonIsNotNull() {
            addCriterion("headmrireason is not null");
            return (Criteria) this;
        }

        public Criteria andHeadmrireasonEqualTo(String value) {
            addCriterion("headmrireason =", value, "headmrireason");
            return (Criteria) this;
        }

        public Criteria andHeadmrireasonNotEqualTo(String value) {
            addCriterion("headmrireason <>", value, "headmrireason");
            return (Criteria) this;
        }

        public Criteria andHeadmrireasonGreaterThan(String value) {
            addCriterion("headmrireason >", value, "headmrireason");
            return (Criteria) this;
        }

        public Criteria andHeadmrireasonGreaterThanOrEqualTo(String value) {
            addCriterion("headmrireason >=", value, "headmrireason");
            return (Criteria) this;
        }

        public Criteria andHeadmrireasonLessThan(String value) {
            addCriterion("headmrireason <", value, "headmrireason");
            return (Criteria) this;
        }

        public Criteria andHeadmrireasonLessThanOrEqualTo(String value) {
            addCriterion("headmrireason <=", value, "headmrireason");
            return (Criteria) this;
        }

        public Criteria andHeadmrireasonLike(String value) {
            addCriterion("headmrireason like", value, "headmrireason");
            return (Criteria) this;
        }

        public Criteria andHeadmrireasonNotLike(String value) {
            addCriterion("headmrireason not like", value, "headmrireason");
            return (Criteria) this;
        }

        public Criteria andHeadmrireasonIn(List<String> values) {
            addCriterion("headmrireason in", values, "headmrireason");
            return (Criteria) this;
        }

        public Criteria andHeadmrireasonNotIn(List<String> values) {
            addCriterion("headmrireason not in", values, "headmrireason");
            return (Criteria) this;
        }

        public Criteria andHeadmrireasonBetween(String value1, String value2) {
            addCriterion("headmrireason between", value1, value2, "headmrireason");
            return (Criteria) this;
        }

        public Criteria andHeadmrireasonNotBetween(String value1, String value2) {
            addCriterion("headmrireason not between", value1, value2, "headmrireason");
            return (Criteria) this;
        }

        public Criteria andIntellIsNull() {
            addCriterion("intell is null");
            return (Criteria) this;
        }

        public Criteria andIntellIsNotNull() {
            addCriterion("intell is not null");
            return (Criteria) this;
        }

        public Criteria andIntellEqualTo(String value) {
            addCriterion("intell =", value, "intell");
            return (Criteria) this;
        }

        public Criteria andIntellNotEqualTo(String value) {
            addCriterion("intell <>", value, "intell");
            return (Criteria) this;
        }

        public Criteria andIntellGreaterThan(String value) {
            addCriterion("intell >", value, "intell");
            return (Criteria) this;
        }

        public Criteria andIntellGreaterThanOrEqualTo(String value) {
            addCriterion("intell >=", value, "intell");
            return (Criteria) this;
        }

        public Criteria andIntellLessThan(String value) {
            addCriterion("intell <", value, "intell");
            return (Criteria) this;
        }

        public Criteria andIntellLessThanOrEqualTo(String value) {
            addCriterion("intell <=", value, "intell");
            return (Criteria) this;
        }

        public Criteria andIntellLike(String value) {
            addCriterion("intell like", value, "intell");
            return (Criteria) this;
        }

        public Criteria andIntellNotLike(String value) {
            addCriterion("intell not like", value, "intell");
            return (Criteria) this;
        }

        public Criteria andIntellIn(List<String> values) {
            addCriterion("intell in", values, "intell");
            return (Criteria) this;
        }

        public Criteria andIntellNotIn(List<String> values) {
            addCriterion("intell not in", values, "intell");
            return (Criteria) this;
        }

        public Criteria andIntellBetween(String value1, String value2) {
            addCriterion("intell between", value1, value2, "intell");
            return (Criteria) this;
        }

        public Criteria andIntellNotBetween(String value1, String value2) {
            addCriterion("intell not between", value1, value2, "intell");
            return (Criteria) this;
        }

        public Criteria andColorbodyIsNull() {
            addCriterion("colorbody is null");
            return (Criteria) this;
        }

        public Criteria andColorbodyIsNotNull() {
            addCriterion("colorbody is not null");
            return (Criteria) this;
        }

        public Criteria andColorbodyEqualTo(String value) {
            addCriterion("colorbody =", value, "colorbody");
            return (Criteria) this;
        }

        public Criteria andColorbodyNotEqualTo(String value) {
            addCriterion("colorbody <>", value, "colorbody");
            return (Criteria) this;
        }

        public Criteria andColorbodyGreaterThan(String value) {
            addCriterion("colorbody >", value, "colorbody");
            return (Criteria) this;
        }

        public Criteria andColorbodyGreaterThanOrEqualTo(String value) {
            addCriterion("colorbody >=", value, "colorbody");
            return (Criteria) this;
        }

        public Criteria andColorbodyLessThan(String value) {
            addCriterion("colorbody <", value, "colorbody");
            return (Criteria) this;
        }

        public Criteria andColorbodyLessThanOrEqualTo(String value) {
            addCriterion("colorbody <=", value, "colorbody");
            return (Criteria) this;
        }

        public Criteria andColorbodyLike(String value) {
            addCriterion("colorbody like", value, "colorbody");
            return (Criteria) this;
        }

        public Criteria andColorbodyNotLike(String value) {
            addCriterion("colorbody not like", value, "colorbody");
            return (Criteria) this;
        }

        public Criteria andColorbodyIn(List<String> values) {
            addCriterion("colorbody in", values, "colorbody");
            return (Criteria) this;
        }

        public Criteria andColorbodyNotIn(List<String> values) {
            addCriterion("colorbody not in", values, "colorbody");
            return (Criteria) this;
        }

        public Criteria andColorbodyBetween(String value1, String value2) {
            addCriterion("colorbody between", value1, value2, "colorbody");
            return (Criteria) this;
        }

        public Criteria andColorbodyNotBetween(String value1, String value2) {
            addCriterion("colorbody not between", value1, value2, "colorbody");
            return (Criteria) this;
        }

        public Criteria andBloodwaterIsNull() {
            addCriterion("bloodwater is null");
            return (Criteria) this;
        }

        public Criteria andBloodwaterIsNotNull() {
            addCriterion("bloodwater is not null");
            return (Criteria) this;
        }

        public Criteria andBloodwaterEqualTo(String value) {
            addCriterion("bloodwater =", value, "bloodwater");
            return (Criteria) this;
        }

        public Criteria andBloodwaterNotEqualTo(String value) {
            addCriterion("bloodwater <>", value, "bloodwater");
            return (Criteria) this;
        }

        public Criteria andBloodwaterGreaterThan(String value) {
            addCriterion("bloodwater >", value, "bloodwater");
            return (Criteria) this;
        }

        public Criteria andBloodwaterGreaterThanOrEqualTo(String value) {
            addCriterion("bloodwater >=", value, "bloodwater");
            return (Criteria) this;
        }

        public Criteria andBloodwaterLessThan(String value) {
            addCriterion("bloodwater <", value, "bloodwater");
            return (Criteria) this;
        }

        public Criteria andBloodwaterLessThanOrEqualTo(String value) {
            addCriterion("bloodwater <=", value, "bloodwater");
            return (Criteria) this;
        }

        public Criteria andBloodwaterLike(String value) {
            addCriterion("bloodwater like", value, "bloodwater");
            return (Criteria) this;
        }

        public Criteria andBloodwaterNotLike(String value) {
            addCriterion("bloodwater not like", value, "bloodwater");
            return (Criteria) this;
        }

        public Criteria andBloodwaterIn(List<String> values) {
            addCriterion("bloodwater in", values, "bloodwater");
            return (Criteria) this;
        }

        public Criteria andBloodwaterNotIn(List<String> values) {
            addCriterion("bloodwater not in", values, "bloodwater");
            return (Criteria) this;
        }

        public Criteria andBloodwaterBetween(String value1, String value2) {
            addCriterion("bloodwater between", value1, value2, "bloodwater");
            return (Criteria) this;
        }

        public Criteria andBloodwaterNotBetween(String value1, String value2) {
            addCriterion("bloodwater not between", value1, value2, "bloodwater");
            return (Criteria) this;
        }

        public Criteria andCheckIsNull() {
            addCriterion("`check` is null");
            return (Criteria) this;
        }

        public Criteria andCheckIsNotNull() {
            addCriterion("`check` is not null");
            return (Criteria) this;
        }

        public Criteria andCheckEqualTo(String value) {
            addCriterion("`check` =", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckNotEqualTo(String value) {
            addCriterion("`check` <>", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckGreaterThan(String value) {
            addCriterion("`check` >", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckGreaterThanOrEqualTo(String value) {
            addCriterion("`check` >=", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckLessThan(String value) {
            addCriterion("`check` <", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckLessThanOrEqualTo(String value) {
            addCriterion("`check` <=", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckLike(String value) {
            addCriterion("`check` like", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckNotLike(String value) {
            addCriterion("`check` not like", value, "check");
            return (Criteria) this;
        }

        public Criteria andCheckIn(List<String> values) {
            addCriterion("`check` in", values, "check");
            return (Criteria) this;
        }

        public Criteria andCheckNotIn(List<String> values) {
            addCriterion("`check` not in", values, "check");
            return (Criteria) this;
        }

        public Criteria andCheckBetween(String value1, String value2) {
            addCriterion("`check` between", value1, value2, "check");
            return (Criteria) this;
        }

        public Criteria andCheckNotBetween(String value1, String value2) {
            addCriterion("`check` not between", value1, value2, "check");
            return (Criteria) this;
        }

        public Criteria andSupersessionIsNull() {
            addCriterion("supersession is null");
            return (Criteria) this;
        }

        public Criteria andSupersessionIsNotNull() {
            addCriterion("supersession is not null");
            return (Criteria) this;
        }

        public Criteria andSupersessionEqualTo(String value) {
            addCriterion("supersession =", value, "supersession");
            return (Criteria) this;
        }

        public Criteria andSupersessionNotEqualTo(String value) {
            addCriterion("supersession <>", value, "supersession");
            return (Criteria) this;
        }

        public Criteria andSupersessionGreaterThan(String value) {
            addCriterion("supersession >", value, "supersession");
            return (Criteria) this;
        }

        public Criteria andSupersessionGreaterThanOrEqualTo(String value) {
            addCriterion("supersession >=", value, "supersession");
            return (Criteria) this;
        }

        public Criteria andSupersessionLessThan(String value) {
            addCriterion("supersession <", value, "supersession");
            return (Criteria) this;
        }

        public Criteria andSupersessionLessThanOrEqualTo(String value) {
            addCriterion("supersession <=", value, "supersession");
            return (Criteria) this;
        }

        public Criteria andSupersessionLike(String value) {
            addCriterion("supersession like", value, "supersession");
            return (Criteria) this;
        }

        public Criteria andSupersessionNotLike(String value) {
            addCriterion("supersession not like", value, "supersession");
            return (Criteria) this;
        }

        public Criteria andSupersessionIn(List<String> values) {
            addCriterion("supersession in", values, "supersession");
            return (Criteria) this;
        }

        public Criteria andSupersessionNotIn(List<String> values) {
            addCriterion("supersession not in", values, "supersession");
            return (Criteria) this;
        }

        public Criteria andSupersessionBetween(String value1, String value2) {
            addCriterion("supersession between", value1, value2, "supersession");
            return (Criteria) this;
        }

        public Criteria andSupersessionNotBetween(String value1, String value2) {
            addCriterion("supersession not between", value1, value2, "supersession");
            return (Criteria) this;
        }

        public Criteria andSsreasonIsNull() {
            addCriterion("ssreason is null");
            return (Criteria) this;
        }

        public Criteria andSsreasonIsNotNull() {
            addCriterion("ssreason is not null");
            return (Criteria) this;
        }

        public Criteria andSsreasonEqualTo(String value) {
            addCriterion("ssreason =", value, "ssreason");
            return (Criteria) this;
        }

        public Criteria andSsreasonNotEqualTo(String value) {
            addCriterion("ssreason <>", value, "ssreason");
            return (Criteria) this;
        }

        public Criteria andSsreasonGreaterThan(String value) {
            addCriterion("ssreason >", value, "ssreason");
            return (Criteria) this;
        }

        public Criteria andSsreasonGreaterThanOrEqualTo(String value) {
            addCriterion("ssreason >=", value, "ssreason");
            return (Criteria) this;
        }

        public Criteria andSsreasonLessThan(String value) {
            addCriterion("ssreason <", value, "ssreason");
            return (Criteria) this;
        }

        public Criteria andSsreasonLessThanOrEqualTo(String value) {
            addCriterion("ssreason <=", value, "ssreason");
            return (Criteria) this;
        }

        public Criteria andSsreasonLike(String value) {
            addCriterion("ssreason like", value, "ssreason");
            return (Criteria) this;
        }

        public Criteria andSsreasonNotLike(String value) {
            addCriterion("ssreason not like", value, "ssreason");
            return (Criteria) this;
        }

        public Criteria andSsreasonIn(List<String> values) {
            addCriterion("ssreason in", values, "ssreason");
            return (Criteria) this;
        }

        public Criteria andSsreasonNotIn(List<String> values) {
            addCriterion("ssreason not in", values, "ssreason");
            return (Criteria) this;
        }

        public Criteria andSsreasonBetween(String value1, String value2) {
            addCriterion("ssreason between", value1, value2, "ssreason");
            return (Criteria) this;
        }

        public Criteria andSsreasonNotBetween(String value1, String value2) {
            addCriterion("ssreason not between", value1, value2, "ssreason");
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