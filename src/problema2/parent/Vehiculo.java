package problema2.parent;

public class Vehiculo {
    public String Marca;
    public double Peso;
    public double Potencia;
    public int numeroPuertas;
    public double velocidad;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public double getPotencia() {
        return Potencia;
    }

    public void setPotencia(double potencia) {
        Potencia = potencia;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public Vehiculo(String marca, double peso, double potencia, int numeroPuertas, double velocidad) {
        Marca = marca;
        Peso = peso;
        Potencia = potencia;
        this.numeroPuertas = numeroPuertas;
        this.velocidad = velocidad;
    }

    public double acelerar() {
        return velocidad + 10;
    }

}
