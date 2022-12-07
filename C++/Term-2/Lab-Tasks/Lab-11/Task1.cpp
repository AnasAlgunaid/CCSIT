#include <iostream>
#include <fstream>
using namespace std;

int main()
{
	ifstream inFile;
	ofstream outFile;
	
	int x;
	inFile.open("input.txt", ios::in);
	if (inFile.is_open())
	{
		inFile >> x;
		inFile.close();
	}
	
	outFile.open("output.txt", ios::out);
	if (outFile.is_open())
	{
		outFile << x << endl;
		outFile.close();
	}
	
	
	return 0;
}
