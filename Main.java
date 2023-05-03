import java.util.*;


public class Main {

    public static void message(String inp) {
        System.out.println("---The message method appears!---");
        System.out.println("Message: " + inp);
    }

    public static void main(String[] args) {
        SortedSet<Integer> newSet = new TreeSet<>();
        Integer[] contents = {10, 2, 67, 69, 34, 21, 37};
        for(Integer element: contents){
            newSet.add(element*2);
            System.out.println(newSet);
        }
        System.out.print("Compared to original contents: ");
        System.out.println(Arrays.stream(contents).toList());
        // metoda 'static' nie wymaga utworzenia obiektu klasy
        message("Witam bardzo serdecznie");
    }
}
