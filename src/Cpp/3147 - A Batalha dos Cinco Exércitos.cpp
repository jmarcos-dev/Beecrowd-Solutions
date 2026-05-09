#include<iostream>
using namespace std;

int main()
{

    int Humanos, Elfos, Anoes, Orcs, Wargs, Aguias, TotalMiddle, TotalSauron;
    cin >> Humanos >> Elfos >> Anoes >> Orcs >> Wargs >> Aguias;
    TotalMiddle = Humanos + Elfos +Anoes + Aguias;
    TotalSauron = Orcs + Wargs;
    if (TotalMiddle >= TotalSauron)
    {
        cout << "Middle-earth is safe." << endl;
    }else if (TotalSauron > TotalMiddle)
    {
        cout << "Sauron has returned." << endl;
    }


    return 0;
}
