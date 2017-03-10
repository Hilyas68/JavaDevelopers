package com.mediclink.hassan.githublagjavadev.Model;

/**
 * Created by hassan on 3/10/2017.
 */

public class JavaDev {
    private String username, avatarlUrl;

    public JavaDev() {
    }

    public JavaDev(String username, String avatarlUrl) {
        this.username = username;
        this.avatarlUrl = avatarlUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatarlUrl() {
        return avatarlUrl;
    }

    public void setAvatarlUrl(String avatarlUrl) {
        this.avatarlUrl = avatarlUrl;
    }

}