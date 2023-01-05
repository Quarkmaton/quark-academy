package library;

import java.util.Scanner;

public class Examination {
  private String examinationName;

  private double averageMarks;

  private String[] names;

  private double[] marks;

  private char[] grade;

  public Examination(int candidateCount) {
    names = new String[candidateCount];
    marks = new double[candidateCount];
  }

  public void read() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter Examination Name: ");
    examinationName = in.nextLine();

    for (int i = 0; i < names.length; i++) {
      System.out.println("==============================");

      System.out.print("Enter Student " + (i + 1) + ":\t");
      names[i] = in.nextLine();
      System.out.print("Enter Marks   " + (i + 1) + ":\t");
      marks[i] = in.nextDouble();

      System.out.println("==============================");
    }

    in.close();
  }

  public void print() {
    System.out.println("Examination:\t" + examinationName);
    for (int i = 0; i < names.length; i++) {
      System.out.println("==============================");
      System.out.println("Student " + (i + 1) + ":\t" + names[i]);
      System.out.println("Marks   " + (i + 1) + ":\t" + marks[i]);
      System.out.println("==============================");
    }
    System.out.println("\nAverage:\t" + averageMarks);
  }

  public void compute() {
    double sum = 0;
    for (int i = 0; i < marks.length; i++) {
      grade[i] = getGrade(marks[i]);
      sum += marks[i];
    }
    averageMarks = sum / marks.length;
  }

  public double getMarks(String name) {
    int index = Collection.linearSearch(names, name);
    return marks[index];
  }

  /*
   * -----------------------------
   * | Grade |
   * -----------------------------
   * | Above 84% | S |
   * | 84% - 75% | A |
   * | 74% - 65% | B |
   * | 64% - 55% | C |
   * | 54% - 50% | D |
   * | Below 50% | F |
   * -----------------------------
   */
  public static char getGrade(double marks) {
    char grade;
    if (marks >= 85.0) {
      grade = 'S';
    } else if (marks >= 75.0) {
      grade = 'A';
    } else if (marks >= 65.0) {
      grade = 'B';
    } else if (marks >= 55.0) {
      grade = 'C';
    } else if (marks >= 50.0) {
      grade = 'D';
    } else {
      grade = 'F';
    }

    return grade;
  }
}
