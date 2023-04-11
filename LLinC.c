#include<stdio.h>
#include<stdlib.h>
struct node {
    int data;
    struct node *next;
};
struct LL{
    struct node *head;
   
    
};
void addlast(struct LL list,int data){
        struct node *n1;
        n1=(struct node*) malloc(sizeof(struct node));
        n1->data=data;
        n1->next=0;
        struct node* temp=list.head;
        if(list.head->next==0){
            list.head=n1;
            return;
        }
        while(temp->next!=0){
            temp=temp->next;
        }
        temp->next=n1;
    }

    void print(struct LL list){
        struct node*ptr=list.head;
        while(ptr!=NULL){
            printf("%d ",(*ptr).data);
            ptr=ptr->next;
        }    
    }

int main(){
    
    struct LL list;
    //printf("%d",list.head->next);
    addlast(list,2);
    addlast(list,4);
    addlast(list,6);
    addlast(list,7);
    addlast(list,9);
    

    print(list);

    return 0;
}