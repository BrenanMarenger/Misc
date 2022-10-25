//Programmer: Brenan Marenger
//Date: 10/9/19
//Assignment: Ch4Ex20 pg263
//Description: Hotel Program

#include<iostream>
#include<iomanip>

using namespace std;

const double TEN_TO_NINETEEN_ROOMS_DIS = 0.10;
const double TWENTY_TO_TWENTYNINE_ROOMS_DIS = 0.20;
const double THIRTY_OR_MORE_ROOMS_DIS = 0.30;
const double THREE_DAYS_ROOMS_DIS = 0.05;

int main()
{
	double roomRent = 0.0;
	double totalRoomCost = 0.0;
	double salesTax = 0.0;
	double discount = 0.0;
	double billingAmt = 0.0;
	int numRoomsBooked = 0;
	int numDaysBooked = 0;

	system("cls");

	cout << fixed << showpoint << setprecision(2);
	cout << "***************************************************" << endl;
	cout << "              Hotel Program Input" << endl;
	cout << "***************************************************" << endl;

	cout << "Enter the cost of renting one room:            ";
	cin >> roomRent;
	cout << "Enter the number of rooms booked:              ";
	cin >> numRoomsBooked;
	cout << "Enter the number of days the rooms are booked: ";
	cin >> numDaysBooked;
	cout << "Enter the sales tax as a percent:              ";
	cin >> salesTax;
	cout << endl;

	if (10 <= numRoomsBooked && numRoomsBooked <= 19)
		discount = TEN_TO_NINETEEN_ROOMS_DIS;
	else
		if (20 <= numRoomsBooked && numRoomsBooked <= 29)
			discount = TWENTY_TO_TWENTYNINE_ROOMS_DIS;
		else
			if (30 <= numRoomsBooked)
				discount = THIRTY_OR_MORE_ROOMS_DIS;

	if (numDaysBooked >= 3)
		discount = discount + THREE_DAYS_ROOMS_DIS;

	totalRoomCost = roomRent * (1 - discount) * numRoomsBooked * numDaysBooked;
	discount = discount * 100;

	salesTax = salesTax / 100;
	salesTax = (salesTax * totalRoomCost)/ 100;
	billingAmt = totalRoomCost + salesTax;

	cout << "***************************************************" << endl;
	cout << "              Hotel Program Output" << endl;
	cout << "***************************************************" << endl;
	cout << "Cost of renting one room:               $" << roomRent << endl;
	cout << "Discount on each room rent:              " << discount << "%" << endl;
	cout << "Number of rooms booked:                  " << numRoomsBooked << endl;
	cout << "The number of days the rooms are booked: " << numDaysBooked << endl << endl;
	cout << "***************************************************" << endl;
	cout << "Total rooms cost:      $" << totalRoomCost << endl;
	cout << "Sales tax:             $" << salesTax << endl;
	cout << "The billing amount is  $" << billingAmt << endl;

	system("pause");
	return 0;
}