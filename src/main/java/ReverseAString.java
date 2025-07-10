public class ReverseAString {
    public static void main(String[] args) {
        String s = "Rekha";
        StringBuilder rev = new StringBuilder();
        char[] ch = s.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
             rev.append(ch[i]);
        }
        System.out.println("Reversed string is " + rev);
        if(rev.toString().equals(s)){
            System.out.println("its a palindrome");}
        else
            System.out.println("its not a palindrome");
    }
}
