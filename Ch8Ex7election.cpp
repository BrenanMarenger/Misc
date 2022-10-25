//Programmer: Brenan Marenger
//Date: 11/12/19
//Assignment: Ch8 Ex7 Election Candidates Program
//Description: use arrays, functions and setw to find % votes, total votes, and winner

#include<iostream>
#include<iomanip>
#include<string>

using namespace std;

int main()
{
	string canName[5];
	float votes[5] = { 0 };
	int totalVotes = 0;
	double percentVotes[5] = { 0.0 };
	string winner;

	system("cls");


	cout << "************ Election Candidates ************" << endl << endl;

	for (int x = 0; x < 5; x++)
	{
		cout << "Please enter a candidates name: ";
		cin >> canName[x];
		cout << "Please enter the votes received: ";
		cin >> votes[x];
		cout << endl;
		totalVotes += votes[x];
		
	}

	system("cls");


	
	cout << "**************** Election Candidates ****************" << endl << endl;

	cout << "Candidates" << setw(20) << "Votes Received" << setw(20) << "% Of Total Votes" << endl << endl;
	for (int x = 0; x < 5; x++)
	{
		percentVotes[x] = votes[x] / totalVotes;
		percentVotes[x] = percentVotes[x] * 100;
		cout << fixed << setprecision(0) << left << setw(20) << canName[x] << setw(23) << votes[x] << right;
		cout << setprecision(2) << percentVotes[x] << endl;
	}
	cout << endl <<"Total: " << setw(16) << totalVotes << endl << endl;
	
	int max = INT_MIN, count = 0;
	int index[5] = { 0 };
	for (int i = 0; i < 5; i++)
	{
		if (votes[i] > max) {
			max = votes[i];
		}
	}
	for (int i = 0; i < 5; i++)
	{
		if (votes[i] == max)
		{
			index[count] = i;
			count++;
		}
	}

	if(count ==1)
	cout << "The winner is: " << canName[index[count - 1]] << endl << endl;
	else
	{
		cout << "There is a tie." << endl << endl;
	}

	system("pause");
	return 0;
}

