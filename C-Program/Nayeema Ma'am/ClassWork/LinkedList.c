#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;
};
struct node *head=NULL;

void beginsert()
{
    struct node *ptr;
    int item;
    ptr = malloc(sizeof(struct node *));
    printf("\nEnter value\n");
    scanf("%d",&item);
    ptr->data = item;
    ptr->next = head;
    head = ptr;
    printf("\nNode inserted");
}

void midinsert() 
{
    struct node* new;
    int item, position;
    new = malloc(sizeof(struct node));
    printf("\nEnter value: ");
    scanf("%d", &item);
    printf("Enter position: ");
    scanf("%d", &position);
    new->data = item;
    if (position == 1) 
    {
        new->next = head;
        head = new;
        printf("\nNode inserted at the beginning.\n");
        return;
    }
    struct node* ptr = head;
    int current_position = 1;
    while (ptr != NULL && current_position < position - 1) 
    {
        ptr = ptr->next;
        current_position++;
    }
    if (ptr != NULL) 
    {
        new->next = ptr->next;
        ptr->next = new;
        printf("\nNode inserted at position %d.\n", position);
    } 
    else 
    {
        printf("\nInvalid position.\n");
        free(new);
    }
}

void endinsert() 
{
    struct node* new;
    int item;
    new = malloc(sizeof(struct node));
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

void begdelete()
{
    struct node *ptr;
    if(head == NULL)
        printf("\nList is empty");
    else
    {
        ptr = head;
        head = head->next;
        free(ptr);
        printf("\n Node deleted from the begining ...");
    }
}

void EndDelete() 
{
    if (head == NULL) 
    {
        printf("\nList is empty. Cannot delete from end.\n");
        return;
    }
    struct node* temp;
    struct node*ptr = head;
    if (ptr->next == NULL) 
    {
        head = NULL;
        free(ptr);
        printf("\nNode deleted from the end.\n");
        return;
    }
    while (ptr->next!=NULL) 
    {
        temp = ptr;
        ptr=ptr->next;
    }
    temp->next = NULL;
    free(ptr);
    printf("\nNode deleted from the end.\n");
}

void deleteFromIndex() 
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
    for (int i = 0;i <=index - 1; i++) 
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
    printf("\nprinting values . . . . .\n");
    while (ptr!=NULL)
    {
        printf("%d ",ptr->data);
        ptr = ptr -> next;
    }
}

void main() 
{
    int choice = 0;
    while (1) 
    {
        printf("\n********* Main Menu *********\n");
        printf("Choose one option from the following list:\n");
        printf("1. Insert at the beginning\n");
        printf("2. Insert at the end\n");
        printf("3. Insert at a specific position\n");
        printf("4. Delete at the beginning\n");
        printf("5. Delete at the end\n");
        printf("6. Delete at a specific position\n");
        printf("7. Count the total number of nodes\n");
        printf("8. Search a node by value\n");
        printf("9. Show\n");
        printf("10. Exit\n");
        printf("\nEnter your choice: ");
        scanf("%d", &choice);

        switch (choice) 
        {
            case 1:
                beginsert();
                break;
            case 2:
                endinsert();
                break;
            case 3:
                midinsert();
                break;
            case 4:
                begdelete();
                break;
            case 5:
                EndDelete();
                break;
            case 6:
                deleteFromIndex();
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
            case 10:
                printf("\nExiting program...\n");
                exit(0);
            default:
                printf("Invalid choice. Please enter a valid option.\n");
        }
    }
}
