//Objective:
//saving a line of input from stdin to a variable, print Hello, World. on a single line, and finally printing the value of the variable on a second line.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		String inputS= scan.nextLine();
		scan.close();
		System.out.println("Hello, World.");
        System.out.println(inputS);
	}
}
