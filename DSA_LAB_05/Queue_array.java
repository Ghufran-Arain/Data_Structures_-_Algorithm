package DSA_LAB_05;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Queue_array {
    private int array[];
    private int  rear;
    private int front;
    
    Queue_array(int size){
        this.rear=-1;
        this.front=-1;
        this.array=new int[size];
    }
    
    public boolean isEmpty(){
    return  this.rear==-1;
    }
    
    public boolean isFull(){
        return this.rear == this.array.length;
    }
    
        public void Enqueue(int data){
            if(isFull()){
                System.out.println("Queue is full can't Enqueue");
            }
            this.array[++this.rear] = data;
            System.out.println(data + " Enqueue in Queue");  
            System.out.println();
            }
        
        public void Dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty can't remove element: ");
        }
            int data=array[rear];
            data=0;
            front++;
        }
        
        public int peek(){
            return array[front + 1];
            
        }
        
        public void Print(){
            for(int i=front + 1; i<=rear; i++){
                System.out.println(array[i]+" Elements of queue are:");
            }
        }
    public static void main(String[] args) {
        Queue_array q1=new Queue_array(5);
        q1.Enqueue(10);
        q1.Enqueue(15);
        q1.Enqueue(20);
        q1.Enqueue(70);
        q1.Enqueue(80);
        q1.Dequeue();
        q1.Dequeue();
        System.out.println("peek element: "+q1.peek());
        q1.Print();
        
        
    }
}
