package io.github.theacid.challenge126;

import java.util.ArrayList;
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

        List<String> list = new ArrayList<>(listOfElements);
        //System.out.println(list);

        for(String values : list) {
            System.out.println(values);
        }
    }
}
