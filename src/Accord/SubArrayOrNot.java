package Accord.J6_Part2;

public class SubArrayOrNot {
    public static void main(String[] args) {
        int[] arr={2,3,6,2,5,6};
        int[] subArray={2,3,8};
        int count=0;
        if (subArray.length<arr.length){
            for (int i = 0; i < subArray.length; i++) {
                for (int j = i; j < arr.length; j++) {
                    if (subArray[i]==arr[j]){
                        count++;
                        break;
                    }
                }
            }
            if (count== subArray.length){
                System.out.println("it is sub array");
            }
            else System.out.println("it is not a sub Array");
        }else System.out.println("it is not a sub Array");
    }
}
