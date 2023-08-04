package lab3p2_haroldcamas;

import java.awt.Color;
import java.util.Date;

public class Motocicleta extends Vehiculo{
    int v_maxima;
    int peso;
    double consumo;

    public Motocicleta() {
    }

    public Motocicleta(int v_maxima, int peso, double consumo, String placa, String marca, String modelo, String tipo, Color color, Date año) {
        super(placa, marca, modelo, tipo, color, año);
        this.v_maxima = v_maxima;
        this.peso = peso;
        this.consumo = consumo;
    }
    
    
}
