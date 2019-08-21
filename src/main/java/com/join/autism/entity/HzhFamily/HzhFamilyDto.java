package com.join.autism.entity.HzhFamily;

public class HzhFamilyDto {
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

    private String name;

    private String sicknum;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSicknum() {
        return sicknum;
    }

    public void setSicknum(String sicknum) {
        this.sicknum = sicknum;
    }

    @Override
    public String toString() {
        return "HzhFamilyDto{" +
                "id=" + id +
                ", motherage=" + motherage +
                ", fatherage=" + fatherage +
                ", momculture='" + momculture + '\'' +
                ", dadculture='" + dadculture + '\'' +
                ", mompross='" + mompross + '\'' +
                ", dadpross='" + dadpross + '\'' +
                ", childId=" + childId +
                ", marriage=" + marriage +
                ", marriageDesc='" + marriageDesc + '\'' +
                ", much='" + much + '\'' +
                ", name='" + name + '\'' +
                ", sicknum='" + sicknum + '\'' +
                '}';
    }
}
