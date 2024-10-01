package DSA_LAB_05;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data=data;
        this.next=null;
    }
 }
public class Queue_LinkedList {
    private Node rear;
    private Node front;
    
    Queue_LinkedList(){
    this.rear=null;
    this.front=null;  
    }
    
    public void Enqueue(int data){
        Node NewNode=new Node( data);
        if(rear==null){
            front=NewNode;
            rear=NewNode;
        
        }
        rear.next=NewNode;
        rear=NewNode;
    }
    
    
    public void Dequeue(){
    if(front==null){
        System.out.println("can't delete item Queue is Empty:");
    }
    int data=front.data;
    front=front.next;
    
    }
    
    public int peek(){
    return front.data;
    }
    
    public void print(){
    Node temp=front;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
        System.out.println("null");
    
    }
    public static void main(String[] args) {
        Queue_LinkedList q1=new Queue_LinkedList();
        q1.Enqueue(12);
        q1.Enqueue(20);
        q1.Enqueue(50);
        q1.Enqueue(100);
        q1.Dequeue();
        System.out.println(q1.peek());
        q1.print();
    }
}
   

