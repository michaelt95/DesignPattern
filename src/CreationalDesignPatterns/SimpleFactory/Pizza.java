package CreationalDesignPatterns.SimpleFactory;

public class Pizza {

    private int cantidadRebanadas;

    public Pizza(int cantidadRebanadas) {
        this.cantidadRebanadas = cantidadRebanadas;
    }

    @Override
    public String toString() {
        return "Cantidad Rebanadas = " + cantidadRebanadas;
    }
}
