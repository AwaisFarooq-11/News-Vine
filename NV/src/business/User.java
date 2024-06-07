package src.business;

import java.util.HashSet;
import java.util.Set;

public class User {

    private int user_id;
    private String user_name;
    private int user_age;
    private String user_email;
    private String password;
    private Set<Integer> followingUsers;

    private static int nextUserId = 1;

    public User(String user_name, int user_age, String user_email, String password) {
        this.user_id = nextUserId++;
        this.user_name = user_name;
        this.user_age = user_age;
        this.user_email = user_email;
        this.password = password;
        this.followingUsers = new HashSet<>();
    }

    public int getUserId() {
        return user_id;
    }

    public String getUserName() {
        return user_name;
    }

    public int getUserAge() {
        return user_age;
    }

    public String getUserEmail() {
        return user_email;
    }

    public String getPassword() {
        return password;
    }

    public void followUser(int userId) {
        followingUsers.add(userId);
    }

    public String commentOnNews(int user_id, String comment) {
        return "Comment added successfully!";
    }

    public String rateNews(int news_id, int rating_value) {
        return "Rating added successfully!";
    }
}
