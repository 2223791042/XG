package mr.s.entity;

import java.util.Date;

public class InquiryStudent {
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

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID == null ? null : stuID.trim();
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered == null ? null : registered.trim();
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
        this.homeType = homeType == null ? null : homeType.trim();
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
        this.support = support == null ? null : support.trim();
    }

    public String getAccident() {
        return accident;
    }

    public void setAccident(String accident) {
        this.accident = accident == null ? null : accident.trim();
    }

    public String getUnemploy() {
        return unemploy;
    }

    public void setUnemploy(String unemploy) {
        this.unemploy = unemploy == null ? null : unemploy.trim();
    }

    public String getDebt() {
        return debt;
    }

    public void setDebt(String debt) {
        this.debt = debt == null ? null : debt.trim();
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    public String getStudentSign() {
        return studentSign;
    }

    public void setStudentSign(String studentSign) {
        this.studentSign = studentSign == null ? null : studentSign.trim();
    }

    public String getParentSign() {
        return parentSign;
    }

    public void setParentSign(String parentSign) {
        this.parentSign = parentSign == null ? null : parentSign.trim();
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
        this.agentSign = agentSign == null ? null : agentSign.trim();
    }

    public String getAgentUnit() {
        return agentUnit;
    }

    public void setAgentUnit(String agentUnit) {
        this.agentUnit = agentUnit == null ? null : agentUnit.trim();
    }

    public String getAgentTel() {
        return agentTel;
    }

    public void setAgentTel(String agentTel) {
        this.agentTel = agentTel == null ? null : agentTel.trim();
    }

    public String getSeal() {
        return seal;
    }

    public void setSeal(String seal) {
        this.seal = seal == null ? null : seal.trim();
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
        this.status = status == null ? null : status.trim();
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
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
        this.returned = returned == null ? null : returned.trim();
    }
}