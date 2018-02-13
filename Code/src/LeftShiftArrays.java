import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int b[] = new int[n];
        while(k>0){
            for(int i = 0; i<n-1; i++){
            b[i] = a[i+1];
        }
        b[n-1] = a[0];
        for(int i = 0; i < n; i++){
            a[i] = b[i];
        }
            k--;
        }
        for(int i = 0; i < n; i++){
            System.out.print(b[i] + " ");
        }
    }
}