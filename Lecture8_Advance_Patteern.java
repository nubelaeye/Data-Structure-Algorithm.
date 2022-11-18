import java.util.*;
public class Lecture8_Advance_Pattern {

    // Pattern number 1.

    public static int pattern1(int rows,int column){
        for(int i = 1; i<=rows;i++){
            for(int j = 1;j<=column;j++){
                if(i == 1|| i==rows || j == 1 || j == column){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return 0;
    }

    // Pattern number 2.

    public static int pattern2(int n){
       for(int i = 0; i <=n ;i++){
            for(int  u = 0;u<n-i;u++){
                System.out.print(" ");
            }
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
       }
       
        return 0;
    }

    // Pattern number 3.

    public static int Pattern3(int n){

        for(int i =1;i<=n;i++){
            int count=1;
            for(int j = 1;j<=n-i+1;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
        return 0;
    }

    // pattern number 4.

    public static int Pattern4(int n){

        int count=1;
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
        return 0;
    }

    // Pattern number 5.

    public static int Pattern5(int n){

        int counting = 1;
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(counting); 
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
        return 0;
    }

    // Pattern number 6.

    public static int ButterFly(int n){

        for(int i = 1; i <=n ; i++){
            for(int j = 1; j<=i ; j++){
                System.out.print("<");
            }
            for(int k = 1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int u = 1; u<=i; u++){
                System.out.print(">");
            }
            System.out.println();
        }

        for(int i = n; i >=1 ; i--){
            for(int j = 1; j<=i ; j++){
                System.out.print("<");
            }
            for(int k = 1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int u = 1; u<=i; u++){
                System.out.print(">");
            }
            System.out.println();
        }
        return 0;
    }

    // Pattern number 7.

    public static int solidRhombus(int n){
        for(int i = 1;i<=n;i++){
            for(int k = 1;k<=(n-i);k++){
                System.out.print(" ");
            }
            for(int j = 1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }

    // Pattern number 8.
    public static int HollowSolidRhombus(int n){
        for(int i = 1;i<=n;i++){
            for(int k = 1;k<=(n-i);k++){
                System.out.print(" ");
            }
            for(int j = 1;j<=n;j++){
                if(i == 1|| j == 1|| i == n || j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return 0;
    }

    // Pattern number 9.

    public static int diamond(int n){
        for(int i = 1; i<=n; i++){
            for(int k = 1; k<=(n-i);k++){
                System.out.print(" ");
            }
            for(int j = 1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n; i>=1; i--){
            for(int k = 1; k<=(n-i);k++){
                System.out.print(" ");
            }
            for(int j = 1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int row = sc.nextInt();
            int col = sc.nextInt();
            pattern1(row, col);

            System.out.println();
            int n = sc.nextInt();
            System.out.println();
            pattern2(n);

            System.out.println();
            Pattern3(n);

            System.out.println();
            Pattern4(n);

            System.out.println();
            Pattern5(n);

            System.out.println();
            ButterFly(n);

            System.out.println();
            solidRhombus(n);

            System.out.println();
            HollowSolidRhombus(n);

            System.out.println();
            diamond(n);

        }
    }
}
