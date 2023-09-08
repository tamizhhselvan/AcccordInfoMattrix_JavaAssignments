package Accord.J7_Part1;

public class RepeatedCharactersOfString {
    public static void main(String[] args) {
        String str = "example";
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i]=str.charAt(i);
        }
  //      System.out.println(Arrays.toString(ch));
        for (int i = 0; i < ch.length; i++) {
            int count=0;
            for (int j = i+1; j < ch.length; j++) {
                if (ch[i]=='X'){
                    break;
                }
                if(ch[i]==ch[j]){
                    count++;
                    ch[j]='X';
                }
            }
            if (count>0){
                System.out.println(ch[i]);
            }
        }
    }
}
