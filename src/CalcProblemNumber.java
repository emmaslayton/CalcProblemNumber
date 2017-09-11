/** "CalcProblemANumber."
 *
 *  @author Emma Slayton
 *  Created: 9/3/17
 *  Last updated: 9/10/17
 *
 *  Project 1; CSC201-004N
 *  Unit 1 Programming Problems Worksheet, Problem 2.
 *
 */

import java.util.Scanner;

public class CalcProblemNumber {
    public static void main(String[] args) {
       /* Create a Scanner */
        Scanner input = new Scanner(System.in);

        /* Input Student ID */
        System.out.print("Enter Student ID Number: ");
        int studentID = input.nextInt();

        /* Calculate Which Chapter */
        /*Divide Student ID by 4 then increment remainder by 2 to get chapter number */
        int chapterNumber = studentID % 4 + 2;
        int progExerciseNumber;

        switch (chapterNumber){
            case 2: System.out.print("Chapter Number is 2.");
                progExerciseNumber = studentID % 23 + 1;
                System.out.println(" Programming Exercise Number is " + progExerciseNumber +".\n");
                break;

            case 3: System.out.print("Chapter Number is 3.");
                progExerciseNumber = studentID % 34 + 1;
                System.out.println(" Programming Exercise Number is " + progExerciseNumber +".\n");
                break;

            case 4: System.out.print("Chapter Number is 6.");
                progExerciseNumber = studentID % 38 + 1;
                System.out.println(" Programming Exercise Number is " + progExerciseNumber +".\n");
                break;

            case 5: System.out.print("Chapter Number is 5.");
                progExerciseNumber = studentID % 46 + 1;
                System.out.println(" Programming Exercise Number is " + progExerciseNumber +".\n");
                break;

            default: System.out.println("Error: Chapter Number is not 2, 3, 5, or 6");
                progExerciseNumber = 0;
                break;
        }

        /* Prompt User to Enter Page Number from Textbook */
        System.out.println("Enter the page number where the specific problem is located in the textbook: ");
        int pageNumber = input.nextInt();

        /* Display the requirement for the programming exercise */
        System.out.println("\nPlease solve programming exercise " + progExerciseNumber +
                " from chapter " + chapterNumber + ", from page " + pageNumber + "."  );
    }
}

