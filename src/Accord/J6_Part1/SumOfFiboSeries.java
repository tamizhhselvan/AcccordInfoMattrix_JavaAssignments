package Accord.J6_Part1;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfFiboSeries {
    public static void main(String[] args) {
        int n=10;
        int fTerm=0;
        int sTerm=1;
        int ans=0;
        int total=0;
        for (int i = 1; i <=n ; i++) {
            ans =fTerm+sTerm;
            total=total+fTerm;
            fTerm=sTerm;
            sTerm=ans;
        }
       // System.out.println(ans);
        System.out.println(total);
    }
}
