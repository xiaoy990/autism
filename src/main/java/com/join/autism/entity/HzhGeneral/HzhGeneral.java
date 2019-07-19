package com.join.autism.entity.HzhGeneral;

import java.io.Serializable;

/**
 * hzh_general
 * @author 
 */
public class HzhGeneral implements Serializable {
    private Integer id;

    private String name;

    private String birthday;

    private Integer age;

    private String province;

    private String city;

    private String town;

    private String nation;

    private String sfname;

    private String relation;

    private String address;

    private String mobile;

    private Integer brosis;

    /**
     * 患者编号
     */
    private String sicknum;

    /**
     * 负责医生
     */
    private String doctor;

    /**
     * 调查日期
     */
    private String surveyTime;

    /**
     * 住院号
     */
    private String livenum;

    /**
     * 这里是性别。但上一任程序员有点傻x，然后我也懒得改了，凑合用吧
     */
    private String six;

    private String adder;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getSfname() {
        return sfname;
    }

    public void setSfname(String sfname) {
        this.sfname = sfname;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getBrosis() {
        return brosis;
    }

    public void setBrosis(Integer brosis) {
        this.brosis = brosis;
    }

    public String getSicknum() {
        return sicknum;
    }

    public void setSicknum(String sicknum) {
        this.sicknum = sicknum;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getSurveyTime() {
        return surveyTime;
    }

    public void setSurveyTime(String surveyTime) {
        this.surveyTime = surveyTime;
    }

    public String getLivenum() {
        return livenum;
    }

    public void setLivenum(String livenum) {
        this.livenum = livenum;
    }

    public String getSix() {
        return six;
    }

    public void setSix(String six) {
        this.six = six;
    }

    public String getAdder() {
        return adder;
    }

    public void setAdder(String adder) {
        this.adder = adder;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        HzhGeneral other = (HzhGeneral) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getTown() == null ? other.getTown() == null : this.getTown().equals(other.getTown()))
            && (this.getNation() == null ? other.getNation() == null : this.getNation().equals(other.getNation()))
            && (this.getSfname() == null ? other.getSfname() == null : this.getSfname().equals(other.getSfname()))
            && (this.getRelation() == null ? other.getRelation() == null : this.getRelation().equals(other.getRelation()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getBrosis() == null ? other.getBrosis() == null : this.getBrosis().equals(other.getBrosis()))
            && (this.getSicknum() == null ? other.getSicknum() == null : this.getSicknum().equals(other.getSicknum()))
            && (this.getDoctor() == null ? other.getDoctor() == null : this.getDoctor().equals(other.getDoctor()))
            && (this.getSurveyTime() == null ? other.getSurveyTime() == null : this.getSurveyTime().equals(other.getSurveyTime()))
            && (this.getLivenum() == null ? other.getLivenum() == null : this.getLivenum().equals(other.getLivenum()))
            && (this.getSix() == null ? other.getSix() == null : this.getSix().equals(other.getSix()))
            && (this.getAdder() == null ? other.getAdder() == null : this.getAdder().equals(other.getAdder()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getTown() == null) ? 0 : getTown().hashCode());
        result = prime * result + ((getNation() == null) ? 0 : getNation().hashCode());
        result = prime * result + ((getSfname() == null) ? 0 : getSfname().hashCode());
        result = prime * result + ((getRelation() == null) ? 0 : getRelation().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getBrosis() == null) ? 0 : getBrosis().hashCode());
        result = prime * result + ((getSicknum() == null) ? 0 : getSicknum().hashCode());
        result = prime * result + ((getDoctor() == null) ? 0 : getDoctor().hashCode());
        result = prime * result + ((getSurveyTime() == null) ? 0 : getSurveyTime().hashCode());
        result = prime * result + ((getLivenum() == null) ? 0 : getLivenum().hashCode());
        result = prime * result + ((getSix() == null) ? 0 : getSix().hashCode());
        result = prime * result + ((getAdder() == null) ? 0 : getAdder().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", birthday=").append(birthday);
        sb.append(", age=").append(age);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", town=").append(town);
        sb.append(", nation=").append(nation);
        sb.append(", sfname=").append(sfname);
        sb.append(", relation=").append(relation);
        sb.append(", address=").append(address);
        sb.append(", mobile=").append(mobile);
        sb.append(", brosis=").append(brosis);
        sb.append(", sicknum=").append(sicknum);
        sb.append(", doctor=").append(doctor);
        sb.append(", surveyTime=").append(surveyTime);
        sb.append(", livenum=").append(livenum);
        sb.append(", six=").append(six);
        sb.append(", adder=").append(adder);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}