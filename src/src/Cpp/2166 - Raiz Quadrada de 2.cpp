#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    int n;
    double frac = 0.0, total = 0.0;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        frac = 1.0 /( 2.0 + frac);
    }
    total = 1.0 + frac;
    cout << fixed << setprecision(10) << total << endl;
    return 0;
}
