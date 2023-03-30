package problema2.Children;

import problema2.parent.Vehiculo;

public class Ciclomotor extends Vehiculo {
    public boolean habilitadoAutopista;

    public Ciclomotor(String marca, double peso, double potencia, int numeroPuertas, double velocidad) {
        super(marca, peso, potencia, numeroPuertas, velocidad);
        this.habilitadoAutopista = habilitadoAutopista;
    }

    public boolean isHabilitadoAutopista() {
        return habilitadoAutopista = true;
    }

    @Override
    public double acelerar() {
        return velocidad + 7;
    }

    public String toString() {
        String msg = "Tipo de vehículo: Ciclomotor"+ "\nMarca: " + getMarca();
        msg += "\nPeso: " + getPeso() + "\nPotencia: "+ getPotencia() + " kW";
        msg += "\nNúmero de puertas: " + getNumeroPuertas();
        msg += "\nPuede ir por autopista: " + habilitadoAutopista + "\nVelocidad actual: " + getVelocidad() + " km/h";

        return msg;
    }



}
