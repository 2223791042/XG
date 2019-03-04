package mr.s.entity;

public class InquiryHome {
    private Long inquiryID;

    private String stuID;

    private String familyName;

    private Integer age;

    private String nation;

    private String relation;

    private String workPlace;

    private String occupation;

    private Float income;

    private String bodyStatus;

    private String certID;

    private Float monthIncome;

    public Long getInquiryID() {
        return inquiryID;
    }

    public void setInquiryID(Long inquiryID) {
        this.inquiryID = inquiryID;
    }

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID == null ? null : stuID.trim();
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName == null ? null : familyName.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace == null ? null : workPlace.trim();
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }

    public Float getIncome() {
        return income;
    }

    public void setIncome(Float income) {
        this.income = income;
    }

    public String getBodyStatus() {
        return bodyStatus;
    }

    public void setBodyStatus(String bodyStatus) {
        this.bodyStatus = bodyStatus == null ? null : bodyStatus.trim();
    }

    public String getCertID() {
        return certID;
    }

    public void setCertID(String certID) {
        this.certID = certID == null ? null : certID.trim();
    }

    public Float getMonthIncome() {
        return monthIncome;
    }

    public void setMonthIncome(Float monthIncome) {
        this.monthIncome = monthIncome;
    }
}