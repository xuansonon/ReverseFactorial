import java.util.*;

class reverseFactorialThread implements Runnable {
  
  int number;

  public reverseFactorialThread(int aValue) {
    number = aValue;
  }

  public String findReverseFactorial(int aNumber) {
    int factorialValue = 1;
    int number = aNumber;
    while(number != 1) {
      if((number % factorialValue) == 0) {
        number = number / factorialValue;
        factorialValue++;
      } else {
        return (String.valueOf(aNumber) + " is not a factorial result.");
      }
    }
    return ("Reverse factorial of " + aNumber + " is: " + (factorialValue - 1) + "!");
  }

  public void run() {
    System.out.println(findReverseFactorial(number));
  }
}
