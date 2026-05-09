#include <iostream>
#include <iomanip>
using namespace std;
double ICM(double distancia, double diametro1, double diametro2)
{
    double resultado = 0.0;
    resultado = distancia / (diametro1 + diametro2);
    return resultado;
}

int main()
{
    double distancia, diametro1, diametro2;
    cin >> distancia >> diametro1 >> diametro2;
    cout << fixed << setprecision(2) << ICM(distancia, diametro1, diametro2) << endl;

    return 0;
}
