//Programmer: Brenan Marenger
//Date: 10/28/19
//Assignment: Ch6Ex7 pg453
//Description: Use 2 inputed values to find the sum of numbers between them and the average of the 2 numbers

#include<iostream>
#include<iomanip>

using namespace std;


double average(int num1, int num2);
double sumBtw(int num1, int num2);


int main()
{
	int num1 = 0;
	int num2 = 0;
	double avg = 0.0;
	double sumNum = 0.0;
	int total = 0;
	
	cout << "****** Prime Number Program ******" << endl << endl;
	cout << "Enter one integer: ";
	cin >> num1;
	cout << "Enter the second integer: ";
	cin >> num2;
	cout << endl << endl;
	avg = average(num1, num2);
	total = sumBtw(num1, num2);
	cout << "The sum of the numbers between " << num1 << " and "
		<< num2 << " (inclusive): "<< total << endl;
	cout << "The average of the numbers between " << num1 << " and " << num2 << " (inclusive): " 
		<< avg << endl;
	cout << endl << endl;


	system("pause");
	return 0;
}


double average(int num1, int num2)
{
	double average;
	
	average = (num1 + num2) / 2;

	return average;
}
double sumBtw(int num1, int num2)
{
	double total = 0.0;

	if (num1 < num2)
	{
		for (int x = num1; x <= num2; x++)
		{
			total += x;
		}
	}
	else
	{
		for (int y = num2; y <= num1; y++)
		{
			total += y;
		}
	}
	return total;
}
