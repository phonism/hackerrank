#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

const int maxn = 111;
int n, sumL, sumR;

int main() {
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            int x; scanf("%d", &x);
            if (i == j) {
                sumL += x;
            }
            if (i + j == n - 1) {
                sumR += x;
            }
        }
    }
    printf("%d\n", abs(sumL - sumR));
    return 0;
}

