package com.dinesh.bigbangboomassignment.data.model;

public class UserResponse {
    private int id;
    private String username;
    private String createdAt;

    public UserResponse(int id, String username, String createdAt) {
        this.id = id;
        this.username = username;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
