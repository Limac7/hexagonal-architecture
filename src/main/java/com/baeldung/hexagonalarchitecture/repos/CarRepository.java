package com.baeldung.hexagonalarchitecture.repos;

import com.baeldung.hexagonalarchitecture.entity.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, String> {
    List<Car> findAllCars();
}
