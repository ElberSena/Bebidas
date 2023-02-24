public class Vinho extends Bebida{

    private int grauAlcool;
    public Vinho (String nome, int grauAlcool){
        super(nome);
        this.grauAlcool = grauAlcool;

    }

    @Override
    public String toString() {
        return "Vinho " + super.toString() + " Grau Alcoolico " + grauAlcool + "%";
    }
}
