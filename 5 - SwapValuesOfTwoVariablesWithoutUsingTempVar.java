package hopescode_java_programs;

public class SwapValuesOfTwoVariablesWithoutUsingTempVar {
    public static void main(String[] args) {
        //without using third variable is lil bit tricky
        //here we declaring and initializing value to variables
        int a = 2;
        int b = 4;
        //here we print values before swap
        System.out.println("Before Swapping : \nA = "+a+"\nB = "+b);
        //here we multiply A with B and store in A
        a = a*b ;   //IF A = 2 and B = 4, so after the calculation value of A is 8
        b = a/b ;   //HERE A = 8 and B = 4, so after the calculation value of B is 2
        a = a/b ;   //HERE A = 8 and B = 2, so after the calculation value of B is 4
        //and here the value has been swapped without using third variable 
        System.out.println("After Swapping : \nA = "+a+"\nB = "+b);
    }
}
