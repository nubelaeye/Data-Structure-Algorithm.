import java.util.*;
public class Lecture9_Arrays {


    // Buy and sell stocks...

    public static int BuyAndSellStocks(int arr[]){
        int buy = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            if(buy<arr[i]){
                int profit = arr[i]-buy;
                max = Math.max(max, profit);
            }
            else{
                buy = arr[i];
            }
        }
        return max;
    }

    // Trapping RainWater...

    public static int TrappingRainWater(int number[]){

        int n = number.length;

        int leftMax[] = new int[n];
        leftMax[0] = number[0];
        for(int i = 1; i<n; i++){
            leftMax[i] = Math.max(number[i], leftMax[i-1]);
        }

        int rightMax[] = new int[n];
        rightMax[n-1] = number[n-1];
        for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(number[i], rightMax[i+1]);
        }

        int TrappedWater = 0;

        for(int i = 0; i<n ; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            TrappedWater += waterLevel - number[i];
        }

        return TrappedWater;

        

    }

    // 2. Method.. -> Kadane's Algorithm.. best in efficiency..

    public static void Kadane(int num[]){

        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i =0;i<num.length;i++){
            cs = cs + num[i];
            if(cs < 0){
                cs = 0;
            }

            ms = Math.max(cs, ms);

        }

        System.out.println("The Maximum Sum is: "+ms);
    }


    // 1 Method..-> Brute Force Code...

    public static void MaxSubArray(int arr[]){

        int curr = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){

            int start = i;
            for(int j = i+1; j<arr.length; j++){
                int end = j;
                for(int k = start; k<=end; k++){   
                    curr += arr[k];
                }
                if(maxSum<curr){
                    maxSum = curr;
                }

            }

        }

        System.out.println("the highest sum of an array is:  "+maxSum);

    }

    //      * Important Question Printing pairs of array.. *

    public static void printPairs(int arr[]){

        for(int i = 0; i<arr.length; i++){

            int curr = arr[i];

            for(int j = i+1; j<arr.length; j++){

                System.out.print("("+curr+","+arr[j]+")");

            }

            System.out.println();
        }
    }

     //      * Important Question Printing Maximum SubArray  of array.. *

    public static void SubArray(int arr[]){

        for(int i = 0; i<arr.length; i++){
 
            int curr = i;

            for(int j = i+1; j<arr.length; j++){

                int last = j;

                for(int k = curr; k<=last; k++){

                    System.out.print(arr[k]+" ");
                }

                System.out.println();

            }

            System.out.println();
        }
    }


    // Reverse the Array...

    public static void Reverse(int arr[]){

        int first = 0;
        int last = arr.length-1;

        while(first<last){

            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;

        }

    }

    // Binary Search...

    public static int BinaySearch(int arr[],int key){

        int s = 0;
        int e = arr.length-1;

        while(s<=e){

            int mid = s+(e-s)/2;

            if(arr[mid]==key){

                return mid;

            }

            else if(arr[mid]>key){

                s = mid+1;

            }

            else {

                e = mid-1;

            }

        }

        return -1;

    }

    public static int Largeset(int arr[]){

        int ans = 0;

        for(int i =0;i<arr.length;i++){

            if(arr[i]>ans){

                ans = arr[i];

            }

        }

        return ans;

    }

    public static int linearSearch(int arr[],int key){

        for(int i = 0;i<arr.length;i++){

            if(arr[i]==key){

                return i;
            }

        }

        return -1;

    }

    public static int menu(String menu[],String key){

        for(int i = 0; i<menu.length ;i++){

            if(menu[i]==key){

                System.out.println("You are lucky.."+i);

            }

        }

        return 0;

    }
    
    public static int arr(int arr[]){

        System.out.println("Here printing the array...");
        
        for(int i = 0;i<arr.length;i++){

            System.out.println(arr[i]);

        }

        int a = 1;
        return a;

    }

    public static void main(String[] args) {
        try (// Initilizing the input...

        Scanner sc = new Scanner(System.in)) {

            // int arr[] = {1,2,3,4,5,6,7,8,9,10};

            // for(int i = 0; i<=arr.length; i++){

            //     System.out.println(arr[i]);

            // }      
            
            // Taking input from the computer..

            // int ar2[] = new int [100];
            // ar2[0] = sc.nextInt();// Maths
            // ar2[1] = sc.nextInt();// Science
            // ar2[2] = sc.nextInt();// English
            // ar2[3] = sc.nextInt();// Hindi
            // ar2[4] = sc.nextInt();// Social

            // System.out.println("Maths: " + ar2[0]);
            // System.out.println("Science: " + ar2[1]);
            // System.out.println("Enghlish: " + ar2[2]);
            // System.out.println("Hindi: " + ar2[3]);
            // System.out.println("Social: " + ar2[4]);

            // Upadtion..

            // ar2[0] = 50; // here we can also perform operation like + , - , * , / -> ar2[0]+1
            // System.out.println("Maths: " + ar2[0]);

            // And has usual ar2.length;

            // Passing array has a argument..

            int Array[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

            System.out.println();
            System.out.print(arr(Array));

            System.out.println();


            
            // Linear Search. 1. 2. 3. 4. 5- hi i got it..

            int linear[] = {1,2,3,4,5,6,7,8,9,10};
            int key = 9;

            int lin = linearSearch(linear, key);

            if(lin==-1){

                System.out.println("Sorry, key not found!..");

            }
            else{

                System.out.println("Key found...");

            }

            String menu[] = {"Somosa","Pizza","Burger","Coca Cola"};
            String k = sc.next();

            int ans = menu(menu, k);

            if(ans == 0){

                System.out.println("Sorry, your meal is out of stock..");

            }
            else{

                System.out.println("Here's your meal..");

            }

            int large[] = {90,12,32,42,43,34,34,3,3,100};
            int an = Largeset(large);

            System.out.println(an);

            // Binary Search....

            int second[] = {10,100,1000,10000,100000,1,11};
            int ke = 10;

            System.out.println(BinaySearch(second, ke));

            //                 Here we gonna to reverse the array... 

            int rev[] = {10,9,8,7,6,5,4,3,2,1};
            Reverse(rev);

            for(int i = 0;i<rev.length;i++){

                System.out.print(rev[i]+" ");
            
            }

            System.out.println();

            // Pairs in an array means that take out the all the possible pairs in an array.

            int number[] = {1,2,3,4,5,6};
            printPairs(number);

            System.out.println();

            int sub[] = {1,2,3,4,5,6};
            SubArray(sub);
            
            System.out.println();

            int Maxsub[] = {-1, -3, 4, -1 , -2, 1, 5, -3};
            MaxSubArray(Maxsub);

            System.out.println();

            int Max[] = {-1, -3, 4, -1 , -2, 1, 5, -3};
            Kadane(Max);

            System.out.println();

            int water [] = {4, 2, 0, 6, 3, 2, 5};
            System.out.println(TrappingRainWater(water));

            System.out.println();

            int Buy[] = {5,2,34,6,10};
            System.out.println(BuyAndSellStocks(Buy));

        }
    }
}
