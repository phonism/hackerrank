#include <cstdio>
#include <cstring>
#include <algorithm>
#include <iostream>
#include <vector>
#include <string>
using namespace std;

char ch[111], ans[111];

int main() {
    int n, k;
    scanf("%d", &n);
    scanf("%s", ch);
    scanf("%d", &k);
    for (int i = 0; i < n; i++) {
        if (ch[i] == '-') {
            ans[i] = '-';
            continue;
        }
        if (ch[i] > 'Z') {
            if ((int) ch[i] + k > 122)
                ans[i] = ((int) ch[i] + k - 123) % 26 + 97;
            else
                ans[i] = ch[i] + k;
        } else {
            if ((int) ch[i] + k > 'Z')
                ans[i] = ((int) ch[i] + k - 'Z' - 1) % 26 + 'A';
            else
                ans[i] = ch[i] + k;
        }
    }
    printf("%s\n", ans);
    return 0;
}

