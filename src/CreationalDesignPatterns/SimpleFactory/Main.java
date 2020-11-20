package CreationalDesignPatterns.SimpleFactory;

public class Main {
    public static void main(String[] args) {
//        Pizza pizzaPeperoni = new Pizza(8);  //No SimpleFactory
//        System.out.println(pizzaPeperoni);
        Pizzeria pizzeria = new Pizzeria();
        Pizza pizzaPeperoni = pizzeria.crearPizzaPeque();

        System.out.println(pizzaPeperoni);

    }
}
