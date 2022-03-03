package hopescode_java_programs;

public class PerformingAllArithmeticOperations {
    public static void main(String[] args) {
        //here we declaring two integer variable to carry our values 
        int num1 = 5, num2 = 2;
        //here we declare 4 varibales of int and 1 of float where we stores our calculation result
        int sum,sub,multiply,remainder;
        //here we take float because sometimes numbers calculation result comes in floating point values //at the place of float we also take the double datatype
        float divide ;
        
        //here we perform our given values calculation and stored it into the variables
        sum = num1 + num2 ; //sum <= 5 + 2 ; //sum <= 7
        sub = num1 - num2 ; //sub <= 5 - 2 ; //sub <= 3
        multiply = num1 * num2 ; //multiply <= 5 * 2 ; //multiply = 10
        divide = num1 / num2 ;  //divide <= 5 / 2 ; //divide = 2.5
        remainder = num1 % num2 ; //remainder <= 5 % 2 ; //remainder = 1
        //here we print the calculations
        System.out.println("Sum of "+ num1 + " " + num2 +" is: "+ sum);
        System.out.println("Sub of "+ num1 + " " + num2 +" is: "+ sub);
        System.out.println("Multiply of "+ num1 + " " + num2 +" is: "+ multiply);
        System.out.println("Divide of "+ num1 + " " + num2 +" is: "+ divide);
        System.out.println("Remainder of "+ num1 + " " + num2 +" is: "+ remainder);
        
    }
}
