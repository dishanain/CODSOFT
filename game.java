import java.util.Random;
import java.util.Scanner;
class Numberguessinggame
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        Random rn= new Random();
        final int maxattempt=4;
        int roundsplay=0;
        int roundswon=0;
        System.out.println("WELCOME IN THE GAME OF GUESSING A NUMBER");
        boolean playagain=true;

        while(playagain)
        {
            int secnum=rn.nextInt(100)+1;
            int attempt=0;
            boolean guessedcorrect= false;
            System.out.println("\n CAN U GUESS THE NUMBER I HAVE PICKED ONE FROM 1 TO 100");
            
            while(attempt<maxattempt)
            {
                System.out.println("ENTER THE NUMBER U GUESSED("+(maxattempt-attempt)+"ATTEMPTS LEFT FOR U...)");
                int userguess;
                if(!sc.hasNextInt())
                {
                    System.out.println("ENTER VALID NUMBER");
                    sc.next();
                    continue;
                }
                userguess=sc.nextInt();
                attempt++;
                if(userguess==secnum)
                {
                    System.out.println("COREECTTT!!!!!!!!!! U GUESSED IT IN"+ attempt+"ATTEMPTS.");
                    guessedcorrect=true;
                    roundswon++;
                    break;
                }
            
            else if(userguess<secnum)
            {
                System.out.println("ur guess is too low");
            }
            else{
                System.out.println("ur guess is too high");
            }
        }
        if(!guessedcorrect)
        {
            System.out.println("U LOST...U HAVE USED ALL THE ATTEMPTS....the secret number which u have to guess is "+secnum);
        }
        roundsplay++;
        sc.nextLine();
    
        System.out.println("\n DO U WANNA PLAY AGAIN...???(YES OR NO)");
        String response=sc.nextLine().trim().toLowerCase();
        playagain=response.equals("YES")||response.equals("y");
        }
    System.out.println("GAME OVER");
    System.out.println("Total round u have played"+roundsplay);
    System.out.println("Total round u have won"+roundswon);
    sc.close();
    
}
}