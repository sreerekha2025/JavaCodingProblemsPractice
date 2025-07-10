import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparingObjectsBasedOnParticularElement {
    public static void main(String[] args){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(25, "Bob", 40000.00));
        list.add(new Employee(22, "John", 25000.00));
        list.add(new Employee(50, "Ravi Dude", 80000.00));

        list.sort(Comparator.comparing(Employee::getSalary).reversed());
        for(Employee s: list){
        System.out.println(s);
        }
        list.sort(Comparator.comparing(Employee::getAge));
        for(Employee s: list){
            System.out.println(s);
        }
        list.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary));
        for(Employee s: list){
            System.out.println(s);
        }
    }
}
