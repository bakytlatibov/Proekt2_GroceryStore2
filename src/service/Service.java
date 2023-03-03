package service;

import productsAbs.Product;

import java.util.List;

public interface Service {
    void addProduct(List<Product> product);

    void updateProducts(List<Product> product);

    void CheckManage(List<Product>products,String login, String password);


}
