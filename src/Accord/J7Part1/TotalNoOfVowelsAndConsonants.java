package Accord.J7Part1;
public class TotalNoOfVowelsAndConsonants {
 public static void main(String[] args) {
        String name ="program";
        int vowels=0,consonants=0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
                vowels++;
            }else consonants++;
        }
        System.out.println("Total no of vowels: "+vowels);
        System.out.println("Total no of consonants: "+consonants);
    }
  
}
