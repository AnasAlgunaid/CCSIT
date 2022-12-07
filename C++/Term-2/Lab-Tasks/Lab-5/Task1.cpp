#include <iostream>
#include <cstdlib>
#include <ctime>
#include <cmath>
using namespace std;
int sarax, saray;
int calDistance(int, int);
int evaluateDistance(int, int, int);

int main()
{
	int Dis1, Dis2, Dis3;
	int x1, y1, x2, y2, x3, y3;
	srand(time(0));
	sarax = rand();
	saray = rand();
	x1 = rand();
	x2 = rand();
	x3 = rand();
	y1 = rand();
	y2 = rand();
	y3 = rand();
	cout << "Your current location is: " << endl;
	cout << "Longitude: " << sarax << endl;
	cout << "Latitude: " << saray << endl;
	
	Dis1 = calDistance(x1, y1);
	Dis2 = calDistance(x2, y2);
	Dis3 = calDistance(x3, y3);
	
	cout << "SuperMarket #" << evaluateDistance(Dis1, Dis2, Dis3) << " is the nearest one" << endl;
	return 0;
}

int calDistance(int x, int y)
{
	
	return sqrt(pow(sarax-x, 2) + pow(saray-y, 2));
}

int evaluateDistance(int d1, int d2, int d3)
{
	if (d1 < d2 && d1 < d3)
	{
		return 1;
	}
	else if (d2 < d1 && d2 < d3)
	{
		return 2;
	}
	else if (d3 < d1 && d3 < d2)
	{
		return 3;
	}
}
