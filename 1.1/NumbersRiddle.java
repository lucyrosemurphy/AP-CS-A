//LUCY MURPHY
//02-07-22
//NUMBER RIDDLES PROJECT
//PLTW 1.1.6

/*
Program should include-
- camelCase
- comments
- print and println
- variables
- Arithmatic expressions
- compound assigment operator
- type casting

LE RIDDLE:
Choose any integer, double it, add six, divide it in half,
and subtract the number you started with. The answer is always three!
*/

import java.util.*; //the scannar class is used to get user input

class NumbersRiddle
{
  public static void main(String[] args)
  {
    //SHORT VERSION
    Scanner sc = new Scanner(System.in);  //System.in is a standard input stream
    System.out.println("Give A Number:"); //User input prompt
    int riddleNum = sc.nextInt(); //Taking the user input
    int changeable = (int) riddleNum;
    changeable *= 2;
    changeable += 6;
    changeable /= 2;
    changeable -= riddleNum;
    System.out.println("The final value is: " + changeable);
  }
}
