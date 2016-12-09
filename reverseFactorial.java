import java.io.*;

/*
  Reverse Factorial
  A basic Java-based console application that takes
  integer inputs and returns an appropriate Factorial
  value (if found).
*/
class reverseFactorial {

  public static Boolean isInt(String aString) {
    try {
      Integer number = Integer.parseInt(aString);
      return true;
    } catch(NumberFormatException e) {
      System.out.println(aString + " is an invalid input. Required: Integer.");
      return false;
    }
  }

  public static int toInt(String aInput) {
    int number = 0;
    try {
      number = Integer.parseInt(aInput);
    } catch(NumberFormatException e) {
      System.out.println("Bad input.");
    }
    return number;
  }

  public static void main(String[] args) {
    for(int i = 0; i < args.length; i++) {
      if(isInt(args[i])) {
        Thread th = new Thread(new reverseFactorialThread(toInt(args[i])));
        th.start();
      }
    }
  }
}
