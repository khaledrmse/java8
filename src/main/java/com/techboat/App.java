package com.techboat;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import main.java.com.techboat.MyfunctionalInterface;
import main.java.com.techboat.Person;

public class App {
    public static void main(String[] args) {

        // calling a lambda expression with myFunctionalInterface
        MyfunctionalInterface lamda = (str) -> {
            System.out.println("hi there" + str);
        };
        lamda.print(" khaled ");
        // using Java interface Function
        Function<Integer, Integer> adder = (value) -> value + 3;
        System.out.println(adder.apply(10));
        // using Predicate java
        Predicate<String> checkStringlength = (str) -> {
            return (str.length() > 5) ? true : false;
        };
        System.out.println(checkStringlength.test("test"));
        // UnaryOperator
        UnaryOperator<Person> unaryOperator = (person) -> {
            person.setLastname("lastname");
            person.setName("name");
            return person;

        };
        Person p = new Person("khaled", "slimani");
        System.out.println(unaryOperator.apply(p).toString());
        BinaryOperator<Integer> binaryOperator = (x, y) -> {
            return x + y;
        };
        System.out.println(binaryOperator.apply(2, 3));
        // Suplier test
        Supplier<Person> supplier = () -> {
            return new Person("Slimani", "khaled");

        };
        System.out.println(supplier.get());
        // Consumer
        Consumer<Person> show = (va) -> {
            System.out.println(va.toString());
        };
        show.accept(p);

        // and()
        Predicate<String> starrtwithX = (strtx) -> {
            return strtx.startsWith("x");
        };
        Predicate<String> lengthstr = (strl) -> {
            return ((strl.length() > 3) ? true : false);
        };
        Predicate<String> somPredicate = starrtwithX.and(lengthstr);
        System.out.println(somPredicate.test("xxxxx"));
    }

}