package service;

import productStore.Store;
import productsAbs.Product;

import java.util.List;

public interface Service {
     void addProduct(List<Product> product);

     void updateProducts(List<Product>products);


    void checkManage(String login, String password,List<Product>products);


}
