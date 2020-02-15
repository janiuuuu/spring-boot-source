package com.akademia.kodu.pracadomowa1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class Pracadomowa1Application {
    Basket basket;
    ProductService productService;
    @Autowired
    public Pracadomowa1Application(Basket basket,ProductService productService){
        this.basket = basket;
        this.productService =productService;
    }
    public static void main(String[] args) {
        SpringApplication.run(Pracadomowa1Application.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runShop(){
        System.out.println(basket.getInfo());
        basket.showProductInBasket();
        basket.addProduct(new Product("-----Komputer !!!-----", productService.getRandomNumberInRange(50,300)));


    }
}
