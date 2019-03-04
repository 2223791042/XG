package mr.s.entity;

import java.util.ArrayList;
import java.util.List;

public class PermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PermissionExample() {
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

        public Criteria andPermissionIdIsNull() {
            addCriterion("PermissionId is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIsNotNull() {
            addCriterion("PermissionId is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdEqualTo(Long value) {
            addCriterion("PermissionId =", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotEqualTo(Long value) {
            addCriterion("PermissionId <>", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThan(Long value) {
            addCriterion("PermissionId >", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PermissionId >=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThan(Long value) {
            addCriterion("PermissionId <", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThanOrEqualTo(Long value) {
            addCriterion("PermissionId <=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIn(List<Long> values) {
            addCriterion("PermissionId in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotIn(List<Long> values) {
            addCriterion("PermissionId not in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdBetween(Long value1, Long value2) {
            addCriterion("PermissionId between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotBetween(Long value1, Long value2) {
            addCriterion("PermissionId not between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIsNull() {
            addCriterion("PermissionName is null");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIsNotNull() {
            addCriterion("PermissionName is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionNameEqualTo(String value) {
            addCriterion("PermissionName =", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotEqualTo(String value) {
            addCriterion("PermissionName <>", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameGreaterThan(String value) {
            addCriterion("PermissionName >", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameGreaterThanOrEqualTo(String value) {
            addCriterion("PermissionName >=", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLessThan(String value) {
            addCriterion("PermissionName <", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLessThanOrEqualTo(String value) {
            addCriterion("PermissionName <=", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLike(String value) {
            addCriterion("PermissionName like", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotLike(String value) {
            addCriterion("PermissionName not like", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIn(List<String> values) {
            addCriterion("PermissionName in", values, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotIn(List<String> values) {
            addCriterion("PermissionName not in", values, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameBetween(String value1, String value2) {
            addCriterion("PermissionName between", value1, value2, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotBetween(String value1, String value2) {
            addCriterion("PermissionName not between", value1, value2, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionDescIsNull() {
            addCriterion("PermissionDesc is null");
            return (Criteria) this;
        }

        public Criteria andPermissionDescIsNotNull() {
            addCriterion("PermissionDesc is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionDescEqualTo(String value) {
            addCriterion("PermissionDesc =", value, "permissionDesc");
            return (Criteria) this;
        }

        public Criteria andPermissionDescNotEqualTo(String value) {
            addCriterion("PermissionDesc <>", value, "permissionDesc");
            return (Criteria) this;
        }

        public Criteria andPermissionDescGreaterThan(String value) {
            addCriterion("PermissionDesc >", value, "permissionDesc");
            return (Criteria) this;
        }

        public Criteria andPermissionDescGreaterThanOrEqualTo(String value) {
            addCriterion("PermissionDesc >=", value, "permissionDesc");
            return (Criteria) this;
        }

        public Criteria andPermissionDescLessThan(String value) {
            addCriterion("PermissionDesc <", value, "permissionDesc");
            return (Criteria) this;
        }

        public Criteria andPermissionDescLessThanOrEqualTo(String value) {
            addCriterion("PermissionDesc <=", value, "permissionDesc");
            return (Criteria) this;
        }

        public Criteria andPermissionDescLike(String value) {
            addCriterion("PermissionDesc like", value, "permissionDesc");
            return (Criteria) this;
        }

        public Criteria andPermissionDescNotLike(String value) {
            addCriterion("PermissionDesc not like", value, "permissionDesc");
            return (Criteria) this;
        }

        public Criteria andPermissionDescIn(List<String> values) {
            addCriterion("PermissionDesc in", values, "permissionDesc");
            return (Criteria) this;
        }

        public Criteria andPermissionDescNotIn(List<String> values) {
            addCriterion("PermissionDesc not in", values, "permissionDesc");
            return (Criteria) this;
        }

        public Criteria andPermissionDescBetween(String value1, String value2) {
            addCriterion("PermissionDesc between", value1, value2, "permissionDesc");
            return (Criteria) this;
        }

        public Criteria andPermissionDescNotBetween(String value1, String value2) {
            addCriterion("PermissionDesc not between", value1, value2, "permissionDesc");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeIsNull() {
            addCriterion("PermissionCode is null");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeIsNotNull() {
            addCriterion("PermissionCode is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeEqualTo(String value) {
            addCriterion("PermissionCode =", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeNotEqualTo(String value) {
            addCriterion("PermissionCode <>", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeGreaterThan(String value) {
            addCriterion("PermissionCode >", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PermissionCode >=", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeLessThan(String value) {
            addCriterion("PermissionCode <", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeLessThanOrEqualTo(String value) {
            addCriterion("PermissionCode <=", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeLike(String value) {
            addCriterion("PermissionCode like", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeNotLike(String value) {
            addCriterion("PermissionCode not like", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeIn(List<String> values) {
            addCriterion("PermissionCode in", values, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeNotIn(List<String> values) {
            addCriterion("PermissionCode not in", values, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeBetween(String value1, String value2) {
            addCriterion("PermissionCode between", value1, value2, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeNotBetween(String value1, String value2) {
            addCriterion("PermissionCode not between", value1, value2, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeIsNull() {
            addCriterion("PermissionType is null");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeIsNotNull() {
            addCriterion("PermissionType is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeEqualTo(String value) {
            addCriterion("PermissionType =", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeNotEqualTo(String value) {
            addCriterion("PermissionType <>", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeGreaterThan(String value) {
            addCriterion("PermissionType >", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PermissionType >=", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeLessThan(String value) {
            addCriterion("PermissionType <", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeLessThanOrEqualTo(String value) {
            addCriterion("PermissionType <=", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeLike(String value) {
            addCriterion("PermissionType like", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeNotLike(String value) {
            addCriterion("PermissionType not like", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeIn(List<String> values) {
            addCriterion("PermissionType in", values, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeNotIn(List<String> values) {
            addCriterion("PermissionType not in", values, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeBetween(String value1, String value2) {
            addCriterion("PermissionType between", value1, value2, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeNotBetween(String value1, String value2) {
            addCriterion("PermissionType not between", value1, value2, "permissionType");
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