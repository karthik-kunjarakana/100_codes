#include<iostream>
using namespace std;
class Student{
int rollno;
char name[20];
float m1,m2,total;
public: 
	void read(){
	cout<<"Rollno:";
	cin>>rollno;
	cout<<"Name:";
	cin>>name;
	cout<<"Marks in 2 subjects:";
	cin>>m1>>m2;
		
	}
	void display(){
	cout<<"Rollno:"<<rollno<<endl;
	cout<<"Name:"<<name<<endl;
	total=m1+m2;
	cout<<"Total:"<<total<<endl;
	}
};
int main(){
int n;
cout<<"Enter no of students: "<<endl;
cin>>n;
Student s[n];
for(int i=0;i<n;i++){
cout<<"Enter the value for the student"<<i+1<<endl;
s[i].read();
}
for(int i=0;i<n;i++){
s[i].display();
}
return 0;
}