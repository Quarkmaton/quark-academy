package library;

import java.util.Scanner;

public final class MenuBasedInterest {
  private MenuBasedInterest() {
  }

  public static void showMenu() {
    Scanner in = new Scanner(System.in);
    int choice = 0;

    do {
      // Display menu.
      System.out.println("1. Simple Interest");
      System.out.println("2. Compound Interest");
      System.out.println("3. Exit");
      choice = in.nextInt();

      switch (choice) {
        case 1:
          simpleInterest();
          break;
        case 2:
          compoundInterest();
          break;
        case 3:
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

  private static void simpleInterest() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter P: ");
    double p = in.nextInt();
    System.out.print("Enter R: ");
    double r = in.nextInt();
    System.out.print("Enter T: ");
    double t = in.nextInt();

    double si = (p * r * t) / 100;

    System.out.print("Interest:\t" + si);

    in.close();
  }

  private static void compoundInterest() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter P: ");
    double p = in.nextInt();
    System.out.print("Enter R: ");
    double r = in.nextInt();
    System.out.print("Enter T: ");
    double t = in.nextInt();

    double ci = p * Math.pow(1 + r / 100, t);

    System.out.print("Interest:\t" + ci);

    in.close();
  }
}
