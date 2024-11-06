#include <stdio.h>
int main()
{
    char name[100], n ;
    int i,vowel,consonant,digit,space,other;
    printf("Enter your desire word : ");
    gets(name);
    i=vowel=consonant=digit=space=other=0;
    while( (n=name[i]) !='\0')
    {
        if(n=='a' || n=='e' || n=='i' || n=='o'|| n=='u'||n=='A' || n=='E' || n=='I' || n=='O'|| n=='U')
            vowel++;
        else if((n>='a' && n<='z') || (n>='A' && n<='Z'))
            consonant++;
        else if(n>='0' && n<='9')
            digit++;
        else if(n==' ')
            space++;
        else
            other++;
        i++;
    }
    printf("\n\nYour entered word size = %d\n",strlen(name));
    printf("\nYou entered vowel = %d\n",vowel);
    printf("You entered consonant = %d\n",consonant);
    printf("You entered digit = %d\n",digit);
    printf("You entered space = %d\n",space);
    printf("You entered other character = %d\n",other);
    return 0;
}

