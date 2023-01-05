package library;

public final class RecreationalMath {
  private RecreationalMath() {
  }

  public static int minDigit(int number) {
    int minDigit = 9;
    while (number != 0) {
      int lastDigit = number % 10;
      minDigit = Math.min(minDigit, lastDigit);
      number /= 10;
    }

    return minDigit;
  }

  public static int maxDigit(int number) {
    int maxDigit = 0;
    while (number != 0) {
      int lastDigit = number % 10;
      maxDigit = Math.max(maxDigit, lastDigit);
      number /= 10;
    }

    return maxDigit;
  }

  public static int minFrequentDigit(int number) {
    int minFrequentDigit = 0;
    int minFrequency = Integer.MAX_VALUE;
    int currentDigit = 0;

    while (currentDigit <= 9) {
      int currentFrequency = 0;
      int temp = number;

      while (temp != 0) {
        int lastDigit = temp % 10;
        if (lastDigit == currentDigit) {
          currentFrequency += 1;
        }
        temp /= 10;
      }

      if (currentFrequency != 0 && currentFrequency < minFrequency) {
        minFrequency = currentFrequency;
        minFrequentDigit = currentDigit;
      }

      currentDigit += 1;
    }

    return minFrequentDigit;
  }

  public static int maxFrequentDigit(int number) {
    int maxFrequentDigit = 0;
    int maxFrequency = Integer.MIN_VALUE;
    int currentDigit = 0;

    while (currentDigit <= 9) {
      int currentFrequency = 0;
      int temp = number;

      while (temp != 0) {
        int lastDigit = temp % 10;
        if (lastDigit == currentDigit) {
          currentFrequency += 1;
        }
        temp /= 10;
      }

      if (currentFrequency != 0 && currentFrequency > maxFrequency) {
        maxFrequency = currentFrequency;
        maxFrequentDigit = currentDigit;
      }

      currentDigit += 1;
    }

    return maxFrequentDigit;
  }

  public static int getDigitsSum(int number) {
    int sum = 0;
    while (number != 0) {
      int lastDigit = number % 10;
      sum += lastDigit;
      number /= 10;
    }

    return sum;
  }

  public static int getDivisorsSum(int number) {
    int sum = 1;
    for (int d = 2; d <= number / 2; d++) {
      if (number % d == 0) {
        sum += d;
      }
    }

    return sum;
  }

  public static boolean isNiven(int number) {
    int sum = getDigitsSum(number);
    if (sum == 0) {
      return false;
    }

    return number % sum == 0;
  }

  public static boolean isPerfect(int number) {
    return getDivisorsSum(number) == number;
  }

  public static boolean isPalindrome(int number) {
    if (number < 0) {
      return false;
    }

    int temp = number;
    int result = 0;

    while (temp != 0) {
      int lastDigit = temp % 10;
      result = result * 10 + lastDigit;
      temp /= 10;
    }

    return result == number;
  }

  public static boolean isPeterson(int number) {
    /*
     * TASK(me): Improve it using an array.
     */

    int temp = number;
    int result = 0;

    while (temp != 0) {
      int lastDigit = temp % 10;
      result += BasicMath.factorial(lastDigit);
      temp /= 10;
    }

    return result == number;
  }

  public static boolean isArmstrong(int number) {
    int digitsCount = 0;
    int result = 0;
    int temp;

    // Count digits in number.
    temp = number;
    while (temp != 0) {
      digitsCount += 1;
      temp /= 10;
    }
    // Sum the digits to the power of total digits.
    temp = number;
    while (temp != 0) {
      int lastDigit = temp % 10;
      result += (int) Math.pow(lastDigit, digitsCount);
      temp = temp / 10;
    }

    return result == number;
  }

  public static boolean isAutomorphic(int number) {
    int square = number * number;
    while (number != 0) {
      int sLastDigit = square % 10;
      int nLastDigit = number % 10;
      if (sLastDigit != nLastDigit) {
        return false;
      }

      square /= 10;
      number /= 10;
    }

    return true;
  }

  public static boolean isHappy(int number) {
    while (number > 9) {
      int result = 0;
      while (number != 0) {
        int lastDigit = number % 10;
        result += lastDigit * lastDigit;
        number /= 10;
      }
      number = result;
    }

    return number == 1 || number == 7;
  }

  public static boolean isKaprekar(int number) {
    int square = number * number;
    int digitsCount = 0;

    while (square != 0) {
      digitsCount += 1;
      square /= 10;
    }

    boolean isKaprekarNum = false;
    for (int i = 1; i <= digitsCount; i++) {
      int part = (int) Math.pow(10, i);
      if (part == number) {
        break;
      }

      int sum = square / part + square % part;
      if (sum == number) {
        isKaprekarNum = true;
        break;
      }
    }

    return isKaprekarNum;
  }

  public static boolean isEvil(int number) {
    long binary = BasicMath.binary(number);
    int count = 0;

    while (binary != 0) {
      int lastDigit = (int) (binary % 10);
      if (lastDigit == 2) {
        count += 1;
      }
    }

    return count % 2 == 0;
  }

  public static boolean isEmirp(int number) {
    if (BasicMath.isPrime(number)) {
      int reverse = BasicMath.reverse(number);
      if (BasicMath.isPrime(reverse)) {
        return true;
      }
    }

    return false;
  }

  public static boolean isTwinPrime(int a, int b) {
    return BasicMath.isPrime(a) && BasicMath.isPrime(b) && Math.abs(a - b) == 2;
  }

  public static boolean isKeith(int number) {
    throw new UnsupportedOperationException();
  }

  public static boolean isSphenic(int number) {
    throw new UnsupportedOperationException();
  }
}
