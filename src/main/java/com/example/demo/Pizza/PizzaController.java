package com.example.demo.Pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PizzaController {
    @Autowired
    private com.example.demo.Pizza.PizzaService pizzaService;

    @PostMapping("/pizza")
    public Pizza add(@RequestBody Pizza pizza){
        return pizzaService.save(pizza);
    }



    @GetMapping("/pizza")
    public List<Pizza> getAllPizza(){
        return pizzaService.getAll();
    }

    @GetMapping("/pizza/{id}")
    public Pizza getPizza(@PathVariable String id){
        return pizzaService.getPizza(id);
    }

    @DeleteMapping("/pizza/{id}")
    public void delete(@PathVariable String id){
        pizzaService.deletePizza(id);
    }

}