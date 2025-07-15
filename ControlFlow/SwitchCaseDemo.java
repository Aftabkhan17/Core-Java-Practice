package ControlFlow;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        

        //simple if-else statement 
       // int n = 1;
        // if(n==1)
        // System.out.println("Monday");
        // else if(n==2)
        // System.out.println("Tuesday");
        // else if(n==3)
        // System.out.println("Wednesday");
        // else if(n==4)
        // System.out.println("Thursday");
        // else if(n==5)
        // System.out.println("Friday");
        // else if(n==6)
        // System.out.println("Saturday");
        // else
        // System.out.println("Sunday");

        //Switch Case
    //    int n = 8;

    //    switch(n){
    //     case 1:
    //     System.out.println("Monday");
    //     break;
    //     case 2:
    //     System.out.println("Tuesday");
    //     break;
    //     case 3:
    //     System.out.println("Wednesday");
    //     break;
    //     case 4:
    //     System.out.println("Thursday");
    //     break;
    //     case 5:
    //     System.out.println("Friday");
    //     break;
    //     case 6:
    //     System.out.println("Saturday");
    //     break;
    //     case 7:
    //     System.out.println("Sunday");
    //     break;
    //     default:
    //     System.out.println("Enter the valid number");
        
        //Java Conditionals: Evaluate Student Result with If-Else and Grading Logic
        int score = 99;
        
        if(score >= 50){
            System.out.println("passed");
        }else{
            System.out.println("Failed");
        }
        if(score >= 90){
            System.out.println("Grade: A");
        }
        else if(score >= 75){
            System.out.println("Grade: B");
        }
        else if(score >= 60){
            System.out.println("Grade: C");
        }
        else{
            System.out.println("Grade: D");
        }


    }
    
}
