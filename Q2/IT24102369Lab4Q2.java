import java.util.Scanner;

public class IT24102369Lab4Q2 {
 
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter exam marks(out of 100):");
    double examMarks = scanner.nextDouble();

   System.out.print("Please enter lab submission marks(out of 100):");
    double labMarks = scanner.nextDouble();
if(examMarks<0||examMarks>100||labMarks<0||labMarks>100){
System.out.println("Marks should be between 0 and 100.");
return;
}

System.out.print("Enter percentage for exam marks:");
double examPercentage = scanner.nextDouble();
System.out.print("Enter percentage for lab marks:");
double labPercentage = scanner.nextDouble();

if(examPercentage + labPercentage !=100){
System.out.println("The total percentage should add up to 100.");
return;
}
double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);
System.out.println("The final mark is:" + finalMark);
scanner.close();
   }
}
    
    
    
     

   

    
