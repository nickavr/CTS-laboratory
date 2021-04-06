package ro.ase.csie.acs.assigment2.refactor.services;

import ro.ase.csie.acs.assigment2.refactor.classes.Loan;

public class AccountValidatorService {
    public void validateLoan(Loan loan) throws NullPointerException{
        if(loan == null){
            throw new NullPointerException();
        }
    }
}
