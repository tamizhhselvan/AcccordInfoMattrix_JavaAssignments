package Accord.J5_Part2;

public class StringInputRemoveVowels {
    public static void main(String[] args) {
        String name= "Tamil";
        String withoutVowels = name.replaceAll("[aeiouAEIOU]", "");
        System.out.println(withoutVowels);
    }
}
