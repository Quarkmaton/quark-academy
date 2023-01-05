package library;

public class Quadratic {
  public int a;

  public int b;

  public int c;

  public int getDiscriminant() {
    return (b * b) - (4 * a * c);
  }

  public double[] getRoots() {
    int d = getDiscriminant();
    double[] roots;
    if (d < 0) {
      // No real root is available.
      roots = new double[0];
    } else if (d == 0) {
      roots = new double[1];
      roots[0] = -b / (2.0 * a);
    } else {
      // Two real roots are available.
      roots = new double[2];
      double dRoot = Math.sqrt(d);
      double twoA = 2.0 * a;

      // Positive Root.
      roots[0] = (-b + dRoot) / twoA;

      // Negative Root.
      roots[1] = (-b - dRoot) / twoA;
    }

    return roots;
  }
}
