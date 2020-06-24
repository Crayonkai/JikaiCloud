package com.jikaigg.cloud.entity;

public class Account {
    private String uid;
    private String userName;
    private String password;
    private String telNumber;

    public Account() {
    }

    public Account(String uid, String userName, String telNumber) {
        this.uid = uid;
        this.userName = userName;
        this.telNumber = telNumber;
    }

    @Override
    public String toString() {
        return "Account [uid=" + uid + ", userName=" + userName + ", password=" + password + ", telNumber=" + telNumber
                + "]";
    }
}

