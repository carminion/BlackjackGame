/**
 * Receives input from user to start game, prints game prompts to console
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartGame {
public static void main (String[] args) throws IOException {
    Card card1 = new Card("queen", 10);
    boolean gameIsOver = false;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Welcome to Carmin's Blackjack Game. Press enter to play...");
    String s = br.readLine();


    System.out.println("Press enter to deal out your cards...");
    String dealing = br.readLine();
    if (playGame() == false) {
        System.out.println("You went over 21! Sorry, you lose! Type \"quit\" to end game");

    }


    System.out.println("You did it! Type \"quit\" to end game");
    String endGame = br.readLine();
    while (gameIsOver == false) {

        if (endGame.equalsIgnoreCase("quit")) {
            gameIsOver = true;
            br.close();
        } else {
            System.out.println("That wasn't quite it! Please type \"quit\" again to end the game");
            endGame = br.readLine();
        }
    }
}


    public static boolean playGame(){
        boolean keepPlayingGame = true;
        Deck newDeck = new Deck();
        newDeck.createDeck();
        PlayerHand hand = new PlayerHand(newDeck);
        if(hand.isBust()){
            return keepPlayingGame = false;
        }
        hand.printHand();
        return keepPlayingGame;
    }





}
