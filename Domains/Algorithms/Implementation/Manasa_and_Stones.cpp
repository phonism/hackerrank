#include <cstdio>
#include <cstring>
#include <iostream>
#include <algorithm>
#include <map>
#include <vector>
using namespace std;

vector<int> ans;

int main() {
	int test; scanf("%d", &test);
	for (int cas = 1; cas <= test; cas++) {
		int n, a, b;
		scanf("%d %d %d", &n, &a, &b);
		if (a == b) {
			printf("%d\n", a * (n - 1));
		} else {
			if (a > b) {
				swap(a, b);
			}
			ans.clear();
			n--;
			for (int i = 0; i <= n; i++) {
				ans.push_back(a * i + b * (n - i));
			}
			sort(ans.begin(), ans.end());
			for (int i = 0; i < ans.size(); i++) {
				if (i == 0) {
					printf("%d", ans[i]);
				} else {
					if (ans[i] == ans[i-1]) {
						continue;
					} else {
						printf(" %d", ans[i]);
					}
				}
			}
			puts("");
		}
	}
	return 0;
}
