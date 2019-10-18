#pragma once
#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;

int rand_One_Number();
// this out numbers from 1 to 10.

int rand_two_Number();
// this out numbers from 1 to 100.

int rand_three_Number();
// this out numbers from 1 to 

int rand_0_to_3_Number();
// this out numbers from 0 to 3 .

int Switch_one_operation(int, int);
//this do one operation + or - or * or / and out result.

int Switch_two_operation(int);
//this do two operation + or - or * or / and out result.

int Switch_three_operation(int);
//this do three operation + or - or * or / and out result.

void welcome_operation();
//this pint welcome and number operation.




int If_True_or_Fauls(int&, int&, int&);
//Do input = reslut or no


char Exit1(bool&);
//Do want exit or no

void result(int& winning, int& Total);
//Do print reslut 
void operation();