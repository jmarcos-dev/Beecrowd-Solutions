#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    double cachorro, pessoas, media;
    cin >> cachorro >> pessoas;
    media = cachorro / pessoas;
    cout << fixed;
    cout << setprecision(2) << media << endl;
    return 0;
}
