import java.util.*;

public class Shapes {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter 1 for rectangle calculation and 2 for square: ");
    int choice = input.nextInt();
    if (choice == 1) {
      System.out.print("Enter the length: ");
      double length = input.nextDouble();
      System.out.print("Enter the width: ");
      double width = input.nextDouble();
      rectangle(length, width);
    } else {
      System.out.print("Enter the side: ");
      double side = input.nextDouble();
      square(side);
    }

  }

  /*
   * N: square P: to calculate the area of any square I: a side measure (double)
   * R:
   */
  public static void square(double s) {
    // side times side
    double a = s * s;

    // generate some output
    System.out.println("A square with side " + s + " has an area of " + a);
  }// close square method

  public static void rectangle(double x, double y) {
    // side times side
    double a = x * y;

    // generate some output
    System.out.println("A rectangle with length " + x + " and width " + y + " has an area of " + a);
  }// close rectangle method
}
