package library;

public class Slab {
  /*
   * <=025 Units -> 518
   * + 035 Units -> 569
   * + 040 Units -> 670
   * + 050 Units -> 745
   * + 050 Units -> 762
   * + 100 Units -> 762
   * >=300 Units -> 921
   */
  public static int electricityBill(int unit) {
    return 0;
  }

  /*
   * Income Tax:
   * ₹00.0 - ₹02.5 L -> Nil
   * ₹02.5 - ₹05.0 L -> 05%
   * ₹05.0 - ₹07.5 L -> 10%
   * ₹07.5 - ₹10.0 L -> 15%
   * ₹10.0 - ₹12.5 L -> 20%
   * ₹12.5 - ₹15.0 L -> 25%
   * ₹15.0 - ..... L -> 30%
   */
  public static double incomeTax(long income) {
    double l = income;
    double t = 0;

    // ₹02.5 L - ₹05.0 L -> 05%
    if (l < 5_00_000) {
      t += 0.05 * (l - 2_50_000);
    }

    // ₹05.0 L - ₹07.5 L -> 10%
    else if (l < 7_50_000) {
      t += 0.05 * 2_50_000;
      t += 0.10 * (l - 5_00_000);
    }

    // ₹07.5 L - ₹10.0 L -> 15%
    else if (l < 10_00_000) {
      t += 0.05 * 2_50_000;
      t += 0.10 * 2_50_000;
      t += 0.15 * (l - 7_50_000);
    }

    // ₹10.0 L - ₹12.5 L -> 20%
    else if (l < 12_50_000) {
      t += 0.05 * 2_50_000;
      t += 0.10 * 2_50_000;
      t += 0.15 * 2_50_000;
      t += 0.20 * (l - 10_00_000);
    }

    // ₹12.5 L - ₹15.0 L -> 25%
    else if (l < 15_00_000) {
      t += 2_50_000 * (0.05 + 0.10 + 0.15 + 0.20);
      t += 0.25 * (l - 12_50_000);
    }

    // ₹15.0 L - ..... L -> 30%
    else {
      t += 2_50_000 * 0.75;
      t += 0.30 * (l - 15_00_000);
    }

    return t;
  }

  /*
   * Category A -> 00.25%
   * Category B -> 03.00%
   * Category C -> 05.00%
   * Category D -> 12.00%
   * Category E -> 18.00%
   * Category F -> 28.00%
   */
  public static double goodsAndServicesTax(char category, long price) {
    double t = 0;
    switch (category) {
      case 'A':
        t = price * 0.0025;
        break;
      case 'B':
        t = price * 0.0300;
        break;
      case 'C':
        t = price * 0.0500;
        break;
      case 'D':
        t = price * 0.1200;
        break;
      case 'E':
        t = price * 0.1800;
        break;
      case 'F':
        t = price * 0.2800;
        break;
    }

    return t;
  }
}
