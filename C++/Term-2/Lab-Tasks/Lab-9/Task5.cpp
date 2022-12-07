#include <iostream>
using namespace std;
void swapFun(int *p1, int *p2)
{
	int *pTemp = new int;
	*pTemp = *p1;
	*p1 = *p2;
	*p2 = *pTemp;
	delete pTemp;
}
int main()
{
	int *p1 = new int, *p2 = new int;
	cout << "Enter first number: ";
	cin >> *p1;
	cout << "Enter second number: ";
	cin >> *p2;	
	
	swapFun(p1, p2);
	cout << "The first number after the swap: " << *p1 << endl;
	cout << "The second number after the swap: " << *p2;
	
	delete p1, p2;
	return 0;
}
