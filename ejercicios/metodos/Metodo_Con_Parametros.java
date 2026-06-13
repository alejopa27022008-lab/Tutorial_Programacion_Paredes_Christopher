package ejercicios.metodos;
//Creacion de metodos con parametros y como se utilizan
public class Metodo_Con_Parametros {

    public static double area(double base,double altura) {

        return base * altura;

    }

    public static void main(String[] args) {

        System.out.println(
            area(10, 5)
        );

    }
}
