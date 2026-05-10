#include <iostream>

using namespace std;
void inseto(int casos)
{
    int energia;
    while (casos != 0)
    {
        cin >> energia;
        if (energia > 8000)
        {
            cout << "Mais de 8000!" << endl;
        }
        else
        {
            cout << "Inseto!" << endl;
        }
        casos--;
    }
}

int main()
{
    int casos;
    cin >> casos;
    inseto(casos);

    return 0;
}
