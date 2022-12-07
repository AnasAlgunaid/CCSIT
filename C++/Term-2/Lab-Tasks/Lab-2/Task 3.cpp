// Task 3 Lab 2
// Name: Anas Malek Aljunaid
// Id: 2210009109
#include <iostream>
using namespace std;

int main()
{
	int size, rotating_nums, newPosition = 0;
	char direction;
	cout << "Please enter the size of array: ";
	cin >> size;
	string arrBefore[size][2];
	string arrAfter[size][2];
	cout << "Please choose the direction of the rotating (U: Up or D: Down): " << endl;

	cin >> direction;
	cout << "Enter the number of rotating: ";
	cin >> rotating_nums;
	
	
	for(int i =0; i < size; i++)
	{
		cout << "Enter the name " << "[ " << i+1 << " , " << "0 ]: " ;
		cin >> arrBefore[i][0];
		cout << "Enter the score: " << "[ " << i+1 << " , " << "1 ]: " ;
		cin >> arrBefore[i][1];
	}

	for (int i = 0; i < size; i++)
	{
		if(direction == 'D')
		{
			newPosition = i + rotating_nums;
			if(newPosition >= size)
			{
				newPosition = newPosition % size;
			}
			arrAfter[newPosition][0]= arrBefore[i][0];
			arrAfter[newPosition][1]= arrBefore[i][1];
		}
		
		if(direction == 'U')
		{
			newPosition = i - rotating_nums;
			if(newPosition < 0)
			{
				newPosition = newPosition % size;
				if (newPosition <0)
				{
					newPosition += size;
				}
			}
			arrAfter[newPosition][0]= arrBefore[i][0];
			arrAfter[newPosition][1]= arrBefore[i][1];
		}
		
	}
	cout << "\n"<< endl;
	cout << "Before: "<< endl;
	for (int i =0; i<size; i++)
	{
		cout << "[ "<<arrBefore[i][0] << " , " << arrBefore[i][1] << " ]" << endl;
	}
	
	cout << "\n"<< endl;
	cout << "After: "<< endl;
	for (int i =0; i<size; i++)
	{
		cout << "[ "<<arrAfter[i][0] << " , " << arrAfter[i][1] << " ]" << endl;
	}
	
	
	
	
	return 0;
}
