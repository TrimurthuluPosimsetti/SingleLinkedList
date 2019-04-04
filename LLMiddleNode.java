/*FINDING MIDDLE NODE IN THE SINGLE LINKEDLIST*/
import java.util.*;
import java.util.Scanner;

/*Here is the structre of the node*/
class Node {
    int data;
    Node next = null;
    Node(int data) {
        this.data = data;
    }
}

/*Main Class*/
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //reading size of the linkedlist
        Node head = null; //creating an head node
        Node temp = null; //creating an temp node
        for (int i = 0; i < n; i++) { //iterating for n times
            if (i == 0) {
                Node x = new Node(sc.nextInt()); //new head node creation
                head = x;
                temp = head; //assigning head to temp
            } else {
                Node x = new Node(sc.nextInt()); //new node creation
                temp.next = x; //linking temp pointer to new node
                temp = temp.next; //incrementing temp
            }
        }
        //checking whether length of LinkedList is even or not
        int c = 0;//temporary variable to breaking condition
        temp = head;
        while (c != (n / 2)) { //finding the middle Node
            temp = temp.next;//incrementing temp to next node
            c = c + 1;
        }
        System.out.println(temp.data);
    }
}
