
/**
 * Write a description of class BlackJack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BlackJack
{
    public static void main (String args[])
    {
        new BlackJack ();
    }
    public BlackJack()
    {
        int total = 0;
        int random = (int)(Math.random() * 11);
        int random2 = (int)(Math.random() * 11);
        total = random + random2;
        System.out.print ( "Your first card is  " + random + ". Your second card is " + random2+ " . Your total is "+ total + ".");
        
        
        if (total == 21){
            System.out.println ("The dealer has lost BLACKJACK. The Player Wins!");}
         else if (total > 21) {
             System.out.println (" The player has lost BLACKJACK. The Dealer Wins!");}
         while (total < 21) {
             String card3= IBIO.inputString (" Would you like another card?");
             
             if (card3.equals("yes") || card3.equals("Yes")){
             int r3 = (int)(Math.random() * 11);
             total += r3;
             System.out.println (" Your new card has a value of " + r3);
             System.out.println (" Your new total is ... " + total);
             if (total == 21){
                 System.out.println ("The dealer has lost BLACKJACK. The Player Wins!");
                 break;}
             else if (total > 21)  {
                 System.out.println (" The player has lost BLACKJACK. The Dealer Wins!");
                 break;
                }
            } 
            else
             {
                 System.out.println ("Your value is " + total); 
                 break;
             
            }
        }
        int totalFinal = 0;
               
        while(total >= 16){
            int r4 = (int)(Math.random() * 11);
            totalFinal += r4;
            System.out.println ("The dealer total is " + totalFinal);
            
            if (totalFinal >= 16 ){
                break;}
            }
            
        if (totalFinal >= 21 && total<21){
            System.out.println ("The dealer has lost BLACKJACK. The Player Wins!");
        }
        if (total < 21 && total>totalFinal){
            System.out.println ("The dealer has lost BLACKJACK. The Player Wins!"); 
        }
        if (totalFinal < 21 && totalFinal>total){
            System.out.println ("The player has lost BLACKJACK. The Dealer Wins!");
        }
    }
}
     







