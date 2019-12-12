package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception {
        Car car;
        car = new Car("2005", "Toyota", "Camry");
        repository.save(car);

        car = new Car("2010", "Ford", "Mustang");
        repository.save(car);

        car = new Car("2012", "Honda", "Civic");
        repository.save(car);
    }
}
