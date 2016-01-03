#include <cstdio>
#include <cstring>
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int test, n, k, x;
    scanf("%d", &test);
    for (int cas = 1; cas <= test; cas++) {
        scanf("%d %d", &n, &k);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            scanf("%d", &x);
            if (x <= 0)
                sum += 1;
        }
        if (sum >= k)
            puts("NO");
        else
            puts("YES");
    }
    return 0;
}

