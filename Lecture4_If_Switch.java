import java.util.*;
public class Lecture4_If_else_SwitchCase {
    public static void main(String[] args) {
        try (//                          Question number 1.Can you drive or not..
        Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            
            if(age>18){
                
                System.out.println("Oh sorry but here the rules are different fromt other countries that you can't drinve here.. :] ");
            
            }
            else if(age<=18){
               
                System.out.println("You are the one who can drive a plain or a jet. Have a Happy Day.. :) ");
            
            }
            //                         Question number 2. Print the number is odd or even.
            System.out.println("Enter the numeber: ");
            int num = sc.nextInt();

            if(num%2==0){

                System.out.println("Even number");
            
            }
            else if(age<=18){

                System.out.println("Odd number");
            
            }

            //                         Question number 3. print the tax.
            System.out.println("Enter your income per annum: ");
            int income = sc.nextInt();

            if(income<500000){
                
                System.out.println("Ok you are lucky that no income tax on you..");
            
            }
            else if(income>500000 && income<1000000){
                
                System.out.println("You have to pay your 20% of income to the government.");
            
            }
            else{

                System.out.println("You have to pay your 30% of income to the government.");
            
            }

            //                         Question number 4. Largest number of 3 numbers.

            System.out.println("Enter the first number: ");
            int a = sc.nextInt();

            System.out.println("Enter the second number: ");
            int b = sc.nextInt();

            System.out.println("Enter the third number: ");
            int c = sc.nextInt();
            
            if(a>b&&a>c){

                System.out.println("The largest number is a: "+a);
            
            }
            else if(b>a&&b>c){

                System.out.println("The largest number is b: "+b);
            
            }
            else {

                System.out.println("The larges number is c: "+c);
            
            }
            
            // Ternary operator..

            System.out.println("Enter the number: ");
            int marks = sc.nextInt();

            String status = (marks>=35) ? "Pass":"Fail";
            System.out.println(status);

            // Switch case..

            System.out.println("Enter the number: ");
            int number = sc.nextInt();
            switch(number){

                case 1: 
                    System.out.println("Jalebi");
                    break;

                case 2: 
                    System.out.println("Pizza");
                    break;

                case 3:
                    System.out.println("Burger");
                    break;

                case 4: 
                    System.out.println("somosa");
                    break;

                default: 
                    System.out.println("Default: Coca cola");
                    break;

            }

            System.out.println("Enter the operator +, -, *, /, % : ");
            char ch = sc.next().charAt(0);

            System.out.println("Enter the first number: ");
            int num1 = sc.nextInt();

            System.out.println("Enter the second number: ");
            int num2 = sc.nextInt();

            if(ch=='+'){

                System.out.println("The answer is: ");
                System.out.println(num1+num2);

            }

            else if(ch=='-'){

                System.out.print("The answer is: ");
                System.out.println(num1 - num2);

            }

            else if(ch=='*'){

                System.out.println("The answer is: ");
                System.out.println(num1*num2);

            }

            else if(ch=='/'){

                System.out.println("The answer is: ");
                System.out.println(num1/num2);

            }

            else if(ch=='%'){

                System.out.println("The answer is: ");
                System.out.println(num1%num2);

            }

            else{
                System.out.println("Wrong input");
            }
            
        }

    }

}
