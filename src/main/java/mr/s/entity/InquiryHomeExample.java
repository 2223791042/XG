package mr.s.entity;

import java.util.ArrayList;
import java.util.List;

public class InquiryHomeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InquiryHomeExample() {
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

        public Criteria andInquiryIDIsNull() {
            addCriterion("InquiryID is null");
            return (Criteria) this;
        }

        public Criteria andInquiryIDIsNotNull() {
            addCriterion("InquiryID is not null");
            return (Criteria) this;
        }

        public Criteria andInquiryIDEqualTo(Long value) {
            addCriterion("InquiryID =", value, "inquiryID");
            return (Criteria) this;
        }

        public Criteria andInquiryIDNotEqualTo(Long value) {
            addCriterion("InquiryID <>", value, "inquiryID");
            return (Criteria) this;
        }

        public Criteria andInquiryIDGreaterThan(Long value) {
            addCriterion("InquiryID >", value, "inquiryID");
            return (Criteria) this;
        }

        public Criteria andInquiryIDGreaterThanOrEqualTo(Long value) {
            addCriterion("InquiryID >=", value, "inquiryID");
            return (Criteria) this;
        }

        public Criteria andInquiryIDLessThan(Long value) {
            addCriterion("InquiryID <", value, "inquiryID");
            return (Criteria) this;
        }

        public Criteria andInquiryIDLessThanOrEqualTo(Long value) {
            addCriterion("InquiryID <=", value, "inquiryID");
            return (Criteria) this;
        }

        public Criteria andInquiryIDIn(List<Long> values) {
            addCriterion("InquiryID in", values, "inquiryID");
            return (Criteria) this;
        }

        public Criteria andInquiryIDNotIn(List<Long> values) {
            addCriterion("InquiryID not in", values, "inquiryID");
            return (Criteria) this;
        }

        public Criteria andInquiryIDBetween(Long value1, Long value2) {
            addCriterion("InquiryID between", value1, value2, "inquiryID");
            return (Criteria) this;
        }

        public Criteria andInquiryIDNotBetween(Long value1, Long value2) {
            addCriterion("InquiryID not between", value1, value2, "inquiryID");
            return (Criteria) this;
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

        public Criteria andFamilyNameIsNull() {
            addCriterion("FamilyName is null");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIsNotNull() {
            addCriterion("FamilyName is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyNameEqualTo(String value) {
            addCriterion("FamilyName =", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotEqualTo(String value) {
            addCriterion("FamilyName <>", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameGreaterThan(String value) {
            addCriterion("FamilyName >", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameGreaterThanOrEqualTo(String value) {
            addCriterion("FamilyName >=", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLessThan(String value) {
            addCriterion("FamilyName <", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLessThanOrEqualTo(String value) {
            addCriterion("FamilyName <=", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLike(String value) {
            addCriterion("FamilyName like", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotLike(String value) {
            addCriterion("FamilyName not like", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIn(List<String> values) {
            addCriterion("FamilyName in", values, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotIn(List<String> values) {
            addCriterion("FamilyName not in", values, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameBetween(String value1, String value2) {
            addCriterion("FamilyName between", value1, value2, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotBetween(String value1, String value2) {
            addCriterion("FamilyName not between", value1, value2, "familyName");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("Age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("Age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("Age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("Age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("Age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("Age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("Age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("Age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("Age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("Age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("Age not between", value1, value2, "age");
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

        public Criteria andRelationIsNull() {
            addCriterion("Relation is null");
            return (Criteria) this;
        }

        public Criteria andRelationIsNotNull() {
            addCriterion("Relation is not null");
            return (Criteria) this;
        }

        public Criteria andRelationEqualTo(String value) {
            addCriterion("Relation =", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotEqualTo(String value) {
            addCriterion("Relation <>", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThan(String value) {
            addCriterion("Relation >", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThanOrEqualTo(String value) {
            addCriterion("Relation >=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThan(String value) {
            addCriterion("Relation <", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThanOrEqualTo(String value) {
            addCriterion("Relation <=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLike(String value) {
            addCriterion("Relation like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotLike(String value) {
            addCriterion("Relation not like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationIn(List<String> values) {
            addCriterion("Relation in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotIn(List<String> values) {
            addCriterion("Relation not in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationBetween(String value1, String value2) {
            addCriterion("Relation between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotBetween(String value1, String value2) {
            addCriterion("Relation not between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceIsNull() {
            addCriterion("WorkPlace is null");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceIsNotNull() {
            addCriterion("WorkPlace is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceEqualTo(String value) {
            addCriterion("WorkPlace =", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotEqualTo(String value) {
            addCriterion("WorkPlace <>", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceGreaterThan(String value) {
            addCriterion("WorkPlace >", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("WorkPlace >=", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceLessThan(String value) {
            addCriterion("WorkPlace <", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceLessThanOrEqualTo(String value) {
            addCriterion("WorkPlace <=", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceLike(String value) {
            addCriterion("WorkPlace like", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotLike(String value) {
            addCriterion("WorkPlace not like", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceIn(List<String> values) {
            addCriterion("WorkPlace in", values, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotIn(List<String> values) {
            addCriterion("WorkPlace not in", values, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceBetween(String value1, String value2) {
            addCriterion("WorkPlace between", value1, value2, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotBetween(String value1, String value2) {
            addCriterion("WorkPlace not between", value1, value2, "workPlace");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNull() {
            addCriterion("Occupation is null");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNotNull() {
            addCriterion("Occupation is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationEqualTo(String value) {
            addCriterion("Occupation =", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotEqualTo(String value) {
            addCriterion("Occupation <>", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThan(String value) {
            addCriterion("Occupation >", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThanOrEqualTo(String value) {
            addCriterion("Occupation >=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThan(String value) {
            addCriterion("Occupation <", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThanOrEqualTo(String value) {
            addCriterion("Occupation <=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLike(String value) {
            addCriterion("Occupation like", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotLike(String value) {
            addCriterion("Occupation not like", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationIn(List<String> values) {
            addCriterion("Occupation in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotIn(List<String> values) {
            addCriterion("Occupation not in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationBetween(String value1, String value2) {
            addCriterion("Occupation between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotBetween(String value1, String value2) {
            addCriterion("Occupation not between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("Income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("Income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(Float value) {
            addCriterion("Income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(Float value) {
            addCriterion("Income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(Float value) {
            addCriterion("Income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(Float value) {
            addCriterion("Income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(Float value) {
            addCriterion("Income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(Float value) {
            addCriterion("Income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<Float> values) {
            addCriterion("Income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<Float> values) {
            addCriterion("Income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(Float value1, Float value2) {
            addCriterion("Income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(Float value1, Float value2) {
            addCriterion("Income not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andBodyStatusIsNull() {
            addCriterion("BodyStatus is null");
            return (Criteria) this;
        }

        public Criteria andBodyStatusIsNotNull() {
            addCriterion("BodyStatus is not null");
            return (Criteria) this;
        }

        public Criteria andBodyStatusEqualTo(String value) {
            addCriterion("BodyStatus =", value, "bodyStatus");
            return (Criteria) this;
        }

        public Criteria andBodyStatusNotEqualTo(String value) {
            addCriterion("BodyStatus <>", value, "bodyStatus");
            return (Criteria) this;
        }

        public Criteria andBodyStatusGreaterThan(String value) {
            addCriterion("BodyStatus >", value, "bodyStatus");
            return (Criteria) this;
        }

        public Criteria andBodyStatusGreaterThanOrEqualTo(String value) {
            addCriterion("BodyStatus >=", value, "bodyStatus");
            return (Criteria) this;
        }

        public Criteria andBodyStatusLessThan(String value) {
            addCriterion("BodyStatus <", value, "bodyStatus");
            return (Criteria) this;
        }

        public Criteria andBodyStatusLessThanOrEqualTo(String value) {
            addCriterion("BodyStatus <=", value, "bodyStatus");
            return (Criteria) this;
        }

        public Criteria andBodyStatusLike(String value) {
            addCriterion("BodyStatus like", value, "bodyStatus");
            return (Criteria) this;
        }

        public Criteria andBodyStatusNotLike(String value) {
            addCriterion("BodyStatus not like", value, "bodyStatus");
            return (Criteria) this;
        }

        public Criteria andBodyStatusIn(List<String> values) {
            addCriterion("BodyStatus in", values, "bodyStatus");
            return (Criteria) this;
        }

        public Criteria andBodyStatusNotIn(List<String> values) {
            addCriterion("BodyStatus not in", values, "bodyStatus");
            return (Criteria) this;
        }

        public Criteria andBodyStatusBetween(String value1, String value2) {
            addCriterion("BodyStatus between", value1, value2, "bodyStatus");
            return (Criteria) this;
        }

        public Criteria andBodyStatusNotBetween(String value1, String value2) {
            addCriterion("BodyStatus not between", value1, value2, "bodyStatus");
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

        public Criteria andMonthIncomeIsNull() {
            addCriterion("MonthIncome is null");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeIsNotNull() {
            addCriterion("MonthIncome is not null");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeEqualTo(Float value) {
            addCriterion("MonthIncome =", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeNotEqualTo(Float value) {
            addCriterion("MonthIncome <>", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeGreaterThan(Float value) {
            addCriterion("MonthIncome >", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeGreaterThanOrEqualTo(Float value) {
            addCriterion("MonthIncome >=", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeLessThan(Float value) {
            addCriterion("MonthIncome <", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeLessThanOrEqualTo(Float value) {
            addCriterion("MonthIncome <=", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeIn(List<Float> values) {
            addCriterion("MonthIncome in", values, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeNotIn(List<Float> values) {
            addCriterion("MonthIncome not in", values, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeBetween(Float value1, Float value2) {
            addCriterion("MonthIncome between", value1, value2, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeNotBetween(Float value1, Float value2) {
            addCriterion("MonthIncome not between", value1, value2, "monthIncome");
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