#include"Header2.hpp"

void welcome_operation() {
	cout << "\n\t\t(======You Welcome in mathematics games======)" << endl
		<< "1-Start solving" << endl
		<< "2-Display reults" << endl
		<< "3-Difficulty level" << endl
		<< "4-Quit" << endl;
}

void result(int& winning, int& Total) {

	cout << "Total is =" << winning << "/" << Total;
	if (winning == Total)
		cout << "Excellent";
	else if ((winning >= 0.75*Total) && (winning < Total))
		cout << "Very Good";
	else if ((winning >= 0.5*Total) && (winning < 0.75*Total))
		cout << "Good";
	else if (winning < 0.5*Total)
		cout << "Bad";

}

void operation() {
	cout << "1-One operation" << endl
		<< "2-Two operation" << endl
		<< "3-Three operation" << endl;
}