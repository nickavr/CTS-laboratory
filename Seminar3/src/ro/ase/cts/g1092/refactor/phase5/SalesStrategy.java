package ro.ase.cts.g1092.refactor.phase5;

import ro.ase.cts.g1092.refactor.exceptions.InvalidValueException;

public class SalesStrategy {
    public static final int FIDELITY_YEARS_THRESHOLD = 10;
    public static final float MAX_FIDELITY_DISCOUNT = 0.15f;

    public static float getFidelityDiscount(int yearsSinceRegistration){
        return  (yearsSinceRegistration > FIDELITY_YEARS_THRESHOLD) ?
                MAX_FIDELITY_DISCOUNT : (float) yearsSinceRegistration /100;

    }

    public static float getPriceWithDiscount(float initialPrice, float discount, float fidelityDiscount){
        float initialDiscount = initialPrice - (discount * initialPrice);
        return initialDiscount * (1-fidelityDiscount);
    }

    public float computeFinalPrice(float initialPrice, ProductType productType, int yearsSinceRegistration) throws InvalidValueException {
        if(initialPrice <= 0 || yearsSinceRegistration < 0){
            throw new InvalidValueException();
        }

        float finalPrice = 0;
        float fidelityDiscount = (productType != ProductType.NEW) ? getFidelityDiscount(yearsSinceRegistration) : 0;
        finalPrice = getPriceWithDiscount(initialPrice, productType.getDiscount(), fidelityDiscount);
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