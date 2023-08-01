package LinkedList;

import java.util.*;
class node{
    int data;
    node next;
    node(int d){
        data=d;
        node next = null;
    }
}
class linkedlist{
    node head;
    private int size;
    linkedlist(){
        size=0;
    }
    int getsize(){
        return size;
    }
    
    void addlast(int data){
        node new_node= new node(data);
        size++;
        if(head==null){
            head=new_node;
        }
        else{
            node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new_node;

        }
        
    }
    void display(linkedlist list){
        node currnode=list.head;
        System.out.println("linkedList: ");
        while(currnode!=null){
            System.out.print(currnode.data+" ");
            currnode=currnode.next;
        }
        System.out.println();
    }
    void delete_nodes(int n){
        node temp=head;
        while (temp.data > n ) {
            temp=temp.next;
        }
        node prevtemp=head;
        temp=head.next;
        while(temp!=null){
            if(temp.data>n){
                prevtemp.next=temp.next;
                temp=prevtemp.next;
            }else{
                prevtemp=temp;
                temp=temp.next;
            }

        }
    }
    
    
}


public class delete_all_nodes {
    
    public static void main(String[] args) {
        linkedlist list=new linkedlist();
        
        for(int i=0;i<50;i++){
            list.addlast(i);
        }
        list.delete_nodes(25);
        
        list.display(list);
        System.out.println(list.getsize());
    }
}
