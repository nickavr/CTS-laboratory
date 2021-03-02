package ro.ase.csie.cts.g1092.week2;
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
    public void transfer(Account destination, double amount) throws InsufficientResourcesException {
        if(this == destination)
            //throw new IllegalTransferException()
        this.withdraw(amount);
        destination.deposit(amount);
    }

    @Override
    public void withdraw(double amount) throws InsufficientResourcesException {
        if(amount > balance)
            throw new InsufficientResourcesException("Not enough money");
        else
            this.balance -= amount;
    }
}
