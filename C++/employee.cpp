#include<iostream>
using namespace std;
class Employee{
	int acc_num;
	char name[20];
	double balance,dep,wtdrw;
	public:
		void read(){
		cout<<"Enter the  Account number: ";
		cin>>acc_num;
		cout<<"Enter the name : ";
		cin>>name;
		cout<<"Enter the existing Balance: ";
		cin>>balance;
		if(balance<500){
				cout<<"Invalid Balance";
				exit(0);
				}
		}
		void deposit(){
			cout<<"Enter the amount to deposit : ";
			cin>>dep;
			}
		void display(){
			cout<<"Acc_num: "<<acc_num;
			cout<<"\nName :"<<name;
			cout<<"\nExisting Balance: "<<balance;
			balance=balance+dep;
			cout<<"\nBalance after deposit: "<<balance;
			}
			
		void withdraw(){
			cout<<"\nEnter the amount to withdraw : ";
			cin>>wtdrw;
			balance-=wtdrw;
			}
		void display(int x){
			cout<<"Acc_num: "<<acc_num;
			cout<<"\nName :"<<name;
			if(balance<500)
				cout<<"\nInvalid Balance";
			else
				cout<<"\nBalance: "<<balance;			

			}
		};
int main(){
Employee emp;
emp.read();
emp.deposit();
emp.display();
emp.withdraw();
emp.display(1);
return 0;
}		
/*
Output

Enter the  Account number: 100
Enter the name : john
Enter the existing Balance: 2000
Enter the amount to deposit : 500
Acc_num: 100
Name :john
Existing Balance: 2000
Balance after deposit: 2500
Enter the amount to withdraw : 200
Acc_num: 100
Name :john
Balance: 2300 
____________________________________	
		
Enter the  Account number: 100
Enter the name : john
Enter the existing Balance: 600 
Enter the amount to deposit : 200
Acc_num: 100
Name :john
Existing Balance: 600
Balance after deposit: 800
Enter the amount to withdraw : 400
Acc_num: 100
Name :john
Invalid Balance	
*/
			
