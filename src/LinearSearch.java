/* When to use linear search:
   - List is small
   - List is unsorted

 */


import java.util.*;
public class LinearSearch {

    private static int linearSearch(int[] array, int value){
        for (int i=0; i< array.length; i++){
            if (array[i]==value){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {


        int[] array = {9,1,8,2,7,3,6,4,5};

        int index = linearSearch(array, 77);

        if (index!= -1){
            System.out.println("Element found at index: " + index);
        }
        else {
            System.out.println("Element not found");
        }

    }


}
