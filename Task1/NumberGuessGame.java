import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int score=0;
        System.out.println("How many rounds would you like to play ?");
        int rounds=sc.nextInt();

        for(int round=1;round<=rounds;round++){
            System.out.println("Round "+ round+":");
            int number=random.nextInt(100)+1;
            int attempt=0;
            int maxattempts=10;
            boolean guesscorrectly=false;


            while(attempt<maxattempts && !guesscorrectly){
                System.out.println("Guess the number between 1 and 100 (Attempt "+(attempt+1)+"/"+maxattempts+"):" );
              
                int guess=sc.nextInt();
                attempt++;

                if(guess<number){
                    System.out.println("Too Low! try again: ");

                }
                else if(guess>number){
                    System.out.println("Too high!Try again :");
                }
                else{
                    guesscorrectly=true;
                    System.out.println("Congratulataion1! you guessed the number "+ number +" Correctly in "+attempt+" attempts ");

                }

            }
          if(!guesscorrectly){
            System.out.println("Sorry, you couldn't guess the number "+number +" in "+maxattempts +" attempts.");
          }
         score+=guesscorrectly? maxattempts-attempt:0;
        }
        System.out.println("Game over your total score is :"+score);
        System.out.println("Do you want to play again? (y/n)");
        char playagain=sc.next().charAt(0);
        if(playagain=='y' || playagain=='Y'){
            main(args);

        }
        
        else{
            System.out.println("Thanks for playing ");
        }
        sc.close();
        



    }
}