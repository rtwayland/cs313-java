/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.discussionthread;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Comment {

    private String content;
    private String date;
    private String user;

    public Comment() {
        content = "";
        date = "";
        user = "";
    }

    public Comment(String content, String date, String user) {
        this.content = content;
        this.date = date;
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return date + "<br>" + user + "<br>" + content;
    }
    
    public String toFileString() {
        return date + ", " + user + ", " + content;
    }
    
    public void loadFromFileString(String str) {
            // TODO: Validation should be done here
            String[] parts = str.split(", ");
 
            date = parts[0];
            user = parts[1];
            content = parts[2];
     }
}
