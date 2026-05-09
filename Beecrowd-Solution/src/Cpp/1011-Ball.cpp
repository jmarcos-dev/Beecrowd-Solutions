#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;
int main()
{
    double pi, Volume, raio;
    cin >> raio;
    pi = 3.14159;
    Volume = (4.0 / 3) * pi * pow(raio, 3);
    cout << fixed;
    cout << "VOLUME = " << setprecision(3) << Volume << endl;
    return 0;
}