#include <iostream>
#include <vector>
#include <cmath>
#include <cfloat>
#include <iomanip>
using namespace std;
 
vector<vector<int>> function2(int n) {   
    vector<vector<int>> t;
    vector<int> v0 = {1};
    t.push_back(v0);
    for (int i = 1; i < n; i++) {
        vector<int> vi;
        vi.push_back(1);
        for (int j = 1; j < i; j++) {
            vi.push_back(t[i - 1][j - 1] + t[i - 1][j]);
        }
        vi.push_back(1);
        t.push_back(vi);       
    }
    return t;
}