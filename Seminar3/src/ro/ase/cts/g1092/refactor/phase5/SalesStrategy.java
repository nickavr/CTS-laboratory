package ro.ase.cts.g1092.refactor.phase5;

import ro.ase.cts.g1092.refactor.exceptions.InvalidPriceException;
import ro.ase.cts.g1092.refactor.exceptions.InvalidValueException;
import ro.ase.cts.g1092.refactor.exceptions.InvalidYearsSinceRegistrationException;
import ro.ase.cts.g1092.refactor.phase5.marketing.MarketingStrategyInterface;

public class SalesStrategy {

    private MarketingStrategyInterface marketingStrategyInterface;
    private SalesValidatorsInterface validator;

    public SalesStrategy(MarketingStrategyInterface marketingStrategyInterface, SalesValidatorsInterface validator) {
        if(marketingStrategyInterface == null || validator == null) {
            throw new NullPointerException();
        }
        this.marketingStrategyInterface = marketingStrategyInterface;
        this.validator = validator;
    }

    //Optional: Allowing the change at runtime of the marketing strategy. Depends on your design specs
    public void setMarketingStrategyInterface(MarketingStrategyInterface marketingStrategyInterface) {
        if(marketingStrategyInterface == null) {
            throw new NullPointerException();
        }
        this.marketingStrategyInterface = marketingStrategyInterface;
    }

    public static float getPriceWithDiscount(float initialPrice, float discount, float fidelityDiscount) {
        float initialDiscount = initialPrice - (discount * initialPrice);
        return initialDiscount * ( 1 - fidelityDiscount);
    }

    public float computeFinalPrice(ProductType productType, float initialPrice, int yearsSinceRegistration) throws InvalidPriceException, InvalidYearsSinceRegistrationException {

        validator.validatePrice(initialPrice);
        validator.validateYearsSinceRegistration(yearsSinceRegistration);

        float fidelityDiscount =
                (productType != ProductType.NEW) ?  marketingStrategyInterface.getFidelityDiscount(yearsSinceRegistration) : 0;

        return getPriceWithDiscount(initialPrice, productType.getDiscount(),fidelityDiscount);

    }

}