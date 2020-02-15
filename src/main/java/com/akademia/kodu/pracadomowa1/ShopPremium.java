package com.akademia.kodu.pracadomowa1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Profile("premium")

public class ShopPremium implements Basket{
    private ProductService productService;
    @Autowired
    ShopPremium(ProductService  productService){
        this.productService = productService;
    }
    @Override
    public void showProductInBasket() {
       productService.showProduct();
    }

    @Override
    public String getInfo() {
        return "Premium";
    }

    @Override
    public void addProduct(Product product) {

    }
}
