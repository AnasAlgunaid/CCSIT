// Task 3 Bank system
#include <iostream>
#include <string>
using namespace std;

void withDrawal(double &currentBalance);
void deposit(double &currentBalance);
void view(double currentBalance);
void view(string name, double initialBalance, double newBalance);
int main()
{
	string name;
	char op;
	double currentBalance = 10000;
	double amount, newBalance, initialBalance;
	cout << "Please type your name: ";
	cin >> name;
	
	while(op != 'e')
	{
	initialBalance = currentBalance;
	view(currentBalance);
	
	cout << endl << "Please choose a task:\nd- draw\np- deposite\ne - Exit" << endl;
	cout << "Enter your choice: ";
	cin >> op;
	cout << endl;
	
	if (op == 'd')
	{
		withDrawal(currentBalance);
	}
	else if (op == 'p')
	{
		deposit(currentBalance);
	}

	else if( op == 'e')
	{
		break;
	}


	view(name, initialBalance, currentBalance);

	}

		
	return 0;
}

void withDrawal(double &currentBalance)
{
	int amount;
	cout << "Please Enter your draw amount: ";
	cin >> amount;
	currentBalance = currentBalance - amount;
	
	
}
void deposit(double &currentBalance)
{
	int amount;
	cout << "Please Enter your deposite amount: ";
	cin >> amount;
	currentBalance = currentBalance + amount;

}

void view(double currentBalance)
{
	cout << "Your balance is: ";
	cout << currentBalance << endl;
}
void view(string name, double initialBalance, double newBalance)
{
	cout << "Customer name: " << name << endl;
	cout << "Your balance was: " << initialBalance << endl;
	cout << "Your New Balance: " << newBalance << endl;
	
}

