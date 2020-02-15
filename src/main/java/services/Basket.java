package services;

import model.Product;

public interface Basket {

   void showProductInBasket();

    String getInfo();

    void addProduct(Product product);

    void getBill();

}
