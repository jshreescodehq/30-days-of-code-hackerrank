/* Given a string S, of length N that is indexed from 0 to N-1, print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line
Note:  0 is considered to be an even index. */

import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        sc.nextLine();
            for(int i=0;i<T;i++){
                String S =sc.nextLine();
                char[] ch = S.toCharArray();
                String eve = "";
                String odd = ""; 
            for(int j=0;j<ch.length;j++){
                if(j%2==0){
                    eve += ch[j];
                }
                else{
                     odd += ch[j];
                }
            }
            System.out.print(eve + " " + odd);
            System.out.println();
         }
   sc.close();
    }
     }
