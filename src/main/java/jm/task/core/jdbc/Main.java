package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserServiceImpl users = new UserServiceImpl();

        User user1 = new User("Leo","Drozd", (byte) 29);
        User user2 = new User("Kleo","Saytama",(byte) 20);
        User user3 = new User("Moleo","Mengo",(byte) 99);
        User user4 = new User("Galeo","Largonya",(byte) 10);


        users.createUsersTable();
        users.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        users.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        users.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        users.saveUser(user4.getName(), user4.getLastName(), user4.getAge());

        System.out.println("   ");

        for (User user : users.getAllUsers()) {
            System.out.println(user.toString());
        }

        users.cleanUsersTable();
        users.dropUsersTable();

    }
}
