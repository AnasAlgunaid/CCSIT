#include <iostream>
#include <string>
#include <cstdlib>
#include <cmath>
using namespace std;


struct Entity
{
	String name; 
	Position p;
};

struct Position
{
	double latitude;
	double longitude;
};

double calDistance(Entity &, Entity &);
int evaluateDistance(double, double, double);

int main()
{
	Entity saraLocation;
	saraLocation.name = "Sara Location";
	saraLocation.p.latitude = rand();
	saraLocation.p.longitude = rand();
	
	Entity supermarket1;
	supermarket1.name = "SuperMarket 1";
	supermarket1.p.latitude = rand();
	supermarket1.p.longitude = rand();
	
	Entity supermarket2;
	supermarket2.name = "SuperMarket 2";
	supermarket2.p.latitude = rand();
	supermarket2.p.longitude = rand();
	
	Entity supermarket3;
	supermarket3.name = "SuperMarket 3";
	supermarket3.p.latitude = rand();
	supermarket3.p.longitude = rand();
	
	cout << "Your current location is: " << endl;
	cout << "Latitude: " << saraLocation.p.latitude << endl;
	cout << "Longitude: " << saraLocation.p.longitude << endl;
	
	Dis1 = calDistance(supermarket1.p.latitude, supermarket1.p.longitude);
	Dis2 = calDistance(supermarket2.p.latitude, supermarket2.p.longitude);
	Dis3 = calDistance(supermarket3.p.latitude, supermarket3.p.longitude);
	
	cout << "SuperMarket #" << evaluateDistance(Dis1, Dis2, Dis3) << " is the nearest one" << endl;
	
	return 0;
}

double calDistance(Entity &sl, Entity &sm)
{
	
	return sqrt(pow(sl.p.latitude-sm.p.latitude, 2) + pow(sl.p.longitude-sm.p.longitude, 2));
}
