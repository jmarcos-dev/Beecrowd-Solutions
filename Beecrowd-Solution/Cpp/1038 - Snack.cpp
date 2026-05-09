#include <iostream>
#include <iomanip> 
using namespace std;
 
int main() {
 
   int x,y;
	double x1 = 4.00, x2 = 4.50, x3 = 5.00, x4 = 2.00, x5 = 1.50, som;
	cin >> x >> y;
	if(x==1){
		som = x1*y;
	} else if(x==2){
		som = x2*y;
	} else if(x==3){
		som = x3*y;
	} else if(x==4){
		som = x4*y;
	} else if(x==5){
		som = x5*y;
	}
	cout << setprecision(2) << fixed << "Total: R$ " << som << endl;
 
    return 0;
}