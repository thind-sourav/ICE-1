/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ice.pkg1;

/**
 *
 * @author sourav
 */
public class ICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    
        Card[] magicHand = new Card[7];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<magicHand.length; i++)
        {
            Random rn = new Random();
            int number = rn.nextInt(13) + 1;
            Card c = new Card();
            c.setValue(number);
            int newNumber = rn.nextInt(4);
            c.setSuit(Card.SUITS[newNumber]);
            magicHand[i] = c;
        }
        System.out.print("Enter the card suit: ");
        String cardSuit = sc.nextLine();
        System.out.print("Enter the card number: ");
        int cardNumber = sc.nextInt();
        boolean cardFound = false;
        for(int i = 0; i < magicHand.length; i++) {
            if(magicHand[i].getValue() == cardNumber && magicHand[i].getSuit().equals(cardSuit)) {
                System.out.println("Card found!");
                System.out.println("Card Suit: "+ magicHand[i].getSuit());
                System.out.println("Card Value: "+ magicHand[i].getValue());
                cardFound = true;
            }
        }
        if(!cardFound) {
            System.out.println("Card not found!");
        }
    }

    private static class Card {

        public Card() {
        }
    }
}
        
    
    

