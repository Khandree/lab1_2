package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sharedkernel.Money;

public class DrugTaxCreator implements TaxCreator {
    public Tax createTax(Money money) {
        return new Tax(money.multiplyBy(0.05), "5% (D)");
    }
}