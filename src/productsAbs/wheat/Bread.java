package productsAbs.wheat;

import java.time.LocalDate;

public class Bread extends WheatAbs {
    public Bread(int id, String name, String company, LocalDate date) {
        super(id, name, company, date);
    }
}
