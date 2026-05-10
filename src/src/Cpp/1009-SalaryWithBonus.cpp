#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
string name;
double salary, sales, comission;
cin >> name;
cin >> salary >> sales;
comission = (sales*0.15)+salary;
cout << fixed;
cout << "TOTAL = R$ "<< setprecision(2) << comission << endl;
return 0;
 }