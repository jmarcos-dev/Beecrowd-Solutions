#include <iostream>
using namespace std;
int main()
{
    int N, h{}, d{}, g{};
    cin >> N;
    while (N != 0)
    {
        cin >> h >> d >> g;
        if (h >= 200 && h <= 300 && d >= 50 && g>=150)
        {
            cout << "Sim" << endl;
        }
        else
        cout << "Nao" << endl;
        N--;
    }

    return 0;
}
