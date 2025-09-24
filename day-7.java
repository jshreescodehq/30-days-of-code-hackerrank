//Given an array A of N integers, print A's elements in reverse order as a single line of space-separated numbers.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        for(int j=N-1; j>=0;j--){
            System.out.print(A[j] + " ");
        }
    }
}
