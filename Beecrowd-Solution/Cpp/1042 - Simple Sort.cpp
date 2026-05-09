#include <iostream>
 
using namespace std;
 
int main() {
 
    int x, y, z, X, Y, Z;
	cin >> X >> Y >> Z;
	x = X, y = Y, z = Z;
	
	if(y < x) swap (x,y);
	if(z < y){
		swap(y,z);
		if (y<x) swap(x,y);
	}
	cout << x << endl << y << endl << z << endl;
	cout << endl;
	cout << X << endl << Y << endl << Z << endl;
 
    return 0;
}