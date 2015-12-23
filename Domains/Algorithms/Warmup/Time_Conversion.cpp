#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int h, m, s;
    char op[10];
    scanf("%d:%d:%d%s", &h, &m, &s, op);
    if (h == 12 && op[0] == 'P') {
        printf("%02d:%02d:%02d\n", 12, m, s);
    } else if (op[0] == 'P') {
        printf("%02d:%02d:%02d\n", (h + 12) % 24, m, s);
    } else {
        printf("%02d:%02d:%02d\n", h % 12, m, s);
    }
    return 0;
}

