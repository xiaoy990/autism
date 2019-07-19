package com.join.autism.entity.HzhTreat;

import java.io.Serializable;

/**
 * hzh_treat
 * @author 
 */
public class HzhTreat implements Serializable {
    private Integer id;

    private String firstdrug;

    private String firstdrugreason;

    private String anddrug;

    private String anddrugreason;

    private String othertreat;

    private String treatreason;

    private String firsttime;

    private String treatreturn;

    private String firstdate;

    private Integer childId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstdrug() {
        return firstdrug;
    }

    public void setFirstdrug(String firstdrug) {
        this.firstdrug = firstdrug;
    }

    public String getFirstdrugreason() {
        return firstdrugreason;
    }

    public void setFirstdrugreason(String firstdrugreason) {
        this.firstdrugreason = firstdrugreason;
    }

    public String getAnddrug() {
        return anddrug;
    }

    public void setAnddrug(String anddrug) {
        this.anddrug = anddrug;
    }

    public String getAnddrugreason() {
        return anddrugreason;
    }

    public void setAnddrugreason(String anddrugreason) {
        this.anddrugreason = anddrugreason;
    }

    public String getOthertreat() {
        return othertreat;
    }

    public void setOthertreat(String othertreat) {
        this.othertreat = othertreat;
    }

    public String getTreatreason() {
        return treatreason;
    }

    public void setTreatreason(String treatreason) {
        this.treatreason = treatreason;
    }

    public String getFirsttime() {
        return firsttime;
    }

    public void setFirsttime(String firsttime) {
        this.firsttime = firsttime;
    }

    public String getTreatreturn() {
        return treatreturn;
    }

    public void setTreatreturn(String treatreturn) {
        this.treatreturn = treatreturn;
    }

    public String getFirstdate() {
        return firstdate;
    }

    public void setFirstdate(String firstdate) {
        this.firstdate = firstdate;
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
        HzhTreat other = (HzhTreat) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFirstdrug() == null ? other.getFirstdrug() == null : this.getFirstdrug().equals(other.getFirstdrug()))
            && (this.getFirstdrugreason() == null ? other.getFirstdrugreason() == null : this.getFirstdrugreason().equals(other.getFirstdrugreason()))
            && (this.getAnddrug() == null ? other.getAnddrug() == null : this.getAnddrug().equals(other.getAnddrug()))
            && (this.getAnddrugreason() == null ? other.getAnddrugreason() == null : this.getAnddrugreason().equals(other.getAnddrugreason()))
            && (this.getOthertreat() == null ? other.getOthertreat() == null : this.getOthertreat().equals(other.getOthertreat()))
            && (this.getTreatreason() == null ? other.getTreatreason() == null : this.getTreatreason().equals(other.getTreatreason()))
            && (this.getFirsttime() == null ? other.getFirsttime() == null : this.getFirsttime().equals(other.getFirsttime()))
            && (this.getTreatreturn() == null ? other.getTreatreturn() == null : this.getTreatreturn().equals(other.getTreatreturn()))
            && (this.getFirstdate() == null ? other.getFirstdate() == null : this.getFirstdate().equals(other.getFirstdate()))
            && (this.getChildId() == null ? other.getChildId() == null : this.getChildId().equals(other.getChildId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFirstdrug() == null) ? 0 : getFirstdrug().hashCode());
        result = prime * result + ((getFirstdrugreason() == null) ? 0 : getFirstdrugreason().hashCode());
        result = prime * result + ((getAnddrug() == null) ? 0 : getAnddrug().hashCode());
        result = prime * result + ((getAnddrugreason() == null) ? 0 : getAnddrugreason().hashCode());
        result = prime * result + ((getOthertreat() == null) ? 0 : getOthertreat().hashCode());
        result = prime * result + ((getTreatreason() == null) ? 0 : getTreatreason().hashCode());
        result = prime * result + ((getFirsttime() == null) ? 0 : getFirsttime().hashCode());
        result = prime * result + ((getTreatreturn() == null) ? 0 : getTreatreturn().hashCode());
        result = prime * result + ((getFirstdate() == null) ? 0 : getFirstdate().hashCode());
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
        sb.append(", firstdrug=").append(firstdrug);
        sb.append(", firstdrugreason=").append(firstdrugreason);
        sb.append(", anddrug=").append(anddrug);
        sb.append(", anddrugreason=").append(anddrugreason);
        sb.append(", othertreat=").append(othertreat);
        sb.append(", treatreason=").append(treatreason);
        sb.append(", firsttime=").append(firsttime);
        sb.append(", treatreturn=").append(treatreturn);
        sb.append(", firstdate=").append(firstdate);
        sb.append(", childId=").append(childId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}