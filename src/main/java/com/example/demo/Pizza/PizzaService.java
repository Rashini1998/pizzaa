package com.example.demo.Pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PizzaService {

//    EntityManager entityManager;
//    public PizzaService( EntityManager entityManager){
//        this.entityManager = entityManager;
//    }

    @Autowired
    private PizzaRepository pizzaRepository;

    public Pizza save( Pizza pizza){
//
        pizzaRepository.save(pizza);
        //System.out.println(pizza.getPizzaId());
        return pizzaRepository.save(pizza);
    }


    public List<Pizza> getAll(){
        return pizzaRepository.findAll();
    }
    public Pizza getPizza(String id){
        return pizzaRepository.findById(id).get();
    }

    public void deletePizza(String id){
        pizzaRepository.deleteById(String.valueOf(id));
    }

//    public void updatePizza(String id, Pizza pizza){
//
//        pizzaRepository.save(pizza);
//    }
}