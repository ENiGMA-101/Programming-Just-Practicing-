#include<stdio.h>
int main()
{
    int n,H;
    scanf("%d %d",&n,&H);
    int array[n]; // will store user's input here
    for(int i=0; i<n; i++)
        scanf("%d",&array[i]);
    int sum=0;//Declaring sum value as zero(0)
    //To summation of 'User's input', applying a loop
    for(int i=0; i<n; i++)
        sum+=array[i];//It will summation from index 0 to N, & store them in sum.
    int result = ceil(sum*1.00/H);
    /*Sob input er summation er sathe 1.00 multiply krbo to make float value
    & oita hour(H) diye division krbo to get the minimum chocolates to eat.
    & etar ceil value (means max int value ) nibo.
    Suppose: chocolates packet 4, hours 8
    chocolates : 3 6 7 11
    Solve : sum = 3+6+7+11; sum = 27
    result = 27*1.00/8; result = 27.00/8
    after division result will be 4.00
    so, integer value will be 4
    */
    printf("%d\n",result);
}
