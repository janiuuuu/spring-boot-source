package com.akademia.kodu.pracadomowa1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import services.Basket;

@SpringBootApplication
public class Pracadomowa1Application {
    Basket basket;

    @Autowired
    public Pracadomowa1Application( Basket basket) {
        this.basket = basket;
    }

    public static void main(String[] args) {
        SpringApplication.run(Pracadomowa1Application.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runShop() {
        System.out.println(basket.getInfo());
        basket.showProductInBasket();

        basket.getBill();

    }
}
