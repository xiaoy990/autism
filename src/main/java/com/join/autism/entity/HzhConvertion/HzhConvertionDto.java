package com.join.autism.entity.HzhConvertion;

import java.io.Serializable;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 8:42 2019/8/29
 */
public class HzhConvertionDto implements Serializable {

    private Integer id;

    private Integer sleep;

    private String sleepreason;

    private Integer eat;

    private String eatreason;

    private Integer fat;

    private String fatreason;

    private Integer active;

    private String activereason;

    private Integer thin;

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

    public Integer getSleep() {
        return sleep;
    }

    public void setSleep(Integer sleep) {
        this.sleep = sleep;
    }

    public String getSleepreason() {
        return sleepreason;
    }

    public void setSleepreason(String sleepreason) {
        this.sleepreason = sleepreason;
    }

    public Integer getEat() {
        return eat;
    }

    public void setEat(Integer eat) {
        this.eat = eat;
    }

    public String getEatreason() {
        return eatreason;
    }

    public void setEatreason(String eatreason) {
        this.eatreason = eatreason;
    }

    public Integer getFat() {
        return fat;
    }

    public void setFat(Integer fat) {
        this.fat = fat;
    }

    public String getFatreason() {
        return fatreason;
    }

    public void setFatreason(String fatreason) {
        this.fatreason = fatreason;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getActivereason() {
        return activereason;
    }

    public void setActivereason(String activereason) {
        this.activereason = activereason;
    }

    public Integer getThin() {
        return thin;
    }

    public void setThin(Integer thin) {
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
