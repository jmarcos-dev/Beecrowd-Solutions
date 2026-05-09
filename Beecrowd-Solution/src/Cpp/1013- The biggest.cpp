#include <bits/stdc++.h>
 
using namespace std;
 
int main() {
 
         int a,b,c,MaiorAB,MAIOR;
        cin>>a>>b>>c;
        MaiorAB=(a+b+abs(a-b))/2;
        MAIOR=(MaiorAB+c+abs(MaiorAB-c))/2;
        cout<<MAIOR<<" eh o maior"<<endl;
 
    return 0;
}