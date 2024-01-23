import java.util.*;
public class Lecture10_Sorting {

    //  Here pls put some attention pls all the sorting : Bubble, Selection, Insertion Sort
    //  has Time complexity of O(nX2) or n square but,the inbuilt function comes with
    //                              O(log n)...

    // First sorting - Bubble Sort...

    public static void BubbleSort(int arr[]){

        for(int i = 0; i<arr.length-1; i++){

            for(int j = 0; j<arr.length-1-i; j++){

                if(arr[j]>arr[j+1]){
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
                if(arr[min]>arr[j]){ // For sorting in decending order - arr[min]<arr[j];
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

            while(prev>= 0 && arr[prev]>arr[curr]){

                arr[prev+1] = arr[prev];
                prev--; 

            }

            arr[prev+1] = arr[curr];
        }

    }

    // Common guys come and see here the inbuilt function of sorting..
    // 1. Import package java.util.* or java.util.Arrays
    // 2. To implement it. -> Arrays.sort(arr[]); or Arrays.sort(arr, start, end);
    // 3. Enjoy the power of code! - Left the house now go away...


    // If you have to see to inbuilt function then go downside and look there...
    // Not mendotary too: if you want to sort in decending order in inbuilt function
    // 1. Import package java.util.* or java.util.Collections;
    // 2. Make an array of Integer arr[] = {5,4,3,2,1}; - Important to make else not run..
    // 3. To implement it. -> Arrays.sort(arr, Collection.reverseOrder());

    // For Printing the array...

    public static void Print(int arr[]){

        for(int i = 0; i<arr.length; i++){

            System.out.print(arr[i]+" ");
            
        }

        System.out.println();

    }

    public static void main(String[] args) {

        int num[] = {5,4,3,2,1};

        System.out.println("Bubble Sort..");
        BubbleSort(num);
        Print(num);
        
        System.out.println("Selection Sort..");
        SelectionSort(num);
        Print(num);

        System.out.println("Insertion Sort..");
        InsertionSort(num);
        Print(num);

        // Inbuilt Function of sorting...
        System.out.println("Here comes the best Sorting function...");
        Arrays.sort(num);

    }

}
