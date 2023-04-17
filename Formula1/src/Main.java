
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
            } else if (eleccion == 2) {
                Coche coche = lectura.leerCoche();
                controlador.anadirCoche(coche);
            } else if (eleccion == 3) {
                Circuito circuito = lectura.leerCircuito();
                controlador.anadirCircuito(circuito);
            } else if (eleccion == 4) {
                controlador.listar();
            } else if (eleccion == 5) {
                int idP = lectura.leerCodigoEliminar();
                controlador.eliminar(idP);
            }
        } while (eleccion != 0); // SALIR DEL BUCLE



    }
}