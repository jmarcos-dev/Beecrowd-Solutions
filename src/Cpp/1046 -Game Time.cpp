#include <iostream>
 
using namespace std;
 
int main() {
 
    int x,y,time=0;
    cin>>x>>y;

    if(x<y){
        time=y-x;
        cout<<"O JOGO DUROU "<<time<<" HORA(S)"<<endl;
    }else if(x>y){
        time=24-(x-y) ;
        cout<<"O JOGO DUROU "<<time<<" HORA(S)"<<endl;
    }else if(x==y){
        time=24;
        cout<<"O JOGO DUROU "<<time<<" HORA(S)"<<endl;
    }
    
 
    return 0;
}