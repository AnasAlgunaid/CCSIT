#include <iostream>
using namespace std;

void updateValue1(int *, int&);
void updateValue1(int &, int*);

int main()
{
	int x, y;
	cout << "Enter x and y: ";
	cin >> x >> y;
	
	cout << "UpdateValue1: X= " << x <<"Y= " << y << endl;
	updateValue1(&x, y);
	cout << "UpdateValue2: X= " << x << "Y= " << y << endl;
	updateValue1(x, &y);
	
	return 0;
}
void updateValue1(int *pNum1, int &Num2)
{
	*pNum1 -= 10;
	Num2 += 50;  
}
void updateValue1(int &Num1, int *pNum2)
{
	Num1 *= 2;
	*pNum2 /= 10;
}
