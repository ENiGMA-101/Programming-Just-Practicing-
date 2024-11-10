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
    struct node *new;
    int item;
    new = malloc(sizeof(struct node *));
    printf("\nEnter value\n");
    scanf("%d",&item);
    new->data = item;
    new->next = head;
    head = new;
    printf("\nNode inserted");
}

void endInsert()
{
    int data;
    printf("Enter value: ");
    scanf("%d",&data);
    struct node *new = malloc(sizeof(struct node));
    new->data = data;
    new->next = NULL;
    if (head == NULL) {
        head = new;
        printf("Node inserted at the end (empty list)\n");
        return;
    }
    struct node *current = head;
    while (current->next != NULL)

        {
        current = current->next;
    }
    current->next = new;
    printf("Node inserted at the end\n");

}

void display()
{
    struct node *ptr;
    ptr = head;
    printf("Head %p \n",ptr);


    printf("\nprinting values . . . . .\n");
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
        //printf("\n===============================================\n");
        printf("\n1.Insert in beginning\n2.Insert in end\n3.Show\n4.Exit\n");
        printf("\nEnter your choice?\n");
        scanf("\n%d",&choice);
        switch(choice)
        {
        case 1:
            beginsert();
            break;
        case 2:
            endInsert();
            break;
        case 3:
            display();
            break;
        default:
            printf("Please enter valid choice..");
        }
    }
}




