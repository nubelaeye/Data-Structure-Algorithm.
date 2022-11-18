import java.util.*;
public class Lecture4_HomeWork_QA {
    public static void main(String[] args) {
        
        // Question1: Write a Java program to get a number from the user and print whether it is positive or negative 
        // Question2:
        // Finish the following code so that it prints You have a fever if your temperature is  above 100 and otherwise prints You don't have a fever. 
        // Question3:
        // Write a Java program to input week number (1-7) and print day of week name using switch case.
        // Question 4:
        // What will be the value of x & y in the following program: 
        // Question5:
        // Write a Java program that takes a year from the user and print whether that year is a leap year or not.
        
        // Homework 1.

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number ");
            int num = sc.nextInt();
            String answer = (num>0)?"Possitive":"Negative"; 
            System.out.println(answer);

            // Homework 2.

            System.out.println("Enter the your tempreture: ");
            int tempreture = sc.nextInt();
            String temp = (tempreture>100)?"safe":"died"; 
            System.out.println(temp);

            // Homework 3.
            int n = sc.nextInt();
            switch(n){
                case 1:System.out.println("Monday");
                break;
                case 2:System.out.println("Tuesday");
                break;
                case 3:System.out.println("Wednesday");
                break;
                case 4:System.out.println("Thursday");
                break;
                case 5:System.out.println("Friday");
                break;
                case 6:System.out.println("Saturday");
                break;
                case 7:System.out.println("Sunday");
                break;
                default:System.out.println("Holiday");
                break;
            }

            // Homework 5.
            int input = sc.nextInt();
            if(input%4==0){
                System.out.println("It's a Leap year");
            }
            else if(input%100==0){
                System.out.println("It's a Leap year");
            }
            else if(input%400==0){
                System.out.println("It's a Leap year");
            }
            else{
                System.out.println("It is not a leap year..");
            }
        }
    }
}
