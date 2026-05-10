#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
int N, X, in=0, out=0;
cin >> N;
for (int i = 0; i < N; i++)
{
   cin >> X;
   if (X >=10 && X <=20)
   {
    in += 1;
   }
   else 
    out +=1;
   
}
cout << in << " in" << endl;
cout << out << " out" << endl;
return 0;
 }
