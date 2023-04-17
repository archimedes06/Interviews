#include <iostream>
#include <vector>
#include <cmath>
#include <cfloat>
#include <iomanip>
using namespace std;
 
struct freq {
    double xs;
    double xe;
    int num_bins;
    vector<int> counts;
};
 
bool function3(const vector<double >& data, int num_bins, freq& hist) { 
    if (data.size() == 0 || num_bins <= 0) {
        return false;
    }

    // Find range
    double min =  DBL_MAX;
    double max = -DBL_MAX;

    for (int k = 0; k < data.size(); k++) {
        if (data[k] < min) min = data[k];
        if (data[k] > max) max = data[k];
    }

    if (min == max) {
        return false;
    }

    // Initialize the frequency
    vector<int> f;
    for (int i = 0; i <= num_bins; i++) {
        f.push_back(0);
    }

    double delta = (max - min) / num_bins;
    for (int i = 0; i < data.size(); i++) {
        int pos = floor((data[i] - min)/delta);
        f[pos] += 1;
    }

    // Populate the return struct
    hist.xs = min;
    hist.xe = max;
    hist.num_bins = num_bins;
    hist.counts = f;
    return true;
}
