#include <iostream>
#define _USE_MATH_DEFINES
#include <cmath>
using namespace std;

double hexagonArea(double side)
{
	double result;
	result = (6 * pow(side, 2))/ (4 * tan(M_PI/6) );
	return result;
}
int main()
{
	double sideLength;
	cout << "Input the side of the hexagon: ";
	cin >> sideLength;
	
	cout << "The area of the hexagon is: " << hexagonArea(sideLength);
	
	
	
	return 0;
}
