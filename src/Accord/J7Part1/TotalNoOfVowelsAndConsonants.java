package Accord.J7Part1;
<<<<<<< HEAD

public class TotalNoOfVowelsAndConsonants {
    public static void main(String[] args) {
=======
public class TotalNoOfVowelsAndConsonants {
 public static void main(String[] args) {
>>>>>>> ee843c06c53168dd6619ae8a80a8bd3322a343e6
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
<<<<<<< HEAD
=======
  
>>>>>>> ee843c06c53168dd6619ae8a80a8bd3322a343e6
}
