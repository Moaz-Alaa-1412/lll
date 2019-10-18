#include"Header2.hpp"
/**
Author: Moaz Alaa EldinID--22016006
Date: 28 Dec 2016
Assignment-0
Introduction to CS - G2 -game math to cheldren
*/
int main() {
	srand(time(0));

	int x, Total = 0, winning = 0, num1, num2, num3, num4, n,b=1;
	bool exit1 = true;


	while (exit1 == true) {

		welcome_operation();
		cin >> x;
		switch (x) {
		case 1:

			switch (b) {

			case 1:
				while (exit1 == true) {
					num1 = rand_two_Number();
					num2 = rand_One_Number();
					n = Switch_one_operation(num1, num2);
					cout << "=";
					If_True_or_Fauls(n, winning, Total);
					Exit1(exit1);
				}exit1 = true;
				break;
			case 2:
				while (exit1 == true) {
					num3 = rand_two_Number();
					n = Switch_two_operation(num3);
					cout << "=";

					If_True_or_Fauls(n, winning, Total);
					Exit1(exit1);
				}exit1 = true;
				break;

			case 3:
				while (exit1 == true) {
					num4 = rand_three_Number();
					n = Switch_three_operation(num4);
					If_True_or_Fauls(n, winning, Total);
					Exit1(exit1);
				} exit1 = true;
				break;
			default: cout << "Enter Number the operation right" << endl;
				break;
			}
		case 2: result(winning, Total);
			break;
		
		case 3: operation();
		     	cin >> b;
				break;
		case 4: exit1 = false;
			break;

		default: cout << "Enter Number the operation right" << endl;
			break;
		}
	}


	return 0;

}