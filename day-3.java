//Given an integer, , perform the following conditional actions:
//If  is odd, print Weird
//If  is even and in the inclusive range of 2 to 5, print Not Weird
//If  is even and in the inclusive range of 6 to 20, print Weird
//If  is even and greater than 20, print Not Weird

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        if(n>=1 && n<=100){
            if(n%2==0){
                if(n>=2 && n<=5){
                    System.out.println("Not Weird");
                }
                if(n>=6 && n<=20){
                    System.out.println("Weird");
                }
                if(n>20){
                    System.out.println("Not Weird");
                }
            }
            else{
                System.out.println("Weird");
            }
        }
        bufferedReader.close();
    }
}
