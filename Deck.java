/**
 * Unit 8 Lab 1
 * This class creates a deck of cards and shuffles them
 * @author Alexis Vu
 * @course AP CSA
 * @date February 18, 2025
 */

 public class Deck 
{
    private int numCards; // the number of cards in the deck
    private Card[] cards; // the array of cards in the deck

    public Deck() 
    {
        numCards = 52;
        cards = new Card[numCards];

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

        for (int i = 0; i < 4; i++) 
        {
            for (int j = 0; j < 13; j++) 
            {
                cards[i * 13 + j] = new Card(suits[i], ranks[j], j + 1);
            }
        }

        shuffle();
    }

    public String toString()
    {
        String deck = "";
        for (Card card: cards) 
        {
            deck += card + "\n";
        }
        return deck;
    }

    public void shuffle() {
        for (int i = 0; i < 1000; i++) 
        {
            // generate two random numbers to pick
            // two random positions of the cards array
            int rand1 = (int) (Math.random() * numCards); // random number between 0 - 51
            int rand2 = (int) (Math.random() * numCards); // random number between 0 - 51

            // swap the cards between those two random positions
            swap(rand1, rand2); 
        }
    }

    public void swap(int p, int q) 
    {
        Card placeHolder = cards[p];
        cards[p] = cards[q];
        cards[q] = placeHolder;
    }
}
