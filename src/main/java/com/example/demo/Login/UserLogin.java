package com.example.demo.Login;

public class UserLogin{
    public User user;

    public void userLogin(String email, String pass) {
        // Simulate a user login
        if (user != null && user.getEmail().equals(email) && user.pass.equals(pass)) {
            System.out.println("User logged in: " + user.getUserName());
        } else {
            System.out.println("Invalid email or password.");
        }
    }
    public void changePassword(String email, String pass, String newPass){
        if(user != null && user.getEmail().equals(email) && user.getPass().equals(newPass)){
            user.pass = newPass;
            System.err.println("Password updated");
        }
        else{
            System.err.println("does not match");
        }
    }

}
    //  public int userId;
    // public String UserName ;
    // public int role;
    // public String pass;
    // public String email;