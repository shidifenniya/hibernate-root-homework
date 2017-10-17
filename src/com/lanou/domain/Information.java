package com.lanou.domain;

/**
 * Created by dllo on 17/10/17.
 */
public class Information {

    private int id;

    private String username;

    private String password;

    private String info;

    public Information() {
    }

    public Information(String username, String password, String info) {
        this.username = username;
        this.password = password;
        this.info = info;
    }

    public Information(int id, String username, String password, String info) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.info = info;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Information{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
