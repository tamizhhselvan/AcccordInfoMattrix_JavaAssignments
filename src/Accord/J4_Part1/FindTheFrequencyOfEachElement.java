package Accord.J4_Part1;

public class FindTheFrequencyOfEachElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 4, 3, 5, 3, 9, 5, 6, 9, 8, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==Integer.MAX_VALUE){
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = Integer.MAX_VALUE;
                }
            }
            System.out.println(arr[i] + " is  " + count + " times repeated in this array");
        }
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == -1) {
//                continue; // Element already counted
//            }
//
//            int count = 1;
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] == array[j]) {
//                    count++;
//                    array[j] = -1; // Mark the element as counted
//                }
//            }
//
//            System.out.println("Element " + array[i] + " occurs " + count + " times.");
//        }


/*
        int[] arr = {1, 2, 3, 3, 4, 4, 4, 3, 5, 3, 9, 5, 6, 9, 8, 1};

        // Create an array to store the frequency of each element
        int[] frequencies = new int[arr.length];

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Initialize the frequency of the current element to 0
            frequencies[i] = 0;

            // Iterate through the rest of the array
            for (int j = i + 1; j < arr.length; j++) {
                // If the current element is equal to the next element, increment the frequency of the current element
                if (arr[i] == arr[j]) {
                    frequencies[i]++;
                }
            }
        }

        // Iterate through the array and print the frequency of each element
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " is " + frequencies[i] + " times repeated in this array");
        }
        */

//        int[] arr = {1, 2, 3, 3, 4, 4, 4, 3, 5, 3, 9, 5, 6, 9, 8, 1};
//
//        // Create an array to store the frequency of each element
//        int[] frequencies = new int[arr.length];
//
//        // Iterate through the array
//        for (int i = 0; i < arr.length; i++) {
//            // Initialize the frequency of the current element to 0
//            frequencies[i] = 0;
//
//            // Iterate through the rest of the array
//            for (int j = i + 1; j < arr.length; j++) {
//                // If the current element is equal to the next element, increment the frequency of the current element
//                if (arr[i] == arr[j]) {
//                    frequencies[j]++;
//                }
//            }
//        }
//
//        // Iterate through the array and print the frequency of each element
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " is " + frequencies[] + " times repeated in this array");
//        }
//    }
//}

//
//public class FindTheFrequencyOfEachElement {
//
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 3, 4, 4, 4, 3, 5, 3, 9, 5, 6, 9, 8, 1};
//
//        // Create an array to store the frequency of each element
//        int[] frequencies = new int[arr.length];
//
//        // Iterate through the array
//        for (int i = 0; i < arr.length; i++) {
//            // Initialize the frequency of the current element to 0
//            frequencies[i] = 0;
//
//            // Iterate through the rest of the array
//            for (int j = i + 1; j < arr.length; j++) {
//                // If the current element is equal to the next element, increment the frequency of the current element
//                if (arr[i] == arr[j]) {
//                    frequencies[j]++;
//                }
//            }
//        }
//
//        // Iterate through the array and print the frequency of each element
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " is " + frequencies[i] + " times repeated in this array");
//        }
//    }
//}
