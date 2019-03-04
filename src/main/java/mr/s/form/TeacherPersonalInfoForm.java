package mr.s.form;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class TeacherPersonalInfoForm {
    @NotBlank(message = "职工号不能为空")
    private String teacherID;

    @NotBlank(message = "姓名不能为空")
    private String teaName;

    @NotBlank(message = "姓名拼音不能为空")
    private String namePinyin;

    private String oldName;

    @NotBlank(message = "性别不能为空")
    private String sex;

    @NotBlank(message = "健康状态不能为空")
    private String health;

    @NotNull(message = "出生日期不能为空")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    @NotBlank(message = "籍贯不能为空")
    private String originAdd;

    @NotBlank(message = "民族不能为空")
    private String nation;

    @NotBlank(message = "政治面貌不能为空")
    private String political;

    @NotBlank(message = "证件类型不能为空")
    private String certType;

    @NotBlank(message = "证件号不能为空")
    private String certID;

    @NotBlank(message = "最高学历不能为空")
    private String graduate;

    @NotNull(message = "获得学历时间不能为空")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date graTime;

    @NotBlank(message = "最高学位不能为空")
    private String diploma;

    @NotNull(message = "获得学位时间不能为空")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dipTime;

    @NotBlank(message = "毕业院校不能为空")
    private String graSchool;

    @NotBlank(message = "毕业专业不能为空")
    private String major;

    @NotBlank(message = "职称不能为空")
    private String position;

    @NotNull(message = "获得职称时间不能为空")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date posTime;

    @NotBlank(message = "职务不能为空")
    private String officer;

    @NotNull(message = "获得职务时间不能为空")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date offTime;

    @NotBlank(message = "校聘岗位不能为空")
    private String schPost;

    @NotBlank(message = "人员状态不能为空")
    private String perStatus;

    @NotBlank(message = "是否获得教师资格证不能为空")
    private String isTeaCert;

    @NotBlank(message = "教师证号不能为空")
    private String teaCert;

    @NotBlank(message = "现从事专业不能为空")
    private String currMajor;

    @NotBlank(message = "所在院系不能为空")
    private String instBelong;

    private String contactAdd;

    private String contactZip;

    private String telePhone;

    private String QQID;

    private String email;

    private String homeAdd;

    private String homeZip;

    private String regAdd;

    private String regType;

    @NotBlank(message = "婚姻状态不能为空")
    private String marry;

    @NotNull(message = "来校年月不能为空")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date comeTime;

    @NotNull(message = "工作年月不能为空")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date workTime;

    @NotNull(message = "从教年月不能为空")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date teachTime;

    private String belief;

    private String overseas;

    private String hobby;

    @NotBlank(message = "研究方向不能为空")
    private String research;

    private String perProfile;

    private String memo;

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }
    
    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
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

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getOriginAdd() {
        return originAdd;
    }

    public void setOriginAdd(String originAdd) {
        this.originAdd = originAdd;
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

    public String getGraduate() {
        return graduate;
    }

    public void setGraduate(String graduate) {
        this.graduate = graduate;
    }

    public Date getGraTime() {
        return graTime;
    }

    public void setGraTime(Date graTime) {
        this.graTime = graTime;
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    public Date getDipTime() {
        return dipTime;
    }

    public void setDipTime(Date dipTime) {
        this.dipTime = dipTime;
    }

    public String getGraSchool() {
        return graSchool;
    }

    public void setGraSchool(String graSchool) {
        this.graSchool = graSchool;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getPosTime() {
        return posTime;
    }

    public void setPosTime(Date posTime) {
        this.posTime = posTime;
    }

    public String getOfficer() {
        return officer;
    }

    public void setOfficer(String officer) {
        this.officer = officer;
    }

    public Date getOffTime() {
        return offTime;
    }

    public void setOffTime(Date offTime) {
        this.offTime = offTime;
    }

    public String getSchPost() {
        return schPost;
    }

    public void setSchPost(String schPost) {
        this.schPost = schPost;
    }

    public String getPerStatus() {
        return perStatus;
    }

    public void setPerStatus(String perStatus) {
        this.perStatus = perStatus;
    }

    public String getIsTeaCert() {
        return isTeaCert;
    }

    public void setIsTeaCert(String isTeaCert) {
        this.isTeaCert = isTeaCert;
    }

    public String getTeaCert() {
        return teaCert;
    }

    public void setTeaCert(String teaCert) {
        this.teaCert = teaCert;
    }

    public String getCurrMajor() {
        return currMajor;
    }

    public void setCurrMajor(String currMajor) {
        this.currMajor = currMajor;
    }

    public String getInstBelong() {
        return instBelong;
    }

    public void setInstBelong(String instBelong) {
        this.instBelong = instBelong;
    }

    public String getContactAdd() {
        return contactAdd;
    }

    public void setContactAdd(String contactAdd) {
        this.contactAdd = contactAdd;
    }

    public String getContactZip() {
        return contactZip;
    }

    public void setContactZip(String contactZip) {
        this.contactZip = contactZip;
    }

    public String getTelePhone() {
        return telePhone;
    }

    public void setTelePhone(String telePhone) {
        this.telePhone = telePhone;
    }

    public String getQQID() {
        return QQID;
    }

    public void setQQID(String QQID) {
        this.QQID = QQID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getRegAdd() {
        return regAdd;
    }

    public void setRegAdd(String regAdd) {
        this.regAdd = regAdd;
    }

    public String getRegType() {
        return regType;
    }

    public void setRegType(String regType) {
        this.regType = regType;
    }

    public String getMarry() {
        return marry;
    }

    public void setMarry(String marry) {
        this.marry = marry;
    }

    public Date getComeTime() {
        return comeTime;
    }

    public void setComeTime(Date comeTime) {
        this.comeTime = comeTime;
    }

    public Date getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Date workTime) {
        this.workTime = workTime;
    }

    public Date getTeachTime() {
        return teachTime;
    }

    public void setTeachTime(Date teachTime) {
        this.teachTime = teachTime;
    }

    public String getBelief() {
        return belief;
    }

    public void setBelief(String belief) {
        this.belief = belief;
    }

    public String getOverseas() {
        return overseas;
    }

    public void setOverseas(String overseas) {
        this.overseas = overseas;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getResearch() {
        return research;
    }

    public void setResearch(String research) {
        this.research = research;
    }

    public String getPerProfile() {
        return perProfile;
    }

    public void setPerProfile(String perProfile) {
        this.perProfile = perProfile;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
