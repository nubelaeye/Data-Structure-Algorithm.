public class Lecture15_Recursion {

    // First program of Recursion..
    // 1. Printing numbers from n to 1(decreasing order)..

    public static void printNDec(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printNDec(n-1);
    }

    // 2. Printing numbers from 1 to n(increasing order)..

    public static void printNInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printNInc(n-1);         
        System.out.print(n+" ");
    }

    // 3. Print the factorial number..

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }


    // 4. Print the Sum n natural number..

    public static int Sum(int n){
        if(n==0){
            return 0;
        }
        int fimc = Sum(n-1);
        int fn = n += Sum(n-1);
        System.out.println(fimc);
        return fn;
    }

    // 5. Printing the Fibonacci Series..

    public static int Fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;   
        }
        int fibonMinusOne = Fibonacci(n-1);
        int fibonMinusTwo = Fibonacci(n-2);
        int fibo = fibonMinusOne+fibonMinusTwo;
        return fibo;
    }

    // 6.Check the array is sorted or not..

    public static boolean Check(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        return Check(arr,i+1);
    }

    // 7. Find the First Occurence of a number..

    public static int FirstOccur(int arr[],int key, int i){
        if(i==arr.length){
            return -1;
        }
        else if(arr[i]==key){
            return i;
        }
        return FirstOccur(arr, key, i+1);    
    }

    // 8. Find the Last Occurence of a number..

    public static int LastOccur(int arr[],int key, int i){
        if(i==arr.length){
            return -1;
        }

        int is = LastOccur(arr, key, i+1);
        
        if(arr[i]==key && is==-1){
            return i;
        }
        return is;

    }

    // 9. Take the power of a number..

    public static int Power(int n,int m){// Time: O(n)
        if(m==0)
            return 1;
        // Recursive call..
        return n * Power(n, m-1);
    }

    // 10. Take the power of a number..

    public static int OptimizedPower(int n,int m){//Time: O(log n)
        if(m==0)
            return 1;
        
        int half = OptimizedPower(n*n, m/2*m/2) ;

        if(m%2!=0){
            half = n*half;
        }

        return half;
    }

    // 11. Fixing Tiles...

    public static int FixingTiles(int height){

        if(height == 0 || height == 1 ){
            return 1;
        }

        int vertical = FixingTiles(height-1);
        
        int horizontal = FixingTiles(height-2);

        int ways = vertical+horizontal;

        return ways;
    }

    public static void RemoveDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        } 
        
        // Work on..
        char character = str.charAt(idx);
        // For duplicate of string....
        if(map[character-'a']==true){
            RemoveDuplicate(str, idx+1, newStr, map);
        } else{
            map[character-'a'] = true;
            RemoveDuplicate(str, idx+1, newStr.append(character), map);
        }


    }

    // Pairing Problem...
    public static int Pairing(int n){
        if(n==1 || n==2){
            return n;
        }

        // For single stand
        int fnm1 = Pairing(n-1);
        // For pairing 
        int fnm2 = Pairing(n-2);
        int pair = (n-1)*fnm2;

        // Total 

        int Total = fnm1+pair;
        return Total;
    } 

    public static void main(String[] args) {
        // Hey! We will today start the Recursion Chapter of king's but it is nice to learn it
        // OK then let's start now...

        // Function number 1.

        System.out.println();
        printNDec(10);
        System.out.println();
        System.out.println();

        // Function number 2.
        printNInc(10);
        System.out.println();
        System.out.println();


        // Function number 3.
        System.out.println(fact(5));
        System.out.println();

        // Function number 4.
        System.out.println(Sum(5));
        System.out.println();

        // Function number 5.
        System.out.println(Fibonacci(12));
        System.out.println();

        // Function number 6. 

        int arr[] = {1,2,3,6,5,5,3};
        System.out.println(Check(arr,0));
        System.out.println();
        
        // Function number 7.

        System.out.println(FirstOccur(arr, 5, 0));
        System.out.println();

        // Function number 8.

        System.out.println(LastOccur(arr, 3, 0));
        System.out.println();

        // Function number 9.

        System.out.println(Power(5, 3));
        System.out.println();
    
        // Function number 10.

        System.out.println(OptimizedPower(5, 3));
        System.out.println();

        // Function number 11.

        System.out.println("The number of tiles will be used is: "+FixingTiles(10));
        System.out.println();

        // Function number 11.

        String string = "apnacollege";
        RemoveDuplicate(string, 0, new StringBuilder(""), new boolean[26]);
        System.out.println();
        
        // Function number 12.

        int n = 10;
        System.out.println(Pairing(n));
        System.out.println();


    }
}

