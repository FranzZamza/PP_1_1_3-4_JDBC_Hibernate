package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Artem", "Shamsutdinov", (byte) 24);
        userService.saveUser("Zeka", "Kozlov", (byte) 22);
        userService.saveUser("Dima", "Petrov", (byte) 24);
        userService.saveUser("Vova", "Ivanod", (byte) 22);

        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
