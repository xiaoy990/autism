package com.join.autism.entity.HzhInborn;

import java.io.Serializable;

/**
 * hzh_inborn
 * @author 
 */
public class HzhInborn implements Serializable {
    private Integer id;

    private String sicknum;

    private String doctor;

    private String datetime;

    private String livenum;

    private String skull;

    private String skullreason;

    private String ear;

    private String earreason;

    private String eye;

    private String eyereason;

    private String nose;

    private String nosereason;

    private String center;

    private String centerreason;

    private String mouth;

    private String mouthreason;

    private String jaw;

    private String jawreason;

    private String breast;

    private String breastreason;

    private String footleg;

    private String footlegreason;

    private String heart;

    private String belly;

    private String skin;

    private String otherreason;

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

    public String getSkull() {
        return skull;
    }

    public void setSkull(String skull) {
        this.skull = skull;
    }

    public String getSkullreason() {
        return skullreason;
    }

    public void setSkullreason(String skullreason) {
        this.skullreason = skullreason;
    }

    public String getEar() {
        return ear;
    }

    public void setEar(String ear) {
        this.ear = ear;
    }

    public String getEarreason() {
        return earreason;
    }

    public void setEarreason(String earreason) {
        this.earreason = earreason;
    }

    public String getEye() {
        return eye;
    }

    public void setEye(String eye) {
        this.eye = eye;
    }

    public String getEyereason() {
        return eyereason;
    }

    public void setEyereason(String eyereason) {
        this.eyereason = eyereason;
    }

    public String getNose() {
        return nose;
    }

    public void setNose(String nose) {
        this.nose = nose;
    }

    public String getNosereason() {
        return nosereason;
    }

    public void setNosereason(String nosereason) {
        this.nosereason = nosereason;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public String getCenterreason() {
        return centerreason;
    }

    public void setCenterreason(String centerreason) {
        this.centerreason = centerreason;
    }

    public String getMouth() {
        return mouth;
    }

    public void setMouth(String mouth) {
        this.mouth = mouth;
    }

    public String getMouthreason() {
        return mouthreason;
    }

    public void setMouthreason(String mouthreason) {
        this.mouthreason = mouthreason;
    }

    public String getJaw() {
        return jaw;
    }

    public void setJaw(String jaw) {
        this.jaw = jaw;
    }

    public String getJawreason() {
        return jawreason;
    }

    public void setJawreason(String jawreason) {
        this.jawreason = jawreason;
    }

    public String getBreast() {
        return breast;
    }

    public void setBreast(String breast) {
        this.breast = breast;
    }

    public String getBreastreason() {
        return breastreason;
    }

    public void setBreastreason(String breastreason) {
        this.breastreason = breastreason;
    }

    public String getFootleg() {
        return footleg;
    }

    public void setFootleg(String footleg) {
        this.footleg = footleg;
    }

    public String getFootlegreason() {
        return footlegreason;
    }

    public void setFootlegreason(String footlegreason) {
        this.footlegreason = footlegreason;
    }

    public String getHeart() {
        return heart;
    }

    public void setHeart(String heart) {
        this.heart = heart;
    }

    public String getBelly() {
        return belly;
    }

    public void setBelly(String belly) {
        this.belly = belly;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
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
        HzhInborn other = (HzhInborn) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSicknum() == null ? other.getSicknum() == null : this.getSicknum().equals(other.getSicknum()))
            && (this.getDoctor() == null ? other.getDoctor() == null : this.getDoctor().equals(other.getDoctor()))
            && (this.getDatetime() == null ? other.getDatetime() == null : this.getDatetime().equals(other.getDatetime()))
            && (this.getLivenum() == null ? other.getLivenum() == null : this.getLivenum().equals(other.getLivenum()))
            && (this.getSkull() == null ? other.getSkull() == null : this.getSkull().equals(other.getSkull()))
            && (this.getSkullreason() == null ? other.getSkullreason() == null : this.getSkullreason().equals(other.getSkullreason()))
            && (this.getEar() == null ? other.getEar() == null : this.getEar().equals(other.getEar()))
            && (this.getEarreason() == null ? other.getEarreason() == null : this.getEarreason().equals(other.getEarreason()))
            && (this.getEye() == null ? other.getEye() == null : this.getEye().equals(other.getEye()))
            && (this.getEyereason() == null ? other.getEyereason() == null : this.getEyereason().equals(other.getEyereason()))
            && (this.getNose() == null ? other.getNose() == null : this.getNose().equals(other.getNose()))
            && (this.getNosereason() == null ? other.getNosereason() == null : this.getNosereason().equals(other.getNosereason()))
            && (this.getCenter() == null ? other.getCenter() == null : this.getCenter().equals(other.getCenter()))
            && (this.getCenterreason() == null ? other.getCenterreason() == null : this.getCenterreason().equals(other.getCenterreason()))
            && (this.getMouth() == null ? other.getMouth() == null : this.getMouth().equals(other.getMouth()))
            && (this.getMouthreason() == null ? other.getMouthreason() == null : this.getMouthreason().equals(other.getMouthreason()))
            && (this.getJaw() == null ? other.getJaw() == null : this.getJaw().equals(other.getJaw()))
            && (this.getJawreason() == null ? other.getJawreason() == null : this.getJawreason().equals(other.getJawreason()))
            && (this.getBreast() == null ? other.getBreast() == null : this.getBreast().equals(other.getBreast()))
            && (this.getBreastreason() == null ? other.getBreastreason() == null : this.getBreastreason().equals(other.getBreastreason()))
            && (this.getFootleg() == null ? other.getFootleg() == null : this.getFootleg().equals(other.getFootleg()))
            && (this.getFootlegreason() == null ? other.getFootlegreason() == null : this.getFootlegreason().equals(other.getFootlegreason()))
            && (this.getHeart() == null ? other.getHeart() == null : this.getHeart().equals(other.getHeart()))
            && (this.getBelly() == null ? other.getBelly() == null : this.getBelly().equals(other.getBelly()))
            && (this.getSkin() == null ? other.getSkin() == null : this.getSkin().equals(other.getSkin()))
            && (this.getOtherreason() == null ? other.getOtherreason() == null : this.getOtherreason().equals(other.getOtherreason()))
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
        result = prime * result + ((getSkull() == null) ? 0 : getSkull().hashCode());
        result = prime * result + ((getSkullreason() == null) ? 0 : getSkullreason().hashCode());
        result = prime * result + ((getEar() == null) ? 0 : getEar().hashCode());
        result = prime * result + ((getEarreason() == null) ? 0 : getEarreason().hashCode());
        result = prime * result + ((getEye() == null) ? 0 : getEye().hashCode());
        result = prime * result + ((getEyereason() == null) ? 0 : getEyereason().hashCode());
        result = prime * result + ((getNose() == null) ? 0 : getNose().hashCode());
        result = prime * result + ((getNosereason() == null) ? 0 : getNosereason().hashCode());
        result = prime * result + ((getCenter() == null) ? 0 : getCenter().hashCode());
        result = prime * result + ((getCenterreason() == null) ? 0 : getCenterreason().hashCode());
        result = prime * result + ((getMouth() == null) ? 0 : getMouth().hashCode());
        result = prime * result + ((getMouthreason() == null) ? 0 : getMouthreason().hashCode());
        result = prime * result + ((getJaw() == null) ? 0 : getJaw().hashCode());
        result = prime * result + ((getJawreason() == null) ? 0 : getJawreason().hashCode());
        result = prime * result + ((getBreast() == null) ? 0 : getBreast().hashCode());
        result = prime * result + ((getBreastreason() == null) ? 0 : getBreastreason().hashCode());
        result = prime * result + ((getFootleg() == null) ? 0 : getFootleg().hashCode());
        result = prime * result + ((getFootlegreason() == null) ? 0 : getFootlegreason().hashCode());
        result = prime * result + ((getHeart() == null) ? 0 : getHeart().hashCode());
        result = prime * result + ((getBelly() == null) ? 0 : getBelly().hashCode());
        result = prime * result + ((getSkin() == null) ? 0 : getSkin().hashCode());
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
        sb.append(", sicknum=").append(sicknum);
        sb.append(", doctor=").append(doctor);
        sb.append(", datetime=").append(datetime);
        sb.append(", livenum=").append(livenum);
        sb.append(", skull=").append(skull);
        sb.append(", skullreason=").append(skullreason);
        sb.append(", ear=").append(ear);
        sb.append(", earreason=").append(earreason);
        sb.append(", eye=").append(eye);
        sb.append(", eyereason=").append(eyereason);
        sb.append(", nose=").append(nose);
        sb.append(", nosereason=").append(nosereason);
        sb.append(", center=").append(center);
        sb.append(", centerreason=").append(centerreason);
        sb.append(", mouth=").append(mouth);
        sb.append(", mouthreason=").append(mouthreason);
        sb.append(", jaw=").append(jaw);
        sb.append(", jawreason=").append(jawreason);
        sb.append(", breast=").append(breast);
        sb.append(", breastreason=").append(breastreason);
        sb.append(", footleg=").append(footleg);
        sb.append(", footlegreason=").append(footlegreason);
        sb.append(", heart=").append(heart);
        sb.append(", belly=").append(belly);
        sb.append(", skin=").append(skin);
        sb.append(", otherreason=").append(otherreason);
        sb.append(", childId=").append(childId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}