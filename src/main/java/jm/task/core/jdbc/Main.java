package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Ivan", "Ivanov", (byte) 23);
        userService.saveUser("Egor", "Egorov", (byte) 21);
        userService.saveUser("Anton", "Antonov", (byte) 43);
        userService.saveUser("Maxim", "Maximov", (byte) 43);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
