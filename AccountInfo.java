/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.Helper;

import java.util.Date;

/**
 *
 * @author student
 */
public class AccountInfo {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /*public Date getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Date date) {
        this.dateJoined = date;
    }
    */
    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    String username;
    String post;
    //Date dateJoined;

    /*
    To be completed
     */
    public AccountInfo(String username, String post /*, Date date*/) {
        this.username = username;
        this.post = post;
        //this.dateJoined = date;
    }

    
}
