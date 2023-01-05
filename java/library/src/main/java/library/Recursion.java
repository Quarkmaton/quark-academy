package library;

public final class Recursion {
  private Recursion() {
  }

  public static long factorial(int value) {
    if (value == 0) {
      return 1;
    }

    return value * factorial(value - 1);
  }

  public static int reverse(int number) {
    throw new UnsupportedOperationException();
  }

  public static void printFibonacciSequence(int count) {
    int a = 0;
    int b = 1;
    System.out.print(a + ", ");
    System.out.print(b + ", ");
    printFibonacciSequenceR(count - 2, a, b, 0);
  }

  private static void printFibonacciSequenceR(int count, int a, int b, int c) {
    if (count > 0) {
      c = a + b;
      a = b;
      b = c;
      System.out.print(c + ", ");
      printFibonacciSequenceR(count - 1, a, b, c);
    }
  }
}
