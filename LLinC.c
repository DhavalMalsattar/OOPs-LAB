#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *next;
};
struct LL
{
    struct node *head;
    int size;
};

void addfirst(struct LL *list, int data)
{
    struct node *n1 = (struct node *)malloc(sizeof(struct node));
    n1->data = data;
    n1->next = NULL;
    list->size++;
    if (list->head == NULL)
    {
        list->head = n1;
        return;
    }
    n1->next = list->head;
    list->head = n1;
}
void addlast(struct LL *list, int data)
{
    struct node *n1;
    n1 = (struct node *)malloc(sizeof(struct node));
    n1->data = data;
    n1->next = NULL;
    list->size++;
    if (list->head == NULL)
    {
        list->head = n1;
        return;
    }
    struct node *temp = list->head;
    while (temp->next != NULL)
    {
        temp = temp->next;
    }
    temp->next = n1;
}
void deletelast(struct LL *list)
{
    if (list->head == NULL)
    {
        printf("list is empty\n");
        return;
    }
    list->size--;

    struct node *temp = list->head;
    if (temp->next == NULL)
    {
        temp = NULL;
        return;
    }

    while (temp->next->next != NULL)
    {
        temp = temp->next;
    }
    temp->next = NULL;
}
void deletefirst(struct LL *list)
{
    if (list->head == NULL)
    {
        printf("list is empty\n");
        return;
    }
    list->size--;
    list->head = list->head->next;
}

void print(struct LL *list)
{
    struct node *ptr = list->head;
    while (ptr != NULL)
    {
        printf("%d ", (*ptr).data);
        ptr = ptr->next;
    }
    printf("\n");
}
void reverseIterate(struct LL *list)
{
    if (list->head == NULL || list->head->next == NULL)
    {
        return;
    }

    struct node *pretemp = list->head, *temp = list->head->next;
    struct node *temp2;
    list->head->next = NULL;
    while (temp != NULL)
    {
        temp2 = temp->next;
        temp->next = pretemp;
        pretemp = temp;
        temp = temp2;
    }
    list->head = pretemp;
}
struct node *reverse_recursive(struct node *head)
{
    if (head == NULL || head->next == NULL)
    {
        return head;
    }
    struct node *newhead = reverse_recursive(head->next);
    head->next->next = head;
    head->next = NULL;
    return newhead;
}

int main()
{

    struct LL *list;
    list = (struct LL *)malloc(sizeof(struct LL));

    // list.head->data = 10;
    // list.head->next = NULL;
    //  printf("%d", list.head->next);
    // printf("%u\n", list->head);
    // printf("%d\n", list->head->data);
    // printf("%d", list->head->next->data);
    // printf("Dhaval\n");
    list->head = NULL;
    list->size = 0;

    addlast(list, 2);
    addlast(list, 4);
    addlast(list, 6);
    addlast(list, 7);
    addlast(list, 9);
    print(list);
    addfirst(list, 12);
    print(list);
    reverseIterate(list);
    print(list);
    list->head = reverse_recursive(list->head);
    print(list);
    deletelast(list);
    print(list);
    deletefirst(list);
    print(list);
    printf("%d", list->size);

    return 0;
}