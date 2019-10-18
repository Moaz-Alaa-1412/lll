#include"Header2.hpp"

int Switch_one_operation(int num1, int num2)
{
	int result;
	switch (rand_0_to_3_Number()) {

	case 0:
		cout << num1 << "+" << num2;
		result = num1 + num2;
		break;

	case 1:
		cout << num1 << "-" << num2;
		result = num1 - num2;
		break;

	case 2:
		cout << num1 << "*" << num2;
		result = num1 * num2;
		break;
	default:
		while (num1%num2 != 0) {
			num1 = rand_One_Number();
			num2 = rand_One_Number();
		}
		{
			cout << num1 << "/" << num2;
			result = num1 / num2;
		}
		break;
	}
	return result;
}


int Switch_two_operation(int num3) {
	int n1 = rand_two_Number();
	int n2 = rand_One_Number();
	int result;
	int n;
	n = Switch_one_operation(n1, n2);
	switch (rand_0_to_3_Number()) {

	case 0:
		cout << "+" << num3;
		result = n + num3;
		break;
	case 1:
		cout << "-" << num3;
		result = n - num3;
		break;
	case 2:
		cout << "*" << num3;
		result = n * num3;
		break;
	default:
		while (n%num3 != 0) {
			num3 = rand_One_Number();
		}
		{
			cout << "/" << num3;
			result = n / num3;
		}
		break;
	}
	return result;
}


int Switch_three_operation(int num4) {
	int result;
	int n = Switch_two_operation(rand_One_Number());
	switch (rand_0_to_3_Number()) {

	case 0: cout << "+" << num4 << "=";
		result = n + num4;
		break;
	case 1:
		cout << "-" << num4 << "=";
		result = n - num4;
		break;
	case 2:
		cout << "*" << num4 << "=";
		result = n * num4;
		break;
	default:while (n%num4 != 0) {
		num4 = rand_One_Number();
	}
	{
		cout << "/" << num4 << "=";
		result = n / num4;
	}
	break;
	}
	return result;
}
