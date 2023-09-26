package io.javabrains.reactiveworkshop;

import reactor.core.scheduler.Schedulers;

import java.io.IOException;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()
        Schedulers.newSingle("Thread-subscribe-connection")
        // Print the value from intNumberMono when it emits
        // TODO: Write code here
        ReactiveSources.intNumberMono().subscribeOn(Schedulers.parallel()).subscribe(v -> System.out.println(v));


        // Get the value from the Mono into an integer variable
        // TODO: Write code here
        Integer block = ReactiveSources.intNumberMono().block();

        System.out.println("Press a key to end");
        System.in.read();
    }

}
