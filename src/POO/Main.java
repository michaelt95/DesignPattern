package POO;

public class Main {

    public static void main(String[] args) {

        //Instancia = a crear un objeto
        Jaguar jaguar = new Jaguar(10,10f);
        System.out.println(jaguar);
//        jaguar.comer();
//        jaguar.dormir();
//        jaguar.cazar();
//        jaguar.rugir();
//        jaguar.maullar();

        Jaguar jaguar1 = new Jaguar();
        System.out.println(jaguar1);

        Jaguar jaguar2 = new Jaguar(10);
        System.out.println(jaguar2);

        Jaguar jaguar3 = new Jaguar(100f);
        System.out.println(jaguar3);
    }
}
