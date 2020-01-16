package ir.java.maktab32.instagram;

import ir.java.maktab32.instagram.config.HibernateUtil;
import ir.java.maktab32.instagram.config.hibernate.repositories.UserCrud;
import ir.java.maktab32.instagram.domain.User;
import ir.java.maktab32.instagram.repositories.PostRepo;
import ir.java.maktab32.instagram.repositories.UserRrepo;

import java.util.Scanner;

public class myApplication {
    static Scanner scanner=new Scanner(System.in);
    static UserRrepo userRrepo=UserRrepo.getInstance();
    static PostRepo postRepo=PostRepo.getInstance();
    public static void main(String[] args) {
        System.out.println("1.Sign in\n2.Sign Up.\nEnter:");
        int option=Integer.parseInt(scanner.nextLine());
        switch (option){
            case 1:
                signUp();
                break;
            case 2:
                signIn();
                break;

        }

    }

    private static void signIn() {
        System.out.println("Sign in");
        System.out.println("User Name:");
        String userName = scanner.next();
        System.out.println("Password:");
        String password = scanner.next();

    }

    public static void signUp(){
        System.out.println("Sign Up");
        System.out.println("User Name:");
        String userName = scanner.next();
        System.out.println("Password:");
        String password = scanner.next();
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        .save(user);
    }

}
