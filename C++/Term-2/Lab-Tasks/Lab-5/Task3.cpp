#include <iostream>
using namespace std;

bool isEven(int);
int main()
{
	int oddCounter = 0, evenCounter = 0, evenSum = 0, oddSum = 0;

	for(int i=500; i < 1200; i++)
	{
		if(isEven(i))
		{
			evenSum += i;
			evenCounter++;
		}
		else
		{
			oddSum += i;
			oddCounter++;
		}
	}
	cout << "Number of even numbers = " << evenCounter << " and sum is: " << evenSum << endl;
	cout << "Number of odd numbers = " << oddCounter << " and sum is: " << oddSum << endl;
	
	
	return 0;
}

bool isEven(int number)
{
	if (number % 2 == 0)
	{
		return true;	
	}
	else
	{
		return false;
	}
}
