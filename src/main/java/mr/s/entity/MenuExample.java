package mr.s.entity;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuExample() {
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

        public Criteria andMenuIdIsNull() {
            addCriterion("MenuId is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("MenuId is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(Long value) {
            addCriterion("MenuId =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(Long value) {
            addCriterion("MenuId <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(Long value) {
            addCriterion("MenuId >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MenuId >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(Long value) {
            addCriterion("MenuId <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(Long value) {
            addCriterion("MenuId <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<Long> values) {
            addCriterion("MenuId in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<Long> values) {
            addCriterion("MenuId not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(Long value1, Long value2) {
            addCriterion("MenuId between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(Long value1, Long value2) {
            addCriterion("MenuId not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("MenuName is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("MenuName is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("MenuName =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("MenuName <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("MenuName >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("MenuName >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("MenuName <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("MenuName <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("MenuName like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("MenuName not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("MenuName in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("MenuName not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("MenuName between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("MenuName not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuOrderIsNull() {
            addCriterion("MenuOrder is null");
            return (Criteria) this;
        }

        public Criteria andMenuOrderIsNotNull() {
            addCriterion("MenuOrder is not null");
            return (Criteria) this;
        }

        public Criteria andMenuOrderEqualTo(Integer value) {
            addCriterion("MenuOrder =", value, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderNotEqualTo(Integer value) {
            addCriterion("MenuOrder <>", value, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderGreaterThan(Integer value) {
            addCriterion("MenuOrder >", value, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("MenuOrder >=", value, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderLessThan(Integer value) {
            addCriterion("MenuOrder <", value, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderLessThanOrEqualTo(Integer value) {
            addCriterion("MenuOrder <=", value, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderIn(List<Integer> values) {
            addCriterion("MenuOrder in", values, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderNotIn(List<Integer> values) {
            addCriterion("MenuOrder not in", values, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderBetween(Integer value1, Integer value2) {
            addCriterion("MenuOrder between", value1, value2, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("MenuOrder not between", value1, value2, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuLevelIsNull() {
            addCriterion("MenuLevel is null");
            return (Criteria) this;
        }

        public Criteria andMenuLevelIsNotNull() {
            addCriterion("MenuLevel is not null");
            return (Criteria) this;
        }

        public Criteria andMenuLevelEqualTo(Integer value) {
            addCriterion("MenuLevel =", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelNotEqualTo(Integer value) {
            addCriterion("MenuLevel <>", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelGreaterThan(Integer value) {
            addCriterion("MenuLevel >", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("MenuLevel >=", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelLessThan(Integer value) {
            addCriterion("MenuLevel <", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelLessThanOrEqualTo(Integer value) {
            addCriterion("MenuLevel <=", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelIn(List<Integer> values) {
            addCriterion("MenuLevel in", values, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelNotIn(List<Integer> values) {
            addCriterion("MenuLevel not in", values, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelBetween(Integer value1, Integer value2) {
            addCriterion("MenuLevel between", value1, value2, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("MenuLevel not between", value1, value2, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("ParentId is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("ParentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("ParentId =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("ParentId <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("ParentId >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParentId >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("ParentId <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("ParentId <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("ParentId in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("ParentId not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("ParentId between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ParentId not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andMenuLinkIsNull() {
            addCriterion("MenuLink is null");
            return (Criteria) this;
        }

        public Criteria andMenuLinkIsNotNull() {
            addCriterion("MenuLink is not null");
            return (Criteria) this;
        }

        public Criteria andMenuLinkEqualTo(String value) {
            addCriterion("MenuLink =", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkNotEqualTo(String value) {
            addCriterion("MenuLink <>", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkGreaterThan(String value) {
            addCriterion("MenuLink >", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkGreaterThanOrEqualTo(String value) {
            addCriterion("MenuLink >=", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkLessThan(String value) {
            addCriterion("MenuLink <", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkLessThanOrEqualTo(String value) {
            addCriterion("MenuLink <=", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkLike(String value) {
            addCriterion("MenuLink like", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkNotLike(String value) {
            addCriterion("MenuLink not like", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkIn(List<String> values) {
            addCriterion("MenuLink in", values, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkNotIn(List<String> values) {
            addCriterion("MenuLink not in", values, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkBetween(String value1, String value2) {
            addCriterion("MenuLink between", value1, value2, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkNotBetween(String value1, String value2) {
            addCriterion("MenuLink not between", value1, value2, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNull() {
            addCriterion("MenuType is null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNotNull() {
            addCriterion("MenuType is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeEqualTo(String value) {
            addCriterion("MenuType =", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotEqualTo(String value) {
            addCriterion("MenuType <>", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThan(String value) {
            addCriterion("MenuType >", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MenuType >=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThan(String value) {
            addCriterion("MenuType <", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThanOrEqualTo(String value) {
            addCriterion("MenuType <=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLike(String value) {
            addCriterion("MenuType like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotLike(String value) {
            addCriterion("MenuType not like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIn(List<String> values) {
            addCriterion("MenuType in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotIn(List<String> values) {
            addCriterion("MenuType not in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeBetween(String value1, String value2) {
            addCriterion("MenuType between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotBetween(String value1, String value2) {
            addCriterion("MenuType not between", value1, value2, "menuType");
            return (Criteria) this;
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