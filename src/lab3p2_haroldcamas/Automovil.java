package lab3p2_haroldcamas;

import java.awt.Color;
import java.util.Date;

public class Automovil extends Vehiculo {
    String combustible;
    int puertas;
    String transmision;
    int asientos;

    public Automovil() {
    }

    public Automovil(String combustible, int puertas, String transmision, int asientos, String placa, String marca, String modelo, String tipo, Color color, Date año) {
        super(placa, marca, modelo, tipo, color, año);
        this.combustible = combustible;
        this.puertas = puertas;
        this.transmision = transmision;
        this.asientos = asientos;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
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
        super.toString();
        return "Automovil{" + "combustible=" + combustible + ", puertas=" + puertas + ", transmision=" + transmision + ", asientos=" + asientos + '}';
    }
}
