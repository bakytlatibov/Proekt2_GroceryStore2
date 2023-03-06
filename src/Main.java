import com.sun.security.jgss.GSSUtil;
import exceptions.MissMatchException;
import productStore.Store;
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
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Milk milk = new Milk(1, "Milk", "MILKA", LocalDate.of(2023, 3, 25));
        Yogurt yogurt = new Yogurt(3, "Yogurt", "MILKA", LocalDate.of(2023, 3, 12));
        Meat meat = new Meat(4, "Meat", "TOIBOSS", LocalDate.of(2023, 4, 22));
        Sausage sausage = new Sausage(5, "Soursage", "TOIBOSS", LocalDate.of(2023, 5, 26));
        Fish fish = new Fish(6, "Fish", "TOIBOSS", LocalDate.of(2023, 4, 7));
        Bread bread = new Bread(7, "Bread", "NUR", LocalDate.of(2023, 5, 25));
        Kefir kefir = new Kefir(2, "Kefir", "MILKA", LocalDate.of(2023, 3, 12));
        Pasta pasta = new Pasta(8, "Pasta", "NUR", LocalDate.of(2023, 5, 10));
        Flour flour = new Flour(9, "Flour", "NUR", LocalDate.of(2023, 5, 30));
        List<Product> products = new ArrayList<>(Arrays.asList(meat, milk, yogurt, fish, flour, pasta, bread, sausage, kefir));

        ServiceImpl service = new ServiceImpl();
        service.addProduct(products);
        service.updateProducts(products);

        try {
            System.out.println(ANSI_YELLOW + "Введитите логин и пароль :"+ANSI_RESET);
            service.checkManage(scanner.nextLine(), scanner.nextLine(), products);
        } catch (MissMatchException e) {
            System.out.println(e.getMessage());
        }


    }
}