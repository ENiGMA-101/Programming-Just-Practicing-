#include<stdio.h>
int main()
{
    int array[]={2,4,8,12,8};
    int pos=-1;
    for(int i=0; i<5;i++)
    {
        if(array[i]==8)
            {
                pos=i;
                break;
            }
    }
    if(pos!=-1)
            printf("%d",pos); 
    else
            printf("%d",pos);
    return 0;
}