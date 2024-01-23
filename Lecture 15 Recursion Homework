public class Lecture15_Recursion_Homework {

    // HomeWork number 1.
    public static void Print(int arr[],int i,int key){
        if(i==arr.length){
            return;
        }

        // kaam

        if(arr[i]==key){
            System.out.print(i+" ");
        }
        
        Print(arr, i+1, key);

        // By irratitive method..
        // for(int i = 0;i<arr.length;i++){
        //     if(arr[i]==key){
        //         System.out.print(i+" ");
        //     }
        // }
        
    }

    // HomeWork number 2.
    static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    
    public static void printDigits(int number) {
        if(number==0){
            return;
        }
        int lastDigit=number%10;
        printDigits(number/10);
        System.out.print(digits[lastDigit]+" ");
    }

    // Homework number 3.

    public static int Length(String str){
        if(str.length()==0){
            return 0;
        }

        return Length(str.substring(1))+1;
    } 

    // Homework number 5. 
    public static void TowerOfHenoi(int n,String Source, String Helpher, String Destination){
        if(n==1){
            System.out.println("The disk transfared from "+Source+" to "+Destination);
            return;
        }
        TowerOfHenoi(n-1, Source, Destination, Helpher);
        System.out.println("Transfaring disk "+n+" from " + Source + " to " + Helpher);
        TowerOfHenoi(n-1, Helpher, Source, Destination);
    }
    public static void main(String[] args) {

        System.out.println("Homework number 1.");
        int arr[] = {1,3,4,5,3,5,3};
        int key = 3;
        Print(arr, 0, key);

        System.out.println();
        System.out.println("HomeWork number 2.");
        printDigits(1234);
        System.out.println();

        System.out.println("Homework number 3.");
        String str = "pranjal";
        System.out.println(Length(str));
        System.out.println();

        System.out.println("HomeWork number 5.");
        int n = 2;
        TowerOfHenoi(n, " S ", " H ", " D ");
        System.out.println();
    }
}
