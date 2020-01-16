package ir.java.maktab32.instagram.repositories;

import ir.java.maktab32.instagram.config.hibernate.repositories.CrudRepo;
import ir.java.maktab32.instagram.domain.User;

public class UserRrepo extends CrudRepo<User,Long> {
    private static UserRrepo userRrepo;

    public static UserRrepo getInstance()
    {
        if(userRrepo== null){
            userRrepo = new UserRrepo();
        }
        return userRrepo;
    }

    private UserRrepo() {
    }

    @Override
    protected Class<User> getEntityClass() {
        return User.class;
    }
}
