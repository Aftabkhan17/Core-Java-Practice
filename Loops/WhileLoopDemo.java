package Loops;

public class WhileLoopDemo {
    public static void main(String[] args) {
        
        // int i = 1;

        // while(i <= 4)
        // {
        // System.out.println("Hii " + i); 
        // i++;
        // }
        
        int i = 1;

        while(i <= 4)
        {
        System.out.println("Hii " + i);
        int j = 1;
        while(j <= 3){
        System.out.println("Hello " + j);
        j++;
        }

        i++;
        }

        System.out.println("Bye " + i);
    
    }
}