#include<bits/stdc++.h>
using namespace std;
int gcd(int A, int B) {
    // Do not write main() function.
    // Do not read input, instead use the arguments to the function.
    // Do not print the output, instead return values as specified
    // Still have a doubt. Checkout www.interviewbit.com/pages/sample_codes/ for more details
    if(A==0)return B;
    return gcd(B%A,A);
}

int main(){
    cout << gcd(6,9) << endl;
    return 0;
}