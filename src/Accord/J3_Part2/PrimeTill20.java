package Accord.J3_Part2;

public class PrimeTill20 {
    public static void main(String[] args) {
            int n=20;
        System.out.print("The prime numbers upto " + n +" is ");
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 2; j <i-1; j++) {

                if ((i%j)==0){
                    count++;
                   // break;
                }

            }
            if (count==0){
                System.out.print(i +" ");
            }
        }
    }
}








////THIS IS ANOTHER WAY OF PRINTING THE PRIME NUMBER
//  for (int i = 2; i <= 20; i++) {
//          int count = 0;
//          for (int j = 1; j <= i; j++) {
//
//          if ((i%j)==0){
//          count++;
//          // break;
//          }
//
//          }
//          if (count==2){
//          System.out.println(i);

/////CHAT gpt SOLUTION
//public class PrimeTill20 {
//    public static void main(String[] args) {
//        for (int i = 2; i <= 20; i++) {
//            boolean isPrime = true; // Assume the number is prime initially
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    isPrime = false; // If divisible, not a prime
//                    break; // No need to continue checking
//                }
//            }
//            if (isPrime) {
//                System.out.println(i); // Print the prime number
//            }
//        }
//    }
//}








//
//package Accord.J3Part2;
//
//public class PrimeTill20 {
//    public static void main(String[] args) {
//        for (int i = 2; i <= 20; i++) {
//            boolean isPrime = true; // Assume the number is prime initially
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    isPrime = false; // If divisible, not a prime
//                    break; // No need to continue checking
//                }
//            }
//            if (isPrime) {
//                System.out.println(i); // Print the prime number
//            }
//        }
//    }
//}
