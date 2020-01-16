package ir.java.maktab32.instagram.config.hibernate.repositories;

import ir.java.maktab32.instagram.domain.User;

public class UserCrud extends CrudRepo<User,Long> {
    @Override
    protected Class<User> getEntityClass() {
        return User.class;
    }
}
