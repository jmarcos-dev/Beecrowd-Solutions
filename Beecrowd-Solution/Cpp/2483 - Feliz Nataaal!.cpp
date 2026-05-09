#include <iostream>
#include<string>

using namespace std;
int main()
{
    int entrada;
    cin >> entrada;
    string natal = "nat";
    while (entrada != 0)
    {
        natal += 'a';
        entrada--;
    }
    natal+="l!";
    cout << "Feliz " << natal << endl;

    return 0;
}
