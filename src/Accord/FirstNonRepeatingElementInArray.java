package Accord.J6_Part2;

public class FirstNonRepeatingElementInArray {
    public static void main(String[] args) {
        int[] arr ={2,3,6,2,5,6};
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = i+1; j < arr.length; j++)
                if (arr[i] == arr[j]) {
                    count++;
                }
            if (count==0){
                System.out.println("First non-repeating number: "+arr[i]);
                break;
            }
        }
    }
}
