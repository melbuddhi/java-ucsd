//This code generates an array of five random integers and sorts them using Collections.sort()

import java.util.*;

public class BuiltinSort {
    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> numsToSort = new ArrayList<Integer>();

        for(int i = 0; i < 5; i++){
            numsToSort.add(random.nextInt(100));
        }

        Collections.sort(numsToSort);
        System.out.println("Sorted array using built-in method: " + numsToSort.toString());

    }
}
