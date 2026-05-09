#include <iostream>

using namespace std;

int main() {
	int i, x, y, min, max, a = 0;


	cin >> x >> y;

	if (x < y)
	{
		min = x;
		max = y;
	}
	else {
		max = x;
		min = y;
	}

	for (i = (min + 1); i < max; ++i)
	{
		if (i % 2 == 1 || i % 2 == -1)
		{
			a += i;
		}
	}

	cout << a << endl;

	return 0;
}