//Programmer: Brenan Marenger
//Date: 11/2/19
//Assignment: Ch7 Ex6 Pg519
//Description: Create a program that uses a 2 digit random number to do multiple operations with.

#include<iostream>
#include<iomanip>
#include<cstdlib>
#include<ctime>

using namespace std;

//functions 1-6,9

int choice1(int rngNum);
int choice2(int num_1, int num_2);
int choice3(int num_1, int  num_2);

int main()
{
	int choice;
	bool isPrime = true;
	int rngNum;
	int finalNum = 0; // use on all options to test if prime

	//RNG
	srand(time(NULL));
	int rngNum1 = rand() % 10;
	int rngNum2 = rand() % 10;
	rngNum = 10 * rngNum1 + rngNum2;
	
	cout << "************************ Main Menu ************************" << endl << endl;
	cout << "The randomly generated two-digit positive integer is: " << rngNum << endl << endl;

	cout << "1: Enter 1 to double the number." << endl; // use 
	cout << "2: Enter 2 to reverse the digits of the number." << endl; // use
	cout << "3: Enter 3 to raise the number to the power of 2, 3, or 4." << endl;
	cout << "4: Enter 4 to sum the digits of the number." << endl; //use
	cout << "5: Enter 5 to raise the first digit to the power of the second digit." << endl;
	cout << "6: Enter 6 to raise the first two digits to the power of the last digit." << endl;
	cout << "9: Enter 9 to terminate the program." << endl << endl;

	cout << "Please enter a menu option (1, 2, 4, or 9): ";
	cin >> choice;
	cout << endl;

	//choice options
	if (choice == 1)
	{
		cout << endl << "Menu Option 1 Operation Output" << endl << endl;
		finalNum = choice1(rngNum);
		cout << "New number: " << finalNum << endl;
	}
	else if (choice == 2)
	{
		cout << endl << "Menu Option 2 Operation Output" << endl << endl;
		finalNum = choice2(rngNum1, rngNum2);
		cout << "New number: " << finalNum << endl;
	}
	else if (choice == 3)
	{
		cout << endl << "Menu Option 3 Operation Output" << endl<< endl;
		//enter program that leads to the end (3,5,6,9)
		cout << "Option 3 is not finished yet." << endl << endl;
	}
	else if (choice == 4)
	{
		cout << endl << "Menu Option 4 Operation Output" << endl << endl;
		finalNum = choice3(rngNum1, rngNum2);
		cout << "New number: " << finalNum << endl;
	}
	else if (choice == 5)
	{
		cout << endl << "Menu Option 5 Operation Output" << endl << endl;
		cout << "Option 5 is not finished yet." << endl << endl;
	}
	else if (choice == 6)
	{
		cout << endl << "Menu Option 6 Operation Output" << endl << endl;
		cout << "Option 6 is not finished yet." << endl << endl;
	}
	else if (choice == 9)
	{
		cout << endl << "Menu Option 9 Operation" << endl;
		cout << endl << "Program Terminated." << endl;
	}
	else
	{
		cout << endl << "Invalid Input." << endl;
	}

	if (finalNum != 0)
	{
		for (int i = 2; i <= finalNum / 2; ++i)
		{
			if (finalNum % i == 0)
			{
				isPrime = false;
				break;
			}
		}
		if (isPrime)
			cout << finalNum << " is a prime number." << endl << endl;
		else
			cout << finalNum << " is not a prime number." << endl << endl;
	}

	system("pause");
	return 0;
}

//choice functions
int choice1(int rngNumc1)
{
	int doubled;
	doubled = rngNumc1 * 2;
	return doubled;
}

int choice2(int num_1, int num_2)
{
	int reverse;
	reverse = 10 * num_2 + num_1;
	return reverse;
}

int choice3(int num_1, int  num_2)
{
	int sum;
	sum = num_1 + num_2;
	return sum;
}