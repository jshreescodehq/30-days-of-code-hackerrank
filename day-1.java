// The variables i, d, and s are already declared and initialized
// Print the sum of both integers on the first line, the sum of both doubles on the second line, and then the two concatenated strings on the third line.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double b = scan.nextDouble();
        scan.nextLine();
        String c = scan.nextLine();
        
        System.out.println((i+a));
        System.out.println((d+b));
        System.out.println((s+c));
        
        scan.close();
    }
}
