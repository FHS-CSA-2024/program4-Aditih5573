//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first three digit number: ");
        int number1 = input.nextInt();
        System.out.println("Enter the second three digit number: ");
        int number2 = input.nextInt();
        System.out.println("Enter the third three digit number: ");
        int number3 = input.nextInt();
        System.out.println("Enter the fourth three digit number: ");
        int number4 = input.nextInt();
        
        int sum = number1 + number2 + number3 + number4;
        
        double average = (double)sum/4;
        
        System.out.println("The sum of the four numbers is " + sum);
        System.out.println(" ");
        System.out.println("The average of the four numbers is " + average);
    }
}




//Paste console output below:
/*
Enter the first three digit number: 
475
Enter the second three digit number: 
821
Enter the third three digit number: 
369
Enter the fourth three digit number: 
562
The sum of the four numbers is 2227
 
The average of the four numbers is 556.75

*/
