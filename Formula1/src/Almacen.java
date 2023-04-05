import java.util.ArrayList;

public class Almacen {

    // DECLARAR LAS ARRAYLIST
    ArrayList<Piloto> listaPilotos;
    ArrayList<Coche> listaCoche;
    ArrayList<Circuito> listaCircuito;

    // CONSTRUCTOR PARA INSTANCIAR LAS ARRAYLIST
    Almacen() {
        this.listaPilotos = new ArrayList<Piloto>();
        this.listaCoche = new ArrayList<Coche>();
        this.listaCircuito = new ArrayList<Circuito>();
    }

    @Override
    public String toString() {
        // LISTAR LAS ARRAYLIST
        String resultado = "";
        // BUCLE PARA EL ARRAYLIST DE PILOTO
        //resultado += "╔═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗\n";
        //resultado += "║\t\t\t\t\tID\t\t\t\t\t\tNOMBRE\t\t\t\t\t\tABREVIACIÓN\t\t\t\t\t\tNÚMERO\t\t\t\t║\n";
        resultado += "ID\t\t\t\t\t\tNOMBRE\t\t\t\t\t\tABREVIACIÓN\t\t\t\t\t\tNÚMERO\n";
        //resultado += "║═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════║\n";
        for (int i = 0; i < this.listaPilotos.size(); i++) {
            resultado += this.listaPilotos.get(i).toString();
            resultado += "\n";
        }

        System.out.println("\n");

        resultado  += "\nID\t\t\t\t\t\tSCUDERIA\t\t\t\t\t\tMOTOR\t\t\t\t\t\tNÚMERO\n";
        // BUCLE PARA EL ARRAYLIST DE COCHE
        for (int i = 0; i < this.listaCoche.size(); i++) {
            resultado += this.listaCoche.get(i).toString();
            resultado += "\n";
        }

        System.out.println("\n");

        resultado += "\nID\t\t\t\t\t\tCIRCUITO\t\t\t\t\t\tKILÓMETROS\t\t\t\t\t\tTEMPERATURA\n";
        // BUCLE PARA EL ARRAYLIST DE CIRCUITO
        for (int i = 0; i < this.listaCircuito.size(); i++) {
            resultado += this.listaCircuito.get(i).toString();
            resultado += "\n";
        }
        System.out.println("\n");
        return resultado;
    }
}