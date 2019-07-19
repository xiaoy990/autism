package com.join.autism.entity.HzhFamily;

import java.io.Serializable;

/**
 * hzh_family
 * @author 
 */
public class HzhFamily implements Serializable {
    private Integer id;

    private Integer motherage;

    private Integer fatherage;

    private String momculture;

    private String dadculture;

    private String mompross;

    private String dadpross;

    private Integer childId;

    /**
     * 婚姻状态 0已婚 1离婚 2单亲
     */
    private Integer marriage;

    /**
     * 离婚单亲在谁的身边长大
     */
    private String marriageDesc;

    private String much;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMotherage() {
        return motherage;
    }

    public void setMotherage(Integer motherage) {
        this.motherage = motherage;
    }

    public Integer getFatherage() {
        return fatherage;
    }

    public void setFatherage(Integer fatherage) {
        this.fatherage = fatherage;
    }

    public String getMomculture() {
        return momculture;
    }

    public void setMomculture(String momculture) {
        this.momculture = momculture;
    }

    public String getDadculture() {
        return dadculture;
    }

    public void setDadculture(String dadculture) {
        this.dadculture = dadculture;
    }

    public String getMompross() {
        return mompross;
    }

    public void setMompross(String mompross) {
        this.mompross = mompross;
    }

    public String getDadpross() {
        return dadpross;
    }

    public void setDadpross(String dadpross) {
        this.dadpross = dadpross;
    }

    public Integer getChildId() {
        return childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    public Integer getMarriage() {
        return marriage;
    }

    public void setMarriage(Integer marriage) {
        this.marriage = marriage;
    }

    public String getMarriageDesc() {
        return marriageDesc;
    }

    public void setMarriageDesc(String marriageDesc) {
        this.marriageDesc = marriageDesc;
    }

    public String getMuch() {
        return much;
    }

    public void setMuch(String much) {
        this.much = much;
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
        HzhFamily other = (HzhFamily) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMotherage() == null ? other.getMotherage() == null : this.getMotherage().equals(other.getMotherage()))
            && (this.getFatherage() == null ? other.getFatherage() == null : this.getFatherage().equals(other.getFatherage()))
            && (this.getMomculture() == null ? other.getMomculture() == null : this.getMomculture().equals(other.getMomculture()))
            && (this.getDadculture() == null ? other.getDadculture() == null : this.getDadculture().equals(other.getDadculture()))
            && (this.getMompross() == null ? other.getMompross() == null : this.getMompross().equals(other.getMompross()))
            && (this.getDadpross() == null ? other.getDadpross() == null : this.getDadpross().equals(other.getDadpross()))
            && (this.getChildId() == null ? other.getChildId() == null : this.getChildId().equals(other.getChildId()))
            && (this.getMarriage() == null ? other.getMarriage() == null : this.getMarriage().equals(other.getMarriage()))
            && (this.getMarriageDesc() == null ? other.getMarriageDesc() == null : this.getMarriageDesc().equals(other.getMarriageDesc()))
            && (this.getMuch() == null ? other.getMuch() == null : this.getMuch().equals(other.getMuch()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMotherage() == null) ? 0 : getMotherage().hashCode());
        result = prime * result + ((getFatherage() == null) ? 0 : getFatherage().hashCode());
        result = prime * result + ((getMomculture() == null) ? 0 : getMomculture().hashCode());
        result = prime * result + ((getDadculture() == null) ? 0 : getDadculture().hashCode());
        result = prime * result + ((getMompross() == null) ? 0 : getMompross().hashCode());
        result = prime * result + ((getDadpross() == null) ? 0 : getDadpross().hashCode());
        result = prime * result + ((getChildId() == null) ? 0 : getChildId().hashCode());
        result = prime * result + ((getMarriage() == null) ? 0 : getMarriage().hashCode());
        result = prime * result + ((getMarriageDesc() == null) ? 0 : getMarriageDesc().hashCode());
        result = prime * result + ((getMuch() == null) ? 0 : getMuch().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", motherage=").append(motherage);
        sb.append(", fatherage=").append(fatherage);
        sb.append(", momculture=").append(momculture);
        sb.append(", dadculture=").append(dadculture);
        sb.append(", mompross=").append(mompross);
        sb.append(", dadpross=").append(dadpross);
        sb.append(", childId=").append(childId);
        sb.append(", marriage=").append(marriage);
        sb.append(", marriageDesc=").append(marriageDesc);
        sb.append(", much=").append(much);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}