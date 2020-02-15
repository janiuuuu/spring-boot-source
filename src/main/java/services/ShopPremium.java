package services;

import com.akademia.kodu.pracadomowa1.ConfigurationClass;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("premium")

public class ShopPremium implements Basket {
    private final ConfigurationClass configurationClass;
    private final ProductService productService;

    @Autowired
    public ShopPremium(ProductService productService, ConfigurationClass configurationClass) {
        this.productService = productService;
        this.configurationClass = configurationClass;
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

    @Override
    public void getBill() {

        int suma = 0;
        for (Product product : productService.getProductList()) {
            suma += product.getPrice();
        }

        System.out.println("Cały rachunek wynosi bez VAT-u " + suma);
        double priceWithTax = suma + (suma * configurationClass.getTax() / 100);
        System.out.println("Cena z podatkiem " + priceWithTax + " Podatek VAT = " + configurationClass.getTax());
        double rabat = priceWithTax * configurationClass.getDiscount() / 100;
        System.out.println("Rabat " + rabat );
        double pricaWithDiscout = priceWithTax - rabat;
        System.out.println("Cena z rabatem " + pricaWithDiscout + " Rabat wysokości = " + configurationClass.getDiscount());

    }
}
