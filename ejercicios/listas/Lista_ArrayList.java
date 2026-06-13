package ejercicios.listas;

import java.util.ArrayList;

//Creacion de ArrayList y como se recorre
public class Lista_ArrayList {

    public static void main(String[] args) {
        
        ArrayList<String> ciudades = new ArrayList<>();

        ciudades.add("Ambato");
        ciudades.add("Quito");
        ciudades.add("Cuenca");

        for(String ciudad : ciudades){

            System.out.println(ciudad);

        }
    }
}
