package services;

import model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Service
public class ProductService {

    private List<Product> productList;

    ProductService(){
        Product product1 = new Product("TV",getRandomNumberInRange(50,300));
        Product product2 = new Product("Akwaruim",getRandomNumberInRange(50,300));
        Product product3 = new Product("Szafa",getRandomNumberInRange(50,300));
        Product product4 = new Product("Krzesło",getRandomNumberInRange(50,300));
        Product product5 = new Product("Głośniki",getRandomNumberInRange(50,300));

        productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
    }

    public void showProduct(){
        productList.forEach(System.out::println);
    }
    public static int getRandomNumberInRange(int min, int max) {

        Random r = new Random();
        return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();

    }

    public void addProduct(Product product){

        productList.add(product);

        productList.forEach(System.out::println);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
