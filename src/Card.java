/**
 * Created by catrops on 1/23/16.
 */
public class Card {
    private int pointValue;
    private String name;


    public Card(String name, int pointValue){
        this.name = name;
        this.pointValue = pointValue;
    }

    public int getPointValue() {
        return pointValue;
    }

    public String getName() {
        return name;
    }


}
