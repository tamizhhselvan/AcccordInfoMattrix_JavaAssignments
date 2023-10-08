package Accord.J11_Part1.Question2;

/*
            2. Complete the code given below.

                public class Arrange
                {
                public String[] sort(String[] s)
                {
                write code to arrange string array in
                alphabetical order.
                return s;
                }
                public int[] sort(int[] a)
                {
                write code to arrange integer array in
                ascending order
                return a;
                }
                public static void main(String args[])
                {
                Write code to create object.
                Call two methods with necessary inputs.
                Display output here.
                }
                }
 */

import java.util.Arrays;

public class Arrange
{
    public String[] sort(String[] s)
    {

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length - i - 1; j++) {
                if (s[j].compareTo(s[j+1])>0){
                    String temp = s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }

        }
        return s;
    }
    public int[] sort(int[] a)
    {
        for (int i = 0; i < a.length; i++) {
            for (int j =i+1; j < a.length; j++) {
                if (a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
    public static void main(String args[])
    {
              Arrange obj = new Arrange();
              int[] sortedNum = obj.sort(new int[]{1, 2, 3, 4, 5, 6});
              String[] sortedSTR = obj.sort(new String[]{"tamil","selvan","raj","akash","abinav"});

        System.out.println(Arrays.toString(sortedNum));
        System.out.println(Arrays.toString(sortedSTR));
    }
}
