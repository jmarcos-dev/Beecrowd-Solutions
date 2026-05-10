#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    double Volume, Diametro, Altura{}, raio{}, Area{};

    while (cin >> Volume >> Diametro)
    {
        raio = Diametro / 2;
        Altura = (Volume) / (3.14 * (raio * raio));
        Area = (raio * raio) * 3.14;
        cout << fixed;
        cout << "ALTURA = " << setprecision(2) << Altura << endl;
        cout << "AREA = " << setprecision(2) << Area << endl;
    }

    return 0;
}
