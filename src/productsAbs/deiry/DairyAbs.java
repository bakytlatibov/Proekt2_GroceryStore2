package productsAbs.deiry;


import productsAbs.Product;

import java.time.LocalDate;

public abstract class DairyAbs extends Product {
    public DairyAbs(int id,String name, String company, LocalDate date) {
        super(id,name, company, date);
    }
}


