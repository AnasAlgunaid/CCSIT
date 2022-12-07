#include <iostream>
#include <string>
using namespace std;

int main()
{
	int size;
	string theName;
	cout << "Enter the size of the array: ";
	cin >> size;
	string arr[size];
	
	
	cout << "Enter " << size << " names: " << endl;
	for (int i =0; i < size; i++)
	{
		cin >> arr[i];
	}
	
	cout << "Which name you want to find: ";
	cin >> theName;
	
	for (int i =0; i < size; i++)
	{
		if(arr[i] == theName)
		{
			cout << "The name occurs in index number #" << i << endl;
		}
	}
	
	
	return 0;
}
