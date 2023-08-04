package lab3p2_haroldcamas;

import java.awt.Color;
import java.util.Date;

public class Autobus extends Vehiculo{
    int capacidad;
    int ejes;
    int longitud;

    public Autobus() {
    }

    public Autobus(int capacidad, int ejes, int longitud, String placa, String marca, String modelo, String tipo, Color color, Date año) {
        super(placa, marca, modelo, tipo, color, año);
        this.capacidad = capacidad;
        this.ejes = ejes;
        this.longitud = longitud;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
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
        return "Autobus{" + "capacidad=" + capacidad + ", ejes=" + ejes + ", longitud=" + longitud + '}';
    }
    
    
}
