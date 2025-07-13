
 // * Literals *

        //int num = 0b101;  //Binary number 
        
        //int num = 0x7E;   //Hexa-Decimal number 
        // int num = 10_00_00_000; // To count the larger number in java use' _' to separate the numbers 

        // double num1 = 56;  // Integer 56 will be converted into double 
        //  double num1 = 12e10; //to store verybig number we use e

        // char c = 'k';
        // c++;          // Incrementing the values 
      

        //*Type Conversion*


        // byte b = 127; 
        // System.out.println(b);     //Output: 127

        //  byte b = 257; 
        // System.out.println(b);     //Output: error cannot convert byte to int 
        
        // byte b = 127; 
        // int a = b;
        // System.out.println(a);   // Output: 127

        // byte b = 127; 
        // int a = 12;
        // byte k = (byte) a ;  // Explicit Conversion TypeCasting from int to byte

        // System.out.println(k);    //Output: 12 because it is in range of byte 

        //byte b = 125; 
        // int a = 257;
        // byte k = (byte) a ;  // Explicit Conversion TypeCasting from int to byte
        // //It will perform the modulus operation and divide the number by the byte range
        // System.out.println(k);  //Output: 1 




        // float f = 5.6f;
        // int t = (int) f;   // Typecasting and converting float to int
        // System.out.println(t); //Output: 5


        //Type Promotion

        // byte a = 10;
        // byte b =  30;

        // int result = a * b;   // The value of the byte is promoted to interger
        // System.out.println(result);









package Operators;
public class ArithmeticOprators {
    public static void main(String[] args) {
         
      //Arithmetic Operators 


    //   int num1 = 10;
    //   int num2 = 20;
    //   int result = num1 + num2;   //Using the + operator to add two number 
    //   System.out.println(result);  //Output: 30 
    
    //   int num1 = 10;
    //   int num2 = 20;
    //   int result = num1 - num2;   //Using the - operator to add two number 
    //   System.out.println(result);  //Output: -10

    // Here we can use same for the multiplication(*), Division(/) and more



      int num = 7;
    //   num = num1 + 2;
    //  num += 2;   //shortcut to use when adding to the same number can be used for (+,-,*,/)and more
    // num++;        // Post-Incrementing by 1
    //    ++num;       // Pre-Incrementing
    // num--;        // Decrementing by 1


       // int result = num++;    //fetch the value and then increment
        int result = ++num;     // Increment and then fetch the value
      System.out.println(result);






        
    }
}
