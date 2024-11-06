#include <stdio.h>
#define MAXN 100000
int main() {
    int n;
    long long H;
    int A[MAXN];
    // Input
    scanf("%d %lld", &n, &H);
    for (int i = 0; i < n; i++) {
        scanf("%d", &A[i]);
    }
    // Binary search for the minimum S
    int left = 1, right = 1000000000;
    int result = right;

    while (left <= right) {
        int mid = left + (right - left) / 2;
        long long hours = 0;

        // Calculate total hours needed if Dora eats mid chocolates per hour
        for (int i = 0; i < n; i++) {
            // Equivalent to ceil(A[i] / mid)
            hours += (A[i] + mid - 1) / mid;
        }
        // Check if the total hours is less than or equal to H
        if (hours <= H) {
            result = mid;  // Mid is a valid value, try for a smaller one
            right = mid - 1;
        } else {
            left = mid + 1; // Mid is too small, increase it
        }
    }
    // Output the result
    printf("%d\n", result);

    return 0;
}
