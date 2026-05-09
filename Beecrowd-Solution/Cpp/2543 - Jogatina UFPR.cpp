#include <iostream>
using namespace std;
int main()
{
    int casos, n_da_universidade, universidade, valor;

    while (cin >> casos >> n_da_universidade)
    {
        int contador = 0;
        for (int i = 0; i < casos; i++)
        {

            cin >> universidade >> valor;
            if (universidade == n_da_universidade && valor == 0)
            {
                contador++;
            }
        }
        cout << contador <<endl;
    }

    return 0;
}
