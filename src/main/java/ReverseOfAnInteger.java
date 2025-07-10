public class ReverseOfAnInteger {
    public static void main(String[] args){
        int i = 12345;
        int j=0;
        while(i>=1){
        j=j*10+i%10;
        i=i/10;
        }
        System.out.println(j);
        char ch = 5;
        Character.isDigit(ch);
    }
}

