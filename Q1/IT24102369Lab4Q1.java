import java.util.Scanner;

public class IT24102369Lab4Q1 {
 
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a new number;");
    int number = scanner.nextInt();
    
    if (number > 0){
    System.out.println("Number is Positive.");
    } else if (number < 0){
    System.out.println("Number is Negative.");
    } else {
    System.out.println("Number is Zero.");
    }

  scanner.close();
     }
}
