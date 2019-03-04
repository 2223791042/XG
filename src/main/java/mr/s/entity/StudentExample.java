package mr.s.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStuTestIDIsNull() {
            addCriterion("StuTestID is null");
            return (Criteria) this;
        }

        public Criteria andStuTestIDIsNotNull() {
            addCriterion("StuTestID is not null");
            return (Criteria) this;
        }

        public Criteria andStuTestIDEqualTo(String value) {
            addCriterion("StuTestID =", value, "stuTestID");
            return (Criteria) this;
        }

        public Criteria andStuTestIDNotEqualTo(String value) {
            addCriterion("StuTestID <>", value, "stuTestID");
            return (Criteria) this;
        }

        public Criteria andStuTestIDGreaterThan(String value) {
            addCriterion("StuTestID >", value, "stuTestID");
            return (Criteria) this;
        }

        public Criteria andStuTestIDGreaterThanOrEqualTo(String value) {
            addCriterion("StuTestID >=", value, "stuTestID");
            return (Criteria) this;
        }

        public Criteria andStuTestIDLessThan(String value) {
            addCriterion("StuTestID <", value, "stuTestID");
            return (Criteria) this;
        }

        public Criteria andStuTestIDLessThanOrEqualTo(String value) {
            addCriterion("StuTestID <=", value, "stuTestID");
            return (Criteria) this;
        }

        public Criteria andStuTestIDLike(String value) {
            addCriterion("StuTestID like", value, "stuTestID");
            return (Criteria) this;
        }

        public Criteria andStuTestIDNotLike(String value) {
            addCriterion("StuTestID not like", value, "stuTestID");
            return (Criteria) this;
        }

        public Criteria andStuTestIDIn(List<String> values) {
            addCriterion("StuTestID in", values, "stuTestID");
            return (Criteria) this;
        }

        public Criteria andStuTestIDNotIn(List<String> values) {
            addCriterion("StuTestID not in", values, "stuTestID");
            return (Criteria) this;
        }

        public Criteria andStuTestIDBetween(String value1, String value2) {
            addCriterion("StuTestID between", value1, value2, "stuTestID");
            return (Criteria) this;
        }

        public Criteria andStuTestIDNotBetween(String value1, String value2) {
            addCriterion("StuTestID not between", value1, value2, "stuTestID");
            return (Criteria) this;
        }

        public Criteria andEnrolYearIsNull() {
            addCriterion("EnrolYear is null");
            return (Criteria) this;
        }

        public Criteria andEnrolYearIsNotNull() {
            addCriterion("EnrolYear is not null");
            return (Criteria) this;
        }

        public Criteria andEnrolYearEqualTo(String value) {
            addCriterion("EnrolYear =", value, "enrolYear");
            return (Criteria) this;
        }

        public Criteria andEnrolYearNotEqualTo(String value) {
            addCriterion("EnrolYear <>", value, "enrolYear");
            return (Criteria) this;
        }

        public Criteria andEnrolYearGreaterThan(String value) {
            addCriterion("EnrolYear >", value, "enrolYear");
            return (Criteria) this;
        }

        public Criteria andEnrolYearGreaterThanOrEqualTo(String value) {
            addCriterion("EnrolYear >=", value, "enrolYear");
            return (Criteria) this;
        }

        public Criteria andEnrolYearLessThan(String value) {
            addCriterion("EnrolYear <", value, "enrolYear");
            return (Criteria) this;
        }

        public Criteria andEnrolYearLessThanOrEqualTo(String value) {
            addCriterion("EnrolYear <=", value, "enrolYear");
            return (Criteria) this;
        }

        public Criteria andEnrolYearLike(String value) {
            addCriterion("EnrolYear like", value, "enrolYear");
            return (Criteria) this;
        }

        public Criteria andEnrolYearNotLike(String value) {
            addCriterion("EnrolYear not like", value, "enrolYear");
            return (Criteria) this;
        }

        public Criteria andEnrolYearIn(List<String> values) {
            addCriterion("EnrolYear in", values, "enrolYear");
            return (Criteria) this;
        }

        public Criteria andEnrolYearNotIn(List<String> values) {
            addCriterion("EnrolYear not in", values, "enrolYear");
            return (Criteria) this;
        }

        public Criteria andEnrolYearBetween(String value1, String value2) {
            addCriterion("EnrolYear between", value1, value2, "enrolYear");
            return (Criteria) this;
        }

        public Criteria andEnrolYearNotBetween(String value1, String value2) {
            addCriterion("EnrolYear not between", value1, value2, "enrolYear");
            return (Criteria) this;
        }

        public Criteria andEnrolTimeIsNull() {
            addCriterion("EnrolTime is null");
            return (Criteria) this;
        }

        public Criteria andEnrolTimeIsNotNull() {
            addCriterion("EnrolTime is not null");
            return (Criteria) this;
        }

        public Criteria andEnrolTimeEqualTo(Date value) {
            addCriterionForJDBCDate("EnrolTime =", value, "enrolTime");
            return (Criteria) this;
        }

        public Criteria andEnrolTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("EnrolTime <>", value, "enrolTime");
            return (Criteria) this;
        }

        public Criteria andEnrolTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("EnrolTime >", value, "enrolTime");
            return (Criteria) this;
        }

        public Criteria andEnrolTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EnrolTime >=", value, "enrolTime");
            return (Criteria) this;
        }

        public Criteria andEnrolTimeLessThan(Date value) {
            addCriterionForJDBCDate("EnrolTime <", value, "enrolTime");
            return (Criteria) this;
        }

        public Criteria andEnrolTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EnrolTime <=", value, "enrolTime");
            return (Criteria) this;
        }

        public Criteria andEnrolTimeIn(List<Date> values) {
            addCriterionForJDBCDate("EnrolTime in", values, "enrolTime");
            return (Criteria) this;
        }

        public Criteria andEnrolTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("EnrolTime not in", values, "enrolTime");
            return (Criteria) this;
        }

        public Criteria andEnrolTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EnrolTime between", value1, value2, "enrolTime");
            return (Criteria) this;
        }

        public Criteria andEnrolTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EnrolTime not between", value1, value2, "enrolTime");
            return (Criteria) this;
        }

        public Criteria andFreshIsNull() {
            addCriterion("Fresh is null");
            return (Criteria) this;
        }

        public Criteria andFreshIsNotNull() {
            addCriterion("Fresh is not null");
            return (Criteria) this;
        }

        public Criteria andFreshEqualTo(String value) {
            addCriterion("Fresh =", value, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshNotEqualTo(String value) {
            addCriterion("Fresh <>", value, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshGreaterThan(String value) {
            addCriterion("Fresh >", value, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshGreaterThanOrEqualTo(String value) {
            addCriterion("Fresh >=", value, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshLessThan(String value) {
            addCriterion("Fresh <", value, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshLessThanOrEqualTo(String value) {
            addCriterion("Fresh <=", value, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshLike(String value) {
            addCriterion("Fresh like", value, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshNotLike(String value) {
            addCriterion("Fresh not like", value, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshIn(List<String> values) {
            addCriterion("Fresh in", values, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshNotIn(List<String> values) {
            addCriterion("Fresh not in", values, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshBetween(String value1, String value2) {
            addCriterion("Fresh between", value1, value2, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshNotBetween(String value1, String value2) {
            addCriterion("Fresh not between", value1, value2, "fresh");
            return (Criteria) this;
        }

        public Criteria andOriginAddIsNull() {
            addCriterion("OriginAdd is null");
            return (Criteria) this;
        }

        public Criteria andOriginAddIsNotNull() {
            addCriterion("OriginAdd is not null");
            return (Criteria) this;
        }

        public Criteria andOriginAddEqualTo(String value) {
            addCriterion("OriginAdd =", value, "originAdd");
            return (Criteria) this;
        }

        public Criteria andOriginAddNotEqualTo(String value) {
            addCriterion("OriginAdd <>", value, "originAdd");
            return (Criteria) this;
        }

        public Criteria andOriginAddGreaterThan(String value) {
            addCriterion("OriginAdd >", value, "originAdd");
            return (Criteria) this;
        }

        public Criteria andOriginAddGreaterThanOrEqualTo(String value) {
            addCriterion("OriginAdd >=", value, "originAdd");
            return (Criteria) this;
        }

        public Criteria andOriginAddLessThan(String value) {
            addCriterion("OriginAdd <", value, "originAdd");
            return (Criteria) this;
        }

        public Criteria andOriginAddLessThanOrEqualTo(String value) {
            addCriterion("OriginAdd <=", value, "originAdd");
            return (Criteria) this;
        }

        public Criteria andOriginAddLike(String value) {
            addCriterion("OriginAdd like", value, "originAdd");
            return (Criteria) this;
        }

        public Criteria andOriginAddNotLike(String value) {
            addCriterion("OriginAdd not like", value, "originAdd");
            return (Criteria) this;
        }

        public Criteria andOriginAddIn(List<String> values) {
            addCriterion("OriginAdd in", values, "originAdd");
            return (Criteria) this;
        }

        public Criteria andOriginAddNotIn(List<String> values) {
            addCriterion("OriginAdd not in", values, "originAdd");
            return (Criteria) this;
        }

        public Criteria andOriginAddBetween(String value1, String value2) {
            addCriterion("OriginAdd between", value1, value2, "originAdd");
            return (Criteria) this;
        }

        public Criteria andOriginAddNotBetween(String value1, String value2) {
            addCriterion("OriginAdd not between", value1, value2, "originAdd");
            return (Criteria) this;
        }

        public Criteria andStuFromIsNull() {
            addCriterion("StuFrom is null");
            return (Criteria) this;
        }

        public Criteria andStuFromIsNotNull() {
            addCriterion("StuFrom is not null");
            return (Criteria) this;
        }

        public Criteria andStuFromEqualTo(String value) {
            addCriterion("StuFrom =", value, "stuFrom");
            return (Criteria) this;
        }

        public Criteria andStuFromNotEqualTo(String value) {
            addCriterion("StuFrom <>", value, "stuFrom");
            return (Criteria) this;
        }

        public Criteria andStuFromGreaterThan(String value) {
            addCriterion("StuFrom >", value, "stuFrom");
            return (Criteria) this;
        }

        public Criteria andStuFromGreaterThanOrEqualTo(String value) {
            addCriterion("StuFrom >=", value, "stuFrom");
            return (Criteria) this;
        }

        public Criteria andStuFromLessThan(String value) {
            addCriterion("StuFrom <", value, "stuFrom");
            return (Criteria) this;
        }

        public Criteria andStuFromLessThanOrEqualTo(String value) {
            addCriterion("StuFrom <=", value, "stuFrom");
            return (Criteria) this;
        }

        public Criteria andStuFromLike(String value) {
            addCriterion("StuFrom like", value, "stuFrom");
            return (Criteria) this;
        }

        public Criteria andStuFromNotLike(String value) {
            addCriterion("StuFrom not like", value, "stuFrom");
            return (Criteria) this;
        }

        public Criteria andStuFromIn(List<String> values) {
            addCriterion("StuFrom in", values, "stuFrom");
            return (Criteria) this;
        }

        public Criteria andStuFromNotIn(List<String> values) {
            addCriterion("StuFrom not in", values, "stuFrom");
            return (Criteria) this;
        }

        public Criteria andStuFromBetween(String value1, String value2) {
            addCriterion("StuFrom between", value1, value2, "stuFrom");
            return (Criteria) this;
        }

        public Criteria andStuFromNotBetween(String value1, String value2) {
            addCriterion("StuFrom not between", value1, value2, "stuFrom");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("StuName is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("StuName is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("StuName =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("StuName <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("StuName >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("StuName >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("StuName <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("StuName <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("StuName like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("StuName not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("StuName in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("StuName not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("StuName between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("StuName not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andNamePinyinIsNull() {
            addCriterion("NamePinyin is null");
            return (Criteria) this;
        }

        public Criteria andNamePinyinIsNotNull() {
            addCriterion("NamePinyin is not null");
            return (Criteria) this;
        }

        public Criteria andNamePinyinEqualTo(String value) {
            addCriterion("NamePinyin =", value, "namePinyin");
            return (Criteria) this;
        }

        public Criteria andNamePinyinNotEqualTo(String value) {
            addCriterion("NamePinyin <>", value, "namePinyin");
            return (Criteria) this;
        }

        public Criteria andNamePinyinGreaterThan(String value) {
            addCriterion("NamePinyin >", value, "namePinyin");
            return (Criteria) this;
        }

        public Criteria andNamePinyinGreaterThanOrEqualTo(String value) {
            addCriterion("NamePinyin >=", value, "namePinyin");
            return (Criteria) this;
        }

        public Criteria andNamePinyinLessThan(String value) {
            addCriterion("NamePinyin <", value, "namePinyin");
            return (Criteria) this;
        }

        public Criteria andNamePinyinLessThanOrEqualTo(String value) {
            addCriterion("NamePinyin <=", value, "namePinyin");
            return (Criteria) this;
        }

        public Criteria andNamePinyinLike(String value) {
            addCriterion("NamePinyin like", value, "namePinyin");
            return (Criteria) this;
        }

        public Criteria andNamePinyinNotLike(String value) {
            addCriterion("NamePinyin not like", value, "namePinyin");
            return (Criteria) this;
        }

        public Criteria andNamePinyinIn(List<String> values) {
            addCriterion("NamePinyin in", values, "namePinyin");
            return (Criteria) this;
        }

        public Criteria andNamePinyinNotIn(List<String> values) {
            addCriterion("NamePinyin not in", values, "namePinyin");
            return (Criteria) this;
        }

        public Criteria andNamePinyinBetween(String value1, String value2) {
            addCriterion("NamePinyin between", value1, value2, "namePinyin");
            return (Criteria) this;
        }

        public Criteria andNamePinyinNotBetween(String value1, String value2) {
            addCriterion("NamePinyin not between", value1, value2, "namePinyin");
            return (Criteria) this;
        }

        public Criteria andOldNameIsNull() {
            addCriterion("OldName is null");
            return (Criteria) this;
        }

        public Criteria andOldNameIsNotNull() {
            addCriterion("OldName is not null");
            return (Criteria) this;
        }

        public Criteria andOldNameEqualTo(String value) {
            addCriterion("OldName =", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameNotEqualTo(String value) {
            addCriterion("OldName <>", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameGreaterThan(String value) {
            addCriterion("OldName >", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameGreaterThanOrEqualTo(String value) {
            addCriterion("OldName >=", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameLessThan(String value) {
            addCriterion("OldName <", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameLessThanOrEqualTo(String value) {
            addCriterion("OldName <=", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameLike(String value) {
            addCriterion("OldName like", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameNotLike(String value) {
            addCriterion("OldName not like", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameIn(List<String> values) {
            addCriterion("OldName in", values, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameNotIn(List<String> values) {
            addCriterion("OldName not in", values, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameBetween(String value1, String value2) {
            addCriterion("OldName between", value1, value2, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameNotBetween(String value1, String value2) {
            addCriterion("OldName not between", value1, value2, "oldName");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("Sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("Sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("Sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("Sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("Sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("Sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("Sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("Sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("Sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("Sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("Sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("Sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("Sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("Sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("Birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("Birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("Birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("Birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("Birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("Birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("Birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("Birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNull() {
            addCriterion("CertType is null");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNotNull() {
            addCriterion("CertType is not null");
            return (Criteria) this;
        }

        public Criteria andCertTypeEqualTo(String value) {
            addCriterion("CertType =", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotEqualTo(String value) {
            addCriterion("CertType <>", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThan(String value) {
            addCriterion("CertType >", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CertType >=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThan(String value) {
            addCriterion("CertType <", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThanOrEqualTo(String value) {
            addCriterion("CertType <=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLike(String value) {
            addCriterion("CertType like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotLike(String value) {
            addCriterion("CertType not like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeIn(List<String> values) {
            addCriterion("CertType in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotIn(List<String> values) {
            addCriterion("CertType not in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeBetween(String value1, String value2) {
            addCriterion("CertType between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotBetween(String value1, String value2) {
            addCriterion("CertType not between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertIDIsNull() {
            addCriterion("CertID is null");
            return (Criteria) this;
        }

        public Criteria andCertIDIsNotNull() {
            addCriterion("CertID is not null");
            return (Criteria) this;
        }

        public Criteria andCertIDEqualTo(String value) {
            addCriterion("CertID =", value, "certID");
            return (Criteria) this;
        }

        public Criteria andCertIDNotEqualTo(String value) {
            addCriterion("CertID <>", value, "certID");
            return (Criteria) this;
        }

        public Criteria andCertIDGreaterThan(String value) {
            addCriterion("CertID >", value, "certID");
            return (Criteria) this;
        }

        public Criteria andCertIDGreaterThanOrEqualTo(String value) {
            addCriterion("CertID >=", value, "certID");
            return (Criteria) this;
        }

        public Criteria andCertIDLessThan(String value) {
            addCriterion("CertID <", value, "certID");
            return (Criteria) this;
        }

        public Criteria andCertIDLessThanOrEqualTo(String value) {
            addCriterion("CertID <=", value, "certID");
            return (Criteria) this;
        }

        public Criteria andCertIDLike(String value) {
            addCriterion("CertID like", value, "certID");
            return (Criteria) this;
        }

        public Criteria andCertIDNotLike(String value) {
            addCriterion("CertID not like", value, "certID");
            return (Criteria) this;
        }

        public Criteria andCertIDIn(List<String> values) {
            addCriterion("CertID in", values, "certID");
            return (Criteria) this;
        }

        public Criteria andCertIDNotIn(List<String> values) {
            addCriterion("CertID not in", values, "certID");
            return (Criteria) this;
        }

        public Criteria andCertIDBetween(String value1, String value2) {
            addCriterion("CertID between", value1, value2, "certID");
            return (Criteria) this;
        }

        public Criteria andCertIDNotBetween(String value1, String value2) {
            addCriterion("CertID not between", value1, value2, "certID");
            return (Criteria) this;
        }

        public Criteria andMarryIsNull() {
            addCriterion("Marry is null");
            return (Criteria) this;
        }

        public Criteria andMarryIsNotNull() {
            addCriterion("Marry is not null");
            return (Criteria) this;
        }

        public Criteria andMarryEqualTo(String value) {
            addCriterion("Marry =", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotEqualTo(String value) {
            addCriterion("Marry <>", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryGreaterThan(String value) {
            addCriterion("Marry >", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryGreaterThanOrEqualTo(String value) {
            addCriterion("Marry >=", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryLessThan(String value) {
            addCriterion("Marry <", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryLessThanOrEqualTo(String value) {
            addCriterion("Marry <=", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryLike(String value) {
            addCriterion("Marry like", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotLike(String value) {
            addCriterion("Marry not like", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryIn(List<String> values) {
            addCriterion("Marry in", values, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotIn(List<String> values) {
            addCriterion("Marry not in", values, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryBetween(String value1, String value2) {
            addCriterion("Marry between", value1, value2, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotBetween(String value1, String value2) {
            addCriterion("Marry not between", value1, value2, "marry");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("Nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("Nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("Nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("Nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("Nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("Nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("Nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("Nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("Nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("Nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("Nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("Nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("Nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("Nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andPoliticalIsNull() {
            addCriterion("Political is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalIsNotNull() {
            addCriterion("Political is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalEqualTo(String value) {
            addCriterion("Political =", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalNotEqualTo(String value) {
            addCriterion("Political <>", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalGreaterThan(String value) {
            addCriterion("Political >", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalGreaterThanOrEqualTo(String value) {
            addCriterion("Political >=", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalLessThan(String value) {
            addCriterion("Political <", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalLessThanOrEqualTo(String value) {
            addCriterion("Political <=", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalLike(String value) {
            addCriterion("Political like", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalNotLike(String value) {
            addCriterion("Political not like", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalIn(List<String> values) {
            addCriterion("Political in", values, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalNotIn(List<String> values) {
            addCriterion("Political not in", values, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalBetween(String value1, String value2) {
            addCriterion("Political between", value1, value2, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalNotBetween(String value1, String value2) {
            addCriterion("Political not between", value1, value2, "political");
            return (Criteria) this;
        }

        public Criteria andSoldierIsNull() {
            addCriterion("Soldier is null");
            return (Criteria) this;
        }

        public Criteria andSoldierIsNotNull() {
            addCriterion("Soldier is not null");
            return (Criteria) this;
        }

        public Criteria andSoldierEqualTo(String value) {
            addCriterion("Soldier =", value, "soldier");
            return (Criteria) this;
        }

        public Criteria andSoldierNotEqualTo(String value) {
            addCriterion("Soldier <>", value, "soldier");
            return (Criteria) this;
        }

        public Criteria andSoldierGreaterThan(String value) {
            addCriterion("Soldier >", value, "soldier");
            return (Criteria) this;
        }

        public Criteria andSoldierGreaterThanOrEqualTo(String value) {
            addCriterion("Soldier >=", value, "soldier");
            return (Criteria) this;
        }

        public Criteria andSoldierLessThan(String value) {
            addCriterion("Soldier <", value, "soldier");
            return (Criteria) this;
        }

        public Criteria andSoldierLessThanOrEqualTo(String value) {
            addCriterion("Soldier <=", value, "soldier");
            return (Criteria) this;
        }

        public Criteria andSoldierLike(String value) {
            addCriterion("Soldier like", value, "soldier");
            return (Criteria) this;
        }

        public Criteria andSoldierNotLike(String value) {
            addCriterion("Soldier not like", value, "soldier");
            return (Criteria) this;
        }

        public Criteria andSoldierIn(List<String> values) {
            addCriterion("Soldier in", values, "soldier");
            return (Criteria) this;
        }

        public Criteria andSoldierNotIn(List<String> values) {
            addCriterion("Soldier not in", values, "soldier");
            return (Criteria) this;
        }

        public Criteria andSoldierBetween(String value1, String value2) {
            addCriterion("Soldier between", value1, value2, "soldier");
            return (Criteria) this;
        }

        public Criteria andSoldierNotBetween(String value1, String value2) {
            addCriterion("Soldier not between", value1, value2, "soldier");
            return (Criteria) this;
        }

        public Criteria andHighSchoolIsNull() {
            addCriterion("HighSchool is null");
            return (Criteria) this;
        }

        public Criteria andHighSchoolIsNotNull() {
            addCriterion("HighSchool is not null");
            return (Criteria) this;
        }

        public Criteria andHighSchoolEqualTo(String value) {
            addCriterion("HighSchool =", value, "highSchool");
            return (Criteria) this;
        }

        public Criteria andHighSchoolNotEqualTo(String value) {
            addCriterion("HighSchool <>", value, "highSchool");
            return (Criteria) this;
        }

        public Criteria andHighSchoolGreaterThan(String value) {
            addCriterion("HighSchool >", value, "highSchool");
            return (Criteria) this;
        }

        public Criteria andHighSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("HighSchool >=", value, "highSchool");
            return (Criteria) this;
        }

        public Criteria andHighSchoolLessThan(String value) {
            addCriterion("HighSchool <", value, "highSchool");
            return (Criteria) this;
        }

        public Criteria andHighSchoolLessThanOrEqualTo(String value) {
            addCriterion("HighSchool <=", value, "highSchool");
            return (Criteria) this;
        }

        public Criteria andHighSchoolLike(String value) {
            addCriterion("HighSchool like", value, "highSchool");
            return (Criteria) this;
        }

        public Criteria andHighSchoolNotLike(String value) {
            addCriterion("HighSchool not like", value, "highSchool");
            return (Criteria) this;
        }

        public Criteria andHighSchoolIn(List<String> values) {
            addCriterion("HighSchool in", values, "highSchool");
            return (Criteria) this;
        }

        public Criteria andHighSchoolNotIn(List<String> values) {
            addCriterion("HighSchool not in", values, "highSchool");
            return (Criteria) this;
        }

        public Criteria andHighSchoolBetween(String value1, String value2) {
            addCriterion("HighSchool between", value1, value2, "highSchool");
            return (Criteria) this;
        }

        public Criteria andHighSchoolNotBetween(String value1, String value2) {
            addCriterion("HighSchool not between", value1, value2, "highSchool");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("School is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("School is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("School =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("School <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("School >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("School >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("School <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("School <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("School like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("School not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("School in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("School not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("School between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("School not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andInstBelongIsNull() {
            addCriterion("InstBelong is null");
            return (Criteria) this;
        }

        public Criteria andInstBelongIsNotNull() {
            addCriterion("InstBelong is not null");
            return (Criteria) this;
        }

        public Criteria andInstBelongEqualTo(String value) {
            addCriterion("InstBelong =", value, "instBelong");
            return (Criteria) this;
        }

        public Criteria andInstBelongNotEqualTo(String value) {
            addCriterion("InstBelong <>", value, "instBelong");
            return (Criteria) this;
        }

        public Criteria andInstBelongGreaterThan(String value) {
            addCriterion("InstBelong >", value, "instBelong");
            return (Criteria) this;
        }

        public Criteria andInstBelongGreaterThanOrEqualTo(String value) {
            addCriterion("InstBelong >=", value, "instBelong");
            return (Criteria) this;
        }

        public Criteria andInstBelongLessThan(String value) {
            addCriterion("InstBelong <", value, "instBelong");
            return (Criteria) this;
        }

        public Criteria andInstBelongLessThanOrEqualTo(String value) {
            addCriterion("InstBelong <=", value, "instBelong");
            return (Criteria) this;
        }

        public Criteria andInstBelongLike(String value) {
            addCriterion("InstBelong like", value, "instBelong");
            return (Criteria) this;
        }

        public Criteria andInstBelongNotLike(String value) {
            addCriterion("InstBelong not like", value, "instBelong");
            return (Criteria) this;
        }

        public Criteria andInstBelongIn(List<String> values) {
            addCriterion("InstBelong in", values, "instBelong");
            return (Criteria) this;
        }

        public Criteria andInstBelongNotIn(List<String> values) {
            addCriterion("InstBelong not in", values, "instBelong");
            return (Criteria) this;
        }

        public Criteria andInstBelongBetween(String value1, String value2) {
            addCriterion("InstBelong between", value1, value2, "instBelong");
            return (Criteria) this;
        }

        public Criteria andInstBelongNotBetween(String value1, String value2) {
            addCriterion("InstBelong not between", value1, value2, "instBelong");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("Major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("Major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("Major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("Major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("Major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("Major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("Major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("Major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("Major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("Major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("Major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("Major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("Major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("Major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andClasseIsNull() {
            addCriterion("Classe is null");
            return (Criteria) this;
        }

        public Criteria andClasseIsNotNull() {
            addCriterion("Classe is not null");
            return (Criteria) this;
        }

        public Criteria andClasseEqualTo(String value) {
            addCriterion("Classe =", value, "classe");
            return (Criteria) this;
        }

        public Criteria andClasseNotEqualTo(String value) {
            addCriterion("Classe <>", value, "classe");
            return (Criteria) this;
        }

        public Criteria andClasseGreaterThan(String value) {
            addCriterion("Classe >", value, "classe");
            return (Criteria) this;
        }

        public Criteria andClasseGreaterThanOrEqualTo(String value) {
            addCriterion("Classe >=", value, "classe");
            return (Criteria) this;
        }

        public Criteria andClasseLessThan(String value) {
            addCriterion("Classe <", value, "classe");
            return (Criteria) this;
        }

        public Criteria andClasseLessThanOrEqualTo(String value) {
            addCriterion("Classe <=", value, "classe");
            return (Criteria) this;
        }

        public Criteria andClasseLike(String value) {
            addCriterion("Classe like", value, "classe");
            return (Criteria) this;
        }

        public Criteria andClasseNotLike(String value) {
            addCriterion("Classe not like", value, "classe");
            return (Criteria) this;
        }

        public Criteria andClasseIn(List<String> values) {
            addCriterion("Classe in", values, "classe");
            return (Criteria) this;
        }

        public Criteria andClasseNotIn(List<String> values) {
            addCriterion("Classe not in", values, "classe");
            return (Criteria) this;
        }

        public Criteria andClasseBetween(String value1, String value2) {
            addCriterion("Classe between", value1, value2, "classe");
            return (Criteria) this;
        }

        public Criteria andClasseNotBetween(String value1, String value2) {
            addCriterion("Classe not between", value1, value2, "classe");
            return (Criteria) this;
        }

        public Criteria andDormitoryIsNull() {
            addCriterion("Dormitory is null");
            return (Criteria) this;
        }

        public Criteria andDormitoryIsNotNull() {
            addCriterion("Dormitory is not null");
            return (Criteria) this;
        }

        public Criteria andDormitoryEqualTo(String value) {
            addCriterion("Dormitory =", value, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryNotEqualTo(String value) {
            addCriterion("Dormitory <>", value, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryGreaterThan(String value) {
            addCriterion("Dormitory >", value, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryGreaterThanOrEqualTo(String value) {
            addCriterion("Dormitory >=", value, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryLessThan(String value) {
            addCriterion("Dormitory <", value, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryLessThanOrEqualTo(String value) {
            addCriterion("Dormitory <=", value, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryLike(String value) {
            addCriterion("Dormitory like", value, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryNotLike(String value) {
            addCriterion("Dormitory not like", value, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryIn(List<String> values) {
            addCriterion("Dormitory in", values, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryNotIn(List<String> values) {
            addCriterion("Dormitory not in", values, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryBetween(String value1, String value2) {
            addCriterion("Dormitory between", value1, value2, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormitoryNotBetween(String value1, String value2) {
            addCriterion("Dormitory not between", value1, value2, "dormitory");
            return (Criteria) this;
        }

        public Criteria andDormTelIsNull() {
            addCriterion("DormTel is null");
            return (Criteria) this;
        }

        public Criteria andDormTelIsNotNull() {
            addCriterion("DormTel is not null");
            return (Criteria) this;
        }

        public Criteria andDormTelEqualTo(String value) {
            addCriterion("DormTel =", value, "dormTel");
            return (Criteria) this;
        }

        public Criteria andDormTelNotEqualTo(String value) {
            addCriterion("DormTel <>", value, "dormTel");
            return (Criteria) this;
        }

        public Criteria andDormTelGreaterThan(String value) {
            addCriterion("DormTel >", value, "dormTel");
            return (Criteria) this;
        }

        public Criteria andDormTelGreaterThanOrEqualTo(String value) {
            addCriterion("DormTel >=", value, "dormTel");
            return (Criteria) this;
        }

        public Criteria andDormTelLessThan(String value) {
            addCriterion("DormTel <", value, "dormTel");
            return (Criteria) this;
        }

        public Criteria andDormTelLessThanOrEqualTo(String value) {
            addCriterion("DormTel <=", value, "dormTel");
            return (Criteria) this;
        }

        public Criteria andDormTelLike(String value) {
            addCriterion("DormTel like", value, "dormTel");
            return (Criteria) this;
        }

        public Criteria andDormTelNotLike(String value) {
            addCriterion("DormTel not like", value, "dormTel");
            return (Criteria) this;
        }

        public Criteria andDormTelIn(List<String> values) {
            addCriterion("DormTel in", values, "dormTel");
            return (Criteria) this;
        }

        public Criteria andDormTelNotIn(List<String> values) {
            addCriterion("DormTel not in", values, "dormTel");
            return (Criteria) this;
        }

        public Criteria andDormTelBetween(String value1, String value2) {
            addCriterion("DormTel between", value1, value2, "dormTel");
            return (Criteria) this;
        }

        public Criteria andDormTelNotBetween(String value1, String value2) {
            addCriterion("DormTel not between", value1, value2, "dormTel");
            return (Criteria) this;
        }

        public Criteria andQQIDIsNull() {
            addCriterion("QQID is null");
            return (Criteria) this;
        }

        public Criteria andQQIDIsNotNull() {
            addCriterion("QQID is not null");
            return (Criteria) this;
        }

        public Criteria andQQIDEqualTo(String value) {
            addCriterion("QQID =", value, "QQID");
            return (Criteria) this;
        }

        public Criteria andQQIDNotEqualTo(String value) {
            addCriterion("QQID <>", value, "QQID");
            return (Criteria) this;
        }

        public Criteria andQQIDGreaterThan(String value) {
            addCriterion("QQID >", value, "QQID");
            return (Criteria) this;
        }

        public Criteria andQQIDGreaterThanOrEqualTo(String value) {
            addCriterion("QQID >=", value, "QQID");
            return (Criteria) this;
        }

        public Criteria andQQIDLessThan(String value) {
            addCriterion("QQID <", value, "QQID");
            return (Criteria) this;
        }

        public Criteria andQQIDLessThanOrEqualTo(String value) {
            addCriterion("QQID <=", value, "QQID");
            return (Criteria) this;
        }

        public Criteria andQQIDLike(String value) {
            addCriterion("QQID like", value, "QQID");
            return (Criteria) this;
        }

        public Criteria andQQIDNotLike(String value) {
            addCriterion("QQID not like", value, "QQID");
            return (Criteria) this;
        }

        public Criteria andQQIDIn(List<String> values) {
            addCriterion("QQID in", values, "QQID");
            return (Criteria) this;
        }

        public Criteria andQQIDNotIn(List<String> values) {
            addCriterion("QQID not in", values, "QQID");
            return (Criteria) this;
        }

        public Criteria andQQIDBetween(String value1, String value2) {
            addCriterion("QQID between", value1, value2, "QQID");
            return (Criteria) this;
        }

        public Criteria andQQIDNotBetween(String value1, String value2) {
            addCriterion("QQID not between", value1, value2, "QQID");
            return (Criteria) this;
        }

        public Criteria andTelePhoneIsNull() {
            addCriterion("TelePhone is null");
            return (Criteria) this;
        }

        public Criteria andTelePhoneIsNotNull() {
            addCriterion("TelePhone is not null");
            return (Criteria) this;
        }

        public Criteria andTelePhoneEqualTo(String value) {
            addCriterion("TelePhone =", value, "telePhone");
            return (Criteria) this;
        }

        public Criteria andTelePhoneNotEqualTo(String value) {
            addCriterion("TelePhone <>", value, "telePhone");
            return (Criteria) this;
        }

        public Criteria andTelePhoneGreaterThan(String value) {
            addCriterion("TelePhone >", value, "telePhone");
            return (Criteria) this;
        }

        public Criteria andTelePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("TelePhone >=", value, "telePhone");
            return (Criteria) this;
        }

        public Criteria andTelePhoneLessThan(String value) {
            addCriterion("TelePhone <", value, "telePhone");
            return (Criteria) this;
        }

        public Criteria andTelePhoneLessThanOrEqualTo(String value) {
            addCriterion("TelePhone <=", value, "telePhone");
            return (Criteria) this;
        }

        public Criteria andTelePhoneLike(String value) {
            addCriterion("TelePhone like", value, "telePhone");
            return (Criteria) this;
        }

        public Criteria andTelePhoneNotLike(String value) {
            addCriterion("TelePhone not like", value, "telePhone");
            return (Criteria) this;
        }

        public Criteria andTelePhoneIn(List<String> values) {
            addCriterion("TelePhone in", values, "telePhone");
            return (Criteria) this;
        }

        public Criteria andTelePhoneNotIn(List<String> values) {
            addCriterion("TelePhone not in", values, "telePhone");
            return (Criteria) this;
        }

        public Criteria andTelePhoneBetween(String value1, String value2) {
            addCriterion("TelePhone between", value1, value2, "telePhone");
            return (Criteria) this;
        }

        public Criteria andTelePhoneNotBetween(String value1, String value2) {
            addCriterion("TelePhone not between", value1, value2, "telePhone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("Bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("Bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("Bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("Bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("Bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("Bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("Bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("Bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("Bank like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("Bank not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("Bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("Bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("Bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("Bank not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankcardIsNull() {
            addCriterion("Bankcard is null");
            return (Criteria) this;
        }

        public Criteria andBankcardIsNotNull() {
            addCriterion("Bankcard is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardEqualTo(String value) {
            addCriterion("Bankcard =", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotEqualTo(String value) {
            addCriterion("Bankcard <>", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardGreaterThan(String value) {
            addCriterion("Bankcard >", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardGreaterThanOrEqualTo(String value) {
            addCriterion("Bankcard >=", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLessThan(String value) {
            addCriterion("Bankcard <", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLessThanOrEqualTo(String value) {
            addCriterion("Bankcard <=", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLike(String value) {
            addCriterion("Bankcard like", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotLike(String value) {
            addCriterion("Bankcard not like", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardIn(List<String> values) {
            addCriterion("Bankcard in", values, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotIn(List<String> values) {
            addCriterion("Bankcard not in", values, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardBetween(String value1, String value2) {
            addCriterion("Bankcard between", value1, value2, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotBetween(String value1, String value2) {
            addCriterion("Bankcard not between", value1, value2, "bankcard");
            return (Criteria) this;
        }

        public Criteria andGraduateIDIsNull() {
            addCriterion("GraduateID is null");
            return (Criteria) this;
        }

        public Criteria andGraduateIDIsNotNull() {
            addCriterion("GraduateID is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateIDEqualTo(String value) {
            addCriterion("GraduateID =", value, "graduateID");
            return (Criteria) this;
        }

        public Criteria andGraduateIDNotEqualTo(String value) {
            addCriterion("GraduateID <>", value, "graduateID");
            return (Criteria) this;
        }

        public Criteria andGraduateIDGreaterThan(String value) {
            addCriterion("GraduateID >", value, "graduateID");
            return (Criteria) this;
        }

        public Criteria andGraduateIDGreaterThanOrEqualTo(String value) {
            addCriterion("GraduateID >=", value, "graduateID");
            return (Criteria) this;
        }

        public Criteria andGraduateIDLessThan(String value) {
            addCriterion("GraduateID <", value, "graduateID");
            return (Criteria) this;
        }

        public Criteria andGraduateIDLessThanOrEqualTo(String value) {
            addCriterion("GraduateID <=", value, "graduateID");
            return (Criteria) this;
        }

        public Criteria andGraduateIDLike(String value) {
            addCriterion("GraduateID like", value, "graduateID");
            return (Criteria) this;
        }

        public Criteria andGraduateIDNotLike(String value) {
            addCriterion("GraduateID not like", value, "graduateID");
            return (Criteria) this;
        }

        public Criteria andGraduateIDIn(List<String> values) {
            addCriterion("GraduateID in", values, "graduateID");
            return (Criteria) this;
        }

        public Criteria andGraduateIDNotIn(List<String> values) {
            addCriterion("GraduateID not in", values, "graduateID");
            return (Criteria) this;
        }

        public Criteria andGraduateIDBetween(String value1, String value2) {
            addCriterion("GraduateID between", value1, value2, "graduateID");
            return (Criteria) this;
        }

        public Criteria andGraduateIDNotBetween(String value1, String value2) {
            addCriterion("GraduateID not between", value1, value2, "graduateID");
            return (Criteria) this;
        }

        public Criteria andDiplomaIDIsNull() {
            addCriterion("DiplomaID is null");
            return (Criteria) this;
        }

        public Criteria andDiplomaIDIsNotNull() {
            addCriterion("DiplomaID is not null");
            return (Criteria) this;
        }

        public Criteria andDiplomaIDEqualTo(String value) {
            addCriterion("DiplomaID =", value, "diplomaID");
            return (Criteria) this;
        }

        public Criteria andDiplomaIDNotEqualTo(String value) {
            addCriterion("DiplomaID <>", value, "diplomaID");
            return (Criteria) this;
        }

        public Criteria andDiplomaIDGreaterThan(String value) {
            addCriterion("DiplomaID >", value, "diplomaID");
            return (Criteria) this;
        }

        public Criteria andDiplomaIDGreaterThanOrEqualTo(String value) {
            addCriterion("DiplomaID >=", value, "diplomaID");
            return (Criteria) this;
        }

        public Criteria andDiplomaIDLessThan(String value) {
            addCriterion("DiplomaID <", value, "diplomaID");
            return (Criteria) this;
        }

        public Criteria andDiplomaIDLessThanOrEqualTo(String value) {
            addCriterion("DiplomaID <=", value, "diplomaID");
            return (Criteria) this;
        }

        public Criteria andDiplomaIDLike(String value) {
            addCriterion("DiplomaID like", value, "diplomaID");
            return (Criteria) this;
        }

        public Criteria andDiplomaIDNotLike(String value) {
            addCriterion("DiplomaID not like", value, "diplomaID");
            return (Criteria) this;
        }

        public Criteria andDiplomaIDIn(List<String> values) {
            addCriterion("DiplomaID in", values, "diplomaID");
            return (Criteria) this;
        }

        public Criteria andDiplomaIDNotIn(List<String> values) {
            addCriterion("DiplomaID not in", values, "diplomaID");
            return (Criteria) this;
        }

        public Criteria andDiplomaIDBetween(String value1, String value2) {
            addCriterion("DiplomaID between", value1, value2, "diplomaID");
            return (Criteria) this;
        }

        public Criteria andDiplomaIDNotBetween(String value1, String value2) {
            addCriterion("DiplomaID not between", value1, value2, "diplomaID");
            return (Criteria) this;
        }

        public Criteria andPartyBelongIsNull() {
            addCriterion("PartyBelong is null");
            return (Criteria) this;
        }

        public Criteria andPartyBelongIsNotNull() {
            addCriterion("PartyBelong is not null");
            return (Criteria) this;
        }

        public Criteria andPartyBelongEqualTo(String value) {
            addCriterion("PartyBelong =", value, "partyBelong");
            return (Criteria) this;
        }

        public Criteria andPartyBelongNotEqualTo(String value) {
            addCriterion("PartyBelong <>", value, "partyBelong");
            return (Criteria) this;
        }

        public Criteria andPartyBelongGreaterThan(String value) {
            addCriterion("PartyBelong >", value, "partyBelong");
            return (Criteria) this;
        }

        public Criteria andPartyBelongGreaterThanOrEqualTo(String value) {
            addCriterion("PartyBelong >=", value, "partyBelong");
            return (Criteria) this;
        }

        public Criteria andPartyBelongLessThan(String value) {
            addCriterion("PartyBelong <", value, "partyBelong");
            return (Criteria) this;
        }

        public Criteria andPartyBelongLessThanOrEqualTo(String value) {
            addCriterion("PartyBelong <=", value, "partyBelong");
            return (Criteria) this;
        }

        public Criteria andPartyBelongLike(String value) {
            addCriterion("PartyBelong like", value, "partyBelong");
            return (Criteria) this;
        }

        public Criteria andPartyBelongNotLike(String value) {
            addCriterion("PartyBelong not like", value, "partyBelong");
            return (Criteria) this;
        }

        public Criteria andPartyBelongIn(List<String> values) {
            addCriterion("PartyBelong in", values, "partyBelong");
            return (Criteria) this;
        }

        public Criteria andPartyBelongNotIn(List<String> values) {
            addCriterion("PartyBelong not in", values, "partyBelong");
            return (Criteria) this;
        }

        public Criteria andPartyBelongBetween(String value1, String value2) {
            addCriterion("PartyBelong between", value1, value2, "partyBelong");
            return (Criteria) this;
        }

        public Criteria andPartyBelongNotBetween(String value1, String value2) {
            addCriterion("PartyBelong not between", value1, value2, "partyBelong");
            return (Criteria) this;
        }

        public Criteria andStuCadreYNIsNull() {
            addCriterion("StuCadreYN is null");
            return (Criteria) this;
        }

        public Criteria andStuCadreYNIsNotNull() {
            addCriterion("StuCadreYN is not null");
            return (Criteria) this;
        }

        public Criteria andStuCadreYNEqualTo(String value) {
            addCriterion("StuCadreYN =", value, "stuCadreYN");
            return (Criteria) this;
        }

        public Criteria andStuCadreYNNotEqualTo(String value) {
            addCriterion("StuCadreYN <>", value, "stuCadreYN");
            return (Criteria) this;
        }

        public Criteria andStuCadreYNGreaterThan(String value) {
            addCriterion("StuCadreYN >", value, "stuCadreYN");
            return (Criteria) this;
        }

        public Criteria andStuCadreYNGreaterThanOrEqualTo(String value) {
            addCriterion("StuCadreYN >=", value, "stuCadreYN");
            return (Criteria) this;
        }

        public Criteria andStuCadreYNLessThan(String value) {
            addCriterion("StuCadreYN <", value, "stuCadreYN");
            return (Criteria) this;
        }

        public Criteria andStuCadreYNLessThanOrEqualTo(String value) {
            addCriterion("StuCadreYN <=", value, "stuCadreYN");
            return (Criteria) this;
        }

        public Criteria andStuCadreYNLike(String value) {
            addCriterion("StuCadreYN like", value, "stuCadreYN");
            return (Criteria) this;
        }

        public Criteria andStuCadreYNNotLike(String value) {
            addCriterion("StuCadreYN not like", value, "stuCadreYN");
            return (Criteria) this;
        }

        public Criteria andStuCadreYNIn(List<String> values) {
            addCriterion("StuCadreYN in", values, "stuCadreYN");
            return (Criteria) this;
        }

        public Criteria andStuCadreYNNotIn(List<String> values) {
            addCriterion("StuCadreYN not in", values, "stuCadreYN");
            return (Criteria) this;
        }

        public Criteria andStuCadreYNBetween(String value1, String value2) {
            addCriterion("StuCadreYN between", value1, value2, "stuCadreYN");
            return (Criteria) this;
        }

        public Criteria andStuCadreYNNotBetween(String value1, String value2) {
            addCriterion("StuCadreYN not between", value1, value2, "stuCadreYN");
            return (Criteria) this;
        }

        public Criteria andStuCadreIsNull() {
            addCriterion("StuCadre is null");
            return (Criteria) this;
        }

        public Criteria andStuCadreIsNotNull() {
            addCriterion("StuCadre is not null");
            return (Criteria) this;
        }

        public Criteria andStuCadreEqualTo(String value) {
            addCriterion("StuCadre =", value, "stuCadre");
            return (Criteria) this;
        }

        public Criteria andStuCadreNotEqualTo(String value) {
            addCriterion("StuCadre <>", value, "stuCadre");
            return (Criteria) this;
        }

        public Criteria andStuCadreGreaterThan(String value) {
            addCriterion("StuCadre >", value, "stuCadre");
            return (Criteria) this;
        }

        public Criteria andStuCadreGreaterThanOrEqualTo(String value) {
            addCriterion("StuCadre >=", value, "stuCadre");
            return (Criteria) this;
        }

        public Criteria andStuCadreLessThan(String value) {
            addCriterion("StuCadre <", value, "stuCadre");
            return (Criteria) this;
        }

        public Criteria andStuCadreLessThanOrEqualTo(String value) {
            addCriterion("StuCadre <=", value, "stuCadre");
            return (Criteria) this;
        }

        public Criteria andStuCadreLike(String value) {
            addCriterion("StuCadre like", value, "stuCadre");
            return (Criteria) this;
        }

        public Criteria andStuCadreNotLike(String value) {
            addCriterion("StuCadre not like", value, "stuCadre");
            return (Criteria) this;
        }

        public Criteria andStuCadreIn(List<String> values) {
            addCriterion("StuCadre in", values, "stuCadre");
            return (Criteria) this;
        }

        public Criteria andStuCadreNotIn(List<String> values) {
            addCriterion("StuCadre not in", values, "stuCadre");
            return (Criteria) this;
        }

        public Criteria andStuCadreBetween(String value1, String value2) {
            addCriterion("StuCadre between", value1, value2, "stuCadre");
            return (Criteria) this;
        }

        public Criteria andStuCadreNotBetween(String value1, String value2) {
            addCriterion("StuCadre not between", value1, value2, "stuCadre");
            return (Criteria) this;
        }

        public Criteria andHomeAddIsNull() {
            addCriterion("HomeAdd is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddIsNotNull() {
            addCriterion("HomeAdd is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddEqualTo(String value) {
            addCriterion("HomeAdd =", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddNotEqualTo(String value) {
            addCriterion("HomeAdd <>", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddGreaterThan(String value) {
            addCriterion("HomeAdd >", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddGreaterThanOrEqualTo(String value) {
            addCriterion("HomeAdd >=", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddLessThan(String value) {
            addCriterion("HomeAdd <", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddLessThanOrEqualTo(String value) {
            addCriterion("HomeAdd <=", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddLike(String value) {
            addCriterion("HomeAdd like", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddNotLike(String value) {
            addCriterion("HomeAdd not like", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddIn(List<String> values) {
            addCriterion("HomeAdd in", values, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddNotIn(List<String> values) {
            addCriterion("HomeAdd not in", values, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddBetween(String value1, String value2) {
            addCriterion("HomeAdd between", value1, value2, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddNotBetween(String value1, String value2) {
            addCriterion("HomeAdd not between", value1, value2, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeZipIsNull() {
            addCriterion("HomeZip is null");
            return (Criteria) this;
        }

        public Criteria andHomeZipIsNotNull() {
            addCriterion("HomeZip is not null");
            return (Criteria) this;
        }

        public Criteria andHomeZipEqualTo(String value) {
            addCriterion("HomeZip =", value, "homeZip");
            return (Criteria) this;
        }

        public Criteria andHomeZipNotEqualTo(String value) {
            addCriterion("HomeZip <>", value, "homeZip");
            return (Criteria) this;
        }

        public Criteria andHomeZipGreaterThan(String value) {
            addCriterion("HomeZip >", value, "homeZip");
            return (Criteria) this;
        }

        public Criteria andHomeZipGreaterThanOrEqualTo(String value) {
            addCriterion("HomeZip >=", value, "homeZip");
            return (Criteria) this;
        }

        public Criteria andHomeZipLessThan(String value) {
            addCriterion("HomeZip <", value, "homeZip");
            return (Criteria) this;
        }

        public Criteria andHomeZipLessThanOrEqualTo(String value) {
            addCriterion("HomeZip <=", value, "homeZip");
            return (Criteria) this;
        }

        public Criteria andHomeZipLike(String value) {
            addCriterion("HomeZip like", value, "homeZip");
            return (Criteria) this;
        }

        public Criteria andHomeZipNotLike(String value) {
            addCriterion("HomeZip not like", value, "homeZip");
            return (Criteria) this;
        }

        public Criteria andHomeZipIn(List<String> values) {
            addCriterion("HomeZip in", values, "homeZip");
            return (Criteria) this;
        }

        public Criteria andHomeZipNotIn(List<String> values) {
            addCriterion("HomeZip not in", values, "homeZip");
            return (Criteria) this;
        }

        public Criteria andHomeZipBetween(String value1, String value2) {
            addCriterion("HomeZip between", value1, value2, "homeZip");
            return (Criteria) this;
        }

        public Criteria andHomeZipNotBetween(String value1, String value2) {
            addCriterion("HomeZip not between", value1, value2, "homeZip");
            return (Criteria) this;
        }

        public Criteria andHomeTeleIsNull() {
            addCriterion("HomeTele is null");
            return (Criteria) this;
        }

        public Criteria andHomeTeleIsNotNull() {
            addCriterion("HomeTele is not null");
            return (Criteria) this;
        }

        public Criteria andHomeTeleEqualTo(String value) {
            addCriterion("HomeTele =", value, "homeTele");
            return (Criteria) this;
        }

        public Criteria andHomeTeleNotEqualTo(String value) {
            addCriterion("HomeTele <>", value, "homeTele");
            return (Criteria) this;
        }

        public Criteria andHomeTeleGreaterThan(String value) {
            addCriterion("HomeTele >", value, "homeTele");
            return (Criteria) this;
        }

        public Criteria andHomeTeleGreaterThanOrEqualTo(String value) {
            addCriterion("HomeTele >=", value, "homeTele");
            return (Criteria) this;
        }

        public Criteria andHomeTeleLessThan(String value) {
            addCriterion("HomeTele <", value, "homeTele");
            return (Criteria) this;
        }

        public Criteria andHomeTeleLessThanOrEqualTo(String value) {
            addCriterion("HomeTele <=", value, "homeTele");
            return (Criteria) this;
        }

        public Criteria andHomeTeleLike(String value) {
            addCriterion("HomeTele like", value, "homeTele");
            return (Criteria) this;
        }

        public Criteria andHomeTeleNotLike(String value) {
            addCriterion("HomeTele not like", value, "homeTele");
            return (Criteria) this;
        }

        public Criteria andHomeTeleIn(List<String> values) {
            addCriterion("HomeTele in", values, "homeTele");
            return (Criteria) this;
        }

        public Criteria andHomeTeleNotIn(List<String> values) {
            addCriterion("HomeTele not in", values, "homeTele");
            return (Criteria) this;
        }

        public Criteria andHomeTeleBetween(String value1, String value2) {
            addCriterion("HomeTele between", value1, value2, "homeTele");
            return (Criteria) this;
        }

        public Criteria andHomeTeleNotBetween(String value1, String value2) {
            addCriterion("HomeTele not between", value1, value2, "homeTele");
            return (Criteria) this;
        }

        public Criteria andFatherNameIsNull() {
            addCriterion("FatherName is null");
            return (Criteria) this;
        }

        public Criteria andFatherNameIsNotNull() {
            addCriterion("FatherName is not null");
            return (Criteria) this;
        }

        public Criteria andFatherNameEqualTo(String value) {
            addCriterion("FatherName =", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameNotEqualTo(String value) {
            addCriterion("FatherName <>", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameGreaterThan(String value) {
            addCriterion("FatherName >", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameGreaterThanOrEqualTo(String value) {
            addCriterion("FatherName >=", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameLessThan(String value) {
            addCriterion("FatherName <", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameLessThanOrEqualTo(String value) {
            addCriterion("FatherName <=", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameLike(String value) {
            addCriterion("FatherName like", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameNotLike(String value) {
            addCriterion("FatherName not like", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameIn(List<String> values) {
            addCriterion("FatherName in", values, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameNotIn(List<String> values) {
            addCriterion("FatherName not in", values, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameBetween(String value1, String value2) {
            addCriterion("FatherName between", value1, value2, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameNotBetween(String value1, String value2) {
            addCriterion("FatherName not between", value1, value2, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherTeleIsNull() {
            addCriterion("FatherTele is null");
            return (Criteria) this;
        }

        public Criteria andFatherTeleIsNotNull() {
            addCriterion("FatherTele is not null");
            return (Criteria) this;
        }

        public Criteria andFatherTeleEqualTo(String value) {
            addCriterion("FatherTele =", value, "fatherTele");
            return (Criteria) this;
        }

        public Criteria andFatherTeleNotEqualTo(String value) {
            addCriterion("FatherTele <>", value, "fatherTele");
            return (Criteria) this;
        }

        public Criteria andFatherTeleGreaterThan(String value) {
            addCriterion("FatherTele >", value, "fatherTele");
            return (Criteria) this;
        }

        public Criteria andFatherTeleGreaterThanOrEqualTo(String value) {
            addCriterion("FatherTele >=", value, "fatherTele");
            return (Criteria) this;
        }

        public Criteria andFatherTeleLessThan(String value) {
            addCriterion("FatherTele <", value, "fatherTele");
            return (Criteria) this;
        }

        public Criteria andFatherTeleLessThanOrEqualTo(String value) {
            addCriterion("FatherTele <=", value, "fatherTele");
            return (Criteria) this;
        }

        public Criteria andFatherTeleLike(String value) {
            addCriterion("FatherTele like", value, "fatherTele");
            return (Criteria) this;
        }

        public Criteria andFatherTeleNotLike(String value) {
            addCriterion("FatherTele not like", value, "fatherTele");
            return (Criteria) this;
        }

        public Criteria andFatherTeleIn(List<String> values) {
            addCriterion("FatherTele in", values, "fatherTele");
            return (Criteria) this;
        }

        public Criteria andFatherTeleNotIn(List<String> values) {
            addCriterion("FatherTele not in", values, "fatherTele");
            return (Criteria) this;
        }

        public Criteria andFatherTeleBetween(String value1, String value2) {
            addCriterion("FatherTele between", value1, value2, "fatherTele");
            return (Criteria) this;
        }

        public Criteria andFatherTeleNotBetween(String value1, String value2) {
            addCriterion("FatherTele not between", value1, value2, "fatherTele");
            return (Criteria) this;
        }

        public Criteria andMotherNameIsNull() {
            addCriterion("MotherName is null");
            return (Criteria) this;
        }

        public Criteria andMotherNameIsNotNull() {
            addCriterion("MotherName is not null");
            return (Criteria) this;
        }

        public Criteria andMotherNameEqualTo(String value) {
            addCriterion("MotherName =", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameNotEqualTo(String value) {
            addCriterion("MotherName <>", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameGreaterThan(String value) {
            addCriterion("MotherName >", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameGreaterThanOrEqualTo(String value) {
            addCriterion("MotherName >=", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameLessThan(String value) {
            addCriterion("MotherName <", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameLessThanOrEqualTo(String value) {
            addCriterion("MotherName <=", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameLike(String value) {
            addCriterion("MotherName like", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameNotLike(String value) {
            addCriterion("MotherName not like", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameIn(List<String> values) {
            addCriterion("MotherName in", values, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameNotIn(List<String> values) {
            addCriterion("MotherName not in", values, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameBetween(String value1, String value2) {
            addCriterion("MotherName between", value1, value2, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameNotBetween(String value1, String value2) {
            addCriterion("MotherName not between", value1, value2, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherTeleIsNull() {
            addCriterion("MotherTele is null");
            return (Criteria) this;
        }

        public Criteria andMotherTeleIsNotNull() {
            addCriterion("MotherTele is not null");
            return (Criteria) this;
        }

        public Criteria andMotherTeleEqualTo(String value) {
            addCriterion("MotherTele =", value, "motherTele");
            return (Criteria) this;
        }

        public Criteria andMotherTeleNotEqualTo(String value) {
            addCriterion("MotherTele <>", value, "motherTele");
            return (Criteria) this;
        }

        public Criteria andMotherTeleGreaterThan(String value) {
            addCriterion("MotherTele >", value, "motherTele");
            return (Criteria) this;
        }

        public Criteria andMotherTeleGreaterThanOrEqualTo(String value) {
            addCriterion("MotherTele >=", value, "motherTele");
            return (Criteria) this;
        }

        public Criteria andMotherTeleLessThan(String value) {
            addCriterion("MotherTele <", value, "motherTele");
            return (Criteria) this;
        }

        public Criteria andMotherTeleLessThanOrEqualTo(String value) {
            addCriterion("MotherTele <=", value, "motherTele");
            return (Criteria) this;
        }

        public Criteria andMotherTeleLike(String value) {
            addCriterion("MotherTele like", value, "motherTele");
            return (Criteria) this;
        }

        public Criteria andMotherTeleNotLike(String value) {
            addCriterion("MotherTele not like", value, "motherTele");
            return (Criteria) this;
        }

        public Criteria andMotherTeleIn(List<String> values) {
            addCriterion("MotherTele in", values, "motherTele");
            return (Criteria) this;
        }

        public Criteria andMotherTeleNotIn(List<String> values) {
            addCriterion("MotherTele not in", values, "motherTele");
            return (Criteria) this;
        }

        public Criteria andMotherTeleBetween(String value1, String value2) {
            addCriterion("MotherTele between", value1, value2, "motherTele");
            return (Criteria) this;
        }

        public Criteria andMotherTeleNotBetween(String value1, String value2) {
            addCriterion("MotherTele not between", value1, value2, "motherTele");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNull() {
            addCriterion("Hobby is null");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNotNull() {
            addCriterion("Hobby is not null");
            return (Criteria) this;
        }

        public Criteria andHobbyEqualTo(String value) {
            addCriterion("Hobby =", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotEqualTo(String value) {
            addCriterion("Hobby <>", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThan(String value) {
            addCriterion("Hobby >", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("Hobby >=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThan(String value) {
            addCriterion("Hobby <", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThanOrEqualTo(String value) {
            addCriterion("Hobby <=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLike(String value) {
            addCriterion("Hobby like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotLike(String value) {
            addCriterion("Hobby not like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyIn(List<String> values) {
            addCriterion("Hobby in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotIn(List<String> values) {
            addCriterion("Hobby not in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyBetween(String value1, String value2) {
            addCriterion("Hobby between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotBetween(String value1, String value2) {
            addCriterion("Hobby not between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andPerProfileIsNull() {
            addCriterion("PerProfile is null");
            return (Criteria) this;
        }

        public Criteria andPerProfileIsNotNull() {
            addCriterion("PerProfile is not null");
            return (Criteria) this;
        }

        public Criteria andPerProfileEqualTo(String value) {
            addCriterion("PerProfile =", value, "perProfile");
            return (Criteria) this;
        }

        public Criteria andPerProfileNotEqualTo(String value) {
            addCriterion("PerProfile <>", value, "perProfile");
            return (Criteria) this;
        }

        public Criteria andPerProfileGreaterThan(String value) {
            addCriterion("PerProfile >", value, "perProfile");
            return (Criteria) this;
        }

        public Criteria andPerProfileGreaterThanOrEqualTo(String value) {
            addCriterion("PerProfile >=", value, "perProfile");
            return (Criteria) this;
        }

        public Criteria andPerProfileLessThan(String value) {
            addCriterion("PerProfile <", value, "perProfile");
            return (Criteria) this;
        }

        public Criteria andPerProfileLessThanOrEqualTo(String value) {
            addCriterion("PerProfile <=", value, "perProfile");
            return (Criteria) this;
        }

        public Criteria andPerProfileLike(String value) {
            addCriterion("PerProfile like", value, "perProfile");
            return (Criteria) this;
        }

        public Criteria andPerProfileNotLike(String value) {
            addCriterion("PerProfile not like", value, "perProfile");
            return (Criteria) this;
        }

        public Criteria andPerProfileIn(List<String> values) {
            addCriterion("PerProfile in", values, "perProfile");
            return (Criteria) this;
        }

        public Criteria andPerProfileNotIn(List<String> values) {
            addCriterion("PerProfile not in", values, "perProfile");
            return (Criteria) this;
        }

        public Criteria andPerProfileBetween(String value1, String value2) {
            addCriterion("PerProfile between", value1, value2, "perProfile");
            return (Criteria) this;
        }

        public Criteria andPerProfileNotBetween(String value1, String value2) {
            addCriterion("PerProfile not between", value1, value2, "perProfile");
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