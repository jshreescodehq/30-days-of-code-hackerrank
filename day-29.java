/* Given set S={1, 2, 3,..., N}.
Find two integers, A and B (where A < B), from set S such that the value of A & B is the maximum possible and also less than a given integer, K.
In this case, '&' represents the bitwise AND operator. */

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

class Result {
    public static int bitwiseAnd(int N, int K) {
    int maxAnd = 0;
    for(int a =1; a< N; a++){
        for(int b= a+1; b<=N; b++){
            int andValue = a & b;
            if (andValue < K && andValue > maxAnd){
                maxAnd = andValue;
            }
        }
    }
        return maxAnd;
    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int t = Integer.parseInt(bufferedReader.readLine().trim());
        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
                int count = Integer.parseInt(firstMultipleInput[0]);
                int lim = Integer.parseInt(firstMultipleInput[1]);
                int res = Result.bitwiseAnd(count, lim);
                bufferedWriter.write(String.valueOf(res));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        bufferedReader.close();
        bufferedWriter.close();
    }
}
