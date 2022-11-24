public class Lecture10_Sorting_Homework {

    public static void BubbleSort(int arr[]){

        for(int i = 0; i<arr.length-1; i++){

            for(int j = 0; j<arr.length-1-i; j++){

                if(arr[j]<arr[j+1]){
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;

                }

            }

        }

    }

    // Second sorting  - Selection Sort...

    public static void SelectionSort(int arr[]){
        for(int i = 0; i<arr.length; i++){
            int min = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[min]<arr[j]){ // For sorting in decending order - arr[min]<arr[j];
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    // Third sorting - Insertion Sort..

    public static void InsertionSort(int arr[]){

        for(int  i = 1; i<arr.length; i++){

            int curr = i;
            int prev = i-1;

            while(prev>= 0 && arr[prev]<arr[curr]){

                arr[prev+1] = arr[prev];
                prev--; 

            }

            arr[prev+1] = arr[curr];
        }

    }

    
    public static void Print(int arr[]){

        for(int i = 0; i<arr.length; i++){

            System.out.print(arr[i]+" ");
            
        }

        System.out.println();

    }

    public static void main(String[] args) {

        int num[] = {3,6,2,1,8,7,4,5,3,1};

        System.out.println("Bubble Sort..");
        BubbleSort(num);
        Print(num);
        
        System.out.println("Selection Sort..");
        SelectionSort(num);
        Print(num);

        System.out.println("Insertion Sort..");
        InsertionSort(num);
        Print(num);


    }
}
