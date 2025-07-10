import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromAList {
    public static void main(String[] args){
    String[] arr = {"a", "b", "a", "d","c","c","z"};
        List<String> list = List.of(arr);
        //using streams and list
       List<String> fin= list.stream()
                .distinct()
                .toList();
        for(String s: fin){
            System.out.print(s);
        }
       //using Set
        Set<String> set = new HashSet<>();
        set.addAll(list);
        for(String s: set){
            System.out.println(s);
        }
    }
}
