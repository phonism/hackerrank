#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n, pos = 0, neg = 0, zero = 0;
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        int x; scanf("%d", &x);
        if (x == 0) {
            zero += 1;
        } else if (x > 0) {
            pos += 1;
        } else {
            neg += 1;
        }
    }
    printf("%.3f\n", 1.0 * pos / n);
    printf("%.3f\n", 1.0 * neg / n);
    printf("%.3f\n", 1.0 * zero / n);
    return 0;
}

