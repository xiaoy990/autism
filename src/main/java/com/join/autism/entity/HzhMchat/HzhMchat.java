package com.join.autism.entity.HzhMchat;

import java.io.Serializable;

/**
 * hzh_mchat
 * @author 
 */
public class HzhMchat implements Serializable {
    private Integer id;

    private Integer question1;

    private Integer question2;

    private Integer question3;

    private Integer question4;

    private Integer question5;

    private Integer question6;

    private Integer question7;

    private Integer question8;

    private Integer question9;

    private Integer question10;

    private Integer question11;

    private Integer question12;

    private Integer question13;

    private Integer question14;

    private Integer question15;

    private Integer question16;

    private Integer question17;

    private Integer question18;

    private Integer question19;

    private Integer question20;

    private Integer childId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuestion1() {
        return question1;
    }

    public void setQuestion1(Integer question1) {
        this.question1 = question1;
    }

    public Integer getQuestion2() {
        return question2;
    }

    public void setQuestion2(Integer question2) {
        this.question2 = question2;
    }

    public Integer getQuestion3() {
        return question3;
    }

    public void setQuestion3(Integer question3) {
        this.question3 = question3;
    }

    public Integer getQuestion4() {
        return question4;
    }

    public void setQuestion4(Integer question4) {
        this.question4 = question4;
    }

    public Integer getQuestion5() {
        return question5;
    }

    public void setQuestion5(Integer question5) {
        this.question5 = question5;
    }

    public Integer getQuestion6() {
        return question6;
    }

    public void setQuestion6(Integer question6) {
        this.question6 = question6;
    }

    public Integer getQuestion7() {
        return question7;
    }

    public void setQuestion7(Integer question7) {
        this.question7 = question7;
    }

    public Integer getQuestion8() {
        return question8;
    }

    public void setQuestion8(Integer question8) {
        this.question8 = question8;
    }

    public Integer getQuestion9() {
        return question9;
    }

    public void setQuestion9(Integer question9) {
        this.question9 = question9;
    }

    public Integer getQuestion10() {
        return question10;
    }

    public void setQuestion10(Integer question10) {
        this.question10 = question10;
    }

    public Integer getQuestion11() {
        return question11;
    }

    public void setQuestion11(Integer question11) {
        this.question11 = question11;
    }

    public Integer getQuestion12() {
        return question12;
    }

    public void setQuestion12(Integer question12) {
        this.question12 = question12;
    }

    public Integer getQuestion13() {
        return question13;
    }

    public void setQuestion13(Integer question13) {
        this.question13 = question13;
    }

    public Integer getQuestion14() {
        return question14;
    }

    public void setQuestion14(Integer question14) {
        this.question14 = question14;
    }

    public Integer getQuestion15() {
        return question15;
    }

    public void setQuestion15(Integer question15) {
        this.question15 = question15;
    }

    public Integer getQuestion16() {
        return question16;
    }

    public void setQuestion16(Integer question16) {
        this.question16 = question16;
    }

    public Integer getQuestion17() {
        return question17;
    }

    public void setQuestion17(Integer question17) {
        this.question17 = question17;
    }

    public Integer getQuestion18() {
        return question18;
    }

    public void setQuestion18(Integer question18) {
        this.question18 = question18;
    }

    public Integer getQuestion19() {
        return question19;
    }

    public void setQuestion19(Integer question19) {
        this.question19 = question19;
    }

    public Integer getQuestion20() {
        return question20;
    }

    public void setQuestion20(Integer question20) {
        this.question20 = question20;
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
        HzhMchat other = (HzhMchat) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getQuestion1() == null ? other.getQuestion1() == null : this.getQuestion1().equals(other.getQuestion1()))
            && (this.getQuestion2() == null ? other.getQuestion2() == null : this.getQuestion2().equals(other.getQuestion2()))
            && (this.getQuestion3() == null ? other.getQuestion3() == null : this.getQuestion3().equals(other.getQuestion3()))
            && (this.getQuestion4() == null ? other.getQuestion4() == null : this.getQuestion4().equals(other.getQuestion4()))
            && (this.getQuestion5() == null ? other.getQuestion5() == null : this.getQuestion5().equals(other.getQuestion5()))
            && (this.getQuestion6() == null ? other.getQuestion6() == null : this.getQuestion6().equals(other.getQuestion6()))
            && (this.getQuestion7() == null ? other.getQuestion7() == null : this.getQuestion7().equals(other.getQuestion7()))
            && (this.getQuestion8() == null ? other.getQuestion8() == null : this.getQuestion8().equals(other.getQuestion8()))
            && (this.getQuestion9() == null ? other.getQuestion9() == null : this.getQuestion9().equals(other.getQuestion9()))
            && (this.getQuestion10() == null ? other.getQuestion10() == null : this.getQuestion10().equals(other.getQuestion10()))
            && (this.getQuestion11() == null ? other.getQuestion11() == null : this.getQuestion11().equals(other.getQuestion11()))
            && (this.getQuestion12() == null ? other.getQuestion12() == null : this.getQuestion12().equals(other.getQuestion12()))
            && (this.getQuestion13() == null ? other.getQuestion13() == null : this.getQuestion13().equals(other.getQuestion13()))
            && (this.getQuestion14() == null ? other.getQuestion14() == null : this.getQuestion14().equals(other.getQuestion14()))
            && (this.getQuestion15() == null ? other.getQuestion15() == null : this.getQuestion15().equals(other.getQuestion15()))
            && (this.getQuestion16() == null ? other.getQuestion16() == null : this.getQuestion16().equals(other.getQuestion16()))
            && (this.getQuestion17() == null ? other.getQuestion17() == null : this.getQuestion17().equals(other.getQuestion17()))
            && (this.getQuestion18() == null ? other.getQuestion18() == null : this.getQuestion18().equals(other.getQuestion18()))
            && (this.getQuestion19() == null ? other.getQuestion19() == null : this.getQuestion19().equals(other.getQuestion19()))
            && (this.getQuestion20() == null ? other.getQuestion20() == null : this.getQuestion20().equals(other.getQuestion20()))
            && (this.getChildId() == null ? other.getChildId() == null : this.getChildId().equals(other.getChildId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getQuestion1() == null) ? 0 : getQuestion1().hashCode());
        result = prime * result + ((getQuestion2() == null) ? 0 : getQuestion2().hashCode());
        result = prime * result + ((getQuestion3() == null) ? 0 : getQuestion3().hashCode());
        result = prime * result + ((getQuestion4() == null) ? 0 : getQuestion4().hashCode());
        result = prime * result + ((getQuestion5() == null) ? 0 : getQuestion5().hashCode());
        result = prime * result + ((getQuestion6() == null) ? 0 : getQuestion6().hashCode());
        result = prime * result + ((getQuestion7() == null) ? 0 : getQuestion7().hashCode());
        result = prime * result + ((getQuestion8() == null) ? 0 : getQuestion8().hashCode());
        result = prime * result + ((getQuestion9() == null) ? 0 : getQuestion9().hashCode());
        result = prime * result + ((getQuestion10() == null) ? 0 : getQuestion10().hashCode());
        result = prime * result + ((getQuestion11() == null) ? 0 : getQuestion11().hashCode());
        result = prime * result + ((getQuestion12() == null) ? 0 : getQuestion12().hashCode());
        result = prime * result + ((getQuestion13() == null) ? 0 : getQuestion13().hashCode());
        result = prime * result + ((getQuestion14() == null) ? 0 : getQuestion14().hashCode());
        result = prime * result + ((getQuestion15() == null) ? 0 : getQuestion15().hashCode());
        result = prime * result + ((getQuestion16() == null) ? 0 : getQuestion16().hashCode());
        result = prime * result + ((getQuestion17() == null) ? 0 : getQuestion17().hashCode());
        result = prime * result + ((getQuestion18() == null) ? 0 : getQuestion18().hashCode());
        result = prime * result + ((getQuestion19() == null) ? 0 : getQuestion19().hashCode());
        result = prime * result + ((getQuestion20() == null) ? 0 : getQuestion20().hashCode());
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
        sb.append(", question1=").append(question1);
        sb.append(", question2=").append(question2);
        sb.append(", question3=").append(question3);
        sb.append(", question4=").append(question4);
        sb.append(", question5=").append(question5);
        sb.append(", question6=").append(question6);
        sb.append(", question7=").append(question7);
        sb.append(", question8=").append(question8);
        sb.append(", question9=").append(question9);
        sb.append(", question10=").append(question10);
        sb.append(", question11=").append(question11);
        sb.append(", question12=").append(question12);
        sb.append(", question13=").append(question13);
        sb.append(", question14=").append(question14);
        sb.append(", question15=").append(question15);
        sb.append(", question16=").append(question16);
        sb.append(", question17=").append(question17);
        sb.append(", question18=").append(question18);
        sb.append(", question19=").append(question19);
        sb.append(", question20=").append(question20);
        sb.append(", childId=").append(childId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}