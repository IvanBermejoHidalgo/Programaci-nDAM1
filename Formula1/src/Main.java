
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
                controlador.anadirPiloto(piloto); // AÑADIR PILOTO
            } else if (eleccion == 2) {
                Coche coche = lectura.leerCoche();
                controlador.anadirCoche(coche); // AÑADIR COCHE
            } else if (eleccion == 3) {
                Circuito circuito = lectura.leerCircuito();
                controlador.anadirCircuito(circuito); // AÑADIR CIRCUITO
            } else if (eleccion == 4) {
                controlador.listar(); // LISTAR PILOTO/COCHE/CIRCUITO
            } else if (eleccion == 5) {
                int idP = lectura.leerCodigoEliminarPiloto();
                controlador.eliminarPiloto(idP); // ELIMINAR PILOTO
            } else if (eleccion == 6) {
                int idP = lectura.leerCodigoEliminarCoche();
                controlador.eliminarCoche(idP); // ELIMINAR COCHE
            } else if (eleccion == 7) {
                int idP = lectura.leerCodigoEliminarCircuito();
                controlador.eliminarCircuito(idP); // ELIMINAR CIRCUITO
            } else if (eleccion == 8) {
                int idP = lectura.leerCodigoModificarPiloto();
                controlador.modificarPiloto(idP); // MODIFICAR PILOTO
            } else if (eleccion == 9) {
                int idP = lectura.leerCodigoModificarCoche();
                controlador.modificarCoche(idP); // MODIFICAR COCHE
            } else if (eleccion == 10) {
                int idP = lectura.leerCodigoModificarCircuito();
                controlador.modificarCircuito(idP); // MODIFICAR CIRCUITO
            }

        } while (eleccion != 0); // SALIR DEL BUCLE



    }
}