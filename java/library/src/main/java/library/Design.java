package library;

// CHECKSTYLE:OFF

public final class Design {
  private Design() {
  }

  /*
   * 1 2 3 4
   * 1 2 3 4
   * 1 2 3 4
   * 1 2 3 4
   */
  public static void sqr_incV_incH_prnH(int lines) {
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
  public static void sqr_incV_incH_prnV(int lines) {
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
  public static void sqr_incV_decH_prnH(int lines) {
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
  public static void sqr_decV_incH_prnV(int lines) {
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
  public static void trn_incV_incH_prnH(int lines) {
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
  public static void trn_incV_incH_prnV(int lines) {
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
  public static void trn_incV_decH_prnH(int lines) {
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
  public static void trn_decV_incH_prnV(int lines) {
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
  public static void trn_decV_incH_prnH(int lines) {
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
  public static void trn_decV_decH_prnH(int lines) {
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
  public static void trn_incV_incH_prnLH(int lines) {
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
  public static void trn_incV_incH_prnLV(int lines) {
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
  public static void trn_incV_decH_prnLHH(int lines) {
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
  public static void trn_decV_incH_prnLV(int lines) {
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
  public static void trn_decV_incH_prnLH(int lines) {
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
  public static void trn_decV_decH_prnLH(int lines) {
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
  public static void trn_incV_incH_prnK(int lines) {
    int k = 1;
    for (int v = 1; v <= lines; v++) {
      for (int h = 1; h <= v; h++, k++) {
        System.out.print(k + " ");
      }
      System.out.println();
    }
  }

  /*
   * 2
   * 4 8
   * 16 32 64
   * 128 256 512 1024
   * 2048 4096 8192 16384 32768
   */
  public static void trn_incV_incH_prnK2(int lines) {
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
  public static void trn_incV_incH_decS_prnV(int lines) {
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
  public static void trn_decV_incH_incS_prnV(int lines) {
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
  public static void rgh_top_btm_trn(int lines) {
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
  public static void lft_rgh_top_trn(int lines) {
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

  /*
   * --------1
   * ------2 2 2
   * ----3 3 3 3 3
   * --4 4 4 4 4 4 4
   * 5 5 5 5 5 5 5 5 5
   * --4 4 4 4 4 4 4
   * ----3 3 3 3 3
   * ------2 2 2
   * --------1
   */
  public static void lft_rgh_top_btm_trn(int lines) {
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

  /*
   * R
   * R E
   * R E P
   * R E P U
   * R E P U B
   * R E P U B L
   * R E P U B L I
   * R E P U B L I C
   */
  public static void lft_str_trn(String text) {
    int lines = text.length();

    for (int v = 1; v <= lines; v++) {
      for (int h = 1; h <= v; h++) {
        char c = text.charAt(h - 1);
        System.out.print(c + " ");
      }
      System.out.println();
    }
  }

  /*
   * 1 2 3 4
   * 1 --- 4
   * 1 --- 4
   * 1 2 3 4
   */
  public static void incBorder_sqr(int lines) {
    for (int v = 1; v <= lines; v++) {
      for (int h = 1; h <= lines; h++) {
        if ((v > 1 && h > 1) && (v < lines && h < lines)) // (2, 2) - (3, 3)
          System.out.print("  ");
        else
          System.out.print(h + " ");
      }
      System.out.println();
    }
  }

  /*
   * 1 2 3 4
   * 2 --- 3
   * 3 --- 2
   * 4 3 2 1
   */
  public static void cylBorder_sqr(int lines) {
    int l = 1;
    int r = lines;
    int t = l + 1;
    int b = r - 1;

    for (int v = 1; v <= lines; v++) {
      for (int h = 1; h <= lines; h++) {
        if (h == 1)
          System.out.print(l++ + " ");
        else if (h == lines)
          System.out.print(r-- + " ");
        else if (v == 1)
          System.out.print(t++ + " ");
        else if (v == lines)
          System.out.print(b-- + " ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
  }
}

// CHECKSTYLE:ON
