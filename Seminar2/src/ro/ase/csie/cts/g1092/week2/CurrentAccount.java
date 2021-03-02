package ro.ase.csie.cts.g1092.week2;
import ro.ase.csie.cts.g1092.week2.exceptions.IllegalTransferException;
import ro.ase.csie.cts.g1092.week2.exceptions.InsufficentFundsException;

import javax.naming.InsufficientResourcesException;

public class CurrentAccount extends BankAccount{

    public static final double MAX_CREDIT = 5000;

    public CurrentAccount(String iban) {
        super(MAX_CREDIT, iban);
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void transfer(Account destination, double amount) throws IllegalTransferException, InsufficentFundsException {
        if(this == destination)
            throw new IllegalTransferException("Transfer didn't succeed");
        this.withdraw(amount);
        destination.deposit(amount);
    }

    @Override
    public void withdraw(double amount) throws InsufficentFundsException {
        if(amount > balance)
            throw new InsufficentFundsException("Not enough money");
        else
            this.balance -= amount;
    }
}
