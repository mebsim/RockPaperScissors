import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        boolean run = true;
        int wins = 0;
        int losses = 0;
        int ties = 0;
        String answerplay;
        while(run){
            System.out.println("Welcome to Rock, Paper, Scissors. If you lose three rounds you lose. If you win three rounds you win.");
            boolean game = true;
            while(game){
                Random rn = new Random();
                int n = rn.nextInt(3) + 1; // 1 equals rock, 2 equals paper, 3 equals scissors.
                Scanner player = new Scanner(System.in);
                System.out.println("Rock, Paper or Scissors.");
                String choice = player.nextLine();
                String lchoice = choice.toLowerCase();
                if(lchoice.equals("rock")){
                    if(n ==  1){
                        ties ++;
                    }
                    if(n == 2){
                        losses ++;
                    }
                    if(n == 3){
                        wins ++;
                    }
                }else{
                if(lchoice.equals("paper")){
                    if(n ==  2){
                        ties ++;
                    }
                    if(n == 3){
                        losses ++;
                    }
                    if(n == 1){
                        wins ++;
                    }
                }else{
                if(lchoice.equals("scissors")){
                    if(n ==  3){
                        ties ++;
                    }
                    if(n == 1){
                        losses ++;
                    }
                    if(n == 2){
                        wins ++;
                    }
                }else{
                    System.out.println("No Spaces and Correct Words ONLY.");
                    }
                  }
                }
                if(lchoice.equals("exit")){
                    game = false;
                    run = false;
                }
                    if(wins == 3){
                    game = false;
                    System.out.println("You won!");
                }
                if(losses == 3){
                    game = false;
                    System.out.println("You lose!");
                }
                System.out.println("Wins: " + wins + ". Losses: " + losses + ". Ties: " + ties + ".");
                System.out.println("------------------------------------------------");
                }
            wins = 0;
            losses = 0;
            ties = 0;
            System.out.println("Do you want to play again?");
            Scanner scan = new Scanner(System.in);
            String playagain = scan.nextLine();
            answerplay = playagain.toLowerCase();
            if(answerplay.equals("yes")){
                run = true;
            }else{
                run = false;
            }            
        }
    }
}    
