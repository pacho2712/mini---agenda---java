import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("bienvenido a tu agenda de tareas!");
        ArrayList<Tarea> tareas = new ArrayList<>();
        Scanner sc = new Scanner (System.in);
        String input;

        while (true) {
            System.out.println("1. Agregar tarea\n2. Mostrar tareas\n3. Salir");
            System.out.print("Seleccione una opción: ");
            input = sc.nextLine();

            if (input.equals("1")) {
                System.out.print("descripcion de la tarea: ");
                String desc = sc.nextLine();
                tareas.add(new Tarea(desc));
            } else if (input.equals("2")){
                for (int i =0; i<tareas.size(); i++){
                    System.out.println(i + ": " + tareas.get(i));
                }
            } else if (input.equals("3")){
                System.out.println("saliendo...");
                break;
            } else {
                System.out.println("opcion no valida, intente de nuevo.");
            }

        
        }
        sc.close();
        System.out.println("gracias por usar la agenda de tareas!");
    }

}