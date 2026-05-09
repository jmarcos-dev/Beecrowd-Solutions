#include <iostream>
 
using namespace std;
 
int main() {
 
    int anos, meses, dias;
   
 	cin>>dias;
   
	 anos=dias / 365;
   
	 meses=dias % 365 / 30;
   
 	dias =dias % 365 % 30;
   
 	cout<<anos<<" ano(s)"<<endl;
 	cout<<meses<<" mes(es)"<<endl;
 	cout<<dias<<" dia(s)"<<endl;
 
    return 0;
}