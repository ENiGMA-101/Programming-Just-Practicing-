#include <stdio.h>
int main()
{
    char name[100] ;
    printf("Enter your full name : ");
    gets(name);
    int i=0;
    while( name[i] !='\0' )
        {
            printf("%c\n",name[i]);
            i++;
        }
        printf("\nLength of your input : %d",strlen(name) );
    return 0;
}
