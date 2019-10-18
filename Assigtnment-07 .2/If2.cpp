#include"Header2.hpp"

int If_True_or_Fauls(int& n, int& winning, int& Total) {
	int input;
	cin >> input;
	if (n == input) {
		cout << "\tGood" << endl;
		winning++;
	}
	else {
		cout << "Wrong" << endl
			<< "The right answer =" << n << endl;
	}Total++;
	return n, winning, Total;
}
char Exit1(bool& exit) {
	cout << "If you want continu Enter 'Y' exit enter 'N' ";
	char exit1;
	cin >> exit1;
	if ((exit1 == 'n') || (exit1 == 'N'))
		exit = false;
	return exit;
}
