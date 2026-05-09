#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;
 
int main() {
 
    double A, B, C, delta, R1, R2;
		cin.precision(1);
		cin >> A >> B >> C;
		delta = B*B -4.0*A*C;
		if ( A==0||delta<0)
		{
			cout << "Impossivel calcular" << endl;
			
		}
		else{
			
			R1= (-B + sqrt(delta))/(2.0*A);
			R2= (-B - sqrt (delta))/(2.0*A);
			cout <<"R1 = " << setprecision(5) << fixed << R1 << endl;
			cout << "R2 = " << setprecision(5) << fixed << R2 << endl;
			
		}
 
    return 0;
}