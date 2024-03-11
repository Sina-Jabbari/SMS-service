/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.Helper;

import java.util.ArrayList;

/**
 *
 * @author student
 */

public class UserInfo {
    /*to be completed
    For now, we just add book info to make the example work. This class must be completed in future
    */
    private ArrayList <BookBorrowed> bookborrowed = new ArrayList<>();
    public void addBook(BookBorrowed book){
        bookborrowed.add(book);
    }
    public ArrayList<BookBorrowed> getBookBorrowed(){
        return bookborrowed;
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

    String username;
    String password;
    
    public UserInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }


}
