package com.join.autism.entity.HzhSpirit;

import java.io.Serializable;

/**
 * hzh_spirit
 * @author 
 */
public class HzhSpirit implements Serializable {
    private Integer id;

    private String sicknum;

    private String doctor;

    private String datetime;

    private String livenum;

    private String nospeak;

    private String brains;

    private String speakslow;

    private String blues;

    private String anxious;

    private String manic;

    private String split;

    private String muchgo;

    private String social;

    private String force;

    private String choice;

    private String spirit;

    private String other;

    private Integer childId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getLivenum() {
        return livenum;
    }

    public void setLivenum(String livenum) {
        this.livenum = livenum;
    }

    public String getNospeak() {
        return nospeak;
    }

    public void setNospeak(String nospeak) {
        this.nospeak = nospeak;
    }

    public String getBrains() {
        return brains;
    }

    public void setBrains(String brains) {
        this.brains = brains;
    }

    public String getSpeakslow() {
        return speakslow;
    }

    public void setSpeakslow(String speakslow) {
        this.speakslow = speakslow;
    }

    public String getBlues() {
        return blues;
    }

    public void setBlues(String blues) {
        this.blues = blues;
    }

    public String getAnxious() {
        return anxious;
    }

    public void setAnxious(String anxious) {
        this.anxious = anxious;
    }

    public String getManic() {
        return manic;
    }

    public void setManic(String manic) {
        this.manic = manic;
    }

    public String getSplit() {
        return split;
    }

    public void setSplit(String split) {
        this.split = split;
    }

    public String getMuchgo() {
        return muchgo;
    }

    public void setMuchgo(String muchgo) {
        this.muchgo = muchgo;
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public String getForce() {
        return force;
    }

    public void setForce(String force) {
        this.force = force;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getSpirit() {
        return spirit;
    }

    public void setSpirit(String spirit) {
        this.spirit = spirit;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
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
        HzhSpirit other = (HzhSpirit) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSicknum() == null ? other.getSicknum() == null : this.getSicknum().equals(other.getSicknum()))
            && (this.getDoctor() == null ? other.getDoctor() == null : this.getDoctor().equals(other.getDoctor()))
            && (this.getDatetime() == null ? other.getDatetime() == null : this.getDatetime().equals(other.getDatetime()))
            && (this.getLivenum() == null ? other.getLivenum() == null : this.getLivenum().equals(other.getLivenum()))
            && (this.getNospeak() == null ? other.getNospeak() == null : this.getNospeak().equals(other.getNospeak()))
            && (this.getBrains() == null ? other.getBrains() == null : this.getBrains().equals(other.getBrains()))
            && (this.getSpeakslow() == null ? other.getSpeakslow() == null : this.getSpeakslow().equals(other.getSpeakslow()))
            && (this.getBlues() == null ? other.getBlues() == null : this.getBlues().equals(other.getBlues()))
            && (this.getAnxious() == null ? other.getAnxious() == null : this.getAnxious().equals(other.getAnxious()))
            && (this.getManic() == null ? other.getManic() == null : this.getManic().equals(other.getManic()))
            && (this.getSplit() == null ? other.getSplit() == null : this.getSplit().equals(other.getSplit()))
            && (this.getMuchgo() == null ? other.getMuchgo() == null : this.getMuchgo().equals(other.getMuchgo()))
            && (this.getSocial() == null ? other.getSocial() == null : this.getSocial().equals(other.getSocial()))
            && (this.getForce() == null ? other.getForce() == null : this.getForce().equals(other.getForce()))
            && (this.getChoice() == null ? other.getChoice() == null : this.getChoice().equals(other.getChoice()))
            && (this.getSpirit() == null ? other.getSpirit() == null : this.getSpirit().equals(other.getSpirit()))
            && (this.getOther() == null ? other.getOther() == null : this.getOther().equals(other.getOther()))
            && (this.getChildId() == null ? other.getChildId() == null : this.getChildId().equals(other.getChildId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSicknum() == null) ? 0 : getSicknum().hashCode());
        result = prime * result + ((getDoctor() == null) ? 0 : getDoctor().hashCode());
        result = prime * result + ((getDatetime() == null) ? 0 : getDatetime().hashCode());
        result = prime * result + ((getLivenum() == null) ? 0 : getLivenum().hashCode());
        result = prime * result + ((getNospeak() == null) ? 0 : getNospeak().hashCode());
        result = prime * result + ((getBrains() == null) ? 0 : getBrains().hashCode());
        result = prime * result + ((getSpeakslow() == null) ? 0 : getSpeakslow().hashCode());
        result = prime * result + ((getBlues() == null) ? 0 : getBlues().hashCode());
        result = prime * result + ((getAnxious() == null) ? 0 : getAnxious().hashCode());
        result = prime * result + ((getManic() == null) ? 0 : getManic().hashCode());
        result = prime * result + ((getSplit() == null) ? 0 : getSplit().hashCode());
        result = prime * result + ((getMuchgo() == null) ? 0 : getMuchgo().hashCode());
        result = prime * result + ((getSocial() == null) ? 0 : getSocial().hashCode());
        result = prime * result + ((getForce() == null) ? 0 : getForce().hashCode());
        result = prime * result + ((getChoice() == null) ? 0 : getChoice().hashCode());
        result = prime * result + ((getSpirit() == null) ? 0 : getSpirit().hashCode());
        result = prime * result + ((getOther() == null) ? 0 : getOther().hashCode());
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
        sb.append(", sicknum=").append(sicknum);
        sb.append(", doctor=").append(doctor);
        sb.append(", datetime=").append(datetime);
        sb.append(", livenum=").append(livenum);
        sb.append(", nospeak=").append(nospeak);
        sb.append(", brains=").append(brains);
        sb.append(", speakslow=").append(speakslow);
        sb.append(", blues=").append(blues);
        sb.append(", anxious=").append(anxious);
        sb.append(", manic=").append(manic);
        sb.append(", split=").append(split);
        sb.append(", muchgo=").append(muchgo);
        sb.append(", social=").append(social);
        sb.append(", force=").append(force);
        sb.append(", choice=").append(choice);
        sb.append(", spirit=").append(spirit);
        sb.append(", other=").append(other);
        sb.append(", childId=").append(childId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}