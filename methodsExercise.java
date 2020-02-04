public class methodsExercise {
  public static void main(String[] args) {
    double a = 2.1, b = -3.4, c = -10.221;
    double min = minimum(a, b, c);
    System.out.println(min);
  }
  
  public static double minimum(double a, double b, double c) {
    double m = 0;
    if (a < b && a < c) {
      m = a;
    } else if (b < a && b < c) {
      m = b;
    } else {
      m = c;
    }
    return m;
  }
}