
public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        Lectura lectura = new Lectura();
        Controlador controlador = new Controlador();
        //menu.main();
        int eleccion;
        do {
            menu.mostrarMenuPrincipal();
            eleccion = lectura.leerOpcionMenu();

            // CONDICIONAL PARA LAS ELECCIONES
            if (eleccion == 1) {
                Piloto piloto = lectura.leerPiloto();
                controlador.anadirPiloto(piloto);
                Coche coche = lectura.leerCoche();
                controlador.anadirCoche(coche);
                Circuito circuito = lectura.leerCircuito();
                controlador.anadirCircuito(circuito);
            } else if (eleccion == 2) {
                System.out.println("Introduce el código del piloto que quieres eliminar:");
                int idP = lectura.leerCodigoEliminar();
                controlador.eliminar(idP);

            } else if (eleccion == 3) {
                controlador.listar();
            }
        } while (eleccion != 0); // SALIR DEL BUCLE



    }
}