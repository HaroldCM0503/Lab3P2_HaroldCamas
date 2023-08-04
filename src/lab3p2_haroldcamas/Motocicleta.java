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

    public int getV_maxima() {
        return v_maxima;
    }

    public void setV_maxima(int v_maxima) {
        this.v_maxima = v_maxima;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + super.toString() + "v_maxima=" + v_maxima + ", peso=" + peso + ", consumo=" + consumo + '}';
    }
}
