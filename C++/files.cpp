#include<iostream>
#include<fstream>
using namespace std;
int main(){
fstream file;
file.open("sample.txt",ios::out);
if(!file){
cout<<"Error!";
return 0;
}
cout<<"File Created succesfully";
file<<"ABCD.";
file.close();
file.open("sample.txt",ios::in);
if(!file){
cout<<"Error!";
return 0;
}
char ch;
cout<<"File contents..";
while(!file.eof()){
file>>ch;
cout<<ch;
}
file.close();
return 0;

}
