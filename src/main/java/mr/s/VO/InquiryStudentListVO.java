package mr.s.VO;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class InquiryStudentListVO {
    private String stuID;
    private String stuName;
    private String instBelong;
    private String enrolYear;
    private Integer personNum;
    private String homeType;
    private Float homeIncome;
    private String debt;
    private String status;
    private String auditor;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date auditorTime;

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getInstBelong() {
        return instBelong;
    }

    public void setInstBelong(String instBelong) {
        this.instBelong = instBelong;
    }

    public String getEnrolYear() {
        return enrolYear;
    }

    public void setEnrolYear(String enrolYear) {
        this.enrolYear = enrolYear;
    }

    public Integer getPersonNum() {
        return personNum;
    }

    public void setPersonNum(Integer personNum) {
        this.personNum = personNum;
    }

    public String getHomeType() {
        return homeType;
    }

    public void setHomeType(String homeType) {
        this.homeType = homeType;
    }

    public Float getHomeIncome() {
        return homeIncome;
    }

    public void setHomeIncome(Float homeIncome) {
        this.homeIncome = homeIncome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public Date getAuditorTime() {
        return auditorTime;
    }

    public void setAuditorTime(Date auditorTime) {
        this.auditorTime = auditorTime;
    }

    public String getDebt() {
        return debt;
    }

    public void setDebt(String debt) {
        this.debt = debt;
    }
}
