#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
int val, positv, neg, par, impar;
positv=0;
neg=0;
par=0;
impar=0;
for (int i = 0; i < 5; i++)
{
    cin >> val;
    if (val%2 ==0)
    {
        par+=1;
    }
    else if(val%2 !=0)
    {
        impar+=1;
    }
    if(val> 0)
    {
        positv+=1;
    }
    else if (val <0)
    {
        neg+=1;
    }
    
}
cout << par << " valor(es) par(es)" << endl;
cout << impar << " valor(es) impar(es)" << endl;
cout << positv << " valor(es) positivo(s)" << endl;
cout << neg << " valor(es) negativo(s)" << endl;
return 0;
 }