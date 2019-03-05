package mr.s.form;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class StudentPersonalInfoForm {
    private String stuID;

    @NotBlank(message = "考生编号不能为空")
    private String stuTestID;

    @NotBlank(message = "录取年份不能为空")
    private String enrolYear;

    @NotNull(message = "入学时间不能为空")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date enrolTime;

    @NotBlank(message = "是否应届毕业生不能为空")
    private String fresh;

    @NotBlank(message = "籍贯不能为空")
    private String originAdd;

    @NotBlank(message = "生源所在地不能为空")
    private String stuFrom;

    @NotBlank(message = "姓名不能为空")
    private String stuName;

    @NotBlank(message = "姓名拼音不能为空")
    private String namePinyin;

    private String oldName;

    @NotBlank(message = "性别不能为空")
    private String sex;

    @NotNull(message = "出生日期不能为空")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    @NotBlank(message = "证件类型不能为空")
    private String certType;

    @NotBlank(message = "证件号码不能为空")
    private String certID;

    @NotBlank(message = "婚姻状态不能为空")
    private String marry;

    @NotBlank(message = "民族不能为空")
    private String nation;

    @NotBlank(message = "政治面貌不能为空")
    private String political;

    @NotBlank(message = "是否为现役军人不能为空")
    private String soldier;

    @NotBlank(message = "高中学校不能为空")
    private String highSchool;

    @NotBlank(message = "现在学校不能为空")
    private String school;

    @NotBlank(message = "院系不能为空")
    private String instBelong;

    @NotBlank(message = "专业不能为空")
    private String major;

    @NotBlank(message = "班级不能为空")
    private String classe;

    @NotBlank(message = "现住宿舍不能为空")
    private String dormitory;

    private String dormTel;

    private String QQID;

    private String telePhone;

    private String email;

    private String bank;

    private String bankcard;

    private String stuCadreYN;

    private String stuCadre;

    private String homeAdd;

    private String homeZip;

    private String homeTele;

    private String fatherName;

    private String fatherTele;

    private String motherName;

    private String motherTele;

    private String hobby;

    private String perProfile;

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public String getStuTestID() {
        return stuTestID;
    }

    public void setStuTestID(String stuTestID) {
        this.stuTestID = stuTestID;
    }

    public String getEnrolYear() {
        return enrolYear;
    }

    public void setEnrolYear(String enrolYear) {
        this.enrolYear = enrolYear;
    }

    public Date getEnrolTime() {
        return enrolTime;
    }

    public void setEnrolTime(Date enrolTime) {
        this.enrolTime = enrolTime;
    }

    public String getFresh() {
        return fresh;
    }

    public void setFresh(String fresh) {
        this.fresh = fresh;
    }

    public String getOriginAdd() {
        return originAdd;
    }

    public void setOriginAdd(String originAdd) {
        this.originAdd = originAdd;
    }

    public String getStuFrom() {
        return stuFrom;
    }

    public void setStuFrom(String stuFrom) {
        this.stuFrom = stuFrom;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getNamePinyin() {
        return namePinyin;
    }

    public void setNamePinyin(String namePinyin) {
        this.namePinyin = namePinyin;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertID() {
        return certID;
    }

    public void setCertID(String certID) {
        this.certID = certID;
    }

    public String getMarry() {
        return marry;
    }

    public void setMarry(String marry) {
        this.marry = marry;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political;
    }

    public String getSoldier() {
        return soldier;
    }

    public void setSoldier(String soldier) {
        this.soldier = soldier;
    }

    public String getHighSchool() {
        return highSchool;
    }

    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getInstBelong() {
        return instBelong;
    }

    public void setInstBelong(String instBelong) {
        this.instBelong = instBelong;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getDormitory() {
        return dormitory;
    }

    public void setDormitory(String dormitory) {
        this.dormitory = dormitory;
    }

    public String getDormTel() {
        return dormTel;
    }

    public void setDormTel(String dormTel) {
        this.dormTel = dormTel;
    }

    public String getQQID() {
        return QQID;
    }

    public void setQQID(String QQID) {
        this.QQID = QQID;
    }

    public String getTelePhone() {
        return telePhone;
    }

    public void setTelePhone(String telePhone) {
        this.telePhone = telePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBankcard() {
        return bankcard;
    }

    public void setBankcard(String bankcard) {
        this.bankcard = bankcard;
    }

    public String getStuCadreYN() {
        return stuCadreYN;
    }

    public void setStuCadreYN(String stuCadreYN) {
        this.stuCadreYN = stuCadreYN;
    }

    public String getStuCadre() {
        return stuCadre;
    }

    public void setStuCadre(String stuCadre) {
        this.stuCadre = stuCadre;
    }

    public String getHomeAdd() {
        return homeAdd;
    }

    public void setHomeAdd(String homeAdd) {
        this.homeAdd = homeAdd;
    }

    public String getHomeZip() {
        return homeZip;
    }

    public void setHomeZip(String homeZip) {
        this.homeZip = homeZip;
    }

    public String getHomeTele() {
        return homeTele;
    }

    public void setHomeTele(String homeTele) {
        this.homeTele = homeTele;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFatherTele() {
        return fatherTele;
    }

    public void setFatherTele(String fatherTele) {
        this.fatherTele = fatherTele;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getMotherTele() {
        return motherTele;
    }

    public void setMotherTele(String motherTele) {
        this.motherTele = motherTele;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getPerProfile() {
        return perProfile;
    }

    public void setPerProfile(String perProfile) {
        this.perProfile = perProfile;
    }
}
