#include<bits/stdc++.h>
using namespace std;
class cmp
{
public:
    bool operator()(pair<int,int>x,pair<int,int>y)
    {
        return x.second>y.second;
    }
};
int main()
{
    int n;
    cin>>n;
    int a[n+1];
    cin>>a[n];
    for(int i=0; i<n; i++)cin>>a[i];
    priority_queue<pair<int,int>,vector<pair<int,int>>,cmp>q;
    for(int i=0; i<n; i++)
    {
        int mn=INT_MAX;
        for(int j=0; j<n; j++)
        {
            if(a[i]!=a[j])mn=min(mn,abs(a[i]-a[j]));
        }
        q.push({a[i],mn});
    }
    int i=0,mx=INT_MIN,mn=INT_MAX;
    while(!q.empty() && i<a[n])
    {
        mx=max(q.top().first,mx);
        mn=min(q.top().first,mn);
        q.pop();
        i++;
    }
    cout<<mx-mn<<endl;
}
