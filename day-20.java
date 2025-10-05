/* Given an array a, of size n distinct elements, sorted the array in ascending order using the Bubble Sort algorithm.
Once sorted, printted the following 3 lines:

1) Array is sorted in numSwaps swaps.
where numSwaps is the number of swaps that took place.

2) First Element: firstElement
where firstElement is the first element in the sorted array.

3) Last Element: lastElement
where lastElement is the last element in the sorted array.*/

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
        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
       int numberOfSwaps = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                if(a.get(j)>a.get(j+1)){
                    Collections.swap(a,j,j+1);
                    numberOfSwaps++;
                }
            }
            if(numberOfSwaps == 0){
                break;
            }
        }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: "+ a.get(0));
        System.out.println("Last Element: " + a.get(n-1));
        bufferedReader.close();
    }
}
