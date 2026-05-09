#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    double frac = 0.0, total = 0.0;
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        frac = 1.0 / (6.0 + frac);
    }
    total = 3.0 + frac;
    cout << fixed << setprecision(10) << total << endl;
    return 0;
}
