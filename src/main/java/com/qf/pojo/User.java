package com.qf.pojo;

public class User {
    private int uid;
    private String uname;
    private String password;
    private int status;

    public User(int uid, String uname, String password, int status) {
        this.uid = uid;
        this.uname = uname;
        this.password = password;
        this.status = status;
    }

    public User() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }
}