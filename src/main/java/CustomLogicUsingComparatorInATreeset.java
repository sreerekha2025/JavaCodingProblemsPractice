import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CustomLogicUsingComparatorInATreeset {
    public static void main(String[] args){
        //Sort by String length
        Set<String> treeset = new TreeSet<>();
        treeset.add("Alice");
        treeset.add("Vernica z");
        treeset.add("Bob");
        treeset.add("Josh");
        treeset.add("Manogna");
        treeset.add("Sreerekha Dhavuluri");
        System.out.println(treeset);

        Set<String> treesetCompare = new TreeSet<>(Comparator.comparing(String::length));
        treesetCompare.addAll(treeset);
        System.out.println(treesetCompare);
    }
}
