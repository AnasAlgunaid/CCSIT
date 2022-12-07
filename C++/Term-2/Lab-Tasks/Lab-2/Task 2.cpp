// Task 2 Lab 2
// Name: Anas Malek Aljunaid
// Id: 2210009109
#include <iostream>
using namespace std;

int main()
{
	int size, shift_nums, newPosition, defaultValue;
	char direction;
	
	cout << "Enter the size of array: ";
	cin >> size;
	cout << "Enter R Or L: \n R/ for right \n L/ for Left" << endl;
	cin >> direction;
	cout << "Enter the number of elements to shift: ";
	cin >> shift_nums;
	cout << "Enter the value to replace: ";
	cin >> defaultValue;
	
	int arrBefore[size];
	int arrAfter[size];
	cout << "Enter the elements of array: ";
	
	for(int i = 0 ; i < size; i++)
	{
		cin >> arrBefore[i];
	}
	
	for (int i = 0; i <size; i++)
	{
		if (direction == 'R')
		{
			newPosition = i + shift_nums;
			if (newPosition < size)
			{
				arrAfter[newPosition] = arrBefore[i];
			}
		}
	
		if (direction == 'L')
		{
			for(int i = size -1; i >= 0; i--)
			{
				newPosition = i - shift_nums;
				if(newPosition >= 0)
				{
					arrAfter[newPosition] = arrBefore[i];
				}
				for(int j =size-1; j>= (size - shift_nums); j--)
				{
					arrAfter[j] = defaultValue;
				}
			}
			
		}
	
	}
	

	for (int i =0; i < size; i++){
		cout << arrAfter[i] << "\t";
	}

	
	return 0;
}
