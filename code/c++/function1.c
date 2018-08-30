#include <iostream>
#include <vector>
#include <cmath>
#include <cfloat> 
#include <iomanip>
using namespace std;
 
void function1(vector<int>& A) {
    int n = A.size();
    if (n <= 1) return;
     
    for (int i = 0; i < n; i++) {
        int swaps = 0;
        for (int j = 0; j < n - 1; j++) {
            if (A[j] > A[j + 1]) {
                int temp = A[j];
                A[j] = A[j + 1];
                A[j + 1] = temp;
                swaps += 1;
            }          
        }
        if (swaps == 0) return;
    }
}