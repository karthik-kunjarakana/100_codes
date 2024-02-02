#include<iostream>
using namespace std;
void add(int a,int b){
cout<<a+b<<endl;
}
void add(double a,double b){
cout<<a+b<<endl;
}
int main(){
add(10,5);
add(10.5,5.5);
return 0;
}

/* Output
15
16
*/