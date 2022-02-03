//LUCY MURPHY
//02-02-2022
//VARIABLES AND DATA TYPES

//Notes
//UpperCamelCase: for CLASSES
//lowerCamelCase: for METHODS and VARIABLES
//final variables can be declared and wont be changed (all capital)

//PLTW 1.1.2

//1) Why do we use int variables? Why cant we just make all variabls double?
//a double needs more bits to store, ints only need 32 bits.

//2) After the below code is executed, what will be stroed in age? what happens to the other number?
int age = 12;
age = 13;
//now 13 is stroed in age, 12 has been erased.

//3)Complete "its your turn" step 4
puplic static void houseHoldInfo(){
  double allowance = 8.75;
  int ginaAge = 16;
  int carlAge = (ginaAge - 3);
  int jennAge = (carlAge - 10);
  if (ginaAge >= 8){
    system.out.print("Gina will get allowance")
  }
  if (ginaAge < 8){
    system.out.print("Gina will not get allowance")
  }
  if (carlAge >= 8){
    system.out.print("Carl will get allowance")
  }
  if (carlAge < 8){
    system.out.print("Carl will not get allowance")
  }
  if (jennAge >= 8){
    system.out.print("Jennifer will get allowance")
  }
  if (jennAge < 8){
    system.out.print("Jennifer will not get allowance")
  }
}
