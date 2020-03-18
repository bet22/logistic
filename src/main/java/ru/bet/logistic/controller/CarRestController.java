package ru.bet.logistic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.bet.logistic.domain.Car;
import ru.bet.logistic.repo.CarRepo;

@RestController
@RequestMapping("/api/car")
public class CarRestController extends AbstractRestController<Car, CarRepo> {
    public CarRestController(CarRepo repo) {
        super(repo);
    }
}
