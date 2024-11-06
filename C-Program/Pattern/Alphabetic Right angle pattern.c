Type: 1 [ Same coloumn number ]

/*
A
A B
A B C
A B C D
A B C D E */
#include <stdio.h>
int main()
{
    int n, row, col;
    printf("Enter Row number: ");
    scanf("%d", &n);
    for(row=1; row<=n; row++)
    {
        for(col=1; col<=row; col++)
        printf("%c ",col+64);
        printf("\n");
    }
    return 0;
}

Type: 2 [ Same row number ]

/*
A
B B
C C C
D D D D
E E E E E */
#include <stdio.h>
int main()
{
    int n, row, col;
    printf("Enter Row number: ");
    scanf("%d", &n);
    for(row=1; row<=n; row++)
    {
        for(col=1; col<=row; col++)
        printf("%c ",row+64);
        printf("\n");
    }
    return 0;
}

Type: 3 [ Same coloumn number ]

/*
A B C D E
A B C D
A B C
A B
A */
#include <stdio.h>
int main()
{
    int n, row, col;
    printf("Enter Row number: ");
    scanf("%d", &n);
    for(row=n; row>=1; row--)
    {
        for(col=1; col<=row; col++)
        printf("%c ",col+64);
        printf("\n");
    }
    return 0;
}

Type: 4 [ Same row number ]

/*
E E E E E
D D D D
C C C
B B
A */
#include <stdio.h>
int main()
{
    int n, row, col;
    printf("Enter Row number: ");
    scanf("%d", &n);
    for(row=n; row>=1; row--)
    {
        for(col=1; col<=row; col++)
        printf("%c ",row+64);
        printf("\n");
    }
    return 0;
}
