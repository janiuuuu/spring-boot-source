package services;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("start")
@Primary
public class ShopStart implements Basket {

    private ProductService productService;

    @Autowired
    public ShopStart(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void showProductInBasket() {
        productService.showProduct();
    }

    @Override
    public String getInfo() {
        return "Start";
    }

    @Override
    public void addProduct(Product product) {
        productService.addProduct(product);
    }

    @Override
    public void getBill() {

    }
}
