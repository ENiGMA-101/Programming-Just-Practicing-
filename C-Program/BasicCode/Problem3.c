#include <stdio.h>
// using insertion sort on the array
void insertionSort(int arr[], int n)
{
    for (int i = 1; i < n; i++)
    {
        int key = arr[i];
        int j = i - 1;
        // move elements that are greater than key to one position ahead of their current position
        while (j >= 0 && arr[j] > key)
        {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}
int main()
{
    int N, M;  // N =packet number ,M= student number
    printf("Enter the number of chocolate packets and number of students:\n");
    scanf("%d %d", &N, &M);
    int A[100];  // Assume a fixed maximum size
    printf("Enter the number of chocolates in each packet:\n");
    for (int i = 0; i < N; i++)
    {
        scanf("%d", &A[i]);
    }
    // Sort the array using insertion sort
    insertionSort(A, N);
    int minDifference = A[M - 1] - A[0];  // Initialize with the first group difference
    for (int i = 1; i <= N - M; i++)
    {
        int currentDifference = A[i + M - 1] - A[i];
        if (currentDifference < minDifference)
        {
            minDifference = currentDifference;
        }
    }
    // Output
    printf("The minimum  difference is: %d\n", minDifference);
    return 0;
}
