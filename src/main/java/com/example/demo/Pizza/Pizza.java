package com.example.demo.Pizza;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sun.istack.NotNull;

import javax.persistence.*;


@Entity
@Table(name="pizza")
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pizza_id", nullable = false)
    private String pizzaId;



    @Column(name = "pizza_name", nullable = false)
//    @NotNull
    private String pizzaName;

    @Column(name = "pizza_type", nullable = false)
    private String pizzaType;

    @Column(name = "size", nullable = false)
    private String size;

    @Column(name = "price", nullable = false)
    private double price;

    public Pizza(String pizzaId, String pizzaName, String pizzaType, String size, double price) {
        this.pizzaId = pizzaId;
        this.pizzaName = pizzaName;
        this.pizzaType = pizzaType;
        this.size = size;
        this.price = price;
        System.out.println("pizza");
    }

    public Pizza(){

    }
    public String getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(String pizzaId) {
        this.pizzaId = pizzaId;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}