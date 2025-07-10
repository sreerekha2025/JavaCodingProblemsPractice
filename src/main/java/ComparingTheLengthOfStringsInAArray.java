public class ComparingTheLengthOfStringsInAArray {
    public static void main(String[] args){
    //using basic code of strings and using bubble sort logic
        String[] name = {"Alice", "Vernica", "Bob", "Josh", "Manogna", "Sreerekha Dhavuluri"};
        System.out.println("No. of Strings in name array "+name.length);
        for(int i=0;i<name.length-1;i++){
            //System.out.print(name[i].length());
            for(int j=i+1;j<name.length;j++){
                if(name[i].length()>name[j].length()){
                    String temp;
                temp =name[i];
                name[i]=name[j];
                name[j]= temp;
                }}}
      for(String s: name){
          System.out.println(s);
      }
    }
}
