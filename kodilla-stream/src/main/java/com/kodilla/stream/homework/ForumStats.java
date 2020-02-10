package com.kodilla.stream.homework;

import com.kodilla.stream.UserRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgMoreThanForty = UserRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .mapToInt(u -> u.getNumberOfPosts())
                .average()
                .getAsDouble();
        System.out.println(avgMoreThanForty);

        double avgLessThanForty = UserRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .mapToInt(u -> u.getNumberOfPosts())
                .average()
                .getAsDouble();
        System.out.println(avgLessThanForty);

    }
}
