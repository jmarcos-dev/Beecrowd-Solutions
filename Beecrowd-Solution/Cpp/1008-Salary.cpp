#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
float number, salary, hours;
cin >> number >> salary >> hours;
cout << "NUMBER = " << number << endl;
cout << fixed;
cout << "SALARY = U$ " << setprecision(2) <<(salary*hours) << endl;  
return 0;
 }