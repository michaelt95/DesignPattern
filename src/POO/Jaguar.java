package POO;

public class Jaguar extends Animal implements Felino{

    private int edad;
    private float peso;

    public Jaguar(int edad, float peso) {
        this.edad = edad;
        this.peso = peso;
    }

    public Jaguar() {
        this.edad = 0;
        this.peso = 0.0f;
    }

    public Jaguar(int edad) {
        this.edad = edad;
        this.peso = 0.0f;
    }

    public Jaguar(float peso) {
        this.edad = 0;
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Jaguar{" + "edad=" + edad + ", peso=" + peso + '}';
    }

    @Override
    public void dormir() {
        System.out.println("El jaguar duerme");
    }

    @Override
    public void comer() {
        System.out.println("El jaguar come");
    }

    @Override
    public void rugir() {
        System.out.println("El jaguar ruge!");
    }

    @Override
    public void maullar() {
        throw new UnsupportedOperationException("El jaguar no maulla");
    }

    @Override
    public void cazar() {
        System.out.println("El jaguar caza!");
    }
}
