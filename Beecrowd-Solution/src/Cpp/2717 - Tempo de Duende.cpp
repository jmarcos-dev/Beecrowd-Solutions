#include<iostream>
using namespace std;

int main()
{
    int Minutos, tempo_presente1, tempo_presente2;
    cin >> Minutos >> tempo_presente1 >> tempo_presente2;
    if (tempo_presente1+tempo_presente2 > Minutos)
    {
        cout << "Deixa para amanha!" << endl;
    }
    else
    {
        cout << "Farei hoje!" << endl;
    }

    return 0;
}
