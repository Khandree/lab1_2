package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;
import pl.com.bottega.ecommerce.sharedkernel.Money;

/**
 * Created by Agata on 2017-04-24.
 */
public interface ITaxCalculator {
    Tax calculateTax (ProductType type, Money price);
}
