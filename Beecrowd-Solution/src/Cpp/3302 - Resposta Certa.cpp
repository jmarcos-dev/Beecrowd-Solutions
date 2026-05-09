#include<iostream>
using namespace std;
int main()
{
    
    int N;
    
    cin >> N;
    int Vet[N];
    for (int i = 1; i <= N; i++)
    {
        cin >> Vet[i];
        cout << "resposta " << i << ": " << Vet[i] << endl;
    }

    return 0;

}
