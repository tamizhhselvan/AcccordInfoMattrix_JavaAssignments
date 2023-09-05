package Accord.J7Part1;

public class RepeatedCharactersOfString {
    public static void main(String[] args) {
        String str="example";
        for (int i = 0; i < str.length(); i++) {
            int count=0;
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                 //   str.charAt(j)='\0';str.
//                    char x =str.charAt(j);
//                    char temp= Character.toUpperCase(x);
//                    str.charAt(j)= temp;
                }
            }
            if (count>0){
                System.out.println(str.charAt(i));
            }
        }
    }
}
