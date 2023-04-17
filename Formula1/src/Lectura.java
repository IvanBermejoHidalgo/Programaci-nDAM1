import java.util.Scanner;

public class Lectura {
    public Piloto leerPiloto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("══════════════════════════════════════════");
        System.out.println("Introduce el ID del piloto/coche/circuito:");
        int idP = scanner.nextInt();
        System.out.println("══════════════════════════════════════════");
        scanner.nextLine();
        System.out.println("┌─────────────────────────────────────────┐");
        System.out.println("│                  PILOTO                 │");
        System.out.println("└─────────────────────────────────────────┘");
        System.out.println("Introduce el nombre del piloto:");
        String nombreP = scanner.nextLine();

        System.out.println("Introduce la abreviación del piloto:");
        String abreviacion = scanner.nextLine();

        System.out.println("Introduce el número del piloto:");
        int numeroP = scanner.nextInt();
        System.out.println("══════════════════════════════════════════");

        scanner.nextLine();
        return new Piloto(idP,nombreP, abreviacion, numeroP);

    }


    public Coche leerCoche() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("══════════════════════════════════════════");
        System.out.println("Introduce el ID del piloto/coche/circuito:");
        int idP = scanner.nextInt();
        scanner.nextLine();
        System.out.println("══════════════════════════════════════════");
        System.out.println("┌─────────────────────────────────────────┐");
        System.out.println("│                  COCHE                  │");
        System.out.println("└─────────────────────────────────────────┘");
        System.out.println("Introduce el nombre de la Scuderia:");
        String scuderia = scanner.nextLine();

        System.out.println("Introduce la marca del motor:");
        String motor = scanner.nextLine();

        System.out.println("Introduce el número del coche:");
        int numeroC = scanner.nextInt();
        System.out.println("══════════════════════════════════════════");

        scanner.nextLine();
        return new Coche(idP,scuderia,motor,numeroC);
    }

    public Circuito leerCircuito() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("══════════════════════════════════════════");
        System.out.println("Introduce el ID del piloto/coche/circuito:");
        int idP = scanner.nextInt();
        scanner.nextLine();
        System.out.println("══════════════════════════════════════════");
        System.out.println("┌─────────────────────────────────────────┐");
        System.out.println("│                 CIRCUITO                │");
        System.out.println("└─────────────────────────────────────────┘");
        System.out.println("Introduce el nombre del circuito:");
        String nombreCir = scanner.nextLine();

        System.out.println("Introduce los kilómetros del circuito:");
        float kilometros = scanner.nextFloat();

        System.out.println("Introduce la temperatura del circuito:");
        float temperatura = scanner.nextFloat();
        System.out.println("══════════════════════════════════════════");

        // GUARDA LAS VARIABLES EN LA ARRAYLIST
        //controlador.anadir(idP, nombreP, abreviacion, numeroP, scuderia, motor, numeroC, nombreCir, kilometros, temperatura);
        //return new Circuito(nombreCir,kilometros,temperatura);
        scanner.nextLine();
        return new Circuito(idP,nombreCir,kilometros,temperatura);
    }

    public int leerOpcionMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print(Colores.RED_BOLD+"Elección: ");
        int eleccion = scanner.nextInt();
        scanner.nextLine();

        return eleccion;
    }

    public int leerCodigoEliminar() {
        Scanner scanner = new Scanner(System.in);
        //eliminar producto
        System.out.println("Introduce el código del piloto/coche/circuito que quieres eliminar:");
        int idP = scanner.nextInt();
        return idP;
    }
}
