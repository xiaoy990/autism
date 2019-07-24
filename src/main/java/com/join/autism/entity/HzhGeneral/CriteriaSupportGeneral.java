package com.join.autism.entity.HzhGeneral;

public class CriteriaSupportGeneral{
    private Integer minAge;
    private Integer maxAge;

    private String minSurTime;
    private String maxSurTime;

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    public String getMinSurTime() {
        return minSurTime;
    }

    public void setMinSurTime(String minSurTime) {
        this.minSurTime = minSurTime;
    }

    public String getMaxSurTime() {
        return maxSurTime;
    }

    public void setMaxSurTime(String maxSurTime) {
        this.maxSurTime = maxSurTime;
    }


    @Override
    public String toString() {
        return "CriteriaSupportGeneral{" +
                "minAge=" + minAge +
                ", maxAge=" + maxAge +
                ", minSurTime='" + minSurTime + '\'' +
                ", maxSurTime='" + maxSurTime + '\'' +
                '}';
    }
}
