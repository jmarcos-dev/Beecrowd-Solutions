#include <iostream>
#include <iomanip>
#include <cmath>
using namespace std;
void funcao_Log(int n)
{
    double funmin, funmax;
    funmin = (n / log(n));
    funmax = 1.25506 * (n / log(n));
    cout << fixed;
    cout << setprecision(1) << funmin << " " << funmax << endl;
}

int main()
{
    double n;
    cin >> n;
    funcao_Log(n);
    return 0;
}
