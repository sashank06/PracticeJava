package samples;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int N,X;
        long P;
        long[] A = new long[100000]; // large size of input
        int Id = 0;
        long temp = 0;
        long aggScore = 0;
        Scanner in= new Scanner(System.in);
        N = in.nextInt();
        P = in.nextLong();
        X = in.nextInt(); 
        
        for (int i=0; i<N;++i)
            A[i] = in.nextLong();
       
        for(int i = 0; i<N; ++i){
            aggScore = A[i]*P;
            P-=X;
            if(aggScore>temp){
                temp = aggScore;
                Id = i;
            }
        }
        System.out.println(Id + 1);
    }
}