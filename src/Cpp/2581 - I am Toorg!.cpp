#include <iostream>
using namespace std;

int main()
{
    int casos;
    string entrada;

    cin >> casos;
    cin.ignore();  

    while (casos > 0)
    {
        getline(cin, entrada);  
        cout << "I am Toorg!" << endl;  
        casos--;  
    }

    return 0;
}
