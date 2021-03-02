package ro.ase.csie.cts.g1092.week2;

import javax.naming.InsufficientResourcesException;

public abstract class Account {

    public abstract double getBalance();
    public abstract void deposit(double amount); //in order to store any type of deposit we could use Object
    public abstract void transfer(Account destination, double amount) throws InsufficientResourcesException;
    public abstract void withdraw(double amount) throws InsufficientResourcesException;
}
