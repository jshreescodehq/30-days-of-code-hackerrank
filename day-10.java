//Given a base-10 integer n , convert it to binary (base-2).
//Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation. 
//When working with different bases, it is common to show the base as a subscript.

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
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int count = 0;
        int max = 0;
        while(n!=0){
            if(n%2==0){
                count = 0;
            }
            else{
                count++;
                if(count>max){
                    max = count;
                }
            }
            n/=2;
        }
            System.out.println(max);
        bufferedReader.close();
    }
}
