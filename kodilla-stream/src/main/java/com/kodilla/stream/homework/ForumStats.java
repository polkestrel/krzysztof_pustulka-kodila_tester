package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double averageNumberOfPostsForUsersAbove40 = UsersRepository.getUsersList()
                .stream()
                .filter(value -> value.getAge() >= 40)
                .mapToInt(User::getNumberOfPosts)
                .average()
                .getAsDouble();
        System.out.println("Average number of posts submitted by users in age above 40 years is equal to: " + averageNumberOfPostsForUsersAbove40);

        double averageNumberOfPostsForUsersBelow40 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(User::getNumberOfPosts)
                .average()
                .getAsDouble();
        System.out.println("Average number of posts submitted by users in age below 40 years is equal to: " + averageNumberOfPostsForUsersBelow40);
    }
}

