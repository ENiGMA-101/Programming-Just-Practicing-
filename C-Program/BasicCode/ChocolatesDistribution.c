#include<stdio.h>
int main()
{
    int N, M, result;
    scanf("%d %d", &N, &M); // Take input chocolates (N), number of students (M)
    int array[N]; // Declare an array to store the chocolates
    for (int i = 0; i < N; i++)
        scanf("%d", &array[i]);// Loop to take input for each chocolate
    // Bubble sort: to sort the chocolates array in ascending order
    for(int i = 0; i < N-1; i++)
    {
        for(int j = i+1; j < N; j++)
        {
            if(array[i] > array[j])   // If current element is greater than the next element, need to swap them
            {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
    }
    /* After sorting, ekta loop create krbo jeta student er number prjnto cholbe
    & r se poriman niye chocolates er max value r min value nibo then minize kore minimum possible chocolates pabo.
    Suppose :
    Chocolates packets : 7 ; Students : 3
    Number of chocolates : 7 3 2 4 9 12 56
    sorted : 2 3 4 7 9 12 56
    for 3 students : 2 3 4
    result = max - min ; result = 4 - 2
    So minimum possible chocolates 2.
    */
    for (int i = 0; i < M; i++)
        result = array[M-1] - array[0];
    printf("%d\n", result);
}
