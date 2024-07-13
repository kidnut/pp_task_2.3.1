package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImpl implements CarDao {
    public List<Car> cars = new ArrayList<>();

    {
        addCar((createCar("Nissan", "350Z", 2010)));
        addCar((createCar("Nissan", "Skyline", 2006)));
        addCar((createCar("Mazda", "RX-7", 2002)));
        addCar((createCar("Toyota", "Supra", 2008)));
        addCar((createCar("Lexus", "IS", 2013)));
    }

    public static Car createCar(String brand, String model, int year) {
        return new Car(brand, model, year);
    }

    @Override
    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> getNumberCars(int num) {
        if (num >= cars.size()) {
            return cars;
        }
        return cars.stream().limit(num).collect(Collectors.toList());
    }
}
