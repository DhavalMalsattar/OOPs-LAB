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
    void search(int key){
        node currnode = head;
        int i=0;
        if(currnode != null && currnode.data==key){
            
            System.out.println("index of " + key +"is"+i);
        
            
            
        }
        while(currnode != null && currnode.data != key){
            i++;
            currnode = currnode.next;
        }
        if(currnode != null){
            
            System.out.println("index of " + key +" is "+i);
        
        }
        if(currnode == null){
            System.out.println(key + " not found");
        }
        
    }
    
    
}


public class search {
    
    public static void main(String[] args) {
        linkedlist list=new linkedlist();
        list.addlast(1);
        list.addlast(5);
        list.addlast(7);
        list.addlast(112);
        list.addlast(66);
        list.addlast(76);
        
        list.display(list);
        System.out.println(list.getsize());
        list.search(112);
    }
}
