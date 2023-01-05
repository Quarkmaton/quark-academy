package library;

public final class Sequence {
  private Sequence() {
  }

  /*
   * Sequence: 2, 3, 5, 7, 11, 13, 17, 19, ..., n
   */
  public static void printPrimeSequence(int lowerBound, int upperBound) {
    for (int i = lowerBound; i <= upperBound; i++) {
      if (BasicMath.isPrime(i)) {
        System.out.print(i + ", ");
      }
    }
    System.out.println();
  }

  /*
   * Sequence: 0, 1, 1, 2, 3, 5, 8, 13, ..., n
   */
  public static void printFibonacciSequence(int count) {
    int a = 0, b = 1, c;
    System.out.print(a + ", ");
    System.out.print(b + ", ");
    count -= 2;
    while (count > 0) {
      c = a + b;
      System.out.print(c + ", ");

      a = b;
      b = c;
      count -= 1;
    }
    System.out.println();
  }

  /*
   * Sequence: 1, 11, 21, 1211, 111221, 312211, 13112221, 1113213211, ..., n
   */
  public static void printLookAndSaySequence(int initial, int count) {
    if (count <= 0) {
      return;
    }

    String term = String.valueOf(initial);
    StringBuilder next = new StringBuilder();
    while (count > 0) {
      // Print previous term.
      System.out.print(term + ", ");

      int digitsCount = 1;
      for (int i = 0; i < term.length() - 1; i++) {
        if (term.charAt(i + 1) == term.charAt(i)) {
          digitsCount += 1;
        } else {
          next.append(digitsCount);
          next.append(term.charAt(i));
          digitsCount = 1;
        }
      }

      next.append(digitsCount);
      next.append(term.charAt(term.length() - 1));

      term = next.toString();
      next.delete(0, next.length());
      count -= 1;
    }
    System.out.println();
  }
}
