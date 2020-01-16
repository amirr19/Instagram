package ir.java.maktab32.instagram.domain.post;

import ir.java.maktab32.instagram.config.hibernate.repositories.CrudRepo;

public class PostCrud extends CrudRepo {
    @Override
    protected Class getEntityClass() {
        return Post.class;
    }
}
