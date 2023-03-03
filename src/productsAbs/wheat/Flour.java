package productsAbs.wheat;

import java.time.LocalDate;

public class Flour extends WheatAbs {
    public Flour(int id, String name, String company, LocalDate date) {
        super(id, name, company, date);
    }
}
