package ee.itcollage.level10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Cardgame {

    public static List<Card> buildDeck() {
        List<Card> cards = new ArrayList<>();
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                Card card = new Card(rank,suit);
                cards.add(card);

            }

        }
        return cards;
    }

    public static List<Card> shuffle() {
        List<Card> cards = buildDeck();
        Collections.shuffle(cards);
        return cards;
    }
    public static List<Card> get5cards () {
        List<Card> cards = shuffle();
        List <Card> yours = new ArrayList<>();
        Random randomGenerator = new Random();
        for (int i = 0; i < 5; i += 1){
            int index = randomGenerator.nextInt(cards.size());
            Card a = cards.get(index);
            yours.add(a);
        }
        return yours;
    }

    public static void main(String[] args) {
        //todo 1 fix tests
        //todo 2 simulate playing poker (buildDeck, shuffle and get 5 cards)
       System.out.println(get5cards());
    }

}
