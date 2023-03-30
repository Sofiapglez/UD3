package problema2;

import problema2.Children.Camion;
import problema2.Children.Ciclomotor;

public class Main {
    public static void main(String[] args) {
        Camion camion1 = new Camion("Peugeot", 18000, 300, 4, 80);
        System.out.println(camion1);

        System.out.println("");

        Ciclomotor ciclomotor1 = new Ciclomotor("Yamaha", 400, 50, 0, 60);
        System.out.println(ciclomotor1);

        System.out.println("");

        System.out.println("Camión acelerando... \nSu velocidad actual es: " + camion1.acelerar() + " km/h");
        System.out.println("Ciclomotor acelerando... \nSu velocidad actual es: " + ciclomotor1.acelerar() + " km/h");
    }
}