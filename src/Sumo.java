import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sumo extends Bebida{

    private ArrayList<String> frutas;

    public Sumo (String nome,ArrayList<String> frutas){
        super(nome);
        this.frutas = frutas;
    }

    public String toString(){
        return "Sumo " + super.toString() + "- " + frutas;
    }
}
