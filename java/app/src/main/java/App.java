import library.RecreationalMath;

public class App {
  public static void main(String[] args) {
    var x = RecreationalMath.maxFrequentDigit(1124000033);
    System.out.println(x);
  }
}

class Rectangle {
  private double length;
  private double breadth;

  Rectangle(double length, double breadth) {
    setLength(length);
    setBreadth(breadth);
  }

  double getLength() {
    return length;
  }

  double getBreadth() {
    return breadth;
  }

  void setLength(double length) {
    if (length <= 0)
      throw new IllegalArgumentException("Length must be greater than 0.");

    this.length = length;
  }

  void setBreadth(double breadth) {
    if (breadth <= 0)
      throw new IllegalArgumentException("Breadth must be greater than 0.");

    this.breadth = breadth;
  }

  double area() {
    return length * breadth;
  }

  double perimeter() {
    return 2 * (length + breadth);
  }
}
