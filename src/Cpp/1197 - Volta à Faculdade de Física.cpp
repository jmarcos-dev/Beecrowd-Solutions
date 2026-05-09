#include <iostream>
using namespace std;
int main()
{
    int v, t, velocidade{};
    while (cin >> t >> v)
    {
        velocidade = (t * 2) * v;
        cout << velocidade << endl;
    }

    return 0;
}
