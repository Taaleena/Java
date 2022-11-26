package dz1;

import java.util.*;

/*
0.2

public class DZ4 {
    public static void main(String[] args) {

        Queue<Integer> list2 = new LinkedList<Integer> ();
        list2.add (3);
        list2.add (7);
        list2.add (5);
        list2.add (6);
        list2.add (9);

    System.out.println(list2);

        System.out.println(list2.remove ());
        System.out.println(list2.remove ());
        System.out.println(list2);    

        }
        
    }

0.1

public class DZ4 {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<Integer> ();
        list.push (3);
        list.push (5);
        list.push (7);
        list.push (6);
        list.push (1);

        System.out.println(list);   

        System.out.println(list.pop ());
        System.out.println(list.pop ());

        System.out.println(list);     

    }
        
}

  


public class DZ4 {
    public static void main(String[] args) {
        

        Random arr = new Random();
        int [] arr2 = new int [5];

        for (int i = 0; i < 5; i++) {
        arr2 [i] = (int) (Math.random () *10);

        System.out.println(arr2 [i]);
        System.out.println(arr2.pop ()); 
        
    }
}
}
     
 1.
*/

    public class DZ4  {

    public static<T> List<T> reverseList(List<T> list)
    {
        List<T> reverse = new ArrayList<>(list.size());
 
        ListIterator<T> ste = list.listIterator(list.size());
        while (ste.hasPrevious()) {
            reverse.add(ste.previous());
        }
 
        return reverse;
    }
 
    public static void main(String[] args)
    {

        List<Integer> list2 = new LinkedList<Integer> ();
        list2.add (3);
        list2.add (7);
        list2.add (5);
        list2.add (6);
        list2.add (9);
 
        List<Integer> reverse = reverseList(list2);
        System.out.println(list2);
        System.out.println(reverse);  
    }
}


