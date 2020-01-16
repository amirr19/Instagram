package ir.java.maktab32.instagram.repositories;

public class UserRrepo {
    private static UserRrepo userRrepo = new UserRrepo();

    public static UserRrepo getInstance() {
        return userRrepo;
    }

    private UserRrepo() {
    }
}
