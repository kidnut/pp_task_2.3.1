package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Controller
public class CarController {

    CarDaoImpl carDao = new CarDaoImpl();

    @GetMapping("/cars")
    public String printCar(@RequestParam(defaultValue = "0") int count, ModelMap model) {
        List<Car> messages = carDao.getNumberCars(count);
        model.addAttribute("message", messages);
        return "/cars";
    }

}