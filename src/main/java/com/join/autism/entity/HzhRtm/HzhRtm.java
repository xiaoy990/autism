package com.join.autism.entity.HzhRtm;

import java.io.Serializable;

/**
 * hzh_rtm
 * @author 
 */
public class HzhRtm implements Serializable {
    private Integer id;

    private Integer childId;

    private Integer isLook;

    private Integer isHearing;

    private Integer isGame;

    private Integer isClimbing;

    private Integer isFinger;

    private Integer isHelp;

    private Integer isInterest;

    private Integer isChildren;

    private Integer isParentsLook;

    private Integer isResponse;

    private Integer isSmileResponse;

    private Integer isNoise;

    private Integer isGo;

    private Integer isEye;

    private Integer isImitate;

    private Integer isSearch;

    private Integer isAttract;

    private Integer isUnderstand;

    private Integer isReaction;

    private Integer isMovement;

    private Integer addtime;

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

    public Integer getIsLook() {
        return isLook;
    }

    public void setIsLook(Integer isLook) {
        this.isLook = isLook;
    }

    public Integer getIsHearing() {
        return isHearing;
    }

    public void setIsHearing(Integer isHearing) {
        this.isHearing = isHearing;
    }

    public Integer getIsGame() {
        return isGame;
    }

    public void setIsGame(Integer isGame) {
        this.isGame = isGame;
    }

    public Integer getIsClimbing() {
        return isClimbing;
    }

    public void setIsClimbing(Integer isClimbing) {
        this.isClimbing = isClimbing;
    }

    public Integer getIsFinger() {
        return isFinger;
    }

    public void setIsFinger(Integer isFinger) {
        this.isFinger = isFinger;
    }

    public Integer getIsHelp() {
        return isHelp;
    }

    public void setIsHelp(Integer isHelp) {
        this.isHelp = isHelp;
    }

    public Integer getIsInterest() {
        return isInterest;
    }

    public void setIsInterest(Integer isInterest) {
        this.isInterest = isInterest;
    }

    public Integer getIsChildren() {
        return isChildren;
    }

    public void setIsChildren(Integer isChildren) {
        this.isChildren = isChildren;
    }

    public Integer getIsParentsLook() {
        return isParentsLook;
    }

    public void setIsParentsLook(Integer isParentsLook) {
        this.isParentsLook = isParentsLook;
    }

    public Integer getIsResponse() {
        return isResponse;
    }

    public void setIsResponse(Integer isResponse) {
        this.isResponse = isResponse;
    }

    public Integer getIsSmileResponse() {
        return isSmileResponse;
    }

    public void setIsSmileResponse(Integer isSmileResponse) {
        this.isSmileResponse = isSmileResponse;
    }

    public Integer getIsNoise() {
        return isNoise;
    }

    public void setIsNoise(Integer isNoise) {
        this.isNoise = isNoise;
    }

    public Integer getIsGo() {
        return isGo;
    }

    public void setIsGo(Integer isGo) {
        this.isGo = isGo;
    }

    public Integer getIsEye() {
        return isEye;
    }

    public void setIsEye(Integer isEye) {
        this.isEye = isEye;
    }

    public Integer getIsImitate() {
        return isImitate;
    }

    public void setIsImitate(Integer isImitate) {
        this.isImitate = isImitate;
    }

    public Integer getIsSearch() {
        return isSearch;
    }

    public void setIsSearch(Integer isSearch) {
        this.isSearch = isSearch;
    }

    public Integer getIsAttract() {
        return isAttract;
    }

    public void setIsAttract(Integer isAttract) {
        this.isAttract = isAttract;
    }

    public Integer getIsUnderstand() {
        return isUnderstand;
    }

    public void setIsUnderstand(Integer isUnderstand) {
        this.isUnderstand = isUnderstand;
    }

    public Integer getIsReaction() {
        return isReaction;
    }

    public void setIsReaction(Integer isReaction) {
        this.isReaction = isReaction;
    }

    public Integer getIsMovement() {
        return isMovement;
    }

    public void setIsMovement(Integer isMovement) {
        this.isMovement = isMovement;
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
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