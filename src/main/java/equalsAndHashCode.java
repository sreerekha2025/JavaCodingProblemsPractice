import java.awt.*;
import java.lang.*;
import java.util.HashMap;

public class equalsAndHashCode {

    public static void main(String[] args){
        HashMap<Integer, String> details = new HashMap<Integer, String>();
        details.put(1, "Rekha");
        details.put(1, "Srikant");
        System.out.println(details);
        System.out.println(details.get(1));
}
}
