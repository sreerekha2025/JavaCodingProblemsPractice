import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindingSmallestAndLargestNumberInAnArray {
    public static void main(String[] args){
        List<Integer> list = List.of(23, 2, 34, 100, 10, 1);
        Optional<Integer> out =list.stream()
                .distinct()
                .sorted()
                .findFirst();
        System.out.println("smallest number is "+ out);
        //above code we can write using compareTo() of Integer class
        List<Integer> list4 = List.of(23, 2, 34, 100, 10, 1);
        Optional<Integer> out4 = list4.stream()
                .distinct().min(Integer::compareTo);
        System.out.println("using min method smallest number is "+ out4);
        List<Integer> list7 = List.of(23, 2, 34, 100, 10, 1);
        Optional<Integer> out7 = list7.stream()
                .distinct().min((a,b)->a.compareTo(b));
        System.out.println("using min method and lambda expression largest number is "+ out7);
        List<Integer> list1 = List.of(23);
        Optional<Integer> out1 =list1.stream()
                .skip(1)
                .findFirst();
        System.out.println("it should empty list Optional.empty"+ out1);
        List<Integer> list2 = List.of(23, 2, 34, 100, 10, 1);
        Optional<Integer> out2 = list2.stream()
                .distinct().min(Comparator.reverseOrder());
        System.out.println("using min method largest number is "+ out2);
        //above code we can write in other way
        List<Integer> list3 = List.of(23, 2, 34, 100, 10, 1);
        Optional<Integer> out3 = list3.stream()
                .distinct().sorted(Comparator.reverseOrder())
                .findFirst();
        System.out.println("using sorted method largest number is "+ out3);
        //above code we can write using compareTo() of Integer class
        List<Integer> list5 = List.of(23, 2, 34, 100, 10, 1);
        Optional<Integer> out5 = list5.stream()
                .distinct().max(Integer::compareTo);
        System.out.println("using max method largest number is "+ out5);
        List<Integer> list6 = List.of(23, 2, 34, 100, 10, 1);
        Optional<Integer> out6 = list5.stream()
                .distinct().max((a,b)->a.compareTo(b));
        System.out.println("using max method and lambda expression largest number is "+ out6);



        //without using streams and using compareTo method
        int[] arr = {23, 2, 34, 100, 10, 1};

}}
