package com.join.autism.entity.HzhOther;

import java.io.Serializable;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 9:20 2019/8/29
 */
public class HzhOtherDto implements Serializable {

    private Integer id;

    private String stature;

    private String weight;

    private String head;

    private String intel;

    private String drug;

    private String act;

    private String other;

    private String intelContent;

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

    public String getStature() {
        return stature;
    }

    public void setStature(String stature) {
        this.stature = stature;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getIntel() {
        return intel;
    }

    public void setIntel(String intel) {
        this.intel = intel;
    }

    public String getDrug() {
        return drug;
    }

    public void setDrug(String drug) {
        this.drug = drug;
    }

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getIntelContent() {
        return intelContent;
    }

    public void setIntelContent(String intelContent) {
        this.intelContent = intelContent;
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

    @Override
    public String toString() {
        return "HzhOtherDto{" +
                "id=" + id +
                ", stature='" + stature + '\'' +
                ", weight='" + weight + '\'' +
                ", head='" + head + '\'' +
                ", intel='" + intel + '\'' +
                ", drug='" + drug + '\'' +
                ", act='" + act + '\'' +
                ", other='" + other + '\'' +
                ", intelContent='" + intelContent + '\'' +
                ", childId=" + childId +
                ", name='" + name + '\'' +
                ", sicknum='" + sicknum + '\'' +
                ", doctor='" + doctor + '\'' +
                ", surveyTime='" + surveyTime + '\'' +
                ", livenum='" + livenum + '\'' +
                '}';
    }
}
