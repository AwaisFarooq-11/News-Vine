package src.controllers;
import java.util.HashMap;
import java.util.Map;

import src.business.User;

public class UserController {

    private Map<String, User> registeredUsers = new HashMap<>();
    private Map<Integer, String> comments = new HashMap<>(); // Simulates a comment system
    private Map<Integer, Integer> ratings = new HashMap<>(); // Simulates a rating system

    public String registerUser(String userName, int userAge, String userEmail, String password) {
        if (registeredUsers.containsKey(userEmail)) {
            return "Email already registered!";
        }
        User newUser = new User(userName, userAge, userEmail, password);
        registeredUsers.put(userEmail, newUser);
        return "Registered successfully!";
    }

    public String loginUser(String userEmail, String password) {
        User user = registeredUsers.get(userEmail);
        if (user != null && user.getPassword().equals(password)) {
            return "Logged in successfully!";
        }
        return "Invalid email or password!";
    }

    public String followUser(String currentUserEmail, int userIdToFollow) {
        User currentUser = registeredUsers.get(currentUserEmail);
        if (currentUser == null) {
            return "Current user not found!";
        }
        for (User user : registeredUsers.values()) {
            if (user.getUserId() == userIdToFollow) {
                currentUser.followUser(userIdToFollow);
                return "You followed the user successfully!";
            }
        }
        return "User to follow not found!";
    }

    public String commentOnNews(String userEmail, int newsId, String comment) {
        User user = registeredUsers.get(userEmail);
        if (user == null) {
            return "User not found!";
        }
        comments.put(newsId, comment);
        return "Comment added successfully!";
    }

    public String rateNews(String userEmail, int newsId, int ratingValue) {
        User user = registeredUsers.get(userEmail);
        if (user == null) {
            return "User not found!";
        }
        if (ratingValue < 1 || ratingValue > 5) {
            return "Rating value must be between 1 and 5!";
        }
        ratings.put(newsId, ratingValue);
        return "Rating added successfully!";
    }
}
