#include <iostream>

using namespace std;
// writes the values in an array on the screen:
void printArray(int a[], int size);

// returns the sum of al the numbers in an array of integers:
double sumOfArray(double a[], int size);

// returns the number of occurences of a character in an array of characters:
int countChar(char a[], int size, char c);

// adds one to every number in an array of integers:
void addOne(int a[], int size);
int main()
{
	int example1[] = { 2,3,5,1,0 };
	printArray(example1, 5);
	
	double example2[] = {1.0, 2.2, 3.3, 4.4};
	cout << sumOfArray(example2, 4) << endl;
	
	char example3[] = {'a', 'd', 'r', 'd', 'e', 'f', 'd'};
	cout << countChar(example3, 7, 'd') << endl;
	
	addOne(example1, 5);
	printArray(example1, 5);
	
	return 0;
}

void printArray(int a[], int size)
{
	// ptr is a pointer pointing to the first element of the array:
	int* ptr = a;
	for (int i = 0; i < size; i++)
	{   // print the integer that ptr points to:
		cout << *ptr << " ";
		//make ptr point to the next integer in the array:
		ptr++;
	}
	cout << endl;
}

double sumOfArray(double a[], int size)
{
	double sum = 0;
	// ptr is a pointer pointing to the first element of the array:
	double* ptr = a;
	for (int i = 0; i < size; i++)
	{
		// add the value that ptr is pointing to to sum:
		sum += *ptr;
		//make ptr point to the next double in the array:
		ptr++;
	}
	return sum;
}

int countChar(char a[], int size, char c)
{
	int count = 0;
	// ptr is a pointer pointing to the first element of the array:
	char* ptr = a;
	for (int i = 0; i < size; i++)
	{
		// if the character that ptr is pointing to is equal to c:
		if (*ptr == c)
			count++;
		//make ptr point to the next double in the array:
		ptr++;
	}
	return count;
}

void addOne(int a[], int size)
{
	// ptr is a pointer pointing to the first element of the array:
	int* ptr = a;
	for (int i = 0; i < size; i++)
	{
		// increase the integer that ptr points to by 1:
		*ptr += 1;
		//make ptr point to the next double in the array:
		ptr++;
	}
}