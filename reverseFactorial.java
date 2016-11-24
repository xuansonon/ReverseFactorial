import java.util.*;

class reverseFactorial {
  
  public static Integer toInteger(String aInput) {
    int convertedNumber = 0;
    try {
      convertedNumber = Integer.parseInt(aInput);
    } catch(NumberFormatException e) {
      System.out.println("Invalid input. Required: Integer (A whole number).");
      System.exit(0);
    }
    return convertedNumber;
  }

  public static void main(String[] args) {
    for(int i = 0; i < args.length; i++) {
      Thread rfThread = new Thread(new reverseFactorialThread(toInteger(args[i])));
      rfThread.start();
    }
  }
}
