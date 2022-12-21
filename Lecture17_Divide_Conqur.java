class Lecture16_Divide_Conqur{

    // Code..
        public static void MergeSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }

        int mid = si+(ei-si)/2;
        MergeSort(arr, si, mid); // Left section...
        MergeSort(arr, mid+1, ei); // Right secton...
        merge(arr, si, mid, ei);
    }

    // For mergeing the elements..

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            } else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++]; 
        }

        for(k = 0, i = si; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }

    // Second most efficient Sorting...

    public static void QuickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int n = partition(arr,si,ei);
        QuickSort(arr, si, n-1); // Left
        QuickSort(arr, n+1, ei); // Right 
    }

    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j = si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp; 
            }
        }

        i++;

        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    // Search in a sorted and roated array..
    
    public static int Search(int arr[],int si, int ei,int tar){
        if(si>ei){
            return -1;
        }

        int mid = si+(ei-si)/2;

        if(arr[mid]==tar){
            return mid;
        }

        if(arr[si]<=arr[mid]){
            if(arr[si]<=tar && tar <= arr[mid]){
                return Search(arr, si, ei, mid);
            }
            else{
                return Search(arr, mid+1, ei, tar);
            }
        }

        else{
            if(arr[mid] <= tar && tar <= arr[ei]){
                return Search(arr, mid+1, ei, tar);
            }
            else{
                return Search(arr, si, mid-1, tar);
            }
        }
    }


    // For printing the array...
    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // First Merge Sorting Time Complexity O(logn)...
        int arr[] = {6,3,9,8,2,5};
        MergeSort(arr, 0, arr.length-1);
        printArray(arr);
        QuickSort(arr,0, arr.length-1);
        printArray(arr);
        System.out.println();
        System.out.println(Search(arr, 0, arr.length-1,8));
        System.out.println();
    }
}
