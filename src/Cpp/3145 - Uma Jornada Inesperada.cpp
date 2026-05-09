#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    double pessoas, distancia,disc;

    cin >> pessoas >> distancia;

    disc = distancia/(pessoas+2);
    cout << fixed;
    cout << setprecision(2) << disc << endl;

    return 0;
}
