#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
float val, media;
int positv=0;
for (int i = 0; i < 6; i++)
{
    cin >> val;

if(val >0)
{
    positv+=1;
    media += (val)/4;
}

}

cout << positv << " valores positivos" << endl;
cout << fixed;
cout << setprecision(1) << media << endl;
return 0;
 }