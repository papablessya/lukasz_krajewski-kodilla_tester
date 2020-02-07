package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UserManager {
    public static void main(String[] args) {
//        UserRepository.getUsersList()
        List<String> usernames = UserRepository.getUsersList()
                 .stream()
                .filter(u -> u.getGroup().equals("Chemists"))
                .map(UserManager::getUserName)
//                .forEach(un -> System.out.println(un));
                .collect(Collectors.toList());
        System.out.println(usernames);
    }
    public static String getUserName(User user){
        return user.getUserName();
    }
}
