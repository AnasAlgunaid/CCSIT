#include <iostream>
using namespace std;

struct Fract
{
	int num;
	int deno;
};

Fract sum(Fract, Fract);

int main()
{
	Fract num1, num2, total;
	cout << "Enter fraction 1 (numerator denominator): ";
	cin >> num1.num >> num1.deno;
	cout << "Enter fraction 2 (numerator denominator): ";
	cin >> num2.num >> num2.deno;
	
	total = sum(num1, num2);
	
	cout << "The result is: " << total.num << " / " << total.deno << endl;
	
	return 0;
}
Fract sum(Fract n1, Fract n2)
{
	Fract result;
	result.deno = n1.deno * n2.deno;
	result.num = (n1.num * n2.deno) + (n2.num * n1.deno);
	return result;
}
