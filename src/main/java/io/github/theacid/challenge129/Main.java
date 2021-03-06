package io.github.theacid.challenge129;

import java.util.LinkedList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<String> listOfElements = new LinkedList<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        System.out.println("Before: " + listOfElements);
        listOfElements.set(4, "Rust");

        System.out.println("After: " + listOfElements);
    }
}
