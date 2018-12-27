package com.zhou.todo.entity;

import java.util.Date;

public class Todo {
    private Integer id;

    private String name;

    private String detail;

    private Date createdat;

    private Date finishedat;

    private String state;

    private String rank;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    public Date getFinishedat() {
        return finishedat;
    }

    public void setFinishedat(Date finishedat) {
        this.finishedat = finishedat;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    public Todo(Integer id, String name, String detail, Date createdat, Date finishedat, String state, String rank) {
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.createdat = createdat;
        this.finishedat = finishedat;
        this.state = state;
        this.rank = rank;
    }

    public Todo() {
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", detail='" + detail + '\'' +
                ", createdat=" + createdat +
                ", finishedat=" + finishedat +
                ", state='" + state + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}