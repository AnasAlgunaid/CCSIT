// Task 1 Lab 2
// Name: Anas Malek Aljunaid
// Id: 2210009109
#include <iostream>
using namespace std;

int main()
{
	int size, rotate_nums, newPosition;
	char direction;
	
	cout << "Enter the size of array: ";
	cin >> size;
	cout << "Enter R Or L: \n R/ for right \n L/ for Left" << endl;
	cin >> direction;
	cout << "Enter the number of elements to rotate: ";
	cin >> rotate_nums;
	
	int arrBefore[size];
	int temp[size];
	cout << "Enter the elements of array: ";
	
	for(int i = 0 ; i < size; i++)
	{
		arrBefore[i] = 0;
	}
	
	for (int i =0; i < size; i++)
	{
		cin >> arrBefore[i];
	}
	
	
	for (int i = 0 ; i<size; i++)
	{
		if (direction == 'R')
		{
			newPosition = i+rotate_nums;
			if(newPosition >= size)
			{
				newPosition = newPosition % size;
			}
			temp[newPosition] = arrBefore[i];
		}
		
		
		else if (direction == 'L')
		{
			newPosition = i-rotate_nums;
			if(newPosition < 0)
			{
				newPosition = newPosition % size;
				if(newPosition < 0){
					newPosition+= size;
				}
			}

			temp[newPosition] = arrBefore[i];
		}
	
	}

	for (int i =0; i < size; i++)
	{
		cout << temp[i] << "\t";
	}
	return 0;
}
