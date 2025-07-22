package com.example.demo.Login;

public interface Method {
    public void userLogin(String email,String pass);
    public void userRegister(String email, String pass, int role);
    public void changePassword(String email,String pass, String newPass);
}
