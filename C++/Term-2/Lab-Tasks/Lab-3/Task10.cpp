#include <iostream>
using namespace std;

int main()
{
	int const SIZE = 10;
	int arr[SIZE];
	bool ordered = true;
	
	cout << "Enter 10 numbers: " << endl;
	for (int i =0; i < SIZE; i++)
	{
		cout << ">> ";
		cin >> arr[i];
	}
	
	for (int i =0; i < SIZE; i++)
	{
		if (arr[i+1] < arr[i])
		{
			ordered = false;
			break;
		}
	}
	
	if (ordered)
	{
		cout << "--------- Ordered ascendingly ---------" << endl;
	}
	else 
	{
		cout << "--------- Unordered ascendingly ---------" << endl;
	}
	
	
	
	
	return 0;
}
