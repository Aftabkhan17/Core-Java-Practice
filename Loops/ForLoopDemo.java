package Loops;

public class ForLoopDemo {
    public static void main(String[] args) {

        for(int i=1; i <= 4; i++)
        {
        System.out.println("Hii " + i);
        }
        
        for(int i=0; i < 4; i++)
        {
        System.out.println("Hii " + i);
        }

         for(int i=1; i <= 5; i++)
        {
        System.out.println("DAY" + i);
          for(int j=1; j<=9; j++)
            {
                System.out.println("  " + (j+8) + " - " + (j+9));
                
            }

        }


        //*Exercise of for loop, while loop & Do whileloop */

          // Print numbers 1 to 5 using for loop
        System.out.print("For Loop: ");
        for(int i = 1; i <= 5; i++){
            System.out.print(i);
            if (i < 5)
            System.out.print(" ");
        }
        System.out.println();

        // Print numbers 1 to 5 using while loop
        System.out.print("While Loop: ");
        int j = 1;
        while(j <= 5){
            System.out.print(j);
            if (j < 5)
            System.out.print(" ");
            j++;
        }
        System.out.println();

        // Print numbers 1 to 5 using do-while loop
        System.out.print("Do-While Loop: ");
        int k = 1;
        do{
            System.out.print(k);
            if(k < 5)
            System.out.print(" ");
            k++;
        }while(k <= 5);
        System.out.println();
    
     }

    
}
