//Programmer: Brenan Marenger
//Date: 10/20/19
//Assignment: Ch5Ex28 Apartment Problem
//Description: find max profit from inputs

#include<iostream>
#include<iomanip>

using namespace std;

int main()
{
	double rentBase = 0.0; 
	double rentInc = 0.0; 
	int numAps = 0; 
	double expPer = 0.0;
	double rentPer = 0.0;

	double income = 0.0;
	double expense = 0.0;
	double profit = 0.0;

	double maxProfit = 0.0;
	int maxUnit = 0;

	cout << setprecision(2) << fixed;

	//inputs
	cout << "*************** Apartment Rental Program ***************" << endl << endl;
	cout << "Pleasee enter the total number of apartments:  ";
	cin >> numAps;
	cout << "Please enter the rent for each appartment:    $";
	cin >> rentBase;
	cout << "Please enter the monthly maintanence expense: $";
	cin >> expPer;
	cout << "Please enter the amount of rent increase:     $";
	cin >> rentInc;

	rentPer = rentBase;

	//math
	while (numAps > 0)
	{
		income = rentPer * numAps;
		expense = expPer * numAps;
		profit = income - expense;

		if (maxProfit < profit)
		{
			maxProfit = profit;
			maxUnit = numAps;
		}
		rentPer = rentPer + rentInc;
		numAps = numAps - 1;
	}
	
	//outputs
	cout << endl << endl << "********* Maximum Number of Units and Profit *********" << endl << endl;
	cout << "Maximum Number of Units to Rent: " << maxUnit << endl;
	cout << "Maximum Profit:                 $" << maxProfit << endl << endl;;

	system("pause");
	return 0;
}