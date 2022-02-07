//Compound Assignment Operators
//LUCY MURPHY
//02-04-22

/*
PLTW 1.1.4 QUESTIONS

1. After changing the code in step 3 to include Compound Assignment opperatos.
Provide a screen shot of the code and output here.*/
public class CompoundOperators
{
  public static void main(String[] args)
  {
    int numPeople = 0;
    double totalYears = 0;

    double years = 11.5;  // I will soon be halfway through my junior year.

    totalYears += years;
    numPeople ++;
  }
}
/*
2. What are the benefits of using compound assignment and increment/decrement opperators in a program?
Using compound assignment opperators such as += helps to reduce the amount a programmer
has to write. This can also increase the readability and redundancy of code.
The same is true for increment/decrement operators such as x ++ which ads one.

RUNESTONE QUESTIONS 1.5

1. Provide answer for 1-5-2
What are the values of x, y, and z after the following code executes?*/
int x = 0;
int y = 1;
int z = 2;
x--;
y++;
z+=y;
/*Answer: E. x=-1, y=2, z=4

2. Provide answer for 1-5-3
What are the values of x, y, and z after the following code executes?*/
int x = 3;
int y = 5;
int z = 2;
x = z * 2;
y = y / 2;
z++;
//Answer: E. x=4, y=2, z=3
