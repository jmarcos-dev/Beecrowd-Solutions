#include <iostream>
#include <iomanip>
#include <math.h>
using namespace std;
int main()
{
int a;
cin >> a;
for (int i = 2; i <=a ; i++)
{
    if(i%2==0)
    cout << i << "^2 = "<< i*i <<  endl;
}



return 0;
 }
