//Casting and Range of Variables
//LUCY MURPHY
//02-04-22

/*
Notes:
-> overflow bits: You don't get an error, you actually get another number.
-> Ints and doubles are stored differently

PLTW QUESTIONS

1. Do step 1. What might the numbers represent?
2147483647 and -2147483647*/
public class MinMax
{
  public static void main(String[] args)
  {
    System.out.println("Max int value: " + Integer.MAX_VALUE);
    System.out.println("Min in value:" + Integer.MIN_VALUE);
  }
}
/*The numbers represent the maximum and minimum integer values


2. After class discussion how did the concept of overflow shut down youTube?
The number of likes on the gangnum style music video exeeded the integer storage limit

3. Complete "its your turn"*/
public class FivePlanetTravel
{
  public static void main(String[] args)
  {
    // theplanets.org average distance from earth to the planets
    int mercury = 56974146;
    int venus = 25724767;
    int mars = 48678219;
    int jupiter = 390674710;
    int saturn = 792248270;

    // number of planets to visit
    int numPlanets = 5;

    // speed of light and our speed
    int lightSpeed =  670616629;
    lightSpeed /= 10;

    // total travel time
    double total = 0;

    /* your code here */
    total = ( (double) mercury / lightSpeed)
            + (double) venus / lightSpeed)
            + (double) mars / lightSpeed)
            + (double) jupiter / lightSpeed)
            + (double) saturn / lightSpeed)
    System.out.println("It will take " + total + " light years to get to every planet")
  }
}
/*
RUNESTONE:

1. Provide answer to 1-6-5
True or false: Java rounds up automatically when you do integer division.
false

2. Provide answer to 1-6-6
True or false: casting always results in a double type.
false

3. Provide answer to 1-6-7
Which of the following returns the correct average for a total that is the sum of 3 int values?
C. (double) total / 3

4. Complete activity 1.5.1.1 Activity code*/

public class Challenge1_6
{
   public static void main(String[] args)
   {
      // 1. Declare 3 int variables called grade1, grade2, grade3
      // and initialize them to 3 values
      int grade1 = 99
      int grade2 = 88
      int grade3 = 90

      // 2. Declare an int variable called sum for the sum of the grades
      int sum

      // 3. Declare a variable called average for the average of the grades
      int average

      // 4. Write a formula to calculate the sum of the 3 grades (add them up).
      sum = grade1 + grade2 + grade3

      // 5. Write a formula to calculate the average of the 3 grades from the sum using division and type casting.
      average = (double) sum / 3

      // 6. Print out the average
      System.out.println("Average: " + average)


   }
}
