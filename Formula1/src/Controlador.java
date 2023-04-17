import java.util.ArrayList;

public class Controlador {
    Almacen almacen = new Almacen();

    public void eliminar(int idP){
        boolean borrar = false;
        for (int i = 0; i < almacen.listaPilotos.size(); i++) {
            if (almacen.listaPilotos.get(i).getIdP() == idP) {
                almacen.listaPilotos.remove(i);
                borrar = true;
                System.out.println("PILOTO ELIMINADO");
                break;
            }
        }

        for (int i = 0; i < almacen.listaCoche.size(); i++) {
            if (almacen.listaCoche.get(i).getIdP() == idP) {
                almacen.listaCoche.remove(i);
                borrar = true;
                System.out.println("Coche eliminado");
                break;
            }
        }

        for (int i = 0; i < almacen.listaCircuito.size(); i++) {
            if (almacen.listaCircuito.get(i).getIdP() == idP) {
                almacen.listaCircuito.remove(i);
                borrar = true;
                System.out.println("Circuito eliminado");
                break;
            }
        }

        if (!borrar) System.out.println("No se ha podido eliminar.");

    }

    public void listar() {
        // LISTAR
        System.out.println(almacen);
    }


    public void anadirPiloto(Piloto piloto) {
        almacen.listaPilotos.add(piloto);
        System.out.println(Colores.GREEN_BOLD+"Piloto añadido con éxito.");
    }

    public void anadirCoche(Coche coche) {
        almacen.listaCoche.add(coche);
        System.out.println(Colores.YELLOW_BOLD+"Coche añadido con éxito.");
    }

    public void anadirCircuito(Circuito circuito) {
        almacen.listaCircuito.add(circuito);
        System.out.println(Colores.PURPLE_BOLD+"Circuito añadido con éxito.");
    }
}
