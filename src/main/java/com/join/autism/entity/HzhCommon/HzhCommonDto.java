package com.join.autism.entity.HzhCommon;

import java.io.Serializable;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 17:30 2019/8/28
 */
public class HzhCommonDto implements Serializable {

    private Integer id;

    private String low;

    private String lowreason = "";

    private String infect;

    private String infectreason = "";

    private String stop;

    private String stopreason = "";

    private String high;

    private String highreason = "";

    private String around;

    private String aroundreason = "";

    private String listen;

    private String isAudiphones = "";

    private String listenreason = "";

    private String eye;

    private String isGlasses = "";

    private String eyereason = "";

    private String disease;

    private String diseasereason = "";

    private String lax;

    private String laxreason = "";

    private String vaccin;

    private String vaccinreason = "";

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

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getLowreason() {
        return lowreason;
    }

    public void setLowreason(String lowreason) {
        this.lowreason = lowreason;
    }

    public String getInfect() {
        return infect;
    }

    public void setInfect(String infect) {
        this.infect = infect;
    }

    public String getInfectreason() {
        return infectreason;
    }

    public void setInfectreason(String infectreason) {
        this.infectreason = infectreason;
    }

    public String getStop() {
        return stop;
    }

    public void setStop(String stop) {
        this.stop = stop;
    }

    public String getStopreason() {
        return stopreason;
    }

    public void setStopreason(String stopreason) {
        this.stopreason = stopreason;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getHighreason() {
        return highreason;
    }

    public void setHighreason(String highreason) {
        this.highreason = highreason;
    }

    public String getAround() {
        return around;
    }

    public void setAround(String around) {
        this.around = around;
    }

    public String getAroundreason() {
        return aroundreason;
    }

    public void setAroundreason(String aroundreason) {
        this.aroundreason = aroundreason;
    }

    public String getListen() {
        return listen;
    }

    public void setListen(String listen) {
        this.listen = listen;
    }

    public String getIsAudiphones() {
        return isAudiphones;
    }

    public void setIsAudiphones(String isAudiphones) {
        this.isAudiphones = isAudiphones;
    }

    public String getListenreason() {
        return listenreason;
    }

    public void setListenreason(String listenreason) {
        this.listenreason = listenreason;
    }

    public String getEye() {
        return eye;
    }

    public void setEye(String eye) {
        this.eye = eye;
    }

    public String getIsGlasses() {
        return isGlasses;
    }

    public void setIsGlasses(String isGlasses) {
        this.isGlasses = isGlasses;
    }

    public String getEyereason() {
        return eyereason;
    }

    public void setEyereason(String eyereason) {
        this.eyereason = eyereason;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getDiseasereason() {
        return diseasereason;
    }

    public void setDiseasereason(String diseasereason) {
        this.diseasereason = diseasereason;
    }

    public String getLax() {
        return lax;
    }

    public void setLax(String lax) {
        this.lax = lax;
    }

    public String getLaxreason() {
        return laxreason;
    }

    public void setLaxreason(String laxreason) {
        this.laxreason = laxreason;
    }

    public String getVaccin() {
        return vaccin;
    }

    public void setVaccin(String vaccin) {
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
