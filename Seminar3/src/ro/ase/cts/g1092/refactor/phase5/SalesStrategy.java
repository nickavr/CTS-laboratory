package ro.ase.cts.g1092.refactor.phase5;

import ro.ase.cts.g1092.refactor.exceptions.InvalidPriceException;
import ro.ase.cts.g1092.refactor.exceptions.InvalidValueException;
import ro.ase.cts.g1092.refactor.exceptions.InvalidYearsSinceRegistrationException;
import ro.ase.cts.g1092.refactor.phase5.marketing.MarketingStrategyInterface;

public class SalesStrategy {

    private MarketingStrategyInterface mkStrategy = null;
    private SalesValidatorsInterface validator = null;

    public SalesStrategy(MarketingStrategyInterface mkStrategy, SalesValidatorsInterface validator) {
        if(mkStrategy == null | validator == null){
            throw new NullPointerException();
        }
        this.mkStrategy = mkStrategy;
        this.validator = validator;
    }
    //optional (depends on design specs): allowing the change at runtime of mk strategy


    public void setMkStrategy(MarketingStrategyInterface mkStrategy) {
        if(mkStrategy == null){
            throw new NullPointerException();
        }
        this.mkStrategy = mkStrategy;
    }

    public static float getPriceWithDiscount(float initialPrice, float discount, float fidelityDiscount){
        float initialDiscount = initialPrice - (discount * initialPrice);
        return initialDiscount * (1-fidelityDiscount);
    }

    public float computeFinalPrice(float initialPrice, ProductType productType, int yearsSinceRegistration) throws InvalidValueException, InvalidPriceException, InvalidYearsSinceRegistrationException {


        float finalPrice = 0;
        float fidelityDiscount = (productType != ProductType.NEW) ? mkStrategy.getFidelityDiscount(yearsSinceRegistration) : 0;
        finalPrice = getPriceWithDiscount(initialPrice, productType.getDiscount(), fidelityDiscount);

        validator.validatePrice(initialPrice);
        validator.validateYearsSinceRegistration(yearsSinceRegistration);

        switch (productType){
            case NEW:
                finalPrice = initialPrice;
                break;
            case DISCOUNTED:
                finalPrice = computeFinalPrice(initialPrice, ProductType.DISCOUNTED, yearsSinceRegistration);
                break;
            case LIMITED_STOCK:
                finalPrice = computeFinalPrice(initialPrice, ProductType.LIMITED_STOCK, yearsSinceRegistration);
                break;
            case LEGACY:
                finalPrice = computeFinalPrice(initialPrice, ProductType.LEGACY, yearsSinceRegistration);
                break;
            default:
                throw new UnsupportedOperationException("Type not managed");
        }

        return finalPrice;
    }
}