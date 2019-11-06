package com.nice.pojo;


import org.springframework.beans.factory.annotation.Value;

public class User {

    private Long userId;
    @Value("nice")
    private String username;
    @Value("感觉不会再爱了")
    private String note;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
