package com.join.autism.entity.HzhNerve;

public class HzhNerveDto {
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

    private String name;

    private String sicknum;

    public String getSicknum() {
        return sicknum;
    }

    public void setSicknum(String sicknum) {
        this.sicknum = sicknum;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HzhNerveDto{" +
                "id=" + id +
                ", yesNo=" + yesNo +
                ", epilepsy=" + epilepsy +
                ", epilepsyreason='" + epilepsyreason + '\'' +
                ", tension=" + tension +
                ", tensionreason='" + tensionreason + '\'' +
                ", imbalance=" + imbalance +
                ", imbalancereason='" + imbalancereason + '\'' +
                ", gait=" + gait +
                ", gaitreason='" + gaitreason + '\'' +
                ", lncrease=" + lncrease +
                ", lncreasereason='" + lncreasereason + '\'' +
                ", weaken=" + weaken +
                ", weakenreason='" + weakenreason + '\'' +
                ", other=" + other +
                ", otherreason='" + otherreason + '\'' +
                ", childId=" + childId +
                ", name='" + name + '\'' +
                ", sicknum='" + sicknum + '\'' +
                '}';
    }
}
