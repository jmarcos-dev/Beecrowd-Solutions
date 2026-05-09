#include<iostream>
#include<iomanip>
using namespace std;

int main(){

    double raio, circulo{};
    cin >> raio;
    circulo = (raio * 3.14) * 2;
    cout << fixed << setprecision(2) <<circulo << endl;
    return 0;
}
