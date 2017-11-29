package challenge102;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AddRemoveSortElement {
    public static void main(String[] args) {
        List<String> listOfElements = new ArrayList<>();
        listOfElements.add("Java");
        listOfElements.add("Scala");
        listOfElements.add("Golang");
        listOfElements.add("C#");
        listOfElements.add("C");
        listOfElements.add("C++");
        listOfElements.add("Elixir");

        System.out.println(listOfElements);

        listOfElements.add(0, "Malbolge");
        listOfElements.remove(4);

        Collections.sort(listOfElements);

        System.out.println(listOfElements);
    }
}
