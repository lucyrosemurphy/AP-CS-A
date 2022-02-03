//EXPRESSIONS AND ASSIGNMENT STATEMENTS
//LUCY MURPHY
//02-03-22

/*
PLTW 1.1.3 QUESTIONS

1. In your own words explain what % (modulo) is.
Modulo is a function that returns the remainder

2. Provide the output of the following*/
system.out.println(5 % 5); // 0
system.out.println(2 % 3); // 2
system.out.println(3 % 2); // 3
system.out.println(40 % 2); // 0
system.out.println(35 % 2); // 1
/*

3. What type of error (logical error, run-time error or compiler error)
5 / 0
run time error

4. Code for step 9*/
public class GalaxyWeight
{
  public static void main(string[] args)
  {
    int weightOnEarth = 100 //Weight when g = 9.81
    double earthGrav = 9.81
    double mercuryGrav = 3.59
    double venusGrav = 8.87
    double marsGrav = 3.711
    double weightOnMerc = ( (weightOnEarth / earthGrav) * mercuryGrav)
    double weightOnVen = ( (weightOnEarth / earthGrav) * venusGrav)
    double weightOnMars = ( (weightOnEarth / earthGrav) * marsGrav)
    System.out.println("On Earth: " + weightOnEarth + "lbs")
    System.out.println("On Mercury: " + weightOnMerc + "lbs")
    System.out.println("On Venus: " + weightOnVen + "lbs")
    System.out.println("On Mars: " + weightOnMars + "lbs")
  }
}

/* Runestone 1.4

5. Pasons (2_swap)*/
int x = 3;
int y = 5;
int temp = 0;
temp = x;
x = y;
y = temp;

/*6. AP questions 1-4-13*/
int a = 5;
int b = 2;
double c = 3.0;
System.out.println(5 + a / b * c - 1);
//What is printed when this is executed?
//C. 10.0
