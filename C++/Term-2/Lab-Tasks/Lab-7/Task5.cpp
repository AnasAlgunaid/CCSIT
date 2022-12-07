#include <iostream>
using namespace std;

void swapR(int &num1, int &num2) ;

int main()
{
	int num1, num2;
	cout << "Please enter the first number: ";
	cin >> num1;
	cout << "Please enter the second number: ";
	cin >> num2;
	
	cout<< "Before the swap: " << endl;
	cout << "num1: "<< num1 << "\tnum2: " << num2;
	swapR (num1, num2);
	cout << endl <<"After the swap: " << endl;
	cout << "num1: "<< num1 << "\tnum2: " << num2;
	
	return 0;
}

void swapR (int &num1, int &num2)
{
	int temp = num2;
	num2 = num1;
	num1 = temp;
}
