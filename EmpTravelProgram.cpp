// Programmer: Brenan Marenger
// Date: 9/25/19
// Assignment: Ch3 Ex1: Employee Travel Program

#include<fstream>
#include<string>
#include<iomanip>
#include<iostream>

using namespace std;

int main()
{
	string fName	= "name";
	string lName	= "lname";
	string dep		= "department";
	double grossSal = 0.00;
	double bonus	= 0.00;
	double taxes	= 0.00;

	//Math variables
	double payCheck	  = 0.00;
	double totalbonus = 0.00;
	double totaltax   = 0.00;

	ifstream inFile;
	inFile.open("inData.txt");
	ofstream outFile;
	outFile.open("outData.txt");

	outFile << setprecision(2) << fixed;

	//Name/salary section
	inFile >> fName >> lName >> dep >> grossSal >> bonus >> taxes;

	outFile << "Name: " << fName << " " << lName;
	outFile << ", Department: " << dep << endl;
	outFile << "Monthly Gross Salary: " << grossSal << ", Monthly Bonus: " << bonus << "%";
	outFile << ", Taxes: " << taxes << "%" << endl;

	bonus = bonus / 100;
	totalbonus = grossSal * bonus;
	payCheck = grossSal + totalbonus;
	totaltax = payCheck * .3;
	payCheck = payCheck - totaltax;

	outFile << "Paycheck: $" << payCheck << endl << endl;

	//Distance section
	double dTraveled = 0.00;
	double tTime	 = 0.00;
	double avgSpeed  = 0.00;

	inFile >> dTraveled >> tTime;
	outFile << "Distance Traveled: " << dTraveled << " miles, Traveling time: " << tTime << " hours" << endl;

	avgSpeed = dTraveled / tTime;

	outFile << "Average Speed: " << avgSpeed << " miles per hour" << endl << endl;

	//Coffee section
	double numCups  = 0.00;
	double priceCup = 0.00;
	double saleAmt = 0.00;

	inFile >> numCups >> priceCup;
	outFile << "Number of Coffee Cups Sold: " << numCups << ", Cost: $" << priceCup << " per cup" << endl;

	saleAmt = numCups * priceCup;

	outFile << "Sales Amount: $" << saleAmt;

	//close

	inFile.close();
	outFile.close();
	cout << "The files were read and written successfully, press any key to exit.";
	system("pause>nul");

	return 0;
}

