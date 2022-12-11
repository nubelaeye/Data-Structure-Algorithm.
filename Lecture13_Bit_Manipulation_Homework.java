public class Lecture13_BitManipultion_Homewok {
    public static void main(String[] args) {
        // Question number 1.
            // Answer = 0;
        // Question number 2.
            int x = 5;
            int y = 10;
            x=x^y;
            y=x^y;
            x=x^y;
            System.out.println(x +" "+ y);
        // Question number 3.
            int c =6;
            System.out.println(c+" + "+1+" is "+-~c);
        // Question number 4.
            // From answer..
            for(char ch='A';ch<='Z';ch++) {
                System.out.println((char)(ch|' '));
                // prints abcdefghijklmnopqrstuvwxyz}
            }
}
}
