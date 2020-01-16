package ir.java.maktab32.instagram;

import ir.java.maktab32.instagram.config.HibernateUtil;
import ir.java.maktab32.instagram.feature.SignUpUser;

public class myApplication {
    public static void main(String[] args) {
        HibernateUtil.getSession();
        new SignUpUser().signUp();
    }
}
