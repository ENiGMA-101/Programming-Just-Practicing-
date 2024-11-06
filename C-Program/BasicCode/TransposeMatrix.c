#include <stdio.h>
int main()
{
    int matrix[100][100], trans[100][100], i, j, row, col ;
    printf("Enter number of Row & Column : ");
    scanf("%d %d",&row,&col);
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
    printf("\nTranspose Matrix : \n\t");
    for(i=0; i<row; i++)
    {
        for(j=0; j<col; j++)
        {
            trans[j][i] = matrix[i][j];
        }
    }
    for(i=0; i<col; i++)
    {
        for(j=0; j<row ; j++)
        {
            printf("%d ",trans[i][j]);
        }
        printf("\n\t");
    }
    return 0;
}
