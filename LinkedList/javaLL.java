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
    void addfirst(int data){
        node new_node=new node(data);
        size++;
        if(head==null){
            head=new_node;
            return;
        }
        new_node.next=head;
        head=new_node;
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
    void deletefirst(){
        if(head==null){
            System.out.println("this list is empty");
            return;
        }
        size--;
        head=head.next;
    }
    void deletelast(){
        if(head==null){
            System.out.println("this list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        node n1=head,n2=head.next;
        while(n2.next!=null){
            n1=n2;
            n2=n2.next;
        }
        n1.next=null;


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
    void deletethis(int key){ 
        node currnode = head,prev=null;
        if(currnode != null && currnode.data==key){
            head = currnode.next;
            System.out.println(key + " found and deleted");
            size--;
            
        }
        while(currnode != null && currnode.data != key){
            prev=currnode;
            currnode = currnode.next;
        }
        if(currnode != null){
            prev.next=currnode.next;
            System.out.println(key + " found and deleted");
            size--;
        }
        if(currnode == null){
            System.out.println(key + " not found");
        }

    }
    public void reverselist(){
		if(head == null || head.next == null){
			return;
		}
		
		node prevnode = head;
		node currnode = head.next;
		head.next=null;
        while(currnode!=null){
            node temp=currnode.next;
            currnode.next=prevnode;
            prevnode=currnode;
            currnode=temp;
        }
        head=prevnode;
				
	}
    public node reverseRecurcive(node head){
		if(head == null || head.next == null){
			return head;
		}
		node newHead = reverseRecurcive(head.next);
		head.next.next = head;
		head.next = null;
		
		return newHead;
	}
}


public class javaLL {
    
    public static void main(String[] args) {
        linkedlist list=new linkedlist();
        list.addlast(1);
        list.addlast(2);
        list.addlast(3);
        list.display(list);
        list.addlast(4);
        list.addlast(5);
        list.display(list);
        list.deletethis(3);
        list.display(list);
        list.addfirst(12);
        list.display(list);
        list.reverselist();
        list.display(list);
        list.head=list.reverseRecurcive(list.head);
        list.display(list);
        
        list.deletefirst();
        list.display(list);
        System.out.println(list.getsize());
    }
}
