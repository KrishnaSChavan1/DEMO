package com.example.demo.liberary;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String name;
    private String email;
    private List<Book> bookBorrow;
    public int getUserId() {
        return userId;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public List<Book> getBookBorrow() {
        return bookBorrow;
    }

    

}
