#include <stdio.h>

int main ()
{
    int n, option, push;
    // take queue size from the user as input
    printf("Enter size : ");
    scanf("%d", &n);
    int array[n]; // declare the queue of that specified size
    int front = -1, rear = -1; // declare variables named as front and rear, initially their values will be -1

    while (1)
    {
        printf("\n\nType..\n1 to enqueue\n2 to dequeue\n3 to check if the queue is Empty\n4 to check if the queue is Full\n5 to check size\n6 to check Front index\n7 to check peek value\n0 to exit\n");
        scanf("%d", &option);

        if (option == 1)
        {
            if ((rear + 1) % n == front) // If rear = maximum size of the queue then Print: Overflow and Return.
                printf("Overflow.\n");
            else
            {
                printf("Enqueue Value : ");
                scanf("%d", &push); // else ask user what value to enqueue, name it as “push”
                if (front == -1) front = 0;
                rear = (rear + 1) % n; // increment the value of rear by 1
                array[rear] = push; // insert the specified number of “push” in the “rear”-th index of the queue
            }
            printf("Elements : ");
            for (int i = front; i != rear; i = (i + 1) % n)
                printf("%d ", array[i]); // After the if else loop print the queue
            printf("%d ", array[rear]);
        }
        else if (option == 2)
        {
            if (front == -1) // If front = -1 then Print: Underflow and Return.
                printf("Underflow.\n");
            else
            {
                array[front] = NULL;
                if (front == rear)
                    front = rear = -1; // if the queue becomes empty
                else
                    front = (front + 1) % n; // increment the value of front by 1
            }
            // After the if else loop print the queue
            printf("Elements : ");
            if (front != -1)
            {
                for (int i = front; i != rear; i = (i + 1) % n)
                    printf("%d ", array[i]);
                printf("%d ", array[rear]);
            }
        }
        else if (option == 3)
        {
            if (front == -1)
            {
                printf("Queue is empty."); // return true(1) if queue is empty, false(0) otherwise
                return 1;
            }
            else
                return 0;
        }
        else if (option == 4)
        {
            if ((rear + 1) % n == front)   // return true(1) if queue is full, false(0) otherwise
            {
                printf("Queue is full");
                return 1;
            }
            else
                return 0;
        }
        else if (option == 5)
            printf("Size of the queue: %d\n", (rear >= front) ? (rear - front + 1) : (n - front + rear + 1));
        else if (option == 6)
        {
            if (front == -1)
            {
                printf("Queue is empty, no front index\n");
            }
            else
                printf("Index of the front element: %d\n", front);
        }
        else if (option == 7)
        {
            if (front == -1)
                printf("Queue is empty, no front element to peek\n");
            else
                printf("Front element: %d\n", array[front]);
        }
        else if (option == 0)
            return 0;
        else
            printf("Invalid input.\n");
    }

    return 0;
}

