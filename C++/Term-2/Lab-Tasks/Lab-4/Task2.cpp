#include <iostream>
#include <cctype>
#include <cstring>
using namespace std;


int main()
{
	char arr[15];
	cout << "Enter a name: ";
	cin>> arr;
	int length = strlen(arr);

	for (int i =0; i<length; i++)
	{
		if(islower(arr[i]))
		{
			arr[i] = toupper(arr[i]);
		}
		
	}
	
	cout << "Welcome " <<arr;
	
	
	
	
	return 0;
}
