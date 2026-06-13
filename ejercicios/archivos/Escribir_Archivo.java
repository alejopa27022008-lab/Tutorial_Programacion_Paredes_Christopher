package ejercicios.archivos;

import java.io.FileWriter;

//Explicacion de como escribir un archivo 
public class Escribir_Archivo {

    public static void main(String[] args) {

        try {

            FileWriter archivo = new FileWriter("usuarios.csv");

            archivo.write("id,nombre,edad\n");

            archivo.write("1,Ana,20\n");

            archivo.write("2,Luis,22\n");

            archivo.close();

        } catch(Exception e){

            System.out.println(
                e.getMessage()
            );

        }

    }
}
