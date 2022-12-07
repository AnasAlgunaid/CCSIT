// Task Part 2
#include <iostream>
using namespace std;

struct Rectangle
{
	double width;
	double height;
	double area;
};

Rectangle computeAreaE(Rectangle rect);

int main()
{
	Rectangle r1;
	cout << "Enter the width and the height: " << endl;
	cin >> r1.height >> r1.width;
	
	r1 = computeAreaE(r1);
	cout << "The area is: " << r1.area << endl;
	return 0;
}


Rectangle computeAreaE(Rectangle rect)
{
	rect.area = rect.width * rect.height;
	return rect;
}
