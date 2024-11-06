#include <stdio.h>
int main()
{
    int n,array[n],i,j;
    printf("Enter array size : ");
    scanf("%d",&n);

    printf("Enter elements : ");
    for(i=0; i<n; i++)
        scanf("%d",&array[i]);

    int value;
    printf("Which element do you want to search? : ");
    scanf("%d",&value);

    int pos= -1;
    for(j=0; j<n; j++)
    {
        if(value==array[j])
        {
            pos = j+1;
            break;
        }
    }
    if(pos==-1)
        printf("Not found here. ");
    else
        printf("The value %d is %d'th position.",value,pos);
    return 0;
}
