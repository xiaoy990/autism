package com.join.autism.entity.HzhConvertion;

import java.io.Serializable;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 8:42 2019/8/29
 */
public class HzhConvertionDto implements Serializable {

    private Integer id;

    private String sleep;

    private String sleepreason;

    private String eat;

    private String eatreason;

    private String fat;

    private String fatreason;

    private String active;

    private String activereason;

    private String thin;

    private String thinreason;

    private Integer childId;

    private String name;

    private String sicknum;

    private String doctor;

    private String surveyTime;

    private String livenum;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSleep() {
        return sleep;
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
    }

    public String getSleepreason() {
        return sleepreason;
    }

    public void setSleepreason(String sleepreason) {
        this.sleepreason = sleepreason;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getEatreason() {
        return eatreason;
    }

    public void setEatreason(String eatreason) {
        this.eatreason = eatreason;
    }

    public String getFat() {
        return fat;
    }

    public void setFat(String fat) {
        this.fat = fat;
    }

    public String getFatreason() {
        return fatreason;
    }

    public void setFatreason(String fatreason) {
        this.fatreason = fatreason;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getActivereason() {
        return activereason;
    }

    public void setActivereason(String activereason) {
        this.activereason = activereason;
    }

    public String getThin() {
        return thin;
    }

    public void setThin(String thin) {
        this.thin = thin;
    }

    public String getThinreason() {
        return thinreason;
    }

    public void setThinreason(String thinreason) {
        this.thinreason = thinreason;
    }

    public Integer getChildId() {
        return childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "HzhConvertionDto{" +
                "id=" + id +
                ", sleep=" + sleep +
                ", sleepreason='" + sleepreason + '\'' +
                ", eat=" + eat +
                ", eatreason='" + eatreason + '\'' +
                ", fat=" + fat +
                ", fatreason='" + fatreason + '\'' +
                ", active=" + active +
                ", activereason='" + activereason + '\'' +
                ", thin=" + thin +
                ", thinreason='" + thinreason + '\'' +
                ", childId=" + childId +
                ", name='" + name + '\'' +
                ", sicknum='" + sicknum + '\'' +
                ", doctor='" + doctor + '\'' +
                ", surveyTime='" + surveyTime + '\'' +
                ", livenum='" + livenum + '\'' +
                '}';
    }
}
