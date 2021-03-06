package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Kolya", "Vovovich", (byte) 16);
        userService.saveUser("Misha", "Lobov", (byte) 29);
        userService.saveUser("Vasiya", "Makarov", (byte) 54);
        userService.saveUser("Petya", "Gigorov", (byte) 34);
        userService.getAllUsers();
        userService.removeUserById(2);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
