#include<iostream>
#include<stdexcept>
using namespace std;
int main(){
int arr[5]={1,2,3,4,5};
int index;
try{
cout<<"Index(0 to 4): ";
cin>>index;
if(index<0||index>=5){
throw out_of_range(" Out of bounds");
}else{
cout<<"Value at index "<<index<<" is "<<arr[index]<<endl;
}
}
catch(const out_of_range & ex){
cout<<"Exception caught: "<<ex.what()<<endl;
}
return 0;
}

/* Output

Index(0 to 4): 5
Exception caught:  Out of bounds

Index(0 to 4): 4
Value at index 4 is 5
*/