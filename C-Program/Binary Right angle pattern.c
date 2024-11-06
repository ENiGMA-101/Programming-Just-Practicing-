Type: 1

/*
1
1 0
1 0 1
1 0 1 0 
1 0 1 0 1 */
#include <stdio.h>
int main()
{
    int n, row, col;
    printf("Enter Row number: ");
    scanf("%d", &n);
    for(row=1; row<=n; row++)
    {
        for(col=1; col<=row; col++)
        printf("%d ",col%2);
        printf("\n");
    }
    return 0;
}

Type: 2

/*
1
0 0
1 1 1
0 0 0 0
1 1 1 1 1 */
#include <stdio.h>
int main()
{
    int n, row, col;
    printf("Enter Row number: ");
    scanf("%d", &n);
    for(row=1; row<=n; row++)
    {
        for(col=1; col<=row; col++)
        printf("%d ",row%2);
        printf("\n");
    }
    return 0;
}

