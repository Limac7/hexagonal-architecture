package com.baeldung.hexagonalarchitecture.controller;

import com.baeldung.hexagonalarchitecture.entity.Car;
import com.baeldung.hexagonalarchitecture.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    private CarService carService;

    IndexController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/carInformation/{id}")
    public ResponseEntity<Car> carInformation(@PathVariable("id") String id) {
        return carService.getCarById(id);
    }

    @GetMapping
    public List<Car> allCars() {
        return carService.findAllCars();
    }
}
