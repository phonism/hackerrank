#include <cstdio>
#include <cstring>
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

const int maxn = 100010;

struct SegNode {
	int left, right, mi;

	int mid() {
		return (left + right) >> 1;
	}
};

SegNode tree[maxn * 5];
int val[maxn];

void pushUp(int idx) {
	tree[idx].mi = min(tree[idx<<1].mi, tree[idx<<1|1].mi);
}

void build(int left, int right, int idx) {
	tree[idx].left = left;
	tree[idx].right = right;
	if (left == right) {
		tree[idx].mi = val[left];
		return ;
	}
	int mid = tree[idx].mid();
	build(left, mid, idx << 1);
	build(mid + 1, right, idx << 1 | 1);
	pushUp(idx);
}

int query(int left, int right, int idx) {
	if (tree[idx].left >= left && tree[idx].right <= right)
		return tree[idx].mi;
	int mid = tree[idx].mid();
	if (right <= mid) {
		return query(left, right, idx << 1);
	} else if (left > mid) {
		return query(left, right, idx << 1 | 1);
	} else {
		return min(query(left, mid, idx << 1), 
				query(mid + 1, right, idx << 1 | 1));
	}
}

int n, m;

int main() {
	scanf("%d %d", &n, &m);
	for (int i = 1; i <= n; i++) {
		scanf("%d", &val[i]);
	}
	build(1, n, 1);
	for (int i = 0; i < m; i++) {
		int l, r;
		scanf("%d %d", &l, &r);
		l++; r++;
		printf("%d\n", query(l, r, 1));
	}
	return 0;
}

