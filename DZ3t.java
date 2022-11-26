package dz1;

import java.util.Random;
import java.util.ArrayList;


/**
 * dz1t
 */

/* 
public class DZ3t  {
    
    public static void main(String[] args) {
        Random list = new Random();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = list.nextInt(-50, 100);
            list2.add(val);
        }
        System.out.printf("Random list %s\n", list2);
        int i = 0;
        while (i < list2.size()) {
            if (list2.get(i) % 2 == 0) {
                list2.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.printf("Sort list %s", list2);
    }
}
*/

public class DZ3t  {
    
    public static void main(String[] args) {
        Random list = new Random();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int arr = list.nextInt(-50, 100);
            list2.add(arr);
        }
        System.out.printf("Random list %s\n", list2);

        int minItem = list2.get(0);
        int maxItem = list2.get(0);
        int sumItems = 0;
        for (int item : list2) {
            if (item > maxItem) {
                maxItem = item;
            }
            if (item < minItem) {
                minItem = item;
            }
            sumItems += item;
        }
        double average = (double)sumItems/list2.size();

        System.out.printf("Minimum %s\n", minItem);
        System.out.printf("Maximum %s\n", maxItem);
        System.out.printf("Middl %s\n", average);
    }
}