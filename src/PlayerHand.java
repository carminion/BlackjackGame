/**
 * Created by catrops on 1/24/16.
 */
public class PlayerHand {
    private boolean isBlackjack;
    private boolean isBust;
    private int pointValue;
    private int handSize =2;
    private Card[] hand;

    public PlayerHand(Deck deckToDealFrom){
        isBlackjack= false;
        isBust = false;
        this.pointValue = 0;
        this.hand = new Card[handSize];
        dealHand(deckToDealFrom);
    }

    public PlayerHand(Deck deckToDealFrom, int handSize){
        isBlackjack= false;
        isBust = false;
        this.pointValue = 0;
        this.handSize = handSize;
        this.hand = new Card[handSize];
        dealHand(deckToDealFrom);
    }

    private void dealHand(Deck deckToDealFrom){
        for (int i = 0; i <handSize; i++){
            this.hand[i] = deckToDealFrom.removeCard();
        }
        tallyPoints();
    }

    public boolean isBust() {
        return isBust;
    }

    public boolean isBlackjack() {
        return isBlackjack;
    }

    public int getPointValue() {
        return pointValue;
    }

    private void tallyPoints (){
        for (int i=0; i< hand.length; i++) {
            pointValue += hand[i].getPointValue();
        }
        if (pointValue > 21){
            isBust = true;
        }
    }
    public void printHand(){
        for (int i=0; i< hand.length; i++){
            System.out.println("Name of card: " + hand[i].getName() + " Points for card: "+ hand[i].getPointValue());
        }
        System.out.println("Total points for hand: " + this.pointValue);
    }


}
