// Task 1 Part 3
#include <iostream>
using namespace std;

struct Rectangle
{
	double width;
	double height;
	double area;
};

void computeAreaE(Rectangle &rect);

int main()
{
	Rectangle r1;
	cout << "Enter the width and the height: " << endl;
	cin >> r1.height >> r1.width;
	
	computeAreaE(r1);
	cout << "The area is: " << r1.area << endl;
	return 0;
}


void computeAreaE(Rectangle &rect)
{
	rect.area = rect.width * rect.height;
}
