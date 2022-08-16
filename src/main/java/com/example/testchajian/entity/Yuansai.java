package com.example.testchajian.entity;


import java.io.Serializable;

/**
 * (Yuansai)实体类
 *
 * @author makejava
 * @since 2022-03-18 14:17:22
 */
public class Yuansai {
//    private static final long serialVersionUID = 774585884162779362L;
    /**
    * 赛程编号
    */
    private int detailId;
    /**
    * 球员编号
    */
    private int playerId;
    /**
    * 时间
    */
    private int playerTime;
    /**
    * 位置
    */
    private String weizhi;
    /**
    * 投篮
    */
    private String toulan;
    /**
    * 三分
    */
    private String sanfen;
    /**
    * 罚球
    */
    private String faqiu;
    /**
    * 篮板
    */
    private int lanban;
    /**
    * 助攻
    */
    private int zhugong;
    /**
    * 犯规
    */
    private int fangui;
    /**
    * 抢断
    */
    private int qiangduan;
    /**
    * 失误
    */
    private int shiwu;
    /**
    * 盖帽
    */
    private int gaimao;
    /**
    * 得分
    */

    private int defen;

    public Yuansai(int detailId, int playerId, int playerTime, String weizhi, String toulan, String sanfen, String faqiu, int lanban, int zhugong, int fangui, int qiangduan, int shiwu, int gaimao, int defen) {
        this.detailId = detailId;
        this.playerId = playerId;
        this.playerTime = playerTime;
        this.weizhi = weizhi;
        this.toulan = toulan;
        this.sanfen = sanfen;
        this.faqiu = faqiu;
        this.lanban = lanban;
        this.zhugong = zhugong;
        this.fangui = fangui;
        this.qiangduan = qiangduan;
        this.shiwu = shiwu;
        this.gaimao = gaimao;
        this.defen = defen;
    }

    @Override
    public String toString() {
        return "Yuansai{" +
                "detailId=" + detailId +
                ", playerId=" + playerId +
                ", playerTime=" + playerTime +
                ", weizhi='" + weizhi + '\'' +
                ", toulan='" + toulan + '\'' +
                ", sanfen='" + sanfen + '\'' +
                ", faqiu='" + faqiu + '\'' +
                ", lanban=" + lanban +
                ", zhugong=" + zhugong +
                ", fangui=" + fangui +
                ", qiangduan=" + qiangduan +
                ", shiwu=" + shiwu +
                ", gaimao=" + gaimao +
                ", defen=" + defen +
                '}';
    }

    public int getDetailId() {
        return detailId;
    }

    public void setDetailId(int detailId) {
        this.detailId = detailId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getPlayerTime() {
        return playerTime;
    }

    public void setPlayerTime(int playerTime) {
        this.playerTime = playerTime;
    }

    public String getWeizhi() {
        return weizhi;
    }

    public void setWeizhi(String weizhi) {
        this.weizhi = weizhi;
    }

    public String getToulan() {
        return toulan;
    }

    public void setToulan(String toulan) {
        this.toulan = toulan;
    }

    public String getSanfen() {
        return sanfen;
    }

    public void setSanfen(String sanfen) {
        this.sanfen = sanfen;
    }

    public String getFaqiu() {
        return faqiu;
    }

    public void setFaqiu(String faqiu) {
        this.faqiu = faqiu;
    }

    public int getLanban() {
        return lanban;
    }

    public void setLanban(int lanban) {
        this.lanban = lanban;
    }

    public int getZhugong() {
        return zhugong;
    }

    public void setZhugong(int zhugong) {
        this.zhugong = zhugong;
    }

    public int getFangui() {
        return fangui;
    }

    public void setFangui(int fangui) {
        this.fangui = fangui;
    }

    public int getQiangduan() {
        return qiangduan;
    }

    public void setQiangduan(int qiangduan) {
        this.qiangduan = qiangduan;
    }

    public int getShiwu() {
        return shiwu;
    }

    public void setShiwu(int shiwu) {
        this.shiwu = shiwu;
    }

    public int getGaimao() {
        return gaimao;
    }

    public void setGaimao(int gaimao) {
        this.gaimao = gaimao;
    }

    public int getDefen() {
        return defen;
    }

    public void setDefen(int defen) {
        this.defen = defen;
    }

}
