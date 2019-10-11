package com.taotao.pojo;

public class Account {
    private String password;

    private String id;

    private byte[] loginname;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public byte[] getLoginname() {
        return loginname;
    }

    public void setLoginname(byte[] loginname) {
        this.loginname = loginname;
    }
}