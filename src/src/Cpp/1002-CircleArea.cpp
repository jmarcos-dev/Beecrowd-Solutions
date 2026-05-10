#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
 double area, raio, n;
 n = 3.14159;
 cin >> raio;
 area = n *(raio*raio);
 cout << fixed;
 cout << "A=" << setprecision(4) <<area << endl;
    return 0;
}