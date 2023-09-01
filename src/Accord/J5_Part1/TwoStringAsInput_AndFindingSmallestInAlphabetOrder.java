package Accord.J5_Part1;

import java.util.Scanner;

public class TwoStringAsInput_AndFindingSmallestInAlphabetOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first name:");
        String name1=in.nextLine();
        System.out.print("Enter the second word:");
        String name2=in.nextLine();

        if (name1.compareTo(name2)==0) System.out.println(name1+"&"+name2+" both are same");
       else  if (name1.compareTo(name2)>0){
            System.out.println(name2+ " is smallest");
        } else if (name1.compareTo(name2) < 0) {
            System.out.println(name1+" is smallest");
        }


//        if (name1.length()==name2.length()){
//            System.out.println("Both names are same in length");
//        }
//         else if (name1.length() > name2.length()) {
//            System.out.println(name2+" is smallest");
//        }
//        else System.out.println(name1+" is smallest");
    }
}
