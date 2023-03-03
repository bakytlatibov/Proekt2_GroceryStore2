package service;

import manager.Manager;
import productStore.Store;
import productsAbs.Product;

import java.lang.management.MemoryManagerMXBean;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceImpl implements Service {
    private Store store;
    private Manager manager;

    @Override
    public void addProduct() {
        System.out.println("Принятые товары :  ");
        List<Product> productList = products.stream().filter(x -> x.getCompany().equals("TOIBOSS")
                || x.getCompany().equals("MILKA")
                || x.getCompany().equals("NUR")).filter(y -> y.getDate().isAfter(LocalDate.now().plusDays(30))).toList();
        productList.forEach(System.out::println);
    }
    @Override
    public void updateProducts(List<Product>products) {
        System.out.println("Акционные продукты");
        List<Product>update=products.stream().filter(x -> x.getCompany().equals("TOIBOSS")
                || x.getCompany().equals("MILKA")
                || x.getCompany().equals("NUR")).filter(y -> y.getDate().isAfter(LocalDate.now().plusDays(7))).toList();

    }
    @Override
    public void CheckManage(String login,String password) {
if (login.equals(manager.getLogin())&& password.equals(manager.getPassword())){
    products.forEach(System.out::println);

       }

    }
}
