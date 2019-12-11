package com.baeldung.hexagonalarchitecture.service;

import com.baeldung.hexagonalarchitecture.entity.Car;
import com.baeldung.hexagonalarchitecture.repos.CarRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private CarRepository carRepository;

    CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
    public ResponseEntity<Car> getCarById(String id) {
        return ResponseEntity.of(carRepository.findById(id));
    }

    public List<Car> findAllCars() {
        return carRepository.findAllCars();
    }
}
