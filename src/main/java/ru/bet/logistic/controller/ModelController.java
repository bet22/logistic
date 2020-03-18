package ru.bet.logistic.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.bet.logistic.domain.Model;
import ru.bet.logistic.repo.ModelRepo;

@RestController
@RequestMapping("/api/model")
public class ModelController extends AbstractRestController<Model, ModelRepo>{
    public ModelController(ModelRepo repo) {
        super(repo);
    }
}
