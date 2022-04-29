import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter the amount of summative assignment's you've had so far this semester:");
    double totalSummatives = scan.nextDouble();
    System.out.println("Enter the amount of formative assignment's you've had so far this semester:");
    double totalFormatives = scan.nextDouble();
    System.out.println("Enter the amount of summative points you have so far this semester:");
    double summativePoints = scan.nextDouble();
    System.out.println("Enter the amount of formative points you have so far this semester:");
    double formativePoints = scan.nextDouble();
    totalSummatives = totalSummatives * 100;
    totalFormatives = totalFormatives * 100;
    System.out.println("Enter your first semester average:");
    double firstSem = scan.nextDouble();
    double goal = 179-firstSem;
    double grade = goal- (25*(formativePoints/totalFormatives));
    grade = grade/75;
    grade = grade*(totalSummatives+200);
    grade = grade-summativePoints;
    grade = grade/2;
    System.out.println("You need to get a " + grade + "% on your final to have an A in the class!");
  }
}