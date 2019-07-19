package com.join.autism.entity.HzhNerve;

import java.io.Serializable;

/**
 * hzh_nerve
 * @author 
 */
public class HzhNerve implements Serializable {
    private Integer id;

    private Integer yesNo;

    private Integer epilepsy;

    private String epilepsyreason;

    private Integer tension;

    private String tensionreason;

    private Integer imbalance;

    private String imbalancereason;

    private Integer gait;

    private String gaitreason;

    private Integer lncrease;

    private String lncreasereason;

    private Integer weaken;

    private String weakenreason;

    private Integer other;

    private String otherreason;

    private Integer childId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYesNo() {
        return yesNo;
    }

    public void setYesNo(Integer yesNo) {
        this.yesNo = yesNo;
    }

    public Integer getEpilepsy() {
        return epilepsy;
    }

    public void setEpilepsy(Integer epilepsy) {
        this.epilepsy = epilepsy;
    }

    public String getEpilepsyreason() {
        return epilepsyreason;
    }

    public void setEpilepsyreason(String epilepsyreason) {
        this.epilepsyreason = epilepsyreason;
    }

    public Integer getTension() {
        return tension;
    }

    public void setTension(Integer tension) {
        this.tension = tension;
    }

    public String getTensionreason() {
        return tensionreason;
    }

    public void setTensionreason(String tensionreason) {
        this.tensionreason = tensionreason;
    }

    public Integer getImbalance() {
        return imbalance;
    }

    public void setImbalance(Integer imbalance) {
        this.imbalance = imbalance;
    }

    public String getImbalancereason() {
        return imbalancereason;
    }

    public void setImbalancereason(String imbalancereason) {
        this.imbalancereason = imbalancereason;
    }

    public Integer getGait() {
        return gait;
    }

    public void setGait(Integer gait) {
        this.gait = gait;
    }

    public String getGaitreason() {
        return gaitreason;
    }

    public void setGaitreason(String gaitreason) {
        this.gaitreason = gaitreason;
    }

    public Integer getLncrease() {
        return lncrease;
    }

    public void setLncrease(Integer lncrease) {
        this.lncrease = lncrease;
    }

    public String getLncreasereason() {
        return lncreasereason;
    }

    public void setLncreasereason(String lncreasereason) {
        this.lncreasereason = lncreasereason;
    }

    public Integer getWeaken() {
        return weaken;
    }

    public void setWeaken(Integer weaken) {
        this.weaken = weaken;
    }

    public String getWeakenreason() {
        return weakenreason;
    }

    public void setWeakenreason(String weakenreason) {
        this.weakenreason = weakenreason;
    }

    public Integer getOther() {
        return other;
    }

    public void setOther(Integer other) {
        this.other = other;
    }

    public String getOtherreason() {
        return otherreason;
    }

    public void setOtherreason(String otherreason) {
        this.otherreason = otherreason;
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
        HzhNerve other = (HzhNerve) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getYesNo() == null ? other.getYesNo() == null : this.getYesNo().equals(other.getYesNo()))
            && (this.getEpilepsy() == null ? other.getEpilepsy() == null : this.getEpilepsy().equals(other.getEpilepsy()))
            && (this.getEpilepsyreason() == null ? other.getEpilepsyreason() == null : this.getEpilepsyreason().equals(other.getEpilepsyreason()))
            && (this.getTension() == null ? other.getTension() == null : this.getTension().equals(other.getTension()))
            && (this.getTensionreason() == null ? other.getTensionreason() == null : this.getTensionreason().equals(other.getTensionreason()))
            && (this.getImbalance() == null ? other.getImbalance() == null : this.getImbalance().equals(other.getImbalance()))
            && (this.getImbalancereason() == null ? other.getImbalancereason() == null : this.getImbalancereason().equals(other.getImbalancereason()))
            && (this.getGait() == null ? other.getGait() == null : this.getGait().equals(other.getGait()))
            && (this.getGaitreason() == null ? other.getGaitreason() == null : this.getGaitreason().equals(other.getGaitreason()))
            && (this.getLncrease() == null ? other.getLncrease() == null : this.getLncrease().equals(other.getLncrease()))
            && (this.getLncreasereason() == null ? other.getLncreasereason() == null : this.getLncreasereason().equals(other.getLncreasereason()))
            && (this.getWeaken() == null ? other.getWeaken() == null : this.getWeaken().equals(other.getWeaken()))
            && (this.getWeakenreason() == null ? other.getWeakenreason() == null : this.getWeakenreason().equals(other.getWeakenreason()))
            && (this.getOther() == null ? other.getOther() == null : this.getOther().equals(other.getOther()))
            && (this.getOtherreason() == null ? other.getOtherreason() == null : this.getOtherreason().equals(other.getOtherreason()))
            && (this.getChildId() == null ? other.getChildId() == null : this.getChildId().equals(other.getChildId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getYesNo() == null) ? 0 : getYesNo().hashCode());
        result = prime * result + ((getEpilepsy() == null) ? 0 : getEpilepsy().hashCode());
        result = prime * result + ((getEpilepsyreason() == null) ? 0 : getEpilepsyreason().hashCode());
        result = prime * result + ((getTension() == null) ? 0 : getTension().hashCode());
        result = prime * result + ((getTensionreason() == null) ? 0 : getTensionreason().hashCode());
        result = prime * result + ((getImbalance() == null) ? 0 : getImbalance().hashCode());
        result = prime * result + ((getImbalancereason() == null) ? 0 : getImbalancereason().hashCode());
        result = prime * result + ((getGait() == null) ? 0 : getGait().hashCode());
        result = prime * result + ((getGaitreason() == null) ? 0 : getGaitreason().hashCode());
        result = prime * result + ((getLncrease() == null) ? 0 : getLncrease().hashCode());
        result = prime * result + ((getLncreasereason() == null) ? 0 : getLncreasereason().hashCode());
        result = prime * result + ((getWeaken() == null) ? 0 : getWeaken().hashCode());
        result = prime * result + ((getWeakenreason() == null) ? 0 : getWeakenreason().hashCode());
        result = prime * result + ((getOther() == null) ? 0 : getOther().hashCode());
        result = prime * result + ((getOtherreason() == null) ? 0 : getOtherreason().hashCode());
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
        sb.append(", yesNo=").append(yesNo);
        sb.append(", epilepsy=").append(epilepsy);
        sb.append(", epilepsyreason=").append(epilepsyreason);
        sb.append(", tension=").append(tension);
        sb.append(", tensionreason=").append(tensionreason);
        sb.append(", imbalance=").append(imbalance);
        sb.append(", imbalancereason=").append(imbalancereason);
        sb.append(", gait=").append(gait);
        sb.append(", gaitreason=").append(gaitreason);
        sb.append(", lncrease=").append(lncrease);
        sb.append(", lncreasereason=").append(lncreasereason);
        sb.append(", weaken=").append(weaken);
        sb.append(", weakenreason=").append(weakenreason);
        sb.append(", other=").append(other);
        sb.append(", otherreason=").append(otherreason);
        sb.append(", childId=").append(childId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}