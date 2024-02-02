#include<iostream>
using namespace std;
int main(){
int a,b,c;
cout<<"Enter  elements: "<<endl;
cin>>a>>b>>c;
int max;
max=a;
if(max<b)
max=b;
if(max<c)
max=c;
cout<<"Max :"<<max;
return 0;
}

/* Output
Enter  elements: 
4 5 6
Max :6
*/