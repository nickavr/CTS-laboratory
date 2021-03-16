package ro.ase.cts.g1092.refactor.tests;

import ro.ase.cts.g1092.refactor.exceptions.InvalidPriceException;
import ro.ase.cts.g1092.refactor.exceptions.InvalidValueException;
import ro.ase.cts.g1092.refactor.exceptions.InvalidYearsSinceRegistrationException;
import ro.ase.cts.g1092.refactor.phase5.ProductType;
import ro.ase.cts.g1092.refactor.phase5.SalesStrategy;
import ro.ase.cts.g1092.refactor.phase5.marketing.MarketingStrategyInterface;
import ro.ase.cts.g1092.refactor.phase5.services.Marketing2021Service;
import ro.ase.cts.g1092.refactor.phase5.services.ValidatorService;

public class TestSalesStrategy {
    public static void main(String[] args) throws InvalidValueException, InvalidPriceException, InvalidYearsSinceRegistrationException {
        Marketing2021Service mkService = new Marketing2021Service();
        ValidatorService validator = new ValidatorService();
        SalesStrategy sales = new SalesStrategy(mkService, validator);

        float finalPrice = sales.computeFinalPrice(100, ProductType.DISCOUNTED, 5);
        System.out.println("The final price" + finalPrice);
        sales.setMkStrategy(new MarketingStrategyInterface() {
            @Override
            public float getFidelityDiscount(int yearsSinceRegistration) {
                return 0.5f;
            }
        });
    }
}
