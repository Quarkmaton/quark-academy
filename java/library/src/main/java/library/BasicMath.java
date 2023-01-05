package library;

public final class BasicMath {
  private BasicMath() {
  }

  public static int min(int a, int b) {
    int min = a;
    if (b < min) {
      min = b;
    }

    return min;
  }

  public static int min(int a, int b, int c) {
    int min = a;
    if (b < min) {
      min = b;
    }
    if (c < min) {
      min = c;
    }

    return min;
  }

  public static boolean isEven(int number) {
    return number % 2 == 0;
  }

  public static boolean isPrime(int number) {
    if (number < 2) {
      return false;
    }

    boolean isPrimeNum = true;
    for (int d = 2; d * d < number; d++) {
      if (number % d == 0) {
        isPrimeNum = false;
        break;
      }
    }

    return isPrimeNum;
  }

  public static boolean isPerfectSquare(int number) {
    boolean isPerfectSquareNum = false;
    for (int d = 2; d * d < number; d++) {
      if (number % d == 0 && number / d == d) {
        isPerfectSquareNum = true;
        break;
      }
    }

    return isPerfectSquareNum;
  }

  public static long power(int base, int exponent) {
    long result = 1;
    while (exponent != 0) {
      result *= base;
      exponent -= 1;
    }

    return result;
  }

  public static long factorial(int value) {
    if (value == 0) {
      return 1;
    }

    long result = 1;
    for (int i = 2; i <= value; i++) {
      result *= i;
    }

    return result;
  }

  public static int gcd(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);

    while (a != b) {
      if (a > b) {
        a -= b;
      } else {
        b -= a;
      }
    }

    return a;
  }

  public static int gcd(int a, int b, int c) {
    return gcd(a, gcd(b, c));
  }

  public static int lcm(int a, int b) {
    return (a * b) / gcd(a, b);
  }

  public static int lcm(int a, int b, int c) {
    return (a * b * c) / gcd(a, b, c);
  }

  public static long binary(int decimalValue) {
    long binaryValue = 0;
    int placeValue = 0;
    while (decimalValue > 0) {
      int remainder = decimalValue % 2;
      binaryValue += remainder * placeValue;
      decimalValue /= 2;
      placeValue *= 10;
    }

    return binaryValue;
  }

  public static int reverse(int number) {
    int result = 0;
    int sign = number < 0 ? -1 : +1;
    number = Math.abs(number);

    while (number > 0) {
      int lastDigit = number % 10;
      result = result * 10 + lastDigit;
      number /= 10;
    }

    return sign * result;
  }
}
