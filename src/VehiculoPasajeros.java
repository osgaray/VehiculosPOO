public class VehiculoPasajeros extends Vehiculo {
    private int numPasajeros;

    // Constructor
    public VehiculoPasajeros(String marca, String modelo, int año, int kilometraje, int numPasajeros) {
        // super extrae los miembros de la superclase (Vehiculo)
        super(marca, modelo, año, kilometraje);
        this.numPasajeros = numPasajeros;
    }

    // Getter y setter
    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    // Sobreescribir el metodo de la superclase (Vehiculo)
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de pasajeros: " + numPasajeros);
    }
}