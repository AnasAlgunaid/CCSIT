#include <iostream>
using namespace std;

typedef int* intPTR;

intPTR Array(int arraySize)
{

	intPTR arrayPointer = new int[arraySize];
	cout << "Enter the elements: " << endl;
	for (int i =0; i < arraySize; i++)
	{
		cin >> arrayPointer[i];
	}
	return arrayPointer;
}

int OddSum(int *arrayPointer, int arraySize)
{
	int sum = 0;
	for (int i =0; i<arraySize; i++)
	{
		if (i % 2 != 0)
		{
			sum += arrayPointer[i];
		}
	}
	return sum;
}

int main()
{	int size;
	cout << "Enter the array size: ";
	cin >> size;
	
	intPTR result = Array(size);
	cout << "The output is: " << endl;
	for (int i =0; i<size; i++)
	{
		cout << result[i] << endl;
	}
	
	cout << "The sum is: " << OddSum(result, size);
	
	delete [] arrayPointer;
	return 0;
}
