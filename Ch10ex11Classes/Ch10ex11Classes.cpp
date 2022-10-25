//Programmer: Brenan Marenger
//Date: 12/1/19
//Assignment: Ch10 Ex11 Classes
//Description: Store the name of a person using header files and classes

#include<iostream>
#include<string>
#include"header.h"
using namespace std;


int main()
{
	Person person1;
	person1.getData();
	person1.writeData();
	system("pause");
	return 0;
}

void Person::getData()
{
	system("cls");
	cout << "Please enter the first name of the person: ";
	cin >> fName;
	cout << "Please enter the middle name of the person: ";
	cin >> mName;
	cout << "Please enter the last name of the person: ";
	cin >> lName;
	system("cls");
}

void Person::writeData()
{
	cout << fName << " " << mName << " " << lName << endl;
	cout << "The student's last name is " << lName << endl;
	cout << "The student's first name is " << fName << endl;
}