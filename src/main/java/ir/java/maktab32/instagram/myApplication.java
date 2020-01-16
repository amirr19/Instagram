package ir.java.maktab32.instagram;

import ir.java.maktab32.instagram.config.HibernateUtil;
import ir.java.maktab32.instagram.config.hibernate.repositories.UserCrud;
import ir.java.maktab32.instagram.domain.User;
import ir.java.maktab32.instagram.feature.SignUpUser;

import java.util.Scanner;

public class myApplication {
    public static void main(String[] args) {
        HibernateUtil.getSession();
        signUp();

    }
    public static void signUp(){
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
