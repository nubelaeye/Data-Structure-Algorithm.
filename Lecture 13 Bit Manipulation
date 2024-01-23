public class Lecture13_BitManipulation{

    // Here's the function of ODD or EVEN...

    public static void OddOrEven(int n){
        int bitMask = 1;
        if((n&bitMask)==1){
            System.out.println("The number is Odd");
        }
        else{
            System.out.println("The number is Even");
        }
    }

    // Function of Get Ith Bit...

    public static int GetIthBit(int n,int i){
        int bitMask = 1 <<i ;
        if((n & bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    // Function of Set Ith Bit...

    public static int SetIthBit(int n,int i){
        int bitMask = 1 << i;
        if((n|bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    // Function of Clear Ith Bit...

    public static int ClearIthBit(int n,int i){
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    // Update the Ith Bit..

    public static int UpdateIthBit(int n,int i,int newBit){
        if(newBit == 0){
            return ClearIthBit(n, i);
        }
        else{
            return SetIthBit(n, i);
        }
    }

    // Clear last Ith Bit...
    
    public static int ClearLastIthBit(int n,int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    // Clear last Ith Bit...
    
    public static int ClearLastIthBitInRange(int n,int i, int j){
        int a = (~0)<<(j+1 );
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;

    }

    // Check if the number is power of 2 or not...

    public static boolean CheckPowerOf2(int n){
            return (n&(n-1))==0;
    }

    
    // Counting the total set Bits...

    public static int Counting(int n){
        int count = 0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    // Printing the power of the number...

    public static int fastExpo(int a,int b){
        int ans = 1;
        while(b>0){
            if((b&1)!=0){
                ans = ans * a;
            }
            a = a * a;
            b = b >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        //                                  Bit wise operators...

        // 1.Binary And(&)..

        System.out.println("Binary And operator of 5 and 6 is: ");
        System.out.println(a&b); // OUTPUT: 4.

        // 2.Binary OR(|)

        System.out.println("Binary Or operator of 5 and 6 is: ");
        System.out.println(a|b); // OUTPUT: 7.

        // 3.Binary XOR(^)

        System.out.println("Binary XOR operator of 5 and 6 is: ");
        System.out.println(a^b); // OUTPUT: 3.

        // 4.Binary NOT(~)

        System.out.println("Binary NOT operator of 5 is: ");
        System.out.println(-a); // OUTPUT: -5.

        // In not, we basically take out the 1's complement. In Binary, there are-
        // Two types of less significant bit(LBS) and Most significant Bit(MBS)...
        // Example :- 5 = last 1 of 10(1)(LBS) and first 1 of (1)01...

        // Left shift...

        System.out.println("Left shift operator of 5 and 1 is: ");
        System.out.println(5>>1); // OUTPUT: 2.

        // Right Shift...
        System.out.println("Right shift operator of 5 and 1 is: ");
        System.out.println(5<<1); // OUTPUT: 10.

        // Here come's the question number first ..
        // Check wheather the number is odd or even..

        OddOrEven(25);

        // Some of the operations in Bit Manipulation...

        // 1. Get ith Bit...

        System.out.println("Get Ith Bit...");
        System.out.println(GetIthBit(10, 2));

        // 2. Set ith Bit...

        System.out.println("Set Ith Bit...");
        System.out.println(SetIthBit(10, 2));

        // 3. Clear ith Bit..

        System.out.println("Clear Ith Bit...");
        System.out.println(ClearIthBit(10, 1));

        // Function to update the Ith Bit...

        System.out.println("Function to Update the Ith Bit...");
        System.out.println(UpdateIthBit(10, 3, 0));

        // Function to Clear last Ith Bit...

        System.out.println("Function to Clear Last Ith Bit...");
        System.out.println(ClearLastIthBit(15, 2));

        // Clearing the range in the Bit...

        System.out.println("Clearing the Bit in the Range...");
        System.out.println(ClearLastIthBitInRange(10, 2, 4));

        // Checking the number is power of 2 or not...

        System.out.println("Checking that the number is Power ");
        System.out.println(CheckPowerOf2(128));

        // Counting the total set Bits...
        System.out.println("Counting the total set Bits: ");
        System.out.println(Counting(10));

        // Code of Fast exponentiation...

        System.out.println("The fast Exponetiation is: ");
        System.out.println(fastExpo(5,3));

        // The End.....

    }
}
