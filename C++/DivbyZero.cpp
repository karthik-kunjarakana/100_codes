#include<iostream>
using namespace std;
void divByZero(int numerator, int denominator){
    if(denominator==0){
        throw "Division by zero";
    }
    else{
        cout<<"Result of Division: "<<numerator/denominator<<endl;
    }
}
int main(){
    int num,deno;
    cout<<"Enter the Numerator: "<<endl;
    cin>>num;
    cout<<"Enter the Denominator :"<<endl;
    cin>>deno;
    try{
        divByZero(num,deno);
    }
    catch(const char* msg){
        cout<<"Exception caught :"<<msg<<endl;
    }
    return 0;
}