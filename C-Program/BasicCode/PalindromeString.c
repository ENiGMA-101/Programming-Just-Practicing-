#include <stdio.h>
int main()
{
    char name[100] ;
    char revname[100] ;
    printf("Enter your full name : ");
    gets(name);
    int i = 0, len = 0, j;
    while(name[i] != '\0')
    {
        i++;
        len++;
    }
    for(j=0, i=len-1 ; i>=0; i--, j++ )
    {
        revname[j] = name[i];
    }
    printf("Your given value is : %s\n",name);
    printf("Reversed value is : %s\n\n",revname);
    int d = strcmp(revname,name);
    if(d ==0)
        printf("String is Palindrome. \n");
    else
        printf("String is not Palindrome. \n");
    return 0;
}
