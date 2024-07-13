package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.User;
import web.service.UserServiceImp;

import java.util.List;

@Controller
public class UserController {

    UserServiceImp user = new UserServiceImp();

    @GetMapping("/users")
    public String printCar(@RequestParam(defaultValue = "0") int count, ModelMap model) {
//        List<User> messages = user.getCarUser(count);
//        model.addAttribute("message", messages);
        return "users";
    }

}