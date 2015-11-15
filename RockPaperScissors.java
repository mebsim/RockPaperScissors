import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        boolean run = true; // starts the game
        int wins = 0;
        int losses = 0;
        int ties = 0;
        String answerplay;
        while(run){
            System.out.println("Welcome to Rock, Paper, Scissors. If you lose three rounds you lose. If you win three rounds you win.");
            boolean game = true;
            while(game){
                Random rn = new Random(); // random computer choices
                int n = rn.nextInt(3) + 1; // 1 equals rock, 2 equals paper, 3 equals scissors.
                Scanner player = new Scanner(System.in);
                System.out.println("Rock, Paper or Scissors.");
                String choice = player.nextLine();
                String lchoice = choice.toLowerCase();
                if(lchoice.equals("rock")){
                    if(n ==  1){ // rock and rock, tie
                        ties ++;
                    }
                    if(n == 2){ // rock and paper, lose
                        losses ++;
                    }
                    if(n == 3){ // rock and sciessors, win
                        wins ++;
                    }
                }else{
                if(lchoice.equals("paper")){
                    if(n ==  2){ // paper and paper, tie
                        ties ++;
                    }
                    if(n == 3){ // paper and scissors, lose
                        losses ++;
                    }
                    if(n == 1){ // paper and rock, win
                        wins ++;
                    }
                }else{
                if(lchoice.equals("scissors")){
                    if(n ==  3){ // scissors and scissors, tie
                        ties ++;
                    }
                    if(n == 1){ // scissors and rock, lose
                        losses ++;
                    }
                    if(n == 2){ // scissors and paper, win
                        wins ++;
                    }
                }else{
                    System.out.println("No Spaces and Correct Words ONLY."); // If they don't write anything correctly
                    }
                  }
                }
                if(lchoice.equals("exit")){ // type exit to exit
                    game = false;
                    run = false;
                }
                    if(wins == 3){ // first to three, if you win game ends and it asks if you want to play again
                    game = false;
                    System.out.println("You won!");
                }
                if(losses == 3){ // same as wins == 3, if you lose three games, it ends and asks if you want to play again
                    game = false;
                    System.out.println("You lose!");
                }
                System.out.println("Wins: " + wins + ". Losses: " + losses + ". Ties: " + ties + ".");
                System.out.println("------------------------------------------------"); // at the end of each round it tells you the score
                }
            wins = 0; // resets the wins
            losses = 0; // resets the losses
            ties = 0; // resets the ties
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
