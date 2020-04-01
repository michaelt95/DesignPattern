package POO;

public class Jaguar {

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
}
