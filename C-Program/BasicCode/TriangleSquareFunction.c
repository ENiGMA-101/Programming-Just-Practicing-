#include <stdio.h>
void area(double b,double h)
{
    printf("Area of the Triangle is : %.lf square.\n\n",(0.5*b*h));
}
int main()
{
    double base,height;
    printf("Enter Base : ");
    scanf("%lf",&base);
    printf("Enter Height : ");
    scanf("%lf",&height);
    area(base,height);
    return 0;
}
