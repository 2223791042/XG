package mr.s.form;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class InquiryStudentForm {
    @NotBlank(message = "入学前户口不能为空")
    private String registered;

    @NotNull(message = "家庭人口数不能为空")
    private Integer personNum;

    @NotBlank(message = "家庭类型不能为空")
    private String homeType;

    @NotNull(message = "家庭年收入不能为空")
    private Float homeIncome;

    private String support;

    private String accident;

    private String unemploy;

    private String debt;

    private String other;

    @NotBlank(message = "学生签字不能为空")
    private String studentSign;

    @NotBlank(message = "家长签字不能为空")
    private String parentSign;

    @NotNull(message = "家长签字日期不能为空")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date parentDate;

    @NotBlank(message = "经办人签字不能为空")
    private String agentSign;

    @NotBlank(message = "单位名称不能为空")
    private String agentUnit;

    @NotBlank(message = "经办人联系电话不能为空")
    private String agentTel;

    @NotBlank(message = "是否盖章不能为空")
    private String seal;

    @NotNull(message = "经办人签字日期不能为空")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date agentDate;

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
}
