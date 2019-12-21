package com.join.autism.entity.Export;

import com.join.autism.util.poi.ExpressInExcel;

import java.io.Serializable;

/**
 * export
 * @author 
 */
public class Export implements Serializable {
    @ExpressInExcel("姓名")
    private String name;
    @ExpressInExcel("生日")
    private String birthday;
    @ExpressInExcel("年龄")
    private Integer age;
    @ExpressInExcel("省份")
    private String province;
    @ExpressInExcel("城市")
    private String city;
    @ExpressInExcel("县区")
    private String town;
//    @ExpressInExcel("姓名")
    private String nation;
    @ExpressInExcel("受访者")
    private String sfname;
    @ExpressInExcel("关系")
    private String relation;
    @ExpressInExcel("地址")
    private String address;
    @ExpressInExcel("电话")
    private String mobile;
    @ExpressInExcel("兄弟姐妹数量")
    private Integer brosis;

    /**
     * 负责医生
     */
    @ExpressInExcel("医生")
    private String doctor;

    /**
     * 调查日期
     */
    @ExpressInExcel("调查时间")
    private String surveyTime;

    /**
     * 住院号
     */
    private String livenum;

    @ExpressInExcel("性别")
    private String six;

    @ExpressInExcel("地址")
    private String adder;

    @ExpressInExcel("体重")
    private String kg;

    private String score;

    private String scorereason;

    @ExpressInExcel("产程是否发动")
    private String gogo;

    private String gogoreason;

    @ExpressInExcel("是否助产")
    private String assist;

    private String assistreason;

    private String compl;

    private String complreason;

    @ExpressInExcel("是否母乳喂养")
    private String mombra;

    private String mombrareason;

    @ExpressInExcel("喂养困难")
    private String bradiff;

    private String bradiffreason;

    @ExpressInExcel("发育迟缓")
    private String grow;

    private String vitamdreason;

    private String vitamd;

    private String speakreason;

    private String monthgo;

    private String monthclimb;

    private String monthsit;

    private String monthroll;

    private String monthup;

    private String growslowreason;

    private String growreason;

    private String datetime;

    @ExpressInExcel("失语")
    private String nospeak;

    @ExpressInExcel("智力障碍")
    private String brains;

    @ExpressInExcel("语言发育迟缓")
    private String speakslow;

    @ExpressInExcel("忧郁症")
    private String blues;

    @ExpressInExcel("躁郁症")
    private String manic;

    @ExpressInExcel("精神分裂")
    private String split;

    @ExpressInExcel("社交障碍")
    private String social;

//    @ExpressInExcel("强迫症")
    private String muchgo;

    @ExpressInExcel("强迫症")
    private String force;

    @ExpressInExcel("选择性缄默症")
    private String choice;

    private String spirit;

    private String other;

    @ExpressInExcel("如果您指着房间另一头的东西，您的孩子会看那个东西吗")
    private String isLook;
    @ExpressInExcel("您是否曾经怀疑你的孩子听力有问题")
    private String isHearing;
    @ExpressInExcel("您的孩子会玩假装游戏吗")
    private String isGame;
    @ExpressInExcel("您的孩子喜欢爬东西")
    private String isClimbing;
    @ExpressInExcel("您的孩子会在他/她的眼睛附近做出一些不寻常的手指头动作吗")
    private String isFinger;
    @ExpressInExcel("您的孩子用食指指着东西寻求帮助吗")
    private String isHelp;
    @ExpressInExcel("您的孩子用手指指着东西，表示对某样东西有兴趣吗")
    private String isInterest;
    @ExpressInExcel("您的孩子对其他孩子有兴趣吗")
    private String isChildren;
    @ExpressInExcel("您的孩子拿东西给您（家长）看，或高举着东西给您看-不是寻求帮助")
    private String isParentsLook;
    @ExpressInExcel("孩子听到您叫他/她的名字时，他/她会回应你吗")
    private String isResponse;
    @ExpressInExcel("当您超您的孩子微笑时，他/她会以微笑回应吗")
    private String isSmileResponse;
    @ExpressInExcel("日常的噪声会使您的孩子心情不好吗")
    private String isNoise;
    @ExpressInExcel("您的孩子会走吗")
    private String isGo;
    @ExpressInExcel("当您和您的孩子说话、和他/她玩儿或给他/她穿衣服时，孩子看您的眼睛吗")
    private String isEye;
    @ExpressInExcel("您的孩子会试着模仿你做的事情吗")
    private String isImitate;
    @ExpressInExcel("当您转头去看东西时，您的孩子会四处看寻找您在看什么吗")
    private String isSearch;
    @ExpressInExcel("您的孩子会设法吸引您看他/她自己的活动吗")
    private String isAttract;
    @ExpressInExcel("当您让您的孩子去做什么事情，他/她能听懂您的意思吗")
    private String isUnderstand;
    @ExpressInExcel("您的孩子碰到不熟悉的事情时，他/她会看着你的脸，看着你的反应吗")
    private String isReaction;
    @ExpressInExcel("您的孩子喜欢运动活动吗")
    private String isMovement;
    @ExpressInExcel("喜欢长时间的自身旋转")
    private String question1;
    @ExpressInExcel("学会做一件简单的事，但是很快就“忘记”")
    private String question2;
    @ExpressInExcel("经常没有接触环境或者进行交往的要求")
    private String question3;
    @ExpressInExcel("往往不能接受简单地指令（如坐下、来这儿等）")
    private String question4;
    @ExpressInExcel("不会玩玩具（如没完没了地转动或乱扔、乱揉等）")
    private String question5;
    @ExpressInExcel("视觉辨别能力差[如对一种物体的特征（大小、颜色或位置等）的辨别能力差]")
    private String question6;
    @ExpressInExcel("无交往性微笑（如无社交性微笑，即不会与人点头、招呼、微笑）")
    private String question7;
    @ExpressInExcel("代词运用的颠倒或混乱（如把“你”说成“我”等等）")
    private String question8;
    @ExpressInExcel("长时间的总拿着某件东西")
    private String question9;
    @ExpressInExcel("似乎不在听人说话，以致怀疑他有听力问题")
    private String question10;
    @ExpressInExcel("说话无抑扬顿挫（不含音调），无节奏")
    private String question11;
    @ExpressInExcel("长时间的摇摆身体")
    private String question12;
    @ExpressInExcel("要去拿什么东西，但又不是身体所能达到的地方（机队自身与物体距离估计不足）")
    private String question13;
    @ExpressInExcel("对环境和日常生活规律的改变产生强烈反应")
    private String question14;
    @ExpressInExcel("当和其他人在一起时，对呼唤他的名字无反应")
    private String question15;
    @ExpressInExcel("经常做出前冲、旋转、脚尖行走，手指轻掐轻弹等动作")
    private String question16;
    @ExpressInExcel("对其他人的面部表情或情感没有反应")
    private String question17;
    @ExpressInExcel("说话时很少用“是”或“我”等词")
    private String question18;
    @ExpressInExcel("有某一方面的特殊能力，似乎与智力低下不相符合")
    private String question19;
    @ExpressInExcel("不能执行简单的含有介词语句的指令（如把球放在盒子上或把球放在盒子里）")
    private String question20;
    @ExpressInExcel("有时对很大的声音不产生吃惊的反应（可能让人感到儿童是聋子）")
    private String question21;
    @ExpressInExcel("经常拍打手")
    private String question22;
    @ExpressInExcel("发大脾气或者经常发点脾气")
    private String question23;
    @ExpressInExcel("主动回避与别人进行眼光接触")
    private String question24;
    @ExpressInExcel("拒绝别人接触或拥抱")
    private String question25;
    @ExpressInExcel("有时对痛苦的刺激如摔伤、割破或注射不引起反应")
    private String question26;
    @ExpressInExcel("身体表现很僵硬，很难抱住（如打挺）")
    private String question27;
    @ExpressInExcel("当被抱时，让人感到他肌肉松弛（不紧贴着抱他的人）")
    private String question28;
    @ExpressInExcel("以姿势、手势表示所渴望得到的东西，而不倾向用语言表示")
    private String question29;
    @ExpressInExcel("常用脚尖走路")
    private String question30;
    @ExpressInExcel("用咬人、撞人踢人等来伤害他人")
    private String question31;
    @ExpressInExcel("不断地重复短句")
    private String question32;
    @ExpressInExcel("游戏时不模仿其他儿童")
    private String question33;
    @ExpressInExcel("当强光直接照射眼睛时，经常不眨眼")
    private String question34;
    @ExpressInExcel("以撞头、咬手等行为来自伤")
    private String question35;
    @ExpressInExcel("想要什么东西不能等待（一想要什么就马上要得到什么）")
    private String question36;
    @ExpressInExcel("不能指出5个以上物体的名称")
    private String question37;
    @ExpressInExcel("不能发展任何友谊（不会和小朋友来往交朋友）")
    private String question38;
    @ExpressInExcel("有许多声音的时候常常盖着耳朵")
    private String question39;
    @ExpressInExcel("经常旋转碰撞物体")
    private String question40;
    @ExpressInExcel("在训练大小便方面有困难（不会控制大小便）")
    private String question41;
    @ExpressInExcel("一天只能提出5个以内的要求")
    private String question42;
    @ExpressInExcel("经常受到惊吓或非常焦虑、不安")
    private String question43;
    @ExpressInExcel("在正常光线下斜眼、闭眼、皱眉")
    private String question44;
    @ExpressInExcel("若没有别人的经常帮助，不会自己给自己穿衣")
    private String question45;
    @ExpressInExcel("一遍一遍重复一些声音或词")
    private String question46;
    @ExpressInExcel("瞪着眼看人，好像要“看穿”似的")
    private String question47;
    @ExpressInExcel("重复别人的问话和回答")
    private String question48;
    @ExpressInExcel("经常不能意识所处的环境，并且可能对危险情况不在意")
    private String question49;
    @ExpressInExcel("特别喜欢摆弄某种单调的东西，或着迷于某种游戏、活动等（如来回的走或跑、没完没了地蹦、条、拍、敲）")
    private String question50;
    @ExpressInExcel("对周围东西喜欢触摸、嗅和（或）尝")
    private String question51;
    @ExpressInExcel("对生人常无视觉反应（对来人不看）")
    private String question52;
    @ExpressInExcel("纠缠在一些复杂的仪式行为上，就像缠在魔圈里（如走路一定要走一定的路线，饭前或睡前或干什么以前一定要把什么东西摆在什么地方或做什么动作，否则就不睡、不吃等）")
    private String question53;
    @ExpressInExcel("经常毁坏东西（如玩具、家里的一切用具很快就弄破了）")
    private String question54;
    @ExpressInExcel("在2岁半以前就发现该儿童发育延迟")
    private String question55;
    @ExpressInExcel("在日常生活中至今仅会用15个但又不超过30个短句来进行交往")
    private String question56;
    @ExpressInExcel("长期凝视一个地方（呆呆地看一处）")
    private String question57;

    private Integer questionSum;

    @ExpressInExcel("人际关系")
    private Integer rela;
    @ExpressInExcel("模仿（词和动作）")
    private Integer imitate;
    @ExpressInExcel("情感反应")
    private Integer emotion;
    @ExpressInExcel("躯体运用能力")
    private Integer motion;
    @ExpressInExcel("与非生命物体的关系")
    private Integer nonlife;
    @ExpressInExcel("对环境变化的适应")
    private Integer change;
    @ExpressInExcel("视觉反应")
    private Integer vision;
    @ExpressInExcel("听觉反应")
    private Integer hearing;
    @ExpressInExcel("近处感觉反应")
    private Integer nearby;
    @ExpressInExcel("焦虑反应")
    private Integer anxious;
    @ExpressInExcel("语言交流")
    private Integer language;
    @ExpressInExcel("非语言交流")
    private Integer nolan;
    @ExpressInExcel("活动很大")
    private Integer activity;
    @ExpressInExcel("智力功能")
    private Integer intelligence;
    @ExpressInExcel("总的印象")
    private Integer impression;

    private Integer frasum;

    private Integer id;

    private static final long serialVersionUID = 1L;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
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

    public Integer getBrosis() {
        return brosis;
    }

    public void setBrosis(Integer brosis) {
        this.brosis = brosis;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getSurveyTime() {
        return surveyTime;
    }

    public void setSurveyTime(String surveyTime) {
        this.surveyTime = surveyTime;
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

    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public String getQuestion2() {
        return question2;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    public String getQuestion3() {
        return question3;
    }

    public void setQuestion3(String question3) {
        this.question3 = question3;
    }

    public String getQuestion4() {
        return question4;
    }

    public void setQuestion4(String question4) {
        this.question4 = question4;
    }

    public String getQuestion5() {
        return question5;
    }

    public void setQuestion5(String question5) {
        this.question5 = question5;
    }

    public String getQuestion6() {
        return question6;
    }

    public void setQuestion6(String question6) {
        this.question6 = question6;
    }

    public String getQuestion7() {
        return question7;
    }

    public void setQuestion7(String question7) {
        this.question7 = question7;
    }

    public String getQuestion8() {
        return question8;
    }

    public void setQuestion8(String question8) {
        this.question8 = question8;
    }

    public String getQuestion9() {
        return question9;
    }

    public void setQuestion9(String question9) {
        this.question9 = question9;
    }

    public String getQuestion10() {
        return question10;
    }

    public void setQuestion10(String question10) {
        this.question10 = question10;
    }

    public String getQuestion11() {
        return question11;
    }

    public void setQuestion11(String question11) {
        this.question11 = question11;
    }

    public String getQuestion12() {
        return question12;
    }

    public void setQuestion12(String question12) {
        this.question12 = question12;
    }

    public String getQuestion13() {
        return question13;
    }

    public void setQuestion13(String question13) {
        this.question13 = question13;
    }

    public String getQuestion14() {
        return question14;
    }

    public void setQuestion14(String question14) {
        this.question14 = question14;
    }

    public String getQuestion15() {
        return question15;
    }

    public void setQuestion15(String question15) {
        this.question15 = question15;
    }

    public String getQuestion16() {
        return question16;
    }

    public void setQuestion16(String question16) {
        this.question16 = question16;
    }

    public String getQuestion17() {
        return question17;
    }

    public void setQuestion17(String question17) {
        this.question17 = question17;
    }

    public String getQuestion18() {
        return question18;
    }

    public void setQuestion18(String question18) {
        this.question18 = question18;
    }

    public String getQuestion19() {
        return question19;
    }

    public void setQuestion19(String question19) {
        this.question19 = question19;
    }

    public String getQuestion20() {
        return question20;
    }

    public void setQuestion20(String question20) {
        this.question20 = question20;
    }

    public String getQuestion21() {
        return question21;
    }

    public void setQuestion21(String question21) {
        this.question21 = question21;
    }

    public String getQuestion22() {
        return question22;
    }

    public void setQuestion22(String question22) {
        this.question22 = question22;
    }

    public String getQuestion23() {
        return question23;
    }

    public void setQuestion23(String question23) {
        this.question23 = question23;
    }

    public String getQuestion24() {
        return question24;
    }

    public void setQuestion24(String question24) {
        this.question24 = question24;
    }

    public String getQuestion25() {
        return question25;
    }

    public void setQuestion25(String question25) {
        this.question25 = question25;
    }

    public String getQuestion26() {
        return question26;
    }

    public void setQuestion26(String question26) {
        this.question26 = question26;
    }

    public String getQuestion27() {
        return question27;
    }

    public void setQuestion27(String question27) {
        this.question27 = question27;
    }

    public String getQuestion28() {
        return question28;
    }

    public void setQuestion28(String question28) {
        this.question28 = question28;
    }

    public String getQuestion29() {
        return question29;
    }

    public void setQuestion29(String question29) {
        this.question29 = question29;
    }

    public String getQuestion30() {
        return question30;
    }

    public void setQuestion30(String question30) {
        this.question30 = question30;
    }

    public String getQuestion31() {
        return question31;
    }

    public void setQuestion31(String question31) {
        this.question31 = question31;
    }

    public String getQuestion32() {
        return question32;
    }

    public void setQuestion32(String question32) {
        this.question32 = question32;
    }

    public String getQuestion33() {
        return question33;
    }

    public void setQuestion33(String question33) {
        this.question33 = question33;
    }

    public String getQuestion34() {
        return question34;
    }

    public void setQuestion34(String question34) {
        this.question34 = question34;
    }

    public String getQuestion35() {
        return question35;
    }

    public void setQuestion35(String question35) {
        this.question35 = question35;
    }

    public String getQuestion36() {
        return question36;
    }

    public void setQuestion36(String question36) {
        this.question36 = question36;
    }

    public String getQuestion37() {
        return question37;
    }

    public void setQuestion37(String question37) {
        this.question37 = question37;
    }

    public String getQuestion38() {
        return question38;
    }

    public void setQuestion38(String question38) {
        this.question38 = question38;
    }

    public String getQuestion39() {
        return question39;
    }

    public void setQuestion39(String question39) {
        this.question39 = question39;
    }

    public String getQuestion40() {
        return question40;
    }

    public void setQuestion40(String question40) {
        this.question40 = question40;
    }

    public String getQuestion41() {
        return question41;
    }

    public void setQuestion41(String question41) {
        this.question41 = question41;
    }

    public String getQuestion42() {
        return question42;
    }

    public void setQuestion42(String question42) {
        this.question42 = question42;
    }

    public String getQuestion43() {
        return question43;
    }

    public void setQuestion43(String question43) {
        this.question43 = question43;
    }

    public String getQuestion44() {
        return question44;
    }

    public void setQuestion44(String question44) {
        this.question44 = question44;
    }

    public String getQuestion45() {
        return question45;
    }

    public void setQuestion45(String question45) {
        this.question45 = question45;
    }

    public String getQuestion46() {
        return question46;
    }

    public void setQuestion46(String question46) {
        this.question46 = question46;
    }

    public String getQuestion47() {
        return question47;
    }

    public void setQuestion47(String question47) {
        this.question47 = question47;
    }

    public String getQuestion48() {
        return question48;
    }

    public void setQuestion48(String question48) {
        this.question48 = question48;
    }

    public String getQuestion49() {
        return question49;
    }

    public void setQuestion49(String question49) {
        this.question49 = question49;
    }

    public String getQuestion50() {
        return question50;
    }

    public void setQuestion50(String question50) {
        this.question50 = question50;
    }

    public String getQuestion51() {
        return question51;
    }

    public void setQuestion51(String question51) {
        this.question51 = question51;
    }

    public String getQuestion52() {
        return question52;
    }

    public void setQuestion52(String question52) {
        this.question52 = question52;
    }

    public String getQuestion53() {
        return question53;
    }

    public void setQuestion53(String question53) {
        this.question53 = question53;
    }

    public String getQuestion54() {
        return question54;
    }

    public void setQuestion54(String question54) {
        this.question54 = question54;
    }

    public String getQuestion55() {
        return question55;
    }

    public void setQuestion55(String question55) {
        this.question55 = question55;
    }

    public String getQuestion56() {
        return question56;
    }

    public void setQuestion56(String question56) {
        this.question56 = question56;
    }

    public String getQuestion57() {
        return question57;
    }

    public void setQuestion57(String question57) {
        this.question57 = question57;
    }

    public Integer getQuestionSum() {
        return questionSum;
    }

    public void setQuestionSum(Integer questionSum) {
        this.questionSum = questionSum;
    }

    public Integer getRela() {
        return rela;
    }

    public void setRela(Integer rela) {
        this.rela = rela;
    }

    public Integer getImitate() {
        return imitate;
    }

    public void setImitate(Integer imitate) {
        this.imitate = imitate;
    }

    public Integer getEmotion() {
        return emotion;
    }

    public void setEmotion(Integer emotion) {
        this.emotion = emotion;
    }

    public Integer getMotion() {
        return motion;
    }

    public void setMotion(Integer motion) {
        this.motion = motion;
    }

    public Integer getNonlife() {
        return nonlife;
    }

    public void setNonlife(Integer nonlife) {
        this.nonlife = nonlife;
    }

    public Integer getChange() {
        return change;
    }

    public void setChange(Integer change) {
        this.change = change;
    }

    public Integer getVision() {
        return vision;
    }

    public void setVision(Integer vision) {
        this.vision = vision;
    }

    public Integer getHearing() {
        return hearing;
    }

    public void setHearing(Integer hearing) {
        this.hearing = hearing;
    }

    public Integer getNearby() {
        return nearby;
    }

    public void setNearby(Integer nearby) {
        this.nearby = nearby;
    }

    public Integer getAnxious() {
        return anxious;
    }

    public void setAnxious(Integer anxious) {
        this.anxious = anxious;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

    public Integer getNolan() {
        return nolan;
    }

    public void setNolan(Integer nolan) {
        this.nolan = nolan;
    }

    public Integer getActivity() {
        return activity;
    }

    public void setActivity(Integer activity) {
        this.activity = activity;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getImpression() {
        return impression;
    }

    public void setImpression(Integer impression) {
        this.impression = impression;
    }

    public Integer getFrasum() {
        return frasum;
    }

    public void setFrasum(Integer frasum) {
        this.frasum = frasum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        Export other = (Export) that;
        return (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getTown() == null ? other.getTown() == null : this.getTown().equals(other.getTown()))
            && (this.getNation() == null ? other.getNation() == null : this.getNation().equals(other.getNation()))
            && (this.getSfname() == null ? other.getSfname() == null : this.getSfname().equals(other.getSfname()))
            && (this.getRelation() == null ? other.getRelation() == null : this.getRelation().equals(other.getRelation()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getBrosis() == null ? other.getBrosis() == null : this.getBrosis().equals(other.getBrosis()))
            && (this.getDoctor() == null ? other.getDoctor() == null : this.getDoctor().equals(other.getDoctor()))
            && (this.getSurveyTime() == null ? other.getSurveyTime() == null : this.getSurveyTime().equals(other.getSurveyTime()))
            && (this.getLivenum() == null ? other.getLivenum() == null : this.getLivenum().equals(other.getLivenum()))
            && (this.getSix() == null ? other.getSix() == null : this.getSix().equals(other.getSix()))
            && (this.getAdder() == null ? other.getAdder() == null : this.getAdder().equals(other.getAdder()))
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
            && (this.getVitamdreason() == null ? other.getVitamdreason() == null : this.getVitamdreason().equals(other.getVitamdreason()))
            && (this.getVitamd() == null ? other.getVitamd() == null : this.getVitamd().equals(other.getVitamd()))
            && (this.getSpeakreason() == null ? other.getSpeakreason() == null : this.getSpeakreason().equals(other.getSpeakreason()))
            && (this.getMonthgo() == null ? other.getMonthgo() == null : this.getMonthgo().equals(other.getMonthgo()))
            && (this.getMonthclimb() == null ? other.getMonthclimb() == null : this.getMonthclimb().equals(other.getMonthclimb()))
            && (this.getMonthsit() == null ? other.getMonthsit() == null : this.getMonthsit().equals(other.getMonthsit()))
            && (this.getMonthroll() == null ? other.getMonthroll() == null : this.getMonthroll().equals(other.getMonthroll()))
            && (this.getMonthup() == null ? other.getMonthup() == null : this.getMonthup().equals(other.getMonthup()))
            && (this.getGrowslowreason() == null ? other.getGrowslowreason() == null : this.getGrowslowreason().equals(other.getGrowslowreason()))
            && (this.getGrowreason() == null ? other.getGrowreason() == null : this.getGrowreason().equals(other.getGrowreason()))
            && (this.getDatetime() == null ? other.getDatetime() == null : this.getDatetime().equals(other.getDatetime()))
            && (this.getNospeak() == null ? other.getNospeak() == null : this.getNospeak().equals(other.getNospeak()))
            && (this.getBrains() == null ? other.getBrains() == null : this.getBrains().equals(other.getBrains()))
            && (this.getSpeakslow() == null ? other.getSpeakslow() == null : this.getSpeakslow().equals(other.getSpeakslow()))
            && (this.getBlues() == null ? other.getBlues() == null : this.getBlues().equals(other.getBlues()))
            && (this.getManic() == null ? other.getManic() == null : this.getManic().equals(other.getManic()))
            && (this.getSplit() == null ? other.getSplit() == null : this.getSplit().equals(other.getSplit()))
            && (this.getSocial() == null ? other.getSocial() == null : this.getSocial().equals(other.getSocial()))
            && (this.getMuchgo() == null ? other.getMuchgo() == null : this.getMuchgo().equals(other.getMuchgo()))
            && (this.getForce() == null ? other.getForce() == null : this.getForce().equals(other.getForce()))
            && (this.getChoice() == null ? other.getChoice() == null : this.getChoice().equals(other.getChoice()))
            && (this.getSpirit() == null ? other.getSpirit() == null : this.getSpirit().equals(other.getSpirit()))
            && (this.getOther() == null ? other.getOther() == null : this.getOther().equals(other.getOther()))
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
            && (this.getQuestion21() == null ? other.getQuestion21() == null : this.getQuestion21().equals(other.getQuestion21()))
            && (this.getQuestion22() == null ? other.getQuestion22() == null : this.getQuestion22().equals(other.getQuestion22()))
            && (this.getQuestion23() == null ? other.getQuestion23() == null : this.getQuestion23().equals(other.getQuestion23()))
            && (this.getQuestion24() == null ? other.getQuestion24() == null : this.getQuestion24().equals(other.getQuestion24()))
            && (this.getQuestion25() == null ? other.getQuestion25() == null : this.getQuestion25().equals(other.getQuestion25()))
            && (this.getQuestion26() == null ? other.getQuestion26() == null : this.getQuestion26().equals(other.getQuestion26()))
            && (this.getQuestion27() == null ? other.getQuestion27() == null : this.getQuestion27().equals(other.getQuestion27()))
            && (this.getQuestion28() == null ? other.getQuestion28() == null : this.getQuestion28().equals(other.getQuestion28()))
            && (this.getQuestion29() == null ? other.getQuestion29() == null : this.getQuestion29().equals(other.getQuestion29()))
            && (this.getQuestion30() == null ? other.getQuestion30() == null : this.getQuestion30().equals(other.getQuestion30()))
            && (this.getQuestion31() == null ? other.getQuestion31() == null : this.getQuestion31().equals(other.getQuestion31()))
            && (this.getQuestion32() == null ? other.getQuestion32() == null : this.getQuestion32().equals(other.getQuestion32()))
            && (this.getQuestion33() == null ? other.getQuestion33() == null : this.getQuestion33().equals(other.getQuestion33()))
            && (this.getQuestion34() == null ? other.getQuestion34() == null : this.getQuestion34().equals(other.getQuestion34()))
            && (this.getQuestion35() == null ? other.getQuestion35() == null : this.getQuestion35().equals(other.getQuestion35()))
            && (this.getQuestion36() == null ? other.getQuestion36() == null : this.getQuestion36().equals(other.getQuestion36()))
            && (this.getQuestion37() == null ? other.getQuestion37() == null : this.getQuestion37().equals(other.getQuestion37()))
            && (this.getQuestion38() == null ? other.getQuestion38() == null : this.getQuestion38().equals(other.getQuestion38()))
            && (this.getQuestion39() == null ? other.getQuestion39() == null : this.getQuestion39().equals(other.getQuestion39()))
            && (this.getQuestion40() == null ? other.getQuestion40() == null : this.getQuestion40().equals(other.getQuestion40()))
            && (this.getQuestion41() == null ? other.getQuestion41() == null : this.getQuestion41().equals(other.getQuestion41()))
            && (this.getQuestion42() == null ? other.getQuestion42() == null : this.getQuestion42().equals(other.getQuestion42()))
            && (this.getQuestion43() == null ? other.getQuestion43() == null : this.getQuestion43().equals(other.getQuestion43()))
            && (this.getQuestion44() == null ? other.getQuestion44() == null : this.getQuestion44().equals(other.getQuestion44()))
            && (this.getQuestion45() == null ? other.getQuestion45() == null : this.getQuestion45().equals(other.getQuestion45()))
            && (this.getQuestion46() == null ? other.getQuestion46() == null : this.getQuestion46().equals(other.getQuestion46()))
            && (this.getQuestion47() == null ? other.getQuestion47() == null : this.getQuestion47().equals(other.getQuestion47()))
            && (this.getQuestion48() == null ? other.getQuestion48() == null : this.getQuestion48().equals(other.getQuestion48()))
            && (this.getQuestion49() == null ? other.getQuestion49() == null : this.getQuestion49().equals(other.getQuestion49()))
            && (this.getQuestion50() == null ? other.getQuestion50() == null : this.getQuestion50().equals(other.getQuestion50()))
            && (this.getQuestion51() == null ? other.getQuestion51() == null : this.getQuestion51().equals(other.getQuestion51()))
            && (this.getQuestion52() == null ? other.getQuestion52() == null : this.getQuestion52().equals(other.getQuestion52()))
            && (this.getQuestion53() == null ? other.getQuestion53() == null : this.getQuestion53().equals(other.getQuestion53()))
            && (this.getQuestion54() == null ? other.getQuestion54() == null : this.getQuestion54().equals(other.getQuestion54()))
            && (this.getQuestion55() == null ? other.getQuestion55() == null : this.getQuestion55().equals(other.getQuestion55()))
            && (this.getQuestion56() == null ? other.getQuestion56() == null : this.getQuestion56().equals(other.getQuestion56()))
            && (this.getQuestion57() == null ? other.getQuestion57() == null : this.getQuestion57().equals(other.getQuestion57()))
            && (this.getQuestionSum() == null ? other.getQuestionSum() == null : this.getQuestionSum().equals(other.getQuestionSum()))
            && (this.getRela() == null ? other.getRela() == null : this.getRela().equals(other.getRela()))
            && (this.getImitate() == null ? other.getImitate() == null : this.getImitate().equals(other.getImitate()))
            && (this.getEmotion() == null ? other.getEmotion() == null : this.getEmotion().equals(other.getEmotion()))
            && (this.getMotion() == null ? other.getMotion() == null : this.getMotion().equals(other.getMotion()))
            && (this.getNonlife() == null ? other.getNonlife() == null : this.getNonlife().equals(other.getNonlife()))
            && (this.getChange() == null ? other.getChange() == null : this.getChange().equals(other.getChange()))
            && (this.getVision() == null ? other.getVision() == null : this.getVision().equals(other.getVision()))
            && (this.getHearing() == null ? other.getHearing() == null : this.getHearing().equals(other.getHearing()))
            && (this.getNearby() == null ? other.getNearby() == null : this.getNearby().equals(other.getNearby()))
            && (this.getAnxious() == null ? other.getAnxious() == null : this.getAnxious().equals(other.getAnxious()))
            && (this.getLanguage() == null ? other.getLanguage() == null : this.getLanguage().equals(other.getLanguage()))
            && (this.getNolan() == null ? other.getNolan() == null : this.getNolan().equals(other.getNolan()))
            && (this.getActivity() == null ? other.getActivity() == null : this.getActivity().equals(other.getActivity()))
            && (this.getIntelligence() == null ? other.getIntelligence() == null : this.getIntelligence().equals(other.getIntelligence()))
            && (this.getImpression() == null ? other.getImpression() == null : this.getImpression().equals(other.getImpression()))
            && (this.getFrasum() == null ? other.getFrasum() == null : this.getFrasum().equals(other.getFrasum()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getTown() == null) ? 0 : getTown().hashCode());
        result = prime * result + ((getNation() == null) ? 0 : getNation().hashCode());
        result = prime * result + ((getSfname() == null) ? 0 : getSfname().hashCode());
        result = prime * result + ((getRelation() == null) ? 0 : getRelation().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getBrosis() == null) ? 0 : getBrosis().hashCode());
        result = prime * result + ((getDoctor() == null) ? 0 : getDoctor().hashCode());
        result = prime * result + ((getSurveyTime() == null) ? 0 : getSurveyTime().hashCode());
        result = prime * result + ((getLivenum() == null) ? 0 : getLivenum().hashCode());
        result = prime * result + ((getSix() == null) ? 0 : getSix().hashCode());
        result = prime * result + ((getAdder() == null) ? 0 : getAdder().hashCode());
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
        result = prime * result + ((getVitamdreason() == null) ? 0 : getVitamdreason().hashCode());
        result = prime * result + ((getVitamd() == null) ? 0 : getVitamd().hashCode());
        result = prime * result + ((getSpeakreason() == null) ? 0 : getSpeakreason().hashCode());
        result = prime * result + ((getMonthgo() == null) ? 0 : getMonthgo().hashCode());
        result = prime * result + ((getMonthclimb() == null) ? 0 : getMonthclimb().hashCode());
        result = prime * result + ((getMonthsit() == null) ? 0 : getMonthsit().hashCode());
        result = prime * result + ((getMonthroll() == null) ? 0 : getMonthroll().hashCode());
        result = prime * result + ((getMonthup() == null) ? 0 : getMonthup().hashCode());
        result = prime * result + ((getGrowslowreason() == null) ? 0 : getGrowslowreason().hashCode());
        result = prime * result + ((getGrowreason() == null) ? 0 : getGrowreason().hashCode());
        result = prime * result + ((getDatetime() == null) ? 0 : getDatetime().hashCode());
        result = prime * result + ((getNospeak() == null) ? 0 : getNospeak().hashCode());
        result = prime * result + ((getBrains() == null) ? 0 : getBrains().hashCode());
        result = prime * result + ((getSpeakslow() == null) ? 0 : getSpeakslow().hashCode());
        result = prime * result + ((getBlues() == null) ? 0 : getBlues().hashCode());
        result = prime * result + ((getManic() == null) ? 0 : getManic().hashCode());
        result = prime * result + ((getSplit() == null) ? 0 : getSplit().hashCode());
        result = prime * result + ((getSocial() == null) ? 0 : getSocial().hashCode());
        result = prime * result + ((getMuchgo() == null) ? 0 : getMuchgo().hashCode());
        result = prime * result + ((getForce() == null) ? 0 : getForce().hashCode());
        result = prime * result + ((getChoice() == null) ? 0 : getChoice().hashCode());
        result = prime * result + ((getSpirit() == null) ? 0 : getSpirit().hashCode());
        result = prime * result + ((getOther() == null) ? 0 : getOther().hashCode());
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
        result = prime * result + ((getQuestion21() == null) ? 0 : getQuestion21().hashCode());
        result = prime * result + ((getQuestion22() == null) ? 0 : getQuestion22().hashCode());
        result = prime * result + ((getQuestion23() == null) ? 0 : getQuestion23().hashCode());
        result = prime * result + ((getQuestion24() == null) ? 0 : getQuestion24().hashCode());
        result = prime * result + ((getQuestion25() == null) ? 0 : getQuestion25().hashCode());
        result = prime * result + ((getQuestion26() == null) ? 0 : getQuestion26().hashCode());
        result = prime * result + ((getQuestion27() == null) ? 0 : getQuestion27().hashCode());
        result = prime * result + ((getQuestion28() == null) ? 0 : getQuestion28().hashCode());
        result = prime * result + ((getQuestion29() == null) ? 0 : getQuestion29().hashCode());
        result = prime * result + ((getQuestion30() == null) ? 0 : getQuestion30().hashCode());
        result = prime * result + ((getQuestion31() == null) ? 0 : getQuestion31().hashCode());
        result = prime * result + ((getQuestion32() == null) ? 0 : getQuestion32().hashCode());
        result = prime * result + ((getQuestion33() == null) ? 0 : getQuestion33().hashCode());
        result = prime * result + ((getQuestion34() == null) ? 0 : getQuestion34().hashCode());
        result = prime * result + ((getQuestion35() == null) ? 0 : getQuestion35().hashCode());
        result = prime * result + ((getQuestion36() == null) ? 0 : getQuestion36().hashCode());
        result = prime * result + ((getQuestion37() == null) ? 0 : getQuestion37().hashCode());
        result = prime * result + ((getQuestion38() == null) ? 0 : getQuestion38().hashCode());
        result = prime * result + ((getQuestion39() == null) ? 0 : getQuestion39().hashCode());
        result = prime * result + ((getQuestion40() == null) ? 0 : getQuestion40().hashCode());
        result = prime * result + ((getQuestion41() == null) ? 0 : getQuestion41().hashCode());
        result = prime * result + ((getQuestion42() == null) ? 0 : getQuestion42().hashCode());
        result = prime * result + ((getQuestion43() == null) ? 0 : getQuestion43().hashCode());
        result = prime * result + ((getQuestion44() == null) ? 0 : getQuestion44().hashCode());
        result = prime * result + ((getQuestion45() == null) ? 0 : getQuestion45().hashCode());
        result = prime * result + ((getQuestion46() == null) ? 0 : getQuestion46().hashCode());
        result = prime * result + ((getQuestion47() == null) ? 0 : getQuestion47().hashCode());
        result = prime * result + ((getQuestion48() == null) ? 0 : getQuestion48().hashCode());
        result = prime * result + ((getQuestion49() == null) ? 0 : getQuestion49().hashCode());
        result = prime * result + ((getQuestion50() == null) ? 0 : getQuestion50().hashCode());
        result = prime * result + ((getQuestion51() == null) ? 0 : getQuestion51().hashCode());
        result = prime * result + ((getQuestion52() == null) ? 0 : getQuestion52().hashCode());
        result = prime * result + ((getQuestion53() == null) ? 0 : getQuestion53().hashCode());
        result = prime * result + ((getQuestion54() == null) ? 0 : getQuestion54().hashCode());
        result = prime * result + ((getQuestion55() == null) ? 0 : getQuestion55().hashCode());
        result = prime * result + ((getQuestion56() == null) ? 0 : getQuestion56().hashCode());
        result = prime * result + ((getQuestion57() == null) ? 0 : getQuestion57().hashCode());
        result = prime * result + ((getQuestionSum() == null) ? 0 : getQuestionSum().hashCode());
        result = prime * result + ((getRela() == null) ? 0 : getRela().hashCode());
        result = prime * result + ((getImitate() == null) ? 0 : getImitate().hashCode());
        result = prime * result + ((getEmotion() == null) ? 0 : getEmotion().hashCode());
        result = prime * result + ((getMotion() == null) ? 0 : getMotion().hashCode());
        result = prime * result + ((getNonlife() == null) ? 0 : getNonlife().hashCode());
        result = prime * result + ((getChange() == null) ? 0 : getChange().hashCode());
        result = prime * result + ((getVision() == null) ? 0 : getVision().hashCode());
        result = prime * result + ((getHearing() == null) ? 0 : getHearing().hashCode());
        result = prime * result + ((getNearby() == null) ? 0 : getNearby().hashCode());
        result = prime * result + ((getAnxious() == null) ? 0 : getAnxious().hashCode());
        result = prime * result + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        result = prime * result + ((getNolan() == null) ? 0 : getNolan().hashCode());
        result = prime * result + ((getActivity() == null) ? 0 : getActivity().hashCode());
        result = prime * result + ((getIntelligence() == null) ? 0 : getIntelligence().hashCode());
        result = prime * result + ((getImpression() == null) ? 0 : getImpression().hashCode());
        result = prime * result + ((getFrasum() == null) ? 0 : getFrasum().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", birthday=").append(birthday);
        sb.append(", age=").append(age);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", town=").append(town);
        sb.append(", nation=").append(nation);
        sb.append(", sfname=").append(sfname);
        sb.append(", relation=").append(relation);
        sb.append(", address=").append(address);
        sb.append(", mobile=").append(mobile);
        sb.append(", brosis=").append(brosis);
        sb.append(", doctor=").append(doctor);
        sb.append(", surveyTime=").append(surveyTime);
        sb.append(", livenum=").append(livenum);
        sb.append(", six=").append(six);
        sb.append(", adder=").append(adder);
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
        sb.append(", vitamdreason=").append(vitamdreason);
        sb.append(", vitamd=").append(vitamd);
        sb.append(", speakreason=").append(speakreason);
        sb.append(", monthgo=").append(monthgo);
        sb.append(", monthclimb=").append(monthclimb);
        sb.append(", monthsit=").append(monthsit);
        sb.append(", monthroll=").append(monthroll);
        sb.append(", monthup=").append(monthup);
        sb.append(", growslowreason=").append(growslowreason);
        sb.append(", growreason=").append(growreason);
        sb.append(", datetime=").append(datetime);
        sb.append(", nospeak=").append(nospeak);
        sb.append(", brains=").append(brains);
        sb.append(", speakslow=").append(speakslow);
        sb.append(", blues=").append(blues);
        sb.append(", manic=").append(manic);
        sb.append(", split=").append(split);
        sb.append(", social=").append(social);
        sb.append(", muchgo=").append(muchgo);
        sb.append(", force=").append(force);
        sb.append(", choice=").append(choice);
        sb.append(", spirit=").append(spirit);
        sb.append(", other=").append(other);
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
        sb.append(", question21=").append(question21);
        sb.append(", question22=").append(question22);
        sb.append(", question23=").append(question23);
        sb.append(", question24=").append(question24);
        sb.append(", question25=").append(question25);
        sb.append(", question26=").append(question26);
        sb.append(", question27=").append(question27);
        sb.append(", question28=").append(question28);
        sb.append(", question29=").append(question29);
        sb.append(", question30=").append(question30);
        sb.append(", question31=").append(question31);
        sb.append(", question32=").append(question32);
        sb.append(", question33=").append(question33);
        sb.append(", question34=").append(question34);
        sb.append(", question35=").append(question35);
        sb.append(", question36=").append(question36);
        sb.append(", question37=").append(question37);
        sb.append(", question38=").append(question38);
        sb.append(", question39=").append(question39);
        sb.append(", question40=").append(question40);
        sb.append(", question41=").append(question41);
        sb.append(", question42=").append(question42);
        sb.append(", question43=").append(question43);
        sb.append(", question44=").append(question44);
        sb.append(", question45=").append(question45);
        sb.append(", question46=").append(question46);
        sb.append(", question47=").append(question47);
        sb.append(", question48=").append(question48);
        sb.append(", question49=").append(question49);
        sb.append(", question50=").append(question50);
        sb.append(", question51=").append(question51);
        sb.append(", question52=").append(question52);
        sb.append(", question53=").append(question53);
        sb.append(", question54=").append(question54);
        sb.append(", question55=").append(question55);
        sb.append(", question56=").append(question56);
        sb.append(", question57=").append(question57);
        sb.append(", questionSum=").append(questionSum);
        sb.append(", rela=").append(rela);
        sb.append(", imitate=").append(imitate);
        sb.append(", emotion=").append(emotion);
        sb.append(", motion=").append(motion);
        sb.append(", nonlife=").append(nonlife);
        sb.append(", change=").append(change);
        sb.append(", vision=").append(vision);
        sb.append(", hearing=").append(hearing);
        sb.append(", nearby=").append(nearby);
        sb.append(", anxious=").append(anxious);
        sb.append(", language=").append(language);
        sb.append(", nolan=").append(nolan);
        sb.append(", activity=").append(activity);
        sb.append(", intelligence=").append(intelligence);
        sb.append(", impression=").append(impression);
        sb.append(", frasum=").append(frasum);
        sb.append(", id=").append(id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}