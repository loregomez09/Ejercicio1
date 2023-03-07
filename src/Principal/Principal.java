package Principal;
import java.util.Scanner;
//Lady Lorena Gomez Forero ID 702526
public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Persona Estu1 = new Persona("lady", "Cogua");
        Estudiante Estu2 = new Estudiante("Daira", "Centro","Isum", 5);
        Profesor Prof1 = new Profesor("Juan","Zipaquira","Cundinamarca","Master");

        System.out.println( Estu1.toString());
        System.out.println( Estu2.toString());
        System.out.println(Prof1.toString());

        System.out.println(Estu1.getNombre());
        System.out.println(Estu2.getNombre());
        System.out.println(Prof1.getNombre());




    }
}
