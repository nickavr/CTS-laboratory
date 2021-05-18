package ro.ase.csie.cts.g1092.testing.Main;

import ro.ase.csie.cts.g1092.testing.models.MathOperations;

public class App {
    public static void main(String[] args) {
        System.out.println("App started");
        int a = 5;
        int b = 5;
        int expectedRes = 10;
        int result = MathOperations.add(a, b);

        if(result == expectedRes){
            System.out.println("We know how to add");
        }
        else{
            System.out.println("Take some math classes");
        }
    }
}

