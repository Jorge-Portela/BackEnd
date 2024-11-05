package List.exampleArrayList.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Rob");
        list.add("Anna");
        list.add(2,"Marco");

        // amount of index contained in the list
        System.out.println("Size of List: ");
        System.out.println(list.size());

        System.out.println("\n--------------------------\n");

        System.out.println("Name contained in the List: ");
        for(String x : list){
            System.out.println(x);
        }

        System.out.println("\n--------------------------\n");

        System.out.println("Remove the names that initiate with letter 'M'");
        list.removeIf(x -> x.charAt(0) == 'M');

        for(String x : list){
            System.out.println(x);
        }

        System.out.println("\n--------------------------\n");

        System.out.println("Index of Rob: "+list.indexOf("Rob"));
        System.out.println("Index of Marco: "+list.indexOf("Marco"));

        System.out.println("\n--------------------------\n");

        System.out.println("Filtered and showing only names starting with the letter 'A'");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for(String x : result){
            System.out.println(x);
        }

        System.out.println("\n--------------------------\n");

        System.out.println("Find a name that starting with 'b' or return 'null'");
        String name = list.stream().filter(x -> x.charAt(0) == 'b').findFirst().orElse(null);
        System.out.println(name);



    }
}
