#include <iomanip>
#include <iostream>
using namespace std;
int main()
{
    int codp1, np1, codp2, np2;
    double unip1, unip2, som1, som2;
    cout << fixed;
    cin >> codp1 >> np1 >> unip1;
    som1 = np1 * unip1;
    cin >> codp2 >> np2 >> unip2;
    som2 = np2 * unip2;
    cout << "VALOR A PAGAR: R$ " << setprecision(2) << som2 + som1 << endl;
    return 0;
}
