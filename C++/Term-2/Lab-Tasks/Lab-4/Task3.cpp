#include <iostream>
#include <cctype>
#include <cstring>
using namespace std;

int main()
{
	bool lower = false, upper = false , digit = false;
	char arrPassword[30];
	cout << "Enter the password: " << endl;
	cin >> arrPassword;
	int length = strlen(arrPassword);
	for (int i =0; i < length; i++)
	{
		if(islower(arrPassword[i]))
		{
			lower = true;
		}
		if(isupper(arrPassword[i]))
		{
			upper = true;
		}
		if(isdigit(arrPassword[i]))
		{
			digit = true;
		}
	}
	
	if
	
	
	return 0;
}
