/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.discussionthread;

import static java.lang.System.out;

/**
 * 
 * @author user
 */
public class User {
    private String name;
    private String password;

    public User() {
        name = "";
        password = "";
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    
    public boolean isUser(String userName, String userPass) {
        if (userName.equals(this.name)) {
            if (userPass.equals(this.password)) {
                return true;
            }
        }
        
        return false;
    }
    
    public void loadFromFileString(String str) {
            String[] parts = str.split(", ");
 
            name = parts[0];
            password = parts[1];
     }
    
}
