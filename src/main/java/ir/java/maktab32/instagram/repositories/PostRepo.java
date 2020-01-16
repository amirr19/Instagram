package ir.java.maktab32.instagram.repositories;

import ir.java.maktab32.instagram.config.hibernate.repositories.CrudRepo;
import ir.java.maktab32.instagram.domain.Post;

public class PostRepo extends CrudRepo<Post,Long> {
    private static PostRepo post;

    public static PostRepo getInstance() {
        if(post==null){
            post= new PostRepo();
        }
        return post;
    }

    private PostRepo() {
    }

    @Override
    protected Class<Post> getEntityClass() {
        return Post.class;
    }
}
