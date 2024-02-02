// Program to find sum of n terms using recursion.

#include <iostream>
using namespace std;
int getsSum(int n){
    if(n==0)
     return n;
    return n + getsSum(n-1);
}
int main()
{
    int n;
    cout<<"Enter n: ";
    cin>>n;
    int sum = getsSum(n);
    cout<<"Sum of "<<n<<" terms: "<<sum;
    return 0;
}

/*
Output
Enter n: 10
Sum of 10 terms: 55
*/
// ------------------------------------------------------------------------------------------------------------
/*
To find Sum of N terms in a simple way (n*(n+1)/2)
#include <iostream>

using namespace std;

int main()
{
    int n, sum;
    cout<<"Enter N :";
    cin>>n;
    sum=n*(n+1)/2;
    cout<<" Nth Sum :"<<sum;

    return 0;
}

*/
