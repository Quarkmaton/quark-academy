package library;

import java.util.Scanner;

public final class Menu {
  private Menu() {
  }

  public static void showMenu() {
    Scanner in = new Scanner(System.in);
    int choice = 0;
    do {
      // Display menu.
      System.out.println("1. Option A");
      System.out.println("2. Option B");
      System.out.println("3. Exit");
      choice = in.nextInt();
      switch (choice) {
        case 1:
          // Perform task A and display the result.
          taskA();
          break;
        case 2:
          // Perform task B and display the result.
          taskB();
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

  private static void taskA() {
    System.out.print("Option A was selected. Task A will be performed.");
  }

  private static void taskB() {
    System.out.print("Option B was selected. Task B will be performed.");
  }
}
