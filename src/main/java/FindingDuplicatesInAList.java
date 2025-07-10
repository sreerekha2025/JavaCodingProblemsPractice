import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindingDuplicatesInAList {
    public static void main(String[] args){
        List<String> list = Arrays.asList("apple", "banana", "apricot", "blueberry", "cherry");
        Map<Integer, List<String>> finlist = list.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("grouping by length of the strings " + finlist);
        Map<Character, List<String>> finlist1 = list.stream()
                .collect(Collectors.groupingBy(s->s.charAt(0)));
        System.out.println("grouping by first character of the word " + finlist1);
        Map<Character, Long> finlist2 = list.stream()
                .collect(Collectors.groupingBy(s->s.charAt(0),Collectors.counting()));
        System.out.println("grouping by counting of first character of the word " + finlist2);
        Map<Integer, Long> finlist3 = list.stream()
                .collect(Collectors.groupingBy(String::length,Collectors.counting()));
        System.out.println("Group by word length instead of first letter " + finlist3);
        Map<Integer, List<String>> finlist4 = list.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Count only those words that start with a vowel " + finlist4);

    }
}
