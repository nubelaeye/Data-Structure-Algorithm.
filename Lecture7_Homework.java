import java.util.*;

public class Lecture7_Homework {
    // Homework number 1.

    public static int Average(int a, int b,int c){
        int avg = (a+b+c)/3;
        return avg;
    }

    // Homework number 2.

    public static boolean isEven(int n){
        boolean number = true;
        if(n%2==0){
            number = true;
        }
        else{
            number = false;
        }
        return number;
    }

    // Homework number 3. I was not knowing this one..

    public static boolean isPalindrome(int number){
        int palindrome = number; 
        // copied number into variable  
        int reverse = 0; 
        while(palindrome!=0){
            int remainder = palindrome%10;
            reverse = reverse*10 + remainder;
            palindrome = palindrome / 10;
        }
        if(number==reverse){
            return true;
        }
        else{
            return false;
        }
    }

    // Homework number 5.
    public static int Sum(int n){
        int sum = 0;
        for(int i = 0;i<=n;i++){
            sum = sum+i;
        }
        System.out.println("The total sum is: "+sum);
        return sum;
    }

    public static void main(String[] args) {
        try (
        Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the first number: ");
            int a = sc.nextInt();

            System.out.println("Enter the second number: ");
            int b = sc.nextInt();

            System.out.println("Enter the third number: ");
            int c = sc.nextInt();

            System.out.println("The avg of these numbers is: "+ Average(a, b, c));

            System.out.println("Enter the number: ");
            int n = sc.nextInt();

            boolean ans = isEven(n);

            if(ans == true){

                System.out.println("The input is even..");
            }

            else{

                System.out.println("The input is odd..");
            
            }

            int number = 5;
            Sum(number);

        }
    }
}
