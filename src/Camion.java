public class Camion extends VehiculoCarga {
    private int numEjes;

    // Constructor
    public Camion(String modelo, String marca, int año, int kilometraje, int capacidadCarga, int numEjes) {
        super(marca, modelo, año, kilometraje, capacidadCarga);
        this.numEjes = numEjes;

    }
    // Getter y Setter para numEjes
    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;

    }

    // sobreescribir el metodo mostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de Ejes: " + numEjes);
    }

    // agregar mantenimiento al metodo
    @Override
    public void RealizarMantenimiento() {
        super.RealizarMantenimiento();
        System.out.println("Para el mantenimiento de este auto se necesita: ");
        System.out.println("\tReabastecer disel");
        System.out.println("\tLimpiar la cabina");
        System.out.println("\tRevisar amortiguadores");
    }
}