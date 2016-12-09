class ReverseFactorialThread implements Runnable {

  int number;

  public ReverseFactorialThread(int aNumber) {
    number = aNumber;
  }

  public static void findFactorial(int aNumber) {
    int divisor = 1;
    int product = aNumber;
    while((product > 1)) {
      if((product % divisor) != 0) {
        System.out.println("There is no factorial for: " + aNumber);
        return;
      } else {
        product = product / divisor;
        if(product == 1) break;
         divisor++;
      }
    }
    System.out.println(aNumber + ": " + divisor + "!");
  }

  public void run() {
    findFactorial(number);
  }
}
