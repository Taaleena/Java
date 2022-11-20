package dz1;

/**
 * dz1t
 */

/* 

2.

public class dz1t  {
public static boolean main(String[] args) {
    int a = 3; 
    int b = 5;
    int sum = a + b;
    if (sum > 10 && sum < 20) return true;
    else return false;
        
    }
}

3.

public class dz1t  {
public static void main(String[] args) {
    int a = 3;
    if (a >= 0) System.out.println("Число " + a + " положительное");
    else System.out.println ("Число " + a + " отрицательное");
}
}

4.

public class dz1t  {
public static boolean main (String[] args) {
    int a = 3;
    if (a < 0) return true;
    else return false;
}
}



6.

public class dz1t  {
    public static boolean main (String[] args) {
        int year = 2004;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) return true;
        else return false;
        
    }
}

5.

public class dz1t  {
    public static void maine (String text, int count) {

        for (int i = 0; i < count; i++);
        System.out.println (text);

    }
       
        public static void main (String[] args) {
    

            maine ("Привет", 5);
            maine ("Пока", 3);
        }
    }


1.

public class dz1t  {

    static boolean tri(int num) {

        if (num < 0) return false;
        int sum = 0;
         
        for (int n = 1; sum <= num; n++) 
            sum = sum + n;
            if (sum == num) return true;       
            else return false;
    }
     
    public static void main (String[] args) {
        int n = 11;
        if (tri(n)) 
        System.out.print("number " + "triangular");
        else
        System.out.print("number " + "not triangular");
    }
}

7.
public class dz1t  {
    public static void main (String[] args) {
        int[] arr = new int [10];
        arr = new int [] {1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;       
            else arr[i] = 0;
            
            System.out.print (arr[i] + " ");
        }
    }
} 

8.
public class dz1t  {
    public static void main (String[] args) {
        int[] arr = new int [100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;            
            System.out.print (arr[i] + " ");
        }
    }
}

9.
public class dz1t  {
    public static void main (String[] args) {
        int[] arr = new int [] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
            System.out.print (arr[i] + " ");
        }
    }
}

12.
public class dz1t  {
    public static void main (String[] args){
        int[] arr = new int [10];
        arr = new int [] {3, 6, 5, 10, 12, 4, 6, -3, 0, 7, 11};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        
        System.out.println(max);
        System.out.println(min);
    }
}
*/