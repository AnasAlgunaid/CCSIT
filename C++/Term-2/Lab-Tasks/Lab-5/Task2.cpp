#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int evaluate(int, int);


int main()
{
	srand(time(0));
	int guess = 1 + rand() % (50-1+1);
	int number;
	
	while (true)
	{
		cout << "Guess the number between (1-50): " << endl;
		cin >> number;
		if (evaluate(guess, number) == 0)
		{
			cout << "You win!" << endl;
			break;
		}
		else if (evaluate(guess, number) == 1)
		{
			cout << "Your guess is greater than the number" << endl;
		}
		else if(evaluate(guess, number) == -1)
		{
			cout << "Your guess is less than the number" << endl;
		}
	}
	
	
	return 0;
}

int evaluate (int guessingNumber, int num)
{
	if (guessingNumber == num)
	{
		return 0;
	}
	else if (guessingNumber < num)
	{
		return 1;
	}
	else if (guessingNumber > num)
	{
		return -1;
	}
}
