public class Coche {
    // DECLARAR VARIABLES
    private int idP;
    private String scuderia;
    private String motor;
    private int numeroC;

    public int getIdP() { return idP; }

    // CONSTRUCTOR DE TIPO COCHE PARA CREAR OBJETOS
    Coche(int idP, String scuderia, String motor, int numeroC){
        this.idP = idP;
        this.scuderia = scuderia;
        this.motor = motor;
        this.numeroC = numeroC;
    }

    // PRINTAR LA LISTA DE COCHE
    @Override
    public String toString() {
        return idP+"\t\t\t\t\t"+scuderia+"\t\t\t\t\t\t\t\t"+motor+"\t\t\t\t\t\t\t"+numeroC;
    }
}
