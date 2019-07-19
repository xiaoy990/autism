package com.join.autism.entity.HzhIllnerssed;

import java.io.Serializable;

/**
 * hzh_illnerssed
 * @author 
 */
public class HzhIllnerssed implements Serializable {
    private Integer id;

    private String tell;

    private String first;

    private String symptom;

    private String status;

    private String otherstatus;

    private String reason;

    private String otherreason;

    private String sick;

    private String rate;

    private String time;

    private String firstgo;

    private String otherfirstgo;

    private String old;

    private String oldreason;

    private String total;

    private String totalreason;

    private String follow;

    private String followreason;

    private String happen;

    private String happenreason;

    private Integer count;

    private Integer childId;

    private Integer firstMonth;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOtherstatus() {
        return otherstatus;
    }

    public void setOtherstatus(String otherstatus) {
        this.otherstatus = otherstatus;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getOtherreason() {
        return otherreason;
    }

    public void setOtherreason(String otherreason) {
        this.otherreason = otherreason;
    }

    public String getSick() {
        return sick;
    }

    public void setSick(String sick) {
        this.sick = sick;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFirstgo() {
        return firstgo;
    }

    public void setFirstgo(String firstgo) {
        this.firstgo = firstgo;
    }

    public String getOtherfirstgo() {
        return otherfirstgo;
    }

    public void setOtherfirstgo(String otherfirstgo) {
        this.otherfirstgo = otherfirstgo;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }

    public String getOldreason() {
        return oldreason;
    }

    public void setOldreason(String oldreason) {
        this.oldreason = oldreason;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotalreason() {
        return totalreason;
    }

    public void setTotalreason(String totalreason) {
        this.totalreason = totalreason;
    }

    public String getFollow() {
        return follow;
    }

    public void setFollow(String follow) {
        this.follow = follow;
    }

    public String getFollowreason() {
        return followreason;
    }

    public void setFollowreason(String followreason) {
        this.followreason = followreason;
    }

    public String getHappen() {
        return happen;
    }

    public void setHappen(String happen) {
        this.happen = happen;
    }

    public String getHappenreason() {
        return happenreason;
    }

    public void setHappenreason(String happenreason) {
        this.happenreason = happenreason;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getChildId() {
        return childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    public Integer getFirstMonth() {
        return firstMonth;
    }

    public void setFirstMonth(Integer firstMonth) {
        this.firstMonth = firstMonth;
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
        HzhIllnerssed other = (HzhIllnerssed) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTell() == null ? other.getTell() == null : this.getTell().equals(other.getTell()))
            && (this.getFirst() == null ? other.getFirst() == null : this.getFirst().equals(other.getFirst()))
            && (this.getSymptom() == null ? other.getSymptom() == null : this.getSymptom().equals(other.getSymptom()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getOtherstatus() == null ? other.getOtherstatus() == null : this.getOtherstatus().equals(other.getOtherstatus()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
            && (this.getOtherreason() == null ? other.getOtherreason() == null : this.getOtherreason().equals(other.getOtherreason()))
            && (this.getSick() == null ? other.getSick() == null : this.getSick().equals(other.getSick()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getFirstgo() == null ? other.getFirstgo() == null : this.getFirstgo().equals(other.getFirstgo()))
            && (this.getOtherfirstgo() == null ? other.getOtherfirstgo() == null : this.getOtherfirstgo().equals(other.getOtherfirstgo()))
            && (this.getOld() == null ? other.getOld() == null : this.getOld().equals(other.getOld()))
            && (this.getOldreason() == null ? other.getOldreason() == null : this.getOldreason().equals(other.getOldreason()))
            && (this.getTotal() == null ? other.getTotal() == null : this.getTotal().equals(other.getTotal()))
            && (this.getTotalreason() == null ? other.getTotalreason() == null : this.getTotalreason().equals(other.getTotalreason()))
            && (this.getFollow() == null ? other.getFollow() == null : this.getFollow().equals(other.getFollow()))
            && (this.getFollowreason() == null ? other.getFollowreason() == null : this.getFollowreason().equals(other.getFollowreason()))
            && (this.getHappen() == null ? other.getHappen() == null : this.getHappen().equals(other.getHappen()))
            && (this.getHappenreason() == null ? other.getHappenreason() == null : this.getHappenreason().equals(other.getHappenreason()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getChildId() == null ? other.getChildId() == null : this.getChildId().equals(other.getChildId()))
            && (this.getFirstMonth() == null ? other.getFirstMonth() == null : this.getFirstMonth().equals(other.getFirstMonth()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTell() == null) ? 0 : getTell().hashCode());
        result = prime * result + ((getFirst() == null) ? 0 : getFirst().hashCode());
        result = prime * result + ((getSymptom() == null) ? 0 : getSymptom().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getOtherstatus() == null) ? 0 : getOtherstatus().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        result = prime * result + ((getOtherreason() == null) ? 0 : getOtherreason().hashCode());
        result = prime * result + ((getSick() == null) ? 0 : getSick().hashCode());
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getFirstgo() == null) ? 0 : getFirstgo().hashCode());
        result = prime * result + ((getOtherfirstgo() == null) ? 0 : getOtherfirstgo().hashCode());
        result = prime * result + ((getOld() == null) ? 0 : getOld().hashCode());
        result = prime * result + ((getOldreason() == null) ? 0 : getOldreason().hashCode());
        result = prime * result + ((getTotal() == null) ? 0 : getTotal().hashCode());
        result = prime * result + ((getTotalreason() == null) ? 0 : getTotalreason().hashCode());
        result = prime * result + ((getFollow() == null) ? 0 : getFollow().hashCode());
        result = prime * result + ((getFollowreason() == null) ? 0 : getFollowreason().hashCode());
        result = prime * result + ((getHappen() == null) ? 0 : getHappen().hashCode());
        result = prime * result + ((getHappenreason() == null) ? 0 : getHappenreason().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getChildId() == null) ? 0 : getChildId().hashCode());
        result = prime * result + ((getFirstMonth() == null) ? 0 : getFirstMonth().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tell=").append(tell);
        sb.append(", first=").append(first);
        sb.append(", symptom=").append(symptom);
        sb.append(", status=").append(status);
        sb.append(", otherstatus=").append(otherstatus);
        sb.append(", reason=").append(reason);
        sb.append(", otherreason=").append(otherreason);
        sb.append(", sick=").append(sick);
        sb.append(", rate=").append(rate);
        sb.append(", time=").append(time);
        sb.append(", firstgo=").append(firstgo);
        sb.append(", otherfirstgo=").append(otherfirstgo);
        sb.append(", old=").append(old);
        sb.append(", oldreason=").append(oldreason);
        sb.append(", total=").append(total);
        sb.append(", totalreason=").append(totalreason);
        sb.append(", follow=").append(follow);
        sb.append(", followreason=").append(followreason);
        sb.append(", happen=").append(happen);
        sb.append(", happenreason=").append(happenreason);
        sb.append(", count=").append(count);
        sb.append(", childId=").append(childId);
        sb.append(", firstMonth=").append(firstMonth);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}