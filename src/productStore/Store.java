package productStore;

import manager.Manager;
import productsAbs.Product;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private  List<Product> products=new ArrayList<>();
    private  List<Product>discounts=new ArrayList<>();

    public Store(List<Product> products, List<Product> discounts,Manager manager) {
        this.products = products;
        this.discounts = discounts;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getDiscounts() {
        return discounts;
    }
    public void setDiscounts(List<Product> discounts) {
        this.discounts = discounts;
    }



    @Override
    public String toString() {
        return "Store{" +
                "products=" + products +
                ", discounts=" + discounts +
                '}';
    }
}

