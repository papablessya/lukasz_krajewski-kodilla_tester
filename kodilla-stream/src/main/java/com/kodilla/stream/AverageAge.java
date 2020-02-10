package com.kodilla.stream;

public class AverageAge {
    public static void main(String[] args) {
        double avg = UserRepository.getUsersList()
                .stream()
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avg);
    }
}
