#include <iostream>
#include <iomanip>
using namespace std;
void Porta(int casos)
{
    int horas, minutos, situacao_da_porta;
    while (casos != 0)
    {
        cin >> horas >> minutos >> situacao_da_porta;
        cout << setw(2) << setfill('0') << horas << ":"
             << setw(2) << setfill('0') << minutos;
        if (situacao_da_porta == 1)
        {
            cout << " - A porta abriu!" << endl;
        }
        else if (situacao_da_porta == 0)
        {
            cout <<" - A porta fechou!" << endl;
        }

        casos--;
    }
}

int main()
{
    int casos;
    cin >> casos;
    Porta(casos);
    return 0;
}
