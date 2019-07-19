package com.join.autism.entity.HzhEmotion;

import java.io.Serializable;

/**
 * hzh_emotion
 * @author 
 */
public class HzhEmotion implements Serializable {
    private Integer id;

    private Integer childId;

    private Integer rela;

    private Integer imitate;

    private Integer emotion;

    private Integer motion;

    private Integer nonlife;

    private Integer change;

    private Integer vision;

    private Integer hearing;

    private Integer nearby;

    private Integer anxious;

    private Integer language;

    private Integer nolan;

    private Integer activity;

    private Integer intelligence;

    private Integer impression;

    private Integer frasum;

    private Integer addtime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChildId() {
        return childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    public Integer getRela() {
        return rela;
    }

    public void setRela(Integer rela) {
        this.rela = rela;
    }

    public Integer getImitate() {
        return imitate;
    }

    public void setImitate(Integer imitate) {
        this.imitate = imitate;
    }

    public Integer getEmotion() {
        return emotion;
    }

    public void setEmotion(Integer emotion) {
        this.emotion = emotion;
    }

    public Integer getMotion() {
        return motion;
    }

    public void setMotion(Integer motion) {
        this.motion = motion;
    }

    public Integer getNonlife() {
        return nonlife;
    }

    public void setNonlife(Integer nonlife) {
        this.nonlife = nonlife;
    }

    public Integer getChange() {
        return change;
    }

    public void setChange(Integer change) {
        this.change = change;
    }

    public Integer getVision() {
        return vision;
    }

    public void setVision(Integer vision) {
        this.vision = vision;
    }

    public Integer getHearing() {
        return hearing;
    }

    public void setHearing(Integer hearing) {
        this.hearing = hearing;
    }

    public Integer getNearby() {
        return nearby;
    }

    public void setNearby(Integer nearby) {
        this.nearby = nearby;
    }

    public Integer getAnxious() {
        return anxious;
    }

    public void setAnxious(Integer anxious) {
        this.anxious = anxious;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

    public Integer getNolan() {
        return nolan;
    }

    public void setNolan(Integer nolan) {
        this.nolan = nolan;
    }

    public Integer getActivity() {
        return activity;
    }

    public void setActivity(Integer activity) {
        this.activity = activity;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getImpression() {
        return impression;
    }

    public void setImpression(Integer impression) {
        this.impression = impression;
    }

    public Integer getFrasum() {
        return frasum;
    }

    public void setFrasum(Integer frasum) {
        this.frasum = frasum;
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
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
        HzhEmotion other = (HzhEmotion) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getChildId() == null ? other.getChildId() == null : this.getChildId().equals(other.getChildId()))
            && (this.getRela() == null ? other.getRela() == null : this.getRela().equals(other.getRela()))
            && (this.getImitate() == null ? other.getImitate() == null : this.getImitate().equals(other.getImitate()))
            && (this.getEmotion() == null ? other.getEmotion() == null : this.getEmotion().equals(other.getEmotion()))
            && (this.getMotion() == null ? other.getMotion() == null : this.getMotion().equals(other.getMotion()))
            && (this.getNonlife() == null ? other.getNonlife() == null : this.getNonlife().equals(other.getNonlife()))
            && (this.getChange() == null ? other.getChange() == null : this.getChange().equals(other.getChange()))
            && (this.getVision() == null ? other.getVision() == null : this.getVision().equals(other.getVision()))
            && (this.getHearing() == null ? other.getHearing() == null : this.getHearing().equals(other.getHearing()))
            && (this.getNearby() == null ? other.getNearby() == null : this.getNearby().equals(other.getNearby()))
            && (this.getAnxious() == null ? other.getAnxious() == null : this.getAnxious().equals(other.getAnxious()))
            && (this.getLanguage() == null ? other.getLanguage() == null : this.getLanguage().equals(other.getLanguage()))
            && (this.getNolan() == null ? other.getNolan() == null : this.getNolan().equals(other.getNolan()))
            && (this.getActivity() == null ? other.getActivity() == null : this.getActivity().equals(other.getActivity()))
            && (this.getIntelligence() == null ? other.getIntelligence() == null : this.getIntelligence().equals(other.getIntelligence()))
            && (this.getImpression() == null ? other.getImpression() == null : this.getImpression().equals(other.getImpression()))
            && (this.getFrasum() == null ? other.getFrasum() == null : this.getFrasum().equals(other.getFrasum()))
            && (this.getAddtime() == null ? other.getAddtime() == null : this.getAddtime().equals(other.getAddtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getChildId() == null) ? 0 : getChildId().hashCode());
        result = prime * result + ((getRela() == null) ? 0 : getRela().hashCode());
        result = prime * result + ((getImitate() == null) ? 0 : getImitate().hashCode());
        result = prime * result + ((getEmotion() == null) ? 0 : getEmotion().hashCode());
        result = prime * result + ((getMotion() == null) ? 0 : getMotion().hashCode());
        result = prime * result + ((getNonlife() == null) ? 0 : getNonlife().hashCode());
        result = prime * result + ((getChange() == null) ? 0 : getChange().hashCode());
        result = prime * result + ((getVision() == null) ? 0 : getVision().hashCode());
        result = prime * result + ((getHearing() == null) ? 0 : getHearing().hashCode());
        result = prime * result + ((getNearby() == null) ? 0 : getNearby().hashCode());
        result = prime * result + ((getAnxious() == null) ? 0 : getAnxious().hashCode());
        result = prime * result + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        result = prime * result + ((getNolan() == null) ? 0 : getNolan().hashCode());
        result = prime * result + ((getActivity() == null) ? 0 : getActivity().hashCode());
        result = prime * result + ((getIntelligence() == null) ? 0 : getIntelligence().hashCode());
        result = prime * result + ((getImpression() == null) ? 0 : getImpression().hashCode());
        result = prime * result + ((getFrasum() == null) ? 0 : getFrasum().hashCode());
        result = prime * result + ((getAddtime() == null) ? 0 : getAddtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", childId=").append(childId);
        sb.append(", rela=").append(rela);
        sb.append(", imitate=").append(imitate);
        sb.append(", emotion=").append(emotion);
        sb.append(", motion=").append(motion);
        sb.append(", nonlife=").append(nonlife);
        sb.append(", change=").append(change);
        sb.append(", vision=").append(vision);
        sb.append(", hearing=").append(hearing);
        sb.append(", nearby=").append(nearby);
        sb.append(", anxious=").append(anxious);
        sb.append(", language=").append(language);
        sb.append(", nolan=").append(nolan);
        sb.append(", activity=").append(activity);
        sb.append(", intelligence=").append(intelligence);
        sb.append(", impression=").append(impression);
        sb.append(", frasum=").append(frasum);
        sb.append(", addtime=").append(addtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}