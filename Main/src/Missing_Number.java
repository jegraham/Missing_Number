public class Missing_Number {
    /***
     * Input: 3,7,1,2,8,4,5
     * Output: Count 8, Missing 6
     *
     * Solution Description:
     * A for loop will identify the length of the array.
     * will use the current position count + 1 minus the
     * value of the current position.
     *
     * Other Variations:
     * - Ask user for the size and randomly generate the numbers between 1 to n using a hashtable
     * - Have the user input all the values and the size and ensure each number is unique
     * - Randomly generate size and list and count
     * ***/



    public static void main(String[] args) {
        int [] input = {3,7,1,2,8,4,5}; // Creating the array with the information
        int total = 0; //Creating a total that is empty (starting at 0)

        // Creating the for loop and incrementing one by one
        for (int position = 0; position <= input.length-1; position++){
            //Total count minus the current value, plus the position.
            total = total - input[position] + (position +1);

            if (position == input.length-1){
                total = total + position + 2;
            }
        }//End of for loop


        System.out.println("Count " + (input.length + 1) + ", Missing Value " + total);
    }

}
