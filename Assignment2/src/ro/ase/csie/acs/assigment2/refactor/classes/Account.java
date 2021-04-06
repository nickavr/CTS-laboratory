package ro.ase.csie.acs.assigment2.refactor.classes;

import ro.ase.csie.acs.assigment2.refactor.interfaces.AccountType;
import ro.ase.csie.acs.assigment2.refactor.interfaces.BankActionsInterface;
import ro.ase.csie.acs.assigment2.refactor.services.AccountValidatorService;

public class Account extends BankActionsInterface {
    private Loan loan;
    private AccountType accountType;
    private int daysSinceCreation;
    private static final AccountValidatorService validator = new AccountValidatorService();

    public Account(AccountType accountType) {
        this.accountType = accountType;
        this.loan = null;
        this.daysSinceCreation = 1;
    }

    public void setDaysSinceCreation(int daysSinceCreation) {
        this.daysSinceCreation = daysSinceCreation;
    }

    @Override
    public void makeLoan(double loanValue, double rate, int daysActive) {
       loan = new Loan(loanValue, rate);
    }

    @Override
    public double getMonthlyRate() {
        validator.validateLoan(this.loan);
        return loan.getLoanValue()*loan.getRate();
    }
}
