/**
 *  This was created by Norman Potts
 *  2018/May/01 
 *   
 * 
 *  This project uses a java class that can randomly shuffle the contents of
 *  an array. The Shuffler class creates the array and stores it. This program
 *  displays the array to the user first than asks if the user wants to shuffle.
 *  When they type 'y' the array gets shuffled. When the user types 'n' the 
 *  program exits. The array is displayed after it is shuffled and the user is 
 *  prompted again. Continues in a loop until user types 'n'.
 *
 */

package ArrayShuffler;

import java.util.Scanner;

/** Class Lab4B
 *  
 * @author norman.potts
 */
public class ArrayShuffler 
{
    public static void main(String[] args) 
    {        
      
        char yesno; // Will hold one character from the user's keyboard input.                        
        Shuffler Shuffleobj = new Shuffler(20);
      
        do
        {                       
            Shuffleobj.Display();     
            Scanner input = new Scanner( System.in);
            System.out.printf("Would you like to Shuffle the Array? type 'y' for yes , type 'n' for 'no' \n");      
            yesno = input.next().charAt(0);

            if (yesno == 'y')
            {
               Shuffleobj.shuffle();                  
             
            }
            else if(yesno != 'n' && yesno != 'y' )
            {
                System.out.printf(" inncorect input. Please type lowercase n or y. \n");
            }

        }while(yesno != 'n');
           
    }/// End of method Main.

}/// End of class ArrayShuffler.
