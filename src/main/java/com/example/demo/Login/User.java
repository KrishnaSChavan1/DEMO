package com.example.demo.Login;


public class User {
    public int userId;
    public String UserName ;
    public int role;
    public String pass;
    public String email;
    public User(int userId, String userName, int role, String pass, String email) {
        this.userId = userId;
        this.UserName = userName;
        this.role = role;
        this.pass = pass;
        this.email = email;
    }
    public String getUserName() {
        return UserName;
    }
    public int getRole() {
        return role;
    }
    public String getEmail() {
        return email;
    }
    public String getPass(){
        return pass;
    }
    
    
}