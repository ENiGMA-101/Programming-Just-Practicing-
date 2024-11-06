#include <stdio.h>
int main()
{
    int a, even = 0, odd = 0;
    printf("Enter last digit: ");
    scanf("%d", &a);
    printf("Sum of ");
    for (int i = 1; i <= a; i++)
    {
        if (i % 2 == 0)
        {
            even += i;
            {
                if (i != a)
                    printf("%d - ", i);
                else
                    printf("%d ", i);
            }
        }
        else
        {
            odd += i;
            if (i != a)
                printf("%d - ", i);
            else
            {
                printf("%d ", i);
            }
        }
    }
    printf("= %d\n", odd - even);
    return 0;
}