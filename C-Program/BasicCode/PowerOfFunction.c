#include <stdio.h>
void power(double b,double e)
{
    double res = 1,i;
    for( i =1 ; i<=e; i++)
        res = res * b ;
    printf("Result of your value : %.lf \n\n",res);
}
int main()
{
    double base,exp;
    printf("Enter Base : ");
    scanf("%lf",&base);
    printf("Enter Exponent : ");
    scanf("%lf",&exp);
    power(base,exp);
    return 0;
}
