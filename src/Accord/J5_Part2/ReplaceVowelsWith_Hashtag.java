package Accord.J5_Part2;

public class ReplaceVowelsWith_Hashtag {
    public static void main(String[] args) {
        String name="Tamil Selvan";

        String modified = name.replaceAll("[aeiouAEIOU]","#");
        System.out.println(modified);
    }
}
