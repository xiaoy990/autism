package com.join.autism.entity.HzhNerve;

public class HzhNerveDto {
    private Integer id;

    private String yesNo;

    private String epilepsy;

    private String epilepsyreason = "";

    private String tension;

    private String tensionreason = "";

    private String imbalance;

    private String imbalancereason = "";

    private String gait;

    private String gaitreason = "";

    private String lncrease;

    private String lncreasereason = "";

    private String weaken;

    private String weakenreason = "";

    private String other;

    private String otherreason = "";

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

    public String getYesNo() {
        return yesNo;
    }

    public void setYesNo(String yesNo) {
        this.yesNo = yesNo;
    }

    public String getEpilepsy() {
        return epilepsy;
    }

    public void setEpilepsy(String epilepsy) {
        this.epilepsy = epilepsy;
    }

    public String getEpilepsyreason() {
        return epilepsyreason;
    }

    public void setEpilepsyreason(String epilepsyreason) {
        this.epilepsyreason = epilepsyreason;
    }

    public String getTension() {
        return tension;
    }

    public void setTension(String tension) {
        this.tension = tension;
    }

    public String getTensionreason() {
        return tensionreason;
    }

    public void setTensionreason(String tensionreason) {
        this.tensionreason = tensionreason;
    }

    public String getImbalance() {
        return imbalance;
    }

    public void setImbalance(String imbalance) {
        this.imbalance = imbalance;
    }

    public String getImbalancereason() {
        return imbalancereason;
    }

    public void setImbalancereason(String imbalancereason) {
        this.imbalancereason = imbalancereason;
    }

    public String getGait() {
        return gait;
    }

    public void setGait(String gait) {
        this.gait = gait;
    }

    public String getGaitreason() {
        return gaitreason;
    }

    public void setGaitreason(String gaitreason) {
        this.gaitreason = gaitreason;
    }

    public String getLncrease() {
        return lncrease;
    }

    public void setLncrease(String lncrease) {
        this.lncrease = lncrease;
    }

    public String getLncreasereason() {
        return lncreasereason;
    }

    public void setLncreasereason(String lncreasereason) {
        this.lncreasereason = lncreasereason;
    }

    public String getWeaken() {
        return weaken;
    }

    public void setWeaken(String weaken) {
        this.weaken = weaken;
    }

    public String getWeakenreason() {
        return weakenreason;
    }

    public void setWeakenreason(String weakenreason) {
        this.weakenreason = weakenreason;
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
