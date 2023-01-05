package library;

public final class Design {
  private Design() {
  }

  /*
   * 1 2 3 4
   * 1 2 3 4
   * 1 2 3 4
   * 1 2 3 4
   */
  public static void print_q_fii_ph(int lines) {
    for (int v = 1; v <= lines; v++) {
      for (int h = 1; h <= lines; h++) {
        System.out.print(h + " ");
      }
      System.out.println();
    }
  }

  /*
   * 1 1 1 1
   * 2 2 2 2
   * 3 3 3 3
   * 4 4 4 4
   */
  public static void print_q_fii_pv(int lines) {
    for (int v = 1; v <= lines; v++) {
      for (int h = 1; h <= lines; h++) {
        System.out.print(v + " ");
      }
      System.out.println();
    }
  }

  /*
   * 4 3 2 1
   * 4 3 2 1
   * 4 3 2 1
   * 4 3 2 1
   */
  public static void print_q_fid_ph(int lines) {
    for (int v = 1; v <= lines; v++) {
      for (int h = lines; h >= 1; h--) {
        System.out.print(h + " ");
      }
      System.out.println();
    }
  }

  /*
   * 4 4 4 4
   * 3 3 3 3
   * 2 2 2 2
   * 1 1 1 1
   */
  public static void print_q_fdi_pv(int lines) {
    for (int v = lines; v >= 1; v--) {
      for (int h = 1; h <= lines; h++) {
        System.out.print(v + " ");
      }
      System.out.println();
    }
  }

  /*
   * 1
   * 1 2
   * 1 2 3
   * 1 2 3 4
   */
  public static void print_t_fii_ph(int lines) {
    for (int v = 1; v <= lines; v++) {
      for (int h = 1; h <= v; h++) {
        System.out.print(h + " ");
      }
      System.out.println();
    }
  }

  /*
   * 1
   * 2 2
   * 3 3 3
   * 4 4 4 4
   */
  public static void print_t_fii_pv(int lines) {
    for (int v = 1; v <= lines; v++) {
      for (int h = 1; h <= v; h++) {
        System.out.print(v + " ");
      }
      System.out.println();
    }
  }

  /*
   * 1
   * 2 1
   * 3 2 1
   * 4 3 2 1
   */
  public static void print_t_fid_ph(int lines) {
    for (int v = 1; v <= lines; v++) {
      for (int h = v; h >= 1; h--) {
        System.out.print(h + " ");
      }
      System.out.println();
    }
  }

  /*
   * 4 4 4 4
   * 3 3 3
   * 2 2
   * 1
   */
  public static void print_t_fdi_pv(int lines) {
    for (int v = lines; v >= 1; v--) {
      for (int h = 1; h <= v; h++) {
        System.out.print(v + " ");
      }
      System.out.println();
    }
  }

  /*
   * 1 2 3 4
   * 1 2 3
   * 1 2
   * 1
   */
  public static void print_t_fdi_ph(int lines) {
    for (int v = lines; v >= 1; v--) {
      for (int h = 1; h <= v; h++) {
        System.out.print(h + " ");
      }
      System.out.println();
    }
  }

  /*
   * 4 3 2 1
   * 3 2 1
   * 2 1
   * 1
   */
  public static void print_t_fdd_ph(int lines) {
    for (int v = lines; v >= 1; v--) {
      for (int h = v; h >= 1; h--) {
        System.out.print(h + " ");
      }
      System.out.println();
    }
  }

  /*
   * 4
   * 4 3
   * 4 3 2
   * 4 3 2 1
   */
  public static void print_t_fii_plh(int lines) {
    for (int v = 1; v <= lines; v++) {
      for (int h = 1; h <= v; h++) {
        System.out.print(lines - h + 1 + " ");
      }
      System.out.println();
    }
  }

  /*
   * 4
   * 3 3
   * 2 2 2
   * 1 1 1 1
   */
  public static void print_t_fii_plv(int lines) {
    for (int v = 1; v <= lines; v++) {
      for (int h = 1; h <= v; h++) {
        System.out.print(lines - v + 1 + " ");
      }
      System.out.println();
    }
  }

  /*
   * 4
   * 3 4
   * 2 3 4
   * 1 2 3 4
   */
  public static void print_t_fid_plh(int lines) {
    for (int v = 1; v <= lines; v++) {
      for (int h = v; h >= 1; h--) {
        System.out.print(lines - h + 1 + " ");
      }
      System.out.println();
    }
  }

  /*
   * 1 1 1 1
   * 2 2 2
   * 3 3
   * 4
   */
  public static void print_t_fdi_plv(int lines) {
    for (int v = lines; v >= 1; v--) {
      for (int h = 1; h <= v; h++) {
        System.out.print(lines - v + 1 + " ");
      }
      System.out.println();
    }
  }

  /*
   * 4 3 2 1
   * 4 3 2
   * 4 3
   * 4
   */
  public static void print_t_fdi_plh(int lines) {
    for (int v = lines; v >= 1; v--) {
      for (int h = 1; h <= v; h++) {
        System.out.print(lines - h + 1 + " ");
      }
      System.out.println();
    }
  }

  /*
   * 1 2 3 4
   * 2 3 4
   * 3 4
   * 4
   */
  public static void print_t_fdd_plh(int lines) {
    for (int v = lines; v >= 1; v--) {
      for (int h = v; h >= 1; h--) {
        System.out.print(lines - h + 1 + " ");
      }
      System.out.println();
    }
  }

  /*
   * 1
   * 2 3
   * 4 5 6
   * 7 8 9 10
   * 11 12 13 14 15
   */
  public static void print_t_fii_pk(int lines) {
    int k = 1;
    for (int v = 1; v <= lines; v++) {
      for (int h = 1; h <= v; h++, k++) {
        System.out.print(k + " ");
      }
      System.out.println();
    }
  }

  public static void print_t_fii_pk2(int lines) {
    long k = 2;
    for (int v = 1; v <= lines; v++) {
      for (int h = 1; h <= v; h++, k *= 2) {
        System.out.print(k + " ");
      }
      System.out.println();
    }
  }

  /*
   * ------1
   * ----2 2
   * --3 3 3
   * 4 4 4 4
   */
  public static void print_t_fiid_pv(int lines) {
    for (int v = 1; v <= lines; v++) {
      for (int s = lines; s > v; s--) {
        System.out.print("  "); // 2 spaces
      }
      for (int h = 1; h <= v; h++) {
        System.out.print(v + " ");
      }
      System.out.println();
    }
  }

  /*
   * 4 4 4 4
   * --3 3 3
   * ----2 2
   * ------1
   */
  public static void print_t_fdii_pv(int lines) {
    for (int v = lines; v >= 1; v--) {
      for (int s = v; s < lines; s++) {
        System.out.print("  "); // 2 spaces
      }
      for (int h = 1; h <= v; h++) {
        System.out.print(v + " ");
      }
      System.out.println();
    }
  }

  /*
   * ------1
   * ----2 2
   * --3 3 3
   * 4 4 4 4
   * --3 3 3
   * ----2 2
   * ------1
   */
  public static void print_t_fx_td(int lines) {
    // Top Half
    for (int v = 1; v <= lines; v++) {
      for (int s = lines; s > v; s--) {
        System.out.print("  "); // 2 spaces
      }
      for (int h = 1; h <= v; h++) {
        System.out.print(v + " ");
      }
      System.out.println();
    }

    // Bottom Half
    lines -= 1;
    for (int v = lines; v >= 1; v--) {
      System.out.print("  ");
      for (int s = v; s < lines; s++) {
        System.out.print("  "); // 2 spaces
      }
      for (int h = 1; h <= v; h++) {
        System.out.print(v + " ");
      }
      System.out.println();
    }
  }

  /*
   * ------1
   * ----2 2 2
   * --3 3 3 3 3
   * 4 4 4 4 4 4 4 4
   */
  public static void print_t_fx_lr(int lines) {
    for (int v = 1; v <= lines; v++) {
      for (int s = lines; s > v; s--) {
        System.out.print("  "); // 2 spaces
      }
      // Left + Right Half
      for (int h = 1; h < v * 2; h++) {
        System.out.print(v + " ");
      }
      System.out.println();
    }
  }

  public static void print_q_fx_tdlr(int lines) {
    // Top Half
    for (int v = 1; v <= lines; v++) {
      for (int s = lines; s > v; s--) {
        System.out.print("  "); // 2 spaces
      }
      // (Left + Right) Top Quarter
      for (int h = 1; h < v * 2; h++) {
        System.out.print(v + " ");
      }
      System.out.println();
    }

    // Bottom Half
    lines -= 1;
    for (int v = lines; v >= 1; v--) {
      System.out.print("  ");
      for (int s = v; s < lines; s++) {
        System.out.print("  "); // 2 spaces
      }
      // (Left + Right) Bottom Quarter
      for (int h = 1; h < v * 2; h++) {
        System.out.print(v + " ");
      }
      System.out.println();
    }
  }

  public static void print_t_fx_ps(String text) {
    int lines = text.length();

    for (int v = 1; v <= lines; v++) {
      for (int h = 1; h <= v; h++) {
        char c = text.charAt(h - 1);
        System.out.print(c + " ");
      }
      System.out.println();
    }
  }
}
