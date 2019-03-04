package mr.s.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeacherIDIsNull() {
            addCriterion("TeacherID is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIDIsNotNull() {
            addCriterion("TeacherID is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIDEqualTo(String value) {
            addCriterion("TeacherID =", value, "teacherID");
            return (Criteria) this;
        }

        public Criteria andTeacherIDNotEqualTo(String value) {
            addCriterion("TeacherID <>", value, "teacherID");
            return (Criteria) this;
        }

        public Criteria andTeacherIDGreaterThan(String value) {
            addCriterion("TeacherID >", value, "teacherID");
            return (Criteria) this;
        }

        public Criteria andTeacherIDGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherID >=", value, "teacherID");
            return (Criteria) this;
        }

        public Criteria andTeacherIDLessThan(String value) {
            addCriterion("TeacherID <", value, "teacherID");
            return (Criteria) this;
        }

        public Criteria andTeacherIDLessThanOrEqualTo(String value) {
            addCriterion("TeacherID <=", value, "teacherID");
            return (Criteria) this;
        }

        public Criteria andTeacherIDLike(String value) {
            addCriterion("TeacherID like", value, "teacherID");
            return (Criteria) this;
        }

        public Criteria andTeacherIDNotLike(String value) {
            addCriterion("TeacherID not like", value, "teacherID");
            return (Criteria) this;
        }

        public Criteria andTeacherIDIn(List<String> values) {
            addCriterion("TeacherID in", values, "teacherID");
            return (Criteria) this;
        }

        public Criteria andTeacherIDNotIn(List<String> values) {
            addCriterion("TeacherID not in", values, "teacherID");
            return (Criteria) this;
        }

        public Criteria andTeacherIDBetween(String value1, String value2) {
            addCriterion("TeacherID between", value1, value2, "teacherID");
            return (Criteria) this;
        }

        public Criteria andTeacherIDNotBetween(String value1, String value2) {
            addCriterion("TeacherID not between", value1, value2, "teacherID");
            return (Criteria) this;
        }

        public Criteria andTeaNameIsNull() {
            addCriterion("TeaName is null");
            return (Criteria) this;
        }

        public Criteria andTeaNameIsNotNull() {
            addCriterion("TeaName is not null");
            return (Criteria) this;
        }

        public Criteria andTeaNameEqualTo(String value) {
            addCriterion("TeaName =", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotEqualTo(String value) {
            addCriterion("TeaName <>", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameGreaterThan(String value) {
            addCriterion("TeaName >", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameGreaterThanOrEqualTo(String value) {
            addCriterion("TeaName >=", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLessThan(String value) {
            addCriterion("TeaName <", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLessThanOrEqualTo(String value) {
            addCriterion("TeaName <=", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLike(String value) {
            addCriterion("TeaName like", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotLike(String value) {
            addCriterion("TeaName not like", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameIn(List<String> values) {
            addCriterion("TeaName in", values, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotIn(List<String> values) {
            addCriterion("TeaName not in", values, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameBetween(String value1, String value2) {
            addCriterion("TeaName between", value1, value2, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotBetween(String value1, String value2) {
            addCriterion("TeaName not between", value1, value2, "teaName");
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

        public Criteria andHealthIsNull() {
            addCriterion("Health is null");
            return (Criteria) this;
        }

        public Criteria andHealthIsNotNull() {
            addCriterion("Health is not null");
            return (Criteria) this;
        }

        public Criteria andHealthEqualTo(String value) {
            addCriterion("Health =", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotEqualTo(String value) {
            addCriterion("Health <>", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthGreaterThan(String value) {
            addCriterion("Health >", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthGreaterThanOrEqualTo(String value) {
            addCriterion("Health >=", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLessThan(String value) {
            addCriterion("Health <", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLessThanOrEqualTo(String value) {
            addCriterion("Health <=", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLike(String value) {
            addCriterion("Health like", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotLike(String value) {
            addCriterion("Health not like", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthIn(List<String> values) {
            addCriterion("Health in", values, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotIn(List<String> values) {
            addCriterion("Health not in", values, "health");
            return (Criteria) this;
        }

        public Criteria andHealthBetween(String value1, String value2) {
            addCriterion("Health between", value1, value2, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotBetween(String value1, String value2) {
            addCriterion("Health not between", value1, value2, "health");
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

        public Criteria andGraduateIsNull() {
            addCriterion("Graduate is null");
            return (Criteria) this;
        }

        public Criteria andGraduateIsNotNull() {
            addCriterion("Graduate is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateEqualTo(String value) {
            addCriterion("Graduate =", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateNotEqualTo(String value) {
            addCriterion("Graduate <>", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateGreaterThan(String value) {
            addCriterion("Graduate >", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateGreaterThanOrEqualTo(String value) {
            addCriterion("Graduate >=", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateLessThan(String value) {
            addCriterion("Graduate <", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateLessThanOrEqualTo(String value) {
            addCriterion("Graduate <=", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateLike(String value) {
            addCriterion("Graduate like", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateNotLike(String value) {
            addCriterion("Graduate not like", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateIn(List<String> values) {
            addCriterion("Graduate in", values, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateNotIn(List<String> values) {
            addCriterion("Graduate not in", values, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateBetween(String value1, String value2) {
            addCriterion("Graduate between", value1, value2, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateNotBetween(String value1, String value2) {
            addCriterion("Graduate not between", value1, value2, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraTimeIsNull() {
            addCriterion("GraTime is null");
            return (Criteria) this;
        }

        public Criteria andGraTimeIsNotNull() {
            addCriterion("GraTime is not null");
            return (Criteria) this;
        }

        public Criteria andGraTimeEqualTo(Date value) {
            addCriterionForJDBCDate("GraTime =", value, "graTime");
            return (Criteria) this;
        }

        public Criteria andGraTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("GraTime <>", value, "graTime");
            return (Criteria) this;
        }

        public Criteria andGraTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("GraTime >", value, "graTime");
            return (Criteria) this;
        }

        public Criteria andGraTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GraTime >=", value, "graTime");
            return (Criteria) this;
        }

        public Criteria andGraTimeLessThan(Date value) {
            addCriterionForJDBCDate("GraTime <", value, "graTime");
            return (Criteria) this;
        }

        public Criteria andGraTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GraTime <=", value, "graTime");
            return (Criteria) this;
        }

        public Criteria andGraTimeIn(List<Date> values) {
            addCriterionForJDBCDate("GraTime in", values, "graTime");
            return (Criteria) this;
        }

        public Criteria andGraTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("GraTime not in", values, "graTime");
            return (Criteria) this;
        }

        public Criteria andGraTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GraTime between", value1, value2, "graTime");
            return (Criteria) this;
        }

        public Criteria andGraTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GraTime not between", value1, value2, "graTime");
            return (Criteria) this;
        }

        public Criteria andDiplomaIsNull() {
            addCriterion("Diploma is null");
            return (Criteria) this;
        }

        public Criteria andDiplomaIsNotNull() {
            addCriterion("Diploma is not null");
            return (Criteria) this;
        }

        public Criteria andDiplomaEqualTo(String value) {
            addCriterion("Diploma =", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaNotEqualTo(String value) {
            addCriterion("Diploma <>", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaGreaterThan(String value) {
            addCriterion("Diploma >", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaGreaterThanOrEqualTo(String value) {
            addCriterion("Diploma >=", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaLessThan(String value) {
            addCriterion("Diploma <", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaLessThanOrEqualTo(String value) {
            addCriterion("Diploma <=", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaLike(String value) {
            addCriterion("Diploma like", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaNotLike(String value) {
            addCriterion("Diploma not like", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaIn(List<String> values) {
            addCriterion("Diploma in", values, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaNotIn(List<String> values) {
            addCriterion("Diploma not in", values, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaBetween(String value1, String value2) {
            addCriterion("Diploma between", value1, value2, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaNotBetween(String value1, String value2) {
            addCriterion("Diploma not between", value1, value2, "diploma");
            return (Criteria) this;
        }

        public Criteria andDipTimeIsNull() {
            addCriterion("DipTime is null");
            return (Criteria) this;
        }

        public Criteria andDipTimeIsNotNull() {
            addCriterion("DipTime is not null");
            return (Criteria) this;
        }

        public Criteria andDipTimeEqualTo(Date value) {
            addCriterionForJDBCDate("DipTime =", value, "dipTime");
            return (Criteria) this;
        }

        public Criteria andDipTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("DipTime <>", value, "dipTime");
            return (Criteria) this;
        }

        public Criteria andDipTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("DipTime >", value, "dipTime");
            return (Criteria) this;
        }

        public Criteria andDipTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DipTime >=", value, "dipTime");
            return (Criteria) this;
        }

        public Criteria andDipTimeLessThan(Date value) {
            addCriterionForJDBCDate("DipTime <", value, "dipTime");
            return (Criteria) this;
        }

        public Criteria andDipTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DipTime <=", value, "dipTime");
            return (Criteria) this;
        }

        public Criteria andDipTimeIn(List<Date> values) {
            addCriterionForJDBCDate("DipTime in", values, "dipTime");
            return (Criteria) this;
        }

        public Criteria andDipTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("DipTime not in", values, "dipTime");
            return (Criteria) this;
        }

        public Criteria andDipTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DipTime between", value1, value2, "dipTime");
            return (Criteria) this;
        }

        public Criteria andDipTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DipTime not between", value1, value2, "dipTime");
            return (Criteria) this;
        }

        public Criteria andGraSchoolIsNull() {
            addCriterion("GraSchool is null");
            return (Criteria) this;
        }

        public Criteria andGraSchoolIsNotNull() {
            addCriterion("GraSchool is not null");
            return (Criteria) this;
        }

        public Criteria andGraSchoolEqualTo(String value) {
            addCriterion("GraSchool =", value, "graSchool");
            return (Criteria) this;
        }

        public Criteria andGraSchoolNotEqualTo(String value) {
            addCriterion("GraSchool <>", value, "graSchool");
            return (Criteria) this;
        }

        public Criteria andGraSchoolGreaterThan(String value) {
            addCriterion("GraSchool >", value, "graSchool");
            return (Criteria) this;
        }

        public Criteria andGraSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("GraSchool >=", value, "graSchool");
            return (Criteria) this;
        }

        public Criteria andGraSchoolLessThan(String value) {
            addCriterion("GraSchool <", value, "graSchool");
            return (Criteria) this;
        }

        public Criteria andGraSchoolLessThanOrEqualTo(String value) {
            addCriterion("GraSchool <=", value, "graSchool");
            return (Criteria) this;
        }

        public Criteria andGraSchoolLike(String value) {
            addCriterion("GraSchool like", value, "graSchool");
            return (Criteria) this;
        }

        public Criteria andGraSchoolNotLike(String value) {
            addCriterion("GraSchool not like", value, "graSchool");
            return (Criteria) this;
        }

        public Criteria andGraSchoolIn(List<String> values) {
            addCriterion("GraSchool in", values, "graSchool");
            return (Criteria) this;
        }

        public Criteria andGraSchoolNotIn(List<String> values) {
            addCriterion("GraSchool not in", values, "graSchool");
            return (Criteria) this;
        }

        public Criteria andGraSchoolBetween(String value1, String value2) {
            addCriterion("GraSchool between", value1, value2, "graSchool");
            return (Criteria) this;
        }

        public Criteria andGraSchoolNotBetween(String value1, String value2) {
            addCriterion("GraSchool not between", value1, value2, "graSchool");
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

        public Criteria andPositionIsNull() {
            addCriterion("Position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("Position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("Position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("Position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("Position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("Position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("Position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("Position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("Position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("Position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("Position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("Position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("Position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("Position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPosTimeIsNull() {
            addCriterion("PosTime is null");
            return (Criteria) this;
        }

        public Criteria andPosTimeIsNotNull() {
            addCriterion("PosTime is not null");
            return (Criteria) this;
        }

        public Criteria andPosTimeEqualTo(Date value) {
            addCriterionForJDBCDate("PosTime =", value, "posTime");
            return (Criteria) this;
        }

        public Criteria andPosTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("PosTime <>", value, "posTime");
            return (Criteria) this;
        }

        public Criteria andPosTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("PosTime >", value, "posTime");
            return (Criteria) this;
        }

        public Criteria andPosTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PosTime >=", value, "posTime");
            return (Criteria) this;
        }

        public Criteria andPosTimeLessThan(Date value) {
            addCriterionForJDBCDate("PosTime <", value, "posTime");
            return (Criteria) this;
        }

        public Criteria andPosTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PosTime <=", value, "posTime");
            return (Criteria) this;
        }

        public Criteria andPosTimeIn(List<Date> values) {
            addCriterionForJDBCDate("PosTime in", values, "posTime");
            return (Criteria) this;
        }

        public Criteria andPosTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("PosTime not in", values, "posTime");
            return (Criteria) this;
        }

        public Criteria andPosTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PosTime between", value1, value2, "posTime");
            return (Criteria) this;
        }

        public Criteria andPosTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PosTime not between", value1, value2, "posTime");
            return (Criteria) this;
        }

        public Criteria andOfficerIsNull() {
            addCriterion("Officer is null");
            return (Criteria) this;
        }

        public Criteria andOfficerIsNotNull() {
            addCriterion("Officer is not null");
            return (Criteria) this;
        }

        public Criteria andOfficerEqualTo(String value) {
            addCriterion("Officer =", value, "officer");
            return (Criteria) this;
        }

        public Criteria andOfficerNotEqualTo(String value) {
            addCriterion("Officer <>", value, "officer");
            return (Criteria) this;
        }

        public Criteria andOfficerGreaterThan(String value) {
            addCriterion("Officer >", value, "officer");
            return (Criteria) this;
        }

        public Criteria andOfficerGreaterThanOrEqualTo(String value) {
            addCriterion("Officer >=", value, "officer");
            return (Criteria) this;
        }

        public Criteria andOfficerLessThan(String value) {
            addCriterion("Officer <", value, "officer");
            return (Criteria) this;
        }

        public Criteria andOfficerLessThanOrEqualTo(String value) {
            addCriterion("Officer <=", value, "officer");
            return (Criteria) this;
        }

        public Criteria andOfficerLike(String value) {
            addCriterion("Officer like", value, "officer");
            return (Criteria) this;
        }

        public Criteria andOfficerNotLike(String value) {
            addCriterion("Officer not like", value, "officer");
            return (Criteria) this;
        }

        public Criteria andOfficerIn(List<String> values) {
            addCriterion("Officer in", values, "officer");
            return (Criteria) this;
        }

        public Criteria andOfficerNotIn(List<String> values) {
            addCriterion("Officer not in", values, "officer");
            return (Criteria) this;
        }

        public Criteria andOfficerBetween(String value1, String value2) {
            addCriterion("Officer between", value1, value2, "officer");
            return (Criteria) this;
        }

        public Criteria andOfficerNotBetween(String value1, String value2) {
            addCriterion("Officer not between", value1, value2, "officer");
            return (Criteria) this;
        }

        public Criteria andOffTimeIsNull() {
            addCriterion("OffTime is null");
            return (Criteria) this;
        }

        public Criteria andOffTimeIsNotNull() {
            addCriterion("OffTime is not null");
            return (Criteria) this;
        }

        public Criteria andOffTimeEqualTo(Date value) {
            addCriterionForJDBCDate("OffTime =", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("OffTime <>", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("OffTime >", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OffTime >=", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeLessThan(Date value) {
            addCriterionForJDBCDate("OffTime <", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OffTime <=", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeIn(List<Date> values) {
            addCriterionForJDBCDate("OffTime in", values, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("OffTime not in", values, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OffTime between", value1, value2, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OffTime not between", value1, value2, "offTime");
            return (Criteria) this;
        }

        public Criteria andSchPostIsNull() {
            addCriterion("SchPost is null");
            return (Criteria) this;
        }

        public Criteria andSchPostIsNotNull() {
            addCriterion("SchPost is not null");
            return (Criteria) this;
        }

        public Criteria andSchPostEqualTo(String value) {
            addCriterion("SchPost =", value, "schPost");
            return (Criteria) this;
        }

        public Criteria andSchPostNotEqualTo(String value) {
            addCriterion("SchPost <>", value, "schPost");
            return (Criteria) this;
        }

        public Criteria andSchPostGreaterThan(String value) {
            addCriterion("SchPost >", value, "schPost");
            return (Criteria) this;
        }

        public Criteria andSchPostGreaterThanOrEqualTo(String value) {
            addCriterion("SchPost >=", value, "schPost");
            return (Criteria) this;
        }

        public Criteria andSchPostLessThan(String value) {
            addCriterion("SchPost <", value, "schPost");
            return (Criteria) this;
        }

        public Criteria andSchPostLessThanOrEqualTo(String value) {
            addCriterion("SchPost <=", value, "schPost");
            return (Criteria) this;
        }

        public Criteria andSchPostLike(String value) {
            addCriterion("SchPost like", value, "schPost");
            return (Criteria) this;
        }

        public Criteria andSchPostNotLike(String value) {
            addCriterion("SchPost not like", value, "schPost");
            return (Criteria) this;
        }

        public Criteria andSchPostIn(List<String> values) {
            addCriterion("SchPost in", values, "schPost");
            return (Criteria) this;
        }

        public Criteria andSchPostNotIn(List<String> values) {
            addCriterion("SchPost not in", values, "schPost");
            return (Criteria) this;
        }

        public Criteria andSchPostBetween(String value1, String value2) {
            addCriterion("SchPost between", value1, value2, "schPost");
            return (Criteria) this;
        }

        public Criteria andSchPostNotBetween(String value1, String value2) {
            addCriterion("SchPost not between", value1, value2, "schPost");
            return (Criteria) this;
        }

        public Criteria andPerStatusIsNull() {
            addCriterion("PerStatus is null");
            return (Criteria) this;
        }

        public Criteria andPerStatusIsNotNull() {
            addCriterion("PerStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPerStatusEqualTo(String value) {
            addCriterion("PerStatus =", value, "perStatus");
            return (Criteria) this;
        }

        public Criteria andPerStatusNotEqualTo(String value) {
            addCriterion("PerStatus <>", value, "perStatus");
            return (Criteria) this;
        }

        public Criteria andPerStatusGreaterThan(String value) {
            addCriterion("PerStatus >", value, "perStatus");
            return (Criteria) this;
        }

        public Criteria andPerStatusGreaterThanOrEqualTo(String value) {
            addCriterion("PerStatus >=", value, "perStatus");
            return (Criteria) this;
        }

        public Criteria andPerStatusLessThan(String value) {
            addCriterion("PerStatus <", value, "perStatus");
            return (Criteria) this;
        }

        public Criteria andPerStatusLessThanOrEqualTo(String value) {
            addCriterion("PerStatus <=", value, "perStatus");
            return (Criteria) this;
        }

        public Criteria andPerStatusLike(String value) {
            addCriterion("PerStatus like", value, "perStatus");
            return (Criteria) this;
        }

        public Criteria andPerStatusNotLike(String value) {
            addCriterion("PerStatus not like", value, "perStatus");
            return (Criteria) this;
        }

        public Criteria andPerStatusIn(List<String> values) {
            addCriterion("PerStatus in", values, "perStatus");
            return (Criteria) this;
        }

        public Criteria andPerStatusNotIn(List<String> values) {
            addCriterion("PerStatus not in", values, "perStatus");
            return (Criteria) this;
        }

        public Criteria andPerStatusBetween(String value1, String value2) {
            addCriterion("PerStatus between", value1, value2, "perStatus");
            return (Criteria) this;
        }

        public Criteria andPerStatusNotBetween(String value1, String value2) {
            addCriterion("PerStatus not between", value1, value2, "perStatus");
            return (Criteria) this;
        }

        public Criteria andIsTeaCertIsNull() {
            addCriterion("IsTeaCert is null");
            return (Criteria) this;
        }

        public Criteria andIsTeaCertIsNotNull() {
            addCriterion("IsTeaCert is not null");
            return (Criteria) this;
        }

        public Criteria andIsTeaCertEqualTo(String value) {
            addCriterion("IsTeaCert =", value, "isTeaCert");
            return (Criteria) this;
        }

        public Criteria andIsTeaCertNotEqualTo(String value) {
            addCriterion("IsTeaCert <>", value, "isTeaCert");
            return (Criteria) this;
        }

        public Criteria andIsTeaCertGreaterThan(String value) {
            addCriterion("IsTeaCert >", value, "isTeaCert");
            return (Criteria) this;
        }

        public Criteria andIsTeaCertGreaterThanOrEqualTo(String value) {
            addCriterion("IsTeaCert >=", value, "isTeaCert");
            return (Criteria) this;
        }

        public Criteria andIsTeaCertLessThan(String value) {
            addCriterion("IsTeaCert <", value, "isTeaCert");
            return (Criteria) this;
        }

        public Criteria andIsTeaCertLessThanOrEqualTo(String value) {
            addCriterion("IsTeaCert <=", value, "isTeaCert");
            return (Criteria) this;
        }

        public Criteria andIsTeaCertLike(String value) {
            addCriterion("IsTeaCert like", value, "isTeaCert");
            return (Criteria) this;
        }

        public Criteria andIsTeaCertNotLike(String value) {
            addCriterion("IsTeaCert not like", value, "isTeaCert");
            return (Criteria) this;
        }

        public Criteria andIsTeaCertIn(List<String> values) {
            addCriterion("IsTeaCert in", values, "isTeaCert");
            return (Criteria) this;
        }

        public Criteria andIsTeaCertNotIn(List<String> values) {
            addCriterion("IsTeaCert not in", values, "isTeaCert");
            return (Criteria) this;
        }

        public Criteria andIsTeaCertBetween(String value1, String value2) {
            addCriterion("IsTeaCert between", value1, value2, "isTeaCert");
            return (Criteria) this;
        }

        public Criteria andIsTeaCertNotBetween(String value1, String value2) {
            addCriterion("IsTeaCert not between", value1, value2, "isTeaCert");
            return (Criteria) this;
        }

        public Criteria andTeaCertIsNull() {
            addCriterion("TeaCert is null");
            return (Criteria) this;
        }

        public Criteria andTeaCertIsNotNull() {
            addCriterion("TeaCert is not null");
            return (Criteria) this;
        }

        public Criteria andTeaCertEqualTo(String value) {
            addCriterion("TeaCert =", value, "teaCert");
            return (Criteria) this;
        }

        public Criteria andTeaCertNotEqualTo(String value) {
            addCriterion("TeaCert <>", value, "teaCert");
            return (Criteria) this;
        }

        public Criteria andTeaCertGreaterThan(String value) {
            addCriterion("TeaCert >", value, "teaCert");
            return (Criteria) this;
        }

        public Criteria andTeaCertGreaterThanOrEqualTo(String value) {
            addCriterion("TeaCert >=", value, "teaCert");
            return (Criteria) this;
        }

        public Criteria andTeaCertLessThan(String value) {
            addCriterion("TeaCert <", value, "teaCert");
            return (Criteria) this;
        }

        public Criteria andTeaCertLessThanOrEqualTo(String value) {
            addCriterion("TeaCert <=", value, "teaCert");
            return (Criteria) this;
        }

        public Criteria andTeaCertLike(String value) {
            addCriterion("TeaCert like", value, "teaCert");
            return (Criteria) this;
        }

        public Criteria andTeaCertNotLike(String value) {
            addCriterion("TeaCert not like", value, "teaCert");
            return (Criteria) this;
        }

        public Criteria andTeaCertIn(List<String> values) {
            addCriterion("TeaCert in", values, "teaCert");
            return (Criteria) this;
        }

        public Criteria andTeaCertNotIn(List<String> values) {
            addCriterion("TeaCert not in", values, "teaCert");
            return (Criteria) this;
        }

        public Criteria andTeaCertBetween(String value1, String value2) {
            addCriterion("TeaCert between", value1, value2, "teaCert");
            return (Criteria) this;
        }

        public Criteria andTeaCertNotBetween(String value1, String value2) {
            addCriterion("TeaCert not between", value1, value2, "teaCert");
            return (Criteria) this;
        }

        public Criteria andCurrMajorIsNull() {
            addCriterion("CurrMajor is null");
            return (Criteria) this;
        }

        public Criteria andCurrMajorIsNotNull() {
            addCriterion("CurrMajor is not null");
            return (Criteria) this;
        }

        public Criteria andCurrMajorEqualTo(String value) {
            addCriterion("CurrMajor =", value, "currMajor");
            return (Criteria) this;
        }

        public Criteria andCurrMajorNotEqualTo(String value) {
            addCriterion("CurrMajor <>", value, "currMajor");
            return (Criteria) this;
        }

        public Criteria andCurrMajorGreaterThan(String value) {
            addCriterion("CurrMajor >", value, "currMajor");
            return (Criteria) this;
        }

        public Criteria andCurrMajorGreaterThanOrEqualTo(String value) {
            addCriterion("CurrMajor >=", value, "currMajor");
            return (Criteria) this;
        }

        public Criteria andCurrMajorLessThan(String value) {
            addCriterion("CurrMajor <", value, "currMajor");
            return (Criteria) this;
        }

        public Criteria andCurrMajorLessThanOrEqualTo(String value) {
            addCriterion("CurrMajor <=", value, "currMajor");
            return (Criteria) this;
        }

        public Criteria andCurrMajorLike(String value) {
            addCriterion("CurrMajor like", value, "currMajor");
            return (Criteria) this;
        }

        public Criteria andCurrMajorNotLike(String value) {
            addCriterion("CurrMajor not like", value, "currMajor");
            return (Criteria) this;
        }

        public Criteria andCurrMajorIn(List<String> values) {
            addCriterion("CurrMajor in", values, "currMajor");
            return (Criteria) this;
        }

        public Criteria andCurrMajorNotIn(List<String> values) {
            addCriterion("CurrMajor not in", values, "currMajor");
            return (Criteria) this;
        }

        public Criteria andCurrMajorBetween(String value1, String value2) {
            addCriterion("CurrMajor between", value1, value2, "currMajor");
            return (Criteria) this;
        }

        public Criteria andCurrMajorNotBetween(String value1, String value2) {
            addCriterion("CurrMajor not between", value1, value2, "currMajor");
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

        public Criteria andContactAddIsNull() {
            addCriterion("ContactAdd is null");
            return (Criteria) this;
        }

        public Criteria andContactAddIsNotNull() {
            addCriterion("ContactAdd is not null");
            return (Criteria) this;
        }

        public Criteria andContactAddEqualTo(String value) {
            addCriterion("ContactAdd =", value, "contactAdd");
            return (Criteria) this;
        }

        public Criteria andContactAddNotEqualTo(String value) {
            addCriterion("ContactAdd <>", value, "contactAdd");
            return (Criteria) this;
        }

        public Criteria andContactAddGreaterThan(String value) {
            addCriterion("ContactAdd >", value, "contactAdd");
            return (Criteria) this;
        }

        public Criteria andContactAddGreaterThanOrEqualTo(String value) {
            addCriterion("ContactAdd >=", value, "contactAdd");
            return (Criteria) this;
        }

        public Criteria andContactAddLessThan(String value) {
            addCriterion("ContactAdd <", value, "contactAdd");
            return (Criteria) this;
        }

        public Criteria andContactAddLessThanOrEqualTo(String value) {
            addCriterion("ContactAdd <=", value, "contactAdd");
            return (Criteria) this;
        }

        public Criteria andContactAddLike(String value) {
            addCriterion("ContactAdd like", value, "contactAdd");
            return (Criteria) this;
        }

        public Criteria andContactAddNotLike(String value) {
            addCriterion("ContactAdd not like", value, "contactAdd");
            return (Criteria) this;
        }

        public Criteria andContactAddIn(List<String> values) {
            addCriterion("ContactAdd in", values, "contactAdd");
            return (Criteria) this;
        }

        public Criteria andContactAddNotIn(List<String> values) {
            addCriterion("ContactAdd not in", values, "contactAdd");
            return (Criteria) this;
        }

        public Criteria andContactAddBetween(String value1, String value2) {
            addCriterion("ContactAdd between", value1, value2, "contactAdd");
            return (Criteria) this;
        }

        public Criteria andContactAddNotBetween(String value1, String value2) {
            addCriterion("ContactAdd not between", value1, value2, "contactAdd");
            return (Criteria) this;
        }

        public Criteria andContactZipIsNull() {
            addCriterion("ContactZip is null");
            return (Criteria) this;
        }

        public Criteria andContactZipIsNotNull() {
            addCriterion("ContactZip is not null");
            return (Criteria) this;
        }

        public Criteria andContactZipEqualTo(String value) {
            addCriterion("ContactZip =", value, "contactZip");
            return (Criteria) this;
        }

        public Criteria andContactZipNotEqualTo(String value) {
            addCriterion("ContactZip <>", value, "contactZip");
            return (Criteria) this;
        }

        public Criteria andContactZipGreaterThan(String value) {
            addCriterion("ContactZip >", value, "contactZip");
            return (Criteria) this;
        }

        public Criteria andContactZipGreaterThanOrEqualTo(String value) {
            addCriterion("ContactZip >=", value, "contactZip");
            return (Criteria) this;
        }

        public Criteria andContactZipLessThan(String value) {
            addCriterion("ContactZip <", value, "contactZip");
            return (Criteria) this;
        }

        public Criteria andContactZipLessThanOrEqualTo(String value) {
            addCriterion("ContactZip <=", value, "contactZip");
            return (Criteria) this;
        }

        public Criteria andContactZipLike(String value) {
            addCriterion("ContactZip like", value, "contactZip");
            return (Criteria) this;
        }

        public Criteria andContactZipNotLike(String value) {
            addCriterion("ContactZip not like", value, "contactZip");
            return (Criteria) this;
        }

        public Criteria andContactZipIn(List<String> values) {
            addCriterion("ContactZip in", values, "contactZip");
            return (Criteria) this;
        }

        public Criteria andContactZipNotIn(List<String> values) {
            addCriterion("ContactZip not in", values, "contactZip");
            return (Criteria) this;
        }

        public Criteria andContactZipBetween(String value1, String value2) {
            addCriterion("ContactZip between", value1, value2, "contactZip");
            return (Criteria) this;
        }

        public Criteria andContactZipNotBetween(String value1, String value2) {
            addCriterion("ContactZip not between", value1, value2, "contactZip");
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

        public Criteria andRegAddIsNull() {
            addCriterion("RegAdd is null");
            return (Criteria) this;
        }

        public Criteria andRegAddIsNotNull() {
            addCriterion("RegAdd is not null");
            return (Criteria) this;
        }

        public Criteria andRegAddEqualTo(String value) {
            addCriterion("RegAdd =", value, "regAdd");
            return (Criteria) this;
        }

        public Criteria andRegAddNotEqualTo(String value) {
            addCriterion("RegAdd <>", value, "regAdd");
            return (Criteria) this;
        }

        public Criteria andRegAddGreaterThan(String value) {
            addCriterion("RegAdd >", value, "regAdd");
            return (Criteria) this;
        }

        public Criteria andRegAddGreaterThanOrEqualTo(String value) {
            addCriterion("RegAdd >=", value, "regAdd");
            return (Criteria) this;
        }

        public Criteria andRegAddLessThan(String value) {
            addCriterion("RegAdd <", value, "regAdd");
            return (Criteria) this;
        }

        public Criteria andRegAddLessThanOrEqualTo(String value) {
            addCriterion("RegAdd <=", value, "regAdd");
            return (Criteria) this;
        }

        public Criteria andRegAddLike(String value) {
            addCriterion("RegAdd like", value, "regAdd");
            return (Criteria) this;
        }

        public Criteria andRegAddNotLike(String value) {
            addCriterion("RegAdd not like", value, "regAdd");
            return (Criteria) this;
        }

        public Criteria andRegAddIn(List<String> values) {
            addCriterion("RegAdd in", values, "regAdd");
            return (Criteria) this;
        }

        public Criteria andRegAddNotIn(List<String> values) {
            addCriterion("RegAdd not in", values, "regAdd");
            return (Criteria) this;
        }

        public Criteria andRegAddBetween(String value1, String value2) {
            addCriterion("RegAdd between", value1, value2, "regAdd");
            return (Criteria) this;
        }

        public Criteria andRegAddNotBetween(String value1, String value2) {
            addCriterion("RegAdd not between", value1, value2, "regAdd");
            return (Criteria) this;
        }

        public Criteria andRegTypeIsNull() {
            addCriterion("RegType is null");
            return (Criteria) this;
        }

        public Criteria andRegTypeIsNotNull() {
            addCriterion("RegType is not null");
            return (Criteria) this;
        }

        public Criteria andRegTypeEqualTo(String value) {
            addCriterion("RegType =", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeNotEqualTo(String value) {
            addCriterion("RegType <>", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeGreaterThan(String value) {
            addCriterion("RegType >", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RegType >=", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeLessThan(String value) {
            addCriterion("RegType <", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeLessThanOrEqualTo(String value) {
            addCriterion("RegType <=", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeLike(String value) {
            addCriterion("RegType like", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeNotLike(String value) {
            addCriterion("RegType not like", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeIn(List<String> values) {
            addCriterion("RegType in", values, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeNotIn(List<String> values) {
            addCriterion("RegType not in", values, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeBetween(String value1, String value2) {
            addCriterion("RegType between", value1, value2, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeNotBetween(String value1, String value2) {
            addCriterion("RegType not between", value1, value2, "regType");
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

        public Criteria andComeTimeIsNull() {
            addCriterion("ComeTime is null");
            return (Criteria) this;
        }

        public Criteria andComeTimeIsNotNull() {
            addCriterion("ComeTime is not null");
            return (Criteria) this;
        }

        public Criteria andComeTimeEqualTo(Date value) {
            addCriterionForJDBCDate("ComeTime =", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ComeTime <>", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ComeTime >", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ComeTime >=", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeLessThan(Date value) {
            addCriterionForJDBCDate("ComeTime <", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ComeTime <=", value, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeIn(List<Date> values) {
            addCriterionForJDBCDate("ComeTime in", values, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ComeTime not in", values, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ComeTime between", value1, value2, "comeTime");
            return (Criteria) this;
        }

        public Criteria andComeTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ComeTime not between", value1, value2, "comeTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNull() {
            addCriterion("WorkTime is null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNotNull() {
            addCriterion("WorkTime is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEqualTo(Date value) {
            addCriterionForJDBCDate("WorkTime =", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("WorkTime <>", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("WorkTime >", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("WorkTime >=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThan(Date value) {
            addCriterionForJDBCDate("WorkTime <", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("WorkTime <=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIn(List<Date> values) {
            addCriterionForJDBCDate("WorkTime in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("WorkTime not in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("WorkTime between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("WorkTime not between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andTeachTimeIsNull() {
            addCriterion("TeachTime is null");
            return (Criteria) this;
        }

        public Criteria andTeachTimeIsNotNull() {
            addCriterion("TeachTime is not null");
            return (Criteria) this;
        }

        public Criteria andTeachTimeEqualTo(Date value) {
            addCriterionForJDBCDate("TeachTime =", value, "teachTime");
            return (Criteria) this;
        }

        public Criteria andTeachTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("TeachTime <>", value, "teachTime");
            return (Criteria) this;
        }

        public Criteria andTeachTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("TeachTime >", value, "teachTime");
            return (Criteria) this;
        }

        public Criteria andTeachTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TeachTime >=", value, "teachTime");
            return (Criteria) this;
        }

        public Criteria andTeachTimeLessThan(Date value) {
            addCriterionForJDBCDate("TeachTime <", value, "teachTime");
            return (Criteria) this;
        }

        public Criteria andTeachTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TeachTime <=", value, "teachTime");
            return (Criteria) this;
        }

        public Criteria andTeachTimeIn(List<Date> values) {
            addCriterionForJDBCDate("TeachTime in", values, "teachTime");
            return (Criteria) this;
        }

        public Criteria andTeachTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("TeachTime not in", values, "teachTime");
            return (Criteria) this;
        }

        public Criteria andTeachTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TeachTime between", value1, value2, "teachTime");
            return (Criteria) this;
        }

        public Criteria andTeachTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TeachTime not between", value1, value2, "teachTime");
            return (Criteria) this;
        }

        public Criteria andBeliefIsNull() {
            addCriterion("Belief is null");
            return (Criteria) this;
        }

        public Criteria andBeliefIsNotNull() {
            addCriterion("Belief is not null");
            return (Criteria) this;
        }

        public Criteria andBeliefEqualTo(String value) {
            addCriterion("Belief =", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefNotEqualTo(String value) {
            addCriterion("Belief <>", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefGreaterThan(String value) {
            addCriterion("Belief >", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefGreaterThanOrEqualTo(String value) {
            addCriterion("Belief >=", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefLessThan(String value) {
            addCriterion("Belief <", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefLessThanOrEqualTo(String value) {
            addCriterion("Belief <=", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefLike(String value) {
            addCriterion("Belief like", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefNotLike(String value) {
            addCriterion("Belief not like", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefIn(List<String> values) {
            addCriterion("Belief in", values, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefNotIn(List<String> values) {
            addCriterion("Belief not in", values, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefBetween(String value1, String value2) {
            addCriterion("Belief between", value1, value2, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefNotBetween(String value1, String value2) {
            addCriterion("Belief not between", value1, value2, "belief");
            return (Criteria) this;
        }

        public Criteria andOverseasIsNull() {
            addCriterion("Overseas is null");
            return (Criteria) this;
        }

        public Criteria andOverseasIsNotNull() {
            addCriterion("Overseas is not null");
            return (Criteria) this;
        }

        public Criteria andOverseasEqualTo(String value) {
            addCriterion("Overseas =", value, "overseas");
            return (Criteria) this;
        }

        public Criteria andOverseasNotEqualTo(String value) {
            addCriterion("Overseas <>", value, "overseas");
            return (Criteria) this;
        }

        public Criteria andOverseasGreaterThan(String value) {
            addCriterion("Overseas >", value, "overseas");
            return (Criteria) this;
        }

        public Criteria andOverseasGreaterThanOrEqualTo(String value) {
            addCriterion("Overseas >=", value, "overseas");
            return (Criteria) this;
        }

        public Criteria andOverseasLessThan(String value) {
            addCriterion("Overseas <", value, "overseas");
            return (Criteria) this;
        }

        public Criteria andOverseasLessThanOrEqualTo(String value) {
            addCriterion("Overseas <=", value, "overseas");
            return (Criteria) this;
        }

        public Criteria andOverseasLike(String value) {
            addCriterion("Overseas like", value, "overseas");
            return (Criteria) this;
        }

        public Criteria andOverseasNotLike(String value) {
            addCriterion("Overseas not like", value, "overseas");
            return (Criteria) this;
        }

        public Criteria andOverseasIn(List<String> values) {
            addCriterion("Overseas in", values, "overseas");
            return (Criteria) this;
        }

        public Criteria andOverseasNotIn(List<String> values) {
            addCriterion("Overseas not in", values, "overseas");
            return (Criteria) this;
        }

        public Criteria andOverseasBetween(String value1, String value2) {
            addCriterion("Overseas between", value1, value2, "overseas");
            return (Criteria) this;
        }

        public Criteria andOverseasNotBetween(String value1, String value2) {
            addCriterion("Overseas not between", value1, value2, "overseas");
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

        public Criteria andResearchIsNull() {
            addCriterion("Research is null");
            return (Criteria) this;
        }

        public Criteria andResearchIsNotNull() {
            addCriterion("Research is not null");
            return (Criteria) this;
        }

        public Criteria andResearchEqualTo(String value) {
            addCriterion("Research =", value, "research");
            return (Criteria) this;
        }

        public Criteria andResearchNotEqualTo(String value) {
            addCriterion("Research <>", value, "research");
            return (Criteria) this;
        }

        public Criteria andResearchGreaterThan(String value) {
            addCriterion("Research >", value, "research");
            return (Criteria) this;
        }

        public Criteria andResearchGreaterThanOrEqualTo(String value) {
            addCriterion("Research >=", value, "research");
            return (Criteria) this;
        }

        public Criteria andResearchLessThan(String value) {
            addCriterion("Research <", value, "research");
            return (Criteria) this;
        }

        public Criteria andResearchLessThanOrEqualTo(String value) {
            addCriterion("Research <=", value, "research");
            return (Criteria) this;
        }

        public Criteria andResearchLike(String value) {
            addCriterion("Research like", value, "research");
            return (Criteria) this;
        }

        public Criteria andResearchNotLike(String value) {
            addCriterion("Research not like", value, "research");
            return (Criteria) this;
        }

        public Criteria andResearchIn(List<String> values) {
            addCriterion("Research in", values, "research");
            return (Criteria) this;
        }

        public Criteria andResearchNotIn(List<String> values) {
            addCriterion("Research not in", values, "research");
            return (Criteria) this;
        }

        public Criteria andResearchBetween(String value1, String value2) {
            addCriterion("Research between", value1, value2, "research");
            return (Criteria) this;
        }

        public Criteria andResearchNotBetween(String value1, String value2) {
            addCriterion("Research not between", value1, value2, "research");
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

        public Criteria andMemoIsNull() {
            addCriterion("Memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("Memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("Memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("Memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("Memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("Memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("Memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("Memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("Memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("Memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("Memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("Memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("Memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("Memo not between", value1, value2, "memo");
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