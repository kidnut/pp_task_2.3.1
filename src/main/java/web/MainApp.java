package web;

import web.config.AppConfig;
import web.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

//        userService.add(new User(new Car("Opel", 3), "User1", "Lastname1", "user1@mail.ru"));
//        userService.add(new User(new Car("BMW", 5), "User2", "Lastname2", "user2@mail.ru"));
//        userService.add(new User(new Car("Mersedes", 4), "User3", "Lastname3", "user3@mail.ru"));
//        userService.add(new User(new Car("Audi", 8), "User4", "Lastname4", "user4@mail.ru"));
//
//        List<User> users = userService.listUsers();
//        for (User user : users) {
//            System.out.println("Id = " + user.getId());
//            System.out.println("First Name = " + user.getFirstName());
//            System.out.println("Last Name = " + user.getLastName());
//            System.out.println("Email = " + user.getEmail());
//            System.out.println("Model = " + user.getUserCar().getModel());
//            System.out.println("Series = " + user.getUserCar().getSeries());
//            System.out.println();
//        }
//
//        List<User> carUsers = userService.getCarUser("BMW", 5);
//        System.out.println(carUsers.toString());

        context.close();
    }
}
