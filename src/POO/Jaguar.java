package POO;

public class Jaguar extends Animal implements Felino{

    private int edad;
    private float peso;

    public Jaguar(int edad, float peso) {
        this.edad = edad;
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
