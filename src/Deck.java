/**
 * Created by catrops on 1/23/16.
 */
import java.util.* ;

public class Deck extends Stack<Card>{
    Stack<Card> deck;
    //4 Queens, 4 Kings, 4 Jacks = 10 points
    // 36 non-face cards, all count for their values
    //4 Aces- points 1 or 11

    public Deck(){
        this.deck = new Stack<Card>();
    }

    private void createSuit (int startNum, int endNum, int pointVal, int name){

    }

    public void createDeck(){
        Card newCard;
        for (int i = 1; i <=4; i++){
            for (int j=2; j<=10; j++) {
                newCard = new Card("j", j);
                deck.push(newCard);
            }
                newCard = new Card("King", 10);
                deck.push(newCard);
                newCard = new Card("Queen", 10);
                deck.push(newCard);
                newCard = new Card("Jack", 10);
                deck.push(newCard);
                newCard = new Card("Ace", 11);
                deck.push(newCard);
            }
        }

    public Card removeCard(){ //removes card from top of the deck when dealt
        Card removedCard = this.deck.pop();
        this.deck.pop();
        return removedCard;
    }



}
