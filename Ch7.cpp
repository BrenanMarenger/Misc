//Programmer: Brenan Marenger
//Date: 10/30/19
//Assignment: Ch7 Ex8 Pg520
//Description: 

#include<iostream>
#include<string>

using namespace std;

int main()
{
	string studentInfo = "";
	string::size_type pos = 0;
	string::size_type substrLen;

	system("cls");

	cout << "Please enter a student's name, social security number, user ID, and password in one line: " << endl;
	getline(cin, studentInfo); //lets user input multiple strings of info and puts it into the variable studentInfo
	cout << endl;

	for (int i = 0; i < 9; i++)//loops 9 times
	{
		pos = studentInfo.find_first_of("0123456789", pos);//the numbers inputed for the social security number set to the variable "pos"
		studentInfo.replace(pos, 1, "x");//replaces the numbers in "pos" variable with 'x'
	}

	pos = studentInfo.find(' ', pos);//finds the starting position from what the user inputed
	pos = studentInfo.find(' ', pos + 1);//moves the position through the string as the user inputs info

	string temp = studentInfo.substr(pos, 20);//puts user inputed data in to the temp string

	substrLen = temp.length();//returning lenth of string to a variable

	temp = "";//initialized the 'temp' variable

	for (string::size_type i = 0; i < substrLen - 1; i++)//loop repeats as long as 'i' is less than the substrLen variable
	{
		temp.append("x");//adds 'x' onto the end of 'temp'
	}

	studentInfo.replace(pos + 1, substrLen, temp);//replaces the password and social security numbers with 'x'
	cout << studentInfo << endl;//outputs the updated string with 'x' hidding certain info

	system("pause");

	return 0;
}

