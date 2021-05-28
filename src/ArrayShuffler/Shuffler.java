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
 */

package ArrayShuffler;

import java.util.Random;


/** Class Shuffler
 *
 * @author norman.potts
 */
public class Shuffler 
{
       
    private int[] data; //Declare array to hold the interger values.
    private static  final Random randomNumbers= new Random();//random number generator. 
    private static int DataSize;            
    
    
    /** Constructor Shuffler
     *     Creates the data array based off the given size.
     * @param size 
     */
    public Shuffler(int size) 
    {            
        DataSize = size;
        data = new int[size]; //set array element number      
        // Forward loop... 
        for ( int i=0; i < data.length; i++)
        {     
            data[i]= i+1;      
        }                                        
    }/// End of constructor Shuffler
 
    
    
    
    /** Method shuffle
     *      Shuffles the data array.
     */
    public void shuffle() 
    {                        
        int x, item;                       
        for ( int  i=0; i < DataSize; i++)
        {                                
            x = randomNumbers.nextInt( i + 1 );                           
            item = data[ x ];                    
            data[ x ] = data[ i ];
            data[ i ]= item;                                               
        }
    }/// End of method shuffle
 
    
    
    
    /** Method Display
     *      Displays the contents of the Data array.
     * 
     */
    public void Display()
    {
        System.out.println(" Displaying Data Array...");
        for( int i = DataSize -1; i >= 0; i--)
        {            
            System.out.println(" Data["+i+"] is "+data[i]+" ");        
        }    
    }/// End of Method display
            
            
}/// End of Class Shuffler
             
