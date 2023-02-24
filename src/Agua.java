public class Agua extends Bebida{

    private Double ph;
    public Agua (String nome, Double ph){
        super(nome);
        this.ph = ph;

    }

    @Override
    public String toString() {
        return "Água " + super.toString()+ "PH " + ph;
    }
}
