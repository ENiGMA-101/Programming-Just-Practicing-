Type: 1

/*
        1
      1 2
    1 2 3
  1 2 3 4
1 2 3 4 5 */
#include <stdio.h>
int main()
{
    int n, row, col;
    printf("Enter Row number: ");
    scanf("%d", &n);
    for(row=1; row<=n; row++)
    {
        for(col=1; col<=n-row; col++)
            printf("  ");
        for(col=1; col<=row; col++)
            printf("%d ",col);
        printf("\n");
    }
    return 0;
}

Type: 2

/*
        1
      2 2
    3 3 3
  4 4 4 4
5 5 5 5 5 */
#include <stdio.h>
int main()
{
    int n, row, col;
    printf("Enter Row number: ");
    scanf("%d", &n);
    for(row=1; row<=n; row++)
    {
        for(col=1; col<=n-row; col++)
            printf("  ");
        for(col=1; col<=row; col++)
            printf("%d ",row);
        printf("\n");
    }
    return 0;
}

Type: 3

/*
1 2 3 4 5
  1 2 3 4
    1 2 3
      1 2
        1 */
#include <stdio.h>
int main()
{
    int n, row, col;
    printf("Enter Row number: ");
    scanf("%d", &n);
    for(row=n; row>=1; row--)
    {
        for(col=1; col<=n-row; col++)
            printf("  ");
        for(col=1; col<=row; col++)
            printf("%d ",col);
        printf("\n");
    }
    return 0;
}


Type: 4

/*
5 5 5 5 5
  4 4 4 4
    3 3 3
      2 2
        1 */
#include <stdio.h>
int main()
{
    int n, row, col;
    printf("Enter Row number: ");
    scanf("%d", &n);
    for(row=n; row>=1; row--)
    {
        for(col=1; col<=n-row; col++)
            printf("  ");
        for(col=1; col<=row; col++)
            printf("%d ",row);
        printf("\n");
    }
    return 0;
}
