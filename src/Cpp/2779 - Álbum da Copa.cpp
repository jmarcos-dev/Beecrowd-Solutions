#include <iostream>
#include <set>
using namespace std;

int main()
{
    int n, m, faltam, figurinha;
    cin >> n >> m;

    set<int> figurinhas_compradas;

    for (int i = 0; i < m; i++)
    {
        figurinha;
        cin >> figurinha;
        figurinhas_compradas.insert(figurinha);
    }

    faltam = n - figurinhas_compradas.size();

    cout << faltam << endl;

    return 0;
}
