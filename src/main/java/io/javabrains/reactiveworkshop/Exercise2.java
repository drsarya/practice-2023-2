package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        // TODO: Write code here
        ReactiveSources.intNumbersFlux().subscribe(value -> System.out.println(value + " " + Thread.currentThread().getName()));

        // Print all users in the ReactiveSources.userFlux stream
        // TODO: Write code here
//        ReactiveSources.userFlux().subscribe(value -> System.out.println(value + " " + Thread.currentThread().getName()));


//        System.out.println("Press a key to end");
//        System.in.read();


    }

}
