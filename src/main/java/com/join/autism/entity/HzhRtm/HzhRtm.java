package com.join.autism.entity.HzhRtm;

import java.io.Serializable;

/**
 * hzh_rtm
 * @author 
 */
public class HzhRtm implements Serializable {
    private Integer id;

    private Integer childId;

    private String isLook;

    private String isHearing;

    private String isGame;

    private String isClimbing;

    private String isFinger;

    private String isHelp;

    private String isInterest;

    private String isChildren;

    private String isParentsLook;

    private String isResponse;

    private String isSmileResponse;

    private String isNoise;

    private String isGo;

    private String isEye;

    private String isImitate;

    private String isSearch;

    private String isAttract;

    private String isUnderstand;

    private String isReaction;

    private String isMovement;

    private String addtime;

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

    public String getIsLook() {
        return isLook;
    }

    public void setIsLook(String isLook) {
        this.isLook = isLook;
    }

    public String getIsHearing() {
        return isHearing;
    }

    public void setIsHearing(String isHearing) {
        this.isHearing = isHearing;
    }

    public String getIsGame() {
        return isGame;
    }

    public void setIsGame(String isGame) {
        this.isGame = isGame;
    }

    public String getIsClimbing() {
        return isClimbing;
    }

    public void setIsClimbing(String isClimbing) {
        this.isClimbing = isClimbing;
    }

    public String getIsFinger() {
        return isFinger;
    }

    public void setIsFinger(String isFinger) {
        this.isFinger = isFinger;
    }

    public String getIsHelp() {
        return isHelp;
    }

    public void setIsHelp(String isHelp) {
        this.isHelp = isHelp;
    }

    public String getIsInterest() {
        return isInterest;
    }

    public void setIsInterest(String isInterest) {
        this.isInterest = isInterest;
    }

    public String getIsChildren() {
        return isChildren;
    }

    public void setIsChildren(String isChildren) {
        this.isChildren = isChildren;
    }

    public String getIsParentsLook() {
        return isParentsLook;
    }

    public void setIsParentsLook(String isParentsLook) {
        this.isParentsLook = isParentsLook;
    }

    public String getIsResponse() {
        return isResponse;
    }

    public void setIsResponse(String isResponse) {
        this.isResponse = isResponse;
    }

    public String getIsSmileResponse() {
        return isSmileResponse;
    }

    public void setIsSmileResponse(String isSmileResponse) {
        this.isSmileResponse = isSmileResponse;
    }

    public String getIsNoise() {
        return isNoise;
    }

    public void setIsNoise(String isNoise) {
        this.isNoise = isNoise;
    }

    public String getIsGo() {
        return isGo;
    }

    public void setIsGo(String isGo) {
        this.isGo = isGo;
    }

    public String getIsEye() {
        return isEye;
    }

    public void setIsEye(String isEye) {
        this.isEye = isEye;
    }

    public String getIsImitate() {
        return isImitate;
    }

    public void setIsImitate(String isImitate) {
        this.isImitate = isImitate;
    }

    public String getIsSearch() {
        return isSearch;
    }

    public void setIsSearch(String isSearch) {
        this.isSearch = isSearch;
    }

    public String getIsAttract() {
        return isAttract;
    }

    public void setIsAttract(String isAttract) {
        this.isAttract = isAttract;
    }

    public String getIsUnderstand() {
        return isUnderstand;
    }

    public void setIsUnderstand(String isUnderstand) {
        this.isUnderstand = isUnderstand;
    }

    public String getIsReaction() {
        return isReaction;
    }

    public void setIsReaction(String isReaction) {
        this.isReaction = isReaction;
    }

    public String getIsMovement() {
        return isMovement;
    }

    public void setIsMovement(String isMovement) {
        this.isMovement = isMovement;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
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
        HzhRtm other = (HzhRtm) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getChildId() == null ? other.getChildId() == null : this.getChildId().equals(other.getChildId()))
            && (this.getIsLook() == null ? other.getIsLook() == null : this.getIsLook().equals(other.getIsLook()))
            && (this.getIsHearing() == null ? other.getIsHearing() == null : this.getIsHearing().equals(other.getIsHearing()))
            && (this.getIsGame() == null ? other.getIsGame() == null : this.getIsGame().equals(other.getIsGame()))
            && (this.getIsClimbing() == null ? other.getIsClimbing() == null : this.getIsClimbing().equals(other.getIsClimbing()))
            && (this.getIsFinger() == null ? other.getIsFinger() == null : this.getIsFinger().equals(other.getIsFinger()))
            && (this.getIsHelp() == null ? other.getIsHelp() == null : this.getIsHelp().equals(other.getIsHelp()))
            && (this.getIsInterest() == null ? other.getIsInterest() == null : this.getIsInterest().equals(other.getIsInterest()))
            && (this.getIsChildren() == null ? other.getIsChildren() == null : this.getIsChildren().equals(other.getIsChildren()))
            && (this.getIsParentsLook() == null ? other.getIsParentsLook() == null : this.getIsParentsLook().equals(other.getIsParentsLook()))
            && (this.getIsResponse() == null ? other.getIsResponse() == null : this.getIsResponse().equals(other.getIsResponse()))
            && (this.getIsSmileResponse() == null ? other.getIsSmileResponse() == null : this.getIsSmileResponse().equals(other.getIsSmileResponse()))
            && (this.getIsNoise() == null ? other.getIsNoise() == null : this.getIsNoise().equals(other.getIsNoise()))
            && (this.getIsGo() == null ? other.getIsGo() == null : this.getIsGo().equals(other.getIsGo()))
            && (this.getIsEye() == null ? other.getIsEye() == null : this.getIsEye().equals(other.getIsEye()))
            && (this.getIsImitate() == null ? other.getIsImitate() == null : this.getIsImitate().equals(other.getIsImitate()))
            && (this.getIsSearch() == null ? other.getIsSearch() == null : this.getIsSearch().equals(other.getIsSearch()))
            && (this.getIsAttract() == null ? other.getIsAttract() == null : this.getIsAttract().equals(other.getIsAttract()))
            && (this.getIsUnderstand() == null ? other.getIsUnderstand() == null : this.getIsUnderstand().equals(other.getIsUnderstand()))
            && (this.getIsReaction() == null ? other.getIsReaction() == null : this.getIsReaction().equals(other.getIsReaction()))
            && (this.getIsMovement() == null ? other.getIsMovement() == null : this.getIsMovement().equals(other.getIsMovement()))
            && (this.getAddtime() == null ? other.getAddtime() == null : this.getAddtime().equals(other.getAddtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getChildId() == null) ? 0 : getChildId().hashCode());
        result = prime * result + ((getIsLook() == null) ? 0 : getIsLook().hashCode());
        result = prime * result + ((getIsHearing() == null) ? 0 : getIsHearing().hashCode());
        result = prime * result + ((getIsGame() == null) ? 0 : getIsGame().hashCode());
        result = prime * result + ((getIsClimbing() == null) ? 0 : getIsClimbing().hashCode());
        result = prime * result + ((getIsFinger() == null) ? 0 : getIsFinger().hashCode());
        result = prime * result + ((getIsHelp() == null) ? 0 : getIsHelp().hashCode());
        result = prime * result + ((getIsInterest() == null) ? 0 : getIsInterest().hashCode());
        result = prime * result + ((getIsChildren() == null) ? 0 : getIsChildren().hashCode());
        result = prime * result + ((getIsParentsLook() == null) ? 0 : getIsParentsLook().hashCode());
        result = prime * result + ((getIsResponse() == null) ? 0 : getIsResponse().hashCode());
        result = prime * result + ((getIsSmileResponse() == null) ? 0 : getIsSmileResponse().hashCode());
        result = prime * result + ((getIsNoise() == null) ? 0 : getIsNoise().hashCode());
        result = prime * result + ((getIsGo() == null) ? 0 : getIsGo().hashCode());
        result = prime * result + ((getIsEye() == null) ? 0 : getIsEye().hashCode());
        result = prime * result + ((getIsImitate() == null) ? 0 : getIsImitate().hashCode());
        result = prime * result + ((getIsSearch() == null) ? 0 : getIsSearch().hashCode());
        result = prime * result + ((getIsAttract() == null) ? 0 : getIsAttract().hashCode());
        result = prime * result + ((getIsUnderstand() == null) ? 0 : getIsUnderstand().hashCode());
        result = prime * result + ((getIsReaction() == null) ? 0 : getIsReaction().hashCode());
        result = prime * result + ((getIsMovement() == null) ? 0 : getIsMovement().hashCode());
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
        sb.append(", isLook=").append(isLook);
        sb.append(", isHearing=").append(isHearing);
        sb.append(", isGame=").append(isGame);
        sb.append(", isClimbing=").append(isClimbing);
        sb.append(", isFinger=").append(isFinger);
        sb.append(", isHelp=").append(isHelp);
        sb.append(", isInterest=").append(isInterest);
        sb.append(", isChildren=").append(isChildren);
        sb.append(", isParentsLook=").append(isParentsLook);
        sb.append(", isResponse=").append(isResponse);
        sb.append(", isSmileResponse=").append(isSmileResponse);
        sb.append(", isNoise=").append(isNoise);
        sb.append(", isGo=").append(isGo);
        sb.append(", isEye=").append(isEye);
        sb.append(", isImitate=").append(isImitate);
        sb.append(", isSearch=").append(isSearch);
        sb.append(", isAttract=").append(isAttract);
        sb.append(", isUnderstand=").append(isUnderstand);
        sb.append(", isReaction=").append(isReaction);
        sb.append(", isMovement=").append(isMovement);
        sb.append(", addtime=").append(addtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}