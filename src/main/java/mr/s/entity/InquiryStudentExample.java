package mr.s.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InquiryStudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InquiryStudentExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andStuIDIsNull() {
            addCriterion("StuID is null");
            return (Criteria) this;
        }

        public Criteria andStuIDIsNotNull() {
            addCriterion("StuID is not null");
            return (Criteria) this;
        }

        public Criteria andStuIDEqualTo(String value) {
            addCriterion("StuID =", value, "stuID");
            return (Criteria) this;
        }

        public Criteria andStuIDNotEqualTo(String value) {
            addCriterion("StuID <>", value, "stuID");
            return (Criteria) this;
        }

        public Criteria andStuIDGreaterThan(String value) {
            addCriterion("StuID >", value, "stuID");
            return (Criteria) this;
        }

        public Criteria andStuIDGreaterThanOrEqualTo(String value) {
            addCriterion("StuID >=", value, "stuID");
            return (Criteria) this;
        }

        public Criteria andStuIDLessThan(String value) {
            addCriterion("StuID <", value, "stuID");
            return (Criteria) this;
        }

        public Criteria andStuIDLessThanOrEqualTo(String value) {
            addCriterion("StuID <=", value, "stuID");
            return (Criteria) this;
        }

        public Criteria andStuIDLike(String value) {
            addCriterion("StuID like", value, "stuID");
            return (Criteria) this;
        }

        public Criteria andStuIDNotLike(String value) {
            addCriterion("StuID not like", value, "stuID");
            return (Criteria) this;
        }

        public Criteria andStuIDIn(List<String> values) {
            addCriterion("StuID in", values, "stuID");
            return (Criteria) this;
        }

        public Criteria andStuIDNotIn(List<String> values) {
            addCriterion("StuID not in", values, "stuID");
            return (Criteria) this;
        }

        public Criteria andStuIDBetween(String value1, String value2) {
            addCriterion("StuID between", value1, value2, "stuID");
            return (Criteria) this;
        }

        public Criteria andStuIDNotBetween(String value1, String value2) {
            addCriterion("StuID not between", value1, value2, "stuID");
            return (Criteria) this;
        }

        public Criteria andRegisteredIsNull() {
            addCriterion("Registered is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredIsNotNull() {
            addCriterion("Registered is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredEqualTo(String value) {
            addCriterion("Registered =", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredNotEqualTo(String value) {
            addCriterion("Registered <>", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredGreaterThan(String value) {
            addCriterion("Registered >", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredGreaterThanOrEqualTo(String value) {
            addCriterion("Registered >=", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredLessThan(String value) {
            addCriterion("Registered <", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredLessThanOrEqualTo(String value) {
            addCriterion("Registered <=", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredLike(String value) {
            addCriterion("Registered like", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredNotLike(String value) {
            addCriterion("Registered not like", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredIn(List<String> values) {
            addCriterion("Registered in", values, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredNotIn(List<String> values) {
            addCriterion("Registered not in", values, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredBetween(String value1, String value2) {
            addCriterion("Registered between", value1, value2, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredNotBetween(String value1, String value2) {
            addCriterion("Registered not between", value1, value2, "registered");
            return (Criteria) this;
        }

        public Criteria andPersonNumIsNull() {
            addCriterion("PersonNum is null");
            return (Criteria) this;
        }

        public Criteria andPersonNumIsNotNull() {
            addCriterion("PersonNum is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNumEqualTo(Integer value) {
            addCriterion("PersonNum =", value, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumNotEqualTo(Integer value) {
            addCriterion("PersonNum <>", value, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumGreaterThan(Integer value) {
            addCriterion("PersonNum >", value, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PersonNum >=", value, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumLessThan(Integer value) {
            addCriterion("PersonNum <", value, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumLessThanOrEqualTo(Integer value) {
            addCriterion("PersonNum <=", value, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumIn(List<Integer> values) {
            addCriterion("PersonNum in", values, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumNotIn(List<Integer> values) {
            addCriterion("PersonNum not in", values, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumBetween(Integer value1, Integer value2) {
            addCriterion("PersonNum between", value1, value2, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumNotBetween(Integer value1, Integer value2) {
            addCriterion("PersonNum not between", value1, value2, "personNum");
            return (Criteria) this;
        }

        public Criteria andHomeTypeIsNull() {
            addCriterion("HomeType is null");
            return (Criteria) this;
        }

        public Criteria andHomeTypeIsNotNull() {
            addCriterion("HomeType is not null");
            return (Criteria) this;
        }

        public Criteria andHomeTypeEqualTo(String value) {
            addCriterion("HomeType =", value, "homeType");
            return (Criteria) this;
        }

        public Criteria andHomeTypeNotEqualTo(String value) {
            addCriterion("HomeType <>", value, "homeType");
            return (Criteria) this;
        }

        public Criteria andHomeTypeGreaterThan(String value) {
            addCriterion("HomeType >", value, "homeType");
            return (Criteria) this;
        }

        public Criteria andHomeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("HomeType >=", value, "homeType");
            return (Criteria) this;
        }

        public Criteria andHomeTypeLessThan(String value) {
            addCriterion("HomeType <", value, "homeType");
            return (Criteria) this;
        }

        public Criteria andHomeTypeLessThanOrEqualTo(String value) {
            addCriterion("HomeType <=", value, "homeType");
            return (Criteria) this;
        }

        public Criteria andHomeTypeLike(String value) {
            addCriterion("HomeType like", value, "homeType");
            return (Criteria) this;
        }

        public Criteria andHomeTypeNotLike(String value) {
            addCriterion("HomeType not like", value, "homeType");
            return (Criteria) this;
        }

        public Criteria andHomeTypeIn(List<String> values) {
            addCriterion("HomeType in", values, "homeType");
            return (Criteria) this;
        }

        public Criteria andHomeTypeNotIn(List<String> values) {
            addCriterion("HomeType not in", values, "homeType");
            return (Criteria) this;
        }

        public Criteria andHomeTypeBetween(String value1, String value2) {
            addCriterion("HomeType between", value1, value2, "homeType");
            return (Criteria) this;
        }

        public Criteria andHomeTypeNotBetween(String value1, String value2) {
            addCriterion("HomeType not between", value1, value2, "homeType");
            return (Criteria) this;
        }

        public Criteria andHomeIncomeIsNull() {
            addCriterion("HomeIncome is null");
            return (Criteria) this;
        }

        public Criteria andHomeIncomeIsNotNull() {
            addCriterion("HomeIncome is not null");
            return (Criteria) this;
        }

        public Criteria andHomeIncomeEqualTo(Float value) {
            addCriterion("HomeIncome =", value, "homeIncome");
            return (Criteria) this;
        }

        public Criteria andHomeIncomeNotEqualTo(Float value) {
            addCriterion("HomeIncome <>", value, "homeIncome");
            return (Criteria) this;
        }

        public Criteria andHomeIncomeGreaterThan(Float value) {
            addCriterion("HomeIncome >", value, "homeIncome");
            return (Criteria) this;
        }

        public Criteria andHomeIncomeGreaterThanOrEqualTo(Float value) {
            addCriterion("HomeIncome >=", value, "homeIncome");
            return (Criteria) this;
        }

        public Criteria andHomeIncomeLessThan(Float value) {
            addCriterion("HomeIncome <", value, "homeIncome");
            return (Criteria) this;
        }

        public Criteria andHomeIncomeLessThanOrEqualTo(Float value) {
            addCriterion("HomeIncome <=", value, "homeIncome");
            return (Criteria) this;
        }

        public Criteria andHomeIncomeIn(List<Float> values) {
            addCriterion("HomeIncome in", values, "homeIncome");
            return (Criteria) this;
        }

        public Criteria andHomeIncomeNotIn(List<Float> values) {
            addCriterion("HomeIncome not in", values, "homeIncome");
            return (Criteria) this;
        }

        public Criteria andHomeIncomeBetween(Float value1, Float value2) {
            addCriterion("HomeIncome between", value1, value2, "homeIncome");
            return (Criteria) this;
        }

        public Criteria andHomeIncomeNotBetween(Float value1, Float value2) {
            addCriterion("HomeIncome not between", value1, value2, "homeIncome");
            return (Criteria) this;
        }

        public Criteria andSupportIsNull() {
            addCriterion("Support is null");
            return (Criteria) this;
        }

        public Criteria andSupportIsNotNull() {
            addCriterion("Support is not null");
            return (Criteria) this;
        }

        public Criteria andSupportEqualTo(String value) {
            addCriterion("Support =", value, "support");
            return (Criteria) this;
        }

        public Criteria andSupportNotEqualTo(String value) {
            addCriterion("Support <>", value, "support");
            return (Criteria) this;
        }

        public Criteria andSupportGreaterThan(String value) {
            addCriterion("Support >", value, "support");
            return (Criteria) this;
        }

        public Criteria andSupportGreaterThanOrEqualTo(String value) {
            addCriterion("Support >=", value, "support");
            return (Criteria) this;
        }

        public Criteria andSupportLessThan(String value) {
            addCriterion("Support <", value, "support");
            return (Criteria) this;
        }

        public Criteria andSupportLessThanOrEqualTo(String value) {
            addCriterion("Support <=", value, "support");
            return (Criteria) this;
        }

        public Criteria andSupportLike(String value) {
            addCriterion("Support like", value, "support");
            return (Criteria) this;
        }

        public Criteria andSupportNotLike(String value) {
            addCriterion("Support not like", value, "support");
            return (Criteria) this;
        }

        public Criteria andSupportIn(List<String> values) {
            addCriterion("Support in", values, "support");
            return (Criteria) this;
        }

        public Criteria andSupportNotIn(List<String> values) {
            addCriterion("Support not in", values, "support");
            return (Criteria) this;
        }

        public Criteria andSupportBetween(String value1, String value2) {
            addCriterion("Support between", value1, value2, "support");
            return (Criteria) this;
        }

        public Criteria andSupportNotBetween(String value1, String value2) {
            addCriterion("Support not between", value1, value2, "support");
            return (Criteria) this;
        }

        public Criteria andAccidentIsNull() {
            addCriterion("Accident is null");
            return (Criteria) this;
        }

        public Criteria andAccidentIsNotNull() {
            addCriterion("Accident is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentEqualTo(String value) {
            addCriterion("Accident =", value, "accident");
            return (Criteria) this;
        }

        public Criteria andAccidentNotEqualTo(String value) {
            addCriterion("Accident <>", value, "accident");
            return (Criteria) this;
        }

        public Criteria andAccidentGreaterThan(String value) {
            addCriterion("Accident >", value, "accident");
            return (Criteria) this;
        }

        public Criteria andAccidentGreaterThanOrEqualTo(String value) {
            addCriterion("Accident >=", value, "accident");
            return (Criteria) this;
        }

        public Criteria andAccidentLessThan(String value) {
            addCriterion("Accident <", value, "accident");
            return (Criteria) this;
        }

        public Criteria andAccidentLessThanOrEqualTo(String value) {
            addCriterion("Accident <=", value, "accident");
            return (Criteria) this;
        }

        public Criteria andAccidentLike(String value) {
            addCriterion("Accident like", value, "accident");
            return (Criteria) this;
        }

        public Criteria andAccidentNotLike(String value) {
            addCriterion("Accident not like", value, "accident");
            return (Criteria) this;
        }

        public Criteria andAccidentIn(List<String> values) {
            addCriterion("Accident in", values, "accident");
            return (Criteria) this;
        }

        public Criteria andAccidentNotIn(List<String> values) {
            addCriterion("Accident not in", values, "accident");
            return (Criteria) this;
        }

        public Criteria andAccidentBetween(String value1, String value2) {
            addCriterion("Accident between", value1, value2, "accident");
            return (Criteria) this;
        }

        public Criteria andAccidentNotBetween(String value1, String value2) {
            addCriterion("Accident not between", value1, value2, "accident");
            return (Criteria) this;
        }

        public Criteria andUnemployIsNull() {
            addCriterion("Unemploy is null");
            return (Criteria) this;
        }

        public Criteria andUnemployIsNotNull() {
            addCriterion("Unemploy is not null");
            return (Criteria) this;
        }

        public Criteria andUnemployEqualTo(String value) {
            addCriterion("Unemploy =", value, "unemploy");
            return (Criteria) this;
        }

        public Criteria andUnemployNotEqualTo(String value) {
            addCriterion("Unemploy <>", value, "unemploy");
            return (Criteria) this;
        }

        public Criteria andUnemployGreaterThan(String value) {
            addCriterion("Unemploy >", value, "unemploy");
            return (Criteria) this;
        }

        public Criteria andUnemployGreaterThanOrEqualTo(String value) {
            addCriterion("Unemploy >=", value, "unemploy");
            return (Criteria) this;
        }

        public Criteria andUnemployLessThan(String value) {
            addCriterion("Unemploy <", value, "unemploy");
            return (Criteria) this;
        }

        public Criteria andUnemployLessThanOrEqualTo(String value) {
            addCriterion("Unemploy <=", value, "unemploy");
            return (Criteria) this;
        }

        public Criteria andUnemployLike(String value) {
            addCriterion("Unemploy like", value, "unemploy");
            return (Criteria) this;
        }

        public Criteria andUnemployNotLike(String value) {
            addCriterion("Unemploy not like", value, "unemploy");
            return (Criteria) this;
        }

        public Criteria andUnemployIn(List<String> values) {
            addCriterion("Unemploy in", values, "unemploy");
            return (Criteria) this;
        }

        public Criteria andUnemployNotIn(List<String> values) {
            addCriterion("Unemploy not in", values, "unemploy");
            return (Criteria) this;
        }

        public Criteria andUnemployBetween(String value1, String value2) {
            addCriterion("Unemploy between", value1, value2, "unemploy");
            return (Criteria) this;
        }

        public Criteria andUnemployNotBetween(String value1, String value2) {
            addCriterion("Unemploy not between", value1, value2, "unemploy");
            return (Criteria) this;
        }

        public Criteria andDebtIsNull() {
            addCriterion("Debt is null");
            return (Criteria) this;
        }

        public Criteria andDebtIsNotNull() {
            addCriterion("Debt is not null");
            return (Criteria) this;
        }

        public Criteria andDebtEqualTo(String value) {
            addCriterion("Debt =", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtNotEqualTo(String value) {
            addCriterion("Debt <>", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtGreaterThan(String value) {
            addCriterion("Debt >", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtGreaterThanOrEqualTo(String value) {
            addCriterion("Debt >=", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtLessThan(String value) {
            addCriterion("Debt <", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtLessThanOrEqualTo(String value) {
            addCriterion("Debt <=", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtLike(String value) {
            addCriterion("Debt like", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtNotLike(String value) {
            addCriterion("Debt not like", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtIn(List<String> values) {
            addCriterion("Debt in", values, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtNotIn(List<String> values) {
            addCriterion("Debt not in", values, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtBetween(String value1, String value2) {
            addCriterion("Debt between", value1, value2, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtNotBetween(String value1, String value2) {
            addCriterion("Debt not between", value1, value2, "debt");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("Other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("Other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("Other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("Other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("Other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("Other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("Other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("Other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("Other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("Other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("Other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("Other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("Other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("Other not between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andStudentSignIsNull() {
            addCriterion("StudentSign is null");
            return (Criteria) this;
        }

        public Criteria andStudentSignIsNotNull() {
            addCriterion("StudentSign is not null");
            return (Criteria) this;
        }

        public Criteria andStudentSignEqualTo(String value) {
            addCriterion("StudentSign =", value, "studentSign");
            return (Criteria) this;
        }

        public Criteria andStudentSignNotEqualTo(String value) {
            addCriterion("StudentSign <>", value, "studentSign");
            return (Criteria) this;
        }

        public Criteria andStudentSignGreaterThan(String value) {
            addCriterion("StudentSign >", value, "studentSign");
            return (Criteria) this;
        }

        public Criteria andStudentSignGreaterThanOrEqualTo(String value) {
            addCriterion("StudentSign >=", value, "studentSign");
            return (Criteria) this;
        }

        public Criteria andStudentSignLessThan(String value) {
            addCriterion("StudentSign <", value, "studentSign");
            return (Criteria) this;
        }

        public Criteria andStudentSignLessThanOrEqualTo(String value) {
            addCriterion("StudentSign <=", value, "studentSign");
            return (Criteria) this;
        }

        public Criteria andStudentSignLike(String value) {
            addCriterion("StudentSign like", value, "studentSign");
            return (Criteria) this;
        }

        public Criteria andStudentSignNotLike(String value) {
            addCriterion("StudentSign not like", value, "studentSign");
            return (Criteria) this;
        }

        public Criteria andStudentSignIn(List<String> values) {
            addCriterion("StudentSign in", values, "studentSign");
            return (Criteria) this;
        }

        public Criteria andStudentSignNotIn(List<String> values) {
            addCriterion("StudentSign not in", values, "studentSign");
            return (Criteria) this;
        }

        public Criteria andStudentSignBetween(String value1, String value2) {
            addCriterion("StudentSign between", value1, value2, "studentSign");
            return (Criteria) this;
        }

        public Criteria andStudentSignNotBetween(String value1, String value2) {
            addCriterion("StudentSign not between", value1, value2, "studentSign");
            return (Criteria) this;
        }

        public Criteria andParentSignIsNull() {
            addCriterion("ParentSign is null");
            return (Criteria) this;
        }

        public Criteria andParentSignIsNotNull() {
            addCriterion("ParentSign is not null");
            return (Criteria) this;
        }

        public Criteria andParentSignEqualTo(String value) {
            addCriterion("ParentSign =", value, "parentSign");
            return (Criteria) this;
        }

        public Criteria andParentSignNotEqualTo(String value) {
            addCriterion("ParentSign <>", value, "parentSign");
            return (Criteria) this;
        }

        public Criteria andParentSignGreaterThan(String value) {
            addCriterion("ParentSign >", value, "parentSign");
            return (Criteria) this;
        }

        public Criteria andParentSignGreaterThanOrEqualTo(String value) {
            addCriterion("ParentSign >=", value, "parentSign");
            return (Criteria) this;
        }

        public Criteria andParentSignLessThan(String value) {
            addCriterion("ParentSign <", value, "parentSign");
            return (Criteria) this;
        }

        public Criteria andParentSignLessThanOrEqualTo(String value) {
            addCriterion("ParentSign <=", value, "parentSign");
            return (Criteria) this;
        }

        public Criteria andParentSignLike(String value) {
            addCriterion("ParentSign like", value, "parentSign");
            return (Criteria) this;
        }

        public Criteria andParentSignNotLike(String value) {
            addCriterion("ParentSign not like", value, "parentSign");
            return (Criteria) this;
        }

        public Criteria andParentSignIn(List<String> values) {
            addCriterion("ParentSign in", values, "parentSign");
            return (Criteria) this;
        }

        public Criteria andParentSignNotIn(List<String> values) {
            addCriterion("ParentSign not in", values, "parentSign");
            return (Criteria) this;
        }

        public Criteria andParentSignBetween(String value1, String value2) {
            addCriterion("ParentSign between", value1, value2, "parentSign");
            return (Criteria) this;
        }

        public Criteria andParentSignNotBetween(String value1, String value2) {
            addCriterion("ParentSign not between", value1, value2, "parentSign");
            return (Criteria) this;
        }

        public Criteria andParentDateIsNull() {
            addCriterion("ParentDate is null");
            return (Criteria) this;
        }

        public Criteria andParentDateIsNotNull() {
            addCriterion("ParentDate is not null");
            return (Criteria) this;
        }

        public Criteria andParentDateEqualTo(Date value) {
            addCriterionForJDBCDate("ParentDate =", value, "parentDate");
            return (Criteria) this;
        }

        public Criteria andParentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ParentDate <>", value, "parentDate");
            return (Criteria) this;
        }

        public Criteria andParentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ParentDate >", value, "parentDate");
            return (Criteria) this;
        }

        public Criteria andParentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ParentDate >=", value, "parentDate");
            return (Criteria) this;
        }

        public Criteria andParentDateLessThan(Date value) {
            addCriterionForJDBCDate("ParentDate <", value, "parentDate");
            return (Criteria) this;
        }

        public Criteria andParentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ParentDate <=", value, "parentDate");
            return (Criteria) this;
        }

        public Criteria andParentDateIn(List<Date> values) {
            addCriterionForJDBCDate("ParentDate in", values, "parentDate");
            return (Criteria) this;
        }

        public Criteria andParentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ParentDate not in", values, "parentDate");
            return (Criteria) this;
        }

        public Criteria andParentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ParentDate between", value1, value2, "parentDate");
            return (Criteria) this;
        }

        public Criteria andParentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ParentDate not between", value1, value2, "parentDate");
            return (Criteria) this;
        }

        public Criteria andAgentSignIsNull() {
            addCriterion("AgentSign is null");
            return (Criteria) this;
        }

        public Criteria andAgentSignIsNotNull() {
            addCriterion("AgentSign is not null");
            return (Criteria) this;
        }

        public Criteria andAgentSignEqualTo(String value) {
            addCriterion("AgentSign =", value, "agentSign");
            return (Criteria) this;
        }

        public Criteria andAgentSignNotEqualTo(String value) {
            addCriterion("AgentSign <>", value, "agentSign");
            return (Criteria) this;
        }

        public Criteria andAgentSignGreaterThan(String value) {
            addCriterion("AgentSign >", value, "agentSign");
            return (Criteria) this;
        }

        public Criteria andAgentSignGreaterThanOrEqualTo(String value) {
            addCriterion("AgentSign >=", value, "agentSign");
            return (Criteria) this;
        }

        public Criteria andAgentSignLessThan(String value) {
            addCriterion("AgentSign <", value, "agentSign");
            return (Criteria) this;
        }

        public Criteria andAgentSignLessThanOrEqualTo(String value) {
            addCriterion("AgentSign <=", value, "agentSign");
            return (Criteria) this;
        }

        public Criteria andAgentSignLike(String value) {
            addCriterion("AgentSign like", value, "agentSign");
            return (Criteria) this;
        }

        public Criteria andAgentSignNotLike(String value) {
            addCriterion("AgentSign not like", value, "agentSign");
            return (Criteria) this;
        }

        public Criteria andAgentSignIn(List<String> values) {
            addCriterion("AgentSign in", values, "agentSign");
            return (Criteria) this;
        }

        public Criteria andAgentSignNotIn(List<String> values) {
            addCriterion("AgentSign not in", values, "agentSign");
            return (Criteria) this;
        }

        public Criteria andAgentSignBetween(String value1, String value2) {
            addCriterion("AgentSign between", value1, value2, "agentSign");
            return (Criteria) this;
        }

        public Criteria andAgentSignNotBetween(String value1, String value2) {
            addCriterion("AgentSign not between", value1, value2, "agentSign");
            return (Criteria) this;
        }

        public Criteria andAgentUnitIsNull() {
            addCriterion("AgentUnit is null");
            return (Criteria) this;
        }

        public Criteria andAgentUnitIsNotNull() {
            addCriterion("AgentUnit is not null");
            return (Criteria) this;
        }

        public Criteria andAgentUnitEqualTo(String value) {
            addCriterion("AgentUnit =", value, "agentUnit");
            return (Criteria) this;
        }

        public Criteria andAgentUnitNotEqualTo(String value) {
            addCriterion("AgentUnit <>", value, "agentUnit");
            return (Criteria) this;
        }

        public Criteria andAgentUnitGreaterThan(String value) {
            addCriterion("AgentUnit >", value, "agentUnit");
            return (Criteria) this;
        }

        public Criteria andAgentUnitGreaterThanOrEqualTo(String value) {
            addCriterion("AgentUnit >=", value, "agentUnit");
            return (Criteria) this;
        }

        public Criteria andAgentUnitLessThan(String value) {
            addCriterion("AgentUnit <", value, "agentUnit");
            return (Criteria) this;
        }

        public Criteria andAgentUnitLessThanOrEqualTo(String value) {
            addCriterion("AgentUnit <=", value, "agentUnit");
            return (Criteria) this;
        }

        public Criteria andAgentUnitLike(String value) {
            addCriterion("AgentUnit like", value, "agentUnit");
            return (Criteria) this;
        }

        public Criteria andAgentUnitNotLike(String value) {
            addCriterion("AgentUnit not like", value, "agentUnit");
            return (Criteria) this;
        }

        public Criteria andAgentUnitIn(List<String> values) {
            addCriterion("AgentUnit in", values, "agentUnit");
            return (Criteria) this;
        }

        public Criteria andAgentUnitNotIn(List<String> values) {
            addCriterion("AgentUnit not in", values, "agentUnit");
            return (Criteria) this;
        }

        public Criteria andAgentUnitBetween(String value1, String value2) {
            addCriterion("AgentUnit between", value1, value2, "agentUnit");
            return (Criteria) this;
        }

        public Criteria andAgentUnitNotBetween(String value1, String value2) {
            addCriterion("AgentUnit not between", value1, value2, "agentUnit");
            return (Criteria) this;
        }

        public Criteria andAgentTelIsNull() {
            addCriterion("AgentTel is null");
            return (Criteria) this;
        }

        public Criteria andAgentTelIsNotNull() {
            addCriterion("AgentTel is not null");
            return (Criteria) this;
        }

        public Criteria andAgentTelEqualTo(String value) {
            addCriterion("AgentTel =", value, "agentTel");
            return (Criteria) this;
        }

        public Criteria andAgentTelNotEqualTo(String value) {
            addCriterion("AgentTel <>", value, "agentTel");
            return (Criteria) this;
        }

        public Criteria andAgentTelGreaterThan(String value) {
            addCriterion("AgentTel >", value, "agentTel");
            return (Criteria) this;
        }

        public Criteria andAgentTelGreaterThanOrEqualTo(String value) {
            addCriterion("AgentTel >=", value, "agentTel");
            return (Criteria) this;
        }

        public Criteria andAgentTelLessThan(String value) {
            addCriterion("AgentTel <", value, "agentTel");
            return (Criteria) this;
        }

        public Criteria andAgentTelLessThanOrEqualTo(String value) {
            addCriterion("AgentTel <=", value, "agentTel");
            return (Criteria) this;
        }

        public Criteria andAgentTelLike(String value) {
            addCriterion("AgentTel like", value, "agentTel");
            return (Criteria) this;
        }

        public Criteria andAgentTelNotLike(String value) {
            addCriterion("AgentTel not like", value, "agentTel");
            return (Criteria) this;
        }

        public Criteria andAgentTelIn(List<String> values) {
            addCriterion("AgentTel in", values, "agentTel");
            return (Criteria) this;
        }

        public Criteria andAgentTelNotIn(List<String> values) {
            addCriterion("AgentTel not in", values, "agentTel");
            return (Criteria) this;
        }

        public Criteria andAgentTelBetween(String value1, String value2) {
            addCriterion("AgentTel between", value1, value2, "agentTel");
            return (Criteria) this;
        }

        public Criteria andAgentTelNotBetween(String value1, String value2) {
            addCriterion("AgentTel not between", value1, value2, "agentTel");
            return (Criteria) this;
        }

        public Criteria andSealIsNull() {
            addCriterion("Seal is null");
            return (Criteria) this;
        }

        public Criteria andSealIsNotNull() {
            addCriterion("Seal is not null");
            return (Criteria) this;
        }

        public Criteria andSealEqualTo(String value) {
            addCriterion("Seal =", value, "seal");
            return (Criteria) this;
        }

        public Criteria andSealNotEqualTo(String value) {
            addCriterion("Seal <>", value, "seal");
            return (Criteria) this;
        }

        public Criteria andSealGreaterThan(String value) {
            addCriterion("Seal >", value, "seal");
            return (Criteria) this;
        }

        public Criteria andSealGreaterThanOrEqualTo(String value) {
            addCriterion("Seal >=", value, "seal");
            return (Criteria) this;
        }

        public Criteria andSealLessThan(String value) {
            addCriterion("Seal <", value, "seal");
            return (Criteria) this;
        }

        public Criteria andSealLessThanOrEqualTo(String value) {
            addCriterion("Seal <=", value, "seal");
            return (Criteria) this;
        }

        public Criteria andSealLike(String value) {
            addCriterion("Seal like", value, "seal");
            return (Criteria) this;
        }

        public Criteria andSealNotLike(String value) {
            addCriterion("Seal not like", value, "seal");
            return (Criteria) this;
        }

        public Criteria andSealIn(List<String> values) {
            addCriterion("Seal in", values, "seal");
            return (Criteria) this;
        }

        public Criteria andSealNotIn(List<String> values) {
            addCriterion("Seal not in", values, "seal");
            return (Criteria) this;
        }

        public Criteria andSealBetween(String value1, String value2) {
            addCriterion("Seal between", value1, value2, "seal");
            return (Criteria) this;
        }

        public Criteria andSealNotBetween(String value1, String value2) {
            addCriterion("Seal not between", value1, value2, "seal");
            return (Criteria) this;
        }

        public Criteria andAgentDateIsNull() {
            addCriterion("AgentDate is null");
            return (Criteria) this;
        }

        public Criteria andAgentDateIsNotNull() {
            addCriterion("AgentDate is not null");
            return (Criteria) this;
        }

        public Criteria andAgentDateEqualTo(Date value) {
            addCriterionForJDBCDate("AgentDate =", value, "agentDate");
            return (Criteria) this;
        }

        public Criteria andAgentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("AgentDate <>", value, "agentDate");
            return (Criteria) this;
        }

        public Criteria andAgentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("AgentDate >", value, "agentDate");
            return (Criteria) this;
        }

        public Criteria andAgentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("AgentDate >=", value, "agentDate");
            return (Criteria) this;
        }

        public Criteria andAgentDateLessThan(Date value) {
            addCriterionForJDBCDate("AgentDate <", value, "agentDate");
            return (Criteria) this;
        }

        public Criteria andAgentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("AgentDate <=", value, "agentDate");
            return (Criteria) this;
        }

        public Criteria andAgentDateIn(List<Date> values) {
            addCriterionForJDBCDate("AgentDate in", values, "agentDate");
            return (Criteria) this;
        }

        public Criteria andAgentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("AgentDate not in", values, "agentDate");
            return (Criteria) this;
        }

        public Criteria andAgentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("AgentDate between", value1, value2, "agentDate");
            return (Criteria) this;
        }

        public Criteria andAgentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("AgentDate not between", value1, value2, "agentDate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("Status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("Status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("Auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("Auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("Auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("Auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("Auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("Auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("Auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("Auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("Auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("Auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("Auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("Auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("Auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("Auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeIsNull() {
            addCriterion("AuditorTime is null");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeIsNotNull() {
            addCriterion("AuditorTime is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeEqualTo(Date value) {
            addCriterionForJDBCDate("AuditorTime =", value, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("AuditorTime <>", value, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("AuditorTime >", value, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("AuditorTime >=", value, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeLessThan(Date value) {
            addCriterionForJDBCDate("AuditorTime <", value, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("AuditorTime <=", value, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeIn(List<Date> values) {
            addCriterionForJDBCDate("AuditorTime in", values, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("AuditorTime not in", values, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("AuditorTime between", value1, value2, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("AuditorTime not between", value1, value2, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andReturnedIsNull() {
            addCriterion("Returned is null");
            return (Criteria) this;
        }

        public Criteria andReturnedIsNotNull() {
            addCriterion("Returned is not null");
            return (Criteria) this;
        }

        public Criteria andReturnedEqualTo(String value) {
            addCriterion("Returned =", value, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedNotEqualTo(String value) {
            addCriterion("Returned <>", value, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedGreaterThan(String value) {
            addCriterion("Returned >", value, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedGreaterThanOrEqualTo(String value) {
            addCriterion("Returned >=", value, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedLessThan(String value) {
            addCriterion("Returned <", value, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedLessThanOrEqualTo(String value) {
            addCriterion("Returned <=", value, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedLike(String value) {
            addCriterion("Returned like", value, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedNotLike(String value) {
            addCriterion("Returned not like", value, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedIn(List<String> values) {
            addCriterion("Returned in", values, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedNotIn(List<String> values) {
            addCriterion("Returned not in", values, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedBetween(String value1, String value2) {
            addCriterion("Returned between", value1, value2, "returned");
            return (Criteria) this;
        }

        public Criteria andReturnedNotBetween(String value1, String value2) {
            addCriterion("Returned not between", value1, value2, "returned");
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