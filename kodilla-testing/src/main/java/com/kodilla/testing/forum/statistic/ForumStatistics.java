package com.kodilla.testing.forum.statistic;

import lombok.Getter;

import java.util.List;

@Getter
public class ForumStatistics {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        List<String> users = statistics.usersNames();
        if (users != null) {
            numberOfUsers = users.size();
        } else {
            numberOfUsers = 0;
        }

        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (numberOfUsers > 0) {
            avgPostsPerUser = (double) numberOfPosts / numberOfUsers;
            avgCommentsPerUser = (double) numberOfComments / numberOfUsers;
        } else {
            avgPostsPerUser = 0;
            avgCommentsPerUser = 0;
        }

        if (numberOfPosts > 0) {
            avgCommentsPerPost = (double) numberOfComments / numberOfPosts;
        } else {
            avgCommentsPerPost = 0;
        }
    }

        public void showStatistics() {
            System.out.println("Number of users: " + numberOfUsers);
            System.out.println("Number of posts: " + numberOfPosts);
            System.out.println("Number of comments: " + numberOfComments);
            System.out.println("Average posts per user: " + avgPostsPerUser);
            System.out.println("Average comments per user: " + avgCommentsPerUser);
            System.out.println("Average comments per post: " + avgCommentsPerPost);
        }

}
