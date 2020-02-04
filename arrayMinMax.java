public class arrayMinMax {
  public static void main(String[] args) {
   
    double[] list = {1.0, 7.1, -22.0002, 332.8, -10.999, 0.0, 3.14};
    
    double min = list[0];
    double max = list[0];
    
    System.out.println("Loading array with " + list.length + " stored numbers.");
    
    for (int i=0; i<list.length; i++) {
      System.out.println("@ " + (i+1) + " = " + list[i]);
      min = Math.min(min,list[i]);
      max = Math.max(max,list[i]);
    }
    
    System.out.println("\nSmallest value: " + min);
    System.out.println("Biggest value: " + max);
    
  }
}