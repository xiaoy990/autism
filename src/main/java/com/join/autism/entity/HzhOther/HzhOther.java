package com.join.autism.entity.HzhOther;

import java.io.Serializable;

/**
 * hzh_other
 * @author 
 */
public class HzhOther implements Serializable {
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
        HzhOther other = (HzhOther) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStature() == null ? other.getStature() == null : this.getStature().equals(other.getStature()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getHead() == null ? other.getHead() == null : this.getHead().equals(other.getHead()))
            && (this.getIntel() == null ? other.getIntel() == null : this.getIntel().equals(other.getIntel()))
            && (this.getDrug() == null ? other.getDrug() == null : this.getDrug().equals(other.getDrug()))
            && (this.getAct() == null ? other.getAct() == null : this.getAct().equals(other.getAct()))
            && (this.getOther() == null ? other.getOther() == null : this.getOther().equals(other.getOther()))
            && (this.getIntelContent() == null ? other.getIntelContent() == null : this.getIntelContent().equals(other.getIntelContent()))
            && (this.getChildId() == null ? other.getChildId() == null : this.getChildId().equals(other.getChildId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStature() == null) ? 0 : getStature().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getHead() == null) ? 0 : getHead().hashCode());
        result = prime * result + ((getIntel() == null) ? 0 : getIntel().hashCode());
        result = prime * result + ((getDrug() == null) ? 0 : getDrug().hashCode());
        result = prime * result + ((getAct() == null) ? 0 : getAct().hashCode());
        result = prime * result + ((getOther() == null) ? 0 : getOther().hashCode());
        result = prime * result + ((getIntelContent() == null) ? 0 : getIntelContent().hashCode());
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
        sb.append(", stature=").append(stature);
        sb.append(", weight=").append(weight);
        sb.append(", head=").append(head);
        sb.append(", intel=").append(intel);
        sb.append(", drug=").append(drug);
        sb.append(", act=").append(act);
        sb.append(", other=").append(other);
        sb.append(", intelContent=").append(intelContent);
        sb.append(", childId=").append(childId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}