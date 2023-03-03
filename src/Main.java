import productsAbs.Product;
import productsAbs.deiry.Kefir;
import productsAbs.deiry.Milk;
import productsAbs.deiry.Yogurt;
import productsAbs.meat.Fish;
import productsAbs.meat.Meat;
import productsAbs.meat.Sausage;
import productsAbs.wheat.Bread;
import productsAbs.wheat.Flour;
import productsAbs.wheat.Pasta;
import service.ServiceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Milk milk = new Milk(1, "Milk", "MILKA", LocalDate.of(2023, 4, 2));
        Yogurt yogurt = new Yogurt(3, "Yogurt", "MILKA", LocalDate.of(23, 5, 20));
        Meat meat = new Meat(4, "Meat", "TOIBOSS", LocalDate.of(2023, 5, 3));
        Sausage sausage = new Sausage(5, "Soursage", "TOIBOSS", LocalDate.of(2023, 4, 10));
        Fish fish = new Fish(6, "Fish", "TOIBOSS", LocalDate.of(2023, 4, 4));
        Bread bread = new Bread(7, "Bread", "NUR", LocalDate.of(2023, 3, 25));

        Kefir kefir = new Kefir(2, "Kefir", "Mil", LocalDate.of(2023, 4, 5));

        Pasta pasta = new Pasta(8, "Pasta", "NUR", LocalDate.of(2023, 5, 10));

        Flour flour = new Flour(9, "Flour", "NUR", LocalDate.of(2023, 5, 30));


        ServiceImpl service = new ServiceImpl();
        List<Product> products = new ArrayList<>(Arrays.asList(meat, milk, yogurt, fish, flour, pasta, bread, sausage, kefir));
        service.addProduct(products);
//        service.updateProducts(products);
      Scanner scanner=new Scanner(System.in);
        service.CheckManage(products,scanner.nextLine(),scanner.nextLine());

    }
}