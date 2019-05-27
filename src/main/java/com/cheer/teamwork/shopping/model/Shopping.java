package com.cheer.teamwork.shopping.model;

import java.util.StringJoiner;

public class Shopping {
    private String id;
    private String shangPingXinXi;
    private Integer shuLiang;
    private Double danJia;

    public Shopping(String id, String shangPingXinXi, Integer shuLiang, Double danJia) {
        this.id = id;
        this.shangPingXinXi = shangPingXinXi;
        this.shuLiang = shuLiang;
        this.danJia = danJia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShangPingXinXi() {
        return shangPingXinXi;
    }

    public void setShangPingXinXi(String shangPingXinXi) {
        this.shangPingXinXi = shangPingXinXi;
    }

    public Integer getShuLiang() {
        return shuLiang;
    }

    public void setShuLiang(Integer shuLiang) {
        this.shuLiang = shuLiang;
    }

    public Double getDanJia() {
        return danJia;
    }

    public void setDanJia(Double danJia) {
        this.danJia = danJia;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Shopping.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("shangPingXinXi='" + shangPingXinXi + "'")
                .add("shuLiang=" + shuLiang)
                .add("danJia=" + danJia)
                .toString();
    }
}
