#include<iostream>
using namespace std;
int main()
{
  int n,temp,first,last;
  cin>>n;
  last =n%10;
  first = n;
  first = first / 1000;
  cout<<first+last;
  return 0;
 
}