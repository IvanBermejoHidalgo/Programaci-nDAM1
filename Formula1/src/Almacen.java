import java.util.ArrayList;

public class Almacen {

    // DECLARAR LAS ARRAYLIST
    ArrayList<Piloto> listaPilotos;
    ArrayList<Coche> listaCoche;
    ArrayList<Circuito> listaCircuito;

    // CONSTRUCTOR PARA INSTANCIAR LAS ARRAYLIST
    // PILOTOS/COCHES/CIRCUITOS
    public Almacen() {
        this.listaPilotos = new ArrayList<Piloto>();
        this.listaPilotos.add(new Piloto(1,"FERNANDO ALONSO","ALO",14));
        this.listaPilotos.add(new Piloto(2,"LEWIS HAMILTON","HAM",44));
        this.listaCoche = new ArrayList<Coche>();
        this.listaCoche.add(new Coche(1,"ASTON MARTIN","MERCEDES",33));
        this.listaCoche.add(new Coche(2,"MERCEDES","MERCEDES",63));
        this.listaCircuito = new ArrayList<Circuito>();
        this.listaCircuito.add(new Circuito(1,"ABU DHABI", 4.5F,51.1F));
        this.listaCircuito.add(new Circuito(2,"IMOLA", 3.3F,33.3F));
    }

    // TOSTRING PARA PRINTAR LAS LISTAS
    @Override
    public String toString() {
        // LISTAR LAS ARRAYLIST
        String resultado = "";
        // PRINTAR EL ARRAYLIST DE PILOTO
        resultado += Colores.BLUE+"ID\t\t\t\t\t\tNOMBRE\t\t\t\t\t\tABREVIACIÓN\t\t\t\t\t\tNÚMERO\n"+Colores.RESET;
        for (int i = 0; i < this.listaPilotos.size(); i++) {
            resultado += Colores.GREEN_BOLD+this.listaPilotos.get(i).toString()+Colores.RESET;
            resultado += "\n";
        }

        System.out.println("\n");

        resultado  += Colores.BLUE+"\nID\t\t\t\t\t\tSCUDERIA\t\t\t\t\t\tMOTOR\t\t\t\t\t\tNÚMERO\n"+Colores.RESET;
        // PRINTAR EL ARRAYLIST DE COCHE
        for (int i = 0; i < this.listaCoche.size(); i++) {
            resultado += Colores.YELLOW_BOLD+this.listaCoche.get(i).toString()+Colores.RESET;
            resultado += "\n";
        }

        System.out.println("\n");

        resultado += Colores.BLUE+"\nID\t\t\t\t\t\tCIRCUITO\t\t\t\t\t\tKILÓMETROS\t\t\t\t\t\tTEMPERATURA\n"+Colores.RESET;
        // PRINTAR EL ARRAYLIST DE CIRCUITO
        for (int i = 0; i < this.listaCircuito.size(); i++) {
            resultado += Colores.PURPLE_BOLD+this.listaCircuito.get(i).toString()+Colores.RESET;
            resultado += "\n";
        }
        System.out.println("\n");
        return resultado;
    }
}
