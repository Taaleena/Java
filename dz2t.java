package dz1;

public class dz2t {
public static boolean pal(String text) {
    String replaced = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
    String reversed = new StringBuffer(replaced).reverse().toString();
    return reversed.equals(replaced);
}

public static void main(String[] args) {
    System.out.println(pal("Madam, I'm Adam!"));
}
}

