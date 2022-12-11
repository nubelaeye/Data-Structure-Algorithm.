public class Lecutre11_2D_Arrays_Homework {
    // Homework numner 2.
    public static int Sum(int arr[][]){
        int suming = 0;
            for(int j = 0;j<arr[0].length;j++){
                suming+=arr[1][j];
            } 
        return suming;
        }
    public static void main(String[] args) {
        // Homework number 1.
        int count = 0;
        int arr[][] = {{1,2,3},
                       {4,7,6},
                       {7,7,9},
                       {10,11,12}};
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println(Sum(arr));
    }
    
}
