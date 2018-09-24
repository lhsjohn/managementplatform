package team.managementplatform.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityAppraisalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ActivityAppraisalExample() {
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

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
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

        public Criteria andAppraisalIdIsNull() {
            addCriterion("appraisal_id is null");
            return (Criteria) this;
        }

        public Criteria andAppraisalIdIsNotNull() {
            addCriterion("appraisal_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppraisalIdEqualTo(Integer value) {
            addCriterion("appraisal_id =", value, "appraisalId");
            return (Criteria) this;
        }

        public Criteria andAppraisalIdNotEqualTo(Integer value) {
            addCriterion("appraisal_id <>", value, "appraisalId");
            return (Criteria) this;
        }

        public Criteria andAppraisalIdGreaterThan(Integer value) {
            addCriterion("appraisal_id >", value, "appraisalId");
            return (Criteria) this;
        }

        public Criteria andAppraisalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("appraisal_id >=", value, "appraisalId");
            return (Criteria) this;
        }

        public Criteria andAppraisalIdLessThan(Integer value) {
            addCriterion("appraisal_id <", value, "appraisalId");
            return (Criteria) this;
        }

        public Criteria andAppraisalIdLessThanOrEqualTo(Integer value) {
            addCriterion("appraisal_id <=", value, "appraisalId");
            return (Criteria) this;
        }

        public Criteria andAppraisalIdIn(List<Integer> values) {
            addCriterion("appraisal_id in", values, "appraisalId");
            return (Criteria) this;
        }

        public Criteria andAppraisalIdNotIn(List<Integer> values) {
            addCriterion("appraisal_id not in", values, "appraisalId");
            return (Criteria) this;
        }

        public Criteria andAppraisalIdBetween(Integer value1, Integer value2) {
            addCriterion("appraisal_id between", value1, value2, "appraisalId");
            return (Criteria) this;
        }

        public Criteria andAppraisalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("appraisal_id not between", value1, value2, "appraisalId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAppraisalTimeIsNull() {
            addCriterion("appraisal_time is null");
            return (Criteria) this;
        }

        public Criteria andAppraisalTimeIsNotNull() {
            addCriterion("appraisal_time is not null");
            return (Criteria) this;
        }

        public Criteria andAppraisalTimeEqualTo(Date value) {
            addCriterion("appraisal_time =", value, "appraisalTime");
            return (Criteria) this;
        }

        public Criteria andAppraisalTimeNotEqualTo(Date value) {
            addCriterion("appraisal_time <>", value, "appraisalTime");
            return (Criteria) this;
        }

        public Criteria andAppraisalTimeGreaterThan(Date value) {
            addCriterion("appraisal_time >", value, "appraisalTime");
            return (Criteria) this;
        }

        public Criteria andAppraisalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("appraisal_time >=", value, "appraisalTime");
            return (Criteria) this;
        }

        public Criteria andAppraisalTimeLessThan(Date value) {
            addCriterion("appraisal_time <", value, "appraisalTime");
            return (Criteria) this;
        }

        public Criteria andAppraisalTimeLessThanOrEqualTo(Date value) {
            addCriterion("appraisal_time <=", value, "appraisalTime");
            return (Criteria) this;
        }

        public Criteria andAppraisalTimeIn(List<Date> values) {
            addCriterion("appraisal_time in", values, "appraisalTime");
            return (Criteria) this;
        }

        public Criteria andAppraisalTimeNotIn(List<Date> values) {
            addCriterion("appraisal_time not in", values, "appraisalTime");
            return (Criteria) this;
        }

        public Criteria andAppraisalTimeBetween(Date value1, Date value2) {
            addCriterion("appraisal_time between", value1, value2, "appraisalTime");
            return (Criteria) this;
        }

        public Criteria andAppraisalTimeNotBetween(Date value1, Date value2) {
            addCriterion("appraisal_time not between", value1, value2, "appraisalTime");
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