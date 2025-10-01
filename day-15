/* Completed the insert function so that it creates a new Node (passed data as the Node constructor argument) and inserts it at the tail of the linked list referenced by the head parameter.
Once the new node is added, return the reference to the head node.
Note: The head argument is null for an empty list. */

import java.io.*;
import java.util.*;
class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}
class Solution {
    public static  Node insert(Node head,int data) {
        Node newNode = new Node(data);
        if(head == null){
            return newNode;
        }
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = newNode;
        return head;
    }
      	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
        
    }
