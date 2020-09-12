package com.manycode.app.model;

public class User2 {
    private String userId;
    

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public void initData(String userId) {
        this.setUserId("2");

    }
}
