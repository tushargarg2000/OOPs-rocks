package LinkedList;

import java.util.Scanner;

class Node{
    int data;
    Node nextNode; //Address of the next node by default null

    Node(int data){
        this.data = data;
        nextNode = null;
    }
}

public class Main {

    public static void main(String[] args) {

        //Create a Linked List
        // Reference variable that will store the
        //address of the starting node of the linked List

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedList ll = new LinkedList();

        for(int i=0;i<n;i++){
            int value = sc.nextInt();
            ll.addNode(value);
        }

        ll.printList();
    }
}

class LinkedList{

    Node head; //It will point to the address of the first Node

    public void addNode(int value){

        Node newNode = new Node(value);

        //If we are adding the first Time a node to out ll

        if(head==null){
            //This is the first I am creating
            head = newNode;
            return;
        }

        //Iterate to last of linkedList and connect newNode there

        Node node = head; //This node address will actually traverse the
        //linked List

        //Helping to iterate till the lastNode
        while(node.nextNode!=null){
            node = node.nextNode;
        }
        //After reaching here : we would have come to the end
        //of the linked List

        node.nextNode = newNode;

    }


    public void printList(){


        Node node = head;

        //Traverse the Linked List
        while(node!=null){
            System.out.println(node.data+" ");
            node = node.nextNode;
        }
    }





}
