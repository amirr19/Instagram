package ir.java.maktab32.instagram.feature;

import ir.java.maktab32.instagram.config.HibernateUtil;
import ir.java.maktab32.instagram.config.hibernate.repositories.UserCrud;
import ir.java.maktab32.instagram.domain.User;

import java.util.Scanner;

public class SignUpUser {
    public void signUp(){
        Scanner input = new Scanner(System.in);
        System.out.println("Sign Up");
        System.out.println("User Name:");
        String userName = input.next();
        System.out.println("Password:");
        String password = input.next();
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        new UserCrud().save(user);
    }


}
