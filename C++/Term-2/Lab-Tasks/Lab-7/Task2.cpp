// Task 2 Lab 7
#include <iostream>
using namespace std;

void multiplication_Table(int arr[],int size,int tableNo);

int main()
{
	int size = 10;
	int num;
	int array[size];
	
	// Filling the array
	for (int i =0; i < size; i++)
	{
		array[i] = i+1;
	}
	
	cout << "Enter the table number: " << endl;
	cin >> num;
	
	// Calling the function
	multiplication_Table(array, size, num);
	
	for (int i =0; i < size; i++)
	{
		cout <<i+1 << " * " << num << " = " << array[i] << endl;
	}
	
	return 0;
}

void multiplication_Table(int arr[], int size,int tableNo) 
{
	for (int i =0; i < size; i++)
	{
		arr[i] = tableNo * arr[i];
	}
}

