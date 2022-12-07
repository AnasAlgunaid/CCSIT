#include <iostream>
#include <string>
using namespace std;

int main()
{
	int size;
	string temp;
	cout << "Enter the size of the array: ";
	cin >> size;
	string arr[size];
	
	
	cout << "Enter " << size << " names: " << endl;
	for (int i =0; i < size; i++)
	{
		cin >> arr[i];
	}
	
	for (int i = 0; i< size; i++)
	{
		for (int j = 0; j <size-1; j++)
		{
			if(arr[j] > arr[j+1])
			{
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		
	}
	cout << endl;
	cout << "The ordered list: " << endl;
	for (int i =0; i < size; i++)
	{
		cout << arr[i] << endl;
	}
	
	return 0;
}
