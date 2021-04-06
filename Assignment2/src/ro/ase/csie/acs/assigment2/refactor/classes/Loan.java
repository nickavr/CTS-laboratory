package ro.ase.csie.acs.assigment2.refactor.classes;

import ro.ase.csie.acs.assigment2.refactor.exceptions.InvalidLoanRateException;
import ro.ase.csie.acs.assigment2.refactor.exceptions.InvalidLoanValueException;
import ro.ase.csie.acs.assigment2.refactor.services.LoanValidatorService;

public class Loan {
    private double loanValue;
    private double rate;
    private static final LoanValidatorService validator = new LoanValidatorService();

    public Loan(double loanValue, double rate) {
        this.loanValue = loanValue;
        this.rate = rate;
    }

    public double getLoanValue() {
        System.out.println("The loan value is " + this.loanValue);
        return loanValue;
    }

    public void setLoanValue(double loanValue) throws InvalidLoanValueException {
        validator.validateLoanValue(loanValue);
        this.loanValue = loanValue;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanValue=" + loanValue +
                ", rate=" + rate +
                '}';
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) throws InvalidLoanRateException {
        validator.validateRateValue(rate);
        this.rate = rate;
    }

}
