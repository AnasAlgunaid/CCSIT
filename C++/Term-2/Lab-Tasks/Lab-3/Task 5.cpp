// Print number of times a number occurs in a list.
#include <iostream>
using namespace std;

int main()
{
	int size, num, counter = 0;
	cout << "Enter the size of the array: ";
	cin >> size;
	int arr[size];
	
	cout << "Enter " << size << " elements: " << endl;
	for (int i = 0; i < size; i++)
	{
		cin >> arr[i];
	}
	
	cout << "Which number you want to find: ";
	cin >> num;
	
	for (int i = 0; i < size; i++)
	{
		if (arr[i] == num)
		{
			counter++;
		}
	}
	cout << "The number " << num << " occurs " << counter << " times";
	
	
	return 0;
}
