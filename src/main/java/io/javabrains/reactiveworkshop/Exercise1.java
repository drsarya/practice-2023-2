package io.javabrains.reactiveworkshop;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here

        StreamSources.intNumbersStream().forEach(System.out::println);

        System.out.println("_______________________________");
        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here
        StreamSources.intNumbersStream().filter(val -> {
            System.out.println("val " + val);
            return val < 5;
        }).forEach(System.out::println);
        System.out.println("_______________________________");

        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
        StreamSources.intNumbersStream().filter(val -> val > 5).skip(2).limit(2).forEach(System.out::println);

        System.out.println("_______________________________");

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
        Integer integer = StreamSources.intNumbersStream().filter(val -> val > 5).findFirst().orElse(-1);
        System.out.println(integer);
        System.out.println("_______________________________");

        // Print first names of all users in userStream
        // TODO: Write code here
        StreamSources.userStream().forEach(v -> System.out.println(v.getFirstName()));
        System.out.println("_______________________________");

        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
        StreamSources.userStream()
                .filter(v -> StreamSources.intNumbersStream().anyMatch(g -> v.getId() == g))
                .forEach(v -> System.out.println(v.getFirstName()));

        System.out.println("_______________________________");

    }

}
