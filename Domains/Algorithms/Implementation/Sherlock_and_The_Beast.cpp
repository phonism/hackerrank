#include <cstdio>
#include <cstring>
#include <iostream>
#include <algorithm>
#include <map>
#include <vector>
using namespace std;

int main() {
	int test; scanf("%d", &test);
	for (int cas = 1; cas <= test; cas++) {
		int n; scanf("%d", &n);
		int tmp = 0, tem = 0;
		for (int i = 0; i <= n / 5; i++) {
			if ((n - 5 * i) % 3 == 0) {
				tmp = i;
				tem = (n - 5 * i) / 3;
				break;
			}
		}
		if (tmp == 0 && tem == 0) {
			puts("-1");
			continue;
		}
		for (int i = 0; i < tem; i++) {
			printf("555");
		}
		for (int i = 0; i < tmp; i++) {
			printf("33333");
		}
		puts("");
	}
	return 0;
}
