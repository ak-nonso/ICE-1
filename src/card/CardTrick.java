/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        
        Card[] magicHand = new Card[7];
        Random rnd = new Random();
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(rnd.nextInt(1, 14));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rnd.nextInt(4)]);
            magicHand[i] = c;   
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter card value (1-13): ");
        int value = inp.nextInt();
        inp.nextLine();
        System.out.print("Enter card suit: ");
        String suit = inp.nextLine();
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(suit);
        
        // and search magicHand here
        //Then report the result here
        boolean found = false;
        
        for (int i = 0; i < magicHand.length; i++){
            if (magicHand[i].getValue() == userCard.getValue() && magicHand[i].getSuit().equalsIgnoreCase(userCard.getSuit())){
                found=true;  
                System.out.println("Your card exists in the magic hand at index " + i);
                break;
            }
        }
        
        if(!found){
            System.out.println("Your card was not found in the magic hand");
        }
        
        // add one luckcard hard code 2,clubs
    }
    
}
