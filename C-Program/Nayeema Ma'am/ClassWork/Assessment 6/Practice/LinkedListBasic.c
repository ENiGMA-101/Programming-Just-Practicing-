#include <stdio.h>
#include <stdlib.h>

struct node 
{
    int data;
    struct node* next;
};
struct node* head = NULL;

void addFirst(int value) 
{
    struct node* new = malloc(sizeof(struct node));
    new->data = value;
    new->next = head;
    head = new;
}

void addLast(int value) 
{
    struct node* new = malloc(sizeof(struct node));
    new->data = value;
    new->next = NULL;

    if (head == NULL)
        head = new;
    else 
    {
        struct node* last = head;
        while (last->next != NULL) 
        {
            last = last->next;
        }
        last->next = new;
    }
}

void display() 
{
    struct node* temp = head;
    while (temp != NULL) 
    {
        printf("%d %d\n",temp ->data,temp->next);
        temp = temp->next;
    }
    printf("\n");
}

int main() 
{
    int value, choice;
    while (1) 
    {
        printf("Enter your choice:\n");
        printf("1. Add a node to the beginning\n");
        printf("2. Add a node to the end\n");
        printf("3. Display the list\n");
        printf("4. Exit\n");
        printf("Enter your choice : ");
        scanf("%d", &choice);
        switch (choice) 
        {
            case 1:
                printf("Enter the value to be added: ");
                scanf("%d", &value);
                addFirst(value);
                break;
            case 2:
                printf("Enter the value to be added: ");
                scanf("%d", &value);
                addLast(value);
                break;
            case 3:
                display();
                break;
            case 4:
                printf("Exiting...\n");
                exit(0);
            default:
                printf("Invalid choice. Please try again.\n");
        }
    }
}