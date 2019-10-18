
package bubblesort;
public class BubbleSort {

  
    public static void main(String[] args) {
        int number[] = new int[] {4,7,10,9,1,5,3,6};
         int temp;
         boolean fixed = false;
        
         while (fixed == false)
         {
             fixed = true;
        for (int i = 0; i < number.length - 1; i++)
       
            if (number[i] > number[i + 1])
                //if    4 > 7
            {
                temp = number[i + 1];
                //Stores 7 in temp
                
                number[i + 1] = number[i];
                //Moves 4 to the position of 7
                
                number[i] = temp;
                //makes the position of i = to 7
                
                fixed = false; //When the if statement is triggered fixed will automatically be set to false so the while statemnt will trigger.
            }
        
        }
         //For loop to display contents of sorted array
         for (int i = 0; i < number.length; i ++)
         {
             System.out.println(number[i]);
         }
    }
    
}
