// . Order a list of numbers you have read from the user in a descending order
#include <iostream>
using namespace std;

int main()
{
	
	int size, temp;
	cout << "Enter the size of the array: ";
	cin >> size;
	
	int arrBefore[size];
	
	cout << "Enter " << size << " elements: " << endl;
	for (int i = 0; i < size; i++)
	{
		cin >> arrBefore[i];
	}
	
	for (int i = 0; i < size; i++)
	{
		for (int j =0; j < size-1; j++)
		{
			if(arrBefore[j+1] > arrBefore[j] )
			{
				temp = arrBefore[j];
				arrBefore[j] = arrBefore[j+1];
				arrBefore[j+1] = temp;
			}
		}
	}
	
	cout << "The ordered list will be: " << endl;
	for (int i = 0; i<size; i++)
	{
		
		cout << arrBefore[i] << endl;
	}
	
	
	return 0;
}
