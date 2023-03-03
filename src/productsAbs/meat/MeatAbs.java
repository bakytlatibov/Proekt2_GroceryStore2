package productsAbs.meat;

import productsAbs.Product;

import java.time.LocalDate;

public abstract class MeatAbs extends Product {
    public MeatAbs(int id, String name, String company, LocalDate date) {
        super(id, name, company, date);
    }
}
