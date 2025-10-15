/* A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself.
Given a number n, determine and print whether it is PRIME or NOT PRIME.*/

import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int n = sc.nextInt();
            System.out.println(isPrime(n) ? "Prime" : "Not prime");
        }
        sc.close();
    }
    public static boolean isPrime(int n){
        if(n < 2){
            return false;}
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
        }
    }
