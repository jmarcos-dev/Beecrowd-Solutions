#include <iostream>
using namespace std;

int main()
{
    string movimento_do_jipe;
    int quantia_de_pessoas, somador{}, quanti_jipe{};
    while (true)
    {
        cin >> movimento_do_jipe;
        if (movimento_do_jipe == "ABEND")
        {
            break;
        }
        cin >> quantia_de_pessoas;
        if (movimento_do_jipe == "SALIDA")
        {
            somador += quantia_de_pessoas;
            quanti_jipe += 1;
        }
        else if (movimento_do_jipe == "VUELTA")
        {
            somador -= quantia_de_pessoas;
            quanti_jipe--;
        }
    }

    cout << somador << endl;
    cout << quanti_jipe << endl;
    return 0;
}
