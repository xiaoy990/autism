package com.join.autism.entity.HzhEmotion;

import java.io.Serializable;

/**
 * question_emotion
 * @author 
 */
public class QuestionEmotion implements Serializable {
    private Integer id;

    /**
     * 问题
     */
    private String question;

    /**
     * A选项
     */
    private String answera;

    /**
     * B选项
     */
    private String answerb;

    /**
     * C选项
     */
    private String answerc;

    /**
     * D选项
     */
    private String answerd;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswera() {
        return answera;
    }

    public void setAnswera(String answera) {
        this.answera = answera;
    }

    public String getAnswerb() {
        return answerb;
    }

    public void setAnswerb(String answerb) {
        this.answerb = answerb;
    }

    public String getAnswerc() {
        return answerc;
    }

    public void setAnswerc(String answerc) {
        this.answerc = answerc;
    }

    public String getAnswerd() {
        return answerd;
    }

    public void setAnswerd(String answerd) {
        this.answerd = answerd;
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
        QuestionEmotion other = (QuestionEmotion) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getQuestion() == null ? other.getQuestion() == null : this.getQuestion().equals(other.getQuestion()))
            && (this.getAnswera() == null ? other.getAnswera() == null : this.getAnswera().equals(other.getAnswera()))
            && (this.getAnswerb() == null ? other.getAnswerb() == null : this.getAnswerb().equals(other.getAnswerb()))
            && (this.getAnswerc() == null ? other.getAnswerc() == null : this.getAnswerc().equals(other.getAnswerc()))
            && (this.getAnswerd() == null ? other.getAnswerd() == null : this.getAnswerd().equals(other.getAnswerd()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getQuestion() == null) ? 0 : getQuestion().hashCode());
        result = prime * result + ((getAnswera() == null) ? 0 : getAnswera().hashCode());
        result = prime * result + ((getAnswerb() == null) ? 0 : getAnswerb().hashCode());
        result = prime * result + ((getAnswerc() == null) ? 0 : getAnswerc().hashCode());
        result = prime * result + ((getAnswerd() == null) ? 0 : getAnswerd().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", question=").append(question);
        sb.append(", answera=").append(answera);
        sb.append(", answerb=").append(answerb);
        sb.append(", answerc=").append(answerc);
        sb.append(", answerd=").append(answerd);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}