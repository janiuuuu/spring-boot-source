package com.akademia.kodu.pracadomowa1;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Profile("plus")
public class ShopPlus implements Basket{


    @Override
    public void showProductInBasket() {
    }

    @Override
    public String getInfo() {
        return "Plus";
    }

    @Override
    public void addProduct(Product product) {

    }
}
