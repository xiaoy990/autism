package com.join.autism.entity.Export;

import com.join.autism.util.poi.ExpressInExcel;

import java.io.Serializable;

/**
 * 大导出
 */
public class ExportEntity implements Serializable {
    @ExpressInExcel("姓名")
    private String name;
    @ExpressInExcel("生日")
    private String birthday;
    @ExpressInExcel("年龄")
    private String age;
    @ExpressInExcel("省份")
    private String province;
    @ExpressInExcel("城市")
    private String city;
    @ExpressInExcel("地区")
    private String town;
    @ExpressInExcel("街道")
    private String nation;
    @ExpressInExcel("受访者姓名")
    private String sfname;
    @ExpressInExcel("与受访者关系")
    private String relation;
    @ExpressInExcel("地址")
    private String address;
    @ExpressInExcel("电话")
    private String mobile;
    @ExpressInExcel("兄弟姐妹数")
    private String brosis;
    @ExpressInExcel("患者编号")
    private String sicknum;
    @ExpressInExcel("医生")
    private String doctor;
    @ExpressInExcel("调查日期")
    private String survey_time;
    @ExpressInExcel("住院号")
    private String livenum;
    @ExpressInExcel("性别")
    private String six;
    @ExpressInExcel("住址")
    private String adder;
    @ExpressInExcel("体重")
    private String kg;
    private String score;
    private String scorereason;
    @ExpressInExcel("早产")
    private String gogo;
    @ExpressInExcel("早产原因")
    private String gogoreason;
    private String assist;
    private String assistreason;
    private String compl;
    private String complreason;
    @ExpressInExcel("母乳")
    private String mombra;
    @ExpressInExcel("母乳原因")
    private String mombrareason;
    @ExpressInExcel("喂养困难")
    private String bradiff;
    @ExpressInExcel("困难原因")
    private String bradiffreason;
    private String grow;
    private String vitamdreason;
    private String vitamd;
    private String speakreason;
    private String monthgo;
    private String monthclimb;
    private String monthsit;
    private String monthroll;
    private String monthup;
    @ExpressInExcel("发育迟缓")
    private String growslowreason;
    @ExpressInExcel("迟缓原因")
    private String growreason;
    private String datetime;
    private String nospeak;
    @ExpressInExcel("智力障碍")
    private String brains;
    @ExpressInExcel("语言发育迟缓")
    private String speakslow;
    private String blues;
    private String anxious;
    private String manic;
    private String split;
    @ExpressInExcel("社交障碍")
    private String social;
    @ExpressInExcel("多动症")
    private String muchgo;
    @ExpressInExcel("强迫症")
    private String force;
    @ExpressInExcel("选择性缄默症")
    private String choice;
    @ExpressInExcel("其他精神障碍")
    private String spirit;
    private String other;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getSfname() {
        return sfname;
    }

    public void setSfname(String sfname) {
        this.sfname = sfname;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBrosis() {
        return brosis;
    }

    public void setBrosis(String brosis) {
        this.brosis = brosis;
    }

    public String getSicknum() {
        return sicknum;
    }

    public void setSicknum(String sicknum) {
        this.sicknum = sicknum;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getSurvey_time() {
        return survey_time;
    }

    public void setSurvey_time(String survey_time) {
        this.survey_time = survey_time;
    }

    public String getLivenum() {
        return livenum;
    }

    public void setLivenum(String livenum) {
        this.livenum = livenum;
    }

    public String getSix() {
        return six;
    }

    public void setSix(String six) {
        this.six = six;
    }

    public String getAdder() {
        return adder;
    }

    public void setAdder(String adder) {
        this.adder = adder;
    }

    public String getKg() {
        return kg;
    }

    public void setKg(String kg) {
        this.kg = kg;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getScorereason() {
        return scorereason;
    }

    public void setScorereason(String scorereason) {
        this.scorereason = scorereason;
    }

    public String getGogo() {
        return gogo;
    }

    public void setGogo(String gogo) {
        this.gogo = gogo;
    }

    public String getGogoreason() {
        return gogoreason;
    }

    public void setGogoreason(String gogoreason) {
        this.gogoreason = gogoreason;
    }

    public String getAssist() {
        return assist;
    }

    public void setAssist(String assist) {
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

    public String getMombra() {
        return mombra;
    }

    public void setMombra(String mombra) {
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

    public String getGrow() {
        return grow;
    }

    public void setGrow(String grow) {
        this.grow = grow;
    }

    public String getVitamdreason() {
        return vitamdreason;
    }

    public void setVitamdreason(String vitamdreason) {
        this.vitamdreason = vitamdreason;
    }

    public String getVitamd() {
        return vitamd;
    }

    public void setVitamd(String vitamd) {
        this.vitamd = vitamd;
    }

    public String getSpeakreason() {
        return speakreason;
    }

    public void setSpeakreason(String speakreason) {
        this.speakreason = speakreason;
    }

    public String getMonthgo() {
        return monthgo;
    }

    public void setMonthgo(String monthgo) {
        this.monthgo = monthgo;
    }

    public String getMonthclimb() {
        return monthclimb;
    }

    public void setMonthclimb(String monthclimb) {
        this.monthclimb = monthclimb;
    }

    public String getMonthsit() {
        return monthsit;
    }

    public void setMonthsit(String monthsit) {
        this.monthsit = monthsit;
    }

    public String getMonthroll() {
        return monthroll;
    }

    public void setMonthroll(String monthroll) {
        this.monthroll = monthroll;
    }

    public String getMonthup() {
        return monthup;
    }

    public void setMonthup(String monthup) {
        this.monthup = monthup;
    }

    public String getGrowslowreason() {
        return growslowreason;
    }

    public void setGrowslowreason(String growslowreason) {
        this.growslowreason = growslowreason;
    }

    public String getGrowreason() {
        return growreason;
    }

    public void setGrowreason(String growreason) {
        this.growreason = growreason;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getNospeak() {
        return nospeak;
    }

    public void setNospeak(String nospeak) {
        this.nospeak = nospeak;
    }

    public String getBrains() {
        return brains;
    }

    public void setBrains(String brains) {
        this.brains = brains;
    }

    public String getSpeakslow() {
        return speakslow;
    }

    public void setSpeakslow(String speakslow) {
        this.speakslow = speakslow;
    }

    public String getBlues() {
        return blues;
    }

    public void setBlues(String blues) {
        this.blues = blues;
    }

    public String getAnxious() {
        return anxious;
    }

    public void setAnxious(String anxious) {
        this.anxious = anxious;
    }

    public String getManic() {
        return manic;
    }

    public void setManic(String manic) {
        this.manic = manic;
    }

    public String getSplit() {
        return split;
    }

    public void setSplit(String split) {
        this.split = split;
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public String getMuchgo() {
        return muchgo;
    }

    public void setMuchgo(String muchgo) {
        this.muchgo = muchgo;
    }

    public String getForce() {
        return force;
    }

    public void setForce(String force) {
        this.force = force;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getSpirit() {
        return spirit;
    }

    public void setSpirit(String spirit) {
        this.spirit = spirit;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "ExportEntity{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", age='" + age + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", town='" + town + '\'' +
                ", nation='" + nation + '\'' +
                ", sfname='" + sfname + '\'' +
                ", relation='" + relation + '\'' +
                ", address='" + address + '\'' +
                ", mobile='" + mobile + '\'' +
                ", brosis='" + brosis + '\'' +
                ", sicknum='" + sicknum + '\'' +
                ", doctor='" + doctor + '\'' +
                ", survey_time='" + survey_time + '\'' +
                ", livenum='" + livenum + '\'' +
                ", six='" + six + '\'' +
                ", adder='" + adder + '\'' +
                ", kg='" + kg + '\'' +
                ", score='" + score + '\'' +
                ", scorereason='" + scorereason + '\'' +
                ", gogo='" + gogo + '\'' +
                ", gogoreason='" + gogoreason + '\'' +
                ", assist='" + assist + '\'' +
                ", assistreason='" + assistreason + '\'' +
                ", compl='" + compl + '\'' +
                ", complreason='" + complreason + '\'' +
                ", mombra='" + mombra + '\'' +
                ", mombrareason='" + mombrareason + '\'' +
                ", bradiff='" + bradiff + '\'' +
                ", bradiffreason='" + bradiffreason + '\'' +
                ", grow='" + grow + '\'' +
                ", vitamdreason='" + vitamdreason + '\'' +
                ", vitamd='" + vitamd + '\'' +
                ", speakreason='" + speakreason + '\'' +
                ", monthgo='" + monthgo + '\'' +
                ", monthclimb='" + monthclimb + '\'' +
                ", monthsit='" + monthsit + '\'' +
                ", monthroll='" + monthroll + '\'' +
                ", monthup='" + monthup + '\'' +
                ", growslowreason='" + growslowreason + '\'' +
                ", growreason='" + growreason + '\'' +
                ", datetime='" + datetime + '\'' +
                ", nospeak='" + nospeak + '\'' +
                ", brains='" + brains + '\'' +
                ", speakslow='" + speakslow + '\'' +
                ", blues='" + blues + '\'' +
                ", anxious='" + anxious + '\'' +
                ", manic='" + manic + '\'' +
                ", split='" + split + '\'' +
                ", social='" + social + '\'' +
                ", muchgo='" + muchgo + '\'' +
                ", force='" + force + '\'' +
                ", choice='" + choice + '\'' +
                ", spirit='" + spirit + '\'' +
                ", other='" + other + '\'' +
                '}';
    }
}
