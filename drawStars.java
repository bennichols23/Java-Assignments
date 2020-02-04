public class drawStars {
  public static void main(String[] args) {
    int len = 6;
    
    for (int a=0; a<6; a++) {
      for (int b=len-1; b<a; b++) {
        System.out.print(stars(a, " "));
      }
      System.out.println(stars(a, "*"));
    }
  }

  public static String stars(int n, String m) {
    String draw = "";
    for (int i=0; i<n; i++) {
      draw = draw + m;
    }
    return draw;
  }
}