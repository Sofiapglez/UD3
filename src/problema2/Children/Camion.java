package problema2.Children;


import problema2.parent.Vehiculo;

public class Camion extends Vehiculo {
    public double capacidadCarga;

    public Camion(String marca, double peso, double potencia, int numeroPuertas, double velocidad) {
        super(marca, peso, potencia, numeroPuertas, velocidad);

    }

    public double getCapacidadCarga() {
        return capacidadCarga = 5000;
    }

    @Override
    public double acelerar() {
        return velocidad + 5;
    }

    public String toString() {
        String msg = "Tipo de vehículo: Camión"+ "\nMarca: " + getMarca();
        msg += "\nPeso: " + getPeso() + "\nPotencia: "+ getPotencia() + " kW";
        msg += "\nNúmero de puertas: " + getNumeroPuertas();
        msg += "\nCapacidad de carga: " + getCapacidadCarga() + "\nVelocidad actual: " + getVelocidad() + " km/h";

        return msg;
    }


}
