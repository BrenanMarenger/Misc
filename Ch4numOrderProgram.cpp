//Programmer: Brenan Marenger
//Date: 10/9/19
//Assignment: Ch4Ex2 pg257
//Description: Sorting Numbers in Order Program

#include<iostream>
#include<string>

using namespace std;

int main()
{
	double num1, num2, num3, temp = 0.0;

	system("cls");

	cout << "****** Sorted Numbers Program ******" << endl;
	cout << "Please end the first number: ";
	cin >> num1;
	cout << "Please end the second number: ";
	cin >> num2;
	cout << "Please end the third number: ";
	cin >> num3;

	if (num1 > num2)
	{
		temp = num1;
		num1 = num2;
		num2 = temp;
	}
	cout << "The three numbers sorted in ascending order are: ";
	if (num3 <= num1)
		cout << num3 << ", " << num1 << ", " << num2 << endl << endl;
	else if (num1 <= num3 && num3 <= num2)
		cout << num1 << ", " << num3 << ", " << num2 << endl << endl;
	else
		cout << num1 << ", " << num2 << ", " << num3 << endl << endl;

	system("pause");
	return 0;
}