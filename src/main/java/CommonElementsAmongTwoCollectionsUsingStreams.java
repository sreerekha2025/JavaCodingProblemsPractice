import java.util.*;
import java.util.stream.Collectors;
import java.lang.*;

public class CommonElementsAmongTwoCollectionsUsingStreams {
    public static void main(String[] args) {

    //Suppose we have 2 collections collection 1 having {Sachin, dhoni, Ramesh, Virat} and collections 2 having {Sachin, Srikant, Ramesh, Rekha} I need to find out the unique elements which are common in both collections
    //Common Unique Elements: [Sachin, Ramesh] Output

  /*  List<String> col1 = List.of("Sachin ", "Dhoni ", "Ramesh ", "Dhoni ","Zebra");
    List<String> col2 = List.of("Sachin ", "Srikant ", "Ramesh ", "Rekha ");
    List<String> col1stream = col1.stream()
            .distinct()
            .filter(name->!col2.contains(name))
            .toList();
        System.out.println("col1stream "+col1stream);
        List<String> col2stream = col2.stream()
                .distinct()
                .filter(name->!col1.contains(name))
                .toList();
   System.out.println("col2stream "+col2stream);
  // col1stream.addAll(col2stream); //gives unmodifiable error
       // System.out.println("col1stream "+col1stream);
        List<String> merged = new ArrayList<>(col1stream);
        merged.addAll(col2stream);
        System.out.println("merged "+merged); */

        //maintains insertion order becoz of dynamic array
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Zebra");
        list.add("Banana");
        list.add("king");
        list.add("Opple");
        list.add("Root");
        System.out.println(list);

        //maintains insertion order becoz of doubly linked list
        List<String> linlist = new LinkedList<>();
        linlist.add("Apple");
        linlist.add("Zebra");
        linlist.add("Banana");
        linlist.add("king");
        linlist.add("Opple");
        linlist.add("Root");
        System.out.println(linlist);

        //does not maintain insertion order depends on hashcode of the elements
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Zebra");
        set.add("Banana");
        set.add("king");
        set.add("Opple");
        set.add("Root");
        System.out.println(set);

        //maintains insertion order becoz of doubly linked list
        Set<String> linset = new LinkedHashSet<>();
        linset.add("Apple");
        linset.add("Zebra");
        linset.add("Banana");
        linset.add("king");
        linset.add("Opple");
        linset.add("Root");
        System.out.println(linset);

        //sorts according to natural order
        Set<String> treeset = new TreeSet<>();
        treeset.add("Apple");
        treeset.add("Zebra");
        treeset.add("Banana");
        treeset.add("King");
        treeset.add("Opple");
        treeset.add("Root");
        System.out.println(treeset);

        //sorts according to reverse order
        Set<String> tresetComp = new TreeSet<>(Comparator.reverseOrder());
        tresetComp.addAll(treeset);
        System.out.println("reverse order "+tresetComp);

        List<String> col1 = List.of("Sachin ", "Dhoni ", "Ramesh ", "Dhoni ","Zebra");
        List<String> col2 = List.of("Sachin ", "Srikant ", "Ramesh ", "Rekha ");
        List<String> intersection = col1.stream()
                .filter(name->col2.contains(name))
                .toList();
        System.out.println("intersection "+intersection);
    }


}
