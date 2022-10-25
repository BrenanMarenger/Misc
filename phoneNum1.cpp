#include<iostream>
#include<string>

using namespace std;


int main()
{
	char confirmY = 'n';
	char phoneNumber;
	int counter;

	cout << "********** Convert a Telephone Number from Letters to Digits Program **********" << endl << endl;
	
	cout << "Enter 'Y' to convert a telephone number or any other key to end the program: ";
	cin >> confirmY;
	cout << endl << endl;
	while(confirmY == 'y' || confirmY == 'Y')
	{

		cout << "Enter a telephone number using letters: ";

		for (counter = 1; counter < 8; counter++)
		{
			cin >> phoneNumber;
			if (counter == 4)
				cout << "-";
			if (phoneNumber >= 'A' && phoneNumber <= 'Z'|| phoneNumber >= 'a' && phoneNumber <= 'z')
				switch (phoneNumber)
				{
				case 'A':
				case 'a':
				case 'B':
				case 'b':
				case 'C':
				case 'c':
					cout << 2;
					break;
				case 'D':
				case 'd':
				case 'E':
				case 'e':
				case 'F':
				case 'f':
					cout << 3;
					break;
				case 'G':
				case 'g':
				case 'H':
				case 'h':
				case 'I':
				case 'i':
					cout << 4;
					break;

				case 'J':
				case 'j':
				case 'K':
				case 'k':
				case 'L':
				case 'l':
					cout << 5;
					break;
				case 'M':
				case 'm':
				case 'N':
				case 'n':
				case 'O':
				case 'o':
					cout << 6;
					break;
				case 'P':
				case 'p':
				case 'Q':
				case 'q':
				case 'R':
				case 'r':
				case 'S':
				case 's':
					cout << 7;
					break;

				case 'T':
				case 't':
				case 'U':
				case 'u':
				case 'V':
				case 'v':
					cout << 8;
					break;

				case 'W':
				case 'w':
				case 'X':
				case 'x':
				case 'Y':
				case 'y':
				case 'Z':
				case 'z':
					cout << 9;
					break;
				}
		}

		cout <<endl << "****************************************************************************" << endl;
		cout << "Enter 'Y' to convert a telephone number or any other key to end the program: ";
		cin >> confirmY;

	}
	cout <<endl << "Program ended, press any key to close" << endl << endl;
	return 0;
}