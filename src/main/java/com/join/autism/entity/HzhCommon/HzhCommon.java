package com.join.autism.entity.HzhCommon;

import java.io.Serializable;

/**
 * hzh_common
 * @author 
 */
public class HzhCommon implements Serializable {
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

    private static final long serialVersionUID = 1L;

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
        HzhCommon other = (HzhCommon) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLow() == null ? other.getLow() == null : this.getLow().equals(other.getLow()))
            && (this.getLowreason() == null ? other.getLowreason() == null : this.getLowreason().equals(other.getLowreason()))
            && (this.getInfect() == null ? other.getInfect() == null : this.getInfect().equals(other.getInfect()))
            && (this.getInfectreason() == null ? other.getInfectreason() == null : this.getInfectreason().equals(other.getInfectreason()))
            && (this.getStop() == null ? other.getStop() == null : this.getStop().equals(other.getStop()))
            && (this.getStopreason() == null ? other.getStopreason() == null : this.getStopreason().equals(other.getStopreason()))
            && (this.getHigh() == null ? other.getHigh() == null : this.getHigh().equals(other.getHigh()))
            && (this.getHighreason() == null ? other.getHighreason() == null : this.getHighreason().equals(other.getHighreason()))
            && (this.getAround() == null ? other.getAround() == null : this.getAround().equals(other.getAround()))
            && (this.getAroundreason() == null ? other.getAroundreason() == null : this.getAroundreason().equals(other.getAroundreason()))
            && (this.getListen() == null ? other.getListen() == null : this.getListen().equals(other.getListen()))
            && (this.getIsAudiphones() == null ? other.getIsAudiphones() == null : this.getIsAudiphones().equals(other.getIsAudiphones()))
            && (this.getListenreason() == null ? other.getListenreason() == null : this.getListenreason().equals(other.getListenreason()))
            && (this.getEye() == null ? other.getEye() == null : this.getEye().equals(other.getEye()))
            && (this.getIsGlasses() == null ? other.getIsGlasses() == null : this.getIsGlasses().equals(other.getIsGlasses()))
            && (this.getEyereason() == null ? other.getEyereason() == null : this.getEyereason().equals(other.getEyereason()))
            && (this.getDisease() == null ? other.getDisease() == null : this.getDisease().equals(other.getDisease()))
            && (this.getDiseasereason() == null ? other.getDiseasereason() == null : this.getDiseasereason().equals(other.getDiseasereason()))
            && (this.getLax() == null ? other.getLax() == null : this.getLax().equals(other.getLax()))
            && (this.getLaxreason() == null ? other.getLaxreason() == null : this.getLaxreason().equals(other.getLaxreason()))
            && (this.getVaccin() == null ? other.getVaccin() == null : this.getVaccin().equals(other.getVaccin()))
            && (this.getVaccinreason() == null ? other.getVaccinreason() == null : this.getVaccinreason().equals(other.getVaccinreason()))
            && (this.getChildId() == null ? other.getChildId() == null : this.getChildId().equals(other.getChildId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLow() == null) ? 0 : getLow().hashCode());
        result = prime * result + ((getLowreason() == null) ? 0 : getLowreason().hashCode());
        result = prime * result + ((getInfect() == null) ? 0 : getInfect().hashCode());
        result = prime * result + ((getInfectreason() == null) ? 0 : getInfectreason().hashCode());
        result = prime * result + ((getStop() == null) ? 0 : getStop().hashCode());
        result = prime * result + ((getStopreason() == null) ? 0 : getStopreason().hashCode());
        result = prime * result + ((getHigh() == null) ? 0 : getHigh().hashCode());
        result = prime * result + ((getHighreason() == null) ? 0 : getHighreason().hashCode());
        result = prime * result + ((getAround() == null) ? 0 : getAround().hashCode());
        result = prime * result + ((getAroundreason() == null) ? 0 : getAroundreason().hashCode());
        result = prime * result + ((getListen() == null) ? 0 : getListen().hashCode());
        result = prime * result + ((getIsAudiphones() == null) ? 0 : getIsAudiphones().hashCode());
        result = prime * result + ((getListenreason() == null) ? 0 : getListenreason().hashCode());
        result = prime * result + ((getEye() == null) ? 0 : getEye().hashCode());
        result = prime * result + ((getIsGlasses() == null) ? 0 : getIsGlasses().hashCode());
        result = prime * result + ((getEyereason() == null) ? 0 : getEyereason().hashCode());
        result = prime * result + ((getDisease() == null) ? 0 : getDisease().hashCode());
        result = prime * result + ((getDiseasereason() == null) ? 0 : getDiseasereason().hashCode());
        result = prime * result + ((getLax() == null) ? 0 : getLax().hashCode());
        result = prime * result + ((getLaxreason() == null) ? 0 : getLaxreason().hashCode());
        result = prime * result + ((getVaccin() == null) ? 0 : getVaccin().hashCode());
        result = prime * result + ((getVaccinreason() == null) ? 0 : getVaccinreason().hashCode());
        result = prime * result + ((getChildId() == null) ? 0 : getChildId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", low=").append(low);
        sb.append(", lowreason=").append(lowreason);
        sb.append(", infect=").append(infect);
        sb.append(", infectreason=").append(infectreason);
        sb.append(", stop=").append(stop);
        sb.append(", stopreason=").append(stopreason);
        sb.append(", high=").append(high);
        sb.append(", highreason=").append(highreason);
        sb.append(", around=").append(around);
        sb.append(", aroundreason=").append(aroundreason);
        sb.append(", listen=").append(listen);
        sb.append(", isAudiphones=").append(isAudiphones);
        sb.append(", listenreason=").append(listenreason);
        sb.append(", eye=").append(eye);
        sb.append(", isGlasses=").append(isGlasses);
        sb.append(", eyereason=").append(eyereason);
        sb.append(", disease=").append(disease);
        sb.append(", diseasereason=").append(diseasereason);
        sb.append(", lax=").append(lax);
        sb.append(", laxreason=").append(laxreason);
        sb.append(", vaccin=").append(vaccin);
        sb.append(", vaccinreason=").append(vaccinreason);
        sb.append(", childId=").append(childId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}