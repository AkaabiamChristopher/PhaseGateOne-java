import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("How many student do you hava?: ");
      int numberofstudent = scanner.nextInt();

    System.out.print("how many subject do they offer?: ");
      int numberofsubject = scanner.nextInt();

    System.out.println("saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\nsaved successfully");

     int[][] scores = new int[numberofstudent][numberofsubject];

     for (int count = 0; count < numberofstudent; count++) {
        System.out.println("Enter scores for student " + (count + 1) + ":");
           for (int i = 0; i < numberofsubject; i++) {
             while (true) {
             System.out.print("Subject " + (i + 1) + ": ");
               int score = scanner.nextInt();
                 if (score >= 0 && score <= 100) {
                   scores[count][i] = score;
        	     System.out.println("saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\nsaved successfully");
		break;

                    } else {
                        System.out.println("Scores must be between 0 and 100. Enter again.");
                    }
                }
            }
        }
        for (int i = 0; i < numberofstudent; i++) {
            System.out.println("student " + (i + 1) + ":");
            for (int j = 0; j < numberofsubject; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }
System.out.println("==========================================================");

System.out.println("STUDENT  SUB1 SUB2 SUB3 TOT AVE POS");

System.out.println("==========================================================");


         }
}

    


