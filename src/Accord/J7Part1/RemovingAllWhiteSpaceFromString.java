package Accord.J7Part1;

public class RemovingAllWhiteSpaceFromString {
    public static void main(String[] args) {
        String str = "this is java";
        String withoutWhiteSpace = str.replaceAll("[ ]","");
        System.out.println(withoutWhiteSpace);
    }
}
