package com.kodilla.optional;

import com.kodilla.stream.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("user 1",30,100,"test");

        Optional<User> optionalUser = Optional.ofNullable(user);
    }
}
