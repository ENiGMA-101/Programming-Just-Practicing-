#include <stdio.h>
int main()
{
    int n, first = 0, sec = 1, fibo, count = 0;
    printf("Enter Range : ");
    scanf("%d",&n);
    while(count<n)
    {
        if(count<=1)
            fibo = count ;
        else
        {
            fibo = first + sec ;
            first = sec;
            sec = fibo;
        }
        printf ("%d ",fibo);
        count ++;
    }
    return 0;
}
