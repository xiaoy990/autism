package com.join.autism.entity.HzhCommon;

import java.io.Serializable;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 17:30 2019/8/28
 */
public class HzhCommonDto implements Serializable {

    private Integer id;

    private Integer low;

    private String lowreason;

    private Integer infect;

    private String infectreason;

    private Integer stop;

    private String stopreason;

    private Integer high;

    private String highreason;

    private Integer around;

    private String aroundreason;

    private Integer listen;

    private Integer isAudiphones;

    private String listenreason;

    private Integer eye;

    private Integer isGlasses;

    private String eyereason;

    private Integer disease;

    private String diseasereason;

    private Integer lax;

    private String laxreason;

    private Integer vaccin;

    private String vaccinreason;

    private Integer childId;

    private String name;

    private String sicknum;

    private String doctor;

    private String surveyTime;

    private String livenum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLow() {
        return low;
    }

    public void setLow(Integer low) {
        this.low = low;
    }

    public String getLowreason() {
        return lowreason;
    }

    public void setLowreason(String lowreason) {
        this.lowreason = lowreason;
    }

    public Integer getInfect() {
        return infect;
    }

    public void setInfect(Integer infect) {
        this.infect = infect;
    }

    public String getInfectreason() {
        return infectreason;
    }

    public void setInfectreason(String infectreason) {
        this.infectreason = infectreason;
    }

    public Integer getStop() {
        return stop;
    }

    public void setStop(Integer stop) {
        this.stop = stop;
    }

    public String getStopreason() {
        return stopreason;
    }

    public void setStopreason(String stopreason) {
        this.stopreason = stopreason;
    }

    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    public String getHighreason() {
        return highreason;
    }

    public void setHighreason(String highreason) {
        this.highreason = highreason;
    }

    public Integer getAround() {
        return around;
    }

    public void setAround(Integer around) {
        this.around = around;
    }

    public String getAroundreason() {
        return aroundreason;
    }

    public void setAroundreason(String aroundreason) {
        this.aroundreason = aroundreason;
    }

    public Integer getListen() {
        return listen;
    }

    public void setListen(Integer listen) {
        this.listen = listen;
    }

    public Integer getIsAudiphones() {
        return isAudiphones;
    }

    public void setIsAudiphones(Integer isAudiphones) {
        this.isAudiphones = isAudiphones;
    }

    public String getListenreason() {
        return listenreason;
    }

    public void setListenreason(String listenreason) {
        this.listenreason = listenreason;
    }

    public Integer getEye() {
        return eye;
    }

    public void setEye(Integer eye) {
        this.eye = eye;
    }

    public Integer getIsGlasses() {
        return isGlasses;
    }

    public void setIsGlasses(Integer isGlasses) {
        this.isGlasses = isGlasses;
    }

    public String getEyereason() {
        return eyereason;
    }

    public void setEyereason(String eyereason) {
        this.eyereason = eyereason;
    }

    public Integer getDisease() {
        return disease;
    }

    public void setDisease(Integer disease) {
        this.disease = disease;
    }

    public String getDiseasereason() {
        return diseasereason;
    }

    public void setDiseasereason(String diseasereason) {
        this.diseasereason = diseasereason;
    }

    public Integer getLax() {
        return lax;
    }

    public void setLax(Integer lax) {
        this.lax = lax;
    }

    public String getLaxreason() {
        return laxreason;
    }

    public void setLaxreason(String laxreason) {
        this.laxreason = laxreason;
    }

    public Integer getVaccin() {
        return vaccin;
    }

    public void setVaccin(Integer vaccin) {
        this.vaccin = vaccin;
    }

    public String getVaccinreason() {
        return vaccinreason;
    }

    public void setVaccinreason(String vaccinreason) {
        this.vaccinreason = vaccinreason;
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
        return "HzhCommonDto{" +
                "id=" + id +
                ", low=" + low +
                ", lowreason='" + lowreason + '\'' +
                ", infect=" + infect +
                ", infectreason='" + infectreason + '\'' +
                ", stop=" + stop +
                ", stopreason='" + stopreason + '\'' +
                ", high=" + high +
                ", highreason='" + highreason + '\'' +
                ", around=" + around +
                ", aroundreason='" + aroundreason + '\'' +
                ", listen=" + listen +
                ", isAudiphones=" + isAudiphones +
                ", listenreason='" + listenreason + '\'' +
                ", eye=" + eye +
                ", isGlasses=" + isGlasses +
                ", eyereason='" + eyereason + '\'' +
                ", disease=" + disease +
                ", diseasereason='" + diseasereason + '\'' +
                ", lax=" + lax +
                ", laxreason='" + laxreason + '\'' +
                ", vaccin=" + vaccin +
                ", vaccinreason='" + vaccinreason + '\'' +
                ", childId=" + childId +
                ", name='" + name + '\'' +
                ", sicknum='" + sicknum + '\'' +
                ", doctor='" + doctor + '\'' +
                ", surveyTime='" + surveyTime + '\'' +
                ", livenum='" + livenum + '\'' +
                '}';
    }
}
