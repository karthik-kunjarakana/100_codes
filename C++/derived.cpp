#include<iostream>
using namespace std;
class Base{
public:
	int alpha;
	Base(int a){
	alpha=a;
	cout<<"alpha= "<<alpha<<endl;
	}
};
class Derived1: public Base{
	public:
		int beta;
		Derived1(int a,int b):Base(a){
		beta=b;
		cout<<"Beta = "<<beta<<endl;
	}
};
class Derived2: public Derived1{
	public: 
		int gamma;
		Derived2(int a,int b,int c):Derived1(a,b){
		gamma=c;
		cout<<"Gamma= "<<gamma<<endl;
	}
};
int main(){
int a=10,b=20,c=30;
Derived2 obj(a,b,c);
return 0;
}
	
