#include <stdio.h>
void sum(int a, int b)
{
    printf("Sum of the numbers is : %d\n\n",a+b);
}
void sub(int a, int b)
{
    printf("Sub of the numbers is : %d\n\n",a-b);
}
int main()
{
    int a,b;
    printf("Enter two numbers : ");
    scanf("%d %d",&a,&b);
    sum(a,b);
    printf("Enter two numbers : ");
    scanf("%d %d",&a,&b);
    sum(a,b);
    printf("Enter two numbers : ");
    scanf("%d %d",&a,&b);
    sub(a,b);
}
