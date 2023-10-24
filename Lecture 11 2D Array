import java.util.*;
public class Lecture11_2D_Arrays {

    public static boolean findElement(int matrix[][], int k){
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0;i<n; i++){
            
            for(int j = 0; j<m; j++){
                if(matrix[i][j]==k){
                    System.out.println("Found at index: "+"("+i+", "+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found...");
        return false;
    }

    // Largest element in a 2D array...

    public static void Largest(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        int l = matrix[0][0];
        for(int i = 0;i<n; i++){
            for(int j = 0; j<m; j++){
                if(matrix[n][m]>l){
                    l = matrix[n][m];
                }
            }
        }
        System.out.println("The largest element is: "+l);
    }

    // Printing the Diagonal sum

    public static int DiagonalSum(int max[][]){
        int sum = 0;

        for(int i =0;i<max.length;i++){
            sum += max[i][i];
            if(i!= max.length-1-i)
                sum+= max[i][max.length-i-1];
        }
        return sum;
    }

    // Search in a sorted matrix..
    // Today we will learn a new matrix which is staircase matrix..

    public static boolean staircase(int matrix[][], int key){
        int row = 0; int col = matrix[0].length-1;
        int ans = 0;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Key found at:"+"("+row+","+col+")");
                ans++;
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println(ans);
        System.out.println("Key not found..");
        return false;
        
    }

    public static void main(String[] args) {
        // Creation...
        int matrix[][] = new int[3][3];
        try (Scanner sc = new Scanner(System.in)) {
            // int n = matrix.length;
            // int m = matrix[0].length;

            // Taking input in a 2D Array..

            // for(int i = 0;i<n; i++){
            //     for(int j = 0; j<m; j++){
            //         matrix[i][j] = sc.nextInt();
            //     }
            // }

            int mat[][] = {{1,2,3},
                          {4,7,6},
                          {6,8,9}};

            // Printing output in a 2D Array..

            // System.out.println();
            // for(int i = 0;i<n; i++){
            //     for(int j = 0; j<m; j++){
            //         System.out.print(matrix[i][j]+" ");
            //     }
            //     System.out.println();
            // }
            
            // System.out.println();
            // findElement(matrix, 5);

            System.out.println(DiagonalSum(mat));
            int key = 7;
            staircase(mat, key); 
            System.out.println(matrix);
        }
        System.out.println();
    }
}
