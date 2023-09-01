package Accord.J5_Part1;

import java.util.ArrayList;
import java.util.Arrays;

public class StringsUppercaseToLast {
    public static void main(String[] args) {

        String s = "GeeksFoRGeeKS";
//        char[] ch = new char[s.length()];
//        int c   =0;
        String up="";
        String lc="";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>='A' && s.charAt(i)<='Z'){
//                ch[c]=s.charAt(i);
//                c++;
                up+=s.charAt(i);
            }
            else lc+=s.charAt(i);
        }
        System.out.println(lc+up);

    }

}
//
//    alist(s); //----> this goes in main function




//    private static void alist(String s) {
//        ArrayList<Character> up= new ArrayList<>();
//        ArrayList<Character> lc= new ArrayList<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i)>='A'&& s.charAt(i)<='Z'){
//                up.add(s.charAt(i));
//            }
//            else if (s.charAt(i)>='a'&& s.charAt(i)<='z'){
//                lc.add(s.charAt(i));
//            }
//        }
//        System.out.println(up);
//        System.out.println(lc);
//    }
//

