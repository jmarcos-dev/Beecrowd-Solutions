#include <iostream>
using namespace std;
int fucfuc(int Monica, int Filho1, int Filho2)
{
    int Soma = 0, Total = 0;
    Soma = Filho1 + Filho2;
    Total = Monica - Soma;
    if (Total > Filho1 && Total > Filho2)
    {
        return Total;
    }
    else if (Filho1 > Filho2 && Filho1 > Total)
    {
        return Filho1;
    }
    else
    return Filho2;
    
}

int main()
{
    int Monica, Filho1, Filho2;
    cin >> Monica >> Filho1 >> Filho2;
    
    cout << fucfuc(Monica, Filho1, Filho2) << endl;
    return 0;
}
