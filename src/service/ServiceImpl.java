package service;

import exceptions.MissMatchException;
import manager.Manager;
import productStore.Store;
import productsAbs.Product;

import java.time.LocalDate;
import java.util.List;

public class ServiceImpl implements Service {
    private final Store store = new Store();
    private final Manager manager = new Manager();

    @Override
    public void addProduct(List<Product> product) {
        List<Product> products1 = product.stream()
                .filter(x ->
                        x.getCompany().equals("MILKA")
                                || x.getCompany().equals("NUR")
                                || x.getCompany().equals("TOIBOSS"))
                .filter(y -> y.getDate().isAfter(LocalDate.now().plusDays(30))).toList();
//        for (Product product1 : products1) {
//            store.getProducts().add(product1);
//        }
        products1.forEach(product1 -> store.getProducts().add(product1));
        System.out.println("Принятые товары : ");
        store.getProducts().forEach(System.out::println);
    }

    @Override
    public void updateProducts(List<Product> products) {

        products.removeIf(product -> product.getDate().isBefore(LocalDate.now()));
        List<Product> productList = products.stream()
                .filter(x -> x.getCompany().equals("MILKA") ||
                        x.getCompany().equals("NUR") ||
                        x.getCompany().equals("TOIBOSS")).
                filter(y -> !y.getDate().isAfter(LocalDate.now().plusDays(7))).toList();
//        for (Product product1 : productList) {
//            store.getDiscounts().add(product1);
//        }
        productList.forEach(product -> store.getDiscounts().add(product));
        System.out.println("Акционные товары : ");
        store.getDiscounts().forEach(System.out::println);
    }

    @Override
    public void checkManage(String login, String password, List<Product> products) {

        if (login.equals(manager.getLogin()) && password.equals(manager.getPassword())) {
            System.out.println("Добро пожаловать Бакыт !");
            for (Product product : store.getProducts()) {

                System.out.print("Принятые товары : ");
                System.out.println(product);
            }
            for (Product discount : store.getDiscounts()) {
                System.out.print("Акционные товары : ");
                System.out.println(discount);
            }
        } else throw new MissMatchException("Логин или пороль не правильный ! ");
    }
}
