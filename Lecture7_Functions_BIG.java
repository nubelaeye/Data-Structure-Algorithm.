public class Lecture7_Functions_Big{


    // Lucklily, this file has more function than the normal statement..Just Kidding..

    // Question number first..

    public static int printSum(int a, int b){

        int sum = a+b;
        return sum;

    }

    // Question number second..
    
    public static int product(int a, int b){

        int product = (a*b);
        return product;

    } 

    // Question number third..

    public static int factorial(int n){

        int fact = 1;

        for(int i = 1; i<=n ;i++){

            fact = fact * i;
            // System.out.println("The factorial of this number is: "+ fact);

        }
        
        return fact;

    }
    // Question number fourth..

    public static int nCr(int n,int r){

            int factn = factorial(n);
            int factr = factorial(r);
            int both = factorial(n - r);
            int ncr = factn/ (factr * both);

            return ncr;
        
        }
    //      Here start's the Function Overloading... It almost depends upon the parameters
    //                                  of Functions..    
    // First Function with the name of calculate..
    public static int caluculate(int a, int b){

        return a+b;
    
    }

    // Second class with the same Function name..

    public static int caluculate(int a, int b, int c){

        return a+b+c;
    
    }

    public static void printEnter(){

        System.out.print("\n");
    
    }
    
    // Question number fifth..

    public static boolean checkPrime(int n){

        boolean isPrime = true;

        for(int i = 2;i<n;i++){

            if(n%i==0){

                isPrime = false;
                break;

            }

        }

        return isPrime;

    }

    // Question number sixth..
    // Here's goes the award of guiness world of record..
    // Nice best function ever;

    public static int BinToDec(int Binary){

        int pow = 0;
        int dec = 0;

        for(; Binary>0;){

            int lastdigit = Binary%10;
            dec = dec + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            Binary = Binary/10;

        }

        System.out.println("The Decimal of this number is: " + dec);
        return dec;

    }

    // Question number seventh..
    
    public static int numPrime(int n){

        for(int i = 2;i<n;i++){

            if(checkPrime(i)){

                System.out.println(i+" , ");

            }

        }

        return n;

    }

    // Question number eighth..

    public static void DecToBin(int n){
        int pw = 0;
        int binNum = 0;
        
        for(; n>0;){

            int rem = n%2;
            binNum = binNum + (rem * (int) Math.pow(10, pw));
            pw++;
            n = n/2;

        }

        System.out.println("The binary representation of this number is: "+binNum);

        // return binNum;
    }



    public static void main(String[] args) {

        int a = 10;
        int b = 100;
        int c = 50;

        printEnter();

        int sum = printSum(a, b);
        System.out.println("Here, printing the sum of two numbers of a and b..");
        
        System.out.println(sum);

        printEnter();
        int product = product(a, b);

        printEnter();
        System.out.println(product);

        printEnter();
        int n = 5;

        int fact = factorial(n);
        System.out.println("Printing factorial of a number: ");

        printEnter();
        System.out.println(fact);
    
        printEnter();
        System.out.println("Printing nCr of a number: ");

        printEnter();
        System.out.println(nCr(5,2)); 

        printEnter();
        System.out.println("The sum of the number is in Function number 1. : ");

        printEnter();
        System.out.println(caluculate(a, b));

        printEnter();
        System.out.println("The sum of the number is in Function number 2. : ");

        printEnter();
        System.out.println(caluculate(a, b, c));

        printEnter();

        int h = 7;
        boolean isprime = checkPrime(h);

        if(isprime){

            System.out.println("Prime number");

        } 
        else{

            System.out.println("No, sorry you have entered a compsite number");

        }

        printEnter();
        System.out.println("Enter the Binary number to convert in decimal number system: ");

        // This is the most favorite function of mine..

        printEnter();

        int binary = 101;
        BinToDec(binary);

        printEnter();

        int num = 10;
        DecToBin(num);

        printEnter();


        
    }
}
