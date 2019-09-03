package com.join.autism.entity.HzhBirth;

import java.io.Serializable;

/**
 * hzh_birth
 * @author 
 */
public class HzhBirth implements Serializable {
    private Integer id;

    private Integer birth;

    private String birthreason = "";

    private String kg = "";

    private Integer score;

    private String scorereason = "";

    private Integer gogo;

    private String gogoreason = "";

    private Integer assist;

    private String assistreason = "";

    private String compl = "";

    private String complreason = "";

    private Integer mombra;

    private String mombrareason = "";

    private String bradiff = "";

    private String bradiffreason = "";

    private Integer grow;

    private String growreason = "";

    private String growslowreason = "";

    private Integer monthup;

    private Integer monthroll;

    private Integer monthsit;

    private Integer monthclimb;

    private Integer monthgo;

    private String speakreason = "";

    private Integer vitamd;

    private String vitamdreason = "";

    private Integer childId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBirth() {
        return birth;
    }

    public void setBirth(Integer birth) {
        this.birth = birth;
    }

    public String getBirthreason() {
        return birthreason;
    }

    public void setBirthreason(String birthreason) {
        this.birthreason = birthreason;
    }

    public String getKg() {
        return kg;
    }

    public void setKg(String kg) {
        this.kg = kg;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getScorereason() {
        return scorereason;
    }

    public void setScorereason(String scorereason) {
        this.scorereason = scorereason;
    }

    public Integer getGogo() {
        return gogo;
    }

    public void setGogo(Integer gogo) {
        this.gogo = gogo;
    }

    public String getGogoreason() {
        return gogoreason;
    }

    public void setGogoreason(String gogoreason) {
        this.gogoreason = gogoreason;
    }

    public Integer getAssist() {
        return assist;
    }

    public void setAssist(Integer assist) {
        this.assist = assist;
    }

    public String getAssistreason() {
        return assistreason;
    }

    public void setAssistreason(String assistreason) {
        this.assistreason = assistreason;
    }

    public String getCompl() {
        return compl;
    }

    public void setCompl(String compl) {
        this.compl = compl;
    }

    public String getComplreason() {
        return complreason;
    }

    public void setComplreason(String complreason) {
        this.complreason = complreason;
    }

    public Integer getMombra() {
        return mombra;
    }

    public void setMombra(Integer mombra) {
        this.mombra = mombra;
    }

    public String getMombrareason() {
        return mombrareason;
    }

    public void setMombrareason(String mombrareason) {
        this.mombrareason = mombrareason;
    }

    public String getBradiff() {
        return bradiff;
    }

    public void setBradiff(String bradiff) {
        this.bradiff = bradiff;
    }

    public String getBradiffreason() {
        return bradiffreason;
    }

    public void setBradiffreason(String bradiffreason) {
        this.bradiffreason = bradiffreason;
    }

    public Integer getGrow() {
        return grow;
    }

    public void setGrow(Integer grow) {
        this.grow = grow;
    }

    public String getGrowreason() {
        return growreason;
    }

    public void setGrowreason(String growreason) {
        this.growreason = growreason;
    }

    public String getGrowslowreason() {
        return growslowreason;
    }

    public void setGrowslowreason(String growslowreason) {
        this.growslowreason = growslowreason;
    }

    public Integer getMonthup() {
        return monthup;
    }

    public void setMonthup(Integer monthup) {
        this.monthup = monthup;
    }

    public Integer getMonthroll() {
        return monthroll;
    }

    public void setMonthroll(Integer monthroll) {
        this.monthroll = monthroll;
    }

    public Integer getMonthsit() {
        return monthsit;
    }

    public void setMonthsit(Integer monthsit) {
        this.monthsit = monthsit;
    }

    public Integer getMonthclimb() {
        return monthclimb;
    }

    public void setMonthclimb(Integer monthclimb) {
        this.monthclimb = monthclimb;
    }

    public Integer getMonthgo() {
        return monthgo;
    }

    public void setMonthgo(Integer monthgo) {
        this.monthgo = monthgo;
    }

    public String getSpeakreason() {
        return speakreason;
    }

    public void setSpeakreason(String speakreason) {
        this.speakreason = speakreason;
    }

    public Integer getVitamd() {
        return vitamd;
    }

    public void setVitamd(Integer vitamd) {
        this.vitamd = vitamd;
    }

    public String getVitamdreason() {
        return vitamdreason;
    }

    public void setVitamdreason(String vitamdreason) {
        this.vitamdreason = vitamdreason;
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
        HzhBirth other = (HzhBirth) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBirth() == null ? other.getBirth() == null : this.getBirth().equals(other.getBirth()))
            && (this.getBirthreason() == null ? other.getBirthreason() == null : this.getBirthreason().equals(other.getBirthreason()))
            && (this.getKg() == null ? other.getKg() == null : this.getKg().equals(other.getKg()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getScorereason() == null ? other.getScorereason() == null : this.getScorereason().equals(other.getScorereason()))
            && (this.getGogo() == null ? other.getGogo() == null : this.getGogo().equals(other.getGogo()))
            && (this.getGogoreason() == null ? other.getGogoreason() == null : this.getGogoreason().equals(other.getGogoreason()))
            && (this.getAssist() == null ? other.getAssist() == null : this.getAssist().equals(other.getAssist()))
            && (this.getAssistreason() == null ? other.getAssistreason() == null : this.getAssistreason().equals(other.getAssistreason()))
            && (this.getCompl() == null ? other.getCompl() == null : this.getCompl().equals(other.getCompl()))
            && (this.getComplreason() == null ? other.getComplreason() == null : this.getComplreason().equals(other.getComplreason()))
            && (this.getMombra() == null ? other.getMombra() == null : this.getMombra().equals(other.getMombra()))
            && (this.getMombrareason() == null ? other.getMombrareason() == null : this.getMombrareason().equals(other.getMombrareason()))
            && (this.getBradiff() == null ? other.getBradiff() == null : this.getBradiff().equals(other.getBradiff()))
            && (this.getBradiffreason() == null ? other.getBradiffreason() == null : this.getBradiffreason().equals(other.getBradiffreason()))
            && (this.getGrow() == null ? other.getGrow() == null : this.getGrow().equals(other.getGrow()))
            && (this.getGrowreason() == null ? other.getGrowreason() == null : this.getGrowreason().equals(other.getGrowreason()))
            && (this.getGrowslowreason() == null ? other.getGrowslowreason() == null : this.getGrowslowreason().equals(other.getGrowslowreason()))
            && (this.getMonthup() == null ? other.getMonthup() == null : this.getMonthup().equals(other.getMonthup()))
            && (this.getMonthroll() == null ? other.getMonthroll() == null : this.getMonthroll().equals(other.getMonthroll()))
            && (this.getMonthsit() == null ? other.getMonthsit() == null : this.getMonthsit().equals(other.getMonthsit()))
            && (this.getMonthclimb() == null ? other.getMonthclimb() == null : this.getMonthclimb().equals(other.getMonthclimb()))
            && (this.getMonthgo() == null ? other.getMonthgo() == null : this.getMonthgo().equals(other.getMonthgo()))
            && (this.getSpeakreason() == null ? other.getSpeakreason() == null : this.getSpeakreason().equals(other.getSpeakreason()))
            && (this.getVitamd() == null ? other.getVitamd() == null : this.getVitamd().equals(other.getVitamd()))
            && (this.getVitamdreason() == null ? other.getVitamdreason() == null : this.getVitamdreason().equals(other.getVitamdreason()))
            && (this.getChildId() == null ? other.getChildId() == null : this.getChildId().equals(other.getChildId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBirth() == null) ? 0 : getBirth().hashCode());
        result = prime * result + ((getBirthreason() == null) ? 0 : getBirthreason().hashCode());
        result = prime * result + ((getKg() == null) ? 0 : getKg().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getScorereason() == null) ? 0 : getScorereason().hashCode());
        result = prime * result + ((getGogo() == null) ? 0 : getGogo().hashCode());
        result = prime * result + ((getGogoreason() == null) ? 0 : getGogoreason().hashCode());
        result = prime * result + ((getAssist() == null) ? 0 : getAssist().hashCode());
        result = prime * result + ((getAssistreason() == null) ? 0 : getAssistreason().hashCode());
        result = prime * result + ((getCompl() == null) ? 0 : getCompl().hashCode());
        result = prime * result + ((getComplreason() == null) ? 0 : getComplreason().hashCode());
        result = prime * result + ((getMombra() == null) ? 0 : getMombra().hashCode());
        result = prime * result + ((getMombrareason() == null) ? 0 : getMombrareason().hashCode());
        result = prime * result + ((getBradiff() == null) ? 0 : getBradiff().hashCode());
        result = prime * result + ((getBradiffreason() == null) ? 0 : getBradiffreason().hashCode());
        result = prime * result + ((getGrow() == null) ? 0 : getGrow().hashCode());
        result = prime * result + ((getGrowreason() == null) ? 0 : getGrowreason().hashCode());
        result = prime * result + ((getGrowslowreason() == null) ? 0 : getGrowslowreason().hashCode());
        result = prime * result + ((getMonthup() == null) ? 0 : getMonthup().hashCode());
        result = prime * result + ((getMonthroll() == null) ? 0 : getMonthroll().hashCode());
        result = prime * result + ((getMonthsit() == null) ? 0 : getMonthsit().hashCode());
        result = prime * result + ((getMonthclimb() == null) ? 0 : getMonthclimb().hashCode());
        result = prime * result + ((getMonthgo() == null) ? 0 : getMonthgo().hashCode());
        result = prime * result + ((getSpeakreason() == null) ? 0 : getSpeakreason().hashCode());
        result = prime * result + ((getVitamd() == null) ? 0 : getVitamd().hashCode());
        result = prime * result + ((getVitamdreason() == null) ? 0 : getVitamdreason().hashCode());
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
        sb.append(", birth=").append(birth);
        sb.append(", birthreason=").append(birthreason);
        sb.append(", kg=").append(kg);
        sb.append(", score=").append(score);
        sb.append(", scorereason=").append(scorereason);
        sb.append(", gogo=").append(gogo);
        sb.append(", gogoreason=").append(gogoreason);
        sb.append(", assist=").append(assist);
        sb.append(", assistreason=").append(assistreason);
        sb.append(", compl=").append(compl);
        sb.append(", complreason=").append(complreason);
        sb.append(", mombra=").append(mombra);
        sb.append(", mombrareason=").append(mombrareason);
        sb.append(", bradiff=").append(bradiff);
        sb.append(", bradiffreason=").append(bradiffreason);
        sb.append(", grow=").append(grow);
        sb.append(", growreason=").append(growreason);
        sb.append(", growslowreason=").append(growslowreason);
        sb.append(", monthup=").append(monthup);
        sb.append(", monthroll=").append(monthroll);
        sb.append(", monthsit=").append(monthsit);
        sb.append(", monthclimb=").append(monthclimb);
        sb.append(", monthgo=").append(monthgo);
        sb.append(", speakreason=").append(speakreason);
        sb.append(", vitamd=").append(vitamd);
        sb.append(", vitamdreason=").append(vitamdreason);
        sb.append(", childId=").append(childId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}