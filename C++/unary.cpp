#include<iostream>
using namespace std;
class Number{
	private:
		int value;
	public:
	Number():value(0){}
	Number(int val):value(val){}
	Number operator -(){
		Number temp;
		temp.value=-value;
		return temp;
	}
	void display(){
		cout<<"Value: "<<value<<endl;
	}
};
int main(){
Number num1(20);
Number num2(-10);
cout<<"Original values: "<<endl;
num1.display();
num2.display();
Number result1=-num1;
Number result2=-num2;
cout<<"After overloading"<<endl;
result1.display();
result2.display();
return 0;
}

