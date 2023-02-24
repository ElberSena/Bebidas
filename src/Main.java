import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

      Bebida b1 = new Agua("Vimeiro ", 5.2);

      ArrayList<String> frutas = new ArrayList<String>();
      frutas.add("Laranja");
      frutas.add("Limao");
      frutas.add("Lima");
      Bebida b2 = new Sumo("Multivitaminas", frutas);


      Bebida b3 = new Vinho("Portal Rubi ", 15);

      System.out.println(b1);
      System.out.println(b2);
      System.out.println(b3);


    }
}