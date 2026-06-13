package ejercicios.archivos;

import java.io.BufferedReader;
import java.io.FileReader;

public class Leer_Archivo {

    //Explicacion de como Leer un archivo 
    public static void main(String[] args) {

        try {BufferedReader lector = new BufferedReader(new FileReader("usuarios.csv"));

            String linea;

            while((linea = lector.readLine())!= null){

                String[] datos = linea.split(",");

                for(String dato : datos){

                    System.out.print(dato + " ");

                }

                System.out.println();

            }

            lector.close();

        } catch(Exception e){

            System.out.println(
                e.getMessage()
            );

        }

    }
}
