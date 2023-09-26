package io.javabrains.reactiveworkshop;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

import java.io.IOException;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Subscribe to a flux using the error and completion hooks
        // TODO: Write code here
//        ReactiveSources.intNumbersFlux().subscribe((v)-> System.out.println(v),
//                (error)-> System.out.println(error), ()-> System.out.println("END!"));

        // Subscribe to a flux using an implementation of BaseSubscriber
        // TODO: Write code here
        ReactiveSources.userFlux().subscribe(new SampleBaseSubscriber<>());


        System.out.println("Press a key to end");
        System.in.read();
    }

}

class SampleBaseSubscriber<T> extends BaseSubscriber<T> {
    @Override
    protected void hookOnSubscribe(Subscription subscription) {
        System.out.println("hookOnSubscribe ");
        request(1);
//        super.hookOnSubscribe(subscription);
    }

    @Override
    protected void hookOnNext(T value) {
        System.out.println("NEXT " + value);
        request(3);
//        super.hookOnNext(value);
    }
}