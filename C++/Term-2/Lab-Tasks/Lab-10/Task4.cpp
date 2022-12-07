#include <iostream>
using namespace std;
typedef double* arrayPtr;


void fillarray(arrayPtr cost,arrayPtr cups, int arraysize)
{
	for (int i =0; i < arraysize; i++)
	{
		cout << "---------- Day #" << i+1 << " ----------" << endl;
		cout << "Number of cups: ";
		cin >> cups[i];
		cout << "price: ";
		cin >> cost[i];
	}
}
double calculateTotalPrice(arrayPtr cost,arrayPtr cups,int arraySize)
{
	double sum = 0;
	for(int i =0; i < arraySize; i++)
	{
		sum = sum + (cost[i] * cups[i]);
	}
	return sum;
}
int main()
{
	int size =7;
	arrayPtr costs = new double[size];
	arrayPtr nums = new double[size];
	fillarray(costs, nums, size);
	
	cout << "Total cost: " << calculateTotalPrice(costs, nums, size) << " SR"; 
	
	delete [] costs;
	delete [] nums;
	return 0;
}
