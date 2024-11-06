#include <stdio.h>
struct Worker
{
    char name[100];
    int age;
    float salary;
};
int main()
{
    struct Worker work[4];
    for(int i=0; i<4; i++)
    {
        printf("\nInformation for Worker - %d : \n",i+1);
        printf("\nEnter Name of the worker : ");
        scanf("%s",work[i].name);
        printf("Enter Age of the worker : ");
        scanf("%d",&work[i].age);
        printf("Enter Salary of the worker : ");
        scanf("%f",&work[i].salary);
    }
    for(int i=0; i<4; i++)
    {
        printf("\n\nWorker - %d : \n",i+1);
        printf("Name of the worker : %s\n",work[i].name);
        printf("Age of the worker : %d\n",work[i].age);
        printf("Salary of the worker : %.2f\n",work[i].salary);
    }
    return 0;
}
