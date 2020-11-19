public class N11 {
    public static void main(String[] args) {

      System.out.println("            Multiplication Table");

      System.out.print("    ");  // Display the number title

      for (int i = 1; i <= 9; i++){
          System.out.print("   " + i);
      }

      System.out.println("\n---------------------------------------------");

      for (int i = 1; i <= 9; i++){
          System.out.print(i + " | ");
          for (int j = 1; j <= 9; j++){
              System.out.printf("%4d", i * j); // until it becomes false, it uses one value of i , then gets
              // then gets second value after next iteration of the i
          }
          System.out.println(); // after one line of j finishes before next iteration of i,  go to the next line
          // the execution is in order , like cycle
      }
    }
}
