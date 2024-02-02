#include<iostream>
using namespace std;
int main(){
int n;
cout<<"Enter N"<<endl;
cin>>n;
int a[n];
cout<<"Enter the elements"<<endl;
for(int i=0;i<n;i++){
cin>>a[i];
}
for(int i=0;i<n;i++){
for(int j=0;j<n-i-1;j++){
if(a[j]>a[j+1]){
int temp =a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
cout<<"Ascending"<<endl;
for(int i=0;i<n;i++){
cout<<a[i]<<" "<<endl;
}
for(int i=0;i<n;i++){
for(int j=0;j<n-i-1;j++){
if(a[j]<a[j+1]){
int temp =a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
cout<<"Descending"<<endl;
for(int i=0;i<n;i++){
cout<<a[i]<<" "<<endl;
}
return 0;
}