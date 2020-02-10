package com.kodilla.optional;

import com.kodilla.stream.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("user 1",30,100,"test");

        Optional<User> optionalUser = Optional.ofNullable(user);

        optionalUser.ifPresent(u -> System.out.println(u.getUserName()));
//        String username =
//                optionalUser.orElse(new User("",0,0,"")).getUserName();
//
//        System.out.println(username);
    }
}
