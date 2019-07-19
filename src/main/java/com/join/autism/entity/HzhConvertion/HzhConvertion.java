package com.join.autism.entity.HzhConvertion;

import java.io.Serializable;

/**
 * hzh_convertion
 * @author 
 */
public class HzhConvertion implements Serializable {
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
        HzhConvertion other = (HzhConvertion) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSleep() == null ? other.getSleep() == null : this.getSleep().equals(other.getSleep()))
            && (this.getSleepreason() == null ? other.getSleepreason() == null : this.getSleepreason().equals(other.getSleepreason()))
            && (this.getEat() == null ? other.getEat() == null : this.getEat().equals(other.getEat()))
            && (this.getEatreason() == null ? other.getEatreason() == null : this.getEatreason().equals(other.getEatreason()))
            && (this.getFat() == null ? other.getFat() == null : this.getFat().equals(other.getFat()))
            && (this.getFatreason() == null ? other.getFatreason() == null : this.getFatreason().equals(other.getFatreason()))
            && (this.getActive() == null ? other.getActive() == null : this.getActive().equals(other.getActive()))
            && (this.getActivereason() == null ? other.getActivereason() == null : this.getActivereason().equals(other.getActivereason()))
            && (this.getThin() == null ? other.getThin() == null : this.getThin().equals(other.getThin()))
            && (this.getThinreason() == null ? other.getThinreason() == null : this.getThinreason().equals(other.getThinreason()))
            && (this.getChildId() == null ? other.getChildId() == null : this.getChildId().equals(other.getChildId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSleep() == null) ? 0 : getSleep().hashCode());
        result = prime * result + ((getSleepreason() == null) ? 0 : getSleepreason().hashCode());
        result = prime * result + ((getEat() == null) ? 0 : getEat().hashCode());
        result = prime * result + ((getEatreason() == null) ? 0 : getEatreason().hashCode());
        result = prime * result + ((getFat() == null) ? 0 : getFat().hashCode());
        result = prime * result + ((getFatreason() == null) ? 0 : getFatreason().hashCode());
        result = prime * result + ((getActive() == null) ? 0 : getActive().hashCode());
        result = prime * result + ((getActivereason() == null) ? 0 : getActivereason().hashCode());
        result = prime * result + ((getThin() == null) ? 0 : getThin().hashCode());
        result = prime * result + ((getThinreason() == null) ? 0 : getThinreason().hashCode());
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
        sb.append(", sleep=").append(sleep);
        sb.append(", sleepreason=").append(sleepreason);
        sb.append(", eat=").append(eat);
        sb.append(", eatreason=").append(eatreason);
        sb.append(", fat=").append(fat);
        sb.append(", fatreason=").append(fatreason);
        sb.append(", active=").append(active);
        sb.append(", activereason=").append(activereason);
        sb.append(", thin=").append(thin);
        sb.append(", thinreason=").append(thinreason);
        sb.append(", childId=").append(childId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}