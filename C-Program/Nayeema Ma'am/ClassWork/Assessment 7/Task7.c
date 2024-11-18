#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
};
struct node *head=NULL;

void begInsert()
{
    struct node *new = malloc(sizeof(struct node *));
    int item;
    printf("\nEnter value\n");
    scanf("%d",&item);
    new->data = item;
    new->next = head;
    head = new;
    printf("\nNode inserted\n");
}

void endInsert()
{
    struct node* new = malloc(sizeof(struct node));
    int item;
    printf("\nEnter value: ");
    scanf("%d", &item);
    new->data = item;
    new->next = NULL;
    if (head == NULL)
        head = new;
    else
    {
        struct node* ptr = head;
        while (ptr->next != NULL)
        {
            ptr = ptr->next;
        }
        ptr->next = new;
    }
    printf("\nNode inserted at the end.\n");
}

void insertSpecific()
{
    struct node* ptr ;
    struct node* temp = malloc(sizeof(struct node));
    ptr = head;
    int pos;
    printf("Enter Index to insert : ");
    scanf("%d",&pos);
    int item;
    printf("Enter Data : ");
    scanf("%d",&item);
    temp ->data = item;
    temp->next =NULL;
    for(int i=1; i<=pos-1; i++)
    {
        ptr = ptr->next;
    }
    temp->next = ptr->next;
    ptr->next = temp;
}

void begDelete()
{
    struct node *ptr;
    if(head == NULL)
        printf("\nList is empty");
    else
    {
        ptr = head;
        head = head->next;
        free(ptr);
        printf("\nDeleted from Beginning...");
    }
}

void endDelete()
{
    if (head == NULL)
    {
        printf("\nList is empty.\n");
        return;
    }
    struct node* temp;
    struct node*ptr = head;
    if (ptr->next == NULL)
    {
        head = NULL;
        free(ptr);
        printf("\nDeleted...\n");
        return;
    }
    while (ptr->next!=NULL)
    {
        temp = ptr;
        ptr=ptr->next;
    }
    temp->next = NULL;
    free(ptr);
    printf("\nDeleted from End...\n");
}

void deleteSpecificIndex()
{
    int index;
    printf("\nEnter index: ");
    scanf("%d", &index);

    if (head == NULL)
    {
        printf("\nList is empty.\n");
        return;
    }
    struct node* k = head;
    struct node* temp;
    for (int i = 0; i <=index - 1; i++)
    {
        temp = k;
        k=k->next;
    }
    temp->next=k->next;
    free(k);
    printf("\nNode deleted from index %d.\n", index);
}

void countNodes()
{
    int count = 0;
    struct node* temp = head;
    while (temp != NULL)
    {
        count++;
        temp = temp->next;
    }
    printf("\nTotal number of nodes: %d\n", count);
}

void searchNode()
{
    int item;
    printf("\nEnter value to search: ");
    scanf("%d", &item);
    struct node* temp = head;
    int index = 0;
    while (temp != NULL)
    {
        if (temp->data == item)
        {
            printf("\nNode with value %d found at index %d.\n", item, index);
            return;
        }
        index++;
        temp = temp->next;
    }
    printf("\nNode with value %d not found.\n", item);
}

void display()
{
    struct node *ptr;
    ptr = head;
    printf("Head %p \n",ptr);

    printf("\nPrinting values . . . . .\n");
    while (ptr!=NULL)
    {
        printf("%d ",ptr->data);
        printf("%p \n",ptr->next);
        ptr = ptr -> next;
    }
}
void main ()
{
    int choice =0,data,position;
    while(1)
    {
        printf("\n*********Main Menu*********\n");
        printf("Choose one option from the following list ...\n");
        printf("\n1.Insert in beginning\n2.Insert in end\n3.Insert in specific index\n4.Delete From Begin\n5.Delete From End\n6.Delete From Specific Index\n7.Count total nodes\n8.Search node by value\n9.Show\n10.Exit\n");
        printf("\nEnter your choice?\n");
        scanf("\n%d",&choice);
        switch(choice)
        {
        case 1:
            begInsert();
            break;
        case 2:
            endInsert();
            break;
        case 3:
            insertSpecific();
            break;
        case 4:
            begDelete();
            break;
        case 5:
            endDelete();
            break;
        case 6:
            deleteSpecificIndex();
            break;
        case 7:
            countNodes();
            break;
        case 8:
            searchNode();
            break;
        case 9:
            display();
            break;
        default:
            printf("Please enter valid choice..");
        }
    }
}





