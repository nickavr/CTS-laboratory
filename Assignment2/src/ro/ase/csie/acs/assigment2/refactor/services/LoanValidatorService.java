package ro.ase.csie.acs.assigment2.refactor.services;

import ro.ase.csie.acs.assigment2.refactor.exceptions.InvalidLoanRateException;
import ro.ase.csie.acs.assigment2.refactor.exceptions.InvalidLoanValueException;

public class LoanValidatorService {

    public void validateLoanValue(double loanValue) throws InvalidLoanValueException {
        if(loanValue < 0){
            throw new InvalidLoanValueException();
        }
    }

    public void validateRateValue(double rate) throws InvalidLoanRateException {
        if(rate < 0){
            throw new InvalidLoanRateException();
        }
    }
}
