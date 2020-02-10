package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgMoreThanForty = UserRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .mapToInt(User::getNumberOfPosts)
                .average()
                .orElse(0.00);
        System.out.println(avgMoreThanForty);

        double avgLessThanForty = UserRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .mapToInt(User::getNumberOfPosts)
                .average()
                .orElse(0.00);
        System.out.println(avgLessThanForty);

    }
}
