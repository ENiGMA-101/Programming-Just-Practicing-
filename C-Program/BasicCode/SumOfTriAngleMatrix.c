#include <stdio.h>
int main()
{
    int matrix[100][100], i, j, row, col, uppersum = 0,lowersum = 0 ;
    printf("Enter number of Row & Column : ");
    scanf("%d %d",&row,&col);
    while(row!=col)
    {
        printf("Error !! Enter any N(row) x N(column) square Matrix. \n\n");
        printf("Enter number of Row & Column : ");
        scanf("%d %d",&row,&col);
    }
    printf("\nValue of Matrix : \n");
    for(i=0; i<row; i++)
    {
        for(j=0; j<col; j++)
        {
            printf("Matrix[%d][%d] : ",i,j);
            scanf("%d",&matrix[i][j]);
        }
        printf("\n");
    }
    printf("Entered Matrix : \n\t");
    for(i=0; i<row; i++)
    {
        for(j=0; j<col; j++)
        {
            printf("%d ",matrix[i][j]);
        }
        printf("\n\t");
    }
    printf("\nUpper Triangle elements : ");
    for(i=0; i<row; i++)
    {
        for(j=0; j<col; j++)
        {
            if(i < j)
            {
                printf("%d  ",matrix[i][j]);
                uppersum = uppersum +  matrix[i][j];
            }
        }
    }
    printf("\nUpper Triangle elements : ");
    for(i=0; i<row; i++)
    {
        for(j=0; j<col; j++)
        {
            if(i > j)
            {
                printf("%d  ",matrix[i][j]);
                lowersum = lowersum +  matrix[i][j];
            }
        }
    }
    printf("\n\nSum of Upper triangle elements of matrix : ");
    printf("%d ",uppersum);
    printf("\n\nSum of lower triangle elements of matrix : ");
    printf("%d \n\n\n",lowersum);
    return 0;
}
