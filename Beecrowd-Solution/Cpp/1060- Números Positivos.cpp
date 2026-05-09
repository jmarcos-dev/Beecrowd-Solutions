#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    double a;
    int cont = 0;
    for (int i = 0; i < 6; i++)
    {
        cin >> a;
        if (a > 0)
        {
            cont++;
        }
    }
    cout << cont << " valores positivos" << fixed << setprecision(1) <<endl;

    return 0;
}