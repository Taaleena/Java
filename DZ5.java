package dz1;

import java.util.*;

public class DZ5 {

    public static void main (String[] args) {
        DZ5 roman = new DZ5 ();
        System.out.println (roman.romanToInt ('I'));
        System.out.println (roman.romanToInt ('V'));
        System.out.println (roman.romanToInt ('X'));
        System.out.println (roman.romanToInt ('L'));
        System.out.println (roman.romanToInt ('C'));
    }
    public int getArabian (char roman) {

        if ('I' == roman) return 1;
        else if ('V' == roman) return 5;
        else if ('X' == roman) return 10;
        else if ('L' == roman) return 50;
        else if ('C' == roman) return 100; 
        return 0;
    }
    public int romanToInt (String s) {

        int end = s.length ()-1; 
        char [] arr = s.toCharArray ();
        int arabian;
        int result = getArabian (arr [end]);
        for (int i = end -1; i >= 0; i--) {
           arabian = getArabian (arr [i]);
       
           if (arabian < getArabian (arr [i+1])) {
               result -=arabian;
           }
           else {
               result += arabian;
       
           } 
           return result; 
        }
    }
}


/*

    HashMap <Character, Integer> map = new HashMap<>();
    map.put ('I', 1);
    map.put ('V', 5);
    map.put ('X', 10);
    map.put ('L', 50);
    map.put ('C', 100);
    
 //System.out.println (map.get ('C'));


 int end = s.length ()-1; 
 char [] arr = s. toCharArray ();
 int arabian;
 int result = map.get (arr [end]);
 for (int i = end -1; i >= 0; i--) {
    arabian = map.get (arr [i]);

    if (arabian < map.get (arr [i+1])) {
        result -=arabian;
    }
    else {
        result += arabian;

    } 
    }
}
}
*/

//public static void main (String[] args) {
//       System.out.println (roman.romanToInt ('CIX'));




    //System.out.println (result ('C'));
  

