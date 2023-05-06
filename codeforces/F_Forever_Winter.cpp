#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin >> t;
    while(t--){
        int n,m,x,y,count1=0;
        cin >> n >> m;
        int a[n+1] = {0};
        while(m--){
            cin >> x >> y;
            a[x]++;
            a[y]++;
        }
        for(int i=1;i<n+1;i++){
            if(a[i]==1)
                count1 += 1;
        }
        int res = (n-count1-1);
        cout << res << " " << (count1/ res)<<endl;
    }
    return 0;
}