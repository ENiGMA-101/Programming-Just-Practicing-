#include <stdio.h>
int main()
{
    int N, X;
    scanf("%d %d", &N, &X);
    int array[N];
    for (int i = 0; i < N; i++)
        scanf("%d", &array[i]);  // Read the price of each bottle
    int mojo = 0;  // To store the size of the largest bottle, Dora can buy
    for (int i = N - 1; i >= 0; i--)  // Loop through end to start
    {
        // Check if Dora can afford this bottle
        if (array[i] <= X)
        {
            mojo = i + 1;  // Update mojo: +1 because bottle sizes start from 1
            break;  // Exit the loop after finding the largest bottle
        }
    }
    if (mojo > 0)
        printf("Happy %d\n", mojo);  // If can buy, print "Happy" and its liter size(L)
    else
        printf("Sad\n");  // If can't buy, print "Sad"
    return 0;
}
