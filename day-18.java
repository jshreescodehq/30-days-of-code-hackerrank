/* To solve this challenge, first took each character in s, enqueued it in a queue, and also pushed that same character onto a stack.
Once that's done, dequeued the first character from the queue and popped the top character off the stack, then compared the two characters to see if they are the same;
as long as the characters match, we continue dequeueing, popping, and comparing each character until our containers are empty. */

import java.io.*;
import java.util.*;
public class Solution {
    Stack<Character> stack = new Stack<>();
    Queue<Character> queue = new LinkedList<>();
    void pushCharacter(char ch){
        stack.push(ch);
    }
    void enqueueCharacter(char ch){
        queue.add(ch);
    }
    char popCharacter(){
        return stack.pop();
    }
    char dequeueCharacter(){
        return queue.poll();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();:
        char[] s = input.toCharArray();
        Solution p = new Solution();
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
