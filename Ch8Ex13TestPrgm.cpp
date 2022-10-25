//Programmer: Brenan Marenger
//Date: 11/14/19
//Assignment: Ch8 Ex13 pg 607-608
//Description: use arrays, functions, and setw to find the scores and averages from tests in a .txt file

#include<iostream>
#include<iomanip>
#include<string>
#include<fstream>

using namespace std;

char gradeFun(double avgScore);

int main()
{
	string name[10] = {};
	double test1[10] = {};
	double test2[10] = {};
	double test3[10] = {};
	double test4[10] = {};
	double test5[10] = {};
	double average[10];
	char grade = 'm';
	double classAvg =0.0;

	ifstream inFile;
	inFile.open("inData.txt");

	cout << fixed << showpoint << setprecision(2);

	//input
	for (int i = 0; i < 10; i++)
	{
		inFile >> name[i] >> test1[i] >> test2[i] >> test3[i] >> test4[i] >> test5[i];
	}

	//avgerage grade
	for (int i = 0; i < 10; i++)
	{
		average[i] = (test1[i] + test2[i] + test3[i] + test4[i] + test5[i]) / 5;
	}

	

	//class avg
	for (int i = 0; i < 10; i++)
	{
		classAvg += average[i];
	}
	classAvg = classAvg / 10;

	cout << setw(50) << "Student Test Score Program" << endl << endl;
	cout << "Name" << setw(20) << "Test 1" << setw(9) << "Test 2" << setw(9) << "Test 3" << setw(9) << "Test 4" << setw(9) << "Test 5" << setw(13)
		<< "Average" << setw(11) << "Grade" << endl << endl;

	for (int i = 0; i < 10; i++)
	{
		grade = gradeFun(average[i]);

		cout << left << setw(18) << name[i] << test1[i] << right<< setw(9) << test2[i] << setw(9) << test3[i] << setw(9) << test4[i] << setw(9) << test5[i]
			<< setw(12) << average[i] << setw(11) << grade << endl;
	}
	cout << endl << "Class Average: " << classAvg << endl << endl;

	system("pause");
	return 0;
}

char gradeFun(double avgScore)
{
	//finding grade
	char grade;
	for (int i = 0; i < 10; i++)
	{
		if (avgScore >= 90)
		
			grade = 'A';
		
		else if ( avgScore >= 80)
		
			grade = 'B';
		
		else if ( avgScore >= 70)
		
			grade = 'C';
		
		else if (avgScore >= 60)
		
			grade = 'D';
		
		else
	
			grade = 'F';
		
	}
	return grade;
}