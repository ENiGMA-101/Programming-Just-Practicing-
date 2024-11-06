#include <stdio.h>
#include <math.h>
int main() 
{
    int n, i, j, sqrtNum, even, odd;
    scanf("%d", &n);
    int num[n];
    for (i = 0; i < n; i++) 
    {
        scanf("%d", &num[i]);
        even = 0;
        odd = 0;
        sqrtNum = (int)sqrt(num[i]);
        for (j = 1; j <= sqrtNum; j++) 
        {
            if (num[i] % j == 0) 
            {
                if (j % 2 == 0)
                    even++;
                else
                    odd++;
                if (j != num[i] / j) 
                {
                    if (num[i] / j % 2 == 0)
                        even++;
                    else
                        odd++;
                }
            }
        }
        if (even > odd)
            printf("1\n");
        else if (even == odd)
            printf("0\n");
        else
            printf("-1\n");
    }
    return 0;
}