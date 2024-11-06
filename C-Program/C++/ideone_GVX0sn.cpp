/*
████████████████████████████████████████████████████████████████████████████████████████

██      ██ ███    ██ ██   ██ ███████ ██████          ██      ██ ███████ ████████ ███████     
██      ██ ████   ██ ██  ██  ██      ██   ██         ██      ██ ██         ██    ██          
██      ██ ██ ██  ██ █████   █████   ██   ██         ██      ██ ███████    ██    ███████     
██      ██ ██  ██ ██ ██  ██  ██      ██   ██         ██      ██      ██    ██         ██     
███████ ██ ██   ████ ██   ██ ███████ ██████  ███████ ███████ ██ ███████    ██    ███████     
                                                                                             
████████████████████████████████████████████████████████████████████████████████████████
*/

// Header files
#include <bits/stdc++.h>
using namespace std;

// General Constants
const int INF = 1e9 + 5;
const int MOD = 1e9 + 7;
const double PI = acos(-1.0);

// General Macros
#define yes cout << "YES" << endl
#define no cout << "NO" << endl

// STL based Macros
#define sz(x) (ll)x.size()
#define endl "\n"
#define lb lower_bound
#define ub upper_bound

// Data Types based Macros
#define ll long long
#define ld long double

// String based Macros
#define str string
#define vs vector<str>
#define toLowerCase(s) transform(all(s), s.begin(), ::tolower)
#define toUpperCase(s) transform(all(s), s.begin(), ::toupper)

// Loops based Macros
#define all(x) x.begin(), x.end()
#define rall(x) x.rbegin(), x.rend()
#define rep(i, a, b) for (ll i = a; i < b; i++)
#define rrep(i, a, b) for (ll i = a; i >= b; i--)

// Arrays based Macros
#define mem(a, b) memset(a, b, sizeof(a))
#define clr(a) memset(a, 0, sizeof(a))
#define sortall(x) sort(all(x))
#define sortrall(x) sort(rall(x))

// Vector based Macros
#define vi vector<int>
#define vl vector<ll>
#define vvi vector<vi>
#define vvl vector<vl>
#define pb push_back
#define eb emplace_back
#define mp make_pair
#define ff first
#define ss second
#define pii pair<int, int>
#define pll pair<ll, ll>
#define vpii vector<pii>
#define vpll vector<pll>

// Input, Output and Debugging based Macros
#define fastio() ios_base::sync_with_stdio(false), cin.tie(NULL), cout.tie(NULL)
#define debug(x) cout << #x << " = " << x << endl
#define debug2(x, y) cout << #x << " = " << x << ", " << #y << " = " << y << endl
#define debug3(x, y, z) cout << #x << " = " << x << ", " << #y << " = " << y << ", " << #z << " = " << z << endl

// Array based functions
int minArray(int arr[], int n) { int res = arr[0]; for (int i = 1; i < n; i++) res = min(res, arr[i]); return res; }
int maxArray(int arr[], int n) { int res = arr[0]; for (int i = 1; i < n; i++) res = max(res, arr[i]); return res; }
int sumArray(int arr[], int n) { int res = 0; for (int i = 0; i < n; i++) res += arr[i]; return res; }
void reverseArray(int arr[], int n) { int l = 0, r = n - 1; while (l < r) swap(arr[l++], arr[r--]); }
void inputArray(int arr[], int n) { for (int i = 0; i < n; i++) cin >> arr[i]; }
void printArray(int arr[], int n) { for (int i = 0; i < n; i++) cout << arr[i] << " "; cout << endl; }

// GCD and LCM based functions
ll gcd(ll a, ll b) { return b == 0 ? a : gcd(b, a % b); }
ll lcm(ll a, ll b) { return a * (b / gcd(a, b)); }

// Power based functions
ll power(ll x, ll y) { ll res = 1; while (y > 0) { if (y & 1) res = res * x; y = y >> 1; x = x * x; } return res; }

// Factorial based functions
ll factorial(ll n) { return (n == 1 || n == 0) ? 1 : n * factorial(n - 1); }

// Prime number based functions
bool isPrime(ll n) { if (n <= 1) return false; for (ll i = 2; i <= sqrt(n); i++) if (n % i == 0) return false; return true; }
void sieveOfEratosthenes(ll n) { bool prime[n + 1]; memset(prime, true, sizeof(prime)); for (ll p = 2; p * p <= n; p++) { if (prime[p] == true) { for (ll i = p * p; i <= n; i += p) prime[i] = false; } } for (ll p = 2; p <= n; p++) if (prime[p]) cout << p << " "; }

// Search based functions
bool binarySearch(ll arr[], ll l, ll r, ll x) { if (r >= l) { ll mid = l + (r - l) / 2; if (arr[mid] == x) return true; if (arr[mid] > x) return binarySearch(arr, l, mid - 1, x); return binarySearch(arr, mid + 1, r, x); } return false; }

// Miscellaneous based functions
ll countDigit(ll n) { return floor(log10(n) + 1); }
ll countDivisors(ll n) { ll cnt = 0; for (ll i = 1; i <= sqrt(n); i++) { if (n % i == 0) { if (n / i == i) cnt++; else cnt = cnt + 2; } } return cnt; }
ll sumOfDigits(ll n) { ll sum = 0; while (n != 0) { sum = sum + n % 10; n = n / 10; } return sum; }

// String based functions
void reverseSubstring(string &s, int a, int b) { while (a < b) { swap(s[a], s[b]); a++; b--; } }
void reverseString(string &s) { int l = 0, r = s.length() - 1; while (l < r) { swap(s[l++], s[r--]); } }
void inputString(string &s) { cin >> s; }
void printString(string &s) { cout << s << endl; }

// Palindrome based functions
bool isPalindrome(string s) { int l = 0, r = s.length() - 1; while (l < r) { if (s[l] != s[r]) return false; l++; r--; } return true; }
bool isPalindrome(int n) { int temp = n, rev = 0; while (temp != 0) { rev = rev * 10 + temp % 10; temp = temp / 10; } return (n == rev); }

// Subsequence based functions
void printSubsequence(string &s, string &ans, int i) { if (i == s.length()) { cout << ans << endl; return; } printSubsequence(s, ans, i + 1); ans += s[i]; printSubsequence(s, ans, i + 1); ans.pop_back(); }
void printSubsequence(string &s) { string ans = ""; printSubsequence(s, ans, 0); }

// Permutation based functions
void printPermutation(string &s, string &ans) { if (s.length() == 0) { cout << ans << endl; return; } for (int i = 0; i < s.length(); i++) { char ch = s[i]; string ros = s.substr(0, i) + s.substr(i + 1); ans += ch; printPermutation(ros, ans); ans.pop_back(); } }
void printPermutation(string &s) { string ans = ""; printPermutation(s, ans); }

// Subarray based functions
void printSubarray(int arr[], int n) { for (int i = 0; i < n; i++) { for (int j = i; j < n; j++) { for (int k = i; k <= j; k++) { cout << arr[k] << " "; } cout << endl; } } }

// Subsets based functions
void printSubsets(int arr[], int n) { for (int i = 0; i < (1 << n); i++) { for (int j = 0; j < n; j++) { if (i & (1 << j)) { cout << arr[j] << " "; } } cout << endl; } }

// Pair based functions
void printPair(pair<int, int> &p) { cout << p.first << " " << p.second << endl; }

// Vector based functions
void printVector(vector<int> &v) { for (int i = 0; i < v.size(); i++) { cout << v[i] << " "; } cout << endl; }

// Important functions
int fact(int n) { int res = 1; for (int i = 2; i <= n; i++) res = res * i; return res; }
int nCr(int n, int r) { return fact(n) / (fact(r) * fact(n - r)); }
int nPr(int n, int r) { return fact(n) / fact(n - r); }

// Important STL based functions
void printSet(set<int> &s) { for (auto it : s) cout << it << " "; cout << endl; }
void printMap(map<int, int> &m) { for (auto it : m) cout << it.first << " " << it.second << endl; }
void printDeque(deque<int> &dq) { for (auto it : dq) cout << it << " "; cout << endl; }
void printStack(stack<int> &s) { while (!s.empty()) { cout << s.top() << " "; s.pop(); } cout << endl; }
void printQueue(queue<int> &q) { while (!q.empty()) { cout << q.front() << " "; q.pop(); } cout << endl; }
void printPriorityQueue(priority_queue<int> &pq) { while (!pq.empty()) { cout << pq.top() << " "; pq.pop(); } cout << endl; }

// Main function
int main() {
    fastio();

    // Code here
    int t = 1;
    cin >> t;
    // If no testcases exists, comment out "cin >> t;"

    while (t--) {
    	
    }
    
    return 0;
}