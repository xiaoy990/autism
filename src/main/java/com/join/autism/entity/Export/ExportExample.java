package com.join.autism.entity.Export;

import java.util.ArrayList;
import java.util.List;

public class ExportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ExportExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andTownIsNull() {
            addCriterion("town is null");
            return (Criteria) this;
        }

        public Criteria andTownIsNotNull() {
            addCriterion("town is not null");
            return (Criteria) this;
        }

        public Criteria andTownEqualTo(String value) {
            addCriterion("town =", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotEqualTo(String value) {
            addCriterion("town <>", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownGreaterThan(String value) {
            addCriterion("town >", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownGreaterThanOrEqualTo(String value) {
            addCriterion("town >=", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLessThan(String value) {
            addCriterion("town <", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLessThanOrEqualTo(String value) {
            addCriterion("town <=", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLike(String value) {
            addCriterion("town like", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotLike(String value) {
            addCriterion("town not like", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownIn(List<String> values) {
            addCriterion("town in", values, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotIn(List<String> values) {
            addCriterion("town not in", values, "town");
            return (Criteria) this;
        }

        public Criteria andTownBetween(String value1, String value2) {
            addCriterion("town between", value1, value2, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotBetween(String value1, String value2) {
            addCriterion("town not between", value1, value2, "town");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andSfnameIsNull() {
            addCriterion("sfname is null");
            return (Criteria) this;
        }

        public Criteria andSfnameIsNotNull() {
            addCriterion("sfname is not null");
            return (Criteria) this;
        }

        public Criteria andSfnameEqualTo(String value) {
            addCriterion("sfname =", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameNotEqualTo(String value) {
            addCriterion("sfname <>", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameGreaterThan(String value) {
            addCriterion("sfname >", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameGreaterThanOrEqualTo(String value) {
            addCriterion("sfname >=", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameLessThan(String value) {
            addCriterion("sfname <", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameLessThanOrEqualTo(String value) {
            addCriterion("sfname <=", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameLike(String value) {
            addCriterion("sfname like", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameNotLike(String value) {
            addCriterion("sfname not like", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameIn(List<String> values) {
            addCriterion("sfname in", values, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameNotIn(List<String> values) {
            addCriterion("sfname not in", values, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameBetween(String value1, String value2) {
            addCriterion("sfname between", value1, value2, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameNotBetween(String value1, String value2) {
            addCriterion("sfname not between", value1, value2, "sfname");
            return (Criteria) this;
        }

        public Criteria andRelationIsNull() {
            addCriterion("relation is null");
            return (Criteria) this;
        }

        public Criteria andRelationIsNotNull() {
            addCriterion("relation is not null");
            return (Criteria) this;
        }

        public Criteria andRelationEqualTo(String value) {
            addCriterion("relation =", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotEqualTo(String value) {
            addCriterion("relation <>", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThan(String value) {
            addCriterion("relation >", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThanOrEqualTo(String value) {
            addCriterion("relation >=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThan(String value) {
            addCriterion("relation <", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThanOrEqualTo(String value) {
            addCriterion("relation <=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLike(String value) {
            addCriterion("relation like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotLike(String value) {
            addCriterion("relation not like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationIn(List<String> values) {
            addCriterion("relation in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotIn(List<String> values) {
            addCriterion("relation not in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationBetween(String value1, String value2) {
            addCriterion("relation between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotBetween(String value1, String value2) {
            addCriterion("relation not between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andBrosisIsNull() {
            addCriterion("brosis is null");
            return (Criteria) this;
        }

        public Criteria andBrosisIsNotNull() {
            addCriterion("brosis is not null");
            return (Criteria) this;
        }

        public Criteria andBrosisEqualTo(Integer value) {
            addCriterion("brosis =", value, "brosis");
            return (Criteria) this;
        }

        public Criteria andBrosisNotEqualTo(Integer value) {
            addCriterion("brosis <>", value, "brosis");
            return (Criteria) this;
        }

        public Criteria andBrosisGreaterThan(Integer value) {
            addCriterion("brosis >", value, "brosis");
            return (Criteria) this;
        }

        public Criteria andBrosisGreaterThanOrEqualTo(Integer value) {
            addCriterion("brosis >=", value, "brosis");
            return (Criteria) this;
        }

        public Criteria andBrosisLessThan(Integer value) {
            addCriterion("brosis <", value, "brosis");
            return (Criteria) this;
        }

        public Criteria andBrosisLessThanOrEqualTo(Integer value) {
            addCriterion("brosis <=", value, "brosis");
            return (Criteria) this;
        }

        public Criteria andBrosisIn(List<Integer> values) {
            addCriterion("brosis in", values, "brosis");
            return (Criteria) this;
        }

        public Criteria andBrosisNotIn(List<Integer> values) {
            addCriterion("brosis not in", values, "brosis");
            return (Criteria) this;
        }

        public Criteria andBrosisBetween(Integer value1, Integer value2) {
            addCriterion("brosis between", value1, value2, "brosis");
            return (Criteria) this;
        }

        public Criteria andBrosisNotBetween(Integer value1, Integer value2) {
            addCriterion("brosis not between", value1, value2, "brosis");
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

        public Criteria andSurveyTimeIsNull() {
            addCriterion("survey_time is null");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeIsNotNull() {
            addCriterion("survey_time is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeEqualTo(String value) {
            addCriterion("survey_time =", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeNotEqualTo(String value) {
            addCriterion("survey_time <>", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeGreaterThan(String value) {
            addCriterion("survey_time >", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("survey_time >=", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeLessThan(String value) {
            addCriterion("survey_time <", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeLessThanOrEqualTo(String value) {
            addCriterion("survey_time <=", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeLike(String value) {
            addCriterion("survey_time like", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeNotLike(String value) {
            addCriterion("survey_time not like", value, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeIn(List<String> values) {
            addCriterion("survey_time in", values, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeNotIn(List<String> values) {
            addCriterion("survey_time not in", values, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeBetween(String value1, String value2) {
            addCriterion("survey_time between", value1, value2, "surveyTime");
            return (Criteria) this;
        }

        public Criteria andSurveyTimeNotBetween(String value1, String value2) {
            addCriterion("survey_time not between", value1, value2, "surveyTime");
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

        public Criteria andSixIsNull() {
            addCriterion("six is null");
            return (Criteria) this;
        }

        public Criteria andSixIsNotNull() {
            addCriterion("six is not null");
            return (Criteria) this;
        }

        public Criteria andSixEqualTo(String value) {
            addCriterion("six =", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixNotEqualTo(String value) {
            addCriterion("six <>", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixGreaterThan(String value) {
            addCriterion("six >", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixGreaterThanOrEqualTo(String value) {
            addCriterion("six >=", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixLessThan(String value) {
            addCriterion("six <", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixLessThanOrEqualTo(String value) {
            addCriterion("six <=", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixLike(String value) {
            addCriterion("six like", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixNotLike(String value) {
            addCriterion("six not like", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixIn(List<String> values) {
            addCriterion("six in", values, "six");
            return (Criteria) this;
        }

        public Criteria andSixNotIn(List<String> values) {
            addCriterion("six not in", values, "six");
            return (Criteria) this;
        }

        public Criteria andSixBetween(String value1, String value2) {
            addCriterion("six between", value1, value2, "six");
            return (Criteria) this;
        }

        public Criteria andSixNotBetween(String value1, String value2) {
            addCriterion("six not between", value1, value2, "six");
            return (Criteria) this;
        }

        public Criteria andAdderIsNull() {
            addCriterion("adder is null");
            return (Criteria) this;
        }

        public Criteria andAdderIsNotNull() {
            addCriterion("adder is not null");
            return (Criteria) this;
        }

        public Criteria andAdderEqualTo(String value) {
            addCriterion("adder =", value, "adder");
            return (Criteria) this;
        }

        public Criteria andAdderNotEqualTo(String value) {
            addCriterion("adder <>", value, "adder");
            return (Criteria) this;
        }

        public Criteria andAdderGreaterThan(String value) {
            addCriterion("adder >", value, "adder");
            return (Criteria) this;
        }

        public Criteria andAdderGreaterThanOrEqualTo(String value) {
            addCriterion("adder >=", value, "adder");
            return (Criteria) this;
        }

        public Criteria andAdderLessThan(String value) {
            addCriterion("adder <", value, "adder");
            return (Criteria) this;
        }

        public Criteria andAdderLessThanOrEqualTo(String value) {
            addCriterion("adder <=", value, "adder");
            return (Criteria) this;
        }

        public Criteria andAdderLike(String value) {
            addCriterion("adder like", value, "adder");
            return (Criteria) this;
        }

        public Criteria andAdderNotLike(String value) {
            addCriterion("adder not like", value, "adder");
            return (Criteria) this;
        }

        public Criteria andAdderIn(List<String> values) {
            addCriterion("adder in", values, "adder");
            return (Criteria) this;
        }

        public Criteria andAdderNotIn(List<String> values) {
            addCriterion("adder not in", values, "adder");
            return (Criteria) this;
        }

        public Criteria andAdderBetween(String value1, String value2) {
            addCriterion("adder between", value1, value2, "adder");
            return (Criteria) this;
        }

        public Criteria andAdderNotBetween(String value1, String value2) {
            addCriterion("adder not between", value1, value2, "adder");
            return (Criteria) this;
        }

        public Criteria andKgIsNull() {
            addCriterion("kg is null");
            return (Criteria) this;
        }

        public Criteria andKgIsNotNull() {
            addCriterion("kg is not null");
            return (Criteria) this;
        }

        public Criteria andKgEqualTo(String value) {
            addCriterion("kg =", value, "kg");
            return (Criteria) this;
        }

        public Criteria andKgNotEqualTo(String value) {
            addCriterion("kg <>", value, "kg");
            return (Criteria) this;
        }

        public Criteria andKgGreaterThan(String value) {
            addCriterion("kg >", value, "kg");
            return (Criteria) this;
        }

        public Criteria andKgGreaterThanOrEqualTo(String value) {
            addCriterion("kg >=", value, "kg");
            return (Criteria) this;
        }

        public Criteria andKgLessThan(String value) {
            addCriterion("kg <", value, "kg");
            return (Criteria) this;
        }

        public Criteria andKgLessThanOrEqualTo(String value) {
            addCriterion("kg <=", value, "kg");
            return (Criteria) this;
        }

        public Criteria andKgLike(String value) {
            addCriterion("kg like", value, "kg");
            return (Criteria) this;
        }

        public Criteria andKgNotLike(String value) {
            addCriterion("kg not like", value, "kg");
            return (Criteria) this;
        }

        public Criteria andKgIn(List<String> values) {
            addCriterion("kg in", values, "kg");
            return (Criteria) this;
        }

        public Criteria andKgNotIn(List<String> values) {
            addCriterion("kg not in", values, "kg");
            return (Criteria) this;
        }

        public Criteria andKgBetween(String value1, String value2) {
            addCriterion("kg between", value1, value2, "kg");
            return (Criteria) this;
        }

        public Criteria andKgNotBetween(String value1, String value2) {
            addCriterion("kg not between", value1, value2, "kg");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(String value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(String value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(String value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(String value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(String value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(String value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLike(String value) {
            addCriterion("score like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotLike(String value) {
            addCriterion("score not like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<String> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<String> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(String value1, String value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(String value1, String value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScorereasonIsNull() {
            addCriterion("scorereason is null");
            return (Criteria) this;
        }

        public Criteria andScorereasonIsNotNull() {
            addCriterion("scorereason is not null");
            return (Criteria) this;
        }

        public Criteria andScorereasonEqualTo(String value) {
            addCriterion("scorereason =", value, "scorereason");
            return (Criteria) this;
        }

        public Criteria andScorereasonNotEqualTo(String value) {
            addCriterion("scorereason <>", value, "scorereason");
            return (Criteria) this;
        }

        public Criteria andScorereasonGreaterThan(String value) {
            addCriterion("scorereason >", value, "scorereason");
            return (Criteria) this;
        }

        public Criteria andScorereasonGreaterThanOrEqualTo(String value) {
            addCriterion("scorereason >=", value, "scorereason");
            return (Criteria) this;
        }

        public Criteria andScorereasonLessThan(String value) {
            addCriterion("scorereason <", value, "scorereason");
            return (Criteria) this;
        }

        public Criteria andScorereasonLessThanOrEqualTo(String value) {
            addCriterion("scorereason <=", value, "scorereason");
            return (Criteria) this;
        }

        public Criteria andScorereasonLike(String value) {
            addCriterion("scorereason like", value, "scorereason");
            return (Criteria) this;
        }

        public Criteria andScorereasonNotLike(String value) {
            addCriterion("scorereason not like", value, "scorereason");
            return (Criteria) this;
        }

        public Criteria andScorereasonIn(List<String> values) {
            addCriterion("scorereason in", values, "scorereason");
            return (Criteria) this;
        }

        public Criteria andScorereasonNotIn(List<String> values) {
            addCriterion("scorereason not in", values, "scorereason");
            return (Criteria) this;
        }

        public Criteria andScorereasonBetween(String value1, String value2) {
            addCriterion("scorereason between", value1, value2, "scorereason");
            return (Criteria) this;
        }

        public Criteria andScorereasonNotBetween(String value1, String value2) {
            addCriterion("scorereason not between", value1, value2, "scorereason");
            return (Criteria) this;
        }

        public Criteria andGogoIsNull() {
            addCriterion("gogo is null");
            return (Criteria) this;
        }

        public Criteria andGogoIsNotNull() {
            addCriterion("gogo is not null");
            return (Criteria) this;
        }

        public Criteria andGogoEqualTo(String value) {
            addCriterion("gogo =", value, "gogo");
            return (Criteria) this;
        }

        public Criteria andGogoNotEqualTo(String value) {
            addCriterion("gogo <>", value, "gogo");
            return (Criteria) this;
        }

        public Criteria andGogoGreaterThan(String value) {
            addCriterion("gogo >", value, "gogo");
            return (Criteria) this;
        }

        public Criteria andGogoGreaterThanOrEqualTo(String value) {
            addCriterion("gogo >=", value, "gogo");
            return (Criteria) this;
        }

        public Criteria andGogoLessThan(String value) {
            addCriterion("gogo <", value, "gogo");
            return (Criteria) this;
        }

        public Criteria andGogoLessThanOrEqualTo(String value) {
            addCriterion("gogo <=", value, "gogo");
            return (Criteria) this;
        }

        public Criteria andGogoLike(String value) {
            addCriterion("gogo like", value, "gogo");
            return (Criteria) this;
        }

        public Criteria andGogoNotLike(String value) {
            addCriterion("gogo not like", value, "gogo");
            return (Criteria) this;
        }

        public Criteria andGogoIn(List<String> values) {
            addCriterion("gogo in", values, "gogo");
            return (Criteria) this;
        }

        public Criteria andGogoNotIn(List<String> values) {
            addCriterion("gogo not in", values, "gogo");
            return (Criteria) this;
        }

        public Criteria andGogoBetween(String value1, String value2) {
            addCriterion("gogo between", value1, value2, "gogo");
            return (Criteria) this;
        }

        public Criteria andGogoNotBetween(String value1, String value2) {
            addCriterion("gogo not between", value1, value2, "gogo");
            return (Criteria) this;
        }

        public Criteria andGogoreasonIsNull() {
            addCriterion("gogoreason is null");
            return (Criteria) this;
        }

        public Criteria andGogoreasonIsNotNull() {
            addCriterion("gogoreason is not null");
            return (Criteria) this;
        }

        public Criteria andGogoreasonEqualTo(String value) {
            addCriterion("gogoreason =", value, "gogoreason");
            return (Criteria) this;
        }

        public Criteria andGogoreasonNotEqualTo(String value) {
            addCriterion("gogoreason <>", value, "gogoreason");
            return (Criteria) this;
        }

        public Criteria andGogoreasonGreaterThan(String value) {
            addCriterion("gogoreason >", value, "gogoreason");
            return (Criteria) this;
        }

        public Criteria andGogoreasonGreaterThanOrEqualTo(String value) {
            addCriterion("gogoreason >=", value, "gogoreason");
            return (Criteria) this;
        }

        public Criteria andGogoreasonLessThan(String value) {
            addCriterion("gogoreason <", value, "gogoreason");
            return (Criteria) this;
        }

        public Criteria andGogoreasonLessThanOrEqualTo(String value) {
            addCriterion("gogoreason <=", value, "gogoreason");
            return (Criteria) this;
        }

        public Criteria andGogoreasonLike(String value) {
            addCriterion("gogoreason like", value, "gogoreason");
            return (Criteria) this;
        }

        public Criteria andGogoreasonNotLike(String value) {
            addCriterion("gogoreason not like", value, "gogoreason");
            return (Criteria) this;
        }

        public Criteria andGogoreasonIn(List<String> values) {
            addCriterion("gogoreason in", values, "gogoreason");
            return (Criteria) this;
        }

        public Criteria andGogoreasonNotIn(List<String> values) {
            addCriterion("gogoreason not in", values, "gogoreason");
            return (Criteria) this;
        }

        public Criteria andGogoreasonBetween(String value1, String value2) {
            addCriterion("gogoreason between", value1, value2, "gogoreason");
            return (Criteria) this;
        }

        public Criteria andGogoreasonNotBetween(String value1, String value2) {
            addCriterion("gogoreason not between", value1, value2, "gogoreason");
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

        public Criteria andAssistEqualTo(String value) {
            addCriterion("assist =", value, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistNotEqualTo(String value) {
            addCriterion("assist <>", value, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistGreaterThan(String value) {
            addCriterion("assist >", value, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistGreaterThanOrEqualTo(String value) {
            addCriterion("assist >=", value, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistLessThan(String value) {
            addCriterion("assist <", value, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistLessThanOrEqualTo(String value) {
            addCriterion("assist <=", value, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistLike(String value) {
            addCriterion("assist like", value, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistNotLike(String value) {
            addCriterion("assist not like", value, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistIn(List<String> values) {
            addCriterion("assist in", values, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistNotIn(List<String> values) {
            addCriterion("assist not in", values, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistBetween(String value1, String value2) {
            addCriterion("assist between", value1, value2, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistNotBetween(String value1, String value2) {
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

        public Criteria andComplIsNull() {
            addCriterion("compl is null");
            return (Criteria) this;
        }

        public Criteria andComplIsNotNull() {
            addCriterion("compl is not null");
            return (Criteria) this;
        }

        public Criteria andComplEqualTo(String value) {
            addCriterion("compl =", value, "compl");
            return (Criteria) this;
        }

        public Criteria andComplNotEqualTo(String value) {
            addCriterion("compl <>", value, "compl");
            return (Criteria) this;
        }

        public Criteria andComplGreaterThan(String value) {
            addCriterion("compl >", value, "compl");
            return (Criteria) this;
        }

        public Criteria andComplGreaterThanOrEqualTo(String value) {
            addCriterion("compl >=", value, "compl");
            return (Criteria) this;
        }

        public Criteria andComplLessThan(String value) {
            addCriterion("compl <", value, "compl");
            return (Criteria) this;
        }

        public Criteria andComplLessThanOrEqualTo(String value) {
            addCriterion("compl <=", value, "compl");
            return (Criteria) this;
        }

        public Criteria andComplLike(String value) {
            addCriterion("compl like", value, "compl");
            return (Criteria) this;
        }

        public Criteria andComplNotLike(String value) {
            addCriterion("compl not like", value, "compl");
            return (Criteria) this;
        }

        public Criteria andComplIn(List<String> values) {
            addCriterion("compl in", values, "compl");
            return (Criteria) this;
        }

        public Criteria andComplNotIn(List<String> values) {
            addCriterion("compl not in", values, "compl");
            return (Criteria) this;
        }

        public Criteria andComplBetween(String value1, String value2) {
            addCriterion("compl between", value1, value2, "compl");
            return (Criteria) this;
        }

        public Criteria andComplNotBetween(String value1, String value2) {
            addCriterion("compl not between", value1, value2, "compl");
            return (Criteria) this;
        }

        public Criteria andComplreasonIsNull() {
            addCriterion("complreason is null");
            return (Criteria) this;
        }

        public Criteria andComplreasonIsNotNull() {
            addCriterion("complreason is not null");
            return (Criteria) this;
        }

        public Criteria andComplreasonEqualTo(String value) {
            addCriterion("complreason =", value, "complreason");
            return (Criteria) this;
        }

        public Criteria andComplreasonNotEqualTo(String value) {
            addCriterion("complreason <>", value, "complreason");
            return (Criteria) this;
        }

        public Criteria andComplreasonGreaterThan(String value) {
            addCriterion("complreason >", value, "complreason");
            return (Criteria) this;
        }

        public Criteria andComplreasonGreaterThanOrEqualTo(String value) {
            addCriterion("complreason >=", value, "complreason");
            return (Criteria) this;
        }

        public Criteria andComplreasonLessThan(String value) {
            addCriterion("complreason <", value, "complreason");
            return (Criteria) this;
        }

        public Criteria andComplreasonLessThanOrEqualTo(String value) {
            addCriterion("complreason <=", value, "complreason");
            return (Criteria) this;
        }

        public Criteria andComplreasonLike(String value) {
            addCriterion("complreason like", value, "complreason");
            return (Criteria) this;
        }

        public Criteria andComplreasonNotLike(String value) {
            addCriterion("complreason not like", value, "complreason");
            return (Criteria) this;
        }

        public Criteria andComplreasonIn(List<String> values) {
            addCriterion("complreason in", values, "complreason");
            return (Criteria) this;
        }

        public Criteria andComplreasonNotIn(List<String> values) {
            addCriterion("complreason not in", values, "complreason");
            return (Criteria) this;
        }

        public Criteria andComplreasonBetween(String value1, String value2) {
            addCriterion("complreason between", value1, value2, "complreason");
            return (Criteria) this;
        }

        public Criteria andComplreasonNotBetween(String value1, String value2) {
            addCriterion("complreason not between", value1, value2, "complreason");
            return (Criteria) this;
        }

        public Criteria andMombraIsNull() {
            addCriterion("mombra is null");
            return (Criteria) this;
        }

        public Criteria andMombraIsNotNull() {
            addCriterion("mombra is not null");
            return (Criteria) this;
        }

        public Criteria andMombraEqualTo(String value) {
            addCriterion("mombra =", value, "mombra");
            return (Criteria) this;
        }

        public Criteria andMombraNotEqualTo(String value) {
            addCriterion("mombra <>", value, "mombra");
            return (Criteria) this;
        }

        public Criteria andMombraGreaterThan(String value) {
            addCriterion("mombra >", value, "mombra");
            return (Criteria) this;
        }

        public Criteria andMombraGreaterThanOrEqualTo(String value) {
            addCriterion("mombra >=", value, "mombra");
            return (Criteria) this;
        }

        public Criteria andMombraLessThan(String value) {
            addCriterion("mombra <", value, "mombra");
            return (Criteria) this;
        }

        public Criteria andMombraLessThanOrEqualTo(String value) {
            addCriterion("mombra <=", value, "mombra");
            return (Criteria) this;
        }

        public Criteria andMombraLike(String value) {
            addCriterion("mombra like", value, "mombra");
            return (Criteria) this;
        }

        public Criteria andMombraNotLike(String value) {
            addCriterion("mombra not like", value, "mombra");
            return (Criteria) this;
        }

        public Criteria andMombraIn(List<String> values) {
            addCriterion("mombra in", values, "mombra");
            return (Criteria) this;
        }

        public Criteria andMombraNotIn(List<String> values) {
            addCriterion("mombra not in", values, "mombra");
            return (Criteria) this;
        }

        public Criteria andMombraBetween(String value1, String value2) {
            addCriterion("mombra between", value1, value2, "mombra");
            return (Criteria) this;
        }

        public Criteria andMombraNotBetween(String value1, String value2) {
            addCriterion("mombra not between", value1, value2, "mombra");
            return (Criteria) this;
        }

        public Criteria andMombrareasonIsNull() {
            addCriterion("mombrareason is null");
            return (Criteria) this;
        }

        public Criteria andMombrareasonIsNotNull() {
            addCriterion("mombrareason is not null");
            return (Criteria) this;
        }

        public Criteria andMombrareasonEqualTo(String value) {
            addCriterion("mombrareason =", value, "mombrareason");
            return (Criteria) this;
        }

        public Criteria andMombrareasonNotEqualTo(String value) {
            addCriterion("mombrareason <>", value, "mombrareason");
            return (Criteria) this;
        }

        public Criteria andMombrareasonGreaterThan(String value) {
            addCriterion("mombrareason >", value, "mombrareason");
            return (Criteria) this;
        }

        public Criteria andMombrareasonGreaterThanOrEqualTo(String value) {
            addCriterion("mombrareason >=", value, "mombrareason");
            return (Criteria) this;
        }

        public Criteria andMombrareasonLessThan(String value) {
            addCriterion("mombrareason <", value, "mombrareason");
            return (Criteria) this;
        }

        public Criteria andMombrareasonLessThanOrEqualTo(String value) {
            addCriterion("mombrareason <=", value, "mombrareason");
            return (Criteria) this;
        }

        public Criteria andMombrareasonLike(String value) {
            addCriterion("mombrareason like", value, "mombrareason");
            return (Criteria) this;
        }

        public Criteria andMombrareasonNotLike(String value) {
            addCriterion("mombrareason not like", value, "mombrareason");
            return (Criteria) this;
        }

        public Criteria andMombrareasonIn(List<String> values) {
            addCriterion("mombrareason in", values, "mombrareason");
            return (Criteria) this;
        }

        public Criteria andMombrareasonNotIn(List<String> values) {
            addCriterion("mombrareason not in", values, "mombrareason");
            return (Criteria) this;
        }

        public Criteria andMombrareasonBetween(String value1, String value2) {
            addCriterion("mombrareason between", value1, value2, "mombrareason");
            return (Criteria) this;
        }

        public Criteria andMombrareasonNotBetween(String value1, String value2) {
            addCriterion("mombrareason not between", value1, value2, "mombrareason");
            return (Criteria) this;
        }

        public Criteria andBradiffIsNull() {
            addCriterion("bradiff is null");
            return (Criteria) this;
        }

        public Criteria andBradiffIsNotNull() {
            addCriterion("bradiff is not null");
            return (Criteria) this;
        }

        public Criteria andBradiffEqualTo(String value) {
            addCriterion("bradiff =", value, "bradiff");
            return (Criteria) this;
        }

        public Criteria andBradiffNotEqualTo(String value) {
            addCriterion("bradiff <>", value, "bradiff");
            return (Criteria) this;
        }

        public Criteria andBradiffGreaterThan(String value) {
            addCriterion("bradiff >", value, "bradiff");
            return (Criteria) this;
        }

        public Criteria andBradiffGreaterThanOrEqualTo(String value) {
            addCriterion("bradiff >=", value, "bradiff");
            return (Criteria) this;
        }

        public Criteria andBradiffLessThan(String value) {
            addCriterion("bradiff <", value, "bradiff");
            return (Criteria) this;
        }

        public Criteria andBradiffLessThanOrEqualTo(String value) {
            addCriterion("bradiff <=", value, "bradiff");
            return (Criteria) this;
        }

        public Criteria andBradiffLike(String value) {
            addCriterion("bradiff like", value, "bradiff");
            return (Criteria) this;
        }

        public Criteria andBradiffNotLike(String value) {
            addCriterion("bradiff not like", value, "bradiff");
            return (Criteria) this;
        }

        public Criteria andBradiffIn(List<String> values) {
            addCriterion("bradiff in", values, "bradiff");
            return (Criteria) this;
        }

        public Criteria andBradiffNotIn(List<String> values) {
            addCriterion("bradiff not in", values, "bradiff");
            return (Criteria) this;
        }

        public Criteria andBradiffBetween(String value1, String value2) {
            addCriterion("bradiff between", value1, value2, "bradiff");
            return (Criteria) this;
        }

        public Criteria andBradiffNotBetween(String value1, String value2) {
            addCriterion("bradiff not between", value1, value2, "bradiff");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonIsNull() {
            addCriterion("bradiffreason is null");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonIsNotNull() {
            addCriterion("bradiffreason is not null");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonEqualTo(String value) {
            addCriterion("bradiffreason =", value, "bradiffreason");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonNotEqualTo(String value) {
            addCriterion("bradiffreason <>", value, "bradiffreason");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonGreaterThan(String value) {
            addCriterion("bradiffreason >", value, "bradiffreason");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonGreaterThanOrEqualTo(String value) {
            addCriterion("bradiffreason >=", value, "bradiffreason");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonLessThan(String value) {
            addCriterion("bradiffreason <", value, "bradiffreason");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonLessThanOrEqualTo(String value) {
            addCriterion("bradiffreason <=", value, "bradiffreason");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonLike(String value) {
            addCriterion("bradiffreason like", value, "bradiffreason");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonNotLike(String value) {
            addCriterion("bradiffreason not like", value, "bradiffreason");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonIn(List<String> values) {
            addCriterion("bradiffreason in", values, "bradiffreason");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonNotIn(List<String> values) {
            addCriterion("bradiffreason not in", values, "bradiffreason");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonBetween(String value1, String value2) {
            addCriterion("bradiffreason between", value1, value2, "bradiffreason");
            return (Criteria) this;
        }

        public Criteria andBradiffreasonNotBetween(String value1, String value2) {
            addCriterion("bradiffreason not between", value1, value2, "bradiffreason");
            return (Criteria) this;
        }

        public Criteria andGrowIsNull() {
            addCriterion("grow is null");
            return (Criteria) this;
        }

        public Criteria andGrowIsNotNull() {
            addCriterion("grow is not null");
            return (Criteria) this;
        }

        public Criteria andGrowEqualTo(String value) {
            addCriterion("grow =", value, "grow");
            return (Criteria) this;
        }

        public Criteria andGrowNotEqualTo(String value) {
            addCriterion("grow <>", value, "grow");
            return (Criteria) this;
        }

        public Criteria andGrowGreaterThan(String value) {
            addCriterion("grow >", value, "grow");
            return (Criteria) this;
        }

        public Criteria andGrowGreaterThanOrEqualTo(String value) {
            addCriterion("grow >=", value, "grow");
            return (Criteria) this;
        }

        public Criteria andGrowLessThan(String value) {
            addCriterion("grow <", value, "grow");
            return (Criteria) this;
        }

        public Criteria andGrowLessThanOrEqualTo(String value) {
            addCriterion("grow <=", value, "grow");
            return (Criteria) this;
        }

        public Criteria andGrowLike(String value) {
            addCriterion("grow like", value, "grow");
            return (Criteria) this;
        }

        public Criteria andGrowNotLike(String value) {
            addCriterion("grow not like", value, "grow");
            return (Criteria) this;
        }

        public Criteria andGrowIn(List<String> values) {
            addCriterion("grow in", values, "grow");
            return (Criteria) this;
        }

        public Criteria andGrowNotIn(List<String> values) {
            addCriterion("grow not in", values, "grow");
            return (Criteria) this;
        }

        public Criteria andGrowBetween(String value1, String value2) {
            addCriterion("grow between", value1, value2, "grow");
            return (Criteria) this;
        }

        public Criteria andGrowNotBetween(String value1, String value2) {
            addCriterion("grow not between", value1, value2, "grow");
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

        public Criteria andVitamdIsNull() {
            addCriterion("vitamd is null");
            return (Criteria) this;
        }

        public Criteria andVitamdIsNotNull() {
            addCriterion("vitamd is not null");
            return (Criteria) this;
        }

        public Criteria andVitamdEqualTo(String value) {
            addCriterion("vitamd =", value, "vitamd");
            return (Criteria) this;
        }

        public Criteria andVitamdNotEqualTo(String value) {
            addCriterion("vitamd <>", value, "vitamd");
            return (Criteria) this;
        }

        public Criteria andVitamdGreaterThan(String value) {
            addCriterion("vitamd >", value, "vitamd");
            return (Criteria) this;
        }

        public Criteria andVitamdGreaterThanOrEqualTo(String value) {
            addCriterion("vitamd >=", value, "vitamd");
            return (Criteria) this;
        }

        public Criteria andVitamdLessThan(String value) {
            addCriterion("vitamd <", value, "vitamd");
            return (Criteria) this;
        }

        public Criteria andVitamdLessThanOrEqualTo(String value) {
            addCriterion("vitamd <=", value, "vitamd");
            return (Criteria) this;
        }

        public Criteria andVitamdLike(String value) {
            addCriterion("vitamd like", value, "vitamd");
            return (Criteria) this;
        }

        public Criteria andVitamdNotLike(String value) {
            addCriterion("vitamd not like", value, "vitamd");
            return (Criteria) this;
        }

        public Criteria andVitamdIn(List<String> values) {
            addCriterion("vitamd in", values, "vitamd");
            return (Criteria) this;
        }

        public Criteria andVitamdNotIn(List<String> values) {
            addCriterion("vitamd not in", values, "vitamd");
            return (Criteria) this;
        }

        public Criteria andVitamdBetween(String value1, String value2) {
            addCriterion("vitamd between", value1, value2, "vitamd");
            return (Criteria) this;
        }

        public Criteria andVitamdNotBetween(String value1, String value2) {
            addCriterion("vitamd not between", value1, value2, "vitamd");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonIsNull() {
            addCriterion("speakreason is null");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonIsNotNull() {
            addCriterion("speakreason is not null");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonEqualTo(String value) {
            addCriterion("speakreason =", value, "speakreason");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonNotEqualTo(String value) {
            addCriterion("speakreason <>", value, "speakreason");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonGreaterThan(String value) {
            addCriterion("speakreason >", value, "speakreason");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonGreaterThanOrEqualTo(String value) {
            addCriterion("speakreason >=", value, "speakreason");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonLessThan(String value) {
            addCriterion("speakreason <", value, "speakreason");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonLessThanOrEqualTo(String value) {
            addCriterion("speakreason <=", value, "speakreason");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonLike(String value) {
            addCriterion("speakreason like", value, "speakreason");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonNotLike(String value) {
            addCriterion("speakreason not like", value, "speakreason");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonIn(List<String> values) {
            addCriterion("speakreason in", values, "speakreason");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonNotIn(List<String> values) {
            addCriterion("speakreason not in", values, "speakreason");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonBetween(String value1, String value2) {
            addCriterion("speakreason between", value1, value2, "speakreason");
            return (Criteria) this;
        }

        public Criteria andSpeakreasonNotBetween(String value1, String value2) {
            addCriterion("speakreason not between", value1, value2, "speakreason");
            return (Criteria) this;
        }

        public Criteria andMonthgoIsNull() {
            addCriterion("monthgo is null");
            return (Criteria) this;
        }

        public Criteria andMonthgoIsNotNull() {
            addCriterion("monthgo is not null");
            return (Criteria) this;
        }

        public Criteria andMonthgoEqualTo(String value) {
            addCriterion("monthgo =", value, "monthgo");
            return (Criteria) this;
        }

        public Criteria andMonthgoNotEqualTo(String value) {
            addCriterion("monthgo <>", value, "monthgo");
            return (Criteria) this;
        }

        public Criteria andMonthgoGreaterThan(String value) {
            addCriterion("monthgo >", value, "monthgo");
            return (Criteria) this;
        }

        public Criteria andMonthgoGreaterThanOrEqualTo(String value) {
            addCriterion("monthgo >=", value, "monthgo");
            return (Criteria) this;
        }

        public Criteria andMonthgoLessThan(String value) {
            addCriterion("monthgo <", value, "monthgo");
            return (Criteria) this;
        }

        public Criteria andMonthgoLessThanOrEqualTo(String value) {
            addCriterion("monthgo <=", value, "monthgo");
            return (Criteria) this;
        }

        public Criteria andMonthgoLike(String value) {
            addCriterion("monthgo like", value, "monthgo");
            return (Criteria) this;
        }

        public Criteria andMonthgoNotLike(String value) {
            addCriterion("monthgo not like", value, "monthgo");
            return (Criteria) this;
        }

        public Criteria andMonthgoIn(List<String> values) {
            addCriterion("monthgo in", values, "monthgo");
            return (Criteria) this;
        }

        public Criteria andMonthgoNotIn(List<String> values) {
            addCriterion("monthgo not in", values, "monthgo");
            return (Criteria) this;
        }

        public Criteria andMonthgoBetween(String value1, String value2) {
            addCriterion("monthgo between", value1, value2, "monthgo");
            return (Criteria) this;
        }

        public Criteria andMonthgoNotBetween(String value1, String value2) {
            addCriterion("monthgo not between", value1, value2, "monthgo");
            return (Criteria) this;
        }

        public Criteria andMonthclimbIsNull() {
            addCriterion("monthclimb is null");
            return (Criteria) this;
        }

        public Criteria andMonthclimbIsNotNull() {
            addCriterion("monthclimb is not null");
            return (Criteria) this;
        }

        public Criteria andMonthclimbEqualTo(String value) {
            addCriterion("monthclimb =", value, "monthclimb");
            return (Criteria) this;
        }

        public Criteria andMonthclimbNotEqualTo(String value) {
            addCriterion("monthclimb <>", value, "monthclimb");
            return (Criteria) this;
        }

        public Criteria andMonthclimbGreaterThan(String value) {
            addCriterion("monthclimb >", value, "monthclimb");
            return (Criteria) this;
        }

        public Criteria andMonthclimbGreaterThanOrEqualTo(String value) {
            addCriterion("monthclimb >=", value, "monthclimb");
            return (Criteria) this;
        }

        public Criteria andMonthclimbLessThan(String value) {
            addCriterion("monthclimb <", value, "monthclimb");
            return (Criteria) this;
        }

        public Criteria andMonthclimbLessThanOrEqualTo(String value) {
            addCriterion("monthclimb <=", value, "monthclimb");
            return (Criteria) this;
        }

        public Criteria andMonthclimbLike(String value) {
            addCriterion("monthclimb like", value, "monthclimb");
            return (Criteria) this;
        }

        public Criteria andMonthclimbNotLike(String value) {
            addCriterion("monthclimb not like", value, "monthclimb");
            return (Criteria) this;
        }

        public Criteria andMonthclimbIn(List<String> values) {
            addCriterion("monthclimb in", values, "monthclimb");
            return (Criteria) this;
        }

        public Criteria andMonthclimbNotIn(List<String> values) {
            addCriterion("monthclimb not in", values, "monthclimb");
            return (Criteria) this;
        }

        public Criteria andMonthclimbBetween(String value1, String value2) {
            addCriterion("monthclimb between", value1, value2, "monthclimb");
            return (Criteria) this;
        }

        public Criteria andMonthclimbNotBetween(String value1, String value2) {
            addCriterion("monthclimb not between", value1, value2, "monthclimb");
            return (Criteria) this;
        }

        public Criteria andMonthsitIsNull() {
            addCriterion("monthsit is null");
            return (Criteria) this;
        }

        public Criteria andMonthsitIsNotNull() {
            addCriterion("monthsit is not null");
            return (Criteria) this;
        }

        public Criteria andMonthsitEqualTo(String value) {
            addCriterion("monthsit =", value, "monthsit");
            return (Criteria) this;
        }

        public Criteria andMonthsitNotEqualTo(String value) {
            addCriterion("monthsit <>", value, "monthsit");
            return (Criteria) this;
        }

        public Criteria andMonthsitGreaterThan(String value) {
            addCriterion("monthsit >", value, "monthsit");
            return (Criteria) this;
        }

        public Criteria andMonthsitGreaterThanOrEqualTo(String value) {
            addCriterion("monthsit >=", value, "monthsit");
            return (Criteria) this;
        }

        public Criteria andMonthsitLessThan(String value) {
            addCriterion("monthsit <", value, "monthsit");
            return (Criteria) this;
        }

        public Criteria andMonthsitLessThanOrEqualTo(String value) {
            addCriterion("monthsit <=", value, "monthsit");
            return (Criteria) this;
        }

        public Criteria andMonthsitLike(String value) {
            addCriterion("monthsit like", value, "monthsit");
            return (Criteria) this;
        }

        public Criteria andMonthsitNotLike(String value) {
            addCriterion("monthsit not like", value, "monthsit");
            return (Criteria) this;
        }

        public Criteria andMonthsitIn(List<String> values) {
            addCriterion("monthsit in", values, "monthsit");
            return (Criteria) this;
        }

        public Criteria andMonthsitNotIn(List<String> values) {
            addCriterion("monthsit not in", values, "monthsit");
            return (Criteria) this;
        }

        public Criteria andMonthsitBetween(String value1, String value2) {
            addCriterion("monthsit between", value1, value2, "monthsit");
            return (Criteria) this;
        }

        public Criteria andMonthsitNotBetween(String value1, String value2) {
            addCriterion("monthsit not between", value1, value2, "monthsit");
            return (Criteria) this;
        }

        public Criteria andMonthrollIsNull() {
            addCriterion("monthroll is null");
            return (Criteria) this;
        }

        public Criteria andMonthrollIsNotNull() {
            addCriterion("monthroll is not null");
            return (Criteria) this;
        }

        public Criteria andMonthrollEqualTo(String value) {
            addCriterion("monthroll =", value, "monthroll");
            return (Criteria) this;
        }

        public Criteria andMonthrollNotEqualTo(String value) {
            addCriterion("monthroll <>", value, "monthroll");
            return (Criteria) this;
        }

        public Criteria andMonthrollGreaterThan(String value) {
            addCriterion("monthroll >", value, "monthroll");
            return (Criteria) this;
        }

        public Criteria andMonthrollGreaterThanOrEqualTo(String value) {
            addCriterion("monthroll >=", value, "monthroll");
            return (Criteria) this;
        }

        public Criteria andMonthrollLessThan(String value) {
            addCriterion("monthroll <", value, "monthroll");
            return (Criteria) this;
        }

        public Criteria andMonthrollLessThanOrEqualTo(String value) {
            addCriterion("monthroll <=", value, "monthroll");
            return (Criteria) this;
        }

        public Criteria andMonthrollLike(String value) {
            addCriterion("monthroll like", value, "monthroll");
            return (Criteria) this;
        }

        public Criteria andMonthrollNotLike(String value) {
            addCriterion("monthroll not like", value, "monthroll");
            return (Criteria) this;
        }

        public Criteria andMonthrollIn(List<String> values) {
            addCriterion("monthroll in", values, "monthroll");
            return (Criteria) this;
        }

        public Criteria andMonthrollNotIn(List<String> values) {
            addCriterion("monthroll not in", values, "monthroll");
            return (Criteria) this;
        }

        public Criteria andMonthrollBetween(String value1, String value2) {
            addCriterion("monthroll between", value1, value2, "monthroll");
            return (Criteria) this;
        }

        public Criteria andMonthrollNotBetween(String value1, String value2) {
            addCriterion("monthroll not between", value1, value2, "monthroll");
            return (Criteria) this;
        }

        public Criteria andMonthupIsNull() {
            addCriterion("monthup is null");
            return (Criteria) this;
        }

        public Criteria andMonthupIsNotNull() {
            addCriterion("monthup is not null");
            return (Criteria) this;
        }

        public Criteria andMonthupEqualTo(String value) {
            addCriterion("monthup =", value, "monthup");
            return (Criteria) this;
        }

        public Criteria andMonthupNotEqualTo(String value) {
            addCriterion("monthup <>", value, "monthup");
            return (Criteria) this;
        }

        public Criteria andMonthupGreaterThan(String value) {
            addCriterion("monthup >", value, "monthup");
            return (Criteria) this;
        }

        public Criteria andMonthupGreaterThanOrEqualTo(String value) {
            addCriterion("monthup >=", value, "monthup");
            return (Criteria) this;
        }

        public Criteria andMonthupLessThan(String value) {
            addCriterion("monthup <", value, "monthup");
            return (Criteria) this;
        }

        public Criteria andMonthupLessThanOrEqualTo(String value) {
            addCriterion("monthup <=", value, "monthup");
            return (Criteria) this;
        }

        public Criteria andMonthupLike(String value) {
            addCriterion("monthup like", value, "monthup");
            return (Criteria) this;
        }

        public Criteria andMonthupNotLike(String value) {
            addCriterion("monthup not like", value, "monthup");
            return (Criteria) this;
        }

        public Criteria andMonthupIn(List<String> values) {
            addCriterion("monthup in", values, "monthup");
            return (Criteria) this;
        }

        public Criteria andMonthupNotIn(List<String> values) {
            addCriterion("monthup not in", values, "monthup");
            return (Criteria) this;
        }

        public Criteria andMonthupBetween(String value1, String value2) {
            addCriterion("monthup between", value1, value2, "monthup");
            return (Criteria) this;
        }

        public Criteria andMonthupNotBetween(String value1, String value2) {
            addCriterion("monthup not between", value1, value2, "monthup");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonIsNull() {
            addCriterion("growslowreason is null");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonIsNotNull() {
            addCriterion("growslowreason is not null");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonEqualTo(String value) {
            addCriterion("growslowreason =", value, "growslowreason");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonNotEqualTo(String value) {
            addCriterion("growslowreason <>", value, "growslowreason");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonGreaterThan(String value) {
            addCriterion("growslowreason >", value, "growslowreason");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonGreaterThanOrEqualTo(String value) {
            addCriterion("growslowreason >=", value, "growslowreason");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonLessThan(String value) {
            addCriterion("growslowreason <", value, "growslowreason");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonLessThanOrEqualTo(String value) {
            addCriterion("growslowreason <=", value, "growslowreason");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonLike(String value) {
            addCriterion("growslowreason like", value, "growslowreason");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonNotLike(String value) {
            addCriterion("growslowreason not like", value, "growslowreason");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonIn(List<String> values) {
            addCriterion("growslowreason in", values, "growslowreason");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonNotIn(List<String> values) {
            addCriterion("growslowreason not in", values, "growslowreason");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonBetween(String value1, String value2) {
            addCriterion("growslowreason between", value1, value2, "growslowreason");
            return (Criteria) this;
        }

        public Criteria andGrowslowreasonNotBetween(String value1, String value2) {
            addCriterion("growslowreason not between", value1, value2, "growslowreason");
            return (Criteria) this;
        }

        public Criteria andGrowreasonIsNull() {
            addCriterion("growreason is null");
            return (Criteria) this;
        }

        public Criteria andGrowreasonIsNotNull() {
            addCriterion("growreason is not null");
            return (Criteria) this;
        }

        public Criteria andGrowreasonEqualTo(String value) {
            addCriterion("growreason =", value, "growreason");
            return (Criteria) this;
        }

        public Criteria andGrowreasonNotEqualTo(String value) {
            addCriterion("growreason <>", value, "growreason");
            return (Criteria) this;
        }

        public Criteria andGrowreasonGreaterThan(String value) {
            addCriterion("growreason >", value, "growreason");
            return (Criteria) this;
        }

        public Criteria andGrowreasonGreaterThanOrEqualTo(String value) {
            addCriterion("growreason >=", value, "growreason");
            return (Criteria) this;
        }

        public Criteria andGrowreasonLessThan(String value) {
            addCriterion("growreason <", value, "growreason");
            return (Criteria) this;
        }

        public Criteria andGrowreasonLessThanOrEqualTo(String value) {
            addCriterion("growreason <=", value, "growreason");
            return (Criteria) this;
        }

        public Criteria andGrowreasonLike(String value) {
            addCriterion("growreason like", value, "growreason");
            return (Criteria) this;
        }

        public Criteria andGrowreasonNotLike(String value) {
            addCriterion("growreason not like", value, "growreason");
            return (Criteria) this;
        }

        public Criteria andGrowreasonIn(List<String> values) {
            addCriterion("growreason in", values, "growreason");
            return (Criteria) this;
        }

        public Criteria andGrowreasonNotIn(List<String> values) {
            addCriterion("growreason not in", values, "growreason");
            return (Criteria) this;
        }

        public Criteria andGrowreasonBetween(String value1, String value2) {
            addCriterion("growreason between", value1, value2, "growreason");
            return (Criteria) this;
        }

        public Criteria andGrowreasonNotBetween(String value1, String value2) {
            addCriterion("growreason not between", value1, value2, "growreason");
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

        public Criteria andIsLookIsNull() {
            addCriterion("is_look is null");
            return (Criteria) this;
        }

        public Criteria andIsLookIsNotNull() {
            addCriterion("is_look is not null");
            return (Criteria) this;
        }

        public Criteria andIsLookEqualTo(String value) {
            addCriterion("is_look =", value, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookNotEqualTo(String value) {
            addCriterion("is_look <>", value, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookGreaterThan(String value) {
            addCriterion("is_look >", value, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookGreaterThanOrEqualTo(String value) {
            addCriterion("is_look >=", value, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookLessThan(String value) {
            addCriterion("is_look <", value, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookLessThanOrEqualTo(String value) {
            addCriterion("is_look <=", value, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookLike(String value) {
            addCriterion("is_look like", value, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookNotLike(String value) {
            addCriterion("is_look not like", value, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookIn(List<String> values) {
            addCriterion("is_look in", values, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookNotIn(List<String> values) {
            addCriterion("is_look not in", values, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookBetween(String value1, String value2) {
            addCriterion("is_look between", value1, value2, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookNotBetween(String value1, String value2) {
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

        public Criteria andIsHearingEqualTo(String value) {
            addCriterion("is_hearing =", value, "isHearing");
            return (Criteria) this;
        }

        public Criteria andIsHearingNotEqualTo(String value) {
            addCriterion("is_hearing <>", value, "isHearing");
            return (Criteria) this;
        }

        public Criteria andIsHearingGreaterThan(String value) {
            addCriterion("is_hearing >", value, "isHearing");
            return (Criteria) this;
        }

        public Criteria andIsHearingGreaterThanOrEqualTo(String value) {
            addCriterion("is_hearing >=", value, "isHearing");
            return (Criteria) this;
        }

        public Criteria andIsHearingLessThan(String value) {
            addCriterion("is_hearing <", value, "isHearing");
            return (Criteria) this;
        }

        public Criteria andIsHearingLessThanOrEqualTo(String value) {
            addCriterion("is_hearing <=", value, "isHearing");
            return (Criteria) this;
        }

        public Criteria andIsHearingLike(String value) {
            addCriterion("is_hearing like", value, "isHearing");
            return (Criteria) this;
        }

        public Criteria andIsHearingNotLike(String value) {
            addCriterion("is_hearing not like", value, "isHearing");
            return (Criteria) this;
        }

        public Criteria andIsHearingIn(List<String> values) {
            addCriterion("is_hearing in", values, "isHearing");
            return (Criteria) this;
        }

        public Criteria andIsHearingNotIn(List<String> values) {
            addCriterion("is_hearing not in", values, "isHearing");
            return (Criteria) this;
        }

        public Criteria andIsHearingBetween(String value1, String value2) {
            addCriterion("is_hearing between", value1, value2, "isHearing");
            return (Criteria) this;
        }

        public Criteria andIsHearingNotBetween(String value1, String value2) {
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

        public Criteria andIsGameEqualTo(String value) {
            addCriterion("is_game =", value, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameNotEqualTo(String value) {
            addCriterion("is_game <>", value, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameGreaterThan(String value) {
            addCriterion("is_game >", value, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameGreaterThanOrEqualTo(String value) {
            addCriterion("is_game >=", value, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameLessThan(String value) {
            addCriterion("is_game <", value, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameLessThanOrEqualTo(String value) {
            addCriterion("is_game <=", value, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameLike(String value) {
            addCriterion("is_game like", value, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameNotLike(String value) {
            addCriterion("is_game not like", value, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameIn(List<String> values) {
            addCriterion("is_game in", values, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameNotIn(List<String> values) {
            addCriterion("is_game not in", values, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameBetween(String value1, String value2) {
            addCriterion("is_game between", value1, value2, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameNotBetween(String value1, String value2) {
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

        public Criteria andIsClimbingEqualTo(String value) {
            addCriterion("is_climbing =", value, "isClimbing");
            return (Criteria) this;
        }

        public Criteria andIsClimbingNotEqualTo(String value) {
            addCriterion("is_climbing <>", value, "isClimbing");
            return (Criteria) this;
        }

        public Criteria andIsClimbingGreaterThan(String value) {
            addCriterion("is_climbing >", value, "isClimbing");
            return (Criteria) this;
        }

        public Criteria andIsClimbingGreaterThanOrEqualTo(String value) {
            addCriterion("is_climbing >=", value, "isClimbing");
            return (Criteria) this;
        }

        public Criteria andIsClimbingLessThan(String value) {
            addCriterion("is_climbing <", value, "isClimbing");
            return (Criteria) this;
        }

        public Criteria andIsClimbingLessThanOrEqualTo(String value) {
            addCriterion("is_climbing <=", value, "isClimbing");
            return (Criteria) this;
        }

        public Criteria andIsClimbingLike(String value) {
            addCriterion("is_climbing like", value, "isClimbing");
            return (Criteria) this;
        }

        public Criteria andIsClimbingNotLike(String value) {
            addCriterion("is_climbing not like", value, "isClimbing");
            return (Criteria) this;
        }

        public Criteria andIsClimbingIn(List<String> values) {
            addCriterion("is_climbing in", values, "isClimbing");
            return (Criteria) this;
        }

        public Criteria andIsClimbingNotIn(List<String> values) {
            addCriterion("is_climbing not in", values, "isClimbing");
            return (Criteria) this;
        }

        public Criteria andIsClimbingBetween(String value1, String value2) {
            addCriterion("is_climbing between", value1, value2, "isClimbing");
            return (Criteria) this;
        }

        public Criteria andIsClimbingNotBetween(String value1, String value2) {
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

        public Criteria andIsFingerEqualTo(String value) {
            addCriterion("is_finger =", value, "isFinger");
            return (Criteria) this;
        }

        public Criteria andIsFingerNotEqualTo(String value) {
            addCriterion("is_finger <>", value, "isFinger");
            return (Criteria) this;
        }

        public Criteria andIsFingerGreaterThan(String value) {
            addCriterion("is_finger >", value, "isFinger");
            return (Criteria) this;
        }

        public Criteria andIsFingerGreaterThanOrEqualTo(String value) {
            addCriterion("is_finger >=", value, "isFinger");
            return (Criteria) this;
        }

        public Criteria andIsFingerLessThan(String value) {
            addCriterion("is_finger <", value, "isFinger");
            return (Criteria) this;
        }

        public Criteria andIsFingerLessThanOrEqualTo(String value) {
            addCriterion("is_finger <=", value, "isFinger");
            return (Criteria) this;
        }

        public Criteria andIsFingerLike(String value) {
            addCriterion("is_finger like", value, "isFinger");
            return (Criteria) this;
        }

        public Criteria andIsFingerNotLike(String value) {
            addCriterion("is_finger not like", value, "isFinger");
            return (Criteria) this;
        }

        public Criteria andIsFingerIn(List<String> values) {
            addCriterion("is_finger in", values, "isFinger");
            return (Criteria) this;
        }

        public Criteria andIsFingerNotIn(List<String> values) {
            addCriterion("is_finger not in", values, "isFinger");
            return (Criteria) this;
        }

        public Criteria andIsFingerBetween(String value1, String value2) {
            addCriterion("is_finger between", value1, value2, "isFinger");
            return (Criteria) this;
        }

        public Criteria andIsFingerNotBetween(String value1, String value2) {
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

        public Criteria andIsHelpEqualTo(String value) {
            addCriterion("is_help =", value, "isHelp");
            return (Criteria) this;
        }

        public Criteria andIsHelpNotEqualTo(String value) {
            addCriterion("is_help <>", value, "isHelp");
            return (Criteria) this;
        }

        public Criteria andIsHelpGreaterThan(String value) {
            addCriterion("is_help >", value, "isHelp");
            return (Criteria) this;
        }

        public Criteria andIsHelpGreaterThanOrEqualTo(String value) {
            addCriterion("is_help >=", value, "isHelp");
            return (Criteria) this;
        }

        public Criteria andIsHelpLessThan(String value) {
            addCriterion("is_help <", value, "isHelp");
            return (Criteria) this;
        }

        public Criteria andIsHelpLessThanOrEqualTo(String value) {
            addCriterion("is_help <=", value, "isHelp");
            return (Criteria) this;
        }

        public Criteria andIsHelpLike(String value) {
            addCriterion("is_help like", value, "isHelp");
            return (Criteria) this;
        }

        public Criteria andIsHelpNotLike(String value) {
            addCriterion("is_help not like", value, "isHelp");
            return (Criteria) this;
        }

        public Criteria andIsHelpIn(List<String> values) {
            addCriterion("is_help in", values, "isHelp");
            return (Criteria) this;
        }

        public Criteria andIsHelpNotIn(List<String> values) {
            addCriterion("is_help not in", values, "isHelp");
            return (Criteria) this;
        }

        public Criteria andIsHelpBetween(String value1, String value2) {
            addCriterion("is_help between", value1, value2, "isHelp");
            return (Criteria) this;
        }

        public Criteria andIsHelpNotBetween(String value1, String value2) {
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

        public Criteria andIsInterestEqualTo(String value) {
            addCriterion("is_interest =", value, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestNotEqualTo(String value) {
            addCriterion("is_interest <>", value, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestGreaterThan(String value) {
            addCriterion("is_interest >", value, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestGreaterThanOrEqualTo(String value) {
            addCriterion("is_interest >=", value, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestLessThan(String value) {
            addCriterion("is_interest <", value, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestLessThanOrEqualTo(String value) {
            addCriterion("is_interest <=", value, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestLike(String value) {
            addCriterion("is_interest like", value, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestNotLike(String value) {
            addCriterion("is_interest not like", value, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestIn(List<String> values) {
            addCriterion("is_interest in", values, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestNotIn(List<String> values) {
            addCriterion("is_interest not in", values, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestBetween(String value1, String value2) {
            addCriterion("is_interest between", value1, value2, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestNotBetween(String value1, String value2) {
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

        public Criteria andIsChildrenEqualTo(String value) {
            addCriterion("is_children =", value, "isChildren");
            return (Criteria) this;
        }

        public Criteria andIsChildrenNotEqualTo(String value) {
            addCriterion("is_children <>", value, "isChildren");
            return (Criteria) this;
        }

        public Criteria andIsChildrenGreaterThan(String value) {
            addCriterion("is_children >", value, "isChildren");
            return (Criteria) this;
        }

        public Criteria andIsChildrenGreaterThanOrEqualTo(String value) {
            addCriterion("is_children >=", value, "isChildren");
            return (Criteria) this;
        }

        public Criteria andIsChildrenLessThan(String value) {
            addCriterion("is_children <", value, "isChildren");
            return (Criteria) this;
        }

        public Criteria andIsChildrenLessThanOrEqualTo(String value) {
            addCriterion("is_children <=", value, "isChildren");
            return (Criteria) this;
        }

        public Criteria andIsChildrenLike(String value) {
            addCriterion("is_children like", value, "isChildren");
            return (Criteria) this;
        }

        public Criteria andIsChildrenNotLike(String value) {
            addCriterion("is_children not like", value, "isChildren");
            return (Criteria) this;
        }

        public Criteria andIsChildrenIn(List<String> values) {
            addCriterion("is_children in", values, "isChildren");
            return (Criteria) this;
        }

        public Criteria andIsChildrenNotIn(List<String> values) {
            addCriterion("is_children not in", values, "isChildren");
            return (Criteria) this;
        }

        public Criteria andIsChildrenBetween(String value1, String value2) {
            addCriterion("is_children between", value1, value2, "isChildren");
            return (Criteria) this;
        }

        public Criteria andIsChildrenNotBetween(String value1, String value2) {
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

        public Criteria andIsParentsLookEqualTo(String value) {
            addCriterion("is_parents_look =", value, "isParentsLook");
            return (Criteria) this;
        }

        public Criteria andIsParentsLookNotEqualTo(String value) {
            addCriterion("is_parents_look <>", value, "isParentsLook");
            return (Criteria) this;
        }

        public Criteria andIsParentsLookGreaterThan(String value) {
            addCriterion("is_parents_look >", value, "isParentsLook");
            return (Criteria) this;
        }

        public Criteria andIsParentsLookGreaterThanOrEqualTo(String value) {
            addCriterion("is_parents_look >=", value, "isParentsLook");
            return (Criteria) this;
        }

        public Criteria andIsParentsLookLessThan(String value) {
            addCriterion("is_parents_look <", value, "isParentsLook");
            return (Criteria) this;
        }

        public Criteria andIsParentsLookLessThanOrEqualTo(String value) {
            addCriterion("is_parents_look <=", value, "isParentsLook");
            return (Criteria) this;
        }

        public Criteria andIsParentsLookLike(String value) {
            addCriterion("is_parents_look like", value, "isParentsLook");
            return (Criteria) this;
        }

        public Criteria andIsParentsLookNotLike(String value) {
            addCriterion("is_parents_look not like", value, "isParentsLook");
            return (Criteria) this;
        }

        public Criteria andIsParentsLookIn(List<String> values) {
            addCriterion("is_parents_look in", values, "isParentsLook");
            return (Criteria) this;
        }

        public Criteria andIsParentsLookNotIn(List<String> values) {
            addCriterion("is_parents_look not in", values, "isParentsLook");
            return (Criteria) this;
        }

        public Criteria andIsParentsLookBetween(String value1, String value2) {
            addCriterion("is_parents_look between", value1, value2, "isParentsLook");
            return (Criteria) this;
        }

        public Criteria andIsParentsLookNotBetween(String value1, String value2) {
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

        public Criteria andIsResponseEqualTo(String value) {
            addCriterion("is_response =", value, "isResponse");
            return (Criteria) this;
        }

        public Criteria andIsResponseNotEqualTo(String value) {
            addCriterion("is_response <>", value, "isResponse");
            return (Criteria) this;
        }

        public Criteria andIsResponseGreaterThan(String value) {
            addCriterion("is_response >", value, "isResponse");
            return (Criteria) this;
        }

        public Criteria andIsResponseGreaterThanOrEqualTo(String value) {
            addCriterion("is_response >=", value, "isResponse");
            return (Criteria) this;
        }

        public Criteria andIsResponseLessThan(String value) {
            addCriterion("is_response <", value, "isResponse");
            return (Criteria) this;
        }

        public Criteria andIsResponseLessThanOrEqualTo(String value) {
            addCriterion("is_response <=", value, "isResponse");
            return (Criteria) this;
        }

        public Criteria andIsResponseLike(String value) {
            addCriterion("is_response like", value, "isResponse");
            return (Criteria) this;
        }

        public Criteria andIsResponseNotLike(String value) {
            addCriterion("is_response not like", value, "isResponse");
            return (Criteria) this;
        }

        public Criteria andIsResponseIn(List<String> values) {
            addCriterion("is_response in", values, "isResponse");
            return (Criteria) this;
        }

        public Criteria andIsResponseNotIn(List<String> values) {
            addCriterion("is_response not in", values, "isResponse");
            return (Criteria) this;
        }

        public Criteria andIsResponseBetween(String value1, String value2) {
            addCriterion("is_response between", value1, value2, "isResponse");
            return (Criteria) this;
        }

        public Criteria andIsResponseNotBetween(String value1, String value2) {
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

        public Criteria andIsSmileResponseEqualTo(String value) {
            addCriterion("is_smile_response =", value, "isSmileResponse");
            return (Criteria) this;
        }

        public Criteria andIsSmileResponseNotEqualTo(String value) {
            addCriterion("is_smile_response <>", value, "isSmileResponse");
            return (Criteria) this;
        }

        public Criteria andIsSmileResponseGreaterThan(String value) {
            addCriterion("is_smile_response >", value, "isSmileResponse");
            return (Criteria) this;
        }

        public Criteria andIsSmileResponseGreaterThanOrEqualTo(String value) {
            addCriterion("is_smile_response >=", value, "isSmileResponse");
            return (Criteria) this;
        }

        public Criteria andIsSmileResponseLessThan(String value) {
            addCriterion("is_smile_response <", value, "isSmileResponse");
            return (Criteria) this;
        }

        public Criteria andIsSmileResponseLessThanOrEqualTo(String value) {
            addCriterion("is_smile_response <=", value, "isSmileResponse");
            return (Criteria) this;
        }

        public Criteria andIsSmileResponseLike(String value) {
            addCriterion("is_smile_response like", value, "isSmileResponse");
            return (Criteria) this;
        }

        public Criteria andIsSmileResponseNotLike(String value) {
            addCriterion("is_smile_response not like", value, "isSmileResponse");
            return (Criteria) this;
        }

        public Criteria andIsSmileResponseIn(List<String> values) {
            addCriterion("is_smile_response in", values, "isSmileResponse");
            return (Criteria) this;
        }

        public Criteria andIsSmileResponseNotIn(List<String> values) {
            addCriterion("is_smile_response not in", values, "isSmileResponse");
            return (Criteria) this;
        }

        public Criteria andIsSmileResponseBetween(String value1, String value2) {
            addCriterion("is_smile_response between", value1, value2, "isSmileResponse");
            return (Criteria) this;
        }

        public Criteria andIsSmileResponseNotBetween(String value1, String value2) {
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

        public Criteria andIsNoiseEqualTo(String value) {
            addCriterion("is_noise =", value, "isNoise");
            return (Criteria) this;
        }

        public Criteria andIsNoiseNotEqualTo(String value) {
            addCriterion("is_noise <>", value, "isNoise");
            return (Criteria) this;
        }

        public Criteria andIsNoiseGreaterThan(String value) {
            addCriterion("is_noise >", value, "isNoise");
            return (Criteria) this;
        }

        public Criteria andIsNoiseGreaterThanOrEqualTo(String value) {
            addCriterion("is_noise >=", value, "isNoise");
            return (Criteria) this;
        }

        public Criteria andIsNoiseLessThan(String value) {
            addCriterion("is_noise <", value, "isNoise");
            return (Criteria) this;
        }

        public Criteria andIsNoiseLessThanOrEqualTo(String value) {
            addCriterion("is_noise <=", value, "isNoise");
            return (Criteria) this;
        }

        public Criteria andIsNoiseLike(String value) {
            addCriterion("is_noise like", value, "isNoise");
            return (Criteria) this;
        }

        public Criteria andIsNoiseNotLike(String value) {
            addCriterion("is_noise not like", value, "isNoise");
            return (Criteria) this;
        }

        public Criteria andIsNoiseIn(List<String> values) {
            addCriterion("is_noise in", values, "isNoise");
            return (Criteria) this;
        }

        public Criteria andIsNoiseNotIn(List<String> values) {
            addCriterion("is_noise not in", values, "isNoise");
            return (Criteria) this;
        }

        public Criteria andIsNoiseBetween(String value1, String value2) {
            addCriterion("is_noise between", value1, value2, "isNoise");
            return (Criteria) this;
        }

        public Criteria andIsNoiseNotBetween(String value1, String value2) {
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

        public Criteria andIsGoEqualTo(String value) {
            addCriterion("is_go =", value, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoNotEqualTo(String value) {
            addCriterion("is_go <>", value, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoGreaterThan(String value) {
            addCriterion("is_go >", value, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoGreaterThanOrEqualTo(String value) {
            addCriterion("is_go >=", value, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoLessThan(String value) {
            addCriterion("is_go <", value, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoLessThanOrEqualTo(String value) {
            addCriterion("is_go <=", value, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoLike(String value) {
            addCriterion("is_go like", value, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoNotLike(String value) {
            addCriterion("is_go not like", value, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoIn(List<String> values) {
            addCriterion("is_go in", values, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoNotIn(List<String> values) {
            addCriterion("is_go not in", values, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoBetween(String value1, String value2) {
            addCriterion("is_go between", value1, value2, "isGo");
            return (Criteria) this;
        }

        public Criteria andIsGoNotBetween(String value1, String value2) {
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

        public Criteria andIsEyeEqualTo(String value) {
            addCriterion("is_eye =", value, "isEye");
            return (Criteria) this;
        }

        public Criteria andIsEyeNotEqualTo(String value) {
            addCriterion("is_eye <>", value, "isEye");
            return (Criteria) this;
        }

        public Criteria andIsEyeGreaterThan(String value) {
            addCriterion("is_eye >", value, "isEye");
            return (Criteria) this;
        }

        public Criteria andIsEyeGreaterThanOrEqualTo(String value) {
            addCriterion("is_eye >=", value, "isEye");
            return (Criteria) this;
        }

        public Criteria andIsEyeLessThan(String value) {
            addCriterion("is_eye <", value, "isEye");
            return (Criteria) this;
        }

        public Criteria andIsEyeLessThanOrEqualTo(String value) {
            addCriterion("is_eye <=", value, "isEye");
            return (Criteria) this;
        }

        public Criteria andIsEyeLike(String value) {
            addCriterion("is_eye like", value, "isEye");
            return (Criteria) this;
        }

        public Criteria andIsEyeNotLike(String value) {
            addCriterion("is_eye not like", value, "isEye");
            return (Criteria) this;
        }

        public Criteria andIsEyeIn(List<String> values) {
            addCriterion("is_eye in", values, "isEye");
            return (Criteria) this;
        }

        public Criteria andIsEyeNotIn(List<String> values) {
            addCriterion("is_eye not in", values, "isEye");
            return (Criteria) this;
        }

        public Criteria andIsEyeBetween(String value1, String value2) {
            addCriterion("is_eye between", value1, value2, "isEye");
            return (Criteria) this;
        }

        public Criteria andIsEyeNotBetween(String value1, String value2) {
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

        public Criteria andIsImitateEqualTo(String value) {
            addCriterion("is_imitate =", value, "isImitate");
            return (Criteria) this;
        }

        public Criteria andIsImitateNotEqualTo(String value) {
            addCriterion("is_imitate <>", value, "isImitate");
            return (Criteria) this;
        }

        public Criteria andIsImitateGreaterThan(String value) {
            addCriterion("is_imitate >", value, "isImitate");
            return (Criteria) this;
        }

        public Criteria andIsImitateGreaterThanOrEqualTo(String value) {
            addCriterion("is_imitate >=", value, "isImitate");
            return (Criteria) this;
        }

        public Criteria andIsImitateLessThan(String value) {
            addCriterion("is_imitate <", value, "isImitate");
            return (Criteria) this;
        }

        public Criteria andIsImitateLessThanOrEqualTo(String value) {
            addCriterion("is_imitate <=", value, "isImitate");
            return (Criteria) this;
        }

        public Criteria andIsImitateLike(String value) {
            addCriterion("is_imitate like", value, "isImitate");
            return (Criteria) this;
        }

        public Criteria andIsImitateNotLike(String value) {
            addCriterion("is_imitate not like", value, "isImitate");
            return (Criteria) this;
        }

        public Criteria andIsImitateIn(List<String> values) {
            addCriterion("is_imitate in", values, "isImitate");
            return (Criteria) this;
        }

        public Criteria andIsImitateNotIn(List<String> values) {
            addCriterion("is_imitate not in", values, "isImitate");
            return (Criteria) this;
        }

        public Criteria andIsImitateBetween(String value1, String value2) {
            addCriterion("is_imitate between", value1, value2, "isImitate");
            return (Criteria) this;
        }

        public Criteria andIsImitateNotBetween(String value1, String value2) {
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

        public Criteria andIsSearchEqualTo(String value) {
            addCriterion("is_search =", value, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchNotEqualTo(String value) {
            addCriterion("is_search <>", value, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchGreaterThan(String value) {
            addCriterion("is_search >", value, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchGreaterThanOrEqualTo(String value) {
            addCriterion("is_search >=", value, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchLessThan(String value) {
            addCriterion("is_search <", value, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchLessThanOrEqualTo(String value) {
            addCriterion("is_search <=", value, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchLike(String value) {
            addCriterion("is_search like", value, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchNotLike(String value) {
            addCriterion("is_search not like", value, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchIn(List<String> values) {
            addCriterion("is_search in", values, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchNotIn(List<String> values) {
            addCriterion("is_search not in", values, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchBetween(String value1, String value2) {
            addCriterion("is_search between", value1, value2, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchNotBetween(String value1, String value2) {
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

        public Criteria andIsAttractEqualTo(String value) {
            addCriterion("is_attract =", value, "isAttract");
            return (Criteria) this;
        }

        public Criteria andIsAttractNotEqualTo(String value) {
            addCriterion("is_attract <>", value, "isAttract");
            return (Criteria) this;
        }

        public Criteria andIsAttractGreaterThan(String value) {
            addCriterion("is_attract >", value, "isAttract");
            return (Criteria) this;
        }

        public Criteria andIsAttractGreaterThanOrEqualTo(String value) {
            addCriterion("is_attract >=", value, "isAttract");
            return (Criteria) this;
        }

        public Criteria andIsAttractLessThan(String value) {
            addCriterion("is_attract <", value, "isAttract");
            return (Criteria) this;
        }

        public Criteria andIsAttractLessThanOrEqualTo(String value) {
            addCriterion("is_attract <=", value, "isAttract");
            return (Criteria) this;
        }

        public Criteria andIsAttractLike(String value) {
            addCriterion("is_attract like", value, "isAttract");
            return (Criteria) this;
        }

        public Criteria andIsAttractNotLike(String value) {
            addCriterion("is_attract not like", value, "isAttract");
            return (Criteria) this;
        }

        public Criteria andIsAttractIn(List<String> values) {
            addCriterion("is_attract in", values, "isAttract");
            return (Criteria) this;
        }

        public Criteria andIsAttractNotIn(List<String> values) {
            addCriterion("is_attract not in", values, "isAttract");
            return (Criteria) this;
        }

        public Criteria andIsAttractBetween(String value1, String value2) {
            addCriterion("is_attract between", value1, value2, "isAttract");
            return (Criteria) this;
        }

        public Criteria andIsAttractNotBetween(String value1, String value2) {
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

        public Criteria andIsUnderstandEqualTo(String value) {
            addCriterion("is_understand =", value, "isUnderstand");
            return (Criteria) this;
        }

        public Criteria andIsUnderstandNotEqualTo(String value) {
            addCriterion("is_understand <>", value, "isUnderstand");
            return (Criteria) this;
        }

        public Criteria andIsUnderstandGreaterThan(String value) {
            addCriterion("is_understand >", value, "isUnderstand");
            return (Criteria) this;
        }

        public Criteria andIsUnderstandGreaterThanOrEqualTo(String value) {
            addCriterion("is_understand >=", value, "isUnderstand");
            return (Criteria) this;
        }

        public Criteria andIsUnderstandLessThan(String value) {
            addCriterion("is_understand <", value, "isUnderstand");
            return (Criteria) this;
        }

        public Criteria andIsUnderstandLessThanOrEqualTo(String value) {
            addCriterion("is_understand <=", value, "isUnderstand");
            return (Criteria) this;
        }

        public Criteria andIsUnderstandLike(String value) {
            addCriterion("is_understand like", value, "isUnderstand");
            return (Criteria) this;
        }

        public Criteria andIsUnderstandNotLike(String value) {
            addCriterion("is_understand not like", value, "isUnderstand");
            return (Criteria) this;
        }

        public Criteria andIsUnderstandIn(List<String> values) {
            addCriterion("is_understand in", values, "isUnderstand");
            return (Criteria) this;
        }

        public Criteria andIsUnderstandNotIn(List<String> values) {
            addCriterion("is_understand not in", values, "isUnderstand");
            return (Criteria) this;
        }

        public Criteria andIsUnderstandBetween(String value1, String value2) {
            addCriterion("is_understand between", value1, value2, "isUnderstand");
            return (Criteria) this;
        }

        public Criteria andIsUnderstandNotBetween(String value1, String value2) {
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

        public Criteria andIsReactionEqualTo(String value) {
            addCriterion("is_reaction =", value, "isReaction");
            return (Criteria) this;
        }

        public Criteria andIsReactionNotEqualTo(String value) {
            addCriterion("is_reaction <>", value, "isReaction");
            return (Criteria) this;
        }

        public Criteria andIsReactionGreaterThan(String value) {
            addCriterion("is_reaction >", value, "isReaction");
            return (Criteria) this;
        }

        public Criteria andIsReactionGreaterThanOrEqualTo(String value) {
            addCriterion("is_reaction >=", value, "isReaction");
            return (Criteria) this;
        }

        public Criteria andIsReactionLessThan(String value) {
            addCriterion("is_reaction <", value, "isReaction");
            return (Criteria) this;
        }

        public Criteria andIsReactionLessThanOrEqualTo(String value) {
            addCriterion("is_reaction <=", value, "isReaction");
            return (Criteria) this;
        }

        public Criteria andIsReactionLike(String value) {
            addCriterion("is_reaction like", value, "isReaction");
            return (Criteria) this;
        }

        public Criteria andIsReactionNotLike(String value) {
            addCriterion("is_reaction not like", value, "isReaction");
            return (Criteria) this;
        }

        public Criteria andIsReactionIn(List<String> values) {
            addCriterion("is_reaction in", values, "isReaction");
            return (Criteria) this;
        }

        public Criteria andIsReactionNotIn(List<String> values) {
            addCriterion("is_reaction not in", values, "isReaction");
            return (Criteria) this;
        }

        public Criteria andIsReactionBetween(String value1, String value2) {
            addCriterion("is_reaction between", value1, value2, "isReaction");
            return (Criteria) this;
        }

        public Criteria andIsReactionNotBetween(String value1, String value2) {
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

        public Criteria andIsMovementEqualTo(String value) {
            addCriterion("is_movement =", value, "isMovement");
            return (Criteria) this;
        }

        public Criteria andIsMovementNotEqualTo(String value) {
            addCriterion("is_movement <>", value, "isMovement");
            return (Criteria) this;
        }

        public Criteria andIsMovementGreaterThan(String value) {
            addCriterion("is_movement >", value, "isMovement");
            return (Criteria) this;
        }

        public Criteria andIsMovementGreaterThanOrEqualTo(String value) {
            addCriterion("is_movement >=", value, "isMovement");
            return (Criteria) this;
        }

        public Criteria andIsMovementLessThan(String value) {
            addCriterion("is_movement <", value, "isMovement");
            return (Criteria) this;
        }

        public Criteria andIsMovementLessThanOrEqualTo(String value) {
            addCriterion("is_movement <=", value, "isMovement");
            return (Criteria) this;
        }

        public Criteria andIsMovementLike(String value) {
            addCriterion("is_movement like", value, "isMovement");
            return (Criteria) this;
        }

        public Criteria andIsMovementNotLike(String value) {
            addCriterion("is_movement not like", value, "isMovement");
            return (Criteria) this;
        }

        public Criteria andIsMovementIn(List<String> values) {
            addCriterion("is_movement in", values, "isMovement");
            return (Criteria) this;
        }

        public Criteria andIsMovementNotIn(List<String> values) {
            addCriterion("is_movement not in", values, "isMovement");
            return (Criteria) this;
        }

        public Criteria andIsMovementBetween(String value1, String value2) {
            addCriterion("is_movement between", value1, value2, "isMovement");
            return (Criteria) this;
        }

        public Criteria andIsMovementNotBetween(String value1, String value2) {
            addCriterion("is_movement not between", value1, value2, "isMovement");
            return (Criteria) this;
        }

        public Criteria andQuestion1IsNull() {
            addCriterion("question1 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion1IsNotNull() {
            addCriterion("question1 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion1EqualTo(String value) {
            addCriterion("question1 =", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1NotEqualTo(String value) {
            addCriterion("question1 <>", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1GreaterThan(String value) {
            addCriterion("question1 >", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1GreaterThanOrEqualTo(String value) {
            addCriterion("question1 >=", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1LessThan(String value) {
            addCriterion("question1 <", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1LessThanOrEqualTo(String value) {
            addCriterion("question1 <=", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1Like(String value) {
            addCriterion("question1 like", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1NotLike(String value) {
            addCriterion("question1 not like", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1In(List<String> values) {
            addCriterion("question1 in", values, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1NotIn(List<String> values) {
            addCriterion("question1 not in", values, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1Between(String value1, String value2) {
            addCriterion("question1 between", value1, value2, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1NotBetween(String value1, String value2) {
            addCriterion("question1 not between", value1, value2, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion2IsNull() {
            addCriterion("question2 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion2IsNotNull() {
            addCriterion("question2 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion2EqualTo(String value) {
            addCriterion("question2 =", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2NotEqualTo(String value) {
            addCriterion("question2 <>", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2GreaterThan(String value) {
            addCriterion("question2 >", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2GreaterThanOrEqualTo(String value) {
            addCriterion("question2 >=", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2LessThan(String value) {
            addCriterion("question2 <", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2LessThanOrEqualTo(String value) {
            addCriterion("question2 <=", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2Like(String value) {
            addCriterion("question2 like", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2NotLike(String value) {
            addCriterion("question2 not like", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2In(List<String> values) {
            addCriterion("question2 in", values, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2NotIn(List<String> values) {
            addCriterion("question2 not in", values, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2Between(String value1, String value2) {
            addCriterion("question2 between", value1, value2, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2NotBetween(String value1, String value2) {
            addCriterion("question2 not between", value1, value2, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion3IsNull() {
            addCriterion("question3 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion3IsNotNull() {
            addCriterion("question3 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion3EqualTo(String value) {
            addCriterion("question3 =", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3NotEqualTo(String value) {
            addCriterion("question3 <>", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3GreaterThan(String value) {
            addCriterion("question3 >", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3GreaterThanOrEqualTo(String value) {
            addCriterion("question3 >=", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3LessThan(String value) {
            addCriterion("question3 <", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3LessThanOrEqualTo(String value) {
            addCriterion("question3 <=", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3Like(String value) {
            addCriterion("question3 like", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3NotLike(String value) {
            addCriterion("question3 not like", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3In(List<String> values) {
            addCriterion("question3 in", values, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3NotIn(List<String> values) {
            addCriterion("question3 not in", values, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3Between(String value1, String value2) {
            addCriterion("question3 between", value1, value2, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3NotBetween(String value1, String value2) {
            addCriterion("question3 not between", value1, value2, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion4IsNull() {
            addCriterion("question4 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion4IsNotNull() {
            addCriterion("question4 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion4EqualTo(String value) {
            addCriterion("question4 =", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4NotEqualTo(String value) {
            addCriterion("question4 <>", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4GreaterThan(String value) {
            addCriterion("question4 >", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4GreaterThanOrEqualTo(String value) {
            addCriterion("question4 >=", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4LessThan(String value) {
            addCriterion("question4 <", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4LessThanOrEqualTo(String value) {
            addCriterion("question4 <=", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4Like(String value) {
            addCriterion("question4 like", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4NotLike(String value) {
            addCriterion("question4 not like", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4In(List<String> values) {
            addCriterion("question4 in", values, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4NotIn(List<String> values) {
            addCriterion("question4 not in", values, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4Between(String value1, String value2) {
            addCriterion("question4 between", value1, value2, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4NotBetween(String value1, String value2) {
            addCriterion("question4 not between", value1, value2, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion5IsNull() {
            addCriterion("question5 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion5IsNotNull() {
            addCriterion("question5 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion5EqualTo(String value) {
            addCriterion("question5 =", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5NotEqualTo(String value) {
            addCriterion("question5 <>", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5GreaterThan(String value) {
            addCriterion("question5 >", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5GreaterThanOrEqualTo(String value) {
            addCriterion("question5 >=", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5LessThan(String value) {
            addCriterion("question5 <", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5LessThanOrEqualTo(String value) {
            addCriterion("question5 <=", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5Like(String value) {
            addCriterion("question5 like", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5NotLike(String value) {
            addCriterion("question5 not like", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5In(List<String> values) {
            addCriterion("question5 in", values, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5NotIn(List<String> values) {
            addCriterion("question5 not in", values, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5Between(String value1, String value2) {
            addCriterion("question5 between", value1, value2, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5NotBetween(String value1, String value2) {
            addCriterion("question5 not between", value1, value2, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion6IsNull() {
            addCriterion("question6 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion6IsNotNull() {
            addCriterion("question6 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion6EqualTo(String value) {
            addCriterion("question6 =", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6NotEqualTo(String value) {
            addCriterion("question6 <>", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6GreaterThan(String value) {
            addCriterion("question6 >", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6GreaterThanOrEqualTo(String value) {
            addCriterion("question6 >=", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6LessThan(String value) {
            addCriterion("question6 <", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6LessThanOrEqualTo(String value) {
            addCriterion("question6 <=", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6Like(String value) {
            addCriterion("question6 like", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6NotLike(String value) {
            addCriterion("question6 not like", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6In(List<String> values) {
            addCriterion("question6 in", values, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6NotIn(List<String> values) {
            addCriterion("question6 not in", values, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6Between(String value1, String value2) {
            addCriterion("question6 between", value1, value2, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6NotBetween(String value1, String value2) {
            addCriterion("question6 not between", value1, value2, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion7IsNull() {
            addCriterion("question7 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion7IsNotNull() {
            addCriterion("question7 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion7EqualTo(String value) {
            addCriterion("question7 =", value, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7NotEqualTo(String value) {
            addCriterion("question7 <>", value, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7GreaterThan(String value) {
            addCriterion("question7 >", value, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7GreaterThanOrEqualTo(String value) {
            addCriterion("question7 >=", value, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7LessThan(String value) {
            addCriterion("question7 <", value, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7LessThanOrEqualTo(String value) {
            addCriterion("question7 <=", value, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7Like(String value) {
            addCriterion("question7 like", value, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7NotLike(String value) {
            addCriterion("question7 not like", value, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7In(List<String> values) {
            addCriterion("question7 in", values, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7NotIn(List<String> values) {
            addCriterion("question7 not in", values, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7Between(String value1, String value2) {
            addCriterion("question7 between", value1, value2, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7NotBetween(String value1, String value2) {
            addCriterion("question7 not between", value1, value2, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion8IsNull() {
            addCriterion("question8 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion8IsNotNull() {
            addCriterion("question8 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion8EqualTo(String value) {
            addCriterion("question8 =", value, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8NotEqualTo(String value) {
            addCriterion("question8 <>", value, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8GreaterThan(String value) {
            addCriterion("question8 >", value, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8GreaterThanOrEqualTo(String value) {
            addCriterion("question8 >=", value, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8LessThan(String value) {
            addCriterion("question8 <", value, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8LessThanOrEqualTo(String value) {
            addCriterion("question8 <=", value, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8Like(String value) {
            addCriterion("question8 like", value, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8NotLike(String value) {
            addCriterion("question8 not like", value, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8In(List<String> values) {
            addCriterion("question8 in", values, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8NotIn(List<String> values) {
            addCriterion("question8 not in", values, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8Between(String value1, String value2) {
            addCriterion("question8 between", value1, value2, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8NotBetween(String value1, String value2) {
            addCriterion("question8 not between", value1, value2, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion9IsNull() {
            addCriterion("question9 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion9IsNotNull() {
            addCriterion("question9 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion9EqualTo(String value) {
            addCriterion("question9 =", value, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9NotEqualTo(String value) {
            addCriterion("question9 <>", value, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9GreaterThan(String value) {
            addCriterion("question9 >", value, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9GreaterThanOrEqualTo(String value) {
            addCriterion("question9 >=", value, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9LessThan(String value) {
            addCriterion("question9 <", value, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9LessThanOrEqualTo(String value) {
            addCriterion("question9 <=", value, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9Like(String value) {
            addCriterion("question9 like", value, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9NotLike(String value) {
            addCriterion("question9 not like", value, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9In(List<String> values) {
            addCriterion("question9 in", values, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9NotIn(List<String> values) {
            addCriterion("question9 not in", values, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9Between(String value1, String value2) {
            addCriterion("question9 between", value1, value2, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9NotBetween(String value1, String value2) {
            addCriterion("question9 not between", value1, value2, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion10IsNull() {
            addCriterion("question10 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion10IsNotNull() {
            addCriterion("question10 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion10EqualTo(String value) {
            addCriterion("question10 =", value, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10NotEqualTo(String value) {
            addCriterion("question10 <>", value, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10GreaterThan(String value) {
            addCriterion("question10 >", value, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10GreaterThanOrEqualTo(String value) {
            addCriterion("question10 >=", value, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10LessThan(String value) {
            addCriterion("question10 <", value, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10LessThanOrEqualTo(String value) {
            addCriterion("question10 <=", value, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10Like(String value) {
            addCriterion("question10 like", value, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10NotLike(String value) {
            addCriterion("question10 not like", value, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10In(List<String> values) {
            addCriterion("question10 in", values, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10NotIn(List<String> values) {
            addCriterion("question10 not in", values, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10Between(String value1, String value2) {
            addCriterion("question10 between", value1, value2, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10NotBetween(String value1, String value2) {
            addCriterion("question10 not between", value1, value2, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion11IsNull() {
            addCriterion("question11 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion11IsNotNull() {
            addCriterion("question11 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion11EqualTo(String value) {
            addCriterion("question11 =", value, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11NotEqualTo(String value) {
            addCriterion("question11 <>", value, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11GreaterThan(String value) {
            addCriterion("question11 >", value, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11GreaterThanOrEqualTo(String value) {
            addCriterion("question11 >=", value, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11LessThan(String value) {
            addCriterion("question11 <", value, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11LessThanOrEqualTo(String value) {
            addCriterion("question11 <=", value, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11Like(String value) {
            addCriterion("question11 like", value, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11NotLike(String value) {
            addCriterion("question11 not like", value, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11In(List<String> values) {
            addCriterion("question11 in", values, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11NotIn(List<String> values) {
            addCriterion("question11 not in", values, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11Between(String value1, String value2) {
            addCriterion("question11 between", value1, value2, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11NotBetween(String value1, String value2) {
            addCriterion("question11 not between", value1, value2, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion12IsNull() {
            addCriterion("question12 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion12IsNotNull() {
            addCriterion("question12 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion12EqualTo(String value) {
            addCriterion("question12 =", value, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12NotEqualTo(String value) {
            addCriterion("question12 <>", value, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12GreaterThan(String value) {
            addCriterion("question12 >", value, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12GreaterThanOrEqualTo(String value) {
            addCriterion("question12 >=", value, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12LessThan(String value) {
            addCriterion("question12 <", value, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12LessThanOrEqualTo(String value) {
            addCriterion("question12 <=", value, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12Like(String value) {
            addCriterion("question12 like", value, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12NotLike(String value) {
            addCriterion("question12 not like", value, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12In(List<String> values) {
            addCriterion("question12 in", values, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12NotIn(List<String> values) {
            addCriterion("question12 not in", values, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12Between(String value1, String value2) {
            addCriterion("question12 between", value1, value2, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12NotBetween(String value1, String value2) {
            addCriterion("question12 not between", value1, value2, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion13IsNull() {
            addCriterion("question13 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion13IsNotNull() {
            addCriterion("question13 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion13EqualTo(String value) {
            addCriterion("question13 =", value, "question13");
            return (Criteria) this;
        }

        public Criteria andQuestion13NotEqualTo(String value) {
            addCriterion("question13 <>", value, "question13");
            return (Criteria) this;
        }

        public Criteria andQuestion13GreaterThan(String value) {
            addCriterion("question13 >", value, "question13");
            return (Criteria) this;
        }

        public Criteria andQuestion13GreaterThanOrEqualTo(String value) {
            addCriterion("question13 >=", value, "question13");
            return (Criteria) this;
        }

        public Criteria andQuestion13LessThan(String value) {
            addCriterion("question13 <", value, "question13");
            return (Criteria) this;
        }

        public Criteria andQuestion13LessThanOrEqualTo(String value) {
            addCriterion("question13 <=", value, "question13");
            return (Criteria) this;
        }

        public Criteria andQuestion13Like(String value) {
            addCriterion("question13 like", value, "question13");
            return (Criteria) this;
        }

        public Criteria andQuestion13NotLike(String value) {
            addCriterion("question13 not like", value, "question13");
            return (Criteria) this;
        }

        public Criteria andQuestion13In(List<String> values) {
            addCriterion("question13 in", values, "question13");
            return (Criteria) this;
        }

        public Criteria andQuestion13NotIn(List<String> values) {
            addCriterion("question13 not in", values, "question13");
            return (Criteria) this;
        }

        public Criteria andQuestion13Between(String value1, String value2) {
            addCriterion("question13 between", value1, value2, "question13");
            return (Criteria) this;
        }

        public Criteria andQuestion13NotBetween(String value1, String value2) {
            addCriterion("question13 not between", value1, value2, "question13");
            return (Criteria) this;
        }

        public Criteria andQuestion14IsNull() {
            addCriterion("question14 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion14IsNotNull() {
            addCriterion("question14 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion14EqualTo(String value) {
            addCriterion("question14 =", value, "question14");
            return (Criteria) this;
        }

        public Criteria andQuestion14NotEqualTo(String value) {
            addCriterion("question14 <>", value, "question14");
            return (Criteria) this;
        }

        public Criteria andQuestion14GreaterThan(String value) {
            addCriterion("question14 >", value, "question14");
            return (Criteria) this;
        }

        public Criteria andQuestion14GreaterThanOrEqualTo(String value) {
            addCriterion("question14 >=", value, "question14");
            return (Criteria) this;
        }

        public Criteria andQuestion14LessThan(String value) {
            addCriterion("question14 <", value, "question14");
            return (Criteria) this;
        }

        public Criteria andQuestion14LessThanOrEqualTo(String value) {
            addCriterion("question14 <=", value, "question14");
            return (Criteria) this;
        }

        public Criteria andQuestion14Like(String value) {
            addCriterion("question14 like", value, "question14");
            return (Criteria) this;
        }

        public Criteria andQuestion14NotLike(String value) {
            addCriterion("question14 not like", value, "question14");
            return (Criteria) this;
        }

        public Criteria andQuestion14In(List<String> values) {
            addCriterion("question14 in", values, "question14");
            return (Criteria) this;
        }

        public Criteria andQuestion14NotIn(List<String> values) {
            addCriterion("question14 not in", values, "question14");
            return (Criteria) this;
        }

        public Criteria andQuestion14Between(String value1, String value2) {
            addCriterion("question14 between", value1, value2, "question14");
            return (Criteria) this;
        }

        public Criteria andQuestion14NotBetween(String value1, String value2) {
            addCriterion("question14 not between", value1, value2, "question14");
            return (Criteria) this;
        }

        public Criteria andQuestion15IsNull() {
            addCriterion("question15 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion15IsNotNull() {
            addCriterion("question15 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion15EqualTo(String value) {
            addCriterion("question15 =", value, "question15");
            return (Criteria) this;
        }

        public Criteria andQuestion15NotEqualTo(String value) {
            addCriterion("question15 <>", value, "question15");
            return (Criteria) this;
        }

        public Criteria andQuestion15GreaterThan(String value) {
            addCriterion("question15 >", value, "question15");
            return (Criteria) this;
        }

        public Criteria andQuestion15GreaterThanOrEqualTo(String value) {
            addCriterion("question15 >=", value, "question15");
            return (Criteria) this;
        }

        public Criteria andQuestion15LessThan(String value) {
            addCriterion("question15 <", value, "question15");
            return (Criteria) this;
        }

        public Criteria andQuestion15LessThanOrEqualTo(String value) {
            addCriterion("question15 <=", value, "question15");
            return (Criteria) this;
        }

        public Criteria andQuestion15Like(String value) {
            addCriterion("question15 like", value, "question15");
            return (Criteria) this;
        }

        public Criteria andQuestion15NotLike(String value) {
            addCriterion("question15 not like", value, "question15");
            return (Criteria) this;
        }

        public Criteria andQuestion15In(List<String> values) {
            addCriterion("question15 in", values, "question15");
            return (Criteria) this;
        }

        public Criteria andQuestion15NotIn(List<String> values) {
            addCriterion("question15 not in", values, "question15");
            return (Criteria) this;
        }

        public Criteria andQuestion15Between(String value1, String value2) {
            addCriterion("question15 between", value1, value2, "question15");
            return (Criteria) this;
        }

        public Criteria andQuestion15NotBetween(String value1, String value2) {
            addCriterion("question15 not between", value1, value2, "question15");
            return (Criteria) this;
        }

        public Criteria andQuestion16IsNull() {
            addCriterion("question16 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion16IsNotNull() {
            addCriterion("question16 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion16EqualTo(String value) {
            addCriterion("question16 =", value, "question16");
            return (Criteria) this;
        }

        public Criteria andQuestion16NotEqualTo(String value) {
            addCriterion("question16 <>", value, "question16");
            return (Criteria) this;
        }

        public Criteria andQuestion16GreaterThan(String value) {
            addCriterion("question16 >", value, "question16");
            return (Criteria) this;
        }

        public Criteria andQuestion16GreaterThanOrEqualTo(String value) {
            addCriterion("question16 >=", value, "question16");
            return (Criteria) this;
        }

        public Criteria andQuestion16LessThan(String value) {
            addCriterion("question16 <", value, "question16");
            return (Criteria) this;
        }

        public Criteria andQuestion16LessThanOrEqualTo(String value) {
            addCriterion("question16 <=", value, "question16");
            return (Criteria) this;
        }

        public Criteria andQuestion16Like(String value) {
            addCriterion("question16 like", value, "question16");
            return (Criteria) this;
        }

        public Criteria andQuestion16NotLike(String value) {
            addCriterion("question16 not like", value, "question16");
            return (Criteria) this;
        }

        public Criteria andQuestion16In(List<String> values) {
            addCriterion("question16 in", values, "question16");
            return (Criteria) this;
        }

        public Criteria andQuestion16NotIn(List<String> values) {
            addCriterion("question16 not in", values, "question16");
            return (Criteria) this;
        }

        public Criteria andQuestion16Between(String value1, String value2) {
            addCriterion("question16 between", value1, value2, "question16");
            return (Criteria) this;
        }

        public Criteria andQuestion16NotBetween(String value1, String value2) {
            addCriterion("question16 not between", value1, value2, "question16");
            return (Criteria) this;
        }

        public Criteria andQuestion17IsNull() {
            addCriterion("question17 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion17IsNotNull() {
            addCriterion("question17 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion17EqualTo(String value) {
            addCriterion("question17 =", value, "question17");
            return (Criteria) this;
        }

        public Criteria andQuestion17NotEqualTo(String value) {
            addCriterion("question17 <>", value, "question17");
            return (Criteria) this;
        }

        public Criteria andQuestion17GreaterThan(String value) {
            addCriterion("question17 >", value, "question17");
            return (Criteria) this;
        }

        public Criteria andQuestion17GreaterThanOrEqualTo(String value) {
            addCriterion("question17 >=", value, "question17");
            return (Criteria) this;
        }

        public Criteria andQuestion17LessThan(String value) {
            addCriterion("question17 <", value, "question17");
            return (Criteria) this;
        }

        public Criteria andQuestion17LessThanOrEqualTo(String value) {
            addCriterion("question17 <=", value, "question17");
            return (Criteria) this;
        }

        public Criteria andQuestion17Like(String value) {
            addCriterion("question17 like", value, "question17");
            return (Criteria) this;
        }

        public Criteria andQuestion17NotLike(String value) {
            addCriterion("question17 not like", value, "question17");
            return (Criteria) this;
        }

        public Criteria andQuestion17In(List<String> values) {
            addCriterion("question17 in", values, "question17");
            return (Criteria) this;
        }

        public Criteria andQuestion17NotIn(List<String> values) {
            addCriterion("question17 not in", values, "question17");
            return (Criteria) this;
        }

        public Criteria andQuestion17Between(String value1, String value2) {
            addCriterion("question17 between", value1, value2, "question17");
            return (Criteria) this;
        }

        public Criteria andQuestion17NotBetween(String value1, String value2) {
            addCriterion("question17 not between", value1, value2, "question17");
            return (Criteria) this;
        }

        public Criteria andQuestion18IsNull() {
            addCriterion("question18 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion18IsNotNull() {
            addCriterion("question18 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion18EqualTo(String value) {
            addCriterion("question18 =", value, "question18");
            return (Criteria) this;
        }

        public Criteria andQuestion18NotEqualTo(String value) {
            addCriterion("question18 <>", value, "question18");
            return (Criteria) this;
        }

        public Criteria andQuestion18GreaterThan(String value) {
            addCriterion("question18 >", value, "question18");
            return (Criteria) this;
        }

        public Criteria andQuestion18GreaterThanOrEqualTo(String value) {
            addCriterion("question18 >=", value, "question18");
            return (Criteria) this;
        }

        public Criteria andQuestion18LessThan(String value) {
            addCriterion("question18 <", value, "question18");
            return (Criteria) this;
        }

        public Criteria andQuestion18LessThanOrEqualTo(String value) {
            addCriterion("question18 <=", value, "question18");
            return (Criteria) this;
        }

        public Criteria andQuestion18Like(String value) {
            addCriterion("question18 like", value, "question18");
            return (Criteria) this;
        }

        public Criteria andQuestion18NotLike(String value) {
            addCriterion("question18 not like", value, "question18");
            return (Criteria) this;
        }

        public Criteria andQuestion18In(List<String> values) {
            addCriterion("question18 in", values, "question18");
            return (Criteria) this;
        }

        public Criteria andQuestion18NotIn(List<String> values) {
            addCriterion("question18 not in", values, "question18");
            return (Criteria) this;
        }

        public Criteria andQuestion18Between(String value1, String value2) {
            addCriterion("question18 between", value1, value2, "question18");
            return (Criteria) this;
        }

        public Criteria andQuestion18NotBetween(String value1, String value2) {
            addCriterion("question18 not between", value1, value2, "question18");
            return (Criteria) this;
        }

        public Criteria andQuestion19IsNull() {
            addCriterion("question19 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion19IsNotNull() {
            addCriterion("question19 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion19EqualTo(String value) {
            addCriterion("question19 =", value, "question19");
            return (Criteria) this;
        }

        public Criteria andQuestion19NotEqualTo(String value) {
            addCriterion("question19 <>", value, "question19");
            return (Criteria) this;
        }

        public Criteria andQuestion19GreaterThan(String value) {
            addCriterion("question19 >", value, "question19");
            return (Criteria) this;
        }

        public Criteria andQuestion19GreaterThanOrEqualTo(String value) {
            addCriterion("question19 >=", value, "question19");
            return (Criteria) this;
        }

        public Criteria andQuestion19LessThan(String value) {
            addCriterion("question19 <", value, "question19");
            return (Criteria) this;
        }

        public Criteria andQuestion19LessThanOrEqualTo(String value) {
            addCriterion("question19 <=", value, "question19");
            return (Criteria) this;
        }

        public Criteria andQuestion19Like(String value) {
            addCriterion("question19 like", value, "question19");
            return (Criteria) this;
        }

        public Criteria andQuestion19NotLike(String value) {
            addCriterion("question19 not like", value, "question19");
            return (Criteria) this;
        }

        public Criteria andQuestion19In(List<String> values) {
            addCriterion("question19 in", values, "question19");
            return (Criteria) this;
        }

        public Criteria andQuestion19NotIn(List<String> values) {
            addCriterion("question19 not in", values, "question19");
            return (Criteria) this;
        }

        public Criteria andQuestion19Between(String value1, String value2) {
            addCriterion("question19 between", value1, value2, "question19");
            return (Criteria) this;
        }

        public Criteria andQuestion19NotBetween(String value1, String value2) {
            addCriterion("question19 not between", value1, value2, "question19");
            return (Criteria) this;
        }

        public Criteria andQuestion20IsNull() {
            addCriterion("question20 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion20IsNotNull() {
            addCriterion("question20 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion20EqualTo(String value) {
            addCriterion("question20 =", value, "question20");
            return (Criteria) this;
        }

        public Criteria andQuestion20NotEqualTo(String value) {
            addCriterion("question20 <>", value, "question20");
            return (Criteria) this;
        }

        public Criteria andQuestion20GreaterThan(String value) {
            addCriterion("question20 >", value, "question20");
            return (Criteria) this;
        }

        public Criteria andQuestion20GreaterThanOrEqualTo(String value) {
            addCriterion("question20 >=", value, "question20");
            return (Criteria) this;
        }

        public Criteria andQuestion20LessThan(String value) {
            addCriterion("question20 <", value, "question20");
            return (Criteria) this;
        }

        public Criteria andQuestion20LessThanOrEqualTo(String value) {
            addCriterion("question20 <=", value, "question20");
            return (Criteria) this;
        }

        public Criteria andQuestion20Like(String value) {
            addCriterion("question20 like", value, "question20");
            return (Criteria) this;
        }

        public Criteria andQuestion20NotLike(String value) {
            addCriterion("question20 not like", value, "question20");
            return (Criteria) this;
        }

        public Criteria andQuestion20In(List<String> values) {
            addCriterion("question20 in", values, "question20");
            return (Criteria) this;
        }

        public Criteria andQuestion20NotIn(List<String> values) {
            addCriterion("question20 not in", values, "question20");
            return (Criteria) this;
        }

        public Criteria andQuestion20Between(String value1, String value2) {
            addCriterion("question20 between", value1, value2, "question20");
            return (Criteria) this;
        }

        public Criteria andQuestion20NotBetween(String value1, String value2) {
            addCriterion("question20 not between", value1, value2, "question20");
            return (Criteria) this;
        }

        public Criteria andQuestion21IsNull() {
            addCriterion("question21 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion21IsNotNull() {
            addCriterion("question21 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion21EqualTo(String value) {
            addCriterion("question21 =", value, "question21");
            return (Criteria) this;
        }

        public Criteria andQuestion21NotEqualTo(String value) {
            addCriterion("question21 <>", value, "question21");
            return (Criteria) this;
        }

        public Criteria andQuestion21GreaterThan(String value) {
            addCriterion("question21 >", value, "question21");
            return (Criteria) this;
        }

        public Criteria andQuestion21GreaterThanOrEqualTo(String value) {
            addCriterion("question21 >=", value, "question21");
            return (Criteria) this;
        }

        public Criteria andQuestion21LessThan(String value) {
            addCriterion("question21 <", value, "question21");
            return (Criteria) this;
        }

        public Criteria andQuestion21LessThanOrEqualTo(String value) {
            addCriterion("question21 <=", value, "question21");
            return (Criteria) this;
        }

        public Criteria andQuestion21Like(String value) {
            addCriterion("question21 like", value, "question21");
            return (Criteria) this;
        }

        public Criteria andQuestion21NotLike(String value) {
            addCriterion("question21 not like", value, "question21");
            return (Criteria) this;
        }

        public Criteria andQuestion21In(List<String> values) {
            addCriterion("question21 in", values, "question21");
            return (Criteria) this;
        }

        public Criteria andQuestion21NotIn(List<String> values) {
            addCriterion("question21 not in", values, "question21");
            return (Criteria) this;
        }

        public Criteria andQuestion21Between(String value1, String value2) {
            addCriterion("question21 between", value1, value2, "question21");
            return (Criteria) this;
        }

        public Criteria andQuestion21NotBetween(String value1, String value2) {
            addCriterion("question21 not between", value1, value2, "question21");
            return (Criteria) this;
        }

        public Criteria andQuestion22IsNull() {
            addCriterion("question22 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion22IsNotNull() {
            addCriterion("question22 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion22EqualTo(String value) {
            addCriterion("question22 =", value, "question22");
            return (Criteria) this;
        }

        public Criteria andQuestion22NotEqualTo(String value) {
            addCriterion("question22 <>", value, "question22");
            return (Criteria) this;
        }

        public Criteria andQuestion22GreaterThan(String value) {
            addCriterion("question22 >", value, "question22");
            return (Criteria) this;
        }

        public Criteria andQuestion22GreaterThanOrEqualTo(String value) {
            addCriterion("question22 >=", value, "question22");
            return (Criteria) this;
        }

        public Criteria andQuestion22LessThan(String value) {
            addCriterion("question22 <", value, "question22");
            return (Criteria) this;
        }

        public Criteria andQuestion22LessThanOrEqualTo(String value) {
            addCriterion("question22 <=", value, "question22");
            return (Criteria) this;
        }

        public Criteria andQuestion22Like(String value) {
            addCriterion("question22 like", value, "question22");
            return (Criteria) this;
        }

        public Criteria andQuestion22NotLike(String value) {
            addCriterion("question22 not like", value, "question22");
            return (Criteria) this;
        }

        public Criteria andQuestion22In(List<String> values) {
            addCriterion("question22 in", values, "question22");
            return (Criteria) this;
        }

        public Criteria andQuestion22NotIn(List<String> values) {
            addCriterion("question22 not in", values, "question22");
            return (Criteria) this;
        }

        public Criteria andQuestion22Between(String value1, String value2) {
            addCriterion("question22 between", value1, value2, "question22");
            return (Criteria) this;
        }

        public Criteria andQuestion22NotBetween(String value1, String value2) {
            addCriterion("question22 not between", value1, value2, "question22");
            return (Criteria) this;
        }

        public Criteria andQuestion23IsNull() {
            addCriterion("question23 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion23IsNotNull() {
            addCriterion("question23 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion23EqualTo(String value) {
            addCriterion("question23 =", value, "question23");
            return (Criteria) this;
        }

        public Criteria andQuestion23NotEqualTo(String value) {
            addCriterion("question23 <>", value, "question23");
            return (Criteria) this;
        }

        public Criteria andQuestion23GreaterThan(String value) {
            addCriterion("question23 >", value, "question23");
            return (Criteria) this;
        }

        public Criteria andQuestion23GreaterThanOrEqualTo(String value) {
            addCriterion("question23 >=", value, "question23");
            return (Criteria) this;
        }

        public Criteria andQuestion23LessThan(String value) {
            addCriterion("question23 <", value, "question23");
            return (Criteria) this;
        }

        public Criteria andQuestion23LessThanOrEqualTo(String value) {
            addCriterion("question23 <=", value, "question23");
            return (Criteria) this;
        }

        public Criteria andQuestion23Like(String value) {
            addCriterion("question23 like", value, "question23");
            return (Criteria) this;
        }

        public Criteria andQuestion23NotLike(String value) {
            addCriterion("question23 not like", value, "question23");
            return (Criteria) this;
        }

        public Criteria andQuestion23In(List<String> values) {
            addCriterion("question23 in", values, "question23");
            return (Criteria) this;
        }

        public Criteria andQuestion23NotIn(List<String> values) {
            addCriterion("question23 not in", values, "question23");
            return (Criteria) this;
        }

        public Criteria andQuestion23Between(String value1, String value2) {
            addCriterion("question23 between", value1, value2, "question23");
            return (Criteria) this;
        }

        public Criteria andQuestion23NotBetween(String value1, String value2) {
            addCriterion("question23 not between", value1, value2, "question23");
            return (Criteria) this;
        }

        public Criteria andQuestion24IsNull() {
            addCriterion("question24 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion24IsNotNull() {
            addCriterion("question24 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion24EqualTo(String value) {
            addCriterion("question24 =", value, "question24");
            return (Criteria) this;
        }

        public Criteria andQuestion24NotEqualTo(String value) {
            addCriterion("question24 <>", value, "question24");
            return (Criteria) this;
        }

        public Criteria andQuestion24GreaterThan(String value) {
            addCriterion("question24 >", value, "question24");
            return (Criteria) this;
        }

        public Criteria andQuestion24GreaterThanOrEqualTo(String value) {
            addCriterion("question24 >=", value, "question24");
            return (Criteria) this;
        }

        public Criteria andQuestion24LessThan(String value) {
            addCriterion("question24 <", value, "question24");
            return (Criteria) this;
        }

        public Criteria andQuestion24LessThanOrEqualTo(String value) {
            addCriterion("question24 <=", value, "question24");
            return (Criteria) this;
        }

        public Criteria andQuestion24Like(String value) {
            addCriterion("question24 like", value, "question24");
            return (Criteria) this;
        }

        public Criteria andQuestion24NotLike(String value) {
            addCriterion("question24 not like", value, "question24");
            return (Criteria) this;
        }

        public Criteria andQuestion24In(List<String> values) {
            addCriterion("question24 in", values, "question24");
            return (Criteria) this;
        }

        public Criteria andQuestion24NotIn(List<String> values) {
            addCriterion("question24 not in", values, "question24");
            return (Criteria) this;
        }

        public Criteria andQuestion24Between(String value1, String value2) {
            addCriterion("question24 between", value1, value2, "question24");
            return (Criteria) this;
        }

        public Criteria andQuestion24NotBetween(String value1, String value2) {
            addCriterion("question24 not between", value1, value2, "question24");
            return (Criteria) this;
        }

        public Criteria andQuestion25IsNull() {
            addCriterion("question25 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion25IsNotNull() {
            addCriterion("question25 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion25EqualTo(String value) {
            addCriterion("question25 =", value, "question25");
            return (Criteria) this;
        }

        public Criteria andQuestion25NotEqualTo(String value) {
            addCriterion("question25 <>", value, "question25");
            return (Criteria) this;
        }

        public Criteria andQuestion25GreaterThan(String value) {
            addCriterion("question25 >", value, "question25");
            return (Criteria) this;
        }

        public Criteria andQuestion25GreaterThanOrEqualTo(String value) {
            addCriterion("question25 >=", value, "question25");
            return (Criteria) this;
        }

        public Criteria andQuestion25LessThan(String value) {
            addCriterion("question25 <", value, "question25");
            return (Criteria) this;
        }

        public Criteria andQuestion25LessThanOrEqualTo(String value) {
            addCriterion("question25 <=", value, "question25");
            return (Criteria) this;
        }

        public Criteria andQuestion25Like(String value) {
            addCriterion("question25 like", value, "question25");
            return (Criteria) this;
        }

        public Criteria andQuestion25NotLike(String value) {
            addCriterion("question25 not like", value, "question25");
            return (Criteria) this;
        }

        public Criteria andQuestion25In(List<String> values) {
            addCriterion("question25 in", values, "question25");
            return (Criteria) this;
        }

        public Criteria andQuestion25NotIn(List<String> values) {
            addCriterion("question25 not in", values, "question25");
            return (Criteria) this;
        }

        public Criteria andQuestion25Between(String value1, String value2) {
            addCriterion("question25 between", value1, value2, "question25");
            return (Criteria) this;
        }

        public Criteria andQuestion25NotBetween(String value1, String value2) {
            addCriterion("question25 not between", value1, value2, "question25");
            return (Criteria) this;
        }

        public Criteria andQuestion26IsNull() {
            addCriterion("question26 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion26IsNotNull() {
            addCriterion("question26 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion26EqualTo(String value) {
            addCriterion("question26 =", value, "question26");
            return (Criteria) this;
        }

        public Criteria andQuestion26NotEqualTo(String value) {
            addCriterion("question26 <>", value, "question26");
            return (Criteria) this;
        }

        public Criteria andQuestion26GreaterThan(String value) {
            addCriterion("question26 >", value, "question26");
            return (Criteria) this;
        }

        public Criteria andQuestion26GreaterThanOrEqualTo(String value) {
            addCriterion("question26 >=", value, "question26");
            return (Criteria) this;
        }

        public Criteria andQuestion26LessThan(String value) {
            addCriterion("question26 <", value, "question26");
            return (Criteria) this;
        }

        public Criteria andQuestion26LessThanOrEqualTo(String value) {
            addCriterion("question26 <=", value, "question26");
            return (Criteria) this;
        }

        public Criteria andQuestion26Like(String value) {
            addCriterion("question26 like", value, "question26");
            return (Criteria) this;
        }

        public Criteria andQuestion26NotLike(String value) {
            addCriterion("question26 not like", value, "question26");
            return (Criteria) this;
        }

        public Criteria andQuestion26In(List<String> values) {
            addCriterion("question26 in", values, "question26");
            return (Criteria) this;
        }

        public Criteria andQuestion26NotIn(List<String> values) {
            addCriterion("question26 not in", values, "question26");
            return (Criteria) this;
        }

        public Criteria andQuestion26Between(String value1, String value2) {
            addCriterion("question26 between", value1, value2, "question26");
            return (Criteria) this;
        }

        public Criteria andQuestion26NotBetween(String value1, String value2) {
            addCriterion("question26 not between", value1, value2, "question26");
            return (Criteria) this;
        }

        public Criteria andQuestion27IsNull() {
            addCriterion("question27 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion27IsNotNull() {
            addCriterion("question27 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion27EqualTo(String value) {
            addCriterion("question27 =", value, "question27");
            return (Criteria) this;
        }

        public Criteria andQuestion27NotEqualTo(String value) {
            addCriterion("question27 <>", value, "question27");
            return (Criteria) this;
        }

        public Criteria andQuestion27GreaterThan(String value) {
            addCriterion("question27 >", value, "question27");
            return (Criteria) this;
        }

        public Criteria andQuestion27GreaterThanOrEqualTo(String value) {
            addCriterion("question27 >=", value, "question27");
            return (Criteria) this;
        }

        public Criteria andQuestion27LessThan(String value) {
            addCriterion("question27 <", value, "question27");
            return (Criteria) this;
        }

        public Criteria andQuestion27LessThanOrEqualTo(String value) {
            addCriterion("question27 <=", value, "question27");
            return (Criteria) this;
        }

        public Criteria andQuestion27Like(String value) {
            addCriterion("question27 like", value, "question27");
            return (Criteria) this;
        }

        public Criteria andQuestion27NotLike(String value) {
            addCriterion("question27 not like", value, "question27");
            return (Criteria) this;
        }

        public Criteria andQuestion27In(List<String> values) {
            addCriterion("question27 in", values, "question27");
            return (Criteria) this;
        }

        public Criteria andQuestion27NotIn(List<String> values) {
            addCriterion("question27 not in", values, "question27");
            return (Criteria) this;
        }

        public Criteria andQuestion27Between(String value1, String value2) {
            addCriterion("question27 between", value1, value2, "question27");
            return (Criteria) this;
        }

        public Criteria andQuestion27NotBetween(String value1, String value2) {
            addCriterion("question27 not between", value1, value2, "question27");
            return (Criteria) this;
        }

        public Criteria andQuestion28IsNull() {
            addCriterion("question28 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion28IsNotNull() {
            addCriterion("question28 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion28EqualTo(String value) {
            addCriterion("question28 =", value, "question28");
            return (Criteria) this;
        }

        public Criteria andQuestion28NotEqualTo(String value) {
            addCriterion("question28 <>", value, "question28");
            return (Criteria) this;
        }

        public Criteria andQuestion28GreaterThan(String value) {
            addCriterion("question28 >", value, "question28");
            return (Criteria) this;
        }

        public Criteria andQuestion28GreaterThanOrEqualTo(String value) {
            addCriterion("question28 >=", value, "question28");
            return (Criteria) this;
        }

        public Criteria andQuestion28LessThan(String value) {
            addCriterion("question28 <", value, "question28");
            return (Criteria) this;
        }

        public Criteria andQuestion28LessThanOrEqualTo(String value) {
            addCriterion("question28 <=", value, "question28");
            return (Criteria) this;
        }

        public Criteria andQuestion28Like(String value) {
            addCriterion("question28 like", value, "question28");
            return (Criteria) this;
        }

        public Criteria andQuestion28NotLike(String value) {
            addCriterion("question28 not like", value, "question28");
            return (Criteria) this;
        }

        public Criteria andQuestion28In(List<String> values) {
            addCriterion("question28 in", values, "question28");
            return (Criteria) this;
        }

        public Criteria andQuestion28NotIn(List<String> values) {
            addCriterion("question28 not in", values, "question28");
            return (Criteria) this;
        }

        public Criteria andQuestion28Between(String value1, String value2) {
            addCriterion("question28 between", value1, value2, "question28");
            return (Criteria) this;
        }

        public Criteria andQuestion28NotBetween(String value1, String value2) {
            addCriterion("question28 not between", value1, value2, "question28");
            return (Criteria) this;
        }

        public Criteria andQuestion29IsNull() {
            addCriterion("question29 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion29IsNotNull() {
            addCriterion("question29 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion29EqualTo(String value) {
            addCriterion("question29 =", value, "question29");
            return (Criteria) this;
        }

        public Criteria andQuestion29NotEqualTo(String value) {
            addCriterion("question29 <>", value, "question29");
            return (Criteria) this;
        }

        public Criteria andQuestion29GreaterThan(String value) {
            addCriterion("question29 >", value, "question29");
            return (Criteria) this;
        }

        public Criteria andQuestion29GreaterThanOrEqualTo(String value) {
            addCriterion("question29 >=", value, "question29");
            return (Criteria) this;
        }

        public Criteria andQuestion29LessThan(String value) {
            addCriterion("question29 <", value, "question29");
            return (Criteria) this;
        }

        public Criteria andQuestion29LessThanOrEqualTo(String value) {
            addCriterion("question29 <=", value, "question29");
            return (Criteria) this;
        }

        public Criteria andQuestion29Like(String value) {
            addCriterion("question29 like", value, "question29");
            return (Criteria) this;
        }

        public Criteria andQuestion29NotLike(String value) {
            addCriterion("question29 not like", value, "question29");
            return (Criteria) this;
        }

        public Criteria andQuestion29In(List<String> values) {
            addCriterion("question29 in", values, "question29");
            return (Criteria) this;
        }

        public Criteria andQuestion29NotIn(List<String> values) {
            addCriterion("question29 not in", values, "question29");
            return (Criteria) this;
        }

        public Criteria andQuestion29Between(String value1, String value2) {
            addCriterion("question29 between", value1, value2, "question29");
            return (Criteria) this;
        }

        public Criteria andQuestion29NotBetween(String value1, String value2) {
            addCriterion("question29 not between", value1, value2, "question29");
            return (Criteria) this;
        }

        public Criteria andQuestion30IsNull() {
            addCriterion("question30 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion30IsNotNull() {
            addCriterion("question30 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion30EqualTo(String value) {
            addCriterion("question30 =", value, "question30");
            return (Criteria) this;
        }

        public Criteria andQuestion30NotEqualTo(String value) {
            addCriterion("question30 <>", value, "question30");
            return (Criteria) this;
        }

        public Criteria andQuestion30GreaterThan(String value) {
            addCriterion("question30 >", value, "question30");
            return (Criteria) this;
        }

        public Criteria andQuestion30GreaterThanOrEqualTo(String value) {
            addCriterion("question30 >=", value, "question30");
            return (Criteria) this;
        }

        public Criteria andQuestion30LessThan(String value) {
            addCriterion("question30 <", value, "question30");
            return (Criteria) this;
        }

        public Criteria andQuestion30LessThanOrEqualTo(String value) {
            addCriterion("question30 <=", value, "question30");
            return (Criteria) this;
        }

        public Criteria andQuestion30Like(String value) {
            addCriterion("question30 like", value, "question30");
            return (Criteria) this;
        }

        public Criteria andQuestion30NotLike(String value) {
            addCriterion("question30 not like", value, "question30");
            return (Criteria) this;
        }

        public Criteria andQuestion30In(List<String> values) {
            addCriterion("question30 in", values, "question30");
            return (Criteria) this;
        }

        public Criteria andQuestion30NotIn(List<String> values) {
            addCriterion("question30 not in", values, "question30");
            return (Criteria) this;
        }

        public Criteria andQuestion30Between(String value1, String value2) {
            addCriterion("question30 between", value1, value2, "question30");
            return (Criteria) this;
        }

        public Criteria andQuestion30NotBetween(String value1, String value2) {
            addCriterion("question30 not between", value1, value2, "question30");
            return (Criteria) this;
        }

        public Criteria andQuestion31IsNull() {
            addCriterion("question31 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion31IsNotNull() {
            addCriterion("question31 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion31EqualTo(String value) {
            addCriterion("question31 =", value, "question31");
            return (Criteria) this;
        }

        public Criteria andQuestion31NotEqualTo(String value) {
            addCriterion("question31 <>", value, "question31");
            return (Criteria) this;
        }

        public Criteria andQuestion31GreaterThan(String value) {
            addCriterion("question31 >", value, "question31");
            return (Criteria) this;
        }

        public Criteria andQuestion31GreaterThanOrEqualTo(String value) {
            addCriterion("question31 >=", value, "question31");
            return (Criteria) this;
        }

        public Criteria andQuestion31LessThan(String value) {
            addCriterion("question31 <", value, "question31");
            return (Criteria) this;
        }

        public Criteria andQuestion31LessThanOrEqualTo(String value) {
            addCriterion("question31 <=", value, "question31");
            return (Criteria) this;
        }

        public Criteria andQuestion31Like(String value) {
            addCriterion("question31 like", value, "question31");
            return (Criteria) this;
        }

        public Criteria andQuestion31NotLike(String value) {
            addCriterion("question31 not like", value, "question31");
            return (Criteria) this;
        }

        public Criteria andQuestion31In(List<String> values) {
            addCriterion("question31 in", values, "question31");
            return (Criteria) this;
        }

        public Criteria andQuestion31NotIn(List<String> values) {
            addCriterion("question31 not in", values, "question31");
            return (Criteria) this;
        }

        public Criteria andQuestion31Between(String value1, String value2) {
            addCriterion("question31 between", value1, value2, "question31");
            return (Criteria) this;
        }

        public Criteria andQuestion31NotBetween(String value1, String value2) {
            addCriterion("question31 not between", value1, value2, "question31");
            return (Criteria) this;
        }

        public Criteria andQuestion32IsNull() {
            addCriterion("question32 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion32IsNotNull() {
            addCriterion("question32 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion32EqualTo(String value) {
            addCriterion("question32 =", value, "question32");
            return (Criteria) this;
        }

        public Criteria andQuestion32NotEqualTo(String value) {
            addCriterion("question32 <>", value, "question32");
            return (Criteria) this;
        }

        public Criteria andQuestion32GreaterThan(String value) {
            addCriterion("question32 >", value, "question32");
            return (Criteria) this;
        }

        public Criteria andQuestion32GreaterThanOrEqualTo(String value) {
            addCriterion("question32 >=", value, "question32");
            return (Criteria) this;
        }

        public Criteria andQuestion32LessThan(String value) {
            addCriterion("question32 <", value, "question32");
            return (Criteria) this;
        }

        public Criteria andQuestion32LessThanOrEqualTo(String value) {
            addCriterion("question32 <=", value, "question32");
            return (Criteria) this;
        }

        public Criteria andQuestion32Like(String value) {
            addCriterion("question32 like", value, "question32");
            return (Criteria) this;
        }

        public Criteria andQuestion32NotLike(String value) {
            addCriterion("question32 not like", value, "question32");
            return (Criteria) this;
        }

        public Criteria andQuestion32In(List<String> values) {
            addCriterion("question32 in", values, "question32");
            return (Criteria) this;
        }

        public Criteria andQuestion32NotIn(List<String> values) {
            addCriterion("question32 not in", values, "question32");
            return (Criteria) this;
        }

        public Criteria andQuestion32Between(String value1, String value2) {
            addCriterion("question32 between", value1, value2, "question32");
            return (Criteria) this;
        }

        public Criteria andQuestion32NotBetween(String value1, String value2) {
            addCriterion("question32 not between", value1, value2, "question32");
            return (Criteria) this;
        }

        public Criteria andQuestion33IsNull() {
            addCriterion("question33 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion33IsNotNull() {
            addCriterion("question33 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion33EqualTo(String value) {
            addCriterion("question33 =", value, "question33");
            return (Criteria) this;
        }

        public Criteria andQuestion33NotEqualTo(String value) {
            addCriterion("question33 <>", value, "question33");
            return (Criteria) this;
        }

        public Criteria andQuestion33GreaterThan(String value) {
            addCriterion("question33 >", value, "question33");
            return (Criteria) this;
        }

        public Criteria andQuestion33GreaterThanOrEqualTo(String value) {
            addCriterion("question33 >=", value, "question33");
            return (Criteria) this;
        }

        public Criteria andQuestion33LessThan(String value) {
            addCriterion("question33 <", value, "question33");
            return (Criteria) this;
        }

        public Criteria andQuestion33LessThanOrEqualTo(String value) {
            addCriterion("question33 <=", value, "question33");
            return (Criteria) this;
        }

        public Criteria andQuestion33Like(String value) {
            addCriterion("question33 like", value, "question33");
            return (Criteria) this;
        }

        public Criteria andQuestion33NotLike(String value) {
            addCriterion("question33 not like", value, "question33");
            return (Criteria) this;
        }

        public Criteria andQuestion33In(List<String> values) {
            addCriterion("question33 in", values, "question33");
            return (Criteria) this;
        }

        public Criteria andQuestion33NotIn(List<String> values) {
            addCriterion("question33 not in", values, "question33");
            return (Criteria) this;
        }

        public Criteria andQuestion33Between(String value1, String value2) {
            addCriterion("question33 between", value1, value2, "question33");
            return (Criteria) this;
        }

        public Criteria andQuestion33NotBetween(String value1, String value2) {
            addCriterion("question33 not between", value1, value2, "question33");
            return (Criteria) this;
        }

        public Criteria andQuestion34IsNull() {
            addCriterion("question34 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion34IsNotNull() {
            addCriterion("question34 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion34EqualTo(String value) {
            addCriterion("question34 =", value, "question34");
            return (Criteria) this;
        }

        public Criteria andQuestion34NotEqualTo(String value) {
            addCriterion("question34 <>", value, "question34");
            return (Criteria) this;
        }

        public Criteria andQuestion34GreaterThan(String value) {
            addCriterion("question34 >", value, "question34");
            return (Criteria) this;
        }

        public Criteria andQuestion34GreaterThanOrEqualTo(String value) {
            addCriterion("question34 >=", value, "question34");
            return (Criteria) this;
        }

        public Criteria andQuestion34LessThan(String value) {
            addCriterion("question34 <", value, "question34");
            return (Criteria) this;
        }

        public Criteria andQuestion34LessThanOrEqualTo(String value) {
            addCriterion("question34 <=", value, "question34");
            return (Criteria) this;
        }

        public Criteria andQuestion34Like(String value) {
            addCriterion("question34 like", value, "question34");
            return (Criteria) this;
        }

        public Criteria andQuestion34NotLike(String value) {
            addCriterion("question34 not like", value, "question34");
            return (Criteria) this;
        }

        public Criteria andQuestion34In(List<String> values) {
            addCriterion("question34 in", values, "question34");
            return (Criteria) this;
        }

        public Criteria andQuestion34NotIn(List<String> values) {
            addCriterion("question34 not in", values, "question34");
            return (Criteria) this;
        }

        public Criteria andQuestion34Between(String value1, String value2) {
            addCriterion("question34 between", value1, value2, "question34");
            return (Criteria) this;
        }

        public Criteria andQuestion34NotBetween(String value1, String value2) {
            addCriterion("question34 not between", value1, value2, "question34");
            return (Criteria) this;
        }

        public Criteria andQuestion35IsNull() {
            addCriterion("question35 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion35IsNotNull() {
            addCriterion("question35 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion35EqualTo(String value) {
            addCriterion("question35 =", value, "question35");
            return (Criteria) this;
        }

        public Criteria andQuestion35NotEqualTo(String value) {
            addCriterion("question35 <>", value, "question35");
            return (Criteria) this;
        }

        public Criteria andQuestion35GreaterThan(String value) {
            addCriterion("question35 >", value, "question35");
            return (Criteria) this;
        }

        public Criteria andQuestion35GreaterThanOrEqualTo(String value) {
            addCriterion("question35 >=", value, "question35");
            return (Criteria) this;
        }

        public Criteria andQuestion35LessThan(String value) {
            addCriterion("question35 <", value, "question35");
            return (Criteria) this;
        }

        public Criteria andQuestion35LessThanOrEqualTo(String value) {
            addCriterion("question35 <=", value, "question35");
            return (Criteria) this;
        }

        public Criteria andQuestion35Like(String value) {
            addCriterion("question35 like", value, "question35");
            return (Criteria) this;
        }

        public Criteria andQuestion35NotLike(String value) {
            addCriterion("question35 not like", value, "question35");
            return (Criteria) this;
        }

        public Criteria andQuestion35In(List<String> values) {
            addCriterion("question35 in", values, "question35");
            return (Criteria) this;
        }

        public Criteria andQuestion35NotIn(List<String> values) {
            addCriterion("question35 not in", values, "question35");
            return (Criteria) this;
        }

        public Criteria andQuestion35Between(String value1, String value2) {
            addCriterion("question35 between", value1, value2, "question35");
            return (Criteria) this;
        }

        public Criteria andQuestion35NotBetween(String value1, String value2) {
            addCriterion("question35 not between", value1, value2, "question35");
            return (Criteria) this;
        }

        public Criteria andQuestion36IsNull() {
            addCriterion("question36 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion36IsNotNull() {
            addCriterion("question36 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion36EqualTo(String value) {
            addCriterion("question36 =", value, "question36");
            return (Criteria) this;
        }

        public Criteria andQuestion36NotEqualTo(String value) {
            addCriterion("question36 <>", value, "question36");
            return (Criteria) this;
        }

        public Criteria andQuestion36GreaterThan(String value) {
            addCriterion("question36 >", value, "question36");
            return (Criteria) this;
        }

        public Criteria andQuestion36GreaterThanOrEqualTo(String value) {
            addCriterion("question36 >=", value, "question36");
            return (Criteria) this;
        }

        public Criteria andQuestion36LessThan(String value) {
            addCriterion("question36 <", value, "question36");
            return (Criteria) this;
        }

        public Criteria andQuestion36LessThanOrEqualTo(String value) {
            addCriterion("question36 <=", value, "question36");
            return (Criteria) this;
        }

        public Criteria andQuestion36Like(String value) {
            addCriterion("question36 like", value, "question36");
            return (Criteria) this;
        }

        public Criteria andQuestion36NotLike(String value) {
            addCriterion("question36 not like", value, "question36");
            return (Criteria) this;
        }

        public Criteria andQuestion36In(List<String> values) {
            addCriterion("question36 in", values, "question36");
            return (Criteria) this;
        }

        public Criteria andQuestion36NotIn(List<String> values) {
            addCriterion("question36 not in", values, "question36");
            return (Criteria) this;
        }

        public Criteria andQuestion36Between(String value1, String value2) {
            addCriterion("question36 between", value1, value2, "question36");
            return (Criteria) this;
        }

        public Criteria andQuestion36NotBetween(String value1, String value2) {
            addCriterion("question36 not between", value1, value2, "question36");
            return (Criteria) this;
        }

        public Criteria andQuestion37IsNull() {
            addCriterion("question37 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion37IsNotNull() {
            addCriterion("question37 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion37EqualTo(String value) {
            addCriterion("question37 =", value, "question37");
            return (Criteria) this;
        }

        public Criteria andQuestion37NotEqualTo(String value) {
            addCriterion("question37 <>", value, "question37");
            return (Criteria) this;
        }

        public Criteria andQuestion37GreaterThan(String value) {
            addCriterion("question37 >", value, "question37");
            return (Criteria) this;
        }

        public Criteria andQuestion37GreaterThanOrEqualTo(String value) {
            addCriterion("question37 >=", value, "question37");
            return (Criteria) this;
        }

        public Criteria andQuestion37LessThan(String value) {
            addCriterion("question37 <", value, "question37");
            return (Criteria) this;
        }

        public Criteria andQuestion37LessThanOrEqualTo(String value) {
            addCriterion("question37 <=", value, "question37");
            return (Criteria) this;
        }

        public Criteria andQuestion37Like(String value) {
            addCriterion("question37 like", value, "question37");
            return (Criteria) this;
        }

        public Criteria andQuestion37NotLike(String value) {
            addCriterion("question37 not like", value, "question37");
            return (Criteria) this;
        }

        public Criteria andQuestion37In(List<String> values) {
            addCriterion("question37 in", values, "question37");
            return (Criteria) this;
        }

        public Criteria andQuestion37NotIn(List<String> values) {
            addCriterion("question37 not in", values, "question37");
            return (Criteria) this;
        }

        public Criteria andQuestion37Between(String value1, String value2) {
            addCriterion("question37 between", value1, value2, "question37");
            return (Criteria) this;
        }

        public Criteria andQuestion37NotBetween(String value1, String value2) {
            addCriterion("question37 not between", value1, value2, "question37");
            return (Criteria) this;
        }

        public Criteria andQuestion38IsNull() {
            addCriterion("question38 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion38IsNotNull() {
            addCriterion("question38 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion38EqualTo(String value) {
            addCriterion("question38 =", value, "question38");
            return (Criteria) this;
        }

        public Criteria andQuestion38NotEqualTo(String value) {
            addCriterion("question38 <>", value, "question38");
            return (Criteria) this;
        }

        public Criteria andQuestion38GreaterThan(String value) {
            addCriterion("question38 >", value, "question38");
            return (Criteria) this;
        }

        public Criteria andQuestion38GreaterThanOrEqualTo(String value) {
            addCriterion("question38 >=", value, "question38");
            return (Criteria) this;
        }

        public Criteria andQuestion38LessThan(String value) {
            addCriterion("question38 <", value, "question38");
            return (Criteria) this;
        }

        public Criteria andQuestion38LessThanOrEqualTo(String value) {
            addCriterion("question38 <=", value, "question38");
            return (Criteria) this;
        }

        public Criteria andQuestion38Like(String value) {
            addCriterion("question38 like", value, "question38");
            return (Criteria) this;
        }

        public Criteria andQuestion38NotLike(String value) {
            addCriterion("question38 not like", value, "question38");
            return (Criteria) this;
        }

        public Criteria andQuestion38In(List<String> values) {
            addCriterion("question38 in", values, "question38");
            return (Criteria) this;
        }

        public Criteria andQuestion38NotIn(List<String> values) {
            addCriterion("question38 not in", values, "question38");
            return (Criteria) this;
        }

        public Criteria andQuestion38Between(String value1, String value2) {
            addCriterion("question38 between", value1, value2, "question38");
            return (Criteria) this;
        }

        public Criteria andQuestion38NotBetween(String value1, String value2) {
            addCriterion("question38 not between", value1, value2, "question38");
            return (Criteria) this;
        }

        public Criteria andQuestion39IsNull() {
            addCriterion("question39 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion39IsNotNull() {
            addCriterion("question39 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion39EqualTo(String value) {
            addCriterion("question39 =", value, "question39");
            return (Criteria) this;
        }

        public Criteria andQuestion39NotEqualTo(String value) {
            addCriterion("question39 <>", value, "question39");
            return (Criteria) this;
        }

        public Criteria andQuestion39GreaterThan(String value) {
            addCriterion("question39 >", value, "question39");
            return (Criteria) this;
        }

        public Criteria andQuestion39GreaterThanOrEqualTo(String value) {
            addCriterion("question39 >=", value, "question39");
            return (Criteria) this;
        }

        public Criteria andQuestion39LessThan(String value) {
            addCriterion("question39 <", value, "question39");
            return (Criteria) this;
        }

        public Criteria andQuestion39LessThanOrEqualTo(String value) {
            addCriterion("question39 <=", value, "question39");
            return (Criteria) this;
        }

        public Criteria andQuestion39Like(String value) {
            addCriterion("question39 like", value, "question39");
            return (Criteria) this;
        }

        public Criteria andQuestion39NotLike(String value) {
            addCriterion("question39 not like", value, "question39");
            return (Criteria) this;
        }

        public Criteria andQuestion39In(List<String> values) {
            addCriterion("question39 in", values, "question39");
            return (Criteria) this;
        }

        public Criteria andQuestion39NotIn(List<String> values) {
            addCriterion("question39 not in", values, "question39");
            return (Criteria) this;
        }

        public Criteria andQuestion39Between(String value1, String value2) {
            addCriterion("question39 between", value1, value2, "question39");
            return (Criteria) this;
        }

        public Criteria andQuestion39NotBetween(String value1, String value2) {
            addCriterion("question39 not between", value1, value2, "question39");
            return (Criteria) this;
        }

        public Criteria andQuestion40IsNull() {
            addCriterion("question40 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion40IsNotNull() {
            addCriterion("question40 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion40EqualTo(String value) {
            addCriterion("question40 =", value, "question40");
            return (Criteria) this;
        }

        public Criteria andQuestion40NotEqualTo(String value) {
            addCriterion("question40 <>", value, "question40");
            return (Criteria) this;
        }

        public Criteria andQuestion40GreaterThan(String value) {
            addCriterion("question40 >", value, "question40");
            return (Criteria) this;
        }

        public Criteria andQuestion40GreaterThanOrEqualTo(String value) {
            addCriterion("question40 >=", value, "question40");
            return (Criteria) this;
        }

        public Criteria andQuestion40LessThan(String value) {
            addCriterion("question40 <", value, "question40");
            return (Criteria) this;
        }

        public Criteria andQuestion40LessThanOrEqualTo(String value) {
            addCriterion("question40 <=", value, "question40");
            return (Criteria) this;
        }

        public Criteria andQuestion40Like(String value) {
            addCriterion("question40 like", value, "question40");
            return (Criteria) this;
        }

        public Criteria andQuestion40NotLike(String value) {
            addCriterion("question40 not like", value, "question40");
            return (Criteria) this;
        }

        public Criteria andQuestion40In(List<String> values) {
            addCriterion("question40 in", values, "question40");
            return (Criteria) this;
        }

        public Criteria andQuestion40NotIn(List<String> values) {
            addCriterion("question40 not in", values, "question40");
            return (Criteria) this;
        }

        public Criteria andQuestion40Between(String value1, String value2) {
            addCriterion("question40 between", value1, value2, "question40");
            return (Criteria) this;
        }

        public Criteria andQuestion40NotBetween(String value1, String value2) {
            addCriterion("question40 not between", value1, value2, "question40");
            return (Criteria) this;
        }

        public Criteria andQuestion41IsNull() {
            addCriterion("question41 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion41IsNotNull() {
            addCriterion("question41 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion41EqualTo(String value) {
            addCriterion("question41 =", value, "question41");
            return (Criteria) this;
        }

        public Criteria andQuestion41NotEqualTo(String value) {
            addCriterion("question41 <>", value, "question41");
            return (Criteria) this;
        }

        public Criteria andQuestion41GreaterThan(String value) {
            addCriterion("question41 >", value, "question41");
            return (Criteria) this;
        }

        public Criteria andQuestion41GreaterThanOrEqualTo(String value) {
            addCriterion("question41 >=", value, "question41");
            return (Criteria) this;
        }

        public Criteria andQuestion41LessThan(String value) {
            addCriterion("question41 <", value, "question41");
            return (Criteria) this;
        }

        public Criteria andQuestion41LessThanOrEqualTo(String value) {
            addCriterion("question41 <=", value, "question41");
            return (Criteria) this;
        }

        public Criteria andQuestion41Like(String value) {
            addCriterion("question41 like", value, "question41");
            return (Criteria) this;
        }

        public Criteria andQuestion41NotLike(String value) {
            addCriterion("question41 not like", value, "question41");
            return (Criteria) this;
        }

        public Criteria andQuestion41In(List<String> values) {
            addCriterion("question41 in", values, "question41");
            return (Criteria) this;
        }

        public Criteria andQuestion41NotIn(List<String> values) {
            addCriterion("question41 not in", values, "question41");
            return (Criteria) this;
        }

        public Criteria andQuestion41Between(String value1, String value2) {
            addCriterion("question41 between", value1, value2, "question41");
            return (Criteria) this;
        }

        public Criteria andQuestion41NotBetween(String value1, String value2) {
            addCriterion("question41 not between", value1, value2, "question41");
            return (Criteria) this;
        }

        public Criteria andQuestion42IsNull() {
            addCriterion("question42 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion42IsNotNull() {
            addCriterion("question42 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion42EqualTo(String value) {
            addCriterion("question42 =", value, "question42");
            return (Criteria) this;
        }

        public Criteria andQuestion42NotEqualTo(String value) {
            addCriterion("question42 <>", value, "question42");
            return (Criteria) this;
        }

        public Criteria andQuestion42GreaterThan(String value) {
            addCriterion("question42 >", value, "question42");
            return (Criteria) this;
        }

        public Criteria andQuestion42GreaterThanOrEqualTo(String value) {
            addCriterion("question42 >=", value, "question42");
            return (Criteria) this;
        }

        public Criteria andQuestion42LessThan(String value) {
            addCriterion("question42 <", value, "question42");
            return (Criteria) this;
        }

        public Criteria andQuestion42LessThanOrEqualTo(String value) {
            addCriterion("question42 <=", value, "question42");
            return (Criteria) this;
        }

        public Criteria andQuestion42Like(String value) {
            addCriterion("question42 like", value, "question42");
            return (Criteria) this;
        }

        public Criteria andQuestion42NotLike(String value) {
            addCriterion("question42 not like", value, "question42");
            return (Criteria) this;
        }

        public Criteria andQuestion42In(List<String> values) {
            addCriterion("question42 in", values, "question42");
            return (Criteria) this;
        }

        public Criteria andQuestion42NotIn(List<String> values) {
            addCriterion("question42 not in", values, "question42");
            return (Criteria) this;
        }

        public Criteria andQuestion42Between(String value1, String value2) {
            addCriterion("question42 between", value1, value2, "question42");
            return (Criteria) this;
        }

        public Criteria andQuestion42NotBetween(String value1, String value2) {
            addCriterion("question42 not between", value1, value2, "question42");
            return (Criteria) this;
        }

        public Criteria andQuestion43IsNull() {
            addCriterion("question43 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion43IsNotNull() {
            addCriterion("question43 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion43EqualTo(String value) {
            addCriterion("question43 =", value, "question43");
            return (Criteria) this;
        }

        public Criteria andQuestion43NotEqualTo(String value) {
            addCriterion("question43 <>", value, "question43");
            return (Criteria) this;
        }

        public Criteria andQuestion43GreaterThan(String value) {
            addCriterion("question43 >", value, "question43");
            return (Criteria) this;
        }

        public Criteria andQuestion43GreaterThanOrEqualTo(String value) {
            addCriterion("question43 >=", value, "question43");
            return (Criteria) this;
        }

        public Criteria andQuestion43LessThan(String value) {
            addCriterion("question43 <", value, "question43");
            return (Criteria) this;
        }

        public Criteria andQuestion43LessThanOrEqualTo(String value) {
            addCriterion("question43 <=", value, "question43");
            return (Criteria) this;
        }

        public Criteria andQuestion43Like(String value) {
            addCriterion("question43 like", value, "question43");
            return (Criteria) this;
        }

        public Criteria andQuestion43NotLike(String value) {
            addCriterion("question43 not like", value, "question43");
            return (Criteria) this;
        }

        public Criteria andQuestion43In(List<String> values) {
            addCriterion("question43 in", values, "question43");
            return (Criteria) this;
        }

        public Criteria andQuestion43NotIn(List<String> values) {
            addCriterion("question43 not in", values, "question43");
            return (Criteria) this;
        }

        public Criteria andQuestion43Between(String value1, String value2) {
            addCriterion("question43 between", value1, value2, "question43");
            return (Criteria) this;
        }

        public Criteria andQuestion43NotBetween(String value1, String value2) {
            addCriterion("question43 not between", value1, value2, "question43");
            return (Criteria) this;
        }

        public Criteria andQuestion44IsNull() {
            addCriterion("question44 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion44IsNotNull() {
            addCriterion("question44 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion44EqualTo(String value) {
            addCriterion("question44 =", value, "question44");
            return (Criteria) this;
        }

        public Criteria andQuestion44NotEqualTo(String value) {
            addCriterion("question44 <>", value, "question44");
            return (Criteria) this;
        }

        public Criteria andQuestion44GreaterThan(String value) {
            addCriterion("question44 >", value, "question44");
            return (Criteria) this;
        }

        public Criteria andQuestion44GreaterThanOrEqualTo(String value) {
            addCriterion("question44 >=", value, "question44");
            return (Criteria) this;
        }

        public Criteria andQuestion44LessThan(String value) {
            addCriterion("question44 <", value, "question44");
            return (Criteria) this;
        }

        public Criteria andQuestion44LessThanOrEqualTo(String value) {
            addCriterion("question44 <=", value, "question44");
            return (Criteria) this;
        }

        public Criteria andQuestion44Like(String value) {
            addCriterion("question44 like", value, "question44");
            return (Criteria) this;
        }

        public Criteria andQuestion44NotLike(String value) {
            addCriterion("question44 not like", value, "question44");
            return (Criteria) this;
        }

        public Criteria andQuestion44In(List<String> values) {
            addCriterion("question44 in", values, "question44");
            return (Criteria) this;
        }

        public Criteria andQuestion44NotIn(List<String> values) {
            addCriterion("question44 not in", values, "question44");
            return (Criteria) this;
        }

        public Criteria andQuestion44Between(String value1, String value2) {
            addCriterion("question44 between", value1, value2, "question44");
            return (Criteria) this;
        }

        public Criteria andQuestion44NotBetween(String value1, String value2) {
            addCriterion("question44 not between", value1, value2, "question44");
            return (Criteria) this;
        }

        public Criteria andQuestion45IsNull() {
            addCriterion("question45 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion45IsNotNull() {
            addCriterion("question45 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion45EqualTo(String value) {
            addCriterion("question45 =", value, "question45");
            return (Criteria) this;
        }

        public Criteria andQuestion45NotEqualTo(String value) {
            addCriterion("question45 <>", value, "question45");
            return (Criteria) this;
        }

        public Criteria andQuestion45GreaterThan(String value) {
            addCriterion("question45 >", value, "question45");
            return (Criteria) this;
        }

        public Criteria andQuestion45GreaterThanOrEqualTo(String value) {
            addCriterion("question45 >=", value, "question45");
            return (Criteria) this;
        }

        public Criteria andQuestion45LessThan(String value) {
            addCriterion("question45 <", value, "question45");
            return (Criteria) this;
        }

        public Criteria andQuestion45LessThanOrEqualTo(String value) {
            addCriterion("question45 <=", value, "question45");
            return (Criteria) this;
        }

        public Criteria andQuestion45Like(String value) {
            addCriterion("question45 like", value, "question45");
            return (Criteria) this;
        }

        public Criteria andQuestion45NotLike(String value) {
            addCriterion("question45 not like", value, "question45");
            return (Criteria) this;
        }

        public Criteria andQuestion45In(List<String> values) {
            addCriterion("question45 in", values, "question45");
            return (Criteria) this;
        }

        public Criteria andQuestion45NotIn(List<String> values) {
            addCriterion("question45 not in", values, "question45");
            return (Criteria) this;
        }

        public Criteria andQuestion45Between(String value1, String value2) {
            addCriterion("question45 between", value1, value2, "question45");
            return (Criteria) this;
        }

        public Criteria andQuestion45NotBetween(String value1, String value2) {
            addCriterion("question45 not between", value1, value2, "question45");
            return (Criteria) this;
        }

        public Criteria andQuestion46IsNull() {
            addCriterion("question46 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion46IsNotNull() {
            addCriterion("question46 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion46EqualTo(String value) {
            addCriterion("question46 =", value, "question46");
            return (Criteria) this;
        }

        public Criteria andQuestion46NotEqualTo(String value) {
            addCriterion("question46 <>", value, "question46");
            return (Criteria) this;
        }

        public Criteria andQuestion46GreaterThan(String value) {
            addCriterion("question46 >", value, "question46");
            return (Criteria) this;
        }

        public Criteria andQuestion46GreaterThanOrEqualTo(String value) {
            addCriterion("question46 >=", value, "question46");
            return (Criteria) this;
        }

        public Criteria andQuestion46LessThan(String value) {
            addCriterion("question46 <", value, "question46");
            return (Criteria) this;
        }

        public Criteria andQuestion46LessThanOrEqualTo(String value) {
            addCriterion("question46 <=", value, "question46");
            return (Criteria) this;
        }

        public Criteria andQuestion46Like(String value) {
            addCriterion("question46 like", value, "question46");
            return (Criteria) this;
        }

        public Criteria andQuestion46NotLike(String value) {
            addCriterion("question46 not like", value, "question46");
            return (Criteria) this;
        }

        public Criteria andQuestion46In(List<String> values) {
            addCriterion("question46 in", values, "question46");
            return (Criteria) this;
        }

        public Criteria andQuestion46NotIn(List<String> values) {
            addCriterion("question46 not in", values, "question46");
            return (Criteria) this;
        }

        public Criteria andQuestion46Between(String value1, String value2) {
            addCriterion("question46 between", value1, value2, "question46");
            return (Criteria) this;
        }

        public Criteria andQuestion46NotBetween(String value1, String value2) {
            addCriterion("question46 not between", value1, value2, "question46");
            return (Criteria) this;
        }

        public Criteria andQuestion47IsNull() {
            addCriterion("question47 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion47IsNotNull() {
            addCriterion("question47 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion47EqualTo(String value) {
            addCriterion("question47 =", value, "question47");
            return (Criteria) this;
        }

        public Criteria andQuestion47NotEqualTo(String value) {
            addCriterion("question47 <>", value, "question47");
            return (Criteria) this;
        }

        public Criteria andQuestion47GreaterThan(String value) {
            addCriterion("question47 >", value, "question47");
            return (Criteria) this;
        }

        public Criteria andQuestion47GreaterThanOrEqualTo(String value) {
            addCriterion("question47 >=", value, "question47");
            return (Criteria) this;
        }

        public Criteria andQuestion47LessThan(String value) {
            addCriterion("question47 <", value, "question47");
            return (Criteria) this;
        }

        public Criteria andQuestion47LessThanOrEqualTo(String value) {
            addCriterion("question47 <=", value, "question47");
            return (Criteria) this;
        }

        public Criteria andQuestion47Like(String value) {
            addCriterion("question47 like", value, "question47");
            return (Criteria) this;
        }

        public Criteria andQuestion47NotLike(String value) {
            addCriterion("question47 not like", value, "question47");
            return (Criteria) this;
        }

        public Criteria andQuestion47In(List<String> values) {
            addCriterion("question47 in", values, "question47");
            return (Criteria) this;
        }

        public Criteria andQuestion47NotIn(List<String> values) {
            addCriterion("question47 not in", values, "question47");
            return (Criteria) this;
        }

        public Criteria andQuestion47Between(String value1, String value2) {
            addCriterion("question47 between", value1, value2, "question47");
            return (Criteria) this;
        }

        public Criteria andQuestion47NotBetween(String value1, String value2) {
            addCriterion("question47 not between", value1, value2, "question47");
            return (Criteria) this;
        }

        public Criteria andQuestion48IsNull() {
            addCriterion("question48 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion48IsNotNull() {
            addCriterion("question48 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion48EqualTo(String value) {
            addCriterion("question48 =", value, "question48");
            return (Criteria) this;
        }

        public Criteria andQuestion48NotEqualTo(String value) {
            addCriterion("question48 <>", value, "question48");
            return (Criteria) this;
        }

        public Criteria andQuestion48GreaterThan(String value) {
            addCriterion("question48 >", value, "question48");
            return (Criteria) this;
        }

        public Criteria andQuestion48GreaterThanOrEqualTo(String value) {
            addCriterion("question48 >=", value, "question48");
            return (Criteria) this;
        }

        public Criteria andQuestion48LessThan(String value) {
            addCriterion("question48 <", value, "question48");
            return (Criteria) this;
        }

        public Criteria andQuestion48LessThanOrEqualTo(String value) {
            addCriterion("question48 <=", value, "question48");
            return (Criteria) this;
        }

        public Criteria andQuestion48Like(String value) {
            addCriterion("question48 like", value, "question48");
            return (Criteria) this;
        }

        public Criteria andQuestion48NotLike(String value) {
            addCriterion("question48 not like", value, "question48");
            return (Criteria) this;
        }

        public Criteria andQuestion48In(List<String> values) {
            addCriterion("question48 in", values, "question48");
            return (Criteria) this;
        }

        public Criteria andQuestion48NotIn(List<String> values) {
            addCriterion("question48 not in", values, "question48");
            return (Criteria) this;
        }

        public Criteria andQuestion48Between(String value1, String value2) {
            addCriterion("question48 between", value1, value2, "question48");
            return (Criteria) this;
        }

        public Criteria andQuestion48NotBetween(String value1, String value2) {
            addCriterion("question48 not between", value1, value2, "question48");
            return (Criteria) this;
        }

        public Criteria andQuestion49IsNull() {
            addCriterion("question49 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion49IsNotNull() {
            addCriterion("question49 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion49EqualTo(String value) {
            addCriterion("question49 =", value, "question49");
            return (Criteria) this;
        }

        public Criteria andQuestion49NotEqualTo(String value) {
            addCriterion("question49 <>", value, "question49");
            return (Criteria) this;
        }

        public Criteria andQuestion49GreaterThan(String value) {
            addCriterion("question49 >", value, "question49");
            return (Criteria) this;
        }

        public Criteria andQuestion49GreaterThanOrEqualTo(String value) {
            addCriterion("question49 >=", value, "question49");
            return (Criteria) this;
        }

        public Criteria andQuestion49LessThan(String value) {
            addCriterion("question49 <", value, "question49");
            return (Criteria) this;
        }

        public Criteria andQuestion49LessThanOrEqualTo(String value) {
            addCriterion("question49 <=", value, "question49");
            return (Criteria) this;
        }

        public Criteria andQuestion49Like(String value) {
            addCriterion("question49 like", value, "question49");
            return (Criteria) this;
        }

        public Criteria andQuestion49NotLike(String value) {
            addCriterion("question49 not like", value, "question49");
            return (Criteria) this;
        }

        public Criteria andQuestion49In(List<String> values) {
            addCriterion("question49 in", values, "question49");
            return (Criteria) this;
        }

        public Criteria andQuestion49NotIn(List<String> values) {
            addCriterion("question49 not in", values, "question49");
            return (Criteria) this;
        }

        public Criteria andQuestion49Between(String value1, String value2) {
            addCriterion("question49 between", value1, value2, "question49");
            return (Criteria) this;
        }

        public Criteria andQuestion49NotBetween(String value1, String value2) {
            addCriterion("question49 not between", value1, value2, "question49");
            return (Criteria) this;
        }

        public Criteria andQuestion50IsNull() {
            addCriterion("question50 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion50IsNotNull() {
            addCriterion("question50 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion50EqualTo(String value) {
            addCriterion("question50 =", value, "question50");
            return (Criteria) this;
        }

        public Criteria andQuestion50NotEqualTo(String value) {
            addCriterion("question50 <>", value, "question50");
            return (Criteria) this;
        }

        public Criteria andQuestion50GreaterThan(String value) {
            addCriterion("question50 >", value, "question50");
            return (Criteria) this;
        }

        public Criteria andQuestion50GreaterThanOrEqualTo(String value) {
            addCriterion("question50 >=", value, "question50");
            return (Criteria) this;
        }

        public Criteria andQuestion50LessThan(String value) {
            addCriterion("question50 <", value, "question50");
            return (Criteria) this;
        }

        public Criteria andQuestion50LessThanOrEqualTo(String value) {
            addCriterion("question50 <=", value, "question50");
            return (Criteria) this;
        }

        public Criteria andQuestion50Like(String value) {
            addCriterion("question50 like", value, "question50");
            return (Criteria) this;
        }

        public Criteria andQuestion50NotLike(String value) {
            addCriterion("question50 not like", value, "question50");
            return (Criteria) this;
        }

        public Criteria andQuestion50In(List<String> values) {
            addCriterion("question50 in", values, "question50");
            return (Criteria) this;
        }

        public Criteria andQuestion50NotIn(List<String> values) {
            addCriterion("question50 not in", values, "question50");
            return (Criteria) this;
        }

        public Criteria andQuestion50Between(String value1, String value2) {
            addCriterion("question50 between", value1, value2, "question50");
            return (Criteria) this;
        }

        public Criteria andQuestion50NotBetween(String value1, String value2) {
            addCriterion("question50 not between", value1, value2, "question50");
            return (Criteria) this;
        }

        public Criteria andQuestion51IsNull() {
            addCriterion("question51 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion51IsNotNull() {
            addCriterion("question51 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion51EqualTo(String value) {
            addCriterion("question51 =", value, "question51");
            return (Criteria) this;
        }

        public Criteria andQuestion51NotEqualTo(String value) {
            addCriterion("question51 <>", value, "question51");
            return (Criteria) this;
        }

        public Criteria andQuestion51GreaterThan(String value) {
            addCriterion("question51 >", value, "question51");
            return (Criteria) this;
        }

        public Criteria andQuestion51GreaterThanOrEqualTo(String value) {
            addCriterion("question51 >=", value, "question51");
            return (Criteria) this;
        }

        public Criteria andQuestion51LessThan(String value) {
            addCriterion("question51 <", value, "question51");
            return (Criteria) this;
        }

        public Criteria andQuestion51LessThanOrEqualTo(String value) {
            addCriterion("question51 <=", value, "question51");
            return (Criteria) this;
        }

        public Criteria andQuestion51Like(String value) {
            addCriterion("question51 like", value, "question51");
            return (Criteria) this;
        }

        public Criteria andQuestion51NotLike(String value) {
            addCriterion("question51 not like", value, "question51");
            return (Criteria) this;
        }

        public Criteria andQuestion51In(List<String> values) {
            addCriterion("question51 in", values, "question51");
            return (Criteria) this;
        }

        public Criteria andQuestion51NotIn(List<String> values) {
            addCriterion("question51 not in", values, "question51");
            return (Criteria) this;
        }

        public Criteria andQuestion51Between(String value1, String value2) {
            addCriterion("question51 between", value1, value2, "question51");
            return (Criteria) this;
        }

        public Criteria andQuestion51NotBetween(String value1, String value2) {
            addCriterion("question51 not between", value1, value2, "question51");
            return (Criteria) this;
        }

        public Criteria andQuestion52IsNull() {
            addCriterion("question52 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion52IsNotNull() {
            addCriterion("question52 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion52EqualTo(String value) {
            addCriterion("question52 =", value, "question52");
            return (Criteria) this;
        }

        public Criteria andQuestion52NotEqualTo(String value) {
            addCriterion("question52 <>", value, "question52");
            return (Criteria) this;
        }

        public Criteria andQuestion52GreaterThan(String value) {
            addCriterion("question52 >", value, "question52");
            return (Criteria) this;
        }

        public Criteria andQuestion52GreaterThanOrEqualTo(String value) {
            addCriterion("question52 >=", value, "question52");
            return (Criteria) this;
        }

        public Criteria andQuestion52LessThan(String value) {
            addCriterion("question52 <", value, "question52");
            return (Criteria) this;
        }

        public Criteria andQuestion52LessThanOrEqualTo(String value) {
            addCriterion("question52 <=", value, "question52");
            return (Criteria) this;
        }

        public Criteria andQuestion52Like(String value) {
            addCriterion("question52 like", value, "question52");
            return (Criteria) this;
        }

        public Criteria andQuestion52NotLike(String value) {
            addCriterion("question52 not like", value, "question52");
            return (Criteria) this;
        }

        public Criteria andQuestion52In(List<String> values) {
            addCriterion("question52 in", values, "question52");
            return (Criteria) this;
        }

        public Criteria andQuestion52NotIn(List<String> values) {
            addCriterion("question52 not in", values, "question52");
            return (Criteria) this;
        }

        public Criteria andQuestion52Between(String value1, String value2) {
            addCriterion("question52 between", value1, value2, "question52");
            return (Criteria) this;
        }

        public Criteria andQuestion52NotBetween(String value1, String value2) {
            addCriterion("question52 not between", value1, value2, "question52");
            return (Criteria) this;
        }

        public Criteria andQuestion53IsNull() {
            addCriterion("question53 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion53IsNotNull() {
            addCriterion("question53 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion53EqualTo(String value) {
            addCriterion("question53 =", value, "question53");
            return (Criteria) this;
        }

        public Criteria andQuestion53NotEqualTo(String value) {
            addCriterion("question53 <>", value, "question53");
            return (Criteria) this;
        }

        public Criteria andQuestion53GreaterThan(String value) {
            addCriterion("question53 >", value, "question53");
            return (Criteria) this;
        }

        public Criteria andQuestion53GreaterThanOrEqualTo(String value) {
            addCriterion("question53 >=", value, "question53");
            return (Criteria) this;
        }

        public Criteria andQuestion53LessThan(String value) {
            addCriterion("question53 <", value, "question53");
            return (Criteria) this;
        }

        public Criteria andQuestion53LessThanOrEqualTo(String value) {
            addCriterion("question53 <=", value, "question53");
            return (Criteria) this;
        }

        public Criteria andQuestion53Like(String value) {
            addCriterion("question53 like", value, "question53");
            return (Criteria) this;
        }

        public Criteria andQuestion53NotLike(String value) {
            addCriterion("question53 not like", value, "question53");
            return (Criteria) this;
        }

        public Criteria andQuestion53In(List<String> values) {
            addCriterion("question53 in", values, "question53");
            return (Criteria) this;
        }

        public Criteria andQuestion53NotIn(List<String> values) {
            addCriterion("question53 not in", values, "question53");
            return (Criteria) this;
        }

        public Criteria andQuestion53Between(String value1, String value2) {
            addCriterion("question53 between", value1, value2, "question53");
            return (Criteria) this;
        }

        public Criteria andQuestion53NotBetween(String value1, String value2) {
            addCriterion("question53 not between", value1, value2, "question53");
            return (Criteria) this;
        }

        public Criteria andQuestion54IsNull() {
            addCriterion("question54 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion54IsNotNull() {
            addCriterion("question54 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion54EqualTo(String value) {
            addCriterion("question54 =", value, "question54");
            return (Criteria) this;
        }

        public Criteria andQuestion54NotEqualTo(String value) {
            addCriterion("question54 <>", value, "question54");
            return (Criteria) this;
        }

        public Criteria andQuestion54GreaterThan(String value) {
            addCriterion("question54 >", value, "question54");
            return (Criteria) this;
        }

        public Criteria andQuestion54GreaterThanOrEqualTo(String value) {
            addCriterion("question54 >=", value, "question54");
            return (Criteria) this;
        }

        public Criteria andQuestion54LessThan(String value) {
            addCriterion("question54 <", value, "question54");
            return (Criteria) this;
        }

        public Criteria andQuestion54LessThanOrEqualTo(String value) {
            addCriterion("question54 <=", value, "question54");
            return (Criteria) this;
        }

        public Criteria andQuestion54Like(String value) {
            addCriterion("question54 like", value, "question54");
            return (Criteria) this;
        }

        public Criteria andQuestion54NotLike(String value) {
            addCriterion("question54 not like", value, "question54");
            return (Criteria) this;
        }

        public Criteria andQuestion54In(List<String> values) {
            addCriterion("question54 in", values, "question54");
            return (Criteria) this;
        }

        public Criteria andQuestion54NotIn(List<String> values) {
            addCriterion("question54 not in", values, "question54");
            return (Criteria) this;
        }

        public Criteria andQuestion54Between(String value1, String value2) {
            addCriterion("question54 between", value1, value2, "question54");
            return (Criteria) this;
        }

        public Criteria andQuestion54NotBetween(String value1, String value2) {
            addCriterion("question54 not between", value1, value2, "question54");
            return (Criteria) this;
        }

        public Criteria andQuestion55IsNull() {
            addCriterion("question55 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion55IsNotNull() {
            addCriterion("question55 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion55EqualTo(String value) {
            addCriterion("question55 =", value, "question55");
            return (Criteria) this;
        }

        public Criteria andQuestion55NotEqualTo(String value) {
            addCriterion("question55 <>", value, "question55");
            return (Criteria) this;
        }

        public Criteria andQuestion55GreaterThan(String value) {
            addCriterion("question55 >", value, "question55");
            return (Criteria) this;
        }

        public Criteria andQuestion55GreaterThanOrEqualTo(String value) {
            addCriterion("question55 >=", value, "question55");
            return (Criteria) this;
        }

        public Criteria andQuestion55LessThan(String value) {
            addCriterion("question55 <", value, "question55");
            return (Criteria) this;
        }

        public Criteria andQuestion55LessThanOrEqualTo(String value) {
            addCriterion("question55 <=", value, "question55");
            return (Criteria) this;
        }

        public Criteria andQuestion55Like(String value) {
            addCriterion("question55 like", value, "question55");
            return (Criteria) this;
        }

        public Criteria andQuestion55NotLike(String value) {
            addCriterion("question55 not like", value, "question55");
            return (Criteria) this;
        }

        public Criteria andQuestion55In(List<String> values) {
            addCriterion("question55 in", values, "question55");
            return (Criteria) this;
        }

        public Criteria andQuestion55NotIn(List<String> values) {
            addCriterion("question55 not in", values, "question55");
            return (Criteria) this;
        }

        public Criteria andQuestion55Between(String value1, String value2) {
            addCriterion("question55 between", value1, value2, "question55");
            return (Criteria) this;
        }

        public Criteria andQuestion55NotBetween(String value1, String value2) {
            addCriterion("question55 not between", value1, value2, "question55");
            return (Criteria) this;
        }

        public Criteria andQuestion56IsNull() {
            addCriterion("question56 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion56IsNotNull() {
            addCriterion("question56 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion56EqualTo(String value) {
            addCriterion("question56 =", value, "question56");
            return (Criteria) this;
        }

        public Criteria andQuestion56NotEqualTo(String value) {
            addCriterion("question56 <>", value, "question56");
            return (Criteria) this;
        }

        public Criteria andQuestion56GreaterThan(String value) {
            addCriterion("question56 >", value, "question56");
            return (Criteria) this;
        }

        public Criteria andQuestion56GreaterThanOrEqualTo(String value) {
            addCriterion("question56 >=", value, "question56");
            return (Criteria) this;
        }

        public Criteria andQuestion56LessThan(String value) {
            addCriterion("question56 <", value, "question56");
            return (Criteria) this;
        }

        public Criteria andQuestion56LessThanOrEqualTo(String value) {
            addCriterion("question56 <=", value, "question56");
            return (Criteria) this;
        }

        public Criteria andQuestion56Like(String value) {
            addCriterion("question56 like", value, "question56");
            return (Criteria) this;
        }

        public Criteria andQuestion56NotLike(String value) {
            addCriterion("question56 not like", value, "question56");
            return (Criteria) this;
        }

        public Criteria andQuestion56In(List<String> values) {
            addCriterion("question56 in", values, "question56");
            return (Criteria) this;
        }

        public Criteria andQuestion56NotIn(List<String> values) {
            addCriterion("question56 not in", values, "question56");
            return (Criteria) this;
        }

        public Criteria andQuestion56Between(String value1, String value2) {
            addCriterion("question56 between", value1, value2, "question56");
            return (Criteria) this;
        }

        public Criteria andQuestion56NotBetween(String value1, String value2) {
            addCriterion("question56 not between", value1, value2, "question56");
            return (Criteria) this;
        }

        public Criteria andQuestion57IsNull() {
            addCriterion("question57 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion57IsNotNull() {
            addCriterion("question57 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion57EqualTo(String value) {
            addCriterion("question57 =", value, "question57");
            return (Criteria) this;
        }

        public Criteria andQuestion57NotEqualTo(String value) {
            addCriterion("question57 <>", value, "question57");
            return (Criteria) this;
        }

        public Criteria andQuestion57GreaterThan(String value) {
            addCriterion("question57 >", value, "question57");
            return (Criteria) this;
        }

        public Criteria andQuestion57GreaterThanOrEqualTo(String value) {
            addCriterion("question57 >=", value, "question57");
            return (Criteria) this;
        }

        public Criteria andQuestion57LessThan(String value) {
            addCriterion("question57 <", value, "question57");
            return (Criteria) this;
        }

        public Criteria andQuestion57LessThanOrEqualTo(String value) {
            addCriterion("question57 <=", value, "question57");
            return (Criteria) this;
        }

        public Criteria andQuestion57Like(String value) {
            addCriterion("question57 like", value, "question57");
            return (Criteria) this;
        }

        public Criteria andQuestion57NotLike(String value) {
            addCriterion("question57 not like", value, "question57");
            return (Criteria) this;
        }

        public Criteria andQuestion57In(List<String> values) {
            addCriterion("question57 in", values, "question57");
            return (Criteria) this;
        }

        public Criteria andQuestion57NotIn(List<String> values) {
            addCriterion("question57 not in", values, "question57");
            return (Criteria) this;
        }

        public Criteria andQuestion57Between(String value1, String value2) {
            addCriterion("question57 between", value1, value2, "question57");
            return (Criteria) this;
        }

        public Criteria andQuestion57NotBetween(String value1, String value2) {
            addCriterion("question57 not between", value1, value2, "question57");
            return (Criteria) this;
        }

        public Criteria andQuestionSumIsNull() {
            addCriterion("question_sum is null");
            return (Criteria) this;
        }

        public Criteria andQuestionSumIsNotNull() {
            addCriterion("question_sum is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionSumEqualTo(Integer value) {
            addCriterion("question_sum =", value, "questionSum");
            return (Criteria) this;
        }

        public Criteria andQuestionSumNotEqualTo(Integer value) {
            addCriterion("question_sum <>", value, "questionSum");
            return (Criteria) this;
        }

        public Criteria andQuestionSumGreaterThan(Integer value) {
            addCriterion("question_sum >", value, "questionSum");
            return (Criteria) this;
        }

        public Criteria andQuestionSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_sum >=", value, "questionSum");
            return (Criteria) this;
        }

        public Criteria andQuestionSumLessThan(Integer value) {
            addCriterion("question_sum <", value, "questionSum");
            return (Criteria) this;
        }

        public Criteria andQuestionSumLessThanOrEqualTo(Integer value) {
            addCriterion("question_sum <=", value, "questionSum");
            return (Criteria) this;
        }

        public Criteria andQuestionSumIn(List<Integer> values) {
            addCriterion("question_sum in", values, "questionSum");
            return (Criteria) this;
        }

        public Criteria andQuestionSumNotIn(List<Integer> values) {
            addCriterion("question_sum not in", values, "questionSum");
            return (Criteria) this;
        }

        public Criteria andQuestionSumBetween(Integer value1, Integer value2) {
            addCriterion("question_sum between", value1, value2, "questionSum");
            return (Criteria) this;
        }

        public Criteria andQuestionSumNotBetween(Integer value1, Integer value2) {
            addCriterion("question_sum not between", value1, value2, "questionSum");
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