public class Lecture14_OOPS_Homework {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(Complex.Add(a,b));
        System.out.println(Complex.diff(a,b));
        System.out.println(Complex.Multi(a,b));
    }
}

// Homework 1.
class Complex{
    int a;
    int b;

    public static int Add(int a,int b){
        return a+b;
    }

    public static int diff(int a,int b){
        return a-b;
    }

    public static int Multi(int a,int b){
        return a*b;
    }
    
}

// Homework 2.
