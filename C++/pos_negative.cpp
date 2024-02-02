// Program to check whether the input element is +ve or -ve .
#include <iostream>

using namespace std;

int main()
{
    int n;
    cout<<"Enter N: ";
    cin>>n;
    if(n==0)
      cout<<"Zero";
    else
    (n>0)?cout<<"Postive":cout<<"Negative ";

    return 0;
}
/*
Output

Enter N: 15
Postive
*/