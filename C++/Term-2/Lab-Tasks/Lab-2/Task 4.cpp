// Task 4 Lab 2
// Name: Anas Malek Aljunaid
// Id: 2210009109
#include <iostream>
#include <string>
using namespace std;

int main()
{
	const int SIZE = 100;
	string players[SIZE][2];
	string playerName, playerScore, oldScore;
	int numberOfPlayers = 0;
	int menuNum;
	bool isThere = false;
	
	cout << "Welcome!" << endl;
	while (true)
	{
		cout << endl;
		cout << "---------------------------------------" << endl;
		cout << "1) Add player and his/her score." << endl;
		cout << "2) Update player score." << endl;
		cout << "3) Delete player and his/her score." << endl;
		cout << "4) Print all stored players info." << endl;
		cout << "9) Exit." << endl;
		cout << "---------------------------------------" << endl;
		cout << "Enter your choice: ";
		cin >> menuNum;
		
		if(menuNum == 1)
		{
			cout << "Enter the name of the player: ";
			cin >> playerName;
			cout << "Enter the highest score of the player : ";
			cin >> playerScore;
			
			if(numberOfPlayers <SIZE)
			{
				players[numberOfPlayers][0] = playerName;
				players[numberOfPlayers][1] = playerScore;
				numberOfPlayers++;
				cout << "------------------------ Player has been added successfully -----------------------" << endl;
			}
			else
			{
				cout << "sorry you can't add a player, the list is full!"<< endl;
			}
		}
		
		else if(menuNum == 2)
		{
			isThere = false;
			cout << "Enter the name of the player: ";
			cin >> playerName;
			for(int i = 0; i <numberOfPlayers; i++)
			{
				if (players[i][0] == playerName)
				{
					cout << "Name: " << "\t\t\t" << "Score:" << endl;
					cout << playerName << " \t\t\t" << playerScore << endl;
					oldScore = players[i][1];
					cout << "Enter the new score: ";
					cin >> players[i][1];
					isThere =true;
					cout << "----------------------- Your changes have been successfully saved (From: " << oldScore << " To: " << players[i][1] << " ) -----------------------" << endl;
					break;
				}
			}
			if (isThere == false)
			{
				cout << "----------------------- Please enter a valid name -----------------------" << endl;
			}
			
		}
		
		else if(menuNum == 3)
		{
			isThere = false;
			cout << "Enter the name of the player: ";
			cin >> playerName;
			for(int i = 0; i <numberOfPlayers; i++)
			{
				if (players[i][0] == playerName)
				{
					for(int j= i; j<numberOfPlayers-1; j++)
					{
						players[j+1][0] = players[j][0];
						players[j+1][1] = players[j][1];
					}
					numberOfPlayers--;
					cout << "Your changes have been successfully saved" << endl;
					isThere =true;
				}
			}
			if (isThere == false)
			{
				cout << "----------------------- Please enter a valid name -----------------------" << endl;
			}		
		}
		
		else if(menuNum == 4){
			cout << "Name:" << " \t\t\t " << "Score:" << endl;
			for(int i =0; i<numberOfPlayers; i++)
			{
				cout << players[i][0] << " \t\t\t " << players[i][1] << endl;
			}
		}
		
		else if(menuNum == 9)
		{
			break;
		}
		
		else
		{
			cout << "Please enter a valid number" << endl;
		}
	
	}
	cout << endl;
	cout << "Thank you for using the app .. GoodBey";
	cout << endl;
	return 0;
}
