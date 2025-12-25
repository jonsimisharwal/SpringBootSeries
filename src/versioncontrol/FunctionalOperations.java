package versioncontrol;

import java.util.Optional;

public class FunctionalOperations {
    public static void main(String args[]) {
        Optional<String> name = Optional.of("java");
        Optional<String> nullOptional = Optional.ofNullable(null);
        //ifPresent()
        name.ifPresent(value -> System.out.println(value));
        nullOptional.ifPresent(value -> {
            System.out.println(value);
        });
        //map()-transform
        Optional<String> upperCase = name.map(value -> value.toUpperCase());
        Optional<String> Uppercase = nullOptional.map(String::toUpperCase);
        System.out.println(Uppercase.orElse("default"));

        //filter()
        Optional<String> temp = name.filter(n -> n.startsWith("F"));
        temp.ifPresent(System.out::println);

        name.filter(n -> n.startsWith("F")).ifPresent(System.out::println);

        //combined Operation
        name.filter(n -> n.startsWith("J"))
                .map(String::toUpperCase)
                .ifPresent(System.out::println);
    }
}