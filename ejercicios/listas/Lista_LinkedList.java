package ejercicios.listas;

import java.util.LinkedList;
//Creacion de LinkedList y como se recorre
public class Lista_LinkedList {

    public static void main(String[] args) {

        LinkedList<String> nombres = new LinkedList<>();

        nombres.add("Ana");
        nombres.add("Juan");
        nombres.add("Pedro");

        System.out.println(nombres);
        System.out.println("Primer nombre: " + nombres.get(0));

        nombres.remove("Juan");

        System.out.println(nombres);
    }
}
