package ro.ase.csie.cts.g1092.week2.exceptions;

public class InsufficentFundsException extends Exception{

    public InsufficentFundsException(String msg){
        super(msg); //call Exception constructor with the message
    }

    public InsufficentFundsException() {
    }
}
