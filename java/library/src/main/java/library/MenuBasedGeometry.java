package library;

import java.util.Scanner;

public final class MenuBasedGeometry {
  private MenuBasedGeometry() {
  }

  public static void showMenu() {
    Scanner in = new Scanner(System.in);
    int choice = 0;
    do {
      // Display menu.
      System.out.println("1. Square");
      System.out.println("2. Rectangle");
      System.out.println("3. Triangle");
      System.out.println("4. Circle");
      System.out.println("5. Exit");
      choice = in.nextInt();
      switch (choice) {
        case 1:
          square();
          break;
        case 2:
          rectangle();
          break;
        case 3:
          triangle();
          break;
        case 4:
          circle();
          break;
        case 5:
          // Do nothing. We will exit the loop next time.
          break;
        default:
          System.out.println("Invalid choice. Retry.");
          break;
      }
      System.out.println();
    } while (choice != 3);
    in.close();
  }

  private static void square() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter side:\t");
    double s = in.nextInt();

    double p = 4 * s;
    double a = s * s;

    System.out.println("Perimeter:\t" + p);
    System.out.println("Area:\t" + a);
    System.out.println();

    in.close();
  }

  private static void rectangle() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter length:\t");
    double l = in.nextInt();
    System.out.print("Enter breadth:\t");
    double b = in.nextInt();

    double p = 2 * (l + b);
    double a = l * b;

    System.out.println("Perimeter:\t" + p);
    System.out.println("Area:\t" + a);
    System.out.println();

    in.close();
  }

  private static void triangle() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter side 1:\t");
    double x = in.nextInt();
    System.out.print("Enter side 2:\t");
    double y = in.nextInt();
    System.out.print("Enter side 3:\t");
    double z = in.nextInt();

    double p = x + y + z;
    double s = p / 2;
    double a = Math.sqrt(s * (s - x) * (s - y) * (s - z));

    System.out.println("Perimeter:\t" + p);
    System.out.println("Area:\t" + a);
    System.out.println();

    in.close();
  }

  private static void circle() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter radius:\t");
    double r = in.nextInt();

    double p = 2 * Math.PI * r;
    double a = Math.PI * r * r;

    System.out.println("Perimeter:\t" + p);
    System.out.println("Area:\t" + a);
    System.out.println();

    in.close();
  }
}
