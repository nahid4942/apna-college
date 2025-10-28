package linkedlist;
 public class class1{





   
public static class Node{

    int data;
    Node next;


    public Node(int a){
        this.data = a;
        this.next = null;

    }

}
//head node is the first node created 
//tail node is last node created 

    public static  Node head;

    public static Node tail;


   //add first 
   //  node wil be added in the first

 public void addfirst(int data){
    //create new node 
       Node newNode = new Node(data); 
    //newnode next = head;

    if (head == null){
        head = tail = newNode;
        return;
    }
    newNode.next = head;
    // head = newNode;
    head = newNode;

   }



   //add method 

  //print ll 
  public void print(){

    if(head== null){
        System.out.println("linked list is empty");
        return;
    }else {
        
    Node  temp = head;

    while (temp!=null){
        System.out.println(temp.data);
        temp = temp.next;

    }
    }



  }
     









   //remove method 
   //print method 
   //search method 

   public static void main (String args[]){

      class1 one = new class1();
      one.addfirst(2);
      one.print();
      one.addfirst(3);
      one.addfirst(4);
      one.addfirst(5);
      one.print();
      Node(4);
      


    }



 }
 