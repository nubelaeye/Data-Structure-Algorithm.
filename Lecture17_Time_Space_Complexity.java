public class Lecture17_Time_Complexity {
    public static void main(String[] args) {

        // {
        // Time complexity formula = no of calls * work in each call..
        // Space complexity formual = depth(Tree of program) * memory in each level..
        // }
        
        // Best time complexity...         

        // Types of time complexity are: Big : O , Theta : 0, Umega : _U_ U in thr revers form
        // Big O Notation:-
        //     1. Costant Time Complexity - O(1)
        //     2. Log n Time Complexiry - (log n)
        //     3. n square - (n2)
        //     4. Worst case Time complexity 2 the power n - (2n)

        // Now let's start the time complexity: 
        
        // 1 . For Loop(single)->
            // Code ->
                int n = 10;
                for(int i = 0; i<n;i++ ){
                    System.out.println(i);
                } 
            // The time complexity for this code will be O(n)...
        
        // 2 . For Loop(single)->

            // Code ->
            for(int i = 0; i<n;i++ ){
                for(int j = i+1; j<n;j++){
                    System.out.println(i);
                }
            } 

        // The time complexity for this code will be O(n 2) n square...
        // The time complexity of Bubble sort will be O(n2) in both (worst case and best). 
        // The time complexity of Binary Search will be O(log n)
        // The time complexity of Resursion (Factorial) will be O(n) both space and time.
        // The time complexity of Resursion (Sum of n) will be for space and time O(n).
        // The time complexity of Merge function will be however, O(n) and also the space.
        // And the time complexity of Merge sort of whole function will be - (n log n).
        // The time complexity of Power function will be O(n).
        // And the time complexity of optimised form in even and odd - O(log n).

        
        

    }
}
