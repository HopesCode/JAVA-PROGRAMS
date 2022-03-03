package hopescode_java_programs;

public class SwapValuesOfTwoVariables {
    public static void main(String[] args) {
        //here we declaring and initializing value to variables
        int a = 2;
        int b = 4;
        //we take temporary variable to carry our data at the time of swap
        int c; //temporary variable
        //here we print values before swap
        System.out.println("Before Swapping : \nA = "+a+"\nB = "+b);
        //first we take value of A variable and store it into temp variable that is C
        c = a;
        //and then we take value of B variable and store it into A 
        a = b;
        //and here we take value of Temporary variable that is C and store it into B
        b = c;
        //and here value has been swapped
        //here we print values after swap
        System.out.println("After Swapping : \nA = "+a+"\nB = "+b);
    }
}
