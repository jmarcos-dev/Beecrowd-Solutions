#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
int X;
cin >> X;
for (int i = 1; i <= X; i++)
{
    int som=0;
    som+=i;
 
    if (som%2!=0)
    {
         cout << som << endl;
    }
    
    
}

return 0;
 }
