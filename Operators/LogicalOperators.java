package Operators;
public class LogicalOperators {
    public static void main(String[] args) {
        
        // *Logical && Operation*

        // int x = 7;
        // int y = 5;
        // int a = 5;
        // int b = 9;
        
        // boolean result = x > y && a >b ;
        // System.out.println(result);   //Output: false

        //*logical || Operation*

        // int x = 7;
        // int y = 5;
        // int a = 5;
        // int b = 9;
        
        // boolean result = x < y || a < b ;
        // System.out.println(result);   //Output: true

        // *Logical != operation*

        // int x = 7;
        // int y = 5;
        // int a = 5;
        // int b = 9;
        
        // boolean result = a > b;
        // System.out.println(!result);   //Output: True  .........As we are using the logicalnot(!)operation

        // write code here

        //Coding Exercise: Mastering Java Operators: Arithmetic, Relational, and Logical in Action

         int a = 20;
         int b = 10;
         
         System.out.println("Addition: " + (a + b));
         System.out.println("Subtraction: " + (a - b));
         System.out.println("Multiplication: " + (a * b));
         System.out.println("Division: " + (a / b));
         
         boolean isgreater = a > b;
         boolean logicalCheck  = a > b && b > 0;
         System.out.println("Is a greater than b? " + isgreater);
         System.out.println("Is a>b and b>0? " + logicalCheck);
    }



    
    
}
