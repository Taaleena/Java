package dz1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DZ6 {
  public String model;
  public int ozu;
  public int hdd;
  public int diag;



  public int znach () {
    return 0;
}


  public static void main(String[] args) {
    DZ6 nout = new DZ6 ();
    nout.model = "HP123";
    nout.ozu = 256;
    nout.hdd = 300;
    nout.diag = 19;

    DZ6 nout1 = new DZ6 ();
    nout1.model = "Asus345";
    nout1.ozu = 512;
    nout1.hdd = 500;
    nout1.diag = 17;

    DZ6 nout2 = new DZ6 ();
    nout2.model = "Acer789";
    nout2.ozu = 1024;
    nout2.hdd = 800;
    nout2.diag = 22;

  Map <Integer, DZ6> map = new HashMap<>();
    map.put (1, nout);
    map.put (2, nout1);
    map.put (3, nout2);

    map.forEach ((key, value) -> System.out.println (key + ":" + value));


 
    Scanner user_input = new Scanner (System.in);
    int ID;
    System.out.println ("Выбери модель: ");
    ID = user_input.nextInt ();

    System.out.println ("Ваш выбор: " + map.get (ID));

    Map <Integer, DZ6> map1 = new HashMap<>();
    map1.put (1, nout);
    map1.put (2, nout1);
    map1.put (3, nout2);

    map1.forEach ((key, value) -> System.out.println (key + ":" + value));


 
    Scanner user_input1 = new Scanner (System.in);
    int ID1;
    System.out.println ("Выбери модель: ");
    ID1 = user_input1.nextInt ();

    System.out.println ("Ваш выбор: " + map.get (ID1));


}
  }



  
    

