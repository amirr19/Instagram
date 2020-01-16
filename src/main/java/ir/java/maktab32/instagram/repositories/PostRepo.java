package ir.java.maktab32.instagram.repositories;

public class PostRepo {
    private static PostRepo post= new PostRepo();

    public static PostRepo getInstance() {
        return post;
    }

    private PostRepo() {
    }
}
