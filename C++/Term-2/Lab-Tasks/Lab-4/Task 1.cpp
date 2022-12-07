#include <iostream>
#include <cmath>
using namespace std;

double pointsDistance (int firstX, int firstY, int secondX, int secondY)
{
	double result;
	result = sqrt((pow((secondX - firstX), 2)) + (pow((secondY - firstY), 2)));
	return result;
}


int main()
{
	double x1, x2, y1, y2, num;
	while (true)
	{
		
		cout << "Enter X1 and Y1: ";
		cin >> x1 >> y1;	
		cout << "Enter X2 and Y2: ";
		cin >> x2 >> y2;
		cout << "The distance between two points is: " << pointsDistance(x1, y1, x2, y2) << endl;
		cout << "Do you want to continue?\n1/Yes\n2/No : ";
		cin >> num;
		if(num == 2)
		{
			break;
		}

	}
	
	return 0;
}
