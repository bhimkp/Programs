#include <iostream>
#include<stdio.h>
using namespace std;
int main(){
    int n;
    cin >> n;
    int i ,j;
    for(i = 10; i >= n; i--){
        for(j = i; j > n; j--){
           cout << i << " ";
        }
        cout << endl;
    }
    return 0;
}