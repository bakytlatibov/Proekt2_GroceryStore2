package productsAbs.wheat;

import productsAbs.Product;

import java.time.LocalDate;

public abstract class WheatAbs extends Product {
    public WheatAbs(int id, String name, String company, LocalDate date) {
        super(id, name, company, date);
    }
}
