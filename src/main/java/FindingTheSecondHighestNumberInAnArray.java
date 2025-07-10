import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindingTheSecondHighestNumberInAnArray {
    public static void main(String[] args){
        List<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(4);list.add(45);list.add(99);
        for(int i :list){
            System.out.println(i);}
        Optional<Integer> out=  list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
         System.out.println(out);
    }
}
