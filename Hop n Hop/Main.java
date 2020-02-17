#include<iostream>
using namespace std;
int main()
{
  int a,b,i = 3,j = 4,cnt=-1;
  cin>>a>>b;
  while(i<=a){
    i++;
    j++;
    cnt++;
  }
  while(j<=b){
    j++;
    cnt++;
  }
  cout<<cnt;

}