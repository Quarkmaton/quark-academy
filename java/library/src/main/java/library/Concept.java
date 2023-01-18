package library;

import java.util.Scanner;

public class Concept {

  /**
   * Concept:
   * - How to learn Java?
   * - How to print a line?
   * - What is a main method?
   *
   * Exercise:
   * - Print your name, age, gender, weight, and height.
   */
  public static void ioAndBscExprA() {
    System.out.print("Helloworld!");
  }

  /**
   * Concept:
   * - How to write comments?
   * - How to print multiple lines?
   * - How to print non-typable characters?
   *
   * Exercise:
   * - Print height in foot+inch.
   * - Print foot(')+inch(") symbols.
   * - Print the previous personal data using variables.
   */
  public static void ioAndBscExprB() {
    /*
     * Print the following values:
     * - Name: Olivia
     * - Age: 20 yr
     * - Gender: F
     * - Weight: 60 kg
     * - Height: 177.8 cm
     */

    // Process 1
    System.out.print("Name: Olivia\n");
    System.out.print("Age: 20 yr\n");
    System.out.print("Gender: F\n");
    System.out.print("Weight: 60 kg\n");
    System.out.print("Height: 177.8 cm\n");

    // Process 2
    System.out.println("Name: Olivia");
    System.out.println("Age: 20 yr");
    System.out.println("Gender: F");
    System.out.println("Weight: 60 kg");
    System.out.println("Height: 177.8 cm");
  }

  /**
   * Concept:
   * - What is input-storage-processing-output cycle?
   * - How to print data?
   * - What is a data type?
   * - What is a variable?
   * - How to use variables?
   *
   * Exercise:
   * - Find out the data type of the following values:
   * -- Mango (Name)
   * -- F (Gender)
   * -- 18 (Age)
   * -- 6227020800 (13!)
   * -- 180 (Height)
   * -- 60.5 (Weight)
   * -- 3.14159 (π)
   * -- 300000000 (Speed of Light)
   * -- 9876543210 (Indian Phone Number)
   * -- 987654321098 (Indian Aadhaar Number)
   * -- Yes/No (Are you a vegan?)
   * -- 0.9 (Probability of raining today)
   */
  public static void ioAndBscExprC() {
    // Alternative Process 1
    // System.out.println("Name: " + "Olivia");
    // System.out.println("Age: " + 20 + " yr");
    // System.out.print("Gender: " + 'F');
    // System.out.println("Weight: " + 60 + " kg");
    // System.out.println("Height: " + 177.8 + " cm");

    // Alternative Process 2
    // String name;
    // int age, gender;
    // double weight, height;
    //
    // name = "Olivia";
    // age = 20;
    // gender = 'F';
    // weight = 60;
    // height = 177.8;
    //
    // System.out.println("Name: " + name);
    // System.out.println("Age: " + age + " yr");
    // System.out.print("Gender: " + gender);
    // System.out.println("Weight: " + weight + " kg");
    // System.out.println("Height: " + height + " cm");

    // Process 3
    String name = "Olivia";
    int age = 20;
    int gender = 'F';
    double weight = 60;
    double height = 177.8;

    System.out.println("Name: " + name);
    System.out.println("Age: " + age + " yr");
    System.out.print("Gender: " + gender);
    System.out.println("Weight: " + weight + " kg");
    System.out.println("Height: " + height + " cm");
  }

  /**
   * Concept:
   * - How to read data from user?
   * - How to import others code?
   * - Why is there no similarity between input and output statments?
   *
   * Exercise:
   * - Display helpful messages during input.
   */
  public static void ioAndBscExprD() {
    Scanner in = new Scanner(System.in);

    String name = in.next();
    int age = in.nextInt();
    int gender = in.next().charAt(0);
    double weight = in.nextDouble();
    double height = in.nextDouble();

    System.out.println("Name: " + name);
    System.out.println("Age: " + age + " yr");
    System.out.println("Gender: " + gender);
    System.out.println("Weight: " + weight + " kg");
    System.out.println("Height: " + height + " cm");

    in.close();
  }

  /**
   * Concept:
   * - How to display meaningful messages during input?
   *
   * Exercise:
   * - Add two variables.
   */
  public static void ioAndBscExprE() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter name: ");
    String name = in.next();

    System.out.print("Enter age: ");
    int age = in.nextInt();

    System.out.print("Enter gender: ");
    int gender = in.next().charAt(0);

    System.out.print("Enter weight: ");
    double weight = in.nextDouble();

    System.out.print("Enter height: ");
    double height = in.nextDouble();

    System.out.println("Name: " + name);
    System.out.println("Age: " + age + " yr");
    System.out.println("Gender: " + gender);
    System.out.println("Weight: " + weight + " kg");
    System.out.println("Height: " + height + " cm");

    in.close();
  }

  /**
   * Concept:
   * - How to operate on two variables?
   *
   * Exercise:
   * - Take a and b from user.
   */
  public static void ioAndBscExprF() {
    int a = 3;
    int b = 5;
    int sum = a + b;
    System.out.println("The sum is: " + sum);
  }

  /**
   * Concept:
   * - How to build a completely usable app?
   *
   * Exercise:
   * - Add a new statment to find the value of:
   * --(a+b)^2
   */
  public static void ioAndBscExprG() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter 1st number: ");
    int a = in.nextInt();
    System.out.print("Enter 2nd number: ");
    int b = in.nextInt();

    int value = a + b;
    System.out.println("The value is: " + value);

    in.close();
  }

  /**
   * Find the perimeter and area of a rectangle.
   */
  public static void ioAndBscExprRectangle() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter length of rectangle: ");
    int l = in.nextInt();

    System.out.print("Enter width of rectangle:  ");
    int w = in.nextInt();

    int p = 2 * (l + w);
    int a = l * w;

    System.out.println("Perimeter of rectangle is: " + p);
    System.out.println("Area of rectangle is:      " + a);

    in.close();
  }

  /**
   * Find the circumference and area of a circle.
   */
  public static void ioAndBscExprCircle() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter radius of circle: ");
    float r = in.nextFloat();

    double c = 2 * Math.PI * r;
    double a = Math.PI * r * r;

    System.out.println("Circumference of circle is: " + c);
    System.out.println("Area of circle is:          " + a);

    in.close();
  }

  /**
   * Find the perimeter and area of a triangle.
   *
   * s = 1/2(a+b+c)
   * A = sqrt(s(s-a)(s-b)(s-c))
   */
  public static void ioAndBscExprTriangle() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter a: ");
    int a = in.nextInt();

    System.out.print("Enter b:    ");
    int b = in.nextInt();

    System.out.print("Enter c:     ");
    int c = in.nextInt();

    double perimeter = a + b + c;
    double s = 0.5 * perimeter;
    double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

    System.out.print("Perimeter of triangle is: " + perimeter);
    System.out.print("Area of triangle is: " + area);

    in.close();
  }

  /**
   * Find H:M:S from total number of seconds.
   */
  public static void ioAndBscExprDuration() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter seconds: ");
    int s = in.nextInt();

    int h = s / 3600;
    s = s % 3600;

    int m = s / 60;
    s = s % 60;

    System.out.println("Value is: " + h + ":" + m + ":" + s);

    in.close();
  }

  /**
   * Find the discriminant (Δ) of a quadratic equation.
   * ax^2 + bx + c = 0
   */
  public static void ioAndBscExprQuadraticRoots() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter a: ");
    int a = in.nextInt();

    System.out.print("Enter b: ");
    int b = in.nextInt();

    System.out.print("Enter c: ");
    int c = in.nextInt();

    int discriminant = (b * b) - (4 * a * c);
    System.out.print("The discriminant (Δ): " + discriminant);

    in.close();
  }

  /**
   * Find the percentage obtained in science subjects.
   */
  public static void ioAndBscExprMarks() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter marks obtained in Biology:   ");
    int b = in.nextInt();

    System.out.print("Enter marks obtained in Chemistry: ");
    int c = in.nextInt();

    System.out.print("Enter marks obtained in Physics:   ");
    int p = in.nextInt();

    System.out.print("Enter total marks of all subjects: ");
    int t = in.nextInt();

    // Alternative Process 1:
    // int percent = (b + c + p) * 100 / t;

    double percent = (b + c + p) * 100.0 / t;
    System.out.print("Total marks obtained: " + percent);

    in.close();
  }

  /**
   * Find the simple interest and compound interest on a specified P, R, T.
   * S.I. = P*R*T/100
   * C.I. = P(1+R/100)^T - P
   */
  public static void ioAndBscExprSimpleInterest() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter principal amount: ");
    int p = in.nextInt();
    System.out.print("Enter interest rate:    ");
    float r = in.nextFloat();
    System.out.print("Enter time elapsed (in Years):     ");
    float t = in.nextFloat();

    // Error Process 1:
    // float si = (p * r * t) / 100;
    // float ci = p * Math.pow(1 + r / 100, t) - p;

    // Error Process 2:
    // float si = (p * r * t) / 100.0;
    // float ci = p * Math.pow(1 + r / 100.0, t) - p;

    double si = (p * r * t) / 100.0;
    double ci = p * Math.pow(1 + r / 100.0, t) - p;

    System.out.println("Simple Interest payable: " + si);
    System.out.println("Compound Interest payable: " + ci);

    in.close();
  }

  /**
   * Concept:
   * - How to perform selection?
   * - What are the three types of tasks/statements?
   *
   * Exercise:
   * - Check if a user is senior or adult/minor based on age.
   */
  public void ifAndBoolExprA() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter age: ");
    int age = in.nextInt();
    int year = 2023 - age;

    if (age > 59) {
      System.out.println("User is a Senior Citizen");
    }

    System.out.println("Birth year is: " + year);
    in.close();
  }

  /**
   * Concept:
   * - How to use else statements?
   *
   * Exercise:
   * - Check if a user is senior, adult, or minor based on age.
   */
  public void ifAndBoolExprB() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter age: ");
    int age = in.nextInt();

    // Alternative Process 1:
    // if (age > 59)
    // System.out.println("User is Senior Citizen");
    // if (age <= 59)
    // System.out.println("User is Adult/Minor Citizen");

    if (age > 59) {
      System.out.println("User is Senior Citizen");
    } else {
      System.out.println("User is Adult/Minor Citizen");
    }

    System.out.println("Thank you.");
    in.close();
  }

  /**
   * Concept:
   * - How to use nested if statements?
   * - How to use if-else-if statements?
   *
   * Exercise:
   * - Check if a user is super-senior, senior, adult, or minor based on age.
   */
  public void ifAndBoolExprC() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter age: ");
    int age = in.nextInt();

    // Alternative Process 1:
    // if (age > 59)
    // System.out.println("User is Senior Citizen");
    // else {
    // if (age > 17)
    // System.out.println("User is Adult Citizen");
    // else
    // System.out.println("User is Minor Citizen");
    // }

    if (age > 59) {
      System.out.println("User is Senior Citizen");
    } else if (age > 17) {
      System.out.println("User is Adult Citizen");
    } else {
      System.out.println("User is Minor Citizen");
    }

    System.out.println("Thank you.");
    in.close();
  }

  /*
   * Concept:
   * - How to use nested if-else-if statements?
   *
   * Exercise:
   * - Add a new statement to check if a user is newborn baby.
   */
  public void ifAndBoolExprD() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter age: ");
    int age = in.nextInt();

    if (age > 59) {
      if (age > 79) {
        System.out.println("User is Super Senior Citizen");
      } else {
        System.out.println("User is Senior Citizen");
      }
    } else if (age > 17) {
      System.out.println("User is Adult Citizen");
    } else {
      System.out.println("User is Minor Citizen");
    }

    // Alternative Process 1:
    // if (age > 79)
    // System.out.println("User is Super Senior Citizen");
    // else if (age > 59)
    // System.out.println("User is Senior Citizen");
    // else if (age > 17)
    // System.out.println("User is Adult Citizen");
    // else
    // System.out.println("User is Minor Citizen");

    System.out.println("Thank you.");
    in.close();
  }

  /**
   * Find if a number is positive, negative or zero.
   */
  public static void ifAndBoolExprNumberLine() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = in.nextInt();

    // Slow Process 1:
    // if (n < 0) {
    // System.out.println("Number is negative.");
    // }
    // if (n > 0) {
    // System.out.println("Number is positive.");
    // }
    // if (n == 0) {
    // System.out.println("Number is zero.");
    // }

    if (n < 0) {
      System.out.println("Number is negative.");
    } else if (n > 0) {
      System.out.println("Number is positive.");
    } else {
      System.out.println("Number is zero.");
    }

    in.close();
  }

  /**
   * Find if a number is even or odd.
   */
  public static void ifAndBoolExprEvenOdd() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = in.nextInt();

    int remainder = n % 2;

    if (remainder == 0) {
      System.out.println("It is an even number.");
    } else {
      System.out.println("It is an odd number.");
    }

    in.close();
  }

  /**
   * Find if a number N is divisible by another number F.
   */
  public static void ifAndBoolExprDivisibility() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = in.nextInt();

    System.out.print("Enter a factor: ");
    int f = in.nextInt();

    int remainder = n % f;

    if (remainder == 0) {
      System.out.println("The number is divisible by " + f);
    } else {
      System.out.println("The number is not divisible by " + f);
    }

    in.close();
  }

  /**
   * Find the smaller between two numbers.
   */
  public static void ifAndBoolExprMinimum() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter A: ");
    int a = in.nextInt();

    System.out.print("Enter B: ");
    int b = in.nextInt();

    if (a < b) {
      System.out.println("Smaller number is: " + a);
    } else if (a > b) {
      System.out.println("Smaller number is: " + b);
    } else {
      System.out.println("The numbers are equal.");
    }

    in.close();
  }

  /**
   * Find if an angle is acute, right, or obtuse angle.
   */
  public static void ifAndBoolExprAngleType() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter an angle: ");
    int a = in.nextInt();

    if (a == 90) {
      System.out.println("It is an right angle.");
    } else if (a < 90) {
      System.out.println("It is an acute angle.");
    } else if (a > 90) {
      System.out.println("It is an obtuse angle.");
    } else {
      System.out.println("Error: Angle cannot be negative.");
    }

    in.close();
  }

  /**
   * Find if three angles can form a triangle.
   */
  public static void ifAndBoolExprAngleSum() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter angle A: ");
    int a = in.nextInt();

    System.out.print("Enter angle B: ");
    int b = in.nextInt();

    System.out.print("Enter angle C: ");
    int c = in.nextInt();

    int sum = a + b + c;

    if (sum == 180) {
      System.out.println("The angles can form a triangle.");
    } else {
      System.out.println("The angles cannot form a triangle.");
    }

    in.close();
  }

  /**
   * Find if two angles form special pairs that sum to 90 or 180.
   */
  public static void ifAndBoolExprAnglePair() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter angle 1: ");
    int a = in.nextInt();

    System.out.print("Enter angle 2: ");
    int b = in.nextInt();

    int sum = a + b;

    if (sum == 90 || sum == 180 /* || sum == 360 */) {
      System.out.println("The angles form special angle pairs.");
    } else {
      System.out.println("The angles do not form special angle pairs.");
    }

    in.close();
  }

  /**
   * Find if three sides can form a triangle.
   */
  public static void ifAndBoolExprTriangleInequality() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter side A: ");
    int a = in.nextInt();

    System.out.print("Enter side B: ");
    int b = in.nextInt();

    System.out.print("Enter side C: ");
    int c = in.nextInt();

    int ab = a + b;
    int bc = b + c;
    int ca = c + a;

    if (ab > c && bc > a && ca > b) {
      System.out.println("The sides can form a triangle.");
    } else {
      System.out.println("The sides cannot form a triangle.");
    }

    in.close();
  }

  /**
   * Find the season (Summer, Winter, Spring, Autumn) based on a month number.
   */
  public static void ifAndBoolExprSeason() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter month: ");
    int m = in.nextInt();

    String season;

    // Alternative Process 1:
    // if (m == 3 || m == 4 || m == 5) {
    // season = "Spring";
    // } else if (m == 6 || m == 7 || m == 8) {
    // season = "Summer";
    // } else if (m == 9 || m == 10 || m == 11) {
    // season = "Autumn";
    // } else if (m == 12 || m == 1 || m == 2) {
    // season = "Winter";
    // } else {
    // season = "Unknown";
    // }

    if (m >= 3 && m <= 5) {
      season = "Spring";
    } else if (m >= 6 && m <= 8) {
      season = "Summer";
    } else if (m >= 9 && m <= 11) {
      season = "Autumn";
    } else if (m == 12 || m == 1 || m == 2) {
      season = "Winter";
    } else {
      season = "Unknown";
    }

    System.out.println("The season is: " + season);

    in.close();
  }

  /**
   * Find if a coordinate lies in x-axis, y-axis, origin, or in a quadrant.
   */
  public static void ifAndBoolExprPointOrigin() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter x coordinate: ");
    int x = in.nextInt();

    System.out.print("Enter y coordinate: ");
    int y = in.nextInt();

    // Slow Process 1:
    // if (x == 0 && y == 0) {
    // System.out.println("Point is at origin.");
    // } else if (x == 0 && y != 0) {
    // System.out.println("Point is in x-axis");
    // } else if (x != 0 && y == 0) {
    // System.out.println("Point is in y-axis");
    // } else {
    // System.out.println("Point is in one of the quadrant.");
    // }

    if (x == 0 && y == 0) {
      System.out.println("Point is at origin.");
    } else if (x == 0) {
      System.out.println("Point is in x-axis");
    } else if (y == 0) {
      System.out.println("Point is in y-axis");
    } else {
      System.out.println("Point is in one of the quadrant.");
    }

    in.close();
  }

  /**
   * Find the quadrant of a coordinate.
   */
  public static void ifAndBoolExprPointQuadrant() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter x coordinate: ");
    int x = in.nextInt();

    System.out.print("Enter y coordinate: ");
    int y = in.nextInt();

    // Slow Process 1:
    // if (x == 0 && y == 0) {
    // System.out.println("Point is at origin.");
    // } else if (x == 0) {
    // System.out.println("Point is in x-axis");
    // } else if (y == 0) {
    // System.out.println("Point is in y-axis");
    // } else if (x > 0 && y > 0) {
    // System.out.println("Point is in 1st quadrant.");
    // } else if (x < 0 && y > 0) {
    // System.out.println("Point is in 2nd quadrant.");
    // } else if (x < 0 && y < 0) {
    // System.out.println("Point is in 3rd quadrant.");
    // } else if (x > 0 && y < 0) {
    // System.out.println("Point is in 4th quadrant.");
    // }

    if (x == 0 && y == 0) {
      System.out.println("Point is at origin.");
    } else if (x == 0) {
      System.out.println("Point is in x-axis");
    } else if (y == 0) {
      System.out.println("Point is in y-axis");
    } else {
      if (y > 0) {
        if (x > 0) {
          System.out.println("Point is in 1st quadrant.");
        } else {
          System.out.println("Point is in 2nd quadrant.");
        }
      } else {
        if (x < 0) {
          System.out.println("Point is in 3rd quadrant.");
        } else {
          System.out.println("Point is in 4th quadrant.");
        }
      }
    }

    in.close();
  }

  /**
   * Find if a year is leap year or not.
   */
  public static void ifAndBoolExprLeapYear() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter year: ");
    int year = in.nextInt();

    // Error Process 1:
    // if (year % 4 == 0) {
    // System.out.println("Leap Year");
    // }

    if (year % 100 != 0 && year % 4 == 0) {
      System.out.println("Leap Year");
    } else if (year % 100 == 0 && year % 400 == 0) {
      System.out.println("Leap Year");
    } else {
      System.out.println("Common Year");
    }

    // Alternative Process 1:
    // if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
    // System.out.println("Leap Year");
    // } else {
    // System.out.println("Common Year");
    // }

    in.close();
  }

  /**
   * Concept:
   * - How to print 0 to 9?
   *
   * Exercise:
   * - Print 0 to 99.
   */
  public static void whileIterA() {
    System.out.println(0);
    System.out.println(1);
    System.out.println(2);
    System.out.println(3);
    System.out.println(4);
    System.out.println(5);
    System.out.println(6);
    System.out.println(7);
    System.out.println(8);
    System.out.println(9);
  }

  /**
   * Concept:
   * - How to execute statements repeatedly?
   * - What is a loop variable?
   * - What is initialization, condition, and step value in loop?
   *
   * Exercise:
   * - Print 1 to n.
   */
  public static void whileIterB() {
    int i = 0;
    while (i <= 99) {
      System.out.println(i);
      i = i + 1;
    }

    System.out.println("Thank you.");
  }

  /**
   * Concept:
   * - How to execute statements repeatedly based on input?
   *
   * Exercise:
   * - Print n to 1.
   */
  public static void whileIterC() {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter range: ");
    int n = in.nextInt();

    int i = 1;
    while (i <= n) {
      System.out.println(i);
      i = i + 1;
    }

    System.out.println("Thank you.");
    in.close();
  }

  /**
   * Concept:
   * - How to execute statements repeatedly by reducing loop variable?
   * - What is incrementing loop?
   * - What is decrementing loop?
   *
   * Exercise:
   * - Print n to 1.
   */
  public static void whileIterD() {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter range: ");
    int n = in.nextInt();

    int i = n;
    while (i >= 1) {
      System.out.println(i);
      i = i - 1;
    }

    System.out.println("Thank you.");
    in.close();
  }

  /**
   * Concept:
   * - How to execute statements infinite times?
   *
   * Exercise:
   * - Print all odd numbers from 1 to n.
   */
  public static void whileIterE() {
    int i = 0;
    while (true) {
      System.out.println(i);
      i = i + 1;
    }

    // Error Statements:
    // System.out.println("Thank you.");
  }

  /**
   * Concept:
   * - How to use any amount of step value in loop?
   *
   * Exercise:
   * - Print all multiples of 5 from 0 to 60.
   */
  public static void whileIterF() {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter range: ");
    int n = in.nextInt();

    int i = 1;
    while (i <= n) {
      System.out.println(i);
      i = i + 2;
    }

    System.out.println("Thank you.");
    in.close();
  }

  /**
   * Print the powers of 2 upto 1024.
   */
  public static void whileIterPowersOf2() {
    Scanner in = new Scanner(System.in);

    int i = 2;
    while (i <= 1024) {
      System.out.println(i);
      i = i * 2;
    }

    in.close();
  }

  /**
   * Print the powers of 2 upto 2^20.
   */
  public static void whileIterPowerOf2Table() {
    Scanner in = new Scanner(System.in);

    int i = 2;
    int j = 2;
    while (i <= 20) {
      System.out.println("2 ^ " + i + " = " + j);
      i = i + 2;
      j = j * 2;
    }

    // Slow Process 1:
    // int i = 2;
    // while (i <= 20) {
    // double p = Math.pow(2, i);
    // System.out.println("2 ^ " + i + " = " + p);
    // i = i + 2;
    // }

    in.close();
  }
}
