package team.managementplatform.pojo;

import java.util.ArrayList;
import java.util.List;

public class QualificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public QualificationExample() {
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

        public Criteria andQualificationIdIsNull() {
            addCriterion("qualification_id is null");
            return (Criteria) this;
        }

        public Criteria andQualificationIdIsNotNull() {
            addCriterion("qualification_id is not null");
            return (Criteria) this;
        }

        public Criteria andQualificationIdEqualTo(Integer value) {
            addCriterion("qualification_id =", value, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdNotEqualTo(Integer value) {
            addCriterion("qualification_id <>", value, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdGreaterThan(Integer value) {
            addCriterion("qualification_id >", value, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("qualification_id >=", value, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdLessThan(Integer value) {
            addCriterion("qualification_id <", value, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdLessThanOrEqualTo(Integer value) {
            addCriterion("qualification_id <=", value, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdIn(List<Integer> values) {
            addCriterion("qualification_id in", values, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdNotIn(List<Integer> values) {
            addCriterion("qualification_id not in", values, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdBetween(Integer value1, Integer value2) {
            addCriterion("qualification_id between", value1, value2, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("qualification_id not between", value1, value2, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andInstitutionIdIsNull() {
            addCriterion("institution_id is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionIdIsNotNull() {
            addCriterion("institution_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionIdEqualTo(Integer value) {
            addCriterion("institution_id =", value, "institutionId");
            return (Criteria) this;
        }

        public Criteria andInstitutionIdNotEqualTo(Integer value) {
            addCriterion("institution_id <>", value, "institutionId");
            return (Criteria) this;
        }

        public Criteria andInstitutionIdGreaterThan(Integer value) {
            addCriterion("institution_id >", value, "institutionId");
            return (Criteria) this;
        }

        public Criteria andInstitutionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("institution_id >=", value, "institutionId");
            return (Criteria) this;
        }

        public Criteria andInstitutionIdLessThan(Integer value) {
            addCriterion("institution_id <", value, "institutionId");
            return (Criteria) this;
        }

        public Criteria andInstitutionIdLessThanOrEqualTo(Integer value) {
            addCriterion("institution_id <=", value, "institutionId");
            return (Criteria) this;
        }

        public Criteria andInstitutionIdIn(List<Integer> values) {
            addCriterion("institution_id in", values, "institutionId");
            return (Criteria) this;
        }

        public Criteria andInstitutionIdNotIn(List<Integer> values) {
            addCriterion("institution_id not in", values, "institutionId");
            return (Criteria) this;
        }

        public Criteria andInstitutionIdBetween(Integer value1, Integer value2) {
            addCriterion("institution_id between", value1, value2, "institutionId");
            return (Criteria) this;
        }

        public Criteria andInstitutionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("institution_id not between", value1, value2, "institutionId");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
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