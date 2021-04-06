package ro.ase.csie.acs.assigment2.refactor.interfaces;

public abstract class BankActionsInterface implements LoanImportantActionsInterface {
    public void makeLoan(double loanValue, double rate, int daysActive){};
}
