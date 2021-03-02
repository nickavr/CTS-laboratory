package ro.ase.csie.cts.g1092.week2;

import ro.ase.csie.cts.g1092.week2.exceptions.IllegalTransferException;
import ro.ase.csie.cts.g1092.week2.exceptions.InsufficentFundsException;


public abstract class Account {

    public abstract double getBalance();
    public abstract void deposit(double amount); //in order to store any type of deposit we could use Object
    public abstract void transfer(Account destination, double amount) throws IllegalTransferException, InsufficentFundsException;
    public abstract void withdraw(double amount) throws InsufficentFundsException;
}
