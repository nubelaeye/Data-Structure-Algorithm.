import java.util.*;
public class Lecture12_String {
    public static String compress(String str){
        StringBuilder newStr = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if(count>=1){
                newStr.append(count.toString());
            }
        }
        return newStr.toString();

        }
    
    public static void main(String[] args) {
        try (// How to implement it..
                // String s = "Hey!";
                // String n = new String("High..");
        Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
                // String Concatination....
            System.out.println("Yes, you are right.. "+name);
            
            // Last but not the least question -> String compression...
            String string = "aaabbcccdd";
            System.out.println(compress(string));

            String str="ApnaCollege".replace("l","");
            System.out.println(str);
        }
    }
}
