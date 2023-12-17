
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
 
    public static void main (String []args)
{
    Scanner s = new Scanner(System.in);
    Random r = new Random();
    int LowerBound =1;
    int UpperBpond =100;
    //Limiting Number of trials
    int maxtrial=15;
    int round=0;
    int totalscore=0;
//boolean playagain;

   System.out.println("NUMBER GUESSING GAME ");
   System.out.println();
  
    do{
        boolean correctguess = false;
        round++;

        int secretnumber = r.nextInt( UpperBpond - LowerBound + 1) + LowerBound;
        int trials=0;
        System.out.println("ROUND : "+round);
        System.out.println(" I am thinking of number between "+LowerBound+ "to" +UpperBpond);

        while(!correctguess && trials<=maxtrial)
        {
            System.out.print(" Guess the Number : ");
            int userinput = s.nextInt();
            trials++;

            if(userinput < secretnumber)
            {
              
                System.out.println( " Too LOW ! try again ");

            }
            else if(userinput > secretnumber)
            {
                 System.out.println("Too High ! try again ");

            }
            else
            {
                 System.out.println(" Well Done !! you  have guessed  the  secret number ("+secretnumber+") correct");
                correctguess = true ;

            }
        }
        if(correctguess)
        {
            totalscore++;
            if(trials<=5)
            {
                 System.out.println("Exceptional !! ypu guessed the number  in "+trials+ "tries");
            }
            else if(trials<=10)
            {
                 System.out.println(" Well Done you successfully guessed the number in "+trials+ "tries");
            }
            else
            {
  System.out.println(" Good try !! you  guessed the number but with "+trials+ "tries");
            }
        }
        if(!correctguess && trials>maxtrial)
        {
            System.out.println("you have reached maximum attempts ");
            System.out.println("the secret number was "+secretnumber+ "\n GAME OVER");
        }
        
      System.out.println("Enter 'y' if you want to play again");

        
      
        
    } while(s.next().equalsIgnoreCase("y")) ; 
          System.out.println("Thank you for playing ");
       System.out.println("Total Score :"+totalscore);
       s.close();
     
}
}