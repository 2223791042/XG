package mr.s.dto;

import mr.s.entity.InquiryHome;

import java.util.Date;
import java.util.List;

public class InquiryStudentDTO {
    private String stuID;

    private String registered;

    private Integer personNum;

    private String homeType;

    private Float homeIncome;

    private String support;

    private String accident;

    private String unemploy;

    private String debt;

    private String other;

    private String studentSign;

    private String parentSign;

    private Date parentDate;

    private String agentSign;

    private String agentUnit;

    private String agentTel;

    private String seal;

    private Date agentDate;

    private String status;

    private String auditor;

    private Date auditorTime;

    private String returned;

    private List<InquiryHome> inquiryHomeList;

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
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

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    public String getAccident() {
        return accident;
    }

    public void setAccident(String accident) {
        this.accident = accident;
    }

    public String getUnemploy() {
        return unemploy;
    }

    public void setUnemploy(String unemploy) {
        this.unemploy = unemploy;
    }

    public String getDebt() {
        return debt;
    }

    public void setDebt(String debt) {
        this.debt = debt;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getStudentSign() {
        return studentSign;
    }

    public void setStudentSign(String studentSign) {
        this.studentSign = studentSign;
    }

    public String getParentSign() {
        return parentSign;
    }

    public void setParentSign(String parentSign) {
        this.parentSign = parentSign;
    }

    public Date getParentDate() {
        return parentDate;
    }

    public void setParentDate(Date parentDate) {
        this.parentDate = parentDate;
    }

    public String getAgentSign() {
        return agentSign;
    }

    public void setAgentSign(String agentSign) {
        this.agentSign = agentSign;
    }

    public String getAgentUnit() {
        return agentUnit;
    }

    public void setAgentUnit(String agentUnit) {
        this.agentUnit = agentUnit;
    }

    public String getAgentTel() {
        return agentTel;
    }

    public void setAgentTel(String agentTel) {
        this.agentTel = agentTel;
    }

    public String getSeal() {
        return seal;
    }

    public void setSeal(String seal) {
        this.seal = seal;
    }

    public Date getAgentDate() {
        return agentDate;
    }

    public void setAgentDate(Date agentDate) {
        this.agentDate = agentDate;
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

    public String getReturned() {
        return returned;
    }

    public void setReturned(String returned) {
        this.returned = returned;
    }

    public List<InquiryHome> getInquiryHomeList() {
        return inquiryHomeList;
    }

    public void setInquiryHomeList(List<InquiryHome> inquiryHomeList) {
        this.inquiryHomeList = inquiryHomeList;
    }
}
