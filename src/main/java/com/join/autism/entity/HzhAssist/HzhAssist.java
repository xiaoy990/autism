package com.join.autism.entity.HzhAssist;

import java.io.Serializable;

/**
 * hzh_assist
 * @author 
 */
public class HzhAssist implements Serializable {
    private Integer id;

    private String pic;

    private String headpic;

    private String headmri;

    private String headmrireason;

    private String intell;

    private String colorbody;

    private String bloodwater;

    private String check;

    private String supersession;

    private String ssreason;

    private String other;

    private String otherreason;

    private Integer childId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getHeadpic() {
        return headpic;
    }

    public void setHeadpic(String headpic) {
        this.headpic = headpic;
    }

    public String getHeadmri() {
        return headmri;
    }

    public void setHeadmri(String headmri) {
        this.headmri = headmri;
    }

    public String getHeadmrireason() {
        return headmrireason;
    }

    public void setHeadmrireason(String headmrireason) {
        this.headmrireason = headmrireason;
    }

    public String getIntell() {
        return intell;
    }

    public void setIntell(String intell) {
        this.intell = intell;
    }

    public String getColorbody() {
        return colorbody;
    }

    public void setColorbody(String colorbody) {
        this.colorbody = colorbody;
    }

    public String getBloodwater() {
        return bloodwater;
    }

    public void setBloodwater(String bloodwater) {
        this.bloodwater = bloodwater;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    public String getSupersession() {
        return supersession;
    }

    public void setSupersession(String supersession) {
        this.supersession = supersession;
    }

    public String getSsreason() {
        return ssreason;
    }

    public void setSsreason(String ssreason) {
        this.ssreason = ssreason;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
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
        HzhAssist other = (HzhAssist) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPic() == null ? other.getPic() == null : this.getPic().equals(other.getPic()))
            && (this.getHeadpic() == null ? other.getHeadpic() == null : this.getHeadpic().equals(other.getHeadpic()))
            && (this.getHeadmri() == null ? other.getHeadmri() == null : this.getHeadmri().equals(other.getHeadmri()))
            && (this.getHeadmrireason() == null ? other.getHeadmrireason() == null : this.getHeadmrireason().equals(other.getHeadmrireason()))
            && (this.getIntell() == null ? other.getIntell() == null : this.getIntell().equals(other.getIntell()))
            && (this.getColorbody() == null ? other.getColorbody() == null : this.getColorbody().equals(other.getColorbody()))
            && (this.getBloodwater() == null ? other.getBloodwater() == null : this.getBloodwater().equals(other.getBloodwater()))
            && (this.getCheck() == null ? other.getCheck() == null : this.getCheck().equals(other.getCheck()))
            && (this.getSupersession() == null ? other.getSupersession() == null : this.getSupersession().equals(other.getSupersession()))
            && (this.getSsreason() == null ? other.getSsreason() == null : this.getSsreason().equals(other.getSsreason()))
            && (this.getOther() == null ? other.getOther() == null : this.getOther().equals(other.getOther()))
            && (this.getOtherreason() == null ? other.getOtherreason() == null : this.getOtherreason().equals(other.getOtherreason()))
            && (this.getChildId() == null ? other.getChildId() == null : this.getChildId().equals(other.getChildId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPic() == null) ? 0 : getPic().hashCode());
        result = prime * result + ((getHeadpic() == null) ? 0 : getHeadpic().hashCode());
        result = prime * result + ((getHeadmri() == null) ? 0 : getHeadmri().hashCode());
        result = prime * result + ((getHeadmrireason() == null) ? 0 : getHeadmrireason().hashCode());
        result = prime * result + ((getIntell() == null) ? 0 : getIntell().hashCode());
        result = prime * result + ((getColorbody() == null) ? 0 : getColorbody().hashCode());
        result = prime * result + ((getBloodwater() == null) ? 0 : getBloodwater().hashCode());
        result = prime * result + ((getCheck() == null) ? 0 : getCheck().hashCode());
        result = prime * result + ((getSupersession() == null) ? 0 : getSupersession().hashCode());
        result = prime * result + ((getSsreason() == null) ? 0 : getSsreason().hashCode());
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
        sb.append(", pic=").append(pic);
        sb.append(", headpic=").append(headpic);
        sb.append(", headmri=").append(headmri);
        sb.append(", headmrireason=").append(headmrireason);
        sb.append(", intell=").append(intell);
        sb.append(", colorbody=").append(colorbody);
        sb.append(", bloodwater=").append(bloodwater);
        sb.append(", check=").append(check);
        sb.append(", supersession=").append(supersession);
        sb.append(", ssreason=").append(ssreason);
        sb.append(", other=").append(other);
        sb.append(", otherreason=").append(otherreason);
        sb.append(", childId=").append(childId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}