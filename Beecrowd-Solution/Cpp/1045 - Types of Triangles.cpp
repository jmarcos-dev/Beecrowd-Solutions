#include <iostream>
 
using namespace std;
 
int main() {
 
    double x,y,z;
	cin >> x >> y >> z;

    if(x >= (y+z) || y >= (x+z) || z >= (x+y))
         cout << "NAO FORMA TRIANGULO"<<endl;
    else if(x*x == (y*y + z*z) || y*y == (x*x + z*z) || z*z == (x*x + y*y))
           cout << "TRIANGULO RETANGULO"<<endl;
    else if(x*x > (y*y + z*z) || y*y > (x*x + z*z) || z*z > (x*x + y*y))
           cout << "TRIANGULO OBTUSANGULO"<<endl;
    else if(x*x < (y*y + z*z) || y*y < (x*x + z*z) || z*z < (x*x + y*y))
           cout << "TRIANGULO ACUTANGULO"<<endl;
    if(x == y && x == z)
            cout << "TRIANGULO EQUILATERO"<<endl;
    if((x == y && x != z)  || (x == z && x != y) || (y == z && y != x))
            cout << "TRIANGULO ISOSCELES"<<endl;
        
    return 0;
}