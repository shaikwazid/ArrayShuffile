package ArrayShuffile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayShuffile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    // Create an ArrayList with the values (1, 2, 3, 4, 5, 6, 7)
        List<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);
        originalList.add(5);
        originalList.add(6);
        originalList.add(7);

        // Shuffle the ArrayList
        Collections.shuffle(originalList);

        // Print the shuffled array
        System.out.println("Shuffled Array:");
        for (Integer value : originalList) {
            System.out.print(value + " ");
        }
    

	}

}
