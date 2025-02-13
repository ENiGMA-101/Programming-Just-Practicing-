#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cout << "\nEnter size of the array: ";
    cin >> n;

    if (n % 2 == 0)
        cout << "Output: 0" << endl;

    else
    {
        int i, array[n];
        cout << "Enter " << n << " elements: ";

        for (auto &i: array)
            cin >> i;

        int sum = 0;

        for (auto i: array)
            sum += i;

        cout << "Output: " << sum << endl;
    }
}