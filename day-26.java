/* Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows:
If the book is returned on or before the expected return date, no fine will be charged (i.e.: fine = 0) .
If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, fine = 15 hackos * (the no.of days late).
If the book is returned after the expected return month but still within the same calendar year as the expected return date, the fine = 500 * (no. of months late).
If the book is returned after the calendar year in which it was expected, there is a fixed fine of 10000 Hackos .*/

import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int actualDay = sc.nextInt();
        int actualMonth = sc.nextInt();
        int actualYear = sc.nextInt();
        int expectedDay = sc.nextInt();
        int expectedMonth = sc.nextInt();
        int expectedYear = sc.nextInt();
        sc.close();
        int fine = 0;
        if(actualYear > expectedYear){
            fine = 10000;
        }
        else if(actualYear == expectedYear && actualMonth > expectedMonth){
            fine = 500 * (actualMonth - expectedMonth);
        }
        else if(actualYear == expectedYear && actualMonth == expectedMonth && actualDay > expectedDay){
            fine = 15 * (actualDay - expectedDay);
        }
        System.out.println(fine);
    }
}
