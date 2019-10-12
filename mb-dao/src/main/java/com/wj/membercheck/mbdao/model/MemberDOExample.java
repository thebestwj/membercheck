package com.wj.membercheck.mbdao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberDOExample() {
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

        public Criteria andMemIdIsNull() {
            addCriterion("mem_id is null");
            return (Criteria) this;
        }

        public Criteria andMemIdIsNotNull() {
            addCriterion("mem_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemIdEqualTo(Integer value) {
            addCriterion("mem_id =", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotEqualTo(Integer value) {
            addCriterion("mem_id <>", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdGreaterThan(Integer value) {
            addCriterion("mem_id >", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mem_id >=", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdLessThan(Integer value) {
            addCriterion("mem_id <", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdLessThanOrEqualTo(Integer value) {
            addCriterion("mem_id <=", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdIn(List<Integer> values) {
            addCriterion("mem_id in", values, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotIn(List<Integer> values) {
            addCriterion("mem_id not in", values, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdBetween(Integer value1, Integer value2) {
            addCriterion("mem_id between", value1, value2, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mem_id not between", value1, value2, "memId");
            return (Criteria) this;
        }

        public Criteria andMemNameIsNull() {
            addCriterion("mem_name is null");
            return (Criteria) this;
        }

        public Criteria andMemNameIsNotNull() {
            addCriterion("mem_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemNameEqualTo(String value) {
            addCriterion("mem_name =", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotEqualTo(String value) {
            addCriterion("mem_name <>", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameGreaterThan(String value) {
            addCriterion("mem_name >", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameGreaterThanOrEqualTo(String value) {
            addCriterion("mem_name >=", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameLessThan(String value) {
            addCriterion("mem_name <", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameLessThanOrEqualTo(String value) {
            addCriterion("mem_name <=", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameLike(String value) {
            addCriterion("mem_name like", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotLike(String value) {
            addCriterion("mem_name not like", value, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameIn(List<String> values) {
            addCriterion("mem_name in", values, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotIn(List<String> values) {
            addCriterion("mem_name not in", values, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameBetween(String value1, String value2) {
            addCriterion("mem_name between", value1, value2, "memName");
            return (Criteria) this;
        }

        public Criteria andMemNameNotBetween(String value1, String value2) {
            addCriterion("mem_name not between", value1, value2, "memName");
            return (Criteria) this;
        }

        public Criteria andMemScoreIsNull() {
            addCriterion("mem_score is null");
            return (Criteria) this;
        }

        public Criteria andMemScoreIsNotNull() {
            addCriterion("mem_score is not null");
            return (Criteria) this;
        }

        public Criteria andMemScoreEqualTo(Double value) {
            addCriterion("mem_score =", value, "memScore");
            return (Criteria) this;
        }

        public Criteria andMemScoreNotEqualTo(Double value) {
            addCriterion("mem_score <>", value, "memScore");
            return (Criteria) this;
        }

        public Criteria andMemScoreGreaterThan(Double value) {
            addCriterion("mem_score >", value, "memScore");
            return (Criteria) this;
        }

        public Criteria andMemScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("mem_score >=", value, "memScore");
            return (Criteria) this;
        }

        public Criteria andMemScoreLessThan(Double value) {
            addCriterion("mem_score <", value, "memScore");
            return (Criteria) this;
        }

        public Criteria andMemScoreLessThanOrEqualTo(Double value) {
            addCriterion("mem_score <=", value, "memScore");
            return (Criteria) this;
        }

        public Criteria andMemScoreIn(List<Double> values) {
            addCriterion("mem_score in", values, "memScore");
            return (Criteria) this;
        }

        public Criteria andMemScoreNotIn(List<Double> values) {
            addCriterion("mem_score not in", values, "memScore");
            return (Criteria) this;
        }

        public Criteria andMemScoreBetween(Double value1, Double value2) {
            addCriterion("mem_score between", value1, value2, "memScore");
            return (Criteria) this;
        }

        public Criteria andMemScoreNotBetween(Double value1, Double value2) {
            addCriterion("mem_score not between", value1, value2, "memScore");
            return (Criteria) this;
        }

        public Criteria andMemCtimeIsNull() {
            addCriterion("mem_ctime is null");
            return (Criteria) this;
        }

        public Criteria andMemCtimeIsNotNull() {
            addCriterion("mem_ctime is not null");
            return (Criteria) this;
        }

        public Criteria andMemCtimeEqualTo(Date value) {
            addCriterion("mem_ctime =", value, "memCtime");
            return (Criteria) this;
        }

        public Criteria andMemCtimeNotEqualTo(Date value) {
            addCriterion("mem_ctime <>", value, "memCtime");
            return (Criteria) this;
        }

        public Criteria andMemCtimeGreaterThan(Date value) {
            addCriterion("mem_ctime >", value, "memCtime");
            return (Criteria) this;
        }

        public Criteria andMemCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mem_ctime >=", value, "memCtime");
            return (Criteria) this;
        }

        public Criteria andMemCtimeLessThan(Date value) {
            addCriterion("mem_ctime <", value, "memCtime");
            return (Criteria) this;
        }

        public Criteria andMemCtimeLessThanOrEqualTo(Date value) {
            addCriterion("mem_ctime <=", value, "memCtime");
            return (Criteria) this;
        }

        public Criteria andMemCtimeIn(List<Date> values) {
            addCriterion("mem_ctime in", values, "memCtime");
            return (Criteria) this;
        }

        public Criteria andMemCtimeNotIn(List<Date> values) {
            addCriterion("mem_ctime not in", values, "memCtime");
            return (Criteria) this;
        }

        public Criteria andMemCtimeBetween(Date value1, Date value2) {
            addCriterion("mem_ctime between", value1, value2, "memCtime");
            return (Criteria) this;
        }

        public Criteria andMemCtimeNotBetween(Date value1, Date value2) {
            addCriterion("mem_ctime not between", value1, value2, "memCtime");
            return (Criteria) this;
        }

        public Criteria andMemRoleIsNull() {
            addCriterion("mem_role is null");
            return (Criteria) this;
        }

        public Criteria andMemRoleIsNotNull() {
            addCriterion("mem_role is not null");
            return (Criteria) this;
        }

        public Criteria andMemRoleEqualTo(String value) {
            addCriterion("mem_role =", value, "memRole");
            return (Criteria) this;
        }

        public Criteria andMemRoleNotEqualTo(String value) {
            addCriterion("mem_role <>", value, "memRole");
            return (Criteria) this;
        }

        public Criteria andMemRoleGreaterThan(String value) {
            addCriterion("mem_role >", value, "memRole");
            return (Criteria) this;
        }

        public Criteria andMemRoleGreaterThanOrEqualTo(String value) {
            addCriterion("mem_role >=", value, "memRole");
            return (Criteria) this;
        }

        public Criteria andMemRoleLessThan(String value) {
            addCriterion("mem_role <", value, "memRole");
            return (Criteria) this;
        }

        public Criteria andMemRoleLessThanOrEqualTo(String value) {
            addCriterion("mem_role <=", value, "memRole");
            return (Criteria) this;
        }

        public Criteria andMemRoleLike(String value) {
            addCriterion("mem_role like", value, "memRole");
            return (Criteria) this;
        }

        public Criteria andMemRoleNotLike(String value) {
            addCriterion("mem_role not like", value, "memRole");
            return (Criteria) this;
        }

        public Criteria andMemRoleIn(List<String> values) {
            addCriterion("mem_role in", values, "memRole");
            return (Criteria) this;
        }

        public Criteria andMemRoleNotIn(List<String> values) {
            addCriterion("mem_role not in", values, "memRole");
            return (Criteria) this;
        }

        public Criteria andMemRoleBetween(String value1, String value2) {
            addCriterion("mem_role between", value1, value2, "memRole");
            return (Criteria) this;
        }

        public Criteria andMemRoleNotBetween(String value1, String value2) {
            addCriterion("mem_role not between", value1, value2, "memRole");
            return (Criteria) this;
        }

        public Criteria andMemPwIsNull() {
            addCriterion("mem_pw is null");
            return (Criteria) this;
        }

        public Criteria andMemPwIsNotNull() {
            addCriterion("mem_pw is not null");
            return (Criteria) this;
        }

        public Criteria andMemPwEqualTo(String value) {
            addCriterion("mem_pw =", value, "memPw");
            return (Criteria) this;
        }

        public Criteria andMemPwNotEqualTo(String value) {
            addCriterion("mem_pw <>", value, "memPw");
            return (Criteria) this;
        }

        public Criteria andMemPwGreaterThan(String value) {
            addCriterion("mem_pw >", value, "memPw");
            return (Criteria) this;
        }

        public Criteria andMemPwGreaterThanOrEqualTo(String value) {
            addCriterion("mem_pw >=", value, "memPw");
            return (Criteria) this;
        }

        public Criteria andMemPwLessThan(String value) {
            addCriterion("mem_pw <", value, "memPw");
            return (Criteria) this;
        }

        public Criteria andMemPwLessThanOrEqualTo(String value) {
            addCriterion("mem_pw <=", value, "memPw");
            return (Criteria) this;
        }

        public Criteria andMemPwLike(String value) {
            addCriterion("mem_pw like", value, "memPw");
            return (Criteria) this;
        }

        public Criteria andMemPwNotLike(String value) {
            addCriterion("mem_pw not like", value, "memPw");
            return (Criteria) this;
        }

        public Criteria andMemPwIn(List<String> values) {
            addCriterion("mem_pw in", values, "memPw");
            return (Criteria) this;
        }

        public Criteria andMemPwNotIn(List<String> values) {
            addCriterion("mem_pw not in", values, "memPw");
            return (Criteria) this;
        }

        public Criteria andMemPwBetween(String value1, String value2) {
            addCriterion("mem_pw between", value1, value2, "memPw");
            return (Criteria) this;
        }

        public Criteria andMemPwNotBetween(String value1, String value2) {
            addCriterion("mem_pw not between", value1, value2, "memPw");
            return (Criteria) this;
        }
    }

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